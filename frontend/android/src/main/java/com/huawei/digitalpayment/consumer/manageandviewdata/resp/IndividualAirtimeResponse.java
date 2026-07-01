package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0006H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/IndividualAirtimeResponse;", "Landroid/os/Parcelable;", "airtimeUsageList", "", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/IndividualAirtimeUsage;", "total", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getAirtimeUsageList", "()Ljava/util/List;", "getTotal", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndividualAirtimeResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<IndividualAirtimeResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("airtimeUsageList")
    private final List<IndividualAirtimeUsage> airtimeUsageList;

    @SerializedName("total")
    private final String total;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndividualAirtimeResponse> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IndividualAirtimeResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            int i2 = component3 + 119;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Object obj = null;
            if (parcel.readInt() == 0) {
                int i4 = component3 + 101;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                arrayList = null;
            } else {
                int i5 = parcel.readInt();
                arrayList = new ArrayList(i5);
                int i6 = 0;
                while (i6 != i5) {
                    int i7 = component3 + 57;
                    ShareDataUIState = i7 % 128;
                    if (i7 % 2 == 0) {
                        arrayList.add(IndividualAirtimeUsage.CREATOR.createFromParcel(parcel));
                        i6 += 26;
                    } else {
                        arrayList.add(IndividualAirtimeUsage.CREATOR.createFromParcel(parcel));
                        i6++;
                    }
                }
            }
            IndividualAirtimeResponse individualAirtimeResponse = new IndividualAirtimeResponse(arrayList, parcel.readString());
            int i8 = component3 + 67;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                return individualAirtimeResponse;
            }
            throw null;
        }

        @Override
        public IndividualAirtimeResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 53;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IndividualAirtimeResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 97;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            IndividualAirtimeResponse[] individualAirtimeResponseArr = new IndividualAirtimeResponse[i];
            int i6 = i4 + 21;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 13 / 0;
            }
            return individualAirtimeResponseArr;
        }

        @Override
        public IndividualAirtimeResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 29;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            IndividualAirtimeResponse[] individualAirtimeResponseArrNewArray = newArray(i);
            int i5 = component3 + 5;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return individualAirtimeResponseArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public IndividualAirtimeResponse(List<IndividualAirtimeUsage> list, String str) {
        this.airtimeUsageList = list;
        this.total = str;
    }

    public final List<IndividualAirtimeUsage> getAirtimeUsageList() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.airtimeUsageList;
        }
        throw null;
    }

    public final String getTotal() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 83;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.total;
        int i5 = i2 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = copydefault + 27;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static IndividualAirtimeResponse copy$default(IndividualAirtimeResponse individualAirtimeResponse, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 91;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            list = individualAirtimeResponse.airtimeUsageList;
            int i6 = i3 + 67;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            int i8 = ShareDataUIState + 17;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                str = individualAirtimeResponse.total;
                int i9 = 12 / 0;
            } else {
                str = individualAirtimeResponse.total;
            }
        }
        return individualAirtimeResponse.copy(list, str);
    }

    public final List<IndividualAirtimeUsage> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<IndividualAirtimeUsage> list = this.airtimeUsageList;
        int i5 = i3 + 77;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.total;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final IndividualAirtimeResponse copy(List<IndividualAirtimeUsage> airtimeUsageList, String total) {
        int i = 2 % 2;
        IndividualAirtimeResponse individualAirtimeResponse = new IndividualAirtimeResponse(airtimeUsageList, total);
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return individualAirtimeResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 53;
        com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.component3 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.airtimeUsageList, r6.airtimeUsageList) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.component3 + 47;
        com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.ShareDataUIState = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.total, r6.total) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.ShareDataUIState + 125;
        com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.component3 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if ((r6 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r6 = 15 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.ShareDataUIState
            int r2 = r1 + 3
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.component3 = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 28
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse
            if (r2 != 0) goto L25
            int r1 = r1 + 53
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.component3 = r6
            int r1 = r1 % r0
            return r4
        L25:
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse r6 = (com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse) r6
            java.util.List<com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeUsage> r1 = r5.airtimeUsageList
            java.util.List<com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeUsage> r2 = r6.airtimeUsageList
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L3b
            int r6 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.component3
            int r6 = r6 + 47
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.ShareDataUIState = r1
            int r6 = r6 % r0
            return r4
        L3b:
            java.lang.String r1 = r5.total
            java.lang.String r6 = r6.total
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 == 0) goto L46
            return r3
        L46:
            int r6 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.ShareDataUIState
            int r6 = r6 + 125
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.component3 = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L54
            r6 = 15
            int r6 = r6 / r4
        L54:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        List<IndividualAirtimeUsage> list = this.airtimeUsageList;
        int iHashCode2 = 0;
        if (list == null) {
            int i2 = component3 + 79;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        String str = this.total;
        if (str != null) {
            iHashCode2 = str.hashCode();
            int i4 = ShareDataUIState + 123;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        return (iHashCode * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IndividualAirtimeResponse(airtimeUsageList=" + this.airtimeUsageList + ", total=" + this.total + ")";
        int i2 = component3 + 7;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<IndividualAirtimeUsage> list = this.airtimeUsageList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<IndividualAirtimeUsage> it = list.iterator();
            int i4 = ShareDataUIState + 1;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 / 3;
            }
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
                int i6 = component3 + 37;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        dest.writeString(this.total);
    }
}
