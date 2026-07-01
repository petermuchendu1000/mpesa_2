package com.huawei.digitalpayment.history.utils;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.AppUtils;
import com.huawei.digitalpayment.consumer.baselib.util.BitmapSaveUtils;
import com.huawei.digitalpayment.consumer.baselib.util.CommonUtils;
import com.huawei.digitalpayment.consumer.baselib.util.DensityUtils;
import com.huawei.digitalpayment.consumer.baselib.util.ReceiptToolsUtils;
import com.huawei.digitalpayment.consumer.baselib.util.permission.IPermissionListenerWrap;
import com.huawei.digitalpayment.consumer.baselib.util.permission.PermissionsHelper;
import com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse;
import com.huawei.history.R;

public class DetailReceiptSaveUtils {
    private static int ShareDataUIState = 1;
    private static int component3;

    public static void checkPermission(final FragmentActivity fragmentActivity, final TransactionHistoryDetailResponse transactionHistoryDetailResponse) {
        int i = 2 % 2;
        PermissionsHelper.init(fragmentActivity).requestWriteStoragePermission(new IPermissionListenerWrap.IPermissionListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onAccepted(boolean z) {
                int i2 = 2 % 2;
                int i3 = component3 + 71;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                DetailReceiptSaveUtils.component3(fragmentActivity, transactionHistoryDetailResponse, z);
                int i5 = component3 + 25;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component3 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3(FragmentActivity fragmentActivity, TransactionHistoryDetailResponse transactionHistoryDetailResponse, boolean z) {
        int i = 2 % 2;
        if (z) {
            int i2 = component3 + 37;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            generateReceipt(fragmentActivity, transactionHistoryDetailResponse);
            return;
        }
        AppUtils.launchAppDetailsSettings();
        int i4 = ShareDataUIState + 33;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void generateReceipt(FragmentActivity fragmentActivity, TransactionHistoryDetailResponse transactionHistoryDetailResponse) {
        int i = 2 % 2;
        if (transactionHistoryDetailResponse.getTradeDetails() == null) {
            return;
        }
        Object obj = null;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(fragmentActivity).inflate(R.layout.history_layout_quickpay_receipt, (ViewGroup) null, false);
        TextView textView = (TextView) frameLayout.findViewById(R.id.tv_amount);
        LinearLayout linearLayout = (LinearLayout) frameLayout.findViewById(R.id.ll_details);
        textView.setText(CommonUtils.addComma(transactionHistoryDetailResponse.getAmount()));
        TextView textView2 = (TextView) frameLayout.findViewById(R.id.tv_currency);
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.iv_kbzpay);
        textView2.setText(transactionHistoryDetailResponse.getUnit());
        int i2 = ShareDataUIState + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        for (TransactionHistoryDetailResponse.Field field : transactionHistoryDetailResponse.getTradeDetails()) {
            int i4 = component3 + 81;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            View viewInflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.history_item_quickpay_receipt, (ViewGroup) frameLayout, false);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_label);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_value);
            textView3.setText(field.getFieldName());
            textView4.setText(ShareDataUIState(field));
            linearLayout.addView(viewInflate);
        }
        if (transactionHistoryDetailResponse.getTradeDetails() != null) {
            int i6 = component3 + 89;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0 ? transactionHistoryDetailResponse.getTradeDetails().size() > 5 : transactionHistoryDetailResponse.getTradeDetails().size() > 5) {
                ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).topMargin = DensityUtils.dp2px(fragmentActivity, 16.0f);
            }
        }
        DisplayMetrics windowDisplayMetrics = ReceiptToolsUtils.getWindowDisplayMetrics(fragmentActivity);
        Bitmap bitmapGenerateImageFromView = ReceiptToolsUtils.generateImageFromView(frameLayout, windowDisplayMetrics.widthPixels, windowDisplayMetrics.heightPixels);
        BitmapSaveUtils.generateReceipt(fragmentActivity, bitmapGenerateImageFromView, null);
        bitmapGenerateImageFromView.recycle();
        int i7 = ShareDataUIState + 93;
        component3 = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static String ShareDataUIState(TransactionHistoryDetailResponse.Field field) {
        int i = 2 % 2;
        if (!(!"timestamp".equals(field.getType()))) {
            try {
                String transactionTime = ReceiptToolsUtils.getTransactionTime(Long.parseLong(field.getFieldValue()));
                int i2 = ShareDataUIState + 21;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 61 / 0;
                }
                return transactionTime;
            } catch (NumberFormatException unused) {
                return field.getFieldValue();
            }
        }
        String fieldValue = field.getFieldValue();
        int i4 = ShareDataUIState + 95;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return fieldValue;
    }
}
