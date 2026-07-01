package com.huawei.common.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.huawei.common.util.L;
import com.huawei.common.widget.round.RoundRecyclerView;
import java.util.List;

public class HFRecyclerView extends RoundRecyclerView {
    private static final int FOOTER_INIT_INDEX = 2147483393;
    private static final int HEADER_INIT_INDEX = 2147483392;
    private final RecyclerView.AdapterDataObserver dataObserver;
    private LinearLayout footViewLayout;
    private LinearLayout headViewLayout;
    private int orientation;
    private final WrapAdapter wrapAdapter;

    public HFRecyclerView(Context context) {
        this(context, null);
    }

    public HFRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HFRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.dataObserver = new ShareDataUIState();
        this.orientation = 1;
        this.wrapAdapter = new WrapAdapter(new copydefault());
    }

    @Override
    public void setAdapter(RecyclerView.Adapter adapter) {
        this.wrapAdapter.setAdapter(adapter);
        super.setAdapter(this.wrapAdapter);
        try {
            adapter.registerAdapterDataObserver(this.dataObserver);
        } catch (Exception e) {
            L.e(e.getMessage());
        }
        this.dataObserver.onChanged();
    }

    @Override
    public RecyclerView.Adapter getAdapter() {
        RecyclerView.Adapter originalAdapter = this.wrapAdapter.getOriginalAdapter();
        if (originalAdapter instanceof copydefault) {
            return null;
        }
        return originalAdapter;
    }

    public void addHeaderView(View view) {
        addHeaderView(-1, view);
    }

    public void addFooterView(View view) {
        addFooterView(-1, view);
    }

    public void addHeaderView(int i, View view) {
        if (this.headViewLayout == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.headViewLayout = linearLayout;
            setLayoutParams(linearLayout);
            this.wrapAdapter.notifyItemInserted(0);
        }
        if (i < 0 || i > this.headViewLayout.getChildCount()) {
            i = this.headViewLayout.getChildCount();
        }
        this.headViewLayout.addView(view, i);
    }

    public void addFooterView(int i, View view) {
        if (this.footViewLayout == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.footViewLayout = linearLayout;
            setLayoutParams(linearLayout);
            WrapAdapter wrapAdapter = this.wrapAdapter;
            wrapAdapter.notifyItemInserted(wrapAdapter.getHeadersCount() + this.wrapAdapter.getOriginalAdapter().getItemCount());
        }
        if (i < 0 || i > this.footViewLayout.getChildCount()) {
            i = this.footViewLayout.getChildCount();
        }
        this.footViewLayout.addView(view, i);
    }

    private void setLayoutParams(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
            this.orientation = ((LinearLayoutManager) layoutManager).getOrientation();
        }
        if (this.orientation == 1) {
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        } else {
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
        }
    }

    @Override
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        super.setLayoutManager(layoutManager);
        setLayoutParams(this.headViewLayout);
        setLayoutParams(this.footViewLayout);
    }

    class ShareDataUIState extends RecyclerView.AdapterDataObserver {
        private ShareDataUIState() {
        }

        @Override
        public void onChanged() {
            if (HFRecyclerView.this.wrapAdapter != null) {
                HFRecyclerView.this.wrapAdapter.notifyDataSetChanged();
            }
        }

        @Override
        public void onItemRangeChanged(int i, int i2) {
            if (HFRecyclerView.this.wrapAdapter != null) {
                HFRecyclerView.this.wrapAdapter.notifyItemRangeChanged(i, i2);
            }
        }

        @Override
        public void onItemRangeInserted(int i, int i2) {
            if (HFRecyclerView.this.wrapAdapter != null) {
                HFRecyclerView.this.wrapAdapter.notifyItemRangeInserted(i, i2);
            }
        }

        @Override
        public void onItemRangeRemoved(int i, int i2) {
            if (HFRecyclerView.this.wrapAdapter != null) {
                HFRecyclerView.this.wrapAdapter.notifyItemRangeRemoved(i, i2);
            }
        }

        @Override
        public void onItemRangeMoved(int i, int i2, int i3) {
            if (HFRecyclerView.this.wrapAdapter != null) {
                HFRecyclerView.this.wrapAdapter.notifyItemMoved(i, i2);
            }
        }

        @Override
        public void onItemRangeChanged(int i, int i2, Object obj) {
            if (HFRecyclerView.this.wrapAdapter != null) {
                HFRecyclerView.this.wrapAdapter.notifyItemRangeChanged(i, i2, obj);
            }
        }
    }

    public class WrapAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        private RecyclerView.Adapter component3;

        private boolean ShareDataUIState(int i) {
            return i == HFRecyclerView.FOOTER_INIT_INDEX;
        }

        private boolean component3(int i) {
            return i == HFRecyclerView.HEADER_INIT_INDEX;
        }

        private boolean copydefault(int i) {
            return i == HFRecyclerView.HEADER_INIT_INDEX || i == HFRecyclerView.FOOTER_INIT_INDEX;
        }

        public WrapAdapter(RecyclerView.Adapter adapter) {
            this.component3 = adapter;
        }

        public void setAdapter(RecyclerView.Adapter adapter) {
            this.component3 = adapter;
        }

        public boolean isHeader(int i) {
            return i < getHeadersCount();
        }

        public RecyclerView.Adapter getOriginalAdapter() {
            return this.component3;
        }

        public boolean isFooter(int i) {
            return i >= getHeadersCount() + this.component3.getItemCount();
        }

        public int getFootersCount() {
            return HFRecyclerView.this.footViewLayout != null ? 1 : 0;
        }

        public int getHeadersCount() {
            return HFRecyclerView.this.headViewLayout != null ? 1 : 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (component3(i)) {
                if (HFRecyclerView.this.headViewLayout.getParent() != null) {
                    ((ViewGroup) HFRecyclerView.this.headViewLayout.getParent()).removeView(HFRecyclerView.this.headViewLayout);
                }
                return new component1(this, HFRecyclerView.this.headViewLayout);
            }
            if (ShareDataUIState(i)) {
                if (HFRecyclerView.this.footViewLayout.getParent() != null) {
                    ((ViewGroup) HFRecyclerView.this.footViewLayout.getParent()).removeView(HFRecyclerView.this.footViewLayout);
                }
                return new component1(this, HFRecyclerView.this.footViewLayout);
            }
            return this.component3.onCreateViewHolder(viewGroup, i);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (isHeader(i) || isFooter(i)) {
                return;
            }
            int headersCount = i - getHeadersCount();
            RecyclerView.Adapter adapter = this.component3;
            if (adapter != null && headersCount < adapter.getItemCount()) {
                this.component3.onBindViewHolder(viewHolder, headersCount);
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
            if (isHeader(i) || isFooter(i)) {
                return;
            }
            int headersCount = i - getHeadersCount();
            RecyclerView.Adapter adapter = this.component3;
            if (adapter != null && headersCount < adapter.getItemCount()) {
                if (!list.isEmpty()) {
                    this.component3.onBindViewHolder(viewHolder, headersCount, list);
                } else {
                    this.component3.onBindViewHolder(viewHolder, headersCount);
                }
            }
        }

        @Override
        public int getItemCount() {
            return getHeadersCount() + this.component3.getItemCount() + getFootersCount();
        }

        @Override
        public int getItemViewType(int i) {
            if (isHeader(i)) {
                return HFRecyclerView.HEADER_INIT_INDEX;
            }
            if (isFooter(i)) {
                return HFRecyclerView.FOOTER_INIT_INDEX;
            }
            int headersCount = i - getHeadersCount();
            RecyclerView.Adapter adapter = this.component3;
            if (adapter == null || headersCount >= adapter.getItemCount()) {
                return 0;
            }
            int itemViewType = this.component3.getItemViewType(headersCount);
            if (copydefault(itemViewType)) {
                throw new IllegalStateException("itemViewType should not in (10000, 20000) ");
            }
            return itemViewType;
        }

        @Override
        public long getItemId(int i) {
            int headersCount;
            if (this.component3 == null || i < getHeadersCount() || (headersCount = i - getHeadersCount()) >= this.component3.getItemCount()) {
                return -1L;
            }
            return this.component3.getItemId(headersCount);
        }

        @Override
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                component1((GridLayoutManager) layoutManager);
            }
            this.component3.onAttachedToRecyclerView(recyclerView);
        }

        private void component1(final GridLayoutManager gridLayoutManager) {
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i) {
                    if (WrapAdapter.this.isHeader(i) || WrapAdapter.this.isFooter(i)) {
                        return gridLayoutManager.getSpanCount();
                    }
                    return 1;
                }
            });
        }

        @Override
        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
            this.component3.onDetachedFromRecyclerView(recyclerView);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            super.onViewAttachedToWindow(viewHolder);
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if ((layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) && (isHeader(viewHolder.getLayoutPosition()) || isFooter(viewHolder.getLayoutPosition()))) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
            try {
                this.component3.onViewAttachedToWindow(viewHolder);
            } catch (Exception e) {
                L.e(e.getMessage());
            }
        }

        @Override
        public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            try {
                this.component3.onViewDetachedFromWindow(viewHolder);
            } catch (Exception e) {
                L.e(e.getMessage());
            }
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            try {
                this.component3.onViewRecycled(viewHolder);
            } catch (Exception e) {
                L.e(e.getMessage());
            }
        }

        @Override
        public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
            try {
                return this.component3.onFailedToRecycleView(viewHolder);
            } catch (Exception unused) {
                return super.onFailedToRecycleView(viewHolder);
            }
        }

        @Override
        public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.component3.registerAdapterDataObserver(adapterDataObserver);
        }

        @Override
        public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
            this.component3.unregisterAdapterDataObserver(adapterDataObserver);
        }

        class component1 extends RecyclerView.ViewHolder {
            public component1(WrapAdapter wrapAdapter, View view) {
                super(view);
            }
        }
    }

    static class copydefault extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
        @Override
        public int getItemCount() {
            return 0;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        }

        private copydefault() {
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerView.ViewHolder(this, new TextView(viewGroup.getContext())) {
            };
        }
    }
}
