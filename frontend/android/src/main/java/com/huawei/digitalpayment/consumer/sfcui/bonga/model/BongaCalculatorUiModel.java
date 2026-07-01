package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaCalculatorUiModel;", "", "points", "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPoints", "()Ljava/lang/String;", "getAmount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaCalculatorUiModel {
    public static final int $stable = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 0;
    private static int getRequestBeneficiariesState = 1;
    private final String ShareDataUIState;
    private final String component1;

    public BongaCalculatorUiModel(String str, String str2) {
        this.component1 = str;
        this.ShareDataUIState = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaCalculatorUiModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 65;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 19;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i8 = getRequestBeneficiariesState + 125;
            component2 = i8 % 128;
            if (i8 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str2 = "";
        }
        this(str, str2);
    }

    public final String getPoints() {
        int i = 2 % 2;
        int i2 = component2 + 123;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 57;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 85;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 1 + 79;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BongaCalculatorUiModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static BongaCalculatorUiModel copy$default(BongaCalculatorUiModel bongaCalculatorUiModel, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = bongaCalculatorUiModel.component1;
        }
        if ((i & 2) != 0) {
            int i3 = component2 + 123;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            str2 = bongaCalculatorUiModel.ShareDataUIState;
        }
        BongaCalculatorUiModel bongaCalculatorUiModelCopy = bongaCalculatorUiModel.copy(str, str2);
        int i5 = component2 + 95;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return bongaCalculatorUiModelCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 61;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 109;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 51;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BongaCalculatorUiModel copy(String points, String amount) {
        int i = 2 % 2;
        BongaCalculatorUiModel bongaCalculatorUiModel = new BongaCalculatorUiModel(points, amount);
        int i2 = component2 + 91;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return bongaCalculatorUiModel;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 31;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 107;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof BongaCalculatorUiModel)) {
            return false;
        }
        BongaCalculatorUiModel bongaCalculatorUiModel = (BongaCalculatorUiModel) other;
        if (!Intrinsics.areEqual(this.component1, bongaCalculatorUiModel.component1)) {
            int i7 = getRequestBeneficiariesState + 107;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, bongaCalculatorUiModel.ShareDataUIState)) {
            return true;
        }
        int i9 = component2 + 13;
        getRequestBeneficiariesState = i9 % 128;
        if (i9 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int iHashCode2 = 0;
        if (i3 % 2 != 0) {
            str = this.component1;
            iHashCode = 1;
            if (str != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = str.hashCode();
            }
            int i4 = i2 + 121;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            str = this.component1;
            if (str == null) {
                iHashCode = 0;
                int i42 = i2 + 121;
                component2 = i42 % 128;
                int i52 = i42 % 2;
            }
            iHashCode = iHashCode2;
            iHashCode2 = str.hashCode();
        }
        String str2 = this.ShareDataUIState;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaCalculatorUiModel(points=" + this.component1 + ", amount=" + this.ShareDataUIState + ")";
        int i2 = component2 + 37;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
