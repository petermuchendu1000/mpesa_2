package com.huawei.digitalpayment.consumer.fixeddata.presentation.state;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails.FibreAccountDetails;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreFeeQuotation;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g.Home5GGetPlansResponse;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.userDetails.FibreUserDetails;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountDetailsUiModel;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\u0015\u00108\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0019HÆ\u0003J«\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÇ\u0001J\u0013\u0010@\u001a\u00020\u00032\b\u0010A\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010B\u001a\u00020CH×\u0001J\t\u0010D\u001a\u00020EH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006F"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FixedDataUiState;", "", GriverMonitorConstants.KEY_IS_LOADING, "", "userDetails", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/FibreUserDetails;", "postPayDetails", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;", "fixedDataTypes", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;", "selectedFixedDataType", "tabStates", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FixedDataTabState;", "products", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct;", "feeQuotation", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreFeeQuotation;", "home4G5GPlans", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home5GGetPlansResponse;", "fulizaPromptData", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FulizaPromptData;", "hasError", "fetchTrigger", "", "<init>", "(ZLcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/FibreUserDetails;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;Ljava/util/Map;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreFeeQuotation;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FulizaPromptData;ZJ)V", "()Z", "getUserDetails", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/userDetails/FibreUserDetails;", "getPostPayDetails", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;", "getFixedDataTypes", "()Ljava/util/List;", "getSelectedFixedDataType", "()Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;", "getTabStates", "()Ljava/util/Map;", "getProducts", "getFeeQuotation", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreFeeQuotation;", "getHome4G5GPlans", "getFulizaPromptData", "()Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FulizaPromptData;", "getHasError", "getFetchTrigger", "()J", "currentTabState", "getCurrentTabState", "()Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FixedDataTabState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FixedDataUiState {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 1;
    private static int CoroutineDebuggingKt = 1;
    private static int getSponsorBeneficiariesState;
    private static int hashCode;
    private final List<FixedDataType> ShareDataUIState;
    private final long component1;
    private final FulizaPromptData component2;
    private final boolean component3;
    private final List<FibreProduct> component4;
    private final boolean copy;
    private final FibreFeeQuotation copydefault;
    private final List<Home5GGetPlansResponse> equals;
    private final FibreAccountDetails getAsAtTimestamp;
    private final FixedDataType getRequestBeneficiariesState;
    private final Map<FixedDataType, FixedDataTabState> getShareableDataState;
    private final FibreUserDetails toString;

    /* JADX WARN: Multi-variable type inference failed */
    public FixedDataUiState(boolean z, FibreUserDetails fibreUserDetails, FibreAccountDetails fibreAccountDetails, List<? extends FixedDataType> list, FixedDataType fixedDataType, Map<FixedDataType, FixedDataTabState> map, List<FibreProduct> list2, FibreFeeQuotation fibreFeeQuotation, List<Home5GGetPlansResponse> list3, FulizaPromptData fulizaPromptData, boolean z2, long j) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(fixedDataType, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.copy = z;
        this.toString = fibreUserDetails;
        this.getAsAtTimestamp = fibreAccountDetails;
        this.ShareDataUIState = list;
        this.getRequestBeneficiariesState = fixedDataType;
        this.getShareableDataState = map;
        this.component4 = list2;
        this.copydefault = fibreFeeQuotation;
        this.equals = list3;
        this.component2 = fulizaPromptData;
        this.component3 = z2;
        this.component1 = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FixedDataUiState(boolean z, FibreUserDetails fibreUserDetails, FibreAccountDetails fibreAccountDetails, List list, FixedDataType fixedDataType, Map map, List list2, FibreFeeQuotation fibreFeeQuotation, List list3, FulizaPromptData fulizaPromptData, boolean z2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        FibreUserDetails fibreUserDetails2;
        FibreAccountDetails fibreAccountDetails2;
        FixedDataType fixedDataType2;
        Map mapEmptyMap;
        List list4;
        long j2;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        FulizaPromptData fulizaPromptData2 = null;
        if ((i & 2) != 0) {
            int i3 = CoroutineDebuggingKt + 63;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            fibreUserDetails2 = null;
        } else {
            fibreUserDetails2 = fibreUserDetails;
        }
        if ((i & 4) != 0) {
            int i6 = CoroutineDebuggingKt + 49;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            fibreAccountDetails2 = null;
        } else {
            fibreAccountDetails2 = fibreAccountDetails;
        }
        List listEmptyList = (i & 8) != 0 ? CollectionsKt.emptyList() : list;
        if ((i & 16) != 0) {
            int i9 = CoroutineDebuggingKt + 17;
            hashCode = i9 % 128;
            int i10 = i9 % 2;
            fixedDataType2 = FixedDataType.HOME_FIBRE;
        } else {
            fixedDataType2 = fixedDataType;
        }
        if ((i & 32) != 0) {
            mapEmptyMap = MapsKt.emptyMap();
            int i11 = 2 % 2;
        } else {
            mapEmptyMap = map;
        }
        List list5 = (i & 64) != 0 ? null : list2;
        FibreFeeQuotation fibreFeeQuotation2 = (i & 128) != 0 ? null : fibreFeeQuotation;
        if ((i & 256) != 0) {
            int i12 = hashCode + 99;
            CoroutineDebuggingKt = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 95 / 0;
            }
            list4 = null;
        } else {
            list4 = list3;
        }
        if ((i & 512) != 0) {
            int i14 = CoroutineDebuggingKt + 85;
            hashCode = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        } else {
            fulizaPromptData2 = fulizaPromptData;
        }
        boolean z4 = (i & 1024) == 0 ? z2 : false;
        if ((i & 2048) != 0) {
            int i15 = CoroutineDebuggingKt + 91;
            hashCode = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 5 % 5;
            } else {
                int i17 = 2 % 2;
            }
            j2 = 0;
        } else {
            j2 = j;
        }
        this(z3, fibreUserDetails2, fibreAccountDetails2, listEmptyList, fixedDataType2, mapEmptyMap, list5, fibreFeeQuotation2, list4, fulizaPromptData2, z4, j2);
    }

    public final boolean isLoading() {
        boolean z;
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 63;
        CoroutineDebuggingKt = i3 % 128;
        if (i3 % 2 == 0) {
            z = this.copy;
            int i4 = 29 / 0;
        } else {
            z = this.copy;
        }
        int i5 = i2 + 13;
        CoroutineDebuggingKt = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FibreUserDetails getUserDetails() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 17;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        FibreUserDetails fibreUserDetails = this.toString;
        int i5 = i3 + 75;
        CoroutineDebuggingKt = i5 % 128;
        if (i5 % 2 != 0) {
            return fibreUserDetails;
        }
        throw null;
    }

    public final FibreAccountDetails getPostPayDetails() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 65;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        FibreAccountDetails fibreAccountDetails = this.getAsAtTimestamp;
        int i5 = i3 + 85;
        CoroutineDebuggingKt = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 31 / 0;
        }
        return fibreAccountDetails;
    }

    public final List<FixedDataType> getFixedDataTypes() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 71;
        int i3 = i2 % 128;
        hashCode = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        List<FixedDataType> list = this.ShareDataUIState;
        int i4 = i3 + 37;
        CoroutineDebuggingKt = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final FixedDataType getSelectedFixedDataType() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 63;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        FixedDataType fixedDataType = this.getRequestBeneficiariesState;
        int i5 = i2 + 79;
        CoroutineDebuggingKt = i5 % 128;
        int i6 = i5 % 2;
        return fixedDataType;
    }

    public final Map<FixedDataType, FixedDataTabState> getTabStates() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 27;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getShareableDataState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<FibreProduct> getProducts() {
        int i = 2 % 2;
        int i2 = hashCode + 73;
        CoroutineDebuggingKt = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FibreFeeQuotation getFeeQuotation() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 81;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final List<Home5GGetPlansResponse> getHome4G5GPlans() {
        int i = 2 % 2;
        int i2 = hashCode + 97;
        int i3 = i2 % 128;
        CoroutineDebuggingKt = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Home5GGetPlansResponse> list = this.equals;
        int i4 = i3 + 27;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return list;
    }

    public final FulizaPromptData getFulizaPromptData() {
        int i = 2 % 2;
        int i2 = hashCode + 45;
        int i3 = i2 % 128;
        CoroutineDebuggingKt = i3;
        int i4 = i2 % 2;
        FulizaPromptData fulizaPromptData = this.component2;
        int i5 = i3 + 63;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return fulizaPromptData;
    }

    public final boolean getHasError() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 125;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        boolean z = this.component3;
        int i5 = i3 + 31;
        CoroutineDebuggingKt = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return z;
    }

    public final long getFetchTrigger() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 77;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FixedDataTabState getCurrentTabState() {
        int i = 2 % 2;
        int i2 = hashCode + 95;
        CoroutineDebuggingKt = i2 % 128;
        int i3 = i2 % 2;
        FixedDataTabState fixedDataTabState = this.getShareableDataState.get(this.getRequestBeneficiariesState);
        if (fixedDataTabState == null) {
            String str = null;
            AccountDetailsUiModel accountDetailsUiModel = new AccountDetailsUiModel(null, null, null, str, null, null, null, null, null, null, null, null, null, false, false, false, false, this.getRequestBeneficiariesState, 131071, null);
            fixedDataTabState = new FixedDataTabState(false, false, 0 == true ? 1 : 0, str, 0 == true ? 1 : 0, 0 == true ? 1 : 0, accountDetailsUiModel, 63, 0 == true ? 1 : 0);
        }
        int i4 = CoroutineDebuggingKt + 31;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return fixedDataTabState;
    }

    static {
        int i = 1 + 33;
        getSponsorBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    public FixedDataUiState() {
        this(false, null, null, null, null, null, null, null, null, null, false, 0L, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FixedDataUiState copy$default(FixedDataUiState fixedDataUiState, boolean z, FibreUserDetails fibreUserDetails, FibreAccountDetails fibreAccountDetails, List list, FixedDataType fixedDataType, Map map, List list2, FibreFeeQuotation fibreFeeQuotation, List list3, FulizaPromptData fulizaPromptData, boolean z2, long j, int i, Object obj) {
        FixedDataType fixedDataType2;
        List list4;
        FulizaPromptData fulizaPromptData2;
        int i2 = 2 % 2;
        int i3 = hashCode;
        int i4 = i3 + 45;
        CoroutineDebuggingKt = i4 % 128;
        int i5 = i4 % 2;
        boolean z3 = (i & 1) != 0 ? fixedDataUiState.copy : z;
        FibreUserDetails fibreUserDetails2 = (i & 2) != 0 ? fixedDataUiState.toString : fibreUserDetails;
        FibreAccountDetails fibreAccountDetails2 = (i & 4) != 0 ? fixedDataUiState.getAsAtTimestamp : fibreAccountDetails;
        List list5 = (i & 8) != 0 ? fixedDataUiState.ShareDataUIState : list;
        if ((i & 16) != 0) {
            int i6 = i3 + 121;
            CoroutineDebuggingKt = i6 % 128;
            int i7 = i6 % 2;
            fixedDataType2 = fixedDataUiState.getRequestBeneficiariesState;
        } else {
            fixedDataType2 = fixedDataType;
        }
        Map map2 = (i & 32) != 0 ? fixedDataUiState.getShareableDataState : map;
        List list6 = (i & 64) != 0 ? fixedDataUiState.component4 : list2;
        FibreFeeQuotation fibreFeeQuotation2 = (i & 128) != 0 ? fixedDataUiState.copydefault : fibreFeeQuotation;
        Object obj2 = null;
        if ((i & 256) != 0) {
            int i8 = CoroutineDebuggingKt + 61;
            hashCode = i8 % 128;
            if (i8 % 2 != 0) {
                List<Home5GGetPlansResponse> list7 = fixedDataUiState.equals;
                throw null;
            }
            list4 = fixedDataUiState.equals;
        } else {
            list4 = list3;
        }
        if ((i & 512) != 0) {
            int i9 = CoroutineDebuggingKt + 13;
            int i10 = i9 % 128;
            hashCode = i10;
            if (i9 % 2 != 0) {
                FulizaPromptData fulizaPromptData3 = fixedDataUiState.component2;
                obj2.hashCode();
                throw null;
            }
            fulizaPromptData2 = fixedDataUiState.component2;
            int i11 = i10 + 73;
            CoroutineDebuggingKt = i11 % 128;
            int i12 = i11 % 2;
        } else {
            fulizaPromptData2 = fulizaPromptData;
        }
        return fixedDataUiState.copy(z3, fibreUserDetails2, fibreAccountDetails2, list5, fixedDataType2, map2, list6, fibreFeeQuotation2, list4, fulizaPromptData2, (i & 1024) != 0 ? fixedDataUiState.component3 : z2, (i & 2048) != 0 ? fixedDataUiState.component1 : j);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 125;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        boolean z = this.copy;
        int i5 = i3 + 117;
        CoroutineDebuggingKt = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final FulizaPromptData component10() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 29;
        CoroutineDebuggingKt = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FulizaPromptData fulizaPromptData = this.component2;
        int i4 = i2 + 17;
        CoroutineDebuggingKt = i4 % 128;
        int i5 = i4 % 2;
        return fulizaPromptData;
    }

    public final boolean component11() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt;
        int i3 = i2 + 91;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.component3;
        int i4 = i2 + 13;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final long component12() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 105;
        CoroutineDebuggingKt = i3 % 128;
        int i4 = i3 % 2;
        long j = this.component1;
        int i5 = i2 + 23;
        CoroutineDebuggingKt = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final FibreUserDetails component2() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 67;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return this.toString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FibreAccountDetails component3() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 91;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        FibreAccountDetails fibreAccountDetails = this.getAsAtTimestamp;
        int i5 = i3 + 57;
        CoroutineDebuggingKt = i5 % 128;
        int i6 = i5 % 2;
        return fibreAccountDetails;
    }

    public final List<FixedDataType> component4() {
        List<FixedDataType> list;
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 87;
        CoroutineDebuggingKt = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.ShareDataUIState;
            int i4 = 83 / 0;
        } else {
            list = this.ShareDataUIState;
        }
        int i5 = i2 + 9;
        CoroutineDebuggingKt = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FixedDataType component5() {
        int i = 2 % 2;
        int i2 = hashCode + 51;
        int i3 = i2 % 128;
        CoroutineDebuggingKt = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FixedDataType fixedDataType = this.getRequestBeneficiariesState;
        int i4 = i3 + 19;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return fixedDataType;
    }

    public final Map<FixedDataType, FixedDataTabState> component6() {
        int i = 2 % 2;
        int i2 = hashCode + 27;
        CoroutineDebuggingKt = i2 % 128;
        int i3 = i2 % 2;
        Map<FixedDataType, FixedDataTabState> map = this.getShareableDataState;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return map;
    }

    public final List<FibreProduct> component7() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt;
        int i3 = i2 + 125;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        List<FibreProduct> list = this.component4;
        int i5 = i2 + 23;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final FibreFeeQuotation component8() {
        int i = 2 % 2;
        int i2 = CoroutineDebuggingKt + 75;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        FibreFeeQuotation fibreFeeQuotation = this.copydefault;
        int i5 = i3 + 23;
        CoroutineDebuggingKt = i5 % 128;
        int i6 = i5 % 2;
        return fibreFeeQuotation;
    }

    public final List<Home5GGetPlansResponse> component9() {
        int i = 2 % 2;
        int i2 = hashCode + 91;
        int i3 = i2 % 128;
        CoroutineDebuggingKt = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<Home5GGetPlansResponse> list = this.equals;
        int i4 = i3 + 119;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final FixedDataUiState copy(boolean isLoading, FibreUserDetails userDetails, FibreAccountDetails postPayDetails, List<? extends FixedDataType> fixedDataTypes, FixedDataType selectedFixedDataType, Map<FixedDataType, FixedDataTabState> tabStates, List<FibreProduct> products, FibreFeeQuotation feeQuotation, List<Home5GGetPlansResponse> home4G5GPlans, FulizaPromptData fulizaPromptData, boolean hasError, long fetchTrigger) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fixedDataTypes, "");
        Intrinsics.checkNotNullParameter(selectedFixedDataType, "");
        Intrinsics.checkNotNullParameter(tabStates, "");
        FixedDataUiState fixedDataUiState = new FixedDataUiState(isLoading, userDetails, postPayDetails, fixedDataTypes, selectedFixedDataType, tabStates, products, feeQuotation, home4G5GPlans, fulizaPromptData, hasError, fetchTrigger);
        int i2 = CoroutineDebuggingKt + 57;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return fixedDataUiState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = CoroutineDebuggingKt + 93;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FixedDataUiState)) {
            return false;
        }
        FixedDataUiState fixedDataUiState = (FixedDataUiState) other;
        if (this.copy != fixedDataUiState.copy) {
            int i4 = CoroutineDebuggingKt + 81;
            hashCode = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.toString, fixedDataUiState.toString)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, fixedDataUiState.getAsAtTimestamp)) {
            int i5 = CoroutineDebuggingKt + 97;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, fixedDataUiState.ShareDataUIState)) {
            return false;
        }
        if (this.getRequestBeneficiariesState != fixedDataUiState.getRequestBeneficiariesState) {
            int i7 = CoroutineDebuggingKt + 59;
            hashCode = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getShareableDataState, fixedDataUiState.getShareableDataState)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, fixedDataUiState.component4)) {
            int i9 = CoroutineDebuggingKt + 37;
            hashCode = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, fixedDataUiState.copydefault) || !Intrinsics.areEqual(this.equals, fixedDataUiState.equals) || !Intrinsics.areEqual(this.component2, fixedDataUiState.component2) || this.component3 != fixedDataUiState.component3) {
            return false;
        }
        if (this.component1 == fixedDataUiState.component1) {
            return true;
        }
        int i11 = hashCode + 43;
        CoroutineDebuggingKt = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = Boolean.hashCode(this.copy);
        FibreUserDetails fibreUserDetails = this.toString;
        int iHashCode5 = 0;
        int iHashCode6 = fibreUserDetails == null ? 0 : fibreUserDetails.hashCode();
        FibreAccountDetails fibreAccountDetails = this.getAsAtTimestamp;
        if (fibreAccountDetails == null) {
            int i2 = CoroutineDebuggingKt + 125;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = fibreAccountDetails.hashCode();
            int i4 = CoroutineDebuggingKt + 83;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
        }
        int iHashCode7 = this.ShareDataUIState.hashCode();
        int iHashCode8 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode9 = this.getShareableDataState.hashCode();
        List<FibreProduct> list = this.component4;
        if (list == null) {
            int i6 = CoroutineDebuggingKt + 13;
            hashCode = i6 % 128;
            iHashCode2 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = list.hashCode();
        }
        FibreFeeQuotation fibreFeeQuotation = this.copydefault;
        if (fibreFeeQuotation == null) {
            int i7 = hashCode + 117;
            CoroutineDebuggingKt = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = fibreFeeQuotation.hashCode();
        }
        List<Home5GGetPlansResponse> list2 = this.equals;
        int iHashCode10 = list2 == null ? 0 : list2.hashCode();
        FulizaPromptData fulizaPromptData = this.component2;
        if (fulizaPromptData != null) {
            iHashCode5 = fulizaPromptData.hashCode();
            int i9 = hashCode + 65;
            CoroutineDebuggingKt = i9 % 128;
            int i10 = i9 % 2;
        }
        return (((((((((((((((((((((iHashCode4 * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode10) * 31) + iHashCode5) * 31) + Boolean.hashCode(this.component3)) * 31) + Long.hashCode(this.component1);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FixedDataUiState(isLoading=" + this.copy + ", userDetails=" + this.toString + ", postPayDetails=" + this.getAsAtTimestamp + ", fixedDataTypes=" + this.ShareDataUIState + ", selectedFixedDataType=" + this.getRequestBeneficiariesState + ", tabStates=" + this.getShareableDataState + ", products=" + this.component4 + ", feeQuotation=" + this.copydefault + ", home4G5GPlans=" + this.equals + ", fulizaPromptData=" + this.component2 + ", hasError=" + this.component3 + ", fetchTrigger=" + this.component1 + ")";
        int i2 = hashCode + 47;
        CoroutineDebuggingKt = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return str;
    }
}
