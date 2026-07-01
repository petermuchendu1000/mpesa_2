package com.huawei.digitalpayment.customer.dynamics;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.common.widget.dialog.SelectDialogWithConfirm;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsSelectInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/DynamicsElementTypeDialog;", "Lcom/huawei/common/widget/dialog/SelectDialogWithConfirm;", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsSelectInfo;", "title", "", "button", "data", "", "onItemSelectedListener", "Lcom/huawei/common/widget/dialog/SelectDialogWithConfirm$OnItemSelectedListener;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/common/widget/dialog/SelectDialogWithConfirm$OnItemSelectedListener;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "convert", "helper", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "item", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DynamicsElementTypeDialog extends SelectDialogWithConfirm<DynamicsSelectInfo> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public void convert(BaseViewHolder baseViewHolder, DynamicsSelectInfo dynamicsSelectInfo) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, dynamicsSelectInfo);
        int i4 = component3 + 71;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicsElementTypeDialog(String str, String str2, List<DynamicsSelectInfo> list, SelectDialogWithConfirm.OnItemSelectedListener<DynamicsSelectInfo> onItemSelectedListener) {
        super(str, str2, list, onItemSelectedListener);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "");
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, savedInstanceState);
            ((ImageView) view.findViewById(R.id.ivClose)).setImageResource(R.mipmap.base_icon_error1);
            int i3 = 72 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            super.onViewCreated(view, savedInstanceState);
            ((ImageView) view.findViewById(R.id.ivClose)).setImageResource(R.mipmap.base_icon_error1);
        }
        int i4 = component3 + 19;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[PHI: r1
  0x002a: PHI (r1v5 int) = (r1v4 int), (r1v7 int) binds: [B:8:0x0028, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void convert2(com.chad.library.adapter.base.viewholder.BaseViewHolder r6, com.huawei.digitalpayment.customer.dynamics.model.DynamicsSelectInfo r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.customer.dynamics.DynamicsElementTypeDialog.component1
            int r1 = r1 + 105
            int r2 = r1 % 128
            com.huawei.digitalpayment.customer.dynamics.DynamicsElementTypeDialog.component3 = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            r3 = 0
            if (r1 == 0) goto L20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            super.convert(r6, r7)
            int r1 = com.huawei.digitalpayment.customer.dynamics.R.id.tv_content
            r2 = 48
            int r2 = r2 / 0
            if (r7 == 0) goto L4a
            goto L2a
        L20:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            super.convert(r6, r7)
            int r1 = com.huawei.digitalpayment.customer.dynamics.R.id.tv_content
            if (r7 == 0) goto L4a
        L2a:
            int r2 = com.huawei.digitalpayment.customer.dynamics.DynamicsElementTypeDialog.component1
            int r2 = r2 + 71
            int r4 = r2 % 128
            com.huawei.digitalpayment.customer.dynamics.DynamicsElementTypeDialog.component3 = r4
            int r2 = r2 % r0
            if (r2 != 0) goto L43
            java.lang.String r3 = r7.getLabel()
            int r2 = com.huawei.digitalpayment.customer.dynamics.DynamicsElementTypeDialog.component3
            int r2 = r2 + 59
            int r4 = r2 % 128
            com.huawei.digitalpayment.customer.dynamics.DynamicsElementTypeDialog.component1 = r4
            int r2 = r2 % r0
            goto L4a
        L43:
            r7.getLabel()
            r3.hashCode()
            throw r3
        L4a:
            java.lang.String r0 = com.huawei.digitalpayment.consumer.baselib.util.PaymentResourcesUtils.getString(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.setText(r1, r0)
            int r0 = com.huawei.digitalpayment.customer.dynamics.R.id.iv_selected
            android.view.View r6 = r6.getView(r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            int r0 = com.huawei.digitalpayment.customer.dynamics.R.drawable.base_checkbox_active_selector
            r6.setImageResource(r0)
            boolean r7 = r5.isSelected(r7)
            r6.setActivated(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.DynamicsElementTypeDialog.convert2(com.chad.library.adapter.base.viewholder.BaseViewHolder, com.huawei.digitalpayment.customer.dynamics.model.DynamicsSelectInfo):void");
    }
}
