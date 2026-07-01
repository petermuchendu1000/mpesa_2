package com.huawei.digitalpayment.consumer.sfcui.profile.pinmanage.forgotpin;

import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/forgotpin/SecurityInputViewBean;", "", "inputView", "Lcom/huawei/common/widget/input/CommonInputView;", "item", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "<init>", "(Lcom/huawei/common/widget/input/CommonInputView;Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;)V", "getInputView", "()Lcom/huawei/common/widget/input/CommonInputView;", "setInputView", "(Lcom/huawei/common/widget/input/CommonInputView;)V", "getItem", "()Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "setItem", "(Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SecurityInputViewBean {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private static int getAsAtTimestamp = 1;
    private CommonInputView component1;
    private LocalQuestionItem component2;

    public SecurityInputViewBean(CommonInputView commonInputView, LocalQuestionItem localQuestionItem) {
        Intrinsics.checkNotNullParameter(commonInputView, "");
        Intrinsics.checkNotNullParameter(localQuestionItem, "");
        this.component1 = commonInputView;
        this.component2 = localQuestionItem;
    }

    public final CommonInputView getInputView() {
        int i = 2 % 2;
        int i2 = component3 + 75;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        CommonInputView commonInputView = this.component1;
        int i5 = i3 + 5;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return commonInputView;
    }

    public final void setInputView(CommonInputView commonInputView) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(commonInputView, "");
        this.component1 = commonInputView;
        int i4 = component3 + 15;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public final LocalQuestionItem getItem() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        LocalQuestionItem localQuestionItem = this.component2;
        int i5 = i2 + 17;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return localQuestionItem;
        }
        throw null;
    }

    public final void setItem(LocalQuestionItem localQuestionItem) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(localQuestionItem, "");
        this.component2 = localQuestionItem;
        int i4 = getAsAtTimestamp + 79;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 93;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static SecurityInputViewBean copy$default(SecurityInputViewBean securityInputViewBean, CommonInputView commonInputView, LocalQuestionItem localQuestionItem, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 57;
        int i4 = i3 % 128;
        getAsAtTimestamp = i4;
        Object obj2 = null;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 101;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                CommonInputView commonInputView2 = securityInputViewBean.component1;
                obj2.hashCode();
                throw null;
            }
            commonInputView = securityInputViewBean.component1;
        }
        if ((i & 2) != 0) {
            localQuestionItem = securityInputViewBean.component2;
        }
        SecurityInputViewBean securityInputViewBeanCopy = securityInputViewBean.copy(commonInputView, localQuestionItem);
        int i6 = component3 + 77;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            return securityInputViewBeanCopy;
        }
        throw null;
    }

    public final CommonInputView component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 47;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        CommonInputView commonInputView = this.component1;
        int i4 = i2 + 119;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return commonInputView;
    }

    public final LocalQuestionItem component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        LocalQuestionItem localQuestionItem = this.component2;
        int i5 = i2 + 15;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            return localQuestionItem;
        }
        throw null;
    }

    public final SecurityInputViewBean copy(CommonInputView inputView, LocalQuestionItem item) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(inputView, "");
        Intrinsics.checkNotNullParameter(item, "");
        SecurityInputViewBean securityInputViewBean = new SecurityInputViewBean(inputView, item);
        int i2 = component3 + 43;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return securityInputViewBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 25;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SecurityInputViewBean)) {
            return false;
        }
        SecurityInputViewBean securityInputViewBean = (SecurityInputViewBean) other;
        if (!Intrinsics.areEqual(this.component1, securityInputViewBean.component1)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component2, securityInputViewBean.component2)) {
            return true;
        }
        int i4 = component3 + 63;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 81;
        component3 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.component1.hashCode() - 115) >> this.component2.hashCode() : (this.component1.hashCode() * 31) + this.component2.hashCode();
        int i3 = getAsAtTimestamp + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecurityInputViewBean(inputView=" + this.component1 + ", item=" + this.component2 + ")";
        int i2 = component3 + 121;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
