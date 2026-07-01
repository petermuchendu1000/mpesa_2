package com.huawei.digitalpayment.consumer.baselib.config.model;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\"\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0010j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e`\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u000eHÆ\u0003J%\u00101\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0010j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e`\u0011HÆ\u0003J\t\u00102\u001a\u00020\u0013HÆ\u0003J\u009d\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2$\b\u0002\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0010j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e`\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00104\u001a\u00020\u00132\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R-\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0010j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e`\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010$\"\u0004\b%\u0010&¨\u00068"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/model/CurrencyConfig;", "", "currencyPrecision", "", "roundingMode", "", "exchangeRatio", "isDefault", "description", "currencyId", "currencyCode", "currencyUnit", "status", "currencyInfoLocalizationVO", "Lcom/huawei/digitalpayment/consumer/baselib/config/model/CurrencyInfoByLanguage;", "i18nCurrencyInfoLocalization", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "isChecked", "", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/baselib/config/model/CurrencyInfoByLanguage;Ljava/util/HashMap;Z)V", "getCurrencyPrecision", "()I", "getRoundingMode", "()Ljava/lang/String;", "getExchangeRatio", "getDescription", "getCurrencyId", "getCurrencyCode", "getCurrencyUnit", "getStatus", "getCurrencyInfoLocalizationVO", "()Lcom/huawei/digitalpayment/consumer/baselib/config/model/CurrencyInfoByLanguage;", "getI18nCurrencyInfoLocalization", "()Ljava/util/HashMap;", "()Z", "setChecked", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CurrencyConfig {
    private static int getSponsorBeneficiariesState = 1;
    private static int toString;
    private final String ArtificialStackFrames;
    private final String ShareDataUIState;
    private final String component1;
    private final int component2;
    private final CurrencyInfoByLanguage component3;
    private final int component4;
    private final String copy;
    private final String copydefault;
    private boolean equals;
    private final HashMap<String, CurrencyInfoByLanguage> getAsAtTimestamp;
    private final String getRequestBeneficiariesState;
    private final String getShareableDataState;

    public CurrencyConfig(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, CurrencyInfoByLanguage currencyInfoByLanguage, HashMap<String, CurrencyInfoByLanguage> map, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(currencyInfoByLanguage, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.component2 = i;
        this.ArtificialStackFrames = str;
        this.component4 = i2;
        this.getRequestBeneficiariesState = str2;
        this.copy = str3;
        this.component1 = str4;
        this.copydefault = str5;
        this.ShareDataUIState = str6;
        this.getShareableDataState = str7;
        this.component3 = currencyInfoByLanguage;
        this.getAsAtTimestamp = map;
        this.equals = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CurrencyConfig(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, CurrencyInfoByLanguage currencyInfoByLanguage, HashMap map, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        if ((i3 & 2048) != 0) {
            int i4 = getSponsorBeneficiariesState + 9;
            int i5 = i4 % 128;
            toString = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 81;
            getSponsorBeneficiariesState = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
            z2 = false;
        } else {
            z2 = z;
        }
        this(i, str, i2, str2, str3, str4, str5, str6, str7, currencyInfoByLanguage, map, z2);
    }

    public final int getCurrencyPrecision() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 79;
        getSponsorBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.component2;
        int i5 = i2 + 43;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final String getRoundingMode() {
        int i = 2 % 2;
        int i2 = toString + 9;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.ArtificialStackFrames;
        int i5 = i3 + 113;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getExchangeRatio() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 77;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        int i5 = this.component4;
        int i6 = i3 + 57;
        getSponsorBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String isDefault() {
        int i = 2 % 2;
        int i2 = toString + 61;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 19;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 29;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return str;
    }

    public final String getCurrencyId() {
        int i = 2 % 2;
        int i2 = toString + 11;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 57;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getCurrencyCode() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 117;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 81;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getCurrencyUnit() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 111;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 31;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 23;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getShareableDataState;
        int i5 = i2 + 99;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final CurrencyInfoByLanguage getCurrencyInfoLocalizationVO() {
        CurrencyInfoByLanguage currencyInfoByLanguage;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 95;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 != 0) {
            currencyInfoByLanguage = this.component3;
            int i4 = 45 / 0;
        } else {
            currencyInfoByLanguage = this.component3;
        }
        int i5 = i3 + 51;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return currencyInfoByLanguage;
    }

    public final HashMap<String, CurrencyInfoByLanguage> getI18nCurrencyInfoLocalization() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 63;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        HashMap<String, CurrencyInfoByLanguage> map = this.getAsAtTimestamp;
        int i5 = i2 + 85;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final boolean isChecked() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 29;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.equals;
        int i4 = i2 + 73;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final void setChecked(boolean z) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 65;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        this.equals = z;
        int i5 = i3 + 67;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CurrencyConfig copy$default(CurrencyConfig currencyConfig, int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, CurrencyInfoByLanguage currencyInfoByLanguage, HashMap map, boolean z, int i3, Object obj) {
        String str8;
        String str9;
        String str10;
        CurrencyInfoByLanguage currencyInfoByLanguage2;
        boolean z2;
        int i4 = 2 % 2;
        int i5 = (i3 & 1) != 0 ? currencyConfig.component2 : i;
        if ((i3 & 2) != 0) {
            int i6 = getSponsorBeneficiariesState + 103;
            int i7 = i6 % 128;
            toString = i7;
            int i8 = i6 % 2;
            str8 = currencyConfig.ArtificialStackFrames;
            int i9 = i7 + 67;
            getSponsorBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str8 = str;
        }
        int i11 = (i3 & 4) != 0 ? currencyConfig.component4 : i2;
        String str11 = (i3 & 8) != 0 ? currencyConfig.getRequestBeneficiariesState : str2;
        String str12 = (i3 & 16) != 0 ? currencyConfig.copy : str3;
        if ((i3 & 32) != 0) {
            str9 = currencyConfig.component1;
            int i12 = getSponsorBeneficiariesState + 41;
            toString = i12 % 128;
            int i13 = i12 % 2;
        } else {
            str9 = str4;
        }
        if ((i3 & 64) != 0) {
            int i14 = toString;
            int i15 = i14 + 75;
            getSponsorBeneficiariesState = i15 % 128;
            int i16 = i15 % 2;
            str10 = currencyConfig.copydefault;
            int i17 = i14 + 39;
            getSponsorBeneficiariesState = i17 % 128;
            int i18 = i17 % 2;
        } else {
            str10 = str5;
        }
        String str13 = (i3 & 128) != 0 ? currencyConfig.ShareDataUIState : str6;
        String str14 = (i3 & 256) != 0 ? currencyConfig.getShareableDataState : str7;
        if ((i3 & 512) != 0) {
            int i19 = toString + 25;
            getSponsorBeneficiariesState = i19 % 128;
            if (i19 % 2 == 0) {
                CurrencyInfoByLanguage currencyInfoByLanguage3 = currencyConfig.component3;
                throw null;
            }
            currencyInfoByLanguage2 = currencyConfig.component3;
        } else {
            currencyInfoByLanguage2 = currencyInfoByLanguage;
        }
        HashMap map2 = (i3 & 1024) != 0 ? currencyConfig.getAsAtTimestamp : map;
        if ((i3 & 2048) != 0) {
            int i20 = getSponsorBeneficiariesState + 105;
            toString = i20 % 128;
            if (i20 % 2 != 0) {
                z2 = currencyConfig.equals;
                int i21 = 91 / 0;
            } else {
                z2 = currencyConfig.equals;
            }
        } else {
            z2 = z;
        }
        return currencyConfig.copy(i5, str8, i11, str11, str12, str9, str10, str13, str14, currencyInfoByLanguage2, map2, z2);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 61;
        getSponsorBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.component2;
        int i5 = i2 + 99;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final CurrencyInfoByLanguage component10() {
        int i = 2 % 2;
        int i2 = toString + 35;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CurrencyInfoByLanguage currencyInfoByLanguage = this.component3;
        int i4 = i3 + 95;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return currencyInfoByLanguage;
    }

    public final HashMap<String, CurrencyInfoByLanguage> component11() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 29;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component12() {
        boolean z;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 3;
        toString = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.equals;
            int i4 = 48 / 0;
        } else {
            z = this.equals;
        }
        int i5 = i2 + 105;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return z;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = toString + 7;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.ArtificialStackFrames;
        int i5 = i3 + 117;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 47;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.component4;
        int i5 = i3 + 95;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 119;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i2 + 111;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 70 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 33;
        toString = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.copy;
        int i4 = i2 + 19;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 105;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 7;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 99;
        toString = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 9;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = toString + 93;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 103;
        toString = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.getShareableDataState;
        int i4 = i2 + 71;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final CurrencyConfig copy(int currencyPrecision, String roundingMode, int exchangeRatio, String isDefault, String description, String currencyId, String currencyCode, String currencyUnit, String status, CurrencyInfoByLanguage currencyInfoLocalizationVO, HashMap<String, CurrencyInfoByLanguage> i18nCurrencyInfoLocalization, boolean isChecked) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(roundingMode, "");
        Intrinsics.checkNotNullParameter(isDefault, "");
        Intrinsics.checkNotNullParameter(description, "");
        Intrinsics.checkNotNullParameter(currencyId, "");
        Intrinsics.checkNotNullParameter(currencyCode, "");
        Intrinsics.checkNotNullParameter(currencyUnit, "");
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(currencyInfoLocalizationVO, "");
        Intrinsics.checkNotNullParameter(i18nCurrencyInfoLocalization, "");
        CurrencyConfig currencyConfig = new CurrencyConfig(currencyPrecision, roundingMode, exchangeRatio, isDefault, description, currencyId, currencyCode, currencyUnit, status, currencyInfoLocalizationVO, i18nCurrencyInfoLocalization, isChecked);
        int i2 = getSponsorBeneficiariesState + 63;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
        return currencyConfig;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 65;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 119;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof CurrencyConfig)) {
            return false;
        }
        CurrencyConfig currencyConfig = (CurrencyConfig) other;
        if (this.component2 != currencyConfig.component2) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ArtificialStackFrames, currencyConfig.ArtificialStackFrames)) {
            int i7 = toString + 81;
            getSponsorBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.component4 != currencyConfig.component4) {
            int i9 = toString + 1;
            getSponsorBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, currencyConfig.getRequestBeneficiariesState) || !Intrinsics.areEqual(this.copy, currencyConfig.copy)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, currencyConfig.component1)) {
            int i11 = getSponsorBeneficiariesState + 75;
            toString = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if ((!Intrinsics.areEqual(this.copydefault, currencyConfig.copydefault)) || !Intrinsics.areEqual(this.ShareDataUIState, currencyConfig.ShareDataUIState) || !Intrinsics.areEqual(this.getShareableDataState, currencyConfig.getShareableDataState)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, currencyConfig.component3)) {
            int i13 = getSponsorBeneficiariesState + 53;
            toString = i13 % 128;
            return i13 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, currencyConfig.getAsAtTimestamp)) {
            return false;
        }
        if (this.equals == currencyConfig.equals) {
            return true;
        }
        int i14 = toString + 37;
        getSponsorBeneficiariesState = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = toString + 45;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((Integer.hashCode(this.component2) * 31) + this.ArtificialStackFrames.hashCode()) * 31) + Integer.hashCode(this.component4)) * 31) + this.getRequestBeneficiariesState.hashCode()) * 31) + this.copy.hashCode()) * 31) + this.component1.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + this.getShareableDataState.hashCode()) * 31) + this.component3.hashCode()) * 31) + this.getAsAtTimestamp.hashCode()) * 31) + Boolean.hashCode(this.equals);
        int i4 = toString + 69;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CurrencyConfig(currencyPrecision=" + this.component2 + ", roundingMode=" + this.ArtificialStackFrames + ", exchangeRatio=" + this.component4 + ", isDefault=" + this.getRequestBeneficiariesState + ", description=" + this.copy + ", currencyId=" + this.component1 + ", currencyCode=" + this.copydefault + ", currencyUnit=" + this.ShareDataUIState + ", status=" + this.getShareableDataState + ", currencyInfoLocalizationVO=" + this.component3 + ", i18nCurrencyInfoLocalization=" + this.getAsAtTimestamp + ", isChecked=" + this.equals + ")";
        int i2 = toString + 7;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
