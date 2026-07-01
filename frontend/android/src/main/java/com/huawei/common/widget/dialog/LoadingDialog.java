package com.huawei.common.widget.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.blankj.utilcode.util.ColorUtils;
import com.huawei.common.R;
import com.huawei.common.util.AssetsReadUtils;
import org.json.JSONObject;

public class LoadingDialog extends BaseDialog {
    public static final String LOADING_DIALOG_BACKGROUND_BLUR = "loadingDialogBackgroundBlur";
    private String component1;
    private boolean component2;
    private TextView component3;
    private DialogInterface.OnCancelListener copydefault;

    public LoadingDialog() {
        this.component2 = true;
        boolean zOptBoolean = false;
        try {
            zOptBoolean = new JSONObject(AssetsReadUtils.parseFile("dialog_config.json")).optBoolean(LOADING_DIALOG_BACKGROUND_BLUR, false);
        } catch (Exception unused) {
        }
        setBackgroundBlur(zOptBoolean);
    }

    public void setTextView(String str) {
        this.component1 = str;
        TextView textView = this.component3;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.copydefault = onCancelListener;
    }

    public LoadingDialog(boolean z) {
        this.component2 = z;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.layout_loading;
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.tipTextView);
        this.component3 = textView;
        textView.setText(TextUtils.isEmpty(this.component1) ? getString(R.string.loading) : this.component1);
        this.component3.setTextColor(ColorUtils.getColor(R.color.colorGround));
        view.findViewById(R.id.rl_bg).setBackgroundColor(com.huawei.common.util.color.ColorUtils.INSTANCE.withAlpha(0.8f, ColorUtils.getColor(R.color.colorMainText)));
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(this.component2);
        }
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.copydefault;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
