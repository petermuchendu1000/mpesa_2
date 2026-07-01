package com.huawei.digitalpayment.consumer.subsui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.subsui.R;

public abstract class ItemIndividualSubscriptionBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    public final RoundTextView btnUnsubscribe;
    public final CardView cvRoot;
    public final ImageView ivBundle;
    public final LinearLayout llContainer;
    public final TextView tvTitle;

    protected ItemIndividualSubscriptionBinding(Object obj, View view, int i, RoundTextView roundTextView, CardView cardView, ImageView imageView, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.btnUnsubscribe = roundTextView;
        this.cvRoot = cardView;
        this.ivBundle = imageView;
        this.llContainer = linearLayout;
        this.tvTitle = textView;
    }

    public static ItemIndividualSubscriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ItemIndividualSubscriptionBinding itemIndividualSubscriptionBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 41;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return itemIndividualSubscriptionBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ItemIndividualSubscriptionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component1 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ItemIndividualSubscriptionBinding itemIndividualSubscriptionBinding = (ItemIndividualSubscriptionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_individual_subscription, viewGroup, z, obj);
        int i4 = component1 + 17;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemIndividualSubscriptionBinding;
    }

    public static ItemIndividualSubscriptionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemIndividualSubscriptionBinding itemIndividualSubscriptionBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = component1 + 65;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemIndividualSubscriptionBindingInflate;
    }

    @Deprecated
    public static ItemIndividualSubscriptionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = component1 + 61;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.item_individual_subscription;
            z = true;
        } else {
            i = R.layout.item_individual_subscription;
            z = false;
        }
        ItemIndividualSubscriptionBinding itemIndividualSubscriptionBinding = (ItemIndividualSubscriptionBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = component1 + 121;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return itemIndividualSubscriptionBinding;
    }

    public static ItemIndividualSubscriptionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ItemIndividualSubscriptionBinding itemIndividualSubscriptionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = ShareDataUIState + 109;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return itemIndividualSubscriptionBindingBind;
        }
        throw null;
    }

    @Deprecated
    public static ItemIndividualSubscriptionBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ItemIndividualSubscriptionBinding itemIndividualSubscriptionBinding = (ItemIndividualSubscriptionBinding) bind(obj, view, R.layout.item_individual_subscription);
        int i4 = ShareDataUIState + 53;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return itemIndividualSubscriptionBinding;
    }
}
