package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import com.huawei.digitalpayment.consumer.fixeddata.constant.HomeInternetConstants;
import com.huawei.digitalpayment.consumer.sfcfixeddata.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B=\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataCardType;", "", "titleResId", "", "descriptionResId", "iconResId", "fixedDataType", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;", "url", "", "<init>", "(Ljava/lang/String;IIIILcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;Ljava/lang/String;)V", "getTitleResId", "()I", "getDescriptionResId", "getIconResId", "getFixedDataType", "()Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;", "getUrl", "()Ljava/lang/String;", "HOME_FIBRE", "FOUR_G_WIRELESS", "FIVE_G_WIRELESS", "GET_INTERNET", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FixedDataCardType {
    private static final EnumEntries $ENTRIES;
    private static final FixedDataCardType[] $VALUES;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final int descriptionResId;
    private final FixedDataType fixedDataType;
    private final int iconResId;
    private final int titleResId;
    private final String url;
    public static final FixedDataCardType HOME_FIBRE = new FixedDataCardType("HOME_FIBRE", 0, R.string.gsm_fixed_data_fibre_landing_page_title, R.string.gsm_fixed_data_fibre_landing_page_description, R.drawable.ic_pay_confirmation_home_wifi, FixedDataType.HOME_FIBRE, null, 16, null);
    public static final FixedDataCardType FOUR_G_WIRELESS = new FixedDataCardType("FOUR_G_WIRELESS", 1, R.string.gsm_fixed_data_4g_landing_page_title, R.string.gsm_fixed_data_4g_landing_page_description, FixedDataType.FOUR_G_WIRELESS.getIconResId(), FixedDataType.FOUR_G_WIRELESS, null, 16, null);
    public static final FixedDataCardType FIVE_G_WIRELESS = new FixedDataCardType("FIVE_G_WIRELESS", 2, R.string.gsm_fixed_data_5g_landing_page_title, R.string.gsm_fixed_data_5g_landing_page_description, FixedDataType.FIVE_G_WIRELESS.getIconResId(), FixedDataType.FIVE_G_WIRELESS, null, 16, null);
    public static final FixedDataCardType GET_INTERNET = new FixedDataCardType("GET_INTERNET", 3, R.string.gsm_fixed_data_get_connected_landing_page_title, R.string.gsm_fixed_data_get_connected_landing_page_description, R.drawable.ic_fixed_data_wifi, null, HomeInternetConstants.URL_FIXED_GET_CONNECTED);

    private FixedDataCardType(String str, int i, int i2, int i3, int i4, FixedDataType fixedDataType, String str2) {
        this.titleResId = i2;
        this.descriptionResId = i3;
        this.iconResId = i4;
        this.fixedDataType = fixedDataType;
        this.url = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    FixedDataCardType(String str, int i, int i2, int i3, int i4, FixedDataType fixedDataType, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        if ((i5 & 16) != 0) {
            int i6 = component2 + 103;
            int i7 = i6 % 128;
            component1 = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 75;
            component2 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 % 2;
            }
            str3 = null;
        } else {
            str3 = str2;
        }
        this(str, i, i2, i3, i4, fixedDataType, str3);
    }

    public final int getTitleResId() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.titleResId;
        int i6 = i3 + 25;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getDescriptionResId() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.descriptionResId;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int getIconResId() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.iconResId;
        }
        throw null;
    }

    public final FixedDataType getFixedDataType() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        FixedDataType fixedDataType = this.fixedDataType;
        int i4 = i2 + 79;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return fixedDataType;
        }
        throw null;
    }

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 99;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.url;
        int i4 = i2 + 91;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        FixedDataCardType[] fixedDataCardTypeArr$values = $values();
        $VALUES = fixedDataCardTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(fixedDataCardTypeArr$values);
        int i = component3 + 11;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static FixedDataCardType valueOf(String str) {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return (FixedDataCardType) Enum.valueOf(FixedDataCardType.class, str);
        }
        int i3 = 3 / 0;
        return (FixedDataCardType) Enum.valueOf(FixedDataCardType.class, str);
    }

    public static FixedDataCardType[] values() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return (FixedDataCardType[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final FixedDataCardType[] $values() {
        FixedDataCardType[] fixedDataCardTypeArr;
        int i = 2 % 2;
        int i2 = component2 + 27;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            FixedDataCardType fixedDataCardType = HOME_FIBRE;
            FixedDataCardType fixedDataCardType2 = FOUR_G_WIRELESS;
            FixedDataCardType fixedDataCardType3 = FIVE_G_WIRELESS;
            FixedDataCardType fixedDataCardType4 = GET_INTERNET;
            fixedDataCardTypeArr = new FixedDataCardType[3];
            fixedDataCardTypeArr[0] = fixedDataCardType;
            fixedDataCardTypeArr[1] = fixedDataCardType2;
            fixedDataCardTypeArr[5] = fixedDataCardType3;
            fixedDataCardTypeArr[3] = fixedDataCardType4;
        } else {
            fixedDataCardTypeArr = new FixedDataCardType[]{HOME_FIBRE, FOUR_G_WIRELESS, FIVE_G_WIRELESS, GET_INTERNET};
        }
        int i4 = i3 + 5;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fixedDataCardTypeArr;
    }

    public static EnumEntries<FixedDataCardType> getEntries() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<FixedDataCardType> enumEntries = $ENTRIES;
        int i5 = i2 + 57;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
