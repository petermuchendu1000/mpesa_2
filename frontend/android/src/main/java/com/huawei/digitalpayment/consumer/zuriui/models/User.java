package com.huawei.digitalpayment.consumer.zuriui.models;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/models/User;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getAvatar", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcZuriUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class User {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component2 = 85 % 128;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final String component1;
    private final String component3;
    private final String copydefault;

    public User(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component1 = str;
        this.copydefault = str2;
        this.component3 = str3;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 85;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 73;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 99;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 69;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAvatar() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 85 % 2;
    }

    public static User copy$default(User user, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 21;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 61;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                String str4 = user.component1;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = user.component1;
        }
        if ((i & 2) != 0) {
            int i7 = i3 + 87;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            str2 = user.copydefault;
        }
        if ((i & 4) != 0) {
            int i9 = i3 + 43;
            getRequestBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            str3 = user.component3;
            if (i10 != 0) {
                int i11 = 70 / 0;
            }
        }
        return user.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 25;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 83;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 9;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 119;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 115;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return str;
    }

    public final User copy(String id, String name, String avatar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(name, "");
        User user = new User(id, name, avatar);
        int i2 = getRequestBeneficiariesState + 23;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return user;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.zuriui.models.User) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.zuriui.models.User) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.component1, r6.component1)) == true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.zuriui.models.User.getRequestBeneficiariesState + 7;
        com.huawei.digitalpayment.consumer.zuriui.models.User.getAsAtTimestamp = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if ((r6 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.zuriui.models.User.getRequestBeneficiariesState
            int r1 = r1 + 25
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.zuriui.models.User.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 18
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.zuriui.models.User
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.zuriui.models.User r6 = (com.huawei.digitalpayment.consumer.zuriui.models.User) r6
            java.lang.String r1 = r5.component1
            java.lang.String r4 = r6.component1
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r2
            if (r1 == r2) goto L42
            java.lang.String r0 = r5.copydefault
            java.lang.String r1 = r6.copydefault
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L36
            return r3
        L36:
            java.lang.String r0 = r5.component3
            java.lang.String r6 = r6.component3
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L41
            return r3
        L41:
            return r2
        L42:
            int r6 = com.huawei.digitalpayment.consumer.zuriui.models.User.getRequestBeneficiariesState
            int r6 = r6 + 7
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.zuriui.models.User.getAsAtTimestamp = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L4e
            return r2
        L4e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.models.User.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 17;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component1.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        String str = this.component3;
        int iHashCode3 = (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
        int i4 = getAsAtTimestamp + 65;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "User(id=" + this.component1 + ", name=" + this.copydefault + ", avatar=" + this.component3 + ')';
        int i2 = getRequestBeneficiariesState + 121;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
