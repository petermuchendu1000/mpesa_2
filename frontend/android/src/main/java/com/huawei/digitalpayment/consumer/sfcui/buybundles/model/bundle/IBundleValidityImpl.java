package com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle;

import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleValidityImpl;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleValidity;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MONTHLY", "DAILY", "WEEKLY", "OTHERS", "getValidity", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IBundleValidityImpl implements IBundleValidity {
    private static final EnumEntries $ENTRIES;
    private static final IBundleValidityImpl[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final String value;
    public static final IBundleValidityImpl MONTHLY = new IBundleValidityImpl("MONTHLY", 0, Keys.WITH_EXPIRY_CATEGORY_MONTHLY);
    public static final IBundleValidityImpl DAILY = new IBundleValidityImpl("DAILY", 1, Keys.WITH_EXPIRY_CATEGORY_DAILY);
    public static final IBundleValidityImpl WEEKLY = new IBundleValidityImpl("WEEKLY", 2, Keys.WITH_EXPIRY_CATEGORY_WEEKLY);
    public static final IBundleValidityImpl OTHERS = new IBundleValidityImpl("OTHERS", 3, "others");

    private IBundleValidityImpl(String str, int i, String str2) {
        this.value = str2;
    }

    @Override
    public String getValue() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 81;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.value;
            int i4 = 39 / 0;
        } else {
            str = this.value;
        }
        int i5 = i2 + 71;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        IBundleValidityImpl[] iBundleValidityImplArr$values = $values();
        $VALUES = iBundleValidityImplArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(iBundleValidityImplArr$values);
        int i = ShareDataUIState + 27;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 93 / 0;
        }
    }

    @Override
    public String getValidity() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String value = getValue();
        int i4 = component1 + 17;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return value;
    }

    public static IBundleValidityImpl valueOf(String str) {
        IBundleValidityImpl iBundleValidityImpl;
        int i = 2 % 2;
        int i2 = component1 + 9;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            iBundleValidityImpl = (IBundleValidityImpl) Enum.valueOf(IBundleValidityImpl.class, str);
            int i3 = 26 / 0;
        } else {
            iBundleValidityImpl = (IBundleValidityImpl) Enum.valueOf(IBundleValidityImpl.class, str);
        }
        int i4 = component1 + 3;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iBundleValidityImpl;
    }

    public static IBundleValidityImpl[] values() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return (IBundleValidityImpl[]) $VALUES.clone();
        }
        int i3 = 9 / 0;
        return (IBundleValidityImpl[]) $VALUES.clone();
    }

    private static final IBundleValidityImpl[] $values() {
        IBundleValidityImpl[] iBundleValidityImplArr;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            IBundleValidityImpl iBundleValidityImpl = MONTHLY;
            IBundleValidityImpl iBundleValidityImpl2 = DAILY;
            IBundleValidityImpl iBundleValidityImpl3 = WEEKLY;
            IBundleValidityImpl iBundleValidityImpl4 = OTHERS;
            iBundleValidityImplArr = new IBundleValidityImpl[3];
            iBundleValidityImplArr[1] = iBundleValidityImpl;
            iBundleValidityImplArr[0] = iBundleValidityImpl2;
            iBundleValidityImplArr[3] = iBundleValidityImpl3;
            iBundleValidityImplArr[5] = iBundleValidityImpl4;
        } else {
            iBundleValidityImplArr = new IBundleValidityImpl[]{MONTHLY, DAILY, WEEKLY, OTHERS};
        }
        int i4 = i2 + 113;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iBundleValidityImplArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<IBundleValidityImpl> getEntries() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        EnumEntries<IBundleValidityImpl> enumEntries = $ENTRIES;
        int i5 = i3 + 59;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
