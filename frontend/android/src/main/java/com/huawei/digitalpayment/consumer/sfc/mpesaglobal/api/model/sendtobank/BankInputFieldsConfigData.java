package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.iap.ac.config.lite.ConfigMerger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0013H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfigData;", "Landroid/os/Parcelable;", ConfigMerger.COMMON_CONFIG_SECTION, "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfig;", "key", "", "xpath", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfig;Ljava/lang/String;Ljava/lang/String;)V", "getConfig", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfig;", "getKey", "()Ljava/lang/String;", "getXpath", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankInputFieldsConfigData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BankInputFieldsConfigData> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName(ConfigMerger.COMMON_CONFIG_SECTION)
    private final BankInputFieldsConfig config;

    @SerializedName("key")
    private final String key;

    @SerializedName("xpath")
    private final String xpath;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankInputFieldsConfigData> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankInputFieldsConfigData createFromParcel(Parcel parcel) {
            BankInputFieldsConfig bankInputFieldsConfigCreateFromParcel;
            int i = 2 % 2;
            int i2 = copydefault + 83;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                int i4 = component2 + 71;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                bankInputFieldsConfigCreateFromParcel = null;
            } else {
                bankInputFieldsConfigCreateFromParcel = BankInputFieldsConfig.CREATOR.createFromParcel(parcel);
            }
            BankInputFieldsConfigData bankInputFieldsConfigData = new BankInputFieldsConfigData(bankInputFieldsConfigCreateFromParcel, parcel.readString(), parcel.readString());
            int i6 = component2 + 31;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return bankInputFieldsConfigData;
        }

        @Override
        public BankInputFieldsConfigData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 89;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            BankInputFieldsConfigData bankInputFieldsConfigDataCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 93;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return bankInputFieldsConfigDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankInputFieldsConfigData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 59;
            int i4 = i3 % 128;
            component2 = i4;
            BankInputFieldsConfigData[] bankInputFieldsConfigDataArr = new BankInputFieldsConfigData[i];
            if (i3 % 2 != 0) {
                throw null;
            }
            int i5 = i4 + 7;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return bankInputFieldsConfigDataArr;
        }

        @Override
        public BankInputFieldsConfigData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 9;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public BankInputFieldsConfigData(BankInputFieldsConfig bankInputFieldsConfig, String str, String str2) {
        this.config = bankInputFieldsConfig;
        this.key = str;
        this.xpath = str2;
    }

    public final BankInputFieldsConfig getConfig() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        BankInputFieldsConfig bankInputFieldsConfig = this.config;
        int i5 = i3 + 47;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return bankInputFieldsConfig;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.key;
        }
        throw null;
    }

    public final String getXpath() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.xpath;
        int i5 = i3 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component3 + 49;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static BankInputFieldsConfigData copy$default(BankInputFieldsConfigData bankInputFieldsConfigData, BankInputFieldsConfig bankInputFieldsConfig, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 47;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                bankInputFieldsConfig = bankInputFieldsConfigData.config;
                int i4 = 63 / 0;
            } else {
                bankInputFieldsConfig = bankInputFieldsConfigData.config;
            }
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 31;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str = bankInputFieldsConfigData.key;
        }
        if ((i & 4) != 0) {
            str2 = bankInputFieldsConfigData.xpath;
        }
        BankInputFieldsConfigData bankInputFieldsConfigDataCopy = bankInputFieldsConfigData.copy(bankInputFieldsConfig, str, str2);
        int i7 = component1 + 61;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return bankInputFieldsConfigDataCopy;
    }

    public final BankInputFieldsConfig component1() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        BankInputFieldsConfig bankInputFieldsConfig = this.config;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return bankInputFieldsConfig;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.key;
        int i4 = i3 + 77;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.xpath;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BankInputFieldsConfigData copy(BankInputFieldsConfig config, String key, String xpath) {
        int i = 2 % 2;
        BankInputFieldsConfigData bankInputFieldsConfigData = new BankInputFieldsConfigData(config, key, xpath);
        int i2 = component1 + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return bankInputFieldsConfigData;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 107;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 91 / 0;
            }
            return true;
        }
        if (!(other instanceof BankInputFieldsConfigData)) {
            return false;
        }
        BankInputFieldsConfigData bankInputFieldsConfigData = (BankInputFieldsConfigData) other;
        if (!Intrinsics.areEqual(this.config, bankInputFieldsConfigData.config)) {
            int i4 = copydefault + 67;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.key, bankInputFieldsConfigData.key)) {
            return !(Intrinsics.areEqual(this.xpath, bankInputFieldsConfigData.xpath) ^ true);
        }
        int i6 = copydefault + 117;
        component1 = i6 % 128;
        return i6 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        BankInputFieldsConfig bankInputFieldsConfig = this.config;
        if (bankInputFieldsConfig == null) {
            int i2 = copydefault + 3;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 63;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bankInputFieldsConfig.hashCode();
            int i7 = copydefault + 27;
            component1 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str = this.key;
        if (str == null) {
            int i9 = component1 + 13;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
        }
        String str2 = this.xpath;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankInputFieldsConfigData(config=" + this.config + ", key=" + this.key + ", xpath=" + this.xpath + ')';
        int i2 = copydefault + 95;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        BankInputFieldsConfig bankInputFieldsConfig = this.config;
        if (bankInputFieldsConfig == null) {
            int i4 = copydefault + 109;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bankInputFieldsConfig.writeToParcel(dest, flags);
        }
        dest.writeString(this.key);
        dest.writeString(this.xpath);
    }
}
