package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.NoWaitPasswordTransformationMethod;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.digitalpayment.consumer.baseui.R;

public class PinInputView extends CommonInputView {
    private static int component1 = 0;
    private static int component2 = 1;
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

    private void lambda$init$0(View view) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.hidePin = !this.hidePin;
        showOrHide();
        int i4 = component2 + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void init() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.textSize = getEditText().getTextSize();
            ImageView endIcon = getEndIcon();
            if (endIcon != null) {
                endIcon.setVisibility(0);
                endIcon.setOnClickListener(new View.OnClickListener() {
                    private static int ShareDataUIState = 1;
                    private static int copydefault;

                    @Override
                    public final void onClick(View view) {
                        int i3 = 2 % 2;
                        int i4 = copydefault + 75;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        PinInputView.m10188$r8$lambda$mA5FgcXASCBDSWc0sgfe2t2BY(this.f$0, view);
                        int i6 = copydefault + 43;
                        ShareDataUIState = i6 % 128;
                        int i7 = i6 % 2;
                    }
                });
                int i3 = component1 + 11;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 4 / 4;
                }
            }
            showOrHide();
            getEditText().addTextChangedListener(new MPTextWatcher() {
                private static int ShareDataUIState = 1;
                private static int component2;

                @Override
                public void afterTextChanged(Editable editable) {
                    int i5 = 2 % 2;
                    int i6 = ShareDataUIState + 53;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                    PinInputView.m10189$$Nest$mshowOrHide(PinInputView.this);
                    if (i7 != 0) {
                        throw null;
                    }
                }
            });
            return;
        }
        this.textSize = getEditText().getTextSize();
        getEndIcon();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[PHI: r1
  0x0033: PHI (r1v5 android.widget.EditText) = (r1v4 android.widget.EditText), (r1v11 android.widget.EditText) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v10 android.widget.EditText) = (r1v4 android.widget.EditText), (r1v11 android.widget.EditText) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void showOrHide() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.ui.widget.PinInputView.component1
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.PinInputView.component2 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1c
            android.widget.EditText r1 = r4.getEditText()
            boolean r2 = r4.hidePin
            r3 = 26
            int r3 = r3 / 0
            r3 = 1
            if (r2 == r3) goto L24
            goto L33
        L1c:
            android.widget.EditText r1 = r4.getEditText()
            boolean r2 = r4.hidePin
            if (r2 == 0) goto L33
        L24:
            com.huawei.common.widget.NoWaitPasswordTransformationMethod r2 = r4.noWaitPasswordTransformationMethod
            r1.setTransformationMethod(r2)
            int r2 = com.huawei.digitalpayment.consumer.base.ui.widget.PinInputView.component1
            int r2 = r2 + 19
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.PinInputView.component2 = r3
            int r2 = r2 % r0
            goto L3a
        L33:
            android.text.method.HideReturnsTransformationMethod r2 = android.text.method.HideReturnsTransformationMethod.getInstance()
            r1.setTransformationMethod(r2)
        L3a:
            android.text.Editable r2 = r1.getText()
            int r2 = r2.length()
            r1.setSelection(r2)
            r4.updateEye()
            int r1 = com.huawei.digitalpayment.consumer.base.ui.widget.PinInputView.component1
            int r1 = r1 + 3
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.ui.widget.PinInputView.component2 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L54
            return
        L54:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.ui.widget.PinInputView.showOrHide():void");
    }

    private void updateEye() {
        ImageView endIcon;
        int i = 2 % 2;
        int i2 = component2 + 29;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            endIcon = getEndIcon();
            int i3 = 27 / 0;
            if (endIcon == null) {
                return;
            }
        } else {
            endIcon = getEndIcon();
            if (endIcon == null) {
                return;
            }
        }
        if (this.hidePin) {
            int i4 = component1 + 21;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                endIcon.setImageResource(R.drawable.ic_service_pin_eye);
                throw null;
            }
            endIcon.setImageResource(R.drawable.ic_service_pin_eye);
        } else {
            endIcon.setImageResource(R.drawable.ic_service_pin_eye);
        }
        String string = getEditText().getText().toString();
        if (this.hidePin && !TextUtils.isEmpty(string)) {
            int i5 = component2 + 53;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                getEditText().setTextSize(1, this.textSize % 0.6f);
            } else {
                getEditText().setTextSize(0, this.textSize * 0.6f);
            }
            getEditText().setLetterSpacing(0.6f);
            return;
        }
        getEditText().setTextSize(0, this.textSize);
        getEditText().setLetterSpacing(0.0f);
    }

    public static void m10188$r8$lambda$mA5FgcXASCBDSWc0sgfe2t2BY(PinInputView pinInputView, View view) {
        int i = 2 % 2;
        int i2 = component2 + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        m10190instrumented$0$init$V(pinInputView, view);
        int i4 = component2 + 113;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
    }

    static void m10189$$Nest$mshowOrHide(PinInputView pinInputView) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        pinInputView.showOrHide();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = component1 + 97;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void m10190instrumented$0$init$V(PinInputView pinInputView, View view) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            pinInputView.lambda$init$0(view);
            Callback.onClick_exit();
            int i4 = component2 + 107;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
