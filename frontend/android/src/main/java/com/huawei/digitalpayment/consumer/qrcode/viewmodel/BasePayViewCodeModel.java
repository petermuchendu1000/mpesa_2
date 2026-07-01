package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import com.blankj.utilcode.util.GsonUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.checkout.utils.HwMutableLiveData;
import com.huawei.digitalpayment.consumer.qrcode.bean.AuthNoticeResp;
import com.huawei.digitalpayment.consumer.qrcode.bean.PaymentQrResp;
import com.huawei.digitalpayment.consumer.qrcode.model.PayCodeModel;
import com.huawei.digitalpayment.consumer.qrcode.request.EnablePaymentCodeRequest;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.consumer.commons.helper.ConstantsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class BasePayViewCodeModel<Model extends PayCodeModel> extends ViewModel {
    private static int ShareDataUIState = 1;
    private static int component1;
    protected Model model;
    protected Timer queryOrderInfoTimer;
    protected HwMutableLiveData<Resource<PaymentQrResp>> paymentQrRespData = new HwMutableLiveData<>();
    protected HwMutableLiveData<Resource<BaseResp>> enablePaymentCodeData = new HwMutableLiveData<>();
    protected HwMutableLiveData<Resource<AuthNoticeResp>> authNoticeRespData = new HwMutableLiveData<>();
    protected List<PaymentQrResp.AuthCodesBean> authCodesBeanList = new ArrayList();
    protected HwMutableLiveData<PaymentQrResp.AuthCodesBean> authCodesBean = new HwMutableLiveData<>();
    protected ArrayList<String> pollFreqs = new ArrayList<>();

    public HwMutableLiveData<Resource<PaymentQrResp>> getPaymentQrRespData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        HwMutableLiveData<Resource<PaymentQrResp>> hwMutableLiveData = this.paymentQrRespData;
        int i5 = i3 + 89;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return hwMutableLiveData;
    }

    public HwMutableLiveData<Resource<BaseResp>> getEnablePaymentCodeData() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 55;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        HwMutableLiveData<Resource<BaseResp>> hwMutableLiveData = this.enablePaymentCodeData;
        int i5 = i2 + 35;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return hwMutableLiveData;
        }
        throw null;
    }

    public HwMutableLiveData<Resource<AuthNoticeResp>> getAuthNoticeRespData() {
        HwMutableLiveData<Resource<AuthNoticeResp>> hwMutableLiveData;
        int i = 2 % 2;
        int i2 = component1 + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            hwMutableLiveData = this.authNoticeRespData;
            int i4 = 49 / 0;
        } else {
            hwMutableLiveData = this.authNoticeRespData;
        }
        int i5 = i3 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return hwMutableLiveData;
    }

    public HwMutableLiveData<PaymentQrResp.AuthCodesBean> getAuthCodesBeanData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.authCodesBean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BasePayViewCodeModel(Model model) {
        this.model = model;
    }

    public void getPaymentCodeList(BaseRequestParams baseRequestParams) {
        int i = 2 % 2;
        this.paymentQrRespData.setValue(Resource.loading(null));
        this.model.getPaymentCodeList(baseRequestParams, new ApiCallback<PaymentQrResp>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(PaymentQrResp paymentQrResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 79;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component2(paymentQrResp);
                if (i4 == 0) {
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void component2(com.huawei.digitalpayment.consumer.qrcode.bean.PaymentQrResp r4) {
                /*
                    r3 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.component2
                    int r1 = r1 + 49
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.ShareDataUIState = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L15
                    r1 = 65
                    int r1 = r1 / 0
                    if (r4 == 0) goto L3e
                    goto L17
                L15:
                    if (r4 == 0) goto L3e
                L17:
                    java.util.List r1 = r4.getAuthCodes()
                    if (r1 == 0) goto L3e
                    int r1 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.ShareDataUIState
                    int r1 = r1 + 67
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.component2 = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L31
                    com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel r1 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.this
                    java.util.List r2 = r4.getAuthCodes()
                    r1.authCodesBeanList = r2
                    goto L3e
                L31:
                    com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel r0 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.this
                    java.util.List r4 = r4.getAuthCodes()
                    r0.authCodesBeanList = r4
                    r4 = 0
                    r4.hashCode()
                    throw r4
                L3e:
                    if (r4 == 0) goto L7b
                    int r1 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.component2
                    int r1 = r1 + 117
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.ShareDataUIState = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L5a
                    java.lang.String r1 = r4.getPollFreq()
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    r2 = 98
                    int r2 = r2 / 0
                    if (r1 != 0) goto L7b
                    goto L64
                L5a:
                    java.lang.String r1 = r4.getPollFreq()
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L7b
                L64:
                    int r1 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.component2
                    int r1 = r1 + 39
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.ShareDataUIState = r2
                    int r1 = r1 % r0
                    com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel r1 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.this
                    com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.component3(r1, r4)
                    int r1 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.component2
                    int r1 = r1 + 101
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.ShareDataUIState = r2
                    int r1 = r1 % r0
                L7b:
                    com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel r1 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.this
                    com.huawei.digitalpayment.checkout.utils.HwMutableLiveData<com.huawei.payment.mvvm.Resource<com.huawei.digitalpayment.consumer.qrcode.bean.PaymentQrResp>> r1 = r1.paymentQrRespData
                    com.huawei.payment.mvvm.Resource r4 = com.huawei.payment.mvvm.Resource.success(r4)
                    r1.setValue(r4)
                    int r4 = com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.component2
                    int r4 = r4 + 107
                    int r1 = r4 % 128
                    com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.ShareDataUIState = r1
                    int r4 = r4 % r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.qrcode.viewmodel.BasePayViewCodeModel.AnonymousClass4.component2(com.huawei.digitalpayment.consumer.qrcode.bean.PaymentQrResp):void");
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 15;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    BasePayViewCodeModel.this.paymentQrRespData.setValue(Resource.error(baseException, null));
                    int i4 = 39 / 0;
                } else {
                    BasePayViewCodeModel.this.paymentQrRespData.setValue(Resource.error(baseException, null));
                }
                int i5 = component2 + 125;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void getPaymentCodeList() {
        int i = 2 % 2;
        String string = SPUtils.getInstance().getString("QR_CODE_LIST_" + SPUtils.getInstance().getString("recent_login_phone_number"));
        if (!TextUtils.isEmpty(string)) {
            int i2 = component1 + 75;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            if (GsonUtils.fromJson(string, PaymentQrResp.class) != null) {
                int i4 = ShareDataUIState + 119;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                PaymentQrResp paymentQrResp = (PaymentQrResp) GsonUtils.fromJson(string, PaymentQrResp.class);
                if (!TextUtils.isEmpty(paymentQrResp.getPollFreq())) {
                    copydefault(paymentQrResp);
                }
                List<PaymentQrResp.AuthCodesBean> authCodes = paymentQrResp.getAuthCodes();
                this.authCodesBeanList = authCodes;
                if (authCodes != null && !authCodes.isEmpty()) {
                    int i6 = component1 + 59;
                    ShareDataUIState = i6 % 128;
                    if (i6 % 2 != 0) {
                        this.paymentQrRespData.setValue(Resource.success(paymentQrResp));
                        return;
                    } else {
                        this.paymentQrRespData.setValue(Resource.success(paymentQrResp));
                        throw null;
                    }
                }
            }
        }
        getPaymentCodeList(null);
        int i7 = component1 + 53;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private void copydefault(PaymentQrResp paymentQrResp) {
        int i = 2 % 2;
        try {
            this.pollFreqs = new ArrayList<>(Arrays.asList(paymentQrResp.getPollFreq().split(ConstantsKt.COMMA_SEPARATOR)));
        } catch (Exception e) {
            L.d("PayViewCodeModel", "getPollFreqs: " + e.getMessage());
        }
        int i2 = ShareDataUIState + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    public void enablePaymentCode(EnablePaymentCodeRequest enablePaymentCodeRequest) {
        int i = 2 % 2;
        this.model.enablePaymentCode(enablePaymentCodeRequest, new ApiCallback<BaseResp>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 49;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component3(baseResp);
                int i5 = copydefault + 39;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component3(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 9;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                SPUtils.getInstance().put("PaymentQrResp", GsonUtils.toJson(baseResp));
                BasePayViewCodeModel.this.enablePaymentCodeData.setValue(Resource.success(baseResp));
                int i5 = copydefault + 89;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 113;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BasePayViewCodeModel.this.enablePaymentCodeData.setValue(Resource.error(baseException, null));
                int i5 = copydefault + 45;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = ShareDataUIState + 17;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void enablePaymentCode(String str) {
        int i = 2 % 2;
        enablePaymentCode(new EnablePaymentCodeRequest(str));
        int i2 = component1 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void queryAuthNotice(BaseRequestParams baseRequestParams) {
        int i = 2 % 2;
        this.model.queryAuthNotice(baseRequestParams, new ApiCallback<AuthNoticeResp>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(AuthNoticeResp authNoticeResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 73;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component2(authNoticeResp);
                if (i4 != 0) {
                    throw null;
                }
            }

            public void component2(AuthNoticeResp authNoticeResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 23;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    BasePayViewCodeModel.this.authNoticeRespData.setValue(Resource.success(authNoticeResp));
                    int i4 = 85 / 0;
                } else {
                    BasePayViewCodeModel.this.authNoticeRespData.setValue(Resource.success(authNoticeResp));
                }
                int i5 = component2 + 49;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 105;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                BasePayViewCodeModel.this.authNoticeRespData.setValue(Resource.error(baseException, null));
                int i5 = component2 + 37;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component1 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void queryAuthNotice() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        queryAuthNotice(null);
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        int i5 = component1 + 47;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void saveQrListResp() {
        Resource<PaymentQrResp> value;
        int i = 2 % 2;
        int i2 = component1 + 49;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            this.authCodesBeanList.remove(0);
            value = this.paymentQrRespData.getValue();
            if (value == null) {
                return;
            }
        } else {
            this.authCodesBeanList.remove(0);
            value = this.paymentQrRespData.getValue();
            if (value == null) {
                return;
            }
        }
        PaymentQrResp data = value.getData();
        data.setAuthCodes(this.authCodesBeanList);
        SPUtils.getInstance().put("QR_CODE_LIST_" + SPUtils.getInstance().getString("recent_login_phone_number"), GsonUtils.toJson(data));
        int i3 = ShareDataUIState + 27;
        component1 = i3 % 128;
        int i4 = i3 % 2;
    }

    public List<PaymentQrResp.AuthCodesBean> getAuthCodesBeanList() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<PaymentQrResp.AuthCodesBean> list = this.authCodesBeanList;
        int i5 = i3 + 79;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public void refreshQrCode() {
        int i = 2 % 2;
        if (!this.authCodesBeanList.isEmpty()) {
            int i2 = ShareDataUIState + 81;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            this.authCodesBean.setValue(this.authCodesBeanList.get(0));
            return;
        }
        this.authCodesBean.setValue(null);
        int i4 = component1 + 69;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setQueryOrderInfoTimer() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<PaymentQrResp.AuthCodesBean> list = this.authCodesBeanList;
        if (list != null) {
            int i5 = i3 + 95;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                list.isEmpty();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!list.isEmpty()) {
                Timer timer = this.queryOrderInfoTimer;
                if (timer != null) {
                    timer.cancel();
                }
                this.queryOrderInfoTimer = new Timer();
                queryOrderPeriod();
                return;
            }
            int i6 = component1 + 123;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 % 3;
            }
        }
        getPaymentCodeList();
    }

    public void queryOrderPeriod() {
        int i = 2 % 2;
        queryAuthNotice();
        try {
            this.queryOrderInfoTimer.schedule(new TimerTask() {
                private static int ShareDataUIState = 1;
                private static int component3;

                @Override
                public void run() {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 117;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    BasePayViewCodeModel.this.queryOrderPeriod();
                    if (i4 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }, Integer.parseInt(this.pollFreqs.get(0)) * 1000);
            if (this.pollFreqs.isEmpty()) {
                return;
            }
            int i2 = ShareDataUIState + 55;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            this.pollFreqs.remove(0);
            int i4 = component1 + 31;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception unused) {
        }
    }

    public void cancel() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Timer timer = this.queryOrderInfoTimer;
            if (timer != null) {
                int i4 = i3 + 91;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                timer.cancel();
                if (i5 == 0) {
                    throw null;
                }
                return;
            }
            return;
        }
        throw null;
    }

    static void component3(BasePayViewCodeModel basePayViewCodeModel, PaymentQrResp paymentQrResp) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        basePayViewCodeModel.copydefault(paymentQrResp);
        int i4 = ShareDataUIState + 47;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
