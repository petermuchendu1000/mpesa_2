package com.huawei.digitalpayment.home.ui.uistate;

import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeTips;
import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/home/ui/uistate/HomeTipsUiState;", "Lcom/huawei/http/BaseResp;", "tips", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeTips;", "refreshFinish", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getTips", "()Ljava/util/List;", "getRefreshFinish", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/home/ui/uistate/HomeTipsUiState;", "equals", "other", "", "hashCode", "", "toString", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeTipsUiState extends BaseResp {
    private static int component2 = 1;
    private static int component3;
    private final Boolean refreshFinish;
    private final List<LocalHomeTips> tips;

    /* JADX WARN: Illegal instructions before constructor call */
    public HomeTipsUiState(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = component2 + 45;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                CollectionsKt.emptyList();
                obj.hashCode();
                throw null;
            }
            list = CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            int i3 = component3;
            int i4 = i3 + 19;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 59;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            bool = null;
        }
        this(list, bool);
    }

    public final List<LocalHomeTips> getTips() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tips;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean getRefreshFinish() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Boolean bool = this.refreshFinish;
        int i4 = i3 + 29;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return bool;
    }

    public HomeTipsUiState(List<LocalHomeTips> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        this.tips = list;
        this.refreshFinish = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeTipsUiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HomeTipsUiState copy$default(HomeTipsUiState homeTipsUiState, List list, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 7;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            list = homeTipsUiState.tips;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i6 = i3 + 117;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                Boolean bool2 = homeTipsUiState.refreshFinish;
                obj2.hashCode();
                throw null;
            }
            bool = homeTipsUiState.refreshFinish;
        }
        HomeTipsUiState homeTipsUiStateCopy = homeTipsUiState.copy(list, bool);
        int i7 = component3 + 69;
        component2 = i7 % 128;
        if (i7 % 2 != 0) {
            return homeTipsUiStateCopy;
        }
        obj2.hashCode();
        throw null;
    }

    public final List<LocalHomeTips> component1() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<LocalHomeTips> list = this.tips;
        int i5 = i3 + 37;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.refreshFinish;
        int i5 = i2 + 113;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final HomeTipsUiState copy(List<LocalHomeTips> tips, Boolean refreshFinish) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tips, "");
        HomeTipsUiState homeTipsUiState = new HomeTipsUiState(tips, refreshFinish);
        int i2 = component2 + 49;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return homeTipsUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 35;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }
        if (!(other instanceof HomeTipsUiState)) {
            return false;
        }
        HomeTipsUiState homeTipsUiState = (HomeTipsUiState) other;
        if (!Intrinsics.areEqual(this.tips, homeTipsUiState.tips)) {
            return false;
        }
        if (Intrinsics.areEqual(this.refreshFinish, homeTipsUiState.refreshFinish)) {
            return true;
        }
        int i5 = component2 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            this.tips.hashCode();
            throw null;
        }
        int iHashCode2 = this.tips.hashCode();
        Boolean bool = this.refreshFinish;
        if (bool == null) {
            int i3 = component2 + 67;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = bool.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeTipsUiState(tips=" + this.tips + ", refreshFinish=" + this.refreshFinish + ")";
        int i2 = component3 + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
