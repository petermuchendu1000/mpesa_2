package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.domore;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\tJ(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/domore/ItemOffsetDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "mItemOffset", "", "<init>", "(I)V", "context", "Landroid/content/Context;", "itemOffsetId", "(Landroid/content/Context;I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/recyclerview/widget/RecyclerView$State;", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ItemOffsetDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1 % 128;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private final int copydefault;

    public ItemOffsetDecoration(int i) {
        this.copydefault = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemOffsetDecoration(Context context, int i) {
        this(context.getResources().getDimensionPixelSize(i));
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(outRect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(parent, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.getItemOffsets(outRect, view, parent, state);
        int i4 = this.copydefault;
        outRect.set(i4, i4, i4, i4);
        int i5 = component3 + 89;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 % 2;
    }
}
