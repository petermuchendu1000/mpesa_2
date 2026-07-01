package com.huawei.digitalpayment.common.theme.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/GroupComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", "roundCornerBottomLeft", "", "roundCornerTopRight", "roundCornerTopLeft", "roundCornerBottomRight", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getRoundCornerBottomLeft", "()Ljava/lang/Integer;", "setRoundCornerBottomLeft", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRoundCornerTopRight", "setRoundCornerTopRight", "getRoundCornerTopLeft", "setRoundCornerTopLeft", "getRoundCornerBottomRight", "setRoundCornerBottomRight", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class GroupComponent extends BaseComponent {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private Integer roundCornerBottomLeft;
    private Integer roundCornerBottomRight;
    private Integer roundCornerTopLeft;
    private Integer roundCornerTopRight;

    /* JADX WARN: Illegal instructions before constructor call */
    public GroupComponent(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        num = (i & 1) != 0 ? null : num;
        if ((i & 2) != 0) {
            int i2 = ShareDataUIState + 37;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            num2 = null;
        }
        num3 = (i & 4) != 0 ? null : num3;
        if ((i & 8) != 0) {
            int i4 = ShareDataUIState + 27;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            num4 = null;
        }
        this(num, num2, num3, num4);
    }

    public final Integer getRoundCornerBottomLeft() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.roundCornerBottomLeft;
        int i4 = i2 + 93;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final void setRoundCornerBottomLeft(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.roundCornerBottomLeft = num;
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer getRoundCornerTopRight() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.roundCornerTopRight;
        int i5 = i2 + 21;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void setRoundCornerTopRight(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.roundCornerTopRight = num;
        int i5 = i2 + 1;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer getRoundCornerTopLeft() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Integer num = this.roundCornerTopLeft;
        int i4 = i3 + 67;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public final void setRoundCornerTopLeft(Integer num) {
        int i = 2 % 2;
        int i2 = copydefault + 113;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.roundCornerTopLeft = num;
        int i5 = i3 + 23;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final Integer getRoundCornerBottomRight() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.roundCornerBottomRight;
        int i5 = i2 + 21;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRoundCornerBottomRight(Integer num) {
        int i = 2 % 2;
        int i2 = copydefault + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.roundCornerBottomRight = num;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 21;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public GroupComponent(Integer num, Integer num2, Integer num3, Integer num4) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.roundCornerBottomLeft = num;
        this.roundCornerTopRight = num2;
        this.roundCornerTopLeft = num3;
        this.roundCornerBottomRight = num4;
    }

    public GroupComponent() {
        this(null, null, null, null, 15, null);
    }
}
