package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u001c\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionDataDelegate;", "", "selectionDetailsState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionDetailsState;", "getSelectionDetailsState", "()Lkotlinx/coroutines/flow/StateFlow;", "updateSelectedCurrency", "", FirebaseAnalytics.Param.INDEX, "", "updateSelectedSourceOfFunds", "updateSelectedPurposeOfFunds", "updateSelectedCarrier", "updateOtherSourceOfFunds", "value", "", "updateOtherPurposeOfFunds", "updateSelectionDetailState", "transform", "Lkotlin/Function1;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SelectionDataDelegate {
    StateFlow<SelectionDetailsState> getSelectionDetailsState();

    void updateOtherPurposeOfFunds(String value);

    void updateOtherSourceOfFunds(String value);

    void updateSelectedCarrier(int index);

    void updateSelectedCurrency(int index);

    void updateSelectedPurposeOfFunds(int index);

    void updateSelectedSourceOfFunds(int index);

    void updateSelectionDetailState(Function1<? super SelectionDetailsState, SelectionDetailsState> transform);
}
