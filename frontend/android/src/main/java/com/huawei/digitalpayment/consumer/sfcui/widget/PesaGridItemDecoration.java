package com.huawei.digitalpayment.consumer.sfcui.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/widget/PesaGridItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "space", "", "top", ThemeConstants.INDICA_POSITION_BOTTOM, "<init>", "(III)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/recyclerview/widget/RecyclerView$State;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PesaGridItemDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 0;
    private static int component1 = 27 % 128;
    private static int component4 = 1;
    private static int copydefault;
    private static int equals;
    private final int ShareDataUIState;
    private final int component2;
    private final int component3;

    /* JADX WARN: Illegal instructions before constructor call */
    public PesaGridItemDecoration(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i4 & 2) != 0) {
            int i5 = component4 + 9;
            equals = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            int i8 = component4 + 111;
            equals = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 / 3;
            } else {
                int i10 = 2 % 2;
            }
            i3 = 0;
        }
        this(i, i2, i3);
    }

    public PesaGridItemDecoration(int i, int i2, int i3) {
        this.component3 = i;
        this.component2 = i2;
        this.ShareDataUIState = i3;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        GridLayoutManager gridLayoutManager;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(outRect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(parent, "");
        Intrinsics.checkNotNullParameter(state, "");
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            int i2 = equals + 101;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                gridLayoutManager = (GridLayoutManager) layoutManager;
                int i3 = 16 / 0;
            } else {
                gridLayoutManager = (GridLayoutManager) layoutManager;
            }
        } else {
            int i4 = component4 + 13;
            equals = i4 % 128;
            int i5 = i4 % 2;
            gridLayoutManager = null;
        }
        if (gridLayoutManager == null) {
            return;
        }
        int spanCount = gridLayoutManager.getSpanCount();
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i6 = childAdapterPosition % spanCount;
        outRect.left = (this.component3 * i6) / spanCount;
        int i7 = this.component3;
        outRect.right = i7 - (((i6 + 1) * i7) / spanCount);
        if (childAdapterPosition < spanCount) {
            int i8 = equals + 51;
            component4 = i8 % 128;
            int i9 = i8 % 2;
            outRect.top = this.component2;
        }
        outRect.bottom = this.ShareDataUIState;
    }

    static {
        int i = 27 % 2;
    }
}
