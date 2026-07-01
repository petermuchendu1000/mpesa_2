package com.huawei.digitalpayment.checkout.ui.view;

import android.os.Bundle;
import android.view.View;
import com.huawei.common.widget.RotateImageView;
import com.huawei.common.widget.dialog.LoadingDialog;
import com.huawei.digitalpayment.checkoutModule.R;

public class PinFreeLoadingDialog extends LoadingDialog {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        super.onViewCreated(view, bundle);
        setTextView(getString(R.string.checkout_pin_free_pay));
        int i4 = component2 + 105;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public void showSuccess(String str) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            setTextView(str);
            View view = getView();
            if (view != null) {
                int i3 = component2 + 75;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                RotateImageView rotateImageView = (RotateImageView) view.findViewById(R.id.iv_loading);
                rotateImageView.setRotation(0.0f);
                rotateImageView.endAnim();
                rotateImageView.setImageResource(R.mipmap.checkout_icon_success);
            }
            int i5 = component2 + 23;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        setTextView(str);
        getView();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
