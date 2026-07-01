package com.huawei.digitalpayment.history.ui.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.fragment.BaseFragment;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.service.IPullRefresh;
import com.huawei.digitalpayment.consumer.history.R;
import com.huawei.digitalpayment.consumer.history.databinding.FragmentHistoryBinding;
import com.huawei.digitalpayment.consumer.sfcui.statement.activity.MpesaStatementsDetailsActivity;
import com.huawei.digitalpayment.history.model.entity.TransactionHistoryListBean;
import com.huawei.digitalpayment.history.model.response.TransactionRecordResponse;
import com.huawei.digitalpayment.history.ui.adapter.RecentHistoryAdapter;
import com.huawei.digitalpayment.history.ui.data.HomeHistoryPage;
import com.huawei.digitalpayment.history.ui.view.TransactionHistoryView;
import com.huawei.digitalpayment.history.viewmodel.TransactionHistoryViewModel;
import com.huawei.image.util.GlideUtils;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.logging.L;
import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends BaseFragment implements IPullRefresh {
    private static final int component2 = 3;
    private static final String component3 = "components";
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;
    private RecentHistoryAdapter ShareDataUIState;
    private ApiCallback<Boolean> component1;
    private TransactionHistoryViewModel copy;
    private FragmentHistoryBinding copydefault;
    private HomeHistoryPage getAsAtTimestamp;

    public static Object component2(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = (~(i7 | i9)) | i8;
        int i11 = ~(i9 | i8 | i7);
        int i12 = i6 + i2 + i3 + ((-112346298) * i5) + (505796074 * i);
        int i13 = i12 * i12;
        int i14 = ((1543607772 * i6) - 1525940224) + (1734765094 * i2) + (i7 * 95578661) + ((-95578661) * i10) + (95578661 * i11) + (1639186432 * i3) + (859308032 * i5) + (310902784 * i) + (417529856 * i13);
        int i15 = (i6 * (-1233303660)) + 1670658458 + (i2 * (-1233302158)) + (i7 * 751) + (i10 * (-751)) + (i11 * 751) + (i3 * (-1233302909)) + (i5 * 1075253458) + (i * 745806526) + (i13 * 1512636416);
        return i14 + ((i15 * i15) * (-1737162752)) != 1 ? component1(objArr) : component3(objArr);
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        FragmentHistoryBinding fragmentHistoryBinding = (FragmentHistoryBinding) DataBindingUtil.inflate(getLayoutInflater(layoutInflater), R.layout.fragment_history, viewGroup, false);
        this.copydefault = fragmentHistoryBinding;
        View root = fragmentHistoryBinding.getRoot();
        int i4 = component4 + 63;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        super.onViewCreated(view, bundle);
        this.copy = (TransactionHistoryViewModel) new ViewModelProvider(requireActivity()).get(TransactionHistoryViewModel.class);
        copydefault();
        component3();
        component1();
        component2();
        int i2 = component4 + 73;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void copydefault() {
        int i = 2 % 2;
        if (getArguments() != null) {
            int i2 = getRequestBeneficiariesState + 39;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            String string = getArguments().getString(component3, "");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                this.getAsAtTimestamp = (HomeHistoryPage) GsonUtils.fromJson(string, HomeHistoryPage.class);
                int i4 = component4 + 109;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    L.INSTANCE.e(e.getMessage(), new Object[0]);
                    int i6 = getRequestBeneficiariesState + 39;
                    component4 = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 2 / 2;
                    }
                }
            }
        }
    }

    public static HistoryFragment newInstance(String str) {
        int i = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putString(component3, str);
        HistoryFragment historyFragment = new HistoryFragment();
        historyFragment.setArguments(bundle);
        int i2 = component4 + 31;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        return historyFragment;
    }

    @Override
    public void onResume() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            super.onResume();
            ShareDataUIState();
            int i3 = 80 / 0;
        } else {
            super.onResume();
            ShareDataUIState();
        }
        int i4 = getRequestBeneficiariesState + 21;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
    }

    private void component3() {
        int i = 2 % 2;
        this.copydefault.llNodata.setBackgroundColor(ColorUtils.INSTANCE.withAlpha(0.05f, com.blankj.utilcode.util.ColorUtils.getColor(R.color.colorPrimary)));
        this.ShareDataUIState = new RecentHistoryAdapter(this.getAsAtTimestamp);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity());
        linearLayoutManager.setOrientation(0);
        this.copydefault.rvRecord.setLayoutManager(linearLayoutManager);
        this.copydefault.rvRecord.setAdapter(this.ShareDataUIState);
        int iComponent1 = MpesaStatementsDetailsActivity.ShareDataUIState.component1();
        int iComponent12 = MpesaStatementsDetailsActivity.ShareDataUIState.component1();
        int iComponent13 = MpesaStatementsDetailsActivity.ShareDataUIState.component1();
        component2(MpesaStatementsDetailsActivity.ShareDataUIState.component1(), 177754491, new Object[]{this}, iComponent12, iComponent1, iComponent13, -177754491);
        int i2 = component4 + 3;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static Object component1(Object[] objArr) {
        HistoryFragment historyFragment = (HistoryFragment) objArr[0];
        int i = 2 % 2;
        HomeHistoryPage homeHistoryPage = historyFragment.getAsAtTimestamp;
        if (homeHistoryPage == null) {
            return null;
        }
        if (homeHistoryPage.getBackgroundUrl() != null) {
            GlideUtils.loadUrl(historyFragment.getAsAtTimestamp.getBackgroundUrl(), historyFragment.copydefault.imageBg);
        }
        if (historyFragment.getAsAtTimestamp.getBackgroundColor() != null) {
            historyFragment.copydefault.clRoot.setBackgroundColor(historyFragment.getAsAtTimestamp.getBackgroundColor().intValue());
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) historyFragment.copydefault.clRoot.getLayoutParams();
        marginLayoutParams.bottomMargin = SizeUtils.dp2px(historyFragment.getAsAtTimestamp.getMarginBottom());
        marginLayoutParams.topMargin = SizeUtils.dp2px(historyFragment.getAsAtTimestamp.getMarginTop());
        marginLayoutParams.leftMargin = SizeUtils.dp2px(historyFragment.getAsAtTimestamp.getMarginStart());
        marginLayoutParams.rightMargin = SizeUtils.dp2px(historyFragment.getAsAtTimestamp.getMarginEnd());
        historyFragment.copydefault.clRoot.setLayoutParams(marginLayoutParams);
        historyFragment.copydefault.tvTitle.setText(historyFragment.getAsAtTimestamp.getTitle());
        historyFragment.copydefault.tvViewall.setText(historyFragment.getAsAtTimestamp.getSubTitle());
        if (historyFragment.getAsAtTimestamp.getSubTitleColor() != null) {
            int i2 = getRequestBeneficiariesState + 99;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            historyFragment.copydefault.tvViewall.setTextColor(historyFragment.getAsAtTimestamp.getSubTitleColor().intValue());
        }
        int i4 = component4 + 21;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private void component1() {
        int i = 2 % 2;
        this.copydefault.tvViewall.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0006, B:6:0x0017, B:10:0x0031, B:12:0x0044, B:11:0x003f), top: B:17:0x0006 }] */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onClick(android.view.View r3) {
                /*
                    r2 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    com.dynatrace.android.callback.Callback.onClick_enter(r3)
                    com.huawei.digitalpayment.history.ui.fragment.HistoryFragment r3 = com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.this     // Catch: java.lang.Throwable -> L48
                    com.huawei.digitalpayment.history.ui.data.HomeHistoryPage r3 = com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.component3(r3)     // Catch: java.lang.Throwable -> L48
                    if (r3 == 0) goto L3f
                    int r3 = com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.AnonymousClass5.ShareDataUIState
                    int r3 = r3 + 43
                    int r1 = r3 % 128
                    com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.AnonymousClass5.component3 = r1
                    int r3 = r3 % r0
                    com.huawei.digitalpayment.history.ui.fragment.HistoryFragment r3 = com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.this     // Catch: java.lang.Throwable -> L48
                    com.huawei.digitalpayment.history.ui.data.HomeHistoryPage r3 = com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.component3(r3)     // Catch: java.lang.Throwable -> L48
                    java.lang.String r3 = r3.getSubTitleExecute()     // Catch: java.lang.Throwable -> L48
                    boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L48
                    if (r3 == 0) goto L28
                    goto L3f
                L28:
                    int r3 = com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.AnonymousClass5.component3
                    int r3 = r3 + 109
                    int r1 = r3 % 128
                    com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.AnonymousClass5.ShareDataUIState = r1
                    int r3 = r3 % r0
                    com.huawei.digitalpayment.history.ui.fragment.HistoryFragment r3 = com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.this     // Catch: java.lang.Throwable -> L48
                    com.huawei.digitalpayment.history.ui.data.HomeHistoryPage r3 = com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.component3(r3)     // Catch: java.lang.Throwable -> L48
                    java.lang.String r3 = r3.getSubTitleExecute()     // Catch: java.lang.Throwable -> L48
                    com.huawei.arouter.RouteUtils.routeWithExecute(r3)     // Catch: java.lang.Throwable -> L48
                    goto L44
                L3f:
                    java.lang.String r3 = "/historyModule/history"
                    com.huawei.arouter.RouteUtils.routeWithExecute(r3)     // Catch: java.lang.Throwable -> L48
                L44:
                    com.dynatrace.android.callback.Callback.onClick_exit()     // Catch: java.lang.Throwable -> L48
                    return
                L48:
                    r3 = move-exception
                    com.dynatrace.android.callback.Callback.onClick_exit()
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.AnonymousClass5.onClick(android.view.View):void");
            }
        });
        this.ShareDataUIState.setOnItemClickListener(new OnItemClickListener(this) {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onItemClick(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, int i2) {
                int i3 = 2 % 2;
                TransactionHistoryView transactionHistoryView = (TransactionHistoryView) baseQuickAdapter.getData().get(i2);
                Bundle bundle = new Bundle(1);
                bundle.putString("orderId", transactionHistoryView.getOrderId());
                RouteUtils.routeWithExecute(RoutePathConstants.HISTORY_CUSTOMER_DETAILS, bundle);
                int i4 = component1 + 63;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component4 + 47;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ShareDataUIState() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            com.huawei.digitalpayment.history.model.request.TransactionHistoryListRequest r1 = new com.huawei.digitalpayment.history.model.request.TransactionHistoryListRequest
            r1.<init>()
            r2 = 0
            r1.setStartNum(r2)
            java.lang.String r3 = java.lang.String.valueOf(r2)
            r1.setIsHomePage(r3)
            com.huawei.digitalpayment.history.ui.data.HomeHistoryPage r3 = r6.getAsAtTimestamp
            if (r3 == 0) goto L39
            int r4 = com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.component4
            int r4 = r4 + 49
            int r5 = r4 % 128
            com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.getRequestBeneficiariesState = r5
            int r4 = r4 % r0
            int r3 = r3.getMaxCount()
            if (r3 == 0) goto L39
            int r3 = com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.getRequestBeneficiariesState
            int r3 = r3 + 57
            int r4 = r3 % 128
            com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.component4 = r4
            int r3 = r3 % r0
            com.huawei.digitalpayment.history.ui.data.HomeHistoryPage r0 = r6.getAsAtTimestamp
            int r0 = r0.getMaxCount()
            r1.setCount(r0)
            goto L3d
        L39:
            r0 = 3
            r1.setCount(r0)
        L3d:
            com.huawei.digitalpayment.history.viewmodel.TransactionHistoryViewModel r0 = r6.copy
            r0.queryTransactionHistoryList(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.fragment.HistoryFragment.ShareDataUIState():void");
    }

    private void component2() {
        int i = 2 % 2;
        this.copy.getListLiveData().observe(getViewLifecycleOwner(), new Observer() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 71;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                HistoryFragment.$r8$lambda$yVd58NQuifXSxHbE3FTNZibJe0c(this.f$0, (Resource) obj);
                if (i4 == 0) {
                    throw null;
                }
            }
        });
        int i2 = component4 + 123;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void ShareDataUIState(Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            if (resource.success() || !(!resource.error())) {
                component2(MpesaStatementsDetailsActivity.ShareDataUIState.component1(), -1140804290, new Object[]{this, (TransactionRecordResponse) resource.getData()}, MpesaStatementsDetailsActivity.ShareDataUIState.component1(), MpesaStatementsDetailsActivity.ShareDataUIState.component1(), MpesaStatementsDetailsActivity.ShareDataUIState.component1(), 1140804291);
                ApiCallback<Boolean> apiCallback = this.component1;
                if (apiCallback != null) {
                    int i3 = component4 + 51;
                    getRequestBeneficiariesState = i3 % 128;
                    int i4 = i3 % 2;
                    apiCallback.onSuccess(true);
                    return;
                }
                return;
            }
            return;
        }
        resource.success();
        throw null;
    }

    private static Object component3(Object[] objArr) {
        HistoryFragment historyFragment = (HistoryFragment) objArr[0];
        TransactionRecordResponse transactionRecordResponse = (TransactionRecordResponse) objArr[1];
        int i = 2 % 2;
        if (transactionRecordResponse == null || CollectionUtils.isEmpty(transactionRecordResponse.getTransactionHistoryList())) {
            if (historyFragment.ShareDataUIState.getItemCount() == 0) {
                int i2 = component4 + 85;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                historyFragment.copydefault.llNodata.setVisibility(0);
                historyFragment.copydefault.tvViewall.setVisibility(8);
                int i4 = component4 + 115;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 2;
                }
            }
            return null;
        }
        historyFragment.copydefault.llNodata.setVisibility(8);
        historyFragment.copydefault.tvViewall.setVisibility(0);
        historyFragment.ShareDataUIState.setNewInstance(historyFragment.ShareDataUIState(transactionRecordResponse.getTransactionHistoryList()));
        return null;
    }

    private List<TransactionHistoryView> ShareDataUIState(List<TransactionHistoryListBean> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(list)) {
            for (TransactionHistoryListBean transactionHistoryListBean : list) {
                TransactionHistoryView transactionHistoryView = new TransactionHistoryView();
                transactionHistoryView.setAmountDisplay(transactionHistoryListBean.getAmountDisplay());
                transactionHistoryView.setOrderId(transactionHistoryListBean.getId());
                transactionHistoryView.setCurrency(transactionHistoryListBean.getCurrency().getDisplayName());
                transactionHistoryView.setTransTime(transactionHistoryListBean.getTransTime());
                transactionHistoryView.setTransTypeDisplay(transactionHistoryListBean.getTransTypeDisplay());
                transactionHistoryView.setLogo(UrlUtils.getURL(AppConfigManager.getAppConfig().getH5BaseUrl(), transactionHistoryListBean.getLogo()));
                transactionHistoryView.setReceiverIsConsumer(transactionHistoryListBean.isReceiverIsConsumer());
                transactionHistoryView.setTransType(transactionHistoryListBean.getTransType());
                arrayList.add(transactionHistoryView);
                int i2 = component4 + 99;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
            }
            return arrayList;
        }
        int i4 = getRequestBeneficiariesState;
        int i5 = i4 + 17;
        component4 = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 113;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    @Override
    public boolean refresh(ApiCallback<Boolean> apiCallback) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 81;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        this.component1 = apiCallback;
        ShareDataUIState();
        int i4 = component4 + 77;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return true;
    }

    public static void $r8$lambda$yVd58NQuifXSxHbE3FTNZibJe0c(HistoryFragment historyFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 57;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        historyFragment.ShareDataUIState(resource);
        int i4 = getRequestBeneficiariesState + 77;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static HomeHistoryPage component3(HistoryFragment historyFragment) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 61;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        HomeHistoryPage homeHistoryPage = historyFragment.getAsAtTimestamp;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 51;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return homeHistoryPage;
    }

    private void copydefault(TransactionRecordResponse transactionRecordResponse) {
        int iComponent1 = MpesaStatementsDetailsActivity.ShareDataUIState.component1();
        int iComponent12 = MpesaStatementsDetailsActivity.ShareDataUIState.component1();
        int iComponent13 = MpesaStatementsDetailsActivity.ShareDataUIState.component1();
        component2(MpesaStatementsDetailsActivity.ShareDataUIState.component1(), -1140804290, new Object[]{this, transactionRecordResponse}, iComponent12, iComponent1, iComponent13, 1140804291);
    }

    private void component4() {
        int iComponent1 = MpesaStatementsDetailsActivity.ShareDataUIState.component1();
        int iComponent12 = MpesaStatementsDetailsActivity.ShareDataUIState.component1();
        int iComponent13 = MpesaStatementsDetailsActivity.ShareDataUIState.component1();
        component2(MpesaStatementsDetailsActivity.ShareDataUIState.component1(), 177754491, new Object[]{this}, iComponent12, iComponent1, iComponent13, -177754491);
    }
}
