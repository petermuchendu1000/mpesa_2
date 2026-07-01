package com.safaricom.sharedui.compose.phonenumber;

import android.os.Parcel;
import android.os.Parcelable;
import com.safaricom.consumer.commons.util.TextResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003Ja\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÇ\u0001J\b\u0010#\u001a\u00020$H\u0007J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010'H×\u0003J\t\u0010(\u001a\u00020$H×\u0001J\t\u0010)\u001a\u00020\u0003H×\u0001J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011¨\u0006/"}, d2 = {"Lcom/safaricom/sharedui/compose/phonenumber/PhoneNumberInputState;", "Landroid/os/Parcelable;", "number", "", "isNumberEmpty", "", "isNumberEditable", "numberHasError", "numberErrorTitle", "Lcom/safaricom/consumer/commons/util/TextResource;", "numberErrorText", "hakikishaName", "hakikishaErrorDescription", "<init>", "(Ljava/lang/String;ZZZLcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/String;Lcom/safaricom/consumer/commons/util/TextResource;)V", "getNumber", "()Ljava/lang/String;", "()Z", "getNumberHasError", "getNumberErrorTitle", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getNumberErrorText", "getHakikishaName", "getHakikishaErrorDescription", "showNumberError", "getShowNumberError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhoneNumberInputState implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PhoneNumberInputState> CREATOR = new Creator();
    private final TextResource hakikishaErrorDescription;
    private final String hakikishaName;
    private final boolean isNumberEditable;
    private final boolean isNumberEmpty;
    private final String number;
    private final TextResource numberErrorText;
    private final TextResource numberErrorTitle;
    private final boolean numberHasError;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhoneNumberInputState> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PhoneNumberInputState createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PhoneNumberInputState(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (TextResource) parcel.readParcelable(PhoneNumberInputState.class.getClassLoader()), (TextResource) parcel.readParcelable(PhoneNumberInputState.class.getClassLoader()), parcel.readString(), (TextResource) parcel.readParcelable(PhoneNumberInputState.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PhoneNumberInputState[] newArray(int i) {
            return new PhoneNumberInputState[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public PhoneNumberInputState(String str, boolean z, boolean z2, boolean z3, TextResource textResource, TextResource textResource2, String str2, TextResource textResource3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.number = str;
        this.isNumberEmpty = z;
        this.isNumberEditable = z2;
        this.numberHasError = z3;
        this.numberErrorTitle = textResource;
        this.numberErrorText = textResource2;
        this.hakikishaName = str2;
        this.hakikishaErrorDescription = textResource3;
    }

    public PhoneNumberInputState(String str, boolean z, boolean z2, boolean z3, TextResource textResource, TextResource textResource2, String str2, TextResource textResource3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) == 0 ? z2 : true, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : textResource, (i & 32) != 0 ? null : textResource2, (i & 64) != 0 ? null : str2, (i & 128) == 0 ? textResource3 : null);
    }

    public final String getNumber() {
        return this.number;
    }

    public final boolean isNumberEmpty() {
        return this.isNumberEmpty;
    }

    public final boolean isNumberEditable() {
        return this.isNumberEditable;
    }

    public final boolean getNumberHasError() {
        return this.numberHasError;
    }

    public final TextResource getNumberErrorTitle() {
        return this.numberErrorTitle;
    }

    public final TextResource getNumberErrorText() {
        return this.numberErrorText;
    }

    public final String getHakikishaName() {
        return this.hakikishaName;
    }

    public final TextResource getHakikishaErrorDescription() {
        return this.hakikishaErrorDescription;
    }

    public final boolean getShowNumberError() {
        return !this.isNumberEmpty && this.numberHasError;
    }

    public PhoneNumberInputState() {
        this(null, false, false, false, null, null, null, null, 255, null);
    }

    public final String getNumber() {
        return this.number;
    }

    public final boolean getIsNumberEmpty() {
        return this.isNumberEmpty;
    }

    public final boolean getIsNumberEditable() {
        return this.isNumberEditable;
    }

    public final boolean getNumberHasError() {
        return this.numberHasError;
    }

    public final TextResource getNumberErrorTitle() {
        return this.numberErrorTitle;
    }

    public final TextResource getNumberErrorText() {
        return this.numberErrorText;
    }

    public final String getHakikishaName() {
        return this.hakikishaName;
    }

    public final TextResource getHakikishaErrorDescription() {
        return this.hakikishaErrorDescription;
    }

    public final PhoneNumberInputState copy(String number, boolean isNumberEmpty, boolean isNumberEditable, boolean numberHasError, TextResource numberErrorTitle, TextResource numberErrorText, String hakikishaName, TextResource hakikishaErrorDescription) {
        Intrinsics.checkNotNullParameter(number, "");
        return new PhoneNumberInputState(number, isNumberEmpty, isNumberEditable, numberHasError, numberErrorTitle, numberErrorText, hakikishaName, hakikishaErrorDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneNumberInputState)) {
            return false;
        }
        PhoneNumberInputState phoneNumberInputState = (PhoneNumberInputState) other;
        return Intrinsics.areEqual(this.number, phoneNumberInputState.number) && this.isNumberEmpty == phoneNumberInputState.isNumberEmpty && this.isNumberEditable == phoneNumberInputState.isNumberEditable && this.numberHasError == phoneNumberInputState.numberHasError && Intrinsics.areEqual(this.numberErrorTitle, phoneNumberInputState.numberErrorTitle) && Intrinsics.areEqual(this.numberErrorText, phoneNumberInputState.numberErrorText) && Intrinsics.areEqual(this.hakikishaName, phoneNumberInputState.hakikishaName) && Intrinsics.areEqual(this.hakikishaErrorDescription, phoneNumberInputState.hakikishaErrorDescription);
    }

    public int hashCode() {
        int iHashCode = this.number.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isNumberEmpty);
        int iHashCode3 = Boolean.hashCode(this.isNumberEditable);
        int iHashCode4 = Boolean.hashCode(this.numberHasError);
        TextResource textResource = this.numberErrorTitle;
        int iHashCode5 = textResource == null ? 0 : textResource.hashCode();
        TextResource textResource2 = this.numberErrorText;
        int iHashCode6 = textResource2 == null ? 0 : textResource2.hashCode();
        String str = this.hakikishaName;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        TextResource textResource3 = this.hakikishaErrorDescription;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (textResource3 != null ? textResource3.hashCode() : 0);
    }

    public String toString() {
        return "PhoneNumberInputState(number=" + this.number + ", isNumberEmpty=" + this.isNumberEmpty + ", isNumberEditable=" + this.isNumberEditable + ", numberHasError=" + this.numberHasError + ", numberErrorTitle=" + this.numberErrorTitle + ", numberErrorText=" + this.numberErrorText + ", hakikishaName=" + this.hakikishaName + ", hakikishaErrorDescription=" + this.hakikishaErrorDescription + ')';
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.number);
        dest.writeInt(this.isNumberEmpty ? 1 : 0);
        dest.writeInt(this.isNumberEditable ? 1 : 0);
        dest.writeInt(this.numberHasError ? 1 : 0);
        dest.writeParcelable(this.numberErrorTitle, flags);
        dest.writeParcelable(this.numberErrorText, flags);
        dest.writeString(this.hakikishaName);
        dest.writeParcelable(this.hakikishaErrorDescription, flags);
    }
}
