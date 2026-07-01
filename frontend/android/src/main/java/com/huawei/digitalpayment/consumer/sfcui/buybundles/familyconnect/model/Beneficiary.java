package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model;

import com.iap.ac.android.acs.plugin.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010!\u001a\u00020\"H×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/Beneficiary;", "", "firstName", "", "lastName", "phoneNumber", "usedPercentage", "used", "initial", "progress", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "getFirstName", "()Ljava/lang/String;", "getLastName", Constants.JS_API_GET_PHONE_NUMBER, "getUsedPercentage", "getUsed", "getInitial", "getProgress", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Beneficiary {
    public static final int $stable = 0;
    private static int copy = 0;
    private static int getAsAtTimestamp = 19 % 128;
    private static int getRequestBeneficiariesState = 0;
    private static int getShareableDataState = 1;
    private final float ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String component4;
    private final String copydefault;
    private final String equals;

    public Beneficiary(String str, String str2, String str3, String str4, String str5, String str6, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.copydefault = str;
        this.component1 = str2;
        this.component3 = str3;
        this.component4 = str4;
        this.equals = str5;
        this.component2 = str6;
        this.ShareDataUIState = f;
    }

    public final String getFirstName() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 125;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.copydefault;
        int i4 = i3 + 83;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getLastName() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 31;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = copy + 33;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final String getUsedPercentage() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 101;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component4;
        int i5 = i2 + 3;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 62 / 0;
        }
        return str;
    }

    public final String getUsed() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 105;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 59;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getInitial() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 65;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 49;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float getProgress() {
        int i = 2 % 2;
        int i2 = copy + 91;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        float f = this.ShareDataUIState;
        int i5 = i3 + 67;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    static {
        if (19 % 2 == 0) {
            int i = 65 / 0;
        }
    }

    public static Beneficiary copy$default(Beneficiary beneficiary, String str, String str2, String str3, String str4, String str5, String str6, float f, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getShareableDataState + 81;
            copy = i3 % 128;
            if (i3 % 2 != 0) {
                String str7 = beneficiary.copydefault;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = beneficiary.copydefault;
        }
        String str8 = str;
        if ((i & 2) != 0) {
            int i4 = getShareableDataState + 91;
            copy = i4 % 128;
            int i5 = i4 % 2;
            str2 = beneficiary.component1;
        }
        String str9 = str2;
        if ((i & 4) != 0) {
            str3 = beneficiary.component3;
        }
        String str10 = str3;
        if ((i & 8) != 0) {
            str4 = beneficiary.component4;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            str5 = beneficiary.equals;
        }
        String str12 = str5;
        if ((i & 32) != 0) {
            str6 = beneficiary.component2;
        }
        String str13 = str6;
        if ((i & 64) != 0) {
            f = beneficiary.ShareDataUIState;
        }
        Beneficiary beneficiaryCopy = beneficiary.copy(str8, str9, str10, str11, str12, str13, f);
        int i6 = getShareableDataState + 57;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return beneficiaryCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 109;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 117;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 81;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 99;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy + 31;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.component3;
        int i4 = i3 + 111;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 25;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component4;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 83;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.equals;
        int i4 = i3 + 55;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 91;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component2;
            int i4 = 38 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i2 + 105;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final float component7() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 95;
        copy = i3 % 128;
        int i4 = i3 % 2;
        float f = this.ShareDataUIState;
        int i5 = i2 + 37;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final Beneficiary copy(String firstName, String lastName, String phoneNumber, String usedPercentage, String used, String initial, float progress) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(firstName, "");
        Intrinsics.checkNotNullParameter(lastName, "");
        Intrinsics.checkNotNullParameter(phoneNumber, "");
        Intrinsics.checkNotNullParameter(usedPercentage, "");
        Intrinsics.checkNotNullParameter(used, "");
        Intrinsics.checkNotNullParameter(initial, "");
        Beneficiary beneficiary = new Beneficiary(firstName, lastName, phoneNumber, usedPercentage, used, initial, progress);
        int i2 = getShareableDataState + 17;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return beneficiary;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 17;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 107;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof Beneficiary)) {
            int i7 = i3 + 45;
            getShareableDataState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        Beneficiary beneficiary = (Beneficiary) other;
        if (!Intrinsics.areEqual(this.copydefault, beneficiary.copydefault)) {
            int i9 = copy + 81;
            getShareableDataState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, beneficiary.component1)) {
            int i11 = copy + 125;
            getShareableDataState = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, beneficiary.component3) || !Intrinsics.areEqual(this.component4, beneficiary.component4)) {
            return false;
        }
        if (Intrinsics.areEqual(this.equals, beneficiary.equals)) {
            return Intrinsics.areEqual(this.component2, beneficiary.component2) && Float.compare(this.ShareDataUIState, beneficiary.ShareDataUIState) == 0;
        }
        int i13 = getShareableDataState + 73;
        copy = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 95;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.copydefault.hashCode() * 31) + this.component1.hashCode()) * 31) + this.component3.hashCode()) * 31) + this.component4.hashCode()) * 31) + this.equals.hashCode()) * 31) + this.component2.hashCode()) * 31) + Float.hashCode(this.ShareDataUIState);
        int i4 = copy + 119;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Beneficiary(firstName=" + this.copydefault + ", lastName=" + this.component1 + ", phoneNumber=" + this.component3 + ", usedPercentage=" + this.component4 + ", used=" + this.equals + ", initial=" + this.component2 + ", progress=" + this.ShareDataUIState + ")";
        int i2 = getShareableDataState + 21;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
