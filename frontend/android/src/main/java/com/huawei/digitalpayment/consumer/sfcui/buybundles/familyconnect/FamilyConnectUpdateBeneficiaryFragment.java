package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.profileinstaller.ProfileVerifier;
import com.huawei.common.exception.BaseException;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.Beneficiary;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.ui.manage.UpdateBeneficiaryScreenKt;
import com.huawei.digitalpayment.consumer.sfcui.components.toast.ToastHelperKt;
import com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType;
import com.huawei.payment.mvvm.Resource;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectUpdateBeneficiaryFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcComposeFragment;", "<init>", "()V", "familyConnectViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "getFamilyConnectViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "familyConnectViewModel$delegate", "Lkotlin/Lazy;", "currentOperation", "", "isManagingBeneficiary", "Landroidx/compose/runtime/MutableState;", "", "newLimit", "handleBackAction", "", "userMsisdn", "getUserMsisdn", "()Ljava/lang/String;", "userMsisdn$delegate", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "updateBeneficiary", "observeViewModel", "ConsumerSfcUI_release", "formState", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/UpdateBeneficiaryFormState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FamilyConnectUpdateBeneficiaryFragment extends Hilt_FamilyConnectUpdateBeneficiaryFragment {
    public static final int $stable = 8;
    private static char[] equals;
    private static int getRequestBeneficiariesState;
    private String component2;
    private final Lazy copydefault;
    private static final byte[] $$c = {69, -50, 81, 75};
    private static final int $$d = 148;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {68, -59, -116, 119, -38, -24, -29, -25, -25, -17, -35, -32, 39};
    private static final int $$b = 182;
    private static int component4 = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private final MutableState<Boolean> component3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private String ShareDataUIState = "";
    private final Lazy component1 = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = copydefault + 1;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str$r8$lambda$pAJGTTvInNk1EXYEPULDK9IxcUk = FamilyConnectUpdateBeneficiaryFragment.$r8$lambda$pAJGTTvInNk1EXYEPULDK9IxcUk();
            int i4 = ShareDataUIState + 7;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return str$r8$lambda$pAJGTTvInNk1EXYEPULDK9IxcUk;
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Observer, FunctionAdapter {
        private static int component1 = 0;
        private static int copydefault = 1;
        private final Function1 component3;

        copydefault(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 1;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i3 + 53;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = copydefault + 63;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.component3;
            if (i3 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 91;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component1 + 63;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 41;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                this.component3.invoke(obj);
                throw null;
            }
            this.component3.invoke(obj);
            int i3 = component1 + 115;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r6, byte r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r8 = r8 + 110
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment.$$c
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L25
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
        L25:
            int r8 = r8 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment.$$e(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 99 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment.$$a
            int r6 = r6 * 4
            int r1 = 10 - r6
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            int r6 = 9 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-26)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment.b(int, short, short, java.lang.Object[]):void");
    }

    public static final FamilyConnectViewModel access$getFamilyConnectViewModel(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        copy = i2 % 128;
        int i3 = i2 % 2;
        FamilyConnectViewModel familyConnectViewModelCopydefault = familyConnectUpdateBeneficiaryFragment.copydefault();
        int i4 = getAsAtTimestamp + 15;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 64 / 0;
        }
        return familyConnectViewModelCopydefault;
    }

    public static final MutableState access$isManagingBeneficiary$p(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 93;
        copy = i3 % 128;
        int i4 = i3 % 2;
        MutableState<Boolean> mutableState = familyConnectUpdateBeneficiaryFragment.component3;
        int i5 = i2 + 97;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableState;
        }
        throw null;
    }

    public static final void access$setNewLimit$p(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment, String str) {
        int i = 2 % 2;
        int i2 = copy + 109;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        familyConnectUpdateBeneficiaryFragment.ShareDataUIState = str;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
    }

    public static final void access$updateBeneficiary(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment) throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 75;
        copy = i2 % 128;
        int i3 = i2 % 2;
        familyConnectUpdateBeneficiaryFragment.component2();
        int i4 = copy + 45;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public FamilyConnectUpdateBeneficiaryFragment() {
        final FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment = this;
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(familyConnectUpdateBeneficiaryFragment, Reflection.getOrCreateKotlinClass(FamilyConnectViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 99;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    invoke();
                    throw null;
                }
                ViewModelStore viewModelStoreInvoke = invoke();
                int i3 = component1 + 75;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 111;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = familyConnectUpdateBeneficiaryFragment.requireActivity().getViewModelStore();
                int i4 = component3 + 15;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewModelStore;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1 + 63;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component1 + 87;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 90 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
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
                    kotlin.jvm.functions.Function0 r1 = r1
                    if (r1 == 0) goto L23
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment$special$$inlined$activityViewModels$default$2.component1
                    int r2 = r2 + 21
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment$special$$inlined$activityViewModels$default$2.component2 = r3
                    int r2 = r2 % r0
                    if (r2 != 0) goto L1b
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L2d
                    goto L23
                L1b:
                    java.lang.Object r0 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
                    r0 = 0
                    throw r0
                L23:
                    androidx.fragment.app.Fragment r1 = r2
                    androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                L2d:
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment$special$$inlined$activityViewModels$default$2.component1
                    int r2 = r2 + 7
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment$special$$inlined$activityViewModels$default$2.component2 = r3
                    int r2 = r2 % r0
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment$special$$inlined$activityViewModels$default$2.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 101;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i3 = component1 + 117;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 97 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 29;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    familyConnectUpdateBeneficiaryFragment.requireActivity().getDefaultViewModelProviderFactory();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = familyConnectUpdateBeneficiaryFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i3 = component1 + 101;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
    }

    private final FamilyConnectViewModel copydefault() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 7;
        copy = i2 % 128;
        int i3 = i2 % 2;
        FamilyConnectViewModel familyConnectViewModel = (FamilyConnectViewModel) this.copydefault.getValue();
        int i4 = getAsAtTimestamp + 85;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return familyConnectViewModel;
        }
        throw null;
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 113;
        copy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            copydefault().previousScreen();
            obj.hashCode();
            throw null;
        }
        copydefault().previousScreen();
        int i3 = copy + 67;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final String component1() {
        int i = 2 % 2;
        int i2 = copy + 73;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.component1.getValue();
        int i4 = copy + 99;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String copy() {
        int i = 2 % 2;
        int i2 = copy + 99;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strReplaceFirst$default = StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null);
        int i4 = getAsAtTimestamp + 29;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return strReplaceFirst$default;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int component1 = 0;
        private static int copy = 1;
        final Beneficiary ShareDataUIState;
        final BeneficiaryBalance component3;
        final FamilyConnectBalanceResponse copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            private static int component1 = 0;
            private static int component4 = 1;
            final FamilyConnectBalanceResponse ShareDataUIState;
            final BeneficiaryBalance component2;
            final FamilyConnectUpdateBeneficiaryFragment component3;
            final Beneficiary copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component4 + 41;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                copydefault(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = component4 + 7;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            public final void copydefault(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = component1;
                int i4 = i3 + 37;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                if ((i & 11) == 2) {
                    int i6 = i3 + 7;
                    component4 = i6 % 128;
                    int i7 = i6 % 2;
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    } else {
                        int i8 = component1 + 55;
                        component4 = i8 % 128;
                        int i9 = i8 % 2;
                    }
                }
                if (((Boolean) FamilyConnectUpdateBeneficiaryFragment.access$isManagingBeneficiary$p(this.component3).getValue()).booleanValue()) {
                    int i10 = component4 + 107;
                    component1 = i10 % 128;
                    if (i10 % 2 != 0) {
                        DialogUtils.showLoading(this.component3.requireActivity());
                        throw null;
                    }
                    DialogUtils.showLoading(this.component3.requireActivity());
                } else {
                    DialogUtils.showOrHideLoading(this.component3.requireActivity(), Resource.success(null));
                }
                FamilyConnectUpdateBeneficiaryFragment.access$getFamilyConnectViewModel(this.component3);
                double sponsorBalance = this.ShareDataUIState.getSponsorBalance();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                final String str = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(sponsorBalance)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                BeneficiaryBalance beneficiaryBalance = this.component2;
                String string = beneficiaryBalance != null ? Double.valueOf(beneficiaryBalance.getAmount()).toString() : null;
                final String str2 = string == null ? "" : string;
                State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(FamilyConnectUpdateBeneficiaryFragment.access$getFamilyConnectViewModel(this.component3).getUpdateBeneficiaryFormState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.component3);
                boolean zBooleanValue = ((Boolean) FamilyConnectUpdateBeneficiaryFragment.access$isManagingBeneficiary$p(this.component3).getValue()).booleanValue();
                String amountError = component2((State<UpdateBeneficiaryFormState>) stateCollectAsStateWithLifecycle).getAmountError();
                boolean zIsFormValid = component2((State<UpdateBeneficiaryFormState>) stateCollectAsStateWithLifecycle).isFormValid();
                final FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment = this.component3;
                Beneficiary beneficiary = this.copydefault;
                final FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment2 = this.component3;
                UpdateBeneficiaryScreenKt.UpdateBeneficiaryScreen(new Function2() {
                    private static int ShareDataUIState = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke(Object obj, Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = copydefault + 25;
                        ShareDataUIState = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unitComponent1 = FamilyConnectUpdateBeneficiaryFragment.component1.AnonymousClass3.component1(familyConnectUpdateBeneficiaryFragment, (String) obj, (PinValidationType) obj2);
                        int i14 = ShareDataUIState + 15;
                        copydefault = i14 % 128;
                        int i15 = i14 % 2;
                        return unitComponent1;
                    }
                }, anonymousClass1, beneficiary, str2, str, modifierFillMaxSize$default, zBooleanValue, new Function1() {
                    private static int component3 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke(Object obj) {
                        int i11 = 2 % 2;
                        int i12 = component3 + 49;
                        copydefault = i12 % 128;
                        int i13 = i12 % 2;
                        FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment3 = familyConnectUpdateBeneficiaryFragment2;
                        if (i13 == 0) {
                            return FamilyConnectUpdateBeneficiaryFragment.component1.AnonymousClass3.ShareDataUIState(familyConnectUpdateBeneficiaryFragment3, str2, str, (String) obj);
                        }
                        FamilyConnectUpdateBeneficiaryFragment.component1.AnonymousClass3.ShareDataUIState(familyConnectUpdateBeneficiaryFragment3, str2, str, (String) obj);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                }, amountError, zIsFormValid, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
                int i11 = component1 + 25;
                component4 = i11 % 128;
                int i12 = i11 % 2;
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;

                public final void component2() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 65;
                    copydefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        ((FamilyConnectUpdateBeneficiaryFragment) this.receiver).handleBackAction();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    ((FamilyConnectUpdateBeneficiaryFragment) this.receiver).handleBackAction();
                    int i3 = copydefault + 75;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = copydefault + 41;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    component2();
                    Unit unit = Unit.INSTANCE;
                    if (i3 != 0) {
                        int i4 = 68 / 0;
                    }
                    return unit;
                }

                AnonymousClass1(Object obj) {
                    super(0, obj, FamilyConnectUpdateBeneficiaryFragment.class, "handleBackAction", "handleBackAction()V", 0);
                }
            }

            private static final void component3(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment) throws Throwable {
                int i = 2 % 2;
                int i2 = component4 + 91;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(familyConnectUpdateBeneficiaryFragment, "");
                FamilyConnectUpdateBeneficiaryFragment.access$updateBeneficiary(familyConnectUpdateBeneficiaryFragment);
                int i4 = component4 + 93;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }

            private static final Unit component3(final FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment, String str, PinValidationType pinValidationType) {
                int i = 2 % 2;
                int i2 = component4 + 5;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(familyConnectUpdateBeneficiaryFragment, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(pinValidationType, "");
                if (str.length() > 0) {
                    FamilyConnectUpdateBeneficiaryFragment.access$setNewLimit$p(familyConnectUpdateBeneficiaryFragment, str);
                    FamilyConnectUpdateBeneficiaryFragment.access$getFamilyConnectViewModel(familyConnectUpdateBeneficiaryFragment).showPinScreen(pinValidationType, new Runnable() {
                        private static int ShareDataUIState = 0;
                        private static int component2 = 1;

                        @Override
                        public final void run() throws Throwable {
                            int i4 = 2 % 2;
                            int i5 = ShareDataUIState + 111;
                            component2 = i5 % 128;
                            if (i5 % 2 == 0) {
                                FamilyConnectUpdateBeneficiaryFragment.component1.AnonymousClass3.component2(familyConnectUpdateBeneficiaryFragment);
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                            FamilyConnectUpdateBeneficiaryFragment.component1.AnonymousClass3.component2(familyConnectUpdateBeneficiaryFragment);
                            int i6 = ShareDataUIState + 35;
                            component2 = i6 % 128;
                            int i7 = i6 % 2;
                        }
                    });
                }
                Unit unit = Unit.INSTANCE;
                int i4 = component4 + 27;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component2(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment, String str, String str2, String str3) {
                int i = 2 % 2;
                int i2 = component4 + 119;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(familyConnectUpdateBeneficiaryFragment, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                FamilyConnectUpdateBeneficiaryFragment.access$getFamilyConnectViewModel(familyConnectUpdateBeneficiaryFragment).updateUpdateBeneficiaryForm(str3, str, str2);
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 55;
                component4 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            private static final UpdateBeneficiaryFormState component2(State<UpdateBeneficiaryFormState> state) {
                int i = 2 % 2;
                int i2 = component1 + 17;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                UpdateBeneficiaryFormState value = state.getValue();
                int i4 = component1 + 5;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                return value;
            }

            public static Unit ShareDataUIState(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment, String str, String str2, String str3) {
                int i = 2 % 2;
                int i2 = component1 + 103;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent2 = component2(familyConnectUpdateBeneficiaryFragment, str, str2, str3);
                int i4 = component1 + 95;
                component4 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 91 / 0;
                }
                return unitComponent2;
            }

            public static Unit component1(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment, String str, PinValidationType pinValidationType) {
                int i = 2 % 2;
                int i2 = component1 + 35;
                component4 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(familyConnectUpdateBeneficiaryFragment, str, pinValidationType);
                int i4 = component4 + 9;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent3;
            }

            public static void component2(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment) throws Throwable {
                int i = 2 % 2;
                int i2 = component4 + 63;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                component3(familyConnectUpdateBeneficiaryFragment);
                int i4 = component1 + 41;
                component4 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 75 / 0;
                }
            }

            AnonymousClass3(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment, BeneficiaryBalance beneficiaryBalance, Beneficiary beneficiary, FamilyConnectBalanceResponse familyConnectBalanceResponse) {
                this.component3 = familyConnectUpdateBeneficiaryFragment;
                this.component2 = beneficiaryBalance;
                this.copydefault = beneficiary;
                this.ShareDataUIState = familyConnectBalanceResponse;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 7;
            copy = i2 % 128;
            int i3 = i2 % 2;
            component1(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = copy + 67;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component1(androidx.compose.runtime.Composer r12, int r13) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                r13 = r13 & 11
                if (r13 != r0) goto L1b
                int r13 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment.component1.copy
                int r13 = r13 + 19
                int r1 = r13 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment.component1.component1 = r1
                int r13 = r13 % r0
                boolean r13 = r12.getSkipping()
                if (r13 != 0) goto L17
                goto L1b
            L17:
                r12.skipToGroupEnd()
                goto L43
            L1b:
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment$component1$3 r13 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment$component1$3
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment r7 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment.this
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance r8 = r11.component3
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.Beneficiary r9 = r11.ShareDataUIState
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse r10 = r11.copydefault
                r13.<init>(r7, r8, r9, r10)
                r7 = 54
                r8 = -100117653(0xfffffffffa08536b, float:-1.7696107E35)
                r9 = 1
                androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r8, r9, r13, r12, r7)
                r7 = r13
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r9 = 1572864(0x180000, float:2.204052E-39)
                r10 = 63
                r8 = r12
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            L43:
                int r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment.component1.copy
                int r12 = r12 + 93
                int r13 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment.component1.component1 = r13
                int r12 = r12 % r0
                if (r12 != 0) goto L4f
                return
            L4f:
                r12 = 0
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment.component1.component1(androidx.compose.runtime.Composer, int):void");
        }

        component1(BeneficiaryBalance beneficiaryBalance, Beneficiary beneficiary, FamilyConnectBalanceResponse familyConnectBalanceResponse) {
            this.component3 = beneficiaryBalance;
            this.ShareDataUIState = beneficiary;
            this.copydefault = familyConnectBalanceResponse;
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        Object next;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 43;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        ShareDataUIState();
        FamilyConnectBalanceResponse balanceResponse = copydefault().getBalanceResponse();
        if (balanceResponse == null) {
            return;
        }
        Beneficiary selectedBeneficiary = copydefault().getSelectedBeneficiary();
        Iterator<T> it = balanceResponse.getBeneficiaryBalances().iterator();
        while (true) {
            string = null;
            if (!it.hasNext()) {
                int i4 = copy + 91;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                next = null;
                break;
            }
            int i6 = getAsAtTimestamp + 119;
            copy = i6 % 128;
            int i7 = i6 % 2;
            next = it.next();
            if (Intrinsics.areEqual(((BeneficiaryBalance) next).getBeneficiaryMsisdn(), selectedBeneficiary.getPhoneNumber())) {
                break;
            }
        }
        BeneficiaryBalance beneficiaryBalance = (BeneficiaryBalance) next;
        copydefault();
        double sponsorBalance = balanceResponse.getSponsorBalance();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(sponsorBalance)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        if (beneficiaryBalance != null) {
            int i8 = getAsAtTimestamp + 41;
            copy = i8 % 128;
            int i9 = i8 % 2;
            string = Double.valueOf(beneficiaryBalance.getAmount()).toString();
        }
        if (string == null) {
            int i10 = copy + 89;
            getAsAtTimestamp = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 9 / 0;
            }
        } else {
            str = string;
        }
        copydefault().updateUpdateBeneficiaryForm(str, str, str2);
        getBinding().getRoot().setContent(ComposableLambdaKt.composableLambdaInstance(-766631416, true, new component1(beneficiaryBalance, selectedBeneficiary, balanceResponse)));
    }

    @Override
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 47;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroyView();
            copydefault().resetUpdateBeneficiaryForm();
            int i3 = 60 / 0;
        } else {
            super.onDestroyView();
            copydefault().resetUpdateBeneficiaryForm();
        }
        int i4 = getAsAtTimestamp + 91;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void a(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = equals;
        char c2 = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 657, 13 - TextUtils.lastIndexOf("", c2, 0, 0), (char) (65118 - KeyEvent.keyCodeFromString("")), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i8 = $10 + 45;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char c3 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4502 - Drawable.resolveOpacity(0, 0), 36 - View.MeasureSpec.getMode(0), (char) (27897 - TextUtils.indexOf("", "")), -1464227204, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i10] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - (ViewConfiguration.getLongPressTimeout() >> 16), 28 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (Process.myPid() >> 22), 1180380354, false, $$e(b4, b5, (byte) (b5 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr5[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 1859, 34 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 80302927, false, $$e(b6, b6, (byte) $$c.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i12, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i12);
        }
        if (!(!z)) {
            int i13 = $10 + 99;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i14 = $11 + 53;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    cArr[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(iTrustedWebActivityService_Parcel.copydefault * i4) >>> 1];
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
                int i15 = $11 + 101;
                $10 = i15 % 128;
                int i16 = i15 % 2;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void component2() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectUpdateBeneficiaryFragment.component2():void");
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        copydefault().getManageBeneficiaryData().observe(getViewLifecycleOwner(), new copydefault(new Function1() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 11;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Unit unitM11291$r8$lambda$6LuWzCKalm_F8bywieGV9zEVlU = FamilyConnectUpdateBeneficiaryFragment.m11291$r8$lambda$6LuWzCKalm_F8bywieGV9zEVlU(this.f$0, (Resource) obj);
                int i5 = component3 + 63;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return unitM11291$r8$lambda$6LuWzCKalm_F8bywieGV9zEVlU;
            }
        }));
        int i2 = getAsAtTimestamp + 111;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void component3(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(familyConnectUpdateBeneficiaryFragment, "");
        FamilyConnectViewModel.showDashboard$default(familyConnectUpdateBeneficiaryFragment.copydefault(), null, 1, null);
        familyConnectUpdateBeneficiaryFragment.copydefault().familyConnectQueryBalance(new FamilyConnectCheckStatusPayload(familyConnectUpdateBeneficiaryFragment.component1()));
        int i2 = getAsAtTimestamp + 75;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit ShareDataUIState(final FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment, Resource resource) {
        String message;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(familyConnectUpdateBeneficiaryFragment, "");
        if (resource.loading()) {
            DialogUtils.showLoading(familyConnectUpdateBeneficiaryFragment);
            int i4 = copy + 35;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        } else if (resource.success()) {
            FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment2 = familyConnectUpdateBeneficiaryFragment;
            DialogUtils.hideLoading(familyConnectUpdateBeneficiaryFragment2);
            FamilyConnectViewModel familyConnectViewModelCopydefault = familyConnectUpdateBeneficiaryFragment.copydefault();
            Object data = resource.getData();
            String string = familyConnectUpdateBeneficiaryFragment.getString(R.string.bundle_allocation_has_been_updated_successfully);
            Intrinsics.checkNotNullExpressionValue(string, "");
            ToastHelperKt.showCustomToast$default(familyConnectUpdateBeneficiaryFragment2, familyConnectViewModelCopydefault.extractCustomerMessage(data, string), 1000L, (Integer) null, (String) null, (Function0) null, 28, (Object) null);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                private static int ShareDataUIState = 1;
                private static int component3;

                @Override
                public final void run() {
                    int i6 = 2 % 2;
                    int i7 = ShareDataUIState + 49;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                    FamilyConnectUpdateBeneficiaryFragment.m11292$r8$lambda$LvntB4ttNLuSKhNzPeqot9QZd8(this.f$0);
                    if (i8 != 0) {
                        throw null;
                    }
                }
            }, 1000L);
        } else if (resource.error()) {
            FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment3 = familyConnectUpdateBeneficiaryFragment;
            DialogUtils.hideLoading(familyConnectUpdateBeneficiaryFragment3);
            FamilyConnectViewModel familyConnectViewModelCopydefault2 = familyConnectUpdateBeneficiaryFragment.copydefault();
            Object data2 = resource.getData();
            BaseException exception = resource.getException();
            if (exception == null || (message = exception.getMessage()) == null) {
                int i6 = copy + 75;
                getAsAtTimestamp = i6 % 128;
                int i7 = i6 % 2;
                message = "Failed to update beneficiary";
            }
            ToastHelperKt.showCustomToast$default(familyConnectUpdateBeneficiaryFragment3, familyConnectViewModelCopydefault2.extractCustomerMessage(data2, message), 5000L, (Integer) null, (String) null, (Function0) null, 28, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static Unit m11291$r8$lambda$6LuWzCKalm_F8bywieGV9zEVlU(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 43;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShareDataUIState = ShareDataUIState(familyConnectUpdateBeneficiaryFragment, resource);
        int i4 = copy + 97;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return unitShareDataUIState;
    }

    public static void m11292$r8$lambda$LvntB4ttNLuSKhNzPeqot9QZd8(FamilyConnectUpdateBeneficiaryFragment familyConnectUpdateBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 55;
        copy = i2 % 128;
        int i3 = i2 % 2;
        component3(familyConnectUpdateBeneficiaryFragment);
        int i4 = getAsAtTimestamp + 55;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static String $r8$lambda$pAJGTTvInNk1EXYEPULDK9IxcUk() {
        int i = 2 % 2;
        int i2 = copy + 105;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String strCopy = copy();
        int i4 = copy + 23;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return strCopy;
    }

    static {
        getRequestBeneficiariesState = 0;
        component3();
        int i = component4 + 27;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        equals = new char[]{33457, 33341, 33339, 33337, 33332, 33336, 33342, 33307, 33302, 33331, 33300, 33380, 33342, 33326, 33329, 33336, 33339, 33292, 33293, 33335, 33339, 33341, 33517, 33463, 33465, 33463, 33454, 33459, 33467, 33412, 33412, 33468, 33465, 33455, 33457, 33460, 33462, 33514, 33460, 33462, 33459, 33452, 33449, 33465, 33439, 33429, 33461, 33464, 33465, 33426, 33432, 33460, 33460, 33515, 33465, 33467, 33462, 33454, 33457, 33457, 33449, 33471, 33419, 33461, 33458, 33418, 33414, 33462, 33467};
    }
}
