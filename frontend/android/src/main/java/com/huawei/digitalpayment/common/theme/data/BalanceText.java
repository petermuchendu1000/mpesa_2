package com.huawei.digitalpayment.common.theme.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/BalanceText;", "Lcom/huawei/digitalpayment/common/theme/data/TextConfig;", "showIcon", "", "hideIcon", "maxWidth", "", "isShowHide", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getShowIcon", "()Ljava/lang/String;", "getHideIcon", "getMaxWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BalanceText extends TextConfig {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final String hideIcon;
    private final boolean isShowHide;
    private final Integer maxWidth;
    private final String showIcon;

    /* JADX WARN: Illegal instructions before constructor call */
    public BalanceText(String str, String str2, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 91;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            str2 = null;
        }
        if ((i & 4) != 0) {
            int i5 = component1 + 69;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            num = null;
        }
        if ((i & 8) != 0) {
            int i7 = ShareDataUIState + 75;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            z = true;
        }
        this(str, str2, num, z);
    }

    public final String getShowIcon() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.showIcon;
        int i5 = i3 + 3;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getHideIcon() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.hideIcon;
        int i5 = i2 + 57;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getMaxWidth() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.maxWidth;
        int i4 = i3 + 37;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final boolean isShowHide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.isShowHide;
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public BalanceText(String str, String str2, Integer num, boolean z) {
        super(null, null, null, null, null, null, false, null, null, null, null, 2047, null);
        this.showIcon = str;
        this.hideIcon = str2;
        this.maxWidth = num;
        this.isShowHide = z;
    }

    public BalanceText() {
        this(null, null, null, false, 15, null);
    }
}
