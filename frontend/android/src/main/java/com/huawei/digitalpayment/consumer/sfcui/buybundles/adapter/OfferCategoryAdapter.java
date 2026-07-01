package com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ItemOfferCategoryChipBinding;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00020\b2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/OfferCategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/OfferCategoryAdapter$CategoryViewHolder;", "categories", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/OfferCategory;", "onCategorySelected", "Lkotlin/Function1;", "", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "selectedPosition", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "setCategories", "newCategories", "", "CategoryViewHolder", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfferCategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {
    public static final int $stable = 8;
    private static int component2 = 0;
    private static int component3 = 15 % 128;
    private static int component4 = 1;
    private static int equals;
    private final Function1<OfferCategory, Unit> ShareDataUIState;
    private final List<OfferCategory> component1;
    private int copydefault;

    public static final List access$getCategories$p(OfferCategoryAdapter offerCategoryAdapter) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 41;
        equals = i3 % 128;
        int i4 = i3 % 2;
        List<OfferCategory> list = offerCategoryAdapter.component1;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 13;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final Function1 access$getOnCategorySelected$p(OfferCategoryAdapter offerCategoryAdapter) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 91;
        equals = i3 % 128;
        int i4 = i3 % 2;
        Function1<OfferCategory, Unit> function1 = offerCategoryAdapter.ShareDataUIState;
        int i5 = i2 + 119;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return function1;
    }

    public static final int access$getSelectedPosition$p(OfferCategoryAdapter offerCategoryAdapter) {
        int i = 2 % 2;
        int i2 = component4 + 91;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int i4 = offerCategoryAdapter.copydefault;
        if (i3 != 0) {
            int i5 = 77 / 0;
        }
        return i4;
    }

    public static final void access$setSelectedPosition$p(OfferCategoryAdapter offerCategoryAdapter, int i) {
        int i2 = 2 % 2;
        int i3 = equals + 89;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        offerCategoryAdapter.copydefault = i;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 101;
        equals = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((CategoryViewHolder) viewHolder, i);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 63;
        equals = i3 % 128;
        int i4 = i3 % 2;
        CategoryViewHolder categoryViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        if (i4 != 0) {
            throw null;
        }
        int i5 = equals + 75;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return categoryViewHolderOnCreateViewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OfferCategoryAdapter(List<OfferCategory> list, Function1<? super OfferCategory, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.component1 = list;
        this.ShareDataUIState = function1;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/OfferCategoryAdapter$CategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ItemOfferCategoryChipBinding;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/OfferCategoryAdapter;Lcom/huawei/digitalpayment/consumer/sfc/databinding/ItemOfferCategoryChipBinding;)V", "bind", "", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/model/bundle/OfferCategory;", "position", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CategoryViewHolder extends RecyclerView.ViewHolder {
        private static int component2 = 1;
        private static int copydefault;
        private final ItemOfferCategoryChipBinding ShareDataUIState;
        final OfferCategoryAdapter component3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CategoryViewHolder(OfferCategoryAdapter offerCategoryAdapter, ItemOfferCategoryChipBinding itemOfferCategoryChipBinding) {
            super(itemOfferCategoryChipBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemOfferCategoryChipBinding, "");
            this.component3 = offerCategoryAdapter;
            this.ShareDataUIState = itemOfferCategoryChipBinding;
        }

        public final void bind(final OfferCategory category, final int position) {
            int color;
            int color2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(category, "");
            this.ShareDataUIState.tvCategoryName.setText(category.getName());
            this.ShareDataUIState.tvCategoryName.setSelected(category.isSelected());
            if (category.isSelected()) {
                color = ContextCompat.getColor(this.ShareDataUIState.getRoot().getContext(), R.color.color_primary);
                int i2 = component2 + 1;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
            } else {
                color = ContextCompat.getColor(this.ShareDataUIState.getRoot().getContext(), R.color.color_surface);
            }
            this.ShareDataUIState.cardCategory.setCardBackgroundColor(color);
            if (category.isSelected()) {
                int i4 = copydefault + 37;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    ContextCompat.getColor(this.ShareDataUIState.getRoot().getContext(), R.color.color_white);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                color2 = ContextCompat.getColor(this.ShareDataUIState.getRoot().getContext(), R.color.color_white);
            } else {
                int color3 = ContextCompat.getColor(this.ShareDataUIState.getRoot().getContext(), R.color.color_on_surface);
                int i5 = component2 + 3;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                color2 = color3;
            }
            this.ShareDataUIState.tvCategoryName.setTextColor(color2);
            CardView root = this.ShareDataUIState.getRoot();
            final OfferCategoryAdapter offerCategoryAdapter = this.component3;
            root.setOnClickListener(new View.OnClickListener() {
                private static int ShareDataUIState = 0;
                private static int component3 = 1;

                @Override
                public final void onClick(View view) {
                    int i7 = 2 % 2;
                    int i8 = component3 + 67;
                    ShareDataUIState = i8 % 128;
                    if (i8 % 2 != 0) {
                        OfferCategoryAdapter.CategoryViewHolder.m11243$r8$lambda$QfMXiSyCZVhDqz5PvvRnUBncrU(offerCategoryAdapter, position, category, view);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    OfferCategoryAdapter.CategoryViewHolder.m11243$r8$lambda$QfMXiSyCZVhDqz5PvvRnUBncrU(offerCategoryAdapter, position, category, view);
                    int i9 = component3 + 11;
                    ShareDataUIState = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 79 / 0;
                    }
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final void component2(com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter r5, int r6, com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory r7, android.view.View r8) {
            /*
                r8 = 2
                int r0 = r8 % r8
                int r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.CategoryViewHolder.component2
                int r0 = r0 + 119
                int r1 = r0 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.CategoryViewHolder.copydefault = r1
                int r0 = r0 % r8
                r1 = 0
                java.lang.String r2 = ""
                if (r0 == 0) goto L21
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
                int r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.access$getSelectedPosition$p(r5)
                r2 = 95
                int r2 = r2 / r1
                if (r0 == r6) goto L83
                goto L2d
            L21:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
                int r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.access$getSelectedPosition$p(r5)
                if (r0 == r6) goto L83
            L2d:
                int r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.access$getSelectedPosition$p(r5)
                r2 = 1
                if (r0 < 0) goto L6a
                int r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.CategoryViewHolder.component2
                int r3 = r3 + r2
                int r4 = r3 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.CategoryViewHolder.copydefault = r4
                int r3 = r3 % r8
                if (r3 == 0) goto L4e
                java.util.List r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.access$getCategories$p(r5)
                java.util.Collection r3 = (java.util.Collection) r3
                int r3 = r3.size()
                r4 = 22
                int r4 = r4 / r1
                if (r0 >= r3) goto L6a
                goto L5a
            L4e:
                java.util.List r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.access$getCategories$p(r5)
                java.util.Collection r3 = (java.util.Collection) r3
                int r3 = r3.size()
                if (r0 >= r3) goto L6a
            L5a:
                java.util.List r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.access$getCategories$p(r5)
                java.lang.Object r3 = r3.get(r0)
                com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory r3 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory) r3
                r3.setSelected(r1)
                r5.notifyItemChanged(r0)
            L6a:
                com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.access$setSelectedPosition$p(r5, r6)
                r7.setSelected(r2)
                r5.notifyItemChanged(r6)
                kotlin.jvm.functions.Function1 r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.access$getOnCategorySelected$p(r5)
                r5.invoke(r7)
                int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.CategoryViewHolder.component2
                int r5 = r5 + 125
                int r6 = r5 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.CategoryViewHolder.copydefault = r6
                int r5 = r5 % r8
            L83:
                int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.CategoryViewHolder.copydefault
                int r5 = r5 + 39
                int r6 = r5 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.CategoryViewHolder.component2 = r6
                int r5 = r5 % r8
                if (r5 == 0) goto L8f
                return
            L8f:
                r5 = 0
                r5.hashCode()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter.CategoryViewHolder.component2(com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter.OfferCategoryAdapter, int, com.huawei.digitalpayment.consumer.sfcui.buybundles.model.bundle.OfferCategory, android.view.View):void");
        }

        public static void m11243$r8$lambda$QfMXiSyCZVhDqz5PvvRnUBncrU(OfferCategoryAdapter offerCategoryAdapter, int i, OfferCategory offerCategory, View view) {
            int i2 = 2 % 2;
            int i3 = copydefault + 45;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            component1(offerCategoryAdapter, i, offerCategory, view);
            if (i4 == 0) {
                throw null;
            }
            int i5 = component2 + 15;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 17 / 0;
            }
        }

        private static void component1(OfferCategoryAdapter offerCategoryAdapter, int i, OfferCategory offerCategory, View view) {
            int i2 = 2 % 2;
            int i3 = component2 + 119;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            Callback.onClick_enter(view);
            try {
                component2(offerCategoryAdapter, i, offerCategory, view);
                Callback.onClick_exit();
                int i5 = copydefault + 119;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Callback.onClick_exit();
                throw th;
            }
        }
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        ItemOfferCategoryChipBinding itemOfferCategoryChipBindingInflate = ItemOfferCategoryChipBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemOfferCategoryChipBindingInflate, "");
        CategoryViewHolder categoryViewHolder = new CategoryViewHolder(this, itemOfferCategoryChipBindingInflate);
        int i2 = equals + 49;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return categoryViewHolder;
    }

    public void onBindViewHolder(CategoryViewHolder holder, int position) {
        int i = 2 % 2;
        int i2 = equals + 57;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        holder.bind(this.component1.get(position), position);
        int i4 = equals + 25;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = component4 + 21;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int size = this.component1.size();
        int i4 = equals + 67;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    public final void setCategories(List<OfferCategory> newCategories) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(newCategories, "");
        this.component1.clear();
        this.component1.addAll(newCategories);
        Iterator<OfferCategory> it = this.component1.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                int i3 = equals + 9;
                component4 = i3 % 128;
                int i4 = i3 % 2;
                i2 = -1;
                break;
            }
            int i5 = component4 + 75;
            equals = i5 % 128;
            int i6 = i5 % 2;
            if (it.next().isSelected()) {
                break;
            } else {
                i2++;
            }
        }
        this.copydefault = RangesKt.coerceAtLeast(i2, 0);
        notifyDataSetChanged();
    }

    static {
        if (15 % 2 == 0) {
            throw null;
        }
    }
}
