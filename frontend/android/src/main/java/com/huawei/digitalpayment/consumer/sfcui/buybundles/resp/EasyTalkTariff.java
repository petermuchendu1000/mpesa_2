package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkTariff;", "", "raw", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRaw", "()Ljava/lang/String;", "PREPAID", "POSTPAID", "HYBRID", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EasyTalkTariff {
    private static final EnumEntries $ENTRIES;
    private static final EasyTalkTariff[] $VALUES;

    public static final Companion INSTANCE;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final String raw;
    public static final EasyTalkTariff PREPAID = new EasyTalkTariff("PREPAID", 0, "PREPAID");
    public static final EasyTalkTariff POSTPAID = new EasyTalkTariff("POSTPAID", 1, "POSTPAID");
    public static final EasyTalkTariff HYBRID = new EasyTalkTariff("HYBRID", 2, "HYBRID");

    private EasyTalkTariff(String str, int i, String str2) {
        this.raw = str2;
    }

    public final String getRaw() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.raw;
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return str;
    }

    static {
        EasyTalkTariff[] easyTalkTariffArr$values = $values();
        $VALUES = easyTalkTariffArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(easyTalkTariffArr$values);
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = component3 + 113;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkTariff$Companion;", "", "<init>", "()V", "fromRaw", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkTariff;", "value", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component1 = 0;
        private static int component2 = 1;

        private Companion() {
        }

        public final EasyTalkTariff fromRaw(String value) {
            EasyTalkTariff easyTalkTariff;
            int i = 2 % 2;
            int i2 = component2 + 115;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Iterator<EasyTalkTariff> it = EasyTalkTariff.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    easyTalkTariff = null;
                    break;
                }
                EasyTalkTariff next = it.next();
                if (StringsKt.equals(next.getRaw(), value, true)) {
                    int i4 = component1 + 107;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 73 / 0;
                    }
                    easyTalkTariff = next;
                }
            }
            EasyTalkTariff easyTalkTariff2 = easyTalkTariff;
            if (easyTalkTariff2 != null) {
                return easyTalkTariff2;
            }
            EasyTalkTariff easyTalkTariff3 = EasyTalkTariff.PREPAID;
            int i6 = component2 + 75;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return easyTalkTariff3;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static EasyTalkTariff valueOf(String str) {
        EasyTalkTariff easyTalkTariff;
        int i = 2 % 2;
        int i2 = component1 + 77;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            easyTalkTariff = (EasyTalkTariff) Enum.valueOf(EasyTalkTariff.class, str);
            int i3 = 85 / 0;
        } else {
            easyTalkTariff = (EasyTalkTariff) Enum.valueOf(EasyTalkTariff.class, str);
        }
        int i4 = component1 + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return easyTalkTariff;
    }

    public static EasyTalkTariff[] values() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        EasyTalkTariff[] easyTalkTariffArr = (EasyTalkTariff[]) $VALUES.clone();
        int i3 = component1 + 93;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 41 / 0;
        }
        return easyTalkTariffArr;
    }

    private static final EasyTalkTariff[] $values() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        EasyTalkTariff easyTalkTariff = PREPAID;
        if (i3 != 0) {
            return new EasyTalkTariff[]{easyTalkTariff, POSTPAID, HYBRID};
        }
        EasyTalkTariff easyTalkTariff2 = POSTPAID;
        EasyTalkTariff easyTalkTariff3 = HYBRID;
        EasyTalkTariff[] easyTalkTariffArr = new EasyTalkTariff[3];
        easyTalkTariffArr[0] = easyTalkTariff;
        easyTalkTariffArr[1] = easyTalkTariff2;
        easyTalkTariffArr[5] = easyTalkTariff3;
        return easyTalkTariffArr;
    }

    public static EnumEntries<EasyTalkTariff> getEntries() {
        EnumEntries<EasyTalkTariff> enumEntries;
        int i = 2 % 2;
        int i2 = component1 + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 62 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 37;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return enumEntries;
    }
}
