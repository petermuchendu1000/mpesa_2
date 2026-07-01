package com.huawei.digitalpayment.consumer.basic.ui.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.griver.api.constants.GriverEvents;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.widget.dialog.BottomDialog;
import com.huawei.digitalpayment.consumer.basic.R;
import com.huawei.digitalpayment.consumer.basic.databinding.DialogPermissionRequestBinding;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\bH\u0014J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/ui/dialog/PermissionRequestDialog;", "Lcom/huawei/common/widget/dialog/BottomDialog;", "Lcom/huawei/digitalpayment/consumer/basic/databinding/DialogPermissionRequestBinding;", "builder", "Lcom/huawei/digitalpayment/consumer/basic/ui/dialog/PermissionRequestDialog$PermissionRequestDialogBuilder;", "<init>", "(Lcom/huawei/digitalpayment/consumer/basic/ui/dialog/PermissionRequestDialog$PermissionRequestDialogBuilder;)V", "iconIdRes", "", "iconColor", "title", "", "descriptionSpannable", "Landroid/text/Spannable;", "positiveButton", "positiveButtonClickListener", "Landroid/view/View$OnClickListener;", "negativeButton", "negativeButtonClickListener", "getLayoutId", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "PermissionRequestDialogBuilder", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PermissionRequestDialog extends BottomDialog<DialogPermissionRequestBinding> {
    public static final int $stable = 8;
    private static int copy = 1;
    private static int equals = 0;
    private static int getShareableDataState = 0;
    private static int hashCode = 93 % 128;
    private final Spannable ShareDataUIState;
    private final int component1;
    private final int component2;
    private final String component3;
    private final View.OnClickListener component4;
    private final View.OnClickListener copydefault;
    private final String getAsAtTimestamp;
    private final String getRequestBeneficiariesState;

    private PermissionRequestDialog(PermissionRequestDialogBuilder permissionRequestDialogBuilder) {
        this.component1 = permissionRequestDialogBuilder.getIconIdRes();
        this.component2 = permissionRequestDialogBuilder.getIconColor();
        this.getAsAtTimestamp = permissionRequestDialogBuilder.getTitle();
        this.ShareDataUIState = permissionRequestDialogBuilder.getDescriptionSpannable();
        this.getRequestBeneficiariesState = permissionRequestDialogBuilder.getPositiveButton();
        this.component4 = permissionRequestDialogBuilder.getPositiveButtonClickListener();
        this.component3 = permissionRequestDialogBuilder.getNegativeButton();
        this.copydefault = permissionRequestDialogBuilder.getNegativeButtonClickListener();
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copy + 7;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int i3 = R.layout.dialog_permission_request;
            obj.hashCode();
            throw null;
        }
        int i4 = R.layout.dialog_permission_request;
        int i5 = equals + 75;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    private static final void component3(PermissionRequestDialog permissionRequestDialog, View view) {
        int i = 2 % 2;
        int i2 = equals + 73;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(permissionRequestDialog, "");
        View.OnClickListener onClickListener = permissionRequestDialog.component4;
        if (onClickListener != null) {
            int i4 = copy + 23;
            equals = i4 % 128;
            int i5 = i4 % 2;
            onClickListener.onClick(view);
        }
        permissionRequestDialog.dismiss();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = equals + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        ((DialogPermissionRequestBinding) this.binding).ivIcon.setImageResource(this.component1);
        boolean z = this.component1 == 0;
        Binding binding = this.binding;
        Intrinsics.checkNotNull(binding, "");
        ViewUtils.setGone(z, ((DialogPermissionRequestBinding) binding).ivIcon);
        ((DialogPermissionRequestBinding) this.binding).tvTitle.setText(this.getAsAtTimestamp);
        ((DialogPermissionRequestBinding) this.binding).tvDescription.setText(this.ShareDataUIState);
        ((DialogPermissionRequestBinding) this.binding).btnPos.setText(this.getRequestBeneficiariesState);
        if (this.getRequestBeneficiariesState.length() == 0) {
            int i4 = copy + 47;
            equals = i4 % 128;
            int i5 = i4 % 2;
            ((DialogPermissionRequestBinding) this.binding).btnPos.setVisibility(8);
        }
        ((DialogPermissionRequestBinding) this.binding).btnNeg.setText(this.component3);
        boolean zIsEmpty = TextUtils.isEmpty(this.component3);
        Binding binding2 = this.binding;
        Intrinsics.checkNotNull(binding2, "");
        ViewUtils.setGone(zIsEmpty, ((DialogPermissionRequestBinding) binding2).btnNeg);
        ((DialogPermissionRequestBinding) this.binding).btnPos.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view2) {
                int i6 = 2 % 2;
                int i7 = copydefault + 81;
                component1 = i7 % 128;
                if (i7 % 2 == 0) {
                    PermissionRequestDialog.m10311$r8$lambda$cbcmQVmU7HnBdr51sDAod33DM(this.f$0, view2);
                    throw null;
                }
                PermissionRequestDialog.m10311$r8$lambda$cbcmQVmU7HnBdr51sDAod33DM(this.f$0, view2);
                int i8 = copydefault + 87;
                component1 = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            }
        });
        ((DialogPermissionRequestBinding) this.binding).btnNeg.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final void onClick(View view2) {
                int i6 = 2 % 2;
                int i7 = component2 + 125;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                PermissionRequestDialog.m10312$r8$lambda$hAVvFrBpVrD42vT1lJ1XSw6Ypo(this.f$0, view2);
                if (i8 != 0) {
                    int i9 = 23 / 0;
                }
            }
        });
        int i6 = equals + 29;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void ShareDataUIState(PermissionRequestDialog permissionRequestDialog, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(permissionRequestDialog, "");
        View.OnClickListener onClickListener = permissionRequestDialog.copydefault;
        if (onClickListener != null) {
            int i2 = equals + 35;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                onClickListener.onClick(view);
                int i3 = 15 / 0;
            } else {
                onClickListener.onClick(view);
            }
            int i4 = copy + 81;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
        permissionRequestDialog.dismiss();
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 59;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            int i4 = copy + 117;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static void m10311$r8$lambda$cbcmQVmU7HnBdr51sDAod33DM(PermissionRequestDialog permissionRequestDialog, View view) {
        int i = 2 % 2;
        int i2 = equals + 83;
        copy = i2 % 128;
        int i3 = i2 % 2;
        component1(permissionRequestDialog, view);
        int i4 = copy + 105;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10312$r8$lambda$hAVvFrBpVrD42vT1lJ1XSw6Ypo(PermissionRequestDialog permissionRequestDialog, View view) {
        int i = 2 % 2;
        int i2 = equals + 117;
        copy = i2 % 128;
        int i3 = i2 % 2;
        copydefault(permissionRequestDialog, view);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        int i5 = equals + 103;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = 93 % 2;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000bJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0015J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000bJ\u0010\u0010%\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0015J\u0006\u0010&\u001a\u00020'R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\"\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/ui/dialog/PermissionRequestDialog$PermissionRequestDialogBuilder;", "", "<init>", "()V", "value", "", "iconIdRes", "getIconIdRes", "()I", "iconColor", "getIconColor", "", "title", "getTitle", "()Ljava/lang/String;", "Landroid/text/Spannable;", "descriptionSpannable", "getDescriptionSpannable", "()Landroid/text/Spannable;", "positiveButton", "getPositiveButton", "Landroid/view/View$OnClickListener;", "positiveButtonClickListener", "getPositiveButtonClickListener", "()Landroid/view/View$OnClickListener;", "negativeButton", "getNegativeButton", "negativeButtonClickListener", "getNegativeButtonClickListener", "setIconIdRes", "setIconColor", GriverEvents.EVENT_SET_TITLE, "setDescription", "setPositiveButton", "setPositiveButtonClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setNegativeButton", "setNegativeButtonClickListener", "build", "Lcom/huawei/digitalpayment/consumer/basic/ui/dialog/PermissionRequestDialog;", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PermissionRequestDialogBuilder {
        public static final int $stable = 8;
        private static int ArtificialStackFrames = 0;
        public static int ShareDataUIState = 0;
        public static int component2 = 0;
        private static int getShareableDataState = 1;
        private static int hashCode = 1;
        private static int toString;
        private int component3;
        private View.OnClickListener getAsAtTimestamp;
        private View.OnClickListener getRequestBeneficiariesState;
        private int component1 = -1;
        private String component4 = "";
        private Spannable copydefault = new SpannableString("");
        private String equals = "";
        private String copy = "";

        public final int getIconIdRes() {
            int i;
            int i2 = 2 % 2;
            int i3 = getShareableDataState + 107;
            int i4 = i3 % 128;
            toString = i4;
            if (i3 % 2 != 0) {
                i = this.component3;
                int i5 = 38 / 0;
            } else {
                i = this.component3;
            }
            int i6 = i4 + 125;
            getShareableDataState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 23 / 0;
            }
            return i;
        }

        public final int getIconColor() {
            int i = 2 % 2;
            int i2 = toString + 87;
            getShareableDataState = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component1;
            }
            throw null;
        }

        public final String getTitle() {
            int i = 2 % 2;
            int i2 = toString + 17;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component4;
            if (i3 == 0) {
                int i4 = 0 / 0;
            }
            return str;
        }

        public final Spannable getDescriptionSpannable() {
            int i = 2 % 2;
            int i2 = getShareableDataState;
            int i3 = i2 + 21;
            toString = i3 % 128;
            int i4 = i3 % 2;
            Spannable spannable = this.copydefault;
            int i5 = i2 + 123;
            toString = i5 % 128;
            int i6 = i5 % 2;
            return spannable;
        }

        public final String getPositiveButton() {
            int i = 2 % 2;
            int i2 = toString;
            int i3 = i2 + 103;
            getShareableDataState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.equals;
            int i5 = i2 + 59;
            getShareableDataState = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final View.OnClickListener getPositiveButtonClickListener() {
            int i = 2 % 2;
            int i2 = getShareableDataState + 107;
            int i3 = i2 % 128;
            toString = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            View.OnClickListener onClickListener = this.getRequestBeneficiariesState;
            int i4 = i3 + 81;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            return onClickListener;
        }

        public final String getNegativeButton() {
            int i = 2 % 2;
            int i2 = getShareableDataState + 87;
            int i3 = i2 % 128;
            toString = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.copy;
            int i4 = i3 + 29;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final View.OnClickListener getNegativeButtonClickListener() {
            int i = 2 % 2;
            int i2 = toString;
            int i3 = i2 + 123;
            getShareableDataState = i3 % 128;
            int i4 = i3 % 2;
            View.OnClickListener onClickListener = this.getAsAtTimestamp;
            int i5 = i2 + 71;
            getShareableDataState = i5 % 128;
            if (i5 % 2 != 0) {
                return onClickListener;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final PermissionRequestDialogBuilder setIconIdRes(int iconIdRes) {
            int i = 2 % 2;
            int i2 = getShareableDataState;
            int i3 = i2 + 93;
            toString = i3 % 128;
            int i4 = i3 % 2;
            this.component3 = iconIdRes;
            int i5 = i2 + 13;
            toString = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final PermissionRequestDialogBuilder setIconColor(int iconColor) {
            int i = 2 % 2;
            int i2 = getShareableDataState + 65;
            int i3 = i2 % 128;
            toString = i3;
            int i4 = i2 % 2;
            Object obj = null;
            this.component1 = iconColor;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + 41;
            getShareableDataState = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        public final PermissionRequestDialogBuilder setTitle(String title) {
            int i = 2 % 2;
            int i2 = toString + 23;
            getShareableDataState = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(title, "");
                this.component4 = title;
                return this;
            }
            Intrinsics.checkNotNullParameter(title, "");
            this.component4 = title;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final PermissionRequestDialogBuilder setDescription(Spannable descriptionSpannable) {
            int i = 2 % 2;
            int i2 = getShareableDataState + 43;
            toString = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(descriptionSpannable, "");
            this.copydefault = descriptionSpannable;
            int i4 = getShareableDataState + 105;
            toString = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final PermissionRequestDialogBuilder setPositiveButton(String positiveButton) {
            int i = 2 % 2;
            int i2 = getShareableDataState + 85;
            toString = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(positiveButton, "");
            this.equals = positiveButton;
            int i4 = getShareableDataState + 5;
            toString = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final PermissionRequestDialogBuilder setPositiveButtonClickListener(View.OnClickListener listener) {
            int i = 2 % 2;
            int i2 = getShareableDataState + 61;
            toString = i2 % 128;
            int i3 = i2 % 2;
            this.getRequestBeneficiariesState = listener;
            if (i3 != 0) {
                int i4 = 1 / 0;
            }
            return this;
        }

        public final PermissionRequestDialogBuilder setNegativeButton(String negativeButton) {
            int i = 2 % 2;
            int i2 = toString + 63;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(negativeButton, "");
            this.copy = negativeButton;
            int i4 = getShareableDataState + 59;
            toString = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final PermissionRequestDialogBuilder setNegativeButtonClickListener(View.OnClickListener listener) {
            int i = 2 % 2;
            int i2 = toString + 7;
            int i3 = i2 % 128;
            getShareableDataState = i3;
            int i4 = i2 % 2;
            this.getAsAtTimestamp = listener;
            int i5 = i3 + 39;
            toString = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final PermissionRequestDialog build() {
            int i = 2 % 2;
            PermissionRequestDialog permissionRequestDialog = new PermissionRequestDialog(this, null);
            int i2 = getShareableDataState + 23;
            toString = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 84 / 0;
            }
            return permissionRequestDialog;
        }

        static {
            int i = 1 + 113;
            ArtificialStackFrames = i % 128;
            int i2 = i % 2;
        }

        public static int ShareDataUIState() {
            int i = component2;
            int i2 = i % 9382890;
            component2 = i + 1;
            if (i2 != 0) {
                return ShareDataUIState;
            }
            int iNextInt = new Random().nextInt(1181576555);
            ShareDataUIState = iNextInt;
            return iNextInt;
        }
    }

    public PermissionRequestDialog(PermissionRequestDialogBuilder permissionRequestDialogBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(permissionRequestDialogBuilder);
    }

    private static void component1(PermissionRequestDialog permissionRequestDialog, View view) {
        int i = 2 % 2;
        int i2 = copy + 9;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            component3(permissionRequestDialog, view);
            Callback.onClick_exit();
            int i4 = equals + 37;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 87 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void copydefault(PermissionRequestDialog permissionRequestDialog, View view) {
        int i = 2 % 2;
        int i2 = copy + 57;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                ShareDataUIState(permissionRequestDialog, view);
                Callback.onClick_exit();
                int i4 = 15 / 0;
            } else {
                ShareDataUIState(permissionRequestDialog, view);
                Callback.onClick_exit();
            }
            int i5 = copy + 91;
            equals = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
