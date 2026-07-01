package com.huawei.digitalpayment.consumer.basic.vm;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.framework.utils.FileUtils;
import com.google.common.base.Ascii;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.basic.model.BiometricOpenModel;
import com.huawei.digitalpayment.consumer.basic.model.IBiometricOpenModel;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;

public class OpenBiometricViewModel extends ViewModel {
    public static final String FACE_ID = "00";
    public static final String FINGERPRINT = "01";
    private final IBiometricOpenModel ShareDataUIState = new BiometricOpenModel();
    private final MutableLiveData<Resource<BaseResp>> component1 = new MutableLiveData<>();
    private static final byte[] $$c = {106, -23, Ascii.FF, -128};
    private static final int $$d = FileUtils.JPEG_MARKER_EOI;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {102, -86, -98, TarHeader.LF_DIR, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL};
    private static final int $$b = 19;
    private static int component3 = 0;
    private static int component2 = 1;
    private static long copydefault = -7726317825664993854L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r5, byte r6, int r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.basic.vm.OpenBiometricViewModel.$$c
            int r7 = r7 * 4
            int r7 = 103 - r7
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r5 = r5 * 4
            int r5 = 3 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L28:
            r3 = r0[r5]
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.vm.OpenBiometricViewModel.$$e(int, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 6
            int r0 = r8 + 10
            int r6 = r6 * 16
            int r6 = r6 + 83
            byte[] r1 = com.huawei.digitalpayment.consumer.basic.vm.OpenBiometricViewModel.$$a
            byte[] r0 = new byte[r0]
            int r8 = r8 + 9
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2d:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-17)
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.vm.OpenBiometricViewModel.a(byte, short, int, java.lang.Object[]):void");
    }

    public LiveData<Resource<BaseResp>> getData() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 55;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.component1;
        int i5 = i2 + 117;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public void biometricOpen(String str, String str2, String str3) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        this.ShareDataUIState.biometricOpen(str, str2, str3, new ApiCallback<BaseResp>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 61;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component1(baseResp);
                int i5 = component1 + 107;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 97 / 0;
                }
            }

            public void component1(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 23;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    OpenBiometricViewModel.copydefault(OpenBiometricViewModel.this).setValue(Resource.success(baseResp));
                    int i4 = 9 / 0;
                } else {
                    OpenBiometricViewModel.copydefault(OpenBiometricViewModel.this).setValue(Resource.success(baseResp));
                }
                int i5 = component1 + 43;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 19;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                OpenBiometricViewModel.copydefault(OpenBiometricViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component3 + 123;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component2 + 33;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Deprecated
    public void biometricOpen(String str, String str2) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        fingerprintOpen(str, str2);
        int i4 = component2 + 29;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void fingerprintOpen(String str, String str2) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        biometricOpen("01", str, str2);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component3 + 19;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 45;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $11 + 99;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 34 - Color.alpha(0), (char) (63439 - TextUtils.indexOf((CharSequence) "", '0', 0)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 19 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (51268 - Process.getGidForName("")), -1883291598, false, $$e(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0669  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void faceIdOpen(java.lang.String r29, java.lang.String r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.vm.OpenBiometricViewModel.faceIdOpen(java.lang.String, java.lang.String):void");
    }

    static MutableLiveData copydefault(OpenBiometricViewModel openBiometricViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = openBiometricViewModel.component1;
        int i5 = i3 + 33;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return mutableLiveData;
    }
}
