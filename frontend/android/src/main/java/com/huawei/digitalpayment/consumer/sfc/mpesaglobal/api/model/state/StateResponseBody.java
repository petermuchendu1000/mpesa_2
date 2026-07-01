package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateResponseBody;", "Landroid/os/Parcelable;", "data", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateData;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StateResponseBody implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<StateResponseBody> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;

    @SerializedName(ImtConstants.KEY_DATA)
    private final List<StateData> data;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StateResponseBody> {
        private static int component1 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateResponseBody createFromParcel(android.os.Parcel r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateResponseBody.Creator.component1
                int r1 = r1 + 13
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateResponseBody.Creator.copydefault = r2
                int r1 = r1 % r0
                r2 = 0
                java.lang.String r3 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
                if (r1 != 0) goto L1e
                int r1 = r5.readInt()
                r3 = 86
                int r3 = r3 / r2
                if (r1 != 0) goto L2f
                goto L24
            L1e:
                int r1 = r5.readInt()
                if (r1 != 0) goto L2f
            L24:
                int r5 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateResponseBody.Creator.copydefault
                int r5 = r5 + 23
                int r1 = r5 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateResponseBody.Creator.component1 = r1
                int r5 = r5 % r0
                r5 = 0
                goto L47
            L2f:
                int r0 = r5.readInt()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
            L38:
                if (r2 == r0) goto L46
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateData> r3 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateData.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r5)
                r1.add(r3)
                int r2 = r2 + 1
                goto L38
            L46:
                r5 = r1
            L47:
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateResponseBody r0 = new com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateResponseBody
                java.util.List r5 = (java.util.List) r5
                r0.<init>(r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateResponseBody.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state.StateResponseBody");
        }

        @Override
        public StateResponseBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 23;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final StateResponseBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 77;
            component1 = i3 % 128;
            StateResponseBody[] stateResponseBodyArr = new StateResponseBody[i];
            if (i3 % 2 == 0) {
                return stateResponseBodyArr;
            }
            throw null;
        }

        @Override
        public StateResponseBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 65;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            StateResponseBody[] stateResponseBodyArrNewArray = newArray(i);
            int i5 = copydefault + 73;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return stateResponseBodyArrNewArray;
        }
    }

    public StateResponseBody(List<StateData> list) {
        this.data = list;
    }

    public final List<StateData> getData() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        List<StateData> list = this.data;
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return list;
    }

    static {
        int i = ShareDataUIState + 83;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static StateResponseBody copy$default(StateResponseBody stateResponseBody, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 101;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 33;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            list = stateResponseBody.data;
            if (i7 == 0) {
                int i8 = 6 / 0;
            }
        }
        return stateResponseBody.copy(list);
    }

    public final List<StateData> component1() {
        int i = 2 % 2;
        int i2 = component3 + 103;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<StateData> list = this.data;
        int i5 = i3 + 73;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateResponseBody copy(List<StateData> data) {
        int i = 2 % 2;
        StateResponseBody stateResponseBody = new StateResponseBody(data);
        int i2 = component1 + 59;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 26 / 0;
        }
        return stateResponseBody;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 7;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 35;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof StateResponseBody)) {
            return false;
        }
        if (Intrinsics.areEqual(this.data, ((StateResponseBody) other).data)) {
            return true;
        }
        int i6 = component3 + 59;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            return false;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<StateData> list = this.data;
        if (list != null) {
            return list.hashCode();
        }
        int i5 = i2 + 107;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StateResponseBody(data=" + this.data + ')';
        int i2 = component3 + 33;
        component1 = i2 % 128;
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
        Intrinsics.checkNotNullParameter(dest, "");
        List<StateData> list = this.data;
        if (list == null) {
            int i2 = component3 + 111;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                dest.writeInt(1);
                return;
            } else {
                dest.writeInt(0);
                return;
            }
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<StateData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
            int i3 = component1 + 9;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }
    }
}
