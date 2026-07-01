package com.huawei.digitalpayment.consumer.sfcui.helper;

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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\fH\u0016J\u0017\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/helper/SingleLiveEvent;", "T", "Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", RequestMoneyResultActivity.TYPE_PENDING, "Ljava/util/concurrent/atomic/AtomicBoolean;", "observe", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "setValue", "value", "(Ljava/lang/Object;)V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SingleLiveEvent<T> extends MutableLiveData<T> {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final AtomicBoolean component2 = new AtomicBoolean(false);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        private final Function1 component3;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 93;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                if (!(obj instanceof Observer)) {
                    return false;
                }
            } else if (!(obj instanceof Observer)) {
                return false;
            }
            int i4 = i2 + 49;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            if (obj instanceof FunctionAdapter) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 3;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.component3;
            int i5 = i2 + 31;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = copydefault + 1;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = getFunctionDelegate().hashCode();
                int i3 = 32 / 0;
            } else {
                iHashCode = getFunctionDelegate().hashCode();
            }
            int i4 = ShareDataUIState + 53;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 37;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.component3.invoke(obj);
            int i4 = copydefault + 79;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override
    public void observe(LifecycleOwner owner, final Observer<? super T> observer) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(owner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        super.observe(owner, new component2(new Function1() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 107;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$T0sLdSVEaMkUemR5cH2tFMtBWIo = SingleLiveEvent.$r8$lambda$T0sLdSVEaMkUemR5cH2tFMtBWIo(this.f$0, observer, obj);
                int i5 = component1 + 69;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit$r8$lambda$T0sLdSVEaMkUemR5cH2tFMtBWIo;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = ShareDataUIState + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit ShareDataUIState(com.huawei.digitalpayment.consumer.sfcui.helper.SingleLiveEvent r5, androidx.lifecycle.Observer r6, java.lang.Object r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.helper.SingleLiveEvent.ShareDataUIState
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.helper.SingleLiveEvent.copydefault = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            java.lang.String r4 = ""
            if (r1 != 0) goto L21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.component2
            boolean r5 = r5.compareAndSet(r3, r2)
            if (r5 == 0) goto L3b
            goto L2f
        L21:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.component2
            boolean r5 = r5.compareAndSet(r2, r3)
            if (r5 == 0) goto L3b
        L2f:
            r6.onChanged(r7)
            int r5 = com.huawei.digitalpayment.consumer.sfcui.helper.SingleLiveEvent.ShareDataUIState
            int r5 = r5 + 123
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.helper.SingleLiveEvent.copydefault = r6
            int r5 = r5 % r0
        L3b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.helper.SingleLiveEvent.ShareDataUIState(com.huawei.digitalpayment.consumer.sfcui.helper.SingleLiveEvent, androidx.lifecycle.Observer, java.lang.Object):kotlin.Unit");
    }

    @Override
    public void setValue(T value) {
        AtomicBoolean atomicBoolean;
        boolean z;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            atomicBoolean = this.component2;
            z = false;
        } else {
            atomicBoolean = this.component2;
            z = true;
        }
        atomicBoolean.set(z);
        super.setValue(value);
        int i3 = copydefault + 11;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
    }

    public static Unit $r8$lambda$T0sLdSVEaMkUemR5cH2tFMtBWIo(SingleLiveEvent singleLiveEvent, Observer observer, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShareDataUIState = ShareDataUIState(singleLiveEvent, observer, obj);
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return unitShareDataUIState;
    }

    static {
        int i = 1 + 53;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
