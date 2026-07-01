package com.huawei.digitalpayment.consumer.base.resp;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceDataEvent;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REQUEST_MONEY", "SEND_MONEY", "SEND_TO_MANY", "BUY_GOODS", "PAY_BILL", "WITHDRAW_AT_AGENT", "MINI_APP_TRANSACTION", "BUY_AIRTIME", "REVERSE_TRANSACTION", "PAY_TO_POCHI", "POCHI_BUY_GOODS", "POCHI_PAY_BILL", "POCHI_PAY_MOBILE", "POCHI_MINI_APPS", "POCHI_WITHDRAW", "POCHI_DEPOSIT", "POCHI_WITHDRAW_AT_AGENT", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReferenceDataEvent {
    private static final EnumEntries $ENTRIES;
    private static final ReferenceDataEvent[] $VALUES;

    public static final Companion INSTANCE;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String value;
    public static final ReferenceDataEvent REQUEST_MONEY = new ReferenceDataEvent("REQUEST_MONEY", 0, ReferenceDataEventName.RequestMoney);
    public static final ReferenceDataEvent SEND_MONEY = new ReferenceDataEvent("SEND_MONEY", 1, ReferenceDataEventName.SendMoney);
    public static final ReferenceDataEvent SEND_TO_MANY = new ReferenceDataEvent("SEND_TO_MANY", 2, "SendToMany");
    public static final ReferenceDataEvent BUY_GOODS = new ReferenceDataEvent("BUY_GOODS", 3, "BuyGoods");
    public static final ReferenceDataEvent PAY_BILL = new ReferenceDataEvent("PAY_BILL", 4, "PayBill");
    public static final ReferenceDataEvent WITHDRAW_AT_AGENT = new ReferenceDataEvent("WITHDRAW_AT_AGENT", 5, ReferenceDataEventName.WithdrawAtAgent);
    public static final ReferenceDataEvent MINI_APP_TRANSACTION = new ReferenceDataEvent("MINI_APP_TRANSACTION", 6, ReferenceDataEventName.MiniAppTransaction);
    public static final ReferenceDataEvent BUY_AIRTIME = new ReferenceDataEvent("BUY_AIRTIME", 7, ReferenceDataEventName.BuyAirtime);
    public static final ReferenceDataEvent REVERSE_TRANSACTION = new ReferenceDataEvent("REVERSE_TRANSACTION", 8, ReferenceDataEventName.ReverseTransaction);
    public static final ReferenceDataEvent PAY_TO_POCHI = new ReferenceDataEvent("PAY_TO_POCHI", 9, ReferenceDataEventName.PayToPochi);
    public static final ReferenceDataEvent POCHI_BUY_GOODS = new ReferenceDataEvent("POCHI_BUY_GOODS", 10, "PochiBuyGoods");
    public static final ReferenceDataEvent POCHI_PAY_BILL = new ReferenceDataEvent("POCHI_PAY_BILL", 11, "PochiPayBill");
    public static final ReferenceDataEvent POCHI_PAY_MOBILE = new ReferenceDataEvent("POCHI_PAY_MOBILE", 12, ReferenceDataEventName.PochiPayMobile);
    public static final ReferenceDataEvent POCHI_MINI_APPS = new ReferenceDataEvent("POCHI_MINI_APPS", 13, ReferenceDataEventName.PochiMiniApps);
    public static final ReferenceDataEvent POCHI_WITHDRAW = new ReferenceDataEvent("POCHI_WITHDRAW", 14, "PochiWithdraw");
    public static final ReferenceDataEvent POCHI_DEPOSIT = new ReferenceDataEvent("POCHI_DEPOSIT", 15, "PochiDeposit");
    public static final ReferenceDataEvent POCHI_WITHDRAW_AT_AGENT = new ReferenceDataEvent("POCHI_WITHDRAW_AT_AGENT", 16, ReferenceDataEventName.PochiWithdrawAtAgent);

    private ReferenceDataEvent(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ReferenceDataEvent[] referenceDataEventArr$values = $values();
        $VALUES = referenceDataEventArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(referenceDataEventArr$values);
        INSTANCE = new Companion(null);
        int i = copydefault + 99;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceDataEvent$Companion;", "", "<init>", "()V", "from", "Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceDataEvent;", "rawValue", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 0;
        private static int component3 = 1;

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
        
            return r3;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent from(java.lang.String r8) {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent.Companion.component2
                int r1 = r1 + 63
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent.Companion.component3 = r2
                int r1 = r1 % r0
                java.lang.String r1 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
                kotlin.enums.EnumEntries r1 = com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent.getEntries()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
                int r2 = com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent.Companion.component2
                int r2 = r2 + 89
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent.Companion.component3 = r3
                int r2 = r2 % r0
                if (r2 != 0) goto L28
                r2 = 3
                int r2 = r2 / r0
            L28:
                boolean r2 = r1.hasNext()
                r3 = 0
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r1.next()
                r4 = r2
                com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent r4 = (com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent) r4
                java.lang.String r4 = r4.getValue()
                r5 = r8
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                java.lang.CharSequence r5 = kotlin.text.StringsKt.trim(r5)
                java.lang.String r5 = r5.toString()
                r6 = 1
                boolean r4 = kotlin.text.StringsKt.equals(r4, r5, r6)
                if (r4 == 0) goto L28
                int r8 = com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent.Companion.component2
                int r8 = r8 + 107
                int r1 = r8 % 128
                com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent.Companion.component3 = r1
                int r8 = r8 % r0
                if (r8 == 0) goto L59
                r3 = r2
                goto L5d
            L59:
                r3.hashCode()
                throw r3
            L5d:
                com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent r3 = (com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent) r3
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent.Companion.from(java.lang.String):com.huawei.digitalpayment.consumer.base.resp.ReferenceDataEvent");
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static ReferenceDataEvent valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return (ReferenceDataEvent) Enum.valueOf(ReferenceDataEvent.class, str);
        }
        throw null;
    }

    public static ReferenceDataEvent[] values() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ReferenceDataEvent[] referenceDataEventArr = (ReferenceDataEvent[]) $VALUES.clone();
        int i4 = component1 + 31;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return referenceDataEventArr;
    }

    private static final ReferenceDataEvent[] $values() {
        int i = 2 % 2;
        int i2 = component2 + 81;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ReferenceDataEvent[] referenceDataEventArr = {REQUEST_MONEY, SEND_MONEY, SEND_TO_MANY, BUY_GOODS, PAY_BILL, WITHDRAW_AT_AGENT, MINI_APP_TRANSACTION, BUY_AIRTIME, REVERSE_TRANSACTION, PAY_TO_POCHI, POCHI_BUY_GOODS, POCHI_PAY_BILL, POCHI_PAY_MOBILE, POCHI_MINI_APPS, POCHI_WITHDRAW, POCHI_DEPOSIT, POCHI_WITHDRAW_AT_AGENT};
        int i5 = i3 + 35;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return referenceDataEventArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<ReferenceDataEvent> getEntries() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        EnumEntries<ReferenceDataEvent> enumEntries = $ENTRIES;
        int i4 = i2 + 23;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return enumEntries;
        }
        obj.hashCode();
        throw null;
    }
}
