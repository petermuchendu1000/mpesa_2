package com.huawei.digitalpayment.consumer.profile.model;

import androidx.work.WorkRequest;
import com.blankj.utilcode.util.ThreadUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.JsonObject;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.profile.R;
import com.huawei.digitalpayment.consumer.profile.model.ChangeMsisdnModel;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.remote.RemoteCustomer;
import com.huawei.digitalpayment.consumer.profile.model.remote.RemoteQueryChangeMsisdnResult;
import com.huawei.digitalpayment.consumer.profile.model.request.ChangeMsisdnParams;
import com.huawei.digitalpayment.consumer.profile.model.request.SendChangeMsisdnSmsParams;
import com.huawei.digitalpayment.consumer.profile.model.request.VerifyChangeMsisdnSmsParams;
import com.huawei.digitalpayment.consumer.profile.util.ModelMappingUtils;
import com.huawei.digitalpayment.consumer.profile.util.ProfileHelper;
import com.huawei.http.BaseResp;
import javax.inject.Inject;

public class ChangeMsisdnModel implements IChangeMsisdnModel {
    private static final int QUERY_TIME_IN_SECOND = 2000;
    private static int ShareDataUIState = 1;
    private static final int TIME_OUT_IN_SECOND = 10000;
    private static int component1;
    private long startQueryTime;

    @Inject
    public ChangeMsisdnModel() {
    }

