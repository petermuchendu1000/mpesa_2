package com.huawei.digitalpayment.consumer.sfcui.statement.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.dynatrace.android.callback.Callback;
import com.huawei.digitalpayment.consumer.base.ui.dialog.SfcSingleSelectDialog;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.statement.resp.TransactionTypeBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0014J\u001a\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/dialog/TransactionCategorySelectDialog;", "Lcom/huawei/digitalpayment/consumer/base/ui/dialog/SfcSingleSelectDialog;", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/TransactionTypeBean;", "title", "", "data", "", "onItemSelectedListener", "Lcom/huawei/digitalpayment/consumer/base/ui/dialog/SfcSingleSelectDialog$OnItemSelectedListener;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/base/ui/dialog/SfcSingleSelectDialog$OnItemSelectedListener;)V", "getLayoutId", "", "getItemLayoutId", "convert", "", "helper", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "item", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionCategorySelectDialog extends SfcSingleSelectDialog<TransactionTypeBean> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;

    @Override
    public void convert(BaseViewHolder baseViewHolder, TransactionTypeBean transactionTypeBean) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        convert2(baseViewHolder, transactionTypeBean);
        if (i3 != 0) {
            throw null;
        }
        int i4 = component1 + 51;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionCategorySelectDialog(String str, List<TransactionTypeBean> list, SfcSingleSelectDialog.OnItemSelectedListener<TransactionTypeBean> onItemSelectedListener) {
        super(str, list, onItemSelectedListener);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.layout.dialog_transaction_category;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = R.layout.dialog_transaction_category;
        int i5 = component2 + 65;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return i4;
    }

    @Override
    public int getItemLayoutId() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.layout.dialog_item_transaction_category;
            throw null;
        }
        int i4 = R.layout.dialog_item_transaction_category;
        int i5 = component1 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    protected void convert2(BaseViewHolder helper, TransactionTypeBean item) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(helper, "");
        if (item != null) {
            helper.setImageResource(R.id.iv_image, item.getTransactionImage());
        }
        int i2 = R.id.tv_category;
        String transactionName = null;
        if (item != null) {
            int i3 = component2 + 23;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                item.getTransactionName();
                transactionName.hashCode();
                throw null;
            }
            transactionName = item.getTransactionName();
        } else {
            int i4 = component2 + 93;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        helper.setText(i2, transactionName);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        ((ImageView) view.findViewById(R.id.iv_back)).setOnClickListener(new View.OnClickListener() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view2) {
                int i2 = 2 % 2;
                int i3 = component3 + 123;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                TransactionCategorySelectDialog.$r8$lambda$7s4GnMPuFC_PgnySmBIYsLDxIkg(this.f$0, view2);
                if (i4 != 0) {
                    int i5 = 3 / 0;
                }
            }
        });
        int i2 = component1 + 29;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
    }

    private static final void copydefault(TransactionCategorySelectDialog transactionCategorySelectDialog, View view) {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(transactionCategorySelectDialog, "");
            transactionCategorySelectDialog.dismiss();
        } else {
            Intrinsics.checkNotNullParameter(transactionCategorySelectDialog, "");
            transactionCategorySelectDialog.dismiss();
            throw null;
        }
    }

    public static void $r8$lambda$7s4GnMPuFC_PgnySmBIYsLDxIkg(TransactionCategorySelectDialog transactionCategorySelectDialog, View view) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        component1(transactionCategorySelectDialog, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component2 + 97;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 97;
        component3 = i % 128;
        int i2 = i % 2;
    }

    private static void component1(TransactionCategorySelectDialog transactionCategorySelectDialog, View view) {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                copydefault(transactionCategorySelectDialog, view);
                Callback.onClick_exit();
                int i4 = 24 / 0;
            } else {
                copydefault(transactionCategorySelectDialog, view);
                Callback.onClick_exit();
            }
            int i5 = component2 + 21;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
