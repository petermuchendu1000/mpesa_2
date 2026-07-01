package com.huawei.digitalpayment.consumer.sfcui.buybundles.adapter;

import android.view.View;
import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.entity.SectionEntity;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYBundle;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/DiyBundleAdapter;", "Lcom/chad/library/adapter/base/BaseSectionQuickAdapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/adapter/DiyBundleSection;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "data", "", "onItemClick", "Lkotlin/Function1;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;", "", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "convertHeader", "helper", "item", "convert", "holder", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DiyBundleAdapter extends BaseSectionQuickAdapter<DiyBundleSection, BaseViewHolder> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 71 % 128;
    private static int copydefault;
    private final Function1<DIYBundle, Unit> component1;

    @Override
    public void convert(BaseViewHolder baseViewHolder, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        convert(baseViewHolder, (DiyBundleSection) obj);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override
    public void convertHeader(BaseViewHolder baseViewHolder, SectionEntity sectionEntity) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        convertHeader(baseViewHolder, (DiyBundleSection) sectionEntity);
        if (i3 != 0) {
            int i4 = 33 / 0;
        }
        int i5 = copydefault + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DiyBundleAdapter(List<DiyBundleSection> list, Function1<? super DIYBundle, Unit> function1) {
        super(R.layout.item_section_header, R.layout.item_diy_bundle, list);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.component1 = function1;
    }

    protected void convertHeader(BaseViewHolder helper, DiyBundleSection item) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(helper, "");
        Intrinsics.checkNotNullParameter(item, "");
        helper.setText(R.id.category_title, item.getHeaderTitle());
        int i4 = ShareDataUIState + 67;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void convert(BaseViewHolder holder, DiyBundleSection item) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(holder, "");
        Intrinsics.checkNotNullParameter(item, "");
        final DIYBundle bundle = item.getBundle();
        if (bundle != null) {
            holder.setText(R.id.tv_bundle_title, bundle.getProductName());
            holder.setText(R.id.tv_bundle_amount, "Ksh " + bundle.getProductAmount());
            ((RoundTextView) holder.getView(R.id.tv_buy)).setOnClickListener(new View.OnClickListener() {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;

                @Override
                public final void onClick(View view) {
                    int i4 = 2 % 2;
                    int i5 = ShareDataUIState + 51;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    DiyBundleAdapter.$r8$lambda$e9QXjoqjtGEVEjp6MH4LYuC78kY(this.f$0, bundle, view);
                    int i7 = ShareDataUIState + 57;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                }
            });
            int i4 = copydefault + 45;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static final void component1(DiyBundleAdapter diyBundleAdapter, DIYBundle dIYBundle, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(diyBundleAdapter, "");
        diyBundleAdapter.component1.invoke(dIYBundle);
        int i4 = copydefault + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$e9QXjoqjtGEVEjp6MH4LYuC78kY(DiyBundleAdapter diyBundleAdapter, DIYBundle dIYBundle, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(diyBundleAdapter, dIYBundle, view);
        if (i3 == 0) {
            throw null;
        }
    }

    static {
        if (71 % 2 == 0) {
            throw null;
        }
    }

    private static void ShareDataUIState(DiyBundleAdapter diyBundleAdapter, DIYBundle dIYBundle, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            component1(diyBundleAdapter, dIYBundle, view);
            Callback.onClick_exit();
            int i4 = ShareDataUIState + 105;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
