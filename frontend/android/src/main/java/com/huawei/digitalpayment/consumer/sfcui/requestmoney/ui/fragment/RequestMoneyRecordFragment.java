package com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.griver.api.ui.splash.SplashEntryInfo;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.huawei.common.util.ToastUtils;
import com.huawei.digitalpayment.consumer.base.ui.widget.CustomerLoadMoreView;
import com.huawei.digitalpayment.consumer.loginModule.register.model.LocalIdType;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.FragmentRequestMoneyRecordBinding;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.OrderInfoRequest;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.OrderInfosResp;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyOrderInfo;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.adapter.MyRequestCategoryAdapter;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.adapter.RequestMoneyRecordAdapter;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import com.mpesa.qrcode.constants.AdditionalParameterID;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001SB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u00108\u001a\u0004\u0018\u0001092\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u001a\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u0002092\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0006\u0010C\u001a\u00020AJ\u0006\u0010D\u001a\u00020AJ\u0006\u0010E\u001a\u00020AJ\u000e\u0010F\u001a\u00020A2\u0006\u0010G\u001a\u00020\u0019J\u0006\u0010H\u001a\u00020AJ\u0006\u0010I\u001a\u00020AJ\u0006\u0010J\u001a\u00020AJ\u0006\u0010K\u001a\u00020AJ\u000e\u0010L\u001a\u00020A2\u0006\u0010M\u001a\u00020NJ\u0014\u0010O\u001a\u00020A2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020R0QR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u001a\u0010)\u001a\u00020*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001c\u00104\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u0001060605X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/ui/fragment/RequestMoneyRecordFragment;", "Lcom/huawei/common/fragment/BaseFragment;", "<init>", "()V", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/FragmentRequestMoneyRecordBinding;", "getBinding", "()Lcom/huawei/digitalpayment/consumer/sfc/databinding/FragmentRequestMoneyRecordBinding;", "setBinding", "(Lcom/huawei/digitalpayment/consumer/sfc/databinding/FragmentRequestMoneyRecordBinding;)V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/viewmodel/RequestMoneyOrderViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/viewmodel/RequestMoneyOrderViewModel;", "setViewModel", "(Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/viewmodel/RequestMoneyOrderViewModel;)V", "recordAdapter", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/ui/adapter/RequestMoneyRecordAdapter;", "getRecordAdapter", "()Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/ui/adapter/RequestMoneyRecordAdapter;", "categoryAdapter", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/ui/adapter/MyRequestCategoryAdapter;", "getCategoryAdapter", "()Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/ui/adapter/MyRequestCategoryAdapter;", "queryOrderStatus", "", "getQueryOrderStatus", "()Ljava/lang/String;", "setQueryOrderStatus", "(Ljava/lang/String;)V", "requestType", "getRequestType", "setRequestType", "isLoadingMore", "", "()Z", "setLoadingMore", "(Z)V", "canLoadMore", "getCanLoadMore", "setCanLoadMore", "startNum", "", "getStartNum", "()I", "setStartNum", "(I)V", "requestMoneyOrderInfos", "", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/RequestMoneyOrderInfo;", "getRequestMoneyOrderInfos", "()Ljava/util/List;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "initData", "initView", "refreshOrder", "doSearch", "key", "initRecordView", "initCategoryView", "requestOrder", "initObserver", "refreshUi", "orderInfos", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/data/OrderInfosResp;", "refreshTable", "tables", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/model/LocalIdType;", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class RequestMoneyRecordFragment extends Hilt_RequestMoneyRecordFragment {
    private static int ArtificialStackFrames = 1;
    public static final String MY_REQUEST_RECEIVED = "requestReceived";
    public static final String MY_REQUEST_SENT = "requestSent";
    public static final int PAGE_SIZE = 20;
    public static final String REQUEST_TYPE_RECEIVER = "receiver";
    public static final String REQUEST_TYPE_SENDER = "sender";
    public static final String STATUS_PENDING = "initial";
    private static int component4 = 0;
    private static int getShareableDataState = 0;
    private static int getSponsorBeneficiariesState = 1;
    private boolean ShareDataUIState;
    public FragmentRequestMoneyRecordBinding binding;
    private final ActivityResultLauncher<Intent> component3;
    public RequestMoneyOrderViewModel viewModel;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final RequestMoneyRecordAdapter getRequestBeneficiariesState = new RequestMoneyRecordAdapter();
    private final MyRequestCategoryAdapter copydefault = new MyRequestCategoryAdapter();
    private String component2 = "";
    private String copy = MY_REQUEST_SENT;
    private boolean component1 = true;
    private int getAsAtTimestamp = 1;
    private final List<RequestMoneyOrderInfo> equals = new ArrayList();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Observer, FunctionAdapter {
        private static int component1 = 0;
        private static int component2 = 1;
        private final Function1 copydefault;

        component1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            boolean zAreEqual = false;
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                int i2 = component2 + 103;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 72 / 0;
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                } else {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i4 = component2 + 11;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return zAreEqual;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component1 + 105;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.copydefault;
            if (i3 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 77;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component1 + 31;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 63;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault.invoke(obj);
            if (i3 == 0) {
                throw null;
            }
        }
    }

    public RequestMoneyRecordFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public final void onActivityResult(Object obj) {
                int i = 2 % 2;
                int i2 = component1 + 119;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                RequestMoneyRecordFragment.$r8$lambda$PYDFVyZErLpOZeqbVWgweIhmihw(this.f$0, (ActivityResult) obj);
                int i4 = ShareDataUIState + 111;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.component3 = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 123;
        com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.component4 = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.digitalpayment.consumer.sfc.databinding.FragmentRequestMoneyRecordBinding getBinding() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.getSponsorBeneficiariesState
            int r2 = r1 + 27
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.component4 = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L18
            com.huawei.digitalpayment.consumer.sfc.databinding.FragmentRequestMoneyRecordBinding r2 = r5.binding
            r4 = 42
            int r4 = r4 / 0
            if (r2 == 0) goto L2a
            goto L1c
        L18:
            com.huawei.digitalpayment.consumer.sfc.databinding.FragmentRequestMoneyRecordBinding r2 = r5.binding
            if (r2 == 0) goto L2a
        L1c:
            int r1 = r1 + 123
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.component4 = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L26
            return r2
        L26:
            r3.hashCode()
            throw r3
        L2a:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.getBinding():com.huawei.digitalpayment.consumer.sfc.databinding.FragmentRequestMoneyRecordBinding");
    }

    public final void setBinding(FragmentRequestMoneyRecordBinding fragmentRequestMoneyRecordBinding) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 67;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fragmentRequestMoneyRecordBinding, "");
        this.binding = fragmentRequestMoneyRecordBinding;
        int i4 = component4 + 21;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
    }

    public final RequestMoneyOrderViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 3;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        RequestMoneyOrderViewModel requestMoneyOrderViewModel = this.viewModel;
        if (requestMoneyOrderViewModel != null) {
            return requestMoneyOrderViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = component4 + 9;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void setViewModel(RequestMoneyOrderViewModel requestMoneyOrderViewModel) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 85;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(requestMoneyOrderViewModel, "");
            this.viewModel = requestMoneyOrderViewModel;
        } else {
            Intrinsics.checkNotNullParameter(requestMoneyOrderViewModel, "");
            this.viewModel = requestMoneyOrderViewModel;
            int i3 = 58 / 0;
        }
    }

    public final RequestMoneyRecordAdapter getRecordAdapter() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 63;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        RequestMoneyRecordAdapter requestMoneyRecordAdapter = this.getRequestBeneficiariesState;
        int i5 = i2 + 81;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return requestMoneyRecordAdapter;
    }

    public final MyRequestCategoryAdapter getCategoryAdapter() {
        int i = 2 % 2;
        int i2 = component4 + 125;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String getQueryOrderStatus() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 85;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 101;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setQueryOrderStatus(String str) {
        int i = 2 % 2;
        int i2 = component4 + 57;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.component2 = str;
        int i4 = getSponsorBeneficiariesState + 7;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String getRequestType() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 43;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 59;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setRequestType(String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 45;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        this.copy = str;
        int i5 = i2 + 23;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isLoadingMore() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 119;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final void setLoadingMore(boolean z) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 119;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        this.ShareDataUIState = z;
        int i5 = i2 + 107;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean getCanLoadMore() {
        int i = 2 % 2;
        int i2 = component4 + 27;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.component1;
        int i5 = i3 + 79;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return z;
    }

    public final void setCanLoadMore(boolean z) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 67;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.component1 = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 65;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final int getStartNum() {
        int i;
        int i2 = 2 % 2;
        int i3 = component4 + 21;
        int i4 = i3 % 128;
        getSponsorBeneficiariesState = i4;
        if (i3 % 2 == 0) {
            i = this.getAsAtTimestamp;
            int i5 = 41 / 0;
        } else {
            i = this.getAsAtTimestamp;
        }
        int i6 = i4 + 3;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final void setStartNum(int i) {
        int i2 = 2 % 2;
        int i3 = getSponsorBeneficiariesState + 41;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        this.getAsAtTimestamp = i;
        if (i4 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<RequestMoneyOrderInfo> getRequestMoneyOrderInfos() {
        int i = 2 % 2;
        int i2 = component4 + 31;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        List<RequestMoneyOrderInfo> list = this.equals;
        int i5 = i3 + 35;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    private static final void component3(RequestMoneyRecordFragment requestMoneyRecordFragment, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component4 + 95;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneyRecordFragment, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            if (activityResult.getData() == null) {
                return;
            }
            if (!(!r4.getBooleanExtra(SplashEntryInfo.NEED_REFRESH, false))) {
                requestMoneyRecordFragment.refreshOrder();
            }
        }
        int i4 = getSponsorBeneficiariesState + 69;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 67;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(inflater, "");
        setBinding((FragmentRequestMoneyRecordBinding) DataBindingUtil.inflate(inflater, R.layout.fragment_request_money_record, container, false));
        View root = getBinding().getRoot();
        int i4 = component4 + 39;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        setViewModel((RequestMoneyOrderViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(RequestMoneyOrderViewModel.class));
        initData();
        initView();
        initObserver();
        int i2 = getSponsorBeneficiariesState + 79;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void initData() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 67;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        if (getArguments() != null) {
            int i4 = component4 + 75;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            Bundle arguments = getArguments();
            this.copy = arguments != null ? arguments.getString("requestType", MY_REQUEST_SENT) : null;
        }
    }

    private static final void copydefault(final RequestMoneyRecordFragment requestMoneyRecordFragment, RefreshLayout refreshLayout) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneyRecordFragment, "");
        Intrinsics.checkNotNullParameter(refreshLayout, "");
        requestMoneyRecordFragment.refreshOrder();
        ThreadUtils.runOnUiThreadDelayed(new Runnable() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void run() {
                int i2 = 2 % 2;
                int i3 = component2 + 15;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    RequestMoneyRecordFragment.m11869$r8$lambda$vmC0HEcak2NKjAGmNnb8mgUeg4(this.f$0);
                    obj.hashCode();
                    throw null;
                }
                RequestMoneyRecordFragment.m11869$r8$lambda$vmC0HEcak2NKjAGmNnb8mgUeg4(this.f$0);
                int i4 = component2 + 83;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            }
        }, 1000L);
        int i2 = component4 + 21;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void component1(RequestMoneyRecordFragment requestMoneyRecordFragment) {
        int i = 2 % 2;
        int i2 = component4 + 51;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(requestMoneyRecordFragment, "");
            requestMoneyRecordFragment.getBinding().refreshLayout.finishRefresh();
            throw null;
        }
        Intrinsics.checkNotNullParameter(requestMoneyRecordFragment, "");
        requestMoneyRecordFragment.getBinding().refreshLayout.finishRefresh();
        int i3 = component4 + 119;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void initView() {
        int i = 2 % 2;
        int i2 = component4 + 25;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        if (TextUtils.equals(this.copy, MY_REQUEST_RECEIVED)) {
            getBinding().tvEmptyDes.setText(getString(R.string.my_request_received_empty_des));
            int i4 = component4 + 41;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
        initRecordView();
        initCategoryView();
        getBinding().refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final void onRefresh(RefreshLayout refreshLayout) {
                int i6 = 2 % 2;
                int i7 = copydefault + 35;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                RequestMoneyRecordFragment.$r8$lambda$ARKLdyeWHyosOtNB6d1_llIh6L4(this.f$0, refreshLayout);
                int i9 = component2 + 93;
                copydefault = i9 % 128;
                if (i9 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        getBinding().etSearch.getEditText().addTextChangedListener(new TextWatcher() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void afterTextChanged(Editable s) {
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 49;
                component1 = i7 % 128;
                if (i7 % 2 != 0) {
                    this.component2.doSearch(StringsKt.trim(String.valueOf(s)).toString());
                    int i8 = 53 / 0;
                } else {
                    this.component2.doSearch(StringsKt.trim(String.valueOf(s)).toString());
                }
                int i9 = component1 + 35;
                ShareDataUIState = i9 % 128;
                int i10 = i9 % 2;
            }

            @Override
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 57;
                component1 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                int i6 = 2 % 2;
                int i7 = component1 + 67;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        requestOrder();
        if (TextUtils.equals(this.copy, MY_REQUEST_SENT)) {
            getViewModel().queryStatusDataDict();
            int i6 = component4 + 103;
            getSponsorBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final void refreshOrder() {
        int i = 2 % 2;
        int i2 = component4 + 93;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            this.getAsAtTimestamp = 1;
            this.component1 = false;
        } else {
            this.getAsAtTimestamp = 1;
            this.component1 = true;
        }
        this.equals.clear();
        requestOrder();
        int i3 = getSponsorBeneficiariesState + 41;
        component4 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void doSearch(String key) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(key, "");
        if (CollectionUtils.isEmpty(this.equals)) {
            return;
        }
        String str = key;
        if (!(!TextUtils.isEmpty(str))) {
            int i2 = getSponsorBeneficiariesState + 65;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            this.getRequestBeneficiariesState.setList(this.equals);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (RequestMoneyOrderInfo requestMoneyOrderInfo : this.equals) {
            String payerIdentifier = requestMoneyOrderInfo.getPayerIdentifier();
            if (TextUtils.equals(this.copy, MY_REQUEST_RECEIVED)) {
                payerIdentifier = requestMoneyOrderInfo.getPayeeIdentifier();
            }
            if (payerIdentifier != null && StringsKt.contains$default((CharSequence) payerIdentifier, (CharSequence) str, false, 2, (Object) null)) {
                int i4 = getSponsorBeneficiariesState + 5;
                component4 = i4 % 128;
                if (i4 % 2 != 0) {
                    arrayList.add(requestMoneyOrderInfo);
                    int i5 = 84 / 0;
                } else {
                    arrayList.add(requestMoneyOrderInfo);
                }
            }
        }
        this.getRequestBeneficiariesState.setList(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        if (android.text.TextUtils.equals(r4.getStatus(), "initial") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        if (android.text.TextUtils.equals(r4.getStatus(), "initial") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        com.huawei.arouter.RouteUtils.routeWithExecute(r3.requireActivity(), com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant.REQUEST_MONEY_SEND_CONFIRM, r6, r3.component3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0091, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void component3(com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment r3, com.chad.library.adapter.base.BaseQuickAdapter r4, android.view.View r5, int r6) {
        /*
            r5 = 2
            int r0 = r5 % r5
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.List r4 = r4.getData()
            java.lang.Object r4 = r4.get(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyOrderInfo r4 = (com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.RequestMoneyOrderInfo) r4
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>(r5)
            java.lang.String r0 = "requestMoneyOrderInfo"
            r1 = r4
            java.io.Serializable r1 = (java.io.Serializable) r1
            r6.putSerializable(r0, r1)
            java.lang.String r0 = r3.copy
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "requestReceived"
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L40
            int r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.getSponsorBeneficiariesState
            int r0 = r0 + 81
            int r2 = r0 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.component4 = r2
            int r0 = r0 % r5
            java.lang.String r0 = "receiver"
            goto L42
        L40:
            java.lang.String r0 = "sender"
        L42:
            java.lang.String r2 = "requestType"
            r6.putString(r2, r0)
            java.lang.String r0 = r3.copy
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L56
            goto L92
        L56:
            int r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.getSponsorBeneficiariesState
            int r0 = r0 + 57
            int r1 = r0 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.component4 = r1
            int r0 = r0 % r5
            java.lang.String r5 = "initial"
            if (r0 == 0) goto L76
            java.lang.String r4 = r4.getStatus()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            r5 = 93
            int r5 = r5 / 0
            if (r4 == 0) goto L92
            goto L84
        L76:
            java.lang.String r4 = r4.getStatus()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L92
        L84:
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.String r5 = "/sfcModule/requestMoneySendConfirm"
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r3 = r3.component3
            com.huawei.arouter.RouteUtils.routeWithExecute(r4, r5, r6, r3)
            return
        L92:
            androidx.fragment.app.FragmentActivity r4 = r3.requireActivity()
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.String r5 = "/sfcModule/requestMoneyResult"
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r3 = r3.component3
            com.huawei.arouter.RouteUtils.routeWithExecute(r4, r5, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.component3(com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment, com.chad.library.adapter.base.BaseQuickAdapter, android.view.View, int):void");
    }

    public final void initRecordView() {
        int i = 2 % 2;
        getBinding().rvRecord.setAdapter(this.getRequestBeneficiariesState);
        this.getRequestBeneficiariesState.setAdapterType(this.copy);
        this.getRequestBeneficiariesState.setOnItemClickListener(new OnItemClickListener() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                int i3 = 2 % 2;
                int i4 = copydefault + 23;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                RequestMoneyRecordFragment.$r8$lambda$PwMRubVaS6B44tS1MoIsi4kSD7U(this.f$0, baseQuickAdapter, view, i2);
                if (i5 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.getRequestBeneficiariesState.getLoadMoreModule().setLoadMoreView(new CustomerLoadMoreView());
        this.getRequestBeneficiariesState.getLoadMoreModule().setEnableLoadMoreIfNotFullPage(false);
        this.getRequestBeneficiariesState.getLoadMoreModule().setOnLoadMoreListener(new OnLoadMoreListener() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final void onLoadMore() {
                int i2 = 2 % 2;
                int i3 = copydefault + 119;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    RequestMoneyRecordFragment.$r8$lambda$n5rQM3bCkSK9HDk2R8k9dQINs7Y(this.f$0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                RequestMoneyRecordFragment.$r8$lambda$n5rQM3bCkSK9HDk2R8k9dQINs7Y(this.f$0);
                int i4 = copydefault + 59;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        int i2 = component4 + 109;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final void component3(RequestMoneyRecordFragment requestMoneyRecordFragment) {
        int i = 2 % 2;
        int i2 = component4 + 55;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(requestMoneyRecordFragment, "");
            boolean z = requestMoneyRecordFragment.component1;
            throw null;
        }
        Intrinsics.checkNotNullParameter(requestMoneyRecordFragment, "");
        if (requestMoneyRecordFragment.component1) {
            requestMoneyRecordFragment.ShareDataUIState = true;
            requestMoneyRecordFragment.requestOrder();
        } else {
            requestMoneyRecordFragment.getRequestBeneficiariesState.getLoadMoreModule().loadMoreComplete();
            int i3 = getSponsorBeneficiariesState + 11;
            component4 = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = getSponsorBeneficiariesState + 33;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void initCategoryView() {
        int i = 2 % 2;
        getBinding().rvCategory.setAdapter(this.copydefault);
        this.copydefault.setItemClickListener(new Function1() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                Unit unit$r8$lambda$o5prJpij34QBDMfPB8BaSXXbCY0;
                int i2 = 2 % 2;
                int i3 = copydefault + 67;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    unit$r8$lambda$o5prJpij34QBDMfPB8BaSXXbCY0 = RequestMoneyRecordFragment.$r8$lambda$o5prJpij34QBDMfPB8BaSXXbCY0(this.f$0, (LocalIdType) obj);
                    int i4 = 20 / 0;
                } else {
                    unit$r8$lambda$o5prJpij34QBDMfPB8BaSXXbCY0 = RequestMoneyRecordFragment.$r8$lambda$o5prJpij34QBDMfPB8BaSXXbCY0(this.f$0, (LocalIdType) obj);
                }
                int i5 = component3 + 81;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit$r8$lambda$o5prJpij34QBDMfPB8BaSXXbCY0;
                }
                throw null;
            }
        });
        int i2 = getSponsorBeneficiariesState + 95;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    private static final Unit copydefault(RequestMoneyRecordFragment requestMoneyRecordFragment, LocalIdType localIdType) {
        ?? r4;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 47;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(requestMoneyRecordFragment, "");
            Intrinsics.checkNotNullParameter(localIdType, "");
            requestMoneyRecordFragment.component2 = localIdType.getId();
            r4 = 0;
        } else {
            Intrinsics.checkNotNullParameter(requestMoneyRecordFragment, "");
            Intrinsics.checkNotNullParameter(localIdType, "");
            requestMoneyRecordFragment.component2 = localIdType.getId();
            r4 = 1;
        }
        requestMoneyRecordFragment.getAsAtTimestamp = r4;
        requestMoneyRecordFragment.equals.clear();
        requestMoneyRecordFragment.component1 = r4;
        requestMoneyRecordFragment.requestOrder();
        Unit unit = Unit.INSTANCE;
        int i3 = component4 + 71;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void requestOrder() {
        int i = 2 % 2;
        OrderInfoRequest orderInfoRequest = new OrderInfoRequest(null, null, null, null, null, 31, null);
        orderInfoRequest.setRequestType(REQUEST_TYPE_SENDER);
        if (TextUtils.equals(this.copy, MY_REQUEST_RECEIVED)) {
            orderInfoRequest.setRequestType(REQUEST_TYPE_RECEIVER);
            int i2 = getSponsorBeneficiariesState + 89;
            component4 = i2 % 128;
            int i3 = i2 % 2;
        }
        orderInfoRequest.setOrderStatus(this.component2);
        orderInfoRequest.setPageLimit(AdditionalParameterID.OLD_LANGUAGE_PREFERENCE);
        orderInfoRequest.setStartPage(String.valueOf(this.getAsAtTimestamp));
        getViewModel().queryOrder(orderInfoRequest);
        int i4 = getSponsorBeneficiariesState + 49;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit ShareDataUIState(com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment r5, com.huawei.payment.mvvm.Resource r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.getSponsorBeneficiariesState
            int r1 = r1 + 21
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.component4 = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L24
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            r1 = r5
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            com.huawei.payment.mvvm.Utils.showOrHideLoading(r1, r6)
            boolean r1 = r6.error()
            r4 = 77
            int r4 = r4 / r2
            if (r1 == 0) goto L3c
            goto L33
        L24:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            r1 = r5
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            com.huawei.payment.mvvm.Utils.showOrHideLoading(r1, r6)
            boolean r1 = r6.error()
            if (r1 == 0) goto L3c
        L33:
            java.lang.String r1 = r6.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.huawei.common.util.ToastUtils.showLong(r1, r2)
        L3c:
            boolean r1 = r6.success()
            if (r1 == 0) goto L71
            int r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.getSponsorBeneficiariesState
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.component4 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L63
            java.lang.Object r6 = r6.getData()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.OrderInfosResp r6 = (com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.OrderInfosResp) r6
            r5.refreshUi(r6)
            int r5 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.getSponsorBeneficiariesState
            int r5 = r5 + 1
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.component4 = r6
            int r5 = r5 % r0
            goto L71
        L63:
            java.lang.Object r6 = r6.getData()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.OrderInfosResp r6 = (com.huawei.digitalpayment.consumer.sfcui.requestmoney.data.OrderInfosResp) r6
            r5.refreshUi(r6)
            r5 = 0
            throw r5
        L71:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment.ShareDataUIState(com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment, com.huawei.payment.mvvm.Resource):kotlin.Unit");
    }

    private static final Unit component1(RequestMoneyRecordFragment requestMoneyRecordFragment, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneyRecordFragment, "");
        Utils.showOrHideLoading(requestMoneyRecordFragment, resource);
        if (resource.error()) {
            ToastUtils.showLong(resource.getMessage(), new Object[0]);
        }
        if (resource.success()) {
            int i2 = component4 + 21;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Object data = resource.getData();
            Intrinsics.checkNotNullExpressionValue(data, "");
            requestMoneyRecordFragment.refreshUi((OrderInfosResp) data);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = component4 + 75;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void initObserver() {
        int i = 2 % 2;
        int i2 = component4 + 3;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            if (TextUtils.equals(this.copy, MY_REQUEST_SENT)) {
                getViewModel().senderOrderInfos().observe(requireActivity(), new component1(new Function1() {
                    private static int component3 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = copydefault + 93;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                        Unit unitM11868$r8$lambda$3tzxcu2gQ2fHukAMWGD3FJC1AI = RequestMoneyRecordFragment.m11868$r8$lambda$3tzxcu2gQ2fHukAMWGD3FJC1AI(this.f$0, (Resource) obj);
                        int i6 = component3 + 3;
                        copydefault = i6 % 128;
                        if (i6 % 2 != 0) {
                            int i7 = 34 / 0;
                        }
                        return unitM11868$r8$lambda$3tzxcu2gQ2fHukAMWGD3FJC1AI;
                    }
                }));
                int i3 = getSponsorBeneficiariesState + 15;
                component4 = i3 % 128;
                int i4 = i3 % 2;
            }
            if (TextUtils.equals(this.copy, MY_REQUEST_RECEIVED)) {
                getViewModel().receiverOrderInfos().observe(requireActivity(), new component1(new Function1() {
                    private static int component3 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = component3 + 73;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                        Unit unit$r8$lambda$XrhP6Kdlagazl4W4IDhtyRCATgw = RequestMoneyRecordFragment.$r8$lambda$XrhP6Kdlagazl4W4IDhtyRCATgw(this.f$0, (Resource) obj);
                        int i8 = component3 + 111;
                        copydefault = i8 % 128;
                        int i9 = i8 % 2;
                        return unit$r8$lambda$XrhP6Kdlagazl4W4IDhtyRCATgw;
                    }
                }));
            }
            getViewModel().queryDataDict().observe(requireActivity(), new component1(new Function1() {
                private static int ShareDataUIState = 1;
                private static int component1;

                @Override
                public final Object invoke(Object obj) {
                    int i5 = 2 % 2;
                    int i6 = component1 + 89;
                    ShareDataUIState = i6 % 128;
                    if (i6 % 2 == 0) {
                        RequestMoneyRecordFragment.$r8$lambda$4_BlLEXKtOT9Cccpb2fH2DMEaAw(this.f$0, (Resource) obj);
                        throw null;
                    }
                    Unit unit$r8$lambda$4_BlLEXKtOT9Cccpb2fH2DMEaAw = RequestMoneyRecordFragment.$r8$lambda$4_BlLEXKtOT9Cccpb2fH2DMEaAw(this.f$0, (Resource) obj);
                    int i7 = ShareDataUIState + 81;
                    component1 = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 25 / 0;
                    }
                    return unit$r8$lambda$4_BlLEXKtOT9Cccpb2fH2DMEaAw;
                }
            }));
            return;
        }
        TextUtils.equals(this.copy, MY_REQUEST_SENT);
        throw null;
    }

    private static final Unit component3(RequestMoneyRecordFragment requestMoneyRecordFragment, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestMoneyRecordFragment, "");
        if (!(!resource.success())) {
            int i2 = getSponsorBeneficiariesState + 13;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Object data = resource.getData();
            Intrinsics.checkNotNullExpressionValue(data, "");
            requestMoneyRecordFragment.refreshTable((List) data);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = getSponsorBeneficiariesState + 33;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void refreshUi(OrderInfosResp orderInfos) {
        int i = 2 % 2;
        int i2 = component4 + 103;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(orderInfos, "");
        boolean z = false;
        if (CollectionUtils.isEmpty(orderInfos.getRequestMoneyOrderInfos())) {
            if (!this.ShareDataUIState) {
                getBinding().rvRecord.setVisibility(8);
                getBinding().rlEmpty.setVisibility(0);
                return;
            }
            int i4 = getSponsorBeneficiariesState;
            int i5 = i4 + 13;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            this.ShareDataUIState = false;
            this.component1 = false;
            int i7 = i4 + 109;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            return;
        }
        if (this.ShareDataUIState) {
            this.ShareDataUIState = false;
        }
        getBinding().rvRecord.setVisibility(0);
        getBinding().rlEmpty.setVisibility(8);
        List<RequestMoneyOrderInfo> requestMoneyOrderInfos = orderInfos.getRequestMoneyOrderInfos();
        if (requestMoneyOrderInfos != null) {
            if (requestMoneyOrderInfos.size() >= 20) {
                int i9 = component4 + 55;
                getSponsorBeneficiariesState = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            }
            this.component1 = z;
            if (z) {
                int i11 = component4 + 19;
                getSponsorBeneficiariesState = i11 % 128;
                int i12 = i11 % 2;
                this.getAsAtTimestamp++;
            }
        }
        List<RequestMoneyOrderInfo> list = this.equals;
        List<RequestMoneyOrderInfo> requestMoneyOrderInfos2 = orderInfos.getRequestMoneyOrderInfos();
        Intrinsics.checkNotNull(requestMoneyOrderInfos2);
        list.addAll(requestMoneyOrderInfos2);
        this.getRequestBeneficiariesState.setList(this.equals);
        doSearch(getBinding().etSearch.getText());
    }

    public final void refreshTable(List<LocalIdType> tables) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tables, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LocalIdType("", getString(R.string.sfc_all)));
        arrayList.addAll(tables);
        this.copydefault.setNewInstance(arrayList);
        int i2 = getSponsorBeneficiariesState + 45;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/ui/fragment/RequestMoneyRecordFragment$Companion;", "", "<init>", "()V", "MY_REQUEST_SENT", "", "MY_REQUEST_RECEIVED", "REQUEST_TYPE_SENDER", "REQUEST_TYPE_RECEIVER", "STATUS_PENDING", "PAGE_SIZE", "", "newInstance", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/ui/fragment/RequestMoneyRecordFragment;", "requestType", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        private Companion() {
        }

        @JvmStatic
        public final RequestMoneyRecordFragment newInstance(String requestType) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(requestType, "");
            Bundle bundle = new Bundle(1);
            bundle.putString("requestType", requestType);
            RequestMoneyRecordFragment requestMoneyRecordFragment = new RequestMoneyRecordFragment();
            requestMoneyRecordFragment.setArguments(bundle);
            int i2 = copydefault + 109;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 21 / 0;
            }
            return requestMoneyRecordFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static Unit m11868$r8$lambda$3tzxcu2gQ2fHukAMWGD3FJC1AI(RequestMoneyRecordFragment requestMoneyRecordFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 43;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            ShareDataUIState(requestMoneyRecordFragment, resource);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitShareDataUIState = ShareDataUIState(requestMoneyRecordFragment, resource);
        int i3 = getSponsorBeneficiariesState + 61;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return unitShareDataUIState;
    }

    public static Unit $r8$lambda$4_BlLEXKtOT9Cccpb2fH2DMEaAw(RequestMoneyRecordFragment requestMoneyRecordFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 93;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent3 = component3(requestMoneyRecordFragment, resource);
        int i4 = getSponsorBeneficiariesState + 57;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return unitComponent3;
    }

    public static void $r8$lambda$ARKLdyeWHyosOtNB6d1_llIh6L4(RequestMoneyRecordFragment requestMoneyRecordFragment, RefreshLayout refreshLayout) {
        int i = 2 % 2;
        int i2 = component4 + 97;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        copydefault(requestMoneyRecordFragment, refreshLayout);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$PYDFVyZErLpOZeqbVWgweIhmihw(RequestMoneyRecordFragment requestMoneyRecordFragment, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = component4 + 13;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        component3(requestMoneyRecordFragment, activityResult);
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
    }

    public static void $r8$lambda$PwMRubVaS6B44tS1MoIsi4kSD7U(RequestMoneyRecordFragment requestMoneyRecordFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        int i3 = getSponsorBeneficiariesState + 119;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        component3(requestMoneyRecordFragment, baseQuickAdapter, view, i);
        int i5 = getSponsorBeneficiariesState + 47;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Unit $r8$lambda$XrhP6Kdlagazl4W4IDhtyRCATgw(RequestMoneyRecordFragment requestMoneyRecordFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 107;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent1 = component1(requestMoneyRecordFragment, resource);
        int i4 = getSponsorBeneficiariesState + 87;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return unitComponent1;
    }

    public static void $r8$lambda$n5rQM3bCkSK9HDk2R8k9dQINs7Y(RequestMoneyRecordFragment requestMoneyRecordFragment) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 99;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        component3(requestMoneyRecordFragment);
        int i4 = getSponsorBeneficiariesState + 69;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static Unit $r8$lambda$o5prJpij34QBDMfPB8BaSXXbCY0(RequestMoneyRecordFragment requestMoneyRecordFragment, LocalIdType localIdType) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 107;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(requestMoneyRecordFragment, localIdType);
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return unitCopydefault;
    }

    public static void m11869$r8$lambda$vmC0HEcak2NKjAGmNnb8mgUeg4(RequestMoneyRecordFragment requestMoneyRecordFragment) {
        int i = 2 % 2;
        int i2 = component4 + 45;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        component1(requestMoneyRecordFragment);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component4 + 71;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = ArtificialStackFrames + 11;
        getShareableDataState = i % 128;
        int i2 = i % 2;
    }

    @JvmStatic
    public static final RequestMoneyRecordFragment newInstance(String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 121;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        RequestMoneyRecordFragment requestMoneyRecordFragmentNewInstance = INSTANCE.newInstance(str);
        int i4 = component4 + 23;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return requestMoneyRecordFragmentNewInstance;
    }
}
