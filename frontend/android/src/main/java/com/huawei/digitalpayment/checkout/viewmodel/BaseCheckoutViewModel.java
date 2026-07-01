package com.huawei.digitalpayment.checkout.viewmodel;

import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.huawei.biometric.constants.BiometricConstants;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.checkout.constants.TradeTypeEnum;
import com.huawei.digitalpayment.checkout.manager.PayManager;
import com.huawei.digitalpayment.checkout.model.IPayModel;
import com.huawei.digitalpayment.checkout.model.entity.BnplBean;
import com.huawei.digitalpayment.checkout.model.entity.CouponBean;
import com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay;
import com.huawei.digitalpayment.checkout.model.request.CancelPayOrderRequest;
import com.huawei.digitalpayment.checkout.model.request.H5CheckoutRequest;
import com.huawei.digitalpayment.checkout.model.request.PayRequest;
import com.huawei.digitalpayment.checkout.model.request.SubscribeOdRequest;
import com.huawei.digitalpayment.checkout.model.request.TransferRequest;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import com.huawei.digitalpayment.checkout.model.response.FreePinSuccessResp;
import com.huawei.digitalpayment.checkout.model.response.SubscribeOdResp;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.checkout.utils.CheckoutUtils;
import com.huawei.digitalpayment.checkout.utils.HwMutableLiveData;
import com.huawei.digitalpayment.checkout.utils.LoadingDialogUtil;
import com.huawei.digitalpayment.consumer.baselib.util.CommonUtils;
import com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaState;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseCheckoutViewModel<Model extends IPayModel> extends ViewModel {
    private static final int component3 = 10;
    private static int n = 0;
    private static int valueOf = 1;
    private MutableLiveData<CheckoutResp> accessartificialFrame;
    private String copydefault;

    private String f2655d;
    private MutableLiveData<TransferResp> getARTIFICIAL_FRAME_PACKAGE_NAME;
    private Map<String, Object> getRequestBeneficiariesState;
    private BnplBean h;
    private String k;
    protected final Model payModel;
    protected String prepayId;
    private MutableLiveData<CheckoutResp> component4 = new MutableLiveData<>();

    private final HwMutableLiveData<Boolean> f2652a = new HwMutableLiveData<>();
    private final HwMutableLiveData<Boolean> ArtificialStackFrames = new HwMutableLiveData<>();
    private final HwMutableLiveData<BaseResp> getSponsorBeneficiariesState = new HwMutableLiveData<>();
    private MutableLiveData<List<FundsSourceInfoDisplay>> toString = new MutableLiveData<>();

    private final HwMutableLiveData<CouponBean> f2654c = new HwMutableLiveData<>();
    private final HwMutableLiveData<CouponBean> component2 = new HwMutableLiveData<>();

    private final HwMutableLiveData<CouponBean> f2653b = new HwMutableLiveData<>();
    private final HwMutableLiveData<CouponBean> copy = new HwMutableLiveData<>();
    private MutableLiveData<TradeTypeEnum> i = new MutableLiveData<>();
    private HwMutableLiveData<FundsSourceInfoDisplay> g = new HwMutableLiveData<>();
    private HwMutableLiveData<FundsSourceInfoDisplay> component1 = new HwMutableLiveData<>();
    private MutableLiveData<BaseException> hashCode = new MutableLiveData<>();
    private final HwMutableLiveData<BaseException> coroutineCreation = new HwMutableLiveData<>();
    private final HwMutableLiveData<BaseException> equals = new HwMutableLiveData<>();
    private final HwMutableLiveData<Boolean> j = new HwMutableLiveData<>();
    private final HwMutableLiveData<Boolean> l = new HwMutableLiveData<>();
    private final MutableLiveData<String> CoroutineDebuggingKt = new MutableLiveData<>();
    private final HwMutableLiveData<Resource<CheckoutResp>> getAsAtTimestamp = new HwMutableLiveData<>();
    private final Map<String, String> coroutineBoundary = new HashMap();
    private final MutableLiveData<Resource<CheckoutResp>> invoke = new MutableLiveData<>();
    private final MutableLiveData<Boolean> e = new MutableLiveData<>();
    private final MutableLiveData<Boolean> invokeSuspend = new MutableLiveData<>();
    private final MutableLiveData<FreePinSuccessResp> getShareableDataState = new MutableLiveData<>();
    private final MutableLiveData<Boolean> f = new MutableLiveData<>();
    private final HwMutableLiveData<Resource<BaseResp>> ShareDataUIState = new HwMutableLiveData<>();
    private final MutableLiveData<Resource<SubscribeOdResp>> hExternalSyntheticLambda0 = new MutableLiveData<>();

    public static Object component3(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i5;
        int i9 = ~i2;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = (~(i2 | i5)) | (~(i7 | i9));
        int i12 = ~(i9 | i6 | i5);
        int i13 = i6 + i5 + i4 + ((-194346734) * i) + (9035316 * i3);
        int i14 = i13 * i13;
        int i15 = (((-787818500) * i6) - 443744256) + ((-1492047866) * i5) + (352114683 * i10) + (i11 * (-352114683)) + ((-352114683) * i12) + ((-1139933184) * i4) + (1190920192 * i) + (1456996352 * i3) + ((-1774911488) * i14);
        int i16 = (i6 * 1174986172) + 1294669563 + (i5 * 1174986598) + (i10 * (-213)) + (i11 * 213) + (i12 * 213) + (i4 * 1174986385) + (i * (-1060063438)) + (i3 * 107475828) + (i14 * 168099840);
        return i15 + ((i16 * i16) * 40566784) != 1 ? component1(objArr) : ShareDataUIState(objArr);
    }

    public BaseCheckoutViewModel(Model model) {
        if (PayManager.get().getPayModel() != null) {
            this.payModel = (Model) PayManager.get().getPayModel();
        } else {
            this.payModel = model;
            int i = valueOf + 33;
            n = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = valueOf + 37;
        n = i3 % 128;
        int i4 = i3 % 2;
    }

    public HwMutableLiveData<BaseResp> getLoadingLiveData() {
        int i = 2 % 2;
        int i2 = n + 75;
        int i3 = i2 % 128;
        valueOf = i3;
        int i4 = i2 % 2;
        HwMutableLiveData<BaseResp> hwMutableLiveData = this.getSponsorBeneficiariesState;
        int i5 = i3 + 97;
        n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return hwMutableLiveData;
    }

    public HwMutableLiveData<Boolean> getIsReCheckOutLiveData() {
        int i = 2 % 2;
        int i2 = valueOf + 29;
        int i3 = i2 % 128;
        n = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        HwMutableLiveData<Boolean> hwMutableLiveData = this.ArtificialStackFrames;
        int i4 = i3 + 93;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return hwMutableLiveData;
        }
        throw null;
    }

    public HwMutableLiveData<Resource<CheckoutResp>> getCheckPaymethoLiveData() {
        int i = 2 % 2;
        int i2 = n + 31;
        int i3 = i2 % 128;
        valueOf = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        HwMutableLiveData<Resource<CheckoutResp>> hwMutableLiveData = this.getAsAtTimestamp;
        int i4 = i3 + 71;
        n = i4 % 128;
        int i5 = i4 % 2;
        return hwMutableLiveData;
    }

    public HwMutableLiveData<FundsSourceInfoDisplay> getChangeFundSourceLiveData() {
        int i = 2 % 2;
        int i2 = valueOf + 97;
        n = i2 % 128;
        int i3 = i2 % 2;
        HwMutableLiveData<FundsSourceInfoDisplay> hwMutableLiveData = this.component1;
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return hwMutableLiveData;
    }

    public Map<String, String> getOptimalDiscountAmountMap() {
        int i = 2 % 2;
        int i2 = valueOf;
        int i3 = i2 + 27;
        n = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = this.coroutineBoundary;
        int i5 = i2 + 105;
        n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 94 / 0;
        }
        return map;
    }

    public Map<String, Object> getCheckParams() {
        Map<String, Object> map;
        int i = 2 % 2;
        int i2 = valueOf;
        int i3 = i2 + 69;
        n = i3 % 128;
        if (i3 % 2 != 0) {
            map = this.getRequestBeneficiariesState;
            int i4 = 6 / 0;
        } else {
            map = this.getRequestBeneficiariesState;
        }
        int i5 = i2 + 89;
        n = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public void setCheckParams(Map<String, Object> map) {
        int i = 2 % 2;
        if (this.getRequestBeneficiariesState == null) {
            int i2 = valueOf + 97;
            n = i2 % 128;
            int i3 = i2 % 2;
            this.getRequestBeneficiariesState = map;
        }
        int i4 = n + 89;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public BnplBean getSelectedBnpl() {
        FundsSourceInfoDisplay value;
        int i = 2 % 2;
        if (this.h == null && (value = getSelectedFundSourceLiveData().getValue()) != null) {
            int i2 = valueOf + 117;
            n = i2 % 128;
            int i3 = i2 % 2;
            if (!CollectionUtils.isEmpty(value.getDisplayProducts())) {
                int i4 = valueOf + 97;
                n = i4 % 128;
                int i5 = i4 % 2;
                this.h = value.getDisplayProducts().get(0);
            }
        }
        return this.h;
    }

    public void setSelectedBnpl(BnplBean bnplBean) {
        int i = 2 % 2;
        int i2 = valueOf + 103;
        n = i2 % 128;
        int i3 = i2 % 2;
        this.h = bnplBean;
        if (i3 != 0) {
            throw null;
        }
    }

    public HwMutableLiveData<CouponBean> getSelectMerchantCouponLiveData() {
        int i = 2 % 2;
        int i2 = valueOf + 33;
        n = i2 % 128;
        int i3 = i2 % 2;
        HwMutableLiveData<CouponBean> hwMutableLiveData = this.f2653b;
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return hwMutableLiveData;
    }

    public HwMutableLiveData<CouponBean> getChangeMerchantCouponLiveData() {
        int i = 2 % 2;
        int i2 = n;
        int i3 = i2 + 81;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        HwMutableLiveData<CouponBean> hwMutableLiveData = this.copy;
        int i5 = i2 + 9;
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return hwMutableLiveData;
    }

    public HwMutableLiveData<Boolean> getSubscribeSuccessLiveData() {
        int i = 2 % 2;
        int i2 = n;
        int i3 = i2 + 55;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        HwMutableLiveData<Boolean> hwMutableLiveData = this.j;
        int i5 = i2 + 5;
        valueOf = i5 % 128;
        int i6 = i5 % 2;
        return hwMutableLiveData;
    }

    public HwMutableLiveData<Boolean> getSubscribeSuccessLiveData2() {
        int i = 2 % 2;
        int i2 = n + 117;
        int i3 = i2 % 128;
        valueOf = i3;
        int i4 = i2 % 2;
        HwMutableLiveData<Boolean> hwMutableLiveData = this.l;
        int i5 = i3 + 113;
        n = i5 % 128;
        if (i5 % 2 == 0) {
            return hwMutableLiveData;
        }
        throw null;
    }

    public HwMutableLiveData<BaseException> getCheckOutExceptionLiveData() {
        int i = 2 % 2;
        int i2 = n + 25;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        HwMutableLiveData<BaseException> hwMutableLiveData = this.equals;
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        return hwMutableLiveData;
    }

    public MutableLiveData<BaseException> getExceptionMutableLiveData() {
        int i = 2 % 2;
        int i2 = n + 27;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        if (this.hashCode == null) {
            this.hashCode = new MutableLiveData<>();
            int i4 = n + 15;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
        }
        return this.hashCode;
    }

    public HwMutableLiveData<Boolean> getReCheckoutLiveData() {
        int i = 2 % 2;
        int i2 = n;
        int i3 = i2 + 19;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        HwMutableLiveData<Boolean> hwMutableLiveData = this.f2652a;
        int i5 = i2 + 41;
        valueOf = i5 % 128;
        int i6 = i5 % 2;
        return hwMutableLiveData;
    }

    public HwMutableLiveData<BaseException> getPayexceptionLiveData() {
        int i = 2 % 2;
        int i2 = valueOf + 117;
        n = i2 % 128;
        if (i2 % 2 == 0) {
            return this.coroutineCreation;
        }
        throw null;
    }

    public MutableLiveData<String> getNoteLiveData() {
        int i = 2 % 2;
        int i2 = valueOf;
        int i3 = i2 + 113;
        n = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        MutableLiveData<String> mutableLiveData = this.CoroutineDebuggingKt;
        int i4 = i2 + 89;
        n = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public boolean isOpenBiometricPay() {
        int i = 2 % 2;
        int i2 = n + 107;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsOpenBiometricPay = BiometricHelper2.getInstance().isOpenBiometricPay();
        int i4 = valueOf + 95;
        n = i4 % 128;
        int i5 = i4 % 2;
        return zIsOpenBiometricPay;
    }

    public int getBiometricPayWay() {
        int i = 2 % 2;
        if (BiometricHelper2.getInstance().isOpenFingerprintPay()) {
            int i2 = valueOf + 51;
            n = i2 % 128;
            return i2 % 2 != 0 ? 3 : 2;
        }
        if (!BiometricHelper2.getInstance().isOpenFaceIdPay()) {
            return 0;
        }
        int i3 = n + 119;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        return 1;
    }

    public String getPrepayId() {
        int i = 2 % 2;
        int i2 = n + 1;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        String str = this.prepayId;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return str;
    }

    public void setPrepayId(String str) {
        int i = 2 % 2;
        int i2 = n + 63;
        int i3 = i2 % 128;
        valueOf = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.prepayId = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 125;
        n = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public String getBankCardId() {
        int i = 2 % 2;
        int i2 = n + 13;
        int i3 = i2 % 128;
        valueOf = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 79;
        n = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return str;
    }

    public MutableLiveData<CheckoutResp> getCheckoutRespLiveData() {
        int i = 2 % 2;
        int i2 = valueOf + 107;
        n = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.component4 == null) {
            this.component4 = new MutableLiveData<>();
        }
        MutableLiveData<CheckoutResp> mutableLiveData = this.component4;
        int i3 = n + 29;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 9 / 0;
        }
        return mutableLiveData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        r5 = 90 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r4.prepayId = r5.getPrepayId();
        setFundSourceInfoDisplay(r5.getFundsSourceInfoDisplay());
        r4.g = new com.huawei.digitalpayment.checkout.utils.HwMutableLiveData<>();
        getCheckoutRespLiveData().postValue(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r4.component4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.component4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 11;
        com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.valueOf = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initCheckoutResp(com.huawei.digitalpayment.checkout.model.response.CheckoutResp r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.n
            int r2 = r1 + 43
            int r3 = r2 % 128
            com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.valueOf = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L17
            androidx.lifecycle.MutableLiveData<com.huawei.digitalpayment.checkout.model.response.CheckoutResp> r2 = r4.component4
            r3 = 42
            int r3 = r3 / 0
            if (r2 != 0) goto L29
            goto L1b
        L17:
            androidx.lifecycle.MutableLiveData<com.huawei.digitalpayment.checkout.model.response.CheckoutResp> r2 = r4.component4
            if (r2 != 0) goto L29
        L1b:
            int r1 = r1 + 11
            int r5 = r1 % 128
            com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.valueOf = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L28
            r5 = 90
            int r5 = r5 / 0
        L28:
            return
        L29:
            java.lang.String r0 = r5.getPrepayId()
            r4.prepayId = r0
            java.util.List r0 = r5.getFundsSourceInfoDisplay()
            r4.setFundSourceInfoDisplay(r0)
            com.huawei.digitalpayment.checkout.utils.HwMutableLiveData r0 = new com.huawei.digitalpayment.checkout.utils.HwMutableLiveData
            r0.<init>()
            r4.g = r0
            androidx.lifecycle.MutableLiveData r0 = r4.getCheckoutRespLiveData()
            r0.postValue(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.initCheckoutResp(com.huawei.digitalpayment.checkout.model.response.CheckoutResp):void");
    }

    public void reSetCheckoutResp(CheckoutResp checkoutResp) {
        int i = 2 % 2;
        int i2 = n + 23;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
            if (this.component4 == null) {
                return;
            }
        } else if (this.component4 == null) {
            return;
        }
        this.prepayId = checkoutResp.getPrepayId();
        getCheckoutRespLiveData().postValue(checkoutResp);
        int i4 = n + 51;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    public MutableLiveData<List<FundsSourceInfoDisplay>> getFundSourceInfoDisplay() {
        int i = 2 % 2;
        int i2 = n + 11;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        if (this.toString == null) {
            this.toString = new MutableLiveData<>();
        }
        MutableLiveData<List<FundsSourceInfoDisplay>> mutableLiveData = this.toString;
        int i4 = n + 105;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public void setFundSourceInfoDisplay(List<FundsSourceInfoDisplay> list) {
        int i = 2 % 2;
        int i2 = n + 73;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<List<FundsSourceInfoDisplay>> mutableLiveData = this.toString;
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(list);
        int i4 = n + 17;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
    }

    public MutableLiveData<TradeTypeEnum> getTradeTypeEnumLiveData() {
        int i = 2 % 2;
        int i2 = n + 87;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.i == null) {
                this.i = new MutableLiveData<>();
            }
            MutableLiveData<TradeTypeEnum> mutableLiveData = this.i;
            int i3 = valueOf + 55;
            n = i3 % 128;
            int i4 = i3 % 2;
            return mutableLiveData;
        }
        throw null;
    }

    public void setTradeTypeEnumLiveData(TradeTypeEnum tradeTypeEnum) {
        int i = 2 % 2;
        int i2 = n + 105;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        this.i.setValue(tradeTypeEnum);
        int i4 = n + 7;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public HwMutableLiveData<FundsSourceInfoDisplay> getSelectedFundSourceLiveData() {
        int i = 2 % 2;
        int i2 = valueOf + 25;
        int i3 = i2 % 128;
        n = i3;
        int i4 = i2 % 2;
        HwMutableLiveData<FundsSourceInfoDisplay> hwMutableLiveData = this.g;
        int i5 = i3 + 43;
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 64 / 0;
        }
        return hwMutableLiveData;
    }

    public void setSelectedFundSourceLiveData(FundsSourceInfoDisplay fundsSourceInfoDisplay) {
        int i = 2 % 2;
        int i2 = n + 35;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        if (fundsSourceInfoDisplay == null) {
            return;
        }
        this.copydefault = fundsSourceInfoDisplay.getBankCardId();
        FundsSourceInfoDisplay value = this.g.getValue();
        if (value == null) {
            List<FundsSourceInfoDisplay> value2 = this.toString.getValue();
            if (value2 != null) {
                int i4 = valueOf + 45;
                n = i4 % 128;
                int i5 = i4 % 2;
                if (value2.size() > 0) {
                    value = value2.get(0);
                    int i6 = valueOf + 11;
                    n = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            this.g.setValue(fundsSourceInfoDisplay);
            return;
        }
        if (value != null) {
            this.g.setValue(fundsSourceInfoDisplay);
            return;
        }
        int i8 = valueOf + 39;
        n = i8 % 128;
        int i9 = i8 % 2;
        this.g.setValue(fundsSourceInfoDisplay);
    }

    public void setSelectedMerchantCoupon(CouponBean couponBean) {
        int i = 2 % 2;
        int i2 = valueOf + 103;
        n = i2 % 128;
        int i3 = i2 % 2;
        this.f2653b.setValue(couponBean);
        int i4 = valueOf + 43;
        n = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public HwMutableLiveData<CouponBean> getCouponLiveData() {
        int i = 2 % 2;
        int i2 = n + 51;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f2654c;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public HwMutableLiveData<CouponBean> getChangeCouponLiveData() {
        int i = 2 % 2;
        int i2 = valueOf;
        int i3 = i2 + 37;
        n = i3 % 128;
        int i4 = i3 % 2;
        HwMutableLiveData<CouponBean> hwMutableLiveData = this.component2;
        int i5 = i2 + 115;
        n = i5 % 128;
        int i6 = i5 % 2;
        return hwMutableLiveData;
    }

    public void setSelectedCouponLiveData(CouponBean couponBean) {
        int i = 2 % 2;
        int i2 = valueOf + 67;
        n = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.f2654c.setValue(couponBean);
            obj.hashCode();
            throw null;
        }
        this.f2654c.setValue(couponBean);
        int i3 = n + 101;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setTradeType(String str) {
        int i = 2 % 2;
        int i2 = n;
        int i3 = i2 + 57;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        this.k = str;
        int i5 = i2 + 15;
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public String getTradeType() {
        int i = 2 % 2;
        int i2 = n + 89;
        int i3 = i2 % 128;
        valueOf = i3;
        int i4 = i2 % 2;
        String str = this.k;
        int i5 = i3 + 5;
        n = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setRawRequest(String str) {
        int i = 2 % 2;
        int i2 = valueOf;
        int i3 = i2 + 115;
        n = i3 % 128;
        int i4 = i3 % 2;
        this.f2655d = str;
        int i5 = i2 + 67;
        n = i5 % 128;
        int i6 = i5 % 2;
    }

    public String getRawRequest() {
        int i = 2 % 2;
        int i2 = n;
        int i3 = i2 + 49;
        valueOf = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f2655d;
        int i4 = i2 + 89;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getCurrentPayWay() {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = "sp_name_checkout"
            com.huawei.common.util.SPUtils r1 = com.huawei.common.util.SPUtils.getInstance(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "key_current_pay_way"
            r2.<init>(r3)
            r3 = 0
            java.lang.Object[] r10 = new java.lang.Object[r3]
            int r5 = com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaState.ShareDataUIState()
            int r7 = com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaState.ShareDataUIState()
            int r4 = com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaState.ShareDataUIState()
            int r6 = com.huawei.digitalpayment.consumer.sfcui.bonga.transfer.TransferBongaState.ShareDataUIState()
            r9 = -445653047(0xffffffffe56fdfc9, float:-7.0798356E22)
            r8 = 445653048(0x1a902038, float:5.9609056E-23)
            java.lang.Object r4 = component3(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            int r1 = r1.getInt(r2, r3)
            r2 = 1
            if (r1 != r2) goto L48
            com.huawei.biometric.util.BiometricHelper2 r4 = com.huawei.biometric.util.BiometricHelper2.getInstance()
            boolean r4 = r4.isOpenFaceIdPay()
            r4 = r4 ^ r2
            if (r4 == r2) goto L6d
        L48:
            if (r1 != r0) goto L71
            int r4 = com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.n
            int r4 = r4 + 111
            int r5 = r4 % 128
            com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.valueOf = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L63
            com.huawei.biometric.util.BiometricHelper2 r4 = com.huawei.biometric.util.BiometricHelper2.getInstance()
            boolean r4 = r4.isOpenFingerprintPay()
            r5 = 35
            int r5 = r5 / r3
            if (r4 == r2) goto L71
            goto L6d
        L63:
            com.huawei.biometric.util.BiometricHelper2 r4 = com.huawei.biometric.util.BiometricHelper2.getInstance()
            boolean r4 = r4.isOpenFingerprintPay()
            if (r4 == r2) goto L71
        L6d:
            setCurrentPayWay(r3)
            goto L72
        L71:
            r3 = r1
        L72:
            int r1 = com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.valueOf
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.n = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L7e
            return r3
        L7e:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.getCurrentPayWay():int");
    }

    public static void setCurrentPayWay(int i) {
        int i2 = 2 % 2;
        if (i >= 0) {
            int i3 = valueOf + 1;
            n = i3 % 128;
            int i4 = i3 % 2;
            if (i <= 2) {
                SPUtils sPUtils = SPUtils.getInstance("sp_name_checkout");
                StringBuilder sb = new StringBuilder("key_current_pay_way");
                int iShareDataUIState = TransferBongaState.ShareDataUIState();
                int iShareDataUIState2 = TransferBongaState.ShareDataUIState();
                sb.append((String) component3(TransferBongaState.ShareDataUIState(), iShareDataUIState, TransferBongaState.ShareDataUIState(), iShareDataUIState2, 445653048, -445653047, new Object[0]));
                sPUtils.put(sb.toString(), i);
                int i5 = valueOf + 21;
                n = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    public void paySuccess(int i) {
        int i2 = 2 % 2;
        int i3 = valueOf + 83;
        n = i3 % 128;
        int i4 = i3 % 2;
        setCurrentPayWay(i);
        int i5 = valueOf + 11;
        n = i5 % 128;
        int i6 = i5 % 2;
    }

    private static Object ShareDataUIState(Object[] objArr) {
        int i = 2 % 2;
        String str = "_" + SPUtils.getInstance().getString(BiometricConstants.CURRENT_ACCOUNT);
        int i2 = valueOf + 63;
        n = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public MutableLiveData<Resource<CheckoutResp>> getPrePayOrderLiveData() {
        int i = 2 % 2;
        int i2 = n;
        int i3 = i2 + 89;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Resource<CheckoutResp>> mutableLiveData = this.invoke;
        int i4 = i2 + 5;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public MutableLiveData<TransferResp> getPayOrderLiveData() {
        int i = 2 % 2;
        if (this.getARTIFICIAL_FRAME_PACKAGE_NAME == null) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = new MutableLiveData<>();
            int i2 = n + 47;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
        }
        MutableLiveData<TransferResp> mutableLiveData = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i4 = n + 33;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.lifecycle.MutableLiveData<com.huawei.digitalpayment.checkout.model.response.CheckoutResp> getPreOrderLiveData() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.n
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.valueOf = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            androidx.lifecycle.MutableLiveData<com.huawei.digitalpayment.checkout.model.response.CheckoutResp> r1 = r4.accessartificialFrame
            r2 = 89
            int r2 = r2 / 0
            if (r1 != 0) goto L2b
            goto L1b
        L17:
            androidx.lifecycle.MutableLiveData<com.huawei.digitalpayment.checkout.model.response.CheckoutResp> r1 = r4.accessartificialFrame
            if (r1 != 0) goto L2b
        L1b:
            androidx.lifecycle.MutableLiveData r1 = new androidx.lifecycle.MutableLiveData
            r1.<init>()
            r4.accessartificialFrame = r1
            int r1 = com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.n
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.valueOf = r2
            int r1 = r1 % r0
        L2b:
            androidx.lifecycle.MutableLiveData<com.huawei.digitalpayment.checkout.model.response.CheckoutResp> r1 = r4.accessartificialFrame
            int r2 = com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.n
            int r2 = r2 + 9
            int r3 = r2 % 128
            com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.valueOf = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L39
            return r1
        L39:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.getPreOrderLiveData():androidx.lifecycle.MutableLiveData");
    }

    public void setNote(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = n + 101;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        if (!map.containsKey("note")) {
            return;
        }
        int i4 = n + 71;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        getNoteLiveData().postValue((String) map.get("note"));
        if (i5 == 0) {
            throw null;
        }
    }

    @Deprecated
    public void preOrder(TradeTypeEnum tradeTypeEnum, Map<String, Object> map) {
        int i = 2 % 2;
        component3();
        setNote(map);
        setTradeTypeEnumLiveData(tradeTypeEnum);
        setTradeType((String) map.get("tradeType"));
        setCheckParams(map);
        this.payModel.preOrder(tradeTypeEnum, map, new ApiCallback<CheckoutResp>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onSuccess(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 45;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component2(checkoutResp);
                int i5 = component3 + 47;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void component2(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 103;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                PayManager.get().preCallback(Resource.success(checkoutResp));
                super.onSuccess(checkoutResp);
                Object[] objArr = {BaseCheckoutViewModel.this};
                BaseCheckoutViewModel.component3(TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), 444876181, -444876181, objArr);
                BaseCheckoutViewModel.this.initCheckoutResp(checkoutResp);
                BaseCheckoutViewModel.this.getPreOrderLiveData().postValue(checkoutResp);
                int i5 = component3 + 47;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 117;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                PayManager.get().preCallback(Resource.error(baseException, null));
                super.onError(baseException);
                Object[] objArr = {BaseCheckoutViewModel.this};
                BaseCheckoutViewModel.component3(TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), 444876181, -444876181, objArr);
                BaseCheckoutViewModel.this.getExceptionMutableLiveData().postValue(baseException);
                int i5 = component3 + 7;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = n + 65;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 88 / 0;
        }
    }

    public void prePayOrder(TradeTypeEnum tradeTypeEnum, Map<String, Object> map) {
        int i = 2 % 2;
        getPrePayOrderLiveData().postValue(Resource.loading(null));
        setNote(map);
        setTradeTypeEnumLiveData(tradeTypeEnum);
        setTradeType((String) map.get("tradeType"));
        setCheckParams(map);
        this.payModel.preOrder(tradeTypeEnum, map, new ApiCallback<CheckoutResp>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 31;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(checkoutResp);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void ShareDataUIState(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 29;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                PayManager.get().preCallback(Resource.success(checkoutResp));
                super.onSuccess(checkoutResp);
                BaseCheckoutViewModel.this.initCheckoutResp(checkoutResp);
                BaseCheckoutViewModel.this.getPrePayOrderLiveData().postValue(Resource.success(checkoutResp));
                int i5 = ShareDataUIState + 61;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 25;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    PayManager.get().preCallback(Resource.error(baseException, null));
                    super.onError(baseException);
                    BaseCheckoutViewModel.this.getPrePayOrderLiveData().postValue(Resource.error(baseException, null));
                    int i4 = component1 + 37;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 96 / 0;
                        return;
                    }
                    return;
                }
                PayManager.get().preCallback(Resource.error(baseException, null));
                super.onError(baseException);
                BaseCheckoutViewModel.this.getPrePayOrderLiveData().postValue(Resource.error(baseException, null));
                throw null;
            }
        });
        int i2 = n + 97;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Deprecated
    public void checkOut(Map<String, Object> map) {
        int i = 2 % 2;
        H5CheckoutRequest h5CheckoutRequest = (H5CheckoutRequest) CommonUtils.convertMapToObject(map, H5CheckoutRequest.class);
        component3();
        setTradeType((String) map.get("tradeType"));
        this.payModel.checkOut(h5CheckoutRequest, new ApiCallback<CheckoutResp>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 91;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component1(checkoutResp);
                if (i4 != 0) {
                    throw null;
                }
            }

            public void component1(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 33;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(checkoutResp);
                    BaseCheckoutViewModel.this.reSetCheckoutResp(checkoutResp);
                    int i4 = 73 / 0;
                } else {
                    super.onSuccess(checkoutResp);
                    BaseCheckoutViewModel.this.reSetCheckoutResp(checkoutResp);
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 39;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                Object[] objArr = {BaseCheckoutViewModel.this};
                BaseCheckoutViewModel.component3(TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), 444876181, -444876181, objArr);
                ToastUtils.showShort(baseException.getResponseDesc());
                int i5 = component2 + 93;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 72 / 0;
                }
            }
        });
        int i2 = valueOf + 89;
        n = i2 % 128;
        int i3 = i2 % 2;
    }

    public void checkOut(H5CheckoutRequest h5CheckoutRequest) {
        int i = 2 % 2;
        this.payModel.checkOut(h5CheckoutRequest, new ApiCallback<CheckoutResp>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onSuccess(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 29;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component3(checkoutResp);
                int i5 = component1 + 1;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public void component3(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 117;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(checkoutResp);
                BaseCheckoutViewModel.this.reSetCheckoutResp(checkoutResp);
                int i5 = component1 + 121;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 93;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseCheckoutViewModel.this.getCheckOutExceptionLiveData().postValue(baseException);
                int i5 = component1 + 71;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 9 / 0;
                }
            }
        });
        int i2 = n + 109;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void payOrder(final int i, TradeTypeEnum tradeTypeEnum, final Map<String, Object> map) {
        int i2;
        int i3 = 2 % 2;
        if (tradeTypeEnum == null) {
            return;
        }
        if (copydefault(map)) {
            int i4 = valueOf + 13;
            n = i4 % 128;
            int i5 = i4 % 2;
            LoadingDialogUtil.get().showPinFreeDialog((FragmentActivity) ActivityUtils.getTopActivity());
            i2 = n + 109;
            valueOf = i2 % 128;
        } else {
            component3();
            i2 = valueOf + 29;
            n = i2 % 128;
        }
        int i6 = i2 % 2;
        this.payModel.payOrder(tradeTypeEnum, (PayRequest) CommonUtils.convertMapToObject(map, PayRequest.class), new ApiCallback<TransferResp>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onSuccess(TransferResp transferResp) {
                int i7 = 2 % 2;
                int i8 = component1 + 85;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                component2(transferResp);
                int i10 = ShareDataUIState + 89;
                component1 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 7 / 0;
                }
            }

            public void component2(TransferResp transferResp) {
                int i7 = 2 % 2;
                int i8 = component1 + 45;
                ShareDataUIState = i8 % 128;
                if (i8 % 2 != 0) {
                    super.onSuccess(transferResp);
                    Object[] objArr = {BaseCheckoutViewModel.this};
                    BaseCheckoutViewModel.component3(TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), 444876181, -444876181, objArr);
                    BaseCheckoutViewModel.component3(BaseCheckoutViewModel.this, transferResp, map, i);
                    int i9 = 88 / 0;
                } else {
                    super.onSuccess(transferResp);
                    Object[] objArr2 = {BaseCheckoutViewModel.this};
                    BaseCheckoutViewModel.component3(TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), 444876181, -444876181, objArr2);
                    BaseCheckoutViewModel.component3(BaseCheckoutViewModel.this, transferResp, map, i);
                }
                int i10 = ShareDataUIState + 63;
                component1 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 12 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i7 = 2 % 2;
                int i8 = ShareDataUIState + 109;
                component1 = i8 % 128;
                if (i8 % 2 != 0) {
                    super.onError(baseException);
                    if (BaseCheckoutViewModel.copydefault(BaseCheckoutViewModel.this, map)) {
                        LoadingDialogUtil.get().disMissPinFreeDialog();
                    }
                    Object[] objArr = {BaseCheckoutViewModel.this};
                    BaseCheckoutViewModel.component3(TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), 444876181, -444876181, objArr);
                    BaseCheckoutViewModel.this.getPayexceptionLiveData().postValue(baseException);
                    int i9 = component1 + 29;
                    ShareDataUIState = i9 % 128;
                    int i10 = i9 % 2;
                    return;
                }
                super.onError(baseException);
                BaseCheckoutViewModel.copydefault(BaseCheckoutViewModel.this, map);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    public MutableLiveData<FreePinSuccessResp> getFreeSuccessLoading() {
        MutableLiveData<FreePinSuccessResp> mutableLiveData;
        int i = 2 % 2;
        int i2 = valueOf;
        int i3 = i2 + 61;
        n = i3 % 128;
        if (i3 % 2 != 0) {
            mutableLiveData = this.getShareableDataState;
            int i4 = 60 / 0;
        } else {
            mutableLiveData = this.getShareableDataState;
        }
        int i5 = i2 + 109;
        n = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MutableLiveData<Boolean> getShowFreeLoading() {
        int i = 2 % 2;
        int i2 = valueOf + 63;
        int i3 = i2 % 128;
        n = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Boolean> mutableLiveData = this.invokeSuspend;
        int i4 = i3 + 51;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return mutableLiveData;
        }
        obj.hashCode();
        throw null;
    }

    public MutableLiveData<Boolean> getShowLoading() {
        int i = 2 % 2;
        int i2 = valueOf + 47;
        int i3 = i2 % 128;
        n = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Boolean> mutableLiveData = this.e;
        int i4 = i3 + 31;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }

    public void payOrder(final int i, TradeTypeEnum tradeTypeEnum, final PayRequest payRequest) {
        int i2 = 2 % 2;
        if (tradeTypeEnum == null) {
            return;
        }
        if (!ShareDataUIState(payRequest)) {
            getShowLoading().postValue(true);
            int i3 = n + 25;
            valueOf = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = valueOf + 29;
            n = i5 % 128;
            int i6 = i5 % 2;
            getShowFreeLoading().postValue(true);
        }
        this.payModel.payOrder(tradeTypeEnum, payRequest, new ApiCallback<TransferResp>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onSuccess(TransferResp transferResp) {
                int i7 = 2 % 2;
                int i8 = ShareDataUIState + 113;
                component3 = i8 % 128;
                int i9 = i8 % 2;
                copydefault(transferResp);
                int i10 = ShareDataUIState + 43;
                component3 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            public void copydefault(TransferResp transferResp) {
                int i7 = 2 % 2;
                int i8 = component3 + 11;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                super.onSuccess(transferResp);
                BaseCheckoutViewModel.this.getShowLoading().postValue(false);
                if (BaseCheckoutViewModel.component3(BaseCheckoutViewModel.this, payRequest)) {
                    int i10 = component3 + 43;
                    ShareDataUIState = i10 % 128;
                    int i11 = i10 % 2;
                    if (!transferResp.isRetryPayFlag()) {
                        BaseCheckoutViewModel.this.getFreeSuccessLoading().postValue(new FreePinSuccessResp(transferResp, i));
                        return;
                    } else {
                        int i12 = ShareDataUIState + 107;
                        component3 = i12 % 128;
                        int i13 = i12 % 2;
                    }
                }
                BaseCheckoutViewModel.this.payOrderSuccess(i, transferResp);
            }

            @Override
            public void onError(BaseException baseException) {
                int i7 = 2 % 2;
                super.onError(baseException);
                if (BaseCheckoutViewModel.component3(BaseCheckoutViewModel.this, payRequest)) {
                    int i8 = ShareDataUIState + 119;
                    component3 = i8 % 128;
                    if (i8 % 2 != 0) {
                        BaseCheckoutViewModel.this.getShowFreeLoading().postValue(false);
                        int i9 = 7 / 0;
                    } else {
                        BaseCheckoutViewModel.this.getShowFreeLoading().postValue(false);
                    }
                }
                BaseCheckoutViewModel.this.getShowLoading().postValue(false);
                BaseCheckoutViewModel.this.getPayexceptionLiveData().postValue(baseException);
                int i10 = ShareDataUIState + 61;
                component3 = i10 % 128;
                int i11 = i10 % 2;
            }
        });
    }

    private void copydefault(final TransferResp transferResp, Map<String, Object> map, final int i) {
        int i2 = 2 % 2;
        if (copydefault(map)) {
            int i3 = valueOf + 95;
            n = i3 % 128;
            int i4 = i3 % 2;
            if (!transferResp.isRetryPayFlag()) {
                LoadingDialogUtil.get().setOnDialogDismiss(new LoadingDialogUtil.OnDialogDismiss() {
                    private static int component1 = 1;
                    private static int component3;

                    @Override
                    public final void onDialogDismiss() {
                        int i5 = 2 % 2;
                        int i6 = component1 + 111;
                        component3 = i6 % 128;
                        int i7 = i6 % 2;
                        BaseCheckoutViewModel baseCheckoutViewModel = this.f$0;
                        if (i7 == 0) {
                            BaseCheckoutViewModel.m10153$r8$lambda$GTGWTeBzVn8CYxvLmpYDzIMfBc(baseCheckoutViewModel, i, transferResp);
                        } else {
                            BaseCheckoutViewModel.m10153$r8$lambda$GTGWTeBzVn8CYxvLmpYDzIMfBc(baseCheckoutViewModel, i, transferResp);
                            int i8 = 75 / 0;
                        }
                    }
                }).disMissPinFreeDialogSuccess();
                return;
            } else {
                int i5 = valueOf + 67;
                n = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        payOrderSuccess(i, transferResp);
    }

    private void component2(int i, TransferResp transferResp) {
        int i2 = 2 % 2;
        int i3 = valueOf + 109;
        n = i3 % 128;
        int i4 = i3 % 2;
        payOrderSuccess(i, transferResp);
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
    }

    public void payOrderSuccess(int i, TransferResp transferResp) {
        int i2 = 2 % 2;
        int i3 = valueOf + 83;
        n = i3 % 128;
        if (i3 % 2 == 0) {
            transferResp.setPayWay(i);
            getPayOrderLiveData().postValue(transferResp);
            int i4 = valueOf + 29;
            n = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        transferResp.setPayWay(i);
        getPayOrderLiveData().postValue(transferResp);
        throw null;
    }

    private boolean copydefault(Map<String, Object> map) {
        int i = 2 % 2;
        int i2 = n + 117;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsEmpty = TextUtils.isEmpty((String) map.get("initiatorPin"));
        int i4 = n + 79;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return zIsEmpty;
    }

    private boolean ShareDataUIState(PayRequest payRequest) {
        int i = 2 % 2;
        int i2 = n + 97;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (payRequest == null || !TextUtils.isEmpty(payRequest.getInitiatorPin())) {
            return false;
        }
        int i3 = n + 113;
        valueOf = i3 % 128;
        return !(i3 % 2 == 0);
    }

    private void component3() {
        int i = 2 % 2;
        int i2 = n + 33;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        DialogManager.showLoading((FragmentActivity) ActivityUtils.getTopActivity());
        int i4 = n + 117;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
    }

    private void component1() {
        int i = 2 % 2;
        int i2 = n + 1;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        DialogManager.hideLoading((FragmentActivity) ActivityUtils.getTopActivity());
        int i4 = valueOf + 99;
        n = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void h5Checkout(Map<String, Object> map) {
        int i = 2 % 2;
        this.payModel.checkOut((H5CheckoutRequest) CommonUtils.convertMapToObject(map, H5CheckoutRequest.class), new ApiCallback<CheckoutResp>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 107;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                copydefault(checkoutResp);
                int i5 = component3 + 93;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 36 / 0;
                }
            }

            public void copydefault(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 3;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(checkoutResp);
                Object[] objArr = {BaseCheckoutViewModel.this};
                BaseCheckoutViewModel.component3(TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), 444876181, -444876181, objArr);
                BaseCheckoutViewModel.this.reSetCheckoutResp(checkoutResp);
                int i5 = component3 + 105;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 7;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                Object[] objArr = {BaseCheckoutViewModel.this};
                BaseCheckoutViewModel.component3(TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), 444876181, -444876181, objArr);
                ToastUtils.showShort(baseException.getResponseDesc());
                int i5 = component3 + 125;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = valueOf + 105;
        n = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 55 / 0;
        }
    }

    public void h5Checkout(H5CheckoutRequest h5CheckoutRequest) {
        int i = 2 % 2;
        int i2 = n + 97;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        checkOut(h5CheckoutRequest);
        int i4 = valueOf + 91;
        n = i4 % 128;
        int i5 = i4 % 2;
    }

    @Deprecated
    public void h5PayOrder(Map<String, Object> map) {
        int i = 2 % 2;
        this.payModel.payOrder(TradeTypeEnum.H5_CHECKOUT, (PayRequest) CommonUtils.convertMapToObject(map, PayRequest.class), new ApiCallback<TransferResp>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onSuccess(TransferResp transferResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 73;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component1(transferResp);
                int i5 = ShareDataUIState + 115;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component1(TransferResp transferResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 1;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(transferResp);
                Object[] objArr = {BaseCheckoutViewModel.this};
                BaseCheckoutViewModel.component3(TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), 444876181, -444876181, objArr);
                BaseCheckoutViewModel.this.payOrderSuccess(0, transferResp);
                int i5 = component1 + 11;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 48 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                super.onError(baseException);
                Object[] objArr = {BaseCheckoutViewModel.this};
                BaseCheckoutViewModel.component3(TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), TransferBongaState.ShareDataUIState(), 444876181, -444876181, objArr);
                if (baseException != null) {
                    int i3 = component1 + 93;
                    ShareDataUIState = i3 % 128;
                    if (i3 % 2 == 0) {
                        ToastUtils.showShort(baseException.getResponseDesc());
                    } else {
                        ToastUtils.showShort(baseException.getResponseDesc());
                        throw null;
                    }
                }
                BaseCheckoutViewModel.this.getPayexceptionLiveData().postValue(baseException);
                int i4 = component1 + 49;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 13 / 0;
                }
            }
        });
        int i2 = valueOf + 29;
        n = i2 % 128;
        int i3 = i2 % 2;
    }

    public void h5PayOrder(PayRequest payRequest) {
        int i = 2 % 2;
        this.payModel.payOrder(TradeTypeEnum.H5_CHECKOUT, payRequest, new ApiCallback<TransferResp>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onSuccess(TransferResp transferResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 59;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                copydefault(transferResp);
                int i5 = copydefault + 89;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void copydefault(TransferResp transferResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 111;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(transferResp);
                } else {
                    super.onSuccess(transferResp);
                }
                BaseCheckoutViewModel.this.payOrderSuccess(0, transferResp);
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 3;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onError(baseException);
                    BaseCheckoutViewModel.this.getPayexceptionLiveData().postValue(baseException);
                    int i4 = copydefault + 89;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                super.onError(baseException);
                BaseCheckoutViewModel.this.getPayexceptionLiveData().postValue(baseException);
                throw null;
            }
        });
        int i2 = valueOf + 59;
        n = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Deprecated
    public void transfer(String str, Map<String, Object> map) {
        int i = 2 % 2;
        TransferRequest transferRequest = new TransferRequest();
        transferRequest.setExtension(map);
        transfer(str, transferRequest);
        int i2 = valueOf + 37;
        n = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MutableLiveData<Boolean> getShowTransferLoading() {
        int i = 2 % 2;
        int i2 = n + 63;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void transfer(String str, TransferRequest transferRequest) {
        int i = 2 % 2;
        getShowTransferLoading().postValue(true);
        this.payModel.transfer(str, transferRequest, new ApiCallback<TransferResp>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(TransferResp transferResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 81;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component2(transferResp);
                if (i4 != 0) {
                    int i5 = 10 / 0;
                }
                int i6 = component1 + 119;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }

            public void component2(TransferResp transferResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 115;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(transferResp);
                BaseCheckoutViewModel.this.getShowTransferLoading().postValue(false);
                BaseCheckoutViewModel.this.payOrderSuccess(0, transferResp);
                int i5 = copydefault + 49;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 45;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseCheckoutViewModel.this.getShowTransferLoading().postValue(false);
                BaseCheckoutViewModel.this.getPayexceptionLiveData().postValue(baseException);
                int i5 = copydefault + 19;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = n + 99;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public HwMutableLiveData<Resource<BaseResp>> getCancelLivve() {
        int i = 2 % 2;
        int i2 = n + 47;
        int i3 = i2 % 128;
        valueOf = i3;
        int i4 = i2 % 2;
        HwMutableLiveData<Resource<BaseResp>> hwMutableLiveData = this.ShareDataUIState;
        int i5 = i3 + 57;
        n = i5 % 128;
        int i6 = i5 % 2;
        return hwMutableLiveData;
    }

    @Deprecated
    public void cancelPayOrder(String str) {
        int i = 2 % 2;
        cancelPayOrder(new CancelPayOrderRequest(str));
        int i2 = valueOf + 73;
        n = i2 % 128;
        int i3 = i2 % 2;
    }

    public void cancelPayOrder(CancelPayOrderRequest cancelPayOrderRequest) {
        int i = 2 % 2;
        this.payModel.cancelPayOrder(cancelPayOrderRequest, new ApiCallback<BaseResp>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 83;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(baseResp);
                int i5 = copydefault + 51;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void copydefault(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 5;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseCheckoutViewModel.component1(BaseCheckoutViewModel.this).postValue(Resource.success(baseResp));
                int i5 = component2 + 117;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 39;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseCheckoutViewModel.component1(BaseCheckoutViewModel.this).postValue(Resource.error(baseException, null));
                int i5 = copydefault + 79;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = valueOf + 125;
        n = i2 % 128;
        int i3 = i2 % 2;
    }

    public MutableLiveData<Resource<SubscribeOdResp>> getSubscribeLiveData() {
        int i = 2 % 2;
        int i2 = valueOf;
        int i3 = i2 + 43;
        n = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<SubscribeOdResp>> mutableLiveData = this.hExternalSyntheticLambda0;
        int i5 = i2 + 43;
        n = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void subscribe(SubscribeOdRequest subscribeOdRequest) {
        int i = 2 % 2;
        getSubscribeLiveData().postValue(Resource.loading(null));
        this.payModel.subscribe(subscribeOdRequest, new ApiCallback<SubscribeOdResp>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(SubscribeOdResp subscribeOdResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 11;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(subscribeOdResp);
                if (i4 != 0) {
                    int i5 = 80 / 0;
                }
            }

            public void copydefault(SubscribeOdResp subscribeOdResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 69;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(subscribeOdResp);
                    BaseCheckoutViewModel.this.getSubscribeLiveData().postValue(Resource.success(subscribeOdResp));
                    int i4 = 0 / 0;
                } else {
                    super.onSuccess(subscribeOdResp);
                    BaseCheckoutViewModel.this.getSubscribeLiveData().postValue(Resource.success(subscribeOdResp));
                }
                int i5 = copydefault + 27;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 53;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseCheckoutViewModel.this.getSubscribeLiveData().postValue(Resource.error(baseException, null));
                int i5 = copydefault + 125;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 34 / 0;
                }
            }
        });
        int i2 = n + 57;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
    }

    public void checkPaymethod(H5CheckoutRequest h5CheckoutRequest) {
        int i = 2 % 2;
        Object obj = null;
        getCheckPaymethoLiveData().postValue(Resource.loading(null));
        this.payModel.checkOut(h5CheckoutRequest, new ApiCallback<CheckoutResp>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 83;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component2(checkoutResp);
                int i5 = component3 + 109;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component2(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 23;
                component3 = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    super.onSuccess(checkoutResp);
                    BaseCheckoutViewModel.this.getCheckPaymethoLiveData().postValue(Resource.success(checkoutResp));
                    int i4 = copydefault + 51;
                    component3 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return;
                    }
                    obj2.hashCode();
                    throw null;
                }
                super.onSuccess(checkoutResp);
                BaseCheckoutViewModel.this.getCheckPaymethoLiveData().postValue(Resource.success(checkoutResp));
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 43;
                copydefault = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 == 0) {
                    super.onError(baseException);
                    BaseCheckoutViewModel.this.getCheckPaymethoLiveData().postValue(Resource.error(baseException, null));
                } else {
                    super.onError(baseException);
                    BaseCheckoutViewModel.this.getCheckPaymethoLiveData().postValue(Resource.error(baseException, null));
                    obj2.hashCode();
                    throw null;
                }
            }
        });
        int i2 = valueOf + 51;
        n = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public void checkPaymethod(Map<String, Object> map) {
        int i = 2 % 2;
        getCheckPaymethoLiveData().postValue(Resource.loading(null));
        this.payModel.checkOut(map, new ApiCallback<CheckoutResp>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 105;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(checkoutResp);
                if (i4 == 0) {
                    int i5 = 88 / 0;
                }
                int i6 = component2 + 17;
                component1 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 73 / 0;
                }
            }

            public void copydefault(CheckoutResp checkoutResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 115;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BaseCheckoutViewModel.this.getCheckPaymethoLiveData().postValue(Resource.success(checkoutResp));
                int i5 = component1 + 3;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 125;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                BaseCheckoutViewModel.this.getCheckPaymethoLiveData().postValue(Resource.error(baseException, null));
                int i5 = component2 + 123;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = n + 81;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
    }

    public CouponBean getSelectedCoupon() {
        int i = 2 % 2;
        CouponBean value = getCouponLiveData().getValue();
        if (value != null) {
            return value;
        }
        int i2 = n + 1;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        CouponBean optimaSplCoupon = CheckoutUtils.getOptimaSplCoupon(getCheckoutRespLiveData().getValue(), getCurrentAccount());
        int i4 = n + 113;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return optimaSplCoupon;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initSelectedMerchantCoupon() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.valueOf
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.n = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1f
            com.huawei.digitalpayment.checkout.utils.HwMutableLiveData r1 = r3.getSelectMerchantCouponLiveData()
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.checkout.model.entity.CouponBean r1 = (com.huawei.digitalpayment.checkout.model.entity.CouponBean) r1
            r2 = 55
            int r2 = r2 / 0
            if (r1 != 0) goto L3d
            goto L2b
        L1f:
            com.huawei.digitalpayment.checkout.utils.HwMutableLiveData r1 = r3.getSelectMerchantCouponLiveData()
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.checkout.model.entity.CouponBean r1 = (com.huawei.digitalpayment.checkout.model.entity.CouponBean) r1
            if (r1 != 0) goto L3d
        L2b:
            androidx.lifecycle.MutableLiveData r1 = r3.getCheckoutRespLiveData()
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.checkout.model.response.CheckoutResp r1 = (com.huawei.digitalpayment.checkout.model.response.CheckoutResp) r1
            com.huawei.digitalpayment.checkout.model.entity.FundsSourceInfoDisplay r2 = r3.getCurrentAccount()
            com.huawei.digitalpayment.checkout.model.entity.CouponBean r1 = com.huawei.digitalpayment.checkout.utils.CheckoutUtils.getOptimalMerchantCoupon(r1, r2)
        L3d:
            com.huawei.digitalpayment.checkout.utils.HwMutableLiveData r2 = r3.getSelectMerchantCouponLiveData()
            r2.setValue(r1)
            int r1 = com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.n
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.valueOf = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L50
            return
        L50:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.viewmodel.BaseCheckoutViewModel.initSelectedMerchantCoupon():void");
    }

    public void initSelectedSpCoupon() {
        int i = 2 % 2;
        int i2 = n + 25;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        CouponBean value = getCouponLiveData().getValue();
        if (value == null) {
            int i4 = valueOf + 81;
            n = i4 % 128;
            int i5 = i4 % 2;
            value = CheckoutUtils.getOptimaSplCoupon(getCheckoutRespLiveData().getValue(), getCurrentAccount());
        }
        getCouponLiveData().setValue(value);
        int i6 = n + 79;
        valueOf = i6 % 128;
        int i7 = i6 % 2;
    }

    public CouponBean getSelectedMerchantCoupon() {
        int i = 2 % 2;
        CouponBean value = getSelectMerchantCouponLiveData().getValue();
        if (value == null) {
            int i2 = valueOf + 107;
            n = i2 % 128;
            int i3 = i2 % 2;
            value = CheckoutUtils.getOptimalMerchantCoupon(getCheckoutRespLiveData().getValue(), getCurrentAccount());
        }
        int i4 = valueOf + 65;
        n = i4 % 128;
        int i5 = i4 % 2;
        return value;
    }

    public FundsSourceInfoDisplay getCurrentAccount() {
        int i = 2 % 2;
        int i2 = valueOf + 1;
        n = i2 % 128;
        if (i2 % 2 == 0) {
            return CheckoutUtils.getCurrentAccount(getSelectedFundSourceLiveData().getValue(), getFundSourceInfoDisplay().getValue());
        }
        CheckoutUtils.getCurrentAccount(getSelectedFundSourceLiveData().getValue(), getFundSourceInfoDisplay().getValue());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m10153$r8$lambda$GTGWTeBzVn8CYxvLmpYDzIMfBc(BaseCheckoutViewModel baseCheckoutViewModel, int i, TransferResp transferResp) {
        int i2 = 2 % 2;
        int i3 = valueOf + 117;
        n = i3 % 128;
        int i4 = i3 % 2;
        baseCheckoutViewModel.component2(i, transferResp);
        if (i4 != 0) {
            throw null;
        }
    }

    static HwMutableLiveData component1(BaseCheckoutViewModel baseCheckoutViewModel) {
        int i = 2 % 2;
        int i2 = valueOf + 73;
        int i3 = i2 % 128;
        n = i3;
        int i4 = i2 % 2;
        HwMutableLiveData<Resource<BaseResp>> hwMutableLiveData = baseCheckoutViewModel.ShareDataUIState;
        int i5 = i3 + 15;
        valueOf = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return hwMutableLiveData;
    }

    static void ShareDataUIState(BaseCheckoutViewModel baseCheckoutViewModel) {
        int iShareDataUIState = TransferBongaState.ShareDataUIState();
        int iShareDataUIState2 = TransferBongaState.ShareDataUIState();
        component3(TransferBongaState.ShareDataUIState(), iShareDataUIState, TransferBongaState.ShareDataUIState(), iShareDataUIState2, 444876181, -444876181, new Object[]{baseCheckoutViewModel});
    }

    static boolean component3(BaseCheckoutViewModel baseCheckoutViewModel, PayRequest payRequest) {
        int i = 2 % 2;
        int i2 = valueOf + 23;
        n = i2 % 128;
        int i3 = i2 % 2;
        boolean zShareDataUIState = baseCheckoutViewModel.ShareDataUIState(payRequest);
        int i4 = valueOf + 25;
        n = i4 % 128;
        if (i4 % 2 == 0) {
            return zShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static boolean copydefault(BaseCheckoutViewModel baseCheckoutViewModel, Map map) {
        int i = 2 % 2;
        int i2 = valueOf + 67;
        n = i2 % 128;
        int i3 = i2 % 2;
        boolean zCopydefault = baseCheckoutViewModel.copydefault(map);
        int i4 = n + 97;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return zCopydefault;
    }

    static void component3(BaseCheckoutViewModel baseCheckoutViewModel, TransferResp transferResp, Map map, int i) {
        int i2 = 2 % 2;
        int i3 = n + 35;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        baseCheckoutViewModel.copydefault(transferResp, map, i);
        int i5 = n + 97;
        valueOf = i5 % 128;
        int i6 = i5 % 2;
    }

    private static String component2() {
        int iShareDataUIState = TransferBongaState.ShareDataUIState();
        int iShareDataUIState2 = TransferBongaState.ShareDataUIState();
        return (String) component3(TransferBongaState.ShareDataUIState(), iShareDataUIState, TransferBongaState.ShareDataUIState(), iShareDataUIState2, 445653048, -445653047, new Object[0]);
    }

    private static Object component1(Object[] objArr) {
        BaseCheckoutViewModel baseCheckoutViewModel = (BaseCheckoutViewModel) objArr[0];
        int i = 2 % 2;
        int i2 = n + 85;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        baseCheckoutViewModel.component1();
        if (i3 != 0) {
            return null;
        }
        throw null;
    }
}
