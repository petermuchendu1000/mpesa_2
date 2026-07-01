package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponseHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateServiceResponse;", "Landroid/os/Parcelable;", "responseHeader", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "body", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateResponseBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateResponseBody;)V", "getResponseHeader", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateResponseBody;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StateServiceResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<StateServiceResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("Body")
    private final StateResponseBody body;

    @SerializedName("ResponseHeader")
    private final ImtServiceResponseHeader responseHeader;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StateServiceResponse> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final StateServiceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 61;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            StateResponseBody stateResponseBodyCreateFromParcel = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                ImtServiceResponseHeader.CREATOR.createFromParcel(parcel);
                parcel.readInt();
                stateResponseBodyCreateFromParcel.hashCode();
                throw null;
            }
            ImtServiceResponseHeader imtServiceResponseHeaderCreateFromParcel = ImtServiceResponseHeader.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                stateResponseBodyCreateFromParcel = StateResponseBody.CREATOR.createFromParcel(parcel);
                int i4 = copydefault + 71;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
            StateServiceResponse stateServiceResponse = new StateServiceResponse(imtServiceResponseHeaderCreateFromParcel, stateResponseBodyCreateFromParcel);
            int i6 = ShareDataUIState + 69;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return stateServiceResponse;
        }

        @Override
        public StateServiceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 57;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            StateServiceResponse stateServiceResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 5;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return stateServiceResponseCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final StateServiceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 103;
            copydefault = i3 % 128;
            StateServiceResponse[] stateServiceResponseArr = new StateServiceResponse[i];
            if (i3 % 2 != 0) {
                return stateServiceResponseArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public StateServiceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 75;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            StateServiceResponse[] stateServiceResponseArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 90 / 0;
            }
            int i6 = copydefault + 83;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return stateServiceResponseArrNewArray;
        }
    }

    public StateServiceResponse(ImtServiceResponseHeader imtServiceResponseHeader, StateResponseBody stateResponseBody) {
        Intrinsics.checkNotNullParameter(imtServiceResponseHeader, "");
        this.responseHeader = imtServiceResponseHeader;
        this.body = stateResponseBody;
    }

    public final ImtServiceResponseHeader getResponseHeader() {
        ImtServiceResponseHeader imtServiceResponseHeader;
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            imtServiceResponseHeader = this.responseHeader;
            int i4 = 12 / 0;
        } else {
            imtServiceResponseHeader = this.responseHeader;
        }
        int i5 = i3 + 25;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 60 / 0;
        }
        return imtServiceResponseHeader;
    }

    public final StateResponseBody getBody() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        StateResponseBody stateResponseBody = this.body;
        int i4 = i2 + 125;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return stateResponseBody;
        }
        throw null;
    }

    static {
        int i = component1 + 31;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            int i2 = 97 / 0;
        }
    }

    public static StateServiceResponse copy$default(StateServiceResponse stateServiceResponse, ImtServiceResponseHeader imtServiceResponseHeader, StateResponseBody stateResponseBody, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 117;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                ImtServiceResponseHeader imtServiceResponseHeader2 = stateServiceResponse.responseHeader;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            imtServiceResponseHeader = stateServiceResponse.responseHeader;
        }
        if ((i & 2) != 0) {
            int i4 = component2 + 25;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            stateResponseBody = stateServiceResponse.body;
        }
        return stateServiceResponse.copy(imtServiceResponseHeader, stateResponseBody);
    }

    public final ImtServiceResponseHeader component1() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ImtServiceResponseHeader imtServiceResponseHeader = this.responseHeader;
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        return imtServiceResponseHeader;
    }

    public final StateResponseBody component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 121;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        StateResponseBody stateResponseBody = this.body;
        int i5 = i2 + 19;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return stateResponseBody;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateServiceResponse copy(ImtServiceResponseHeader responseHeader, StateResponseBody body) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(responseHeader, "");
        StateServiceResponse stateServiceResponse = new StateServiceResponse(responseHeader, body);
        int i2 = component2 + 21;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return stateServiceResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 11;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse.copydefault = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.responseHeader, r6.responseHeader) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse.copydefault + 45;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse.component2 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if ((r6 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.body, r6.body) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse.copydefault
            int r1 = r1 + 101
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse.component2 = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 38
            int r1 = r1 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse
            if (r1 != 0) goto L2c
            int r2 = r2 + 11
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse.copydefault = r6
            int r2 = r2 % r0
            if (r2 != 0) goto L27
            return r4
        L27:
            r6 = 0
            r6.hashCode()
            throw r6
        L2c:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse) r6
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponseHeader r1 = r5.responseHeader
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponseHeader r2 = r6.responseHeader
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L46
            int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse.copydefault
            int r6 = r6 + 45
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse.component2 = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L44
            goto L45
        L44:
            r3 = r4
        L45:
            return r3
        L46:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateResponseBody r0 = r5.body
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateResponseBody r6 = r6.body
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L51
            return r4
        L51:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateServiceResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.responseHeader.hashCode();
        StateResponseBody stateResponseBody = this.body;
        if (stateResponseBody == null) {
            int i2 = copydefault + 29;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 105;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = stateResponseBody.hashCode();
        }
        int i7 = (iHashCode2 * 31) + iHashCode;
        int i8 = copydefault + 77;
        component2 = i8 % 128;
        int i9 = i8 % 2;
        return i7;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StateServiceResponse(responseHeader=" + this.responseHeader + ", body=" + this.body + ')';
        int i2 = copydefault + 13;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            this.responseHeader.writeToParcel(dest, flags);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.responseHeader.writeToParcel(dest, flags);
        StateResponseBody stateResponseBody = this.body;
        if (stateResponseBody != null) {
            dest.writeInt(1);
            stateResponseBody.writeToParcel(dest, flags);
        } else {
            dest.writeInt(0);
            int i4 = component2 + 67;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
