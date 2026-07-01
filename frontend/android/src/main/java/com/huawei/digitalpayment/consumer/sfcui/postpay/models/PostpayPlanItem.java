package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\u0007J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÇ\u0001J\b\u0010&\u001a\u00020\u0003H\u0007J\u0013\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010)H×\u0003J\t\u0010*\u001a\u00020\u0003H×\u0001J\t\u0010+\u001a\u00020\u0007H×\u0001J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0018\"\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/PostpayPlanItem;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", FirebaseAnalytics.Param.PRICE, "", "description", "", "productName", "productId", "active", "", "selected", "<init>", "(IFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getId", "()I", "getPrice", "()F", "getDescription", "()Ljava/lang/String;", "getProductName", "getProductId", "getActive", "()Z", "getSelected", "setSelected", "(Z)V", "priceStr", "plan", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PostpayPlanItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PostpayPlanItem> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("active")
    private final boolean active;

    @SerializedName("description")
    private final String description;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final int id;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final float price;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("productName")
    private final String productName;
    private boolean selected;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PostpayPlanItem> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PostpayPlanItem createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            float f = parcel.readFloat();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int i3 = ShareDataUIState + 87;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            PostpayPlanItem postpayPlanItem = new PostpayPlanItem(i2, f, string, string2, string3, z2, z);
            int i5 = copydefault + 69;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return postpayPlanItem;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public PostpayPlanItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 39;
            copydefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                obj.hashCode();
                throw null;
            }
            PostpayPlanItem postpayPlanItemCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 81;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return postpayPlanItemCreateFromParcel;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PostpayPlanItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 15;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            PostpayPlanItem[] postpayPlanItemArr = new PostpayPlanItem[i];
            int i6 = i3 + 29;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return postpayPlanItemArr;
            }
            throw null;
        }

        @Override
        public PostpayPlanItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 3;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            PostpayPlanItem[] postpayPlanItemArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 125;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 86 / 0;
            }
            return postpayPlanItemArrNewArray;
        }
    }

    public PostpayPlanItem(int i, float f, String str, String str2, String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = i;
        this.price = f;
        this.description = str;
        this.productName = str2;
        this.productId = str3;
        this.active = z;
        this.selected = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PostpayPlanItem(int i, float f, String str, String str2, String str3, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        if ((i2 & 64) != 0) {
            int i3 = component1 + 19;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 57;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
            z3 = false;
        } else {
            z3 = z2;
        }
        this(i, f, str, str2, str3, z, z3);
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.id;
        int i5 = i2 + 103;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return i4;
    }

    public final float getPrice() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        float f = this.price;
        if (i3 != 0) {
            int i4 = 97 / 0;
        }
        return f;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.description;
        int i5 = i3 + 89;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.productName;
        int i5 = i3 + 17;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 105;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getActive() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.active;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return z;
    }

    public final boolean getSelected() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.selected;
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return z;
    }

    public final void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.selected = z;
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
    }

    public final String priceStr() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String strValueOf = String.valueOf((int) this.price);
        int i4 = component1 + 23;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return strValueOf;
    }

    public final String plan() {
        int i = 2 % 2;
        String strReplace$default = StringsKt.replace$default(this.description, "Sh" + ((int) this.price) + " ", "", false, 4, (Object) null);
        int i2 = component1 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return strReplace$default;
    }

    static {
        int i = component3 + 35;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static PostpayPlanItem copy$default(PostpayPlanItem postpayPlanItem, int i, float f, String str, String str2, String str3, boolean z, boolean z2, int i2, Object obj) {
        int i3;
        float f2;
        String str4;
        int i4 = 2 % 2;
        int i5 = component1 + 51;
        int i6 = i5 % 128;
        copydefault = i6;
        if (i5 % 2 != 0 ? (i2 & 1) == 0 : (i2 & 1) == 0) {
            i3 = i;
        } else {
            int i7 = i6 + 93;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            i3 = postpayPlanItem.id;
        }
        if ((i2 & 2) != 0) {
            int i9 = i6 + 71;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            f2 = postpayPlanItem.price;
        } else {
            f2 = f;
        }
        String str5 = (i2 & 4) != 0 ? postpayPlanItem.description : str;
        if ((i2 & 8) != 0) {
            int i11 = i6 + 45;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            str4 = postpayPlanItem.productName;
            if (i12 != 0) {
                int i13 = 96 / 0;
            }
        } else {
            str4 = str2;
        }
        return postpayPlanItem.copy(i3, f2, str5, str4, (i2 & 16) != 0 ? postpayPlanItem.productId : str3, (i2 & 32) != 0 ? postpayPlanItem.active : z, (i2 & 64) != 0 ? postpayPlanItem.selected : z2);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 55;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.id;
        int i6 = i2 + 47;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final float component2() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.price;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 15;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 75;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productId;
        int i5 = i2 + 55;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return str;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.active;
        int i5 = i2 + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.selected;
        int i5 = i2 + 19;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final PostpayPlanItem copy(int id, float price, String description, String productName, String productId, boolean active, boolean selected) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(description, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(productId, "");
        PostpayPlanItem postpayPlanItem = new PostpayPlanItem(id, price, description, productName, productId, active, selected);
        int i2 = component1 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return postpayPlanItem;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostpayPlanItem)) {
            return false;
        }
        PostpayPlanItem postpayPlanItem = (PostpayPlanItem) other;
        if (this.id != postpayPlanItem.id || Float.compare(this.price, postpayPlanItem.price) != 0 || !Intrinsics.areEqual(this.description, postpayPlanItem.description) || !Intrinsics.areEqual(this.productName, postpayPlanItem.productName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productId, postpayPlanItem.productId)) {
            int i2 = copydefault + 5;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.active == postpayPlanItem.active) {
            return this.selected == postpayPlanItem.selected;
        }
        int i4 = component1;
        int i5 = i4 + 3;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 41;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((Integer.hashCode(this.id) * 31) + Float.hashCode(this.price)) * 31) + this.description.hashCode()) * 31) + this.productName.hashCode()) * 31) + this.productId.hashCode()) * 31) + Boolean.hashCode(this.active)) * 31) + Boolean.hashCode(this.selected);
        int i4 = copydefault + 103;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PostpayPlanItem(id=" + this.id + ", price=" + this.price + ", description=" + this.description + ", productName=" + this.productName + ", productId=" + this.productId + ", active=" + this.active + ", selected=" + this.selected + ")";
        int i2 = component1 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.id);
        dest.writeFloat(this.price);
        dest.writeString(this.description);
        dest.writeString(this.productName);
        dest.writeString(this.productId);
        dest.writeInt(this.active ? 1 : 0);
        dest.writeInt(this.selected ? 1 : 0);
        int i4 = copydefault + 89;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
