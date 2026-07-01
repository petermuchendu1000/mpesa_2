package com.huawei.digitalpayment.consumer.baselib.util;

import android.R;
import android.app.Activity;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.StringUtils;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.util.FastClickUtils;
import com.huawei.common.util.ViewUtils;
import com.huawei.digitalpayment.consumer.baselib.databinding.WebLoadFailedBinding;

public class LoadUtils {
    private static int component2 = 0;
    private static int copydefault = 1;

    private static void component1(Activity activity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        activity.finish();
        int i4 = copydefault + 13;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void component2(View.OnClickListener onClickListener, ViewGroup viewGroup, WebLoadFailedBinding webLoadFailedBinding, View view) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            int i4 = component2 + 113;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
        viewGroup.removeView(webLoadFailedBinding.getRoot());
    }

    public static void showError(final Activity activity, final View.OnClickListener onClickListener) {
        int i = 2 % 2;
        final ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        final WebLoadFailedBinding webLoadFailedBinding = (WebLoadFailedBinding) DataBindingUtil.inflate(activity.getLayoutInflater(), com.huawei.digitalpayment.consumer.baselib.R.layout.web_load_failed, viewGroup, false);
        String string = StringUtils.getString(com.huawei.digitalpayment.consumer.baselib.R.string.basic_refresh);
        SpannableString spannableString = new SpannableString(StringUtils.getString(com.huawei.digitalpayment.consumer.baselib.R.string.basic_loading_failed_please_s, string));
        SpannableStringUtils.INSTANCE.color(spannableString, ColorUtils.getColor(com.huawei.digitalpayment.consumer.baselib.R.color.colorPrimary), string);
        webLoadFailedBinding.tvTips.setText(spannableString);
        webLoadFailedBinding.toobar.getRoot().getLayoutParams().height = ViewUtils.getStatusBarHeight() + BarUtils.getActionBarHeight();
        webLoadFailedBinding.toobar.ivBack.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 41;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                LoadUtils.$r8$lambda$zKSxkNIVZ4wChCgitJvteoWPBVE(activity, view);
                if (i4 == 0) {
                    throw null;
                }
            }
        });
        FastClickUtils.setOnClickListener(webLoadFailedBinding.tvTips, new View.OnClickListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 27;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                View.OnClickListener onClickListener2 = onClickListener;
                if (i4 == 0) {
                    LoadUtils.$r8$lambda$Ymk3JNpXGueh2wyqLkiWH9D4pgE(onClickListener2, viewGroup, webLoadFailedBinding, view);
                } else {
                    LoadUtils.$r8$lambda$Ymk3JNpXGueh2wyqLkiWH9D4pgE(onClickListener2, viewGroup, webLoadFailedBinding, view);
                    throw null;
                }
            }
        });
        viewGroup.addView(webLoadFailedBinding.getRoot());
        int i2 = copydefault + 113;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$Ymk3JNpXGueh2wyqLkiWH9D4pgE(View.OnClickListener onClickListener, ViewGroup viewGroup, WebLoadFailedBinding webLoadFailedBinding, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        component3(onClickListener, viewGroup, webLoadFailedBinding, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$zKSxkNIVZ4wChCgitJvteoWPBVE(Activity activity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        component3(activity, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    private static void component3(Activity activity, View view) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                component1(activity, view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            component1(activity, view);
            Callback.onClick_exit();
            int i4 = component2 + 121;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void component3(View.OnClickListener onClickListener, ViewGroup viewGroup, WebLoadFailedBinding webLoadFailedBinding, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            component2(onClickListener, viewGroup, webLoadFailedBinding, view);
            Callback.onClick_exit();
            int i4 = copydefault + 61;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
