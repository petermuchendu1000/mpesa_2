package com.huawei.common.widget.keyboard;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.huawei.common.util.L;
import com.huawei.common.widget.code.CodeWithErrorInputView;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class KeyBroadUtils {
    public static void disableInput(Activity activity, EditText editText) {
        activity.getWindow().setSoftInputMode(3);
        try {
            final Method method = EditText.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            AccessController.doPrivileged(new PrivilegedAction<Void>() {
                @Override
                public Void run() {
                    method.setAccessible(true);
                    return null;
                }
            });
            method.invoke(editText, false);
        } catch (Exception e) {
            L.d("=====", e.getMessage());
        }
    }

    public static void disableInput(Activity activity, CodeWithErrorInputView codeWithErrorInputView) {
        disableInput(activity, codeWithErrorInputView.getCodeInputView());
    }

    public static void setViewLayoutParams(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams.height == i2 && layoutParams.width == i) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }
}
