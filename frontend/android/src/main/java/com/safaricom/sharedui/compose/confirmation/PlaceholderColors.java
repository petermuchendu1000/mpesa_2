package com.safaricom.sharedui.compose.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u0003H\u0007J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0003H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/safaricom/sharedui/compose/confirmation/PlaceholderColors;", "Landroid/os/Parcelable;", CdpConstants.CONTENT_TEXT_COLOR, "", "backgroundColor", "<init>", "(II)V", "getTextColor", "()I", "getBackgroundColor", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlaceholderColors implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PlaceholderColors> CREATOR = new Creator();
    private final int backgroundColor;
    private final int textColor;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlaceholderColors> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PlaceholderColors createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PlaceholderColors(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PlaceholderColors[] newArray(int i) {
            return new PlaceholderColors[i];
        }
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public PlaceholderColors(int i, int i2) {
        this.textColor = i;
        this.backgroundColor = i2;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public static PlaceholderColors copy$default(PlaceholderColors placeholderColors, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = placeholderColors.textColor;
        }
        if ((i3 & 2) != 0) {
            i2 = placeholderColors.backgroundColor;
        }
        return placeholderColors.copy(i, i2);
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final PlaceholderColors copy(int textColor, int backgroundColor) {
        return new PlaceholderColors(textColor, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaceholderColors)) {
            return false;
        }
        PlaceholderColors placeholderColors = (PlaceholderColors) other;
        return this.textColor == placeholderColors.textColor && this.backgroundColor == placeholderColors.backgroundColor;
    }

    public int hashCode() {
        return (Integer.hashCode(this.textColor) * 31) + Integer.hashCode(this.backgroundColor);
    }

    public String toString() {
        return "PlaceholderColors(textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ')';
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.textColor);
        dest.writeInt(this.backgroundColor);
    }
}
