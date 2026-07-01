package com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J½\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00107\u001a\u000208H×\u0001J\t\u00109\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u0006:"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ESimQueryBody;", "", "accountId", "", "area", "assetId", "customerAccountId", "customerDocType", "description", "nonSafaricomPhone", "openedDate", "owner", b.i, "serviceRequestId", "slaDate", "status", "subArea", "thirdLevelArea", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getArea", "getAssetId", "getCustomerAccountId", "getCustomerDocType", "getDescription", "getNonSafaricomPhone", "getOpenedDate", "getOwner", "getResolution", "getServiceRequestId", "getSlaDate", "getStatus", "getSubArea", "getThirdLevelArea", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ESimQueryBody {
    public static final int $stable = 0;
    private static int accessartificialFrame = 0;
    private static int coroutineBoundary = 1;
    private static int coroutineCreation = 1;
    private static int getARTIFICIAL_FRAME_PACKAGE_NAME;

    @SerializedName("subArea")
    private final String ArtificialStackFrames;

    @SerializedName("accountId")
    private final String ShareDataUIState;

    @SerializedName("customerDocType")
    private final String component1;

    @SerializedName("area")
    private final String component2;

    @SerializedName("assetId")
    private final String component3;

    @SerializedName("description")
    private final String component4;

    @SerializedName(b.i)
    private final String copy;

    @SerializedName("customerAccountId")
    private final String copydefault;

    @SerializedName("nonSafaricomPhone")
    private final String equals;

    @SerializedName("openedDate")
    private final String getAsAtTimestamp;

    @SerializedName("owner")
    private final String getRequestBeneficiariesState;

    @SerializedName("thirdLevelArea")
    private final String getShareableDataState;

    @SerializedName("status")
    private final String getSponsorBeneficiariesState;

    @SerializedName("serviceRequestId")
    private final String hashCode;

    @SerializedName("slaDate")
    private final String toString;

    public ESimQueryBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.ShareDataUIState = str;
        this.component2 = str2;
        this.component3 = str3;
        this.copydefault = str4;
        this.component1 = str5;
        this.component4 = str6;
        this.equals = str7;
        this.getAsAtTimestamp = str8;
        this.getRequestBeneficiariesState = str9;
        this.copy = str10;
        this.hashCode = str11;
        this.toString = str12;
        this.getSponsorBeneficiariesState = str13;
        this.ArtificialStackFrames = str14;
        this.getShareableDataState = str15;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 113;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 83;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return str;
    }

    public final String getArea() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 85;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAssetId() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 25;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 23;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCustomerAccountId() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 115;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 113;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return str;
    }

    public final String getCustomerDocType() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 85;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 49;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 85;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component4;
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return str;
    }

    public final String getNonSafaricomPhone() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 19;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.equals;
        int i4 = i2 + 65;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getOpenedDate() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 9;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 113;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOwner() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 11;
        coroutineBoundary = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.getRequestBeneficiariesState;
        int i4 = i2 + 95;
        coroutineBoundary = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getResolution() {
        String str;
        int i = 2 % 2;
        int i2 = coroutineBoundary + 51;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        if (i2 % 2 != 0) {
            str = this.copy;
            int i4 = 47 / 0;
        } else {
            str = this.copy;
        }
        int i5 = i3 + 71;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getServiceRequestId() {
        String str;
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 13;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.hashCode;
            int i4 = 78 / 0;
        } else {
            str = this.hashCode;
        }
        int i5 = i2 + 123;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSlaDate() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 125;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        String str = this.toString;
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return str;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 59;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        String str = this.getSponsorBeneficiariesState;
        int i5 = i3 + 41;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSubArea() {
        String str;
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 63;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        if (i2 % 2 == 0) {
            str = this.ArtificialStackFrames;
            int i4 = 4 / 0;
        } else {
            str = this.ArtificialStackFrames;
        }
        int i5 = i3 + 89;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getThirdLevelArea() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 121;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getShareableDataState;
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        return str;
    }

    static {
        int i = 1 + 51;
        accessartificialFrame = i % 128;
        int i2 = i % 2;
    }

    public static ESimQueryBody copy$default(ESimQueryBody eSimQueryBody, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i, Object obj) {
        String str16;
        String str17;
        String str18;
        String str19;
        int i2 = 2 % 2;
        int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i4 = i3 + 89;
        coroutineBoundary = i4 % 128;
        String str20 = (i4 % 2 == 0 || (i & 1) == 0) ? str : eSimQueryBody.ShareDataUIState;
        if ((i & 2) != 0) {
            int i5 = i3 + 31;
            coroutineBoundary = i5 % 128;
            int i6 = i5 % 2;
            str16 = eSimQueryBody.component2;
        } else {
            str16 = str2;
        }
        String str21 = (i & 4) != 0 ? eSimQueryBody.component3 : str3;
        String str22 = (i & 8) != 0 ? eSimQueryBody.copydefault : str4;
        String str23 = (i & 16) != 0 ? eSimQueryBody.component1 : str5;
        String str24 = (i & 32) != 0 ? eSimQueryBody.component4 : str6;
        if ((i & 64) != 0) {
            int i7 = i3 + 61;
            int i8 = i7 % 128;
            coroutineBoundary = i8;
            int i9 = i7 % 2;
            str17 = eSimQueryBody.equals;
            int i10 = i8 + 79;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 4 % 5;
            }
        } else {
            str17 = str7;
        }
        String str25 = (i & 128) != 0 ? eSimQueryBody.getAsAtTimestamp : str8;
        String str26 = (i & 256) != 0 ? eSimQueryBody.getRequestBeneficiariesState : str9;
        String str27 = (i & 512) != 0 ? eSimQueryBody.copy : str10;
        String str28 = (i & 1024) != 0 ? eSimQueryBody.hashCode : str11;
        if ((i & 2048) != 0) {
            int i12 = coroutineBoundary + 113;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i12 % 128;
            int i13 = i12 % 2;
            str18 = eSimQueryBody.toString;
        } else {
            str18 = str12;
        }
        if ((i & 4096) != 0) {
            String str29 = eSimQueryBody.getSponsorBeneficiariesState;
            int i14 = getARTIFICIAL_FRAME_PACKAGE_NAME + 97;
            str19 = str29;
            coroutineBoundary = i14 % 128;
            int i15 = i14 % 2;
        } else {
            str19 = str13;
        }
        return eSimQueryBody.copy(str20, str16, str21, str22, str23, str24, str17, str25, str26, str27, str28, str18, str19, (i & 8192) != 0 ? eSimQueryBody.ArtificialStackFrames : str14, (i & 16384) != 0 ? eSimQueryBody.getShareableDataState : str15);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 125;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 87;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component10() {
        String str;
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 77;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        if (i2 % 2 == 0) {
            str = this.copy;
            int i4 = 18 / 0;
        } else {
            str = this.copy;
        }
        int i5 = i3 + 59;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 63;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            return this.hashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 115;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            return this.toString;
        }
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 49;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.getSponsorBeneficiariesState;
        int i4 = i3 + 47;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 113;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ArtificialStackFrames;
        int i5 = i2 + 49;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 31;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getShareableDataState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 39;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 103;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 105;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component3;
        int i4 = i3 + 73;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 27;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        if (i2 % 2 == 0) {
            str = this.copydefault;
            int i4 = 98 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i3 + 87;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 25;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 89;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component4;
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        return str;
    }

    public final String component7() {
        String str;
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 47;
        coroutineBoundary = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.equals;
            int i4 = 25 / 0;
        } else {
            str = this.equals;
        }
        int i5 = i2 + 31;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 119;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.getAsAtTimestamp;
        int i4 = i3 + 9;
        coroutineBoundary = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = coroutineBoundary;
        int i3 = i2 + 81;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i2 + 51;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ESimQueryBody copy(String accountId, String area, String assetId, String customerAccountId, String customerDocType, String description, String nonSafaricomPhone, String openedDate, String owner, String resolution, String serviceRequestId, String slaDate, String status, String subArea, String thirdLevelArea) {
        int i = 2 % 2;
        ESimQueryBody eSimQueryBody = new ESimQueryBody(accountId, area, assetId, customerAccountId, customerDocType, description, nonSafaricomPhone, openedDate, owner, resolution, serviceRequestId, slaDate, status, subArea, thirdLevelArea);
        int i2 = coroutineBoundary + 119;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        return eSimQueryBody;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESimQueryBody)) {
            int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 63;
            int i3 = i2 % 128;
            coroutineBoundary = i3;
            boolean z = i2 % 2 == 0;
            int i4 = i3 + 85;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
        ESimQueryBody eSimQueryBody = (ESimQueryBody) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, eSimQueryBody.ShareDataUIState) || !Intrinsics.areEqual(this.component2, eSimQueryBody.component2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, eSimQueryBody.component3)) {
            int i6 = coroutineBoundary + 93;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, eSimQueryBody.copydefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, eSimQueryBody.component1)) {
            int i8 = getARTIFICIAL_FRAME_PACKAGE_NAME + 101;
            coroutineBoundary = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, eSimQueryBody.component4)) {
            int i10 = coroutineBoundary + 47;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.equals, eSimQueryBody.equals) || !Intrinsics.areEqual(this.getAsAtTimestamp, eSimQueryBody.getAsAtTimestamp)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, eSimQueryBody.getRequestBeneficiariesState)) {
            int i12 = getARTIFICIAL_FRAME_PACKAGE_NAME + 75;
            coroutineBoundary = i12 % 128;
            return i12 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.copy, eSimQueryBody.copy) || !Intrinsics.areEqual(this.hashCode, eSimQueryBody.hashCode) || !Intrinsics.areEqual(this.toString, eSimQueryBody.toString)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getSponsorBeneficiariesState, eSimQueryBody.getSponsorBeneficiariesState)) {
            int i13 = getARTIFICIAL_FRAME_PACKAGE_NAME + 99;
            coroutineBoundary = i13 % 128;
            if (i13 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.ArtificialStackFrames, eSimQueryBody.ArtificialStackFrames)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.getShareableDataState, eSimQueryBody.getShareableDataState))) {
            return true;
        }
        int i14 = coroutineBoundary + 45;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.ShareDataUIState;
        if (str == null) {
            int i2 = coroutineBoundary + 9;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.component2;
        if (str2 == null) {
            int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 121;
            coroutineBoundary = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.component3;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.copydefault;
        if (str4 == null) {
            int i6 = coroutineBoundary + 55;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i6 % 128;
            iHashCode3 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.component1;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.component4;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.equals;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.getAsAtTimestamp;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.getRequestBeneficiariesState;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.copy;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.hashCode;
        if (str11 == null) {
            int i7 = getARTIFICIAL_FRAME_PACKAGE_NAME + 105;
            coroutineBoundary = i7 % 128;
            int i8 = i7 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str11.hashCode();
        }
        String str12 = this.toString;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.getSponsorBeneficiariesState;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.ArtificialStackFrames;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.getShareableDataState;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode4) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str15 == null ? 0 : str15.hashCode());
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ESimQueryBody(accountId=" + this.ShareDataUIState + ", area=" + this.component2 + ", assetId=" + this.component3 + ", customerAccountId=" + this.copydefault + ", customerDocType=" + this.component1 + ", description=" + this.component4 + ", nonSafaricomPhone=" + this.equals + ", openedDate=" + this.getAsAtTimestamp + ", owner=" + this.getRequestBeneficiariesState + ", resolution=" + this.copy + ", serviceRequestId=" + this.hashCode + ", slaDate=" + this.toString + ", status=" + this.getSponsorBeneficiariesState + ", subArea=" + this.ArtificialStackFrames + ", thirdLevelArea=" + this.getShareableDataState + ")";
        int i2 = coroutineBoundary + 49;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
        return str;
    }
}
