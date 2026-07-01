package com.huawei.digitalpayment.consumer.profileui.ui.adapter;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.dynatrace.android.callback.Callback;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalProfileItem;
import com.huawei.digitalpayment.consumer.profileui.R;
import com.huawei.digitalpayment.consumer.profileui.databinding.ProfileItemProfileBinding;
import com.huawei.payment.mvvm.DataBindingAdapter;

public class ProfileInfoAdapter extends DataBindingAdapter<LocalProfileItem, ProfileItemProfileBinding> {
    private static final String component1 = "picture";
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public void onBindViewHolder(ViewDataBinding viewDataBinding, int i, LocalProfileItem localProfileItem) {
        int i2 = 2 % 2;
        int i3 = component2 + 93;
        copydefault = i3 % 128;
        ProfileItemProfileBinding profileItemProfileBinding = (ProfileItemProfileBinding) viewDataBinding;
        LocalProfileItem localProfileItem2 = localProfileItem;
        if (i3 % 2 == 0) {
            onBindViewHolder(profileItemProfileBinding, i, localProfileItem2);
        } else {
            onBindViewHolder(profileItemProfileBinding, i, localProfileItem2);
            int i4 = 99 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(com.huawei.digitalpayment.consumer.profileui.databinding.ProfileItemProfileBinding r6, int r7, final com.huawei.digitalpayment.consumer.profile.model.local.LocalProfileItem r8) {
        /*
            r5 = this;
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfileInfoAdapter.copydefault
            int r0 = r0 + 51
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfileInfoAdapter.component2 = r1
            int r0 = r0 % r7
            java.lang.String r1 = "picture"
            r2 = 8
            r3 = 0
            if (r0 != 0) goto L27
            android.widget.TextView r0 = r6.profilesName
            java.lang.String r4 = r8.getName()
            r0.setText(r4)
            java.lang.String r0 = r8.getType()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L73
            goto L3a
        L27:
            android.widget.TextView r0 = r6.profilesName
            java.lang.String r4 = r8.getName()
            r0.setText(r4)
            java.lang.String r0 = r8.getType()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L73
        L3a:
            int r0 = com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfileInfoAdapter.component2
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfileInfoAdapter.copydefault = r1
            int r0 = r0 % r7
            if (r0 == 0) goto L52
            com.huawei.common.widget.round.RoundImageView r7 = r6.profilesImg
            r7.setVisibility(r3)
            android.widget.TextView r7 = r6.profilesValue
            r0 = 124(0x7c, float:1.74E-43)
            r7.setVisibility(r0)
            goto L5c
        L52:
            com.huawei.common.widget.round.RoundImageView r7 = r6.profilesImg
            r7.setVisibility(r3)
            android.widget.TextView r7 = r6.profilesValue
            r7.setVisibility(r2)
        L5c:
            android.widget.ImageView r7 = r6.ivEditMore
            r7.setVisibility(r3)
            java.lang.String r7 = r8.getValue()
            com.huawei.image.glide.Base64Mode r7 = com.huawei.image.glide.Base64Mode.getConsumerMode(r7)
            com.huawei.common.widget.round.RoundImageView r0 = r6.profilesImg
            int r1 = com.huawei.digitalpayment.consumer.profileui.R.mipmap.icon_default_avatar
            int r2 = com.huawei.digitalpayment.consumer.profileui.R.mipmap.icon_default_avatar
            com.huawei.image.util.GlideUtils.load(r7, r0, r1, r2)
            goto Lbc
        L73:
            com.huawei.common.widget.round.RoundImageView r0 = r6.profilesImg
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.profilesValue
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r6.ivEditMore
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.profilesValue
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "\u202d"
            r1.<init>(r4)
            java.lang.String r4 = r8.getValue()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            android.widget.ImageView r0 = r6.ivEditMore
            boolean r1 = r8.getEditEnable()
            if (r1 == 0) goto La3
            r2 = r3
            goto Lac
        La3:
            int r1 = com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfileInfoAdapter.copydefault
            int r1 = r1 + 15
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfileInfoAdapter.component2 = r3
            int r1 = r1 % r7
        Lac:
            r0.setVisibility(r2)
            int r0 = com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfileInfoAdapter.component2
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfileInfoAdapter.copydefault = r1
            int r0 = r0 % r7
            if (r0 == 0) goto Lbc
            r7 = 3
            int r7 = r7 % r7
        Lbc:
            androidx.constraintlayout.widget.ConstraintLayout r6 = r6.itemView
            com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfileInfoAdapter$$ExternalSyntheticLambda0 r7 = new com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfileInfoAdapter$$ExternalSyntheticLambda0
            r7.<init>()
            com.huawei.common.util.FastClickUtils.setOnClickListener(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.adapter.ProfileInfoAdapter.onBindViewHolder(com.huawei.digitalpayment.consumer.profileui.databinding.ProfileItemProfileBinding, int, com.huawei.digitalpayment.consumer.profile.model.local.LocalProfileItem):void");
    }

    private static void component2(LocalProfileItem localProfileItem, View view) {
        int i = 2 % 2;
        int i2 = component2 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (localProfileItem.getEditEnable() || component1.equals(localProfileItem.getType())) {
            RouteUtils.routeWithExecute(localProfileItem.getExecute());
            int i4 = component2 + 77;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 3;
            }
        }
        int i6 = component2 + 81;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.profile_item_profile;
        int i5 = component2 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public static void m10891$r8$lambda$wttS9aU_W1d5x_zYV9Wkx9fwE(LocalProfileItem localProfileItem, View view) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(localProfileItem, view);
        int i4 = component2 + 33;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void ShareDataUIState(LocalProfileItem localProfileItem, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                component2(localProfileItem, view);
                Callback.onClick_exit();
            } else {
                component2(localProfileItem, view);
                Callback.onClick_exit();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
