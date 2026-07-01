package com.huawei.digitalpayment.consumer.nfc.utils;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.huawei.arouter.RouteUtils;
import com.safaricom.mpesa.logging.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/nfc/utils/NfcUtils;", "", "<init>", "()V", "TAG", "", "activityList", "", "Landroidx/appcompat/app/AppCompatActivity;", "saveUri", "setSaveUri", "", "startNfc", "addActivity", "activity", "closeAllActivity", "enableForegroundDispatch", "context", "Landroid/app/Activity;", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "disableForegroundDispatch", "writeTextToTag", "", IpcMessageConstants.EXTRA_INTENT, "Landroid/content/Intent;", "text", "packageName", "ConsumerNfcUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NfcUtils {
    public static final NfcUtils INSTANCE = new NfcUtils();
    private static final String ShareDataUIState;
    private static int component1 = 1;
    private static final List<AppCompatActivity> component2;
    private static String component3 = null;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;

    private NfcUtils() {
    }

    static {
        String simpleName = Reflection.getOrCreateKotlinClass(NfcUtils.class).getSimpleName();
        if (simpleName == null) {
            int i = component1 + 99;
            copydefault = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            int i2 = 2 % 2;
            simpleName = "";
        }
        ShareDataUIState = simpleName;
        component2 = new ArrayList();
        int i3 = copydefault + 49;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final void setSaveUri(String saveUri) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 67;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        component3 = saveUri;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 81;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void startNfc() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 1;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        L.INSTANCE.d(ShareDataUIState, "Nfc Started!", new Object[0]);
        if (TextUtils.isEmpty(component3)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("saveUri", component3);
        RouteUtils.routeWithExecute("/nfcModule/nfc", bundle);
        int i4 = getRequestBeneficiariesState + 29;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void addActivity(AppCompatActivity activity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(activity, "");
        component2.add(activity);
        int i4 = getAsAtTimestamp + 19;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void closeAllActivity() {
        String message;
        Iterator<AppCompatActivity> it;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 93;
        getRequestBeneficiariesState = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                it = component2.iterator();
                int i3 = 74 / 0;
            } else {
                it = component2.iterator();
            }
            while (it.hasNext()) {
                AppCompatActivity next = it.next();
                if (!next.isFinishing()) {
                    next.finish();
                    int i4 = getRequestBeneficiariesState + 37;
                    getAsAtTimestamp = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        } catch (Exception e) {
            if (e.getMessage() == null || (message = e.getMessage()) == null) {
                return;
            }
            L.INSTANCE.e("NfcUtils", message, new Object[0]);
        }
    }

    public final void enableForegroundDispatch(Activity context, PendingIntent pendingIntent) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 51;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter != null) {
            defaultAdapter.enableForegroundDispatch(context, pendingIntent, null, null);
        }
        int i4 = getAsAtTimestamp + 61;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
    }

    public final void disableForegroundDispatch(Activity context) {
        NfcAdapter defaultAdapter;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            defaultAdapter = NfcAdapter.getDefaultAdapter(context);
            int i3 = 45 / 0;
            if (defaultAdapter == null) {
                return;
            }
        } else {
            defaultAdapter = NfcAdapter.getDefaultAdapter(context);
            if (defaultAdapter == null) {
                return;
            }
        }
        defaultAdapter.disableForegroundDispatch(context);
        int i4 = getAsAtTimestamp + 9;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final boolean writeTextToTag(Intent intent, String text, String packageName) {
        NdefMessage ndefMessage;
        Ndef ndef;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 81;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(intent, "");
            Intrinsics.checkNotNullParameter(text, "");
            Intrinsics.checkNotNullParameter(packageName, "");
            Intrinsics.areEqual("android.nfc.action.NDEF_DISCOVERED", intent.getAction());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(text, "");
        Intrinsics.checkNotNullParameter(packageName, "");
        if (!Intrinsics.areEqual("android.nfc.action.NDEF_DISCOVERED", intent.getAction())) {
            int i3 = getAsAtTimestamp + 85;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            if (!Intrinsics.areEqual("android.nfc.action.TAG_DISCOVERED", intent.getAction())) {
                return false;
            }
        }
        Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
        try {
            Log.d("NfcUtils start write", text);
            ndefMessage = new NdefMessage(new NdefRecord[]{NdefRecord.createUri("safaricomnfcpay://p2pTransfer?" + text), NdefRecord.createApplicationRecord(packageName)});
            ndef = Ndef.get(tag);
        } catch (Exception e) {
            Log.d("NfcUtils", "write failed ：" + e.getMessage());
        }
        if (ndef != null) {
            int i5 = getAsAtTimestamp + 77;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            ndef.connect();
            ndef.writeNdefMessage(ndefMessage);
            Log.d("NfcUtils write success", text);
            return true;
        }
        NdefFormatable ndefFormatable = NdefFormatable.get(tag);
        if (ndefFormatable != null) {
            int i7 = getAsAtTimestamp + 81;
            getRequestBeneficiariesState = i7 % 128;
            if (i7 % 2 != 0) {
                ndefFormatable.connect();
                ndefFormatable.format(ndefMessage);
                return false;
            }
            ndefFormatable.connect();
            ndefFormatable.format(ndefMessage);
            return true;
        }
        return false;
    }
}
