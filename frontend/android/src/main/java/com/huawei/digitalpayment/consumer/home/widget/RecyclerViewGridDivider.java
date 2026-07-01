package com.huawei.digitalpayment.consumer.home.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/widget/RecyclerViewGridDivider;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "color", "", "width", "spanCount", "<init>", "(III)V", "paint", "Landroid/graphics/Paint;", "onDraw", "", "c", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/recyclerview/widget/RecyclerView$State;", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecyclerViewGridDivider extends RecyclerView.ItemDecoration {
    public static final int $stable = 8;
    private static int component3 = 0;
    private static int component4 = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private final int ShareDataUIState;
    private final Paint component1;
    private final int component2;
    private final int copydefault;

    public RecyclerViewGridDivider(int i, int i2, int i3) {
        this.component2 = i;
        this.copydefault = i2;
        this.ShareDataUIState = i3;
        Paint paint = new Paint();
        this.component1 = paint;
        paint.setColor(i);
    }

    @Override
    public void onDraw(Canvas c2, RecyclerView parent, RecyclerView.State state) {
        int marginEnd;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(c2, "");
        Intrinsics.checkNotNullParameter(parent, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childCount = parent.getChildCount();
        int i2 = 0;
        while (i2 < childCount - 1) {
            int i3 = i2 + 1;
            if (i3 % this.ShareDataUIState != 0) {
                View childAt = parent.getChildAt(i2);
                float right = childAt.getRight();
                float f = this.copydefault;
                Intrinsics.checkNotNull(childAt);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                float marginEnd2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0;
                float top = childAt.getTop();
                float right2 = childAt.getRight();
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    int i4 = getRequestBeneficiariesState + 21;
                    component4 = i4 % 128;
                    if (i4 % 2 != 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                } else {
                    marginEnd = 0;
                }
                c2.drawRect((right - f) + marginEnd2, top, right2 + marginEnd, childAt.getBottom(), this.component1);
                int i5 = getRequestBeneficiariesState + 37;
                component4 = i5 % 128;
                int i6 = i5 % 2;
            }
            i2 = i3;
        }
    }

    static {
        int i = 1 + 17;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
