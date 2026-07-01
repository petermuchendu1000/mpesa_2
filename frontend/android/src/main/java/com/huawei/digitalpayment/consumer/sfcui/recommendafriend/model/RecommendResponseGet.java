package com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JD\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0007J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u001bH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/model/RecommendResponseGet;", "Landroid/os/Parcelable;", "limitMessage", "", "limitReached", "", "recommendee", "", "Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/model/Recommendee;", "recommenderMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)V", "getLimitMessage", "()Ljava/lang/String;", "getLimitReached", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRecommendee", "()Ljava/util/List;", "getRecommenderMsisdn", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/model/RecommendResponseGet;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecommendResponseGet implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecommendResponseGet> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;

    @SerializedName("limitMessage")
    private final String limitMessage;

    @SerializedName("limitReached")
    private final Boolean limitReached;

    @SerializedName("recommendee")
    private final List<Recommendee> recommendee;

    @SerializedName("recommenderMsisdn")
    private final String recommenderMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecommendResponseGet> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RecommendResponseGet createFromParcel(Parcel parcel) {
            boolean z;
            Boolean boolValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    int i2 = component1 + 97;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            if (parcel.readInt() == 0) {
                int i4 = copydefault + 33;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = parcel.readInt();
                arrayList = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    int i8 = copydefault + 93;
                    component1 = i8 % 128;
                    int i9 = i8 % 2;
                    arrayList.add(Recommendee.CREATOR.createFromParcel(parcel));
                }
            }
            return new RecommendResponseGet(string, boolValueOf, arrayList, parcel.readString());
        }

        @Override
        public RecommendResponseGet createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 41;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RecommendResponseGet[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 43;
            component1 = i4 % 128;
            RecommendResponseGet[] recommendResponseGetArr = new RecommendResponseGet[i];
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 15;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return recommendResponseGetArr;
        }

        @Override
        public RecommendResponseGet[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 83;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            RecommendResponseGet[] recommendResponseGetArrNewArray = newArray(i);
            int i5 = component1 + 49;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return recommendResponseGetArrNewArray;
        }
    }

    public RecommendResponseGet(String str, Boolean bool, List<Recommendee> list, String str2) {
        this.limitMessage = str;
        this.limitReached = bool;
        this.recommendee = list;
        this.recommenderMsisdn = str2;
    }

    public final String getLimitMessage() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.limitMessage;
            int i4 = 13 / 0;
        } else {
            str = this.limitMessage;
        }
        int i5 = i3 + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Boolean getLimitReached() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.limitReached;
        int i4 = i3 + 3;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return bool;
        }
        throw null;
    }

    public final List<Recommendee> getRecommendee() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<Recommendee> list = this.recommendee;
        int i5 = i2 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String getRecommenderMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.recommenderMsisdn;
        int i5 = i2 + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component3 + 21;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            int i2 = 63 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RecommendResponseGet copy$default(RecommendResponseGet recommendResponseGet, String str, Boolean bool, List list, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 47;
        component1 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            str = recommendResponseGet.limitMessage;
            int i5 = i3 + 63;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            bool = recommendResponseGet.limitReached;
            int i7 = component1 + 119;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((i & 4) != 0) {
            list = recommendResponseGet.recommendee;
        }
        if ((i & 8) != 0) {
            str2 = recommendResponseGet.recommenderMsisdn;
            int i9 = component1 + 41;
            component2 = i9 % 128;
            int i10 = i9 % 2;
        }
        return recommendResponseGet.copy(str, bool, list, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 35;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.limitMessage;
        int i5 = i2 + 123;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.limitReached;
        int i5 = i3 + 81;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 10 / 0;
        }
        return bool;
    }

    public final List<Recommendee> component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<Recommendee> list = this.recommendee;
        int i5 = i2 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 67;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.recommenderMsisdn;
        int i4 = i3 + 27;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final RecommendResponseGet copy(String limitMessage, Boolean limitReached, List<Recommendee> recommendee, String recommenderMsisdn) {
        int i = 2 % 2;
        RecommendResponseGet recommendResponseGet = new RecommendResponseGet(limitMessage, limitReached, recommendee, recommenderMsisdn);
        int i2 = component2 + 43;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return recommendResponseGet;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 123;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendResponseGet)) {
            int i2 = component1 + 113;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        RecommendResponseGet recommendResponseGet = (RecommendResponseGet) other;
        if (!(!Intrinsics.areEqual(this.limitMessage, recommendResponseGet.limitMessage))) {
            return (!Intrinsics.areEqual(this.limitReached, recommendResponseGet.limitReached) || (Intrinsics.areEqual(this.recommendee, recommendResponseGet.recommendee) ^ true) || (Intrinsics.areEqual(this.recommenderMsisdn, recommendResponseGet.recommenderMsisdn) ^ true)) ? false : true;
        }
        int i4 = component2 + 93;
        component1 = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.limitMessage;
        if (str == null) {
            int i2 = component2 + 43;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = component1 + 51;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
        Boolean bool = this.limitReached;
        if (bool == null) {
            int i6 = component2 + 71;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bool.hashCode();
        }
        List<Recommendee> list = this.recommendee;
        if (list == null) {
            int i8 = component2 + 41;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = list.hashCode();
        }
        String str2 = this.recommenderMsisdn;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RecommendResponseGet(limitMessage=" + this.limitMessage + ", limitReached=" + this.limitReached + ", recommendee=" + this.recommendee + ", recommenderMsisdn=" + this.recommenderMsisdn + ")";
        int i2 = component2 + 39;
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
        int i2 = component2 + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.limitMessage);
        Boolean bool = this.limitReached;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<Recommendee> list = this.recommendee;
        if (list == null) {
            int i4 = component2 + 37;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                dest.writeInt(1);
            } else {
                dest.writeInt(0);
            }
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Recommendee> it = list.iterator();
            while (!(!it.hasNext())) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.recommenderMsisdn);
        int i5 = component2 + 89;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
