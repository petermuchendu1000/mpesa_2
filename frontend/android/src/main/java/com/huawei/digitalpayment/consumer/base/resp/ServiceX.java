package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ServiceX;", "Landroid/os/Parcelable;", "groups", "", "Lcom/huawei/digitalpayment/consumer/base/resp/Group;", GriverCacheDao.COLUMN_CACHE_ID, "", "serviceDTO", "Lcom/huawei/digitalpayment/consumer/base/resp/ServiceDTO;", "status", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/base/resp/ServiceDTO;Ljava/lang/String;)V", "getGroups", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "getServiceDTO", "()Lcom/huawei/digitalpayment/consumer/base/resp/ServiceDTO;", "getStatus", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServiceX implements Parcelable {
    public static final Parcelable.Creator<ServiceX> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("groups")
    private final List<Group> groups;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final String id;

    @SerializedName("serviceDTO")
    private final ServiceDTO serviceDTO;

    @SerializedName("status")
    private final String status;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServiceX> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.base.resp.ServiceX createFromParcel(android.os.Parcel r9) {
            /*
                r8 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.String r1 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
                int r1 = r9.readInt()
                r2 = 0
                if (r1 != 0) goto L1d
                int r1 = com.huawei.digitalpayment.consumer.base.resp.ServiceX.Creator.ShareDataUIState
                int r1 = r1 + 55
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.base.resp.ServiceX.Creator.component2 = r3
                int r1 = r1 % r0
                if (r1 != 0) goto L1c
                r3 = r2
                goto L53
            L1c:
                throw r2
            L1d:
                int r1 = r9.readInt()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r1)
                r4 = 0
                r5 = r4
            L28:
                if (r5 == r1) goto L53
                int r6 = com.huawei.digitalpayment.consumer.base.resp.ServiceX.Creator.ShareDataUIState
                int r6 = r6 + 15
                int r7 = r6 % 128
                com.huawei.digitalpayment.consumer.base.resp.ServiceX.Creator.component2 = r7
                int r6 = r6 % r0
                if (r6 == 0) goto L3f
                int r6 = r9.readInt()
                r7 = 18
                int r7 = r7 / r4
                if (r6 != 0) goto L47
                goto L45
            L3f:
                int r6 = r9.readInt()
                if (r6 != 0) goto L47
            L45:
                r6 = r2
                goto L4d
            L47:
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.base.resp.Group> r6 = com.huawei.digitalpayment.consumer.base.resp.Group.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r9)
            L4d:
                r3.add(r6)
                int r5 = r5 + 1
                goto L28
            L53:
                java.util.List r3 = (java.util.List) r3
                java.lang.String r0 = r9.readString()
                int r1 = r9.readInt()
                if (r1 != 0) goto L60
                goto L66
            L60:
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.base.resp.ServiceDTO> r1 = com.huawei.digitalpayment.consumer.base.resp.ServiceDTO.CREATOR
                java.lang.Object r2 = r1.createFromParcel(r9)
            L66:
                com.huawei.digitalpayment.consumer.base.resp.ServiceX r1 = new com.huawei.digitalpayment.consumer.base.resp.ServiceX
                com.huawei.digitalpayment.consumer.base.resp.ServiceDTO r2 = (com.huawei.digitalpayment.consumer.base.resp.ServiceDTO) r2
                java.lang.String r9 = r9.readString()
                r1.<init>(r3, r0, r2, r9)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.ServiceX.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.base.resp.ServiceX");
        }

        @Override
        public ServiceX createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 85;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            ServiceX serviceXCreateFromParcel = createFromParcel(parcel);
            int i3 = component2 + 123;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return serviceXCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ServiceX[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 121;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            ServiceX[] serviceXArr = new ServiceX[i];
            int i6 = i4 + 87;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return serviceXArr;
        }

        @Override
        public ServiceX[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 119;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public ServiceX(List<Group> list, String str, ServiceDTO serviceDTO, String str2) {
        this.groups = list;
        this.id = str;
        this.serviceDTO = serviceDTO;
        this.status = str2;
    }

    public final List<Group> getGroups() {
        List<Group> list;
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            list = this.groups;
            int i4 = 52 / 0;
        } else {
            list = this.groups;
        }
        int i5 = i3 + 29;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.id;
        }
        throw null;
    }

    public final ServiceDTO getServiceDTO() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 119;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ServiceDTO serviceDTO = this.serviceDTO;
        int i5 = i2 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return serviceDTO;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.status;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 53;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ServiceX copy$default(ServiceX serviceX, List list, String str, ServiceDTO serviceDTO, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 23;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            list = serviceX.groups;
        }
        if ((i & 2) != 0) {
            str = serviceX.id;
        }
        if ((i & 4) != 0) {
            serviceDTO = serviceX.serviceDTO;
            int i5 = i4 + 99;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 3;
            }
        }
        if ((i & 8) != 0) {
            str2 = serviceX.status;
        }
        return serviceX.copy(list, str, serviceDTO, str2);
    }

    public final List<Group> component1() {
        List<Group> list;
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            list = this.groups;
            int i4 = 78 / 0;
        } else {
            list = this.groups;
        }
        int i5 = i3 + 31;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 47;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ServiceDTO component3() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ServiceDTO serviceDTO = this.serviceDTO;
        int i5 = i3 + 103;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return serviceDTO;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.status;
        int i4 = i2 + 27;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final ServiceX copy(List<Group> groups, String id, ServiceDTO serviceDTO, String status) {
        int i = 2 % 2;
        ServiceX serviceX = new ServiceX(groups, id, serviceDTO, status);
        int i2 = component2 + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return serviceX;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.base.resp.ServiceX) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r1 = r1 + 11;
        com.huawei.digitalpayment.consumer.base.resp.ServiceX.component1 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.base.resp.ServiceX) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.groups, r6.groups) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.id, r6.id) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.serviceDTO, r6.serviceDTO) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.status, r6.status) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.base.resp.ServiceX.component1 + 69;
        com.huawei.digitalpayment.consumer.base.resp.ServiceX.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 9;
        com.huawei.digitalpayment.consumer.base.resp.ServiceX.component1 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) == 0) goto L11;
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
            int r1 = com.huawei.digitalpayment.consumer.base.resp.ServiceX.component2
            int r2 = r1 + 17
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.resp.ServiceX.component1 = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 47
            int r2 = r2 / r4
            if (r5 != r6) goto L23
            goto L18
        L16:
            if (r5 != r6) goto L23
        L18:
            int r1 = r1 + 9
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.base.resp.ServiceX.component1 = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L22
            return r4
        L22:
            return r3
        L23:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.base.resp.ServiceX
            if (r2 != 0) goto L2f
            int r1 = r1 + 11
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.base.resp.ServiceX.component1 = r6
            int r1 = r1 % r0
            return r4
        L2f:
            com.huawei.digitalpayment.consumer.base.resp.ServiceX r6 = (com.huawei.digitalpayment.consumer.base.resp.ServiceX) r6
            java.util.List<com.huawei.digitalpayment.consumer.base.resp.Group> r1 = r5.groups
            java.util.List<com.huawei.digitalpayment.consumer.base.resp.Group> r2 = r6.groups
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L3c
            return r4
        L3c:
            java.lang.String r1 = r5.id
            java.lang.String r2 = r6.id
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L47
            return r4
        L47:
            com.huawei.digitalpayment.consumer.base.resp.ServiceDTO r1 = r5.serviceDTO
            com.huawei.digitalpayment.consumer.base.resp.ServiceDTO r2 = r6.serviceDTO
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L52
            return r4
        L52:
            java.lang.String r1 = r5.status
            java.lang.String r6 = r6.status
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L5d
            return r4
        L5d:
            int r6 = com.huawei.digitalpayment.consumer.base.resp.ServiceX.component1
            int r6 = r6 + 69
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.base.resp.ServiceX.component2 = r1
            int r6 = r6 % r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.ServiceX.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        List<Group> list = this.groups;
        if (list == null) {
            int i2 = component2 + 35;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        String str = this.id;
        if (str == null) {
            int i4 = component2;
            int i5 = i4 + 77;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 47;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        ServiceDTO serviceDTO = this.serviceDTO;
        if (serviceDTO == null) {
            int i9 = component2 + 51;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = serviceDTO.hashCode();
        }
        String str2 = this.status;
        int iHashCode4 = (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 == null ? 0 : str2.hashCode());
        int i11 = component1 + 49;
        component2 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 90 / 0;
        }
        return iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ServiceX(groups=" + this.groups + ", id=" + this.id + ", serviceDTO=" + this.serviceDTO + ", status=" + this.status + ")";
        int i2 = component1 + 65;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<Group> list = this.groups;
        if (list == null) {
            int i2 = component2 + 83;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            for (Group group : list) {
                if (group == null) {
                    int i4 = component2 + 61;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    dest.writeInt(0);
                    int i6 = component2 + 11;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    dest.writeInt(1);
                    group.writeToParcel(dest, flags);
                }
            }
        }
        dest.writeString(this.id);
        ServiceDTO serviceDTO = this.serviceDTO;
        if (serviceDTO == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            serviceDTO.writeToParcel(dest, flags);
        }
        dest.writeString(this.status);
        int i8 = component1 + 27;
        component2 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 82 / 0;
        }
    }
}
