package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\tJ(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/ui/widget/ItemOffsetDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "mItemOffset", "", "<init>", "(I)V", "context", "Landroid/content/Context;", "itemOffsetId", "(Landroid/content/Context;I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/recyclerview/widget/RecyclerView$State;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ItemOffsetDecoration extends RecyclerView.ItemDecoration {
    private static int component2 = 0;
    private static int component3 = 1;
    private final int ShareDataUIState;

    public ItemOffsetDecoration(int i) {
        this.ShareDataUIState = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemOffsetDecoration(Context context, int i) {
        this(context.getResources().getDimensionPixelSize(i));
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int i = 2 % 2;
        int i2 = component2 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(outRect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(parent, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.getItemOffsets(outRect, view, parent, state);
        int i4 = this.ShareDataUIState;
        outRect.set(i4, i4, i4, i4);
        int i5 = component2 + 35;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }
}
