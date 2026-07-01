package com.huawei.digitalpayment.consumer.baselib.widget.input;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.blankj.utilcode.util.ColorUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;

public class MobileInputView extends CommonInputView {
    private static int ShareDataUIState = 1;
    private static int component3;
    private EditText editText;
    private int errorIconColor;
    private int errorIconResId;
    private String errorText;

    public MobileInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MobileInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.errorIconResId = R.mipmap.base_icon_tips;
        this.errorIconColor = ColorUtils.getColor(R.color.colorUrgent);
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        EditText editText = getEditText();
        this.editText = editText;
        editText.setTextDirection(3);
        int i5 = ShareDataUIState + 77;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void setErrorText(String str) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.errorText = str;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
    }

    public void setErrorIconResId(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 7;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        this.errorIconResId = i;
        int i6 = i4 + 37;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void setErrorIconColor(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 53;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        this.errorIconColor = i;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 29;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public void attach(final View view) {
        int i = 2 % 2;
        this.editText.addTextChangedListener(new MPTextWatcher() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void afterTextChanged(Editable editable) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 75;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    super.afterTextChanged(editable);
                    view.setEnabled(MobileInputView.this.isValidPhoneNumber());
                    if (TextUtils.isEmpty(editable.toString())) {
                        MobileInputView.this.getEndIcon().setImageResource(0);
                        MobileInputView.this.showError(null);
                        return;
                    }
                    if (MobileInputView.this.isValidPhoneNumber()) {
                        MobileInputView.this.getEndIcon().setImageResource(R.mipmap.base_icon_correct);
                        MobileInputView.this.getEndIcon().setColorFilter(ColorUtils.getColor(R.color.colorSuccess));
                        MobileInputView.this.showError(null);
                        int i4 = ShareDataUIState + 37;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                        return;
                    }
                    MobileInputView.this.getEndIcon().setImageResource(MobileInputView.m10252$$Nest$fgeterrorIconResId(MobileInputView.this));
                    MobileInputView.this.getEndIcon().setColorFilter(MobileInputView.m10251$$Nest$fgeterrorIconColor(MobileInputView.this));
                    MobileInputView mobileInputView = MobileInputView.this;
                    mobileInputView.showError(MobileInputView.m10253$$Nest$fgeterrorText(mobileInputView));
                    return;
                }
                super.afterTextChanged(editable);
                view.setEnabled(MobileInputView.this.isValidPhoneNumber());
                TextUtils.isEmpty(editable.toString());
                obj.hashCode();
                throw null;
            }
        });
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRecentPhone() {
        int i = 2 % 2;
        this.editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(AppConfigManager.getAppConfig().getPhoneNumberMaxLength())});
        this.editText.setInputType(2);
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        String phoneNumberCode = AppConfigManager.getAppConfig().getPhoneNumberCode();
        Object obj = null;
        if (!TextUtils.isEmpty(string)) {
            int length = phoneNumberCode.startsWith("+") ? phoneNumberCode.length() - 1 : phoneNumberCode.length();
            if (string.length() >= length) {
                int i2 = component3 + 25;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    this.editText.setText(string.substring(length));
                    EditText editText = this.editText;
                    editText.setSelection(editText.getText().length());
                    obj.hashCode();
                    throw null;
                }
                this.editText.setText(string.substring(length));
                EditText editText2 = this.editText;
                editText2.setSelection(editText2.getText().length());
            }
        }
        getStartUnit().setText("+" + phoneNumberCode);
        int i3 = ShareDataUIState + 87;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public boolean isValidPhoneNumber() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
            return PhoneUtils.isValidPhoneNumber(PhoneUtils.filterUnNumber(getText()));
        }
        return PhoneUtils.isValidPhoneNumber(PhoneUtils.filterUnNumber(getText()));
    }

    public String getCompleteText() {
        int i = 2 % 2;
        String str = getStartUnit().getText().toString() + getText();
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return PhoneUtils.filterUnNumber(getCompleteText());
        }
        PhoneUtils.filterUnNumber(getCompleteText());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int m10251$$Nest$fgeterrorIconColor(MobileInputView mobileInputView) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = mobileInputView.errorIconColor;
        int i6 = i2 + 77;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int m10252$$Nest$fgeterrorIconResId(MobileInputView mobileInputView) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = mobileInputView.errorIconResId;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    static String m10253$$Nest$fgeterrorText(MobileInputView mobileInputView) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 87;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = mobileInputView.errorText;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
