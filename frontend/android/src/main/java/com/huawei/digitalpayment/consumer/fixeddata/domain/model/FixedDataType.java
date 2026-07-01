package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import android.content.Context;
import com.huawei.digitalpayment.consumer.fixeddata.constant.HomeInternetConstants;
import com.huawei.digitalpayment.consumer.sfcfixeddata.R;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019BG\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000ej\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;", "", "code", "", "order", "", "titleResId", "dashboardTitleResId", "iconResId", "getConnectedUrl", "faqsUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;IIIILjava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getOrder", "()I", "getTitleResId", "getDashboardTitleResId", "getIconResId", "getGetConnectedUrl", "getFaqsUrl", "HOME_FIBRE", "FOUR_G_WIRELESS", "FIVE_G_WIRELESS", "Companion", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FixedDataType {
    private static final EnumEntries $ENTRIES;
    private static final FixedDataType[] $VALUES;

    public static final Companion INSTANCE;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final String code;
    private final int dashboardTitleResId;
    private final String faqsUrl;
    private final String getConnectedUrl;
    private final int iconResId;
    private final int order;
    private final int titleResId;
    public static final FixedDataType HOME_FIBRE = new FixedDataType("HOME_FIBRE", 0, HomeInternetConstants.INTERNET_TYPE_CODE_FIBRE, 0, R.string.gsm_fixed_data_fibre_title, R.string.gsm_fixed_data_fibre_dashboard_title, R.drawable.ic_fixed_data_home_fibre, HomeInternetConstants.URL_FIXED_HOME_FIBRE, HomeInternetConstants.URL_FAQS_HOME_FIBRE);
    public static final FixedDataType FOUR_G_WIRELESS = new FixedDataType("FOUR_G_WIRELESS", 1, "4g", 1, R.string.gsm_fixed_data_4g_title, R.string.gsm_fixed_data_4g_dashboard_title, R.drawable.ic_fixed_data_4g, HomeInternetConstants.URL_FIXED_WIRELESS, HomeInternetConstants.URL_FAQS_FOUR_G_WIRELESS);
    public static final FixedDataType FIVE_G_WIRELESS = new FixedDataType("FIVE_G_WIRELESS", 2, HomeInternetConstants.INTERNET_TYPE_CODE_FIVE_G, 2, R.string.gsm_fixed_data_5g_title, R.string.gsm_fixed_data_5g_dashboard_title, R.drawable.ic_fixed_data_5g, HomeInternetConstants.URL_FIXED_WIRELESS, HomeInternetConstants.URL_FAQS_FIVE_G_WIRELESS);

    private FixedDataType(String str, int i, String str2, int i2, int i3, int i4, int i5, String str3, String str4) {
        this.code = str2;
        this.order = i2;
        this.titleResId = i3;
        this.dashboardTitleResId = i4;
        this.iconResId = i5;
        this.getConnectedUrl = str3;
        this.faqsUrl = str4;
    }

    public final String getCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.code;
        }
        throw null;
    }

    public final int getOrder() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.order;
        int i5 = i2 + 95;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int getTitleResId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.titleResId;
        int i5 = i2 + 67;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final int getDashboardTitleResId() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.dashboardTitleResId;
        int i5 = i3 + 93;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final int getIconResId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.iconResId;
        int i6 = i2 + 37;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getGetConnectedUrl() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.getConnectedUrl;
        int i5 = i3 + 43;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFaqsUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.faqsUrl;
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 11 / 0;
        }
        return str;
    }

    static {
        FixedDataType[] fixedDataTypeArr$values = $values();
        $VALUES = fixedDataTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(fixedDataTypeArr$values);
        INSTANCE = new Companion(null);
        int i = component1 + 125;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType$Companion;", "", "<init>", "()V", "fromLastMile", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;", "lastMile", "", "fromTitle", "context", "Landroid/content/Context;", "title", "fromCode", "code", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 1;
        private static int component2;

        private Companion() {
        }

        public final FixedDataType fromLastMile(String lastMile) {
            String lowerCase;
            int i;
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 17;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            if (lastMile != null) {
                lowerCase = lastMile.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            } else {
                lowerCase = null;
            }
            if (lowerCase == null) {
                return null;
            }
            int iHashCode = lowerCase.hashCode();
            if (iHashCode == 1715) {
                if (lowerCase.equals("4g")) {
                    return FixedDataType.FOUR_G_WIRELESS;
                }
                int i5 = component2 + 1;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            if (iHashCode == 1746) {
                if (!lowerCase.equals(HomeInternetConstants.INTERNET_TYPE_CODE_FIVE_G)) {
                    return null;
                }
                return FixedDataType.FIVE_G_WIRELESS;
            }
            int i6 = ShareDataUIState + 63;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            if (iHashCode == 3153858) {
                if (!lowerCase.equals(HomeInternetConstants.INTERNET_TYPE_CODE_FIBRE)) {
                    i = component2 + 53;
                    ShareDataUIState = i % 128;
                    int i8 = i % 2;
                    return null;
                }
                return FixedDataType.HOME_FIBRE;
            }
            if (iHashCode != 3451559) {
                return null;
            }
            if (!lowerCase.equals(HomeInternetConstants.INTERNET_TYPE_CODE_PTMP)) {
                i = ShareDataUIState + 31;
                component2 = i % 128;
                int i82 = i % 2;
                return null;
            }
            return FixedDataType.HOME_FIBRE;
        }

        public final FixedDataType fromTitle(Context context, String title) {
            FixedDataType next;
            int i = 2 % 2;
            int i2 = component2 + 1;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(title, "");
            Iterator<FixedDataType> it = FixedDataType.getEntries().iterator();
            int i4 = component2 + 19;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i6 = component2 + 93;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                next = it.next();
                if (StringsKt.equals(context.getString(next.getTitleResId()), title, true)) {
                    int i8 = component2 + 59;
                    ShareDataUIState = i8 % 128;
                    int i9 = i8 % 2;
                    break;
                }
            }
            return next;
        }

        public final FixedDataType fromCode(String code) {
            FixedDataType next;
            int i = 2 % 2;
            int i2 = component2 + 19;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(code, "");
            Iterator<FixedDataType> it = FixedDataType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    int i4 = ShareDataUIState + 25;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    next = null;
                    break;
                }
                int i6 = ShareDataUIState + 73;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                next = it.next();
                if (StringsKt.equals(next.getCode(), code, true)) {
                    int i8 = ShareDataUIState + 35;
                    component2 = i8 % 128;
                    int i9 = i8 % 2;
                    break;
                }
            }
            return next;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static FixedDataType valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FixedDataType fixedDataType = (FixedDataType) Enum.valueOf(FixedDataType.class, str);
        int i4 = ShareDataUIState + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fixedDataType;
    }

    public static FixedDataType[] values() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FixedDataType[] fixedDataTypeArr = (FixedDataType[]) $VALUES.clone();
        int i3 = component3 + 9;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return fixedDataTypeArr;
    }

    private static final FixedDataType[] $values() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        FixedDataType[] fixedDataTypeArr = {HOME_FIBRE, FOUR_G_WIRELESS, FIVE_G_WIRELESS};
        int i5 = i3 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return fixedDataTypeArr;
    }

    public static EnumEntries<FixedDataType> getEntries() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<FixedDataType> enumEntries = $ENTRIES;
        int i5 = i2 + 97;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return enumEntries;
    }
}
