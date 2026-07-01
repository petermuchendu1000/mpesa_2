package com.huawei.digitalpayment.consumer.home.ui.adapter.sfc;

import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.homeui.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0002H\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR7\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/adapter/sfc/CategoryAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "data", "", "<init>", "(Ljava/util/List;)V", "selectedPosition", "", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "itemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "convert", "holder", "item", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CategoryAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int getAsAtTimestamp = 27 % 128;
    private Function1<? super Integer, Unit> component1;
    private int copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryAdapter(List<String> list) {
        super(R.layout.item_category, list);
        Intrinsics.checkNotNullParameter(list, "");
    }

    @Override
    public void convert(BaseViewHolder baseViewHolder, String str) {
        int i = 2 % 2;
        int i2 = component3 + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getSelectedPosition() {
        int i = 2 % 2;
        int i2 = component3 + 37;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.copydefault;
        int i6 = i3 + 25;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSelectedPosition(int i) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 73;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        this.copydefault = i;
        int i6 = i3 + 111;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final Function1<Integer, Unit> getItemClickListener() {
        int i = 2 % 2;
        int i2 = component3 + 5;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setItemClickListener(Function1<? super Integer, Unit> function1) {
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.component1 = function1;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    protected void convert2(BaseViewHolder holder, String item) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        Intrinsics.checkNotNullParameter(item, "");
        holder.setText(R.id.tvCategory, item);
        final int itemPosition = getItemPosition(item);
        TextView textView = (TextView) holder.getView(R.id.tvCategory);
        boolean z = false;
        if (itemPosition == this.copydefault) {
            int i2 = component2 + 19;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                z = true;
            }
        } else {
            int i3 = component2 + 99;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        }
        textView.setSelected(z);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i5 = 2 % 2;
                int i6 = component2 + 27;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                CategoryAdapter.$r8$lambda$H4uiDNGHRRpA9p365XENPoDRxOM(this.f$0, itemPosition, view);
                int i8 = copydefault + 39;
                component2 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 62 / 0;
                }
            }
        });
        int i5 = component3 + 11;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void copydefault(CategoryAdapter categoryAdapter, int i, View view) {
        int i2 = 2 % 2;
        int i3 = component2 + 85;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(categoryAdapter, "");
            int i4 = categoryAdapter.copydefault;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(categoryAdapter, "");
        int i5 = categoryAdapter.copydefault;
        if (i5 == i) {
            return;
        }
        categoryAdapter.copydefault = i;
        categoryAdapter.notifyItemChanged(i5);
        categoryAdapter.notifyItemChanged(categoryAdapter.copydefault);
        Function1<? super Integer, Unit> function1 = categoryAdapter.component1;
        if (function1 != null) {
            Intrinsics.checkNotNull(function1);
            function1.invoke(Integer.valueOf(i));
        }
        int i6 = component2 + 51;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$H4uiDNGHRRpA9p365XENPoDRxOM(CategoryAdapter categoryAdapter, int i, View view) {
        int i2 = 2 % 2;
        int i3 = component2 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        component1(categoryAdapter, i, view);
        if (i4 != 0) {
            int i5 = 63 / 0;
        }
    }

    static {
        int i = 27 % 2;
    }

    private static void component1(CategoryAdapter categoryAdapter, int i, View view) {
        int i2 = 2 % 2;
        int i3 = component3 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Callback.onClick_enter(view);
        try {
            if (i4 == 0) {
                copydefault(categoryAdapter, i, view);
                Callback.onClick_exit();
                int i5 = 23 / 0;
            } else {
                copydefault(categoryAdapter, i, view);
                Callback.onClick_exit();
            }
            int i6 = component2 + 41;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
