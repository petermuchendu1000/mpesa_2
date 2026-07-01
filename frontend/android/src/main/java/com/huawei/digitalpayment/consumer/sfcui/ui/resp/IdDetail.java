package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/IdDetail;", "Landroid/os/Parcelable;", CheckIdentityActivity.ID_NUMBER, "", CheckIdentityActivity.ID_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdNumber", "()Ljava/lang/String;", "getIdType", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IdDetail implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<IdDetail> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName(CheckIdentityActivity.ID_NUMBER)
    private final String idNumber;

    @SerializedName(CheckIdentityActivity.ID_TYPE)
    private final String idType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IdDetail> {
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IdDetail createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            IdDetail idDetail = new IdDetail(parcel.readString(), parcel.readString());
            int i2 = component3 + 59;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return idDetail;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public IdDetail createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 15;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            IdDetail idDetailCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 27;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return idDetailCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IdDetail[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 47;
            component3 = i4 % 128;
            IdDetail[] idDetailArr = new IdDetail[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 45;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return idDetailArr;
            }
            throw null;
        }

        @Override
        public IdDetail[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 77;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            IdDetail[] idDetailArrNewArray = newArray(i);
            int i5 = component3 + 47;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return idDetailArrNewArray;
            }
            throw null;
        }
    }

    public IdDetail(String str, String str2) {
        this.idNumber = str;
        this.idType = str2;
    }

    public final String getIdNumber() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.idNumber;
        int i4 = i3 + 117;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return str;
    }

    public final String getIdType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.idType;
        if (i3 != 0) {
            int i4 = 88 / 0;
        }
        return str;
    }

    static {
        int i = component2 + 47;
        component1 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.idNumber);
        dest.writeString(this.idType);
        int i4 = ShareDataUIState + 47;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
