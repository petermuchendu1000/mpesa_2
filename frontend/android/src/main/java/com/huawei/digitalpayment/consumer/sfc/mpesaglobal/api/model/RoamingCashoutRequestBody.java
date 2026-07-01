package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.permission.PermissionConstant;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\"#$B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0015H×\u0001J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Id;", "parts", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts;", "relatedMoneyTransfer", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$RelatedMoneyTransfer;", "<init>", "(Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts;Ljava/util/List;)V", "getId", "()Ljava/util/List;", "getParts", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts;", "getRelatedMoneyTransfer", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Id", "Parts", "RelatedMoneyTransfer", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutRequestBody implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RoamingCashoutRequestBody> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final List<Id> id;

    @SerializedName("parts")
    private final Parts parts;

    @SerializedName("relatedMoneyTransfer")
    private final List<RelatedMoneyTransfer> relatedMoneyTransfer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutRequestBody> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutRequestBody createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int i3 = 0;
            for (int i4 = 0; i4 != i2; i4++) {
                int i5 = copydefault + 71;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                arrayList2.add(Id.CREATOR.createFromParcel(parcel));
            }
            ArrayList arrayList3 = arrayList2;
            Parts partsCreateFromParcel = Parts.CREATOR.createFromParcel(parcel);
            Object obj = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                arrayList = new ArrayList(i7);
                int i8 = copydefault + 15;
                component1 = i8 % 128;
                int i9 = i8 % 2;
                while (i3 != i7) {
                    int i10 = component1 + 29;
                    copydefault = i10 % 128;
                    if (i10 % 2 != 0) {
                        arrayList.add(RelatedMoneyTransfer.CREATOR.createFromParcel(parcel));
                        i3 += 103;
                    } else {
                        arrayList.add(RelatedMoneyTransfer.CREATOR.createFromParcel(parcel));
                        i3++;
                    }
                }
            }
            RoamingCashoutRequestBody roamingCashoutRequestBody = new RoamingCashoutRequestBody(arrayList3, partsCreateFromParcel, arrayList);
            int i11 = copydefault + 43;
            component1 = i11 % 128;
            if (i11 % 2 != 0) {
                return roamingCashoutRequestBody;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public RoamingCashoutRequestBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 15;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            RoamingCashoutRequestBody roamingCashoutRequestBodyCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 95;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return roamingCashoutRequestBodyCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutRequestBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 5;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            RoamingCashoutRequestBody[] roamingCashoutRequestBodyArr = new RoamingCashoutRequestBody[i];
            int i6 = i4 + 1;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return roamingCashoutRequestBodyArr;
        }

        @Override
        public RoamingCashoutRequestBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 19;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            RoamingCashoutRequestBody[] roamingCashoutRequestBodyArrNewArray = newArray(i);
            int i5 = component1 + 31;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 45 / 0;
            }
            return roamingCashoutRequestBodyArrNewArray;
        }
    }

    public RoamingCashoutRequestBody(List<Id> list, Parts parts, List<RelatedMoneyTransfer> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(parts, "");
        this.id = list;
        this.parts = parts;
        this.relatedMoneyTransfer = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RoamingCashoutRequestBody(List list, Parts parts, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = component2;
            int i3 = i2 + 97;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 93;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 2;
            } else {
                int i7 = 2 % 2;
            }
            list2 = null;
        }
        this(list, parts, list2);
    }

    public final List<Id> getId() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.id;
        }
        throw null;
    }

    public final Parts getParts() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Parts parts = this.parts;
        int i5 = i2 + 91;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return parts;
    }

    public final List<RelatedMoneyTransfer> getRelatedMoneyTransfer() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<RelatedMoneyTransfer> list = this.relatedMoneyTransfer;
        int i4 = i2 + 99;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    static {
        int i = component3 + 53;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 44 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RoamingCashoutRequestBody copy$default(RoamingCashoutRequestBody roamingCashoutRequestBody, List list, Parts parts, List list2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 99;
        int i4 = i3 % 128;
        component2 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 77;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                list = roamingCashoutRequestBody.id;
                int i7 = 99 / 0;
            } else {
                list = roamingCashoutRequestBody.id;
            }
        }
        if ((i & 2) != 0) {
            parts = roamingCashoutRequestBody.parts;
            int i8 = i4 + 119;
            component1 = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i & 4) != 0) {
            int i10 = i4 + 1;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            list2 = roamingCashoutRequestBody.relatedMoneyTransfer;
            if (i11 != 0) {
                int i12 = 99 / 0;
            }
        }
        return roamingCashoutRequestBody.copy(list, parts, list2);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Id;", "Landroid/os/Parcelable;", "schemeName", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSchemeName", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Id implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Id> CREATOR = new Creator();
        private static int ShareDataUIState = 1;
        private static int component2 = 1;
        private static int component3;
        private static int copydefault;

        @SerializedName("schemeName")
        private final String schemeName;

        @SerializedName("value")
        private final String value;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Id> {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Id createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                Id id = new Id(parcel.readString(), parcel.readString());
                int i2 = copydefault + 93;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    return id;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Id createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component3 + 27;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return createFromParcel(parcel);
                }
                createFromParcel(parcel);
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Id[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 119;
                component3 = i3 % 128;
                Id[] idArr = new Id[i];
                if (i3 % 2 != 0) {
                    return idArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Id[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 101;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Id[] idArrNewArray = newArray(i);
                if (i4 != 0) {
                    int i5 = 88 / 0;
                }
                int i6 = component3 + 57;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return idArrNewArray;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public Id(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.schemeName = str;
            this.value = str2;
        }

        public final String getSchemeName() {
            int i = 2 % 2;
            int i2 = component3 + 15;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.schemeName;
            }
            throw null;
        }

        public final String getValue() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 39;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.value;
            int i5 = i2 + 27;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 33 / 0;
            }
            return str;
        }

        static {
            int i = copydefault + 23;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static Id copy$default(Id id, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component2;
                int i4 = i3 + 35;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                String str3 = id.schemeName;
                int i6 = i3 + 13;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                str = str3;
            }
            if ((i & 2) != 0) {
                int i8 = component2 + 69;
                component3 = i8 % 128;
                if (i8 % 2 != 0) {
                    str2 = id.value;
                    int i9 = 53 / 0;
                } else {
                    str2 = id.value;
                }
            }
            return id.copy(str, str2);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 85;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.schemeName;
            int i5 = i2 + 121;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component2 + 23;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.value;
            int i5 = i3 + 15;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Id copy(String schemeName, String value) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(schemeName, "");
            Intrinsics.checkNotNullParameter(value, "");
            Id id = new Id(schemeName, value);
            int i2 = component2 + 113;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return id;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 29;
            component3 = i2 % 128;
            return i2 % 2 != 0 ? 1 : 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 35;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof Id) {
                Id id = (Id) other;
                return Intrinsics.areEqual(this.schemeName, id.schemeName) && Intrinsics.areEqual(this.value, id.value);
            }
            int i4 = component2 + 107;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 7;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.schemeName.hashCode() * 31) + this.value.hashCode();
            int i4 = component2 + 33;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Id(schemeName=" + this.schemeName + ", value=" + this.value + ')';
            int i2 = component3 + 115;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 69 / 0;
            }
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component3 + 121;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.schemeName);
            dest.writeString(this.value);
            int i4 = component3 + 7;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final List<Id> component1() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<Id> list = this.id;
        int i4 = i3 + 119;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final Parts component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Parts parts = this.parts;
        int i5 = i2 + 91;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return parts;
    }

    public final List<RelatedMoneyTransfer> component3() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<RelatedMoneyTransfer> list = this.relatedMoneyTransfer;
        int i4 = i3 + 27;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final RoamingCashoutRequestBody copy(List<Id> id, Parts parts, List<RelatedMoneyTransfer> relatedMoneyTransfer) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(parts, "");
        RoamingCashoutRequestBody roamingCashoutRequestBody = new RoamingCashoutRequestBody(id, parts, relatedMoneyTransfer);
        int i2 = component1 + 75;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
        return roamingCashoutRequestBody;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        component2 = i2 % 128;
        return 1 ^ (i2 % 2 == 0 ? 0 : 1);
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 91;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoamingCashoutRequestBody)) {
            int i5 = i3 + 13;
            component2 = i5 % 128;
            return i5 % 2 == 0;
        }
        RoamingCashoutRequestBody roamingCashoutRequestBody = (RoamingCashoutRequestBody) other;
        if (Intrinsics.areEqual(this.id, roamingCashoutRequestBody.id)) {
            return !(Intrinsics.areEqual(this.parts, roamingCashoutRequestBody.parts) ^ true) && Intrinsics.areEqual(this.relatedMoneyTransfer, roamingCashoutRequestBody.relatedMoneyTransfer);
        }
        int i6 = component2 + 93;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 62 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.id.hashCode();
        int iHashCode3 = this.parts.hashCode();
        List<RelatedMoneyTransfer> list = this.relatedMoneyTransfer;
        if (list == null) {
            int i2 = component1 + 37;
            component2 = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = list.hashCode();
        }
        int i3 = (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
        int i4 = component2 + 107;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 81 / 0;
        }
        return i3;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts;", "Landroid/os/Parcelable;", "paymentMethod", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$PaymentMethod;", PermissionConstant.ACTION_REQUEST, "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$Request;", "<init>", "(Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$Request;)V", "getPaymentMethod", "()Ljava/util/List;", "getRequest", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$Request;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentMethod", "Request", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Parts implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Parts> CREATOR = new Creator();
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;

        @SerializedName("paymentMethod")
        private final List<PaymentMethod> paymentMethod;

        @SerializedName(PermissionConstant.ACTION_REQUEST)
        private final Request request;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Parts> {
            private static int component3 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Parts createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int i3 = copydefault + 23;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 0;
                while (i5 != i2) {
                    arrayList.add(PaymentMethod.CREATOR.createFromParcel(parcel));
                    i5++;
                    int i6 = copydefault + 103;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                }
                return new Parts(arrayList, Request.CREATOR.createFromParcel(parcel));
            }

            @Override
            public Parts createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 55;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Parts partsCreateFromParcel = createFromParcel(parcel);
                if (i3 != 0) {
                    int i4 = 51 / 0;
                }
                return partsCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Parts[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 33;
                copydefault = i3 % 128;
                Parts[] partsArr = new Parts[i];
                if (i3 % 2 == 0) {
                    int i4 = 75 / 0;
                }
                return partsArr;
            }

            @Override
            public Parts[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 103;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Parts[] partsArrNewArray = newArray(i);
                int i5 = copydefault + 107;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return partsArrNewArray;
            }
        }

        public Parts(List<PaymentMethod> list, Request request) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(request, "");
            this.paymentMethod = list;
            this.request = request;
        }

        public final List<PaymentMethod> getPaymentMethod() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 5;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            List<PaymentMethod> list = this.paymentMethod;
            int i5 = i2 + 87;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final Request getRequest() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 27;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            Request request = this.request;
            int i5 = i2 + 41;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return request;
        }

        static {
            int i = copydefault + 43;
            component1 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Parts copy$default(Parts parts, List list, Request request, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 107;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 1) != 0) {
                list = parts.paymentMethod;
            }
            if ((i & 2) != 0) {
                request = parts.request;
            }
            Parts partsCopy = parts.copy(list, request);
            int i5 = ShareDataUIState + 79;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return partsCopy;
            }
            throw null;
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$PaymentMethod;", "Landroid/os/Parcelable;", "channel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$PaymentMethod$Channel;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$PaymentMethod$Channel;)V", "getChannel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$PaymentMethod$Channel;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Channel", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PaymentMethod implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();
            private static int ShareDataUIState = 0;
            private static int component1 = 0;
            private static int component2 = 1;
            private static int copydefault = 1;

            @SerializedName("channel")
            private final Channel channel;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PaymentMethod> {
                private static int ShareDataUIState = 1;
                private static int component3;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final PaymentMethod createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    PaymentMethod paymentMethod = new PaymentMethod(Channel.CREATOR.createFromParcel(parcel));
                    int i2 = ShareDataUIState + 109;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    return paymentMethod;
                }

                @Override
                public PaymentMethod createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 23;
                    component3 = i2 % 128;
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
                public final PaymentMethod[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 21;
                    int i4 = i3 % 128;
                    ShareDataUIState = i4;
                    int i5 = i3 % 2;
                    PaymentMethod[] paymentMethodArr = new PaymentMethod[i];
                    int i6 = i4 + 85;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                    return paymentMethodArr;
                }

                @Override
                public PaymentMethod[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 109;
                    ShareDataUIState = i3 % 128;
                    if (i3 % 2 != 0) {
                        return newArray(i);
                    }
                    newArray(i);
                    throw null;
                }
            }

            public PaymentMethod(Channel channel) {
                Intrinsics.checkNotNullParameter(channel, "");
                this.channel = channel;
            }

            public final Channel getChannel() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 53;
                int i3 = i2 % 128;
                component2 = i3;
                int i4 = i2 % 2;
                Channel channel = this.channel;
                int i5 = i3 + 73;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return channel;
            }

            static {
                int i = copydefault + 91;
                component1 = i % 128;
                if (i % 2 != 0) {
                    int i2 = 63 / 0;
                }
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$PaymentMethod$Channel;", "Landroid/os/Parcelable;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Channel implements Parcelable {
                public static final int $stable = 0;
                public static final Parcelable.Creator<Channel> CREATOR = new Creator();
                private static int ShareDataUIState = 1;
                private static int component2 = 0;
                private static int component3 = 1;
                private static int copydefault;

                @SerializedName("name")
                private final String name;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Channel> {
                    private static int component1 = 0;
                    private static int component2 = 1;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public final Channel createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(parcel, "");
                        Channel channel = new Channel(parcel.readString());
                        int i2 = component1 + 11;
                        component2 = i2 % 128;
                        if (i2 % 2 != 0) {
                            return channel;
                        }
                        throw null;
                    }

                    @Override
                    public Channel createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        int i2 = component2 + 77;
                        component1 = i2 % 128;
                        int i3 = i2 % 2;
                        Channel channelCreateFromParcel = createFromParcel(parcel);
                        int i4 = component2 + 33;
                        component1 = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 52 / 0;
                        }
                        return channelCreateFromParcel;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public final Channel[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = component2 + 37;
                        component1 = i3 % 128;
                        Channel[] channelArr = new Channel[i];
                        if (i3 % 2 == 0) {
                            return channelArr;
                        }
                        throw null;
                    }

                    @Override
                    public Channel[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = component2 + 115;
                        component1 = i3 % 128;
                        if (i3 % 2 != 0) {
                            newArray(i);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        Channel[] channelArrNewArray = newArray(i);
                        int i4 = component2 + 3;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                        return channelArrNewArray;
                    }
                }

                public Channel(String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    this.name = str;
                }

                public final String getName() {
                    int i = 2 % 2;
                    int i2 = component3 + 125;
                    component2 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return this.name;
                    }
                    throw null;
                }

                static {
                    int i = ShareDataUIState + 49;
                    copydefault = i % 128;
                    int i2 = i % 2;
                }

                public static Channel copy$default(Channel channel, String str, int i, Object obj) {
                    int i2 = 2 % 2;
                    int i3 = component2 + 11;
                    component3 = i3 % 128;
                    if (i3 % 2 != 0 && (i & 1) != 0) {
                        str = channel.name;
                    }
                    Channel channelCopy = channel.copy(str);
                    int i4 = component2 + 57;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return channelCopy;
                }

                public final String component1() {
                    int i = 2 % 2;
                    int i2 = component2 + 117;
                    int i3 = i2 % 128;
                    component3 = i3;
                    int i4 = i2 % 2;
                    String str = this.name;
                    int i5 = i3 + 41;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }

                public final Channel copy(String name) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(name, "");
                    Channel channel = new Channel(name);
                    int i2 = component3 + 31;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    return channel;
                }

                @Override
                public final int describeContents() {
                    int i = 2 % 2;
                    int i2 = component3;
                    int i3 = i2 + 55;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = i2 + 101;
                    component2 = i5 % 128;
                    if (i5 % 2 == 0) {
                        return 0;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public boolean equals(Object other) {
                    int i = 2 % 2;
                    if (this == other) {
                        int i2 = component3 + 121;
                        component2 = i2 % 128;
                        int i3 = i2 % 2;
                        return true;
                    }
                    if (other instanceof Channel) {
                        if (Intrinsics.areEqual(this.name, ((Channel) other).name)) {
                            return true;
                        }
                        int i4 = component2 + 81;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                        return false;
                    }
                    int i6 = component2 + 87;
                    int i7 = i6 % 128;
                    component3 = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 91;
                    component2 = i9 % 128;
                    if (i9 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = component2 + 89;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    int iHashCode = this.name.hashCode();
                    int i4 = component2 + 77;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 74 / 0;
                    }
                    return iHashCode;
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "Channel(name=" + this.name + ')';
                    int i2 = component2 + 43;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    return str;
                }

                @Override
                public final void writeToParcel(Parcel dest, int flags) {
                    int i = 2 % 2;
                    int i2 = component3 + 83;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(dest, "");
                    if (i3 != 0) {
                        dest.writeString(this.name);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    dest.writeString(this.name);
                    int i4 = component2 + 93;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                }
            }

            public static PaymentMethod copy$default(PaymentMethod paymentMethod, Channel channel, int i, Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 71;
                ShareDataUIState = i3 % 128;
                int i4 = i & 1;
                if (i3 % 2 == 0 ? i4 != 0 : i4 != 0) {
                    channel = paymentMethod.channel;
                }
                PaymentMethod paymentMethodCopy = paymentMethod.copy(channel);
                int i5 = ShareDataUIState + 109;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return paymentMethodCopy;
                }
                throw null;
            }

            public final Channel component1() {
                int i = 2 % 2;
                int i2 = component2 + 55;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return this.channel;
                }
                throw null;
            }

            public final PaymentMethod copy(Channel channel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(channel, "");
                PaymentMethod paymentMethod = new PaymentMethod(channel);
                int i2 = component2 + 107;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return paymentMethod;
            }

            @Override
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = ShareDataUIState;
                int i3 = i2 + 105;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 47;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return 0;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                int i2 = ShareDataUIState;
                int i3 = i2 + 111;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                if (this != other) {
                    return !((other instanceof PaymentMethod) ^ true) && Intrinsics.areEqual(this.channel, ((PaymentMethod) other).channel);
                }
                int i5 = i2 + 123;
                component2 = i5 % 128;
                return i5 % 2 != 0;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 23;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    this.channel.hashCode();
                    throw null;
                }
                int iHashCode = this.channel.hashCode();
                int i3 = ShareDataUIState + 51;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return iHashCode;
                }
                throw null;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "PaymentMethod(channel=" + this.channel + ')';
                int i2 = component2 + 15;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                int i = 2 % 2;
                int i2 = component2 + 77;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(dest, "");
                Channel channel = this.channel;
                if (i3 == 0) {
                    channel.writeToParcel(dest, flags);
                } else {
                    channel.writeToParcel(dest, flags);
                    int i4 = 36 / 0;
                }
            }
        }

        public final List<PaymentMethod> component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 5;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            List<PaymentMethod> list = this.paymentMethod;
            int i5 = i2 + 15;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 52 / 0;
            }
            return list;
        }

        public final Request component2() {
            int i = 2 % 2;
            int i2 = component3 + 55;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Request request = this.request;
            int i4 = i3 + 113;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return request;
        }

        public final Parts copy(List<PaymentMethod> paymentMethod, Request request) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(paymentMethod, "");
            Intrinsics.checkNotNullParameter(request, "");
            Parts parts = new Parts(paymentMethod, request);
            int i2 = component3 + 35;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return parts;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 57;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 35;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parts)) {
                int i2 = component3 + 83;
                int i3 = i2 % 128;
                ShareDataUIState = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 23;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            Parts parts = (Parts) other;
            if (!Intrinsics.areEqual(this.paymentMethod, parts.paymentMethod)) {
                return false;
            }
            if (Intrinsics.areEqual(this.request, parts.request)) {
                return true;
            }
            int i7 = ShareDataUIState + 15;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 49;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (this.paymentMethod.hashCode() * 31) + this.request.hashCode();
            int i4 = ShareDataUIState + 71;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Parts(paymentMethod=" + this.paymentMethod + ", request=" + this.request + ')';
            int i2 = component3 + 81;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            Iterator<PaymentMethod> it;
            int i = 2 % 2;
            int i2 = component3 + 37;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            if (i3 != 0) {
                List<PaymentMethod> list = this.paymentMethod;
                dest.writeInt(list.size());
                it = list.iterator();
                int i4 = 59 / 0;
            } else {
                List<PaymentMethod> list2 = this.paymentMethod;
                dest.writeInt(list2.size());
                it = list2.iterator();
            }
            int i5 = component3 + 21;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            this.request.writeToParcel(dest, flags);
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$Request;", "Landroid/os/Parcelable;", "amount", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$Request$Amount;", "convertedAmount", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$Request$ConvertedAmount;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$Request$Amount;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$Request$ConvertedAmount;)V", "getAmount", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$Request$Amount;", "getConvertedAmount", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$Request$ConvertedAmount;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Amount", "ConvertedAmount", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Request implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Request> CREATOR = new Creator();
            private static int component1 = 0;
            private static int component2 = 1;
            private static int component3 = 1;
            private static int copydefault;

            @SerializedName("amount")
            private final Amount amount;

            @SerializedName("convertedAmount")
            private final ConvertedAmount convertedAmount;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Request> {
                private static int ShareDataUIState = 1;
                private static int component3;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final Request createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(parcel, "");
                    Request request = new Request(Amount.CREATOR.createFromParcel(parcel), ConvertedAmount.CREATOR.createFromParcel(parcel));
                    int i2 = component3 + 13;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    return request;
                }

                @Override
                public Request createFromParcel(Parcel parcel) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 97;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Request requestCreateFromParcel = createFromParcel(parcel);
                    int i4 = component3 + 107;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return requestCreateFromParcel;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override
                public final Request[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 21;
                    ShareDataUIState = i3 % 128;
                    Request[] requestArr = new Request[i];
                    if (i3 % 2 == 0) {
                        int i4 = 54 / 0;
                    }
                    return requestArr;
                }

                @Override
                public Request[] newArray(int i) {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 9;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    Request[] requestArrNewArray = newArray(i);
                    if (i4 != 0) {
                        int i5 = 2 / 0;
                    }
                    return requestArrNewArray;
                }
            }

            public Request(Amount amount, ConvertedAmount convertedAmount) {
                Intrinsics.checkNotNullParameter(amount, "");
                Intrinsics.checkNotNullParameter(convertedAmount, "");
                this.amount = amount;
                this.convertedAmount = convertedAmount;
            }

            public final Amount getAmount() {
                int i = 2 % 2;
                int i2 = component3;
                int i3 = i2 + 3;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Amount amount = this.amount;
                int i5 = i2 + 103;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 98 / 0;
                }
                return amount;
            }

            public final ConvertedAmount getConvertedAmount() {
                ConvertedAmount convertedAmount;
                int i = 2 % 2;
                int i2 = component3;
                int i3 = i2 + 63;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    convertedAmount = this.convertedAmount;
                    int i4 = 85 / 0;
                } else {
                    convertedAmount = this.convertedAmount;
                }
                int i5 = i2 + 105;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return convertedAmount;
            }

            static {
                int i = copydefault + 1;
                component2 = i % 128;
                int i2 = i % 2;
            }

            public static Request copy$default(Request request, Amount amount, ConvertedAmount convertedAmount, int i, Object obj) {
                int i2 = 2 % 2;
                if ((i & 1) != 0) {
                    int i3 = component3 + 93;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    amount = request.amount;
                }
                if ((i & 2) != 0) {
                    int i5 = component1 + 9;
                    component3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        convertedAmount = request.convertedAmount;
                        int i6 = 29 / 0;
                    } else {
                        convertedAmount = request.convertedAmount;
                    }
                }
                return request.copy(amount, convertedAmount);
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$Request$Amount;", "Landroid/os/Parcelable;", "currencyID", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrencyID", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class Amount implements Parcelable {
                public static final int $stable = 0;
                public static final Parcelable.Creator<Amount> CREATOR = new Creator();
                private static int ShareDataUIState = 0;
                private static int component1 = 1;
                private static int component3 = 0;
                private static int copydefault = 1;

                @SerializedName("currencyID")
                private final String currencyID;

                @SerializedName("value")
                private final String value;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Amount> {
                    private static int ShareDataUIState = 0;
                    private static int component1 = 1;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public final Amount createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(parcel, "");
                        Amount amount = new Amount(parcel.readString(), parcel.readString());
                        int i2 = component1 + 81;
                        ShareDataUIState = i2 % 128;
                        int i3 = i2 % 2;
                        return amount;
                    }

                    @Override
                    public Amount createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        int i2 = component1 + 3;
                        ShareDataUIState = i2 % 128;
                        if (i2 % 2 == 0) {
                            return createFromParcel(parcel);
                        }
                        createFromParcel(parcel);
                        throw null;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public final Amount[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = component1;
                        int i4 = i3 + 3;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        Amount[] amountArr = new Amount[i];
                        int i6 = i3 + 111;
                        ShareDataUIState = i6 % 128;
                        int i7 = i6 % 2;
                        return amountArr;
                    }

                    @Override
                    public Amount[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = component1 + 41;
                        ShareDataUIState = i3 % 128;
                        int i4 = i3 % 2;
                        Amount[] amountArrNewArray = newArray(i);
                        int i5 = ShareDataUIState + 65;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        return amountArrNewArray;
                    }
                }

                public Amount(String str, String str2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.currencyID = str;
                    this.value = str2;
                }

                public final String getCurrencyID() {
                    int i = 2 % 2;
                    int i2 = copydefault;
                    int i3 = i2 + 93;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    String str = this.currencyID;
                    int i5 = i2 + 5;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }

                public final String getValue() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 119;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    String str = this.value;
                    if (i3 == 0) {
                        int i4 = 79 / 0;
                    }
                    return str;
                }

                static {
                    int i = component1 + 81;
                    component3 = i % 128;
                    int i2 = i % 2;
                }

                public static Amount copy$default(Amount amount, String str, String str2, int i, Object obj) {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 53;
                    int i4 = i3 % 128;
                    copydefault = i4;
                    if (i3 % 2 != 0 && (i & 1) != 0) {
                        int i5 = i4 + 41;
                        int i6 = i5 % 128;
                        ShareDataUIState = i6;
                        int i7 = i5 % 2;
                        String str3 = amount.currencyID;
                        int i8 = i6 + 21;
                        copydefault = i8 % 128;
                        int i9 = i8 % 2;
                        str = str3;
                    }
                    if ((i & 2) != 0) {
                        str2 = amount.value;
                    }
                    return amount.copy(str, str2);
                }

                public final String component1() {
                    int i = 2 % 2;
                    int i2 = copydefault + 111;
                    int i3 = i2 % 128;
                    ShareDataUIState = i3;
                    int i4 = i2 % 2;
                    String str = this.currencyID;
                    int i5 = i3 + 125;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }

                public final String component2() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 17;
                    copydefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        return this.value;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final Amount copy(String currencyID, String value) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(currencyID, "");
                    Intrinsics.checkNotNullParameter(value, "");
                    Amount amount = new Amount(currencyID, value);
                    int i2 = ShareDataUIState + 7;
                    copydefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        return amount;
                    }
                    throw null;
                }

                @Override
                public final int describeContents() {
                    int i = 2 % 2;
                    int i2 = copydefault + 3;
                    ShareDataUIState = i2 % 128;
                    return i2 % 2 != 0 ? 1 : 0;
                }

                public boolean equals(Object other) {
                    int i = 2 % 2;
                    int i2 = copydefault;
                    int i3 = i2 + 73;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    if (this == other) {
                        return true;
                    }
                    if (other instanceof Amount) {
                        Amount amount = (Amount) other;
                        return Intrinsics.areEqual(this.currencyID, amount.currencyID) && Intrinsics.areEqual(this.value, amount.value);
                    }
                    int i5 = i2 + 39;
                    int i6 = i5 % 128;
                    ShareDataUIState = i6;
                    int i7 = i5 % 2;
                    int i8 = i6 + 21;
                    copydefault = i8 % 128;
                    if (i8 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 11;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    int iHashCode = (this.currencyID.hashCode() * 31) + this.value.hashCode();
                    int i4 = ShareDataUIState + 9;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 16 / 0;
                    }
                    return iHashCode;
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "Amount(currencyID=" + this.currencyID + ", value=" + this.value + ')';
                    int i2 = copydefault + 39;
                    ShareDataUIState = i2 % 128;
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
                    int i2 = copydefault + 95;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(dest, "");
                    dest.writeString(this.currencyID);
                    dest.writeString(this.value);
                    int i4 = copydefault + 59;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                }
            }

            public final Amount component1() {
                Amount amount;
                int i = 2 % 2;
                int i2 = component1;
                int i3 = i2 + 61;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    amount = this.amount;
                    int i4 = 81 / 0;
                } else {
                    amount = this.amount;
                }
                int i5 = i2 + 75;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return amount;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final ConvertedAmount component2() {
                int i = 2 % 2;
                int i2 = component1 + 99;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ConvertedAmount convertedAmount = this.convertedAmount;
                if (i3 == 0) {
                    int i4 = 74 / 0;
                }
                return convertedAmount;
            }

            public final Request copy(Amount amount, ConvertedAmount convertedAmount) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(amount, "");
                Intrinsics.checkNotNullParameter(convertedAmount, "");
                Request request = new Request(amount, convertedAmount);
                int i2 = component3 + 57;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return request;
            }

            @Override
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = component1 + 21;
                component3 = i2 % 128;
                return i2 % 2 == 0 ? 1 : 0;
            }

            public boolean equals(Object other) {
                int i = 2 % 2;
                int i2 = component3 + 53;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Request)) {
                    return false;
                }
                Request request = (Request) other;
                if (!Intrinsics.areEqual(this.amount, request.amount)) {
                    int i4 = component3 + 115;
                    int i5 = i4 % 128;
                    component1 = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 91;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                    return false;
                }
                if (!Intrinsics.areEqual(this.convertedAmount, request.convertedAmount)) {
                    int i9 = component1 + 15;
                    component3 = i9 % 128;
                    int i10 = i9 % 2;
                    return false;
                }
                int i11 = component3 + 53;
                component1 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 66 / 0;
                }
                return true;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = component1 + 115;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                int iHashCode = (this.amount.hashCode() * 31) + this.convertedAmount.hashCode();
                int i4 = component3 + 53;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Request(amount=" + this.amount + ", convertedAmount=" + this.convertedAmount + ')';
                int i2 = component1 + 77;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Parts$Request$ConvertedAmount;", "Landroid/os/Parcelable;", "currencyID", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrencyID", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class ConvertedAmount implements Parcelable {
                public static final int $stable = 0;
                public static final Parcelable.Creator<ConvertedAmount> CREATOR = new Creator();
                private static int ShareDataUIState = 0;
                private static int component1 = 0;
                private static int component2 = 1;
                private static int copydefault = 1;

                @SerializedName("currencyID")
                private final String currencyID;

                @SerializedName("value")
                private final String value;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ConvertedAmount> {
                    private static int component2 = 1;
                    private static int copydefault;

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public final ConvertedAmount createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        Intrinsics.checkNotNullParameter(parcel, "");
                        ConvertedAmount convertedAmount = new ConvertedAmount(parcel.readString(), parcel.readString());
                        int i2 = component2 + 103;
                        copydefault = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 5 / 0;
                        }
                        return convertedAmount;
                    }

                    @Override
                    public ConvertedAmount createFromParcel(Parcel parcel) {
                        int i = 2 % 2;
                        int i2 = copydefault + 103;
                        component2 = i2 % 128;
                        int i3 = i2 % 2;
                        ConvertedAmount convertedAmountCreateFromParcel = createFromParcel(parcel);
                        int i4 = copydefault + 85;
                        component2 = i4 % 128;
                        int i5 = i4 % 2;
                        return convertedAmountCreateFromParcel;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override
                    public final ConvertedAmount[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = component2 + 3;
                        copydefault = i3 % 128;
                        ConvertedAmount[] convertedAmountArr = new ConvertedAmount[i];
                        if (i3 % 2 == 0) {
                            return convertedAmountArr;
                        }
                        throw null;
                    }

                    @Override
                    public ConvertedAmount[] newArray(int i) {
                        int i2 = 2 % 2;
                        int i3 = component2 + 109;
                        copydefault = i3 % 128;
                        int i4 = i3 % 2;
                        ConvertedAmount[] convertedAmountArrNewArray = newArray(i);
                        int i5 = component2 + 33;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                        return convertedAmountArrNewArray;
                    }
                }

                public ConvertedAmount(String str, String str2) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.currencyID = str;
                    this.value = str2;
                }

                public final String getCurrencyID() {
                    int i = 2 % 2;
                    int i2 = component2;
                    int i3 = i2 + 41;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    String str = this.currencyID;
                    int i5 = i2 + 125;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }

                public final String getValue() {
                    int i = 2 % 2;
                    int i2 = component2 + 67;
                    int i3 = i2 % 128;
                    component1 = i3;
                    int i4 = i2 % 2;
                    String str = this.value;
                    int i5 = i3 + 39;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }

                static {
                    int i = copydefault + 67;
                    ShareDataUIState = i % 128;
                    if (i % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static ConvertedAmount copy$default(ConvertedAmount convertedAmount, String str, String str2, int i, Object obj) {
                    int i2 = 2 % 2;
                    int i3 = component2;
                    int i4 = i3 + 33;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    if ((i & 1) != 0) {
                        int i6 = i3 + 71;
                        component1 = i6 % 128;
                        int i7 = i6 % 2;
                        str = convertedAmount.currencyID;
                        if (i7 != 0) {
                            int i8 = 20 / 0;
                        }
                    }
                    if ((i & 2) != 0) {
                        int i9 = component1 + 79;
                        component2 = i9 % 128;
                        int i10 = i9 % 2;
                        str2 = convertedAmount.value;
                    }
                    return convertedAmount.copy(str, str2);
                }

                public final String component1() {
                    int i = 2 % 2;
                    int i2 = component2;
                    int i3 = i2 + 19;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    String str = this.currencyID;
                    int i5 = i2 + 41;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }

                public final String component2() {
                    int i = 2 % 2;
                    int i2 = component2 + 125;
                    int i3 = i2 % 128;
                    component1 = i3;
                    int i4 = i2 % 2;
                    String str = this.value;
                    int i5 = i3 + 97;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    return str;
                }

                public final ConvertedAmount copy(String currencyID, String value) {
                    int i = 2 % 2;
                    Intrinsics.checkNotNullParameter(currencyID, "");
                    Intrinsics.checkNotNullParameter(value, "");
                    ConvertedAmount convertedAmount = new ConvertedAmount(currencyID, value);
                    int i2 = component2 + 45;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    return convertedAmount;
                }

                @Override
                public final int describeContents() {
                    int i = 2 % 2;
                    int i2 = component2 + 93;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    return 0;
                }

                public boolean equals(Object other) {
                    int i = 2 % 2;
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ConvertedAmount)) {
                        return false;
                    }
                    ConvertedAmount convertedAmount = (ConvertedAmount) other;
                    if (!(!Intrinsics.areEqual(this.currencyID, convertedAmount.currencyID))) {
                        if (Intrinsics.areEqual(this.value, convertedAmount.value)) {
                            return true;
                        }
                        int i2 = component2 + 19;
                        component1 = i2 % 128;
                        return i2 % 2 != 0;
                    }
                    int i3 = component2 + 17;
                    component1 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 5 / 0;
                    }
                    return false;
                }

                public int hashCode() {
                    int i = 2 % 2;
                    int i2 = component2 + 39;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    int iHashCode = (this.currencyID.hashCode() * 31) + this.value.hashCode();
                    int i4 = component1 + 79;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return iHashCode;
                    }
                    throw null;
                }

                public String toString() {
                    int i = 2 % 2;
                    String str = "ConvertedAmount(currencyID=" + this.currencyID + ", value=" + this.value + ')';
                    int i2 = component1 + 21;
                    component2 = i2 % 128;
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
                    int i2 = component2 + 95;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(dest, "");
                    dest.writeString(this.currencyID);
                    dest.writeString(this.value);
                    int i4 = component2 + 97;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                }
            }

            @Override
            public final void writeToParcel(Parcel dest, int flags) {
                int i = 2 % 2;
                int i2 = component1 + 67;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(dest, "");
                Amount amount = this.amount;
                if (i3 != 0) {
                    amount.writeToParcel(dest, flags);
                    this.convertedAmount.writeToParcel(dest, flags);
                } else {
                    amount.writeToParcel(dest, flags);
                    this.convertedAmount.writeToParcel(dest, flags);
                    int i4 = 12 / 0;
                }
            }
        }
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashoutRequestBody(id=" + this.id + ", parts=" + this.parts + ", relatedMoneyTransfer=" + this.relatedMoneyTransfer + ')';
        int i2 = component2 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<Id> list = this.id;
        dest.writeInt(list.size());
        Iterator<Id> it = list.iterator();
        while (!(!it.hasNext())) {
            int i4 = component2 + 75;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            it.next().writeToParcel(dest, flags);
        }
        this.parts.writeToParcel(dest, flags);
        List<RelatedMoneyTransfer> list2 = this.relatedMoneyTransfer;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list2.size());
        Iterator<RelatedMoneyTransfer> it2 = list2.iterator();
        while (it2.hasNext()) {
            int i5 = component1 + 5;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            it2.next().writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$RelatedMoneyTransfer;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutRequestBody$Id;", "<init>", "(Ljava/util/List;)V", "getId", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RelatedMoneyTransfer implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<RelatedMoneyTransfer> CREATOR = new Creator();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int copydefault;

        @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
        private final List<Id> id;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RelatedMoneyTransfer> {
            private static int component1 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final RelatedMoneyTransfer createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int i3 = 0;
                while (i3 != i2) {
                    int i4 = component1 + 5;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        arrayList.add(Id.CREATOR.createFromParcel(parcel));
                        i3 += 116;
                    } else {
                        arrayList.add(Id.CREATOR.createFromParcel(parcel));
                        i3++;
                    }
                }
                RelatedMoneyTransfer relatedMoneyTransfer = new RelatedMoneyTransfer(arrayList);
                int i5 = copydefault + 65;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 89 / 0;
                }
                return relatedMoneyTransfer;
            }

            @Override
            public RelatedMoneyTransfer createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 63;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                RelatedMoneyTransfer relatedMoneyTransferCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 109;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return relatedMoneyTransferCreateFromParcel;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final RelatedMoneyTransfer[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 51;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                RelatedMoneyTransfer[] relatedMoneyTransferArr = new RelatedMoneyTransfer[i];
                int i6 = i3 + 117;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return relatedMoneyTransferArr;
            }

            @Override
            public RelatedMoneyTransfer[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 35;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                RelatedMoneyTransfer[] relatedMoneyTransferArrNewArray = newArray(i);
                int i5 = component1 + 55;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return relatedMoneyTransferArrNewArray;
            }
        }

        public RelatedMoneyTransfer(List<Id> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.id = list;
        }

        public final List<Id> getId() {
            int i = 2 % 2;
            int i2 = component2 + 39;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            List<Id> list = this.id;
            int i5 = i3 + 119;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        static {
            int i = component1 + 9;
            copydefault = i % 128;
            if (i % 2 != 0) {
                int i2 = 32 / 0;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static RelatedMoneyTransfer copy$default(RelatedMoneyTransfer relatedMoneyTransfer, List list, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 25;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            if (i3 % 2 == 0 && (i & 1) != 0) {
                list = relatedMoneyTransfer.id;
                int i5 = i4 + 109;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
            return relatedMoneyTransfer.copy(list);
        }

        public final List<Id> component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 93;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            List<Id> list = this.id;
            int i4 = i2 + 15;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return list;
        }

        public final RelatedMoneyTransfer copy(List<Id> id) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(id, "");
            RelatedMoneyTransfer relatedMoneyTransfer = new RelatedMoneyTransfer(id);
            int i2 = component2 + 115;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return relatedMoneyTransfer;
            }
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 29;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 103;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 121;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                int i5 = i2 + 69;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(other instanceof RelatedMoneyTransfer)) {
                return false;
            }
            if (Intrinsics.areEqual(this.id, ((RelatedMoneyTransfer) other).id)) {
                return true;
            }
            int i7 = ShareDataUIState;
            int i8 = i7 + 59;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 29;
            component2 = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 61;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.id.hashCode();
            if (i3 == 0) {
                int i4 = 15 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "RelatedMoneyTransfer(id=" + this.id + ')';
            int i2 = component2 + 65;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 25;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            List<Id> list = this.id;
            dest.writeInt(list.size());
            Iterator<Id> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            int i4 = component2 + 99;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
