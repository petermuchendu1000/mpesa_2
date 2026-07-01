package com.huawei.digitalpayment.customer.dynamics.ui;

import android.os.Process;
import android.view.View;

public final class SignatureActivity$$ExternalSyntheticLambda1 implements View.OnClickListener {
    public static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    public static int copydefault;
    public final SignatureActivity f$0;

    public SignatureActivity$$ExternalSyntheticLambda1(SignatureActivity signatureActivity) {
        this.f$0 = signatureActivity;
    }

    public static int copydefault() {
        int i = copydefault;
        int i2 = i % 7146834;
        copydefault = i + 1;
        if (i2 != 0) {
            return ShareDataUIState;
        }
        int iMyTid = Process.myTid();
        ShareDataUIState = iMyTid;
        return iMyTid;
    }

    @Override
    public final void onClick(View view) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            SignatureActivity.$r8$lambda$OVd1Cf9F0v2V2n5tyEKtWSGwtZU(this.f$0, view);
            throw null;
        }
        SignatureActivity.$r8$lambda$OVd1Cf9F0v2V2n5tyEKtWSGwtZU(this.f$0, view);
        int i3 = component2 + 99;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 8 / 0;
        }
    }
}
