package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.kernel.RVParams;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010/\u001a\u00020\u0004HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\u0004HÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\u0004HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\u0004HÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\t\u0010<\u001a\u00020\u0004HÆ\u0003J\t\u0010=\u001a\u00020\u0004HÆ\u0003J\t\u0010>\u001a\u00020\u0004HÆ\u0003J©\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0004HÇ\u0001J\b\u0010@\u001a\u00020\bH\u0007J\u0013\u0010A\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010CH×\u0003J\t\u0010D\u001a\u00020\bH×\u0001J\t\u0010E\u001a\u00020\u0004H×\u0001J\u0018\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\bH\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0016\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0016\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001b¨\u0006K"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfferBundle;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "appOfferName", "", "autoRenewable", "", "bongaPrice", "", "flashMessage", "neoRateId", "", "offerId", "", "offerName", "offerPrice", "offerType", "rateMultiplier", "recordNumber", "tunukiwaLocationOffer", "tunukiwaRate", "tunukiwaSalutation", "ussdName", RVParams.SESSION_ID, "<init>", "(Ljava/lang/String;ZILjava/lang/String;DJLjava/lang/String;IIDILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppOfferName", "()Ljava/lang/String;", "getAutoRenewable", "()Z", "getBongaPrice", "()I", "getFlashMessage", "getNeoRateId", "()D", "getOfferId", "()J", "getOfferName", "getOfferPrice", "getOfferType", "getRateMultiplier", "getRecordNumber", "getTunukiwaLocationOffer", "getTunukiwaRate", "getTunukiwaSalutation", "getUssdName", "getSessionId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfferBundle implements Parcelable, Serializable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<OfferBundle> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("appOfferName")
    private final String appOfferName;

    @SerializedName("autoRenewable")
    private final boolean autoRenewable;

    @SerializedName("bongaPrice")
    private final int bongaPrice;

    @SerializedName("flashMsg")
    private final String flashMessage;

    @SerializedName("neoRateId")
    private final double neoRateId;

    @SerializedName("offerId")
    private final long offerId;

    @SerializedName("offerName")
    private final String offerName;

    @SerializedName("offerPrice")
    private final int offerPrice;

    @SerializedName("offerType")
    private final int offerType;

    @SerializedName("rateMultiplier")
    private final double rateMultiplier;

    @SerializedName("recordNumber")
    private final int recordNumber;
    private final String sessionId;

    @SerializedName("tunukiwaLocationOffer")
    private final String tunukiwaLocationOffer;

    @SerializedName("tunukiwaRate")
    private final double tunukiwaRate;

    @SerializedName("tunukiwaSalutation")
    private final String tunukiwaSalutation;

    @SerializedName("ussdName")
    private final String ussdName;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OfferBundle> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle createFromParcel(android.os.Parcel r26) {
            /*
                r25 = this;
                r0 = r26
                r1 = 2
                int r2 = r1 % r1
                int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle.Creator.copydefault
                int r2 = r2 + 109
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle.Creator.ShareDataUIState = r3
                int r2 = r2 % r1
                java.lang.String r3 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
                if (r2 == 0) goto L6f
                java.lang.String r5 = r26.readString()
                int r2 = r26.readInt()
                r3 = 0
                if (r2 == 0) goto L2f
                int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle.Creator.ShareDataUIState
                int r2 = r2 + 47
                int r4 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle.Creator.copydefault = r4
                int r2 = r2 % r1
                if (r2 == 0) goto L2c
                goto L2f
            L2c:
                r1 = 1
                r6 = r1
                goto L30
            L2f:
                r6 = r3
            L30:
                com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle r1 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle
                r4 = r1
                int r7 = r26.readInt()
                java.lang.String r8 = r26.readString()
                double r9 = r26.readDouble()
                long r11 = r26.readLong()
                java.lang.String r13 = r26.readString()
                int r14 = r26.readInt()
                int r15 = r26.readInt()
                double r16 = r26.readDouble()
                int r18 = r26.readInt()
                java.lang.String r19 = r26.readString()
                double r20 = r26.readDouble()
                java.lang.String r22 = r26.readString()
                java.lang.String r23 = r26.readString()
                java.lang.String r24 = r26.readString()
                r4.<init>(r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24)
                return r1
            L6f:
                r26.readString()
                r26.readInt()
                r0 = 0
                r0.hashCode()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferBundle");
        }

        @Override
        public OfferBundle createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 53;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            OfferBundle offerBundleCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 15 / 0;
            }
            int i5 = ShareDataUIState + 15;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return offerBundleCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final OfferBundle[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 17;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            OfferBundle[] offerBundleArr = new OfferBundle[i];
            int i6 = i4 + 29;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return offerBundleArr;
        }

        @Override
        public OfferBundle[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 121;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            OfferBundle[] offerBundleArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 71;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return offerBundleArrNewArray;
            }
            throw null;
        }
    }

    public OfferBundle(String str, boolean z, int i, String str2, double d2, long j, String str3, int i2, int i3, double d3, int i4, String str4, double d4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.appOfferName = str;
        this.autoRenewable = z;
        this.bongaPrice = i;
        this.flashMessage = str2;
        this.neoRateId = d2;
        this.offerId = j;
        this.offerName = str3;
        this.offerPrice = i2;
        this.offerType = i3;
        this.rateMultiplier = d3;
        this.recordNumber = i4;
        this.tunukiwaLocationOffer = str4;
        this.tunukiwaRate = d4;
        this.tunukiwaSalutation = str5;
        this.ussdName = str6;
        this.sessionId = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OfferBundle(String str, boolean z, int i, String str2, double d2, long j, String str3, int i2, int i3, double d3, int i4, String str4, double d4, String str5, String str6, String str7, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        String str9;
        double d5;
        String str10;
        int i6;
        int i7;
        String str11;
        String str12;
        if ((i5 & 1) != 0) {
            int i8 = copydefault + 7;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            str8 = "";
        } else {
            str8 = str;
        }
        boolean z2 = (i5 & 2) != 0 ? false : z;
        int i10 = (i5 & 4) != 0 ? 0 : i;
        if ((i5 & 8) != 0) {
            int i11 = copydefault + 107;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 2 % 2;
            str9 = "";
        } else {
            str9 = str2;
        }
        if ((i5 & 16) != 0) {
            int i14 = copydefault + 79;
            component1 = i14 % 128;
            d5 = i14 % 2 != 0 ? 1.0d : 0.0d;
            int i15 = 2 % 2;
        } else {
            d5 = d2;
        }
        long j2 = (i5 & 32) != 0 ? 0L : j;
        if ((i5 & 64) != 0) {
            int i16 = component1 + 13;
            copydefault = i16 % 128;
            int i17 = i16 % 2;
            str10 = "";
        } else {
            str10 = str3;
        }
        if ((i5 & 128) != 0) {
            int i18 = 2 % 2;
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i5 & 256) != 0) {
            int i19 = component1 + 11;
            copydefault = i19 % 128;
            int i20 = i19 % 2;
            i7 = 0;
        } else {
            i7 = i3;
        }
        double d6 = (i5 & 512) != 0 ? 0.0d : d3;
        int i21 = (i5 & 1024) != 0 ? 0 : i4;
        String str13 = "";
        if ((i5 & 2048) != 0) {
            int i22 = 2 % 2;
            str11 = str13;
        } else {
            str11 = str4;
        }
        String str14 = str11;
        double d7 = (i5 & 4096) != 0 ? 0.0d : d4;
        String str15 = (i5 & 8192) != 0 ? str13 : str5;
        String str16 = (i5 & 16384) != 0 ? str13 : str6;
        if ((i5 & 32768) != 0) {
            int i23 = copydefault + 35;
            str12 = str16;
            component1 = i23 % 128;
            int i24 = i23 % 2;
        } else {
            str12 = str16;
            str13 = str7;
        }
        this(str8, z2, i10, str9, d5, j2, str10, i6, i7, d6, i21, str14, d7, str15, str12, str13);
    }

    public final String getAppOfferName() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.appOfferName;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getAutoRenewable() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 69;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.autoRenewable;
        int i5 = i2 + 21;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getBongaPrice() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.bongaPrice;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFlashMessage() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.flashMessage;
        int i5 = i2 + 51;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final double getNeoRateId() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        double d2 = this.neoRateId;
        int i5 = i3 + 15;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return d2;
    }

    public final long getOfferId() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        long j = this.offerId;
        if (i4 == 0) {
            int i5 = 69 / 0;
        }
        int i6 = i3 + 95;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final String getOfferName() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.offerName;
        int i4 = i3 + 47;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int getOfferPrice() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.offerPrice;
        int i6 = i3 + 35;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 46 / 0;
        }
        return i5;
    }

    public final int getOfferType() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.offerType;
        int i6 = i3 + 73;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final double getRateMultiplier() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        double d2 = this.rateMultiplier;
        int i5 = i3 + 85;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final int getRecordNumber() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.recordNumber;
        int i6 = i2 + 35;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final String getTunukiwaLocationOffer() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tunukiwaLocationOffer;
        int i5 = i2 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final double getTunukiwaRate() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tunukiwaRate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTunukiwaSalutation() {
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.tunukiwaSalutation;
        int i5 = i3 + 73;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUssdName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.ussdName;
        int i4 = i2 + 11;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSessionId() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.sessionId;
        int i5 = i3 + 93;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 49;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public OfferBundle() {
        this(null, false, 0, null, 0.0d, 0L, null, 0, 0, 0.0d, 0, null, 0.0d, null, null, null, 65535, null);
    }

    public static OfferBundle copy$default(OfferBundle offerBundle, String str, boolean z, int i, String str2, double d2, long j, String str3, int i2, int i3, double d3, int i4, String str4, double d4, String str5, String str6, String str7, int i5, Object obj) {
        String str8;
        int i6;
        String str9;
        double d5;
        int i7;
        int i8;
        double d6;
        int i9;
        double d7;
        int i10 = 2 % 2;
        Object obj2 = null;
        if ((i5 & 1) != 0) {
            int i11 = component1 + 41;
            copydefault = i11 % 128;
            if (i11 % 2 == 0) {
                String str10 = offerBundle.appOfferName;
                throw null;
            }
            str8 = offerBundle.appOfferName;
        } else {
            str8 = str;
        }
        boolean z2 = (i5 & 2) != 0 ? offerBundle.autoRenewable : z;
        if ((i5 & 4) != 0) {
            int i12 = copydefault + 89;
            component1 = i12 % 128;
            if (i12 % 2 != 0) {
                i6 = offerBundle.bongaPrice;
                int i13 = 35 / 0;
            } else {
                i6 = offerBundle.bongaPrice;
            }
        } else {
            i6 = i;
        }
        if ((i5 & 8) != 0) {
            int i14 = component1 + 61;
            copydefault = i14 % 128;
            int i15 = i14 % 2;
            str9 = offerBundle.flashMessage;
        } else {
            str9 = str2;
        }
        if ((i5 & 16) != 0) {
            int i16 = component1 + 115;
            copydefault = i16 % 128;
            if (i16 % 2 == 0) {
                d5 = offerBundle.neoRateId;
                int i17 = 77 / 0;
            } else {
                d5 = offerBundle.neoRateId;
            }
        } else {
            d5 = d2;
        }
        long j2 = (i5 & 32) != 0 ? offerBundle.offerId : j;
        String str11 = (i5 & 64) != 0 ? offerBundle.offerName : str3;
        if ((i5 & 128) != 0) {
            int i18 = component1 + 57;
            copydefault = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = offerBundle.offerPrice;
                obj2.hashCode();
                throw null;
            }
            i7 = offerBundle.offerPrice;
        } else {
            i7 = i2;
        }
        if ((i5 & 256) != 0) {
            int i20 = copydefault + 95;
            component1 = i20 % 128;
            int i21 = i20 % 2;
            i8 = offerBundle.offerType;
        } else {
            i8 = i3;
        }
        boolean z3 = z2;
        double d8 = (i5 & 512) != 0 ? offerBundle.rateMultiplier : d3;
        int i22 = (i5 & 1024) != 0 ? offerBundle.recordNumber : i4;
        String str12 = (i5 & 2048) != 0 ? offerBundle.tunukiwaLocationOffer : str4;
        if ((i5 & 4096) != 0) {
            int i23 = component1 + 41;
            i9 = i22;
            copydefault = i23 % 128;
            if (i23 % 2 == 0) {
                double d9 = offerBundle.tunukiwaRate;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            d6 = d8;
            d7 = offerBundle.tunukiwaRate;
        } else {
            d6 = d8;
            i9 = i22;
            d7 = d4;
        }
        OfferBundle offerBundleCopy = offerBundle.copy(str8, z3, i6, str9, d5, j2, str11, i7, i8, d6, i9, str12, d7, (i5 & 8192) != 0 ? offerBundle.tunukiwaSalutation : str5, (i5 & 16384) != 0 ? offerBundle.ussdName : str6, (i5 & 32768) != 0 ? offerBundle.sessionId : str7);
        int i24 = copydefault + 45;
        component1 = i24 % 128;
        if (i24 % 2 == 0) {
            return offerBundleCopy;
        }
        Object obj4 = null;
        obj4.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.appOfferName;
        int i5 = i3 + 31;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final double component10() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.rateMultiplier;
        }
        int i3 = 26 / 0;
        return this.rateMultiplier;
    }

    public final int component11() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.recordNumber;
        int i6 = i3 + 35;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tunukiwaLocationOffer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double component13() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        double d2 = this.tunukiwaRate;
        int i4 = i3 + 113;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return d2;
        }
        obj.hashCode();
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tunukiwaSalutation;
        }
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 49;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ussdName;
        int i5 = i2 + 73;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.sessionId;
        int i5 = i3 + 41;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 29;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.autoRenewable;
        int i4 = i2 + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 117;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.bongaPrice;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 107;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.flashMessage;
        int i4 = i2 + 31;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final double component5() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.neoRateId;
        }
        throw null;
    }

    public final long component6() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.offerId;
        int i4 = i2 + 87;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.offerName;
        }
        throw null;
    }

    public final int component8() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 63;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.offerPrice;
        int i6 = i2 + 47;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component9() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.offerType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final OfferBundle copy(String appOfferName, boolean autoRenewable, int bongaPrice, String flashMessage, double neoRateId, long offerId, String offerName, int offerPrice, int offerType, double rateMultiplier, int recordNumber, String tunukiwaLocationOffer, double tunukiwaRate, String tunukiwaSalutation, String ussdName, String sessionId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appOfferName, "");
        Intrinsics.checkNotNullParameter(flashMessage, "");
        Intrinsics.checkNotNullParameter(offerName, "");
        Intrinsics.checkNotNullParameter(tunukiwaLocationOffer, "");
        Intrinsics.checkNotNullParameter(tunukiwaSalutation, "");
        Intrinsics.checkNotNullParameter(ussdName, "");
        Intrinsics.checkNotNullParameter(sessionId, "");
        OfferBundle offerBundle = new OfferBundle(appOfferName, autoRenewable, bongaPrice, flashMessage, neoRateId, offerId, offerName, offerPrice, offerType, rateMultiplier, recordNumber, tunukiwaLocationOffer, tunukiwaRate, tunukiwaSalutation, ussdName, sessionId);
        int i2 = component1 + 7;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return offerBundle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        copydefault = i2 % 128;
        return 1 ^ (i2 % 2 == 0 ? 0 : 1);
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfferBundle)) {
            return false;
        }
        OfferBundle offerBundle = (OfferBundle) other;
        if (!Intrinsics.areEqual(this.appOfferName, offerBundle.appOfferName)) {
            int i2 = component1 + 13;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.autoRenewable != offerBundle.autoRenewable) {
            return false;
        }
        if (this.bongaPrice != offerBundle.bongaPrice) {
            int i4 = copydefault + 91;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.flashMessage, offerBundle.flashMessage)) {
            return false;
        }
        if (Double.compare(this.neoRateId, offerBundle.neoRateId) != 0) {
            int i5 = component1 + 65;
            copydefault = i5 % 128;
            return i5 % 2 == 0;
        }
        if (this.offerId != offerBundle.offerId) {
            return false;
        }
        if (!Intrinsics.areEqual(this.offerName, offerBundle.offerName)) {
            int i6 = copydefault;
            int i7 = i6 + 41;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 81;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.offerPrice != offerBundle.offerPrice) {
            int i11 = copydefault + 123;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (this.offerType != offerBundle.offerType) {
            int i13 = copydefault + 65;
            component1 = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (Double.compare(this.rateMultiplier, offerBundle.rateMultiplier) != 0) {
            int i15 = component1 + 27;
            copydefault = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (this.recordNumber != offerBundle.recordNumber) {
            int i17 = component1 + 79;
            copydefault = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.tunukiwaLocationOffer, offerBundle.tunukiwaLocationOffer)) {
            return false;
        }
        if (Double.compare(this.tunukiwaRate, offerBundle.tunukiwaRate) == 0) {
            return Intrinsics.areEqual(this.tunukiwaSalutation, offerBundle.tunukiwaSalutation) && Intrinsics.areEqual(this.ussdName, offerBundle.ussdName) && Intrinsics.areEqual(this.sessionId, offerBundle.sessionId);
        }
        int i19 = component1 + 125;
        copydefault = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((((((((((((this.appOfferName.hashCode() * 31) + Boolean.hashCode(this.autoRenewable)) * 31) + Integer.hashCode(this.bongaPrice)) * 31) + this.flashMessage.hashCode()) * 31) + Double.hashCode(this.neoRateId)) * 31) + Long.hashCode(this.offerId)) * 31) + this.offerName.hashCode()) * 31) + Integer.hashCode(this.offerPrice)) * 31) + Integer.hashCode(this.offerType)) * 31) + Double.hashCode(this.rateMultiplier)) * 31) + Integer.hashCode(this.recordNumber)) * 31) + this.tunukiwaLocationOffer.hashCode()) * 31) + Double.hashCode(this.tunukiwaRate)) * 31) + this.tunukiwaSalutation.hashCode()) * 31) + this.ussdName.hashCode()) * 31) + this.sessionId.hashCode();
        int i4 = component1 + 99;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OfferBundle(appOfferName=" + this.appOfferName + ", autoRenewable=" + this.autoRenewable + ", bongaPrice=" + this.bongaPrice + ", flashMessage=" + this.flashMessage + ", neoRateId=" + this.neoRateId + ", offerId=" + this.offerId + ", offerName=" + this.offerName + ", offerPrice=" + this.offerPrice + ", offerType=" + this.offerType + ", rateMultiplier=" + this.rateMultiplier + ", recordNumber=" + this.recordNumber + ", tunukiwaLocationOffer=" + this.tunukiwaLocationOffer + ", tunukiwaRate=" + this.tunukiwaRate + ", tunukiwaSalutation=" + this.tunukiwaSalutation + ", ussdName=" + this.ussdName + ", sessionId=" + this.sessionId + ")";
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.appOfferName);
        dest.writeInt(this.autoRenewable ? 1 : 0);
        dest.writeInt(this.bongaPrice);
        dest.writeString(this.flashMessage);
        dest.writeDouble(this.neoRateId);
        dest.writeLong(this.offerId);
        dest.writeString(this.offerName);
        dest.writeInt(this.offerPrice);
        dest.writeInt(this.offerType);
        dest.writeDouble(this.rateMultiplier);
        dest.writeInt(this.recordNumber);
        dest.writeString(this.tunukiwaLocationOffer);
        dest.writeDouble(this.tunukiwaRate);
        dest.writeString(this.tunukiwaSalutation);
        dest.writeString(this.ussdName);
        dest.writeString(this.sessionId);
        int i4 = component1 + 3;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
