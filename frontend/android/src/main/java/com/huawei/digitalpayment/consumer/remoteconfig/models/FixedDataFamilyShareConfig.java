package com.huawei.digitalpayment.consumer.remoteconfig.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/remoteconfig/models/FixedDataFamilyShareConfig;", "Landroid/os/Parcelable;", "isEnabled", "", "<init>", "(Z)V", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcRemoteConfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FixedDataFamilyShareConfig implements Parcelable {
    public static final Parcelable.Creator<FixedDataFamilyShareConfig> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("isEnabled")
    private final boolean isEnabled;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FixedDataFamilyShareConfig> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.remoteconfig.models.FixedDataFamilyShareConfig createFromParcel(android.os.Parcel r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.remoteconfig.models.FixedDataFamilyShareConfig.Creator.copydefault
                int r1 = r1 + 83
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.remoteconfig.models.FixedDataFamilyShareConfig.Creator.component2 = r2
                int r1 = r1 % r0
                r2 = 0
                java.lang.String r3 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
                int r5 = r5.readInt()
                if (r1 == 0) goto L1e
                r1 = 61
                int r1 = r1 / r2
                if (r5 == 0) goto L21
                goto L20
            L1e:
                if (r5 == 0) goto L21
            L20:
                r2 = 1
            L21:
                com.huawei.digitalpayment.consumer.remoteconfig.models.FixedDataFamilyShareConfig r5 = new com.huawei.digitalpayment.consumer.remoteconfig.models.FixedDataFamilyShareConfig
                r5.<init>(r2)
                int r1 = com.huawei.digitalpayment.consumer.remoteconfig.models.FixedDataFamilyShareConfig.Creator.component2
                int r1 = r1 + 59
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.remoteconfig.models.FixedDataFamilyShareConfig.Creator.copydefault = r2
                int r1 = r1 % r0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.models.FixedDataFamilyShareConfig.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.remoteconfig.models.FixedDataFamilyShareConfig");
        }

        @Override
        public FixedDataFamilyShareConfig createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 69;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FixedDataFamilyShareConfig[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 41;
            int i4 = i3 % 128;
            copydefault = i4;
            FixedDataFamilyShareConfig[] fixedDataFamilyShareConfigArr = new FixedDataFamilyShareConfig[i];
            if (i3 % 2 == 0) {
                int i5 = 48 / 0;
            }
            int i6 = i4 + 41;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return fixedDataFamilyShareConfigArr;
        }

        @Override
        public FixedDataFamilyShareConfig[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 49;
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

    public FixedDataFamilyShareConfig(boolean z) {
        this.isEnabled = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FixedDataFamilyShareConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1;
            int i3 = i2 + 21;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        }
        this(z);
    }

    public final boolean isEnabled() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.isEnabled;
        int i5 = i3 + 123;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    static {
        int i = component2 + 75;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 34 / 0;
        }
    }

    public FixedDataFamilyShareConfig() {
        this(false, 1, null);
    }

    public static FixedDataFamilyShareConfig copy$default(FixedDataFamilyShareConfig fixedDataFamilyShareConfig, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 55;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            z = fixedDataFamilyShareConfig.isEnabled;
            int i6 = i4 + 71;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        return fixedDataFamilyShareConfig.copy(z);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.isEnabled;
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FixedDataFamilyShareConfig copy(boolean isEnabled) {
        int i = 2 % 2;
        FixedDataFamilyShareConfig fixedDataFamilyShareConfig = new FixedDataFamilyShareConfig(isEnabled);
        int i2 = ShareDataUIState + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return fixedDataFamilyShareConfig;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component1 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 29;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FixedDataFamilyShareConfig)) {
            int i4 = ShareDataUIState + 33;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.isEnabled == ((FixedDataFamilyShareConfig) other).isEnabled) {
            return true;
        }
        int i6 = component1 + 3;
        int i7 = i6 % 128;
        ShareDataUIState = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 43;
        component1 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Boolean.hashCode(this.isEnabled);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = Boolean.hashCode(this.isEnabled);
        int i3 = component1 + 45;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FixedDataFamilyShareConfig(isEnabled=" + this.isEnabled + ")";
        int i2 = ShareDataUIState + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.isEnabled ? 1 : 0);
        int i4 = component1 + 119;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
