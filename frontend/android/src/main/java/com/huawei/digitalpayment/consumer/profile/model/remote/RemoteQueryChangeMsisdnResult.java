package com.huawei.digitalpayment.consumer.profile.model.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteQueryChangeMsisdnResult;", "", "resultFlag", "", "<init>", "(I)V", "getResultFlag", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteQueryChangeMsisdnResult {
    private static int component1 = 1;
    private static int component2;
    private final int resultFlag;

    public RemoteQueryChangeMsisdnResult(int i) {
        this.resultFlag = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteQueryChangeMsisdnResult(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = component2 + 21;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 59;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i = 2;
        }
        this(i);
    }

    public final int getResultFlag() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.resultFlag;
        int i6 = i3 + 3;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public RemoteQueryChangeMsisdnResult() {
        this(0, 1, null);
    }

    public static RemoteQueryChangeMsisdnResult copy$default(RemoteQueryChangeMsisdnResult remoteQueryChangeMsisdnResult, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component2;
        int i5 = i4 + 103;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        if ((i2 & 1) != 0) {
            i = remoteQueryChangeMsisdnResult.resultFlag;
            int i7 = i4 + 97;
            component1 = i7 % 128;
            int i8 = i7 % 2;
        }
        return remoteQueryChangeMsisdnResult.copy(i);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.resultFlag;
        int i5 = i3 + 25;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final RemoteQueryChangeMsisdnResult copy(int resultFlag) {
        int i = 2 % 2;
        RemoteQueryChangeMsisdnResult remoteQueryChangeMsisdnResult = new RemoteQueryChangeMsisdnResult(resultFlag);
        int i2 = component1 + 9;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return remoteQueryChangeMsisdnResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof RemoteQueryChangeMsisdnResult) {
            return this.resultFlag == ((RemoteQueryChangeMsisdnResult) other).resultFlag;
        }
        int i5 = i2 + 17;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Integer.hashCode(this.resultFlag);
            throw null;
        }
        int iHashCode = Integer.hashCode(this.resultFlag);
        int i3 = component1 + 25;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 35 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteQueryChangeMsisdnResult(resultFlag=" + this.resultFlag + ")";
        int i2 = component1 + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
