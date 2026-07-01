package com.huawei.payment.mvvm;

import com.huawei.common.exception.BaseException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

public final class Resource<T> {
    private BaseException ShareDataUIState;
    private T component3;
    private Status copydefault;

    public Status getStatus() {
        return this.copydefault;
    }

    public void setStatus(Status status) {
        this.copydefault = status;
    }

    public T getData() {
        return this.component3;
    }

    public BaseException getException() {
        return this.ShareDataUIState;
    }

    public void setData(T t) {
        this.component3 = t;
    }

    private Resource(Status status, T t) {
        this.copydefault = status;
        this.component3 = t;
    }

    private Resource(Status status, T t, BaseException baseException) {
        this.copydefault = status;
        this.component3 = t;
        this.ShareDataUIState = baseException;
    }

    public static <T> Resource<T> success(T t) {
        return new Resource<>(Status.SUCCESS, t);
    }

    public boolean success() {
        return this.copydefault == Status.SUCCESS;
    }

    public boolean error() {
        return this.copydefault == Status.ERROR;
    }

    public boolean loading() {
        return this.copydefault == Status.LOADING;
    }

    public static <T> Resource<T> loading(T t) {
        return new Resource<>(Status.LOADING, t);
    }

    public static <T> Resource<T> error(BaseException baseException, T t) {
        return new Resource<>(Status.ERROR, t, baseException);
    }

    public static <T> Resource<T> none() {
        return new Resource<>(Status.NONE, null);
    }

    public String getMessage() {
        return this.ShareDataUIState.getMessage();
    }

    public String toString() {
        return "Resource{status=" + this.copydefault + ", exception=" + this.ShareDataUIState + ", data=" + this.component3 + AbstractJsonLexerKt.END_OBJ;
    }
}
