package com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.PESActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J`\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÇ\u0001¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0005H\u0007J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H×\u0003J\t\u0010(\u001a\u00020\u0005H×\u0001J\t\u0010)\u001a\u00020\u0003H×\u0001J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0005H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006/"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/lipanabonga/BongaTillPayload;", "Landroid/os/Parcelable;", "msisdn", "", "amount", "", KeysConstants.SHORT_CODE, "receiverPartyName", PESActivity.EXTRA_BONGA_POINTS, "shortCodeType", "conversionRate", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)V", "getMsisdn", "()Ljava/lang/String;", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShortCode", "getReceiverPartyName", "getBongaPoints", "getShortCodeType", "getConversionRate", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;)Lcom/huawei/digitalpayment/consumer/sfcui/bonga/lipanabonga/BongaTillPayload;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaTillPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BongaTillPayload> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("amount")
    private final Integer amount;

    @SerializedName(PESActivity.EXTRA_BONGA_POINTS)
    private final Integer bongaPoints;

    @SerializedName("conversionRate")
    private final Double conversionRate;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("receiverPartyName")
    private final String receiverPartyName;

    @SerializedName(KeysConstants.SHORT_CODE)
    private final String shortCode;

    @SerializedName("shortCodeType")
    private final String shortCodeType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BongaTillPayload> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[PHI: r1
  0x0030: PHI (r1v14 java.lang.String) = (r1v4 java.lang.String), (r1v15 java.lang.String) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r1
  0x002d: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v15 java.lang.String) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload createFromParcel(android.os.Parcel r13) {
            /*
                r12 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload.Creator.ShareDataUIState
                int r1 = r1 + 17
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload.Creator.component2 = r2
                int r1 = r1 % r0
                java.lang.String r2 = ""
                r3 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
                if (r1 != 0) goto L23
                java.lang.String r1 = r13.readString()
                int r2 = r13.readInt()
                r4 = 75
                int r4 = r4 / 0
                if (r2 != 0) goto L30
                goto L2d
            L23:
                java.lang.String r1 = r13.readString()
                int r2 = r13.readInt()
                if (r2 != 0) goto L30
            L2d:
                r5 = r1
                r6 = r3
                goto L3a
            L30:
                int r2 = r13.readInt()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5 = r1
                r6 = r2
            L3a:
                java.lang.String r7 = r13.readString()
                java.lang.String r8 = r13.readString()
                int r1 = r13.readInt()
                if (r1 != 0) goto L53
                int r1 = com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload.Creator.component2
                int r1 = r1 + 67
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload.Creator.ShareDataUIState = r2
                int r1 = r1 % r0
                r9 = r3
                goto L65
            L53:
                int r1 = r13.readInt()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r2 = com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload.Creator.component2
                int r2 = r2 + 39
                int r4 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload.Creator.ShareDataUIState = r4
                int r2 = r2 % r0
                r9 = r1
            L65:
                java.lang.String r10 = r13.readString()
                int r1 = r13.readInt()
                if (r1 != 0) goto L7a
                int r13 = com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload.Creator.component2
                int r13 = r13 + 17
                int r1 = r13 % 128
                com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload.Creator.ShareDataUIState = r1
                int r13 = r13 % r0
            L78:
                r11 = r3
                goto L83
            L7a:
                double r0 = r13.readDouble()
                java.lang.Double r3 = java.lang.Double.valueOf(r0)
                goto L78
            L83:
                com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload r13 = new com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload
                r4 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.sfcui.bonga.lipanabonga.BongaTillPayload");
        }

        @Override
        public BongaTillPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 5;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            BongaTillPayload bongaTillPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 59;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return bongaTillPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaTillPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 83;
            ShareDataUIState = i4 % 128;
            BongaTillPayload[] bongaTillPayloadArr = new BongaTillPayload[i];
            if (i4 % 2 != 0) {
                int i5 = 31 / 0;
            }
            int i6 = i3 + 77;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                return bongaTillPayloadArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BongaTillPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 1;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            BongaTillPayload[] bongaTillPayloadArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 37 / 0;
            }
            int i6 = ShareDataUIState + 103;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return bongaTillPayloadArrNewArray;
            }
            throw null;
        }
    }

    public BongaTillPayload(String str, Integer num, String str2, String str3, Integer num2, String str4, Double d2) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.msisdn = str;
        this.amount = num;
        this.shortCode = str2;
        this.receiverPartyName = str3;
        this.bongaPoints = num2;
        this.shortCodeType = str4;
        this.conversionRate = d2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaTillPayload(String str, Integer num, String str2, String str3, Integer num2, String str4, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num3;
        Integer num4;
        String str5;
        Double d3 = null;
        if ((i & 1) != 0) {
            int i2 = component2 + 85;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 101;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i8 = copydefault + 19;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            num3 = null;
        } else {
            num3 = num;
        }
        String str6 = (i & 4) != 0 ? null : str2;
        String str7 = (i & 8) != 0 ? "" : str3;
        if ((i & 16) != 0) {
            int i10 = 2 % 2;
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i & 32) != 0) {
            int i11 = 2 % 2;
            str5 = null;
        } else {
            str5 = str4;
        }
        if ((i & 64) != 0) {
            int i12 = 2 % 2;
        } else {
            d3 = d2;
        }
        this(str, num3, str6, str7, num4, str5, d3);
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 117;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.amount;
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        return num;
    }

    public final String getShortCode() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.shortCode;
        int i5 = i2 + 109;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getReceiverPartyName() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.receiverPartyName;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getBongaPoints() {
        int i = 2 % 2;
        int i2 = copydefault + 107;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Integer num = this.bongaPoints;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getShortCodeType() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.shortCodeType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Double getConversionRate() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Double d2 = this.conversionRate;
        int i4 = i2 + 95;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return d2;
        }
        throw null;
    }

    static {
        int i = component1 + 59;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public BongaTillPayload() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static BongaTillPayload copy$default(BongaTillPayload bongaTillPayload, String str, Integer num, String str2, String str3, Integer num2, String str4, Double d2, int i, Object obj) {
        String str5;
        String str6;
        String str7;
        int i2 = 2 % 2;
        String str8 = (i & 1) != 0 ? bongaTillPayload.msisdn : str;
        Integer num3 = (i & 2) != 0 ? bongaTillPayload.amount : num;
        if ((i & 4) != 0) {
            int i3 = component2 + 49;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                str5 = bongaTillPayload.shortCode;
                int i4 = 85 / 0;
            } else {
                str5 = bongaTillPayload.shortCode;
            }
        } else {
            str5 = str2;
        }
        if ((i & 8) != 0) {
            int i5 = copydefault + 123;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str6 = bongaTillPayload.receiverPartyName;
        } else {
            str6 = str3;
        }
        Integer num4 = (i & 16) != 0 ? bongaTillPayload.bongaPoints : num2;
        if ((i & 32) != 0) {
            int i7 = component2 + 77;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            str7 = bongaTillPayload.shortCodeType;
        } else {
            str7 = str4;
        }
        BongaTillPayload bongaTillPayloadCopy = bongaTillPayload.copy(str8, num3, str5, str6, num4, str7, (i & 64) != 0 ? bongaTillPayload.conversionRate : d2);
        int i9 = copydefault + 51;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return bongaTillPayloadCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 103;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.shortCode;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.receiverPartyName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Integer num = this.bongaPoints;
        int i5 = i3 + 93;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.shortCodeType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Double component7() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.conversionRate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BongaTillPayload copy(String msisdn, Integer amount, String shortCode, String receiverPartyName, Integer bongaPoints, String shortCodeType, Double conversionRate) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(receiverPartyName, "");
        BongaTillPayload bongaTillPayload = new BongaTillPayload(msisdn, amount, shortCode, receiverPartyName, bongaPoints, shortCodeType, conversionRate);
        int i2 = copydefault + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return bongaTillPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BongaTillPayload)) {
            int i5 = i2 + 91;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        BongaTillPayload bongaTillPayload = (BongaTillPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, bongaTillPayload.msisdn)) {
            int i7 = copydefault + 99;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.amount, bongaTillPayload.amount)) {
            int i9 = component2 + 57;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.shortCode, bongaTillPayload.shortCode)) {
            int i11 = copydefault + 31;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.receiverPartyName, bongaTillPayload.receiverPartyName)) {
            return Intrinsics.areEqual(this.bongaPoints, bongaTillPayload.bongaPoints) && Intrinsics.areEqual(this.shortCodeType, bongaTillPayload.shortCodeType) && Intrinsics.areEqual((Object) this.conversionRate, (Object) bongaTillPayload.conversionRate);
        }
        int i13 = component2 + 115;
        copydefault = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = component2 + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        int iHashCode4 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = component2 + 5;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        Integer num = this.amount;
        if (num == null) {
            int i6 = copydefault + 27;
            component2 = i6 % 128;
            iHashCode2 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        String str2 = this.shortCode;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = this.receiverPartyName.hashCode();
        Integer num2 = this.bongaPoints;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.shortCodeType;
        if (str3 == null) {
            int i7 = copydefault + 15;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        Double d2 = this.conversionRate;
        if (d2 != null) {
            iHashCode4 = d2.hashCode();
            int i9 = component2 + 17;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
        }
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaTillPayload(msisdn=" + this.msisdn + ", amount=" + this.amount + ", shortCode=" + this.shortCode + ", receiverPartyName=" + this.receiverPartyName + ", bongaPoints=" + this.bongaPoints + ", shortCodeType=" + this.shortCodeType + ", conversionRate=" + this.conversionRate + ")";
        int i2 = copydefault + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        Integer num = this.amount;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
            int i2 = component2 + 99;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        }
        dest.writeString(this.shortCode);
        dest.writeString(this.receiverPartyName);
        Integer num2 = this.bongaPoints;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.shortCodeType);
        Double d2 = this.conversionRate;
        if (d2 != null) {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        } else {
            dest.writeInt(0);
            int i4 = component2 + 107;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
