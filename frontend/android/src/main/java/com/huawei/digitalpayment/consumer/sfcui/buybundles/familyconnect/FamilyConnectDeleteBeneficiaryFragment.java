package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect;

import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.Beneficiary;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload;
import com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Iterator;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectDeleteBeneficiaryFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcBottomSheetFragment;", "<init>", "()V", "familyConnectViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "getFamilyConnectViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "familyConnectViewModel$delegate", "Lkotlin/Lazy;", "currentOperation", "", "isManagingBeneficiary", "Landroidx/compose/runtime/MutableState;", "", "userMsisdn", "getUserMsisdn", "()Ljava/lang/String;", "userMsisdn$delegate", "handleBackAction", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupBackHandling", "deleteBeneficiary", "observeViewModel", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FamilyConnectDeleteBeneficiaryFragment extends Hilt_FamilyConnectDeleteBeneficiaryFragment {
    private static final String component1;
    private static int component4 = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final Lazy component2;
    private String copydefault;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final MutableState<Boolean> ShareDataUIState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final Lazy component3 = LazyKt.lazy(new Function0() {
        private static int component1 = 1;
        private static int copydefault;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component1 + 25;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return FamilyConnectDeleteBeneficiaryFragment.m11290$r8$lambda$izhOGFW9m8Ue_fxOoHlhm8vrc();
            }
            FamilyConnectDeleteBeneficiaryFragment.m11290$r8$lambda$izhOGFW9m8Ue_fxOoHlhm8vrc();
            throw null;
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private static int component2 = 0;
        private static int copydefault = 1;
        private final Function1 component3;

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof Observer)) {
                return false;
            }
            int i2 = component2 + 81;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 52 / 0;
                if (!(obj instanceof FunctionAdapter)) {
                    return false;
                }
            } else if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i4 = component2 + 81;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return zAreEqual;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component2 + 13;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.component3;
            int i5 = i3 + 113;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 77;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = copydefault + 21;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 53;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.component3.invoke(obj);
            int i4 = component2 + 35;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 80 / 0;
            }
        }
    }

    public static final void access$deleteBeneficiary(FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = component4 + 103;
        equals = i2 % 128;
        int i3 = i2 % 2;
        familyConnectDeleteBeneficiaryFragment.ShareDataUIState();
        int i4 = equals + 5;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final FamilyConnectViewModel access$getFamilyConnectViewModel(FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = component4 + 5;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return familyConnectDeleteBeneficiaryFragment.copydefault();
        }
        familyConnectDeleteBeneficiaryFragment.copydefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String access$getTAG$cp() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 17;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = component1;
        int i5 = i2 + 103;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final MutableState access$isManagingBeneficiary$p(FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = component4 + 115;
        equals = i2 % 128;
        int i3 = i2 % 2;
        MutableState<Boolean> mutableState = familyConnectDeleteBeneficiaryFragment.ShareDataUIState;
        if (i3 != 0) {
            return mutableState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectDeleteBeneficiaryFragment$Companion;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        private Companion() {
        }

        public final String getTAG() {
            int i = 2 % 2;
            int i2 = copydefault + 83;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String strAccess$getTAG$cp = FamilyConnectDeleteBeneficiaryFragment.access$getTAG$cp();
            int i4 = ShareDataUIState + 91;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return strAccess$getTAG$cp;
            }
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FamilyConnectDeleteBeneficiaryFragment() {
        final FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment = this;
        final Function0 function0 = null;
        this.component2 = FragmentViewModelLazyKt.createViewModelLazy(familyConnectDeleteBeneficiaryFragment, Reflection.getOrCreateKotlinClass(FamilyConnectViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 85;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component2 + 115;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 105;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = familyConnectDeleteBeneficiaryFragment.requireActivity().getViewModelStore();
                int i4 = component2 + 73;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 53;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component1 + 77;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return creationExtrasInvoke;
                }
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                int i = 2 % 2;
                int i2 = component1 + 35;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = familyConnectDeleteBeneficiaryFragment.requireActivity().getDefaultViewModelCreationExtras();
                int i4 = component1 + 113;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 55;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component1 + 109;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 107;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = familyConnectDeleteBeneficiaryFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i4 = component2 + 69;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 23 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
    }

    static {
        Intrinsics.checkNotNullExpressionValue("FamilyConnectDeleteBeneficiaryFragment", "");
        component1 = "FamilyConnectDeleteBeneficiaryFragment";
        int i = getRequestBeneficiariesState + 13;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    private final FamilyConnectViewModel copydefault() {
        int i = 2 % 2;
        int i2 = component4 + 59;
        equals = i2 % 128;
        int i3 = i2 % 2;
        FamilyConnectViewModel familyConnectViewModel = (FamilyConnectViewModel) this.component2.getValue();
        if (i3 != 0) {
            return familyConnectViewModel;
        }
        throw null;
    }

    private final String component3() {
        int i = 2 % 2;
        int i2 = equals + 57;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.component3.getValue();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    private static final String getAsAtTimestamp() {
        String string;
        String countryCode;
        String str;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = equals + 91;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            string = SPUtils.getInstance().getString("recent_login_phone_number");
            Intrinsics.checkNotNullExpressionValue(string, "");
            countryCode = SfcPhoneNumberUtil.INSTANCE.getCountryCode();
            str = "";
            z = false;
            i = 5;
        } else {
            string = SPUtils.getInstance().getString("recent_login_phone_number");
            Intrinsics.checkNotNullExpressionValue(string, "");
            countryCode = SfcPhoneNumberUtil.INSTANCE.getCountryCode();
            str = "";
            z = false;
            i = 4;
        }
        return StringsKt.replaceFirst$default(string, countryCode, str, z, i, (Object) null);
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = component4 + 83;
        equals = i2 % 128;
        int i3 = i2 % 2;
        dismiss();
        copydefault().previousScreen();
        int i4 = component4 + 3;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int component2 = 0;
        private static int component3 = 1;
        final Beneficiary copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int component2 = 0;
            private static int copydefault = 1;
            final FamilyConnectDeleteBeneficiaryFragment ShareDataUIState;
            final Beneficiary component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = copydefault + 103;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                component1(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 75;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int component2 = 1;
                private static int copydefault;

                public final void ShareDataUIState() {
                    int i = 2 % 2;
                    int i2 = component2 + 53;
                    copydefault = i2 % 128;
                    Object obj = null;
                    if (i2 % 2 != 0) {
                        ((FamilyConnectDeleteBeneficiaryFragment) this.receiver).handleBackAction();
                        throw null;
                    }
                    ((FamilyConnectDeleteBeneficiaryFragment) this.receiver).handleBackAction();
                    int i3 = component2 + 33;
                    copydefault = i3 % 128;
                    if (i3 % 2 == 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = copydefault + 59;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    ShareDataUIState();
                    Unit unit = Unit.INSTANCE;
                    int i4 = component2 + 67;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }

                AnonymousClass3(Object obj) {
                    super(0, obj, FamilyConnectDeleteBeneficiaryFragment.class, "handleBackAction", "handleBackAction()V", 0);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component1(androidx.compose.runtime.Composer r10, int r11) {
                /*
                    r9 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    r11 = r11 & 11
                    if (r11 != r0) goto L1b
                    boolean r11 = r10.getSkipping()
                    if (r11 != 0) goto L17
                    int r11 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.component1.AnonymousClass1.copydefault
                    int r11 = r11 + 67
                    int r1 = r11 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.component1.AnonymousClass1.component2 = r1
                    int r11 = r11 % r0
                    goto L1b
                L17:
                    r10.skipToGroupEnd()
                    goto L6e
                L1b:
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment r11 = r9.ShareDataUIState
                    androidx.compose.runtime.MutableState r11 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.access$isManagingBeneficiary$p(r11)
                    java.lang.Object r11 = r11.getValue()
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L37
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment r11 = r9.ShareDataUIState
                    androidx.fragment.app.FragmentActivity r11 = r11.requireActivity()
                    com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r11)
                    goto L45
                L37:
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment r11 = r9.ShareDataUIState
                    androidx.fragment.app.FragmentActivity r11 = r11.requireActivity()
                    r1 = 0
                    com.huawei.payment.mvvm.Resource r1 = com.huawei.payment.mvvm.Resource.success(r1)
                    com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showOrHideLoading(r11, r1)
                L45:
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment$component1$1$3 r11 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment$component1$1$3
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment r1 = r9.ShareDataUIState
                    r11.<init>(r1)
                    r2 = r11
                    kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.Beneficiary r3 = r9.component3
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment$onViewCreated$2$1$$ExternalSyntheticLambda0 r4 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment$onViewCreated$2$1$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment r11 = r9.ShareDataUIState
                    r4.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment r11 = r9.ShareDataUIState
                    androidx.compose.runtime.MutableState r11 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.access$isManagingBeneficiary$p(r11)
                    java.lang.Object r11 = r11.getValue()
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r5 = r11.booleanValue()
                    r7 = 0
                    r8 = 0
                    r6 = r10
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.ui.manage.DeleteBeneficiaryScreenKt.DeleteBeneficiaryScreen(r2, r3, r4, r5, r6, r7, r8)
                L6e:
                    int r10 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.component1.AnonymousClass1.copydefault
                    int r10 = r10 + 33
                    int r11 = r10 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.component1.AnonymousClass1.component2 = r11
                    int r10 = r10 % r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.component1.AnonymousClass1.component1(androidx.compose.runtime.Composer, int):void");
            }

            private static final void ShareDataUIState(FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment) {
                int i = 2 % 2;
                int i2 = copydefault + 75;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(familyConnectDeleteBeneficiaryFragment, "");
                    FamilyConnectDeleteBeneficiaryFragment.access$deleteBeneficiary(familyConnectDeleteBeneficiaryFragment);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(familyConnectDeleteBeneficiaryFragment, "");
                FamilyConnectDeleteBeneficiaryFragment.access$deleteBeneficiary(familyConnectDeleteBeneficiaryFragment);
                int i3 = component2 + 115;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            private static final Unit component2(final FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment, PinValidationType pinValidationType) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(familyConnectDeleteBeneficiaryFragment, "");
                Intrinsics.checkNotNullParameter(pinValidationType, "");
                FamilyConnectDeleteBeneficiaryFragment.access$getFamilyConnectViewModel(familyConnectDeleteBeneficiaryFragment).showPinScreen(pinValidationType, new Runnable() {
                    private static int component2 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final void run() {
                        int i2 = 2 % 2;
                        int i3 = component2 + 71;
                        copydefault = i3 % 128;
                        int i4 = i3 % 2;
                        FamilyConnectDeleteBeneficiaryFragment.component1.AnonymousClass1.component2(familyConnectDeleteBeneficiaryFragment);
                        int i5 = copydefault + 27;
                        component2 = i5 % 128;
                        int i6 = i5 % 2;
                    }
                });
                Unit unit = Unit.INSTANCE;
                int i2 = component2 + 3;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            public static void component2(FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment) {
                int i = 2 % 2;
                int i2 = copydefault + 125;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ShareDataUIState(familyConnectDeleteBeneficiaryFragment);
                int i4 = component2 + 105;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 88 / 0;
                }
            }

            public static Unit ShareDataUIState(FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment, PinValidationType pinValidationType) {
                int i = 2 % 2;
                int i2 = copydefault + 83;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent2 = component2(familyConnectDeleteBeneficiaryFragment, pinValidationType);
                int i4 = copydefault + 61;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitComponent2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass1(FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment, Beneficiary beneficiary) {
                this.ShareDataUIState = familyConnectDeleteBeneficiaryFragment;
                this.component3 = beneficiary;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 101;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 17;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void ShareDataUIState(Composer composer, int i) {
            int i2 = 2 % 2;
            if ((i & 11) == 2) {
                int i3 = component3 + 71;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    composer.getSkipping();
                    throw null;
                }
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    int i4 = component3 + 83;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-152365649, true, new AnonymousClass1(FamilyConnectDeleteBeneficiaryFragment.this, this.copydefault), composer, 54), composer, 1572864, 63);
        }

        component1(Beneficiary beneficiary) {
            this.copydefault = beneficiary;
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        component1();
        component2();
        FamilyConnectBalanceResponse balanceResponse = copydefault().getBalanceResponse();
        if (balanceResponse == null) {
            return;
        }
        Beneficiary selectedBeneficiary = copydefault().getSelectedBeneficiary();
        Iterator<T> it = balanceResponse.getBeneficiaryBalances().iterator();
        while (it.hasNext()) {
            int i2 = equals + 31;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 66 / 0;
                if (Intrinsics.areEqual(((BeneficiaryBalance) it.next()).getBeneficiaryMsisdn(), selectedBeneficiary.getPhoneNumber())) {
                    break;
                }
            } else if (Intrinsics.areEqual(((BeneficiaryBalance) it.next()).getBeneficiaryMsisdn(), selectedBeneficiary.getPhoneNumber())) {
                break;
            }
        }
        getBinding().composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-818879412, true, new component1(selectedBeneficiary)));
        int i4 = component4 + 107;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void component1() {
        int i = 2 % 2;
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback() {
            private static int component3 = 1;
            private static int copydefault;

            {
                super(true);
            }

            @Override
            public void handleOnBackPressed() {
                int i2 = 2 % 2;
                int i3 = copydefault + 25;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                this.ShareDataUIState.handleBackAction();
                if (i4 == 0) {
                    int i5 = 55 / 0;
                }
            }
        };
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback);
        int i2 = component4 + 89;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ShareDataUIState() {
        /*
            r13 = this;
            r0 = 2
            int r1 = r0 % r0
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectViewModel r1 = r13.copydefault()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBalanceResponse r1 = r1.getBalanceResponse()
            if (r1 != 0) goto Le
            return
        Le:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectViewModel r2 = r13.copydefault()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.Beneficiary r2 = r2.getSelectedBeneficiary()
            java.util.List r3 = r1.getBeneficiaryBalances()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L20:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance r6 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance) r6
            java.lang.String r6 = r6.getBeneficiaryMsisdn()
            java.lang.String r7 = r2.getPhoneNumber()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
            if (r6 == 0) goto L20
            goto L3e
        L3d:
            r4 = r5
        L3e:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance r4 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.BeneficiaryBalance) r4
            java.lang.String r3 = "2"
            r13.copydefault = r3
            androidx.compose.runtime.MutableState<java.lang.Boolean> r3 = r13.ShareDataUIState
            r6 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r3.setValue(r6)
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectViewModel r3 = r13.copydefault()
            if (r4 == 0) goto L5a
            java.lang.String r6 = r4.getBeneficiaryMsisdn()
            if (r6 != 0) goto L5e
        L5a:
            java.lang.String r6 = r2.getPhoneNumber()
        L5e:
            r8 = r6
            if (r4 == 0) goto L79
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.component4
            int r6 = r6 + 69
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.equals = r7
            int r6 = r6 % r0
            if (r6 == 0) goto L75
            java.lang.String r4 = r4.getBeneficiaryNickname()
            if (r4 != 0) goto L73
            goto L79
        L73:
            r9 = r4
            goto L96
        L75:
            r4.getBeneficiaryNickname()
            throw r5
        L79:
            java.lang.String r4 = r2.getFirstName()
            java.lang.String r2 = r2.getLastName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r9 = r2
        L96:
            java.lang.String r12 = r1.getSponsorMsisdn()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload r1 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectManageBeneficiaryPayload
            r10 = 0
            java.lang.String r11 = "2"
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r3.familyConnectManageBeneficiaries(r1)
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.component4
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.equals = r2
            int r1 = r1 % r0
            if (r1 != 0) goto Lb5
            r0 = 29
            int r0 = r0 / 0
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.ShareDataUIState():void");
    }

    private final void component2() {
        int i = 2 % 2;
        copydefault().getManageBeneficiaryData().observe(getViewLifecycleOwner(), new component3(new Function1() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 81;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment = this.f$0;
                Resource resource = (Resource) obj;
                if (i4 != 0) {
                    return FamilyConnectDeleteBeneficiaryFragment.$r8$lambda$TGSSWOP4x1fnANict8YxIBIh8w4(familyConnectDeleteBeneficiaryFragment, resource);
                }
                Unit unit$r8$lambda$TGSSWOP4x1fnANict8YxIBIh8w4 = FamilyConnectDeleteBeneficiaryFragment.$r8$lambda$TGSSWOP4x1fnANict8YxIBIh8w4(familyConnectDeleteBeneficiaryFragment, resource);
                int i5 = 44 / 0;
                return unit$r8$lambda$TGSSWOP4x1fnANict8YxIBIh8w4;
            }
        }));
        int i2 = component4 + 67;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 34 / 0;
        }
    }

    private static final void component3(FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(familyConnectDeleteBeneficiaryFragment, "");
        familyConnectDeleteBeneficiaryFragment.dismiss();
        FamilyConnectViewModel.showDashboard$default(familyConnectDeleteBeneficiaryFragment.copydefault(), null, 1, null);
        familyConnectDeleteBeneficiaryFragment.copydefault().familyConnectQueryBalance(new FamilyConnectCheckStatusPayload(familyConnectDeleteBeneficiaryFragment.component3()));
        int i2 = component4 + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit ShareDataUIState(final com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment r12, com.huawei.payment.mvvm.Resource r13) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.equals
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.component4 = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L9d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            boolean r1 = r13.loading()
            if (r1 == 0) goto L20
            androidx.fragment.app.Fragment r12 = (androidx.fragment.app.Fragment) r12
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r12)
            goto L9a
        L20:
            boolean r1 = r13.success()
            if (r1 == 0) goto L60
            r3 = r12
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(r3)
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectViewModel r0 = r12.copydefault()
            java.lang.Object r13 = r13.getData()
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.string.the_beneficiary_has_been_deleted_successfully
            java.lang.String r1 = r12.getString(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r4 = r0.extractCustomerMessage(r13, r1)
            r5 = 1000(0x3e8, double:4.94E-321)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 28
            r11 = 0
            com.huawei.digitalpayment.consumer.sfcui.components.toast.ToastHelperKt.showCustomToast$default(r3, r4, r5, r7, r8, r9, r10, r11)
            android.os.Handler r13 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r13.<init>(r0)
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment$$ExternalSyntheticLambda1 r0 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment$$ExternalSyntheticLambda1
            r0.<init>()
            r1 = 1000(0x3e8, double:4.94E-321)
            r13.postDelayed(r0, r1)
            goto L9a
        L60:
            boolean r1 = r13.error()
            if (r1 == 0) goto L9a
            r2 = r12
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(r2)
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectViewModel r12 = r12.copydefault()
            java.lang.Object r1 = r13.getData()
            com.huawei.common.exception.BaseException r13 = r13.getException()
            if (r13 == 0) goto L89
            int r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.equals
            int r3 = r3 + 15
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.component4 = r4
            int r3 = r3 % r0
            java.lang.String r13 = r13.getMessage()
            if (r13 != 0) goto L8b
        L89:
            java.lang.String r13 = "Failed to delete beneficiary"
        L8b:
            java.lang.String r3 = r12.extractCustomerMessage(r1, r13)
            r4 = 5000(0x1388, double:2.4703E-320)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 28
            r10 = 0
            com.huawei.digitalpayment.consumer.sfcui.components.toast.ToastHelperKt.showCustomToast$default(r2, r3, r4, r6, r7, r8, r9, r10)
        L9a:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L9d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r2)
            r13.loading()
            r12 = 0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment.ShareDataUIState(com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectDeleteBeneficiaryFragment, com.huawei.payment.mvvm.Resource):kotlin.Unit");
    }

    public static void $r8$lambda$J6udzp5LZlDnmJpXkNcyG87k3E8(FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment) {
        int i = 2 % 2;
        int i2 = component4 + 41;
        equals = i2 % 128;
        int i3 = i2 % 2;
        component3(familyConnectDeleteBeneficiaryFragment);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component4 + 107;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static Unit $r8$lambda$TGSSWOP4x1fnANict8YxIBIh8w4(FamilyConnectDeleteBeneficiaryFragment familyConnectDeleteBeneficiaryFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 57;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return ShareDataUIState(familyConnectDeleteBeneficiaryFragment, resource);
        }
        ShareDataUIState(familyConnectDeleteBeneficiaryFragment, resource);
        throw null;
    }

    public static String m11290$r8$lambda$izhOGFW9m8Ue_fxOoHlhm8vrc() {
        int i = 2 % 2;
        int i2 = component4 + 1;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            getAsAtTimestamp();
            throw null;
        }
        String asAtTimestamp = getAsAtTimestamp();
        int i3 = component4 + 63;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            return asAtTimestamp;
        }
        throw null;
    }
}
