package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel;

import com.huawei.digitalpayment.consumer.sfcui.api.FavouriteBundlesService;
import com.huawei.digitalpayment.consumer.sfcui.components.bundles.BundleMenu;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BundlesHomeUIState;", "", FavouriteBundlesService.BUNDLES_PARAM, "", "Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/BundleMenu;", "shareData", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getBundles", "()Ljava/util/List;", "getShareData", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BundlesHomeUIState {
    public static final int $stable = 8;
    private static int ShareDataUIState = 21 % 128;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int getAsAtTimestamp = 1;
    private final List<BundleMenu> component1;
    private final List<BundleMenu> copydefault;

    public BundlesHomeUIState(List<BundleMenu> list, List<BundleMenu> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.component1 = list;
        this.copydefault = list2;
    }

    public final List<BundleMenu> getBundles() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 103;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<BundleMenu> list = this.component1;
        int i5 = i2 + 109;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public BundlesHomeUIState(java.util.List r46, java.util.List r47, int r48, kotlin.jvm.internal.DefaultConstructorMarker r49) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BundlesHomeUIState.<init>(java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<BundleMenu> getShareData() {
        List<BundleMenu> list;
        int i = 2 % 2;
        int i2 = component2 + 75;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        if (i2 % 2 == 0) {
            list = this.copydefault;
            int i4 = 36 / 0;
        } else {
            list = this.copydefault;
        }
        int i5 = i3 + 97;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        if (21 % 2 == 0) {
            int i = 39 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BundlesHomeUIState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BundlesHomeUIState copy$default(BundlesHomeUIState bundlesHomeUIState, List list, List list2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp;
        int i4 = i3 + 39;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 41;
            int i7 = i6 % 128;
            component2 = i7;
            if (i6 % 2 != 0) {
                List<BundleMenu> list3 = bundlesHomeUIState.component1;
                throw null;
            }
            List<BundleMenu> list4 = bundlesHomeUIState.component1;
            int i8 = i7 + 19;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
            list = list4;
        }
        if ((i & 2) != 0) {
            int i10 = getAsAtTimestamp + 19;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            list2 = bundlesHomeUIState.copydefault;
        }
        return bundlesHomeUIState.copy(list, list2);
    }

    public final List<BundleMenu> component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 73;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        List<BundleMenu> list = this.component1;
        int i5 = i2 + 73;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<BundleMenu> component2() {
        List<BundleMenu> list;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.copydefault;
            int i4 = 92 / 0;
        } else {
            list = this.copydefault;
        }
        int i5 = i2 + 125;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final BundlesHomeUIState copy(List<BundleMenu> bundles, List<BundleMenu> shareData) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bundles, "");
        Intrinsics.checkNotNullParameter(shareData, "");
        BundlesHomeUIState bundlesHomeUIState = new BundlesHomeUIState(bundles, shareData);
        int i2 = component2 + 47;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return bundlesHomeUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 11;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof BundlesHomeUIState)) {
            return false;
        }
        BundlesHomeUIState bundlesHomeUIState = (BundlesHomeUIState) other;
        if (!Intrinsics.areEqual(this.component1, bundlesHomeUIState.component1)) {
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, bundlesHomeUIState.copydefault)) {
            int i4 = getAsAtTimestamp + 95;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = getAsAtTimestamp + 11;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component1.hashCode();
        return i3 == 0 ? (iHashCode * 93) << this.copydefault.hashCode() : (iHashCode * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BundlesHomeUIState(bundles=" + this.component1 + ", shareData=" + this.copydefault + ")";
        int i2 = component2 + 15;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
