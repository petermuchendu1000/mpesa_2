package com.huawei.digitalpayment.consumer.webview.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.webview.model.IWebViewModel;
import com.huawei.digitalpayment.consumer.webview.model.resp.AaRecordResp;
import com.huawei.digitalpayment.consumer.webview.model.resp.GetH5AccessTokenResp;
import com.huawei.digitalpayment.consumer.webview.model.resp.ScanQrResp;
import com.huawei.digitalpayment.consumer.webview.model.resp.VerifyNumberResp;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.util.Map;

public class BaseWebViewViewModel<Model extends IWebViewModel> extends ViewModel {
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState;
    protected final Model model;
    private final MutableLiveData<Resource<GetH5AccessTokenResp>> copydefault = new MutableLiveData<>();
    private final MutableLiveData<Resource<AaRecordResp>> component3 = new MutableLiveData<>();
    private final MutableLiveData<Resource<BaseResp>> ShareDataUIState = new MutableLiveData<>();
    private final MutableLiveData<Resource<VerifyNumberResp>> component1 = new MutableLiveData<>();
    private final MutableLiveData<Resource<ScanQrResp>> component2 = new MutableLiveData<>();

    public BaseWebViewViewModel(Model model) {
        this.model = model;
    }

    public MutableLiveData<Resource<ScanQrResp>> getAnalysisLiveData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 13;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<ScanQrResp>> mutableLiveData = this.component2;
        int i5 = i2 + 5;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 14 / 0;
        }
        return mutableLiveData;
    }

    public MutableLiveData<Resource<VerifyNumberResp>> getVerifyNumberLiveData() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 69;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    public MutableLiveData<Resource<BaseResp>> getVerifyLiveData() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.ShareDataUIState;
        int i4 = i3 + 51;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return mutableLiveData;
        }
        obj.hashCode();
        throw null;
    }

    public MutableLiveData<Resource<AaRecordResp>> getRecordLiveData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 75;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<AaRecordResp>> mutableLiveData = this.component3;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return mutableLiveData;
    }

    public LiveData<Resource<GetH5AccessTokenResp>> getH5AccessTokenResp() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 87;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void getH5AccessToken(String str) {
        int i = 2 % 2;
        this.copydefault.setValue(Resource.loading(null));
        this.model.getH5AccessToken(str, new ApiCallback<GetH5AccessTokenResp>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(GetH5AccessTokenResp getH5AccessTokenResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 85;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component1(getH5AccessTokenResp);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = component2 + 61;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public void component1(GetH5AccessTokenResp getH5AccessTokenResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 85;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseWebViewViewModel.ShareDataUIState(BaseWebViewViewModel.this).setValue(Resource.success(getH5AccessTokenResp));
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 19;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseWebViewViewModel.ShareDataUIState(BaseWebViewViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseWebViewViewModel.ShareDataUIState(BaseWebViewViewModel.this).setValue(Resource.error(baseException, null));
                    int i4 = 14 / 0;
                }
            }
        });
        int i2 = getAsAtTimestamp + 125;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void createAaPaidRecord(Map<String, Object> map) {
        int i = 2 % 2;
        getRecordLiveData().setValue(Resource.loading(null));
        this.model.createAaPaidRecord(map, new ApiCallback<AaRecordResp>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(AaRecordResp aaRecordResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 97;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component1(aaRecordResp);
                int i5 = component3 + 49;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component1(AaRecordResp aaRecordResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 51;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    super.onSuccess(aaRecordResp);
                    BaseWebViewViewModel.this.getRecordLiveData().setValue(Resource.success(aaRecordResp));
                    int i4 = 97 / 0;
                } else {
                    super.onSuccess(aaRecordResp);
                    BaseWebViewViewModel.this.getRecordLiveData().setValue(Resource.success(aaRecordResp));
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 59;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseWebViewViewModel.this.getRecordLiveData().setValue(Resource.error(baseException, null));
                int i5 = component3 + 31;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getRequestBeneficiariesState + 31;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    public void aaPaidVerify(Map<String, Object> map) {
        int i = 2 % 2;
        getVerifyLiveData().setValue(Resource.loading(null));
        this.model.aaPaidVerify(map, new ApiCallback<BaseResp>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;
            public static int copydefault = 1366588163;

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 89;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                component1(baseResp);
                if (i4 != 0) {
                    int i5 = 25 / 0;
                }
                int i6 = ShareDataUIState + 45;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }

            public void component1(BaseResp baseResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 25;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(baseResp);
                    BaseWebViewViewModel.this.getVerifyLiveData().setValue(Resource.success(baseResp));
                } else {
                    super.onSuccess(baseResp);
                    BaseWebViewViewModel.this.getVerifyLiveData().setValue(Resource.success(baseResp));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 9;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseWebViewViewModel.this.getVerifyLiveData().setValue(Resource.error(baseException, null));
                int i5 = ShareDataUIState + 81;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getAsAtTimestamp + 47;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
    }

    public void verifyP2pTransfer(String str) {
        int i = 2 % 2;
        getVerifyNumberLiveData().setValue(Resource.loading(null));
        this.model.verifyP2pTransfer(str, new ApiCallback<VerifyNumberResp>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 73;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                component1(verifyNumberResp);
                if (i4 == 0) {
                    throw null;
                }
            }

            public void component1(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 119;
                component1 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    super.onSuccess(verifyNumberResp);
                    BaseWebViewViewModel.this.getVerifyNumberLiveData().setValue(Resource.success(verifyNumberResp));
                    int i4 = ShareDataUIState + 27;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                super.onSuccess(verifyNumberResp);
                BaseWebViewViewModel.this.getVerifyNumberLiveData().setValue(Resource.success(verifyNumberResp));
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 31;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseWebViewViewModel.this.getVerifyNumberLiveData().setValue(Resource.error(baseException, null));
                int i5 = component1 + 95;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 81;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    public void analysisResult(String str, String str2) {
        int i = 2 % 2;
        getAnalysisLiveData().setValue(Resource.loading(null));
        this.model.analysisResult(str, str2, new ApiCallback<ScanQrResp>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onSuccess(ScanQrResp scanQrResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 15;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                component3(scanQrResp);
                if (i4 == 0) {
                    int i5 = 33 / 0;
                }
                int i6 = ShareDataUIState + 107;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
            }

            public void component3(ScanQrResp scanQrResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 1;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    super.onSuccess(scanQrResp);
                    BaseWebViewViewModel.this.getAnalysisLiveData().setValue(Resource.success(scanQrResp));
                    int i4 = ShareDataUIState + 115;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                super.onSuccess(scanQrResp);
                BaseWebViewViewModel.this.getAnalysisLiveData().setValue(Resource.success(scanQrResp));
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 73;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                Object obj = null;
                BaseWebViewViewModel.this.getAnalysisLiveData().setValue(Resource.error(baseException, null));
                int i5 = ShareDataUIState + 33;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = getAsAtTimestamp + 13;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    static MutableLiveData ShareDataUIState(BaseWebViewViewModel baseWebViewViewModel) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 73;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<GetH5AccessTokenResp>> mutableLiveData = baseWebViewViewModel.copydefault;
        int i5 = i3 + 53;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }
}
