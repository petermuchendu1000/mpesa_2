package com.huawei.common.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.blankj.utilcode.util.StringUtils;
import com.huawei.common.R;
import com.huawei.common.util.L;
import com.huawei.common.util.font.FontManager;
import com.huawei.common.util.skin.SkinManager;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.code.CodeWithErrorInputView;
import com.huawei.common.widget.input.CommonInputView;

public class BaseInflaterFactory implements LayoutInflater.Factory2 {
    private final AppCompatDelegate component3;
    private final LayoutInflater copydefault;

    @Override
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    public BaseInflaterFactory(AppCompatActivity appCompatActivity) {
        this.component3 = appCompatActivity.getDelegate();
        this.copydefault = appCompatActivity.getLayoutInflater();
    }

    @Override
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewComponent3 = component3(view, str, context, attributeSet);
        SkinManager.INSTANCE.onCreateView(viewComponent3, attributeSet);
        copydefault(viewComponent3, context, attributeSet);
        component3(viewComponent3, context, attributeSet);
        return viewComponent3;
    }

    private void component3(View view, Context context, AttributeSet attributeSet) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            for (int i = 0; i < attributeSet.getAttributeCount(); i++) {
                copydefault(context, attributeSet, textView, i);
            }
        }
        if (view instanceof LoadingButton) {
            LoadingButton loadingButton = (LoadingButton) view;
            for (int i2 = 0; i2 < attributeSet.getAttributeCount(); i2++) {
                component1(context, attributeSet, loadingButton, i2);
            }
        }
        if (view instanceof CommonInputView) {
            CommonInputView commonInputView = (CommonInputView) view;
            for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
                component3(context, attributeSet, commonInputView, i3);
            }
        }
    }

    private void copydefault(View view, Context context, AttributeSet attributeSet) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            FontManager.INSTANCE.setTextStyle(textView, component2(context, attributeSet, textView));
        }
        if (view instanceof LoadingButton) {
            LoadingButton loadingButton = (LoadingButton) view;
            FontManager.INSTANCE.setTextStyle(loadingButton.textView, component2(context, attributeSet, loadingButton));
        }
        if (view instanceof CommonInputView) {
            CommonInputView commonInputView = (CommonInputView) view;
            FontManager.INSTANCE.setTextStyle(commonInputView.getEditText(), component2(context, attributeSet, commonInputView));
        }
        if (view instanceof CodeWithErrorInputView) {
            CodeWithErrorInputView codeWithErrorInputView = (CodeWithErrorInputView) view;
            FontManager.INSTANCE.setTextStyle(codeWithErrorInputView.getCodeInputView(), component2(context, attributeSet, codeWithErrorInputView));
        }
    }

    private static int component2(Context context, AttributeSet attributeSet, View view) {
        Typeface typeface = view instanceof TextView ? ((TextView) view).getTypeface() : null;
        if (view instanceof LoadingButton) {
            typeface = ((LoadingButton) view).getTextView().getTypeface();
        }
        if (view instanceof CommonInputView) {
            typeface = ((CommonInputView) view).getEditText().getTypeface();
        }
        if (typeface != null && typeface.isBold()) {
            return 2;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TextStyle);
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.TextStyle_text_style)) {
            int i = typedArrayObtainStyledAttributes.getInt(R.styleable.TextStyle_text_style, 0);
            typedArrayObtainStyledAttributes.recycle();
            return i;
        }
        typedArrayObtainStyledAttributes.recycle();
        return 0;
    }

    private View component3(View view, String str, Context context, AttributeSet attributeSet) {
        View viewCreateView = this.component3.createView(view, str, context, attributeSet);
        if (viewCreateView != null) {
            return viewCreateView;
        }
        try {
            return this.copydefault.createView(str, null, attributeSet);
        } catch (Exception e) {
            L.d("PaymentInflaterFactory", "getView: " + e.getMessage());
            return viewCreateView;
        }
    }

    private static void component1(Context context, AttributeSet attributeSet, LoadingButton loadingButton, int i) {
        int i2;
        String attributeValue = attributeSet.getAttributeValue(i);
        String attributeName = attributeSet.getAttributeName(i);
        if (attributeValue.startsWith(AUScreenAdaptTool.PREFIX_ID) && (i2 = Integer.parseInt(attributeValue.substring(1))) != 0 && TypedValues.Custom.S_STRING.equals(context.getResources().getResourceTypeName(i2)) && "lb_text".equals(attributeName)) {
            loadingButton.setText(StringUtils.getString(i2));
        }
    }

    private static void component3(Context context, AttributeSet attributeSet, CommonInputView commonInputView, int i) {
        int i2;
        TextView endUnit;
        String attributeValue = attributeSet.getAttributeValue(i);
        String attributeName = attributeSet.getAttributeName(i);
        if (attributeValue.startsWith(AUScreenAdaptTool.PREFIX_ID) && (i2 = Integer.parseInt(attributeValue.substring(1))) != 0 && TypedValues.Custom.S_STRING.equals(context.getResources().getResourceTypeName(i2))) {
            String string = StringUtils.getString(i2);
            if ("input_text".equals(attributeName)) {
                commonInputView.getEditText().setText(string);
                return;
            }
            if ("input_text_text_hint".equals(attributeName)) {
                commonInputView.getEditText().setHint(string);
                return;
            }
            if ("input_title".equals(attributeName)) {
                commonInputView.setTitle(string);
                return;
            }
            if ("input_error".equals(attributeName)) {
                commonInputView.showError(string);
                return;
            }
            if ("input_start_unit_text".equals(attributeName)) {
                TextView startUnit = commonInputView.getStartUnit();
                if (startUnit != null) {
                    startUnit.setText(string);
                    return;
                }
                return;
            }
            if (!"input_end_unit_text".equals(attributeName) || (endUnit = commonInputView.getEndUnit()) == null) {
                return;
            }
            endUnit.setText(string);
        }
    }

    private static void copydefault(Context context, AttributeSet attributeSet, TextView textView, int i) {
        int i2;
        String attributeValue = attributeSet.getAttributeValue(i);
        String attributeName = attributeSet.getAttributeName(i);
        if (attributeValue.startsWith(AUScreenAdaptTool.PREFIX_ID) && (i2 = Integer.parseInt(attributeValue.substring(1))) != 0 && TypedValues.Custom.S_STRING.equals(context.getResources().getResourceTypeName(i2))) {
            if ("text".equals(attributeName)) {
                textView.setText(StringUtils.getString(i2));
            } else if ("hint".equals(attributeName)) {
                textView.setHint(StringUtils.getString(i2));
            }
        }
    }
}