    @Override
    public void sendChangeMsisdnSms(SendChangeMsisdnSmsParams sendChangeMsisdnSmsParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>(this) {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 39;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 3;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    return "sendChangeMsisdnSms";
                }
                throw null;
            }
        };
        paymentRequest.addParams(sendChangeMsisdnSmsParams);
        sendRequest(paymentRequest, apiCallback);
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void verifyChangeMsisdnSms(VerifyChangeMsisdnSmsParams verifyChangeMsisdnSmsParams, ApiCallback<BaseResp> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>(this) {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component2;
                int i4 = i3 + 57;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 91;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return "verifyChangeMsisdnSms";
            }
        };
        paymentRequest.addParams(verifyChangeMsisdnSmsParams);
        sendRequest(paymentRequest, apiCallback);
        int i2 = component1 + 79;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void identityVerifyAndChangeMsisdn(String str, ApiCallback<LocalCustomer> apiCallback) {
        int i = 2 % 2;
        changeMsisdn(new ChangeMsisdnParams(SPUtils.getInstance().getString("recent_login_phone_number"), str), apiCallback);
        int i2 = component1 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    class AnonymousClass4 implements ApiCallback<RemoteCustomer> {
        private static int component1 = 1;
        private static int copydefault;
        final ApiCallback val$callback;
        final ChangeMsisdnParams val$params;

        AnonymousClass4(ChangeMsisdnParams changeMsisdnParams, ApiCallback apiCallback) {
            this.val$params = changeMsisdnParams;
            this.val$callback = apiCallback;
        }

        @Override
        public void onSuccess(RemoteCustomer remoteCustomer) {
            int i = 2 % 2;
            int i2 = component1 + 19;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            onSuccess2(remoteCustomer);
            int i4 = copydefault + 61;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }

        public void onSuccess2(final RemoteCustomer remoteCustomer) {
            int i = 2 % 2;
            final ChangeMsisdnParams changeMsisdnParams = this.val$params;
            final ApiCallback apiCallback = this.val$callback;
            ThreadUtils.runOnUiThreadDelayed(new Runnable() {
                private static int component3 = 1;
                private static int copydefault;

                @Override
                public final void run() {
                    int i2 = 2 % 2;
                    int i3 = component3 + 111;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    ChangeMsisdnModel.AnonymousClass4 anonymousClass4 = this.f$0;
                    if (i4 == 0) {
                        ChangeMsisdnModel.AnonymousClass4.$r8$lambda$2vWQs96vOORlSCmyJjmIUzzWAi4(anonymousClass4, changeMsisdnParams, remoteCustomer, apiCallback);
                    } else {
                        ChangeMsisdnModel.AnonymousClass4.$r8$lambda$2vWQs96vOORlSCmyJjmIUzzWAi4(anonymousClass4, changeMsisdnParams, remoteCustomer, apiCallback);
                        int i5 = 55 / 0;
                    }
                }
            }, 2000L);
            int i2 = copydefault + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
        }

        private void lambda$onSuccess$0(ChangeMsisdnParams changeMsisdnParams, RemoteCustomer remoteCustomer, ApiCallback apiCallback) {
            int i = 2 % 2;
            int i2 = copydefault + 21;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ChangeMsisdnModel.m10856$$Nest$fputstartQueryTime(ChangeMsisdnModel.this, System.currentTimeMillis());
            ChangeMsisdnModel.m10857$$Nest$mqueryChangeMsisdnResult(ChangeMsisdnModel.this, changeMsisdnParams, ModelMappingUtils.toLocalCustomer(remoteCustomer), apiCallback);
            int i4 = component1 + 49;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override
        public void onError(BaseException baseException) {
            int i = 2 % 2;
            int i2 = copydefault + 19;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            this.val$callback.onError(baseException);
            int i4 = component1 + 99;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public static void $r8$lambda$2vWQs96vOORlSCmyJjmIUzzWAi4(AnonymousClass4 anonymousClass4, ChangeMsisdnParams changeMsisdnParams, RemoteCustomer remoteCustomer, ApiCallback apiCallback) {
            int i = 2 % 2;
            int i2 = copydefault + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            anonymousClass4.lambda$onSuccess$0(changeMsisdnParams, remoteCustomer, apiCallback);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public void changeMsisdn(ChangeMsisdnParams changeMsisdnParams, ApiCallback<LocalCustomer> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<RemoteCustomer> paymentRequest = new PaymentRequest<RemoteCustomer>(this) {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 101;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return "changeMsisdn";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        paymentRequest.addParams(changeMsisdnParams);
        sendRequest(paymentRequest, new AnonymousClass4(changeMsisdnParams, apiCallback));
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    class AnonymousClass6 implements ApiCallback<RemoteQueryChangeMsisdnResult> {
        private static int component1 = 1;
        private static int component3;
        final ApiCallback val$callback;
        final LocalCustomer val$customer;
        final String val$newMsisdn;
        final String val$oldMsisdn;
        final ChangeMsisdnParams val$params;

        AnonymousClass6(String str, String str2, LocalCustomer localCustomer, ApiCallback apiCallback, ChangeMsisdnParams changeMsisdnParams) {
            this.val$oldMsisdn = str;
            this.val$newMsisdn = str2;
            this.val$customer = localCustomer;
            this.val$callback = apiCallback;
            this.val$params = changeMsisdnParams;
        }

        @Override
        public void onSuccess(RemoteQueryChangeMsisdnResult remoteQueryChangeMsisdnResult) {
            int i = 2 % 2;
            int i2 = component3 + 37;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            onSuccess2(remoteQueryChangeMsisdnResult);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public void onSuccess2(RemoteQueryChangeMsisdnResult remoteQueryChangeMsisdnResult) {
            int i;
            int i2 = 2 % 2;
            int i3 = component1 + 65;
            component3 = i3 % 128;
            if (i3 % 2 == 0 ? remoteQueryChangeMsisdnResult.getResultFlag() == 1 : remoteQueryChangeMsisdnResult.getResultFlag() == 1) {
                ChangeMsisdnModel.m10858$$Nest$smchangeSuccess(this.val$oldMsisdn, this.val$newMsisdn, this.val$customer, this.val$callback);
                i = component3 + 77;
                component1 = i % 128;
            } else {
                if (remoteQueryChangeMsisdnResult.getResultFlag() == 0) {
                    this.val$callback.onError(new BaseException(Utils.getApp().getString(R.string.profile_mobile_tips10)));
                    return;
                }
                if (System.currentTimeMillis() - ChangeMsisdnModel.m10855$$Nest$fgetstartQueryTime(ChangeMsisdnModel.this) <= WorkRequest.MIN_BACKOFF_MILLIS) {
                    final ChangeMsisdnParams changeMsisdnParams = this.val$params;
                    final LocalCustomer localCustomer = this.val$customer;
                    final ApiCallback apiCallback = this.val$callback;
                    ThreadUtils.runOnUiThreadDelayed(new Runnable() {
                        private static int component2 = 0;
                        private static int component3 = 1;

                        @Override
                        public final void run() {
                            int i4 = 2 % 2;
                            int i5 = component3 + 3;
                            component2 = i5 % 128;
                            int i6 = i5 % 2;
                            ChangeMsisdnModel.AnonymousClass6.$r8$lambda$kMZuO3ZWX28eOUIuaAQmRRCjQLY(this.f$0, changeMsisdnParams, localCustomer, apiCallback);
                            int i7 = component2 + 71;
                            component3 = i7 % 128;
                            if (i7 % 2 != 0) {
                                return;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }, 2000L);
                    return;
                }
                int i4 = component1 + 85;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                ChangeMsisdnModel.this.queryMsisdnState(this.val$oldMsisdn, this.val$newMsisdn, this.val$customer, this.val$callback);
                i = component1 + 107;
                component3 = i % 128;
            }
            int i6 = i % 2;
        }

        private void lambda$onSuccess$0(ChangeMsisdnParams changeMsisdnParams, LocalCustomer localCustomer, ApiCallback apiCallback) {
            int i = 2 % 2;
            int i2 = component3 + 67;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ChangeMsisdnModel.m10857$$Nest$mqueryChangeMsisdnResult(ChangeMsisdnModel.this, changeMsisdnParams, localCustomer, apiCallback);
            if (i3 == 0) {
                int i4 = 71 / 0;
            }
        }

        @Override
        public void onError(BaseException baseException) {
            int i = 2 % 2;
            int i2 = component3 + 21;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            if (System.currentTimeMillis() - ChangeMsisdnModel.m10855$$Nest$fgetstartQueryTime(ChangeMsisdnModel.this) > WorkRequest.MIN_BACKOFF_MILLIS) {
                ChangeMsisdnModel.this.queryMsisdnState(this.val$oldMsisdn, this.val$newMsisdn, this.val$customer, this.val$callback);
            } else {
                final ChangeMsisdnParams changeMsisdnParams = this.val$params;
                final LocalCustomer localCustomer = this.val$customer;
                final ApiCallback apiCallback = this.val$callback;
                ThreadUtils.runOnUiThreadDelayed(new Runnable() {
                    private static int component1 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final void run() {
                        int i4 = 2 % 2;
                        int i5 = component1 + 53;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                        ChangeMsisdnModel.AnonymousClass6.m10859$r8$lambda$wk0Y2y6pJfaoUU11lpsYVUkGIU(this.f$0, changeMsisdnParams, localCustomer, apiCallback);
                        int i7 = component1 + 49;
                        copydefault = i7 % 128;
                        int i8 = i7 % 2;
                    }
                }, 2000L);
            }
            int i4 = component3 + 59;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
            }
        }

        private void lambda$onError$1(ChangeMsisdnParams changeMsisdnParams, LocalCustomer localCustomer, ApiCallback apiCallback) {
            int i = 2 % 2;
            int i2 = component1 + 37;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ChangeMsisdnModel.m10857$$Nest$mqueryChangeMsisdnResult(ChangeMsisdnModel.this, changeMsisdnParams, localCustomer, apiCallback);
            int i4 = component3 + 87;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }

        public static void $r8$lambda$kMZuO3ZWX28eOUIuaAQmRRCjQLY(AnonymousClass6 anonymousClass6, ChangeMsisdnParams changeMsisdnParams, LocalCustomer localCustomer, ApiCallback apiCallback) {
            int i = 2 % 2;
            int i2 = component3 + 1;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            anonymousClass6.lambda$onSuccess$0(changeMsisdnParams, localCustomer, apiCallback);
            int i4 = component1 + 91;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }

        public static void m10859$r8$lambda$wk0Y2y6pJfaoUU11lpsYVUkGIU(AnonymousClass6 anonymousClass6, ChangeMsisdnParams changeMsisdnParams, LocalCustomer localCustomer, ApiCallback apiCallback) {
            int i = 2 % 2;
            int i2 = component3 + 101;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            anonymousClass6.lambda$onError$1(changeMsisdnParams, localCustomer, apiCallback);
            if (i3 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private void queryChangeMsisdnResult(ChangeMsisdnParams changeMsisdnParams, LocalCustomer localCustomer, ApiCallback<LocalCustomer> apiCallback) {
        int i = 2 % 2;
        String oldMsisdn = changeMsisdnParams.getOldMsisdn();
        String newMsisdn = changeMsisdnParams.getNewMsisdn();
        PaymentRequest<RemoteQueryChangeMsisdnResult> paymentRequest = new PaymentRequest<RemoteQueryChangeMsisdnResult>(this) {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 73;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 3;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    return "queryChangeMsisdnResult";
                }
                throw null;
            }
        };
        paymentRequest.addParams("oldMsisdn", oldMsisdn);
        paymentRequest.addParams("newMsisdn", newMsisdn);
        sendRequest(paymentRequest, new AnonymousClass6(oldMsisdn, newMsisdn, localCustomer, apiCallback, changeMsisdnParams));
        int i2 = component1 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void changeSuccess(String str, String str2, LocalCustomer localCustomer, ApiCallback<LocalCustomer> apiCallback) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance().getString(str);
        SPUtils.getInstance().remove(PhoneUtils.getRecentLoginPhone());
        SPUtils.getInstance().put(str2, string);
        SPUtils.getInstance().put("recent_login_phone_number", str2);
        BiometricHelper2.getInstance().setBiometricExtraKey(str2);
        ProfileHelper.updateMsisdn(localCustomer.getShowMsisdn());
        apiCallback.onSuccess(localCustomer);
        int i4 = component1 + 41;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public void queryMsisdnState(final String str, final String str2, final LocalCustomer localCustomer, final ApiCallback<LocalCustomer> apiCallback) {
        int i = 2 % 2;
        PaymentRequest<Boolean> paymentRequest = new PaymentRequest<Boolean>(this) {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component3 + 45;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolConvert = convert(jsonObject);
                int i5 = component3 + 47;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 65 / 0;
                }
                return boolConvert;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 89;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return "verifyP2PTransfer";
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Boolean convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component3 + 17;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                String asString = jsonObject.get("customerType").getAsString();
                if (i4 == 0) {
                    return Boolean.valueOf("Register".equals(asString));
                }
                int i5 = 22 / 0;
                return Boolean.valueOf("Register".equals(asString));
            }
        };
        paymentRequest.addParams("receiverMsisdn", str2);
        sendRequest(paymentRequest, new ApiCallback<Boolean>(this) {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = component1 + 125;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(bool);
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(Boolean bool) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 69;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(bool);
                    if (bool.booleanValue()) {
                        int i4 = component1 + 9;
                        ShareDataUIState = i4 % 128;
                        int i5 = i4 % 2;
                        ChangeMsisdnModel.m10858$$Nest$smchangeSuccess(str, str2, localCustomer, apiCallback);
                        return;
                    }
                    apiCallback.onError(new BaseException(Utils.getApp().getString(R.string.profile_mobile_tips10)));
                    return;
                }
                super.onSuccess(bool);
                bool.booleanValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                super.onError(baseException);
                apiCallback.onError(new BaseException(Utils.getApp().getString(R.string.profile_mobile_tips10)));
                int i3 = component1 + 79;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i2 = component1 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    static long m10855$$Nest$fgetstartQueryTime(ChangeMsisdnModel changeMsisdnModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 33;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        long j = changeMsisdnModel.startQueryTime;
        int i5 = i2 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    static void m10856$$Nest$fputstartQueryTime(ChangeMsisdnModel changeMsisdnModel, long j) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        changeMsisdnModel.startQueryTime = j;
        int i5 = i3 + 87;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
    }

    static void m10857$$Nest$mqueryChangeMsisdnResult(ChangeMsisdnModel changeMsisdnModel, ChangeMsisdnParams changeMsisdnParams, LocalCustomer localCustomer, ApiCallback apiCallback) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        changeMsisdnModel.queryChangeMsisdnResult(changeMsisdnParams, localCustomer, apiCallback);
        int i4 = ShareDataUIState + 63;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void m10858$$Nest$smchangeSuccess(String str, String str2, LocalCustomer localCustomer, ApiCallback apiCallback) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        changeSuccess(str, str2, localCustomer, apiCallback);
        int i4 = component1 + 11;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
