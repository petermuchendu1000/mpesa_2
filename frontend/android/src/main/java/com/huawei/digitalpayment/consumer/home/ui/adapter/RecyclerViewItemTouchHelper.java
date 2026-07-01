package com.huawei.digitalpayment.consumer.home.ui.adapter;

import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\rH\u0016R \u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/adapter/RecyclerViewItemTouchHelper;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "data", "", "editEnableListener", "Lcom/huawei/digitalpayment/consumer/home/ui/adapter/RecyclerViewItemTouchHelper$EditEnableListener;", "<init>", "(Ljava/util/List;Lcom/huawei/digitalpayment/consumer/home/ui/adapter/RecyclerViewItemTouchHelper$EditEnableListener;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getMovementFlags", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onMove", "", "recycler", "targetHolder", "isLongPressDragEnabled", "onSwiped", "", "direction", "EditEnableListener", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecyclerViewItemTouchHelper extends ItemTouchHelper.Callback {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 75 % 128;
    private static int getRequestBeneficiariesState = 1;
    private List<?> ShareDataUIState;
    private final EditEnableListener component2;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/adapter/RecyclerViewItemTouchHelper$EditEnableListener;", "", "editEnable", "", "position", "", "isLongPressDragEnabled", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface EditEnableListener {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            private static int component3 = 1;
            private static int copydefault;

            public static boolean editEnable(EditEnableListener editEnableListener, int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 17;
                component3 = i3 % 128;
                return i3 % 2 != 0;
            }

            public static boolean isLongPressDragEnabled(EditEnableListener editEnableListener) {
                int i = 2 % 2;
                int i2 = component3;
                int i3 = i2 + 65;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 17;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }

        boolean editEnable(int position);

        boolean isLongPressDragEnabled();
    }

    public final List<?> getData() {
        List<?> list;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.ShareDataUIState;
            int i4 = 19 / 0;
        } else {
            list = this.ShareDataUIState;
        }
        int i5 = i2 + 59;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void setData(List<?> list) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 13;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        this.ShareDataUIState = list;
        int i5 = i2 + 55;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    public RecyclerViewItemTouchHelper(List<?> list, EditEnableListener editEnableListener) {
        this.ShareDataUIState = list;
        this.component2 = editEnableListener;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = component3 + 39;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            i = 86;
            i2 = 1;
        } else {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            i = 15;
            i2 = 0;
        }
        int iMakeMovementFlags = ItemTouchHelper.Callback.makeMovementFlags(i, i2);
        int i5 = component3 + 99;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return iMakeMovementFlags;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public boolean onMove(RecyclerView recycler, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder targetHolder) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(recycler, "");
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(targetHolder, "");
        RecyclerView.Adapter adapter = recycler.getAdapter();
        if (adapter == null) {
            return false;
        }
        if (this.ShareDataUIState == null) {
            int i2 = getRequestBeneficiariesState + 121;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        recycler.getParent().requestDisallowInterceptTouchEvent(true);
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = targetHolder.getAdapterPosition();
        EditEnableListener editEnableListener = this.component2;
        Object obj = null;
        if (editEnableListener != null) {
            int i4 = component3 + 117;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                editEnableListener.editEnable(adapterPosition2);
                obj.hashCode();
                throw null;
            }
            if (!editEnableListener.editEnable(adapterPosition2) || (!editEnableListener.editEnable(adapterPosition))) {
                return false;
            }
        }
        if (adapterPosition < adapterPosition2) {
            int i5 = component3 + 23;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            int i6 = adapterPosition;
            while (i6 < adapterPosition2) {
                int i7 = component3 + 57;
                getRequestBeneficiariesState = i7 % 128;
                int i8 = i7 % 2;
                List<?> list = this.ShareDataUIState;
                Intrinsics.checkNotNull(list);
                int i9 = i6 + 1;
                Collections.swap(list, i6, i9);
                i6 = i9;
            }
        } else {
            int i10 = adapterPosition2 + 1;
            if (i10 <= adapterPosition) {
                int i11 = component3 + 67;
                getRequestBeneficiariesState = i11 % 128;
                int i12 = i11 % 2;
                int i13 = adapterPosition;
                while (true) {
                    List<?> list2 = this.ShareDataUIState;
                    Intrinsics.checkNotNull(list2);
                    Collections.swap(list2, i13, i13 - 1);
                    if (i13 == i10) {
                        break;
                    }
                    i13--;
                }
            }
        }
        adapter.notifyItemMoved(adapterPosition, adapterPosition2);
        return true;
    }

    @Override
    public boolean isLongPressDragEnabled() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        EditEnableListener editEnableListener = this.component2;
        if (editEnableListener == null) {
            return true;
        }
        boolean zIsLongPressDragEnabled = editEnableListener.isLongPressDragEnabled();
        int i4 = getRequestBeneficiariesState + 111;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return zIsLongPressDragEnabled;
    }

    static {
        int i = 75 % 2;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        int i = 2 % 2;
        int i2 = component3 + 87;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        int i4 = getRequestBeneficiariesState + 91;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
    }
}
