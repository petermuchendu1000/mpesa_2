package com.huawei.digitalpayment.common.theme.viewmodel.base;

import com.huawei.digitalpayment.common.theme.data.TipsResp;
import com.huawei.http.BaseResp;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ*\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/base/TipsUiState;", "Lcom/huawei/http/BaseResp;", "tips", "", "Lcom/huawei/digitalpayment/common/theme/data/TipsResp;", "refreshFinish", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getTips", "()Ljava/util/List;", "setTips", "(Ljava/util/List;)V", "getRefreshFinish", "()Ljava/lang/Boolean;", "setRefreshFinish", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/common/theme/viewmodel/base/TipsUiState;", "equals", "other", "", "hashCode", "", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TipsUiState extends BaseResp {
    private static int component2 = 1;
    private static int component3;
    private Boolean refreshFinish;
    private List<? extends TipsResp> tips;

    /* JADX WARN: Illegal instructions before constructor call */
    public TipsUiState(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component3 + 97;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            list = Collections.emptyList();
            int i4 = component3 + 111;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            int i6 = component2 + 119;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            bool = null;
        }
        this(list, bool);
    }

    public final List<TipsResp> getTips() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List list = this.tips;
        int i4 = i3 + 63;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return list;
    }

    public final void setTips(List<? extends TipsResp> list) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            this.tips = list;
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            this.tips = list;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final Boolean getRefreshFinish() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.refreshFinish;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRefreshFinish(Boolean bool) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.refreshFinish = bool;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 17;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public TipsUiState(List<? extends TipsResp> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        this.tips = list;
        this.refreshFinish = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TipsUiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TipsUiState copy$default(TipsUiState tipsUiState, List list, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 67;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                List<? extends TipsResp> list2 = tipsUiState.tips;
                throw null;
            }
            list = tipsUiState.tips;
        }
        if ((i & 2) != 0) {
            int i7 = component2 + 121;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                bool = tipsUiState.refreshFinish;
                int i8 = 33 / 0;
            } else {
                bool = tipsUiState.refreshFinish;
            }
        }
        return tipsUiState.copy(list, bool);
    }

    public final List<TipsResp> component1() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        List list = this.tips;
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return list;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.refreshFinish;
        int i5 = i3 + 9;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return bool;
    }

    public final TipsUiState copy(List<? extends TipsResp> tips, Boolean refreshFinish) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tips, "");
        TipsUiState tipsUiState = new TipsUiState(tips, refreshFinish);
        int i2 = component3 + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return tipsUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 47;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipsUiState)) {
            int i5 = i2 + 81;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        TipsUiState tipsUiState = (TipsUiState) other;
        if (!Intrinsics.areEqual(this.tips, tipsUiState.tips)) {
            return false;
        }
        if (Intrinsics.areEqual(this.refreshFinish, tipsUiState.refreshFinish)) {
            return true;
        }
        int i7 = component2 + 13;
        component3 = i7 % 128;
        if (i7 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.tips.hashCode();
        Boolean bool = this.refreshFinish;
        if (bool == null) {
            int i2 = component2 + 101;
            component3 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = bool.hashCode();
        }
        int i3 = (iHashCode2 * 31) + iHashCode;
        int i4 = component3 + 87;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TipsUiState(tips=" + this.tips + ", refreshFinish=" + this.refreshFinish + ")";
        int i2 = component3 + 89;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
        }
        return str;
    }
}
