package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import com.huawei.digitalpayment.consumer.base.resp.SettingsBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/ProfileUiState;", "", "quickActions", "", "Lcom/huawei/digitalpayment/consumer/base/resp/SettingsBean;", "quickCares", "accountSettings", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getQuickActions", "()Ljava/util/List;", "getQuickCares", "getAccountSettings", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProfileUiState {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int component4 = 1;
    private static int equals;
    private final List<SettingsBean> ShareDataUIState;
    private final List<SettingsBean> component2;
    private final List<SettingsBean> copydefault;

    public ProfileUiState(List<SettingsBean> list, List<SettingsBean> list2, List<SettingsBean> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.component2 = list;
        this.copydefault = list2;
        this.ShareDataUIState = list3;
    }

    public ProfileUiState(List list, List list2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        list = (i & 1) != 0 ? new ArrayList() : list;
        if ((i & 2) != 0) {
            list2 = new ArrayList();
            int i2 = equals + 97;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        this(list, list2, (i & 4) != 0 ? new ArrayList() : arrayList);
    }

    public final List<SettingsBean> getQuickActions() {
        List<SettingsBean> list;
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 109;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.component2;
            int i4 = 98 / 0;
        } else {
            list = this.component2;
        }
        int i5 = i2 + 101;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<SettingsBean> getQuickCares() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 3;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<SettingsBean> list = this.copydefault;
        int i5 = i2 + 15;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<SettingsBean> getAccountSettings() {
        int i = 2 % 2;
        int i2 = component4 + 113;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    static {
        int i = 1 + 15;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public ProfileUiState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ProfileUiState copy$default(ProfileUiState profileUiState, List list, List list2, List list3, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = component4 + 91;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                List<SettingsBean> list4 = profileUiState.component2;
                obj2.hashCode();
                throw null;
            }
            list = profileUiState.component2;
        }
        if ((i & 2) != 0) {
            int i4 = equals + 87;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                list2 = profileUiState.copydefault;
                int i5 = 84 / 0;
            } else {
                list2 = profileUiState.copydefault;
            }
        }
        if ((i & 4) != 0) {
            int i6 = equals + 45;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            list3 = profileUiState.ShareDataUIState;
        }
        ProfileUiState profileUiStateCopy = profileUiState.copy(list, list2, list3);
        int i8 = equals + 83;
        component4 = i8 % 128;
        if (i8 % 2 != 0) {
            return profileUiStateCopy;
        }
        throw null;
    }

    public final List<SettingsBean> component1() {
        int i = 2 % 2;
        int i2 = component4 + 59;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<SettingsBean> list = this.component2;
        int i4 = i3 + 7;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final List<SettingsBean> component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 35;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        List<SettingsBean> list = this.copydefault;
        int i5 = i2 + 109;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return list;
    }

    public final List<SettingsBean> component3() {
        int i = 2 % 2;
        int i2 = equals + 1;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ProfileUiState copy(List<SettingsBean> quickActions, List<SettingsBean> quickCares, List<SettingsBean> accountSettings) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quickActions, "");
        Intrinsics.checkNotNullParameter(quickCares, "");
        Intrinsics.checkNotNullParameter(accountSettings, "");
        ProfileUiState profileUiState = new ProfileUiState(quickActions, quickCares, accountSettings);
        int i2 = component4 + 17;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return profileUiState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = equals + 13;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 13;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof ProfileUiState)) {
            int i7 = i3 + 107;
            equals = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        ProfileUiState profileUiState = (ProfileUiState) other;
        if (!Intrinsics.areEqual(this.component2, profileUiState.component2)) {
            int i9 = component4 + 115;
            equals = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, profileUiState.copydefault)) {
            return Intrinsics.areEqual(this.ShareDataUIState, profileUiState.ShareDataUIState);
        }
        int i11 = component4 + 109;
        equals = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 97;
        component4 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.component2.hashCode() * 68) / this.copydefault.hashCode()) << 11) * this.ShareDataUIState.hashCode() : (((this.component2.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.ShareDataUIState.hashCode();
        int i3 = equals + 31;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ProfileUiState(quickActions=" + this.component2 + ", quickCares=" + this.copydefault + ", accountSettings=" + this.ShareDataUIState + ")";
        int i2 = equals + 47;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
