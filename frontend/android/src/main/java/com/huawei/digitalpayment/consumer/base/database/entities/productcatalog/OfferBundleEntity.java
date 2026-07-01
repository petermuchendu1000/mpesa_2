package com.huawei.digitalpayment.consumer.base.database.entities.productcatalog;

import com.alibaba.ariver.kernel.RVParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0013HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J©\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006HÆ\u0001J\u0013\u0010=\u001a\u00020\u00132\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\t\u0010@\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0016\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001c¨\u0006A"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/productcatalog/OfferBundleEntity;", "", "offerId", "", "recordNumber", "offerName", "", "offerType", "offerPrice", "bongaPrice", "ussdName", "tunukiwaRate", "", "neoRateId", "rateMultiplier", "tunukiwaLocationOffer", "tunukiwaSalutation", "flashMsg", "autoRenewable", "", "appOfferName", RVParams.SESSION_ID, "<init>", "(IILjava/lang/String;IIILjava/lang/String;DDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getOfferId", "()I", "getRecordNumber", "getOfferName", "()Ljava/lang/String;", "getOfferType", "getOfferPrice", "getBongaPrice", "getUssdName", "getTunukiwaRate", "()D", "getNeoRateId", "getRateMultiplier", "getTunukiwaLocationOffer", "getTunukiwaSalutation", "getFlashMsg", "getAutoRenewable", "()Z", "getAppOfferName", "getSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "equals", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfferBundleEntity {
    private static int accessartificialFrame = 0;
    private static int getARTIFICIAL_FRAME_PACKAGE_NAME = 1;
    private final double ArtificialStackFrames;
    private final String ShareDataUIState;
    private final String component1;
    private final double component2;
    private final int component3;
    private final int component4;
    private final int copy;
    private final boolean copydefault;
    private final String coroutineBoundary;
    private final int equals;
    private final double getAsAtTimestamp;
    private final String getRequestBeneficiariesState;
    private final String getShareableDataState;
    private final int getSponsorBeneficiariesState;
    private final String hashCode;
    private final String toString;

    public OfferBundleEntity(int i, int i2, String str, int i3, int i4, int i5, String str2, double d2, double d3, double d4, String str3, String str4, String str5, boolean z, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.equals = i;
        this.getSponsorBeneficiariesState = i2;
        this.getRequestBeneficiariesState = str;
        this.copy = i3;
        this.component4 = i4;
        this.component3 = i5;
        this.coroutineBoundary = str2;
        this.ArtificialStackFrames = d2;
        this.component2 = d3;
        this.getAsAtTimestamp = d4;
        this.getShareableDataState = str3;
        this.toString = str4;
        this.ShareDataUIState = str5;
        this.copydefault = z;
        this.component1 = str6;
        this.hashCode = str7;
    }

    public final int getOfferId() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 49;
        int i3 = i2 % 128;
        accessartificialFrame = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.equals;
        int i5 = i3 + 41;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int getRecordNumber() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 89;
        accessartificialFrame = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.getSponsorBeneficiariesState;
        int i6 = i2 + 77;
        accessartificialFrame = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 48 / 0;
        }
        return i5;
    }

    public final String getOfferName() {
        String str;
        int i = 2 % 2;
        int i2 = accessartificialFrame;
        int i3 = i2 + 95;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.getRequestBeneficiariesState;
            int i4 = 66 / 0;
        } else {
            str = this.getRequestBeneficiariesState;
        }
        int i5 = i2 + 17;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getOfferType() {
        int i;
        int i2 = 2 % 2;
        int i3 = accessartificialFrame + 27;
        int i4 = i3 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4;
        if (i3 % 2 == 0) {
            i = this.copy;
            int i5 = 17 / 0;
        } else {
            i = this.copy;
        }
        int i6 = i4 + 83;
        accessartificialFrame = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public final int getOfferPrice() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 117;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.component4;
        if (i3 != 0) {
            int i5 = 24 / 0;
        }
        return i4;
    }

    public final int getBongaPrice() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 13;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUssdName() {
        String str;
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 67;
        accessartificialFrame = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.coroutineBoundary;
            int i4 = 9 / 0;
        } else {
            str = this.coroutineBoundary;
        }
        int i5 = i2 + 43;
        accessartificialFrame = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final double getTunukiwaRate() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 111;
        accessartificialFrame = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.ArtificialStackFrames;
        int i5 = i2 + 79;
        accessartificialFrame = i5 % 128;
        if (i5 % 2 == 0) {
            return d2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double getNeoRateId() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 93;
        accessartificialFrame = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        double d2 = this.component2;
        int i4 = i2 + 39;
        accessartificialFrame = i4 % 128;
        int i5 = i4 % 2;
        return d2;
    }

    public final double getRateMultiplier() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 65;
        accessartificialFrame = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTunukiwaLocationOffer() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 7;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getShareableDataState;
        }
        throw null;
    }

    public final String getTunukiwaSalutation() {
        int i = 2 % 2;
        int i2 = accessartificialFrame;
        int i3 = i2 + 29;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        String str = this.toString;
        int i5 = i2 + 13;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getFlashMsg() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 57;
        accessartificialFrame = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 57;
        accessartificialFrame = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getAutoRenewable() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 115;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.copydefault;
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return z;
    }

    public final String getAppOfferName() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 53;
        accessartificialFrame = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSessionId() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 121;
        accessartificialFrame = i2 % 128;
        if (i2 % 2 == 0) {
            return this.hashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static OfferBundleEntity copy$default(OfferBundleEntity offerBundleEntity, int i, int i2, String str, int i3, int i4, int i5, String str2, double d2, double d3, double d4, String str3, String str4, String str5, boolean z, String str6, String str7, int i6, Object obj) {
        int i7;
        String str8;
        double d5;
        String str9;
        String str10;
        String str11;
        String str12;
        boolean z2;
        int i8 = 2 % 2;
        int i9 = (i6 & 1) != 0 ? offerBundleEntity.equals : i;
        int i10 = (i6 & 2) != 0 ? offerBundleEntity.getSponsorBeneficiariesState : i2;
        String str13 = (i6 & 4) != 0 ? offerBundleEntity.getRequestBeneficiariesState : str;
        int i11 = (i6 & 8) != 0 ? offerBundleEntity.copy : i3;
        int i12 = (i6 & 16) != 0 ? offerBundleEntity.component4 : i4;
        Object obj2 = null;
        if ((i6 & 32) != 0) {
            int i13 = getARTIFICIAL_FRAME_PACKAGE_NAME + 69;
            accessartificialFrame = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = offerBundleEntity.component3;
                obj2.hashCode();
                throw null;
            }
            i7 = offerBundleEntity.component3;
        } else {
            i7 = i5;
        }
        if ((i6 & 64) != 0) {
            int i15 = getARTIFICIAL_FRAME_PACKAGE_NAME + 79;
            accessartificialFrame = i15 % 128;
            if (i15 % 2 != 0) {
                String str14 = offerBundleEntity.coroutineBoundary;
                throw null;
            }
            str8 = offerBundleEntity.coroutineBoundary;
        } else {
            str8 = str2;
        }
        double d6 = (i6 & 128) != 0 ? offerBundleEntity.ArtificialStackFrames : d2;
        double d7 = (i6 & 256) != 0 ? offerBundleEntity.component2 : d3;
        double d8 = (i6 & 512) != 0 ? offerBundleEntity.getAsAtTimestamp : d4;
        if ((i6 & 1024) != 0) {
            int i16 = accessartificialFrame + 21;
            d5 = d8;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i16 % 128;
            int i17 = i16 % 2;
            str9 = offerBundleEntity.getShareableDataState;
        } else {
            d5 = d8;
            str9 = str3;
        }
        String str15 = (i6 & 2048) != 0 ? offerBundleEntity.toString : str4;
        if ((i6 & 4096) != 0) {
            String str16 = offerBundleEntity.ShareDataUIState;
            int i18 = accessartificialFrame + 107;
            str10 = str15;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i18 % 128;
            int i19 = i18 % 2;
            str11 = str16;
        } else {
            str10 = str15;
            str11 = str5;
        }
        if ((i6 & 8192) != 0) {
            int i20 = getARTIFICIAL_FRAME_PACKAGE_NAME + 83;
            str12 = str11;
            accessartificialFrame = i20 % 128;
            int i21 = i20 % 2;
            z2 = offerBundleEntity.copydefault;
        } else {
            str12 = str11;
            z2 = z;
        }
        return offerBundleEntity.copy(i9, i10, str13, i11, i12, i7, str8, d6, d7, d5, str9, str10, str12, z2, (i6 & 16384) != 0 ? offerBundleEntity.component1 : str6, (i6 & 32768) != 0 ? offerBundleEntity.hashCode : str7);
    }

    public final int component1() {
        int i;
        int i2 = 2 % 2;
        int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 125;
        int i4 = i3 % 128;
        accessartificialFrame = i4;
        if (i3 % 2 != 0) {
            i = this.equals;
            int i5 = 23 / 0;
        } else {
            i = this.equals;
        }
        int i6 = i4 + 83;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final double component10() {
        int i = 2 % 2;
        int i2 = accessartificialFrame;
        int i3 = i2 + 83;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.getAsAtTimestamp;
        int i5 = i2 + 53;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 15;
        accessartificialFrame = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getShareableDataState;
        int i5 = i2 + 31;
        accessartificialFrame = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 3;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        String str = this.toString;
        if (i3 != 0) {
            int i4 = 21 / 0;
        }
        return str;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 33;
        int i3 = i2 % 128;
        accessartificialFrame = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 5;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final boolean component14() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 113;
        int i3 = i2 % 128;
        accessartificialFrame = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 69;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = accessartificialFrame;
        int i3 = i2 + 55;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 51;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 45;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        String str = this.hashCode;
        int i5 = i3 + 119;
        accessartificialFrame = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 87;
        int i3 = i2 % 128;
        accessartificialFrame = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.getSponsorBeneficiariesState;
        int i5 = i3 + 39;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 3;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i3 + 57;
        accessartificialFrame = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
        return str;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 89;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.copy;
        int i5 = i3 + 31;
        accessartificialFrame = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return i4;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = accessartificialFrame;
        int i3 = i2 + 79;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component4;
        int i6 = i2 + 95;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component6() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 93;
        accessartificialFrame = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 5;
        int i3 = i2 % 128;
        accessartificialFrame = i3;
        int i4 = i2 % 2;
        String str = this.coroutineBoundary;
        int i5 = i3 + 9;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final double component8() {
        int i = 2 % 2;
        int i2 = accessartificialFrame;
        int i3 = i2 + 73;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.ArtificialStackFrames;
        int i5 = i2 + 85;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 != 0) {
            return d2;
        }
        throw null;
    }

    public final double component9() {
        int i = 2 % 2;
        int i2 = accessartificialFrame + 53;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        double d2 = this.component2;
        int i5 = i3 + 55;
        accessartificialFrame = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final OfferBundleEntity copy(int offerId, int recordNumber, String offerName, int offerType, int offerPrice, int bongaPrice, String ussdName, double tunukiwaRate, double neoRateId, double rateMultiplier, String tunukiwaLocationOffer, String tunukiwaSalutation, String flashMsg, boolean autoRenewable, String appOfferName, String sessionId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(offerName, "");
        Intrinsics.checkNotNullParameter(ussdName, "");
        Intrinsics.checkNotNullParameter(tunukiwaLocationOffer, "");
        Intrinsics.checkNotNullParameter(tunukiwaSalutation, "");
        Intrinsics.checkNotNullParameter(flashMsg, "");
        Intrinsics.checkNotNullParameter(appOfferName, "");
        Intrinsics.checkNotNullParameter(sessionId, "");
        OfferBundleEntity offerBundleEntity = new OfferBundleEntity(offerId, recordNumber, offerName, offerType, offerPrice, bongaPrice, ussdName, tunukiwaRate, neoRateId, rateMultiplier, tunukiwaLocationOffer, tunukiwaSalutation, flashMsg, autoRenewable, appOfferName, sessionId);
        int i2 = accessartificialFrame + 121;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            return offerBundleEntity;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r8 instanceof com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity) == true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 59;
        com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.accessartificialFrame = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        r8 = (com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r7.equals == r8.equals) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r7.getSponsorBeneficiariesState == r8.getSponsorBeneficiariesState) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.getRequestBeneficiariesState, r8.getRequestBeneficiariesState) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r8 = com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.accessartificialFrame + 55;
        com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.getARTIFICIAL_FRAME_PACKAGE_NAME = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r7.copy == r8.copy) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        r8 = com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.getARTIFICIAL_FRAME_PACKAGE_NAME + 63;
        com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.accessartificialFrame = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r7.component4 == r8.component4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r7.component3 == r8.component3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0072, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.coroutineBoundary, r8.coroutineBoundary) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        r8 = com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.getARTIFICIAL_FRAME_PACKAGE_NAME + 119;
        com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.accessartificialFrame = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (java.lang.Double.compare(r7.ArtificialStackFrames, r8.ArtificialStackFrames) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        if (java.lang.Double.compare(r7.component2, r8.component2) == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        if (java.lang.Double.compare(r7.getAsAtTimestamp, r8.getAsAtTimestamp) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r7.getShareableDataState, r8.getShareableDataState)) == true) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.toString, r8.toString) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00bd, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.ShareDataUIState, r8.ShareDataUIState) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00bf, code lost:
    
        r8 = com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.accessartificialFrame;
        r1 = r8 + 27;
        com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.getARTIFICIAL_FRAME_PACKAGE_NAME = r1 % 128;
        r1 = r1 % 2;
        r8 = r8 + 29;
        com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.getARTIFICIAL_FRAME_PACKAGE_NAME = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
    
        if ((r8 % 2) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
    
        if (r7.copydefault == r8.copydefault) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00da, code lost:
    
        r8 = com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.getARTIFICIAL_FRAME_PACKAGE_NAME + 109;
        com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.accessartificialFrame = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ec, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.component1, r8.component1) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ee, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f7, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r7.hashCode, r8.hashCode) == true) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fb, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r7 == r8) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.OfferBundleEntity.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 119;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((((Integer.hashCode(this.equals) * 31) + Integer.hashCode(this.getSponsorBeneficiariesState)) * 31) + this.getRequestBeneficiariesState.hashCode()) * 31) + Integer.hashCode(this.copy)) * 31) + Integer.hashCode(this.component4)) * 31) + Integer.hashCode(this.component3)) * 31) + this.coroutineBoundary.hashCode()) * 31) + Double.hashCode(this.ArtificialStackFrames)) * 31) + Double.hashCode(this.component2)) * 31) + Double.hashCode(this.getAsAtTimestamp)) * 31) + this.getShareableDataState.hashCode()) * 31) + this.toString.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.component1.hashCode()) * 31) + this.hashCode.hashCode();
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 73;
        accessartificialFrame = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OfferBundleEntity(offerId=" + this.equals + ", recordNumber=" + this.getSponsorBeneficiariesState + ", offerName=" + this.getRequestBeneficiariesState + ", offerType=" + this.copy + ", offerPrice=" + this.component4 + ", bongaPrice=" + this.component3 + ", ussdName=" + this.coroutineBoundary + ", tunukiwaRate=" + this.ArtificialStackFrames + ", neoRateId=" + this.component2 + ", rateMultiplier=" + this.getAsAtTimestamp + ", tunukiwaLocationOffer=" + this.getShareableDataState + ", tunukiwaSalutation=" + this.toString + ", flashMsg=" + this.ShareDataUIState + ", autoRenewable=" + this.copydefault + ", appOfferName=" + this.component1 + ", sessionId=" + this.hashCode + ")";
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 101;
        accessartificialFrame = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
