package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/PreviewPdfResp;", "Landroid/os/Parcelable;", "pdf_data", "", "responseCode", "responseDesc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPdf_data", "()Ljava/lang/String;", "getResponseCode", "getResponseDesc", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreviewPdfResp implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PreviewPdfResp> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final String pdf_data;
    private final String responseCode;
    private final String responseDesc;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PreviewPdfResp> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PreviewPdfResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            PreviewPdfResp previewPdfResp = new PreviewPdfResp(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 67;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return previewPdfResp;
        }

        @Override
        public PreviewPdfResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 79;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            PreviewPdfResp previewPdfRespCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 67;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return previewPdfRespCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PreviewPdfResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 83;
            int i4 = i3 % 128;
            component3 = i4;
            PreviewPdfResp[] previewPdfRespArr = new PreviewPdfResp[i];
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 79;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return previewPdfRespArr;
        }

        @Override
        public PreviewPdfResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 1;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            PreviewPdfResp[] previewPdfRespArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 55;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 11 / 0;
            }
            return previewPdfRespArrNewArray;
        }
    }

    public PreviewPdfResp(String str, String str2, String str3) {
        this.pdf_data = str;
        this.responseCode = str2;
        this.responseDesc = str3;
    }

    public final String getPdf_data() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pdf_data;
        int i5 = i2 + 11;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getResponseCode() {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.responseCode;
        int i5 = i3 + 107;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getResponseDesc() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.responseDesc;
        int i5 = i2 + 5;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 117;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 60 / 0;
        }
    }

    public static PreviewPdfResp copy$default(PreviewPdfResp previewPdfResp, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 31;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str = previewPdfResp.pdf_data;
        }
        if ((i & 2) != 0) {
            str2 = previewPdfResp.responseCode;
        }
        if ((i & 4) != 0) {
            str3 = previewPdfResp.responseDesc;
            int i5 = copydefault + 99;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
        return previewPdfResp.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pdf_data;
        int i5 = i2 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.responseCode;
            int i4 = 76 / 0;
        } else {
            str = this.responseCode;
        }
        int i5 = i3 + 21;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.responseDesc;
        int i4 = i3 + 61;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final PreviewPdfResp copy(String pdf_data, String responseCode, String responseDesc) {
        int i = 2 % 2;
        PreviewPdfResp previewPdfResp = new PreviewPdfResp(pdf_data, responseCode, responseDesc);
        int i2 = component3 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return previewPdfResp;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 73;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i3 + 79;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof PreviewPdfResp)) {
            return false;
        }
        PreviewPdfResp previewPdfResp = (PreviewPdfResp) other;
        if (!Intrinsics.areEqual(this.pdf_data, previewPdfResp.pdf_data)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.responseCode, previewPdfResp.responseCode))) {
            return Intrinsics.areEqual(this.responseDesc, previewPdfResp.responseDesc);
        }
        int i6 = copydefault + 117;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.pdf_data;
        if (str == null) {
            int i2 = copydefault + 97;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.responseCode;
        if (str2 == null) {
            int i4 = component3 + 11;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.responseDesc;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PreviewPdfResp(pdf_data=" + this.pdf_data + ", responseCode=" + this.responseCode + ", responseDesc=" + this.responseDesc + ")";
        int i2 = component3 + 11;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.pdf_data;
        if (i3 != 0) {
            dest.writeString(str);
            dest.writeString(this.responseCode);
            dest.writeString(this.responseDesc);
        } else {
            dest.writeString(str);
            dest.writeString(this.responseCode);
            dest.writeString(this.responseDesc);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
