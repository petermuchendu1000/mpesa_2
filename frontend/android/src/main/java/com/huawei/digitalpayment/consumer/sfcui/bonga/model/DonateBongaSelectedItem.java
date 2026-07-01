package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\b\u0010\u0014\u001a\u00020\u0005H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0005H×\u0001J\t\u0010\u001a\u001a\u00020\u0007H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/DonateBongaSelectedItem;", "Landroid/os/Parcelable;", "organization", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaDonationOrganization;", "bongaAmount", "", "preferredPin", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaDonationOrganization;ILjava/lang/String;)V", "getOrganization", "()Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaDonationOrganization;", "getBongaAmount", "()I", "getPreferredPin", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DonateBongaSelectedItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DonateBongaSelectedItem> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final int bongaAmount;
    private final BongaDonationOrganization organization;
    private final String preferredPin;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DonateBongaSelectedItem> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DonateBongaSelectedItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            DonateBongaSelectedItem donateBongaSelectedItem = new DonateBongaSelectedItem(BongaDonationOrganization.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
            int i2 = ShareDataUIState + 39;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return donateBongaSelectedItem;
            }
            throw null;
        }

        @Override
        public DonateBongaSelectedItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 27;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DonateBongaSelectedItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 11;
            ShareDataUIState = i3 % 128;
            DonateBongaSelectedItem[] donateBongaSelectedItemArr = new DonateBongaSelectedItem[i];
            if (i3 % 2 == 0) {
                return donateBongaSelectedItemArr;
            }
            throw null;
        }

        @Override
        public DonateBongaSelectedItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 53;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            DonateBongaSelectedItem[] donateBongaSelectedItemArrNewArray = newArray(i);
            int i5 = copydefault + 21;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return donateBongaSelectedItemArrNewArray;
        }
    }

    public DonateBongaSelectedItem(BongaDonationOrganization bongaDonationOrganization, int i, String str) {
        Intrinsics.checkNotNullParameter(bongaDonationOrganization, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.organization = bongaDonationOrganization;
        this.bongaAmount = i;
        this.preferredPin = str;
    }

    public final BongaDonationOrganization getOrganization() {
        BongaDonationOrganization bongaDonationOrganization;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            bongaDonationOrganization = this.organization;
            int i4 = 59 / 0;
        } else {
            bongaDonationOrganization = this.organization;
        }
        int i5 = i2 + 57;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return bongaDonationOrganization;
    }

    public final int getBongaAmount() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.bongaAmount;
        int i5 = i3 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String getPreferredPin() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.preferredPin;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = copydefault + 35;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static DonateBongaSelectedItem copy$default(DonateBongaSelectedItem donateBongaSelectedItem, BongaDonationOrganization bongaDonationOrganization, int i, String str, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = component2 + 71;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                BongaDonationOrganization bongaDonationOrganization2 = donateBongaSelectedItem.organization;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            bongaDonationOrganization = donateBongaSelectedItem.organization;
        }
        if ((i2 & 2) != 0) {
            i = donateBongaSelectedItem.bongaAmount;
        }
        if ((i2 & 4) != 0) {
            str = donateBongaSelectedItem.preferredPin;
            int i5 = ShareDataUIState + 73;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        return donateBongaSelectedItem.copy(bongaDonationOrganization, i, str);
    }

    public final BongaDonationOrganization component1() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        BongaDonationOrganization bongaDonationOrganization = this.organization;
        int i5 = i3 + 85;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return bongaDonationOrganization;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 111;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        if (i3 % 2 != 0) {
            i = this.bongaAmount;
            int i5 = 0 / 0;
        } else {
            i = this.bongaAmount;
        }
        int i6 = i4 + 123;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.preferredPin;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final DonateBongaSelectedItem copy(BongaDonationOrganization organization, int bongaAmount, String preferredPin) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(organization, "");
        Intrinsics.checkNotNullParameter(preferredPin, "");
        DonateBongaSelectedItem donateBongaSelectedItem = new DonateBongaSelectedItem(organization, bongaAmount, preferredPin);
        int i2 = component2 + 13;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 65 / 0;
        }
        return donateBongaSelectedItem;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        ShareDataUIState = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DonateBongaSelectedItem)) {
            int i2 = component2 + 17;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        DonateBongaSelectedItem donateBongaSelectedItem = (DonateBongaSelectedItem) other;
        if (!Intrinsics.areEqual(this.organization, donateBongaSelectedItem.organization)) {
            return false;
        }
        if (this.bongaAmount != donateBongaSelectedItem.bongaAmount) {
            int i4 = ShareDataUIState + 65;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.preferredPin, donateBongaSelectedItem.preferredPin)) {
            return true;
        }
        int i6 = ShareDataUIState + 107;
        int i7 = i6 % 128;
        component2 = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 11;
        ShareDataUIState = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.organization.hashCode();
        return i3 != 0 ? (((iHashCode >>> 44) << Integer.hashCode(this.bongaAmount)) << 120) >>> this.preferredPin.hashCode() : (((iHashCode * 31) + Integer.hashCode(this.bongaAmount)) * 31) + this.preferredPin.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DonateBongaSelectedItem(organization=" + this.organization + ", bongaAmount=" + this.bongaAmount + ", preferredPin=" + this.preferredPin + ")";
        int i2 = component2 + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.organization.writeToParcel(dest, flags);
        dest.writeInt(this.bongaAmount);
        dest.writeString(this.preferredPin);
        int i4 = component2 + 71;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
