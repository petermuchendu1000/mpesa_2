package com.huawei.digitalpayment.checkout.resp;

import android.content.Context;
import com.huawei.digitalpayment.checkoutUi.R;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/checkout/resp/ReverseCategoryItems;", "", "<init>", "()V", "WRONG_NUMBER", "", "WRONG_AMOUNT", "FRAUD", "REFUND", "OTHER_REASON", "createCategoryBeans", "", "Lcom/huawei/digitalpayment/checkout/resp/ReverseTransactionCategoryBean;", "context", "Landroid/content/Context;", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReverseCategoryItems {
    public static final int $stable = 0;
    public static final String FRAUD = "fraud";
    public static final ReverseCategoryItems INSTANCE = new ReverseCategoryItems();
    public static final String OTHER_REASON = "other reason";
    public static final String REFUND = "refund";
    private static int ShareDataUIState = 0;
    public static final String WRONG_AMOUNT = "wrong amount";
    public static final String WRONG_NUMBER = "wrong number";
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    private ReverseCategoryItems() {
    }

    public final List<ReverseTransactionCategoryBean> createCategoryBeans(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(R.string.wrong_number);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = context.getString(R.string.wrong_number_tips);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        ReverseTransactionCategoryBean reverseTransactionCategoryBean = new ReverseTransactionCategoryBean(WRONG_NUMBER, string, string2, "", false, 16, null);
        String string3 = context.getString(R.string.wrong_amount);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        ReverseTransactionCategoryBean reverseTransactionCategoryBean2 = new ReverseTransactionCategoryBean(WRONG_AMOUNT, string3, "", "", false, 16, null);
        String string4 = context.getString(R.string.fraud);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        ReverseTransactionCategoryBean reverseTransactionCategoryBean3 = new ReverseTransactionCategoryBean(FRAUD, string4, "", "", false, 16, null);
        String string5 = context.getString(R.string.refund);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        ReverseTransactionCategoryBean reverseTransactionCategoryBean4 = new ReverseTransactionCategoryBean("refund", string5, "", "", false, 16, null);
        String string6 = context.getString(R.string.other_reason);
        Intrinsics.checkNotNullExpressionValue(string6, "");
        List<ReverseTransactionCategoryBean> mutableList = CollectionsKt.toMutableList((Collection) CollectionsKt.listOf((Object[]) new ReverseTransactionCategoryBean[]{reverseTransactionCategoryBean, reverseTransactionCategoryBean2, reverseTransactionCategoryBean3, reverseTransactionCategoryBean4, new ReverseTransactionCategoryBean(OTHER_REASON, string6, "", "", false, 16, null)}));
        int i2 = copydefault + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return mutableList;
    }

    static {
        int i = component2 + 97;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }
}
