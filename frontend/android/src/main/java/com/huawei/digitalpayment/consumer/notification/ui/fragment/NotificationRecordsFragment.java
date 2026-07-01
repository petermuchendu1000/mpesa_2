package com.huawei.digitalpayment.consumer.notification.ui.fragment;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildLongClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.util.ToastUtils;
import com.huawei.digitalpayment.consumer.base.ui.widget.CustomerLoadMoreView;
import com.huawei.digitalpayment.consumer.bean.AppNotificationBean;
import com.huawei.digitalpayment.consumer.bean.NotificationMessageBean;
import com.huawei.digitalpayment.consumer.notification.ui.activity.NotificationActivity;
import com.huawei.digitalpayment.consumer.notification.ui.adapter.AppNotificationAdapter;
import com.huawei.digitalpayment.consumer.notification.ui.adapter.SystemNotificationAdapter;
import com.huawei.digitalpayment.consumer.notification.ui.adapter.TransNotificationAdapter;
import com.huawei.digitalpayment.consumer.notification.ui.dialog.NotificationMsgDeleteConfirmDialog;
import com.huawei.digitalpayment.consumer.push_ui.R;
import com.huawei.digitalpayment.consumer.push_ui.databinding.FragmentNotificationRecordsBinding;
import com.huawei.digitalpayment.consumer.request.UpdateNotificationsRequest;
import com.huawei.digitalpayment.consumer.viewmodel.NotificationRecordViewModel;
import com.huawei.hms.hatool.w0;
import com.huawei.payment.mvvm.Resource;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import java.util.List;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class NotificationRecordsFragment extends Hilt_NotificationRecordsFragment implements OnRefreshListener {
    private static int component4 = 0;
    private static int equals = 1;
    private NotificationMessageBean component2;
    private FragmentNotificationRecordsBinding copydefault;
    private BaseQuickAdapter getAsAtTimestamp;
    private NotificationRecordViewModel getRequestBeneficiariesState;
    String ShareDataUIState = "0";
    private int component1 = 10;
    private boolean component3 = true;

    public static NotificationRecordsFragment newInstance(String str) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString("pushType", str);
        NotificationRecordsFragment notificationRecordsFragment = new NotificationRecordsFragment();
        notificationRecordsFragment.setArguments(bundle);
        int i2 = component4 + 25;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return notificationRecordsFragment;
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        this.getRequestBeneficiariesState = (NotificationRecordViewModel) new ViewModelProvider(this).get(NotificationRecordViewModel.class);
        FragmentNotificationRecordsBinding fragmentNotificationRecordsBinding = (FragmentNotificationRecordsBinding) DataBindingUtil.inflate(getLayoutInflater(layoutInflater), R.layout.fragment_notification_records, viewGroup, false);
        this.copydefault = fragmentNotificationRecordsBinding;
        View root = fragmentNotificationRecordsBinding.getRoot();
        int i2 = equals + 41;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return root;
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        int i2 = component4 + 97;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            super.onViewCreated(view, bundle);
            Bundle arguments = getArguments();
            if (arguments != null) {
                int i3 = equals + 23;
                component4 = i3 % 128;
                if (i3 % 2 != 0) {
                    this.ShareDataUIState = arguments.getString("pushType");
                    int i4 = 88 / 0;
                } else {
                    this.ShareDataUIState = arguments.getString("pushType");
                }
            }
            component2();
            component1();
            return;
        }
        super.onViewCreated(view, bundle);
        getArguments();
        throw null;
    }

    private void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = component4 + 79;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            this.copydefault.srlRefresh.autoRefresh();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.copydefault.srlRefresh.autoRefresh();
        int i3 = equals + 113;
        component4 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public void onResume() {
        int i = 2 % 2;
        int i2 = equals + 3;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            super.onResume();
            if (this.component3) {
                this.copydefault.srlRefresh.post(new NotificationRecordsFragment$$ExternalSyntheticLambda3(this));
                int i3 = component4 + 33;
                equals = i3 % 128;
                int i4 = i3 % 2;
            }
            EventBus.getDefault().register(this);
            return;
        }
        super.onResume();
        throw null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveEvent(NotificationActivity.TabSelectedEvent tabSelectedEvent) {
        int i = 2 % 2;
        int i2 = component4 + 3;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.getRequestBeneficiariesState.refreshNotificationStatus(this.ShareDataUIState)) {
                int i3 = equals + 7;
                component4 = i3 % 128;
                int i4 = i3 % 2;
                this.getAsAtTimestamp.notifyDataSetChanged();
                return;
            }
            return;
        }
        this.getRequestBeneficiariesState.refreshNotificationStatus(this.ShareDataUIState);
        throw null;
    }

    @Override
    public void onPause() {
        int i = 2 % 2;
        int i2 = component4 + 71;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            super.onPause();
            EventBus.getDefault().unregister(this);
            int i3 = component4 + 85;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onPause();
        EventBus.getDefault().unregister(this);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void copydefault(Resource resource) {
        int i = 2 % 2;
        if (resource.error()) {
            int i2 = component4 + 49;
            equals = i2 % 128;
            int i3 = i2 % 2;
            ToastUtils.showLong(resource.getMessage());
            this.copydefault.srlRefresh.finishRefresh();
            return;
        }
        if (resource.getData() != null) {
            if (!this.ShareDataUIState.equals(((AppNotificationBean) resource.getData()).getPushType())) {
                int i4 = equals + 73;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            List<NotificationMessageBean> records = ((AppNotificationBean) resource.getData()).getRecords();
            Object obj = null;
            if (this.getRequestBeneficiariesState.isRefresh()) {
                this.copydefault.srlRefresh.finishRefresh();
                this.getRequestBeneficiariesState.setNotifyList(null, this.ShareDataUIState);
                if (records == null || records.isEmpty()) {
                    this.copydefault.llEmpty.setVisibility(0);
                } else {
                    this.copydefault.llEmpty.setVisibility(8);
                }
            }
            this.getRequestBeneficiariesState.setNotifyList(records, this.ShareDataUIState);
            this.getAsAtTimestamp.notifyDataSetChanged();
            if (records == null || records.size() >= this.component1) {
                this.getAsAtTimestamp.getLoadMoreModule().loadMoreComplete();
                this.getAsAtTimestamp.getLoadMoreModule().setAutoLoadMore(true);
                return;
            }
            int i6 = component4 + 111;
            equals = i6 % 128;
            if (i6 % 2 != 0) {
                this.getAsAtTimestamp.getLoadMoreModule().loadMoreEnd();
            } else {
                this.getAsAtTimestamp.getLoadMoreModule().loadMoreEnd();
                obj.hashCode();
                throw null;
            }
        }
    }

    private void component1() {
        int i = 2 % 2;
        this.getRequestBeneficiariesState.getData().observe(getViewLifecycleOwner(), new Observer() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 63;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                NotificationRecordsFragment.$r8$lambda$nWqlqMePm_f_qH2zCxFUBzahLiA(this.f$0, (Resource) obj);
                int i5 = component1 + 35;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        this.getRequestBeneficiariesState.getUpdateStatusData().observe(getViewLifecycleOwner(), new Observer() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 45;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                NotificationRecordsFragment.m10795$r8$lambda$Z9IYU20mLXgZ_Asdyl4CPFhXFc(this.f$0, (Resource) obj);
                int i5 = copydefault + 77;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component4 + 105;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        if ((!r4.loading()) == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r4 = com.huawei.digitalpayment.consumer.notification.ui.fragment.NotificationRecordsFragment.equals + 47;
        com.huawei.digitalpayment.consumer.notification.ui.fragment.NotificationRecordsFragment.component4 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if ((r4 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(requireActivity());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(requireActivity());
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(requireActivity());
        r3.copydefault.srlRefresh.autoRefresh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r4.error() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r4.error() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        com.huawei.common.util.ToastUtils.showLong(r4.getMessage());
        com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(requireActivity());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ShareDataUIState(com.huawei.payment.mvvm.Resource r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.notification.ui.fragment.NotificationRecordsFragment.component4
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.notification.ui.fragment.NotificationRecordsFragment.equals = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            boolean r1 = r4.error()
            r2 = 75
            int r2 = r2 / 0
            if (r1 == 0) goto L2e
            goto L1f
        L19:
            boolean r1 = r4.error()
            if (r1 == 0) goto L2e
        L1f:
            java.lang.String r4 = r4.getMessage()
            com.huawei.common.util.ToastUtils.showLong(r4)
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(r4)
            return
        L2e:
            boolean r4 = r4.loading()
            r1 = 1
            r4 = r4 ^ r1
            if (r4 == r1) goto L55
            int r4 = com.huawei.digitalpayment.consumer.notification.ui.fragment.NotificationRecordsFragment.equals
            int r4 = r4 + 47
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.notification.ui.fragment.NotificationRecordsFragment.component4 = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L49
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r4)
            return
        L49:
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r4)
            r4 = 0
            r4.hashCode()
            throw r4
        L55:
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(r4)
            com.huawei.digitalpayment.consumer.push_ui.databinding.FragmentNotificationRecordsBinding r4 = r3.copydefault
            com.scwang.smart.refresh.layout.SmartRefreshLayout r4 = r4.srlRefresh
            r4.autoRefresh()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.notification.ui.fragment.NotificationRecordsFragment.ShareDataUIState(com.huawei.payment.mvvm.Resource):void");
    }

    private void copydefault() {
        int i = 2 % 2;
        int i2 = component4 + 19;
        equals = i2 % 128;
        int i3 = i2 % 2;
        NotificationRecordViewModel notificationRecordViewModel = this.getRequestBeneficiariesState;
        String str = this.ShareDataUIState;
        notificationRecordViewModel.getNotificationMsg(str, false, this.component1, str);
        int i4 = component4 + 35;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void component2() {
        int i = 2 % 2;
        int i2 = component4 + 69;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            this.copydefault.srlRefresh.setOnRefreshListener(this);
            this.ShareDataUIState.equals("1");
            throw null;
        }
        this.copydefault.srlRefresh.setOnRefreshListener(this);
        if (this.ShareDataUIState.equals("1")) {
            this.getAsAtTimestamp = new TransNotificationAdapter(getActivity(), this.getRequestBeneficiariesState.getNotifyList(this.ShareDataUIState));
            int i3 = equals + 95;
            component4 = i3 % 128;
            int i4 = i3 % 2;
        } else if (this.ShareDataUIState.equals("0")) {
            this.getAsAtTimestamp = new SystemNotificationAdapter(getActivity(), this.getRequestBeneficiariesState.getNotifyList(this.ShareDataUIState));
        } else {
            this.getAsAtTimestamp = new AppNotificationAdapter(getActivity(), this.getRequestBeneficiariesState.getNotifyList(this.ShareDataUIState));
            int i5 = equals + 89;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 4;
            }
        }
        CustomerLoadMoreView customerLoadMoreView = new CustomerLoadMoreView();
        customerLoadMoreView.setLoadingDrawable(AppCompatResources.getDrawable(requireContext(), R.mipmap.base_ic_refresh));
        this.getAsAtTimestamp.getLoadMoreModule().setLoadMoreView(customerLoadMoreView);
        this.getAsAtTimestamp.getLoadMoreModule().setEnableLoadMoreIfNotFullPage(false);
        this.getAsAtTimestamp.getLoadMoreModule().setOnLoadMoreListener(new OnLoadMoreListener() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onLoadMore() {
                int i7 = 2 % 2;
                int i8 = copydefault + 73;
                component3 = i8 % 128;
                int i9 = i8 % 2;
                NotificationRecordsFragment.$r8$lambda$j3zndXvRkeGZLH7_X0visxL61pU(this.f$0);
                int i10 = component3 + 103;
                copydefault = i10 % 128;
                int i11 = i10 % 2;
            }
        });
        this.getAsAtTimestamp.addChildLongClickViewIds(R.id.cl_content);
        this.getAsAtTimestamp.setOnItemChildLongClickListener(new OnItemChildLongClickListener() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public boolean onItemChildLongClick(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, int i7) {
                NotificationRecordsFragment notificationRecordsFragment;
                Object obj;
                int i8 = 2 % 2;
                int i9 = component2 + 125;
                ShareDataUIState = i9 % 128;
                if (i9 % 2 != 0) {
                    notificationRecordsFragment = NotificationRecordsFragment.this;
                    obj = baseQuickAdapter.getData().get(i7);
                } else {
                    notificationRecordsFragment = NotificationRecordsFragment.this;
                    obj = baseQuickAdapter.getData().get(i7);
                }
                NotificationRecordsFragment.ShareDataUIState(notificationRecordsFragment, (NotificationMessageBean) obj);
                NotificationRecordsFragment.ShareDataUIState(NotificationRecordsFragment.this, view);
                int i10 = component2 + 59;
                ShareDataUIState = i10 % 128;
                if (i10 % 2 == 0) {
                    return true;
                }
                throw null;
            }
        });
        this.copydefault.rvSystemInfo.setAdapter(this.getAsAtTimestamp);
    }

    @Override
    public void onRefresh(RefreshLayout refreshLayout) {
        int i = 2 % 2;
        int i2 = equals + 87;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.component3 = false;
        this.getAsAtTimestamp.getLoadMoreModule().setAutoLoadMore(false);
        NotificationRecordViewModel notificationRecordViewModel = this.getRequestBeneficiariesState;
        String str = this.ShareDataUIState;
        notificationRecordViewModel.getNotificationMsg(str, true, this.component1, str);
        int i4 = equals + 93;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveEvent(NotificationActivity.RefreshEvent refreshEvent) {
        int i = 2 % 2;
        int i2 = component4 + 77;
        equals = i2 % 128;
        int i3 = i2 % 2;
        SmartRefreshLayout smartRefreshLayout = this.copydefault.srlRefresh;
        if (i3 != 0) {
            smartRefreshLayout.autoRefresh();
            return;
        }
        smartRefreshLayout.autoRefresh();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void component3() {
        int i = 2 % 2;
        NotificationMsgDeleteConfirmDialog notificationMsgDeleteConfirmDialog = new NotificationMsgDeleteConfirmDialog();
        notificationMsgDeleteConfirmDialog.setOnClickListener(new FilterFastClickListener() {
            private static int ShareDataUIState = 0;
            public static int component3 = -1560005185;
            private static int copydefault = 1;

            @Override
            public void onFilterClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 71;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                if (NotificationRecordsFragment.component3(NotificationRecordsFragment.this) == null) {
                    int i5 = copydefault + 99;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    Object[] objArr = {NotificationRecordsFragment.this};
                    ((NotificationRecordViewModel) NotificationRecordsFragment.component3(w0.component1(), -1904242451, w0.component1(), w0.component1(), objArr, 1904242451, w0.component1())).updateAppNotificationStatus(new UpdateNotificationsRequest(NotificationRecordsFragment.component3(NotificationRecordsFragment.this).getCategory(), "2", NotificationRecordsFragment.component3(NotificationRecordsFragment.this).getMsgId(), NotificationRecordsFragment.component3(NotificationRecordsFragment.this).getTimestamp()));
                }
            }
        });
        notificationMsgDeleteConfirmDialog.setCancelable(false);
        notificationMsgDeleteConfirmDialog.show(getChildFragmentManager(), "NotificationMsgDeleteConfirmDialog");
        int i2 = component4 + 117;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static Object component3(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~((~i2) | i5);
        int i8 = ~i4;
        int i9 = i7 | (~(i8 | i5));
        int i10 = ~i5;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i2);
        int i13 = (~(i8 | i2)) | i11 | i12;
        int i14 = (~(i4 | i10)) | i12;
        int i15 = i2 + i5 + i + (1039959776 * i3) + ((-2046201414) * i6);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i2) - 8388608) + ((-1785926397) * i5) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i) + ((-201326592) * i3) + ((-406847488) * i6) + (529399808 * i16);
        int i18 = ((i2 * 868240256) - 1765242424) + (i5 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i * 868239597) + (i3 * 817356128) + (i6 * 406493490) + (i16 * 645267456);
        if (i17 + (i18 * i18 * 681705472) != 1) {
            NotificationRecordsFragment notificationRecordsFragment = (NotificationRecordsFragment) objArr[0];
            int i19 = 2 % 2;
            int i20 = component4;
            int i21 = i20 + 67;
            equals = i21 % 128;
            int i22 = i21 % 2;
            NotificationRecordViewModel notificationRecordViewModel = notificationRecordsFragment.getRequestBeneficiariesState;
            int i23 = i20 + 103;
            equals = i23 % 128;
            int i24 = i23 % 2;
            return notificationRecordViewModel;
        }
        NotificationRecordsFragment notificationRecordsFragment2 = (NotificationRecordsFragment) objArr[0];
        View view = (View) objArr[1];
        int i25 = 2 % 2;
        View viewInflate = LayoutInflater.from(notificationRecordsFragment2.getContext()).inflate(R.layout.delete_pop_layout, (ViewGroup) null);
        final PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2);
        viewInflate.findViewById(R.id.deleteTv).setOnClickListener(new FilterFastClickListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onFilterClick(View view2) {
                int i26 = 2 % 2;
                if (popupWindow.isShowing()) {
                    int i27 = component1 + 31;
                    copydefault = i27 % 128;
                    int i28 = i27 % 2;
                    popupWindow.dismiss();
                    int i29 = copydefault + 109;
                    component1 = i29 % 128;
                    int i30 = i29 % 2;
                }
                NotificationRecordsFragment.ShareDataUIState(NotificationRecordsFragment.this);
            }
        });
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        viewInflate.measure(0, 0);
        int measuredHeight = viewInflate.getMeasuredHeight();
        int measuredWidth = viewInflate.getMeasuredWidth();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        popupWindow.showAtLocation(view, 0, (iArr[0] + (view.getWidth() / 2)) - (measuredWidth / 2), iArr[1] - measuredHeight);
        int i26 = equals + 79;
        component4 = i26 % 128;
        int i27 = i26 % 2;
        return null;
    }

    public static void m10795$r8$lambda$Z9IYU20mLXgZ_Asdyl4CPFhXFc(NotificationRecordsFragment notificationRecordsFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        notificationRecordsFragment.ShareDataUIState(resource);
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
    }

    public static void m10796$r8$lambda$gcUW8Q3XC3m4Py2BGX6EoEnplI(NotificationRecordsFragment notificationRecordsFragment) {
        int i = 2 % 2;
        int i2 = equals + 67;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        notificationRecordsFragment.ShareDataUIState();
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        int i5 = component4 + 49;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$j3zndXvRkeGZLH7_X0visxL61pU(NotificationRecordsFragment notificationRecordsFragment) {
        int i = 2 % 2;
        int i2 = equals + 33;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        notificationRecordsFragment.copydefault();
        if (i3 != 0) {
            throw null;
        }
        int i4 = equals + 61;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$nWqlqMePm_f_qH2zCxFUBzahLiA(NotificationRecordsFragment notificationRecordsFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = equals + 73;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        notificationRecordsFragment.copydefault(resource);
        if (i3 != 0) {
            throw null;
        }
    }

    static NotificationMessageBean component3(NotificationRecordsFragment notificationRecordsFragment) {
        int i = 2 % 2;
        int i2 = component4 + 5;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        NotificationMessageBean notificationMessageBean = notificationRecordsFragment.component2;
        int i5 = i3 + 47;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return notificationMessageBean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static NotificationRecordViewModel copydefault(NotificationRecordsFragment notificationRecordsFragment) {
        int iComponent1 = w0.component1();
        return (NotificationRecordViewModel) component3(w0.component1(), -1904242451, w0.component1(), iComponent1, new Object[]{notificationRecordsFragment}, 1904242451, w0.component1());
    }

    static void ShareDataUIState(NotificationRecordsFragment notificationRecordsFragment, NotificationMessageBean notificationMessageBean) {
        int i = 2 % 2;
        int i2 = component4 + 117;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        notificationRecordsFragment.component2 = notificationMessageBean;
        int i5 = i3 + 39;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    static void ShareDataUIState(NotificationRecordsFragment notificationRecordsFragment) {
        int i = 2 % 2;
        int i2 = component4 + 113;
        equals = i2 % 128;
        int i3 = i2 % 2;
        notificationRecordsFragment.component3();
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
    }

    static void ShareDataUIState(NotificationRecordsFragment notificationRecordsFragment, View view) {
        int i = 2 % 2;
        int i2 = equals + 37;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int iComponent1 = w0.component1();
            component3(w0.component1(), 1241469062, w0.component1(), iComponent1, new Object[]{notificationRecordsFragment, view}, -1241469061, w0.component1());
            int i3 = 25 / 0;
        } else {
            int iComponent12 = w0.component1();
            component3(w0.component1(), 1241469062, w0.component1(), iComponent12, new Object[]{notificationRecordsFragment, view}, -1241469061, w0.component1());
        }
        int i4 = equals + 11;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void copydefault(View view) {
        int iComponent1 = w0.component1();
        component3(w0.component1(), 1241469062, w0.component1(), iComponent1, new Object[]{this, view}, -1241469061, w0.component1());
    }
}
