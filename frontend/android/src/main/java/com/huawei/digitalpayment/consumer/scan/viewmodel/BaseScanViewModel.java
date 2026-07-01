package com.huawei.digitalpayment.consumer.scan.viewmodel;

import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.safe.SafeUri;
import com.huawei.digitalpayment.consumer.scan.model.ScanModel;
import com.huawei.digitalpayment.consumer.scan.model.request.ScanQrRequest;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyBuyGoodsRequest;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyCashOutRequest;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyTransferRequest;
import com.huawei.digitalpayment.consumer.scan.model.response.ScanQrResp;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;
import com.huawei.payment.mvvm.Resource;

public class BaseScanViewModel<Model extends ScanModel> extends ViewModel {
    public static final String QR_CODE = "qrCode";
    public static final String QR_FLAG = "#";
    private static int component4 = 0;
    private static int copy = 1;
    protected final Model scanModel;
    private final MutableLiveData<Resource<VerifyNumberResp>> component1 = new MutableLiveData<>();
    private final MutableLiveData<Resource<VerifyNumberResp>> equals = new MutableLiveData<>();
    private final MutableLiveData<Resource<VerifyNumberResp>> component3 = new MutableLiveData<>();
    private final MutableLiveData<BaseException> component2 = new MutableLiveData<>();
    private final MutableLiveData<ScanQrResp> ShareDataUIState = new MutableLiveData<>();
    private final MutableLiveData<String> copydefault = new MutableLiveData<>();

