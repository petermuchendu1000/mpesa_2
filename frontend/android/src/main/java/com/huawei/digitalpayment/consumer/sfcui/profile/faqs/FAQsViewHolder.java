package com.huawei.digitalpayment.consumer.sfcui.profile.faqs;

import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ItemFaqsCardBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\tH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/faqs/FAQsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ItemFaqsCardBinding;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/databinding/ItemFaqsCardBinding;)V", "getBinding", "()Lcom/huawei/digitalpayment/consumer/sfc/databinding/ItemFaqsCardBinding;", "bind", "", "item", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/faqs/FAQsBean;", "expandContractDescriptionText", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FAQsViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault = 119 % 128;
    private final ItemFaqsCardBinding component3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FAQsViewHolder(ItemFaqsCardBinding itemFaqsCardBinding) {
        super(itemFaqsCardBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemFaqsCardBinding, "");
        this.component3 = itemFaqsCardBinding;
    }

    public final ItemFaqsCardBinding getBinding() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ItemFaqsCardBinding itemFaqsCardBinding = this.component3;
        int i5 = i3 + 25;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return itemFaqsCardBinding;
    }

    private static final void component2(FAQsViewHolder fAQsViewHolder, View view) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fAQsViewHolder, "");
            fAQsViewHolder.ShareDataUIState();
            int i3 = 80 / 0;
        } else {
            Intrinsics.checkNotNullParameter(fAQsViewHolder, "");
            fAQsViewHolder.ShareDataUIState();
        }
        int i4 = component2 + 3;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void copydefault(FAQsViewHolder fAQsViewHolder, View view) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fAQsViewHolder, "");
        fAQsViewHolder.ShareDataUIState();
        int i4 = component1 + 29;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void bind(FAQsBean item) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(item, "");
        this.component3.tvTitle.setText(item.getTitle());
        this.component3.tvDescription.setText(item.getDescription());
        this.component3.ivChevron.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 15;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                FAQsViewHolder.$r8$lambda$EGrT2QpYB2u0V_nr04yfhTIQj8Y(this.f$0, view);
                int i5 = component1 + 89;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        this.component3.getRoot().setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 75;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                FAQsViewHolder.$r8$lambda$KnqnMdIaNd2iu7o87L7yFBAoVeQ(this.f$0, view);
                int i5 = component3 + 87;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.component3.executePendingBindings();
        int i2 = component1 + 89;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 32 / 0;
        }
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            TextView textView = this.component3.tvDescription;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            if (textView.getVisibility() != 0) {
                this.component3.tvDescription.setVisibility(0);
                this.component3.ivChevron.setImageDrawable(ContextCompat.getDrawable(this.component3.ivChevron.getContext(), R.drawable.icon_arr_up));
                int i3 = component2 + 103;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            int i5 = component2 + 85;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            this.component3.tvDescription.setVisibility(8);
            this.component3.ivChevron.setImageDrawable(ContextCompat.getDrawable(this.component3.ivChevron.getContext(), R.drawable.icon_arr_down));
            return;
        }
        TextView textView2 = this.component3.tvDescription;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.getVisibility();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$EGrT2QpYB2u0V_nr04yfhTIQj8Y(FAQsViewHolder fAQsViewHolder, View view) {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        component3(fAQsViewHolder, view);
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        int i5 = component2 + 113;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$KnqnMdIaNd2iu7o87L7yFBAoVeQ(FAQsViewHolder fAQsViewHolder, View view) {
        int i = 2 % 2;
        int i2 = component1 + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(fAQsViewHolder, view);
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        int i5 = component1 + 103;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 39 / 0;
        }
    }

    static {
        if (119 % 2 == 0) {
            throw null;
        }
    }

    private static void component3(FAQsViewHolder fAQsViewHolder, View view) {
        int i = 2 % 2;
        int i2 = component2 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            component2(fAQsViewHolder, view);
            Callback.onClick_exit();
            int i4 = component2 + 13;
            component1 = i4 % 128;
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

    private static void ShareDataUIState(FAQsViewHolder fAQsViewHolder, View view) {
        int i = 2 % 2;
        int i2 = component2 + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                copydefault(fAQsViewHolder, view);
            } else {
                copydefault(fAQsViewHolder, view);
                Callback.onClick_exit();
                throw null;
            }
        } finally {
            Callback.onClick_exit();
        }
    }
}
