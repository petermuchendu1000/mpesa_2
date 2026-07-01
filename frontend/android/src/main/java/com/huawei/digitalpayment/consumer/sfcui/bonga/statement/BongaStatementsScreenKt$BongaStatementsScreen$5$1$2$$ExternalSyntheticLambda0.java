package com.huawei.digitalpayment.consumer.sfcui.bonga.statement;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.huawei.digitalpayment.consumer.sfcui.bonga.statement.BongaStatementsScreenKt;
import com.huawei.digitalpayment.consumer.sfcui.bonga.viewmodel.BongaViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.addCancellable;
import kotlin.getEnabledChangedCallbackactivity_release;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

public final class BongaStatementsScreenKt$BongaStatementsScreen$5$1$2$$ExternalSyntheticLambda0 implements Function1 {
    private static int component1 = 1;
    private static int copydefault;
    public final BongaViewModel f$0;
    public final List f$1;
    public final CoroutineScope f$2;
    public final State f$3;
    public final MutableState f$4;
    public final MutableState f$5;
    public final PagerState f$6;

    public BongaStatementsScreenKt$BongaStatementsScreen$5$1$2$$ExternalSyntheticLambda0(BongaViewModel bongaViewModel, List list, CoroutineScope coroutineScope, State state, MutableState mutableState, MutableState mutableState2, PagerState pagerState) {
        this.f$0 = bongaViewModel;
        this.f$1 = list;
        this.f$2 = coroutineScope;
        this.f$3 = state;
        this.f$4 = mutableState;
        this.f$5 = mutableState2;
        this.f$6 = pagerState;
    }

    public static void component1() {
        addCancellable.component3[0] = getEnabledChangedCallbackactivity_release.copydefault[0];
    }

    @Override
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent1 = BongaStatementsScreenKt.AnonymousClass5.copydefault.component1(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, ((Integer) obj).intValue());
        int i4 = component1 + 25;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return unitComponent1;
    }
}
