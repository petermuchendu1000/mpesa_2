package com.huawei.digitalpayment.consumer.sfcqrcode.ui.utils;

import android.util.Size;
import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/utils/SmartSize;", "", "width", "", "height", "<init>", "(II)V", "size", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "setSize", "(Landroid/util/Size;)V", Constants.LONG, "getLong", "()I", "setLong", "(I)V", "short", "getShort", "setShort", "toString", "", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SmartSize {
    public static final int $stable = 8;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private Size ShareDataUIState;
    private int component1;
    private int copydefault;

    public SmartSize(int i, int i2) {
        Size size = new Size(i, i2);
        this.ShareDataUIState = size;
        this.copydefault = Math.max(size.getWidth(), this.ShareDataUIState.getHeight());
        this.component1 = Math.min(this.ShareDataUIState.getWidth(), this.ShareDataUIState.getHeight());
    }

    public final Size getSize() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 31;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        Size size = this.ShareDataUIState;
        int i5 = i3 + 27;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 24 / 0;
        }
        return size;
    }

    public final void setSize(Size size) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 27;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(size, "");
        this.ShareDataUIState = size;
        int i4 = getAsAtTimestamp + 29;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
    }

    public final int getLong() {
        int i = 2 % 2;
        int i2 = component4 + 79;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        int i5 = this.copydefault;
        int i6 = i3 + 25;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final void setLong(int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 57;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        int i5 = i3 % 2;
        this.copydefault = i;
        int i6 = i4 + 19;
        component4 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int getShort() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 125;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.component1;
        int i5 = i2 + 75;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final void setShort(int i) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 109;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        this.component1 = i;
        if (i5 != 0) {
            int i6 = 84 / 0;
        }
        int i7 = i3 + 5;
        component4 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 37 / 0;
        }
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SmartSize(" + this.copydefault + "x" + this.component1 + ")";
        int i2 = getAsAtTimestamp + 85;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 1 + 107;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 22 / 0;
        }
    }
}
