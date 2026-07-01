package com.huawei.common.widget.input;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.R;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.NoWaitPasswordTransformationMethod;

public class PinInputView extends CommonInputView {
    private boolean hidePin;
    private final NoWaitPasswordTransformationMethod noWaitPasswordTransformationMethod;
    private float textSize;

    public PinInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.hidePin = true;
        this.noWaitPasswordTransformationMethod = NoWaitPasswordTransformationMethod.getInstance();
        init();
    }

    public PinInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.hidePin = true;
        this.noWaitPasswordTransformationMethod = NoWaitPasswordTransformationMethod.getInstance();
        init();
    }

    private void init() {
        this.textSize = getEditText().getTextSize();
        ImageView endIcon = getEndIcon();
        if (endIcon != null) {
            endIcon.setVisibility(0);
            endIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PinInputView.m10053instrumented$0$init$V(this.f$0, view);
                }
            });
        }
        showOrHide();
        getEditText().addTextChangedListener(new MPTextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                PinInputView.this.showOrHide();
            }
        });
    }

    private void lambda$init$0(View view) {
        this.hidePin = !this.hidePin;
        showOrHide();
    }

    public void showOrHide() {
        EditText editText = getEditText();
        if (this.hidePin) {
            editText.setTransformationMethod(this.noWaitPasswordTransformationMethod);
        } else {
            editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        }
        editText.setSelection(editText.getText().length());
        updateEye();
    }

    private void updateEye() {
        ImageView endIcon = getEndIcon();
        if (endIcon == null) {
            return;
        }
        if (this.hidePin) {
            endIcon.setImageResource(R.mipmap.common_icon_eye_close);
        } else {
            endIcon.setImageResource(R.mipmap.common_icon_eye_open);
        }
        String string = getEditText().getText().toString();
        if (this.hidePin && !TextUtils.isEmpty(string)) {
            getEditText().setTextSize(0, this.textSize * 0.6f);
            getEditText().setLetterSpacing(0.6f);
        } else {
            getEditText().setTextSize(0, this.textSize);
            getEditText().setLetterSpacing(0.0f);
        }
    }

    public static void m10053instrumented$0$init$V(PinInputView pinInputView, View view) {
        Callback.onClick_enter(view);
        try {
            pinInputView.lambda$init$0(view);
        } finally {
            Callback.onClick_exit();
        }
    }
}
