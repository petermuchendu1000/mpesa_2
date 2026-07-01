package com.huawei.digitalpayment.consumer.base.repository;

import com.huawei.common.exception.BaseException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/repository/QueryPhoneNumberException;", "Lcom/huawei/common/exception/BaseException;", "message", "", "requestId", "isForcedUpdate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getRequestId", "()Ljava/lang/String;", "()Z", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QueryPhoneNumberException extends BaseException {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final boolean isForcedUpdate;
    private final String requestId;

    /* JADX WARN: Illegal instructions before constructor call */
    public QueryPhoneNumberException(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str2 = "";
            int i2 = component3 + 91;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 4) != 0) {
            int i5 = copydefault + 61;
            component3 = i5 % 128;
            z = i5 % 2 != 0;
        }
        this(str, str2, z);
    }

    public final String getRequestId() {
        int i = 2 % 2;
        int i2 = component3 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.requestId;
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return str;
    }

    public final boolean isForcedUpdate() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.isForcedUpdate;
        int i4 = i3 + 123;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QueryPhoneNumberException(String str, String str2, boolean z) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.requestId = str2;
        this.isForcedUpdate = z;
    }
}
