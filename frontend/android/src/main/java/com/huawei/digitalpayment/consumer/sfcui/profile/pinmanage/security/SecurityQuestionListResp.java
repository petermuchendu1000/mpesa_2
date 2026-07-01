package com.huawei.digitalpayment.consumer.sfcui.profile.pinmanage.security;

import com.huawei.http.BaseResp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ,\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0006H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/SecurityQuestionListResp;", "Lcom/huawei/http/BaseResp;", "questionItemList", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/SecurityQuestionItem;", "qaConfigNo", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getQuestionItemList", "()Ljava/util/List;", "getQaConfigNo", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/SecurityQuestionListResp;", "equals", "", "other", "", "hashCode", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SecurityQuestionListResp extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 29 % 128;
    private static int component2 = 0;
    private static int component3 = 1;
    private final Integer qaConfigNo;
    private final List<SecurityQuestionItem> questionItemList;

    public final List<SecurityQuestionItem> getQuestionItemList() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.questionItemList;
        }
        throw null;
    }

    public final Integer getQaConfigNo() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.qaConfigNo;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return num;
    }

    public SecurityQuestionListResp(List<SecurityQuestionItem> list, Integer num) {
        this.questionItemList = list;
        this.qaConfigNo = num;
    }

    static {
        if (29 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SecurityQuestionListResp copy$default(SecurityQuestionListResp securityQuestionListResp, List list, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 61;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            list = securityQuestionListResp.questionItemList;
        }
        if ((i & 2) != 0) {
            num = securityQuestionListResp.qaConfigNo;
        }
        SecurityQuestionListResp securityQuestionListRespCopy = securityQuestionListResp.copy(list, num);
        int i5 = ShareDataUIState + 99;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return securityQuestionListRespCopy;
    }

    public final List<SecurityQuestionItem> component1() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<SecurityQuestionItem> list = this.questionItemList;
        int i5 = i3 + 111;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.qaConfigNo;
        int i5 = i3 + 97;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final SecurityQuestionListResp copy(List<SecurityQuestionItem> questionItemList, Integer qaConfigNo) {
        int i = 2 % 2;
        SecurityQuestionListResp securityQuestionListResp = new SecurityQuestionListResp(questionItemList, qaConfigNo);
        int i2 = ShareDataUIState + 113;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
        return securityQuestionListResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecurityQuestionListResp)) {
            int i2 = ShareDataUIState + 31;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        SecurityQuestionListResp securityQuestionListResp = (SecurityQuestionListResp) other;
        if (!Intrinsics.areEqual(this.questionItemList, securityQuestionListResp.questionItemList)) {
            return false;
        }
        if (Intrinsics.areEqual(this.qaConfigNo, securityQuestionListResp.qaConfigNo)) {
            return true;
        }
        int i4 = ShareDataUIState + 113;
        component3 = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<SecurityQuestionItem> list = this.questionItemList;
        int iHashCode = 0;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Integer num = this.qaConfigNo;
        if (num != null) {
            iHashCode = num.hashCode();
            int i4 = ShareDataUIState + 65;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecurityQuestionListResp(questionItemList=" + this.questionItemList + ", qaConfigNo=" + this.qaConfigNo + ")";
        int i2 = component3 + 99;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
