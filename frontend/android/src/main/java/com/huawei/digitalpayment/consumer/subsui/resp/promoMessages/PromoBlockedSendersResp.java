package com.huawei.digitalpayment.consumer.subsui.resp.promoMessages;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/resp/promoMessages/PromoBlockedSendersResp;", "Landroid/os/Parcelable;", "channel", "", "expiryDate", "metaName", "msisdn", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getExpiryDate", "getMetaName", "getMsisdn", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PromoBlockedSendersResp implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PromoBlockedSendersResp> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @SerializedName("channel")
    private final String channel;

    @SerializedName("expiryDate")
    private final String expiryDate;

    @SerializedName("metaName")
    private final String metaName;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoBlockedSendersResp> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PromoBlockedSendersResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            PromoBlockedSendersResp promoBlockedSendersResp = new PromoBlockedSendersResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 11;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return promoBlockedSendersResp;
            }
            throw null;
        }

        @Override
        public PromoBlockedSendersResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 111;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PromoBlockedSendersResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 115;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            PromoBlockedSendersResp[] promoBlockedSendersRespArr = new PromoBlockedSendersResp[i];
            int i6 = i3 + 67;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                return promoBlockedSendersRespArr;
            }
            throw null;
        }

        @Override
        public PromoBlockedSendersResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 83;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            PromoBlockedSendersResp[] promoBlockedSendersRespArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 29 / 0;
            }
            return promoBlockedSendersRespArrNewArray;
        }
    }

    public PromoBlockedSendersResp(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.channel = str;
        this.expiryDate = str2;
        this.metaName = str3;
        this.msisdn = str4;
        this.value = str5;
    }

    public final String getChannel() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.channel;
        int i5 = i3 + 1;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getExpiryDate() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 45;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.expiryDate;
        int i5 = i2 + 75;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMetaName() {
        int i = 2 % 2;
        int i2 = component3 + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.metaName;
        int i5 = i3 + 1;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 7;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 85;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 17 / 0;
        }
        return str;
    }

    static {
        int i = component2 + 57;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static PromoBlockedSendersResp copy$default(PromoBlockedSendersResp promoBlockedSendersResp, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = component3 + 87;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                String str6 = promoBlockedSendersResp.channel;
                obj2.hashCode();
                throw null;
            }
            str = promoBlockedSendersResp.channel;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            int i4 = component3 + 19;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            str2 = promoBlockedSendersResp.expiryDate;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            int i6 = ShareDataUIState + 53;
            int i7 = i6 % 128;
            component3 = i7;
            int i8 = i6 % 2;
            str3 = promoBlockedSendersResp.metaName;
            int i9 = i7 + 87;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            int i11 = ShareDataUIState + 79;
            component3 = i11 % 128;
            if (i11 % 2 == 0) {
                String str10 = promoBlockedSendersResp.msisdn;
                throw null;
            }
            str4 = promoBlockedSendersResp.msisdn;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            str5 = promoBlockedSendersResp.value;
        }
        return promoBlockedSendersResp.copy(str7, str8, str9, str11, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.channel;
        int i4 = i3 + 11;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.expiryDate;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.metaName;
        int i5 = i3 + 101;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 99;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 117;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PromoBlockedSendersResp copy(String channel, String expiryDate, String metaName, String msisdn, String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(expiryDate, "");
        Intrinsics.checkNotNullParameter(metaName, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(value, "");
        PromoBlockedSendersResp promoBlockedSendersResp = new PromoBlockedSendersResp(channel, expiryDate, metaName, msisdn, value);
        int i2 = component3 + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return promoBlockedSendersResp;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoBlockedSendersResp)) {
            return false;
        }
        PromoBlockedSendersResp promoBlockedSendersResp = (PromoBlockedSendersResp) other;
        if (!Intrinsics.areEqual(this.channel, promoBlockedSendersResp.channel) || !Intrinsics.areEqual(this.expiryDate, promoBlockedSendersResp.expiryDate) || !Intrinsics.areEqual(this.metaName, promoBlockedSendersResp.metaName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.msisdn, promoBlockedSendersResp.msisdn)) {
            if (Intrinsics.areEqual(this.value, promoBlockedSendersResp.value)) {
                return true;
            }
            int i2 = ShareDataUIState + 41;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = ShareDataUIState;
        int i5 = i4 + 21;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 103;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1
  0x001c: PHI (r1v16 java.lang.String) = (r1v4 java.lang.String), (r1v17 java.lang.String) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.subsui.resp.promoMessages.PromoBlockedSendersResp.component3
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.subsui.resp.promoMessages.PromoBlockedSendersResp.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L17
            java.lang.String r1 = r4.channel
            r3 = 9
            int r3 = r3 / r2
            if (r1 != 0) goto L1c
            goto L20
        L17:
            java.lang.String r1 = r4.channel
            if (r1 != 0) goto L1c
            goto L20
        L1c:
            int r2 = r1.hashCode()
        L20:
            int r2 = r2 * 31
            java.lang.String r1 = r4.expiryDate
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.String r1 = r4.metaName
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.String r1 = r4.msisdn
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.String r1 = r4.value
            int r1 = r1.hashCode()
            int r2 = r2 + r1
            int r1 = com.huawei.digitalpayment.consumer.subsui.resp.promoMessages.PromoBlockedSendersResp.component3
            int r1 = r1 + 31
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.subsui.resp.promoMessages.PromoBlockedSendersResp.ShareDataUIState = r3
            int r1 = r1 % r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.subsui.resp.promoMessages.PromoBlockedSendersResp.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PromoBlockedSendersResp(channel=" + this.channel + ", expiryDate=" + this.expiryDate + ", metaName=" + this.metaName + ", msisdn=" + this.msisdn + ", value=" + this.value + ")";
        int i2 = ShareDataUIState + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.channel);
        dest.writeString(this.expiryDate);
        dest.writeString(this.metaName);
        dest.writeString(this.msisdn);
        dest.writeString(this.value);
        int i4 = component3 + 55;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
    }
}
