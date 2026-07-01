package com.huawei.digitalpayment.consumer.sfcui.profile.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0012H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/resp/PukPayload;", "Landroid/os/Parcelable;", "partyA", "", "partyB", GriverCacheDao.COLUMN_CACHE_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getPartyA", "()Ljava/lang/String;", "getPartyB", "getId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PukPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PukPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final String id;

    @SerializedName("partyA")
    private final String partyA;

    @SerializedName("partyB")
    private final String partyB;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PukPayload> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PukPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            PukPayload pukPayload = new PukPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 45;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 1 / 0;
            }
            return pukPayload;
        }

        @Override
        public PukPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 81;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            PukPayload pukPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 23;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return pukPayloadCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PukPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 15;
            component2 = i3 % 128;
            PukPayload[] pukPayloadArr = new PukPayload[i];
            if (i3 % 2 != 0) {
                return pukPayloadArr;
            }
            throw null;
        }

        @Override
        public PukPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 73;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            PukPayload[] pukPayloadArrNewArray = newArray(i);
            int i5 = component1 + 35;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return pukPayloadArrNewArray;
            }
            throw null;
        }
    }

    public PukPayload(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.partyA = str;
        this.partyB = str2;
        this.id = str3;
    }

    public final String getPartyA() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.partyA;
        int i5 = i3 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPartyB() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.partyB;
        int i5 = i2 + 55;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.id;
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PukPayload(String str, String str2) {
        this(str, null, str2);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    static {
        int i = component2 + 19;
        component1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static PukPayload copy$default(PukPayload pukPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 61;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                String str4 = pukPayload.partyA;
                throw null;
            }
            str = pukPayload.partyA;
        }
        if ((i & 2) != 0) {
            str2 = pukPayload.partyB;
        }
        if ((i & 4) != 0) {
            int i4 = copydefault + 87;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                String str5 = pukPayload.id;
                throw null;
            }
            str3 = pukPayload.id;
        }
        return pukPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.partyA;
        int i4 = i3 + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.partyB;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 101;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PukPayload copy(String partyA, String partyB, String id) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(partyA, "");
        Intrinsics.checkNotNullParameter(id, "");
        PukPayload pukPayload = new PukPayload(partyA, partyB, id);
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
        return pukPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 63;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PukPayload)) {
            int i2 = ShareDataUIState + 121;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PukPayload pukPayload = (PukPayload) other;
        if (Intrinsics.areEqual(this.partyA, pukPayload.partyA)) {
            return Intrinsics.areEqual(this.partyB, pukPayload.partyB) && Intrinsics.areEqual(this.id, pukPayload.id);
        }
        int i4 = ShareDataUIState + 3;
        copydefault = i4 % 128;
        return i4 % 2 != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[PHI: r1 r3
  0x0031: PHI (r1v12 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r1
  0x0027: PHI (r1v6 int) = (r1v5 int), (r1v14 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.resp.PukPayload.copydefault
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.resp.PukPayload.ShareDataUIState = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1d
            java.lang.String r1 = r5.partyA
            int r1 = r1.hashCode()
            java.lang.String r3 = r5.partyB
            r4 = 65
            int r4 = r4 / r2
            if (r3 != 0) goto L31
            goto L27
        L1d:
            java.lang.String r1 = r5.partyA
            int r1 = r1.hashCode()
            java.lang.String r3 = r5.partyB
            if (r3 != 0) goto L31
        L27:
            int r3 = com.huawei.digitalpayment.consumer.sfcui.profile.resp.PukPayload.copydefault
            int r3 = r3 + 25
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.resp.PukPayload.ShareDataUIState = r4
            int r3 = r3 % r0
            goto L35
        L31:
            int r2 = r3.hashCode()
        L35:
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r0 = r5.id
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.resp.PukPayload.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PukPayload(partyA=" + this.partyA + ", partyB=" + this.partyB + ", id=" + this.id + ")";
        int i2 = copydefault + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.partyA);
        dest.writeString(this.partyB);
        dest.writeString(this.id);
        int i4 = ShareDataUIState + 113;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
