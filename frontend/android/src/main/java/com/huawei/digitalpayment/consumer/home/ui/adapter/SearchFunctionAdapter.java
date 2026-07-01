package com.huawei.digitalpayment.consumer.home.ui.adapter;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.baselib.widget.holder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.home.widget.OnFunctionClick;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.homeui.databinding.ItemSearchBinding;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.util.FunctionUtils;
import com.huawei.image.util.GlideUtils;
import java.util.List;
import java.util.Locale;

public class SearchFunctionAdapter extends RecyclerView.Adapter<BaseViewHolder<ItemSearchBinding>> {
    private static int component1 = 0;
    private static int copydefault = 1;
    private List<LocalHomeFunction> ShareDataUIState;
    private String component2;
    private OnFunctionClick component3;

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 73;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((BaseViewHolder<ItemSearchBinding>) viewHolder, i);
        if (i4 == 0) {
            int i5 = 98 / 0;
        }
        int i6 = component1 + 57;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 85;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        BaseViewHolder<ItemSearchBinding> baseViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        int i5 = component1 + 51;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return baseViewHolderOnCreateViewHolder;
    }

    public SearchFunctionAdapter(List<LocalHomeFunction> list, OnFunctionClick onFunctionClick, String str) {
        this.ShareDataUIState = list;
        this.component3 = onFunctionClick;
        this.component2 = str;
    }

    @Override
    public BaseViewHolder<ItemSearchBinding> onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        BaseViewHolder<ItemSearchBinding> baseViewHolder = new BaseViewHolder<>(ItemSearchBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        int i3 = component1 + 115;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return baseViewHolder;
    }

    public void highlightKeywords(TextView textView, String str, String str2) {
        int i = 2 % 2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        String lowerCase2 = str2.toLowerCase(Locale.ROOT);
        int iIndexOf = lowerCase.indexOf(lowerCase2);
        int color = textView.getContext().getResources().getColor(R.color.colorPrimary, null);
        while (iIndexOf != -1) {
            int length = lowerCase2.length() + iIndexOf;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(color), iIndexOf, length, 33);
            iIndexOf = lowerCase.indexOf(lowerCase2, length);
            int i2 = component1 + 99;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        }
        textView.setText(spannableStringBuilder);
    }

    public void onBindViewHolder(BaseViewHolder<ItemSearchBinding> baseViewHolder, int i) {
        int i2 = 2 % 2;
        final LocalHomeFunction localHomeFunction = this.ShareDataUIState.get(i);
        ItemSearchBinding itemSearchBinding = (ItemSearchBinding) baseViewHolder.binding;
        highlightKeywords(itemSearchBinding.tvFunctionName, localHomeFunction.getFuncName(), this.component2);
        GlideUtils.setFunctionIcon(itemSearchBinding.ivFunctionIcon, localHomeFunction.getFunIcon(), R.mipmap.home_v5_icon_miniapp_default);
        itemSearchBinding.getRoot().setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final void onClick(View view) {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 1;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                SearchFunctionAdapter.m10489$r8$lambda$wz2rh3rmrs60lUaWnBhe_mqGNA(this.f$0, localHomeFunction, view);
                int i6 = component2 + 75;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i3 = copydefault + 71;
        component1 = i3 % 128;
        int i4 = i3 % 2;
    }

    private void component1(LocalHomeFunction localHomeFunction, View view) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.component3.onClick(localHomeFunction);
        FunctionUtils.execute(localHomeFunction);
        int i4 = copydefault + 97;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void update(List<LocalHomeFunction> list) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.ShareDataUIState = list;
            notifyDataSetChanged();
            int i3 = 54 / 0;
        } else {
            this.ShareDataUIState = list;
            notifyDataSetChanged();
        }
    }

    public List<LocalHomeFunction> getData() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 117;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<LocalHomeFunction> list = this.ShareDataUIState;
        int i5 = i2 + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public void setKeywords(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 111;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.component2 = str;
        int i5 = i2 + 103;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 55;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            List<LocalHomeFunction> list = this.ShareDataUIState;
            if (list != null) {
                return list.size();
            }
            int i4 = i2 + 7;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return 0;
            }
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    public static void m10489$r8$lambda$wz2rh3rmrs60lUaWnBhe_mqGNA(SearchFunctionAdapter searchFunctionAdapter, LocalHomeFunction localHomeFunction, View view) {
        int i = 2 % 2;
        int i2 = component1 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        copydefault(searchFunctionAdapter, localHomeFunction, view);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = copydefault + 125;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Finally extract failed */
    private static void copydefault(SearchFunctionAdapter searchFunctionAdapter, LocalHomeFunction localHomeFunction, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                searchFunctionAdapter.component1(localHomeFunction, view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            searchFunctionAdapter.component1(localHomeFunction, view);
            Callback.onClick_exit();
            int i4 = copydefault + 27;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 16 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
