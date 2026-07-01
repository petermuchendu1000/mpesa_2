package com.huawei.digitalpayment.consumer.bean;

import com.alibaba.ariver.engine.common.track.watchdog.WatchDogTrackEvent;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/bean/DesMsisdnResp;", "Lcom/huawei/http/BaseResp;", "decMsisdn", "", WatchDogTrackEvent.EVENT_UPDATE_MODE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDecMsisdn", "()Ljava/lang/String;", "setDecMsisdn", "(Ljava/lang/String;)V", "getUpdateMode", "setUpdateMode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DesMsisdnResp extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private String decMsisdn;
    private String updateMode;

    /* JADX WARN: Illegal instructions before constructor call */
    public DesMsisdnResp(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState;
            int i3 = i2 + 23;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 31;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i8 = component3 + 123;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i9 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String getDecMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.decMsisdn;
        int i5 = i3 + 73;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setDecMsisdn(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.decMsisdn = str;
        if (i4 != 0) {
            int i5 = 31 / 0;
        }
        int i6 = i2 + 113;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUpdateMode() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.updateMode;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public final void setUpdateMode(String str) {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.updateMode = str;
        int i5 = i3 + 125;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
    }

    public DesMsisdnResp(String str, String str2) {
        this.decMsisdn = str;
        this.updateMode = str2;
    }

    static {
        int i = 1 + 41;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DesMsisdnResp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static DesMsisdnResp copy$default(DesMsisdnResp desMsisdnResp, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 109;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = desMsisdnResp.decMsisdn;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 107;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str2 = desMsisdnResp.updateMode;
        }
        return desMsisdnResp.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 53;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.decMsisdn;
        int i4 = i2 + 103;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.updateMode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DesMsisdnResp copy(String decMsisdn, String updateMode) {
        int i = 2 % 2;
        DesMsisdnResp desMsisdnResp = new DesMsisdnResp(decMsisdn, updateMode);
        int i2 = component3 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return desMsisdnResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DesMsisdnResp)) {
            int i2 = component3;
            int i3 = i2 + 15;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 61;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        DesMsisdnResp desMsisdnResp = (DesMsisdnResp) other;
        if (!Intrinsics.areEqual(this.decMsisdn, desMsisdnResp.decMsisdn)) {
            int i6 = ShareDataUIState + 69;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.updateMode, desMsisdnResp.updateMode)) {
            return true;
        }
        int i8 = ShareDataUIState + 125;
        component3 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.decMsisdn;
        if (str == null) {
            int i2 = component3 + 57;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 21;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.updateMode;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DesMsisdnResp(decMsisdn=" + this.decMsisdn + ", updateMode=" + this.updateMode + ")";
        int i2 = ShareDataUIState + 89;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
