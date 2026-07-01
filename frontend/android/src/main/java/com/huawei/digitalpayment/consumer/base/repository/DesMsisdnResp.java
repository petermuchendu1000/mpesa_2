package com.huawei.digitalpayment.consumer.base.repository;

import com.alibaba.ariver.engine.common.track.watchdog.WatchDogTrackEvent;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/DesMsisdnResp;", "Lcom/huawei/http/BaseResp;", "decMsisdn", "", WatchDogTrackEvent.EVENT_UPDATE_MODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDecMsisdn", "()Ljava/lang/String;", "setDecMsisdn", "(Ljava/lang/String;)V", "getUpdateMode", "setUpdateMode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DesMsisdnResp extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component1;
    private String decMsisdn;
    private String updateMode;

    /* JADX WARN: Illegal instructions before constructor call */
    public DesMsisdnResp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 37;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 89;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String getDecMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.decMsisdn;
        int i5 = i3 + 3;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDecMsisdn(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 85;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.decMsisdn = str;
        int i5 = i2 + 31;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
    }

    public final String getUpdateMode() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.updateMode;
        int i5 = i2 + 29;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setUpdateMode(String str) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.updateMode = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public DesMsisdnResp(String str, String str2) {
        this.decMsisdn = str;
        this.updateMode = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DesMsisdnResp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static DesMsisdnResp copy$default(DesMsisdnResp desMsisdnResp, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 11;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = desMsisdnResp.decMsisdn;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 7;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str2 = desMsisdnResp.updateMode;
        }
        DesMsisdnResp desMsisdnRespCopy = desMsisdnResp.copy(str, str2);
        int i8 = ShareDataUIState + 85;
        component1 = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 36 / 0;
        }
        return desMsisdnRespCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.decMsisdn;
        if (i3 != 0) {
            int i4 = 87 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.updateMode;
        int i5 = i3 + 3;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final DesMsisdnResp copy(String decMsisdn, String updateMode) {
        int i = 2 % 2;
        DesMsisdnResp desMsisdnResp = new DesMsisdnResp(decMsisdn, updateMode);
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return desMsisdnResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 29;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 69;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof DesMsisdnResp)) {
            return false;
        }
        DesMsisdnResp desMsisdnResp = (DesMsisdnResp) other;
        if (Intrinsics.areEqual(this.decMsisdn, desMsisdnResp.decMsisdn)) {
            return Intrinsics.areEqual(this.updateMode, desMsisdnResp.updateMode);
        }
        int i7 = ShareDataUIState + 49;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = 0;
        if (i2 % 2 == 0) {
            str = this.decMsisdn;
            iHashCode = 1;
            if (str != null) {
                i3 = 1;
                int iHashCode2 = str.hashCode();
                int i4 = ShareDataUIState + 73;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = i3;
                i3 = iHashCode2;
            }
        } else {
            str = this.decMsisdn;
            if (str == null) {
                iHashCode = 0;
            } else {
                int iHashCode22 = str.hashCode();
                int i42 = ShareDataUIState + 73;
                component1 = i42 % 128;
                int i52 = i42 % 2;
                iHashCode = i3;
                i3 = iHashCode22;
            }
        }
        String str2 = this.updateMode;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (i3 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DesMsisdnResp(decMsisdn=" + this.decMsisdn + ", updateMode=" + this.updateMode + ")";
        int i2 = ShareDataUIState + 97;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
