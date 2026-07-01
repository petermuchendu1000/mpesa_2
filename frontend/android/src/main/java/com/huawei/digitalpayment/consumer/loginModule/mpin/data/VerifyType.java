package com.huawei.digitalpayment.consumer.loginModule.mpin.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003JE\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyType;", "Lcom/huawei/http/BaseResp;", "Landroid/os/Parcelable;", "status", "", Keys.VERIFY_TYPE, "verifyName", "verifyUrl", "businessType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getVerifyType", "getVerifyName", "getVerifyUrl", "getBusinessType", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyType extends BaseResp implements Parcelable {
    public static final Parcelable.Creator<VerifyType> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final String businessType;
    private final String status;
    private final String verifyName;
    private final String verifyType;
    private final String verifyUrl;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerifyType> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final VerifyType createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            VerifyType verifyType = new VerifyType(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 91;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return verifyType;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public VerifyType createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 105;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            VerifyType verifyTypeCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 11;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return verifyTypeCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final VerifyType[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 119;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            VerifyType[] verifyTypeArr = new VerifyType[i];
            int i6 = i4 + 1;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return verifyTypeArr;
            }
            throw null;
        }

        @Override
        public VerifyType[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 47;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            VerifyType[] verifyTypeArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 58 / 0;
            }
            return verifyTypeArrNewArray;
        }
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.status;
        int i4 = i2 + 81;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getVerifyType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.verifyType;
        int i5 = i2 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getVerifyName() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.verifyName;
        int i5 = i3 + 89;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getVerifyUrl() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.verifyUrl;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public final String getBusinessType() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.businessType;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public VerifyType(String str, String str2, String str3, String str4, String str5) {
        this.status = str;
        this.verifyType = str2;
        this.verifyName = str3;
        this.verifyUrl = str4;
        this.businessType = str5;
    }

    static {
        int i = ShareDataUIState + 91;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static VerifyType copy$default(VerifyType verifyType, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = verifyType.status;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            int i3 = component1 + 125;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str2 = verifyType.verifyType;
            if (i4 == 0) {
                int i5 = 29 / 0;
            }
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            int i6 = component1 + 93;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str3 = verifyType.verifyName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i8 = component1 + 71;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            str4 = verifyType.verifyUrl;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = verifyType.businessType;
        }
        return verifyType.copy(str6, str7, str8, str9, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.status;
        int i5 = i2 + 11;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 37;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.verifyType;
            int i4 = 49 / 0;
        } else {
            str = this.verifyType;
        }
        int i5 = i3 + 57;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.verifyName;
        int i4 = i3 + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 117;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.verifyUrl;
            int i4 = 98 / 0;
        } else {
            str = this.verifyUrl;
        }
        int i5 = i3 + 53;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.businessType;
        }
        int i3 = 2 / 0;
        return this.businessType;
    }

    public final VerifyType copy(String status, String verifyType, String verifyName, String verifyUrl, String businessType) {
        int i = 2 % 2;
        VerifyType verifyType2 = new VerifyType(status, verifyType, verifyName, verifyUrl, businessType);
        int i2 = component1 + 33;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return verifyType2;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        r1 = r1 + 87;
        com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.status, r6.status) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1 + 113;
        com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component3 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.verifyType, r6.verifyType) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.verifyName, r6.verifyName)) == true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.verifyUrl, r6.verifyUrl) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1 + 121;
        com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component3 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.businessType, r6.businessType) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1 + 11;
        com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component3 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 125;
        com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component3
            int r2 = r1 + 95
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1 = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L15
            int r2 = r4 / r4
            if (r5 != r6) goto L1f
            goto L17
        L15:
            if (r5 != r6) goto L1f
        L17:
            int r1 = r1 + 125
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1 = r6
            int r1 = r1 % r0
            return r3
        L1f:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType
            if (r2 != 0) goto L2b
            int r1 = r1 + 87
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1 = r6
            int r1 = r1 % r0
            return r4
        L2b:
            com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType r6 = (com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType) r6
            java.lang.String r1 = r5.status
            java.lang.String r2 = r6.status
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L41
            int r6 = com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1
            int r6 = r6 + 113
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component3 = r1
            int r6 = r6 % r0
            return r4
        L41:
            java.lang.String r1 = r5.verifyType
            java.lang.String r2 = r6.verifyType
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L4c
            return r4
        L4c:
            java.lang.String r1 = r5.verifyName
            java.lang.String r2 = r6.verifyName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r1 = r1 ^ r3
            if (r1 == r3) goto L80
            java.lang.String r1 = r5.verifyUrl
            java.lang.String r2 = r6.verifyUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L6b
            int r6 = com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1
            int r6 = r6 + 121
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component3 = r1
            int r6 = r6 % r0
            return r4
        L6b:
            java.lang.String r1 = r5.businessType
            java.lang.String r6 = r6.businessType
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L7f
            int r6 = com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1
            int r6 = r6 + 11
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component3 = r1
            int r6 = r6 % r0
            return r4
        L7f:
            return r3
        L80:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v15 java.lang.String) = (r1v4 java.lang.String), (r1v17 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L15
            java.lang.String r1 = r8.status
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            java.lang.String r1 = r8.status
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            java.lang.String r4 = r8.verifyType
            if (r4 != 0) goto L26
            r4 = r2
            goto L2a
        L26:
            int r4 = r4.hashCode()
        L2a:
            java.lang.String r5 = r8.verifyName
            if (r5 != 0) goto L30
            r5 = r2
            goto L34
        L30:
            int r5 = r5.hashCode()
        L34:
            java.lang.String r6 = r8.verifyUrl
            if (r6 != 0) goto L42
            int r6 = com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component3
            int r6 = r6 + 25
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.component1 = r7
            int r6 = r6 % r0
            goto L46
        L42:
            int r2 = r6.hashCode()
        L46:
            java.lang.String r0 = r8.businessType
            if (r0 != 0) goto L4b
            goto L4f
        L4b:
            int r3 = r0.hashCode()
        L4f:
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyType.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyType(status=" + this.status + ", verifyType=" + this.verifyType + ", verifyName=" + this.verifyName + ", verifyUrl=" + this.verifyUrl + ", businessType=" + this.businessType + ")";
        int i2 = component1 + 59;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.status);
        dest.writeString(this.verifyType);
        dest.writeString(this.verifyName);
        dest.writeString(this.verifyUrl);
        dest.writeString(this.businessType);
        int i4 = component3 + 29;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
