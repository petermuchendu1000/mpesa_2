package com.huawei.digitalpayment.consumer.sfcui.ui.activity;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.digitalpayment.consumer.sfc.databinding.ItemUserScopeBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0013R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/UserscopesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/UserscopesViewHolder;", "<init>", "()V", "userScopesList", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "updateUserScopesList", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserscopesAdapter extends RecyclerView.Adapter<UserscopesViewHolder> {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private List<String> ShareDataUIState = new ArrayList();

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 45;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        onBindViewHolder((UserscopesViewHolder) viewHolder, i);
        int i5 = copydefault + 77;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 47 / 0;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 53;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        UserscopesViewHolder userscopesViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i);
        int i5 = component1 + 63;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return userscopesViewHolderOnCreateViewHolder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public UserscopesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parent, "");
        ItemUserScopeBinding itemUserScopeBindingInflate = ItemUserScopeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(itemUserScopeBindingInflate, "");
        UserscopesViewHolder userscopesViewHolder = new UserscopesViewHolder(itemUserScopeBindingInflate);
        int i2 = component1 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return userscopesViewHolder;
    }

    public void onBindViewHolder(UserscopesViewHolder holder, int position) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(holder, "");
            this.ShareDataUIState.get(position);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(holder, "");
        String str = this.ShareDataUIState.get(position);
        holder.bind(str != null ? str : "");
        int i3 = copydefault + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int size = this.ShareDataUIState.size();
        int i4 = copydefault + 87;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return size;
    }

    public final void updateUserScopesList(List<String> userScopesList) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(userScopesList, "");
        for (String str : userScopesList) {
            if (Intrinsics.areEqual(str, ScopesConstants.INSTANCE.getUserName())) {
                this.ShareDataUIState.add("First Name");
            } else if (Intrinsics.areEqual(str, ScopesConstants.INSTANCE.getUserLastName())) {
                this.ShareDataUIState.add("Last Name");
            } else if (Intrinsics.areEqual(str, ScopesConstants.INSTANCE.getUserMiddleName())) {
                this.ShareDataUIState.add("Middle Name");
                int i4 = copydefault + 7;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            } else if (!(!Intrinsics.areEqual(str, ScopesConstants.INSTANCE.getUserDob()))) {
                int i6 = copydefault + 87;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                this.ShareDataUIState.add("Date of Birth");
            } else if (Intrinsics.areEqual(str, ScopesConstants.INSTANCE.getUserId())) {
                this.ShareDataUIState.add("User Id");
            } else if (Intrinsics.areEqual(str, ScopesConstants.INSTANCE.getUserIdNo())) {
                int i8 = component1 + 83;
                copydefault = i8 % 128;
                if (i8 % 2 == 0) {
                    this.ShareDataUIState.add("ID Number");
                    throw null;
                }
                this.ShareDataUIState.add("ID Number");
            } else if (Intrinsics.areEqual(str, ScopesConstants.INSTANCE.getUserMobile())) {
                this.ShareDataUIState.add("Phone Number");
            }
        }
        notifyDataSetChanged();
    }

    static {
        int i = 1 + 41;
        component2 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
