package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bHÆ\u0003Jz\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\fJ\u0013\u0010*\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\fHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018¨\u00064"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/Category;", "Landroid/os/Parcelable;", "categoryName", "", "color", "default", "", "externalCategoryIds", "", "iconUrl", GriverCacheDao.COLUMN_CACHE_ID, "order", "", "services", "Lcom/huawei/digitalpayment/consumer/base/resp/Service;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getCategoryName", "()Ljava/lang/String;", "getColor", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExternalCategoryIds", "()Ljava/util/List;", "getIconUrl", "getId", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getServices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lcom/huawei/digitalpayment/consumer/base/resp/Category;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Category implements Parcelable {
    public static final Parcelable.Creator<Category> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("categoryName")
    private final String categoryName;

    @SerializedName("color")
    private final String color;

    @SerializedName("default")
    private final Boolean default;

    @SerializedName("externalCategoryIds")
    private final List<String> externalCategoryIds;

    @SerializedName("iconUrl")
    private final String iconUrl;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final String id;

    @SerializedName("order")
    private final Integer order;

    @SerializedName("services")
    private final List<Service> services;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Category> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v4, types: [int] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.base.resp.Category createFromParcel(android.os.Parcel r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 2
                int r2 = r1 % r1
                int r2 = com.huawei.digitalpayment.consumer.base.resp.Category.Creator.component2
                int r2 = r2 + 93
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.base.resp.Category.Creator.component1 = r3
                int r2 = r2 % r1
                java.lang.String r3 = ""
                r4 = 1
                r5 = 0
                r6 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
                if (r2 != 0) goto L29
                java.lang.String r2 = r18.readString()
                java.lang.String r3 = r18.readString()
                int r7 = r18.readInt()
                if (r7 != 0) goto L27
                goto L38
            L27:
                r7 = r4
                goto L3d
            L29:
                java.lang.String r2 = r18.readString()
                java.lang.String r3 = r18.readString()
                int r7 = r18.readInt()
                if (r7 != 0) goto L3c
                r4 = r5
            L38:
                r9 = r2
                r10 = r3
                r11 = r6
                goto L57
            L3c:
                r7 = r5
            L3d:
                int r8 = r18.readInt()
                if (r8 == 0) goto L4e
                int r8 = com.huawei.digitalpayment.consumer.base.resp.Category.Creator.component2
                int r8 = r8 + 109
                int r9 = r8 % 128
                com.huawei.digitalpayment.consumer.base.resp.Category.Creator.component1 = r9
                int r8 = r8 % r1
                if (r8 != 0) goto L4f
            L4e:
                r4 = r5
            L4f:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r9 = r2
                r10 = r3
                r11 = r4
                r4 = r7
            L57:
                java.util.ArrayList r2 = r18.createStringArrayList()
                r12 = r2
                java.util.List r12 = (java.util.List) r12
                java.lang.String r13 = r18.readString()
                java.lang.String r14 = r18.readString()
                int r2 = r18.readInt()
                if (r2 != 0) goto L77
                int r2 = com.huawei.digitalpayment.consumer.base.resp.Category.Creator.component2
                int r2 = r2 + 83
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.base.resp.Category.Creator.component1 = r3
                int r2 = r2 % r1
                r15 = r6
                goto L80
            L77:
                int r1 = r18.readInt()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r15 = r1
            L80:
                int r1 = r18.readInt()
                if (r1 != 0) goto L87
                goto L9e
            L87:
                int r1 = r18.readInt()
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>(r1)
            L90:
                if (r4 == r1) goto L9e
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.base.resp.Service> r2 = com.huawei.digitalpayment.consumer.base.resp.Service.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r0)
                r6.add(r2)
                int r4 = r4 + 1
                goto L90
            L9e:
                com.huawei.digitalpayment.consumer.base.resp.Category r0 = new com.huawei.digitalpayment.consumer.base.resp.Category
                r16 = r6
                java.util.List r16 = (java.util.List) r16
                r8 = r0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.Category.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.base.resp.Category");
        }

        @Override
        public Category createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 1;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Category categoryCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 6 / 0;
            }
            int i5 = component1 + 83;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return categoryCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Category[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 43;
            component1 = i3 % 128;
            Category[] categoryArr = new Category[i];
            if (i3 % 2 != 0) {
                return categoryArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Category[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 111;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Category[] categoryArrNewArray = newArray(i);
            int i5 = component2 + 41;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return categoryArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Category(String str, String str2, Boolean bool, List<String> list, String str3, String str4, Integer num, List<Service> list2) {
        this.categoryName = str;
        this.color = str2;
        this.default = bool;
        this.externalCategoryIds = list;
        this.iconUrl = str3;
        this.id = str4;
        this.order = num;
        this.services = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Category(String str, String str2, Boolean bool, List list, String str3, String str4, Integer num, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        Boolean bool2;
        List listEmptyList;
        String str6;
        List listEmptyList2;
        Integer num2 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str5 = null;
        } else {
            str5 = str;
        }
        String str7 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i3 = component2 + 93;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            bool2 = false;
        } else {
            bool2 = bool;
        }
        if ((i & 8) != 0) {
            int i5 = ShareDataUIState + 91;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list;
        }
        if ((i & 16) != 0) {
            int i6 = component2 + 49;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str6 = null;
        } else {
            str6 = str3;
        }
        String str8 = (i & 32) != 0 ? null : str4;
        if ((i & 64) != 0) {
            int i8 = component2 + 13;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 23 / 0;
            }
        } else {
            num2 = num;
        }
        if ((i & 128) != 0) {
            listEmptyList2 = CollectionsKt.emptyList();
            int i10 = 2 % 2;
        } else {
            listEmptyList2 = list2;
        }
        this(str5, str7, bool2, listEmptyList, str6, str8, num2, listEmptyList2);
    }

    public final String getCategoryName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.categoryName;
        int i5 = i2 + 13;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getColor() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.color;
        int i5 = i2 + 49;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean getDefault() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Boolean bool = this.default;
        int i5 = i3 + 81;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return bool;
    }

    public final List<String> getExternalCategoryIds() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.externalCategoryIds;
        }
        throw null;
    }

    public final String getIconUrl() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.iconUrl;
        int i4 = i2 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 121;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 1;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        Integer num = this.order;
        int i4 = i2 + 15;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public final List<Service> getServices() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.services;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 37;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public Category() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Category copy$default(Category category, String str, String str2, Boolean bool, List list, String str3, String str4, Integer num, List list2, int i, Object obj) {
        Boolean bool2;
        List list3;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 95;
        component2 = i4 % 128;
        String str5 = (i4 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : category.categoryName;
        String str6 = (i & 2) != 0 ? category.color : str2;
        if ((i & 4) != 0) {
            bool2 = category.default;
            int i5 = i3 + 69;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            bool2 = bool;
        }
        if ((i & 8) != 0) {
            int i7 = component2 + 57;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                List<String> list4 = category.externalCategoryIds;
                throw null;
            }
            list3 = category.externalCategoryIds;
        } else {
            list3 = list;
        }
        return category.copy(str5, str6, bool2, list3, (i & 16) != 0 ? category.iconUrl : str3, (i & 32) != 0 ? category.id : str4, (i & 64) != 0 ? category.order : num, (i & 128) != 0 ? category.services : list2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.categoryName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.color;
        int i4 = i3 + 81;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return str;
    }

    public final Boolean component3() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Boolean bool = this.default;
        int i5 = i3 + 101;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public final List<String> component4() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<String> list = this.externalCategoryIds;
        int i5 = i3 + 99;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iconUrl;
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component7() {
        Integer num;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            num = this.order;
            int i4 = 69 / 0;
        } else {
            num = this.order;
        }
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final List<Service> component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<Service> list = this.services;
        int i5 = i2 + 67;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final Category copy(String categoryName, String color, Boolean bool, List<String> externalCategoryIds, String iconUrl, String id, Integer order, List<Service> services) {
        int i = 2 % 2;
        Category category = new Category(categoryName, color, bool, externalCategoryIds, iconUrl, id, order, services);
        int i2 = ShareDataUIState + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return category;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 47;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Category)) {
            int i2 = component2 + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        Category category = (Category) other;
        if (!Intrinsics.areEqual(this.categoryName, category.categoryName)) {
            int i4 = ShareDataUIState + 111;
            component2 = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.color, category.color)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.default, category.default)) {
            int i5 = ShareDataUIState + 17;
            int i6 = i5 % 128;
            component2 = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 5;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.externalCategoryIds, category.externalCategoryIds) || !Intrinsics.areEqual(this.iconUrl, category.iconUrl) || !Intrinsics.areEqual(this.id, category.id)) {
            return false;
        }
        if (Intrinsics.areEqual(this.order, category.order)) {
            return Intrinsics.areEqual(this.services, category.services);
        }
        int i10 = component2 + 13;
        ShareDataUIState = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.categoryName;
        int iHashCode2 = 1;
        if (str == null) {
            int i2 = ShareDataUIState + 103;
            component2 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.color;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.default;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        List<String> list = this.externalCategoryIds;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str3 = this.iconUrl;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.id;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.order;
        if (num == null) {
            int i3 = ShareDataUIState + 81;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                iHashCode2 = 0;
            }
        } else {
            iHashCode2 = num.hashCode();
        }
        List<Service> list2 = this.services;
        int iHashCode8 = (((((((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0);
        int i4 = component2 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode8;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Category(categoryName=" + this.categoryName + ", color=" + this.color + ", default=" + this.default + ", externalCategoryIds=" + this.externalCategoryIds + ", iconUrl=" + this.iconUrl + ", id=" + this.id + ", order=" + this.order + ", services=" + this.services + ")";
        int i2 = ShareDataUIState + 65;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 74 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.categoryName);
        dest.writeString(this.color);
        Boolean bool = this.default;
        if (bool == null) {
            int i2 = ShareDataUIState + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeStringList(this.externalCategoryIds);
        dest.writeString(this.iconUrl);
        dest.writeString(this.id);
        Integer num = this.order;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        List<Service> list = this.services;
        if (list == null) {
            dest.writeInt(0);
            int i4 = component2 + 35;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 5;
                return;
            }
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<Service> it = list.iterator();
        int i6 = component2 + 17;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        while (it.hasNext()) {
            int i8 = ShareDataUIState + 23;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            it.next().writeToParcel(dest, flags);
        }
    }
}
