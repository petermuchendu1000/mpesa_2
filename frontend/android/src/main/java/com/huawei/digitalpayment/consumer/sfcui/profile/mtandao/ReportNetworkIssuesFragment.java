package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dynatrace.android.callback.Callback;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.base.util.PhoneDataSender;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.FragmentMtandaoReportBinding;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoCore;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.SpinnerAdapter;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.viewmodels.SpeedTestViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0017J\b\u00101\u001a\u00020/H\u0003J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J\u0006\u00106\u001a\u00020/R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/ReportNetworkIssuesFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mtandaoCore", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoCore;", "getMtandaoCore", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoCore;", "setMtandaoCore", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoCore;)V", "phoneDataSender", "Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;", "getPhoneDataSender", "()Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;", "setPhoneDataSender", "(Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;)V", "connectionLiveData", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;", "getConnectionLiveData", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;", "setConnectionLiveData", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;)V", "speedTestViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/viewmodels/SpeedTestViewModel;", "getSpeedTestViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/viewmodels/SpeedTestViewModel;", "speedTestViewModel$delegate", "Lkotlin/Lazy;", "complaintType", "", "complaintComment", "workerThread", "Landroid/os/HandlerThread;", "workerHandler", "Landroid/os/Handler;", "uiHandler", "viewBinding", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/FragmentMtandaoReportBinding;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "startUserRecordings", "checkForUsageStatsPermission", "", "context", "Landroid/content/Context;", "checkLocationPermission", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class ReportNetworkIssuesFragment extends Hilt_ReportNetworkIssuesFragment {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 93 % 128;
    private static int component4 = 1;
    private static int getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private FragmentMtandaoReportBinding ShareDataUIState;
    private final Lazy component1;
    private final Handler component2;
    private String component3;

    @Inject
    public ConnectionLiveData connectionLiveData;
    private final Handler copy;
    private String copydefault;
    private final HandlerThread equals;

    @Inject
    public MtandaoCore mtandaoCore;

    @Inject
    public PhoneDataSender phoneDataSender;

    public static final String access$getComplaintComment$p(ReportNetworkIssuesFragment reportNetworkIssuesFragment) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 7;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = reportNetworkIssuesFragment.component3;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public static final String access$getComplaintType$p(ReportNetworkIssuesFragment reportNetworkIssuesFragment) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 95;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = reportNetworkIssuesFragment.copydefault;
        if (i4 != 0) {
            int i5 = 42 / 0;
        }
        int i6 = i2 + 57;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final SpeedTestViewModel access$getSpeedTestViewModel(ReportNetworkIssuesFragment reportNetworkIssuesFragment) {
        int i = 2 % 2;
        int i2 = component4 + 19;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return reportNetworkIssuesFragment.ShareDataUIState();
        }
        reportNetworkIssuesFragment.ShareDataUIState();
        throw null;
    }

    public static final Handler access$getUiHandler$p(ReportNetworkIssuesFragment reportNetworkIssuesFragment) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 111;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        Handler handler = reportNetworkIssuesFragment.component2;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 73;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return handler;
    }

    public static final FragmentMtandaoReportBinding access$getViewBinding$p(ReportNetworkIssuesFragment reportNetworkIssuesFragment) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding = reportNetworkIssuesFragment.ShareDataUIState;
        int i5 = i3 + 99;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return fragmentMtandaoReportBinding;
    }

    public static final Handler access$getWorkerHandler$p(ReportNetworkIssuesFragment reportNetworkIssuesFragment) {
        int i = 2 % 2;
        int i2 = component4 + 73;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Handler handler = reportNetworkIssuesFragment.copy;
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return handler;
    }

    public ReportNetworkIssuesFragment() {
        final ReportNetworkIssuesFragment reportNetworkIssuesFragment = this;
        final Function0<Fragment> function0 = new Function0<Fragment>() {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Fragment invoke() {
                int i = 2 % 2;
                int i2 = component3;
                int i3 = i2 + 31;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Fragment fragment = reportNetworkIssuesFragment;
                int i5 = i2 + 53;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 54 / 0;
                }
                return fragment;
            }

            @Override
            public Fragment invoke() {
                Fragment fragmentInvoke;
                int i = 2 % 2;
                int i2 = component3 + 51;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    fragmentInvoke = invoke();
                    int i3 = 31 / 0;
                } else {
                    fragmentInvoke = invoke();
                }
                int i4 = copydefault + 121;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return fragmentInvoke;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStoreOwner invoke() {
                int i = 2 % 2;
                int i2 = component2 + 117;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) function0.invoke();
                int i4 = component2 + 73;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreOwner;
            }

            @Override
            public ViewModelStoreOwner invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 63;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    throw null;
                }
                ViewModelStoreOwner viewModelStoreOwnerInvoke = invoke();
                int i3 = ShareDataUIState + 5;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return viewModelStoreOwnerInvoke;
                }
                throw null;
            }

            {
                super(0);
            }
        });
        final Function0 function02 = null;
        this.component1 = FragmentViewModelLazyKt.createViewModelLazy(reportNetworkIssuesFragment, Reflection.getOrCreateKotlinClass(SpeedTestViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 83;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = copydefault + 119;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewModelStoreInvoke;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 33;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m9192viewModels$lambda1(lazy).getViewModelStore();
                int i4 = component1 + 13;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 95;
                ShareDataUIState = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    invoke();
                    throw null;
                }
                CreationExtras creationExtrasInvoke = invoke();
                int i3 = ShareDataUIState + 67;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    return creationExtrasInvoke;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
                int i = 2 % 2;
                Function0 function03 = function02;
                if (function03 != null) {
                    int i2 = ShareDataUIState + 117;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    CreationExtras creationExtras = (CreationExtras) function03.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                ViewModelStoreOwner viewModelStoreOwnerM9192viewModels$lambda1 = FragmentViewModelLazyKt.m9192viewModels$lambda1(lazy);
                if (viewModelStoreOwnerM9192viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory) {
                    int i4 = copydefault + 93;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM9192viewModels$lambda1;
                } else {
                    hasDefaultViewModelProviderFactory = null;
                }
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 71;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component2 + 83;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return factoryInvoke;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                ViewModelStoreOwner viewModelStoreOwnerM9192viewModels$lambda1 = FragmentViewModelLazyKt.m9192viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = null;
                if (viewModelStoreOwnerM9192viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory) {
                    int i2 = component3 + 65;
                    component2 = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM9192viewModels$lambda1;
                } else {
                    int i3 = component2 + 115;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                }
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = reportNetworkIssuesFragment.getDefaultViewModelProviderFactory();
                int i5 = component2 + 19;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return defaultViewModelProviderFactory2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.copydefault = "";
        this.component3 = "";
        HandlerThread handlerThread = new HandlerThread("ReportAndDriveTestThread");
        handlerThread.start();
        this.equals = handlerThread;
        this.copy = new Handler(handlerThread.getLooper());
        this.component2 = new Handler(Looper.getMainLooper());
    }

    public final MtandaoCore getMtandaoCore() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 109;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        MtandaoCore mtandaoCore = this.mtandaoCore;
        if (mtandaoCore != null) {
            return mtandaoCore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = component4 + 17;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setMtandaoCore(MtandaoCore mtandaoCore) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(mtandaoCore, "");
            this.mtandaoCore = mtandaoCore;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(mtandaoCore, "");
        this.mtandaoCore = mtandaoCore;
        int i3 = getAsAtTimestamp + 117;
        component4 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final PhoneDataSender getPhoneDataSender() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 55;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        PhoneDataSender phoneDataSender = this.phoneDataSender;
        if (phoneDataSender == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 69;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return phoneDataSender;
    }

    public final void setPhoneDataSender(PhoneDataSender phoneDataSender) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 71;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(phoneDataSender, "");
            this.phoneDataSender = phoneDataSender;
        } else {
            Intrinsics.checkNotNullParameter(phoneDataSender, "");
            this.phoneDataSender = phoneDataSender;
            int i3 = 70 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.ReportNetworkIssuesFragment.getAsAtTimestamp + 83;
        com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.ReportNetworkIssuesFragment.component4 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if ((r1 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r2 = r2 + 89;
        com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.ReportNetworkIssuesFragment.component4 = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData getConnectionLiveData() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.ReportNetworkIssuesFragment.component4
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.ReportNetworkIssuesFragment.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L18
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData r1 = r5.connectionLiveData
            r4 = 92
            int r4 = r4 / 0
            if (r1 == 0) goto L2a
            goto L1c
        L18:
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData r1 = r5.connectionLiveData
            if (r1 == 0) goto L2a
        L1c:
            int r2 = r2 + 89
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.ReportNetworkIssuesFragment.component4 = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L26
            return r1
        L26:
            r3.hashCode()
            throw r3
        L2a:
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.ReportNetworkIssuesFragment.getAsAtTimestamp
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.ReportNetworkIssuesFragment.component4 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L3b
            return r3
        L3b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.ReportNetworkIssuesFragment.getConnectionLiveData():com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData");
    }

    public final void setConnectionLiveData(ConnectionLiveData connectionLiveData) {
        int i = 2 % 2;
        int i2 = component4 + 71;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(connectionLiveData, "");
            this.connectionLiveData = connectionLiveData;
        } else {
            Intrinsics.checkNotNullParameter(connectionLiveData, "");
            this.connectionLiveData = connectionLiveData;
            throw null;
        }
    }

    private final SpeedTestViewModel ShareDataUIState() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 29;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SpeedTestViewModel speedTestViewModel = (SpeedTestViewModel) this.component1.getValue();
        int i3 = getAsAtTimestamp + 47;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        return speedTestViewModel;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(inflater, "");
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding = (FragmentMtandaoReportBinding) DataBindingUtil.inflate(getLayoutInflater(), R.layout.fragment_mtandao_report, container, false);
        this.ShareDataUIState = fragmentMtandaoReportBinding;
        if (fragmentMtandaoReportBinding == null) {
            int i2 = getAsAtTimestamp + 105;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 == 0) {
                int i4 = 48 / 0;
            }
            fragmentMtandaoReportBinding = null;
        }
        View root = fragmentMtandaoReportBinding.getRoot();
        int i5 = component4 + 83;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return root;
        }
        throw null;
    }

    private static final void component1(ReportNetworkIssuesFragment reportNetworkIssuesFragment, CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = component4 + 61;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reportNetworkIssuesFragment, "");
        SPUtils.getInstance().put("MTANDAO_STATUS", z);
        RouteUtils.routeWithExecute(reportNetworkIssuesFragment.requireActivity(), RoutePathConstant.SFC_MTANDAO_PERMISSIONS_DENIED);
        reportNetworkIssuesFragment.requireActivity().finish();
        int i4 = component4 + 119;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void component2(ReportNetworkIssuesFragment reportNetworkIssuesFragment, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reportNetworkIssuesFragment, "");
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding = reportNetworkIssuesFragment.ShareDataUIState;
        if (fragmentMtandaoReportBinding == null) {
            int i2 = component4 + 43;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding = null;
        }
        reportNetworkIssuesFragment.copydefault = fragmentMtandaoReportBinding.spinnerMtandaoItems.getSelectedItem().toString();
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding2 = reportNetworkIssuesFragment.ShareDataUIState;
        if (fragmentMtandaoReportBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding2 = null;
        }
        reportNetworkIssuesFragment.component3 = fragmentMtandaoReportBinding2.commentComp.getText();
        if (!Intrinsics.areEqual(reportNetworkIssuesFragment.copydefault, reportNetworkIssuesFragment.getString(R.string.select_your_issue))) {
            int i3 = getAsAtTimestamp + 109;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.areEqual(reportNetworkIssuesFragment.copydefault, reportNetworkIssuesFragment.getString(R.string.choose_one));
                throw null;
            }
            if (!Intrinsics.areEqual(reportNetworkIssuesFragment.copydefault, reportNetworkIssuesFragment.getString(R.string.choose_one))) {
                Context contextRequireContext = reportNetworkIssuesFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                if (!reportNetworkIssuesFragment.component3(contextRequireContext)) {
                    Toast.makeText(reportNetworkIssuesFragment.getContext(), R.string.app_usage_access_request, 1).show();
                    reportNetworkIssuesFragment.startActivity(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                    return;
                }
                MtandaoCore mtandaoCore = reportNetworkIssuesFragment.getMtandaoCore();
                Context contextRequireContext2 = reportNetworkIssuesFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                if (!mtandaoCore.canGetLocation(contextRequireContext2)) {
                    Toast.makeText(reportNetworkIssuesFragment.getContext(), R.string.enable_device_location, 1).show();
                    reportNetworkIssuesFragment.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                } else if (ActivityCompat.checkSelfPermission(reportNetworkIssuesFragment.requireContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(reportNetworkIssuesFragment.requireContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    reportNetworkIssuesFragment.copydefault();
                    return;
                } else {
                    reportNetworkIssuesFragment.checkLocationPermission();
                    return;
                }
            }
        }
        Toast.makeText(reportNetworkIssuesFragment.getContext(), R.string.choose_complaint_type, 1).show();
        int i4 = component4 + 119;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding = this.ShareDataUIState;
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding2 = null;
        if (fragmentMtandaoReportBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding = null;
        }
        fragmentMtandaoReportBinding.actionSubmitNetworkReport.setEnabled(false);
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding3 = this.ShareDataUIState;
        if (fragmentMtandaoReportBinding3 == null) {
            int i2 = component4 + 101;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i3 = 83 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            fragmentMtandaoReportBinding3 = null;
        }
        fragmentMtandaoReportBinding3.actionSubmitNetworkReport.setClickable(false);
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding4 = this.ShareDataUIState;
        if (fragmentMtandaoReportBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding4 = null;
        }
        fragmentMtandaoReportBinding4.actionSubmitNetworkReport.setTextColor(ContextCompat.getColor(requireContext(), R.color.greyed_out));
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding5 = this.ShareDataUIState;
        if (fragmentMtandaoReportBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding5 = null;
        }
        fragmentMtandaoReportBinding5.actionSubmitNetworkReport.setBackground(requireActivity().getDrawable(R.drawable.bg_button_primary_disabled));
        final String[] stringArray = requireActivity().getResources().getStringArray(R.array.complaints_type);
        Intrinsics.checkNotNullExpressionValue(stringArray, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        SpinnerAdapter spinnerAdapter = new SpinnerAdapter(contextRequireContext, R.layout.spinner_item_mtandao, R.id.text1, stringArray);
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding6 = this.ShareDataUIState;
        if (fragmentMtandaoReportBinding6 == null) {
            int i4 = getAsAtTimestamp + 101;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentMtandaoReportBinding2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding6 = null;
        }
        fragmentMtandaoReportBinding6.optOutSwitch.setChecked(SPUtils.getInstance().getBoolean("MTANDAO_STATUS"));
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding7 = this.ShareDataUIState;
        if (fragmentMtandaoReportBinding7 == null) {
            int i5 = getAsAtTimestamp + 53;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentMtandaoReportBinding2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding7 = null;
        }
        fragmentMtandaoReportBinding7.optOutSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i6 = 2 % 2;
                int i7 = component2 + 71;
                component1 = i7 % 128;
                Object obj = null;
                if (i7 % 2 != 0) {
                    ReportNetworkIssuesFragment.$r8$lambda$iGGSkEAobctlua9yrROTw1P9sK8(this.f$0, compoundButton, z);
                    obj.hashCode();
                    throw null;
                }
                ReportNetworkIssuesFragment.$r8$lambda$iGGSkEAobctlua9yrROTw1P9sK8(this.f$0, compoundButton, z);
                int i8 = component1 + 17;
                component2 = i8 % 128;
                if (i8 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        spinnerAdapter.setDropDownViewResource(R.layout.spinner_item_mtandao);
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding8 = this.ShareDataUIState;
        if (fragmentMtandaoReportBinding8 == null) {
            int i6 = component4 + 65;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding8 = null;
        }
        Spinner spinner = fragmentMtandaoReportBinding8.spinnerMtandaoItems;
        spinner.setAdapter((android.widget.SpinnerAdapter) spinnerAdapter);
        spinner.setPopupBackgroundDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.background_grey_outlined));
        spinner.setDropDownVerticalOffset(spinner.getResources().getDimensionPixelSize(R.dimen.dp_48));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view2, int position, long id) {
                int i8 = 2 % 2;
                int i9 = copydefault + 101;
                component1 = i9 % 128;
                int i10 = i9 % 2;
                Callback.onItemSelected_enter(view2, position);
                try {
                    if (position != 0) {
                        String str = stringArray[position];
                        return;
                    }
                    int i11 = copydefault + 73;
                    component1 = i11 % 128;
                    if (i11 % 2 == 0) {
                        return;
                    }
                    Callback.onItemSelected_exit();
                    throw null;
                } finally {
                    Callback.onItemSelected_exit();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                int i8 = 2 % 2;
                int i9 = copydefault + 55;
                component1 = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 87 / 0;
                }
            }
        });
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding9 = this.ShareDataUIState;
        if (fragmentMtandaoReportBinding9 == null) {
            int i8 = getAsAtTimestamp + 85;
            component4 = i8 % 128;
            if (i8 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentMtandaoReportBinding2.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding9 = null;
        }
        fragmentMtandaoReportBinding9.actionSubmitNetworkReport.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view2) {
                int i9 = 2 % 2;
                int i10 = ShareDataUIState + 13;
                copydefault = i10 % 128;
                int i11 = i10 % 2;
                ReportNetworkIssuesFragment.m11729$r8$lambda$2Ns42JQX45muLXo39VGLD9biw(this.f$0, view2);
                int i12 = copydefault + 77;
                ShareDataUIState = i12 % 128;
                int i13 = i12 % 2;
            }
        });
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding10 = this.ShareDataUIState;
        if (fragmentMtandaoReportBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentMtandaoReportBinding2 = fragmentMtandaoReportBinding10;
        }
        final EditText editText = fragmentMtandaoReportBinding2.commentComp.getEditText();
        editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(100)});
        editText.addTextChangedListener(new TextWatcher() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void afterTextChanged(Editable s) {
                CharSequence charSequenceSubSequence;
                int i9 = 2 % 2;
                FragmentMtandaoReportBinding fragmentMtandaoReportBinding11 = null;
                if (editText.getLineCount() > 3) {
                    EditText editText2 = editText;
                    if (s != null) {
                        charSequenceSubSequence = s.subSequence(0, s.length() - 1);
                    } else {
                        int i10 = component3 + 11;
                        ShareDataUIState = i10 % 128;
                        int i11 = i10 % 2;
                        charSequenceSubSequence = null;
                    }
                    editText2.setText(charSequenceSubSequence);
                    EditText editText3 = editText;
                    Editable text = editText3.getText();
                    editText3.setSelection(text != null ? text.length() : 0);
                }
                Editable editable = s;
                if (editable != null && !StringsKt.isBlank(editable)) {
                    FragmentMtandaoReportBinding fragmentMtandaoReportBindingAccess$getViewBinding$p = ReportNetworkIssuesFragment.access$getViewBinding$p(this);
                    if (fragmentMtandaoReportBindingAccess$getViewBinding$p == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i12 = component3 + 49;
                        ShareDataUIState = i12 % 128;
                        int i13 = i12 % 2;
                        fragmentMtandaoReportBindingAccess$getViewBinding$p = null;
                    }
                    fragmentMtandaoReportBindingAccess$getViewBinding$p.actionSubmitNetworkReport.setEnabled(true);
                    FragmentMtandaoReportBinding fragmentMtandaoReportBindingAccess$getViewBinding$p2 = ReportNetworkIssuesFragment.access$getViewBinding$p(this);
                    if (fragmentMtandaoReportBindingAccess$getViewBinding$p2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        fragmentMtandaoReportBindingAccess$getViewBinding$p2 = null;
                    }
                    fragmentMtandaoReportBindingAccess$getViewBinding$p2.actionSubmitNetworkReport.setClickable(true);
                    FragmentMtandaoReportBinding fragmentMtandaoReportBindingAccess$getViewBinding$p3 = ReportNetworkIssuesFragment.access$getViewBinding$p(this);
                    if (fragmentMtandaoReportBindingAccess$getViewBinding$p3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        fragmentMtandaoReportBindingAccess$getViewBinding$p3 = null;
                    }
                    fragmentMtandaoReportBindingAccess$getViewBinding$p3.actionSubmitNetworkReport.setTextColor(ContextCompat.getColor(this.requireContext(), R.color.color_on_primary));
                    FragmentMtandaoReportBinding fragmentMtandaoReportBindingAccess$getViewBinding$p4 = ReportNetworkIssuesFragment.access$getViewBinding$p(this);
                    if (fragmentMtandaoReportBindingAccess$getViewBinding$p4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        fragmentMtandaoReportBinding11 = fragmentMtandaoReportBindingAccess$getViewBinding$p4;
                    }
                    fragmentMtandaoReportBinding11.actionSubmitNetworkReport.setBackground(this.requireActivity().getDrawable(R.drawable.bg_button_primary));
                    return;
                }
                FragmentMtandaoReportBinding fragmentMtandaoReportBindingAccess$getViewBinding$p5 = ReportNetworkIssuesFragment.access$getViewBinding$p(this);
                if (fragmentMtandaoReportBindingAccess$getViewBinding$p5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fragmentMtandaoReportBindingAccess$getViewBinding$p5 = null;
                }
                fragmentMtandaoReportBindingAccess$getViewBinding$p5.actionSubmitNetworkReport.setEnabled(false);
                FragmentMtandaoReportBinding fragmentMtandaoReportBindingAccess$getViewBinding$p6 = ReportNetworkIssuesFragment.access$getViewBinding$p(this);
                if (fragmentMtandaoReportBindingAccess$getViewBinding$p6 == null) {
                    int i14 = component3 + 95;
                    ShareDataUIState = i14 % 128;
                    if (i14 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i15 = 48 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    fragmentMtandaoReportBindingAccess$getViewBinding$p6 = null;
                }
                fragmentMtandaoReportBindingAccess$getViewBinding$p6.actionSubmitNetworkReport.setClickable(false);
                FragmentMtandaoReportBinding fragmentMtandaoReportBindingAccess$getViewBinding$p7 = ReportNetworkIssuesFragment.access$getViewBinding$p(this);
                if (fragmentMtandaoReportBindingAccess$getViewBinding$p7 == null) {
                    int i16 = component3 + 101;
                    ShareDataUIState = i16 % 128;
                    int i17 = i16 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fragmentMtandaoReportBindingAccess$getViewBinding$p7 = null;
                }
                fragmentMtandaoReportBindingAccess$getViewBinding$p7.actionSubmitNetworkReport.setTextColor(ContextCompat.getColor(this.requireContext(), R.color.greyed_out));
                FragmentMtandaoReportBinding fragmentMtandaoReportBindingAccess$getViewBinding$p8 = ReportNetworkIssuesFragment.access$getViewBinding$p(this);
                if (fragmentMtandaoReportBindingAccess$getViewBinding$p8 == null) {
                    int i18 = ShareDataUIState + 15;
                    component3 = i18 % 128;
                    int i19 = i18 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    if (i19 != 0) {
                        throw null;
                    }
                } else {
                    fragmentMtandaoReportBinding11 = fragmentMtandaoReportBindingAccess$getViewBinding$p8;
                }
                fragmentMtandaoReportBinding11.actionSubmitNetworkReport.setBackground(this.requireActivity().getDrawable(R.drawable.bg_button_primary_disabled));
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                int i9 = 2 % 2;
                int i10 = ShareDataUIState + 125;
                component3 = i10 % 128;
                if (i10 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int i9 = 2 % 2;
                int i10 = ShareDataUIState + 21;
                component3 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }
        });
    }

    private static final void component1(ReportNetworkIssuesFragment reportNetworkIssuesFragment, Ref.IntRef intRef) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(reportNetworkIssuesFragment, "");
        Intrinsics.checkNotNullParameter(intRef, "");
        MtandaoCore mtandaoCore = reportNetworkIssuesFragment.getMtandaoCore();
        Context contextRequireContext = reportNetworkIssuesFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        mtandaoCore.getStaticReadings(contextRequireContext, true);
        reportNetworkIssuesFragment.copy.post(new ReportNetworkIssuesFragment$startUserRecordings$1$1(reportNetworkIssuesFragment, intRef));
        int i2 = getAsAtTimestamp + 87;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void copydefault() {
        int i = 2 % 2;
        DialogManager.showLoading(this);
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 1;
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding = this.ShareDataUIState;
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding2 = null;
        if (fragmentMtandaoReportBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding = null;
        }
        fragmentMtandaoReportBinding.actionSubmitNetworkReport.setEnabled(false);
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding3 = this.ShareDataUIState;
        if (fragmentMtandaoReportBinding3 == null) {
            int i2 = component4 + 89;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding3 = null;
        }
        fragmentMtandaoReportBinding3.actionSubmitNetworkReport.setClickable(false);
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding4 = this.ShareDataUIState;
        if (fragmentMtandaoReportBinding4 == null) {
            int i3 = component4 + 103;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding4 = null;
        }
        fragmentMtandaoReportBinding4.actionSubmitNetworkReport.setTextColor(ContextCompat.getColor(requireContext(), R.color.greyed_out));
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding5 = this.ShareDataUIState;
        if (fragmentMtandaoReportBinding5 == null) {
            int i4 = getAsAtTimestamp + 117;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentMtandaoReportBinding5 = null;
        }
        fragmentMtandaoReportBinding5.actionSubmitNetworkReport.setBackground(requireActivity().getDrawable(R.drawable.bg_button_primary_disabled));
        FragmentMtandaoReportBinding fragmentMtandaoReportBinding6 = this.ShareDataUIState;
        if (fragmentMtandaoReportBinding6 == null) {
            int i5 = getAsAtTimestamp + 109;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = 90 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else {
            fragmentMtandaoReportBinding2 = fragmentMtandaoReportBinding6;
        }
        fragmentMtandaoReportBinding2.actionSubmitNetworkReport.setText(getString(R.string.submitting_please_wait));
        if (SPUtils.getInstance().getBoolean("MTANDAO_STATUS")) {
            MtandaoCore mtandaoCore = getMtandaoCore();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            if (mtandaoCore.canGetLocation(contextRequireContext)) {
                MtandaoCore mtandaoCore2 = getMtandaoCore();
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                mtandaoCore2.acquireGps(contextRequireContext2);
                new Thread(new Runnable() {
                    private static int component2 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final void run() {
                        int i7 = 2 % 2;
                        int i8 = component2 + 31;
                        copydefault = i8 % 128;
                        int i9 = i8 % 2;
                        ReportNetworkIssuesFragment reportNetworkIssuesFragment = this.f$0;
                        if (i9 != 0) {
                            ReportNetworkIssuesFragment.$r8$lambda$g7kZ7qB172e3tmde4ZtTZgSWMaU(reportNetworkIssuesFragment, intRef);
                        } else {
                            ReportNetworkIssuesFragment.$r8$lambda$g7kZ7qB172e3tmde4ZtTZgSWMaU(reportNetworkIssuesFragment, intRef);
                            throw null;
                        }
                    }
                }).start();
            }
        }
    }

    private final boolean component3(Context context) {
        int i = 2 % 2;
        boolean z = false;
        try {
            ApplicationInfo applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "");
            Object systemService = context.getApplicationContext().getSystemService("appops");
            Intrinsics.checkNotNull(systemService, "");
            if (((AppOpsManager) systemService).checkOpNoThrow("android:get_usage_stats", applicationInfo.uid, applicationInfo.packageName) == 0) {
                int i2 = component4 + 57;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        int i4 = getAsAtTimestamp + 79;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final void checkLocationPermission() {
        int i = 2 % 2;
        if (requireActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") + requireActivity().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            int i2 = component4 + 3;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 121);
        }
        int i4 = component4 + 67;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
    }

    public static void m11729$r8$lambda$2Ns42JQX45muLXo39VGLD9biw(ReportNetworkIssuesFragment reportNetworkIssuesFragment, View view) {
        int i = 2 % 2;
        int i2 = component4 + 73;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        copydefault(reportNetworkIssuesFragment, view);
        int i4 = getAsAtTimestamp + 7;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$g7kZ7qB172e3tmde4ZtTZgSWMaU(ReportNetworkIssuesFragment reportNetworkIssuesFragment, Ref.IntRef intRef) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 125;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        component1(reportNetworkIssuesFragment, intRef);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 83;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$iGGSkEAobctlua9yrROTw1P9sK8(ReportNetworkIssuesFragment reportNetworkIssuesFragment, CompoundButton compoundButton, boolean z) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 73;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        component1(reportNetworkIssuesFragment, compoundButton, z);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 49;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        if (93 % 2 == 0) {
            throw null;
        }
    }

    private static void copydefault(ReportNetworkIssuesFragment reportNetworkIssuesFragment, View view) {
        int i = 2 % 2;
        int i2 = component4 + 99;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            component2(reportNetworkIssuesFragment, view);
            Callback.onClick_exit();
            int i4 = getAsAtTimestamp + 19;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 0 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
