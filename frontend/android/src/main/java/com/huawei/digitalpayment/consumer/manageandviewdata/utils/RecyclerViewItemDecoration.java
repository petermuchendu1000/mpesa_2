package com.huawei.digitalpayment.consumer.manageandviewdata.utils;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J(\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002J(\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0002R\u0016\u0010\u0002\u001a\u00020\u00038AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/utils/RecyclerViewItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spacingPx", "", "<init>", "(I)V", "getSpacingPx$ConsumerSfcManageAndViewData_release", "()I", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/recyclerview/widget/RecyclerView$State;", "configSpacingForGridLayoutManager", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "position", "itemCount", "configSpacingForLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecyclerViewItemDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 0;
    private static int component1 = 39 % 128;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final int ShareDataUIState;

    public final int getSpacingPx$ConsumerSfcManageAndViewData_release() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.ShareDataUIState;
        int i6 = i3 + 33;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public RecyclerViewItemDecoration(int i) {
        this.ShareDataUIState = i;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(outRect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(parent, "");
        Intrinsics.checkNotNullParameter(state, "");
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            copydefault(outRect, (GridLayoutManager) layoutManager, parent.getChildViewHolder(view).getAdapterPosition(), state.getItemCount());
            int i2 = copydefault + 83;
            component2 = i2 % 128;
            int i3 = i2 % 2;
        } else if (layoutManager instanceof LinearLayoutManager) {
            component2(outRect, (LinearLayoutManager) layoutManager, parent.getChildViewHolder(view).getAdapterPosition(), state.getItemCount());
        }
        int i4 = copydefault + 47;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void copydefault(Rect rect, GridLayoutManager gridLayoutManager, int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int spanCount = gridLayoutManager.getSpanCount();
        int iCeil = (int) Math.ceil(((double) i2) / ((double) spanCount));
        rect.top = this.ShareDataUIState;
        rect.left = this.ShareDataUIState;
        int i5 = 0;
        if (i % spanCount == spanCount - 1) {
            int i6 = copydefault + 11;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            i3 = this.ShareDataUIState;
        } else {
            i3 = 0;
        }
        rect.right = i3;
        if (i / spanCount == iCeil - 1) {
            int i8 = copydefault + 115;
            component2 = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 25 / 0;
                i5 = this.ShareDataUIState;
            } else {
                i5 = this.ShareDataUIState;
            }
        }
        rect.bottom = i5;
    }

    private final void component2(Rect rect, LinearLayoutManager linearLayoutManager, int i, int i2) {
        int i3 = 2 % 2;
        rect.top = this.ShareDataUIState;
        rect.left = this.ShareDataUIState;
        if (!linearLayoutManager.canScrollHorizontally()) {
            if (linearLayoutManager.canScrollVertically()) {
                rect.right = this.ShareDataUIState;
                if (i == i2 - 1) {
                    i = this.ShareDataUIState;
                    int i4 = copydefault + 83;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                }
                rect.bottom = i;
                int i6 = copydefault + 123;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
            return;
        }
        int i8 = component2 + 7;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        rect.right = i == i2 + (-1) ? this.ShareDataUIState : 0;
        rect.bottom = this.ShareDataUIState;
    }

    static {
        int i = 39 % 2;
    }
}
