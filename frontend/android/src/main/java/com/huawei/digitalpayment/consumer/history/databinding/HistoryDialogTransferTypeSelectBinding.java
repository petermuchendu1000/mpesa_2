package com.huawei.digitalpayment.consumer.history.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.digitalpayment.consumer.history.R;

public abstract class HistoryDialogTransferTypeSelectBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final LoadingButton btnConfirm;
    public final ImageView imClose;
    public final RecyclerView recyclerView;
    public final RelativeLayout rlTop;
    public final TextView tvTitle;

    protected HistoryDialogTransferTypeSelectBinding(Object obj, View view, int i, LoadingButton loadingButton, ImageView imageView, RecyclerView recyclerView, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i);
        this.btnConfirm = loadingButton;
        this.imClose = imageView;
        this.recyclerView = recyclerView;
        this.rlTop = relativeLayout;
        this.tvTitle = textView;
    }

    public static HistoryDialogTransferTypeSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static HistoryDialogTransferTypeSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        HistoryDialogTransferTypeSelectBinding historyDialogTransferTypeSelectBinding = (HistoryDialogTransferTypeSelectBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.history_dialog_transfer_type_select, viewGroup, z, obj);
        int i4 = component1 + 15;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return historyDialogTransferTypeSelectBinding;
    }

    public static HistoryDialogTransferTypeSelectBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        HistoryDialogTransferTypeSelectBinding historyDialogTransferTypeSelectBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 23;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return historyDialogTransferTypeSelectBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static HistoryDialogTransferTypeSelectBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 3;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.history_dialog_transfer_type_select;
            z = true;
        } else {
            i = R.layout.history_dialog_transfer_type_select;
            z = false;
        }
        return (HistoryDialogTransferTypeSelectBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static HistoryDialogTransferTypeSelectBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        throw null;
    }

    @Deprecated
    public static HistoryDialogTransferTypeSelectBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        HistoryDialogTransferTypeSelectBinding historyDialogTransferTypeSelectBinding = (HistoryDialogTransferTypeSelectBinding) bind(obj, view, R.layout.history_dialog_transfer_type_select);
        int i4 = component1 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return historyDialogTransferTypeSelectBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
