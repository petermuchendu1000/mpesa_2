package com.huawei.digitalpayment.home.ui.uistate;

import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/home/ui/uistate/BannerUiState;", "", "homeBanner", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "refreshFinish", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getHomeBanner", "()Ljava/util/List;", "getRefreshFinish", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/home/ui/uistate/BannerUiState;", "equals", "other", "hashCode", "", "toString", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BannerUiState {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final List<LocalHomeFunction> component3;
    private final Boolean copydefault;

    public BannerUiState(List<LocalHomeFunction> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        this.component3 = list;
        this.copydefault = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerUiState(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 23;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                list = CollectionsKt.emptyList();
                int i3 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        if ((i & 2) != 0) {
            int i4 = component1 + 99;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = 2 % 2;
            bool = null;
        }
        this(list, bool);
    }

    public final List<LocalHomeFunction> getHomeBanner() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final Boolean getRefreshFinish() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Boolean bool = this.copydefault;
        int i5 = i3 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BannerUiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BannerUiState copy$default(BannerUiState bannerUiState, List list, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            list = bannerUiState.component3;
        }
        if ((i & 2) != 0) {
            int i3 = component1 + 71;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            bool = bannerUiState.copydefault;
        }
        BannerUiState bannerUiStateCopy = bannerUiState.copy(list, bool);
        int i5 = ShareDataUIState + 17;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return bannerUiStateCopy;
    }

    public final List<LocalHomeFunction> component1() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<LocalHomeFunction> list = this.component3;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BannerUiState copy(List<LocalHomeFunction> homeBanner, Boolean refreshFinish) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(homeBanner, "");
        BannerUiState bannerUiState = new BannerUiState(homeBanner, refreshFinish);
        int i2 = component1 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return bannerUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 17;
            ShareDataUIState = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!(other instanceof BannerUiState)) {
            int i3 = component1 + 19;
            ShareDataUIState = i3 % 128;
            return i3 % 2 != 0;
        }
        BannerUiState bannerUiState = (BannerUiState) other;
        if (!Intrinsics.areEqual(this.component3, bannerUiState.component3)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, bannerUiState.copydefault)) {
            int i4 = component1 + 101;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = ShareDataUIState + 7;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component3.hashCode();
        Boolean bool = this.copydefault;
        int iHashCode2 = (iHashCode * 31) + (bool == null ? 0 : bool.hashCode());
        int i4 = ShareDataUIState + 123;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BannerUiState(homeBanner=" + this.component3 + ", refreshFinish=" + this.copydefault + ")";
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
