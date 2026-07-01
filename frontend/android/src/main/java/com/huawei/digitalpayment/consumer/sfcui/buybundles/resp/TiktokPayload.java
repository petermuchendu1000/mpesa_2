package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.exthub.config.ExtHubMetaInfoParser;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.safaricom.consumer.commons.statements.DisPlayItems;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0007J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\u001dH×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TiktokPayload;", "Landroid/os/Parcelable;", ExtHubMetaInfoParser.KEY_EXTENSION_BUNDLE_NAME, "", "customerType", "msisdn", "paymentMode", FirebaseAnalytics.Param.PRICE, DisPlayItems.TRANSACTION_ID, "validity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBundleName", "()Ljava/lang/String;", "getCustomerType", "getMsisdn", "getPaymentMode", "getPrice", "getTransactionId", "getValidity", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TiktokPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TiktokPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 1;

    @SerializedName(ExtHubMetaInfoParser.KEY_EXTENSION_BUNDLE_NAME)
    private final String bundleName;

    @SerializedName("customerType")
    private final String customerType;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("paymentMode")
    private final String paymentMode;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final String price;

    @SerializedName(DisPlayItems.TRANSACTION_ID)
    private final String transactionId;

    @SerializedName("validity")
    private final String validity;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TiktokPayload> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TiktokPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            TiktokPayload tiktokPayload = new TiktokPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 65;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return tiktokPayload;
        }

        @Override
        public TiktokPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 107;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            TiktokPayload tiktokPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 77;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return tiktokPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TiktokPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 41;
            int i4 = i3 % 128;
            component1 = i4;
            TiktokPayload[] tiktokPayloadArr = new TiktokPayload[i];
            if (i3 % 2 != 0) {
                int i5 = 60 / 0;
            }
            int i6 = i4 + 3;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return tiktokPayloadArr;
            }
            throw null;
        }

        @Override
        public TiktokPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 121;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            TiktokPayload[] tiktokPayloadArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 87 / 0;
            }
            int i6 = component2 + 93;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return tiktokPayloadArrNewArray;
        }
    }

    public TiktokPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.bundleName = str;
        this.customerType = str2;
        this.msisdn = str3;
        this.paymentMode = str4;
        this.price = str5;
        this.transactionId = str6;
        this.validity = str7;
    }

    public final String getBundleName() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.bundleName;
        int i4 = i3 + 109;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getCustomerType() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.customerType;
        int i4 = i3 + 71;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 119;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 69;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPaymentMode() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.paymentMode;
        }
        throw null;
    }

    public final String getPrice() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.price;
        int i5 = i2 + 89;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTransactionId() {
        int i = 2 % 2;
        int i2 = component2 + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.transactionId;
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return str;
    }

    public final String getValidity() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.validity;
        int i5 = i2 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = ShareDataUIState + 7;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static TiktokPayload copy$default(TiktokPayload tiktokPayload, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        String str8;
        String str9;
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 9;
        component2 = i4 % 128;
        String str10 = (i4 % 2 == 0 || (i & 1) == 0) ? str : tiktokPayload.bundleName;
        String str11 = (i & 2) != 0 ? tiktokPayload.customerType : str2;
        if ((i & 4) != 0) {
            int i5 = i3 + 69;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                String str12 = tiktokPayload.msisdn;
                throw null;
            }
            str8 = tiktokPayload.msisdn;
        } else {
            str8 = str3;
        }
        String str13 = (i & 8) != 0 ? tiktokPayload.paymentMode : str4;
        String str14 = (i & 16) != 0 ? tiktokPayload.price : str5;
        if ((i & 32) != 0) {
            int i6 = i3 + 45;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                String str15 = tiktokPayload.transactionId;
                throw null;
            }
            str9 = tiktokPayload.transactionId;
        } else {
            str9 = str6;
        }
        return tiktokPayload.copy(str10, str11, str8, str13, str14, str9, (i & 64) != 0 ? tiktokPayload.validity : str7);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bundleName;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.customerType;
        int i4 = i3 + 51;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 55;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 27 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.paymentMode;
        int i4 = i2 + 7;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 93 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.price;
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.transactionId;
        int i5 = i3 + 17;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.validity;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return str;
    }

    public final TiktokPayload copy(String bundleName, String customerType, String msisdn, String paymentMode, String price, String transactionId, String validity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundleName, "");
        Intrinsics.checkNotNullParameter(customerType, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(paymentMode, "");
        Intrinsics.checkNotNullParameter(price, "");
        Intrinsics.checkNotNullParameter(transactionId, "");
        Intrinsics.checkNotNullParameter(validity, "");
        TiktokPayload tiktokPayload = new TiktokPayload(bundleName, customerType, msisdn, paymentMode, price, transactionId, validity);
        int i2 = component1 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return tiktokPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        component1 = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 91;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if ((r7 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r7 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.bundleName, r7.bundleName) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.customerType, r7.customerType) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r7 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload.component1;
        r1 = r7 + 43;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload.component2 = r1 % 128;
        r1 = r1 % 2;
        r7 = r7 + 119;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload.component2 = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if ((r7 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.msisdn, r7.msisdn) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.paymentMode, r7.paymentMode) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.price, r7.price) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.transactionId, r7.transactionId) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.validity, r7.validity) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r2 = r2 + 95;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload.component2 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if ((r2 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload.component2
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload.component1 = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L17
            r1 = 38
            int r1 = r1 / r5
            if (r6 != r7) goto L24
            goto L19
        L17:
            if (r6 != r7) goto L24
        L19:
            int r2 = r2 + 95
            int r7 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload.component2 = r7
            int r2 = r2 % r0
            if (r2 == 0) goto L23
            return r3
        L23:
            throw r4
        L24:
            boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload
            if (r1 != 0) goto L29
            return r5
        L29:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload r7 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload) r7
            java.lang.String r1 = r6.bundleName
            java.lang.String r2 = r7.bundleName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L36
            return r5
        L36:
            java.lang.String r1 = r6.customerType
            java.lang.String r2 = r7.customerType
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L57
            int r7 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload.component1
            int r1 = r7 + 43
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload.component2 = r2
            int r1 = r1 % r0
            int r7 = r7 + 119
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload.component2 = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L53
            return r5
        L53:
            r4.hashCode()
            throw r4
        L57:
            java.lang.String r0 = r6.msisdn
            java.lang.String r1 = r7.msisdn
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L62
            return r5
        L62:
            java.lang.String r0 = r6.paymentMode
            java.lang.String r1 = r7.paymentMode
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L6d
            return r5
        L6d:
            java.lang.String r0 = r6.price
            java.lang.String r1 = r7.price
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L78
            return r5
        L78:
            java.lang.String r0 = r6.transactionId
            java.lang.String r1 = r7.transactionId
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L83
            return r5
        L83:
            java.lang.String r0 = r6.validity
            java.lang.String r7 = r7.validity
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
            if (r7 != 0) goto L8e
            return r5
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TiktokPayload.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.bundleName.hashCode() * 31) + this.customerType.hashCode()) * 31) + this.msisdn.hashCode()) * 31) + this.paymentMode.hashCode()) * 31) + this.price.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.validity.hashCode();
        int i4 = component2 + 9;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TiktokPayload(bundleName=" + this.bundleName + ", customerType=" + this.customerType + ", msisdn=" + this.msisdn + ", paymentMode=" + this.paymentMode + ", price=" + this.price + ", transactionId=" + this.transactionId + ", validity=" + this.validity + ")";
        int i2 = component1 + 115;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 1 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.bundleName);
        dest.writeString(this.customerType);
        dest.writeString(this.msisdn);
        dest.writeString(this.paymentMode);
        dest.writeString(this.price);
        dest.writeString(this.transactionId);
        dest.writeString(this.validity);
        int i4 = component2 + 19;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
