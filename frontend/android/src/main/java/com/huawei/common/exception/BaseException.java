package com.huawei.common.exception;

import java.io.IOException;

public class BaseException extends IOException {
    private static final long serialVersionUID = 1322231553421189097L;
    private String responseCode;
    private String responseDesc;

    public BaseException(String str) {
        super(str);
        this.responseDesc = str;
    }

    public BaseException(String str, Throwable th) {
        super(str, th);
        this.responseDesc = str;
    }

    public BaseException(String str, String str2) {
        super(str2);
        this.responseDesc = str2;
        this.responseCode = str;
    }

    public BaseException(String str, String str2, Throwable th) {
        super(str2, th);
        this.responseDesc = str2;
        this.responseCode = str;
    }

    public String getResponseDesc() {
        return this.responseDesc;
    }

    public String getResponseCode() {
        return this.responseCode;
    }

    public int getCode() {
        try {
            return Integer.parseInt(this.responseCode);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static BaseException getException(Exception exc) {
        if (exc instanceof BaseException) {
            return (BaseException) exc;
        }
        if (exc == null) {
            return new BaseException("");
        }
        return new BaseException(exc.getMessage());
    }
}
