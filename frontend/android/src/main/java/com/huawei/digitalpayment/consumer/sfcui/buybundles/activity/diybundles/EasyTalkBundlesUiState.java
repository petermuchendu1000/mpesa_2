package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYPackage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010 \u001a\u00020!H×\u0001J\t\u0010\"\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/diybundles/EasyTalkBundlesUiState;", "", "isMonthlyBundles", "", "selectedCategory", "", "categories", "", "packages", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYPackage;", GriverMonitorConstants.KEY_IS_LOADING, "errorMessage", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)V", "()Z", "getSelectedCategory", "()Ljava/lang/String;", "getCategories", "()Ljava/util/List;", "getPackages", "getErrorMessage", "selectedPackages", "getSelectedPackages", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EasyTalkBundlesUiState {
    public static final int $stable = 8;

    public static final Companion INSTANCE;
    public static final String DEFAULT_CATEGORY = "All";
    private static int component4 = 1;
    private static int copy = 1;
    private static int equals;
    private static int getRequestBeneficiariesState;
    private final List<DIYPackage> ShareDataUIState;
    private final String component1;
    private final List<String> component2;
    private final boolean component3;
    private final boolean copydefault;
    private final String getAsAtTimestamp;

    public EasyTalkBundlesUiState(boolean z, String str, List<String> list, List<DIYPackage> list2, boolean z2, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.component3 = z;
        this.getAsAtTimestamp = str;
        this.component2 = list;
        this.ShareDataUIState = list2;
        this.copydefault = z2;
        this.component1 = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EasyTalkBundlesUiState(boolean z, String str, List list, List list2, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3 = false;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            z = false;
        }
        String str3 = null;
        if ((i & 2) != 0) {
            int i3 = getRequestBeneficiariesState + 89;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                str3.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            str = "All";
        }
        String str4 = str;
        List listEmptyList = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        List listEmptyList2 = (i & 8) != 0 ? CollectionsKt.emptyList() : list2;
        if ((i & 16) != 0) {
            int i5 = 2 % 2;
        } else {
            z3 = z2;
        }
        if ((i & 32) != 0) {
            int i6 = copy + 113;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        } else {
            str3 = str2;
        }
        this(z, str4, listEmptyList, listEmptyList2, z3, str3);
    }

    public final boolean isMonthlyBundles() {
        int i = 2 % 2;
        int i2 = copy + 59;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.component3;
        int i5 = i3 + 63;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getSelectedCategory() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 73;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getAsAtTimestamp;
        }
        throw null;
    }

    public final List<String> getCategories() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<String> list = this.component2;
        int i4 = i3 + 111;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return list;
    }

    public final List<DIYPackage> getPackages() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 79;
        getRequestBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        List<DIYPackage> list = this.ShareDataUIState;
        int i4 = i2 + 59;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 67;
        copy = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.copydefault;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return z;
    }

    public final String getErrorMessage() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 117;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.component1;
            int i4 = 84 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i2 + 3;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return str;
    }

    public final List<DIYPackage> getSelectedPackages() {
        int i = 2 % 2;
        if (!this.component3) {
            if (!StringsKt.equals(this.getAsAtTimestamp, "All", true)) {
                List<DIYPackage> list = this.ShareDataUIState;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    int i2 = getRequestBeneficiariesState + 91;
                    copy = i2 % 128;
                    int i3 = i2 % 2;
                    if (StringsKt.contains((CharSequence) ((DIYPackage) obj).getDiyCategoryName(), (CharSequence) this.getAsAtTimestamp, true)) {
                        int i4 = copy + 5;
                        getRequestBeneficiariesState = i4 % 128;
                        int i5 = i4 % 2;
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
            int i6 = copy + 121;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
        }
        return this.ShareDataUIState;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/diybundles/EasyTalkBundlesUiState$Companion;", "", "<init>", "()V", "DEFAULT_CATEGORY", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = equals + 95;
        component4 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public EasyTalkBundlesUiState() {
        this(false, null, null, null, false, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EasyTalkBundlesUiState copy$default(EasyTalkBundlesUiState easyTalkBundlesUiState, boolean z, String str, List list, List list2, boolean z2, String str2, int i, Object obj) {
        List list3;
        List list4;
        String str3;
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 35;
        getRequestBeneficiariesState = i4 % 128;
        boolean z3 = (i4 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) ? z : easyTalkBundlesUiState.component3;
        String str4 = (i & 2) != 0 ? easyTalkBundlesUiState.getAsAtTimestamp : str;
        if ((i & 4) != 0) {
            int i5 = i3 + 27;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            list3 = easyTalkBundlesUiState.component2;
        } else {
            list3 = list;
        }
        if ((i & 8) != 0) {
            list4 = easyTalkBundlesUiState.ShareDataUIState;
            int i7 = getRequestBeneficiariesState + 85;
            copy = i7 % 128;
            int i8 = i7 % 2;
        } else {
            list4 = list2;
        }
        boolean z4 = (i & 16) != 0 ? easyTalkBundlesUiState.copydefault : z2;
        if ((i & 32) != 0) {
            str3 = easyTalkBundlesUiState.component1;
            int i9 = copy + 7;
            getRequestBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str3 = str2;
        }
        EasyTalkBundlesUiState easyTalkBundlesUiStateCopy = easyTalkBundlesUiState.copy(z3, str4, list3, list4, z4, str3);
        int i11 = getRequestBeneficiariesState + 83;
        copy = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 86 / 0;
        }
        return easyTalkBundlesUiStateCopy;
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 35;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 21;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getAsAtTimestamp;
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return str;
    }

    public final List<String> component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 43;
        copy = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.component2;
        int i5 = i2 + 85;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 8 / 0;
        }
        return list;
    }

    public final List<DIYPackage> component4() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 23;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        List<DIYPackage> list = this.ShareDataUIState;
        int i5 = i2 + 61;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 51;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 15;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final EasyTalkBundlesUiState copy(boolean isMonthlyBundles, String selectedCategory, List<String> categories, List<DIYPackage> packages, boolean isLoading, String errorMessage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(selectedCategory, "");
        Intrinsics.checkNotNullParameter(categories, "");
        Intrinsics.checkNotNullParameter(packages, "");
        EasyTalkBundlesUiState easyTalkBundlesUiState = new EasyTalkBundlesUiState(isMonthlyBundles, selectedCategory, categories, packages, isLoading, errorMessage);
        int i2 = copy + 123;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return easyTalkBundlesUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 27;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof EasyTalkBundlesUiState)) {
            int i6 = i2 + 39;
            copy = i6 % 128;
            return i6 % 2 == 0;
        }
        EasyTalkBundlesUiState easyTalkBundlesUiState = (EasyTalkBundlesUiState) other;
        if (this.component3 != easyTalkBundlesUiState.component3) {
            int i7 = i4 + 41;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, easyTalkBundlesUiState.getAsAtTimestamp)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, easyTalkBundlesUiState.component2)) {
            int i9 = copy + 69;
            getRequestBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, easyTalkBundlesUiState.ShareDataUIState)) {
            int i11 = getRequestBeneficiariesState + 15;
            copy = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (this.copydefault != easyTalkBundlesUiState.copydefault) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, easyTalkBundlesUiState.component1)) {
            int i13 = copy + 45;
            getRequestBeneficiariesState = i13 % 128;
            return i13 % 2 != 0;
        }
        int i14 = getRequestBeneficiariesState + 81;
        copy = i14 % 128;
        if (i14 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = Boolean.hashCode(this.component3);
        int iHashCode2 = this.getAsAtTimestamp.hashCode();
        int iHashCode3 = this.component2.hashCode();
        int iHashCode4 = this.ShareDataUIState.hashCode();
        int iHashCode5 = Boolean.hashCode(this.copydefault);
        String str = this.component1;
        if (str == null) {
            int i3 = copy + 39;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode6 = str.hashCode();
            int i5 = getRequestBeneficiariesState + 23;
            copy = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode6;
        }
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EasyTalkBundlesUiState(isMonthlyBundles=" + this.component3 + ", selectedCategory=" + this.getAsAtTimestamp + ", categories=" + this.component2 + ", packages=" + this.ShareDataUIState + ", isLoading=" + this.copydefault + ", errorMessage=" + this.component1 + ")";
        int i2 = copy + 69;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
