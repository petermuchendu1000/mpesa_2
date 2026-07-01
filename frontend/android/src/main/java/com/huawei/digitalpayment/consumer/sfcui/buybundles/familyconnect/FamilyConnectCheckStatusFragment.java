package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectCheckStatusPayload;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectStatusReponse;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.sharedui.compose.utils.ExtensionKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectCheckStatusFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcComposeFragment;", "<init>", "()V", "familyConnectViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "getFamilyConnectViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "familyConnectViewModel$delegate", "Lkotlin/Lazy;", "userMsisdn", "", "getUserMsisdn", "()Ljava/lang/String;", "userMsisdn$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "observeViewModels", "observeStatus", "checkFamilyConnectStatus", "handleFamilyConnectStatusResponse", ConnectionLog.CONN_LOG_STATE_RESPONSE, "", "handleBackAction", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FamilyConnectCheckStatusFragment extends Hilt_FamilyConnectCheckStatusFragment {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private static int getAsAtTimestamp = 1;
    private final Lazy ShareDataUIState = LazyKt.lazy(new Function0() {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = copydefault + 123;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str$r8$lambda$4HXv6WUH1ufjDA9eAXoeTObOjF4 = FamilyConnectCheckStatusFragment.$r8$lambda$4HXv6WUH1ufjDA9eAXoeTObOjF4();
            int i4 = ShareDataUIState + 89;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return str$r8$lambda$4HXv6WUH1ufjDA9eAXoeTObOjF4;
        }
    });
    private final Lazy component2;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Observer, FunctionAdapter {
        private static int component2 = 1;
        private static int copydefault;
        private final Function1 ShareDataUIState;

        ShareDataUIState(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ShareDataUIState = function1;
        }

        public final boolean equals(Object obj) {
            boolean zAreEqual;
            int i = 2 % 2;
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                int i2 = copydefault + 9;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            } else {
                zAreEqual = false;
            }
            int i4 = component2 + 45;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return zAreEqual;
            }
            throw null;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 25;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.ShareDataUIState;
            int i5 = i2 + 83;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 91;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Function<?> functionDelegate = getFunctionDelegate();
            if (i3 == 0) {
                return functionDelegate.hashCode();
            }
            functionDelegate.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 39;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState.invoke(obj);
            if (i3 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    public FamilyConnectCheckStatusFragment() {
        final FamilyConnectCheckStatusFragment familyConnectCheckStatusFragment = this;
        final Function0 function0 = null;
        this.component2 = FragmentViewModelLazyKt.createViewModelLazy(familyConnectCheckStatusFragment, Reflection.getOrCreateKotlinClass(FamilyConnectViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 101;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                if (i3 == 0) {
                    int i4 = 67 / 0;
                }
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 41;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = familyConnectCheckStatusFragment.requireActivity().getViewModelStore();
                int i4 = component2 + 87;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStore;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 67;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    return invoke();
                }
                invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i2 = component3 + 65;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (i3 != 0) {
                        int i4 = 30 / 0;
                        if (creationExtras != null) {
                            return creationExtras;
                        }
                    } else if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                CreationExtras defaultViewModelCreationExtras = familyConnectCheckStatusFragment.requireActivity().getDefaultViewModelCreationExtras();
                int i5 = component3 + 35;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 51;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component3 + 25;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 97 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 25;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                FragmentActivity fragmentActivityRequireActivity = familyConnectCheckStatusFragment.requireActivity();
                if (i3 != 0) {
                    return fragmentActivityRequireActivity.getDefaultViewModelProviderFactory();
                }
                int i4 = 56 / 0;
                return fragmentActivityRequireActivity.getDefaultViewModelProviderFactory();
            }

            {
                super(0);
            }
        });
    }

    private final FamilyConnectViewModel component2() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        FamilyConnectViewModel familyConnectViewModel = (FamilyConnectViewModel) this.component2.getValue();
        int i4 = copydefault + 25;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return familyConnectViewModel;
    }

    private final String copydefault() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.ShareDataUIState.getValue();
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    private static final String copy() {
        String string;
        String countryCode;
        String str;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault + 73;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            string = SPUtils.getInstance().getString("recent_login_phone_number");
            Intrinsics.checkNotNullExpressionValue(string, "");
            countryCode = SfcPhoneNumberUtil.INSTANCE.getCountryCode();
            str = "";
            z = false;
            i = 3;
        } else {
            string = SPUtils.getInstance().getString("recent_login_phone_number");
            Intrinsics.checkNotNullExpressionValue(string, "");
            countryCode = SfcPhoneNumberUtil.INSTANCE.getCountryCode();
            str = "";
            z = false;
            i = 4;
        }
        String strReplaceFirst$default = StringsKt.replaceFirst$default(string, countryCode, str, z, i, (Object) null);
        int i4 = component3 + 55;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return strReplaceFirst$default;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int component3 = 1;
        private static int copydefault;

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 33;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component2(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 59;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectCheckStatusFragment.component2.component3 + 47;
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectCheckStatusFragment.component2.copydefault = r12 % 128;
            r12 = r12 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            r11.skipToGroupEnd();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        
            if (r12 == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            if (r12 == false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component2(androidx.compose.runtime.Composer r11, int r12) {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectCheckStatusFragment.component2.component3
                int r2 = r1 + 89
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectCheckStatusFragment.component2.copydefault = r3
                int r2 = r2 % r0
                r12 = r12 & 11
                if (r12 != r0) goto L34
                int r1 = r1 + 51
                int r12 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectCheckStatusFragment.component2.copydefault = r12
                int r1 = r1 % r0
                boolean r12 = r11.getSkipping()
                if (r1 == 0) goto L24
                r1 = 85
                int r1 = r1 / 0
                if (r12 != 0) goto L30
                goto L26
            L24:
                if (r12 != 0) goto L30
            L26:
                int r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectCheckStatusFragment.component2.component3
                int r12 = r12 + 47
                int r1 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectCheckStatusFragment.component2.copydefault = r1
                int r12 = r12 % r0
                goto L34
            L30:
                r11.skipToGroupEnd()
                goto L56
            L34:
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectCheckStatusFragment$component2$5 r12 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectCheckStatusFragment$component2$5
                com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectCheckStatusFragment r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectCheckStatusFragment.this
                r12.<init>()
                r6 = 54
                r7 = -709448017(0xffffffffd5b6aeaf, float:-2.5107672E13)
                r8 = 1
                androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r7, r8, r12, r11, r6)
                r6 = r12
                kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
                r8 = 1572864(0x180000, float:2.204052E-39)
                r9 = 63
                r7 = r11
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            L56:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectCheckStatusFragment.component2.component2(androidx.compose.runtime.Composer, int):void");
        }

        component2() {
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        getBinding().getRoot().setContent(ComposableLambdaKt.composableLambdaInstance(1613742284, true, new component2()));
        component1();
        ShareDataUIState();
        int i2 = copydefault + 51;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void component1() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        component3();
        if (i3 != 0) {
            throw null;
        }
    }

    private final void component3() {
        int i = 2 % 2;
        component2().getStatusData().observe(getViewLifecycleOwner(), new ShareDataUIState(new Function1() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 123;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$r1tRsAUfmI57iUmsUWBNgKnF2fM = FamilyConnectCheckStatusFragment.$r8$lambda$r1tRsAUfmI57iUmsUWBNgKnF2fM(this.f$0, (Resource) obj);
                int i5 = copydefault + 7;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return unit$r8$lambda$r1tRsAUfmI57iUmsUWBNgKnF2fM;
            }
        }));
        int i2 = component3 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit component3(FamilyConnectCheckStatusFragment familyConnectCheckStatusFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = component3 + 35;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(familyConnectCheckStatusFragment, "");
            resource.success();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(familyConnectCheckStatusFragment, "");
        if (resource.success()) {
            familyConnectCheckStatusFragment.component2(resource.getData());
            int i3 = component3 + 57;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        } else if (resource.error()) {
            familyConnectCheckStatusFragment.component2().showError();
        }
        return Unit.INSTANCE;
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        component2().familyConnectQueryStatus(new FamilyConnectCheckStatusPayload(copydefault()));
        int i2 = component3 + 73;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void component2(Object obj) {
        int i;
        int i2 = 2 % 2;
        try {
            Gson gson = new Gson();
            JsonObject asJsonObject = JsonParser.parseString(gson.toJson(obj)).getAsJsonObject();
            if (asJsonObject.getAsJsonObject("header").get("responseCode").getAsInt() == 200) {
                FamilyConnectStatusReponse familyConnectStatusReponse = (FamilyConnectStatusReponse) gson.fromJson((JsonElement) asJsonObject.getAsJsonObject("body"), FamilyConnectStatusReponse.class);
                if (!ExtensionKt.isNotNull(familyConnectStatusReponse)) {
                    component2().showBundleList();
                    return;
                }
                int i3 = copydefault + 111;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component2().showDashboard(familyConnectStatusReponse);
                int i5 = component3 + 31;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                } else {
                    i = 3;
                }
            } else {
                component2().showBundleList();
                i = component3 + 41;
                copydefault = i % 128;
            }
            int i6 = i % 2;
        } catch (Exception unused) {
            component2().showBundleList();
        }
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        component2().previousScreen();
        if (i3 == 0) {
            throw null;
        }
    }

    public static String $r8$lambda$4HXv6WUH1ufjDA9eAXoeTObOjF4() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String strCopy = copy();
        int i4 = component3 + 25;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return strCopy;
    }

    public static Unit $r8$lambda$r1tRsAUfmI57iUmsUWBNgKnF2fM(FamilyConnectCheckStatusFragment familyConnectCheckStatusFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent3 = component3(familyConnectCheckStatusFragment, resource);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
        int i5 = copydefault + 115;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return unitComponent3;
    }

    static {
        int i = 1 + 11;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
