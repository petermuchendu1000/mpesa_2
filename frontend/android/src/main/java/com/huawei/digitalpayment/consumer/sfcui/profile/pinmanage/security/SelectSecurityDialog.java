package com.huawei.digitalpayment.consumer.sfcui.profile.pinmanage.security;

import android.os.Bundle;
import android.view.View;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.huawei.digitalpayment.consumer.base.ui.dialog.SfcSingleSelectDialog;
import com.huawei.digitalpayment.consumer.sfc.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\u001a\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/SelectSecurityDialog;", "Lcom/huawei/digitalpayment/consumer/base/ui/dialog/SfcSingleSelectDialog;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/LocalQuestionItem;", "title", "", "data", "", "onItemSelectedListener", "Lcom/huawei/digitalpayment/consumer/base/ui/dialog/SfcSingleSelectDialog$OnItemSelectedListener;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/base/ui/dialog/SfcSingleSelectDialog$OnItemSelectedListener;)V", "convert", "", "helper", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "item", "getLayoutId", "", "getItemLayoutId", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SelectSecurityDialog extends SfcSingleSelectDialog<LocalQuestionItem> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public void convert(BaseViewHolder baseViewHolder, LocalQuestionItem localQuestionItem) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, localQuestionItem);
        int i4 = component3 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectSecurityDialog(String str, List<LocalQuestionItem> list, SfcSingleSelectDialog.OnItemSelectedListener<LocalQuestionItem> onItemSelectedListener) {
        super(str, list, onItemSelectedListener);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "");
    }

    protected void convert2(BaseViewHolder helper, LocalQuestionItem item) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(helper, "");
        int i2 = R.id.tv_content;
        String name = null;
        if (item != null) {
            int i3 = component3 + 35;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                item.getName();
                name.hashCode();
                throw null;
            }
            name = item.getName();
        } else {
            int i4 = component3 + 23;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        helper.setText(i2, name);
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.dialog_select_security;
        int i5 = component3 + 31;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getItemLayoutId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.item_dialog_select_security;
        int i5 = component3 + 115;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        int i4 = component3 + 79;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 1 + 13;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }
}
