package com.huawei.digitalpayment.customer.dynamics;

import androidx.fragment.app.FragmentActivity;
import com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B!\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/DynamicsElementTextView;", "Lcom/huawei/digitalpayment/customer/dynamics/base/BaseDynamicsView;", "layoutId", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "dynamicsElement", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "<init>", "(ILandroidx/fragment/app/FragmentActivity;Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;)V", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DynamicsElementTextView extends BaseDynamicsView {
    private static int ShareDataUIState = 1;
    private static int component2;

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicsElementTextView(int i, FragmentActivity fragmentActivity, DynamicsElement dynamicsElement, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = component2 + 7;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                i = R.layout.default_dynamics_element_layout;
                int i4 = 64 / 0;
            } else {
                i = R.layout.default_dynamics_element_layout;
            }
            int i5 = component2 + 117;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(i, fragmentActivity, dynamicsElement);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicsElementTextView(int i, FragmentActivity fragmentActivity, DynamicsElement dynamicsElement) {
        super(i, fragmentActivity, dynamicsElement);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(dynamicsElement, "");
    }
}
