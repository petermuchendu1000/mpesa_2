package com.huawei.common.widget.code;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.common.R;
import com.huawei.common.util.font.FontManager;
import com.huawei.common.widget.input.ErrorWrapper;

public class CodeWithErrorInputView extends LinearLayout {
    private final CodeInputView codeInputView;
    private final ErrorWrapper errorWrapper;

    public CodeWithErrorInputView(Context context) {
        this(context, null);
    }

    public CodeWithErrorInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CodeWithErrorInputView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CodeWithErrorInputView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setOrientation(1);
        setGravity(16);
        CodeInputView codeInputView = new CodeInputView(context, attributeSet);
        this.codeInputView = codeInputView;
        TextView textView = new TextView(context);
        textView.setId(R.id.errorView);
        addView(codeInputView);
        addView(textView, new LinearLayout.LayoutParams(-1, -2));
        ErrorWrapper errorWrapper = new ErrorWrapper(context, this, attributeSet, i, i2);
        this.errorWrapper = errorWrapper;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.InputError, 0, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(R.styleable.InputError_input_error_text_color)) {
            errorWrapper.setInputErrorTextColor(codeInputView.getErrorStrokeColor());
        }
        typedArrayObtainStyledAttributes.recycle();
        FontManager.INSTANCE.setTextStyle(textView, 0);
        FontManager.INSTANCE.setTextStyle(codeInputView, 0);
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0();
            }
        });
    }

    public void lambda$new$0() {
        getLayoutParams().height = -2;
    }

    public void showError(String str) {
        this.codeInputView.setError(!TextUtils.isEmpty(str));
        this.errorWrapper.setInputError(str);
    }

    public CodeInputView getCodeInputView() {
        return this.codeInputView;
    }

    public void setErrorStrokeColor(int i) {
        this.codeInputView.setErrorStrokeColor(i);
        this.errorWrapper.setInputErrorTextColor(i);
    }

    public ErrorWrapper getErrorWrapper() {
        return this.errorWrapper;
    }

    public void setMaxEms(int i) {
        this.codeInputView.setMaxEms(i);
    }

    public void setError(boolean z) {
        if (!z) {
            showError(null);
        } else {
            this.codeInputView.setError(true);
        }
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        this.codeInputView.addTextChangedListener(textWatcher);
    }

    public Editable getText() {
        return this.codeInputView.getText();
    }

    public void add(CharSequence charSequence) {
        this.codeInputView.add(charSequence);
    }

    public void remove() {
        this.codeInputView.remove();
    }

    public void clear() {
        this.codeInputView.clear();
    }

    public void setText(CharSequence charSequence) {
        this.codeInputView.setText(charSequence);
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.codeInputView.setVisibility(i);
    }
}
