package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.blankj.utilcode.util.Utils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.config.BasicConfigRepository;
import com.huawei.digitalpayment.consumer.baselib.config.ConfigVerifyRepository;
import com.huawei.digitalpayment.consumer.baselib.constants.SPConstant;
import com.huawei.digitalpayment.consumer.basicModule.R;
import com.huawei.digitalpayment.consumer.basicUi.model.ISplashModel;
import com.huawei.digitalpayment.consumer.basicUi.response.LocalQueryLoginType;
import com.huawei.payment.mvvm.Resource;
import java.util.ArrayList;
import kotlin.BackEventCompatCompanion;
import kotlin.BackEventCompatSwipeEdge;
import org.json.JSONException;
import org.json.JSONObject;

public class BaseSplashViewModel<Model extends ISplashModel> extends ViewModel {
    private static int component1 = 1;
    private static int component3;
    protected final Model model;
    private final MutableLiveData<Boolean> ShareDataUIState = new MutableLiveData<>();
    private final MutableLiveData<Resource<LocalQueryLoginType>> copydefault = new MutableLiveData<>();
    protected MutableLiveData<Resource<Boolean>> publicKeyData = new MutableLiveData<>();

    public MutableLiveData<Boolean> getMutableLiveData() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LiveData<Resource<LocalQueryLoginType>> getData() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<LocalQueryLoginType>> mutableLiveData = this.copydefault;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public LiveData<Resource<Boolean>> getPublicKeyData() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<Boolean>> mutableLiveData = this.publicKeyData;
        int i5 = i3 + 101;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaseSplashViewModel(Model model) {
        this.model = model;
    }

