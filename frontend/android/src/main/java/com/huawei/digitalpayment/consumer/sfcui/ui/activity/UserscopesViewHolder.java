package com.huawei.digitalpayment.consumer.sfcui.ui.activity;

import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.databinding.ItemUserScopeBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/UserscopesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ItemUserScopeBinding;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/databinding/ItemUserScopeBinding;)V", "getBinding", "()Lcom/huawei/digitalpayment/consumer/sfc/databinding/ItemUserScopeBinding;", "bind", "", "userScope", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserscopesViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;
    private static int component1 = 115 % 128;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private final ItemUserScopeBinding ShareDataUIState;

    public final ItemUserScopeBinding getBinding() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserscopesViewHolder(ItemUserScopeBinding itemUserScopeBinding) {
        super(itemUserScopeBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemUserScopeBinding, "");
        this.ShareDataUIState = itemUserScopeBinding;
    }

    public final void bind(String userScope) {
        int i = 2 % 2;
        int i2 = component2 + 123;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(userScope, "");
            this.ShareDataUIState.tvUserscope.setText(userScope);
            this.ShareDataUIState.executePendingBindings();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(userScope, "");
        this.ShareDataUIState.tvUserscope.setText(userScope);
        this.ShareDataUIState.executePendingBindings();
        int i3 = component3 + 65;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        if (115 % 2 == 0) {
            throw null;
        }
    }
}
