package com.huawei.digitalpayment.consumer.sfcui.bonga.calculator;

import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorResponse;
import com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaCalculatorUiModel;
import com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaConversionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u0010HÆ\u0003Jw\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÇ\u0001J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010.\u001a\u00020/H×\u0001J\t\u00100\u001a\u00020\u0005H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001aR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001aR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/calculator/BongaCalculatorState;", "", "bongaCalculatorUiModel", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaCalculatorUiModel;", "inputValue", "", "errorMessage", "inputHasError", "", "isConversionLoading", "isConversionError", "calculationResult", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaCalculatorResponse;", "isCalculationResultAvailable", "bongaConversionTypeLabels", "", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionType;", "selectedConversion", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaCalculatorUiModel;Ljava/lang/String;Ljava/lang/String;ZZZLcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaCalculatorResponse;ZLjava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionType;)V", "getBongaCalculatorUiModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaCalculatorUiModel;", "getInputValue", "()Ljava/lang/String;", "getErrorMessage", "getInputHasError", "()Z", "getCalculationResult", "()Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaCalculatorResponse;", "getBongaConversionTypeLabels", "()Ljava/util/List;", "getSelectedConversion", "()Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaCalculatorState {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 1;
    private static int getShareableDataState = 1;
    private static int hashCode;
    private static int toString;
    private final List<BongaConversionType> ShareDataUIState;
    private final BongaCalculatorUiModel component1;
    private final String component2;
    private final boolean component3;
    private final boolean component4;
    private final boolean copy;
    private final BongaCalculatorResponse copydefault;
    private final BongaConversionType equals;
    private final boolean getAsAtTimestamp;
    private final String getRequestBeneficiariesState;

    public BongaCalculatorState(BongaCalculatorUiModel bongaCalculatorUiModel, String str, String str2, boolean z, boolean z2, boolean z3, BongaCalculatorResponse bongaCalculatorResponse, boolean z4, List<BongaConversionType> list, BongaConversionType bongaConversionType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(bongaConversionType, "");
        this.component1 = bongaCalculatorUiModel;
        this.getRequestBeneficiariesState = str;
        this.component2 = str2;
        this.component3 = z;
        this.copy = z2;
        this.getAsAtTimestamp = z3;
        this.copydefault = bongaCalculatorResponse;
        this.component4 = z4;
        this.ShareDataUIState = list;
        this.equals = bongaConversionType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BongaCalculatorState(BongaCalculatorUiModel bongaCalculatorUiModel, String str, String str2, boolean z, boolean z2, boolean z3, BongaCalculatorResponse bongaCalculatorResponse, boolean z4, List list, BongaConversionType bongaConversionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str3;
        boolean z5;
        boolean z6;
        BongaConversionType bongaConversionType2;
        BongaCalculatorResponse bongaCalculatorResponse2 = null;
        BongaCalculatorUiModel bongaCalculatorUiModel2 = (i & 1) != 0 ? null : bongaCalculatorUiModel;
        String str4 = "";
        if ((i & 2) != 0) {
            int i2 = getShareableDataState + 17;
            toString = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i & 4) != 0) {
            int i4 = getShareableDataState + 67;
            toString = i4 % 128;
            if (i4 % 2 != 0) {
                bongaCalculatorResponse2.hashCode();
                throw null;
            }
        } else {
            str4 = str2;
        }
        boolean z7 = false;
        if ((i & 8) != 0) {
            int i5 = toString + 31;
            getShareableDataState = i5 % 128;
            z5 = i5 % 2 == 0;
        } else {
            z5 = z;
        }
        boolean z8 = (i & 16) != 0 ? false : z2;
        if ((i & 32) != 0) {
            int i6 = toString + 65;
            getShareableDataState = i6 % 128;
            z6 = i6 % 2 == 0;
            int i7 = 2 % 2;
        } else {
            z6 = z3;
        }
        if ((i & 64) != 0) {
            int i8 = toString + 113;
            getShareableDataState = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
        } else {
            bongaCalculatorResponse2 = bongaCalculatorResponse;
        }
        if ((i & 128) != 0) {
            int i9 = getShareableDataState + 125;
            toString = i9 % 128;
            if (i9 % 2 != 0) {
                z7 = true;
            }
        } else {
            z7 = z4;
        }
        List listListOf = (i & 256) != 0 ? CollectionsKt.listOf((Object[]) new BongaConversionType[]{new BongaConversionType(R.string.gsm_label_points_to_redeem), new BongaConversionType(R.string.gsm_label_cash_to_spend)}) : list;
        if ((i & 512) != 0) {
            bongaConversionType2 = (BongaConversionType) CollectionsKt.first(listListOf);
            int i10 = getShareableDataState + 77;
            toString = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
        } else {
            bongaConversionType2 = bongaConversionType;
        }
        this(bongaCalculatorUiModel2, str3, str4, z5, z8, z6, bongaCalculatorResponse2, z7, listListOf, bongaConversionType2);
    }

    public final BongaCalculatorUiModel getBongaCalculatorUiModel() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 123;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        BongaCalculatorUiModel bongaCalculatorUiModel = this.component1;
        int i5 = i3 + 81;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return bongaCalculatorUiModel;
        }
        throw null;
    }

    public final String getInputValue() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 63;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i2 + 9;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = toString + 113;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 109;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getInputHasError() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 83;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component3;
        int i5 = i2 + 61;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isConversionLoading() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 43;
        toString = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copy;
        int i5 = i2 + 75;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isConversionError() {
        int i = 2 % 2;
        int i2 = toString + 101;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BongaCalculatorResponse getCalculationResult() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 117;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        BongaCalculatorResponse bongaCalculatorResponse = this.copydefault;
        int i5 = i3 + 101;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return bongaCalculatorResponse;
    }

    public final boolean isCalculationResultAvailable() {
        int i = 2 % 2;
        int i2 = toString + 119;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        boolean z = this.component4;
        int i5 = i3 + 103;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final List<BongaConversionType> getBongaConversionTypeLabels() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 121;
        getShareableDataState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<BongaConversionType> list = this.ShareDataUIState;
        int i4 = i2 + 91;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final BongaConversionType getSelectedConversion() {
        int i = 2 % 2;
        int i2 = toString + 119;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 41;
        hashCode = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BongaCalculatorState() {
        this(null, null, null, false, false, false, null, false, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BongaCalculatorState copy$default(BongaCalculatorState bongaCalculatorState, BongaCalculatorUiModel bongaCalculatorUiModel, String str, String str2, boolean z, boolean z2, boolean z3, BongaCalculatorResponse bongaCalculatorResponse, boolean z4, List list, BongaConversionType bongaConversionType, int i, Object obj) {
        BongaCalculatorUiModel bongaCalculatorUiModel2;
        String str3;
        boolean z5;
        int i2 = 2 % 2;
        int i3 = toString + 37;
        int i4 = i3 % 128;
        getShareableDataState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 31;
            toString = i6 % 128;
            int i7 = i6 % 2;
            bongaCalculatorUiModel2 = bongaCalculatorState.component1;
        } else {
            bongaCalculatorUiModel2 = bongaCalculatorUiModel;
        }
        String str4 = (i & 2) != 0 ? bongaCalculatorState.getRequestBeneficiariesState : str;
        if ((i & 4) != 0) {
            int i8 = toString + 109;
            int i9 = i8 % 128;
            getShareableDataState = i9;
            int i10 = i8 % 2;
            str3 = bongaCalculatorState.component2;
            int i11 = i9 + 51;
            toString = i11 % 128;
            int i12 = i11 % 2;
        } else {
            str3 = str2;
        }
        boolean z6 = (i & 8) != 0 ? bongaCalculatorState.component3 : z;
        boolean z7 = (i & 16) != 0 ? bongaCalculatorState.copy : z2;
        if ((i & 32) != 0) {
            int i13 = toString + 79;
            getShareableDataState = i13 % 128;
            int i14 = i13 % 2;
            z5 = bongaCalculatorState.getAsAtTimestamp;
        } else {
            z5 = z3;
        }
        return bongaCalculatorState.copy(bongaCalculatorUiModel2, str4, str3, z6, z7, z5, (i & 64) != 0 ? bongaCalculatorState.copydefault : bongaCalculatorResponse, (i & 128) != 0 ? bongaCalculatorState.component4 : z4, (i & 256) != 0 ? bongaCalculatorState.ShareDataUIState : list, (i & 512) != 0 ? bongaCalculatorState.equals : bongaConversionType);
    }

    public final BongaCalculatorUiModel component1() {
        int i = 2 % 2;
        int i2 = toString + 35;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BongaConversionType component10() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 113;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        BongaConversionType bongaConversionType = this.equals;
        int i5 = i3 + 109;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return bongaConversionType;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 91;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i3 + 43;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = toString + 79;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 67;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 55;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component3;
        int i5 = i2 + 7;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = toString + 103;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        boolean z = this.copy;
        int i5 = i3 + 61;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 121;
        toString = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.getAsAtTimestamp;
        int i5 = i2 + 3;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final BongaCalculatorResponse component7() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 13;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        BongaCalculatorResponse bongaCalculatorResponse = this.copydefault;
        int i5 = i2 + 111;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return bongaCalculatorResponse;
        }
        throw null;
    }

    public final boolean component8() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 81;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component4;
        }
        throw null;
    }

    public final List<BongaConversionType> component9() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 31;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<BongaConversionType> list = this.ShareDataUIState;
        int i4 = i2 + 109;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return list;
    }

    public final BongaCalculatorState copy(BongaCalculatorUiModel bongaCalculatorUiModel, String inputValue, String errorMessage, boolean inputHasError, boolean isConversionLoading, boolean isConversionError, BongaCalculatorResponse calculationResult, boolean isCalculationResultAvailable, List<BongaConversionType> bongaConversionTypeLabels, BongaConversionType selectedConversion) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(inputValue, "");
        Intrinsics.checkNotNullParameter(errorMessage, "");
        Intrinsics.checkNotNullParameter(bongaConversionTypeLabels, "");
        Intrinsics.checkNotNullParameter(selectedConversion, "");
        BongaCalculatorState bongaCalculatorState = new BongaCalculatorState(bongaCalculatorUiModel, inputValue, errorMessage, inputHasError, isConversionLoading, isConversionError, calculationResult, isCalculationResultAvailable, bongaConversionTypeLabels, selectedConversion);
        int i2 = toString + 55;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        return bongaCalculatorState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 5;
        int i4 = i3 % 128;
        toString = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i4 + 107;
            getShareableDataState = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(other instanceof BongaCalculatorState)) {
            int i8 = i2 + 3;
            toString = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        BongaCalculatorState bongaCalculatorState = (BongaCalculatorState) other;
        if (!Intrinsics.areEqual(this.component1, bongaCalculatorState.component1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, bongaCalculatorState.getRequestBeneficiariesState)) {
            int i10 = getShareableDataState + 107;
            toString = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, bongaCalculatorState.component2) || this.component3 != bongaCalculatorState.component3 || this.copy != bongaCalculatorState.copy) {
            return false;
        }
        if (this.getAsAtTimestamp == bongaCalculatorState.getAsAtTimestamp) {
            return Intrinsics.areEqual(this.copydefault, bongaCalculatorState.copydefault) && this.component4 == bongaCalculatorState.component4 && Intrinsics.areEqual(this.ShareDataUIState, bongaCalculatorState.ShareDataUIState) && Intrinsics.areEqual(this.equals, bongaCalculatorState.equals);
        }
        int i12 = getShareableDataState + 33;
        toString = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = getShareableDataState;
        int i4 = i3 + 13;
        toString = i4 % 128;
        int i5 = i4 % 2;
        BongaCalculatorUiModel bongaCalculatorUiModel = this.component1;
        if (bongaCalculatorUiModel == null) {
            int i6 = i3 + 89;
            toString = i6 % 128;
            i = i6 % 2 != 0 ? 1 : 0;
        } else {
            int iHashCode = bongaCalculatorUiModel.hashCode();
            int i7 = getShareableDataState + 37;
            toString = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 / 4;
            }
            i = iHashCode;
        }
        int iHashCode2 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode3 = this.component2.hashCode();
        int iHashCode4 = Boolean.hashCode(this.component3);
        int iHashCode5 = Boolean.hashCode(this.copy);
        int iHashCode6 = Boolean.hashCode(this.getAsAtTimestamp);
        BongaCalculatorResponse bongaCalculatorResponse = this.copydefault;
        return (((((((((((((((((i * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bongaCalculatorResponse != null ? bongaCalculatorResponse.hashCode() : 0)) * 31) + Boolean.hashCode(this.component4)) * 31) + this.ShareDataUIState.hashCode()) * 31) + this.equals.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaCalculatorState(bongaCalculatorUiModel=" + this.component1 + ", inputValue=" + this.getRequestBeneficiariesState + ", errorMessage=" + this.component2 + ", inputHasError=" + this.component3 + ", isConversionLoading=" + this.copy + ", isConversionError=" + this.getAsAtTimestamp + ", calculationResult=" + this.copydefault + ", isCalculationResultAvailable=" + this.component4 + ", bongaConversionTypeLabels=" + this.ShareDataUIState + ", selectedConversion=" + this.equals + ")";
        int i2 = getShareableDataState + 77;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
        return str;
    }
}
