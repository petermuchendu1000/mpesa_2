package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.amountdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.safaricom.consumer.commons.util.TextResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/amountdetails/SelectionItem;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "title", "Lcom/safaricom/consumer/commons/util/TextResource;", "<init>", "(Ljava/lang/String;Lcom/safaricom/consumer/commons/util/TextResource;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lcom/safaricom/consumer/commons/util/TextResource;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectionItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SelectionItem> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final String id;
    private final TextResource title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectionItem> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SelectionItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SelectionItem selectionItem = new SelectionItem(parcel.readString(), (TextResource) parcel.readParcelable(SelectionItem.class.getClassLoader()));
            int i2 = ShareDataUIState + 9;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 3 / 0;
            }
            return selectionItem;
        }

        @Override
        public SelectionItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 93;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            SelectionItem selectionItemCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 27;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return selectionItemCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SelectionItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 105;
            ShareDataUIState = i4 % 128;
            SelectionItem[] selectionItemArr = new SelectionItem[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 81;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return selectionItemArr;
        }

        @Override
        public SelectionItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 31;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            SelectionItem[] selectionItemArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 77;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return selectionItemArrNewArray;
            }
            throw null;
        }
    }

    public SelectionItem(String str, TextResource textResource) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(textResource, "");
        this.id = str;
        this.title = textResource;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.id;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return str;
    }

    public final TextResource getTitle() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.title;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 75;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 1 / 0;
        }
    }

    public static SelectionItem copy$default(SelectionItem selectionItem, String str, TextResource textResource, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 1;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 105;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                String str2 = selectionItem.id;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = selectionItem.id;
        }
        if ((i & 2) != 0) {
            textResource = selectionItem.title;
        }
        SelectionItem selectionItemCopy = selectionItem.copy(str, textResource);
        int i7 = component3 + 41;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 58 / 0;
        }
        return selectionItemCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.id;
        int i5 = i3 + 65;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TextResource component2() {
        TextResource textResource;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 47;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            textResource = this.title;
            int i4 = 51 / 0;
        } else {
            textResource = this.title;
        }
        int i5 = i2 + 121;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return textResource;
    }

    public final SelectionItem copy(String id, TextResource title) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(title, "");
        SelectionItem selectionItem = new SelectionItem(id, title);
        int i2 = component3 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return selectionItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 23;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (other instanceof SelectionItem) {
            SelectionItem selectionItem = (SelectionItem) other;
            return !(Intrinsics.areEqual(this.id, selectionItem.id) ^ true) && Intrinsics.areEqual(this.title, selectionItem.title);
        }
        int i4 = i2 + 83;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.id.hashCode();
        return i3 != 0 ? (iHashCode * 57) / this.title.hashCode() : (iHashCode * 31) + this.title.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SelectionItem(id=" + this.id + ", title=" + this.title + ')';
        int i2 = component3 + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 81 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.id);
            dest.writeParcelable(this.title, flags);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.id);
        dest.writeParcelable(this.title, flags);
        int i4 = ShareDataUIState + 11;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
