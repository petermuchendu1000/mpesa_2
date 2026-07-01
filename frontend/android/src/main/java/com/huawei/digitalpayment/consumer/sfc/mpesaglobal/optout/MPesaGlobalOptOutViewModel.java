package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.optout;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.digitalpayment.consumer.sfc.global.R;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.OptOutReason;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\u0018\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u00060\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/optout/MPesaGlobalOptOutViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_reason", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/OptOutReason;", ImtConstants.KEY_REASON, "Landroidx/lifecycle/LiveData;", "getReason", "()Landroidx/lifecycle/LiveData;", "_otherReason", "otherReason", "getOtherReason", "optOutReasons", "", "", "getOptOutReasons", "()Ljava/util/List;", "setReason", "", FirebaseAnalytics.Param.INDEX, "setOtherReason", "getOptOutReason", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MPesaGlobalOptOutViewModel extends ViewModel {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int copy = 1;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    private final LiveData<Pair<String, OptOutReason>> ShareDataUIState;
    private final MutableLiveData<Pair<String, OptOutReason>> component1;
    private final LiveData<String> component2;
    private final MutableLiveData<String> component3;
    private final List<Pair<OptOutReason, Integer>> copydefault;

    public MPesaGlobalOptOutViewModel() {
        Pair pair;
        MutableLiveData<Pair<String, OptOutReason>> mutableLiveData = new MutableLiveData<>();
        this.component1 = mutableLiveData;
        this.ShareDataUIState = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.component3 = mutableLiveData2;
        this.component2 = mutableLiveData2;
        List<OptOutReason> listListOf = CollectionsKt.listOf((Object[]) new OptOutReason[]{OptOutReason.NotInterested.INSTANCE, OptOutReason.HighTransactionCharges.INSTANCE, OptOutReason.Other.INSTANCE});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        int i = 2 % 2;
        for (OptOutReason optOutReason : listListOf) {
            if (optOutReason instanceof OptOutReason.HighTransactionCharges) {
                int i2 = getRequestBeneficiariesState + 125;
                copy = i2 % 128;
                int i3 = i2 % 2;
                pair = TuplesKt.to(optOutReason, Integer.valueOf(R.string.global_optOut_dropdownOption_chargesAreHigh));
            } else if (optOutReason instanceof OptOutReason.NotInterested) {
                pair = TuplesKt.to(optOutReason, Integer.valueOf(R.string.global_optOut_dropdownOption_notInterested));
            } else {
                if (!(optOutReason instanceof OptOutReason.Other)) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = TuplesKt.to(optOutReason, Integer.valueOf(R.string.global_optOut_dropdownOption_other));
            }
            arrayList.add(pair);
            int i4 = getRequestBeneficiariesState + 99;
            copy = i4 % 128;
            int i5 = i4 % 2;
        }
        this.copydefault = arrayList;
        int i6 = getRequestBeneficiariesState + 123;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LiveData<Pair<String, OptOutReason>> getReason() {
        LiveData<Pair<String, OptOutReason>> liveData;
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 47;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            liveData = this.ShareDataUIState;
            int i4 = 32 / 0;
        } else {
            liveData = this.ShareDataUIState;
        }
        int i5 = i2 + 93;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return liveData;
        }
        throw null;
    }

    public final LiveData<String> getOtherReason() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 53;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        LiveData<String> liveData = this.component2;
        int i5 = i3 + 47;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return liveData;
        }
        throw null;
    }

    public final List<Pair<OptOutReason, Integer>> getOptOutReasons() {
        int i = 2 % 2;
        int i2 = copy + 87;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<Pair<OptOutReason, Integer>> list = this.copydefault;
        int i4 = i3 + 67;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final void setReason(int index, String reason) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reason, "");
        this.component1.setValue(TuplesKt.to(reason, this.copydefault.get(index).getFirst()));
        int i4 = copy + 63;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setOtherReason(String otherReason) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.component3.setValue(otherReason);
        int i4 = copy + 101;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
    }

    public final String getOptOutReason() {
        OptOutReason second;
        int i = 2 % 2;
        int i2 = copy + 125;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String value = this.component3.getValue();
        if (value == null) {
            Pair<String, OptOutReason> value2 = this.component1.getValue();
            value = (value2 == null || (second = value2.getSecond()) == null) ? null : second.getValue();
        }
        int i4 = copy + 119;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return value;
    }

    static {
        int i = 1 + 119;
        component4 = i % 128;
        int i2 = i % 2;
    }
}
