package com.huawei.digitalpayment.consumer.sfcui.gsmBalances;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b5\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÇ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010;\u001a\u00020<H×\u0001J\t\u0010=\u001a\u00020\u0003H×\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006>"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/DataBundleTypes;", "", "dataBundleExpiry", "", "dataBundleNoExpiry", "tunukiwaDataBundle", "postPayData", "freshFridayData", "tiktokHourlyData", "tiktokDailyData", "bongaBalance", "unlimitedOffer1", "unlimitedOffer2", "emeraldPostPayData", "postpayEmeraldData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDataBundleExpiry", "()Ljava/lang/String;", "setDataBundleExpiry", "(Ljava/lang/String;)V", "getDataBundleNoExpiry", "setDataBundleNoExpiry", "getTunukiwaDataBundle", "setTunukiwaDataBundle", "getPostPayData", "setPostPayData", "getFreshFridayData", "setFreshFridayData", "getTiktokHourlyData", "setTiktokHourlyData", "getTiktokDailyData", "setTiktokDailyData", "getBongaBalance", "setBongaBalance", "getUnlimitedOffer1", "setUnlimitedOffer1", "getUnlimitedOffer2", "setUnlimitedOffer2", "getEmeraldPostPayData", "setEmeraldPostPayData", "getPostpayEmeraldData", "setPostpayEmeraldData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataBundleTypes {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 0;
    private static int coroutineBoundary = 1;
    private static int getSponsorBeneficiariesState = 0;
    private static int toString = 47 % 128;

    @SerializedName("dataBundleExpiry")
    private String ShareDataUIState;

    @SerializedName("dataBundleNoExpiry")
    private String component1;

    @SerializedName("emeraldPostPayData")
    private String component2;

    @SerializedName("bongaBalance")
    private String component3;

    @SerializedName("postPayData")
    private String component4;

    @SerializedName("tunukiwaDataBundle")
    private String copy;

    @SerializedName("freshFridayData")
    private String copydefault;

    @SerializedName("tiktokDailyData")
    private String equals;

    @SerializedName("postpayEmeraldData")
    private String getAsAtTimestamp;

    @SerializedName("tiktokHourlyData")
    private String getRequestBeneficiariesState;

    @SerializedName("unlimitedOffer2")
    private String getShareableDataState;

    @SerializedName("unlimitedOffer1")
    private String hashCode;

    public DataBundleTypes(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.ShareDataUIState = str;
        this.component1 = str2;
        this.copy = str3;
        this.component4 = str4;
        this.copydefault = str5;
        this.getRequestBeneficiariesState = str6;
        this.equals = str7;
        this.component3 = str8;
        this.hashCode = str9;
        this.getShareableDataState = str10;
        this.component2 = str11;
        this.getAsAtTimestamp = str12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DataBundleTypes(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        if ((i & 1) != 0) {
            int i2 = coroutineBoundary + 111;
            ArtificialStackFrames = i2 % 128;
            str13 = "C_4500";
            if (i2 % 2 != 0) {
                int i3 = 14 / 0;
            }
        } else {
            str13 = str;
        }
        String str18 = (i & 2) != 0 ? "C_2551" : str2;
        String str19 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            str14 = "C_5710";
            int i4 = 2 % 2;
        } else {
            str14 = str4;
        }
        if ((i & 16) != 0) {
            str15 = "C_2574";
            int i5 = 2 % 2;
        } else {
            str15 = str5;
        }
        if ((i & 32) != 0) {
            int i6 = ArtificialStackFrames + 123;
            coroutineBoundary = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            int i7 = 2 % 2;
            str16 = "C_1081";
        } else {
            str16 = str6;
        }
        String str20 = (i & 64) != 0 ? "C_1059" : str7;
        String str21 = (i & 128) != 0 ? "C_POINTS_FUND_4600" : str8;
        if ((i & 256) != 0) {
            int i8 = ArtificialStackFrames + 53;
            coroutineBoundary = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str17 = "C_5799";
        } else {
            str17 = str9;
        }
        this(str13, str18, str19, str14, str15, str16, str20, str21, str17, (i & 512) != 0 ? "C_5805" : str10, (i & 1024) != 0 ? "C_1087" : str11, (i & 2048) != 0 ? "C_1092" : str12);
    }

    public final String getDataBundleExpiry() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 21;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 81;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return str;
    }

    public final void setDataBundleExpiry(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 107;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.ShareDataUIState = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.ShareDataUIState = str;
        int i3 = ArtificialStackFrames + 7;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getDataBundleNoExpiry() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 55;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 21;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setDataBundleNoExpiry(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 57;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.component1 = str;
        int i4 = ArtificialStackFrames + 121;
        coroutineBoundary = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
    }

    public final String getTunukiwaDataBundle() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 21;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 117;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setTunukiwaDataBundle(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 117;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.copy = str;
        int i4 = ArtificialStackFrames + 49;
        coroutineBoundary = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getPostPayData() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 3;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.component4;
        int i4 = i3 + 29;
        coroutineBoundary = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setPostPayData(String str) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 43;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.component4 = str;
        int i4 = coroutineBoundary + 29;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getFreshFridayData() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 51;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final void setFreshFridayData(String str) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 13;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            int i3 = 23 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }
        int i4 = coroutineBoundary + 15;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
    }

    public final String getTiktokHourlyData() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 107;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i3 + 25;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return str;
    }

    public final void setTiktokHourlyData(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 37;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.getRequestBeneficiariesState = str;
        int i4 = ArtificialStackFrames + 59;
        coroutineBoundary = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTiktokDailyData() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 77;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 97;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setTiktokDailyData(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 19;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.equals = str;
        int i4 = coroutineBoundary + 79;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getBongaBalance() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 13;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 103;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setBongaBalance(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 77;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = str;
        int i4 = coroutineBoundary + 11;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUnlimitedOffer1() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 39;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        String str = this.hashCode;
        int i5 = i2 + 17;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setUnlimitedOffer1(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 63;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.hashCode = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.hashCode = str;
        int i3 = coroutineBoundary + 33;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 43 / 0;
        }
    }

    public final String getUnlimitedOffer2() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 11;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getShareableDataState;
        int i5 = i2 + 35;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return str;
    }

    public final void setUnlimitedOffer2(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 41;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.getShareableDataState = str;
        int i4 = ArtificialStackFrames + 23;
        coroutineBoundary = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String getEmeraldPostPayData() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 55;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 29;
        coroutineBoundary = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setEmeraldPostPayData(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 37;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.component2 = str;
        int i3 = ArtificialStackFrames + 31;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getPostpayEmeraldData() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 37;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.getAsAtTimestamp;
        int i4 = i2 + 35;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setPostpayEmeraldData(String str) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 33;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.getAsAtTimestamp = str;
        int i4 = coroutineBoundary + 73;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (47 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DataBundleTypes() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static DataBundleTypes copy$default(DataBundleTypes dataBundleTypes, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, Object obj) {
        String str13;
        String str14;
        String str15;
        int i2 = 2 % 2;
        String str16 = (i & 1) != 0 ? dataBundleTypes.ShareDataUIState : str;
        String str17 = (i & 2) != 0 ? dataBundleTypes.component1 : str2;
        String str18 = (i & 4) != 0 ? dataBundleTypes.copy : str3;
        if ((i & 8) != 0) {
            int i3 = ArtificialStackFrames + 123;
            coroutineBoundary = i3 % 128;
            int i4 = i3 % 2;
            str13 = dataBundleTypes.component4;
        } else {
            str13 = str4;
        }
        Object obj2 = null;
        if ((i & 16) != 0) {
            int i5 = ArtificialStackFrames + 113;
            coroutineBoundary = i5 % 128;
            if (i5 % 2 == 0) {
                String str19 = dataBundleTypes.copydefault;
                throw null;
            }
            str14 = dataBundleTypes.copydefault;
        } else {
            str14 = str5;
        }
        String str20 = (i & 32) != 0 ? dataBundleTypes.getRequestBeneficiariesState : str6;
        if ((i & 64) != 0) {
            int i6 = ArtificialStackFrames + 111;
            coroutineBoundary = i6 % 128;
            if (i6 % 2 == 0) {
                String str21 = dataBundleTypes.equals;
                obj2.hashCode();
                throw null;
            }
            str15 = dataBundleTypes.equals;
        } else {
            str15 = str7;
        }
        return dataBundleTypes.copy(str16, str17, str18, str13, str14, str20, str15, (i & 128) != 0 ? dataBundleTypes.component3 : str8, (i & 256) != 0 ? dataBundleTypes.hashCode : str9, (i & 512) != 0 ? dataBundleTypes.getShareableDataState : str10, (i & 1024) != 0 ? dataBundleTypes.component2 : str11, (i & 2048) != 0 ? dataBundleTypes.getAsAtTimestamp : str12);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 101;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 93;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        String str;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 47;
        coroutineBoundary = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.getShareableDataState;
            int i4 = 18 / 0;
        } else {
            str = this.getShareableDataState;
        }
        int i5 = i2 + 121;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 97;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 3;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 123;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 53;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 51;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 67;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copy;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 33;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component4;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 65;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 91;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 109;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i2 + 95;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 113;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 57;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 87;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 35;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 35 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 35;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        String str = this.hashCode;
        int i5 = i2 + 57;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final DataBundleTypes copy(String dataBundleExpiry, String dataBundleNoExpiry, String tunukiwaDataBundle, String postPayData, String freshFridayData, String tiktokHourlyData, String tiktokDailyData, String bongaBalance, String unlimitedOffer1, String unlimitedOffer2, String emeraldPostPayData, String postpayEmeraldData) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dataBundleExpiry, "");
        Intrinsics.checkNotNullParameter(dataBundleNoExpiry, "");
        Intrinsics.checkNotNullParameter(tunukiwaDataBundle, "");
        Intrinsics.checkNotNullParameter(postPayData, "");
        Intrinsics.checkNotNullParameter(freshFridayData, "");
        Intrinsics.checkNotNullParameter(tiktokHourlyData, "");
        Intrinsics.checkNotNullParameter(tiktokDailyData, "");
        Intrinsics.checkNotNullParameter(bongaBalance, "");
        Intrinsics.checkNotNullParameter(unlimitedOffer1, "");
        Intrinsics.checkNotNullParameter(unlimitedOffer2, "");
        Intrinsics.checkNotNullParameter(emeraldPostPayData, "");
        Intrinsics.checkNotNullParameter(postpayEmeraldData, "");
        DataBundleTypes dataBundleTypes = new DataBundleTypes(dataBundleExpiry, dataBundleNoExpiry, tunukiwaDataBundle, postPayData, freshFridayData, tiktokHourlyData, tiktokDailyData, bongaBalance, unlimitedOffer1, unlimitedOffer2, emeraldPostPayData, postpayEmeraldData);
        int i2 = ArtificialStackFrames + 99;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        return dataBundleTypes;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 61;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataBundleTypes)) {
            return false;
        }
        DataBundleTypes dataBundleTypes = (DataBundleTypes) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, dataBundleTypes.ShareDataUIState) || !Intrinsics.areEqual(this.component1, dataBundleTypes.component1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.copy, dataBundleTypes.copy)) {
            int i4 = coroutineBoundary + 115;
            ArtificialStackFrames = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.component4, dataBundleTypes.component4) || !Intrinsics.areEqual(this.copydefault, dataBundleTypes.copydefault) || !Intrinsics.areEqual(this.getRequestBeneficiariesState, dataBundleTypes.getRequestBeneficiariesState) || !Intrinsics.areEqual(this.equals, dataBundleTypes.equals)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component3, dataBundleTypes.component3)) {
            return !(Intrinsics.areEqual(this.hashCode, dataBundleTypes.hashCode) ^ true) && Intrinsics.areEqual(this.getShareableDataState, dataBundleTypes.getShareableDataState) && Intrinsics.areEqual(this.component2, dataBundleTypes.component2) && Intrinsics.areEqual(this.getAsAtTimestamp, dataBundleTypes.getAsAtTimestamp);
        }
        int i5 = ArtificialStackFrames + 21;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 1;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((this.ShareDataUIState.hashCode() * 31) + this.component1.hashCode()) * 31) + this.copy.hashCode()) * 31) + this.component4.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.getRequestBeneficiariesState.hashCode()) * 31) + this.equals.hashCode()) * 31) + this.component3.hashCode()) * 31) + this.hashCode.hashCode()) * 31) + this.getShareableDataState.hashCode()) * 31) + this.component2.hashCode()) * 31) + this.getAsAtTimestamp.hashCode();
        int i4 = ArtificialStackFrames + 107;
        coroutineBoundary = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DataBundleTypes(dataBundleExpiry=" + this.ShareDataUIState + ", dataBundleNoExpiry=" + this.component1 + ", tunukiwaDataBundle=" + this.copy + ", postPayData=" + this.component4 + ", freshFridayData=" + this.copydefault + ", tiktokHourlyData=" + this.getRequestBeneficiariesState + ", tiktokDailyData=" + this.equals + ", bongaBalance=" + this.component3 + ", unlimitedOffer1=" + this.hashCode + ", unlimitedOffer2=" + this.getShareableDataState + ", emeraldPostPayData=" + this.component2 + ", postpayEmeraldData=" + this.getAsAtTimestamp + ")";
        int i2 = ArtificialStackFrames + 29;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
