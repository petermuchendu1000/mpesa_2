package com.huawei.digitalpayment.home.data.source.remote;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.sort.Order;
import com.huawei.digitalpayment.home.data.source.locaL.TimeRange;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BK\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J[\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006*"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/remote/RemoteHomeTips;", "Lcom/huawei/digitalpayment/consumer/baselib/util/sort/Order;", "Lcom/huawei/digitalpayment/home/data/source/locaL/TimeRange;", "Lcom/huawei/http/BaseResp;", "bulletin", "", "showSeconds", "icon", "order", "", "startTime", "endTime", KeysConstants.KEY_EXECUTE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBulletin", "()Ljava/lang/String;", "getShowSeconds", "getIcon", "getOrder", "()I", "getStartTime", "getEndTime", "getExecute", "getSortOrder", "()Ljava/lang/Integer;", "timeStart", "timeEnd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteHomeTips extends BaseResp implements Order, TimeRange {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final String bulletin;
    private final String endTime;
    private final String execute;
    private final String icon;
    private final int order;
    private final String showSeconds;
    private final String startTime;

    public final String getBulletin() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 97;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bulletin;
        int i5 = i2 + 39;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getShowSeconds() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 111;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.showSeconds;
        int i4 = i2 + 29;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return str;
    }

    public final String getIcon() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.icon;
        int i4 = i2 + 85;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return str;
    }

    public final int getOrder() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 97;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.order;
        int i6 = i2 + 123;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getStartTime() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.startTime;
        int i4 = i2 + 89;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getEndTime() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.endTime;
        int i5 = i3 + 87;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 21;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
        return str;
    }

    public RemoteHomeTips(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        this.bulletin = str;
        this.showSeconds = str2;
        this.icon = str3;
        this.order = i;
        this.startTime = str4;
        this.endTime = str5;
        this.execute = str6;
    }

    @Override
    public Integer getSortOrder() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Integer.valueOf(this.order);
            throw null;
        }
        Integer numValueOf = Integer.valueOf(this.order);
        int i3 = copydefault + 53;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 28 / 0;
        }
        return numValueOf;
    }

    @Override
    public String timeStart() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.startTime;
        int i4 = i2 + 41;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    @Override
    public String timeEnd() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.endTime;
            int i4 = 97 / 0;
        } else {
            str = this.endTime;
        }
        int i5 = i2 + 3;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static RemoteHomeTips copy$default(RemoteHomeTips remoteHomeTips, String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, Object obj) {
        String str7;
        int i3 = 2 % 2;
        int i4 = component2 + 5;
        int i5 = i4 % 128;
        copydefault = i5;
        String str8 = (i4 % 2 != 0 ? (i2 & 1) == 0 : (i2 & 1) == 0) ? str : remoteHomeTips.bulletin;
        String str9 = (i2 & 2) != 0 ? remoteHomeTips.showSeconds : str2;
        String str10 = (i2 & 4) != 0 ? remoteHomeTips.icon : str3;
        int i6 = (i2 & 8) != 0 ? remoteHomeTips.order : i;
        if ((i2 & 16) != 0) {
            int i7 = i5 + 61;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str7 = remoteHomeTips.startTime;
        } else {
            str7 = str4;
        }
        RemoteHomeTips remoteHomeTipsCopy = remoteHomeTips.copy(str8, str9, str10, i6, str7, (i2 & 32) != 0 ? remoteHomeTips.endTime : str5, (i2 & 64) != 0 ? remoteHomeTips.execute : str6);
        int i9 = component2 + 31;
        copydefault = i9 % 128;
        int i10 = i9 % 2;
        return remoteHomeTipsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bulletin;
        int i5 = i2 + 91;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 89;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.showSeconds;
        int i5 = i3 + 47;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.icon;
        int i5 = i2 + 97;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.order;
        int i6 = i3 + 19;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 25 / 0;
        }
        return i5;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.startTime;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.endTime;
        int i5 = i2 + 65;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.execute;
        }
        throw null;
    }

    public final RemoteHomeTips copy(String bulletin, String showSeconds, String icon, int order, String startTime, String endTime, String execute) {
        int i = 2 % 2;
        RemoteHomeTips remoteHomeTips = new RemoteHomeTips(bulletin, showSeconds, icon, order, startTime, endTime, execute);
        int i2 = copydefault + 3;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
        }
        return remoteHomeTips;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteHomeTips)) {
            int i2 = component2 + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        RemoteHomeTips remoteHomeTips = (RemoteHomeTips) other;
        if (!Intrinsics.areEqual(this.bulletin, remoteHomeTips.bulletin)) {
            int i4 = component2 + 79;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.showSeconds, remoteHomeTips.showSeconds)) {
            int i5 = component2 + 37;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.icon, remoteHomeTips.icon) || this.order != remoteHomeTips.order) {
            return false;
        }
        if (!Intrinsics.areEqual(this.startTime, remoteHomeTips.startTime)) {
            int i7 = copydefault + 123;
            component2 = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.endTime, remoteHomeTips.endTime)) {
            int i8 = component2 + 61;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.execute, remoteHomeTips.execute)) {
            return true;
        }
        int i10 = component2 + 91;
        copydefault = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.bulletin;
        int iHashCode4 = 0;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.showSeconds;
        if (str2 == null) {
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i2 = component2 + 105;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        }
        String str3 = this.icon;
        if (str3 == null) {
            int i4 = component2 + 7;
            int i5 = i4 % 128;
            copydefault = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 27;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        int iHashCode6 = Integer.hashCode(this.order);
        String str4 = this.startTime;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.endTime;
        if (str5 == null) {
            int i9 = component2 + 107;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str5.hashCode();
        }
        String str6 = this.execute;
        if (str6 != null) {
            iHashCode4 = str6.hashCode();
            int i11 = component2 + 9;
            copydefault = i11 % 128;
            int i12 = i11 % 2;
        }
        return (((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteHomeTips(bulletin=" + this.bulletin + ", showSeconds=" + this.showSeconds + ", icon=" + this.icon + ", order=" + this.order + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", execute=" + this.execute + ")";
        int i2 = component2 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
