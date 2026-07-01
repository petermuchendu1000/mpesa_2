package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/State;", "Landroid/os/Parcelable;", "stateName", "", "stateIso", "emoji", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStateName", "()Ljava/lang/String;", "getStateIso", "getEmoji", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class State implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<State> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private final String emoji;
    private final String stateIso;
    private final String stateName;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<State> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final State createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            State state = new State(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 37;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return state;
        }

        @Override
        public State createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 53;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            State stateCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 13;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return stateCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final State[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 69;
            component3 = i3 % 128;
            State[] stateArr = new State[i];
            if (i3 % 2 != 0) {
                int i4 = 24 / 0;
            }
            return stateArr;
        }

        @Override
        public State[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 97;
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

    public State(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.stateName = str;
        this.stateIso = str2;
        this.emoji = str3;
    }

    public final String getStateName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.stateName;
        int i5 = i3 + 63;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStateIso() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.stateIso;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getEmoji() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.emoji;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 21;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static State copy$default(State state, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 27;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str = state.stateName;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 115;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                str2 = state.stateIso;
                int i6 = 56 / 0;
            } else {
                str2 = state.stateIso;
            }
        }
        if ((i & 4) != 0) {
            str3 = state.emoji;
            int i7 = component2 + 89;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        return state.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 49;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.stateName;
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.stateIso;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.emoji;
        int i5 = i3 + 85;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final State copy(String stateName, String stateIso, String emoji) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(stateName, "");
        Intrinsics.checkNotNullParameter(stateIso, "");
        Intrinsics.checkNotNullParameter(emoji, "");
        State state = new State(stateName, stateIso, emoji);
        int i2 = ShareDataUIState + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return state;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 53;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i2 + 103;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i2 + 41;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        if (!(other instanceof State)) {
            int i10 = i4 + 11;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        State state = (State) other;
        if (!Intrinsics.areEqual(this.stateName, state.stateName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.stateIso, state.stateIso)) {
            int i12 = ShareDataUIState + 29;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.emoji, state.emoji))) {
            return true;
        }
        int i14 = component2 + 73;
        ShareDataUIState = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.stateName.hashCode() * 31) + this.stateIso.hashCode()) * 31) + this.emoji.hashCode();
        int i4 = ShareDataUIState + 105;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "State(stateName=" + this.stateName + ", stateIso=" + this.stateIso + ", emoji=" + this.emoji + ')';
        int i2 = ShareDataUIState + 43;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.stateName);
            dest.writeString(this.stateIso);
            dest.writeString(this.emoji);
            throw null;
        }
        dest.writeString(this.stateName);
        dest.writeString(this.stateIso);
        dest.writeString(this.emoji);
        int i4 = ShareDataUIState + 51;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
