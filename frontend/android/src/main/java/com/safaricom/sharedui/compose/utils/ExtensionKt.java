package com.safaricom.sharedui.compose.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0000\u001a\u0004\b\u0003\u0010\u0000\u001a1\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\u0004\u0018\u0001H\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\u00010\u0006H\u0086\fø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"isNotNull", "", "", "isNullOr", "T", "predicate", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "SharedUiCompose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ExtensionKt {
    public static final boolean isNotNull(Object obj) {
        return obj != null;
    }

    public static final <T> boolean isNullOr(T t, Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (t != null) {
            return function1.invoke(t).booleanValue();
        }
        return true;
    }
}
