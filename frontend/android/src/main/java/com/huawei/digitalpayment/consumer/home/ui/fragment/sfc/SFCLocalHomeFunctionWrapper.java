package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc;

import com.alibaba.ariver.kernel.RVParams;
import com.huawei.digitalpayment.consumer.base.resp.SFCLocalHomeFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0005H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/SFCLocalHomeFunctionWrapper;", "", "data", "Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunction;", RVParams.AROME_BG_COLOR, "", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunction;I)V", "getData", "()Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunction;", "getBgColor", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SFCLocalHomeFunctionWrapper {
    public static final int $stable = 8;
    private static int ShareDataUIState = 13 % 128;
    private static int component2 = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private final SFCLocalHomeFunction component1;
    private final int component3;

    public SFCLocalHomeFunctionWrapper(SFCLocalHomeFunction sFCLocalHomeFunction, int i) {
        Intrinsics.checkNotNullParameter(sFCLocalHomeFunction, "");
        this.component1 = sFCLocalHomeFunction;
        this.component3 = i;
    }

    public final SFCLocalHomeFunction getData() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SFCLocalHomeFunction sFCLocalHomeFunction = this.component1;
        int i4 = i2 + 47;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return sFCLocalHomeFunction;
    }

    public final int getBgColor() {
        int i = 2 % 2;
        int i2 = equals + 113;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    static {
        if (13 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SFCLocalHomeFunctionWrapper copy$default(SFCLocalHomeFunctionWrapper sFCLocalHomeFunctionWrapper, SFCLocalHomeFunction sFCLocalHomeFunction, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component2 + 101;
        int i5 = i4 % 128;
        equals = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            sFCLocalHomeFunction = sFCLocalHomeFunctionWrapper.component1;
        }
        if ((i2 & 2) != 0) {
            int i7 = i5 + 7;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            i = sFCLocalHomeFunctionWrapper.component3;
        }
        SFCLocalHomeFunctionWrapper sFCLocalHomeFunctionWrapperCopy = sFCLocalHomeFunctionWrapper.copy(sFCLocalHomeFunction, i);
        int i9 = equals + 49;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return sFCLocalHomeFunctionWrapperCopy;
    }

    public final SFCLocalHomeFunction component1() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        SFCLocalHomeFunction sFCLocalHomeFunction = this.component1;
        int i5 = i2 + 99;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return sFCLocalHomeFunction;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component3;
        int i6 = i2 + 97;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final SFCLocalHomeFunctionWrapper copy(SFCLocalHomeFunction data, int bgColor) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(data, "");
        SFCLocalHomeFunctionWrapper sFCLocalHomeFunctionWrapper = new SFCLocalHomeFunctionWrapper(data, bgColor);
        int i2 = equals + 41;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return sFCLocalHomeFunctionWrapper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = equals + 97;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 37;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof SFCLocalHomeFunctionWrapper)) {
            return false;
        }
        SFCLocalHomeFunctionWrapper sFCLocalHomeFunctionWrapper = (SFCLocalHomeFunctionWrapper) other;
        if (!Intrinsics.areEqual(this.component1, sFCLocalHomeFunctionWrapper.component1)) {
            return false;
        }
        if (this.component3 != sFCLocalHomeFunctionWrapper.component3) {
            int i7 = equals + 55;
            component2 = i7 % 128;
            return i7 % 2 != 0;
        }
        int i8 = equals + 41;
        component2 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 47 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component1.hashCode();
        return i3 == 0 ? (iHashCode % 68) - Integer.hashCode(this.component3) : (iHashCode * 31) + Integer.hashCode(this.component3);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SFCLocalHomeFunctionWrapper(data=" + this.component1 + ", bgColor=" + this.component3 + ")";
        int i2 = equals + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
