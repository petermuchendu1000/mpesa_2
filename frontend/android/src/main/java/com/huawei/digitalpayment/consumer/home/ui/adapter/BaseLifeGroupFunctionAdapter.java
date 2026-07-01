package com.huawei.digitalpayment.consumer.home.ui.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.widget.holder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.home.constants.HomeSPConstants;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.homeui.databinding.ItemLifeGroupFunctionBinding;
import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.image.util.GlideUtils;
import java.util.List;

public abstract class BaseLifeGroupFunctionAdapter extends RecyclerView.Adapter<BaseViewHolder<ItemLifeGroupFunctionBinding>> {
    private static int component1 = 1;
    private static int copydefault;
    private boolean ShareDataUIState;
    private OnItemClickListener component2;
    private List<LocalFunctionGroup> component3;

    public interface OnItemClickListener {
        void onItemClick(LocalHomeFunction localHomeFunction);
    }

    protected abstract BaseLifeFunctionAdapter getBaseLifeFunctionAdapter();

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((BaseViewHolder<ItemLifeGroupFunctionBinding>) viewHolder, i);
        int i5 = component1 + 125;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 45;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        BaseViewHolder<ItemLifeGroupFunctionBinding> baseViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        if (i4 != 0) {
            int i5 = 93 / 0;
        }
        return baseViewHolderOnCreateViewHolder;
    }

    public BaseLifeGroupFunctionAdapter(boolean z) {
        this.ShareDataUIState = z;
    }

    public BaseLifeGroupFunctionAdapter(List<LocalFunctionGroup> list) {
        this.ShareDataUIState = true;
        this.component3 = list;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.component2 = onItemClickListener;
        if (i4 != 0) {
            int i5 = 43 / 0;
        }
        int i6 = i2 + 91;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void update(List<LocalFunctionGroup> list) {
        int i = 2 % 2;
        int i2 = component1 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.component3 = list;
        notifyDataSetChanged();
        int i4 = component1 + 73;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public BaseViewHolder<ItemLifeGroupFunctionBinding> onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        BaseViewHolder<ItemLifeGroupFunctionBinding> baseViewHolder = new BaseViewHolder<>(ItemLifeGroupFunctionBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        int i3 = copydefault + 77;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return baseViewHolder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void ShareDataUIState(BaseLifeFunctionAdapter baseLifeFunctionAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 37;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        OnItemClickListener onItemClickListener = this.component2;
        if (onItemClickListener != null) {
            int i6 = i4 + 7;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            onItemClickListener.onItemClick(baseLifeFunctionAdapter.getItem(i));
            if (i7 == 0) {
                int i8 = 80 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(com.huawei.digitalpayment.consumer.baselib.widget.holder.BaseViewHolder<com.huawei.digitalpayment.consumer.homeui.databinding.ItemLifeGroupFunctionBinding> r10, int r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.adapter.BaseLifeGroupFunctionAdapter.onBindViewHolder(com.huawei.digitalpayment.consumer.baselib.widget.holder.BaseViewHolder, int):void");
    }

    private void component1(String str, ItemLifeGroupFunctionBinding itemLifeGroupFunctionBinding, LocalFunctionGroup localFunctionGroup, View view) {
        int i;
        int i2 = 2 % 2;
        boolean zCopydefault = copydefault(str);
        ShareDataUIState(str, !zCopydefault);
        itemLifeGroupFunctionBinding.groupFunctionRecycler.setVisibility(zCopydefault ^ true ? 8 : 0);
        itemLifeGroupFunctionBinding.viewMargin.setVisibility(zCopydefault ? 8 : 0);
        ImageView imageView = itemLifeGroupFunctionBinding.ivArrow;
        if (zCopydefault) {
            i = R.mipmap.icon_arrow_up;
            int i3 = component1 + 65;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = copydefault + 71;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                i = R.mipmap.icon_arrow_down;
                int i6 = 46 / 0;
            } else {
                i = R.mipmap.icon_arrow_down;
            }
        }
        imageView.setImageResource(i);
        if (!zCopydefault) {
            int i7 = component1 + 5;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                TextUtils.isEmpty(localFunctionGroup.getMarker());
                throw null;
            }
            if (!TextUtils.isEmpty(localFunctionGroup.getMarker())) {
                int i8 = component1 + 89;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
                itemLifeGroupFunctionBinding.ivMarker.setVisibility(0);
                GlideUtils.setFunctionIcon(itemLifeGroupFunctionBinding.ivMarker, localFunctionGroup.getMarker());
                return;
            }
        }
        itemLifeGroupFunctionBinding.ivMarker.setVisibility(4);
    }

    private boolean copydefault(String str) {
        int i = 2 % 2;
        boolean z = SPUtils.getInstance(HomeSPConstants.SP_NAME_CACHE).getBoolean(HomeSPConstants.HIDE_LIFE_GROUP_FUNCTION + str + "_" + SPUtils.getInstance().getString("recent_login_phone_number"), false);
        int i2 = copydefault + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 98 / 0;
        }
        return z;
    }

    private void ShareDataUIState(String str, boolean z) {
        int i = 2 % 2;
        SPUtils.getInstance(HomeSPConstants.SP_NAME_CACHE).put(HomeSPConstants.HIDE_LIFE_GROUP_FUNCTION + str + "_" + SPUtils.getInstance().getString("recent_login_phone_number"), z);
        int i2 = component1 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            List<LocalFunctionGroup> list = this.component3;
            if (list != null) {
                return list.size();
            }
            int i4 = i2 + 43;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$1dtSAMkcmvLNR5x6RC8mH6BQ2aI(BaseLifeGroupFunctionAdapter baseLifeGroupFunctionAdapter, BaseLifeFunctionAdapter baseLifeFunctionAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        baseLifeGroupFunctionAdapter.ShareDataUIState(baseLifeFunctionAdapter, baseQuickAdapter, view, i);
        int i5 = copydefault + 41;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void $r8$lambda$6PY4rlxHqba0r0QMRijXnGvPexk(BaseLifeGroupFunctionAdapter baseLifeGroupFunctionAdapter, String str, ItemLifeGroupFunctionBinding itemLifeGroupFunctionBinding, LocalFunctionGroup localFunctionGroup, View view) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        component3(baseLifeGroupFunctionAdapter, str, itemLifeGroupFunctionBinding, localFunctionGroup, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void component3(BaseLifeGroupFunctionAdapter baseLifeGroupFunctionAdapter, String str, ItemLifeGroupFunctionBinding itemLifeGroupFunctionBinding, LocalFunctionGroup localFunctionGroup, View view) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                baseLifeGroupFunctionAdapter.component1(str, itemLifeGroupFunctionBinding, localFunctionGroup, view);
                Callback.onClick_exit();
                int i4 = 60 / 0;
            } else {
                baseLifeGroupFunctionAdapter.component1(str, itemLifeGroupFunctionBinding, localFunctionGroup, view);
                Callback.onClick_exit();
            }
            int i5 = copydefault + 125;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 32 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
