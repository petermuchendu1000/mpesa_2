package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/Percentage;", "Landroid/os/Parcelable;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "serviceId", "percent", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;F)V", "(Ljava/lang/String;F)V", "getCategory", "()Ljava/lang/String;", "getServiceId", "getPercent", "()F", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Percentage implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Percentage> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
    private final String category;

    @SerializedName("percent")
    private final float percent;

    @SerializedName("serviceId")
    private final String serviceId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Percentage> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Percentage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Percentage percentage = new Percentage(parcel.readString(), parcel.readString(), parcel.readFloat());
            int i2 = ShareDataUIState + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return percentage;
        }

        @Override
        public Percentage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 53;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Percentage[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 55;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            Percentage[] percentageArr = new Percentage[i];
            int i6 = i4 + 29;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 13 / 0;
            }
            return percentageArr;
        }

        @Override
        public Percentage[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 113;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            Percentage[] percentageArrNewArray = newArray(i);
            int i5 = component3 + 67;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return percentageArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Percentage(String str, String str2, float f) {
        this.category = str;
        this.serviceId = str2;
        this.percent = f;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.category;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getServiceId() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.serviceId;
        int i5 = i3 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final float getPercent() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        float f = this.percent;
        int i4 = i2 + 65;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return f;
        }
        obj.hashCode();
        throw null;
    }

    public Percentage(String str, float f) {
        this(str, null, f);
    }

    static {
        int i = ShareDataUIState + 47;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static Percentage copy$default(Percentage percentage, String str, String str2, float f, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 121;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                String str3 = percentage.category;
                throw null;
            }
            str = percentage.category;
        }
        if ((i & 2) != 0) {
            int i4 = component3 + 19;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                str2 = percentage.serviceId;
                int i5 = 66 / 0;
            } else {
                str2 = percentage.serviceId;
            }
        }
        if ((i & 4) != 0) {
            int i6 = component2;
            int i7 = i6 + 51;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            float f2 = percentage.percent;
            int i9 = i6 + 109;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            f = f2;
        }
        return percentage.copy(str, str2, f);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.category;
        int i5 = i3 + 99;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.serviceId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final float component3() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        float f = this.percent;
        int i5 = i3 + 29;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
        return f;
    }

    public final Percentage copy(String category, String serviceId, float percent) {
        int i = 2 % 2;
        Percentage percentage = new Percentage(category, serviceId, percent);
        int i2 = component2 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return percentage;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 115;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 21;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3;
            int i3 = i2 + 47;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 85;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 99 / 0;
            }
            return true;
        }
        if (!(other instanceof Percentage)) {
            int i7 = component3 + 93;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        Percentage percentage = (Percentage) other;
        if (!Intrinsics.areEqual(this.category, percentage.category)) {
            return false;
        }
        if (Intrinsics.areEqual(this.serviceId, percentage.serviceId)) {
            return Float.compare(this.percent, percentage.percent) == 0;
        }
        int i9 = component2 + 73;
        component3 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.category;
        int iHashCode2 = 0;
        if (str == null) {
            int i2 = component2 + 27;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.serviceId;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
            int i4 = component2 + 105;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + Float.hashCode(this.percent);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Percentage(category=" + this.category + ", serviceId=" + this.serviceId + ", percent=" + this.percent + ")";
        int i2 = component2 + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.category);
        dest.writeString(this.serviceId);
        dest.writeFloat(this.percent);
        int i4 = component2 + 89;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
    }
}
