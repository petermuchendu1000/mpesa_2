package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.safaricom.consumer.commons.util.TextResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionItem;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "title", "Lcom/safaricom/consumer/commons/util/TextResource;", "<init>", "(Ljava/lang/String;Lcom/safaricom/consumer/commons/util/TextResource;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lcom/safaricom/consumer/commons/util/TextResource;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectionItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SelectionItem> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private final String id;
    private final TextResource title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectionItem> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SelectionItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SelectionItem selectionItem = new SelectionItem(parcel.readString(), (TextResource) parcel.readParcelable(SelectionItem.class.getClassLoader()));
            int i2 = copydefault + 63;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return selectionItem;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public SelectionItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 13;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SelectionItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 33;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            SelectionItem[] selectionItemArr = new SelectionItem[i];
            int i6 = i4 + 111;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return selectionItemArr;
        }

        @Override
        public SelectionItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 95;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
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
        int i2 = component2;
        int i3 = i2 + 29;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 87;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TextResource getTitle() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        TextResource textResource = this.title;
        int i5 = i3 + 9;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return textResource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 119;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static SelectionItem copy$default(SelectionItem selectionItem, String str, TextResource textResource, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 59;
        component1 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            str = selectionItem.id;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 33;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            textResource = selectionItem.title;
        }
        return selectionItem.copy(str, textResource);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 83;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.id;
            int i4 = 30 / 0;
        } else {
            str = this.id;
        }
        int i5 = i3 + 71;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TextResource component2() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.title;
        }
        throw null;
    }

    public final SelectionItem copy(String id, TextResource title) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(title, "");
        SelectionItem selectionItem = new SelectionItem(id, title);
        int i2 = component1 + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return selectionItem;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 111;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.id, r6.id) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.component2 + 111;
        r1 = r6 % 128;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.component1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if ((r6 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        r1 = r1 + 29;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.component2 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if ((r1 % 2) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r6 = 5 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.title, r6.title) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.component2 + 101;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.component1 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if ((r6 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.component2
            int r1 = r1 + 103
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.component1 = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 76
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem) r6
            java.lang.String r1 = r5.id
            java.lang.String r4 = r6.id
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L43
            int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.component2
            int r6 = r6 + 111
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.component1 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L36
            goto L37
        L36:
            r2 = r3
        L37:
            int r1 = r1 + 29
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.component2 = r6
            int r1 = r1 % r0
            if (r1 == 0) goto L42
            r6 = 5
            int r6 = r6 / r3
        L42:
            return r2
        L43:
            com.safaricom.consumer.commons.util.TextResource r1 = r5.title
            com.safaricom.consumer.commons.util.TextResource r6 = r6.title
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            if (r6 != 0) goto L5a
            int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.component2
            int r6 = r6 + 101
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.component1 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L59
            goto L5a
        L59:
            r2 = r3
        L5a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component1 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.id.hashCode() + 63) * this.title.hashCode() : (this.id.hashCode() * 31) + this.title.hashCode();
        int i3 = component1 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SelectionItem(id=" + this.id + ", title=" + this.title + ')';
        int i2 = component2 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.id);
        dest.writeParcelable(this.title, flags);
        int i4 = component1 + 19;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
