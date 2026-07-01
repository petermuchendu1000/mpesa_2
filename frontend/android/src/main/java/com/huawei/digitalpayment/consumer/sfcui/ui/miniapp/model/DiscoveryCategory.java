package com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JH\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0007H\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u0007H×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0007H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/DiscoveryCategory;", "Landroid/os/Parcelable;", "name", "", "color", "iconUrl", "order", "", GriverCacheDao.COLUMN_CACHE_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getColor", "getIconUrl", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/sfcui/ui/miniapp/model/DiscoveryCategory;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DiscoveryCategory implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DiscoveryCategory> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String color;
    private final String iconUrl;
    private final String id;
    private final String name;
    private final Integer order;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DiscoveryCategory> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DiscoveryCategory createFromParcel(Parcel parcel) {
            Integer numValueOf;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 35;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = component3 + 89;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 33 / 0;
                }
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new DiscoveryCategory(string, string2, string3, numValueOf, parcel.readString());
        }

        @Override
        public DiscoveryCategory createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 3;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DiscoveryCategory[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 81;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            DiscoveryCategory[] discoveryCategoryArr = new DiscoveryCategory[i];
            int i6 = i4 + 85;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return discoveryCategoryArr;
        }

        @Override
        public DiscoveryCategory[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 27;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            DiscoveryCategory[] discoveryCategoryArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 37;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return discoveryCategoryArrNewArray;
        }
    }

    public DiscoveryCategory(String str, String str2, String str3, Integer num, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.color = str2;
        this.iconUrl = str3;
        this.order = num;
        this.id = str4;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 69;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 83;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return str;
    }

    public final String getColor() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.color;
        int i5 = i3 + 101;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 34 / 0;
        }
        return str;
    }

    public final String getIconUrl() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.iconUrl;
        int i4 = i3 + 57;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DiscoveryCategory(String str, String str2, String str3, Integer num, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        if ((i & 2) != 0) {
            int i2 = component1 + 7;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = 2 % 2;
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            int i6 = component2 + 115;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            num = 0;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            int i8 = 2 % 2;
            str4 = "";
        }
        this(str, str5, str6, num2, str4);
    }

    public final Integer getOrder() {
        Integer num;
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            num = this.order;
            int i4 = 93 / 0;
        } else {
            num = this.order;
        }
        int i5 = i3 + 19;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return num;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 43;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static DiscoveryCategory copy$default(DiscoveryCategory discoveryCategory, String str, String str2, String str3, Integer num, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 67;
        component1 = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = discoveryCategory.name;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = discoveryCategory.color;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = discoveryCategory.iconUrl;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            num = discoveryCategory.order;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            int i5 = i3 + 123;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                String str8 = discoveryCategory.id;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str4 = discoveryCategory.id;
        }
        return discoveryCategory.copy(str5, str6, str7, num2, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 83;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 51;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.color;
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.iconUrl;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return str;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.order;
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return num;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.id;
            int i4 = 56 / 0;
        } else {
            str = this.id;
        }
        int i5 = i2 + 73;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final DiscoveryCategory copy(String name, String color, String iconUrl, Integer order, String id) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        DiscoveryCategory discoveryCategory = new DiscoveryCategory(name, color, iconUrl, order, id);
        int i2 = component2 + 97;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return discoveryCategory;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.name, r6.name) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.color, r6.color) == true) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component2 + 73;
        com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component1 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if ((r6 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.iconUrl, r6.iconUrl) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component1 + 25;
        com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.order, r6.order)) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component1 + 125;
        com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.id, r6.id) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component2 + 25;
        com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component1 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        return true;
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
            int r1 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component1
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component2 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 52
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory r6 = (com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory) r6
            java.lang.String r1 = r5.name
            java.lang.String r4 = r6.name
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L2b
            return r3
        L2b:
            java.lang.String r1 = r5.color
            java.lang.String r4 = r6.color
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 == r2) goto L46
            int r6 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component2
            int r6 = r6 + 73
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component1 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L41
            return r3
        L41:
            r6 = 0
            r6.hashCode()
            throw r6
        L46:
            java.lang.String r1 = r5.iconUrl
            java.lang.String r4 = r6.iconUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L5a
            int r6 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component1
            int r6 = r6 + 25
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component2 = r1
            int r6 = r6 % r0
            return r3
        L5a:
            java.lang.Integer r1 = r5.order
            java.lang.Integer r4 = r6.order
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r2
            if (r1 == 0) goto L6f
            int r6 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component1
            int r6 = r6 + 125
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component2 = r1
            int r6 = r6 % r0
            return r3
        L6f:
            java.lang.String r1 = r5.id
            java.lang.String r6 = r6.id
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L83
            int r6 = com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component2
            int r6 = r6 + 25
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.component1 = r1
            int r6 = r6 % r0
            return r3
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.ui.miniapp.model.DiscoveryCategory.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.name.hashCode();
        String str = this.color;
        if (str == null) {
            int i2 = component2 + 75;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.iconUrl;
        if (str2 == null) {
            int i4 = component2 + 25;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        Integer num = this.order;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str3 = this.id;
        return (((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DiscoveryCategory(name=" + this.name + ", color=" + this.color + ", iconUrl=" + this.iconUrl + ", order=" + this.order + ", id=" + this.id + ")";
        int i2 = component1 + 25;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = component2 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.name);
            dest.writeString(this.color);
            dest.writeString(this.iconUrl);
            throw null;
        }
        dest.writeString(this.name);
        dest.writeString(this.color);
        dest.writeString(this.iconUrl);
        Integer num = this.order;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.id);
        int i4 = component2 + 21;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
