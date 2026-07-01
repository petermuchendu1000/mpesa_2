package com.huawei.digitalpayment.consumer.sfcui.profile.resp;

import com.huawei.digitalpayment.consumer.sfc.R;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/resp/AppearanceThemeItems;", "", "<init>", "()V", "LIGHT_MODE", "Lkotlin/Pair;", "", "getLIGHT_MODE", "()Lkotlin/Pair;", "DARK_MODE", "getDARK_MODE", "SYSTEM", "getSYSTEM", "createThemeItems", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/resp/AppearanceThemeResp;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppearanceThemeItems {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component4 = 1;
    private static int copydefault;
    private static int getRequestBeneficiariesState;
    public static final AppearanceThemeItems INSTANCE = new AppearanceThemeItems();
    private static final Pair<String, String> ShareDataUIState = new Pair<>("light_model", "Light Mode");
    private static final Pair<String, String> component3 = new Pair<>("dark_model", "Dark Mode");
    private static final Pair<String, String> component2 = new Pair<>("system", "System");

    private AppearanceThemeItems() {
    }

    static {
        int i = copydefault + 37;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getLIGHT_MODE() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 29;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Pair<String, String> pair = ShareDataUIState;
        int i4 = i2 + 103;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return pair;
    }

    public final Pair<String, String> getDARK_MODE() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        Pair<String, String> pair = component3;
        int i5 = i3 + 89;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return pair;
        }
        throw null;
    }

    public final Pair<String, String> getSYSTEM() {
        int i = 2 % 2;
        int i2 = component4 + 61;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<AppearanceThemeResp> createThemeItems() {
        int i = 2 % 2;
        Pair<String, String> pair = ShareDataUIState;
        Pair<String, String> pair2 = component3;
        Pair<String, String> pair3 = component2;
        List<AppearanceThemeResp> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.listOf((Object[]) new AppearanceThemeResp[]{new AppearanceThemeResp(pair.getSecond(), pair.getFirst(), R.drawable.ic_light_mode, false, 8, null), new AppearanceThemeResp(pair2.getSecond(), pair2.getFirst(), R.drawable.ic_dark_mode, false, 8, null), new AppearanceThemeResp(pair3.getSecond(), pair3.getFirst(), R.drawable.ic_system_mode, false, 8, null)}));
        int i2 = getRequestBeneficiariesState + 85;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return mutableList;
    }
}
