package com.huawei.digitalpayment.checkout.utils;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

public class HwMutableLiveData<T> extends MutableLiveData<T> {
    private static int ShareDataUIState = 1;
    private static final String component1 = "HwMutableLiveData";
    private static int component2 = 0;
    private static int copy = 1;
    private static int copydefault;
    private final AtomicBoolean component3 = new AtomicBoolean(false);

    @Override
    public void observe(LifecycleOwner lifecycleOwner, final Observer<? super T> observer) {
        int i = 2 % 2;
        int i2 = component2 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (!hasActiveObservers()) {
            super.observe(lifecycleOwner, new Observer() {
                private static int ShareDataUIState = 1;
                private static int component2;

                @Override
                public final void onChanged(Object obj) {
                    int i4 = 2 % 2;
                    int i5 = ShareDataUIState + 7;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    HwMutableLiveData.m10152$r8$lambda$jbSpRWQAizg28XN2Wa2AOjJcJ8(this.f$0, observer, obj);
                    int i7 = ShareDataUIState + 107;
                    component2 = i7 % 128;
                    if (i7 % 2 == 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            return;
        }
        int i4 = ShareDataUIState + 95;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void component2(Observer observer, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            if (!this.component3.compareAndSet(true, true)) {
                return;
            }
        } else if (!this.component3.compareAndSet(true, false)) {
            return;
        }
        observer.onChanged(obj);
        int i3 = component2 + 5;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 % 3;
        }
    }

    @Override
    public void setValue(T t) {
        AtomicBoolean atomicBoolean;
        boolean z;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            atomicBoolean = this.component3;
            z = false;
        } else {
            atomicBoolean = this.component3;
            z = true;
        }
        atomicBoolean.set(z);
        super.setValue(t);
    }

    public void call() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        setValue(null);
        int i4 = ShareDataUIState + 109;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10152$r8$lambda$jbSpRWQAizg28XN2Wa2AOjJcJ8(HwMutableLiveData hwMutableLiveData, Observer observer, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        hwMutableLiveData.component2(observer, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = ShareDataUIState + 101;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 49;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 48 / 0;
        }
    }
}
