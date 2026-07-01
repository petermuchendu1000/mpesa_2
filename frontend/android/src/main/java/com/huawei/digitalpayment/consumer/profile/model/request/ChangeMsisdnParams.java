package com.huawei.digitalpayment.consumer.profile.model.request;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/request/ChangeMsisdnParams;", "Lcom/huawei/http/BaseRequestParams;", "oldMsisdn", "", "newMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getOldMsisdn", "()Ljava/lang/String;", "getNewMsisdn", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeMsisdnParams extends BaseRequestParams {
    private static int component1 = 1;
    private static int component2;
    private final String newMsisdn;
    private final String oldMsisdn;

    public final String getNewMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.newMsisdn;
        }
        throw null;
    }

    public final String getOldMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 121;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.oldMsisdn;
        int i5 = i3 + 7;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public ChangeMsisdnParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.oldMsisdn = str;
        this.newMsisdn = str2;
    }

    public static ChangeMsisdnParams copy$default(ChangeMsisdnParams changeMsisdnParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = changeMsisdnParams.oldMsisdn;
        }
        if ((i & 2) != 0) {
            int i3 = component2 + 53;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            str2 = changeMsisdnParams.newMsisdn;
            int i6 = i4 + 65;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return changeMsisdnParams.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.oldMsisdn;
        int i4 = i3 + 3;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.newMsisdn;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final ChangeMsisdnParams copy(String oldMsisdn, String newMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(oldMsisdn, "");
        Intrinsics.checkNotNullParameter(newMsisdn, "");
        ChangeMsisdnParams changeMsisdnParams = new ChangeMsisdnParams(oldMsisdn, newMsisdn);
        int i2 = component1 + 75;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return changeMsisdnParams;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 29;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof ChangeMsisdnParams) {
            ChangeMsisdnParams changeMsisdnParams = (ChangeMsisdnParams) other;
            return Intrinsics.areEqual(this.oldMsisdn, changeMsisdnParams.oldMsisdn) && Intrinsics.areEqual(this.newMsisdn, changeMsisdnParams.newMsisdn);
        }
        int i4 = component2 + 95;
        component1 = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.oldMsisdn.hashCode();
        return (i3 == 0 ? iHashCode + 122 : iHashCode * 31) + this.newMsisdn.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangeMsisdnParams(oldMsisdn=" + this.oldMsisdn + ", newMsisdn=" + this.newMsisdn + ")";
        int i2 = component2 + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return str;
    }
}
