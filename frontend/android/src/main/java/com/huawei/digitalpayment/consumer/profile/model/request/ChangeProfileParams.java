package com.huawei.digitalpayment.consumer.profile.model.request;

import com.huawei.digitalpayment.consumer.profile.constants.ProfileConstants;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/request/ChangeProfileParams;", "Lcom/huawei/http/BaseRequestParams;", ProfileConstants.NICK_NAME, "", "<init>", "(Ljava/lang/String;)V", "getNickName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeProfileParams extends BaseRequestParams {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final String nickName;

    public ChangeProfileParams(String str) {
        this.nickName = str;
    }

    public final String getNickName() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.nickName;
            int i4 = 41 / 0;
        } else {
            str = this.nickName;
        }
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static ChangeProfileParams copy$default(ChangeProfileParams changeProfileParams, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault;
            int i4 = i3 + 75;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                String str2 = changeProfileParams.nickName;
                throw null;
            }
            String str3 = changeProfileParams.nickName;
            int i5 = i3 + 101;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str = str3;
        }
        return changeProfileParams.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.nickName;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    public final ChangeProfileParams copy(String nickName) {
        int i = 2 % 2;
        ChangeProfileParams changeProfileParams = new ChangeProfileParams(nickName);
        int i2 = copydefault + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return changeProfileParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 105;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ChangeProfileParams)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.nickName, ((ChangeProfileParams) other).nickName)) {
            int i4 = copydefault + 43;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = component1 + 41;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 12 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.nickName;
        if (str != null) {
            return str.hashCode();
        }
        int i4 = i3 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangeProfileParams(nickName=" + this.nickName + ")";
        int i2 = component1 + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
