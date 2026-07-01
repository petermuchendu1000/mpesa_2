package com.safaricom.consumer.commons.util;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyResultActivity;
import com.safaricom.mpesa.logging.L;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "This class must not be used and all existing usages must be replaced by Kotlin Flow/SharedFlow/StateFlow")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u0011*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\fH\u0017J\u0017\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\bH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/safaricom/consumer/commons/util/SingleLiveEvent;", "T", "Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", RequestMoneyResultActivity.TYPE_PENDING, "Ljava/util/concurrent/atomic/AtomicBoolean;", "observe", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "setValue", "t", "(Ljava/lang/Object;)V", "call", "Companion", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SingleLiveEvent<T> extends MutableLiveData<T> {
    private static final String ShareDataUIState = "SingleLiveEvent";
    private final AtomicBoolean component2 = new AtomicBoolean(false);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Observer, FunctionAdapter {
        private final Function1 copydefault;

        component1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            return this.copydefault;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override
        public final void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    @Override
    public void observe(LifecycleOwner owner, final Observer<? super T> observer) {
        Intrinsics.checkNotNullParameter(owner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        if (hasActiveObservers()) {
            L.INSTANCE.w(ShareDataUIState, "Multiple observers registered but only one will be notified of changes.", new Object[0]);
        }
        super.observe(owner, new component1(new Function1() {
            @Override
            public final Object invoke(Object obj) {
                return SingleLiveEvent.component1(this.f$0, observer, obj);
            }
        }));
    }

    public static final Unit component1(SingleLiveEvent singleLiveEvent, Observer observer, Object obj) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "");
        Intrinsics.checkNotNullParameter(observer, "");
        if (singleLiveEvent.component2.compareAndSet(true, false)) {
            observer.onChanged(obj);
        }
        return Unit.INSTANCE;
    }

    @Override
    public void setValue(T t) {
        this.component2.set(true);
        super.setValue(t);
    }

    public final void call() {
        setValue(null);
    }
}
