package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseViewModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyForgotPinSmsResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.VerifyOtpParams;
import com.huawei.digitalpayment.consumer.loginModule.register.data.ResetOtpModel;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import org.bouncycastle.crypto.signers.PSSSigner;

public class BaseResetPinOtpViewModel<Model extends ResetOtpModel> extends BaseViewModel<Model> {
    private static int component1 = 0;
    private static int component3 = 1;
    private final MutableLiveData<Resource<BaseResp>> ShareDataUIState;
    private final MutableLiveData<Resource<VerifyForgotPinSmsResp>> copydefault;

    public BaseResetPinOtpViewModel(Model model) {
        super(model);
        this.copydefault = new MutableLiveData<>();
        this.ShareDataUIState = new MutableLiveData<>();
    }

    public LiveData<Resource<BaseResp>> getSmsData() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.ShareDataUIState;
        int i5 = i3 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public LiveData<Resource<VerifyForgotPinSmsResp>> getData() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyForgotPinSmsResp>> mutableLiveData = this.copydefault;
        int i5 = i2 + 119;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public class AnonymousClass5 implements ApiCallback<BaseResp> {
        private static short[] component4;
        private static final byte[] $$c = {TarHeader.LF_NORMAL, -42, 66, -37};
        private static final int $$f = 200;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {TarHeader.LF_CHR, -39, 98, -44, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
        private static final int $$e = 22;
        private static final byte[] $$a = {68, 4, -12, PSSSigner.TRAILER_IMPLICIT, 1, Ascii.US, -11, 33, -64, 63, Ascii.EM, 17, 1, Ascii.SO, 5, -55, Ascii.US, TarHeader.LF_NORMAL, 17, 2, 7, Ascii.ETB, Ascii.NAK, -31, 45, Ascii.SI, -3, Ascii.NAK};
        private static final int $$b = 134;
        private static int copy = 0;
        private static int getRequestBeneficiariesState = 1;
        private static int copydefault = 1770317079;
        private static int component1 = -238323842;
        private static int component3 = -1680517685;
        private static byte[] ShareDataUIState = {-36, 46, -35, 38, TarHeader.LF_LINK, TarHeader.LF_FIFO, -109, 56, -41, -48, 47, 40, -38, 109, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, 40, 36, -43, 42, -44, 44, -36, Ascii.VT, -16, 38, -41, 36, -43, 42, -44, 44, -36, Ascii.VT, TarHeader.LF_FIFO, -109, 56, -41, -48, 47, 40, -38, 109, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, -58, 36, -36, 58, 58, -14, 35, -36, -34, Ascii.FF, -49, -43, -44, 40, 38, 58, -9, 38, -41, 39, -36, -34, Ascii.FF, -53, 36, -40, 38, -47, 37, -58, 56, 56, -11, 38, -41, 41, 41, 41, 41, 41, 41};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(byte r6, int r7, byte r8) {
            /*
                int r8 = r8 * 2
                int r0 = 1 - r8
                int r6 = r6 * 3
                int r6 = 3 - r6
                int r7 = r7 + 112
                byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.BaseResetPinOtpViewModel.AnonymousClass5.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L17
                r3 = r7
                r4 = r2
                r7 = r6
                goto L2e
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r6 = r6 + 1
                if (r3 != r8) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L25:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2e:
                int r6 = -r6
                int r6 = r6 + r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.BaseResetPinOtpViewModel.AnonymousClass5.$$g(byte, int, byte):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 12
                int r0 = 19 - r6
                int r5 = r5 * 18
                int r5 = 22 - r5
                byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.BaseResetPinOtpViewModel.AnonymousClass5.$$a
                int r7 = r7 * 6
                int r7 = 106 - r7
                byte[] r0 = new byte[r0]
                int r6 = 18 - r6
                r2 = -1
                if (r1 != 0) goto L18
                r7 = r5
                r3 = r6
                goto L2d
            L18:
                r4 = r7
                r7 = r5
                r5 = r4
            L1b:
                int r2 = r2 + 1
                byte r3 = (byte) r5
                r0[r2] = r3
                if (r2 != r6) goto L2b
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r0, r6)
                r8[r6] = r5
                return
            L2b:
                r3 = r1[r7]
            L2d:
                int r5 = r5 + r3
                int r5 = r5 + (-10)
                int r7 = r7 + 1
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.BaseResetPinOtpViewModel.AnonymousClass5.a(int, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.BaseResetPinOtpViewModel.AnonymousClass5.$$d
                int r6 = r6 * 3
                int r1 = r6 + 1
                int r5 = r5 + 4
                int r7 = 100 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L12
                r4 = r6
                r3 = r2
                goto L26
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r7
                int r5 = r5 + 1
                r1[r3] = r4
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L22:
                int r3 = r3 + 1
                r4 = r0[r5]
            L26:
                int r7 = r7 + r4
                int r7 = r7 + (-27)
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.BaseResetPinOtpViewModel.AnonymousClass5.b(byte, short, byte, java.lang.Object[]):void");
        }

        AnonymousClass5() {
        }

        @Override
        public void onSuccess(BaseResp baseResp) {
            int i = 2 % 2;
            int i2 = copy + 65;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            component1(baseResp);
            if (i3 == 0) {
                throw null;
            }
            int i4 = copy + 101;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }

        public void component1(BaseResp baseResp) {
            int i = 2 % 2;
            int i2 = copy + 115;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            BaseResetPinOtpViewModel.component2(BaseResetPinOtpViewModel.this).setValue(Resource.success(baseResp));
            int i4 = getRequestBeneficiariesState + 23;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override
        public void onError(BaseException baseException) {
            int i = 2 % 2;
            int i2 = copy + 97;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            BaseResetPinOtpViewModel.component2(BaseResetPinOtpViewModel.this).setValue(Resource.error(baseException, null));
            int i4 = getRequestBeneficiariesState + 111;
            copy = i4 % 128;
            int i5 = i4 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:72:0x02bf  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x02e3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(short r24, byte r25, int r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 800
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.BaseResetPinOtpViewModel.AnonymousClass5.c(short, byte, int, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x08ac  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int ShareDataUIState(java.util.List r35) {
            /*
                Method dump skipped, instruction units count: 3229
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.BaseResetPinOtpViewModel.AnonymousClass5.ShareDataUIState(java.util.List):int");
        }
    }

    public void sendResetSms(BaseRequestParams baseRequestParams) {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        ((ResetOtpModel) this.model).sendResetSms(baseRequestParams, new AnonymousClass5());
        int i2 = component1 + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void resetSmsCodeVerify(VerifyOtpParams verifyOtpParams) {
        int i = 2 % 2;
        this.copydefault.setValue(Resource.loading(null));
        ((ResetOtpModel) this.model).resetSmsCodeVerify(verifyOtpParams, new ApiCallback<VerifyForgotPinSmsResp>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(VerifyForgotPinSmsResp verifyForgotPinSmsResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 11;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(verifyForgotPinSmsResp);
                if (i4 != 0) {
                    throw null;
                }
                int i5 = component1 + 111;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public void ShareDataUIState(VerifyForgotPinSmsResp verifyForgotPinSmsResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 105;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BaseResetPinOtpViewModel.ShareDataUIState(BaseResetPinOtpViewModel.this).setValue(Resource.success(verifyForgotPinSmsResp));
                if (i4 == 0) {
                    int i5 = 62 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 85;
                component1 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    BaseResetPinOtpViewModel.ShareDataUIState(BaseResetPinOtpViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseResetPinOtpViewModel.ShareDataUIState(BaseResetPinOtpViewModel.this).setValue(Resource.error(baseException, null));
                    obj.hashCode();
                    throw null;
                }
            }
        });
        int i2 = component1 + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void sendResetSms() {
        int i = 2 % 2;
        sendResetSms(new BaseRequestParams());
        int i2 = component3 + 71;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 31 / 0;
        }
    }

    @Deprecated
    public void resetSmsCodeVerify(String str) {
        int i = 2 % 2;
        resetSmsCodeVerify(new VerifyOtpParams(str));
        int i2 = component1 + 61;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    static MutableLiveData ShareDataUIState(BaseResetPinOtpViewModel baseResetPinOtpViewModel) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyForgotPinSmsResp>> mutableLiveData = baseResetPinOtpViewModel.copydefault;
        int i5 = i2 + 61;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    static MutableLiveData component2(BaseResetPinOtpViewModel baseResetPinOtpViewModel) {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = baseResetPinOtpViewModel.ShareDataUIState;
        if (i3 != 0) {
            return mutableLiveData;
        }
        throw null;
    }
}
