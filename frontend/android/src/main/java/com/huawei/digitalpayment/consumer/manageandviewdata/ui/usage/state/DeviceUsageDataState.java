package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.state;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.AppUsage;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.Usage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010'\u001a\u00020\u0003HÆ\u0003Jv\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÇ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010,\u001a\u00020\u000fH×\u0001J\t\u0010-\u001a\u00020\u000bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0014¨\u0006."}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/state/DeviceUsageDataState;", "", "permissionEnabled", "", GriverMonitorConstants.KEY_IS_LOADING, "usageList", "", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/Usage;", "appUsageList", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/AppUsage;", "totalUsageText", "", "startDateText", "endDateText", "selectionPosition", "", "isEmpty", "<init>", "(ZZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getPermissionEnabled", "()Z", "getUsageList", "()Ljava/util/List;", "getAppUsageList", "getTotalUsageText", "()Ljava/lang/String;", "getStartDateText", "getEndDateText", "getSelectionPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/state/DeviceUsageDataState;", "equals", "other", "hashCode", "toString", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceUsageDataState {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 1;
    private static int getAsAtTimestamp = 0;
    private static int hashCode = 1;
    private static int toString;
    private final boolean ShareDataUIState;
    private final List<AppUsage> component1;
    private final String component2;
    private final boolean component3;
    private final Integer component4;
    private final String copy;
    private final boolean copydefault;
    private final List<Usage> equals;
    private final String getRequestBeneficiariesState;

    public DeviceUsageDataState(boolean z, boolean z2, List<Usage> list, List<AppUsage> list2, String str, String str2, String str3, Integer num, boolean z3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ShareDataUIState = z;
        this.component3 = z2;
        this.equals = list;
        this.component1 = list2;
        this.getRequestBeneficiariesState = str;
        this.copy = str2;
        this.component2 = str3;
        this.component4 = num;
        this.copydefault = z3;
    }

    public final boolean getPermissionEnabled() {
        int i = 2 % 2;
        int i2 = toString + 75;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 3;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 47;
        toString = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component3;
        int i5 = i2 + 31;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DeviceUsageDataState(boolean z, boolean z2, List list, List list2, String str, String str2, String str3, Integer num, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List listEmptyList;
        String str4;
        String str5;
        boolean z4 = false;
        boolean z5 = (i & 1) != 0 ? false : z;
        boolean z6 = (i & 2) != 0 ? false : z2;
        List listEmptyList2 = (i & 4) != 0 ? CollectionsKt.emptyList() : list;
        Integer num2 = null;
        if ((i & 8) != 0) {
            int i2 = hashCode + 65;
            toString = i2 % 128;
            if (i2 % 2 != 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            listEmptyList = CollectionsKt.emptyList();
        } else {
            listEmptyList = list2;
        }
        String str6 = "";
        if ((i & 16) != 0) {
            int i3 = hashCode + 7;
            toString = i3 % 128;
            if (i3 % 2 != 0) {
                num2.hashCode();
                throw null;
            }
            str4 = "";
        } else {
            str4 = str;
        }
        if ((i & 32) != 0) {
            int i4 = hashCode + 79;
            toString = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str5 = "";
        } else {
            str5 = str2;
        }
        if ((i & 64) != 0) {
            int i7 = hashCode + 37;
            toString = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        } else {
            str6 = str3;
        }
        if ((i & 128) != 0) {
            int i8 = hashCode + 123;
            toString = i8 % 128;
            if (i8 % 2 != 0) {
                num2.hashCode();
                throw null;
            }
        } else {
            num2 = num;
        }
        if ((i & 256) != 0) {
            int i9 = 2 % 2;
        } else {
            z4 = z3;
        }
        this(z5, z6, listEmptyList2, listEmptyList, str4, str5, str6, num2, z4);
    }

    public final List<Usage> getUsageList() {
        int i = 2 % 2;
        int i2 = hashCode + 13;
        toString = i2 % 128;
        int i3 = i2 % 2;
        List<Usage> list = this.equals;
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        return list;
    }

    public final List<AppUsage> getAppUsageList() {
        int i = 2 % 2;
        int i2 = toString + 67;
        int i3 = i2 % 128;
        hashCode = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<AppUsage> list = this.component1;
        int i4 = i3 + 17;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String getTotalUsageText() {
        int i = 2 % 2;
        int i2 = toString + 71;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    public final String getStartDateText() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 45;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.copy;
        int i4 = i2 + 99;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getEndDateText() {
        int i = 2 % 2;
        int i2 = toString + 19;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getSelectionPosition() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 55;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.component4;
        int i5 = i2 + 59;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final boolean isEmpty() {
        int i = 2 % 2;
        int i2 = hashCode + 89;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    static {
        int i = 1 + 33;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    public DeviceUsageDataState() {
        this(false, false, null, null, null, null, null, null, false, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DeviceUsageDataState copy$default(DeviceUsageDataState deviceUsageDataState, boolean z, boolean z2, List list, List list2, String str, String str2, String str3, Integer num, boolean z3, int i, Object obj) {
        boolean z4;
        List list3;
        String str4;
        Integer num2;
        boolean z5;
        int i2 = 2 % 2;
        int i3 = toString;
        int i4 = i3 + 123;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            z4 = deviceUsageDataState.ShareDataUIState;
            int i6 = i3 + 9;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
        } else {
            z4 = z;
        }
        boolean z6 = (i & 2) != 0 ? deviceUsageDataState.component3 : z2;
        if ((i & 4) != 0) {
            int i8 = i3 + 39;
            hashCode = i8 % 128;
            int i9 = i8 % 2;
            list3 = deviceUsageDataState.equals;
        } else {
            list3 = list;
        }
        List list4 = (i & 8) != 0 ? deviceUsageDataState.component1 : list2;
        String str5 = (i & 16) != 0 ? deviceUsageDataState.getRequestBeneficiariesState : str;
        if ((i & 32) != 0) {
            int i10 = hashCode + 11;
            toString = i10 % 128;
            if (i10 % 2 != 0) {
                String str6 = deviceUsageDataState.copy;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str4 = deviceUsageDataState.copy;
        } else {
            str4 = str2;
        }
        String str7 = (i & 64) != 0 ? deviceUsageDataState.component2 : str3;
        if ((i & 128) != 0) {
            int i11 = hashCode + 119;
            toString = i11 % 128;
            int i12 = i11 % 2;
            num2 = deviceUsageDataState.component4;
        } else {
            num2 = num;
        }
        if ((i & 256) != 0) {
            z5 = deviceUsageDataState.copydefault;
            int i13 = hashCode + 63;
            toString = i13 % 128;
            int i14 = i13 % 2;
        } else {
            z5 = z3;
        }
        return deviceUsageDataState.copy(z4, z6, list3, list4, str5, str4, str7, num2, z5);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = toString + 123;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 25;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 87;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        boolean z = this.component3;
        int i4 = i2 + 45;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final List<Usage> component3() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 37;
        toString = i3 % 128;
        int i4 = i3 % 2;
        List<Usage> list = this.equals;
        int i5 = i2 + 91;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<AppUsage> component4() {
        int i = 2 % 2;
        int i2 = toString + 31;
        int i3 = i2 % 128;
        hashCode = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<AppUsage> list = this.component1;
        int i4 = i3 + 3;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = hashCode + 17;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.getRequestBeneficiariesState;
        int i4 = i3 + 115;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = hashCode + 7;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = hashCode + 93;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 27;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return str;
    }

    public final Integer component8() {
        int i = 2 % 2;
        int i2 = toString + 119;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component9() {
        int i = 2 % 2;
        int i2 = hashCode + 109;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DeviceUsageDataState copy(boolean permissionEnabled, boolean isLoading, List<Usage> usageList, List<AppUsage> appUsageList, String totalUsageText, String startDateText, String endDateText, Integer selectionPosition, boolean isEmpty) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(usageList, "");
        Intrinsics.checkNotNullParameter(appUsageList, "");
        Intrinsics.checkNotNullParameter(totalUsageText, "");
        Intrinsics.checkNotNullParameter(startDateText, "");
        Intrinsics.checkNotNullParameter(endDateText, "");
        DeviceUsageDataState deviceUsageDataState = new DeviceUsageDataState(permissionEnabled, isLoading, usageList, appUsageList, totalUsageText, startDateText, endDateText, selectionPosition, isEmpty);
        int i2 = hashCode + 115;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return deviceUsageDataState;
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
        if (!(other instanceof DeviceUsageDataState)) {
            int i2 = hashCode + 17;
            toString = i2 % 128;
            return i2 % 2 != 0;
        }
        DeviceUsageDataState deviceUsageDataState = (DeviceUsageDataState) other;
        if (this.ShareDataUIState != deviceUsageDataState.ShareDataUIState || this.component3 != deviceUsageDataState.component3 || !Intrinsics.areEqual(this.equals, deviceUsageDataState.equals) || !Intrinsics.areEqual(this.component1, deviceUsageDataState.component1) || !Intrinsics.areEqual(this.getRequestBeneficiariesState, deviceUsageDataState.getRequestBeneficiariesState) || !Intrinsics.areEqual(this.copy, deviceUsageDataState.copy)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, deviceUsageDataState.component2)) {
            int i3 = toString + 57;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component4, deviceUsageDataState.component4)) {
            return this.copydefault == deviceUsageDataState.copydefault;
        }
        int i5 = toString + 47;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = Boolean.hashCode(this.ShareDataUIState);
        int iHashCode3 = Boolean.hashCode(this.component3);
        int iHashCode4 = this.equals.hashCode();
        int iHashCode5 = this.component1.hashCode();
        int iHashCode6 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode7 = this.copy.hashCode();
        int iHashCode8 = this.component2.hashCode();
        Integer num = this.component4;
        if (num == null) {
            int i2 = toString + 27;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int iHashCode9 = (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31) + Boolean.hashCode(this.copydefault);
        int i4 = toString + 75;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DeviceUsageDataState(permissionEnabled=" + this.ShareDataUIState + ", isLoading=" + this.component3 + ", usageList=" + this.equals + ", appUsageList=" + this.component1 + ", totalUsageText=" + this.getRequestBeneficiariesState + ", startDateText=" + this.copy + ", endDateText=" + this.component2 + ", selectionPosition=" + this.component4 + ", isEmpty=" + this.copydefault + ")";
        int i2 = hashCode + 119;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
        return str;
    }
}
