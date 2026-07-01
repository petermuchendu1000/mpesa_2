package com.huawei.digitalpayment.consumer.sfcui.commons;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J.\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010JL\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052(\b\u0002\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0007HÇ\u0001¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0005H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR3\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/commons/GsmConfirmationScreenData;", "Landroid/os/Parcelable;", "title", "", "iconResource", "", "fields", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "<init>", "(Ljava/lang/String;ILjava/util/LinkedHashMap;)V", "getTitle", "()Ljava/lang/String;", "getIconResource", "()I", "getFields", "()Ljava/util/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;ILjava/util/LinkedHashMap;)Lcom/huawei/digitalpayment/consumer/sfcui/commons/GsmConfirmationScreenData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GsmConfirmationScreenData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GsmConfirmationScreenData> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final LinkedHashMap<String, String> fields;
    private final int iconResource;
    private final String title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GsmConfirmationScreenData> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final GsmConfirmationScreenData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            int i4 = component3 + 105;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 0;
            while (i6 != i3) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                i6++;
                int i7 = component3 + 43;
                ShareDataUIState = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 / 3;
                }
            }
            return new GsmConfirmationScreenData(string, i2, linkedHashMap);
        }

        @Override
        public GsmConfirmationScreenData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 17;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            GsmConfirmationScreenData gsmConfirmationScreenDataCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 35;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return gsmConfirmationScreenDataCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final GsmConfirmationScreenData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 123;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            GsmConfirmationScreenData[] gsmConfirmationScreenDataArr = new GsmConfirmationScreenData[i];
            int i6 = i4 + 63;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                return gsmConfirmationScreenDataArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public GsmConfirmationScreenData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 41;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            GsmConfirmationScreenData[] gsmConfirmationScreenDataArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 77;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return gsmConfirmationScreenDataArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public GsmConfirmationScreenData(String str, int i, LinkedHashMap<String, String> linkedHashMap) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        this.title = str;
        this.iconResource = i;
        this.fields = linkedHashMap;
    }

    public final String getTitle() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 119;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.title;
            int i4 = 70 / 0;
        } else {
            str = this.title;
        }
        int i5 = i3 + 83;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int getIconResource() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 113;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.iconResource;
        int i6 = i2 + 115;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final LinkedHashMap<String, String> getFields() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        LinkedHashMap<String, String> linkedHashMap = this.fields;
        int i5 = i3 + 89;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return linkedHashMap;
    }

    static {
        int i = ShareDataUIState + 45;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GsmConfirmationScreenData copy$default(GsmConfirmationScreenData gsmConfirmationScreenData, String str, int i, LinkedHashMap linkedHashMap, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = copydefault;
        int i5 = i4 + 77;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i4 + 19;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str = gsmConfirmationScreenData.title;
        }
        if ((i2 & 2) != 0) {
            int i9 = component3 + 13;
            copydefault = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = gsmConfirmationScreenData.iconResource;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i = gsmConfirmationScreenData.iconResource;
        }
        if ((i2 & 4) != 0) {
            linkedHashMap = gsmConfirmationScreenData.fields;
        }
        GsmConfirmationScreenData gsmConfirmationScreenDataCopy = gsmConfirmationScreenData.copy(str, i, linkedHashMap);
        int i11 = component3 + 29;
        copydefault = i11 % 128;
        int i12 = i11 % 2;
        return gsmConfirmationScreenDataCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.title;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.iconResource;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LinkedHashMap<String, String> component3() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.fields;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GsmConfirmationScreenData copy(String title, int iconResource, LinkedHashMap<String, String> fields) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(fields, "");
        GsmConfirmationScreenData gsmConfirmationScreenData = new GsmConfirmationScreenData(title, iconResource, fields);
        int i2 = component3 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return gsmConfirmationScreenData;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component3 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 29;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i4 + 41;
            component3 = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!(other instanceof GsmConfirmationScreenData)) {
            int i7 = i2 + 105;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        GsmConfirmationScreenData gsmConfirmationScreenData = (GsmConfirmationScreenData) other;
        if (!Intrinsics.areEqual(this.title, gsmConfirmationScreenData.title)) {
            int i9 = component3;
            int i10 = i9 + 97;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 13;
            copydefault = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 60 / 0;
            }
            return false;
        }
        if (this.iconResource != gsmConfirmationScreenData.iconResource) {
            int i14 = component3 + 63;
            copydefault = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.fields, gsmConfirmationScreenData.fields)) {
            return true;
        }
        int i16 = copydefault + 117;
        component3 = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component3 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.title.hashCode() * 32) % Integer.hashCode(this.iconResource)) / 5) >>> this.fields.hashCode() : (((this.title.hashCode() * 31) + Integer.hashCode(this.iconResource)) * 31) + this.fields.hashCode();
        int i3 = component3 + 41;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 22 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GsmConfirmationScreenData(title=" + this.title + ", iconResource=" + this.iconResource + ", fields=" + this.fields + ")";
        int i2 = component3 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.title);
        dest.writeInt(this.iconResource);
        LinkedHashMap<String, String> linkedHashMap = this.fields;
        dest.writeInt(linkedHashMap.size());
        Iterator<Map.Entry<String, String>> it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            int i4 = component3 + 115;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                Map.Entry<String, String> next = it.next();
                dest.writeString(next.getKey());
                dest.writeString(next.getValue());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Map.Entry<String, String> next2 = it.next();
            dest.writeString(next2.getKey());
            dest.writeString(next2.getValue());
        }
        int i5 = copydefault + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }
}
