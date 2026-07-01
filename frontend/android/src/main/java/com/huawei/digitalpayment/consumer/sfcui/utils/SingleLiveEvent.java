package com.huawei.digitalpayment.consumer.sfcui.utils;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.RequestMoneyResultActivity;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\fH\u0017J\u0017\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/utils/SingleLiveEvent;", "T", "Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", RequestMoneyResultActivity.TYPE_PENDING, "Ljava/util/concurrent/atomic/AtomicBoolean;", "observe", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "setValue", "t", "(Ljava/lang/Object;)V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SingleLiveEvent<T> extends MutableLiveData<T> {
    public static final int $stable = 8;
    private static int ShareDataUIState = 37 % 128;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final AtomicBoolean component1 = new AtomicBoolean(false);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Observer, FunctionAdapter {
        private static int component1 = 0;
        private static int component3 = 1;
        private final Function1 copydefault;

        copydefault(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        public final boolean equals(Object obj) {
            boolean zAreEqual;
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 119;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            if ((!(obj instanceof Observer)) || !(obj instanceof FunctionAdapter)) {
                zAreEqual = false;
            } else {
                int i5 = i2 + 49;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            int i6 = component3 + 111;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 90 / 0;
            }
            return zAreEqual;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            Function1 function1;
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 97;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                function1 = this.copydefault;
                int i4 = 57 / 0;
            } else {
                function1 = this.copydefault;
            }
            int i5 = i2 + 103;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 7;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 != 0) {
                return functionDelegate.hashCode();
            }
            int i4 = 8 / 0;
            return functionDelegate.hashCode();
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 61;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                this.copydefault.invoke(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            this.copydefault.invoke(obj);
            int i3 = component3 + 3;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 68 / 0;
            }
        }
    }

    @Override
    public void observe(LifecycleOwner owner, final Observer<? super T> observer) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(owner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        super.observe(owner, new copydefault(new Function1() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 99;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$HR3lOoPEJktcNC0z2884v_CXO2c = SingleLiveEvent.$r8$lambda$HR3lOoPEJktcNC0z2884v_CXO2c(this.f$0, observer, obj);
                int i5 = component3 + 71;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return unit$r8$lambda$HR3lOoPEJktcNC0z2884v_CXO2c;
            }
        }));
        int i2 = component3 + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit component3(SingleLiveEvent singleLiveEvent, Observer observer, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(singleLiveEvent, "");
        Intrinsics.checkNotNullParameter(observer, "");
        if (singleLiveEvent.component1.compareAndSet(true, false)) {
            int i4 = component3 + 71;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                observer.onChanged(obj);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            observer.onChanged(obj);
        }
        return Unit.INSTANCE;
    }

    @Override
    public void setValue(T t) {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component3 = i2 % 128;
        (i2 % 2 != 0 ? this.component1 : this.component1).set(true);
        super.setValue(t);
    }

    public static Unit $r8$lambda$HR3lOoPEJktcNC0z2884v_CXO2c(SingleLiveEvent singleLiveEvent, Observer observer, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent3 = component3(singleLiveEvent, observer, obj);
        int i4 = component2 + 53;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
        return unitComponent3;
    }

    static {
        if (37 % 2 == 0) {
            throw null;
        }
    }
}
