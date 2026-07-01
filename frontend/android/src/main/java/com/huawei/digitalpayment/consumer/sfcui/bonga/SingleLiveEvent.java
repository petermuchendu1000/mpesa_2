package com.huawei.digitalpayment.consumer.sfcui.bonga;

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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\fH\u0016J\u0017\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/SingleLiveEvent;", "T", "Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", RequestMoneyResultActivity.TYPE_PENDING, "Ljava/util/concurrent/atomic/AtomicBoolean;", "observe", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "setValue", "value", "(Ljava/lang/Object;)V", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SingleLiveEvent<T> extends MutableLiveData<T> {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 19 % 128;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final AtomicBoolean ShareDataUIState = new AtomicBoolean(false);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 1;
        private static int component3;
        private final Function1 copydefault;

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 117;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                if (!(obj instanceof Observer)) {
                    return false;
                }
            } else if (!(obj instanceof Observer)) {
                return false;
            }
            if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i4 = i2 + 87;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 73;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.copydefault;
            if (i3 != 0) {
                int i4 = 69 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 45;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = ShareDataUIState + 27;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 47;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault.invoke(obj);
            int i4 = ShareDataUIState + 5;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 11 / 0;
            }
        }
    }

    @Override
    public void observe(LifecycleOwner owner, final Observer<? super T> observer) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(owner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        super.observe(owner, new component3(new Function1() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 83;
                component2 = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    SingleLiveEvent.m11115$r8$lambda$zUFZwdHHDj696CpKg26OaP82GQ(this.f$0, observer, obj);
                    obj2.hashCode();
                    throw null;
                }
                Unit unitM11115$r8$lambda$zUFZwdHHDj696CpKg26OaP82GQ = SingleLiveEvent.m11115$r8$lambda$zUFZwdHHDj696CpKg26OaP82GQ(this.f$0, observer, obj);
                int i4 = component2 + 103;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitM11115$r8$lambda$zUFZwdHHDj696CpKg26OaP82GQ;
                }
                throw null;
            }
        }));
        int i2 = copydefault + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit component2(com.huawei.digitalpayment.consumer.sfcui.bonga.SingleLiveEvent r5, androidx.lifecycle.Observer r6, java.lang.Object r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.bonga.SingleLiveEvent.copydefault
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.SingleLiveEvent.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            if (r1 == 0) goto L21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.ShareDataUIState
            boolean r5 = r5.compareAndSet(r3, r2)
            if (r5 == 0) goto L3f
            goto L2f
        L21:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.ShareDataUIState
            boolean r5 = r5.compareAndSet(r3, r2)
            if (r5 == 0) goto L3f
        L2f:
            r6.onChanged(r7)
            int r5 = com.huawei.digitalpayment.consumer.sfcui.bonga.SingleLiveEvent.component1
            int r5 = r5 + 93
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.bonga.SingleLiveEvent.copydefault = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L3f
            int r0 = r0 % 5
        L3f:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.SingleLiveEvent.component2(com.huawei.digitalpayment.consumer.sfcui.bonga.SingleLiveEvent, androidx.lifecycle.Observer, java.lang.Object):kotlin.Unit");
    }

    @Override
    public void setValue(T value) {
        AtomicBoolean atomicBoolean;
        boolean z;
        int i = 2 % 2;
        int i2 = component1 + 83;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            atomicBoolean = this.ShareDataUIState;
            z = false;
        } else {
            atomicBoolean = this.ShareDataUIState;
            z = true;
        }
        atomicBoolean.set(z);
        super.setValue(value);
    }

    public static Unit m11115$r8$lambda$zUFZwdHHDj696CpKg26OaP82GQ(SingleLiveEvent singleLiveEvent, Observer observer, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent2 = component2(singleLiveEvent, observer, obj);
        int i4 = component1 + 99;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitComponent2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    static {
        int i = 19 % 2;
    }
}
