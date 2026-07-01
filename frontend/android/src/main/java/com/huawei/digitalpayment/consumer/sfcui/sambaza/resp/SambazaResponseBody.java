package com.huawei.digitalpayment.consumer.sfcui.sambaza.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/SambazaResponseBody;", "Landroid/os/Parcelable;", "createBalanceTopupResponseVBO", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/CreateBalanceTopupResponseVBO;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/CreateBalanceTopupResponseVBO;)V", "getCreateBalanceTopupResponseVBO", "()Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/CreateBalanceTopupResponseVBO;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SambazaResponseBody implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SambazaResponseBody> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("CreateBalanceTopupResponseVBO")
    private final CreateBalanceTopupResponseVBO createBalanceTopupResponseVBO;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SambazaResponseBody> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SambazaResponseBody createFromParcel(Parcel parcel) {
            CreateBalanceTopupResponseVBO createBalanceTopupResponseVBOCreateFromParcel;
            int i = 2 % 2;
            int i2 = component3 + 105;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                int i4 = component3;
                int i5 = i4 + 13;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 62 / 0;
                }
                int i7 = i4 + 103;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                createBalanceTopupResponseVBOCreateFromParcel = null;
            } else {
                createBalanceTopupResponseVBOCreateFromParcel = CreateBalanceTopupResponseVBO.CREATOR.createFromParcel(parcel);
            }
            return new SambazaResponseBody(createBalanceTopupResponseVBOCreateFromParcel);
        }

        @Override
        public SambazaResponseBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 123;
            component3 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                obj.hashCode();
                throw null;
            }
            SambazaResponseBody sambazaResponseBodyCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 99;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                return sambazaResponseBodyCreateFromParcel;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SambazaResponseBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 49;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            SambazaResponseBody[] sambazaResponseBodyArr = new SambazaResponseBody[i];
            int i6 = i4 + 73;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return sambazaResponseBodyArr;
        }

        @Override
        public SambazaResponseBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 33;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            SambazaResponseBody[] sambazaResponseBodyArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 1 / 0;
            }
            int i6 = component3 + 31;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return sambazaResponseBodyArrNewArray;
        }
    }

    public SambazaResponseBody(CreateBalanceTopupResponseVBO createBalanceTopupResponseVBO) {
        this.createBalanceTopupResponseVBO = createBalanceTopupResponseVBO;
    }

    public final CreateBalanceTopupResponseVBO getCreateBalanceTopupResponseVBO() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        CreateBalanceTopupResponseVBO createBalanceTopupResponseVBO = this.createBalanceTopupResponseVBO;
        int i5 = i3 + 115;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return createBalanceTopupResponseVBO;
    }

    static {
        int i = component2 + 63;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static SambazaResponseBody copy$default(SambazaResponseBody sambazaResponseBody, CreateBalanceTopupResponseVBO createBalanceTopupResponseVBO, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 77;
        ShareDataUIState = i3 % 128;
        int i4 = i & 1;
        if (i3 % 2 != 0 ? i4 != 0 : i4 != 0) {
            createBalanceTopupResponseVBO = sambazaResponseBody.createBalanceTopupResponseVBO;
        }
        SambazaResponseBody sambazaResponseBodyCopy = sambazaResponseBody.copy(createBalanceTopupResponseVBO);
        int i5 = ShareDataUIState + 1;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return sambazaResponseBodyCopy;
    }

    public final CreateBalanceTopupResponseVBO component1() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        CreateBalanceTopupResponseVBO createBalanceTopupResponseVBO = this.createBalanceTopupResponseVBO;
        int i5 = i3 + 107;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return createBalanceTopupResponseVBO;
        }
        throw null;
    }

    public final SambazaResponseBody copy(CreateBalanceTopupResponseVBO createBalanceTopupResponseVBO) {
        int i = 2 % 2;
        SambazaResponseBody sambazaResponseBody = new SambazaResponseBody(createBalanceTopupResponseVBO);
        int i2 = ShareDataUIState + 123;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return sambazaResponseBody;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 89;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 65;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SambazaResponseBody)) {
            int i4 = ShareDataUIState + 33;
            copydefault = i4 % 128;
            return i4 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.createBalanceTopupResponseVBO, ((SambazaResponseBody) other).createBalanceTopupResponseVBO)) {
            return true;
        }
        int i5 = ShareDataUIState + 47;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        CreateBalanceTopupResponseVBO createBalanceTopupResponseVBO;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            createBalanceTopupResponseVBO = this.createBalanceTopupResponseVBO;
            int i3 = 16 / 0;
            if (createBalanceTopupResponseVBO == null) {
                return 0;
            }
        } else {
            createBalanceTopupResponseVBO = this.createBalanceTopupResponseVBO;
            if (createBalanceTopupResponseVBO == null) {
                return 0;
            }
        }
        int iHashCode = createBalanceTopupResponseVBO.hashCode();
        int i4 = ShareDataUIState + 7;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SambazaResponseBody(createBalanceTopupResponseVBO=" + this.createBalanceTopupResponseVBO + ")";
        int i2 = ShareDataUIState + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024 A[PHI: r1
  0x0024: PHI (r1v5 com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO) = 
  (r1v4 com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO)
  (r1v6 com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO)
 binds: [B:8:0x001e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody.ShareDataUIState
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            if (r1 == 0) goto L1c
            com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO r1 = r4.createBalanceTopupResponseVBO
            r3 = 63
            int r3 = r3 / r2
            if (r1 != 0) goto L24
            goto L20
        L1c:
            com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.CreateBalanceTopupResponseVBO r1 = r4.createBalanceTopupResponseVBO
            if (r1 != 0) goto L24
        L20:
            r5.writeInt(r2)
            goto L2b
        L24:
            r2 = 1
            r5.writeInt(r2)
            r1.writeToParcel(r5, r6)
        L2b:
            int r5 = com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody.ShareDataUIState
            int r5 = r5 + 109
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody.copydefault = r6
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.SambazaResponseBody.writeToParcel(android.os.Parcel, int):void");
    }
}
