package com.huawei.digitalpayment.consumer.baselib.theme;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/theme/ThemeConvertManager;", "", "<init>", "()V", "converts", "", "Lcom/huawei/digitalpayment/consumer/baselib/theme/IThemeConvert;", "registerConvert", "", "convert", "unregisterConvert", "resp", "", "createComponent", "Landroidx/fragment/app/Fragment;", "component", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ThemeConvertManager {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    public static final ThemeConvertManager INSTANCE = new ThemeConvertManager();
    private static final List<IThemeConvert> component2 = new ArrayList();

    private ThemeConvertManager() {
    }

    static {
        int i = copydefault + 115;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public final void registerConvert(IThemeConvert convert) {
        int i = 2 % 2;
        int i2 = component3 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(convert, "");
        List<IThemeConvert> list = component2;
        if (!list.contains(convert)) {
            list.add(convert);
        }
        CollectionsKt.sort(list);
        int i4 = component3 + 39;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void unregisterConvert(IThemeConvert convert) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(convert, "");
        List<IThemeConvert> list = component2;
        if (list.contains(convert)) {
            int i4 = ShareDataUIState + 59;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            list.remove(convert);
        }
    }

    public final Object convert(String resp) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        String strOptString;
        int i = 2 % 2;
        if (resp != null) {
            try {
                JSONObject jSONObject = new JSONObject(resp);
                jSONObjectOptJSONObject = jSONObject.optJSONObject("configValue");
                try {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray("components");
                } catch (Exception unused) {
                    jSONArrayOptJSONArray = null;
                }
            } catch (Exception unused2) {
                jSONObjectOptJSONObject = null;
                jSONArrayOptJSONArray = null;
            }
            if (jSONObjectOptJSONObject != null) {
                try {
                    strOptString = jSONObjectOptJSONObject.optString("componentType");
                } catch (Exception unused3) {
                    strOptString = null;
                }
            } else {
                strOptString = null;
            }
        } else {
            jSONObjectOptJSONObject = null;
            jSONArrayOptJSONArray = null;
            strOptString = null;
        }
        Iterator<IThemeConvert> it = component2.iterator();
        while (it.hasNext()) {
            int i2 = component3 + 93;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objConvert = it.next().convert(strOptString, jSONObjectOptJSONObject, jSONArrayOptJSONArray);
            if (objConvert != null) {
                int i4 = ShareDataUIState + 81;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return objConvert;
                }
                throw null;
            }
        }
        return null;
    }

    public final Fragment createComponent(Object component) {
        int i = 2 % 2;
        Iterator<IThemeConvert> it = component2.iterator();
        while (it.hasNext()) {
            int i2 = ShareDataUIState + 99;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentCreateComponent = it.next().createComponent(component);
            if (fragmentCreateComponent != null) {
                int i4 = ShareDataUIState + 15;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 26 / 0;
                }
                return fragmentCreateComponent;
            }
        }
        return null;
    }
}
