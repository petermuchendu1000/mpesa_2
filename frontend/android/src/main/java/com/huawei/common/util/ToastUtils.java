package com.huawei.common.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.R;
import com.huawei.common.widget.toast.CommonToast;
import java.lang.ref.WeakReference;

public final class ToastUtils {
    private static WeakReference<View> equals;
    private static volatile Toast getRequestBeneficiariesState;
    private static final Handler copydefault = new Handler(Looper.getMainLooper());
    private static int getAsAtTimestamp = 0;
    private static int toString = 0;
    private static int copy = 17;
    private static final int component2 = -16777217;
    private static int ShareDataUIState = component2;
    private static int component1 = -1;
    private static int component4 = component2;
    private static int component3 = R.layout.common_toast;

    private ToastUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void setGlobalLayout(int i) {
        component3 = i;
    }

    public static void setView(int i) {
        equals = new WeakReference<>(((LayoutInflater) Utils.getApp().getSystemService("layout_inflater")).inflate(i, (ViewGroup) null));
    }

    public static void setGravity(int i, int i2, int i3) {
        copy = i;
        getAsAtTimestamp = i2;
        toString = i3;
    }

    public static void setView(View view) {
        equals = view == null ? null : new WeakReference<>(view);
    }

    public static View getView() {
        WeakReference<View> weakReference = equals;
        View view = weakReference != null ? weakReference.get() : null;
        return (view != null || getRequestBeneficiariesState == null) ? view : getRequestBeneficiariesState.getView();
    }

    @Deprecated
    public static void setBackgroundColor(int i) {
        ShareDataUIState = i;
    }

    @Deprecated
    public static void setBackgroundResource(int i) {
        component1 = i;
    }

    @Deprecated
    public static void setMessageColor(int i) {
        component4 = i;
    }

    public static void showShortSafe(final CharSequence charSequence) {
        copydefault.post(new Runnable() {
            @Override
            public final void run() {
                ToastUtils.component3(charSequence, 0);
            }
        });
    }

    public static void showShortSafe(final int i) {
        copydefault.post(new Runnable() {
            @Override
            public final void run() {
                ToastUtils.component3(i, 0);
            }
        });
    }

    public static void showShortSafe(final int i, final Object... objArr) {
        copydefault.post(new Runnable() {
            @Override
            public final void run() {
                ToastUtils.component3(i, 0, objArr);
            }
        });
    }

    public static void showShortSafe(final String str, final Object... objArr) {
        copydefault.post(new Runnable() {
            @Override
            public final void run() {
                ToastUtils.ShareDataUIState(str, 0, objArr);
            }
        });
    }

    public static void showLongSafe(final CharSequence charSequence) {
        copydefault.post(new Runnable() {
            @Override
            public final void run() {
                ToastUtils.component3(charSequence, 1);
            }
        });
    }

    public static void showLongSafe(final int i) {
        copydefault.post(new Runnable() {
            @Override
            public final void run() {
                ToastUtils.component3(i, 1);
            }
        });
    }

    public static void showLongSafe(final int i, final Object... objArr) {
        copydefault.post(new Runnable() {
            @Override
            public final void run() {
                ToastUtils.component3(i, 1, objArr);
            }
        });
    }

    public static void showLongSafe(final String str, final Object... objArr) {
        copydefault.post(new Runnable() {
            @Override
            public final void run() {
                ToastUtils.ShareDataUIState(str, 1, objArr);
            }
        });
    }

    public static void showShort(CharSequence charSequence) {
        component3(charSequence, 1);
    }

    public static void showShort(int i) {
        component3(i, 0);
    }

    public static void showShort(int i, Object... objArr) {
        component3(i, 0, objArr);
    }

    public static void showShort(String str, Object... objArr) {
        ShareDataUIState(str, 0, objArr);
    }

    public static Toast showShort(Context context, CharSequence charSequence) {
        if (getRequestBeneficiariesState == null) {
            getRequestBeneficiariesState = Toast.makeText(context, charSequence, 0);
        } else {
            getRequestBeneficiariesState.setText(charSequence);
        }
        getRequestBeneficiariesState.show();
        return getRequestBeneficiariesState;
    }

    public static void showLong(CharSequence charSequence) {
        component3(charSequence, 1);
    }

    public static void showLong(int i) {
        component3(i, 1);
    }

    public static void showLong(int i, Object... objArr) {
        component3(i, 1, objArr);
    }

    public static void showLong(String str, Object... objArr) {
        ShareDataUIState(str, 1, objArr);
    }

    public static void showCustomShortSafe(final int i) {
        copydefault.post(new Runnable() {
            @Override
            public final void run() {
                ToastUtils.component3(i);
            }
        });
    }

    static void component3(int i) {
        setView(i);
        component3("", 0);
    }

    public static void showCustomShortSafe(final View view) {
        copydefault.post(new Runnable() {
            @Override
            public final void run() {
                ToastUtils.component2(view);
            }
        });
    }

    static void component2(View view) {
        setView(view);
        component3("", 0);
    }

    public static void showCustomLongSafe(final int i) {
        copydefault.post(new Runnable() {
            @Override
            public final void run() {
                ToastUtils.copydefault(i);
            }
        });
    }

    static void copydefault(int i) {
        setView(i);
        component3("", 1);
    }

    public static void showCustomShort(int i) {
        setView(i);
        component3("", 0);
    }

    public static void showCustomLongSafe(final View view) {
        copydefault.post(new Runnable() {
            @Override
            public void run() {
                ToastUtils.setView(view);
                ToastUtils.component3("", 1);
            }
        });
    }

    public static void showCustomLong(int i) {
        setView(i);
        component3("", 1);
    }

    public static void showCustomShort(View view) {
        setView(view);
        component3("", 0);
    }

    public static void component3(int i, int i2) {
        component3(Utils.getApp().getResources().getText(i).toString(), i2);
    }

    public static void showCustomLong(View view) {
        setView(view);
        component3("", 1);
    }

    public static void ShareDataUIState(String str, int i, Object... objArr) {
        component3(String.format(str, objArr), i);
    }

    public static void component3(int i, int i2, Object... objArr) {
        component3(String.format(Utils.getApp().getResources().getString(i), objArr), i2);
    }

    public static void component3(CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        cancel();
        CommonToast.showText(String.valueOf(charSequence));
    }

    public static void cancel() {
        if (getRequestBeneficiariesState != null) {
            getRequestBeneficiariesState.cancel();
            getRequestBeneficiariesState = null;
        }
        CommonToast.cancel();
    }
}
