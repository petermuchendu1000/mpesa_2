package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.domore;

import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen;
import com.iap.ac.android.acs.operation.log.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0005H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/domore/BillManagerDoMoreUiModel;", "", "title", "", "iconRes", "", LogConstants.Mpm.Interceptor.ACTION, "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen;", "<init>", "(Ljava/lang/String;ILcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen;)V", "getTitle", "()Ljava/lang/String;", "getIconRes", "()I", "getAction", "()Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BillManagerDoMoreUiModel {
    public static final int $stable = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int component4 = 1;
    private static int getAsAtTimestamp;
    private final String ShareDataUIState;
    private final BillManagerScreen component2;
    private final int copydefault;

    public BillManagerDoMoreUiModel(String str, int i, BillManagerScreen billManagerScreen) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(billManagerScreen, "");
        this.ShareDataUIState = str;
        this.copydefault = i;
        this.component2 = billManagerScreen;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 105;
        getAsAtTimestamp = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 57;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final int getIconRes() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 3;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.copydefault;
        int i5 = i2 + 95;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final BillManagerScreen getAction() {
        int i = 2 % 2;
        int i2 = component4 + 65;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        BillManagerScreen billManagerScreen = this.component2;
        int i5 = i3 + 25;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return billManagerScreen;
    }

    static {
        int i = 1 + 57;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static BillManagerDoMoreUiModel copy$default(BillManagerDoMoreUiModel billManagerDoMoreUiModel, String str, int i, BillManagerScreen billManagerScreen, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            str = billManagerDoMoreUiModel.ShareDataUIState;
        }
        if ((i2 & 2) != 0) {
            i = billManagerDoMoreUiModel.copydefault;
        }
        if ((i2 & 4) != 0) {
            billManagerScreen = billManagerDoMoreUiModel.component2;
            int i4 = component4 + 29;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 2;
            }
        }
        BillManagerDoMoreUiModel billManagerDoMoreUiModelCopy = billManagerDoMoreUiModel.copy(str, i, billManagerScreen);
        int i6 = getAsAtTimestamp + 59;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return billManagerDoMoreUiModelCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 5;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 123;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component4 + 113;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        int i5 = this.copydefault;
        int i6 = i3 + 3;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final BillManagerScreen component3() {
        int i = 2 % 2;
        int i2 = component4 + 121;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        BillManagerScreen billManagerScreen = this.component2;
        int i5 = i3 + 49;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return billManagerScreen;
    }

    public final BillManagerDoMoreUiModel copy(String title, int iconRes, BillManagerScreen action) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(action, "");
        BillManagerDoMoreUiModel billManagerDoMoreUiModel = new BillManagerDoMoreUiModel(title, iconRes, action);
        int i2 = component4 + 45;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return billManagerDoMoreUiModel;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 77;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillManagerDoMoreUiModel)) {
            int i5 = i2 + 71;
            getAsAtTimestamp = i5 % 128;
            return i5 % 2 != 0;
        }
        BillManagerDoMoreUiModel billManagerDoMoreUiModel = (BillManagerDoMoreUiModel) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, billManagerDoMoreUiModel.ShareDataUIState)) {
            return false;
        }
        if (this.copydefault == billManagerDoMoreUiModel.copydefault) {
            return Intrinsics.areEqual(this.component2, billManagerDoMoreUiModel.component2);
        }
        int i6 = component4 + 31;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 81;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.ShareDataUIState.hashCode();
        return i3 == 0 ? (((iHashCode % 60) % Integer.hashCode(this.copydefault)) * 78) >>> this.component2.hashCode() : (((iHashCode * 31) + Integer.hashCode(this.copydefault)) * 31) + this.component2.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BillManagerDoMoreUiModel(title=" + this.ShareDataUIState + ", iconRes=" + this.copydefault + ", action=" + this.component2 + ")";
        int i2 = component4 + 21;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
