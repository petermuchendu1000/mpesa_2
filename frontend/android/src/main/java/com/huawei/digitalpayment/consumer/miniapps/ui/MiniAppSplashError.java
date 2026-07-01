package com.huawei.digitalpayment.consumer.miniapps.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0005H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/ui/MiniAppSplashError;", "", "hasError", "", "errorCode", "", "errorMessage", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "getHasError", "()Z", "setHasError", "(Z)V", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "getErrorMessage", "setErrorMessage", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppSplashError {
    public static final int $stable = 8;
    private static int ShareDataUIState = 121 % 128;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;
    private String errorCode;
    private String errorMessage;
    private boolean hasError;

    public MiniAppSplashError(boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.hasError = z;
        this.errorCode = str;
        this.errorMessage = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MiniAppSplashError(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 19;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            z = false;
        }
        if ((i & 2) != 0) {
            int i4 = 2 % 2;
            str = "";
        }
        if ((i & 4) != 0) {
            int i5 = component2 + 53;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            str2 = "";
        }
        this(z, str, str2);
    }

    public final boolean getHasError() {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.hasError;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setHasError(boolean z) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.hasError = z;
        int i5 = i2 + 95;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getErrorCode() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 35;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.errorCode;
        int i5 = i2 + 123;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setErrorCode(String str) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.errorCode = str;
        int i4 = component2 + 37;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getErrorMessage() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.errorMessage;
            int i4 = 56 / 0;
        } else {
            str = this.errorMessage;
        }
        int i5 = i2 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setErrorMessage(String str) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.errorMessage = str;
        int i4 = component1 + 5;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (121 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MiniAppSplashError() {
        this(false, null, null, 7, null);
    }

    public static MiniAppSplashError copy$default(MiniAppSplashError miniAppSplashError, boolean z, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 1;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            z = miniAppSplashError.hasError;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 77;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str = miniAppSplashError.errorCode;
        }
        if ((i & 4) != 0) {
            str2 = miniAppSplashError.errorMessage;
        }
        return miniAppSplashError.copy(z, str, str2);
    }

    public final boolean component1() {
        boolean z;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 97;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.hasError;
            int i4 = 69 / 0;
        } else {
            z = this.hasError;
        }
        int i5 = i2 + 91;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.errorCode;
        int i5 = i3 + 15;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.errorMessage;
        int i5 = i2 + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final MiniAppSplashError copy(boolean hasError, String errorCode, String errorMessage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(errorCode, "");
        Intrinsics.checkNotNullParameter(errorMessage, "");
        MiniAppSplashError miniAppSplashError = new MiniAppSplashError(hasError, errorCode, errorMessage);
        int i2 = component2 + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return miniAppSplashError;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniAppSplashError)) {
            int i2 = component1 + 5;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MiniAppSplashError miniAppSplashError = (MiniAppSplashError) other;
        if (this.hasError != miniAppSplashError.hasError) {
            return false;
        }
        if (!Intrinsics.areEqual(this.errorCode, miniAppSplashError.errorCode)) {
            int i3 = component1 + 33;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.errorMessage, miniAppSplashError.errorMessage)) {
            return true;
        }
        int i5 = component2 + 115;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Boolean.hashCode(this.hasError) * 31) + this.errorCode.hashCode()) * 31) + this.errorMessage.hashCode();
        int i4 = component1 + 59;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppSplashError(hasError=" + this.hasError + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ")";
        int i2 = component1 + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
