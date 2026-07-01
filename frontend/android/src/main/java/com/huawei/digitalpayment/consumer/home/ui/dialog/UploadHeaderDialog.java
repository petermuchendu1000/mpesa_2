package com.huawei.digitalpayment.consumer.home.ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.widget.dialog.BaseDialog;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.homeui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/dialog/UploadHeaderDialog;", "Lcom/huawei/common/widget/dialog/BaseDialog;", "builder", "Lcom/huawei/digitalpayment/consumer/home/ui/dialog/UploadHeaderDialog$Builder;", "<init>", "(Lcom/huawei/digitalpayment/consumer/home/ui/dialog/UploadHeaderDialog$Builder;)V", "takePhotoClickListener", "Landroid/view/View$OnClickListener;", "getLayoutId", "", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Builder", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UploadHeaderDialog extends BaseDialog {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private View.OnClickListener copydefault;

    private UploadHeaderDialog(Builder builder) {
        this.copydefault = builder.getTakePhotoClickListener();
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = R.layout.dialog_upload_header;
            obj.hashCode();
            throw null;
        }
        int i4 = R.layout.dialog_upload_header;
        int i5 = ShareDataUIState + 117;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        throw null;
    }

    @Override
    public void onStart() {
        Window window;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            int i4 = ShareDataUIState + 47;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                window = dialog.getWindow();
                int i5 = 5 / 0;
                if (window == null) {
                    return;
                }
            } else {
                window = dialog.getWindow();
                if (window == null) {
                    return;
                }
            }
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setWindowAnimations(R.style.BottomAnimation);
            dialog.setCanceledOnTouchOutside(true);
            dialog.setCancelable(true);
        }
    }

    private static final void copydefault(UploadHeaderDialog uploadHeaderDialog, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uploadHeaderDialog, "");
        uploadHeaderDialog.dismiss();
        int i4 = ShareDataUIState + 95;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        RoundTextView roundTextView = (RoundTextView) view.findViewById(R.id.btn_skip);
        RoundTextView roundTextView2 = (RoundTextView) view.findViewById(R.id.btnTakePhoto);
        roundTextView.setOnClickListener(new UploadHeaderDialog$$ExternalSyntheticLambda0(this));
        roundTextView2.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onClick(View view2) {
                int i2 = 2 % 2;
                int i3 = component1 + 7;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                UploadHeaderDialog.m10508$r8$lambda$M2CocHBiGlEOO9OaFpTO0qHoek(this.f$0, view2);
                int i5 = component3 + 87;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void component2(UploadHeaderDialog uploadHeaderDialog, View view) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(uploadHeaderDialog, "");
        View.OnClickListener onClickListener = uploadHeaderDialog.copydefault;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            int i4 = component1 + 33;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        uploadHeaderDialog.dismiss();
    }

    public static void m10508$r8$lambda$M2CocHBiGlEOO9OaFpTO0qHoek(UploadHeaderDialog uploadHeaderDialog, View view) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(uploadHeaderDialog, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public static void m10509$r8$lambda$wgquPthlrUwPbpr3zSaxCT67PI(UploadHeaderDialog uploadHeaderDialog, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        component3(uploadHeaderDialog, view);
        if (i3 == 0) {
            throw null;
        }
    }

    static {
        int i = 1 + 67;
        component2 = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u000b\u001a\u00020\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/dialog/UploadHeaderDialog$Builder;", "", "<init>", "()V", "takePhotoClickListener", "Landroid/view/View$OnClickListener;", "getTakePhotoClickListener", "()Landroid/view/View$OnClickListener;", "setTakePhotoClickListener", "(Landroid/view/View$OnClickListener;)V", "setTakePhotoClickListenerClickListener", "build", "Lcom/huawei/digitalpayment/consumer/home/ui/dialog/UploadHeaderDialog;", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component1 = 37 % 128;
        private static int component2 = 0;
        private static int copydefault = 1;
        private View.OnClickListener component3;

        public final View.OnClickListener getTakePhotoClickListener() {
            int i = 2 % 2;
            int i2 = copydefault + 79;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component3;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setTakePhotoClickListener(View.OnClickListener onClickListener) {
            int i = 2 % 2;
            int i2 = copydefault + 75;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.component3 = onClickListener;
            if (i3 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setTakePhotoClickListenerClickListener(View.OnClickListener takePhotoClickListener) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 111;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            this.component3 = takePhotoClickListener;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 47;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 86 / 0;
            }
            return this;
        }

        public final UploadHeaderDialog build() {
            int i = 2 % 2;
            UploadHeaderDialog uploadHeaderDialog = new UploadHeaderDialog(this, null);
            int i2 = copydefault + 17;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 86 / 0;
            }
            return uploadHeaderDialog;
        }

        static {
            int i = 37 % 2;
        }
    }

    public UploadHeaderDialog(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    private static void component3(UploadHeaderDialog uploadHeaderDialog, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                copydefault(uploadHeaderDialog, view);
                Callback.onClick_exit();
            } else {
                copydefault(uploadHeaderDialog, view);
                Callback.onClick_exit();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void ShareDataUIState(UploadHeaderDialog uploadHeaderDialog, View view) {
        int i = 2 % 2;
        int i2 = component1 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                component2(uploadHeaderDialog, view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            component2(uploadHeaderDialog, view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 125;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
