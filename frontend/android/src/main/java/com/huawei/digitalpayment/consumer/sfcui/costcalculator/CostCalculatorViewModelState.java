package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorChargeBand;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bw\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003Jy\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bHÇ\u0001J\u0013\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010.\u001a\u00020/H×\u0001J\t\u00100\u001a\u00020\bH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019¨\u00061"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorViewModelState;", "", "charges", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorChargeBand;", "selectedTab", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorTab;", "sendWithdrawAmount", "", "lipaShortCode", "lipaAmount", "lipaResult", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/LipaCostResult;", "isLoadingCharges", "", "isCheckingLipaCost", "loadingMessage", "errorMessage", "<init>", "(Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorTab;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/LipaCostResult;ZZLjava/lang/String;Ljava/lang/String;)V", "getCharges", "()Ljava/util/List;", "getSelectedTab", "()Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorTab;", "getSendWithdrawAmount", "()Ljava/lang/String;", "getLipaShortCode", "getLipaAmount", "getLipaResult", "()Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/LipaCostResult;", "()Z", "getLoadingMessage", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorViewModelState {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 1;
    private static int getShareableDataState = 0;
    private static int getSponsorBeneficiariesState = 55 % 128;
    private static int hashCode;
    private final boolean ShareDataUIState;
    private final List<CostCalculatorChargeBand> component1;
    private final String component2;
    private final boolean component3;
    private final String component4;
    private final LipaCostResult copy;
    private final String copydefault;
    private final String equals;
    private final CostCalculatorTab getAsAtTimestamp;
    private final String getRequestBeneficiariesState;

    public CostCalculatorViewModelState(List<CostCalculatorChargeBand> list, CostCalculatorTab costCalculatorTab, String str, String str2, String str3, LipaCostResult lipaCostResult, boolean z, boolean z2, String str4, String str5) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(costCalculatorTab, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component1 = list;
        this.getAsAtTimestamp = costCalculatorTab;
        this.equals = str;
        this.getRequestBeneficiariesState = str2;
        this.component2 = str3;
        this.copy = lipaCostResult;
        this.ShareDataUIState = z;
        this.component3 = z2;
        this.component4 = str4;
        this.copydefault = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CostCalculatorViewModelState(List list, CostCalculatorTab costCalculatorTab, String str, String str2, String str3, LipaCostResult lipaCostResult, boolean z, boolean z2, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList;
        CostCalculatorTab costCalculatorTab2;
        String str6;
        boolean z3;
        String str7;
        if ((i & 1) != 0) {
            listEmptyList = CollectionsKt.emptyList();
            int i2 = 2 % 2;
        } else {
            listEmptyList = list;
        }
        if ((i & 2) != 0) {
            int i3 = hashCode + 101;
            ArtificialStackFrames = i3 % 128;
            if (i3 % 2 == 0) {
                CostCalculatorTab costCalculatorTab3 = CostCalculatorTab.SEND_WITHDRAW;
                throw null;
            }
            costCalculatorTab2 = CostCalculatorTab.SEND_WITHDRAW;
            int i4 = 2 % 2;
        } else {
            costCalculatorTab2 = costCalculatorTab;
        }
        String str8 = "";
        if ((i & 4) != 0) {
            int i5 = 2 % 2;
            str6 = "";
        } else {
            str6 = str;
        }
        String str9 = (i & 8) != 0 ? "" : str2;
        if ((i & 16) != 0) {
            int i6 = hashCode + 47;
            ArtificialStackFrames = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str8 = str3;
        }
        LipaCostResult lipaCostResult2 = (i & 32) != 0 ? null : lipaCostResult;
        if ((i & 64) != 0) {
            int i8 = hashCode + 103;
            ArtificialStackFrames = i8 % 128;
            int i9 = i8 % 2;
            z3 = true;
        } else {
            z3 = z;
        }
        boolean z4 = (i & 128) != 0 ? false : z2;
        if ((i & 256) != 0) {
            int i10 = 2 % 2;
            str7 = null;
        } else {
            str7 = str4;
        }
        this(listEmptyList, costCalculatorTab2, str6, str9, str8, lipaCostResult2, z3, z4, str7, (i & 512) == 0 ? str5 : null);
    }

    public final List<CostCalculatorChargeBand> getCharges() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 37;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        List<CostCalculatorChargeBand> list = this.component1;
        int i5 = i3 + 105;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final CostCalculatorTab getSelectedTab() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 79;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        CostCalculatorTab costCalculatorTab = this.getAsAtTimestamp;
        int i5 = i2 + 43;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return costCalculatorTab;
    }

    public final String getSendWithdrawAmount() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 91;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 101;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
        return str;
    }

    public final String getLipaShortCode() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 29;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i2 + 1;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return str;
    }

    public final String getLipaAmount() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 121;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 47;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final LipaCostResult getLipaResult() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 55;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        LipaCostResult lipaCostResult = this.copy;
        int i4 = i2 + 37;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return lipaCostResult;
    }

    public final boolean isLoadingCharges() {
        int i = 2 % 2;
        int i2 = hashCode + 99;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.ShareDataUIState;
        int i4 = i3 + 125;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean isCheckingLipaCost() {
        int i = 2 % 2;
        int i2 = hashCode + 21;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final String getLoadingMessage() {
        int i = 2 % 2;
        int i2 = hashCode + 79;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component4;
        }
        throw null;
    }

    public final String getErrorMessage() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 115;
        int i3 = i2 % 128;
        hashCode = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.copydefault;
        int i4 = i3 + 9;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        if (55 % 2 == 0) {
            int i = 88 / 0;
        }
    }

    public CostCalculatorViewModelState() {
        this(null, null, null, null, null, null, false, false, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CostCalculatorViewModelState copy$default(CostCalculatorViewModelState costCalculatorViewModelState, List list, CostCalculatorTab costCalculatorTab, String str, String str2, String str3, LipaCostResult lipaCostResult, boolean z, boolean z2, String str4, String str5, int i, Object obj) {
        String str6;
        boolean z3;
        boolean z4;
        String str7;
        int i2 = 2 % 2;
        int i3 = ArtificialStackFrames + 119;
        int i4 = i3 % 128;
        hashCode = i4;
        List list2 = (i3 % 2 == 0 && (i & 1) != 0) ? costCalculatorViewModelState.component1 : list;
        CostCalculatorTab costCalculatorTab2 = (i & 2) != 0 ? costCalculatorViewModelState.getAsAtTimestamp : costCalculatorTab;
        String str8 = (i & 4) != 0 ? costCalculatorViewModelState.equals : str;
        String str9 = (i & 8) != 0 ? costCalculatorViewModelState.getRequestBeneficiariesState : str2;
        if ((i & 16) != 0) {
            int i5 = i4 + 51;
            ArtificialStackFrames = i5 % 128;
            int i6 = i5 % 2;
            str6 = costCalculatorViewModelState.component2;
        } else {
            str6 = str3;
        }
        LipaCostResult lipaCostResult2 = (i & 32) != 0 ? costCalculatorViewModelState.copy : lipaCostResult;
        Object obj2 = null;
        if ((i & 64) != 0) {
            int i7 = ArtificialStackFrames + 51;
            hashCode = i7 % 128;
            if (i7 % 2 != 0) {
                boolean z5 = costCalculatorViewModelState.ShareDataUIState;
                obj2.hashCode();
                throw null;
            }
            z3 = costCalculatorViewModelState.ShareDataUIState;
        } else {
            z3 = z;
        }
        if ((i & 128) != 0) {
            z4 = costCalculatorViewModelState.component3;
            int i8 = hashCode + 13;
            ArtificialStackFrames = i8 % 128;
            int i9 = i8 % 2;
        } else {
            z4 = z2;
        }
        String str10 = (i & 256) != 0 ? costCalculatorViewModelState.component4 : str4;
        if ((i & 512) != 0) {
            int i10 = ArtificialStackFrames + 79;
            hashCode = i10 % 128;
            if (i10 % 2 != 0) {
                String str11 = costCalculatorViewModelState.copydefault;
                obj2.hashCode();
                throw null;
            }
            str7 = costCalculatorViewModelState.copydefault;
        } else {
            str7 = str5;
        }
        return costCalculatorViewModelState.copy(list2, costCalculatorTab2, str8, str9, str6, lipaCostResult2, z3, z4, str10, str7);
    }

    public final List<CostCalculatorChargeBand> component1() {
        int i = 2 % 2;
        int i2 = hashCode + 121;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        List<CostCalculatorChargeBand> list = this.component1;
        int i5 = i3 + 107;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 51;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 7;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final CostCalculatorTab component2() {
        int i = 2 % 2;
        int i2 = hashCode + 109;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        CostCalculatorTab costCalculatorTab = this.getAsAtTimestamp;
        int i5 = i3 + 117;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return costCalculatorTab;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 15;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 69;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 93;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i2 + 101;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = hashCode + 37;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 29;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final LipaCostResult component6() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 113;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        LipaCostResult lipaCostResult = this.copy;
        int i5 = i3 + 11;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return lipaCostResult;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = hashCode + 57;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 9;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component8() {
        boolean z;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 17;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.component3;
            int i4 = 46 / 0;
        } else {
            z = this.component3;
        }
        int i5 = i2 + 77;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 87;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component4;
        int i5 = i3 + 37;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return str;
    }

    public final CostCalculatorViewModelState copy(List<CostCalculatorChargeBand> charges, CostCalculatorTab selectedTab, String sendWithdrawAmount, String lipaShortCode, String lipaAmount, LipaCostResult lipaResult, boolean isLoadingCharges, boolean isCheckingLipaCost, String loadingMessage, String errorMessage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charges, "");
        Intrinsics.checkNotNullParameter(selectedTab, "");
        Intrinsics.checkNotNullParameter(sendWithdrawAmount, "");
        Intrinsics.checkNotNullParameter(lipaShortCode, "");
        Intrinsics.checkNotNullParameter(lipaAmount, "");
        CostCalculatorViewModelState costCalculatorViewModelState = new CostCalculatorViewModelState(charges, selectedTab, sendWithdrawAmount, lipaShortCode, lipaAmount, lipaResult, isLoadingCharges, isCheckingLipaCost, loadingMessage, errorMessage);
        int i2 = ArtificialStackFrames + 107;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return costCalculatorViewModelState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = hashCode + 79;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 17;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof CostCalculatorViewModelState)) {
            return false;
        }
        CostCalculatorViewModelState costCalculatorViewModelState = (CostCalculatorViewModelState) other;
        if (!Intrinsics.areEqual(this.component1, costCalculatorViewModelState.component1) || this.getAsAtTimestamp != costCalculatorViewModelState.getAsAtTimestamp) {
            return false;
        }
        if (!Intrinsics.areEqual(this.equals, costCalculatorViewModelState.equals)) {
            int i7 = hashCode + 123;
            ArtificialStackFrames = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, costCalculatorViewModelState.getRequestBeneficiariesState)) {
            int i8 = hashCode + 93;
            ArtificialStackFrames = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, costCalculatorViewModelState.component2) || !Intrinsics.areEqual(this.copy, costCalculatorViewModelState.copy)) {
            return false;
        }
        if (this.ShareDataUIState == costCalculatorViewModelState.ShareDataUIState) {
            return this.component3 == costCalculatorViewModelState.component3 && Intrinsics.areEqual(this.component4, costCalculatorViewModelState.component4) && Intrinsics.areEqual(this.copydefault, costCalculatorViewModelState.copydefault);
        }
        int i10 = hashCode + 63;
        ArtificialStackFrames = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 6 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.component1.hashCode();
        int iHashCode3 = this.getAsAtTimestamp.hashCode();
        int iHashCode4 = this.equals.hashCode();
        int iHashCode5 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode6 = this.component2.hashCode();
        LipaCostResult lipaCostResult = this.copy;
        int iHashCode7 = 1;
        if (lipaCostResult == null) {
            int i2 = hashCode + 25;
            ArtificialStackFrames = i2 % 128;
            iHashCode = (i2 % 2 == 0 ? 0 : 1) ^ 1;
        } else {
            iHashCode = lipaCostResult.hashCode();
            int i3 = ArtificialStackFrames + 93;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
        }
        int iHashCode8 = Boolean.hashCode(this.ShareDataUIState);
        int iHashCode9 = Boolean.hashCode(this.component3);
        String str = this.component4;
        if (str == null) {
            int i5 = ArtificialStackFrames + 95;
            hashCode = i5 % 128;
            if (i5 % 2 == 0) {
                iHashCode7 = 0;
            }
        } else {
            iHashCode7 = str.hashCode();
        }
        String str2 = this.copydefault;
        return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CostCalculatorViewModelState(charges=" + this.component1 + ", selectedTab=" + this.getAsAtTimestamp + ", sendWithdrawAmount=" + this.equals + ", lipaShortCode=" + this.getRequestBeneficiariesState + ", lipaAmount=" + this.component2 + ", lipaResult=" + this.copy + ", isLoadingCharges=" + this.ShareDataUIState + ", isCheckingLipaCost=" + this.component3 + ", loadingMessage=" + this.component4 + ", errorMessage=" + this.copydefault + ")";
        int i2 = hashCode + 17;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
