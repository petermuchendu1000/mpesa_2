package com.huawei.digitalpayment.consumer.sfcui.bonga.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaDeal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/adapter/DealDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaDeal;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DealDiffCallback extends DiffUtil.ItemCallback<BongaDeal> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 83 % 128;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @Override
    public boolean areContentsTheSame(BongaDeal bongaDeal, BongaDeal bongaDeal2) {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        component1 = i2 % 128;
        BongaDeal bongaDeal3 = bongaDeal;
        BongaDeal bongaDeal4 = bongaDeal2;
        if (i2 % 2 == 0) {
            areContentsTheSame2(bongaDeal3, bongaDeal4);
            throw null;
        }
        boolean zAreContentsTheSame2 = areContentsTheSame2(bongaDeal3, bongaDeal4);
        int i3 = component1 + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return zAreContentsTheSame2;
    }

    @Override
    public boolean areItemsTheSame(BongaDeal bongaDeal, BongaDeal bongaDeal2) {
        int i = 2 % 2;
        int i2 = component1 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zAreItemsTheSame2 = areItemsTheSame2(bongaDeal, bongaDeal2);
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return zAreItemsTheSame2;
    }

    public boolean areItemsTheSame2(BongaDeal oldItem, BongaDeal newItem) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(oldItem, "");
            Intrinsics.checkNotNullParameter(newItem, "");
            return Intrinsics.areEqual(oldItem.getTitle(), newItem.getTitle());
        }
        Intrinsics.checkNotNullParameter(oldItem, "");
        Intrinsics.checkNotNullParameter(newItem, "");
        Intrinsics.areEqual(oldItem.getTitle(), newItem.getTitle());
        throw null;
    }

    public boolean areContentsTheSame2(BongaDeal oldItem, BongaDeal newItem) {
        boolean zAreEqual;
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(oldItem, "");
            Intrinsics.checkNotNullParameter(newItem, "");
            zAreEqual = Intrinsics.areEqual(oldItem, newItem);
            int i3 = 35 / 0;
        } else {
            Intrinsics.checkNotNullParameter(oldItem, "");
            Intrinsics.checkNotNullParameter(newItem, "");
            zAreEqual = Intrinsics.areEqual(oldItem, newItem);
        }
        int i4 = copydefault + 57;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return zAreEqual;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 83 % 2;
    }
}