    public void fetchPublicKeys() {
        int i = 2 % 2;
        this.publicKeyData.setValue(Resource.loading(null));
        ArrayList arrayList = new ArrayList();
        arrayList.add("publicKeys");
        new BasicConfigRepository(arrayList).sendRequest(new ApiCallback<Object>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 53;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                BaseSplashViewModel.ShareDataUIState(BaseSplashViewModel.this, obj);
                if (i4 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 91;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                BaseSplashViewModel.this.publicKeyData.setValue(Resource.error(baseException, null));
                int i5 = copydefault + 57;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component3 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void component3(Object obj) {
        int i = 2 % 2;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(obj.toString()).optJSONObject("publicKeys");
            if (jSONObjectOptJSONObject == null) {
                this.publicKeyData.setValue(Resource.error(new BaseException(Utils.getApp().getString(R.string.base_network_error_tips11)), null));
                return;
            }
            String strOptString = jSONObjectOptJSONObject.optString("defaultSignKey");
            String strOptString2 = jSONObjectOptJSONObject.optString("defaultPinKey");
            String strOptString3 = jSONObjectOptJSONObject.optString(ConfigVerifyRepository.SIGN_KEY_VERSION);
            String strOptString4 = jSONObjectOptJSONObject.optString(ConfigVerifyRepository.PIN_KEY_VERSION);
            if (!TextUtils.isEmpty(strOptString) && (!TextUtils.isEmpty(strOptString2))) {
                int i2 = component3 + 3;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                if (!TextUtils.isEmpty(strOptString3)) {
                    if (!TextUtils.isEmpty(strOptString4)) {
                        SPUtils.getInstance().put(SPConstant.PIN_KEY, strOptString2, true);
                        SPUtils.getInstance().put(SPConstant.PIN_KEY_VERSION, strOptString4, true);
                        SPUtils.getInstance().put(SPConstant.SIGN_KEY, strOptString, true);
                        SPUtils.getInstance().put(SPConstant.SIGN_KEY_VERSION, strOptString3, true);
                        this.publicKeyData.setValue(Resource.success(true));
                        return;
                    }
                    int i4 = component1 + 5;
                    component3 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 2 / 5;
                    }
                }
            }
            this.publicKeyData.setValue(Resource.error(new BaseException(Utils.getApp().getString(R.string.base_network_error_tips11)), null));
        } catch (JSONException e) {
            this.publicKeyData.setValue(Resource.error(BaseException.getException(e), null));
        }
    }

    public void queryGuide() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(SPConstant.APP_INTRO_CONFIG);
        new BasicConfigRepository(arrayList).sendRequest(new ApiCallback<Object>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(Object obj) {
                JSONObject jSONObject;
                int i2 = 2 % 2;
                super.onSuccess(obj);
                try {
                    jSONObject = new JSONObject(obj.toString());
                } catch (JSONException e) {
                    L.e(e.getMessage());
                    jSONObject = null;
                }
                BaseSplashViewModel.this.updateAppIntroConfig(jSONObject);
                BaseSplashViewModel.this.getMutableLiveData().setValue(true);
                int i3 = component3 + 103;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 98 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component2 + 85;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseSplashViewModel.this.getMutableLiveData().setValue(false);
                int i5 = component3 + 9;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = component1 + 17;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    protected void updateAppIntroConfig(JSONObject jSONObject) {
        int i = 2 % 2;
        Object obj = null;
        if (jSONObject == null) {
            int i2 = component3 + 29;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(SPConstant.APP_INTRO_CONFIG);
        if (jSONObjectOptJSONObject == null) {
            int i3 = component1 + 37;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                SPUtils.getInstance().put(SPConstant.APP_INTRO_CONFIG, "");
                return;
            } else {
                SPUtils.getInstance().put(SPConstant.APP_INTRO_CONFIG, "");
                obj.hashCode();
                throw null;
            }
        }
        SPUtils.getInstance().put(SPConstant.APP_INTRO_CONFIG, jSONObjectOptJSONObject.toString());
        int i4 = component1 + 113;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0046, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r4.model.queryLoginType(r5, new com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseSplashViewModel.AnonymousClass4(r4));
        r5 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseSplashViewModel.component3 + 45;
        com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseSplashViewModel.component1 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (android.text.TextUtils.isEmpty(com.huawei.common.util.SPUtils.getInstance().getString(com.huawei.digitalpayment.consumer.baselib.constants.SPConstant.TERMS_VERSION)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (android.text.TextUtils.isEmpty(com.huawei.common.util.SPUtils.getInstance().getString(com.huawei.digitalpayment.consumer.baselib.constants.SPConstant.TERMS_VERSION)) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        component3(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void queryLoginType(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseSplashViewModel.component1
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseSplashViewModel.component3 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "TERMS_VERSION"
            r3 = 0
            if (r1 == 0) goto L2c
            androidx.lifecycle.MutableLiveData<com.huawei.payment.mvvm.Resource<com.huawei.digitalpayment.consumer.basicUi.response.LocalQueryLoginType>> r1 = r4.copydefault
            com.huawei.payment.mvvm.Resource r3 = com.huawei.payment.mvvm.Resource.loading(r3)
            r1.setValue(r3)
            com.huawei.common.util.SPUtils r1 = com.huawei.common.util.SPUtils.getInstance()
            java.lang.String r1 = r1.getString(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 3
            int r2 = r2 / 0
            if (r1 == 0) goto L47
            goto L43
        L2c:
            androidx.lifecycle.MutableLiveData<com.huawei.payment.mvvm.Resource<com.huawei.digitalpayment.consumer.basicUi.response.LocalQueryLoginType>> r1 = r4.copydefault
            com.huawei.payment.mvvm.Resource r3 = com.huawei.payment.mvvm.Resource.loading(r3)
            r1.setValue(r3)
            com.huawei.common.util.SPUtils r1 = com.huawei.common.util.SPUtils.getInstance()
            java.lang.String r1 = r1.getString(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L47
        L43:
            r4.component3(r5)
            return
        L47:
            Model extends com.huawei.digitalpayment.consumer.basicUi.model.ISplashModel r1 = r4.model
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseSplashViewModel$4 r2 = new com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseSplashViewModel$4
            r2.<init>()
            r1.queryLoginType(r5, r2)
            int r5 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseSplashViewModel.component3
            int r5 = r5 + 45
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseSplashViewModel.component1 = r1
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseSplashViewModel.queryLoginType(java.lang.String):void");
    }

    private void component3(final String str) {
        int i = 2 % 2;
        AppConfigManager.INSTANCE.getConfigVerify(new ApiCallback<JSONObject>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(JSONObject jSONObject) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 33;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ShareDataUIState(jSONObject);
                int i5 = ShareDataUIState + 125;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void ShareDataUIState(JSONObject jSONObject) {
                int i2 = 2 % 2;
                int i3 = component2 + 67;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                BaseSplashViewModel baseSplashViewModel = BaseSplashViewModel.this;
                if (i4 == 0) {
                    baseSplashViewModel.queryLoginType(str);
                } else {
                    baseSplashViewModel.queryLoginType(str);
                    int i5 = 68 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 105;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    BaseSplashViewModel.component3(BaseSplashViewModel.this).setValue(Resource.error(baseException, null));
                } else {
                    BaseSplashViewModel.component3(BaseSplashViewModel.this).setValue(Resource.error(baseException, null));
                    throw null;
                }
            }
        });
        int i2 = component1 + 111;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static MutableLiveData component3(BaseSplashViewModel baseSplashViewModel) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<LocalQueryLoginType>> mutableLiveData = baseSplashViewModel.copydefault;
        int i5 = i2 + 23;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    static void ShareDataUIState(BaseSplashViewModel baseSplashViewModel, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        baseSplashViewModel.component3(obj);
        int i4 = component3 + 53;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static void copydefault() {
        BackEventCompatCompanion.component1[0] = BackEventCompatSwipeEdge.component3[0];
    }
}
