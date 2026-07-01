package com.huawei.digitalpayment.consumer.sfcui.ui.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.scan.model.request.VerifyTransferRequest;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;
import com.huawei.digitalpayment.consumer.scan.repository.VerifyP2PTransferRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.UnregisterSendMoneyRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.repository.VerifyPochiRepository;
import com.huawei.digitalpayment.consumer.sfcui.ui.resp.UnregisterSendResp;
import com.huawei.payment.mvvm.Resource;

public class SendMoneyViewModel extends ViewModel implements BaseModel {
    private static int component2 = 0;
    private static int component3 = 1;
    private MutableLiveData<Resource<VerifyNumberResp>> component1 = new MutableLiveData<>();
    private MutableLiveData<Resource<VerifyNumberResp>> copydefault = new MutableLiveData<>();
    private MutableLiveData<Resource<UnregisterSendResp>> ShareDataUIState = new MutableLiveData<>();

    public MutableLiveData<Resource<VerifyNumberResp>> getVerifyData() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = this.component1;
        int i4 = i3 + 113;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return mutableLiveData;
        }
        obj.hashCode();
        throw null;
    }

    public MutableLiveData<Resource<VerifyNumberResp>> getVerifyPochiData() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = this.copydefault;
        int i5 = i2 + 81;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MutableLiveData<Resource<UnregisterSendResp>> getUnregisterSendMoneyData() {
        MutableLiveData<Resource<UnregisterSendResp>> mutableLiveData;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            mutableLiveData = this.ShareDataUIState;
            int i4 = 86 / 0;
        } else {
            mutableLiveData = this.ShareDataUIState;
        }
        int i5 = i2 + 123;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
        return mutableLiveData;
    }

    public void verifyP2PTransfer(String str) {
        int i = 2 % 2;
        this.component1.setValue(Resource.loading(null));
        sendRequest(new VerifyP2PTransferRepository(new VerifyTransferRequest(str)), new ApiCallback<VerifyNumberResp>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onSuccess(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 19;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component2(verifyNumberResp);
                int i5 = component2 + 17;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component2(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 75;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                SendMoneyViewModel.component1(SendMoneyViewModel.this).setValue(Resource.success(verifyNumberResp));
                int i5 = component3 + 101;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 81;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    SendMoneyViewModel.component1(SendMoneyViewModel.this).setValue(Resource.error(baseException, null));
                    int i4 = 36 / 0;
                } else {
                    SendMoneyViewModel.component1(SendMoneyViewModel.this).setValue(Resource.error(baseException, null));
                }
                int i5 = component3 + 123;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component3 + 37;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public void verifyPochiTransfer(String str) {
        int i = 2 % 2;
        Object obj = null;
        this.copydefault.setValue(Resource.loading(null));
        sendRequest(new VerifyPochiRepository(new VerifyTransferRequest(str)), new ApiCallback<VerifyNumberResp>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 89;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Object obj2 = null;
                component2(verifyNumberResp);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = component1 + 23;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }

            public void component2(VerifyNumberResp verifyNumberResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 25;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SendMoneyViewModel.component2(SendMoneyViewModel.this).setValue(Resource.success(verifyNumberResp));
                int i5 = component1 + 103;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 64 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component1 + 125;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                SendMoneyViewModel.component2(SendMoneyViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = component1 + 113;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component3 + 23;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void sendMoneyToUnRegister(String str, String str2) {
        int i = 2 % 2;
        this.ShareDataUIState.setValue(Resource.loading(null));
        sendRequest(new UnregisterSendMoneyRepository(str, str2), new ApiCallback<UnregisterSendResp>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(UnregisterSendResp unregisterSendResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 53;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                component3(unregisterSendResp);
                int i5 = component3 + 101;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component3(UnregisterSendResp unregisterSendResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 39;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                SendMoneyViewModel.copydefault(SendMoneyViewModel.this, unregisterSendResp);
                if (i4 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 111;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                SendMoneyViewModel.ShareDataUIState(SendMoneyViewModel.this).setValue(Resource.error(baseException, null));
                int i5 = ShareDataUIState + 97;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component3 + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void component2(UnregisterSendResp unregisterSendResp) {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (!TextUtils.isEmpty(unregisterSendResp.getErrorCode())) {
                this.ShareDataUIState.setValue(Resource.error(new BaseException(unregisterSendResp.getErrorCode(), unregisterSendResp.getErrorMessage()), null));
                int i3 = component2 + 95;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            this.ShareDataUIState.setValue(Resource.success(unregisterSendResp));
            return;
        }
        TextUtils.isEmpty(unregisterSendResp.getErrorCode());
        throw null;
    }

    static MutableLiveData ShareDataUIState(SendMoneyViewModel sendMoneyViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<UnregisterSendResp>> mutableLiveData = sendMoneyViewModel.ShareDataUIState;
        int i5 = i3 + 45;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    static MutableLiveData component1(SendMoneyViewModel sendMoneyViewModel) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = sendMoneyViewModel.component1;
        int i5 = i2 + 29;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static MutableLiveData component2(SendMoneyViewModel sendMoneyViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<VerifyNumberResp>> mutableLiveData = sendMoneyViewModel.copydefault;
        if (i3 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault(SendMoneyViewModel sendMoneyViewModel, UnregisterSendResp unregisterSendResp) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        sendMoneyViewModel.component2(unregisterSendResp);
        int i4 = component3 + 103;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
    }
}
