package com.huawei.digitalpayment.common.theme.viewmodel.base;

import com.huawei.digitalpayment.common.theme.data.BannerResp;
import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BannerUiState;", "Lcom/huawei/http/BaseResp;", "homeBanner", "", "Lcom/huawei/digitalpayment/common/theme/data/BannerResp;", "refreshFinish", "", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getHomeBanner", "()Ljava/util/List;", "getRefreshFinish", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BannerUiState;", "equals", "other", "", "hashCode", "", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BannerUiState extends BaseResp {
    private static int component1 = 0;
    private static int component2 = 1;
    private final List<BannerResp> homeBanner;
    private final Boolean refreshFinish;

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerUiState(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 31;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                list = CollectionsKt.emptyList();
                int i3 = 2 % 2;
            } else {
                CollectionsKt.emptyList();
                throw null;
            }
        }
        if ((i & 2) != 0) {
            int i4 = component1 + 85;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = 2 % 2;
            bool = null;
        }
        this(list, bool);
    }

    public final List<BannerResp> getHomeBanner() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<BannerResp> list = this.homeBanner;
        int i5 = i3 + 109;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return list;
    }

    public final Boolean getRefreshFinish() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Boolean bool = this.refreshFinish;
        int i5 = i3 + 89;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 55 / 0;
        }
        return bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BannerUiState(List<? extends BannerResp> list, Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        this.homeBanner = list;
        this.refreshFinish = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BannerUiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BannerUiState copy$default(BannerUiState bannerUiState, List list, Boolean bool, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 41;
        component1 = i3 % 128;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            list = bannerUiState.homeBanner;
        }
        if ((i & 2) != 0) {
            bool = bannerUiState.refreshFinish;
        }
        BannerUiState bannerUiStateCopy = bannerUiState.copy(list, bool);
        int i4 = component2 + 97;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return bannerUiStateCopy;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final List<BannerResp> component1() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<BannerResp> list = this.homeBanner;
        int i4 = i3 + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final Boolean component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.refreshFinish;
        int i5 = i2 + 85;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return bool;
    }

    public final BannerUiState copy(List<? extends BannerResp> homeBanner, Boolean refreshFinish) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(homeBanner, "");
        BannerUiState bannerUiState = new BannerUiState(homeBanner, refreshFinish);
        int i2 = component1 + 15;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return bannerUiState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerUiState)) {
            return false;
        }
        BannerUiState bannerUiState = (BannerUiState) other;
        if (!Intrinsics.areEqual(this.homeBanner, bannerUiState.homeBanner)) {
            return false;
        }
        if (Intrinsics.areEqual(this.refreshFinish, bannerUiState.refreshFinish)) {
            return true;
        }
        int i3 = component2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1 r3
  0x0028: PHI (r1v9 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]
  0x0028: PHI (r3v1 java.lang.Boolean) = (r3v0 java.lang.Boolean), (r3v5 java.lang.Boolean) binds: [B:8:0x0025, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.common.theme.viewmodel.base.BannerUiState.component2
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.huawei.digitalpayment.common.theme.viewmodel.base.BannerUiState.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1d
            java.util.List<com.huawei.digitalpayment.common.theme.data.BannerResp> r1 = r5.homeBanner
            int r1 = r1.hashCode()
            java.lang.Boolean r3 = r5.refreshFinish
            r4 = 86
            int r4 = r4 / r2
            if (r3 != 0) goto L28
            goto L35
        L1d:
            java.util.List<com.huawei.digitalpayment.common.theme.data.BannerResp> r1 = r5.homeBanner
            int r1 = r1.hashCode()
            java.lang.Boolean r3 = r5.refreshFinish
            if (r3 != 0) goto L28
            goto L35
        L28:
            int r2 = r3.hashCode()
            int r3 = com.huawei.digitalpayment.common.theme.viewmodel.base.BannerUiState.component2
            int r3 = r3 + 63
            int r4 = r3 % 128
            com.huawei.digitalpayment.common.theme.viewmodel.base.BannerUiState.component1 = r4
            int r3 = r3 % r0
        L35:
            int r1 = r1 * 31
            int r1 = r1 + r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.common.theme.viewmodel.base.BannerUiState.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BannerUiState(homeBanner=" + this.homeBanner + ", refreshFinish=" + this.refreshFinish + ")";
        int i2 = component2 + 45;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
