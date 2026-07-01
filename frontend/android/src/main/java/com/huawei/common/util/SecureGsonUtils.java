package com.huawei.common.util;

import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class SecureGsonUtils {
    private static final List<String> component1 = new ArrayList();
    private static boolean ShareDataUIState = false;

    private static void component1() {
        if (ShareDataUIState) {
            return;
        }
        ShareDataUIState = true;
        List list = (List) fromJson(AssetsReadUtils.parseFile("sensitive_keys.json"), new TypeToken<List<String>>() {
        }.getType());
        if (list != null) {
            component1.addAll(list);
        }
    }

    public static <T> T fromJson(Gson gson, String str, Class<T> cls) {
        try {
            return (T) GsonUtils.fromJson(gson, str, (Class) cls);
        } catch (Exception e) {
            L.e(e.getMessage());
            return null;
        }
    }

    public static <T> T fromJson(Gson gson, String str, Type type) {
        try {
            return (T) GsonUtils.fromJson(gson, str, type);
        } catch (Exception e) {
            L.e(e.getMessage());
            return null;
        }
    }

    public static <T> T fromJson(Gson gson, Reader reader, Class<T> cls) {
        try {
            return (T) GsonUtils.fromJson(gson, reader, (Class) cls);
        } catch (Exception e) {
            L.e(e.getMessage());
            return null;
        }
    }

    public static <T> T fromJson(Gson gson, Reader reader, Type type) {
        try {
            return (T) GsonUtils.fromJson(gson, reader, type);
        } catch (Exception e) {
            L.e(e.getMessage());
            return null;
        }
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        return (T) fromJson(GsonUtils.getGson(), str, (Class) cls);
    }

    public static <T> T fromJson(String str, Type type) {
        return (T) fromJson(GsonUtils.getGson(), str, type);
    }

    public static <T> T fromJson(Reader reader, Class<T> cls) {
        return (T) fromJson(GsonUtils.getGson(), reader, (Class) cls);
    }

    public static <T> T fromJson(Reader reader, Type type) {
        return (T) fromJson(GsonUtils.getGson(), reader, type);
    }

    public static JSONObject desensitizeJson(String str) {
        try {
            return desensitizeJson(new JSONObject(str));
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static JSONObject desensitizeJson(JSONObject jSONObject) {
        return ShareDataUIState(jSONObject);
    }

    private static JSONObject ShareDataUIState(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.getString(next);
                if (component2(string)) {
                    jSONObject.put(next, desensitizeJson(new JSONObject(string)));
                } else if (component1(string)) {
                    jSONObject.put(next, component3(new JSONArray(string)));
                } else if (copydefault(next)) {
                    jSONObject.put(next, "*****");
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static JSONArray component3(JSONArray jSONArray) {
        if (jSONArray == null) {
            return jSONArray;
        }
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                if (component2(string)) {
                    jSONArray.put(i, desensitizeJson(new JSONObject(string)));
                } else if (component1(string)) {
                    jSONArray.put(i, component3(new JSONArray(string)));
                }
            }
        } catch (Exception unused) {
        }
        return jSONArray;
    }

    private static boolean copydefault(String str) {
        component1();
        return component1.contains(str);
    }

    private static boolean component2(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean component1(String str) {
        try {
            new JSONArray(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
