package com.huawei.digitalpayment.consumer.baselib.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.blankj.utilcode.util.StringUtils;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.widget.dialog.BottomDialog;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.databinding.DialogCommonBinding;
import kotlin.OnBackPressedDispatcher4;
import kotlin.OnBackPressedDispatcherApi33Impl;

public class CommonDialog extends BottomDialog<DialogCommonBinding> {
    private static final String component2 = "GuideOpenBiometricDialog";
    private static int copy = 0;
    private static int getShareableDataState = 1;
    private final String ShareDataUIState;
    private final String component1;
    private final int component3;
    private final String component4;
    private final int copydefault;
    private final OnClickListener equals;
    private final OnClickListener getAsAtTimestamp;
    private final String getRequestBeneficiariesState;

    public interface OnClickListener {
        void onClick(CommonDialog commonDialog);
    }

    public CommonDialog(Builder builder) {
        this.component3 = Builder.copydefault(builder);
        this.copydefault = Builder.component3(builder);
        this.getRequestBeneficiariesState = Builder.getAsAtTimestamp(builder);
        this.component1 = Builder.ShareDataUIState(builder);
        this.component4 = Builder.equals(builder);
        this.equals = Builder.copy(builder);
        this.ShareDataUIState = Builder.component2(builder);
        this.getAsAtTimestamp = Builder.component1(builder);
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 89;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.dialog_common;
        int i5 = getShareableDataState + 117;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 87 / 0;
        }
        return i4;
    }

    public class AnonymousClass3 extends FilterFastClickListener {
        private static int component2 = 0;
        private static int component3 = 1;

        AnonymousClass3() {
        }

        @Override
        public void onFilterClick(View view) {
            int i = 2 % 2;
            int i2 = component2 + 35;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                if (CommonDialog.component1(CommonDialog.this) != null) {
                    CommonDialog.component1(CommonDialog.this).onClick(CommonDialog.this);
                    int i3 = component3 + 105;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                }
                int i5 = component2 + 93;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            CommonDialog.component1(CommonDialog.this);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void component1() {
            OnBackPressedDispatcherApi33Impl.copydefault[0] = OnBackPressedDispatcher4.ShareDataUIState[0];
        }
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int i = 2 % 2;
        int i2 = getShareableDataState + 89;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            super.onViewCreated(view, bundle);
            ((DialogCommonBinding) this.binding).ivIcon.setImageResource(this.component3);
            if (this.component3 == 0) {
                int i3 = getShareableDataState + 67;
                copy = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            } else {
                z = false;
            }
            ViewUtils.setGone(z, ((DialogCommonBinding) this.binding).ivIcon);
            if (this.copydefault != -1) {
                int i5 = getShareableDataState + 95;
                copy = i5 % 128;
                int i6 = i5 % 2;
                ((DialogCommonBinding) this.binding).ivIcon.setColorFilter(this.copydefault);
            }
            ((DialogCommonBinding) this.binding).tvTitle.setText(this.getRequestBeneficiariesState);
            ((DialogCommonBinding) this.binding).tvDescription.setText(this.component1);
            ((DialogCommonBinding) this.binding).tvDescription.setText(this.component1);
            ((DialogCommonBinding) this.binding).btnPositive.setText(this.component4);
            if (TextUtils.isEmpty(this.component4)) {
                ((DialogCommonBinding) this.binding).btnPositive.setVisibility(8);
            }
            ((DialogCommonBinding) this.binding).btnNegative.setText(this.ShareDataUIState);
            ViewUtils.setGone(TextUtils.isEmpty(this.ShareDataUIState), ((DialogCommonBinding) this.binding).btnNegative);
            ((DialogCommonBinding) this.binding).btnPositive.setOnClickListener(new AnonymousClass3());
            ((DialogCommonBinding) this.binding).btnNegative.setOnClickListener(new FilterFastClickListener() {
                private static int component3 = 1;
                private static int copydefault;

                @Override
                public void onFilterClick(View view2) {
                    int i7 = 2 % 2;
                    int i8 = component3 + 15;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    if (CommonDialog.copydefault(CommonDialog.this) != null) {
                        int i10 = copydefault + 11;
                        component3 = i10 % 128;
                        int i11 = i10 % 2;
                        CommonDialog.copydefault(CommonDialog.this).onClick(CommonDialog.this);
                    }
                }
            });
            return;
        }
        super.onViewCreated(view, bundle);
        ((DialogCommonBinding) this.binding).ivIcon.setImageResource(this.component3);
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 65;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        int i4 = getShareableDataState + 95;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    static OnClickListener copydefault(CommonDialog commonDialog) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 87;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        OnClickListener onClickListener = commonDialog.getAsAtTimestamp;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 119;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return onClickListener;
    }

    static OnClickListener component1(CommonDialog commonDialog) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 17;
        copy = i2 % 128;
        int i3 = i2 % 2;
        OnClickListener onClickListener = commonDialog.equals;
        if (i3 == 0) {
            return onClickListener;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static class Builder {
        private static int component4 = 0;
        private static int equals = 1;
        private String ShareDataUIState;
        private String component1;
        private int component2;
        private OnClickListener component3;
        private String copy;
        private int copydefault = -1;
        private String getAsAtTimestamp;
        private OnClickListener getRequestBeneficiariesState;

        public Builder setIconIdRes(int i) {
            int i2 = 2 % 2;
            int i3 = equals;
            int i4 = i3 + 59;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            this.component2 = i;
            int i6 = i3 + 49;
            component4 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 62 / 0;
            }
            return this;
        }

        public Builder setIconColor(int i) {
            int i2 = 2 % 2;
            int i3 = component4 + 87;
            int i4 = i3 % 128;
            equals = i4;
            int i5 = i3 % 2;
            this.copydefault = i;
            int i6 = i4 + 29;
            component4 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 31 / 0;
            }
            return this;
        }

        public Builder setTitle(String str) {
            int i = 2 % 2;
            int i2 = equals + 99;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            this.getAsAtTimestamp = str;
            if (i3 == 0) {
                return this;
            }
            throw null;
        }

        public Builder setDescription(String str) {
            int i = 2 % 2;
            int i2 = component4 + 5;
            equals = i2 % 128;
            int i3 = i2 % 2;
            this.component1 = str;
            if (i3 != 0) {
                return this;
            }
            throw null;
        }

        public Builder setPositiveButton(String str) {
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 83;
            equals = i3 % 128;
            int i4 = i3 % 2;
            this.copy = str;
            int i5 = i2 + 97;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public Builder setPositiveButtonClickListener(OnClickListener onClickListener) {
            int i = 2 % 2;
            int i2 = component4 + 3;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            this.getRequestBeneficiariesState = onClickListener;
            int i5 = i3 + 67;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public Builder setNegativeButton(String str) {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 111;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            this.ShareDataUIState = str;
            int i5 = i2 + 41;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public Builder setNegativeButtonClickListener(OnClickListener onClickListener) {
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 51;
            equals = i3 % 128;
            int i4 = i3 % 2;
            this.component3 = onClickListener;
            int i5 = i2 + 99;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public Builder setTitle(int i) {
            int i2 = 2 % 2;
            int i3 = equals + 29;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            this.getAsAtTimestamp = StringUtils.getString(i);
            if (i4 == 0) {
                return this;
            }
            throw null;
        }

        public Builder setDescription(int i) {
            int i2 = 2 % 2;
            int i3 = component4 + 29;
            equals = i3 % 128;
            int i4 = i3 % 2;
            this.component1 = StringUtils.getString(i);
            if (i4 == 0) {
                int i5 = 53 / 0;
            }
            return this;
        }

        public Builder setPositiveButton(int i) {
            int i2 = 2 % 2;
            int i3 = equals + 85;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            this.copy = StringUtils.getString(i);
            int i5 = component4 + 7;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 54 / 0;
            }
            return this;
        }

        public Builder setNegativeButton(int i) {
            int i2 = 2 % 2;
            int i3 = equals + 19;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            this.ShareDataUIState = StringUtils.getString(i);
            int i5 = component4 + 123;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 90 / 0;
            }
            return this;
        }

        public CommonDialog build() {
            int i = 2 % 2;
            CommonDialog commonDialog = new CommonDialog(this);
            int i2 = component4 + 67;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return commonDialog;
        }

        static String ShareDataUIState(Builder builder) {
            int i = 2 % 2;
            int i2 = component4 + 27;
            equals = i2 % 128;
            int i3 = i2 % 2;
            String str = builder.component1;
            if (i3 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static int component3(Builder builder) {
            int i = 2 % 2;
            int i2 = equals + 5;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = builder.copydefault;
            if (i3 == 0) {
                return i4;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static int copydefault(Builder builder) {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 83;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = builder.component2;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i2 + 89;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static String component2(Builder builder) {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 27;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            String str = builder.ShareDataUIState;
            int i5 = i2 + 67;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        static OnClickListener component1(Builder builder) {
            int i = 2 % 2;
            int i2 = equals + 35;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            OnClickListener onClickListener = builder.component3;
            int i5 = i3 + 9;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return onClickListener;
        }

        static String equals(Builder builder) {
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 61;
            equals = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            String str = builder.copy;
            if (i4 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i2 + 25;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        static OnClickListener copy(Builder builder) {
            int i = 2 % 2;
            int i2 = component4 + 57;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            OnClickListener onClickListener = builder.getRequestBeneficiariesState;
            int i5 = i3 + 55;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 64 / 0;
            }
            return onClickListener;
        }

        static String getAsAtTimestamp(Builder builder) {
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 67;
            equals = i3 % 128;
            int i4 = i3 % 2;
            String str = builder.getAsAtTimestamp;
            int i5 = i2 + 55;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
