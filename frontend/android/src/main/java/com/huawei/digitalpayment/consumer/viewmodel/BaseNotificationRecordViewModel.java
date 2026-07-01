package com.huawei.digitalpayment.consumer.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.bean.AppNotificationBean;
import com.huawei.digitalpayment.consumer.bean.AppNotificationResp;
import com.huawei.digitalpayment.consumer.bean.NotificationMessageBean;
import com.huawei.digitalpayment.consumer.model.NotificationRecordModel;
import com.huawei.digitalpayment.consumer.request.QueryNotificationsRequest;
import com.huawei.digitalpayment.consumer.request.UpdateNotificationsRequest;
import com.huawei.digitalpayment.consumer.service.INotificationService;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseNotificationRecordViewModel<Model extends NotificationRecordModel> extends ViewModel {
    private static int component2 = 0;
    private static int component3 = 1;
    protected Model model;
    protected List<NotificationMessageBean> systemList = new ArrayList();
    protected List<NotificationMessageBean> transactionList = new ArrayList();
    protected List<NotificationMessageBean> promotionList = new ArrayList();
    protected int mStartNum = 0;
    protected boolean refresh = true;
    protected MutableLiveData<Resource<AppNotificationBean>> data = new MutableLiveData<>();
    protected MutableLiveData<Resource<BaseResp>> updateStatusData = new MutableLiveData<>();

    public MutableLiveData<Resource<BaseResp>> getUpdateStatusData() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<BaseResp>> mutableLiveData = this.updateStatusData;
        int i5 = i3 + 53;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return mutableLiveData;
    }

    public MutableLiveData<Resource<AppNotificationBean>> getData() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<AppNotificationBean>> mutableLiveData = this.data;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public BaseNotificationRecordViewModel(Model model) {
        this.model = model;
    }

    public boolean refreshNotificationStatus(String str) {
        int i = 2 % 2;
        List<NotificationMessageBean> notifyList = getNotifyList(str);
        ArrayList arrayList = new ArrayList(notifyList.size());
        int i2 = component2 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        for (NotificationMessageBean notificationMessageBean : notifyList) {
            if (!notificationMessageBean.isRead()) {
                int i4 = component2 + 65;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    TextUtils.isEmpty(notificationMessageBean.getCardExecute());
                    throw null;
                }
                if (TextUtils.isEmpty(notificationMessageBean.getCardExecute())) {
                    notificationMessageBean.setRead();
                    arrayList.add(notificationMessageBean.getMsgId());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        int i5 = component3 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        ((INotificationService) RouteUtils.getService(INotificationService.class)).setMessagesRead(arrayList, str);
        return true;
    }

    public void getNotificationMsg(final QueryNotificationsRequest queryNotificationsRequest) {
        int i = 2 % 2;
        this.model.queryAppNotificationList(queryNotificationsRequest, new ApiCallback<AppNotificationResp>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public void onSuccess(AppNotificationResp appNotificationResp) {
                int i2 = 2 % 2;
                int i3 = component2 + 99;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                component2(appNotificationResp);
                if (i4 == 0) {
                    throw null;
                }
            }

            public void component2(AppNotificationResp appNotificationResp) {
                int i2 = 2 % 2;
                List<NotificationMessageBean> listShareDataUIState = BaseNotificationRecordViewModel.ShareDataUIState(BaseNotificationRecordViewModel.this, appNotificationResp);
                AppNotificationBean appNotificationBean = new AppNotificationBean();
                appNotificationBean.setRecords(listShareDataUIState);
                appNotificationBean.setPushType(queryNotificationsRequest.getCategory());
                BaseNotificationRecordViewModel.this.data.setValue(Resource.success(appNotificationBean));
                int i3 = component2 + 121;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 16 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                BaseNotificationRecordViewModel.this.data.setValue(Resource.error(baseException, new AppNotificationBean()));
                int i3 = component2 + 125;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 53 / 0;
                }
            }
        });
        int i2 = component2 + 117;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void updateAppNotificationStatus(UpdateNotificationsRequest updateNotificationsRequest) {
        int i = 2 % 2;
        if (updateNotificationsRequest == null) {
            int i2 = component2 + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            getUpdateStatusData().postValue(Resource.loading(null));
            this.model.updateAppNotificationStatus(updateNotificationsRequest, new ApiCallback<BaseResp>() {
                private static int component1 = 0;
                private static int copydefault = 1;

                @Override
                public void onSuccess(BaseResp baseResp) {
                    int i4 = 2 % 2;
                    int i5 = component1 + 57;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    component2(baseResp);
                    if (i6 == 0) {
                        throw null;
                    }
                    int i7 = copydefault + 105;
                    component1 = i7 % 128;
                    int i8 = i7 % 2;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void component2(com.huawei.http.BaseResp r4) {
                    /*
                        r3 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        int r1 = com.huawei.digitalpayment.consumer.viewmodel.BaseNotificationRecordViewModel.AnonymousClass1.component1
                        int r1 = r1 + 107
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.viewmodel.BaseNotificationRecordViewModel.AnonymousClass1.copydefault = r2
                        int r1 = r1 % r0
                        if (r1 != 0) goto L24
                        super.onSuccess(r4)
                        java.lang.Class<com.huawei.digitalpayment.consumer.service.INotificationService> r1 = com.huawei.digitalpayment.consumer.service.INotificationService.class
                        java.lang.Object r1 = com.huawei.arouter.RouteUtils.getService(r1)
                        com.huawei.digitalpayment.consumer.service.INotificationService r1 = (com.huawei.digitalpayment.consumer.service.INotificationService) r1
                        boolean r1 = r1.isReadStatusCacheEmpty()
                        r2 = 50
                        int r2 = r2 / 0
                        if (r1 == 0) goto L53
                        goto L35
                    L24:
                        super.onSuccess(r4)
                        java.lang.Class<com.huawei.digitalpayment.consumer.service.INotificationService> r1 = com.huawei.digitalpayment.consumer.service.INotificationService.class
                        java.lang.Object r1 = com.huawei.arouter.RouteUtils.getService(r1)
                        com.huawei.digitalpayment.consumer.service.INotificationService r1 = (com.huawei.digitalpayment.consumer.service.INotificationService) r1
                        boolean r1 = r1.isReadStatusCacheEmpty()
                        if (r1 == 0) goto L53
                    L35:
                        int r1 = com.huawei.digitalpayment.consumer.viewmodel.BaseNotificationRecordViewModel.AnonymousClass1.component1
                        int r1 = r1 + 45
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.viewmodel.BaseNotificationRecordViewModel.AnonymousClass1.copydefault = r2
                        int r1 = r1 % r0
                        java.lang.Class<com.huawei.digitalpayment.consumer.service.INotificationService> r1 = com.huawei.digitalpayment.consumer.service.INotificationService.class
                        java.lang.Object r1 = com.huawei.arouter.RouteUtils.getService(r1)
                        com.huawei.digitalpayment.consumer.service.INotificationService r1 = (com.huawei.digitalpayment.consumer.service.INotificationService) r1
                        r1.queryUnreadNum()
                        int r1 = com.huawei.digitalpayment.consumer.viewmodel.BaseNotificationRecordViewModel.AnonymousClass1.copydefault
                        int r1 = r1 + 45
                    L4d:
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.viewmodel.BaseNotificationRecordViewModel.AnonymousClass1.component1 = r2
                        int r1 = r1 % r0
                        goto L63
                    L53:
                        java.lang.Class<com.huawei.digitalpayment.consumer.service.INotificationService> r1 = com.huawei.digitalpayment.consumer.service.INotificationService.class
                        java.lang.Object r1 = com.huawei.arouter.RouteUtils.getService(r1)
                        com.huawei.digitalpayment.consumer.service.INotificationService r1 = (com.huawei.digitalpayment.consumer.service.INotificationService) r1
                        r1.reportMsgReadStatus()
                        int r1 = com.huawei.digitalpayment.consumer.viewmodel.BaseNotificationRecordViewModel.AnonymousClass1.copydefault
                        int r1 = r1 + 3
                        goto L4d
                    L63:
                        com.huawei.digitalpayment.consumer.viewmodel.BaseNotificationRecordViewModel r0 = com.huawei.digitalpayment.consumer.viewmodel.BaseNotificationRecordViewModel.this
                        androidx.lifecycle.MutableLiveData r0 = r0.getUpdateStatusData()
                        com.huawei.payment.mvvm.Resource r4 = com.huawei.payment.mvvm.Resource.success(r4)
                        r0.postValue(r4)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.viewmodel.BaseNotificationRecordViewModel.AnonymousClass1.component2(com.huawei.http.BaseResp):void");
                }

                @Override
                public void onError(BaseException baseException) {
                    int i4 = 2 % 2;
                    int i5 = component1 + 79;
                    copydefault = i5 % 128;
                    if (i5 % 2 == 0) {
                        super.onError(baseException);
                        BaseNotificationRecordViewModel.this.getUpdateStatusData().postValue(Resource.error(baseException, null));
                        int i6 = 46 / 0;
                    } else {
                        super.onError(baseException);
                        BaseNotificationRecordViewModel.this.getUpdateStatusData().postValue(Resource.error(baseException, null));
                    }
                }
            });
            int i4 = component2 + 67;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void getNotificationMsg(String str, boolean z, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 109;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        this.refresh = z;
        if (z) {
            int i6 = i3 + 15;
            component2 = i6 % 128;
            this.mStartNum = i6 % 2 != 0 ? 1 : 0;
        }
        getNotificationMsg(new QueryNotificationsRequest(str, this.mStartNum, i));
    }

    private List<NotificationMessageBean> component1(AppNotificationResp appNotificationResp) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (appNotificationResp != null) {
            int i2 = component2 + 17;
            component3 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                appNotificationResp.getRecords();
                obj.hashCode();
                throw null;
            }
            if (appNotificationResp.getRecords() != null) {
                int i3 = component2 + 9;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    appNotificationResp.getRecords().iterator();
                    throw null;
                }
                Iterator<AppNotificationResp.RecordsBean> it = appNotificationResp.getRecords().iterator();
                while (it.hasNext()) {
                    int i4 = component2 + 47;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0) {
                        AppNotificationResp.RecordsBean next = it.next();
                        NotificationMessageBean data = next.getData();
                        data.setReadStatus(next.getReadStatus());
                        arrayList.add(data);
                        data.isRead();
                        throw null;
                    }
                    AppNotificationResp.RecordsBean next2 = it.next();
                    NotificationMessageBean data2 = next2.getData();
                    data2.setReadStatus(next2.getReadStatus());
                    arrayList.add(data2);
                    if (!data2.isRead() && ((INotificationService) RouteUtils.getService(INotificationService.class)).isMessageRead(data2.getMsgId())) {
                        int i5 = component2 + 59;
                        component3 = i5 % 128;
                        int i6 = i5 % 2;
                        data2.setRead();
                    }
                    if (!data2.isRead() && TextUtils.isEmpty(data2.getCardExecute())) {
                        ((INotificationService) RouteUtils.getService(INotificationService.class)).markMessageRead(data2.getMsgId());
                    }
                }
                this.mStartNum += arrayList.size();
            }
        }
        return arrayList;
    }

    public List<NotificationMessageBean> getNotifyList(String str) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (!"1".equals(str)) {
            if ("2".equals(str)) {
                return this.promotionList;
            }
            List<NotificationMessageBean> list = this.systemList;
            int i4 = component3 + 67;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return list;
        }
        int i6 = component2 + 63;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            return this.transactionList;
        }
        int i7 = 38 / 0;
        return this.transactionList;
    }

    public void setNotifyList(List<NotificationMessageBean> list, String str) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (!"1".equals(str)) {
            if ("2".equals(str)) {
                int i4 = component2 + 87;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    changeList(this.promotionList, list);
                    throw null;
                }
                changeList(this.promotionList, list);
            } else {
                changeList(this.systemList, list);
            }
        } else {
            int i5 = component2 + 123;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                changeList(this.transactionList, list);
                obj.hashCode();
                throw null;
            }
            changeList(this.transactionList, list);
        }
        int i6 = component3 + 105;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    protected void changeList(List<NotificationMessageBean> list, List<NotificationMessageBean> list2) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (list2 != null) {
            list.addAll(list2);
            return;
        }
        list.clear();
        int i3 = component3 + 3;
        component2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public boolean isRefresh() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.refresh;
        int i5 = i3 + 107;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static List ShareDataUIState(BaseNotificationRecordViewModel baseNotificationRecordViewModel, AppNotificationResp appNotificationResp) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            baseNotificationRecordViewModel.component1(appNotificationResp);
            obj.hashCode();
            throw null;
        }
        List<NotificationMessageBean> listComponent1 = baseNotificationRecordViewModel.component1(appNotificationResp);
        int i3 = component3 + 109;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return listComponent1;
        }
        obj.hashCode();
        throw null;
    }
}
