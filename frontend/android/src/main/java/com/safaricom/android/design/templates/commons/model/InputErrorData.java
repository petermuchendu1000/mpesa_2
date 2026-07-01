package com.safaricom.android.design.templates.commons.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/safaricom/android/design/templates/commons/model/InputErrorData;", "Landroid/os/Parcelable;", "errorState", "", "errorMessage", "", "<init>", "(ZLjava/lang/String;)V", "getErrorState", "()Z", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcInputCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputErrorData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<InputErrorData> CREATOR = new Creator();
    private final String errorMessage;
    private final boolean errorState;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InputErrorData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final InputErrorData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InputErrorData(parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final InputErrorData[] newArray(int i) {
            return new InputErrorData[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public InputErrorData(boolean z, String str) {
        this.errorState = z;
        this.errorMessage = str;
    }

    public InputErrorData(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getErrorState() {
        return this.errorState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InputErrorData() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static InputErrorData copy$default(InputErrorData inputErrorData, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = inputErrorData.errorState;
        }
        if ((i & 2) != 0) {
            str = inputErrorData.errorMessage;
        }
        return inputErrorData.copy(z, str);
    }

    public final boolean getErrorState() {
        return this.errorState;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final InputErrorData copy(boolean errorState, String errorMessage) {
        return new InputErrorData(errorState, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputErrorData)) {
            return false;
        }
        InputErrorData inputErrorData = (InputErrorData) other;
        return this.errorState == inputErrorData.errorState && Intrinsics.areEqual(this.errorMessage, inputErrorData.errorMessage);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.errorState);
        String str = this.errorMessage;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InputErrorData(errorState=" + this.errorState + ", errorMessage=" + this.errorMessage + ')';
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.errorState ? 1 : 0);
        dest.writeString(this.errorMessage);
    }
}
