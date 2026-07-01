package com.huawei.digitalpayment.consumer.baselib.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.digitalpayment.consumer.baselib.R;

public class SuccessDialog extends Dialog {
    public SuccessDialog(Context context) {
        super(context);
    }

    public SuccessDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {
        private static int copy = 0;
        private static int getRequestBeneficiariesState = 1;
        private Handler ShareDataUIState = new Handler(Looper.getMainLooper());
        private int component1;
        private int component2;
        private int component3;
        private Context copydefault;
        private String getAsAtTimestamp;

        public Builder(Context context) {
            this.copydefault = context;
        }

        public Builder setMessage(String str) {
            int i = 2 % 2;
            int i2 = copy + 89;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            this.getAsAtTimestamp = str;
            if (i3 != 0) {
                return this;
            }
            throw null;
        }

        public Builder setLayoutBackground(int i) {
            int i2 = 2 % 2;
            int i3 = getRequestBeneficiariesState + 93;
            int i4 = i3 % 128;
            copy = i4;
            int i5 = i3 % 2;
            this.component1 = i;
            int i6 = i4 + 29;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public Builder setIcon(int i) {
            int i2 = 2 % 2;
            int i3 = getRequestBeneficiariesState + 3;
            int i4 = i3 % 128;
            copy = i4;
            int i5 = i3 % 2;
            this.component2 = i;
            int i6 = i4 + 125;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public Builder setSecond(int i) {
            int i2 = 2 % 2;
            int i3 = copy + 33;
            int i4 = i3 % 128;
            getRequestBeneficiariesState = i4;
            int i5 = i3 % 2;
            this.component3 = i;
            int i6 = i4 + 51;
            copy = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        @Deprecated
        public SuccessDialog create() {
            int i = 2 % 2;
            final SuccessDialog successDialog = new SuccessDialog(this.copydefault, R.style.transparent_loading_dialog_style);
            View viewInflate = LayoutInflater.from(this.copydefault).inflate(R.layout.dialog_success, (ViewGroup) null);
            successDialog.setContentView(viewInflate);
            successDialog.setCancelable(false);
            successDialog.setCanceledOnTouchOutside(false);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.ll_layout);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_message);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_status);
            linearLayout.setBackgroundResource(this.component1);
            imageView.setImageResource(this.component2);
            textView.setText(this.getAsAtTimestamp);
            this.ShareDataUIState.postDelayed(new Runnable() {
                private static int ShareDataUIState = 0;
                private static int component2 = 1;

                @Override
                public final void run() {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 21;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    successDialog.dismiss();
                    if (i4 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, this.component3 * 1000);
            int i2 = copy + 55;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 34 / 0;
            }
            return successDialog;
        }
    }
}
