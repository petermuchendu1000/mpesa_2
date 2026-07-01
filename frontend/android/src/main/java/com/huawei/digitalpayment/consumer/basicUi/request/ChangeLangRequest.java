package com.huawei.digitalpayment.consumer.basicUi.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/request/ChangeLangRequest;", "Lcom/huawei/http/BaseRequestParams;", "newLanguage", "", "initiatorMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNewLanguage", "()Ljava/lang/String;", "getInitiatorMsisdn", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeLangRequest extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final String initiatorMsisdn;
    private final String newLanguage;

    public final String getNewLanguage() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.newLanguage;
            int i4 = 45 / 0;
        } else {
            str = this.newLanguage;
        }
        int i5 = i2 + 125;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getInitiatorMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i2 + 87;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public ChangeLangRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.newLanguage = str;
        this.initiatorMsisdn = str2;
    }

    public static ChangeLangRequest copy$default(ChangeLangRequest changeLangRequest, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 33;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = changeLangRequest.newLanguage;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 33;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str2 = changeLangRequest.initiatorMsisdn;
        }
        ChangeLangRequest changeLangRequestCopy = changeLangRequest.copy(str, str2);
        int i8 = ShareDataUIState + 53;
        component3 = i8 % 128;
        if (i8 % 2 != 0) {
            return changeLangRequestCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.newLanguage;
        int i4 = i2 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.initiatorMsisdn;
        int i5 = i2 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ChangeLangRequest copy(String newLanguage, String initiatorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(newLanguage, "");
        Intrinsics.checkNotNullParameter(initiatorMsisdn, "");
        ChangeLangRequest changeLangRequest = new ChangeLangRequest(newLanguage, initiatorMsisdn);
        int i2 = ShareDataUIState + 67;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return changeLangRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof ChangeLangRequest) {
            ChangeLangRequest changeLangRequest = (ChangeLangRequest) other;
            return !(Intrinsics.areEqual(this.newLanguage, changeLangRequest.newLanguage) ^ true) && Intrinsics.areEqual(this.initiatorMsisdn, changeLangRequest.initiatorMsisdn);
        }
        int i4 = component3;
        int i5 = i4 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 7;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.newLanguage.hashCode() * 31) + this.initiatorMsisdn.hashCode();
        int i4 = ShareDataUIState + 107;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangeLangRequest(newLanguage=" + this.newLanguage + ", initiatorMsisdn=" + this.initiatorMsisdn + ")";
        int i2 = component3 + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
