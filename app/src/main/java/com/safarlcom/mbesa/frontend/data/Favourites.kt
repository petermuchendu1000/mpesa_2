package com.safarlcom.mbesa.frontend.data

import android.content.Context
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import org.json.JSONArray
import org.json.JSONObject

/** One saved recipient on the Send Money screen. */
data class Favourite(val name: String, val phone: String) {
    /** The two-letter mark the chip draws, from the saved name ("Tony Angwa" -> "ta"). */
    val initials: String
        get() = name.trim().split(Regex("\\s+")).filter { it.isNotBlank() }
            .take(2).joinToString("") { it.first().lowercase() }
            .ifBlank { phone.takeLast(1) }
}

/**
 * The Send Money favourites, saved ON THIS DEVICE and nowhere else.
 *
 * Local on purpose. A favourite is a name and a full phone number, and the server deliberately never
 * hands this app anyone's full number but the user's own (docs/58): the only reason it can hold
 * these is that the user typed them. Syncing them to the backend would quietly build the shared
 * directory that decision exists to prevent, so this never leaves the handset — it is not in the
 * wallet sync file either.
 *
 * Stored as JSON in the app's private prefs. Capped, because this is a chip row: past a dozen the
 * row is scrolling further than anyone will scroll.
 */
object Favourites {
    private const val PREFS = "mbesa_favourites"
    private const val KEY = "items"
    private const val MAX = 12

    private var prefs: android.content.SharedPreferences? = null

    /** Newest-first, Compose-observable so the row updates the moment one is added or removed. */
    val items: SnapshotStateList<Favourite> = mutableStateListOf()

    /** Attach storage and load what is saved. Safe to call more than once. */
    fun init(context: Context) {
        if (prefs != null) return
        val p = context.applicationContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        prefs = p
        items.clear()
        runCatching {
            val arr = JSONArray(p.getString(KEY, "[]") ?: "[]")
            for (i in 0 until arr.length()) {
                val o = arr.optJSONObject(i) ?: continue
                val name = o.optString("name", "")
                val phone = o.optString("phone", "")
                if (name.isNotBlank() && phone.isNotBlank()) items.add(Favourite(name, phone))
            }
        }
    }

    /**
     * Save (or refresh) a recipient. Keyed on the NORMALISED number, so the same person saved once
     * as `0798…` and once as `+254798…` is one chip, not two.
     */
    fun add(name: String, phone: String) {
        val normalized = Msisdn.normalize(phone) ?: return
        if (name.isBlank()) return
        items.removeAll { Msisdn.normalize(it.phone) == normalized }
        items.add(0, Favourite(name.trim(), normalized))
        while (items.size > MAX) items.removeAt(items.lastIndex)
        persist()
    }

    fun remove(fav: Favourite) {
        items.removeAll { it.phone == fav.phone }
        persist()
    }

    /** Is this number already saved? Drives whether the row offers "Add" for what is typed. */
    fun contains(phone: String): Boolean {
        val normalized = Msisdn.normalize(phone) ?: return false
        return items.any { Msisdn.normalize(it.phone) == normalized }
    }

    private fun persist() {
        val arr = JSONArray()
        for (f in items) arr.put(JSONObject().put("name", f.name).put("phone", f.phone))
        prefs?.edit()?.putString(KEY, arr.toString())?.apply()
    }

    /** Drop everything (logout) — a handset handed to the next agent keeps nobody's numbers. */
    fun clear() {
        items.clear()
        prefs?.edit()?.remove(KEY)?.apply()
    }
}
