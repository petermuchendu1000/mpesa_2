package com.huawei.digitalpayment.consumer.scan.ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.widget.dialog.BaseDialog;
import com.huawei.digitalpayment.consumer.qrcode.R;

public class QrCodeTipsDialog extends BaseDialog {
    private static int getShareableDataState = 0;
    private static int toString = 1;
    private View.OnClickListener ShareDataUIState;
    private TextView component1;
    private int component2;
    private String component3;
    private TextView component4;
    private TextView copy;
    private String copydefault;
    private View.OnClickListener equals;
    private int getAsAtTimestamp;
    private String getRequestBeneficiariesState;

    public QrCodeTipsDialog() {
    }

    public String getContent() {
        int i = 2 % 2;
        int i2 = toString + 17;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return str;
    }

    public String getLeftButtonText() {
        int i = 2 % 2;
        int i2 = toString + 109;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public String getRightButtonText() {
        int i = 2 % 2;
        int i2 = toString + 57;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getRequestBeneficiariesState;
        }
        throw null;
    }

    public int getLeftButtonTextColor() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 105;
        toString = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component2;
        int i6 = i2 + 125;
        toString = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int getRightButtonTextColor() {
        int i = 2 % 2;
        int i2 = toString + 29;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getAsAtTimestamp;
        }
        throw null;
    }

    private QrCodeTipsDialog(Builder builder) {
        this.component3 = Builder.copydefault(builder);
        this.copydefault = Builder.ShareDataUIState(builder);
        this.getRequestBeneficiariesState = Builder.component2(builder);
        this.component2 = Builder.component1(builder);
        this.getAsAtTimestamp = Builder.copy(builder);
        this.ShareDataUIState = Builder.component3(builder);
        this.equals = Builder.getRequestBeneficiariesState(builder);
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 123;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.layout.base_dialog_common_tips;
            throw null;
        }
        int i4 = R.layout.base_dialog_common_tips;
        int i5 = getShareableDataState + 3;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void onStart() {
        Window window;
        int i = 2 % 2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout((getWidth(window) * 8) / 10, -2);
            int i2 = toString + 95;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = getShareableDataState + 125;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    private void component3(View view) {
        int i = 2 % 2;
        View.OnClickListener onClickListener = this.ShareDataUIState;
        if (onClickListener != null) {
            int i2 = toString + 81;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            onClickListener.onClick(view);
        }
        dismiss();
        int i4 = toString + 75;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 android.view.View$OnClickListener) = (r1v4 android.view.View$OnClickListener), (r1v7 android.view.View$OnClickListener) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ShareDataUIState(android.view.View r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.scan.ui.dialog.QrCodeTipsDialog.getShareableDataState
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.scan.ui.dialog.QrCodeTipsDialog.toString = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            android.view.View$OnClickListener r1 = r3.equals
            r2 = 60
            int r2 = r2 / 0
            if (r1 == 0) goto L2c
            goto L1b
        L17:
            android.view.View$OnClickListener r1 = r3.equals
            if (r1 == 0) goto L2c
        L1b:
            r1.onClick(r4)
            int r4 = com.huawei.digitalpayment.consumer.scan.ui.dialog.QrCodeTipsDialog.getShareableDataState
            int r4 = r4 + 93
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.scan.ui.dialog.QrCodeTipsDialog.toString = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L2c
            r4 = 3
            int r4 = r4 / 5
        L2c:
            r3.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.dialog.QrCodeTipsDialog.ShareDataUIState(android.view.View):void");
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        super.onViewCreated(view, bundle);
        this.component1 = (TextView) view.findViewById(R.id.tv_left_button);
        this.copy = (TextView) view.findViewById(R.id.tv_right_button);
        this.component4 = (TextView) view.findViewById(R.id.tv_tips_content);
        this.component1.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view2) {
                int i2 = 2 % 2;
                int i3 = copydefault + 1;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                QrCodeTipsDialog.m10965$r8$lambda$4e2cxKXGZC9rewHc1j0bxHFV0(this.f$0, view2);
                int i5 = copydefault + 13;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.copy.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onClick(View view2) {
                int i2 = 2 % 2;
                int i3 = component2 + 5;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                QrCodeTipsDialog.$r8$lambda$Okc8gp2ENKWrz47HdAWpl37E2nA(this.f$0, view2);
                int i5 = component1 + 25;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        if (!TextUtils.isEmpty(this.component3)) {
            this.component4.setText(this.component3);
        }
        if (!TextUtils.isEmpty(this.copydefault)) {
            this.component1.setVisibility(0);
            this.component1.setText(this.copydefault);
        }
        int i2 = this.component2;
        if (i2 != 0) {
            int i3 = toString + 43;
            getShareableDataState = i3 % 128;
            if (i3 % 2 == 0) {
                this.component1.setTextColor(i2);
            } else {
                this.component1.setTextColor(i2);
                throw null;
            }
        }
        if (!TextUtils.isEmpty(this.getRequestBeneficiariesState)) {
            this.copy.setText(this.getRequestBeneficiariesState);
        }
        int i4 = this.getAsAtTimestamp;
        if (i4 != 0) {
            int i5 = toString + 63;
            getShareableDataState = i5 % 128;
            if (i5 % 2 != 0) {
                this.copy.setTextColor(i4);
                int i6 = 35 / 0;
            } else {
                this.copy.setTextColor(i4);
            }
        }
        int i7 = getShareableDataState + 59;
        toString = i7 % 128;
        int i8 = i7 % 2;
    }

    public static void m10965$r8$lambda$4e2cxKXGZC9rewHc1j0bxHFV0(QrCodeTipsDialog qrCodeTipsDialog, View view) {
        int i = 2 % 2;
        int i2 = toString + 77;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        component3(qrCodeTipsDialog, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$Okc8gp2ENKWrz47HdAWpl37E2nA(QrCodeTipsDialog qrCodeTipsDialog, View view) {
        int i = 2 % 2;
        int i2 = toString + 95;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(qrCodeTipsDialog, view);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = toString + 27;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void component3(QrCodeTipsDialog qrCodeTipsDialog, View view) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 33;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                qrCodeTipsDialog.component3(view);
                Callback.onClick_exit();
                int i4 = 62 / 0;
            } else {
                qrCodeTipsDialog.component3(view);
                Callback.onClick_exit();
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void ShareDataUIState(QrCodeTipsDialog qrCodeTipsDialog, View view) {
        int i = 2 % 2;
        int i2 = toString + 5;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                qrCodeTipsDialog.ShareDataUIState(view);
                Callback.onClick_exit();
            } else {
                qrCodeTipsDialog.ShareDataUIState(view);
                Callback.onClick_exit();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    public static class Builder {
        private static int copy = 1;
        private static int getAsAtTimestamp;
        private String ShareDataUIState;
        private String component1;
        private int component2;
        private String component3;
        private View.OnClickListener copydefault;
        private int equals;
        private View.OnClickListener getRequestBeneficiariesState;

        public Builder setContent(String str) {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 75;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            this.component1 = str;
            int i5 = i2 + 67;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public Builder setLeftButtonText(String str) {
            int i = 2 % 2;
            int i2 = copy + 95;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            this.component3 = str;
            if (i3 != 0) {
                int i4 = 71 / 0;
            }
            return this;
        }

        public Builder setRightButtonText(String str) {
            int i = 2 % 2;
            int i2 = copy + 17;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState = str;
            if (i3 == 0) {
                return this;
            }
            throw null;
        }

        public Builder setLeftButtonTextColor(int i) {
            int i2 = 2 % 2;
            int i3 = copy + 71;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            this.component2 = i;
            if (i4 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Builder setRightButtonTextColor(int i) {
            int i2 = 2 % 2;
            int i3 = getAsAtTimestamp + 47;
            int i4 = i3 % 128;
            copy = i4;
            int i5 = i3 % 2;
            this.equals = i;
            int i6 = i4 + 3;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Builder setLeftClickListener(View.OnClickListener onClickListener) {
            int i = 2 % 2;
            int i2 = copy + 11;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            this.copydefault = onClickListener;
            int i5 = i3 + 41;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Builder setRightClickListener(View.OnClickListener onClickListener) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 119;
            copy = i2 % 128;
            int i3 = i2 % 2;
            this.getRequestBeneficiariesState = onClickListener;
            if (i3 != 0) {
                return this;
            }
            throw null;
        }

        public QrCodeTipsDialog build() {
            int i = 2 % 2;
            QrCodeTipsDialog qrCodeTipsDialog = new QrCodeTipsDialog(this);
            int i2 = copy + 77;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return qrCodeTipsDialog;
        }

        static String copydefault(Builder builder) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 61;
            copy = i3 % 128;
            int i4 = i3 % 2;
            String str = builder.component1;
            int i5 = i2 + 75;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        static String ShareDataUIState(Builder builder) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 63;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            String str = builder.component3;
            if (i4 == 0) {
                int i5 = 56 / 0;
            }
            int i6 = i3 + 57;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        static int component1(Builder builder) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 109;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            int i5 = builder.component2;
            int i6 = i3 + 117;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static View.OnClickListener component3(Builder builder) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 17;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            Object obj = null;
            View.OnClickListener onClickListener = builder.copydefault;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 93;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                return onClickListener;
            }
            throw null;
        }

        static String component2(Builder builder) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 31;
            copy = i3 % 128;
            int i4 = i3 % 2;
            String str = builder.ShareDataUIState;
            int i5 = i2 + 33;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        static int copy(Builder builder) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 9;
            copy = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            int i5 = builder.equals;
            if (i4 == 0) {
                throw null;
            }
            int i6 = i2 + 79;
            copy = i6 % 128;
            if (i6 % 2 != 0) {
                return i5;
            }
            obj.hashCode();
            throw null;
        }

        static View.OnClickListener getRequestBeneficiariesState(Builder builder) {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 97;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            View.OnClickListener onClickListener = builder.getRequestBeneficiariesState;
            int i5 = i2 + 121;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                return onClickListener;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
