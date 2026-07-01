package com.huawei.digitalpayment.consumer.notification.ui.service;

import androidx.lifecycle.MutableLiveData;
import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.JsonObject;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.baselib.service.INotificationUnReadService;
import com.huawei.digitalpayment.consumer.bean.NotificationNumResp;
import com.huawei.digitalpayment.consumer.utils.NotificationCountUtil;
import com.huawei.digitalpayment.consumer.utils.NotificationRefreshUtil;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "使用 INotificationService")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/notification/ui/service/NotificationUnReadServiceIml;", "Lcom/huawei/digitalpayment/consumer/baselib/service/INotificationUnReadService;", "<init>", "()V", "unRead", "Landroidx/lifecycle/MutableLiveData;", "", "getUnRead", "()Landroidx/lifecycle/MutableLiveData;", "setUnRead", "(Landroidx/lifecycle/MutableLiveData;)V", "notificationIsUnRead", "refreshNotificationUnread", "", "getNotificationUnRead", "CustomerPushMessageUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotificationUnReadServiceIml implements INotificationUnReadService {
    public static final int $stable = 8;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;
    private MutableLiveData<Boolean> ShareDataUIState = new MutableLiveData<>();

    public final MutableLiveData<Boolean> getUnRead() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        MutableLiveData<Boolean> mutableLiveData = this.ShareDataUIState;
        int i4 = i3 + 95;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return mutableLiveData;
        }
        obj.hashCode();
        throw null;
    }

    public final void setUnRead(MutableLiveData<Boolean> mutableLiveData) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.ShareDataUIState = mutableLiveData;
        int i4 = copydefault + 41;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public MutableLiveData<Boolean> notificationIsUnRead() {
        MutableLiveData<Boolean> mutableLiveData;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 25;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            mutableLiveData = this.ShareDataUIState;
            int i4 = 10 / 0;
        } else {
            mutableLiveData = this.ShareDataUIState;
        }
        int i5 = i2 + 121;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    @Override
    public void refreshNotificationUnread() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int unReadCount = NotificationRefreshUtil.getUnReadCount(NotificationRefreshUtil.SYSTEM_REFRESH_TIME);
        int unReadCount2 = NotificationRefreshUtil.getUnReadCount(NotificationRefreshUtil.TRANSFER_REFRESH_TIME);
        int unReadCount3 = NotificationRefreshUtil.getUnReadCount(NotificationRefreshUtil.PROMOTION_REFRESH_TIME);
        MutableLiveData<Boolean> mutableLiveData = this.ShareDataUIState;
        int i4 = unReadCount + unReadCount2 + unReadCount3;
        boolean z = false;
        if (i4 > 0) {
            int i5 = component1 + 25;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                z = true;
            }
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
        int i6 = component1 + 17;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override
    public void getNotificationUnRead() {
        int i = 2 % 2;
        PaymentRequest<NotificationNumResp> paymentRequest = new PaymentRequest<NotificationNumResp>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public Object convert(JsonObject jsonObject) {
                int i2 = 2 % 2;
                int i3 = component3 + 41;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                NotificationNumResp notificationNumRespConvert = convert(jsonObject);
                int i5 = copydefault + 27;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return notificationNumRespConvert;
            }

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 81;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 79;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    return "getAppNotificationUnreadNum";
                }
                throw null;
            }

            @Override
            public NotificationNumResp convert(JsonObject origin) {
                int i2 = 2 % 2;
                int i3 = component3 + 53;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(origin, "");
                Object objFromJson = GsonUtils.fromJson(origin.toString(), (Class<Object>) NotificationNumResp.class);
                Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                NotificationNumResp notificationNumResp = (NotificationNumResp) objFromJson;
                int i5 = copydefault + 93;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 0 / 0;
                }
                return notificationNumResp;
            }
        };
        paymentRequest.addParams("systemRefreshTime", NotificationRefreshUtil.getRefreshTime(NotificationRefreshUtil.SYSTEM_REFRESH_TIME));
        paymentRequest.addParams("promotionRefreshTime", NotificationRefreshUtil.getRefreshTime(NotificationRefreshUtil.PROMOTION_REFRESH_TIME));
        paymentRequest.addParams("transferRefreshTime", NotificationRefreshUtil.getRefreshTime(NotificationRefreshUtil.TRANSFER_REFRESH_TIME));
        paymentRequest.sendRequest(new ApiCallback<NotificationNumResp>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void onSuccess(NotificationNumResp notificationNumResp) {
                int i2 = 2 % 2;
                int i3 = component3 + 85;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(notificationNumResp);
                int i5 = component1 + 107;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            public void onSuccess2(NotificationNumResp resp) {
                boolean z;
                int i2 = 2 % 2;
                int i3 = component3 + 91;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(resp, "");
                    NotificationRefreshUtil.getNewUnReadCount(resp);
                    NotificationUnReadServiceIml.this.getUnRead();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(resp, "");
                int newUnReadCount = NotificationRefreshUtil.getNewUnReadCount(resp);
                MutableLiveData<Boolean> unRead = NotificationUnReadServiceIml.this.getUnRead();
                if (newUnReadCount > 0) {
                    z = true;
                } else {
                    int i4 = component1 + 13;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    z = false;
                }
                unRead.setValue(Boolean.valueOf(z));
                NotificationCountUtil.refreshNotificationCount(resp);
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = component1 + 7;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                int i4 = component1 + 15;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = copydefault + 5;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
    }

    static {
        int i = 1 + 31;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
