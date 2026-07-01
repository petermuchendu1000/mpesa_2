package com.huawei.digitalpayment.consumer.push_ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.digitalpayment.consumer.push_ui.R;

public abstract class NotificationDialogDeleteConfirmBinding extends ViewDataBinding {
    private static int component1 = 1;
    private static int component2;
    public final TextView tvCancel;
    public final TextView tvConfirm;

    protected NotificationDialogDeleteConfirmBinding(Object obj, View view, int i, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.tvCancel = textView;
        this.tvConfirm = textView2;
    }

    public static NotificationDialogDeleteConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 63;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        NotificationDialogDeleteConfirmBinding notificationDialogDeleteConfirmBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return notificationDialogDeleteConfirmBindingInflate;
    }

    @Deprecated
    public static NotificationDialogDeleteConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        NotificationDialogDeleteConfirmBinding notificationDialogDeleteConfirmBinding = (NotificationDialogDeleteConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.notification_dialog_delete_confirm, viewGroup, z, obj);
        int i4 = component2 + 5;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return notificationDialogDeleteConfirmBinding;
    }

    public static NotificationDialogDeleteConfirmBinding inflate(LayoutInflater layoutInflater) {
        NotificationDialogDeleteConfirmBinding notificationDialogDeleteConfirmBindingInflate;
        int i = 2 % 2;
        int i2 = component1 + 103;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            notificationDialogDeleteConfirmBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
            int i3 = 77 / 0;
        } else {
            notificationDialogDeleteConfirmBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        }
        int i4 = component2 + 111;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
        return notificationDialogDeleteConfirmBindingInflate;
    }

    @Deprecated
    public static NotificationDialogDeleteConfirmBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        NotificationDialogDeleteConfirmBinding notificationDialogDeleteConfirmBinding = (NotificationDialogDeleteConfirmBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.notification_dialog_delete_confirm, null, false, obj);
        int i4 = component2 + 83;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return notificationDialogDeleteConfirmBinding;
        }
        obj2.hashCode();
        throw null;
    }

    public static NotificationDialogDeleteConfirmBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NotificationDialogDeleteConfirmBinding notificationDialogDeleteConfirmBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 113;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return notificationDialogDeleteConfirmBindingBind;
    }

    @Deprecated
    public static NotificationDialogDeleteConfirmBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        NotificationDialogDeleteConfirmBinding notificationDialogDeleteConfirmBinding = (NotificationDialogDeleteConfirmBinding) bind(obj, view, R.layout.notification_dialog_delete_confirm);
        int i4 = component2 + 41;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return notificationDialogDeleteConfirmBinding;
        }
        throw null;
    }
}
