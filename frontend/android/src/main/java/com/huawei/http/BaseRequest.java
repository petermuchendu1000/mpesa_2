package com.huawei.http;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.bumptech.glide.request.transition.ViewAnimationFactory;
import com.dynatrace.android.callback.OkCallback;
import com.google.gson.JsonObject;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.http.approute.AppRouteConfigUtils;
import com.huawei.http.convert.BaseDataConvertAdapter;
import com.huawei.http.convert.DataConvertManager;
import com.huawei.http.retrofit.HttpManager;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.ITrustedWebActivityCallbackDefault;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public abstract class BaseRequest<TransferResponse> {
    private Call call;
    private BaseDataConvertAdapter convertAdapter;
    private boolean finished;
    private Type responseClass;
    private String url;
    protected final String TAG = getClass().getSimpleName();
    private final Map<String, Object> params = new HashMap();
    private final Map<String, Object> query = new HashMap();
    private final Map<String, String> headers = new HashMap();
    private Method method = Method.POST;

    public enum Method {
        POST,
        GET
    }

    public BaseRequest() {
        initGenericClass();
    }

    public BaseRequest<TransferResponse> setUrl(String str) {
        this.url = str;
        return this;
    }

    public BaseRequest<TransferResponse> addParams(String str, Object obj) {
        if (!isEmpty(str) && obj != null) {
            this.params.put(str, obj);
        }
        return this;
    }

    public BaseRequest<TransferResponse> addQuery(String str, Object obj) {
        if (!isEmpty(str)) {
            this.query.put(str, obj);
        }
        return this;
    }

    public BaseRequest<TransferResponse> addHeader(String str, String str2) {
        if (!isEmpty(str)) {
            this.headers.put(str, str2);
        }
        return this;
    }

    public BaseRequest<TransferResponse> addParams(Object obj) {
        if (obj != null) {
            try {
                addParams(obj, obj.getClass(), false);
                addParams(obj, obj.getClass().getSuperclass(), true);
            } catch (IllegalAccessException e) {
                L.e(e.getMessage());
            }
        }
        return this;
    }

    private void addParams(Object obj, Class<?> cls, boolean z) throws IllegalAccessException {
        if (cls != null) {
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                if (field.getAnnotation(Extension.class) != null && obj2 != null) {
                    addParams((Map<String, Object>) obj2);
                } else if (!z) {
                    addParams(field.getName(), obj2);
                }
            }
        }
    }

    public BaseRequest<TransferResponse> addParams(Map<String, Object> map) {
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                addParams(str, map.get(str));
            }
        }
        return this;
    }

    public BaseRequest<TransferResponse> method(Method method) {
        this.method = method;
        return this;
    }

    public TransferResponse sendSyncRequest() throws Exception {
        if (this.finished) {
            return null;
        }
        try {
            initCall();
            return responseConvert(OkCallback.execute(this.call));
        } catch (Exception e) {
            throw getBaseException(e);
        }
    }

    public TransferResponse responseConvert(Response response) throws Exception {
        return transfer((JsonObject) GsonUtils.fromJson(response.body().string(), JsonObject.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String addUrlQuery(java.lang.String r7, java.util.Map<java.lang.String, java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L7
            return r7
        L7:
            android.net.Uri r7 = com.huawei.common.safe.SafeUri.parse(r7)
            java.util.Set r0 = com.huawei.common.safe.SafeUri.getQueryParameterNames(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r2 = r8.keySet()
            java.util.Iterator r2 = r2.iterator()
        L1c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r8.get(r3)
            boolean r5 = r0.contains(r3)
            if (r5 != 0) goto L1c
            java.lang.String r5 = "scheme_execute_key"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L3c
            goto L1c
        L3c:
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L1c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "="
            r5.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = ""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = android.net.Uri.encode(r3)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r1.add(r3)
            goto L1c
        L6d:
            java.lang.String r8 = "&"
            java.lang.String r0 = android.text.TextUtils.join(r8, r1)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "#"
            boolean r2 = r7.contains(r1)
            if (r2 == 0) goto L8c
            java.lang.String[] r1 = r7.split(r1)
            int r2 = r1.length
            if (r2 <= 0) goto L8c
            int r2 = r1.length
            int r2 = r2 + (-1)
            r1 = r1[r2]
            goto L8d
        L8c:
            r1 = r7
        L8d:
            java.lang.String r2 = "?"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto La8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r8)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            return r7
        La8:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r2)
            r8.append(r0)
            java.lang.String r7 = r8.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.http.BaseRequest.addUrlQuery(java.lang.String, java.util.Map):java.lang.String");
    }

    public BaseRequest<TransferResponse> sendRequest(final ApiCallback<TransferResponse> apiCallback) throws Throwable {
        if (this.finished) {
            return this;
        }
        try {
            initCall();
            OkCallback.enqueue(this.call, new Callback() {
                @Override
                public void onFailure(Call call, IOException iOException) {
                    OkCallback.onFailure_enter(call, iOException);
                    try {
                        BaseRequest.this.fetchError(apiCallback, iOException);
                    } finally {
                        OkCallback.onFailure_exit();
                    }
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    OkCallback.onResponse_enter(call, response);
                    try {
                        BaseRequest.this.handResponse(response, apiCallback);
                    } finally {
                        OkCallback.onResponse_exit();
                    }
                }
            });
        } catch (Exception e) {
            fetchError(apiCallback, e);
        }
        return this;
    }

    public void handResponse(Response response, final ApiCallback<TransferResponse> apiCallback) {
        if (this.finished) {
            return;
        }
        try {
            final TransferResponse transferresponseResponseConvert = responseConvert(response);
            ThreadUtils.runOnUiThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$handResponse$0(apiCallback, transferresponseResponseConvert);
                }
            });
        } catch (Exception e) {
            fetchError(apiCallback, e);
        }
    }

    public void lambda$handResponse$0(ApiCallback<TransferResponse> apiCallback, TransferResponse transferresponse) {
        if (apiCallback != null) {
            try {
                apiCallback.onSuccess(transferresponse);
            } catch (Exception e) {
                L.e(this.TAG, "deal error: " + e.getMessage());
            }
        }
    }

    private void initCall() throws Throwable {
        int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, this)).intValue();
        ArrayList arrayList = new ArrayList();
        int iCopydefault = ViewAnimationFactory.ConcreteViewTransitionAnimationFactory.copydefault(arrayList);
        int i = iCopydefault ^ iIntValue;
        if (iCopydefault != 0) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (iIntValue ^ i)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 1) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.resolveSize(0, 0), 42 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (KeyEvent.getMaxKeyCode() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((java.lang.reflect.Method) objCopydefault).invoke(null, null);
                Object[] objArr = {945462125, Long.valueOf(j3), arrayList, null, false, false};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 6562, TextUtils.indexOf("", "") + 56, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((java.lang.reflect.Method) objCopydefault2).invoke(objInvoke, objArr);
                throw new RuntimeException(String.valueOf(iIntValue));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        this.convertAdapter = DataConvertManager.getConvertAdapter(getApiPath());
        OkHttpClient okHttpClientBuild = HttpManager.getOkHttpClientBuilder(getInterceptors()).build();
        RequestBody requestBodyCreate = RequestBody.create(GsonUtils.toJson(this.params).replace("\\/", "/"), MediaType.parse(com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.http.constants.MediaType.APPLICATION_JSON));
        String strAddUrlQuery = addUrlQuery(addAppRoute(getUrl()), this.query);
        if (this.method == Method.GET) {
            strAddUrlQuery = addUrlQuery(strAddUrlQuery, this.params);
        }
        Request.Builder builderUrl = new Request.Builder().url(strAddUrlQuery);
        if (this.method == Method.POST) {
            builderUrl.post(requestBodyCreate);
        } else {
            builderUrl.get();
        }
        for (String str : this.headers.keySet()) {
            String str2 = this.headers.get(str);
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                builderUrl.addHeader(str, str2);
            }
        }
        this.call = okHttpClientBuild.newCall(builderUrl.build());
    }

    public void fetchError(final ApiCallback<TransferResponse> apiCallback, final Exception exc) {
        if (this.finished) {
            return;
        }
        ThreadUtils.runOnUiThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$fetchError$1(apiCallback, exc);
            }
        });
    }

    public String getUrl() {
        BaseDataConvertAdapter baseDataConvertAdapter = this.convertAdapter;
        if (baseDataConvertAdapter != null && !baseDataConvertAdapter.redirectPath().isEmpty()) {
            return this.convertAdapter.redirectPath();
        }
        return getApiPath();
    }

    protected String addAppRoute(String str) {
        if (!TextUtils.isEmpty(AppRouteConfigUtils.INSTANCE.getRouteHeard(str))) {
            addHeader("x-prefer-gw", AppRouteConfigUtils.INSTANCE.getRouteHeard(str));
        }
        return AppRouteConfigUtils.INSTANCE.addAppRoute(str);
    }

    private TransferResponse transfer(JsonObject jsonObject) {
        BaseDataConvertAdapter baseDataConvertAdapter = this.convertAdapter;
        if (baseDataConvertAdapter != null) {
            return (TransferResponse) baseDataConvertAdapter.transfer(jsonObject);
        }
        return convert(jsonObject);
    }

    public TransferResponse convert(JsonObject jsonObject) {
        return (TransferResponse) GsonUtils.fromJson(jsonObject.toString(), this.responseClass);
    }

    private void initGenericClass() {
        this.responseClass = parseGenericClass();
    }

    protected Type parseGenericClass() {
        Type[] actualTypeArguments = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            return actualTypeArguments[0];
        }
        return null;
    }

    public void lambda$fetchError$1(ApiCallback<TransferResponse> apiCallback, Throwable th) {
        L.e(this.TAG, "onError: " + th.getMessage());
        BaseException baseException = getBaseException(th);
        if (apiCallback != null) {
            try {
                apiCallback.onError(baseException);
            } catch (Exception e) {
                L.e(this.TAG, "onError deal error " + e.getMessage());
            }
        }
    }

    private static BaseException getBaseException(Throwable th) {
        if (th instanceof BaseException) {
            return (BaseException) th;
        }
        return new BaseException(th.getMessage());
    }

    public void onComplete(ApiCallback<TransferResponse> apiCallback) {
        L.d(this.TAG, "onComplete: ");
        if (apiCallback != null) {
            try {
                apiCallback.onComplete();
            } catch (Exception e) {
                L.e(this.TAG, "onComplete: " + e.getMessage());
            }
        }
        this.finished = true;
    }

    protected boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        return (obj instanceof String) && ((String) obj).length() == 0;
    }

    public void cancel() {
        this.finished = true;
        Call call = this.call;
        if (call == null || call.getCanceled()) {
            return;
        }
        this.call.cancel();
    }

    protected String getApiPath() {
        return this.url;
    }

    protected List<Interceptor> getInterceptors() {
        return new ArrayList();
    }
}
