package com.safaricom.sharedui.compose.contact;

import com.iap.ac.android.acs.plugin.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/safaricom/sharedui/compose/contact/ContactUiData;", "", "displayName", "", "photoUrl", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getPhotoUrl", Constants.JS_API_GET_PHONE_NUMBER, "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContactUiData {
    public static final int $stable = 0;
    private final String ShareDataUIState;
    private final String component1;
    private final String component3;

    public ContactUiData(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        this.ShareDataUIState = str;
        this.component3 = str2;
        this.component1 = str3;
    }

    public final String getDisplayName() {
        return this.ShareDataUIState;
    }

    public final String getPhotoUrl() {
        return this.component3;
    }

    public ContactUiData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getPhoneNumber() {
        return this.component1;
    }

    public ContactUiData() {
        this(null, null, null, 7, null);
    }

    public static ContactUiData copy$default(ContactUiData contactUiData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactUiData.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            str2 = contactUiData.component3;
        }
        if ((i & 4) != 0) {
            str3 = contactUiData.component1;
        }
        return contactUiData.copy(str, str2, str3);
    }

    public final String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final String getComponent3() {
        return this.component3;
    }

    public final String getComponent1() {
        return this.component1;
    }

    public final ContactUiData copy(String displayName, String photoUrl, String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "");
        return new ContactUiData(displayName, photoUrl, phoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactUiData)) {
            return false;
        }
        ContactUiData contactUiData = (ContactUiData) other;
        return Intrinsics.areEqual(this.ShareDataUIState, contactUiData.ShareDataUIState) && Intrinsics.areEqual(this.component3, contactUiData.component3) && Intrinsics.areEqual(this.component1, contactUiData.component1);
    }

    public int hashCode() {
        String str = this.ShareDataUIState;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.component3;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.component1.hashCode();
    }

    public String toString() {
        return "ContactUiData(displayName=" + this.ShareDataUIState + ", photoUrl=" + this.component3 + ", phoneNumber=" + this.component1 + ')';
    }
}
