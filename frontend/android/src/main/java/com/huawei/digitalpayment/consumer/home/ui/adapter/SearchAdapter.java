package com.huawei.digitalpayment.consumer.home.ui.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.baselib.widget.holder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.home.widget.OnFunctionClick;
import com.huawei.digitalpayment.consumer.homeui.databinding.ItemSearchGroupBinding;
import com.huawei.digitalpayment.home.data.source.locaL.LocalFunctionGroup;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.safaricom.consumer.commons.helper.ConstantsKt;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SearchAdapter extends RecyclerView.Adapter<BaseViewHolder<ItemSearchGroupBinding>> {
    private static int component3 = 0;
    private static int getRequestBeneficiariesState = 1;
    private OnFunctionClick ShareDataUIState;
    private List<LocalFunctionGroup> component1;
    private Context component2;
    private String copydefault;

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((BaseViewHolder<ItemSearchGroupBinding>) viewHolder, i);
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 77;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return onCreateViewHolder(viewGroup, i);
        }
        onCreateViewHolder(viewGroup, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SearchAdapter(Context context, List<LocalFunctionGroup> list, OnFunctionClick onFunctionClick, String str) {
        this.component2 = context;
        this.component1 = list;
        this.ShareDataUIState = onFunctionClick;
        this.copydefault = str;
    }

    @Override
    public BaseViewHolder<ItemSearchGroupBinding> onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        BaseViewHolder<ItemSearchGroupBinding> baseViewHolder = new BaseViewHolder<>(ItemSearchGroupBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        int i3 = component3 + 93;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            return baseViewHolder;
        }
        throw null;
    }

    static boolean ShareDataUIState(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return i3 != 0 ? zIsEmpty : !zIsEmpty;
    }

    private String component1(LocalFunctionGroup localFunctionGroup) {
        int i = 2 % 2;
        String str = (String) Stream.of((Object[]) new String[]{localFunctionGroup.getGroupName(), localFunctionGroup.getMenuName(), localFunctionGroup.getMenuType()}).filter(new Predicate() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final boolean test(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 29;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                boolean zShareDataUIState = SearchAdapter.ShareDataUIState((String) obj);
                if (i4 != 0) {
                    int i5 = 52 / 0;
                }
                int i6 = copydefault + 119;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                return zShareDataUIState;
            }
        }).findFirst().orElse(ConstantsKt.SEPARATOR_STRING);
        int i2 = getRequestBeneficiariesState + 55;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public void onBindViewHolder(BaseViewHolder<ItemSearchGroupBinding> baseViewHolder, int i) {
        int i2 = 2 % 2;
        LocalFunctionGroup localFunctionGroup = this.component1.get(i);
        ItemSearchGroupBinding itemSearchGroupBinding = (ItemSearchGroupBinding) baseViewHolder.binding;
        List<LocalHomeFunction> list = localFunctionGroup.getList();
        itemSearchGroupBinding.tvTitle.setText(component1(localFunctionGroup));
        itemSearchGroupBinding.groupFunctionRecycler.setNestedScrollingEnabled(false);
        itemSearchGroupBinding.groupFunctionRecycler.setLayoutManager(new GridLayoutManager(baseViewHolder.getContext(), 4));
        itemSearchGroupBinding.groupFunctionRecycler.setAdapter(new SearchFunctionAdapter(list, this.ShareDataUIState, this.copydefault));
        itemSearchGroupBinding.ivArrow.setVisibility(8);
        itemSearchGroupBinding.tvTitle.setGravity(8388627);
        itemSearchGroupBinding.tvTitle.setOnClickListener(null);
        int i3 = getRequestBeneficiariesState + 123;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
    }

    public void setData(List<LocalFunctionGroup> list) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            this.component1 = list;
            notifyDataSetChanged();
            int i3 = 93 / 0;
        } else {
            this.component1 = list;
            notifyDataSetChanged();
        }
        int i4 = component3 + 107;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        List<LocalFunctionGroup> list = this.component1;
        if (list == null) {
            int i2 = getRequestBeneficiariesState + 51;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }
        int size = list.size();
        int i4 = component3 + 61;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    public void setKeywords(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = str;
        int i5 = i2 + 13;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }
}
