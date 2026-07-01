package com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model;

import com.huawei.digitalpayment.consumer.profile.constants.ProfileConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/model/LocalUserInfo;", "", ProfileConstants.NICK_NAME, "", "<init>", "(Ljava/lang/String;)V", "getNickName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalUserInfo {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final String component2;

    public LocalUserInfo(String str) {
        this.component2 = str;
    }

    public final String getNickName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LocalUserInfo copy$default(LocalUserInfo localUserInfo, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 67;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 61;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str = localUserInfo.component2;
        }
        LocalUserInfo localUserInfoCopy = localUserInfo.copy(str);
        int i8 = component1 + 9;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
        return localUserInfoCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 97;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final LocalUserInfo copy(String nickName) {
        int i = 2 % 2;
        LocalUserInfo localUserInfo = new LocalUserInfo(nickName);
        int i2 = component1 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return localUserInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 79;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof LocalUserInfo)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, ((LocalUserInfo) other).component2)) {
            int i7 = component1 + 123;
            int i8 = i7 % 128;
            ShareDataUIState = i8;
            z = i7 % 2 != 0;
            int i9 = i8 + 63;
            component1 = i9 % 128;
            int i10 = i9 % 2;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1
  0x001c: PHI (r1v8 java.lang.String) = (r1v4 java.lang.String), (r1v9 java.lang.String) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalUserInfo.ShareDataUIState
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalUserInfo.component1 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            java.lang.String r1 = r4.component2
            r3 = 80
            int r3 = r3 / r2
            if (r1 != 0) goto L1c
            goto L20
        L17:
            java.lang.String r1 = r4.component2
            if (r1 != 0) goto L1c
            goto L20
        L1c:
            int r2 = r1.hashCode()
        L20:
            int r1 = com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalUserInfo.ShareDataUIState
            int r1 = r1 + 13
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalUserInfo.component1 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L2c
            return r2
        L2c:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.model.LocalUserInfo.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalUserInfo(nickName=" + this.component2 + ")";
        int i2 = ShareDataUIState + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
