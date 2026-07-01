package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaBalanceUIModel;", "", "points", "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPoints", "()Ljava/lang/String;", "getAmount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaBalanceUIModel {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 23 % 128;
    private static int component2 = 0;
    private static int getAsAtTimestamp = 1;
    private final String component3;
    private final String copydefault;

    public BongaBalanceUIModel(String str, String str2) {
        this.copydefault = str;
        this.component3 = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaBalanceUIModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 91;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = getAsAtTimestamp + 13;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            str2 = "";
        }
        this(str, str2);
    }

    public final String getPoints() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            str = this.copydefault;
            int i4 = 78 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i3 + 117;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        if (23 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BongaBalanceUIModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static BongaBalanceUIModel copy$default(BongaBalanceUIModel bongaBalanceUIModel, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getAsAtTimestamp + 3;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                str = bongaBalanceUIModel.copydefault;
                int i4 = 53 / 0;
            } else {
                str = bongaBalanceUIModel.copydefault;
            }
        }
        if ((i & 2) != 0) {
            int i5 = getAsAtTimestamp + 57;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                str2 = bongaBalanceUIModel.component3;
                int i6 = 39 / 0;
            } else {
                str2 = bongaBalanceUIModel.component3;
            }
        }
        return bongaBalanceUIModel.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 17;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 77;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 87;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BongaBalanceUIModel copy(String points, String amount) {
        int i = 2 % 2;
        BongaBalanceUIModel bongaBalanceUIModel = new BongaBalanceUIModel(points, amount);
        int i2 = getAsAtTimestamp + 51;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return bongaBalanceUIModel;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof BongaBalanceUIModel)) {
            int i4 = i2 + 53;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        BongaBalanceUIModel bongaBalanceUIModel = (BongaBalanceUIModel) other;
        if (!Intrinsics.areEqual(this.copydefault, bongaBalanceUIModel.copydefault)) {
            int i6 = getAsAtTimestamp + 49;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component3, bongaBalanceUIModel.component3)) {
            return true;
        }
        int i8 = ShareDataUIState + 7;
        getAsAtTimestamp = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.component3;
        int iHashCode2 = (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        int i4 = getAsAtTimestamp + 103;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaBalanceUIModel(points=" + this.copydefault + ", amount=" + this.component3 + ")";
        int i2 = ShareDataUIState + 9;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
