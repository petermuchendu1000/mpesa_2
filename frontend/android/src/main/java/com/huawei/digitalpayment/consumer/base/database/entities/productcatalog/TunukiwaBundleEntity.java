package com.huawei.digitalpayment.consumer.base.database.entities.productcatalog;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\u0083\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\u0013\u0010/\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\fHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 ¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/productcatalog/TunukiwaBundleEntity;", "", "offerPriority", "", "offerId", "appText", "offerPrice", "offerType", "offerName", "paymentMethod", "ussdText", "offerJourney", "", "offerSegment", "defaultOffer", "", "globalOffer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZ)V", "getOfferPriority", "()Ljava/lang/String;", "getOfferId", "getAppText", "getOfferPrice", "getOfferType", "getOfferName", "getPaymentMethod", "getUssdText", "getOfferJourney", "()I", "getOfferSegment", "getDefaultOffer", "()Z", "getGlobalOffer", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TunukiwaBundleEntity {
    private static int ArtificialStackFrames = 0;
    private static int getSponsorBeneficiariesState = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final boolean component2;
    private final int component3;
    private final String component4;
    private final String copy;
    private final boolean copydefault;
    private final String equals;
    private final String getAsAtTimestamp;
    private final String getRequestBeneficiariesState;
    private final String getShareableDataState;
    private final String hashCode;

    public TunukiwaBundleEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.equals = str;
        this.ShareDataUIState = str2;
        this.component1 = str3;
        this.component4 = str4;
        this.copy = str5;
        this.getRequestBeneficiariesState = str6;
        this.getShareableDataState = str7;
        this.hashCode = str8;
        this.component3 = i;
        this.getAsAtTimestamp = str9;
        this.component2 = z;
        this.copydefault = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TunukiwaBundleEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i3;
        String str15;
        boolean z3;
        if ((i2 & 1) != 0) {
            int i4 = ArtificialStackFrames + 51;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            str10 = "";
        } else {
            str10 = str;
        }
        if ((i2 & 4) != 0) {
            int i6 = 2 % 2;
            str11 = "";
        } else {
            str11 = str3;
        }
        String str16 = (i2 & 8) != 0 ? "" : str4;
        Object obj = null;
        if ((i2 & 16) != 0) {
            int i7 = getSponsorBeneficiariesState + 33;
            ArtificialStackFrames = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str12 = "";
        } else {
            str12 = str5;
        }
        String str17 = (i2 & 32) != 0 ? "" : str6;
        if ((i2 & 64) != 0) {
            int i8 = ArtificialStackFrames + 121;
            getSponsorBeneficiariesState = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 78 / 0;
            }
            str13 = "";
        } else {
            str13 = str7;
        }
        if ((i2 & 128) != 0) {
            int i10 = getSponsorBeneficiariesState + 75;
            ArtificialStackFrames = i10 % 128;
            if (i10 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i11 = 2 % 2;
            str14 = "";
        } else {
            str14 = str8;
        }
        if ((i2 & 256) != 0) {
            int i12 = 2 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 512) != 0) {
            int i13 = 2 % 2;
            str15 = null;
        } else {
            str15 = str9;
        }
        boolean z4 = (i2 & 1024) != 0 ? false : z;
        if ((i2 & 2048) != 0) {
            int i14 = getSponsorBeneficiariesState + 27;
            ArtificialStackFrames = i14 % 128;
            int i15 = i14 % 2;
            z3 = false;
        } else {
            z3 = z2;
        }
        this(str10, str2, str11, str16, str12, str17, str13, str14, i3, str15, z4, z3);
    }

    public final String getOfferPriority() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 77;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.equals;
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return str;
    }

    public final String getOfferId() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 49;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 95;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAppText() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 45;
        ArtificialStackFrames = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 65;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getOfferPrice() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 125;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component4;
        int i5 = i2 + 81;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferType() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 103;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOfferName() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 81;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i2 + 121;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return str;
    }

    public final String getPaymentMethod() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 65;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getShareableDataState;
        }
        throw null;
    }

    public final String getUssdText() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 103;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.hashCode;
        int i5 = i2 + 119;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getOfferJourney() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 59;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component3;
        int i6 = i2 + 5;
        getSponsorBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOfferSegment() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 15;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.getAsAtTimestamp;
        int i4 = i2 + 17;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return str;
    }

    public final boolean getDefaultOffer() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 117;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.component2;
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return z;
    }

    public final boolean getGlobalOffer() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 45;
        ArtificialStackFrames = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.copydefault;
        int i4 = i2 + 95;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public static TunukiwaBundleEntity copy$default(TunukiwaBundleEntity tunukiwaBundleEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, boolean z, boolean z2, int i2, Object obj) {
        String str10;
        String str11;
        int i3;
        boolean z3;
        int i4 = 2 % 2;
        String str12 = (i2 & 1) != 0 ? tunukiwaBundleEntity.equals : str;
        String str13 = (i2 & 2) != 0 ? tunukiwaBundleEntity.ShareDataUIState : str2;
        String str14 = (i2 & 4) != 0 ? tunukiwaBundleEntity.component1 : str3;
        if ((i2 & 8) != 0) {
            int i5 = ArtificialStackFrames + 3;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            str10 = tunukiwaBundleEntity.component4;
        } else {
            str10 = str4;
        }
        String str15 = (i2 & 16) != 0 ? tunukiwaBundleEntity.copy : str5;
        if ((i2 & 32) != 0) {
            int i7 = getSponsorBeneficiariesState + 117;
            ArtificialStackFrames = i7 % 128;
            if (i7 % 2 != 0) {
                String str16 = tunukiwaBundleEntity.getRequestBeneficiariesState;
                throw null;
            }
            str11 = tunukiwaBundleEntity.getRequestBeneficiariesState;
        } else {
            str11 = str6;
        }
        String str17 = (i2 & 64) != 0 ? tunukiwaBundleEntity.getShareableDataState : str7;
        String str18 = (i2 & 128) != 0 ? tunukiwaBundleEntity.hashCode : str8;
        if ((i2 & 256) != 0) {
            int i8 = getSponsorBeneficiariesState + 31;
            ArtificialStackFrames = i8 % 128;
            if (i8 % 2 != 0) {
                i3 = tunukiwaBundleEntity.component3;
                int i9 = 5 / 0;
            } else {
                i3 = tunukiwaBundleEntity.component3;
            }
        } else {
            i3 = i;
        }
        String str19 = (i2 & 512) != 0 ? tunukiwaBundleEntity.getAsAtTimestamp : str9;
        boolean z4 = (i2 & 1024) != 0 ? tunukiwaBundleEntity.component2 : z;
        if ((i2 & 2048) != 0) {
            int i10 = ArtificialStackFrames + 31;
            getSponsorBeneficiariesState = i10 % 128;
            int i11 = i10 % 2;
            z3 = tunukiwaBundleEntity.copydefault;
        } else {
            z3 = z2;
        }
        return tunukiwaBundleEntity.copy(str12, str13, str14, str10, str15, str11, str17, str18, i3, str19, z4, z3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 35;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 121;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 89;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component11() {
        boolean z;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 101;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        if (i2 % 2 != 0) {
            z = this.component2;
            int i4 = 25 / 0;
        } else {
            z = this.component2;
        }
        int i5 = i3 + 25;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component12() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 55;
        ArtificialStackFrames = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.copydefault;
        int i4 = i2 + 119;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 31;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 59;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 47;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 31;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 119;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component4;
        int i5 = i3 + 121;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 33;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 17;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 29;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.getRequestBeneficiariesState;
        int i4 = i3 + 119;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 37;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.getShareableDataState;
        int i5 = i3 + 113;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 65;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.hashCode;
        int i5 = i2 + 5;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component9() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 35;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        int i5 = this.component3;
        int i6 = i3 + 63;
        getSponsorBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final TunukiwaBundleEntity copy(String offerPriority, String offerId, String appText, String offerPrice, String offerType, String offerName, String paymentMethod, String ussdText, int offerJourney, String offerSegment, boolean defaultOffer, boolean globalOffer) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(offerPriority, "");
        Intrinsics.checkNotNullParameter(offerId, "");
        Intrinsics.checkNotNullParameter(appText, "");
        Intrinsics.checkNotNullParameter(offerPrice, "");
        Intrinsics.checkNotNullParameter(offerType, "");
        Intrinsics.checkNotNullParameter(offerName, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        Intrinsics.checkNotNullParameter(ussdText, "");
        TunukiwaBundleEntity tunukiwaBundleEntity = new TunukiwaBundleEntity(offerPriority, offerId, appText, offerPrice, offerType, offerName, paymentMethod, ussdText, offerJourney, offerSegment, defaultOffer, globalOffer);
        int i2 = ArtificialStackFrames + 91;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return tunukiwaBundleEntity;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TunukiwaBundleEntity)) {
            int i2 = ArtificialStackFrames + 15;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        TunukiwaBundleEntity tunukiwaBundleEntity = (TunukiwaBundleEntity) other;
        if (!Intrinsics.areEqual(this.equals, tunukiwaBundleEntity.equals) || !Intrinsics.areEqual(this.ShareDataUIState, tunukiwaBundleEntity.ShareDataUIState) || !Intrinsics.areEqual(this.component1, tunukiwaBundleEntity.component1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, tunukiwaBundleEntity.component4)) {
            int i4 = getSponsorBeneficiariesState + 7;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copy, tunukiwaBundleEntity.copy)) {
            int i6 = getSponsorBeneficiariesState + 115;
            ArtificialStackFrames = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, tunukiwaBundleEntity.getRequestBeneficiariesState)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getShareableDataState, tunukiwaBundleEntity.getShareableDataState)) {
            int i8 = getSponsorBeneficiariesState + 47;
            ArtificialStackFrames = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.hashCode, tunukiwaBundleEntity.hashCode) || this.component3 != tunukiwaBundleEntity.component3) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, tunukiwaBundleEntity.getAsAtTimestamp)) {
            int i10 = getSponsorBeneficiariesState + 83;
            ArtificialStackFrames = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.component2 != tunukiwaBundleEntity.component2) {
            return false;
        }
        if (this.copydefault == tunukiwaBundleEntity.copydefault) {
            return true;
        }
        int i12 = getSponsorBeneficiariesState + 9;
        ArtificialStackFrames = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 85;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.equals.hashCode();
        int iHashCode3 = this.ShareDataUIState.hashCode();
        int iHashCode4 = this.component1.hashCode();
        int iHashCode5 = this.component4.hashCode();
        int iHashCode6 = this.copy.hashCode();
        int iHashCode7 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode8 = this.getShareableDataState.hashCode();
        int iHashCode9 = this.hashCode.hashCode();
        int iHashCode10 = Integer.hashCode(this.component3);
        String str = this.getAsAtTimestamp;
        if (str == null) {
            int i4 = ArtificialStackFrames + 7;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + Boolean.hashCode(this.component2)) * 31) + Boolean.hashCode(this.copydefault);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TunukiwaBundleEntity(offerPriority=" + this.equals + ", offerId=" + this.ShareDataUIState + ", appText=" + this.component1 + ", offerPrice=" + this.component4 + ", offerType=" + this.copy + ", offerName=" + this.getRequestBeneficiariesState + ", paymentMethod=" + this.getShareableDataState + ", ussdText=" + this.hashCode + ", offerJourney=" + this.component3 + ", offerSegment=" + this.getAsAtTimestamp + ", defaultOffer=" + this.component2 + ", globalOffer=" + this.copydefault + ")";
        int i2 = ArtificialStackFrames + 5;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
