package com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleCategoryImpl;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/IBundleCategory;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NO_EXPIRY_BUNDLE", "WITH_EXPIRY_BUNDLE", "ALL_IN_ONE_BUNDLE", "SPECIAL_OFFERS", "getCategory", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IBundleCategoryImpl implements IBundleCategory {
    private static final EnumEntries $ENTRIES;
    private static final IBundleCategoryImpl[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String value;
    public static final IBundleCategoryImpl NO_EXPIRY_BUNDLE = new IBundleCategoryImpl("NO_EXPIRY_BUNDLE", 0, "No Expiry");
    public static final IBundleCategoryImpl WITH_EXPIRY_BUNDLE = new IBundleCategoryImpl("WITH_EXPIRY_BUNDLE", 1, "With Expiry");
    public static final IBundleCategoryImpl ALL_IN_ONE_BUNDLE = new IBundleCategoryImpl("ALL_IN_ONE_BUNDLE", 2, "All In One");
    public static final IBundleCategoryImpl SPECIAL_OFFERS = new IBundleCategoryImpl("SPECIAL_OFFERS", 3, "Special Offers");

    private IBundleCategoryImpl(String str, int i, String str2) {
        this.value = str2;
    }

    @Override
    public String getValue() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 69;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        IBundleCategoryImpl[] iBundleCategoryImplArr$values = $values();
        $VALUES = iBundleCategoryImplArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(iBundleCategoryImplArr$values);
        int i = component1 + 39;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    @Override
    public String getCategory() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String value = getValue();
        int i4 = component2 + 65;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return value;
    }

    public static IBundleCategoryImpl valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return (IBundleCategoryImpl) Enum.valueOf(IBundleCategoryImpl.class, str);
        }
        int i3 = 92 / 0;
        return (IBundleCategoryImpl) Enum.valueOf(IBundleCategoryImpl.class, str);
    }

    public static IBundleCategoryImpl[] values() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        IBundleCategoryImpl[] iBundleCategoryImplArr = (IBundleCategoryImpl[]) $VALUES.clone();
        int i4 = copydefault + 9;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iBundleCategoryImplArr;
    }

    private static final IBundleCategoryImpl[] $values() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return new IBundleCategoryImpl[]{NO_EXPIRY_BUNDLE, WITH_EXPIRY_BUNDLE, ALL_IN_ONE_BUNDLE, SPECIAL_OFFERS};
        }
        IBundleCategoryImpl iBundleCategoryImpl = NO_EXPIRY_BUNDLE;
        IBundleCategoryImpl iBundleCategoryImpl2 = WITH_EXPIRY_BUNDLE;
        IBundleCategoryImpl iBundleCategoryImpl3 = ALL_IN_ONE_BUNDLE;
        IBundleCategoryImpl iBundleCategoryImpl4 = SPECIAL_OFFERS;
        IBundleCategoryImpl[] iBundleCategoryImplArr = new IBundleCategoryImpl[2];
        iBundleCategoryImplArr[1] = iBundleCategoryImpl;
        iBundleCategoryImplArr[1] = iBundleCategoryImpl2;
        iBundleCategoryImplArr[2] = iBundleCategoryImpl3;
        iBundleCategoryImplArr[4] = iBundleCategoryImpl4;
        return iBundleCategoryImplArr;
    }

    public static EnumEntries<IBundleCategoryImpl> getEntries() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        EnumEntries<IBundleCategoryImpl> enumEntries = $ENTRIES;
        int i5 = i3 + 11;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
