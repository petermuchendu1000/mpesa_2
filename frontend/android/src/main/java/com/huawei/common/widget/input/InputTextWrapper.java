package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.blankj.utilcode.util.KeyboardUtils;
import com.blankj.utilcode.util.ReflectUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.Utils;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.R;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.text.RegularInputFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010*\u001a\u00020+2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u000e\u0010,\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010-\u001a\u00020+2\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\tJ\b\u00100\u001a\u00020+H\u0002J\u0006\u00101\u001a\u00020#J\u0010\u00102\u001a\u00020+2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010J\u000e\u00103\u001a\u00020+2\u0006\u00104\u001a\u00020\u0014J\u0010\u00105\u001a\u00020+2\b\u00106\u001a\u0004\u0018\u00010&J\b\u00107\u001a\u00020+H\u0002R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/huawei/common/widget/input/InputTextWrapper;", "", "context", "Landroid/content/Context;", "view", "Landroid/view/View;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/view/View;Landroid/util/AttributeSet;II)V", "inputType", "inputGravity", "inputRegular", "", "inputHeight", "inputMinHeight", "inputTextEnable", "", "inputText", "inputTextTextHint", "inputTextTextHintColor", "inputTextTextSize", "inputTextTextColor", "inputTextPaddingStart", "inputTextPaddingEnd", "inputTextPaddingTop", "inputTextPaddingBottom", "inputTextMarginStart", "inputTextMarginEnd", "inputTextMarginTop", "inputTextMarginBottom", "inputView", "Landroid/widget/EditText;", "inputViewParent", "inputViewParentClickListener", "Landroid/view/View$OnClickListener;", "inputViewCurrentHint", "", "showInputViewHint", "initAttrs", "", "setInputMinHeight", "setInputType", "setInputHeight", "height", "initViews", "getInputText", "setInputText", "setInputEnable", "inputEnable", "setOnInputViewParentClickListener", "onClickListener", "fixLineHeight", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InputTextWrapper {
    private int ArtificialStackFrames;
    private int CoroutineDebuggingKt;
    private int ShareDataUIState;

    private View f2643a;
    private int accessartificialFrame;

    private View.OnClickListener f2644b;

    private CharSequence f2645c;
    private int component1;
    private String component2;
    private int component3;
    private int component4;
    private int copy;
    private String copydefault;
    private int coroutineBoundary;
    private EditText coroutineCreation;

    private boolean f2646d;
    private int equals;
    private String getARTIFICIAL_FRAME_PACKAGE_NAME;
    private int getAsAtTimestamp;
    private boolean getRequestBeneficiariesState;
    private int getShareableDataState;
    private int getSponsorBeneficiariesState;
    private int hashCode;
    private int toString;

    public InputTextWrapper(Context context, View view, AttributeSet attributeSet, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        this.coroutineBoundary = 1;
        this.ShareDataUIState = 8388627;
        this.component1 = SizeUtils.dp2px(48.0f);
        this.getRequestBeneficiariesState = true;
        this.CoroutineDebuggingKt = SizeUtils.sp2px(16.0f);
        View viewFindViewById = view.findViewById(R.id.inputView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.coroutineCreation = (EditText) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.cl_input);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.f2643a = viewFindViewById2;
        this.f2646d = true;
        component1(context, attributeSet, i, i2);
        ShareDataUIState();
    }

    private final void component1(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.InputText, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.accessartificialFrame = context.getColor(R.color.colorSecondaryText);
        this.hashCode = context.getColor(R.color.colorMainText);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            if (index == R.styleable.InputText_android_inputType) {
                this.coroutineBoundary = typedArrayObtainStyledAttributes.getInt(index, this.coroutineBoundary);
            } else if (index == R.styleable.InputText_input_gravity) {
                this.ShareDataUIState = typedArrayObtainStyledAttributes.getInt(index, this.ShareDataUIState);
            } else if (index == R.styleable.InputText_input_height) {
                this.component1 = AttrUtils.INSTANCE.getDimensionOrInt(typedArrayObtainStyledAttributes, index, this.component1);
            } else if (index == R.styleable.InputText_input_minHeight) {
                this.component3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component3);
            } else if (index == R.styleable.InputText_input_text_text_input_enable) {
                this.getRequestBeneficiariesState = typedArrayObtainStyledAttributes.getBoolean(index, this.getRequestBeneficiariesState);
            } else if (index == R.styleable.InputText_input_text) {
                this.copydefault = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R.styleable.InputText_input_regular) {
                this.component2 = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R.styleable.InputText_input_text_text_hint) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = typedArrayObtainStyledAttributes.getString(index);
            } else if (index == R.styleable.InputText_input_text_text_hint_color) {
                this.accessartificialFrame = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, index, this.accessartificialFrame);
            } else if (index == R.styleable.InputText_input_text_text_size) {
                this.CoroutineDebuggingKt = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.CoroutineDebuggingKt);
            } else if (index == R.styleable.InputText_input_text_text_color) {
                this.hashCode = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, index, this.hashCode);
            } else if (index == R.styleable.InputText_input_text_paddingStart) {
                this.toString = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.toString);
            } else if (index == R.styleable.InputText_input_text_paddingTop) {
                this.getShareableDataState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getShareableDataState);
            } else if (index == R.styleable.InputText_input_text_paddingEnd) {
                this.ArtificialStackFrames = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.ArtificialStackFrames);
            } else if (index == R.styleable.InputText_input_text_paddingBottom) {
                this.getSponsorBeneficiariesState = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getSponsorBeneficiariesState);
            } else if (index == R.styleable.InputText_input_text_marginStart) {
                this.component4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.component4);
            } else if (index == R.styleable.InputText_input_text_marginTop) {
                this.copy = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.copy);
            } else if (index == R.styleable.InputText_input_text_marginEnd) {
                this.equals = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.equals);
            } else if (index == R.styleable.InputText_input_text_marginBottom) {
                this.getAsAtTimestamp = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.getAsAtTimestamp);
            }
        }
        String attrValue = AttrUtils.INSTANCE.getAttrValue(context, attributeSet, "input_text");
        if (attrValue == null) {
            attrValue = this.copydefault;
        }
        this.copydefault = attrValue;
        String attrValue2 = AttrUtils.INSTANCE.getAttrValue(context, attributeSet, "input_text_text_hint");
        if (attrValue2 == null) {
            attrValue2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = attrValue2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setInputMinHeight(int inputMinHeight) {
        this.component3 = inputMinHeight;
        setInputHeight(this.component1);
    }

    public final void setInputType(int inputType) {
        this.coroutineBoundary = inputType;
        this.coroutineCreation.setInputType(inputType);
    }

    public final void setInputHeight(int height) {
        int iCoerceAtLeast = height > 0 ? RangesKt.coerceAtLeast(height, SizeUtils.dp2px(24.0f)) : height;
        ViewGroup.LayoutParams layoutParams = this.coroutineCreation.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = iCoerceAtLeast;
        if (height == -2) {
            int i = this.component3;
            if (i > 0) {
                this.coroutineCreation.setMinHeight(i);
            }
        } else {
            this.coroutineCreation.setSingleLine();
            this.coroutineCreation.setMaxLines(1);
            this.coroutineCreation.setEllipsize(TextUtils.TruncateAt.END);
        }
        this.coroutineCreation.setLayoutParams(marginLayoutParams);
        this.coroutineCreation.setInputType(this.coroutineBoundary);
    }

    private final void ShareDataUIState() {
        ViewUtils.adjustRTL(this.coroutineCreation);
        this.coroutineCreation.setHint(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        this.coroutineCreation.setHintTextColor(this.accessartificialFrame);
        this.coroutineCreation.setTextColor(this.hashCode);
        this.coroutineCreation.setTextSize(0, this.CoroutineDebuggingKt);
        this.coroutineCreation.setPadding(this.toString, this.getShareableDataState, this.ArtificialStackFrames, this.getSponsorBeneficiariesState);
        this.coroutineCreation.setEnabled(this.getRequestBeneficiariesState);
        setInputHeight(this.component1);
        ViewGroup.LayoutParams layoutParams = this.coroutineCreation.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(this.component4);
        marginLayoutParams.topMargin = this.copy;
        marginLayoutParams.setMarginEnd(this.equals);
        marginLayoutParams.bottomMargin = this.getAsAtTimestamp;
        setInputText(this.copydefault);
        this.f2643a.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                InputTextWrapper.component1(this.f$0, view);
            }
        });
        this.coroutineCreation.addTextChangedListener(new MPTextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                super.afterTextChanged(s);
                CharSequence hint = this.ShareDataUIState.coroutineCreation.getHint();
                if ((hint != null && hint.length() != 0) || this.ShareDataUIState.f2646d) {
                    this.ShareDataUIState.f2645c = hint;
                }
                Editable editable = s;
                if (editable == null || editable.length() == 0) {
                    this.ShareDataUIState.coroutineCreation.setHint(this.ShareDataUIState.f2645c);
                    this.ShareDataUIState.f2646d = true;
                } else {
                    this.ShareDataUIState.coroutineCreation.setHint("");
                    this.ShareDataUIState.f2646d = false;
                }
            }
        });
        if (Utils.getApp().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.coroutineCreation.setTextDirection(1);
        } else {
            this.coroutineCreation.setTextDirection(0);
        }
        InputUtils.INSTANCE.appendInputFilters(this.coroutineCreation, new RegularInputFilter(this.component2));
        copydefault();
    }

    private static final void component2(InputTextWrapper inputTextWrapper, View view) {
        View.OnClickListener onClickListener = inputTextWrapper.f2644b;
        if (onClickListener != null) {
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (inputTextWrapper.getRequestBeneficiariesState && inputTextWrapper.coroutineCreation.isEnabled()) {
            inputTextWrapper.coroutineCreation.requestFocus();
            EditText editText = inputTextWrapper.coroutineCreation;
            editText.setSelection(editText.getText().length());
            KeyboardUtils.showSoftInput(inputTextWrapper.coroutineCreation);
        }
    }

    public final EditText getCoroutineCreation() {
        return this.coroutineCreation;
    }

    public final void setInputText(String inputText) {
        this.coroutineCreation.setText(inputText);
    }

    public final void setInputEnable(boolean inputEnable) {
        this.getRequestBeneficiariesState = inputEnable;
        this.coroutineCreation.setEnabled(inputEnable);
    }

    public final void setOnInputViewParentClickListener(View.OnClickListener onClickListener) {
        this.f2644b = onClickListener;
    }

    private final void copydefault() {
        if (Build.VERSION.SDK_INT <= 34) {
            return;
        }
        try {
            ReflectUtils.reflect(this.coroutineCreation).method("setLocalePreferredLineHeightForMinimumUsed", false);
        } catch (ReflectUtils.ReflectException unused) {
        }
    }

    public static void component1(InputTextWrapper inputTextWrapper, View view) {
        Callback.onClick_enter(view);
        try {
            component2(inputTextWrapper, view);
        } finally {
            Callback.onClick_exit();
        }
    }
}
