package com.huawei.digitalpayment.home.data.source.remote;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.sort.Order;
import com.huawei.digitalpayment.home.data.source.locaL.TimeRange;
import com.huawei.http.BaseResp;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BC\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0016J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JS\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/remote/RemoteBanner;", "Lcom/huawei/http/BaseResp;", "Lcom/huawei/digitalpayment/consumer/baselib/util/sort/Order;", "Lcom/huawei/digitalpayment/home/data/source/locaL/TimeRange;", CdpConstants.CONTENT_IMAGE_URL, "", "showSeconds", "reportTag", "startTime", "endTime", KeysConstants.KEY_EXECUTE, "order", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getImgUrl", "()Ljava/lang/String;", "getShowSeconds", "getReportTag", "getStartTime", "getEndTime", "getExecute", "getOrder", "()I", "getSortOrder", "()Ljava/lang/Integer;", "timeStart", "timeEnd", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteBanner extends BaseResp implements Order, TimeRange {
    private static int component1 = 0;
    private static int component3 = 1;
    private final String endTime;
    private final String execute;
    private final String imgUrl;
    private final int order;
    private final String reportTag;
    private final String showSeconds;
    private final String startTime;

    public final String getImgUrl() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.imgUrl;
        int i4 = i2 + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getShowSeconds() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 101;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.showSeconds;
        int i4 = i2 + 35;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getReportTag() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 105;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.reportTag;
        int i4 = i2 + 5;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getStartTime() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.startTime;
        }
        throw null;
    }

    public final String getEndTime() {
        int i = 2 % 2;
        int i2 = component3 + 101;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.endTime;
        int i5 = i3 + 21;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 81;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int getOrder() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.order;
        }
        throw null;
    }

    public RemoteBanner(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.imgUrl = str;
        this.showSeconds = str2;
        this.reportTag = str3;
        this.startTime = str4;
        this.endTime = str5;
        this.execute = str6;
        this.order = i;
    }

    @Override
    public Integer getSortOrder() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Integer.valueOf(this.order);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer numValueOf = Integer.valueOf(this.order);
        int i3 = component1 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return numValueOf;
    }

    @Override
    public String timeStart() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.startTime;
        int i5 = i2 + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override
    public String timeEnd() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.endTime;
        int i5 = i3 + 93;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RemoteBanner copy$default(RemoteBanner remoteBanner, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Object obj) {
        String str7;
        String str8;
        String str9;
        String str10;
        int i3;
        int i4 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i5 = component3 + 89;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str7 = remoteBanner.imgUrl;
        } else {
            str7 = str;
        }
        String str11 = (i2 & 2) != 0 ? remoteBanner.showSeconds : str2;
        if ((i2 & 4) != 0) {
            int i7 = component3 + 47;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            str8 = remoteBanner.reportTag;
        } else {
            str8 = str3;
        }
        String str12 = (i2 & 8) != 0 ? remoteBanner.startTime : str4;
        if ((i2 & 16) != 0) {
            int i9 = component1 + 89;
            component3 = i9 % 128;
            if (i9 % 2 == 0) {
                String str13 = remoteBanner.endTime;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str9 = remoteBanner.endTime;
        } else {
            str9 = str5;
        }
        if ((i2 & 32) != 0) {
            int i10 = component3 + 67;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            str10 = remoteBanner.execute;
        } else {
            str10 = str6;
        }
        if ((i2 & 64) != 0) {
            i3 = remoteBanner.order;
            int i12 = component3 + 47;
            component1 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 3 % 3;
            }
        } else {
            i3 = i;
        }
        return remoteBanner.copy(str7, str11, str8, str12, str9, str10, i3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.imgUrl;
        int i5 = i2 + 67;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 53;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.showSeconds;
        int i4 = i2 + 111;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 7;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.reportTag;
        int i5 = i2 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.startTime;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.endTime;
        int i5 = i2 + 73;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 81;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 43;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 54 / 0;
        }
        return str;
    }

    public final int component7() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 73;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.order;
        int i6 = i2 + 29;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final RemoteBanner copy(String imgUrl, String showSeconds, String reportTag, String startTime, String endTime, String execute, int order) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(imgUrl, "");
        Intrinsics.checkNotNullParameter(showSeconds, "");
        Intrinsics.checkNotNullParameter(reportTag, "");
        Intrinsics.checkNotNullParameter(execute, "");
        RemoteBanner remoteBanner = new RemoteBanner(imgUrl, showSeconds, reportTag, startTime, endTime, execute, order);
        int i2 = component3 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return remoteBanner;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteBanner)) {
            int i2 = component1 + 23;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        RemoteBanner remoteBanner = (RemoteBanner) other;
        if (!Intrinsics.areEqual(this.imgUrl, remoteBanner.imgUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.showSeconds, remoteBanner.showSeconds)) {
            int i4 = component1 + 51;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.reportTag, remoteBanner.reportTag) || !Intrinsics.areEqual(this.startTime, remoteBanner.startTime) || !Intrinsics.areEqual(this.endTime, remoteBanner.endTime)) {
            return false;
        }
        if (Intrinsics.areEqual(this.execute, remoteBanner.execute)) {
            return this.order == remoteBanner.order;
        }
        int i6 = component3;
        int i7 = i6 + 39;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 17;
        component1 = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 89 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.imgUrl.hashCode();
        int iHashCode3 = this.showSeconds.hashCode();
        int iHashCode4 = this.reportTag.hashCode();
        String str = this.startTime;
        if (str == null) {
            int i4 = component3 + 93;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.endTime;
        int iHashCode5 = (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.execute.hashCode()) * 31) + Integer.hashCode(this.order);
        int i6 = component3 + 59;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return iHashCode5;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteBanner(imgUrl=" + this.imgUrl + ", showSeconds=" + this.showSeconds + ", reportTag=" + this.reportTag + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", execute=" + this.execute + ", order=" + this.order + ")";
        int i2 = component3 + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
