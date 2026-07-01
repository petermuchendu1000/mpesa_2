package com.huawei.digitalpayment.consumer.subsui.ui.premiumSubscriptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0005H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/QuickActionUiModel;", "", "type", "Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/QuickActionType;", "iconRes", "", "titleRes", "<init>", "(Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/QuickActionType;II)V", "getType", "()Lcom/huawei/digitalpayment/consumer/subsui/ui/premiumSubscriptions/QuickActionType;", "getIconRes", "()I", "getTitleRes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickActionUiModel {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int getAsAtTimestamp;
    private final QuickActionType component1;
    private final int component3;
    private final int copydefault;

    public QuickActionUiModel(QuickActionType quickActionType, int i, int i2) {
        Intrinsics.checkNotNullParameter(quickActionType, "");
        this.component1 = quickActionType;
        this.copydefault = i;
        this.component3 = i2;
    }

    public final QuickActionType getType() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 79;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        QuickActionType quickActionType = this.component1;
        int i5 = i2 + 101;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return quickActionType;
    }

    public final int getIconRes() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 85;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.copydefault;
        int i5 = i2 + 101;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int getTitleRes() {
        int i = 2 % 2;
        int i2 = component4 + 59;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.component3;
        int i5 = i3 + 33;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    static {
        int i = 1 + 113;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static QuickActionUiModel copy$default(QuickActionUiModel quickActionUiModel, QuickActionType quickActionType, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = component4;
        int i6 = i5 + 79;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0 && (i3 & 1) != 0) {
            int i7 = i5 + 29;
            getAsAtTimestamp = i7 % 128;
            if (i7 % 2 != 0) {
                QuickActionType quickActionType2 = quickActionUiModel.component1;
                throw null;
            }
            quickActionType = quickActionUiModel.component1;
        }
        if ((i3 & 2) != 0) {
            int i8 = i5 + 125;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
            i = quickActionUiModel.copydefault;
            if (i9 != 0) {
                int i10 = 20 / 0;
            }
        }
        if ((i3 & 4) != 0) {
            i2 = quickActionUiModel.component3;
        }
        return quickActionUiModel.copy(quickActionType, i, i2);
    }

    public final QuickActionType component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        QuickActionType quickActionType = this.component1;
        int i5 = i3 + 51;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return quickActionType;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component4 + 17;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = component4 + 77;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        int i5 = this.component3;
        int i6 = i3 + 87;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final QuickActionUiModel copy(QuickActionType type, int iconRes, int titleRes) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(type, "");
        QuickActionUiModel quickActionUiModel = new QuickActionUiModel(type, iconRes, titleRes);
        int i2 = component4 + 3;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return quickActionUiModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickActionUiModel)) {
            int i2 = getAsAtTimestamp + 79;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        QuickActionUiModel quickActionUiModel = (QuickActionUiModel) other;
        if (this.component1 == quickActionUiModel.component1) {
            return this.copydefault == quickActionUiModel.copydefault && this.component3 == quickActionUiModel.component3;
        }
        int i4 = component4 + 99;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 59;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.component1.hashCode() * 31) + Integer.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.component3);
        int i4 = component4 + 41;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "QuickActionUiModel(type=" + this.component1 + ", iconRes=" + this.copydefault + ", titleRes=" + this.component3 + ")";
        int i2 = component4 + 15;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
