package com.huawei.digitalpayment.consumer.home.ui.adapter.sfc;

import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.homeui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR7\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/adapter/sfc/QuickActionCateGoryAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "<init>", "()V", "selectedPosition", "", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "itemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "convert", "holder", "item", "setSelectedCategory", "categoryMonth", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickActionCateGoryAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int getAsAtTimestamp = 115 % 128;
    private Function1<? super Integer, Unit> component2;
    private int copydefault;

    public QuickActionCateGoryAdapter() {
        super(R.layout.item_quick_actions_category, null, 2, null);
    }

    @Override
    public void convert(BaseViewHolder baseViewHolder, String str) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, str);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        int i5 = component3 + 33;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final int getSelectedPosition() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.copydefault;
        int i6 = i3 + 83;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setSelectedPosition(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 49;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function1<Integer, Unit> getItemClickListener() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setItemClickListener(Function1<? super Integer, Unit> function1) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.component2 = function1;
        int i5 = i3 + 51;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 81 / 0;
        }
    }

    protected void convert2(BaseViewHolder holder, String item) {
        boolean z;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(holder, "");
            Intrinsics.checkNotNullParameter(item, "");
            holder.setText(R.id.tvCategory, item);
            getItemPosition(item);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(holder, "");
        Intrinsics.checkNotNullParameter(item, "");
        holder.setText(R.id.tvCategory, item);
        final int itemPosition = getItemPosition(item);
        TextView textView = (TextView) holder.getView(R.id.tvCategory);
        if (itemPosition == this.copydefault) {
            int i3 = ShareDataUIState + 13;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 % 5;
            }
            z = true;
        } else {
            z = false;
        }
        textView.setSelected(z);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i5 = 2 % 2;
                int i6 = copydefault + 27;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                QuickActionCateGoryAdapter.m10490$r8$lambda$oJpgPiMci2IUZDQvyCAALCii4Y(this.f$0, itemPosition, view);
                int i8 = copydefault + 95;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
            }
        });
    }

    private static final void copydefault(QuickActionCateGoryAdapter quickActionCateGoryAdapter, int i, View view) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 23;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(quickActionCateGoryAdapter, "");
            int i4 = quickActionCateGoryAdapter.copydefault;
            throw null;
        }
        Intrinsics.checkNotNullParameter(quickActionCateGoryAdapter, "");
        int i5 = quickActionCateGoryAdapter.copydefault;
        if (i5 == i) {
            return;
        }
        quickActionCateGoryAdapter.copydefault = i;
        quickActionCateGoryAdapter.notifyItemChanged(i5);
        quickActionCateGoryAdapter.notifyItemChanged(quickActionCateGoryAdapter.copydefault);
        Function1<? super Integer, Unit> function1 = quickActionCateGoryAdapter.component2;
        if (function1 != null) {
            int i6 = component3 + 99;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.checkNotNull(function1);
            function1.invoke(Integer.valueOf(i));
        }
    }

    public final void setSelectedCategory(String categoryMonth) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(categoryMonth, "");
        for (String str : getData()) {
            int i2 = ShareDataUIState + 79;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(str, categoryMonth)) {
                int i4 = ShareDataUIState + 29;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = this.copydefault;
                    this.copydefault = getData().indexOf(str);
                    notifyItemChanged(i5);
                    notifyItemChanged(this.copydefault);
                    return;
                }
                int i6 = this.copydefault;
                this.copydefault = getData().indexOf(str);
                notifyItemChanged(i6);
                notifyItemChanged(this.copydefault);
                throw null;
            }
        }
    }

    public static void m10490$r8$lambda$oJpgPiMci2IUZDQvyCAALCii4Y(QuickActionCateGoryAdapter quickActionCateGoryAdapter, int i, View view) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 11;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        component3(quickActionCateGoryAdapter, i, view);
        if (i4 == 0) {
            throw null;
        }
        int i5 = component3 + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        if (115 % 2 == 0) {
            int i = 84 / 0;
        }
    }

    private static void component3(QuickActionCateGoryAdapter quickActionCateGoryAdapter, int i, View view) {
        int i2 = 2 % 2;
        int i3 = component3 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Callback.onClick_enter(view);
        try {
            if (i4 == 0) {
                copydefault(quickActionCateGoryAdapter, i, view);
                return;
            }
            copydefault(quickActionCateGoryAdapter, i, view);
            Callback.onClick_exit();
            Object obj = null;
            obj.hashCode();
            throw null;
        } finally {
            Callback.onClick_exit();
        }
    }
}