    public LiveData<Resource<VerifyNumberResp>> getVerifyCashOut() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 25;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = this.component1;
        int i5 = i2 + 101;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public LiveData<Resource<VerifyNumberResp>> getVerifyP2pTransfer() {
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData;
        int i = 2 % 2;
        int i2 = component4 + 93;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            mutableLiveData = this.equals;
            int i4 = 79 / 0;
        } else {
            mutableLiveData = this.equals;
        }
        int i5 = i3 + 71;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public MutableLiveData<BaseException> getExceptionMutableLiveData() {
        int i = 2 % 2;
        int i2 = component4 + 13;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        MutableLiveData<BaseException> mutableLiveData = this.component2;
        int i5 = i3 + 111;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public LiveData<Resource<VerifyNumberResp>> getVerifyBuyGoodsTransfer() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 41;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = this.component3;
        int i5 = i2 + 55;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaseScanViewModel(Model model) {
        this.scanModel = model;
    }

    @Deprecated
    public void verifyCashOut(String str) {
        int i = 2 % 2;
        verifyCashOut(new VerifyCashOutRequest(str, str));
        int i2 = copy + 95;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
    }

    public void verifyCashOut(VerifyCashOutRequest verifyCashOutRequest) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        this.scanModel.verifyCashOut(verifyCashOutRequest, new ApiCallback<VerifyNumberResp>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 115;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component1(verifyNumberResp);
                int i5 = component1 + 39;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void component1(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 19;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                MutableLiveData mutableLiveDataComponent3 = BaseScanViewModel.component3(BaseScanViewModel.this);
                if (i4 == 0) {
                    mutableLiveDataComponent3.setValue(Resource.success(verifyNumberResp));
                } else {
                    mutableLiveDataComponent3.setValue(Resource.success(verifyNumberResp));
                    int i5 = 89 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 73;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseScanViewModel.component3(BaseScanViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseScanViewModel.component3(BaseScanViewModel.this).setValue(Resource.error(baseException, null));
                    throw null;
                }
            }
        });
        int i2 = copy + 53;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Deprecated
    public void verifyP2pTransfer(String str) {
        int i = 2 % 2;
        verifyP2pTransfer(new VerifyTransferRequest(str));
        int i2 = component4 + 115;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
    }

    public void verifyP2pTransfer(VerifyTransferRequest verifyTransferRequest) {
        int i = 2 % 2;
        this.equals.setValue(Resource.loading(null));
        this.scanModel.verifyP2pTransfer(verifyTransferRequest, new ApiCallback<VerifyNumberResp>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onSuccess(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 81;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component3(verifyNumberResp);
                if (i4 != 0) {
                    int i5 = 24 / 0;
                }
            }

            public void component3(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 51;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                BaseScanViewModel.component1(BaseScanViewModel.this).setValue(Resource.success(verifyNumberResp));
                int i5 = component3 + 111;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 97;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseScanViewModel.component1(BaseScanViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component3 + 125;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = copy + 35;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void verifyBuyGoodsTransfer(String str) {
        int i = 2 % 2;
        verifyBuyGoodsTransfer(new VerifyBuyGoodsRequest(str));
        int i2 = copy + 35;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 58 / 0;
        }
    }

    public void verifyBuyGoodsTransfer(VerifyBuyGoodsRequest verifyBuyGoodsRequest) {
        int i = 2 % 2;
        this.component3.setValue(Resource.loading(null));
        this.scanModel.verifyBuyGoodsTransfer(verifyBuyGoodsRequest, new ApiCallback<VerifyNumberResp>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 111;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(verifyNumberResp);
                int i5 = copydefault + 89;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void copydefault(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 11;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseScanViewModel.component2(BaseScanViewModel.this).setValue(Resource.success(verifyNumberResp));
                int i5 = component1 + 57;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 119;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseScanViewModel.component2(BaseScanViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseScanViewModel.component2(BaseScanViewModel.this).setValue(Resource.error(baseException, null));
                    throw null;
                }
            }
        });
        int i2 = component4 + 123;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    public MutableLiveData<ScanQrResp> getScanQrRespMutableLiveData() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 19;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<ScanQrResp> mutableLiveData = this.ShareDataUIState;
        int i5 = i2 + 87;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    @Deprecated
    public void analysisResult(String str, String str2) {
        int i = 2 % 2;
        analysisResult(new ScanQrRequest(str, str2));
        int i2 = copy + 75;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void analysisResult(ScanQrRequest scanQrRequest) {
        int i = 2 % 2;
        this.scanModel.analysisResult(scanQrRequest, new ApiCallback<ScanQrResp>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(ScanQrResp scanQrResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 125;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(scanQrResp);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void ShareDataUIState(ScanQrResp scanQrResp) {
                int i2 = 2 % 2;
                int i3 = copydefault + 33;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    super.onSuccess(scanQrResp);
                    BaseScanViewModel.this.getScanQrRespMutableLiveData().postValue(scanQrResp);
                    int i4 = 12 / 0;
                } else {
                    super.onSuccess(scanQrResp);
                    BaseScanViewModel.this.getScanQrRespMutableLiveData().postValue(scanQrResp);
                }
                int i5 = copydefault + 3;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 61;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseScanViewModel.this.getExceptionMutableLiveData().postValue(baseException);
                BaseScanViewModel.this.getScanQrRespMutableLiveData().postValue(null);
                int i5 = copydefault + 121;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 69 / 0;
                }
            }
        });
        int i2 = copy + 79;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 66 / 0;
        }
    }

    public LiveData<String> getNote() {
        int i = 2 % 2;
        int i2 = copy + 117;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        MutableLiveData<String> mutableLiveData = this.copydefault;
        int i4 = i3 + 5;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return mutableLiveData;
    }

    public void setNote(String str) {
        int i = 2 % 2;
        int i2 = copy + 107;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault.setValue(str);
        if (i3 != 0) {
            throw null;
        }
    }

    public String getQrCode(String str) {
        int i = 2 % 2;
        int i2 = component4 + 125;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (str.contains(QR_FLAG)) {
            str = str.replace(QR_FLAG, "");
        }
        Uri uri = SafeUri.parse(str);
        if (uri == null) {
            int i4 = copy + 49;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return "";
        }
        if (!SafeUri.getQueryParameterNames(uri).isEmpty()) {
            String queryParameter = SafeUri.getQueryParameter(uri, "qrCode");
            return !(TextUtils.isEmpty(queryParameter) ^ true) ? "" : queryParameter;
        }
        int i6 = component4 + 31;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return "";
    }

    static MutableLiveData component2(BaseScanViewModel baseScanViewModel) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 99;
        copy = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = baseScanViewModel.component3;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 35;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    static MutableLiveData component3(BaseScanViewModel baseScanViewModel) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 77;
        copy = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = baseScanViewModel.component1;
        if (i4 == 0) {
            int i5 = 34 / 0;
        }
        int i6 = i2 + 33;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return mutableLiveData;
    }

    static MutableLiveData component1(BaseScanViewModel baseScanViewModel) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 87;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = baseScanViewModel.equals;
        int i5 = i2 + 87;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        throw null;
    }
}
