package com.huawei.digitalpayment.consumer.sfcui.profile.adapters;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\nB%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\rJ(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/adapters/ItemOffsetDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "horizontalOffset", "", "verticalOffset", "<init>", "(II)V", "context", "Landroid/content/Context;", "itemOffsetId", "(Landroid/content/Context;I)V", "horizontalOffsetId", "verticalOffsetId", "(Landroid/content/Context;II)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/recyclerview/widget/RecyclerView$State;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ItemOffsetDecoration extends RecyclerView.ItemDecoration {
    public static final int $stable = 0;
    private static int component2 = 37 % 128;
    private static int component3 = 0;
    private static int copydefault = 0;
    private static int getAsAtTimestamp = 1;
    private final int ShareDataUIState;
    private final int component1;

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemOffsetDecoration(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            int i4 = copydefault + 23;
            int i5 = i4 % 128;
            getAsAtTimestamp = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 73;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i2 = i;
        }
        this(i, i2);
    }

    public ItemOffsetDecoration(int i, int i2) {
        this.component1 = i;
        this.ShareDataUIState = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemOffsetDecoration(Context context, int i) {
        this(context.getResources().getDimensionPixelSize(i), 0, 2, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ItemOffsetDecoration(Context context, int i, int i2) {
        this(context.getResources().getDimensionPixelSize(i), context.getResources().getDimensionPixelSize(i2));
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (((androidx.recyclerview.widget.LinearLayoutManager) r5).getOrientation() == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (((androidx.recyclerview.widget.LinearLayoutManager) r5).getOrientation() == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r4 <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        r3.left = r2.component1;
        r3 = com.huawei.digitalpayment.consumer.sfcui.profile.adapters.ItemOffsetDecoration.copydefault + 59;
        com.huawei.digitalpayment.consumer.sfcui.profile.adapters.ItemOffsetDecoration.getAsAtTimestamp = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r4 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        r3.top = r2.ShareDataUIState;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getItemOffsets(android.graphics.Rect r3, android.view.View r4, androidx.recyclerview.widget.RecyclerView r5, androidx.recyclerview.widget.RecyclerView.State r6) {
        /*
            r2 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
            int r4 = r5.getChildAdapterPosition(r4)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r5.getLayoutManager()
            r6 = -1
            if (r4 != r6) goto L1d
            return
        L1d:
            boolean r6 = r5 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r6 == 0) goto L3f
            androidx.recyclerview.widget.GridLayoutManager r5 = (androidx.recyclerview.widget.GridLayoutManager) r5
            int r5 = r5.getSpanCount()
            int r6 = r4 % r5
            int r0 = r2.component1
            int r0 = r0 * r6
            int r0 = r0 / r5
            r3.left = r0
            int r0 = r2.component1
            int r6 = r6 + 1
            int r6 = r6 * r0
            int r6 = r6 / r5
            int r0 = r0 - r6
            r3.right = r0
            if (r4 < r5) goto L79
            int r4 = r2.ShareDataUIState
            r3.top = r4
            goto L79
        L3f:
            boolean r6 = r5 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r6 == 0) goto L79
            int r6 = com.huawei.digitalpayment.consumer.sfcui.profile.adapters.ItemOffsetDecoration.getAsAtTimestamp
            int r6 = r6 + 63
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.adapters.ItemOffsetDecoration.copydefault = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L5b
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            int r5 = r5.getOrientation()
            r6 = 37
            int r6 = r6 / 0
            if (r5 != 0) goto L73
            goto L63
        L5b:
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            int r5 = r5.getOrientation()
            if (r5 != 0) goto L73
        L63:
            if (r4 <= 0) goto L79
            int r4 = r2.component1
            r3.left = r4
            int r3 = com.huawei.digitalpayment.consumer.sfcui.profile.adapters.ItemOffsetDecoration.copydefault
            int r3 = r3 + 59
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.adapters.ItemOffsetDecoration.getAsAtTimestamp = r4
            int r3 = r3 % r0
            goto L79
        L73:
            if (r4 <= 0) goto L79
            int r4 = r2.ShareDataUIState
            r3.top = r4
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.adapters.ItemOffsetDecoration.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    static {
        int i = 37 % 2;
    }
}
