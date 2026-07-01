package com.huawei.digitalpayment.consumer.baselib.util;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00052\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u0007\u0012\u0004\u0012\u0002H\u00060\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/util/TransformationsUtils;", "", "<init>", "()V", "map", "Landroidx/lifecycle/LiveData;", "Y", "X", "source", "mapFunction", "Landroidx/arch/core/util/Function;", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransformationsUtils {
    public static final TransformationsUtils INSTANCE = new TransformationsUtils();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private final Function1 component3;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r5) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.baselib.util.TransformationsUtils.component2.component1
                int r1 = r1 + 75
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.baselib.util.TransformationsUtils.component2.ShareDataUIState = r2
                int r1 = r1 % r0
                boolean r1 = r5 instanceof androidx.lifecycle.Observer
                r3 = 1
                if (r1 == 0) goto L2f
                int r2 = r2 + 87
                int r1 = r2 % 128
                com.huawei.digitalpayment.consumer.baselib.util.TransformationsUtils.component2.component1 = r1
                int r2 = r2 % r0
                boolean r1 = r5 instanceof kotlin.jvm.internal.FunctionAdapter
                r1 = r1 ^ r3
                if (r1 == r3) goto L2f
                r1 = r4
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r5 = (kotlin.jvm.internal.FunctionAdapter) r5
                kotlin.Function r5 = r5.getFunctionDelegate()
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
                goto L30
            L2f:
                r5 = 0
            L30:
                int r1 = com.huawei.digitalpayment.consumer.baselib.util.TransformationsUtils.component2.component1
                int r1 = r1 + r3
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.baselib.util.TransformationsUtils.component2.ShareDataUIState = r2
                int r1 = r1 % r0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.baselib.util.TransformationsUtils.component2.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component1 + 109;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.component3;
            int i5 = i3 + 53;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 13;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = ShareDataUIState + 7;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 11;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                this.component3.invoke(obj);
                throw null;
            }
            this.component3.invoke(obj);
            int i3 = component1 + 21;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    private TransformationsUtils() {
    }

    private static final Unit ShareDataUIState(MediatorLiveData mediatorLiveData, androidx.arch.core.util.Function function, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        mediatorLiveData.setValue(function.apply(obj));
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return unit;
    }

    public final <X, Y> LiveData<Y> map(LiveData<X> source, final androidx.arch.core.util.Function<X, Y> mapFunction) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(source, "");
        Intrinsics.checkNotNullParameter(mapFunction, "");
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(source, new component2(new Function1() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 71;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$acchlJcj51vxerxvdP922cGy9oU = TransformationsUtils.$r8$lambda$acchlJcj51vxerxvdP922cGy9oU(mediatorLiveData, mapFunction, obj);
                int i5 = ShareDataUIState + 101;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit$r8$lambda$acchlJcj51vxerxvdP922cGy9oU;
                }
                throw null;
            }
        }));
        MediatorLiveData mediatorLiveData2 = mediatorLiveData;
        int i2 = component2 + 7;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
        return mediatorLiveData2;
    }

    public static Unit $r8$lambda$acchlJcj51vxerxvdP922cGy9oU(MediatorLiveData mediatorLiveData, androidx.arch.core.util.Function function, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShareDataUIState = ShareDataUIState(mediatorLiveData, function, obj);
        int i4 = copydefault + 87;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return unitShareDataUIState;
    }

    static {
        int i = ShareDataUIState + 55;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
