package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.api.track.Event;
import com.blankj.utilcode.util.AppUtils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.dynatrace.android.callback.Callback;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.photo.GetPhotoUtils;
import com.huawei.common.photo.PhotoOptions;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.dialog.DialogBox;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.base.util.ExtensionMethodsKt;
import com.huawei.digitalpayment.consumer.base.util.SFCUserConfigManager;
import com.huawei.digitalpayment.consumer.base.util.TimestampFormatterUtil;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.baselib.init.TokenHelper;
import com.huawei.digitalpayment.consumer.baselib.util.PicBase64Utils;
import com.huawei.digitalpayment.consumer.home.constants.SfcHomeRoutePath;
import com.huawei.digitalpayment.consumer.home.ui.dialog.UploadHeaderDialog;
import com.huawei.digitalpayment.consumer.home.viewmodel.UploadHeaderViewModel;
import com.huawei.digitalpayment.consumer.homeui.R;
import com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcProfileBinding;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalProfileItem;
import com.huawei.digitalpayment.consumer.profile.model.remote.RemoteUploadAvatar;
import com.huawei.digitalpayment.consumer.profile.util.ProfileHelper;
import com.huawei.digitalpayment.consumer.service.INotificationService;
import com.huawei.digitalpayment.consumer.service.UnreadState;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.viewmodel.NotificationRecordViewModel;
import com.huawei.image.glide.Base64DataFetcher;
import com.huawei.image.glide.Base64Mode;
import com.huawei.image.util.GlideUtils;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.components.bubble.ArrowAlignment;
import com.safaricom.mpesa.logging.L;
import com.safaricom.sharedui.compose.welcometutorial.WelcomeTutorialRectProvider;
import com.safaricom.sharedui.compose.welcometutorial.WelcomeTutorialViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.StringUtils;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020*H\u0002J\b\u0010-\u001a\u00020*H\u0016J\b\u0010.\u001a\u00020*H\u0002J\b\u0010/\u001a\u00020*H\u0002J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020\u0005H\u0002J\b\u00102\u001a\u00020*H\u0002J\u0010\u00103\u001a\u00020*2\u0006\u00104\u001a\u00020\u0005H\u0002J\b\u00105\u001a\u00020*H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00066"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/SFCProfileFragment;", "Lcom/huawei/common/fragment/BaseFragment;", "<init>", "()V", "TAG", "", "binding", "Lcom/huawei/digitalpayment/consumer/homeui/databinding/FragmentSfcProfileBinding;", "uploadHeaderViewModel", "Lcom/huawei/digitalpayment/consumer/home/viewmodel/UploadHeaderViewModel;", "welcomeTutorialViewModel", "Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialViewModel;", "getWelcomeTutorialViewModel", "()Lcom/safaricom/sharedui/compose/welcometutorial/WelcomeTutorialViewModel;", "welcomeTutorialViewModel$delegate", "Lkotlin/Lazy;", "notificationRecordViewModel", "Lcom/huawei/digitalpayment/consumer/viewmodel/NotificationRecordViewModel;", "getNotificationRecordViewModel", "()Lcom/huawei/digitalpayment/consumer/viewmodel/NotificationRecordViewModel;", "notificationRecordViewModel$delegate", "encodedBase64Image", "options", "Lcom/huawei/common/photo/PhotoOptions;", "kotlin.jvm.PlatformType", "getOptions", "()Lcom/huawei/common/photo/PhotoOptions;", "Lcom/huawei/common/photo/PhotoOptions;", "callback", "Lcom/huawei/common/listener/ApiCallback;", "Landroid/net/Uri;", "getCallback", "()Lcom/huawei/common/listener/ApiCallback;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "addObserver", "", "initData", "observeUnreadNotifications", "onResume", "showUploadHeaderDialog", "initListener", "showPermissionDialog", "content", "initView", "displayDefaultAvatarByName", "name", "setupWelcomeTutorial", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SFCProfileFragment extends Hilt_SFCProfileFragment {
    public static final int $stable = 8;
    private static int copy = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int getSponsorBeneficiariesState = 51 % 128;
    private static int hashCode;
    private String ShareDataUIState;
    private final String component1;
    private final ApiCallback<Uri> component2;
    private final Lazy component3;
    private final PhotoOptions component4;
    private FragmentSfcProfileBinding copydefault;
    private UploadHeaderViewModel equals;
    private final Lazy getAsAtTimestamp;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        private final Function1 component3;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0019 A[PHI: r2
  0x0019: PHI (r2v2 boolean) = (r2v1 boolean), (r2v5 boolean) binds: [B:8:0x0017, B:5:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment.component2.ShareDataUIState
                int r1 = r1 + 97
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment.component2.copydefault = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L14
                boolean r1 = r4 instanceof androidx.lifecycle.Observer
                r2 = 1
                if (r1 == 0) goto L2e
                goto L19
            L14:
                boolean r1 = r4 instanceof androidx.lifecycle.Observer
                r2 = 0
                if (r1 == 0) goto L2e
            L19:
                boolean r1 = r4 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L2e
                r1 = r3
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r4 = (kotlin.jvm.internal.FunctionAdapter) r4
                kotlin.Function r4 = r4.getFunctionDelegate()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            L2e:
                int r4 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment.component2.ShareDataUIState
                int r4 = r4 + 21
                int r1 = r4 % 128
                com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment.component2.copydefault = r1
                int r4 = r4 % r0
                if (r4 != 0) goto L3a
                return r2
            L3a:
                r4 = 0
                r4.hashCode()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment.component2.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 77;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.component3;
            int i5 = i2 + 7;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 79 / 0;
            }
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 81;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = ShareDataUIState + 25;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 51;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.component3.invoke(obj);
            int i4 = copydefault + 35;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    public static Object copydefault(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i2);
        int i9 = ~i4;
        int i10 = (~(i9 | i3)) | i8;
        int i11 = ~i2;
        int i12 = i11 | i3;
        int i13 = i10 | (~i12);
        int i14 = i7 | i4;
        int i15 = i8 | (~i14);
        int i16 = (~(i2 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i4));
        int i17 = i3 + i4 + i6 + ((-1254723898) * i) + ((-1667789834) * i5);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i3) + 1379663872 + ((-481802647) * i4) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i6) + ((-1033371648) * i) + ((-106430464) * i5) + (1552875520 * i18);
        int i20 = ((i3 * (-402395399)) - 1316031342) + (i4 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i6 * (-402393527)) + (i * (-1219896714)) + (i5 * (-610841306)) + (i18 * (-825819136));
        int i21 = i19 + (i20 * i20 * (-1063190528));
        if (i21 == 1) {
            return ShareDataUIState(objArr);
        }
        if (i21 == 2) {
            return component2(objArr);
        }
        if (i21 == 3) {
            return component3(objArr);
        }
        if (i21 == 4) {
            return component1(objArr);
        }
        final SFCProfileFragment sFCProfileFragment = (SFCProfileFragment) objArr[0];
        int i22 = 2 % 2;
        INotificationService iNotificationService = (INotificationService) RouteUtils.getService(INotificationService.class);
        iNotificationService.unreadState().observe(sFCProfileFragment.getViewLifecycleOwner(), new component2(new Function1() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i23 = 2 % 2;
                int i24 = component3 + 49;
                ShareDataUIState = i24 % 128;
                if (i24 % 2 == 0) {
                    SFCProfileFragment.m10527$r8$lambda$vdq51JJPYJMoHYX_3o9xNXAWpo(this.f$0, (UnreadState) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitM10527$r8$lambda$vdq51JJPYJMoHYX_3o9xNXAWpo = SFCProfileFragment.m10527$r8$lambda$vdq51JJPYJMoHYX_3o9xNXAWpo(this.f$0, (UnreadState) obj);
                int i25 = ShareDataUIState + 121;
                component3 = i25 % 128;
                int i26 = i25 % 2;
                return unitM10527$r8$lambda$vdq51JJPYJMoHYX_3o9xNXAWpo;
            }
        }));
        iNotificationService.queryUnreadNum();
        int i23 = copy + 43;
        getRequestBeneficiariesState = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    public static final FragmentSfcProfileBinding access$getBinding$p(SFCProfileFragment sFCProfileFragment) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 5;
        copy = i3 % 128;
        int i4 = i3 % 2;
        FragmentSfcProfileBinding fragmentSfcProfileBinding = sFCProfileFragment.copydefault;
        if (i4 == 0) {
            int i5 = 66 / 0;
        }
        int i6 = i2 + 87;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return fragmentSfcProfileBinding;
    }

    public static final String access$getEncodedBase64Image$p(SFCProfileFragment sFCProfileFragment) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 121;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = sFCProfileFragment.ShareDataUIState;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    public static final UploadHeaderViewModel access$getUploadHeaderViewModel$p(SFCProfileFragment sFCProfileFragment) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 95;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        UploadHeaderViewModel uploadHeaderViewModel = sFCProfileFragment.equals;
        int i5 = i2 + 69;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return uploadHeaderViewModel;
    }

    public static final void access$setEncodedBase64Image$p(SFCProfileFragment sFCProfileFragment, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 81;
        copy = i2 % 128;
        int i3 = i2 % 2;
        sFCProfileFragment.ShareDataUIState = str;
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
    }

    public static final void access$showPermissionDialog(SFCProfileFragment sFCProfileFragment, String str) {
        int i = 2 % 2;
        int i2 = copy + 103;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        sFCProfileFragment.component3(str);
        int i4 = getRequestBeneficiariesState + 21;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public SFCProfileFragment() {
        String simpleName = Reflection.getOrCreateKotlinClass(SFCProfileFragment.class).getSimpleName();
        if (simpleName == null) {
            int i = copy + 93;
            getRequestBeneficiariesState = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
            simpleName = "";
        }
        this.component1 = simpleName;
        final SFCProfileFragment sFCProfileFragment = this;
        final Function0 function0 = null;
        this.getAsAtTimestamp = FragmentViewModelLazyKt.createViewModelLazy(sFCProfileFragment, Reflection.getOrCreateKotlinClass(WelcomeTutorialViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public ViewModelStore invoke() {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 41;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                if (i5 != 0) {
                    int i6 = 4 / 0;
                }
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i3 = 2 % 2;
                int i4 = component2 + 123;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    sFCProfileFragment.requireActivity().getViewModelStore();
                    throw null;
                }
                ViewModelStore viewModelStore = sFCProfileFragment.requireActivity().getViewModelStore();
                int i5 = ShareDataUIState + 103;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 23 / 0;
                }
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
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 115;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i6 = copydefault + 83;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 15 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 kotlin.jvm.functions.Function0) = (r1v4 kotlin.jvm.functions.Function0), (r1v12 kotlin.jvm.functions.Function0) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
                /*
                    r4 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment$special$$inlined$activityViewModels$default$2.copydefault
                    int r1 = r1 + 1
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment$special$$inlined$activityViewModels$default$2.ShareDataUIState = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L17
                    kotlin.jvm.functions.Function0 r1 = r1
                    r2 = 24
                    int r2 = r2 / 0
                    if (r1 == 0) goto L23
                    goto L1b
                L17:
                    kotlin.jvm.functions.Function0 r1 = r1
                    if (r1 == 0) goto L23
                L1b:
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L2d
                L23:
                    androidx.fragment.app.Fragment r1 = r2
                    androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                L2d:
                    int r2 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment$special$$inlined$activityViewModels$default$2.copydefault
                    int r2 = r2 + 13
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment$special$$inlined$activityViewModels$default$2.ShareDataUIState = r3
                    int r2 = r2 % r0
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment$special$$inlined$activityViewModels$default$2.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i3 = 2 % 2;
                int i4 = component2 + 23;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i3 = 2 % 2;
                int i4 = component2 + 89;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    sFCProfileFragment.requireActivity().getDefaultViewModelProviderFactory();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = sFCProfileFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i5 = component2 + 25;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
        this.component3 = FragmentViewModelLazyKt.createViewModelLazy(sFCProfileFragment, Reflection.getOrCreateKotlinClass(NotificationRecordViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelStore invoke() {
                int i3 = 2 % 2;
                int i4 = copydefault + 57;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i6 = ShareDataUIState + 57;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore;
                int i3 = 2 % 2;
                int i4 = copydefault + 19;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    viewModelStore = sFCProfileFragment.requireActivity().getViewModelStore();
                    int i5 = 10 / 0;
                } else {
                    viewModelStore = sFCProfileFragment.requireActivity().getViewModelStore();
                }
                int i6 = copydefault + 125;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    return viewModelStore;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public CreationExtras invoke() {
                int i3 = 2 % 2;
                int i4 = copydefault + 63;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i6 = copydefault + 59;
                component2 = i6 % 128;
                if (i6 % 2 != 0) {
                    return creationExtrasInvoke;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i3 = 2 % 2;
                int i4 = copydefault + 91;
                int i5 = i4 % 128;
                component2 = i5;
                int i6 = i4 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i7 = i5 + 105;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return sFCProfileFragment.requireActivity().getDefaultViewModelCreationExtras();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i3 = 2 % 2;
                int i4 = copydefault + 87;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i6 = copydefault + 41;
                component2 = i6 % 128;
                if (i6 % 2 != 0) {
                    return factoryInvoke;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i3 = 2 % 2;
                int i4 = copydefault + 81;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                FragmentActivity fragmentActivityRequireActivity = sFCProfileFragment.requireActivity();
                if (i5 != 0) {
                    return fragmentActivityRequireActivity.getDefaultViewModelProviderFactory();
                }
                fragmentActivityRequireActivity.getDefaultViewModelProviderFactory();
                throw null;
            }

            {
                super(0);
            }
        });
        this.component4 = new PhotoOptions.Builder().setOutputX(400).setOutputY(400).build();
        this.component2 = new ApiCallback<Uri>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onSuccess(Uri uri) {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 51;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                onSuccess2(uri);
                if (i5 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(Uri value) {
                int i3 = 2 % 2;
                int i4 = component1 + 107;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                L.INSTANCE.d("SFCProfileFragment", "GetPhoto onSuccess: ", new Object[0]);
                SFCProfileFragment sFCProfileFragment2 = this.component3;
                SFCProfileFragment.access$setEncodedBase64Image$p(sFCProfileFragment2, PicBase64Utils.encodeString(sFCProfileFragment2.getContext(), value));
                String strAccess$getEncodedBase64Image$p = SFCProfileFragment.access$getEncodedBase64Image$p(this.component3);
                String str = null;
                if (strAccess$getEncodedBase64Image$p == null) {
                    int i6 = component1 + 79;
                    ShareDataUIState = i6 % 128;
                    if (i6 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i7 = 75 / 0;
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    strAccess$getEncodedBase64Image$p = null;
                }
                if (!TextUtils.isEmpty(strAccess$getEncodedBase64Image$p)) {
                    int i8 = component1 + 49;
                    ShareDataUIState = i8 % 128;
                    if (i8 % 2 != 0) {
                        Intrinsics.checkNotNull(SFCProfileFragment.access$getUploadHeaderViewModel$p(this.component3));
                        SFCProfileFragment.access$getEncodedBase64Image$p(this.component3);
                        str.hashCode();
                        throw null;
                    }
                    UploadHeaderViewModel uploadHeaderViewModelAccess$getUploadHeaderViewModel$p = SFCProfileFragment.access$getUploadHeaderViewModel$p(this.component3);
                    Intrinsics.checkNotNull(uploadHeaderViewModelAccess$getUploadHeaderViewModel$p);
                    String strAccess$getEncodedBase64Image$p2 = SFCProfileFragment.access$getEncodedBase64Image$p(this.component3);
                    if (strAccess$getEncodedBase64Image$p2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i9 = ShareDataUIState + 49;
                        component1 = i9 % 128;
                        int i10 = i9 % 2;
                    } else {
                        str = strAccess$getEncodedBase64Image$p2;
                    }
                    uploadHeaderViewModelAccess$getUploadHeaderViewModel$p.uploadHeader(str);
                    return;
                }
                ToastUtils.showLong(this.component3.getString(R.string.profile_upload_failed), new Object[0]);
            }

            @Override
            public void onError(BaseException e) {
                int i3 = 2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                L.INSTANCE.e("SFCProfileFragment", "GetPhoto onError: " + e.getMessage(), new Object[0]);
                if (e.getCode() == 5) {
                    SFCProfileFragment sFCProfileFragment2 = this.component3;
                    String string = sFCProfileFragment2.getString(R.string.base_album_permission_tips);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    SFCProfileFragment.access$showPermissionDialog(sFCProfileFragment2, string);
                    int i4 = component1 + 81;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                if (e.getCode() != 6) {
                    ToastUtils.showShort(e.getResponseDesc(), new Object[0]);
                    return;
                }
                int i6 = component1 + 101;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    SFCProfileFragment sFCProfileFragment3 = this.component3;
                    String string2 = sFCProfileFragment3.getString(R.string.base_camera_permission_tips);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    SFCProfileFragment.access$showPermissionDialog(sFCProfileFragment3, string2);
                    return;
                }
                SFCProfileFragment sFCProfileFragment4 = this.component3;
                String string3 = sFCProfileFragment4.getString(R.string.base_camera_permission_tips);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                SFCProfileFragment.access$showPermissionDialog(sFCProfileFragment4, string3);
                int i7 = 59 / 0;
            }
        };
        int i3 = copy + 31;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    private final WelcomeTutorialViewModel component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 9;
        copy = i2 % 128;
        int i3 = i2 % 2;
        WelcomeTutorialViewModel welcomeTutorialViewModel = (WelcomeTutorialViewModel) this.getAsAtTimestamp.getValue();
        int i4 = copy + 125;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return welcomeTutorialViewModel;
    }

    private final NotificationRecordViewModel ShareDataUIState() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        copy = i2 % 128;
        int i3 = i2 % 2;
        NotificationRecordViewModel notificationRecordViewModel = (NotificationRecordViewModel) this.component3.getValue();
        int i4 = getRequestBeneficiariesState + 23;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return notificationRecordViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final PhotoOptions getOptions() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 93;
        copy = i2 % 128;
        int i3 = i2 % 2;
        PhotoOptions photoOptions = this.component4;
        if (i3 == 0) {
            int i4 = 34 / 0;
        }
        return photoOptions;
    }

    public final ApiCallback<Uri> getCallback() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 107;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 113;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(inflater, "");
        this.copydefault = (FragmentSfcProfileBinding) DataBindingUtil.inflate(getLayoutInflater(inflater), R.layout.fragment_sfc_profile, container, false);
        component1();
        component3();
        copydefault(new Object[]{this}, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), 414917045, -414917043, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1());
        equals();
        copydefault(new Object[]{this}, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), 893683535, -893683535, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1());
        FragmentSfcProfileBinding fragmentSfcProfileBinding = this.copydefault;
        if (fragmentSfcProfileBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = copy + 107;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            fragmentSfcProfileBinding = null;
        }
        View root = fragmentSfcProfileBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    private static Object component2(Object[] objArr) {
        final SFCProfileFragment sFCProfileFragment = (SFCProfileFragment) objArr[0];
        int i = 2 % 2;
        UploadHeaderViewModel uploadHeaderViewModel = sFCProfileFragment.equals;
        Intrinsics.checkNotNull(uploadHeaderViewModel);
        uploadHeaderViewModel.getData().observe(sFCProfileFragment.getViewLifecycleOwner(), new component2(new Function1() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 123;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$rS1twVpNC7npwiSz49DK3cRgZkg = SFCProfileFragment.$r8$lambda$rS1twVpNC7npwiSz49DK3cRgZkg(this.f$0, (Resource) obj);
                int i5 = ShareDataUIState + 75;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return unit$r8$lambda$rS1twVpNC7npwiSz49DK3cRgZkg;
            }
        }));
        int i2 = copy + 107;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    private static final Unit component3(SFCProfileFragment sFCProfileFragment, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sFCProfileFragment, "");
        Intrinsics.checkNotNullParameter(resource, "");
        if (resource.loading()) {
            DialogManager.showLoading(sFCProfileFragment);
            return Unit.INSTANCE;
        }
        DialogManager.hideLoading(sFCProfileFragment);
        FragmentSfcProfileBinding fragmentSfcProfileBinding = null;
        if (!(!resource.error())) {
            int i2 = getRequestBeneficiariesState + 67;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                ToastUtils.showLong(resource.getMessage(), new Object[1]);
            } else {
                ToastUtils.showLong(resource.getMessage(), new Object[0]);
            }
            Unit unit = Unit.INSTANCE;
            int i3 = copy + 125;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        String docId = ((RemoteUploadAvatar) resource.getData()).getDocId();
        Base64Mode consumerMode = Base64Mode.getConsumerMode(docId);
        String str = sFCProfileFragment.ShareDataUIState;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            str = null;
        }
        Base64DataFetcher.addBase64ContentCache(consumerMode, str);
        Base64Mode consumerMode2 = Base64Mode.getConsumerMode(docId);
        FragmentSfcProfileBinding fragmentSfcProfileBinding2 = sFCProfileFragment.copydefault;
        if (fragmentSfcProfileBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentSfcProfileBinding = fragmentSfcProfileBinding2;
        }
        GlideUtils.load(consumerMode2, fragmentSfcProfileBinding.ivAvatar, R.mipmap.icon_default_avatar, R.mipmap.icon_default_avatar);
        ProfileHelper.updateAvatar(docId);
        return Unit.INSTANCE;
    }

    private final void component1() {
        int i = 2 % 2;
        boolean z = SPUtils.getInstance().getBoolean("spIsFirstLogin");
        this.equals = new UploadHeaderViewModel();
        if (!(!z)) {
            int i2 = getRequestBeneficiariesState + 125;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                copy();
                SPUtils.getInstance().put("spIsFirstLogin", true);
            } else {
                copy();
                SPUtils.getInstance().put("spIsFirstLogin", false);
            }
        }
        if (SFCUserConfigManager.INSTANCE.isCustomerChild()) {
            FragmentSfcProfileBinding fragmentSfcProfileBinding = this.copydefault;
            if (fragmentSfcProfileBinding == null) {
                int i3 = copy + 111;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                Intrinsics.throwUninitializedPropertyAccessException("");
                if (i4 != 0) {
                    obj.hashCode();
                    throw null;
                }
                fragmentSfcProfileBinding = null;
            }
            fragmentSfcProfileBinding.rlRoot.setBackgroundColor(0);
            int i5 = getRequestBeneficiariesState + 27;
            copy = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static final Unit copydefault(SFCProfileFragment sFCProfileFragment, UnreadState unreadState) {
        int i;
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 115;
        copy = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(sFCProfileFragment, "");
        int transaction = unreadState.getTransaction();
        int promotion = unreadState.getPromotion();
        int system = unreadState.getSystem();
        FragmentSfcProfileBinding fragmentSfcProfileBinding = sFCProfileFragment.copydefault;
        if (fragmentSfcProfileBinding == null) {
            int i5 = copy + 11;
            getRequestBeneficiariesState = i5 % 128;
            Object obj = null;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                obj.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSfcProfileBinding = null;
        }
        ImageView imageView = fragmentSfcProfileBinding.ivNotificationBadge;
        if (transaction + promotion + system > 0) {
            int i6 = getRequestBeneficiariesState + 11;
            copy = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        Unit unit = Unit.INSTANCE;
        int i8 = getRequestBeneficiariesState + 53;
        copy = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    @Override
    public void onResume() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        getRequestBeneficiariesState();
        int i4 = getRequestBeneficiariesState + 35;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void equals(SFCProfileFragment sFCProfileFragment, View view) {
        int i = 2 % 2;
        int i2 = copy + 47;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sFCProfileFragment, "");
            sFCProfileFragment.getActivity();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sFCProfileFragment, "");
        FragmentActivity activity = sFCProfileFragment.getActivity();
        if (activity != null) {
            GetPhotoUtils.takePhoto(activity, sFCProfileFragment.component4, sFCProfileFragment.component2);
        }
        int i3 = copy + 21;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void copy() {
        int i = 2 % 2;
        new UploadHeaderDialog.Builder().setTakePhotoClickListenerClickListener(new View.OnClickListener() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 41;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    SFCProfileFragment.$r8$lambda$VojXgHQn2ajREVia1dnlykMruUY(this.f$0, view);
                    throw null;
                }
                SFCProfileFragment.$r8$lambda$VojXgHQn2ajREVia1dnlykMruUY(this.f$0, view);
                int i4 = copydefault + 121;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
        }).build().show(getParentFragmentManager(), "uploadHeaderDialog");
        int i2 = getRequestBeneficiariesState + 19;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void component1(SFCProfileFragment sFCProfileFragment, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 23;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sFCProfileFragment, "");
            RouteUtils.routeWithExecute(sFCProfileFragment.getActivity(), RoutePathConstant.SFC_MY_PROFILE);
            throw null;
        }
        Intrinsics.checkNotNullParameter(sFCProfileFragment, "");
        RouteUtils.routeWithExecute(sFCProfileFragment.getActivity(), RoutePathConstant.SFC_MY_PROFILE);
        int i3 = copy + 105;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void component3(SFCProfileFragment sFCProfileFragment, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 25;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sFCProfileFragment, "");
        RouteUtils.routeWithExecute(sFCProfileFragment.getActivity(), RoutePathConstant.SFC_MY_PROFILE);
        int i4 = copy + 1;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void copydefault(SFCProfileFragment sFCProfileFragment, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 115;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sFCProfileFragment, "");
        RouteUtils.routeWithExecute(sFCProfileFragment.getActivity(), RoutePathConstants.NOTIFICATION);
        int i4 = copy + 119;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void component3() {
        int i = 2 % 2;
        int i2 = copy + 107;
        getRequestBeneficiariesState = i2 % 128;
        FragmentSfcProfileBinding fragmentSfcProfileBinding = null;
        if (i2 % 2 != 0) {
            fragmentSfcProfileBinding.hashCode();
            throw null;
        }
        FragmentSfcProfileBinding fragmentSfcProfileBinding2 = this.copydefault;
        if (fragmentSfcProfileBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSfcProfileBinding2 = null;
        }
        fragmentSfcProfileBinding2.ivAvatar.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i3 = 2 % 2;
                int i4 = component3 + 7;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                SFCProfileFragment.m10526$r8$lambda$saq7W0QEde8s6cDE16Nv1uhXDM(this.f$0, view);
                if (i5 != 0) {
                    throw null;
                }
            }
        });
        FragmentSfcProfileBinding fragmentSfcProfileBinding3 = this.copydefault;
        if (fragmentSfcProfileBinding3 == null) {
            int i3 = copy + 23;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSfcProfileBinding3 = null;
        }
        fragmentSfcProfileBinding3.cardAbbr.setOnClickListener(new View.OnClickListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i4 = 2 % 2;
                int i5 = copydefault + 119;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                SFCProfileFragment.m10525$r8$lambda$raG1WFnCqkk8vHPw8Fqi7GBBig(this.f$0, view);
                int i7 = component3 + 11;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        FragmentSfcProfileBinding fragmentSfcProfileBinding4 = this.copydefault;
        if (fragmentSfcProfileBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSfcProfileBinding4 = null;
        }
        fragmentSfcProfileBinding4.ivNotification.setOnClickListener(new View.OnClickListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onClick(View view) {
                int i4 = 2 % 2;
                int i5 = component2 + 45;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                SFCProfileFragment.$r8$lambda$L72HPO0HDmI4uA2s0WKVXX_KEsc(this.f$0, view);
                int i7 = component1 + 99;
                component2 = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        FragmentSfcProfileBinding fragmentSfcProfileBinding5 = this.copydefault;
        if (fragmentSfcProfileBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentSfcProfileBinding = fragmentSfcProfileBinding5;
        }
        fragmentSfcProfileBinding.ivSearch.setOnClickListener(new View.OnClickListener() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public final void onClick(View view) {
                int i4 = 2 % 2;
                int i5 = component3 + 41;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                SFCProfileFragment.$r8$lambda$oK2Oy8gjgdDFePRRGdSzKVjUGAc(view);
                if (i6 != 0) {
                    throw null;
                }
                int i7 = component2 + 11;
                component3 = i7 % 128;
                int i8 = i7 % 2;
            }
        });
    }

    private static final void component3(View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 43;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        RouteUtils.routeWithExecute(SfcHomeRoutePath.SFC_GLOBAL_SEARCH);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 119;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void component3(View view, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        copy = i2 % 128;
        int i3 = i2 % 2;
        AppUtils.launchAppDetailsSettings();
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
    }

    private final void component3(String str) {
        int i = 2 % 2;
        DialogBox.builder().setContent(str).setLeftButtonText(getString(R.string.base_permission_cancel)).setRightButtonText(getString(R.string.base_permission_setting)).setRightButtonListener(new DialogBox.DialogBoxListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onButtonClick(View view, String str2) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 79;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                SFCProfileFragment.m10524$r8$lambda$qrbuia34fNJi5uksaU8MNrJhg(view, str2);
                int i5 = copydefault + 87;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        }).setLeftButtonListener(new View.OnClickListener() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 47;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SFCProfileFragment.m10523$r8$lambda$6EKFW_K36zimRBEzcu3HQPvtc(view);
                if (i4 == 0) {
                    throw null;
                }
                int i5 = component1 + 39;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        }).build().show(getParentFragmentManager(), "PermissionDialog");
        int i2 = copy + 125;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void getRequestBeneficiariesState() {
        FragmentSfcProfileBinding fragmentSfcProfileBinding;
        Object next;
        Object next2;
        String avatar;
        int i = 2 % 2;
        if (TextUtils.isEmpty(TokenHelper.INSTANCE.getLoginToken())) {
            return;
        }
        LocalCustomer customer = ProfileHelper.INSTANCE.getCustomer();
        Iterator<T> it = ProfileHelper.INSTANCE.getProfiles().iterator();
        while (true) {
            fragmentSfcProfileBinding = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i2 = copy + 39;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            next = it.next();
            if (Intrinsics.areEqual(((LocalProfileItem) next).getName(), "FirstName")) {
                break;
            }
        }
        LocalProfileItem localProfileItem = (LocalProfileItem) next;
        String value = localProfileItem != null ? localProfileItem.getValue() : null;
        Iterator<T> it2 = ProfileHelper.INSTANCE.getProfiles().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (Intrinsics.areEqual(((LocalProfileItem) next2).getName(), "LastName")) {
                    break;
                }
            }
        }
        LocalProfileItem localProfileItem2 = (LocalProfileItem) next2;
        String value2 = localProfileItem2 != null ? localProfileItem2.getValue() : null;
        String string = StringsKt.trim(value + " " + value2).toString();
        if (TextUtils.isEmpty(value)) {
            int i4 = copy + 103;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                TextUtils.isEmpty(value2);
                fragmentSfcProfileBinding.hashCode();
                throw null;
            }
            if (!(!TextUtils.isEmpty(value2))) {
                string = customer != null ? customer.getName() : null;
                if (string == null) {
                    string = "";
                }
            }
        }
        component1(string);
        FragmentSfcProfileBinding fragmentSfcProfileBinding2 = this.copydefault;
        if (fragmentSfcProfileBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSfcProfileBinding2 = null;
        }
        RequestManager requestManagerWith = Glide.with(fragmentSfcProfileBinding2.ivAvatar);
        if (customer == null || (avatar = customer.getAvatar()) == null) {
            avatar = "";
        }
        RequestBuilder<Drawable> requestBuilderListener = requestManagerWith.load((Object) Base64Mode.getConsumerMode(avatar)).listener(new RequestListener<Drawable>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                int i5 = 2 % 2;
                int i6 = ShareDataUIState + 79;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return onResourceReady2(drawable, obj, target, dataSource, z);
                }
                onResourceReady2(drawable, obj, target, dataSource, z);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public boolean onResourceReady2(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                int i5 = 2 % 2;
                int i6 = copydefault + 29;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.checkNotNullParameter(resource, "");
                Intrinsics.checkNotNullParameter(model, "");
                Intrinsics.checkNotNullParameter(dataSource, "");
                FragmentSfcProfileBinding fragmentSfcProfileBindingAccess$getBinding$p = SFCProfileFragment.access$getBinding$p(this.component2);
                if (fragmentSfcProfileBindingAccess$getBinding$p == null) {
                    int i8 = ShareDataUIState + 5;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i10 = ShareDataUIState + 23;
                    copydefault = i10 % 128;
                    int i11 = i10 % 2;
                    fragmentSfcProfileBindingAccess$getBinding$p = null;
                }
                fragmentSfcProfileBindingAccess$getBinding$p.cardAbbr.setVisibility(8);
                return false;
            }

            @Override
            public boolean onLoadFailed(GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                int i5 = 2 % 2;
                int i6 = copydefault + 63;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.checkNotNullParameter(target, "");
                return false;
            }
        });
        FragmentSfcProfileBinding fragmentSfcProfileBinding3 = this.copydefault;
        if (fragmentSfcProfileBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSfcProfileBinding3 = null;
        }
        requestBuilderListener.into(fragmentSfcProfileBinding3.ivAvatar);
        String lowerCase = StringsKt.substringBefore$default(string, " ", (String) null, 2, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strReplace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(ExtensionMethodsKt.capitalizeNames(lowerCase), "\n", "", false, 4, (Object) null), StringUtils.CR, "", false, 4, (Object) null), " ", "", false, 4, (Object) null);
        String str = strReplace$default + " " + getString(R.string.name_suffix);
        L.INSTANCE.d(this.component1, "Customer First Name " + strReplace$default, new Object[0]);
        L.INSTANCE.d(this.component1, "Customer Greeting " + str, new Object[0]);
        FragmentSfcProfileBinding fragmentSfcProfileBinding4 = this.copydefault;
        if (fragmentSfcProfileBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSfcProfileBinding4 = null;
        }
        fragmentSfcProfileBinding4.tvName.setText(str);
        FragmentSfcProfileBinding fragmentSfcProfileBinding5 = this.copydefault;
        if (fragmentSfcProfileBinding5 == null) {
            int i5 = getRequestBeneficiariesState + 53;
            copy = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i6 == 0) {
                int i7 = 29 / 0;
            }
        } else {
            fragmentSfcProfileBinding = fragmentSfcProfileBinding5;
        }
        fragmentSfcProfileBinding.tvTime.setText(TimestampFormatterUtil.INSTANCE.formatTimeToGreet());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void component1(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment.getRequestBeneficiariesState
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment.copy = r2
            int r1 = r1 % r0
            r3 = 0
            java.lang.String r4 = ""
            r5 = 0
            if (r1 != 0) goto L1a
            com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcProfileBinding r1 = r7.copydefault
            r6 = 8
            int r6 = r6 / r3
            if (r1 != 0) goto L33
            goto L1e
        L1a:
            com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcProfileBinding r1 = r7.copydefault
            if (r1 != 0) goto L33
        L1e:
            int r2 = r2 + 111
            int r1 = r2 % 128
            com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment.getRequestBeneficiariesState = r1
            int r2 = r2 % r0
            if (r2 != 0) goto L2c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r1 = r5
            goto L33
        L2c:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r5.hashCode()
            throw r5
        L33:
            androidx.cardview.widget.CardView r1 = r1.cardAbbr
            r1.setVisibility(r3)
            com.huawei.digitalpayment.consumer.base.util.DefaultAvatarDisplayUtil r1 = com.huawei.digitalpayment.consumer.base.util.DefaultAvatarDisplayUtil.INSTANCE
            com.huawei.digitalpayment.consumer.homeui.databinding.FragmentSfcProfileBinding r2 = r7.copydefault
            if (r2 != 0) goto L51
            int r2 = com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment.getRequestBeneficiariesState
            int r2 = r2 + 79
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment.copy = r3
            int r2 = r2 % r0
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            if (r2 == 0) goto L4d
            goto L52
        L4d:
            r5.hashCode()
            throw r5
        L51:
            r5 = r2
        L52:
            android.widget.TextView r0 = r5.tvAbbr
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r1.displayDefaultAvatar(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCProfileFragment.component1(java.lang.String):void");
    }

    private final void equals() {
        int i = 2 % 2;
        WelcomeTutorialViewModel welcomeTutorialViewModelComponent2 = component2();
        welcomeTutorialViewModelComponent2.registerHighlightData(1, R.string.one_app_walkthrough_title_profile, R.string.one_app_walkthrough_content_profile, ArrowAlignment.TopLeft);
        welcomeTutorialViewModelComponent2.registerHighlightData(2, R.string.one_app_walkthrough_title_search, R.string.one_app_walkthrough_content_search, ArrowAlignment.TopRight);
        FragmentSfcProfileBinding fragmentSfcProfileBinding = this.copydefault;
        FragmentSfcProfileBinding fragmentSfcProfileBinding2 = null;
        if (fragmentSfcProfileBinding == null) {
            int i2 = copy + 17;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = copy + 51;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            fragmentSfcProfileBinding = null;
        }
        welcomeTutorialViewModelComponent2.registerHighlight(1, new WelcomeTutorialRectProvider.XmlRectProvider(CollectionsKt.listOf(fragmentSfcProfileBinding.profileTutorialWrapper)));
        FragmentSfcProfileBinding fragmentSfcProfileBinding3 = this.copydefault;
        if (fragmentSfcProfileBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentSfcProfileBinding2 = fragmentSfcProfileBinding3;
        }
        welcomeTutorialViewModelComponent2.registerHighlight(2, new WelcomeTutorialRectProvider.XmlRectProvider(CollectionsKt.listOf(fragmentSfcProfileBinding2.cardSearch)));
    }

    public static void m10523$r8$lambda$6EKFW_K36zimRBEzcu3HQPvtc(View view) {
        int i = 2 % 2;
        int i2 = copy + 55;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            copydefault(new Object[]{view}, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), -1164634441, 1164634444, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1());
            int i3 = 41 / 0;
        } else {
            copydefault(new Object[]{view}, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), -1164634441, 1164634444, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1());
        }
        int i4 = getRequestBeneficiariesState + 19;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
    }

    public static void $r8$lambda$L72HPO0HDmI4uA2s0WKVXX_KEsc(SFCProfileFragment sFCProfileFragment, View view) {
        int i = 2 % 2;
        int i2 = copy + 55;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        getAsAtTimestamp(sFCProfileFragment, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 87;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$VojXgHQn2ajREVia1dnlykMruUY(SFCProfileFragment sFCProfileFragment, View view) {
        int i = 2 % 2;
        int i2 = copy + 63;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        component2(sFCProfileFragment, view);
        int i4 = copy + 61;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$oK2Oy8gjgdDFePRRGdSzKVjUGAc(View view) {
        int i = 2 % 2;
        int i2 = copy + 85;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        component1(view);
        int i4 = getRequestBeneficiariesState + 33;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10524$r8$lambda$qrbuia34fNJi5uksaU8MNrJhg(View view, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 95;
        copy = i2 % 128;
        int i3 = i2 % 2;
        component3(view, str);
        int i4 = getRequestBeneficiariesState + 83;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static Unit $r8$lambda$rS1twVpNC7npwiSz49DK3cRgZkg(SFCProfileFragment sFCProfileFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 57;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent3 = component3(sFCProfileFragment, resource);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        int i5 = copy + 105;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return unitComponent3;
    }

    public static void m10525$r8$lambda$raG1WFnCqkk8vHPw8Fqi7GBBig(SFCProfileFragment sFCProfileFragment, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 53;
        copy = i2 % 128;
        int i3 = i2 % 2;
        copydefault(new Object[]{sFCProfileFragment, view}, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), -956873128, 956873129, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1());
        int i4 = getRequestBeneficiariesState + 7;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m10526$r8$lambda$saq7W0QEde8s6cDE16Nv1uhXDM(SFCProfileFragment sFCProfileFragment, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 41;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(sFCProfileFragment, view);
        int i4 = copy + 87;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static Unit m10527$r8$lambda$vdq51JJPYJMoHYX_3o9xNXAWpo(SFCProfileFragment sFCProfileFragment, UnreadState unreadState) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 57;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(sFCProfileFragment, unreadState);
        int i4 = getRequestBeneficiariesState + 13;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return unitCopydefault;
    }

    static {
        if (51 % 2 == 0) {
            throw null;
        }
    }

    private final void copydefault() {
        copydefault(new Object[]{this}, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), 414917045, -414917043, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1());
    }

    private static void ShareDataUIState(SFCProfileFragment sFCProfileFragment, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                component1(sFCProfileFragment, view);
                return;
            }
            component1(sFCProfileFragment, view);
            Callback.onClick_exit();
            Object obj = null;
            obj.hashCode();
            throw null;
        } finally {
            Callback.onClick_exit();
        }
    }

    private static void component2(SFCProfileFragment sFCProfileFragment, View view) {
        int i = 2 % 2;
        int i2 = copy + 43;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            equals(sFCProfileFragment, view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 125;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void getAsAtTimestamp(SFCProfileFragment sFCProfileFragment, View view) {
        int i = 2 % 2;
        int i2 = copy + 115;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                copydefault(sFCProfileFragment, view);
                Callback.onClick_exit();
                int i4 = 25 / 0;
            } else {
                copydefault(sFCProfileFragment, view);
                Callback.onClick_exit();
            }
            int i5 = copy + 35;
            getRequestBeneficiariesState = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void component1(View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 21;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            component3(view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 63;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private final void component4() {
        copydefault(new Object[]{this}, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), 893683535, -893683535, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1());
    }

    private static final void ShareDataUIState(View view) {
        copydefault(new Object[]{view}, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), -94522513, 94522517, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1());
    }

    private static Object ShareDataUIState(Object[] objArr) {
        SFCProfileFragment sFCProfileFragment = (SFCProfileFragment) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 125;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                component3(sFCProfileFragment, view);
                return null;
            }
            component3(sFCProfileFragment, view);
            Callback.onClick_exit();
            obj.hashCode();
            throw null;
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX WARN: Finally extract failed */
    private static Object component3(Object[] objArr) {
        View view = (View) objArr[0];
        int i = 2 % 2;
        int i2 = copy + 45;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                copydefault(new Object[]{view}, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), -94522513, 94522517, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1());
                Callback.onClick_exit();
                obj.hashCode();
                throw null;
            }
            copydefault(new Object[]{view}, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1(), -94522513, 94522517, Event.AnonymousClass1.component1(), Event.AnonymousClass1.component1());
            Callback.onClick_exit();
            int i4 = copy + 121;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static Object component1(Object[] objArr) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 15;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }
}
