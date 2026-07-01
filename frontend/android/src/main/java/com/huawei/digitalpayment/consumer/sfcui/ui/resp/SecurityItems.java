package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import com.huawei.digitalpayment.consumer.sfc.R;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/SecurityItems;", "", "<init>", "()V", "UNLOCK_PIN", "Lkotlin/Pair;", "", "getUNLOCK_PIN", "()Lkotlin/Pair;", "FORGET_PIN", "getFORGET_PIN", "CHANGE_PIN", "getCHANGE_PIN", "SET_SECURITY_QUESTIONS", "getSET_SECURITY_QUESTIONS", "SET_SERVICE_PIN", "getSET_SERVICE_PIN", "createSecurityItems", "", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/SecurityBean;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SecurityItems {
    public static final int $stable = 0;
    private static int copy = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    public static final SecurityItems INSTANCE = new SecurityItems();
    private static final Pair<String, String> component1 = new Pair<>("1", "Unlock my M-PESA PIN");
    private static final Pair<String, String> copydefault = new Pair<>("2", "I Forgot my M-PESA PIN");
    private static final Pair<String, String> ShareDataUIState = new Pair<>("3", "I want to change my M-PESA PIN");
    private static final Pair<String, String> component2 = new Pair<>("4", "I want to set Security Questions");
    private static final Pair<String, String> component3 = new Pair<>("5", "I want to manage my Service PIN");

    private SecurityItems() {
    }

    static {
        int i = equals + 93;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public final Pair<String, String> getUNLOCK_PIN() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 89;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getFORGET_PIN() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 125;
        int i3 = i2 % 128;
        copy = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Pair<String, String> pair = copydefault;
        int i4 = i3 + 123;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return pair;
        }
        obj.hashCode();
        throw null;
    }

    public final Pair<String, String> getCHANGE_PIN() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Pair<String, String> pair = ShareDataUIState;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return pair;
    }

    public final Pair<String, String> getSET_SECURITY_QUESTIONS() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        int i3 = i2 % 128;
        copy = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Pair<String, String> pair = component2;
        int i4 = i3 + 67;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return pair;
        }
        throw null;
    }

    public final Pair<String, String> getSET_SERVICE_PIN() {
        int i = 2 % 2;
        int i2 = copy + 51;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Pair<String, String> pair = component3;
        if (i3 != 0) {
            int i4 = 99 / 0;
        }
        return pair;
    }

    public final List<SecurityBean> createSecurityItems() {
        int i = 2 % 2;
        Pair<String, String> pair = component1;
        SecurityBean securityBean = new SecurityBean(pair.getFirst(), pair.getSecond(), R.drawable.ic_one_app_lock);
        Pair<String, String> pair2 = ShareDataUIState;
        SecurityBean securityBean2 = new SecurityBean(pair2.getFirst(), pair2.getSecond(), R.drawable.ic_one_app_lock);
        Pair<String, String> pair3 = component2;
        SecurityBean securityBean3 = new SecurityBean(pair3.getFirst(), pair3.getSecond(), R.drawable.ic_one_app_message_question);
        Pair<String, String> pair4 = component3;
        List<SecurityBean> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.listOf((Object[]) new SecurityBean[]{securityBean, securityBean2, securityBean3, new SecurityBean(pair4.getFirst(), pair4.getSecond(), R.drawable.ic_one_app_passcode_lock)}));
        int i2 = getAsAtTimestamp + 97;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return mutableList;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
