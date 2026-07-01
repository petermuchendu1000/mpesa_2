package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.MakeUrBundleValidationItem;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.OfferResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\u008e\u0001\u0010-\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0006HÇ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u00020\t2\b\u00100\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00101\u001a\u00020\u000bH×\u0001J\t\u00102\u001a\u00020\u0006H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/MakeUrBundleUiState;", "", "validityOptions", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/MakeUrBundleValidationItem;", "selectedValidityCode", "", "amountText", "isValidityMenuExpanded", "", "helperMessageRes", "", "helperMessageArg", "isAmountError", "canContinue", "offers", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/OfferResponse;", "isLoadingOffers", "lastRequestedAmount", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;ZZLjava/util/List;ZLjava/lang/String;)V", "getValidityOptions", "()Ljava/util/List;", "getSelectedValidityCode", "()Ljava/lang/String;", "getAmountText", "()Z", "getHelperMessageRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHelperMessageArg", "getCanContinue", "getOffers", "getLastRequestedAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;ZZLjava/util/List;ZLjava/lang/String;)Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/MakeUrBundleUiState;", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MakeUrBundleUiState {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 0;
    private static int getShareableDataState = 1;
    private static int getSponsorBeneficiariesState = 0;
    private static int toString = 1;
    private final Integer ShareDataUIState;
    private final String component1;
    private final boolean component2;
    private final boolean component3;
    private final List<OfferResponse> component4;
    private final String copy;
    private final Integer copydefault;
    private final String equals;
    private final boolean getAsAtTimestamp;
    private final boolean getRequestBeneficiariesState;
    private final List<MakeUrBundleValidationItem> hashCode;

    public MakeUrBundleUiState(List<MakeUrBundleValidationItem> list, String str, String str2, boolean z, Integer num, Integer num2, boolean z2, boolean z3, List<OfferResponse> list2, boolean z4, String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.hashCode = list;
        this.equals = str;
        this.component1 = str2;
        this.getRequestBeneficiariesState = z;
        this.copydefault = num;
        this.ShareDataUIState = num2;
        this.component3 = z2;
        this.component2 = z3;
        this.component4 = list2;
        this.getAsAtTimestamp = z4;
        this.copy = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MakeUrBundleUiState(List list, String str, String str2, boolean z, Integer num, Integer num2, boolean z2, boolean z3, List list2, boolean z4, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList;
        String str4;
        boolean z5;
        Integer num3;
        Integer num4;
        boolean z6;
        if ((i & 1) != 0) {
            int i2 = getShareableDataState + 35;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list;
        }
        String str5 = (i & 2) != 0 ? null : str;
        String str6 = "";
        if ((i & 4) != 0) {
            int i4 = 2 % 2;
            str4 = "";
        } else {
            str4 = str2;
        }
        boolean z7 = false;
        if ((i & 8) != 0) {
            int i5 = getShareableDataState + 63;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z5 = false;
        } else {
            z5 = z;
        }
        if ((i & 16) != 0) {
            int i8 = getShareableDataState + 63;
            getSponsorBeneficiariesState = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 32) != 0) {
            int i9 = getSponsorBeneficiariesState + 27;
            getShareableDataState = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            num4 = null;
        } else {
            num4 = num2;
        }
        boolean z8 = (i & 64) != 0 ? false : z2;
        if ((i & 128) != 0) {
            int i12 = getShareableDataState + 125;
            getSponsorBeneficiariesState = i12 % 128;
            int i13 = i12 % 2;
            z6 = false;
        } else {
            z6 = z3;
        }
        List listEmptyList2 = (i & 256) != 0 ? CollectionsKt.emptyList() : list2;
        if ((i & 512) != 0) {
            int i14 = getShareableDataState + 103;
            getSponsorBeneficiariesState = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        } else {
            z7 = z4;
        }
        if ((i & 1024) != 0) {
            int i15 = 2 % 2;
        } else {
            str6 = str3;
        }
        this(listEmptyList, str5, str4, z5, num3, num4, z8, z6, listEmptyList2, z7, str6);
    }

    public final List<MakeUrBundleValidationItem> getValidityOptions() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 43;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<MakeUrBundleValidationItem> list = this.hashCode;
        int i4 = i3 + 39;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String getSelectedValidityCode() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 69;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        throw null;
    }

    public final String getAmountText() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 75;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isValidityMenuExpanded() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 27;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.getRequestBeneficiariesState;
        int i4 = i2 + 33;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return z;
    }

    public final Integer getHelperMessageRes() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 51;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final Integer getHelperMessageArg() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 87;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.ShareDataUIState;
        if (i3 == 0) {
            int i4 = 81 / 0;
        }
        return num;
    }

    public final boolean isAmountError() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 79;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.component3;
        int i5 = i3 + 103;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return z;
    }

    public final boolean getCanContinue() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 101;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        boolean z = this.component2;
        int i5 = i3 + 105;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final List<OfferResponse> getOffers() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 97;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        List<OfferResponse> list = this.component4;
        int i5 = i2 + 3;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean isLoadingOffers() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 59;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.getAsAtTimestamp;
        int i5 = i2 + 23;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getLastRequestedAmount() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 91;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 97;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 1 + 47;
        ArtificialStackFrames = i % 128;
        if (i % 2 != 0) {
            int i2 = 94 / 0;
        }
    }

    public MakeUrBundleUiState() {
        this(null, null, null, false, null, null, false, false, null, false, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static MakeUrBundleUiState copy$default(MakeUrBundleUiState makeUrBundleUiState, List list, String str, String str2, boolean z, Integer num, Integer num2, boolean z2, boolean z3, List list2, boolean z4, String str3, int i, Object obj) {
        List list3;
        String str4;
        String str5;
        Integer num3;
        boolean z5;
        boolean z6;
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = getSponsorBeneficiariesState + 23;
            getShareableDataState = i3 % 128;
            if (i3 % 2 == 0) {
                List<MakeUrBundleValidationItem> list4 = makeUrBundleUiState.hashCode;
                obj2.hashCode();
                throw null;
            }
            list3 = makeUrBundleUiState.hashCode;
        } else {
            list3 = list;
        }
        if ((i & 2) != 0) {
            int i4 = getShareableDataState + 95;
            getSponsorBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                String str6 = makeUrBundleUiState.equals;
                obj2.hashCode();
                throw null;
            }
            str4 = makeUrBundleUiState.equals;
        } else {
            str4 = str;
        }
        if ((i & 4) != 0) {
            int i5 = getShareableDataState + 33;
            getSponsorBeneficiariesState = i5 % 128;
            if (i5 % 2 != 0) {
                String str7 = makeUrBundleUiState.component1;
                obj2.hashCode();
                throw null;
            }
            str5 = makeUrBundleUiState.component1;
        } else {
            str5 = str2;
        }
        boolean z7 = (i & 8) != 0 ? makeUrBundleUiState.getRequestBeneficiariesState : z;
        if ((i & 16) != 0) {
            int i6 = getShareableDataState + 55;
            getSponsorBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                Integer num4 = makeUrBundleUiState.copydefault;
                throw null;
            }
            num3 = makeUrBundleUiState.copydefault;
        } else {
            num3 = num;
        }
        Integer num5 = (i & 32) != 0 ? makeUrBundleUiState.ShareDataUIState : num2;
        if ((i & 64) != 0) {
            int i7 = getSponsorBeneficiariesState + 19;
            getShareableDataState = i7 % 128;
            if (i7 % 2 == 0) {
                boolean z8 = makeUrBundleUiState.component3;
                obj2.hashCode();
                throw null;
            }
            z5 = makeUrBundleUiState.component3;
        } else {
            z5 = z2;
        }
        if ((i & 128) != 0) {
            int i8 = getSponsorBeneficiariesState + 19;
            getShareableDataState = i8 % 128;
            int i9 = i8 % 2;
            z6 = makeUrBundleUiState.component2;
        } else {
            z6 = z3;
        }
        return makeUrBundleUiState.copy(list3, str4, str5, z7, num3, num5, z5, z6, (i & 256) != 0 ? makeUrBundleUiState.component4 : list2, (i & 512) != 0 ? makeUrBundleUiState.getAsAtTimestamp : z4, (i & 1024) != 0 ? makeUrBundleUiState.copy : str3);
    }

    public final List<MakeUrBundleValidationItem> component1() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 57;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        List<MakeUrBundleValidationItem> list = this.hashCode;
        int i5 = i3 + 69;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component10() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 73;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.getAsAtTimestamp;
        int i5 = i2 + 103;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 123;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copy;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 61;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 17;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 123;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 49;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 117;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.getRequestBeneficiariesState;
        int i5 = i2 + 75;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 61;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.copydefault;
        int i5 = i2 + 45;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return num;
    }

    public final Integer component6() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 39;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.ShareDataUIState;
        int i4 = i2 + 113;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final boolean component7() {
        boolean z;
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 25;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.component3;
            int i4 = 93 / 0;
        } else {
            z = this.component3;
        }
        int i5 = i2 + 37;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return z;
    }

    public final boolean component8() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 55;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.component2;
        int i4 = i2 + 121;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final List<OfferResponse> component9() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 85;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component4;
        }
        throw null;
    }

    public final MakeUrBundleUiState copy(List<MakeUrBundleValidationItem> validityOptions, String selectedValidityCode, String amountText, boolean isValidityMenuExpanded, Integer helperMessageRes, Integer helperMessageArg, boolean isAmountError, boolean canContinue, List<OfferResponse> offers, boolean isLoadingOffers, String lastRequestedAmount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(validityOptions, "");
        Intrinsics.checkNotNullParameter(amountText, "");
        Intrinsics.checkNotNullParameter(offers, "");
        Intrinsics.checkNotNullParameter(lastRequestedAmount, "");
        MakeUrBundleUiState makeUrBundleUiState = new MakeUrBundleUiState(validityOptions, selectedValidityCode, amountText, isValidityMenuExpanded, helperMessageRes, helperMessageArg, isAmountError, canContinue, offers, isLoadingOffers, lastRequestedAmount);
        int i2 = getShareableDataState + 57;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return makeUrBundleUiState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MakeUrBundleUiState)) {
            int i2 = getSponsorBeneficiariesState + 29;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        MakeUrBundleUiState makeUrBundleUiState = (MakeUrBundleUiState) other;
        if (!Intrinsics.areEqual(this.hashCode, makeUrBundleUiState.hashCode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.equals, makeUrBundleUiState.equals)) {
            int i4 = getShareableDataState + 1;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, makeUrBundleUiState.component1) || this.getRequestBeneficiariesState != makeUrBundleUiState.getRequestBeneficiariesState) {
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, makeUrBundleUiState.copydefault)) {
            int i6 = getShareableDataState + 59;
            getSponsorBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, makeUrBundleUiState.ShareDataUIState)) {
            int i8 = getSponsorBeneficiariesState + 75;
            getShareableDataState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.component3 != makeUrBundleUiState.component3) {
            return false;
        }
        if (this.component2 == makeUrBundleUiState.component2) {
            return Intrinsics.areEqual(this.component4, makeUrBundleUiState.component4) && this.getAsAtTimestamp == makeUrBundleUiState.getAsAtTimestamp && Intrinsics.areEqual(this.copy, makeUrBundleUiState.copy);
        }
        int i10 = getSponsorBeneficiariesState + 35;
        getShareableDataState = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.hashCode.hashCode();
        String str = this.equals;
        if (str == null) {
            int i2 = getSponsorBeneficiariesState + 89;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode4 = this.component1.hashCode();
        int iHashCode5 = Boolean.hashCode(this.getRequestBeneficiariesState);
        Integer num = this.copydefault;
        if (num == null) {
            int i4 = getSponsorBeneficiariesState + 59;
            getShareableDataState = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        Integer num2 = this.ShareDataUIState;
        int iHashCode6 = (((((((((((((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.component3)) * 31) + Boolean.hashCode(this.component2)) * 31) + this.component4.hashCode()) * 31) + Boolean.hashCode(this.getAsAtTimestamp)) * 31) + this.copy.hashCode();
        int i5 = getSponsorBeneficiariesState + 59;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return iHashCode6;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MakeUrBundleUiState(validityOptions=" + this.hashCode + ", selectedValidityCode=" + this.equals + ", amountText=" + this.component1 + ", isValidityMenuExpanded=" + this.getRequestBeneficiariesState + ", helperMessageRes=" + this.copydefault + ", helperMessageArg=" + this.ShareDataUIState + ", isAmountError=" + this.component3 + ", canContinue=" + this.component2 + ", offers=" + this.component4 + ", isLoadingOffers=" + this.getAsAtTimestamp + ", lastRequestedAmount=" + this.copy + ")";
        int i2 = getSponsorBeneficiariesState + 59;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
