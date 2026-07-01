package com.safaricom.sharedui.compose.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.common.utils.NetworkUtils;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0013"}, d2 = {"Lcom/safaricom/sharedui/compose/navigation/ScreenDirection;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", NetworkUtils.NETWORK_TYPE_NONE, "FORWARD", "BACK", "BACK_NO_ANIMATION", "MODAL", "MODAL_DISMISS", "MODAL_REPLACE", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SharedUiCompose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScreenDirection implements Parcelable {
    private static final EnumEntries $ENTRIES;
    private static final ScreenDirection[] $VALUES;
    public static final Parcelable.Creator<ScreenDirection> CREATOR;
    public static final ScreenDirection NONE = new ScreenDirection(NetworkUtils.NETWORK_TYPE_NONE, 0);
    public static final ScreenDirection FORWARD = new ScreenDirection("FORWARD", 1);
    public static final ScreenDirection BACK = new ScreenDirection("BACK", 2);
    public static final ScreenDirection BACK_NO_ANIMATION = new ScreenDirection("BACK_NO_ANIMATION", 3);
    public static final ScreenDirection MODAL = new ScreenDirection("MODAL", 4);
    public static final ScreenDirection MODAL_DISMISS = new ScreenDirection("MODAL_DISMISS", 5);
    public static final ScreenDirection MODAL_REPLACE = new ScreenDirection("MODAL_REPLACE", 6);

    @Override
    public final int describeContents() {
        return 0;
    }

    private ScreenDirection(String str, int i) {
    }

    static {
        ScreenDirection[] screenDirectionArr$values = $values();
        $VALUES = screenDirectionArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(screenDirectionArr$values);
        CREATOR = new Parcelable.Creator<ScreenDirection>() {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ScreenDirection createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ScreenDirection.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ScreenDirection[] newArray(int i) {
                return new ScreenDirection[i];
            }
        };
    }

    public static ScreenDirection valueOf(String str) {
        return (ScreenDirection) Enum.valueOf(ScreenDirection.class, str);
    }

    public static ScreenDirection[] values() {
        return (ScreenDirection[]) $VALUES.clone();
    }

    private static final ScreenDirection[] $values() {
        return new ScreenDirection[]{NONE, FORWARD, BACK, BACK_NO_ANIMATION, MODAL, MODAL_DISMISS, MODAL_REPLACE};
    }

    public static EnumEntries<ScreenDirection> getEntries() {
        return $ENTRIES;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(name());
    }
}
