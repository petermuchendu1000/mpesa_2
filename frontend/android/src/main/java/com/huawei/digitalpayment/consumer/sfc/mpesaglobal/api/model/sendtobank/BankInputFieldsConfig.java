package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfig;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "length", "name", "required", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLength", "getName", "getRequired", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankInputFieldsConfig implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BankInputFieldsConfig> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final String id;

    @SerializedName("length")
    private final String length;

    @SerializedName("name")
    private final String name;

    @SerializedName("required")
    private final String required;

    @SerializedName("type")
    private final String type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankInputFieldsConfig> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankInputFieldsConfig createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BankInputFieldsConfig bankInputFieldsConfig = new BankInputFieldsConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 81;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return bankInputFieldsConfig;
        }

        @Override
        public BankInputFieldsConfig createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 25;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            BankInputFieldsConfig bankInputFieldsConfigCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 45;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 44 / 0;
            }
            return bankInputFieldsConfigCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankInputFieldsConfig[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 107;
            component1 = i3 % 128;
            BankInputFieldsConfig[] bankInputFieldsConfigArr = new BankInputFieldsConfig[i];
            if (i3 % 2 == 0) {
                return bankInputFieldsConfigArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BankInputFieldsConfig[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 9;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            BankInputFieldsConfig[] bankInputFieldsConfigArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 2 / 0;
            }
            int i6 = component1 + 23;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return bankInputFieldsConfigArrNewArray;
        }
    }

    public BankInputFieldsConfig(String str, String str2, String str3, String str4, String str5) {
        this.id = str;
        this.length = str2;
        this.name = str3;
        this.required = str4;
        this.type = str5;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 47;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLength() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.length;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getRequired() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.required;
        int i5 = i3 + 89;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 11;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = copydefault + 23;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            int i2 = 9 / 0;
        }
    }

    public static BankInputFieldsConfig copy$default(BankInputFieldsConfig bankInputFieldsConfig, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 65;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str = bankInputFieldsConfig.id;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            int i5 = component1;
            int i6 = i5 + 97;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str2 = bankInputFieldsConfig.length;
            int i8 = i5 + 71;
            component2 = i8 % 128;
            int i9 = i8 % 2;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = bankInputFieldsConfig.name;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = bankInputFieldsConfig.required;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = bankInputFieldsConfig.type;
        }
        return bankInputFieldsConfig.copy(str6, str7, str8, str9, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.id;
        int i4 = i2 + 95;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.length;
        int i5 = i3 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.required;
        int i5 = i3 + 113;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.type;
        }
        throw null;
    }

    public final BankInputFieldsConfig copy(String id, String length, String name, String required, String type) {
        int i = 2 % 2;
        BankInputFieldsConfig bankInputFieldsConfig = new BankInputFieldsConfig(id, length, name, required, type);
        int i2 = component1 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return bankInputFieldsConfig;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = (i2 % 2 == 0 ? 0 : 1) ^ 1;
        int i5 = i3 + 71;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankInputFieldsConfig)) {
            int i2 = component2 + 23;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        BankInputFieldsConfig bankInputFieldsConfig = (BankInputFieldsConfig) other;
        if (!Intrinsics.areEqual(this.id, bankInputFieldsConfig.id) || (!Intrinsics.areEqual(this.length, bankInputFieldsConfig.length)) || !Intrinsics.areEqual(this.name, bankInputFieldsConfig.name)) {
            return false;
        }
        if (Intrinsics.areEqual(this.required, bankInputFieldsConfig.required)) {
            return Intrinsics.areEqual(this.type, bankInputFieldsConfig.type);
        }
        int i4 = component2 + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.id;
        int iHashCode3 = 1;
        if (str == null) {
            int i2 = component2 + 23;
            component1 = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.length;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.name;
        if (str3 == null) {
            int i3 = component1 + 93;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        String str4 = this.required;
        if (str4 == null) {
            int i5 = component1 + 111;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                iHashCode3 = 0;
            }
        } else {
            iHashCode3 = str4.hashCode();
            int i6 = component1 + 19;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str5 = this.type;
        return (((((((iHashCode * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankInputFieldsConfig(id=" + this.id + ", length=" + this.length + ", name=" + this.name + ", required=" + this.required + ", type=" + this.type + ')';
        int i2 = component2 + 25;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.id);
            dest.writeString(this.length);
            dest.writeString(this.name);
            dest.writeString(this.required);
            dest.writeString(this.type);
            int i4 = 79 / 0;
        } else {
            dest.writeString(this.id);
            dest.writeString(this.length);
            dest.writeString(this.name);
            dest.writeString(this.required);
            dest.writeString(this.type);
        }
        int i5 = component1 + 31;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
