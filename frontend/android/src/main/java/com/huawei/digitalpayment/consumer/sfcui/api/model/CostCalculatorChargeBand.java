package com.huawei.digitalpayment.consumer.sfcui.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÇ\u0001J\b\u0010'\u001a\u00020\u0003H\u0007J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H×\u0003J\t\u0010,\u001a\u00020\u0003H×\u0001J\t\u0010-\u001a\u00020\u0006H×\u0001J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorChargeBand;", "Landroid/os/Parcelable;", "agentWithdrawal", "", "atmWithdrawal", "createdBy", "", "createdOn", GriverCacheDao.COLUMN_CACHE_ID, "maxAmount", "minAmount", "sendToRegistered", "sendToRegisteredOtherMno", "sendToUnregistered", "<init>", "(IILjava/lang/String;Ljava/lang/String;IIIIII)V", "getAgentWithdrawal", "()I", "getAtmWithdrawal", "getCreatedBy", "()Ljava/lang/String;", "getCreatedOn", "getId", "getMaxAmount", "getMinAmount", "getSendToRegistered", "getSendToRegisteredOtherMno", "getSendToUnregistered", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorChargeBand implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CostCalculatorChargeBand> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("agentWithdrawal")
    private final int agentWithdrawal;

    @SerializedName("atmWithdrawal")
    private final int atmWithdrawal;

    @SerializedName("createdBy")
    private final String createdBy;

    @SerializedName("createdOn")
    private final String createdOn;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final int id;

    @SerializedName("maxAmount")
    private final int maxAmount;

    @SerializedName("minAmount")
    private final int minAmount;

    @SerializedName("sendToRegistered")
    private final int sendToRegistered;

    @SerializedName("sendToRegisteredOtherMno")
    private final int sendToRegisteredOtherMno;

    @SerializedName("sendToUnregistered")
    private final int sendToUnregistered;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CostCalculatorChargeBand> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CostCalculatorChargeBand createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CostCalculatorChargeBand costCalculatorChargeBand = new CostCalculatorChargeBand(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            int i2 = copydefault + 3;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return costCalculatorChargeBand;
        }

        @Override
        public CostCalculatorChargeBand createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 99;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            CostCalculatorChargeBand costCalculatorChargeBandCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 88 / 0;
            }
            int i5 = ShareDataUIState + 29;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return costCalculatorChargeBandCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CostCalculatorChargeBand[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 13;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            CostCalculatorChargeBand[] costCalculatorChargeBandArr = new CostCalculatorChargeBand[i];
            int i6 = i4 + 69;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 87 / 0;
            }
            return costCalculatorChargeBandArr;
        }

        @Override
        public CostCalculatorChargeBand[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 121;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            CostCalculatorChargeBand[] costCalculatorChargeBandArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 54 / 0;
            }
            return costCalculatorChargeBandArrNewArray;
        }
    }

    public CostCalculatorChargeBand(int i, int i2, String str, String str2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.agentWithdrawal = i;
        this.atmWithdrawal = i2;
        this.createdBy = str;
        this.createdOn = str2;
        this.id = i3;
        this.maxAmount = i4;
        this.minAmount = i5;
        this.sendToRegistered = i6;
        this.sendToRegisteredOtherMno = i7;
        this.sendToUnregistered = i8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CostCalculatorChargeBand(int i, int i2, String str, String str2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        int i16 = (i9 & 1) != 0 ? 0 : i;
        if ((i9 & 2) != 0) {
            int i17 = ShareDataUIState + 101;
            component3 = i17 % 128;
            int i18 = i17 % 2;
            i10 = 0;
        } else {
            i10 = i2;
        }
        String str3 = (i9 & 4) != 0 ? "" : str;
        String str4 = (i9 & 8) == 0 ? str2 : "";
        if ((i9 & 16) != 0) {
            int i19 = component3 + 45;
            ShareDataUIState = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 2 % 2;
            i11 = 0;
        } else {
            i11 = i3;
        }
        int i22 = (i9 & 32) != 0 ? 0 : i4;
        if ((i9 & 64) != 0) {
            int i23 = component3 + 93;
            ShareDataUIState = i23 % 128;
            i12 = i23 % 2 != 0 ? 1 : 0;
            int i24 = 2 % 2;
        } else {
            i12 = i5;
        }
        if ((i9 & 128) != 0) {
            int i25 = component3 + 35;
            ShareDataUIState = i25 % 128;
            int i26 = i25 % 2;
            int i27 = 2 % 2;
            i13 = 0;
        } else {
            i13 = i6;
        }
        if ((i9 & 256) != 0) {
            int i28 = 2 % 2;
            i14 = 0;
        } else {
            i14 = i7;
        }
        if ((i9 & 512) != 0) {
            int i29 = ShareDataUIState + 27;
            component3 = i29 % 128;
            int i30 = i29 % 2;
            int i31 = 2 % 2;
        } else {
            i15 = i8;
        }
        this(i16, i10, str3, str4, i11, i22, i12, i13, i14, i15);
    }

    public final int getAgentWithdrawal() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 87;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.agentWithdrawal;
        int i6 = i2 + 29;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 67 / 0;
        }
        return i5;
    }

    public final int getAtmWithdrawal() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.atmWithdrawal;
        int i6 = i3 + 35;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final String getCreatedBy() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.createdBy;
        int i5 = i2 + 115;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCreatedOn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.createdOn;
        int i5 = i2 + 41;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.id;
        int i6 = i2 + 71;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getMaxAmount() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.maxAmount;
        if (i3 != 0) {
            int i5 = 1 / 0;
        }
        return i4;
    }

    public final int getMinAmount() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.minAmount;
        int i6 = i2 + 63;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getSendToRegistered() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.sendToRegistered;
        }
        throw null;
    }

    public final int getSendToRegisteredOtherMno() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.sendToRegisteredOtherMno;
        int i5 = i3 + 15;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int getSendToUnregistered() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.sendToUnregistered;
        int i6 = i3 + 21;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static {
        int i = component1 + 85;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public CostCalculatorChargeBand() {
        this(0, 0, null, null, 0, 0, 0, 0, 0, 0, 1023, null);
    }

    public static CostCalculatorChargeBand copy$default(CostCalculatorChargeBand costCalculatorChargeBand, int i, int i2, String str, String str2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Object obj) {
        int i10;
        String str3;
        int i11;
        int i12;
        int i13;
        int i14 = 2 % 2;
        int i15 = (i9 & 1) != 0 ? costCalculatorChargeBand.agentWithdrawal : i;
        if ((i9 & 2) != 0) {
            i10 = costCalculatorChargeBand.atmWithdrawal;
            int i16 = component3 + 57;
            ShareDataUIState = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 4 % 5;
            }
        } else {
            i10 = i2;
        }
        String str4 = (i9 & 4) != 0 ? costCalculatorChargeBand.createdBy : str;
        if ((i9 & 8) != 0) {
            int i18 = component3 + 45;
            ShareDataUIState = i18 % 128;
            if (i18 % 2 != 0) {
                str3 = costCalculatorChargeBand.createdOn;
                int i19 = 50 / 0;
            } else {
                str3 = costCalculatorChargeBand.createdOn;
            }
        } else {
            str3 = str2;
        }
        int i20 = (i9 & 16) != 0 ? costCalculatorChargeBand.id : i3;
        int i21 = (i9 & 32) != 0 ? costCalculatorChargeBand.maxAmount : i4;
        int i22 = (i9 & 64) != 0 ? costCalculatorChargeBand.minAmount : i5;
        if ((i9 & 128) != 0) {
            i11 = costCalculatorChargeBand.sendToRegistered;
            int i23 = ShareDataUIState + 89;
            component3 = i23 % 128;
            int i24 = i23 % 2;
        } else {
            i11 = i6;
        }
        if ((i9 & 256) != 0) {
            int i25 = ShareDataUIState + 43;
            component3 = i25 % 128;
            int i26 = i25 % 2;
            i12 = costCalculatorChargeBand.sendToRegisteredOtherMno;
        } else {
            i12 = i7;
        }
        if ((i9 & 512) != 0) {
            int i27 = ShareDataUIState + 29;
            component3 = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = costCalculatorChargeBand.sendToUnregistered;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i13 = costCalculatorChargeBand.sendToUnregistered;
        } else {
            i13 = i8;
        }
        return costCalculatorChargeBand.copy(i15, i10, str4, str3, i20, i21, i22, i11, i12, i13);
    }

    public final int component1() {
        int i;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 123;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.agentWithdrawal;
            int i5 = 35 / 0;
        } else {
            i = this.agentWithdrawal;
        }
        int i6 = i3 + 89;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 16 / 0;
        }
        return i;
    }

    public final int component10() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.sendToUnregistered;
        int i5 = i3 + 75;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.atmWithdrawal;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.createdBy;
        int i5 = i3 + 111;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            str = this.createdOn;
            int i4 = 78 / 0;
        } else {
            str = this.createdOn;
        }
        int i5 = i3 + 105;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.id;
        int i6 = i2 + 109;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.maxAmount;
        int i6 = i2 + 93;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.minAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component8() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.sendToRegistered;
        int i5 = i3 + 85;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    public final int component9() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.sendToRegisteredOtherMno;
        int i6 = i3 + 15;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final CostCalculatorChargeBand copy(int agentWithdrawal, int atmWithdrawal, String createdBy, String createdOn, int id, int maxAmount, int minAmount, int sendToRegistered, int sendToRegisteredOtherMno, int sendToUnregistered) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(createdBy, "");
        Intrinsics.checkNotNullParameter(createdOn, "");
        CostCalculatorChargeBand costCalculatorChargeBand = new CostCalculatorChargeBand(agentWithdrawal, atmWithdrawal, createdBy, createdOn, id, maxAmount, minAmount, sendToRegistered, sendToRegisteredOtherMno, sendToUnregistered);
        int i2 = component3 + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return costCalculatorChargeBand;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 107;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i4 + 63;
            component3 = i6 % 128;
            boolean z = i6 % 2 != 0;
            int i7 = i4 + 9;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return z;
        }
        if (!(other instanceof CostCalculatorChargeBand)) {
            return false;
        }
        CostCalculatorChargeBand costCalculatorChargeBand = (CostCalculatorChargeBand) other;
        if (this.agentWithdrawal != costCalculatorChargeBand.agentWithdrawal) {
            return false;
        }
        if (this.atmWithdrawal != costCalculatorChargeBand.atmWithdrawal) {
            int i9 = i2 + 91;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.createdBy, costCalculatorChargeBand.createdBy) || !Intrinsics.areEqual(this.createdOn, costCalculatorChargeBand.createdOn)) {
            return false;
        }
        if (this.id != costCalculatorChargeBand.id) {
            int i11 = ShareDataUIState + 93;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (this.maxAmount != costCalculatorChargeBand.maxAmount) {
            int i13 = ShareDataUIState + 109;
            component3 = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (this.minAmount != costCalculatorChargeBand.minAmount) {
            return false;
        }
        if (this.sendToRegistered != costCalculatorChargeBand.sendToRegistered) {
            int i15 = component3 + 45;
            ShareDataUIState = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (this.sendToRegisteredOtherMno != costCalculatorChargeBand.sendToRegisteredOtherMno) {
            int i17 = ShareDataUIState + 71;
            component3 = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        if (this.sendToUnregistered == costCalculatorChargeBand.sendToUnregistered) {
            return true;
        }
        int i19 = ShareDataUIState + 93;
        component3 = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((Integer.hashCode(this.agentWithdrawal) * 31) + Integer.hashCode(this.atmWithdrawal)) * 31) + this.createdBy.hashCode()) * 31) + this.createdOn.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + Integer.hashCode(this.maxAmount)) * 31) + Integer.hashCode(this.minAmount)) * 31) + Integer.hashCode(this.sendToRegistered)) * 31) + Integer.hashCode(this.sendToRegisteredOtherMno)) * 31) + Integer.hashCode(this.sendToUnregistered);
        int i4 = ShareDataUIState + 13;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CostCalculatorChargeBand(agentWithdrawal=" + this.agentWithdrawal + ", atmWithdrawal=" + this.atmWithdrawal + ", createdBy=" + this.createdBy + ", createdOn=" + this.createdOn + ", id=" + this.id + ", maxAmount=" + this.maxAmount + ", minAmount=" + this.minAmount + ", sendToRegistered=" + this.sendToRegistered + ", sendToRegisteredOtherMno=" + this.sendToRegisteredOtherMno + ", sendToUnregistered=" + this.sendToUnregistered + ")";
        int i2 = ShareDataUIState + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.agentWithdrawal);
        dest.writeInt(this.atmWithdrawal);
        dest.writeString(this.createdBy);
        dest.writeString(this.createdOn);
        dest.writeInt(this.id);
        dest.writeInt(this.maxAmount);
        dest.writeInt(this.minAmount);
        dest.writeInt(this.sendToRegistered);
        dest.writeInt(this.sendToRegisteredOtherMno);
        dest.writeInt(this.sendToUnregistered);
        int i4 = component3 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
