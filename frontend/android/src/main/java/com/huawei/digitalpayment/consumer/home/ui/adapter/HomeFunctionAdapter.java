package com.huawei.digitalpayment.consumer.home.ui.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.baselib.widget.holder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.homeui.databinding.ItemHomePinFunctionBinding;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.util.FunctionUtils;
import com.huawei.image.util.GlideUtils;
import java.util.List;

public class HomeFunctionAdapter extends RecyclerView.Adapter<BaseViewHolder<ItemHomePinFunctionBinding>> {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final List<LocalHomeFunction> component3;

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((BaseViewHolder<ItemHomePinFunctionBinding>) viewHolder, i);
        int i5 = component1 + 69;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 107;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            onCreateViewHolder(viewGroup, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BaseViewHolder<ItemHomePinFunctionBinding> baseViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        int i4 = component1 + 67;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return baseViewHolderOnCreateViewHolder;
    }

    public HomeFunctionAdapter(List<LocalHomeFunction> list) {
        this.component3 = list;
    }

    @Override
    public BaseViewHolder<ItemHomePinFunctionBinding> onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        BaseViewHolder<ItemHomePinFunctionBinding> baseViewHolder = new BaseViewHolder<>(ItemHomePinFunctionBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        int i3 = component1 + 59;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return baseViewHolder;
    }

    public void onBindViewHolder(BaseViewHolder<ItemHomePinFunctionBinding> baseViewHolder, int i) {
        int i2;
        int i3 = 2 % 2;
        final LocalHomeFunction localHomeFunction = this.component3.get(i);
        ItemHomePinFunctionBinding itemHomePinFunctionBinding = (ItemHomePinFunctionBinding) baseViewHolder.binding;
        itemHomePinFunctionBinding.tvFunctionName.setText(localHomeFunction.getFuncName());
        itemHomePinFunctionBinding.tvRedDot.setText(localHomeFunction.getMarker());
        RoundTextView roundTextView = itemHomePinFunctionBinding.tvRedDot;
        if (TextUtils.isEmpty(localHomeFunction.getMarker())) {
            int i4 = ShareDataUIState;
            int i5 = i4 + 3;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 45;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            i2 = 8;
        } else {
            i2 = 0;
        }
        roundTextView.setVisibility(i2);
        GlideUtils.setFunctionIcon(itemHomePinFunctionBinding.ivFunctionIcon, localHomeFunction.getFunIcon(), R.mipmap.icon_default_function);
        itemHomePinFunctionBinding.getRoot().setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i9 = 2 % 2;
                int i10 = copydefault + 119;
                ShareDataUIState = i10 % 128;
                if (i10 % 2 != 0) {
                    HomeFunctionAdapter.$r8$lambda$9Cimt60zjt2NHYOhGqWGWbVWS3I(localHomeFunction, view);
                    int i11 = 6 / 0;
                } else {
                    HomeFunctionAdapter.$r8$lambda$9Cimt60zjt2NHYOhGqWGWbVWS3I(localHomeFunction, view);
                }
                int i12 = copydefault + 21;
                ShareDataUIState = i12 % 128;
                int i13 = i12 % 2;
            }
        });
    }

    private static void copydefault(LocalHomeFunction localHomeFunction, View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        FunctionUtils.execute(localHomeFunction);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        int i5 = ShareDataUIState + 51;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<LocalHomeFunction> list = this.component3;
        if (list == null) {
            int i5 = i3 + 115;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        int size = list.size();
        int i7 = ShareDataUIState + 13;
        component1 = i7 % 128;
        if (i7 % 2 != 0) {
            return size;
        }
        throw null;
    }

    public static void $r8$lambda$9Cimt60zjt2NHYOhGqWGWbVWS3I(LocalHomeFunction localHomeFunction, View view) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        component1(localHomeFunction, view);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = component1 + 25;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void component1(LocalHomeFunction localHomeFunction, View view) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            copydefault(localHomeFunction, view);
            Callback.onClick_exit();
            int i4 = component1 + 101;
            ShareDataUIState = i4 % 128;
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
