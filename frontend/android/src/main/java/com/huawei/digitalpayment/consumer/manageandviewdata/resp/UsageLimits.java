package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.griver.beehive.lottie.constants.LottieConstants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/UsageLimits;", "Lkotlin/collections/ArrayList;", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/UsageLimits$UsageLimitsItem;", "Ljava/util/ArrayList;", "<init>", "()V", "UsageLimitsItem", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UsageLimits extends ArrayList<UsageLimitsItem> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 65 % 128;
    private static int component2 = 1;
    private static int component3;

    public boolean contains(UsageLimitsItem usageLimitsItem) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        boolean zContains = super.contains((Object) usageLimitsItem);
        int i4 = ShareDataUIState + 63;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return zContains;
    }

    @Override
    public final boolean contains(Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (!(obj instanceof UsageLimitsItem)) {
            int i5 = i2 + 15;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        boolean zContains = contains((UsageLimitsItem) obj);
        int i7 = component2 + 117;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 77 / 0;
        }
        return zContains;
    }

    public int getSize() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int size = super.size();
        int i4 = component2 + 75;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return size;
    }

    public int indexOf(UsageLimitsItem usageLimitsItem) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iIndexOf = super.indexOf((Object) usageLimitsItem);
        int i4 = component2 + 47;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iIndexOf;
        }
        throw null;
    }

    @Override
    public final int indexOf(Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 13;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (!(obj instanceof UsageLimitsItem)) {
            int i5 = i2 + 25;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return -1;
        }
        int iIndexOf = indexOf((UsageLimitsItem) obj);
        int i7 = component2 + 49;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return iIndexOf;
    }

    public int lastIndexOf(UsageLimitsItem usageLimitsItem) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iLastIndexOf = super.lastIndexOf((Object) usageLimitsItem);
        int i4 = component2 + 37;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iLastIndexOf;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (!(obj instanceof UsageLimitsItem)) {
            int i5 = i2 + 45;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return -1;
        }
        int iLastIndexOf = lastIndexOf((UsageLimitsItem) obj);
        int i7 = component2 + 113;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 == 0) {
            return iLastIndexOf;
        }
        throw null;
    }

    @Override
    public final UsageLimitsItem remove(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 83;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return removeAt(i);
        }
        removeAt(i);
        throw null;
    }

    public boolean remove(UsageLimitsItem usageLimitsItem) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zRemove = super.remove((Object) usageLimitsItem);
        int i4 = ShareDataUIState + 67;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return zRemove;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r5 = remove((com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.UsageLimitsItem) r5);
        r1 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.component2 + 55;
        com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.ShareDataUIState = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r5 instanceof com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.UsageLimitsItem) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if ((r5 instanceof com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.UsageLimitsItem) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        return false;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.component2
            int r1 = r1 + 29
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L17
            boolean r1 = r5 instanceof com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.UsageLimitsItem
            r3 = 74
            int r3 = r3 / r2
            if (r1 != 0) goto L1c
            goto L1b
        L17:
            boolean r1 = r5 instanceof com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.UsageLimitsItem
            if (r1 != 0) goto L1c
        L1b:
            return r2
        L1c:
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits$UsageLimitsItem r5 = (com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.UsageLimitsItem) r5
            boolean r5 = r4.remove(r5)
            int r1 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.component2
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L2e
            return r5
        L2e:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.resp.UsageLimits.remove(java.lang.Object):boolean");
    }

    public UsageLimitsItem removeAt(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        UsageLimitsItem usageLimitsItem = (UsageLimitsItem) super.remove(i);
        if (i4 != 0) {
            return usageLimitsItem;
        }
        throw null;
    }

    @Override
    public final int size() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return getSize();
        }
        getSize();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0005H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/UsageLimits$UsageLimitsItem;", "", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", LottieConstants.PARAM_MAX_VALUE, "", LottieConstants.PARAM_MIN_VALUE, "type", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getMax", "()I", "getMin", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UsageLimitsItem {
        public static final int $stable = 0;
        private static int component4 = 0;
        private static int copy = 1;
        private static int copydefault = 0;
        private static int getAsAtTimestamp = 19 % 128;

        @SerializedName(LottieConstants.PARAM_MAX_VALUE)
        private final int ShareDataUIState;

        @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
        private final String component1;

        @SerializedName("type")
        private final String component2;

        @SerializedName(LottieConstants.PARAM_MIN_VALUE)
        private final int component3;

        public UsageLimitsItem(String str, int i, int i2, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.component1 = str;
            this.ShareDataUIState = i;
            this.component3 = i2;
            this.component2 = str2;
        }

        public final String getCategory() {
            String str;
            int i = 2 % 2;
            int i2 = component4 + 93;
            int i3 = i2 % 128;
            copy = i3;
            if (i2 % 2 == 0) {
                str = this.component1;
                int i4 = 21 / 0;
            } else {
                str = this.component1;
            }
            int i5 = i3 + 109;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final int getMax() {
            int i = 2 % 2;
            int i2 = copy + 19;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.ShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int getMin() {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 87;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.component3;
            int i6 = i2 + 79;
            component4 = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getType() {
            String str;
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 119;
            component4 = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.component2;
                int i4 = 47 / 0;
            } else {
                str = this.component2;
            }
            int i5 = i2 + 7;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        static {
            if (19 % 2 == 0) {
                throw null;
            }
        }

        public static UsageLimitsItem copy$default(UsageLimitsItem usageLimitsItem, String str, int i, int i2, String str2, int i3, Object obj) {
            int i4 = 2 % 2;
            int i5 = component4 + 55;
            int i6 = i5 % 128;
            copy = i6;
            if (i5 % 2 != 0 && (i3 & 1) != 0) {
                str = usageLimitsItem.component1;
            }
            if ((i3 & 2) != 0) {
                i = usageLimitsItem.ShareDataUIState;
            }
            if ((i3 & 4) != 0) {
                int i7 = i6 + 25;
                component4 = i7 % 128;
                int i8 = i7 % 2;
                i2 = usageLimitsItem.component3;
            }
            if ((i3 & 8) != 0) {
                str2 = usageLimitsItem.component2;
            }
            return usageLimitsItem.copy(str, i, i2, str2);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component4 + 59;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            String str = this.component1;
            int i5 = i3 + 9;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final int component2() {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 15;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.ShareDataUIState;
            int i6 = i2 + 81;
            component4 = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            throw null;
        }

        public final int component3() {
            int i = 2 % 2;
            int i2 = component4 + 71;
            copy = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.component3;
            if (i3 == 0) {
                int i5 = 73 / 0;
            }
            return i4;
        }

        public final String component4() {
            int i = 2 % 2;
            int i2 = copy + 67;
            int i3 = i2 % 128;
            component4 = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.component2;
            int i4 = i3 + 105;
            copy = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final UsageLimitsItem copy(String category, int max, int min, String type) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(category, "");
            Intrinsics.checkNotNullParameter(type, "");
            UsageLimitsItem usageLimitsItem = new UsageLimitsItem(category, max, min, type);
            int i2 = component4 + 103;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return usageLimitsItem;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copy + 19;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof UsageLimitsItem)) {
                return false;
            }
            UsageLimitsItem usageLimitsItem = (UsageLimitsItem) other;
            if (!Intrinsics.areEqual(this.component1, usageLimitsItem.component1)) {
                return false;
            }
            if (this.ShareDataUIState != usageLimitsItem.ShareDataUIState) {
                int i4 = copy + 45;
                component4 = i4 % 128;
                return i4 % 2 != 0;
            }
            if (this.component3 != usageLimitsItem.component3) {
                return false;
            }
            if (Intrinsics.areEqual(this.component2, usageLimitsItem.component2)) {
                return true;
            }
            int i5 = copy + 91;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copy + 29;
            component4 = i2 % 128;
            int iHashCode = i2 % 2 != 0 ? (((((this.component1.hashCode() >> 51) >>> Integer.hashCode(this.ShareDataUIState)) >> 63) >> Integer.hashCode(this.component3)) / 67) / this.component2.hashCode() : (((((this.component1.hashCode() * 31) + Integer.hashCode(this.ShareDataUIState)) * 31) + Integer.hashCode(this.component3)) * 31) + this.component2.hashCode();
            int i3 = component4 + 119;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "UsageLimitsItem(category=" + this.component1 + ", max=" + this.ShareDataUIState + ", min=" + this.component3 + ", type=" + this.component2 + ")";
            int i2 = component4 + 43;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    static {
        int i = 65 % 2;
    }
}
