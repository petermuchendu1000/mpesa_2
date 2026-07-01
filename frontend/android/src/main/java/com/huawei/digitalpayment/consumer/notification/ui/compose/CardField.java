package com.huawei.digitalpayment.consumer.notification.ui.compose;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/notification/ui/compose/CardField;", "Landroid/os/Parcelable;", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CustomerPushMessageUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardField implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CardField> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("key")
    private final String key;

    @SerializedName("value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CardField> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CardField createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CardField cardField = new CardField(parcel.readString(), parcel.readString());
            int i2 = component1 + 13;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return cardField;
            }
            throw null;
        }

        @Override
        public CardField createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            CardField cardFieldCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 123;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return cardFieldCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CardField[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 63;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            CardField[] cardFieldArr = new CardField[i];
            int i6 = i4 + 49;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 98 / 0;
            }
            return cardFieldArr;
        }

        @Override
        public CardField[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 43;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            CardField[] cardFieldArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 73 / 0;
            }
            return cardFieldArrNewArray;
        }
    }

    public CardField(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.value = str2;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.key;
        }
        throw null;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 25;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 111;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return str;
    }

    static {
        int i = component2 + 55;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static CardField copy$default(CardField cardField, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 11;
        component1 = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = cardField.key;
            int i5 = i3 + 93;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            str2 = cardField.value;
        }
        return cardField.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.key;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 13;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 113;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final CardField copy(String key, String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(value, "");
        CardField cardField = new CardField(key, value);
        int i2 = copydefault + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return cardField;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        Object obj = null;
        if (this == other) {
            int i2 = copydefault + 15;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof CardField)) {
            int i3 = copydefault + 81;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        CardField cardField = (CardField) other;
        if (Intrinsics.areEqual(this.key, cardField.key)) {
            return Intrinsics.areEqual(this.value, cardField.value);
        }
        int i5 = copydefault + 103;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.key.hashCode();
        return i3 != 0 ? (iHashCode >>> 79) % this.value.hashCode() : (iHashCode * 31) + this.value.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardField(key=" + this.key + ", value=" + this.value + ")";
        int i2 = component1 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.key);
        dest.writeString(this.value);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
