package com.huawei.digitalpayment.consumer.sfcui.ui.contact;

import com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010 \u001a\u00020\nH×\u0001J\t\u0010!\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/contact/SfcContactListItemUi;", "", "key", "", "contact", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/SfcContact;", "displayName", "displayPhoneNumber", "avatarAbbreviation", "avatarColorIndex", "", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/SfcContact;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getKey", "()Ljava/lang/String;", "getContact", "()Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/SfcContact;", "getDisplayName", "getDisplayPhoneNumber", "getAvatarAbbreviation", "getAvatarColorIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcContactListItemUi {
    public static final int $stable = 8;
    private static int component4 = 1;
    private static int copy = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private final String ShareDataUIState;
    private final SfcContact component1;
    private final int component2;
    private final String component3;
    private final String copydefault;
    private final String getAsAtTimestamp;

    public SfcContactListItemUi(String str, SfcContact sfcContact, String str2, String str3, String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sfcContact, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.getAsAtTimestamp = str;
        this.component1 = sfcContact;
        this.ShareDataUIState = str2;
        this.component3 = str3;
        this.copydefault = str4;
        this.component2 = i;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 107;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 9;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public final SfcContact getContact() {
        int i = 2 % 2;
        int i2 = equals + 47;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDisplayName() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 119;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.ShareDataUIState;
            int i4 = 72 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i2 + 121;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDisplayPhoneNumber() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 97;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 109;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAvatarAbbreviation() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 49;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 27;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getAvatarColorIndex() {
        int i = 2 % 2;
        int i2 = equals + 13;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 7;
        copy = i % 128;
        int i2 = i % 2;
    }

    public static SfcContactListItemUi copy$default(SfcContactListItemUi sfcContactListItemUi, String str, SfcContact sfcContact, String str2, String str3, String str4, int i, int i2, Object obj) {
        String str5;
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState + 39;
        int i5 = i4 % 128;
        equals = i5;
        String str6 = (i4 % 2 == 0 ? (i2 & 1) == 0 : (i2 & 1) == 0) ? str : sfcContactListItemUi.getAsAtTimestamp;
        SfcContact sfcContact2 = (i2 & 2) != 0 ? sfcContactListItemUi.component1 : sfcContact;
        if ((i2 & 4) != 0) {
            int i6 = i5 + 13;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            str5 = sfcContactListItemUi.ShareDataUIState;
        } else {
            str5 = str2;
        }
        return sfcContactListItemUi.copy(str6, sfcContact2, str5, (i2 & 8) != 0 ? sfcContactListItemUi.component3 : str3, (i2 & 16) != 0 ? sfcContactListItemUi.copydefault : str4, (i2 & 32) != 0 ? sfcContactListItemUi.component2 : i);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals + 65;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SfcContact component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 21;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 125;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = equals + 115;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 11;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = equals + 43;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.copydefault;
        int i4 = i3 + 35;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int component6() {
        int i = 2 % 2;
        int i2 = equals + 1;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.component2;
        if (i3 == 0) {
            int i5 = 97 / 0;
        }
        return i4;
    }

    public final SfcContactListItemUi copy(String key, SfcContact contact, String displayName, String displayPhoneNumber, String avatarAbbreviation, int avatarColorIndex) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(contact, "");
        Intrinsics.checkNotNullParameter(displayName, "");
        Intrinsics.checkNotNullParameter(displayPhoneNumber, "");
        Intrinsics.checkNotNullParameter(avatarAbbreviation, "");
        SfcContactListItemUi sfcContactListItemUi = new SfcContactListItemUi(key, contact, displayName, displayPhoneNumber, avatarAbbreviation, avatarColorIndex);
        int i2 = equals + 85;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
        return sfcContactListItemUi;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = equals + 107;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SfcContactListItemUi)) {
            return false;
        }
        SfcContactListItemUi sfcContactListItemUi = (SfcContactListItemUi) other;
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, sfcContactListItemUi.getAsAtTimestamp) || !Intrinsics.areEqual(this.component1, sfcContactListItemUi.component1) || !Intrinsics.areEqual(this.ShareDataUIState, sfcContactListItemUi.ShareDataUIState)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component3, sfcContactListItemUi.component3)) {
            return !(Intrinsics.areEqual(this.copydefault, sfcContactListItemUi.copydefault) ^ true) && this.component2 == sfcContactListItemUi.component2;
        }
        int i4 = equals + 9;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 33;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.getAsAtTimestamp.hashCode() * 31) + this.component1.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component3.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + Integer.hashCode(this.component2);
        int i4 = equals + 27;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SfcContactListItemUi(key=" + this.getAsAtTimestamp + ", contact=" + this.component1 + ", displayName=" + this.ShareDataUIState + ", displayPhoneNumber=" + this.component3 + ", avatarAbbreviation=" + this.copydefault + ", avatarColorIndex=" + this.component2 + ")";
        int i2 = getRequestBeneficiariesState + 1;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
