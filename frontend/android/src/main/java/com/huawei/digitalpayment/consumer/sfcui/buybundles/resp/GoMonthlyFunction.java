package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0003H×\u0001J\t\u0010\u001a\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/GoMonthlyFunction;", "Ljava/io/Serializable;", SfcServicePinActivity.EXTRA_IMAGE_RES, "", "functionTitle", "", "functionDes", KeysConstants.KEY_EXECUTE, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageRes", "()I", "getFunctionTitle", "()Ljava/lang/String;", "getFunctionDes", "getExecute", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GoMonthlyFunction implements Serializable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String execute;
    private final String functionDes;
    private final String functionTitle;
    private final int imageRes;

    public GoMonthlyFunction(int i, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.imageRes = i;
        this.functionTitle = str;
        this.functionDes = str2;
        this.execute = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GoMonthlyFunction(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 8) != 0) {
            int i3 = ShareDataUIState + 59;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 57 / 0;
            }
            int i5 = 2 % 2;
            str3 = "";
        }
        this(i, str, str2, str3);
    }

    public final int getImageRes() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 47;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i4 = this.imageRes;
        int i5 = i2 + 9;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String getFunctionTitle() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.functionTitle;
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFunctionDes() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 97;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.functionDes;
        int i4 = i2 + 109;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 13;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 27;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 1 + 107;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static GoMonthlyFunction copy$default(GoMonthlyFunction goMonthlyFunction, int i, String str, String str2, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState;
        int i5 = i4 + 77;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i4 + 5;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            i = goMonthlyFunction.imageRes;
            if (i8 != 0) {
                int i9 = 43 / 0;
            }
        }
        if ((i2 & 2) != 0) {
            str = goMonthlyFunction.functionTitle;
        }
        if ((i2 & 4) != 0) {
            str2 = goMonthlyFunction.functionDes;
            int i10 = component3 + 95;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
        }
        if ((i2 & 8) != 0) {
            int i12 = component3 + 71;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
            str3 = goMonthlyFunction.execute;
        }
        return goMonthlyFunction.copy(i, str, str2, str3);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.imageRes;
        int i5 = i3 + 49;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.functionTitle;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.functionDes;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 97;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 23;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final GoMonthlyFunction copy(int imageRes, String functionTitle, String functionDes, String execute) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(functionTitle, "");
        Intrinsics.checkNotNullParameter(functionDes, "");
        Intrinsics.checkNotNullParameter(execute, "");
        GoMonthlyFunction goMonthlyFunction = new GoMonthlyFunction(imageRes, functionTitle, functionDes, execute);
        int i2 = ShareDataUIState + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return goMonthlyFunction;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoMonthlyFunction)) {
            return false;
        }
        GoMonthlyFunction goMonthlyFunction = (GoMonthlyFunction) other;
        if (this.imageRes != goMonthlyFunction.imageRes || !Intrinsics.areEqual(this.functionTitle, goMonthlyFunction.functionTitle)) {
            return false;
        }
        if (Intrinsics.areEqual(this.functionDes, goMonthlyFunction.functionDes)) {
            if (Intrinsics.areEqual(this.execute, goMonthlyFunction.execute)) {
                return true;
            }
            int i4 = ShareDataUIState + 69;
            component3 = i4 % 128;
            return i4 % 2 != 0;
        }
        int i5 = component3 + 77;
        int i6 = i5 % 128;
        ShareDataUIState = i6;
        boolean z = i5 % 2 == 0;
        int i7 = i6 + 59;
        component3 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 87 / 0;
        }
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.imageRes);
        return i3 != 0 ? (((((iHashCode + 122) / this.functionTitle.hashCode()) << 91) / this.functionDes.hashCode()) % 62) * this.execute.hashCode() : (((((iHashCode * 31) + this.functionTitle.hashCode()) * 31) + this.functionDes.hashCode()) * 31) + this.execute.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GoMonthlyFunction(imageRes=" + this.imageRes + ", functionTitle=" + this.functionTitle + ", functionDes=" + this.functionDes + ", execute=" + this.execute + ")";
        int i2 = component3 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
