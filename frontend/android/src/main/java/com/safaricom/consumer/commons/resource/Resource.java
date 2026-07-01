package com.safaricom.consumer.commons.resource;

import androidx.exifinterface.media.ExifInterface;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.iap.ac.android.acs.operation.log.LogConstants;
import com.safaricom.consumer.commons.resource.ErrorType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000 0*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u00010B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0000\"\u0004\b\u0001\u0010\u00192\u001a\u0010\u001a\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u00000\u001bJH\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001d0\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001d0\u001b2\u0018\b\u0002\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bJv\u0010!\u001a\u00020\u001d\"\u0004\b\u0001\u0010\"2\"\u0010\u001e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"0$\u0012\u0006\u0012\u0004\u0018\u00010\u00020#2\"\u0010\u001f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\"0$\u0012\u0006\u0012\u0004\u0018\u00010\u00020#2\u0018\b\u0002\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001bH\u0086@¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0017H\u0016J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003J6\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u00061"}, d2 = {"Lcom/safaricom/consumer/commons/resource/Resource;", ExifInterface.LONGITUDE_EAST, "", "status", "Lcom/safaricom/consumer/commons/resource/Status;", "data", "errorType", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "<init>", "(Lcom/safaricom/consumer/commons/resource/Status;Ljava/lang/Object;Lcom/safaricom/consumer/commons/resource/ErrorType;)V", "getStatus", "()Lcom/safaricom/consumer/commons/resource/Status;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorType", "()Lcom/safaricom/consumer/commons/resource/ErrorType;", Keys.KEY_IS_SUCCESS, "", "isError", GriverMonitorConstants.KEY_IS_LOADING, "isNetworkError", "errorCode", "", "flatMap", LogConstants.RESULT_FALSE, "function", "Lkotlin/Function1;", "fold", "", RVEvents.EMBED_WEBVIEW_LOAD_ERROR_EVENT, "onSuccess", "onLoading", "foldSuspend", "T", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "component1", "component2", "component3", "copy", "(Lcom/safaricom/consumer/commons/resource/Status;Ljava/lang/Object;Lcom/safaricom/consumer/commons/resource/ErrorType;)Lcom/safaricom/consumer/commons/resource/Resource;", "equals", "other", "hashCode", "", "Companion", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Resource<E> {

    public static final Companion INSTANCE = new Companion(null);
    private final E component1;
    private final Status component2;
    private final ErrorType copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0006¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\t\u001a\u00020\u000bJ!\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0006¢\u0006\u0002\u0010\bJ)\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\u0006\u0010\t\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0006¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/safaricom/consumer/commons/resource/Resource$Companion;", "", "<init>", "()V", "success", "Lcom/safaricom/consumer/commons/resource/Resource;", "T", "data", "(Ljava/lang/Object;)Lcom/safaricom/consumer/commons/resource/Resource;", "error", "", "Lcom/safaricom/consumer/commons/resource/ErrorType;", "loading", "errorWithData", "(Lcom/safaricom/consumer/commons/resource/ErrorType;Ljava/lang/Object;)Lcom/safaricom/consumer/commons/resource/Resource;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <T> Resource<T> success(T data) {
            return new Resource<>(Status.SUCCESS, data, null, 4, null);
        }

        public final Resource error(ErrorType error) {
            Intrinsics.checkNotNullParameter(error, "");
            return new Resource(Status.ERROR, null, error);
        }

        public final <T> Resource<T> loading(T data) {
            return new Resource<>(Status.LOADING, data, null, 4, null);
        }

        public final <T> Resource<T> errorWithData(ErrorType error, T data) {
            Intrinsics.checkNotNullParameter(error, "");
            return new Resource<>(Status.ERROR, data, error);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Resource(Status status, E e, ErrorType errorType) {
        Intrinsics.checkNotNullParameter(status, "");
        this.component2 = status;
        this.component1 = e;
        this.copydefault = errorType;
    }

    public Resource(Status status, Object obj, ErrorType errorType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, obj, (i & 4) != 0 ? null : errorType);
    }

    public final E getData() {
        return this.component1;
    }

    public final ErrorType getErrorType() {
        return this.copydefault;
    }

    public final Status getStatus() {
        return this.component2;
    }

    public final boolean isSuccess() {
        return this.component2 == Status.SUCCESS;
    }

    public final boolean isError() {
        return this.component2 == Status.ERROR;
    }

    public final boolean isLoading() {
        return this.component2 == Status.LOADING;
    }

    public final boolean isNetworkError(String errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "");
        if (isError()) {
            ErrorType errorType = this.copydefault;
            ErrorType.Network.Generic generic = errorType instanceof ErrorType.Network.Generic ? (ErrorType.Network.Generic) errorType : null;
            if (Intrinsics.areEqual(generic != null ? generic.getErrorCode() : null, errorCode)) {
                return true;
            }
        }
        return false;
    }

    public final <F> Resource<F> flatMap(Function1<? super E, ? extends Resource<? extends F>> function) {
        Intrinsics.checkNotNullParameter(function, "");
        int i = WhenMappings.$EnumSwitchMapping$0[this.component2.ordinal()];
        if (i == 1) {
            return function.invoke(this.component1);
        }
        if (i == 2) {
            Companion companion = INSTANCE;
            ErrorType errorType = this.copydefault;
            Intrinsics.checkNotNull(errorType);
            return companion.error(errorType);
        }
        return function.invoke(this.component1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void fold$default(Resource resource, Function1 function1, Function1 function12, Function1 function13, int i, Object obj) {
        if ((i & 4) != 0) {
            function13 = null;
        }
        resource.fold(function1, function12, function13);
    }

    public final void fold(Function1<? super ErrorType, Unit> onError, Function1<? super E, Unit> onSuccess, Function1<? super E, Unit> onLoading) {
        Intrinsics.checkNotNullParameter(onError, "");
        Intrinsics.checkNotNullParameter(onSuccess, "");
        if (isError()) {
            ErrorType errorType = this.copydefault;
            Intrinsics.checkNotNull(errorType);
            onError.invoke(errorType);
        } else if (isLoading()) {
            if (onLoading != null) {
                onLoading.invoke(this.component1);
            }
        } else {
            E e = this.component1;
            Intrinsics.checkNotNull(e);
            onSuccess.invoke(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object foldSuspend$default(Resource resource, Function2 function2, Function2 function22, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return resource.foldSuspend(function2, function22, function1, continuation);
    }

    public final <T> Object foldSuspend(Function2<? super ErrorType, ? super Continuation<? super T>, ? extends Object> function2, Function2<? super E, ? super Continuation<? super T>, ? extends Object> function22, Function1<? super E, Unit> function1, Continuation<? super Unit> continuation) {
        if (isError()) {
            ErrorType errorType = this.copydefault;
            Intrinsics.checkNotNull(errorType);
            Object objInvoke = function2.invoke(errorType, continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
        }
        if (!isLoading()) {
            E e = this.component1;
            Intrinsics.checkNotNull(e);
            Object objInvoke2 = function22.invoke(e, continuation);
            return objInvoke2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke2 : Unit.INSTANCE;
        }
        if (function1 != null) {
            function1.invoke(this.component1);
        }
        return Unit.INSTANCE;
    }

    public String toString() {
        return "Resource(status=" + this.component2 + ", data=" + this.component1 + ", errorType=" + this.copydefault + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Resource copy$default(Resource resource, Status status, Object obj, ErrorType errorType, int i, Object obj2) {
        if ((i & 1) != 0) {
            status = resource.component2;
        }
        if ((i & 2) != 0) {
            obj = resource.component1;
        }
        if ((i & 4) != 0) {
            errorType = resource.copydefault;
        }
        return resource.copy(status, obj, errorType);
    }

    public final Status getComponent2() {
        return this.component2;
    }

    public final E component2() {
        return this.component1;
    }

    public final ErrorType getCopydefault() {
        return this.copydefault;
    }

    public final Resource<E> copy(Status status, E data, ErrorType errorType) {
        Intrinsics.checkNotNullParameter(status, "");
        return new Resource<>(status, data, errorType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) other;
        return this.component2 == resource.component2 && Intrinsics.areEqual(this.component1, resource.component1) && Intrinsics.areEqual(this.copydefault, resource.copydefault);
    }

    public int hashCode() {
        int iHashCode = this.component2.hashCode();
        E e = this.component1;
        int iHashCode2 = e == null ? 0 : e.hashCode();
        ErrorType errorType = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (errorType != null ? errorType.hashCode() : 0);
    }
}
