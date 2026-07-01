package com.huawei.digitalpayment.consumer.sfcui.utils;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a,\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001aP\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0004\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000b0\n2\u0014\b\u0004\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\nH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"observeOnce", "", "T", "Landroidx/lifecycle/LiveData;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "observeUntil", "predicate", "Lkotlin/Function1;", "", "ConsumerSfcUI_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class LiveDataExtensionsKt {
    private static int component1 = 0;
    private static int component2 = 1;

    public static final <T> void observeOnce(final LiveData<T> liveData, LifecycleOwner lifecycleOwner, final Observer<T> observer) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(observer, "");
        liveData.observe(lifecycleOwner, new Observer<T>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void onChanged(T value) {
                int i2 = 2 % 2;
                int i3 = component2 + 43;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    observer.onChanged(value);
                    liveData.removeObserver(this);
                    int i4 = component2 + 83;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                observer.onChanged(value);
                liveData.removeObserver(this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component1 + 105;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
    }

    public static final <T> void observeUntil(final LiveData<T> liveData, LifecycleOwner lifecycleOwner, final Function1<? super T, Boolean> function1, final Function1<? super T, Unit> function12) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(liveData, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        liveData.observe(lifecycleOwner, new Observer<T>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onChanged(T value) {
                int i2 = 2 % 2;
                int i3 = component1 + 31;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                if (function1.invoke(value).booleanValue()) {
                    function12.invoke(value);
                    liveData.removeObserver(this);
                }
                int i5 = component1 + 61;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component2 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }
}
