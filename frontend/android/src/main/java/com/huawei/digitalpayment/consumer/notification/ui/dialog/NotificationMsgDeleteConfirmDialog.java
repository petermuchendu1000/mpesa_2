package com.huawei.digitalpayment.consumer.notification.ui.dialog;

import android.os.Bundle;
import android.view.View;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.widget.dialog.BottomDialog;
import com.huawei.digitalpayment.consumer.push_ui.R;
import com.huawei.digitalpayment.consumer.push_ui.databinding.NotificationDialogDeleteConfirmBinding;

public class NotificationMsgDeleteConfirmDialog extends BottomDialog<NotificationDialogDeleteConfirmBinding> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private View.OnClickListener component1;

    public void setOnClickListener(View.OnClickListener onClickListener) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.component1 = onClickListener;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 79;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.notification_dialog_delete_confirm;
        if (i3 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void component3(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        dismiss();
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        super.onViewCreated(view, bundle);
        ((NotificationDialogDeleteConfirmBinding) this.binding).tvCancel.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onClick(View view2) {
                int i2 = 2 % 2;
                int i3 = component1 + 93;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                NotificationMsgDeleteConfirmDialog.$r8$lambda$RZmVHaYcaVDTtC2DbuX82QAU20o(this.f$0, view2);
                int i5 = component1 + 77;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((NotificationDialogDeleteConfirmBinding) this.binding).tvConfirm.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view2) {
                int i2 = 2 % 2;
                int i3 = component3 + 23;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                NotificationMsgDeleteConfirmDialog.$r8$lambda$vsoRyqgfKbbVXjmrI5P7L8shnFA(this.f$0, view2);
                if (i4 != 0) {
                    int i5 = 91 / 0;
                }
            }
        });
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void copydefault(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        dismiss();
        View.OnClickListener onClickListener = this.component1;
        if (onClickListener != null) {
            int i4 = copydefault + 109;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            onClickListener.onClick(view);
            if (i5 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = copydefault + 89;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public static void $r8$lambda$RZmVHaYcaVDTtC2DbuX82QAU20o(NotificationMsgDeleteConfirmDialog notificationMsgDeleteConfirmDialog, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        copydefault(notificationMsgDeleteConfirmDialog, view);
        int i4 = ShareDataUIState + 77;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
    }

    public static void $r8$lambda$vsoRyqgfKbbVXjmrI5P7L8shnFA(NotificationMsgDeleteConfirmDialog notificationMsgDeleteConfirmDialog, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        component3(notificationMsgDeleteConfirmDialog, view);
        int i4 = ShareDataUIState + 57;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void copydefault(NotificationMsgDeleteConfirmDialog notificationMsgDeleteConfirmDialog, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                notificationMsgDeleteConfirmDialog.component3(view);
            } else {
                notificationMsgDeleteConfirmDialog.component3(view);
                Callback.onClick_exit();
                throw null;
            }
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void component3(NotificationMsgDeleteConfirmDialog notificationMsgDeleteConfirmDialog, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                notificationMsgDeleteConfirmDialog.copydefault(view);
                Callback.onClick_exit();
                throw null;
            }
            notificationMsgDeleteConfirmDialog.copydefault(view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 75;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
