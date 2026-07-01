package com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.common.theme.ThemeManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003Jw\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÇ\u0001J\b\u0010'\u001a\u00020(H\u0007J\u0013\u0010)\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010+H×\u0003J\t\u0010,\u001a\u00020(H×\u0001J\t\u0010-\u001a\u00020\u0003H×\u0001J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020(H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/Account;", "Landroid/os/Parcelable;", "accountId", "", "lastMile", "autoRenewal", "", "deviceId", "deviceSerial", "macAddress", ThemeManager.ROLE, "estateId", "newCustomer", "reseller", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAccountId", "()Ljava/lang/String;", "getLastMile", "getAutoRenewal", "()Z", "getDeviceId", "getDeviceSerial", "getMacAddress", "getRole", "getEstateId", "getNewCustomer", "getReseller", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Account implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Account> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("autoRenewal")
    private final boolean autoRenewal;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName("deviceSerial")
    private final String deviceSerial;

    @SerializedName("estateId")
    private final String estateId;

    @SerializedName("lastMile")
    private final String lastMile;

    @SerializedName("macAddress")
    private final String macAddress;

    @SerializedName("newCustomer")
    private final boolean newCustomer;

    @SerializedName("reseller")
    private final boolean reseller;

    @SerializedName(ThemeManager.ROLE)
    private final String role;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Account> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[PHI: r2 r3
  0x003b: PHI (r2v10 java.lang.String) = (r2v4 java.lang.String), (r2v11 java.lang.String) binds: [B:8:0x0035, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r3v5 java.lang.String) = (r3v2 java.lang.String), (r3v6 java.lang.String) binds: [B:8:0x0035, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r2 r3
  0x0037: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v11 java.lang.String) binds: [B:8:0x0035, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v6 java.lang.String) binds: [B:8:0x0035, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.Account createFromParcel(android.os.Parcel r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 2
                int r2 = r1 % r1
                int r2 = com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.Account.Creator.component1
                int r2 = r2 + 85
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.Account.Creator.component2 = r3
                int r2 = r2 % r1
                java.lang.String r3 = ""
                r4 = 1
                r5 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
                if (r2 != 0) goto L29
                java.lang.String r2 = r18.readString()
                java.lang.String r3 = r18.readString()
                int r6 = r18.readInt()
                r7 = 9
                int r7 = r7 / r5
                if (r6 == 0) goto L3b
                goto L37
            L29:
                java.lang.String r2 = r18.readString()
                java.lang.String r3 = r18.readString()
                int r6 = r18.readInt()
                if (r6 == 0) goto L3b
            L37:
                r7 = r2
                r8 = r3
                r9 = r4
                goto L3e
            L3b:
                r7 = r2
                r8 = r3
                r9 = r5
            L3e:
                java.lang.String r10 = r18.readString()
                java.lang.String r11 = r18.readString()
                java.lang.String r12 = r18.readString()
                java.lang.String r13 = r18.readString()
                java.lang.String r14 = r18.readString()
                int r2 = r18.readInt()
                if (r2 == 0) goto L62
                int r2 = com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.Account.Creator.component1
                int r2 = r2 + r4
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.Account.Creator.component2 = r3
                int r2 = r2 % r1
                r15 = r4
                goto L63
            L62:
                r15 = r5
            L63:
                int r0 = r18.readInt()
                if (r0 == 0) goto L6c
                r16 = r4
                goto L6e
            L6c:
                r16 = r5
            L6e:
                com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.Account r0 = new com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.Account
                r6 = r0
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.Account.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.Account");
        }

        @Override
        public Account createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 121;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Account accountCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 113;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return accountCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Account[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 53;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            Account[] accountArr = new Account[i];
            int i6 = i4 + 67;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 12 / 0;
            }
            return accountArr;
        }

        @Override
        public Account[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 25;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            Account[] accountArrNewArray = newArray(i);
            int i5 = component2 + 17;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return accountArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Account(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.accountId = str;
        this.lastMile = str2;
        this.autoRenewal = z;
        this.deviceId = str3;
        this.deviceSerial = str4;
        this.macAddress = str5;
        this.role = str6;
        this.estateId = str7;
        this.newCustomer = z2;
        this.reseller = z3;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.accountId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getLastMile() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.lastMile;
        int i4 = i3 + 71;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean getAutoRenewal() {
        int i = 2 % 2;
        int i2 = component2 + 119;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        boolean z = this.autoRenewal;
        int i5 = i3 + 91;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getDeviceId() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.deviceId;
        }
        throw null;
    }

    public final String getDeviceSerial() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.deviceSerial;
        int i4 = i2 + 111;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getMacAddress() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.macAddress;
        int i5 = i2 + 57;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRole() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.role;
        int i5 = i2 + 111;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getEstateId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.estateId;
        int i5 = i2 + 93;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean getNewCustomer() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.newCustomer;
        }
        throw null;
    }

    public final boolean getReseller() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.reseller;
        int i5 = i3 + 43;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        int i = copydefault + 41;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static Account copy$default(Account account, String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, boolean z2, boolean z3, int i, Object obj) {
        boolean z4;
        String str8;
        String str9;
        boolean z5;
        int i2 = 2 % 2;
        String str10 = (i & 1) != 0 ? account.accountId : str;
        String str11 = (i & 2) != 0 ? account.lastMile : str2;
        if ((i & 4) != 0) {
            int i3 = component2 + 99;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                boolean z6 = account.autoRenewal;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            z4 = account.autoRenewal;
        } else {
            z4 = z;
        }
        String str12 = (i & 8) != 0 ? account.deviceId : str3;
        if ((i & 16) != 0) {
            int i4 = ShareDataUIState + 93;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            str8 = account.deviceSerial;
        } else {
            str8 = str4;
        }
        String str13 = (i & 32) != 0 ? account.macAddress : str5;
        String str14 = (i & 64) != 0 ? account.role : str6;
        if ((i & 128) != 0) {
            int i6 = ShareDataUIState + 15;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str9 = account.estateId;
        } else {
            str9 = str7;
        }
        if ((i & 256) != 0) {
            int i8 = ShareDataUIState + 21;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            z5 = account.newCustomer;
        } else {
            z5 = z2;
        }
        return account.copy(str10, str11, z4, str12, str8, str13, str14, str9, z5, (i & 512) != 0 ? account.reseller : z3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accountId;
        }
        throw null;
    }

    public final boolean component10() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.reseller;
        int i5 = i3 + 1;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.lastMile;
        int i5 = i3 + 87;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.autoRenewal;
        int i5 = i2 + 35;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.deviceId;
        int i5 = i3 + 53;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 21;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.deviceSerial;
            int i4 = 62 / 0;
        } else {
            str = this.deviceSerial;
        }
        int i5 = i2 + 89;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.macAddress;
        int i5 = i2 + 77;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.role;
        int i5 = i3 + 77;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.estateId;
        int i5 = i3 + 21;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.newCustomer;
        int i4 = i3 + 33;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return z;
    }

    public final Account copy(String accountId, String lastMile, boolean autoRenewal, String deviceId, String deviceSerial, String macAddress, String role, String estateId, boolean newCustomer, boolean reseller) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountId, "");
        Intrinsics.checkNotNullParameter(lastMile, "");
        Account account = new Account(accountId, lastMile, autoRenewal, deviceId, deviceSerial, macAddress, role, estateId, newCustomer, reseller);
        int i2 = ShareDataUIState + 57;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 69 / 0;
        }
        return account;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 59;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Account)) {
            return false;
        }
        Account account = (Account) other;
        if ((!Intrinsics.areEqual(this.accountId, account.accountId)) || !Intrinsics.areEqual(this.lastMile, account.lastMile) || this.autoRenewal != account.autoRenewal) {
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceId, account.deviceId)) {
            int i2 = component2 + 119;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.deviceSerial, account.deviceSerial)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.macAddress, account.macAddress)) {
            int i4 = component2 + 37;
            ShareDataUIState = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.role, account.role) || !Intrinsics.areEqual(this.estateId, account.estateId)) {
            return false;
        }
        if (this.newCustomer != account.newCustomer) {
            int i5 = component2 + 49;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.reseller == account.reseller) {
            return true;
        }
        int i7 = component2 + 75;
        ShareDataUIState = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.accountId.hashCode();
        int iHashCode4 = this.lastMile.hashCode();
        int iHashCode5 = Boolean.hashCode(this.autoRenewal);
        String str = this.deviceId;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = component2 + 23;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.deviceSerial;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.macAddress;
        if (str3 == null) {
            int i4 = component2 + 57;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
            int i6 = component2 + 1;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        String str4 = this.role;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.estateId;
        int iHashCode8 = (((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.newCustomer)) * 31) + Boolean.hashCode(this.reseller);
        int i8 = component2 + 9;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
        return iHashCode8;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Account(accountId=" + this.accountId + ", lastMile=" + this.lastMile + ", autoRenewal=" + this.autoRenewal + ", deviceId=" + this.deviceId + ", deviceSerial=" + this.deviceSerial + ", macAddress=" + this.macAddress + ", role=" + this.role + ", estateId=" + this.estateId + ", newCustomer=" + this.newCustomer + ", reseller=" + this.reseller + ")";
        int i2 = component2 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.accountId);
        dest.writeString(this.lastMile);
        dest.writeInt(this.autoRenewal ? 1 : 0);
        dest.writeString(this.deviceId);
        dest.writeString(this.deviceSerial);
        dest.writeString(this.macAddress);
        dest.writeString(this.role);
        dest.writeString(this.estateId);
        dest.writeInt(this.newCustomer ? 1 : 0);
        dest.writeInt(this.reseller ? 1 : 0);
        int i4 = ShareDataUIState + 19;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
