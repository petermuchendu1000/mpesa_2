package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import com.alipay.iap.android.wallet.foundation.deeplink.DeeplinkService;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountAction;", "", "buttonStyle", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ButtonStyle;", "order", "", "<init>", "(Ljava/lang/String;ILcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ButtonStyle;I)V", "getButtonStyle", "()Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ButtonStyle;", "getOrder", "()I", "CHANGE_PLAN", "PAY", DeeplinkService.Scene.TOP_UP, "BUY_PLAN", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountAction {
    private static final EnumEntries $ENTRIES;
    private static final AccountAction[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final ButtonStyle buttonStyle;
    private final int order;
    public static final AccountAction CHANGE_PLAN = new AccountAction("CHANGE_PLAN", 0, ButtonStyle.SECONDARY, 0);
    public static final AccountAction PAY = new AccountAction("PAY", 1, ButtonStyle.PRIMARY, 1);
    public static final AccountAction TOP_UP = new AccountAction(DeeplinkService.Scene.TOP_UP, 2, ButtonStyle.PRIMARY, 1);
    public static final AccountAction BUY_PLAN = new AccountAction("BUY_PLAN", 3, ButtonStyle.PRIMARY, 1);

    private AccountAction(String str, int i, ButtonStyle buttonStyle, int i2) {
        this.buttonStyle = buttonStyle;
        this.order = i2;
    }

    public final ButtonStyle getButtonStyle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ButtonStyle buttonStyle = this.buttonStyle;
        int i5 = i2 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return buttonStyle;
    }

    public final int getOrder() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.order;
        int i6 = i3 + 83;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static {
        AccountAction[] accountActionArr$values = $values();
        $VALUES = accountActionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(accountActionArr$values);
        int i = component3 + 17;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static AccountAction valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return (AccountAction) Enum.valueOf(AccountAction.class, str);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AccountAction[] values() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        AccountAction[] accountActionArr = (AccountAction[]) $VALUES.clone();
        int i4 = component1 + 31;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return accountActionArr;
    }

    private static final AccountAction[] $values() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        AccountAction[] accountActionArr = {CHANGE_PLAN, PAY, TOP_UP, BUY_PLAN};
        int i5 = i2 + 35;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return accountActionArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<AccountAction> getEntries() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        EnumEntries<AccountAction> enumEntries = $ENTRIES;
        int i5 = i3 + 109;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        throw null;
    }
}
