package com.huawei.digitalpayment.consumer.sfcui.sambaza.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.core.GriverParams;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0013H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/CreateBalanceTopupResponseVBO;", "Landroid/os/Parcelable;", "status", "", GriverParams.ShareParams.DESC, "parts", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaParts;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaParts;)V", "getStatus", "()Ljava/lang/String;", "getDesc", "getParts", "()Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaParts;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateBalanceTopupResponseVBO implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CreateBalanceTopupResponseVBO> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("Desc")
    private final String desc;

    @SerializedName("Parts")
    private final SambazaParts parts;

    @SerializedName("Status")
    private final String status;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CreateBalanceTopupResponseVBO> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[PHI: r1 r2
  0x003f: PHI (r1v7 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r2v5 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0034 A[PHI: r1 r2
  0x0034: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v8 java.lang.String) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String) binds: [B:8:0x0032, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO createFromParcel(android.os.Parcel r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO.Creator.component2
                int r1 = r1 + 13
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO.Creator.component3 = r2
                int r1 = r1 % r0
                java.lang.String r2 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
                if (r1 == 0) goto L26
                java.lang.String r1 = r6.readString()
                java.lang.String r2 = r6.readString()
                int r3 = r6.readInt()
                r4 = 59
                int r4 = r4 / 0
                if (r3 != 0) goto L3f
                goto L34
            L26:
                java.lang.String r1 = r6.readString()
                java.lang.String r2 = r6.readString()
                int r3 = r6.readInt()
                if (r3 != 0) goto L3f
            L34:
                int r6 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO.Creator.component2
                int r6 = r6 + 57
                int r3 = r6 % 128
                com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO.Creator.component3 = r3
                int r6 = r6 % r0
                r6 = 0
                goto L45
            L3f:
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaParts> r0 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaParts.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
            L45:
                com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO r0 = new com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO
                com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaParts r6 = (com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaParts) r6
                r0.<init>(r1, r2, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO");
        }

        @Override
        public CreateBalanceTopupResponseVBO createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 59;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            CreateBalanceTopupResponseVBO createBalanceTopupResponseVBOCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 67;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return createBalanceTopupResponseVBOCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CreateBalanceTopupResponseVBO[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 101;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            CreateBalanceTopupResponseVBO[] createBalanceTopupResponseVBOArr = new CreateBalanceTopupResponseVBO[i];
            int i6 = i3 + 25;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 41 / 0;
            }
            return createBalanceTopupResponseVBOArr;
        }

        @Override
        public CreateBalanceTopupResponseVBO[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 67;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            CreateBalanceTopupResponseVBO[] createBalanceTopupResponseVBOArrNewArray = newArray(i);
            int i4 = component2 + 97;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return createBalanceTopupResponseVBOArrNewArray;
        }
    }

    public CreateBalanceTopupResponseVBO(String str, String str2, SambazaParts sambazaParts) {
        this.status = str;
        this.desc = str2;
        this.parts = sambazaParts;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.status;
        int i5 = i2 + 105;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDesc() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.desc;
        int i5 = i3 + 35;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final SambazaParts getParts() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.parts;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 97;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 53 / 0;
        }
    }

    public static CreateBalanceTopupResponseVBO copy$default(CreateBalanceTopupResponseVBO createBalanceTopupResponseVBO, String str, String str2, SambazaParts sambazaParts, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 107;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = createBalanceTopupResponseVBO.status;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 91;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                String str3 = createBalanceTopupResponseVBO.desc;
                throw null;
            }
            str2 = createBalanceTopupResponseVBO.desc;
            int i6 = i4 + 29;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 4) != 0) {
            int i8 = copydefault + 49;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                sambazaParts = createBalanceTopupResponseVBO.parts;
                int i9 = 28 / 0;
            } else {
                sambazaParts = createBalanceTopupResponseVBO.parts;
            }
        }
        return createBalanceTopupResponseVBO.copy(str, str2, sambazaParts);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.desc;
        int i5 = i3 + 47;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SambazaParts component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        SambazaParts sambazaParts = this.parts;
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return sambazaParts;
    }

    public final CreateBalanceTopupResponseVBO copy(String status, String desc, SambazaParts parts) {
        int i = 2 % 2;
        CreateBalanceTopupResponseVBO createBalanceTopupResponseVBO = new CreateBalanceTopupResponseVBO(status, desc, parts);
        int i2 = component3 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return createBalanceTopupResponseVBO;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 61;
        component3 = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 105;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 99;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof CreateBalanceTopupResponseVBO)) {
            return false;
        }
        CreateBalanceTopupResponseVBO createBalanceTopupResponseVBO = (CreateBalanceTopupResponseVBO) other;
        if (!Intrinsics.areEqual(this.status, createBalanceTopupResponseVBO.status) || !Intrinsics.areEqual(this.desc, createBalanceTopupResponseVBO.desc)) {
            return false;
        }
        if (Intrinsics.areEqual(this.parts, createBalanceTopupResponseVBO.parts)) {
            return true;
        }
        int i4 = component3 + 67;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.status;
        if (str == null) {
            int i2 = component3 + 107;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = copydefault + 5;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        String str2 = this.desc;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        SambazaParts sambazaParts = this.parts;
        return (((iHashCode * 31) + iHashCode2) * 31) + (sambazaParts != null ? sambazaParts.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CreateBalanceTopupResponseVBO(status=" + this.status + ", desc=" + this.desc + ", parts=" + this.parts + ")";
        int i2 = copydefault + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.status);
            dest.writeString(this.desc);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.status);
        dest.writeString(this.desc);
        SambazaParts sambazaParts = this.parts;
        if (sambazaParts == null) {
            dest.writeInt(0);
            int i4 = component3 + 47;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } else {
            dest.writeInt(1);
            sambazaParts.writeToParcel(dest, flags);
        }
        int i6 = component3 + 99;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 18 / 0;
        }
    }
}
