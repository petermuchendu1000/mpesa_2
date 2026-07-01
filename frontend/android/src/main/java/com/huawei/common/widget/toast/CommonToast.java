package com.huawei.common.widget.toast;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.R;
import com.huawei.common.util.color.ColorUtils;
import java.lang.ref.WeakReference;

public class CommonToast {
    private static volatile WeakReference<Toast> component2 = null;
    private static final int component3 = -1;
    private int ArtificialStackFrames;
    private int ShareDataUIState;
    private int component1;
    private int component4;
    private String copy;
    private Drawable copydefault;
    private int equals;
    private int getAsAtTimestamp;
    private boolean getRequestBeneficiariesState;
    private int hashCode;

    public static void showText(int i) {
        showText(Utils.getApp().getString(i));
    }

    public static void showText(String str) {
        show(str, (Drawable) null);
    }

    public static void show(int i, int i2) {
        show(Utils.getApp().getString(i), i2);
    }

    public static void show(int i, Drawable drawable) {
        show(Utils.getApp().getString(i), drawable);
    }

    public static void show(String str, int i) {
        show(str, AppCompatResources.getDrawable(Utils.getApp(), i));
    }

    public static void show(String str, Drawable drawable) {
        builder().setText(str).setIcon(drawable).setGravity(17, 0, 0).show();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static void cancel() {
        Toast toast;
        synchronized (CommonToast.class) {
            if (component2 != null && (toast = component2.get()) != null) {
                toast.cancel();
                component2.clear();
                component2 = null;
            }
        }
    }

    private CommonToast() {
        this.copydefault = null;
        this.getAsAtTimestamp = SizeUtils.dp2px(24.0f);
        this.equals = SizeUtils.dp2px(24.0f);
        this.getRequestBeneficiariesState = false;
        this.component4 = -1;
        this.ShareDataUIState = 17;
        this.ArtificialStackFrames = 0;
        this.hashCode = 0;
        this.component1 = -1;
    }

    public void show() {
        if (TextUtils.isEmpty(this.copy)) {
            return;
        }
        cancel();
        View viewInflate = LayoutInflater.from(Utils.getApp()).inflate(R.layout.common_toast_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_content);
        if (textView == null) {
            return;
        }
        textView.setBackgroundColor(ColorUtils.INSTANCE.withAlpha(0.8f, com.blankj.utilcode.util.ColorUtils.getColor(R.color.colorMainText)));
        int iDp2px = ConvertUtils.dp2px(16.0f);
        int iDp2px2 = ConvertUtils.dp2px(8.0f);
        if (this.component4 != -1) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = this.component4;
            textView.setLayoutParams(layoutParams);
        }
        textView.setText(this.copy);
        textView.setMaxLines(this.getRequestBeneficiariesState ? 1 : Integer.MAX_VALUE);
        if (!this.getRequestBeneficiariesState && this.copydefault != null) {
            iDp2px2 = iDp2px;
        }
        textView.setPadding(iDp2px, iDp2px2, iDp2px, iDp2px2);
        copydefault(textView);
        Toast toast = new Toast(Utils.getApp());
        toast.setView(viewInflate);
        toast.setGravity(this.ShareDataUIState, this.ArtificialStackFrames, this.hashCode);
        ShareDataUIState(toast);
        toast.show();
        component2 = new WeakReference<>(toast);
    }

    private void copydefault(TextView textView) {
        Drawable drawable = this.copydefault;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.getAsAtTimestamp, this.equals);
            if (this.getRequestBeneficiariesState) {
                if (Utils.getApp().getResources().getConfiguration().getLayoutDirection() == 1) {
                    textView.setCompoundDrawables(null, null, this.copydefault, null);
                    return;
                } else {
                    textView.setCompoundDrawables(this.copydefault, null, null, null);
                    return;
                }
            }
            textView.setCompoundDrawables(null, this.copydefault, null, null);
        }
    }

    private void ShareDataUIState(Toast toast) {
        int i = this.component1;
        if (i == 1) {
            toast.setDuration(1);
        } else if (i == 0) {
            toast.setDuration(0);
        } else {
            toast.setDuration(!this.getRequestBeneficiariesState ? 1 : 0);
        }
    }

    public static class Builder {
        private final CommonToast copydefault;

        private Builder() {
            this.copydefault = new CommonToast();
        }

        public CommonToast build() {
            return this.copydefault;
        }

        public CommonToast show() {
            this.copydefault.show();
            return this.copydefault;
        }

        public CommonToast showLong() {
            return setDuration(1).show();
        }

        public Builder setText(String str) {
            this.copydefault.copy = str;
            return this;
        }

        public Builder setIcon(Drawable drawable) {
            this.copydefault.copydefault = drawable;
            return this;
        }

        public Builder setIcon(int i) {
            this.copydefault.copydefault = AppCompatResources.getDrawable(Utils.getApp(), i);
            return this;
        }

        public Builder setIcon(Bitmap bitmap) {
            this.copydefault.copydefault = new BitmapDrawable(Utils.getApp().getResources(), bitmap);
            return this;
        }

        public Builder setIconSize(int i, int i2) {
            this.copydefault.getAsAtTimestamp = i;
            this.copydefault.equals = i2;
            return this;
        }

        public Builder setSingleDisplay(boolean z) {
            this.copydefault.getRequestBeneficiariesState = z;
            return this;
        }

        public Builder setWidth(int i) {
            this.copydefault.component4 = i;
            return this;
        }

        public Builder setGravity(int i, int i2, int i3) {
            this.copydefault.ShareDataUIState = i;
            this.copydefault.ArtificialStackFrames = i2;
            this.copydefault.hashCode = i3;
            return this;
        }

        public Builder setDuration(int i) {
            this.copydefault.component1 = i;
            return this;
        }
    }
}
