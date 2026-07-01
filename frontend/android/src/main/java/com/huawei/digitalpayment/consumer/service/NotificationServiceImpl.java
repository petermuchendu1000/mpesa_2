package com.huawei.digitalpayment.consumer.service;

import androidx.lifecycle.MutableLiveData;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.baselib.http.PaymentRequest;
import com.huawei.digitalpayment.consumer.bean.NotificationNumResp;
import com.huawei.digitalpayment.consumer.request.NotificationItem;
import com.huawei.digitalpayment.consumer.request.ReportNotificationParams;
import com.huawei.digitalpayment.consumer.service.iml.DefaultNotificationService;
import com.huawei.http.BaseResp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/NotificationServiceImpl;", "Lcom/huawei/digitalpayment/consumer/service/iml/DefaultNotificationService;", "<init>", "()V", "reportMsgReadStatus", "", "queryUnreadNum", "CustomerPushMessageModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationServiceImpl extends DefaultNotificationService {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    public static final Set access$getReadStateCache(NotificationServiceImpl notificationServiceImpl) {
        int i = 2 % 2;
        int i2 = component2 + 71;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return notificationServiceImpl.getReadStateCache();
        }
        notificationServiceImpl.getReadStateCache();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableLiveData access$getUnreadState(NotificationServiceImpl notificationServiceImpl) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<UnreadState> unreadState = notificationServiceImpl.getUnreadState();
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        int i5 = component2 + 123;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return unreadState;
        }
        throw null;
    }

    public static final void access$saveUnreadNum(NotificationServiceImpl notificationServiceImpl) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        notificationServiceImpl.saveUnreadNum();
        int i4 = ShareDataUIState + 77;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void reportMsgReadStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            if (getReadStateCache().isEmpty()) {
                return;
            }
            Set<String> readStateCache = getReadStateCache();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(readStateCache, 10));
            Iterator<T> it = readStateCache.iterator();
            while (it.hasNext()) {
                arrayList.add(new NotificationItem((String) it.next(), "1"));
                int i3 = component2 + 107;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 % 5;
                }
            }
            final ArrayList arrayList2 = arrayList;
            String string = SPUtils.getInstance().getString("recent_login_phone_number");
            Intrinsics.checkNotNullExpressionValue(string, "");
            ReportNotificationParams reportNotificationParams = new ReportNotificationParams(string, arrayList2);
            PaymentRequest<BaseResp> paymentRequest = new PaymentRequest<BaseResp>() {
                private static int component1 = 0;
                private static int copydefault = 1;

                @Override
                public String getApiPath() {
                    int i5 = 2 % 2;
                    int i6 = copydefault + 11;
                    int i7 = i6 % 128;
                    component1 = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 103;
                    copydefault = i9 % 128;
                    int i10 = i9 % 2;
                    return "reportAppNotificationReadStatus";
                }
            };
            paymentRequest.addParams(reportNotificationParams);
            paymentRequest.sendRequest(new ApiCallback<BaseResp>() {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;

                @Override
                public void onSuccess(BaseResp baseResp) {
                    int i5 = 2 % 2;
                    int i6 = ShareDataUIState + 105;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                    onSuccess2(baseResp);
                    if (i7 == 0) {
                        throw null;
                    }
                }

                public void onSuccess2(BaseResp value) {
                    int i5 = 2 % 2;
                    List<NotificationItem> list = arrayList2;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it2 = list.iterator();
                    int i6 = ShareDataUIState + 109;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                    while (it2.hasNext()) {
                        int i8 = ShareDataUIState + 47;
                        copydefault = i8 % 128;
                        if (i8 % 2 == 0) {
                            arrayList3.add(((NotificationItem) it2.next()).getMsgId());
                            throw null;
                        }
                        arrayList3.add(((NotificationItem) it2.next()).getMsgId());
                        int i9 = ShareDataUIState + 35;
                        copydefault = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    NotificationServiceImpl.access$getReadStateCache(this).removeAll(CollectionsKt.toSet(arrayList3));
                    this.queryUnreadNum();
                }
            });
            return;
        }
        getReadStateCache().isEmpty();
        throw null;
    }

    @Override
    public void queryUnreadNum() {
        int i = 2 % 2;
        new PaymentRequest<NotificationNumResp>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 3;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 45;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return "getAppNotificationUnreadNum";
            }
        }.sendRequest(new ApiCallback<NotificationNumResp>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(NotificationNumResp notificationNumResp) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 113;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(notificationNumResp);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(NotificationNumResp value) {
                int i2 = 2 % 2;
                if (value != null) {
                    NotificationServiceImpl notificationServiceImpl = NotificationServiceImpl.this;
                    int systemNotificationCount = value.getSystemNotificationCount();
                    int transferNotificationCount = value.getTransferNotificationCount();
                    NotificationServiceImpl.access$getUnreadState(notificationServiceImpl).setValue(new UnreadState(systemNotificationCount + transferNotificationCount + value.getPromotionNotificationCount(), value.getSystemNotificationCount(), value.getTransferNotificationCount(), value.getPromotionNotificationCount()));
                    NotificationServiceImpl.access$saveUnreadNum(notificationServiceImpl);
                    int i3 = ShareDataUIState + 57;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                }
                int i5 = component1 + 41;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
