package com.huawei.digitalpayment.consumer.miniapps.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.databinding.DataBindingUtil;
import com.alibaba.griver.api.ui.splash.GriverSplashFragmentExtension;
import com.alibaba.griver.api.ui.splash.SplashEntryInfo;
import com.dynatrace.android.agent.Dynatrace;
import com.huawei.digitalpayment.consumer.miniapps.R;
import com.huawei.digitalpayment.consumer.miniapps.databinding.FragmentSfcMiniappSplashBinding;
import com.huawei.digitalpayment.consumer.miniapps.ui.SfcMiniAppSplashFragment;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.mpesa.logging.L;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001c\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/ui/SfcMiniAppSplashFragment;", "Lcom/alibaba/griver/api/ui/splash/GriverSplashFragmentExtension$AbstractSplashFragment;", "<init>", "()V", "TAG", "", "binding", "Lcom/huawei/digitalpayment/consumer/miniapps/databinding/FragmentSfcMiniappSplashBinding;", "miniAppState", "Landroidx/compose/runtime/MutableState;", "Lcom/huawei/digitalpayment/consumer/miniapps/ui/MiniAppSplashState;", "miniAppError", "Lcom/huawei/digitalpayment/consumer/miniapps/ui/MiniAppSplashError;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "updateProgress", "", "info", "Lcom/alibaba/griver/api/ui/splash/SplashEntryInfo;", "updateLoadingInfo", "showError", "errorCode", "errorMessage", "exit", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcMiniAppSplashFragment extends GriverSplashFragmentExtension.AbstractSplashFragment {
    public static final int $stable = 8;
    private static int ShareDataUIState = 101 % 128;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final String TAG;
    private FragmentSfcMiniappSplashBinding binding;
    private final MutableState<MiniAppSplashError> miniAppError;
    private final MutableState<MiniAppSplashState> miniAppState;

    public SfcMiniAppSplashFragment() {
        String simpleName = Reflection.getOrCreateKotlinClass(SfcMiniAppSplashFragment.class).getSimpleName();
        if (simpleName == null) {
            simpleName = "";
            int i = copydefault + 123;
            component2 = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        this.TAG = simpleName;
        String str = null;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.miniAppState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new MiniAppSplashState(null, null, str, 0, 15, defaultConstructorMarker), null, 2, null);
        this.miniAppError = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new MiniAppSplashError(false, str, null, 7, defaultConstructorMarker), null, 2, null);
        int i4 = copydefault + 103;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static final MutableState access$getMiniAppError$p(SfcMiniAppSplashFragment sfcMiniAppSplashFragment) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableState<MiniAppSplashError> mutableState = sfcMiniAppSplashFragment.miniAppError;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 45;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return mutableState;
    }

    public static final MutableState access$getMiniAppState$p(SfcMiniAppSplashFragment sfcMiniAppSplashFragment) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        MutableState<MiniAppSplashState> mutableState = sfcMiniAppSplashFragment.miniAppState;
        int i5 = i2 + 121;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableState;
        }
        throw null;
    }

    public static final String access$getTAG$p(SfcMiniAppSplashFragment sfcMiniAppSplashFragment) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = sfcMiniAppSplashFragment.TAG;
        int i5 = i2 + 67;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(inflater, "");
        this.binding = (FragmentSfcMiniappSplashBinding) DataBindingUtil.inflate(inflater, R.layout.fragment_sfc_miniapp_splash, container, false);
        L.INSTANCE.d(this.TAG, "OnCreateView", new Object[0]);
        FragmentSfcMiniappSplashBinding fragmentSfcMiniappSplashBinding = this.binding;
        FragmentSfcMiniappSplashBinding fragmentSfcMiniappSplashBinding2 = null;
        if (fragmentSfcMiniappSplashBinding == null) {
            int i2 = component2 + 45;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentSfcMiniappSplashBinding = null;
        }
        fragmentSfcMiniappSplashBinding.composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-86390943, true, new Function2<Composer, Integer, Unit>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i4 = 2 % 2;
                int i5 = copydefault + 31;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                invoke(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i7 = copydefault + 49;
                ShareDataUIState = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 29 / 0;
                }
                return unit;
            }

            public final void invoke(Composer composer, int i4) {
                int i5 = 2 % 2;
                if ((i4 & 11) != 2 || !composer.getSkipping()) {
                    OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-934880444, true, new C02321(SfcMiniAppSplashFragment.this), composer, 54), composer, 1572870, 62);
                    int i6 = ShareDataUIState + 5;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    composer.skipToGroupEnd();
                }
                int i8 = ShareDataUIState + 117;
                copydefault = i8 % 128;
                int i9 = i8 % 2;
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C02321 implements Function2<Composer, Integer, Unit> {
                private static int component2 = 1;
                private static int component3;
                final SfcMiniAppSplashFragment this$0;

                @Override
                public Unit invoke(Composer composer, Integer num) {
                    int i = 2 % 2;
                    int i2 = component2 + 119;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    invoke(composer, num.intValue());
                    Unit unit = Unit.INSTANCE;
                    int i4 = component2 + 115;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                public final void invoke(Composer composer, int i) {
                    int i2 = 2 % 2;
                    int i3 = component3 + 75;
                    component2 = i3 % 128;
                    if (i3 % 2 != 0 ? (i & 11) != 2 : (i & 55) != 5) {
                        MiniAppSplashState miniAppSplashState = (MiniAppSplashState) SfcMiniAppSplashFragment.access$getMiniAppState$p(this.this$0).getValue();
                        MiniAppSplashError miniAppSplashError = (MiniAppSplashError) SfcMiniAppSplashFragment.access$getMiniAppError$p(this.this$0).getValue();
                        SfcMiniAppSplashFragment$onCreateView$1$1$$ExternalSyntheticLambda0 sfcMiniAppSplashFragment$onCreateView$1$1$$ExternalSyntheticLambda0 = new SfcMiniAppSplashFragment$onCreateView$1$1$$ExternalSyntheticLambda0(this.this$0);
                        final SfcMiniAppSplashFragment sfcMiniAppSplashFragment = this.this$0;
                        MiniAppSplashScreenKt.MiniAppSplashScreen(null, miniAppSplashState, miniAppSplashError, sfcMiniAppSplashFragment$onCreateView$1$1$$ExternalSyntheticLambda0, new Function0() {
                            private static int ShareDataUIState = 0;
                            private static int component3 = 1;

                            @Override
                            public final Object invoke() {
                                int i4 = 2 % 2;
                                int i5 = ShareDataUIState + 89;
                                component3 = i5 % 128;
                                int i6 = i5 % 2;
                                SfcMiniAppSplashFragment sfcMiniAppSplashFragment2 = sfcMiniAppSplashFragment;
                                if (i6 != 0) {
                                    return SfcMiniAppSplashFragment.AnonymousClass1.C02321.$r8$lambda$CJxmmbriTHU3Gc_R7xVW_Yy6CIM(sfcMiniAppSplashFragment2);
                                }
                                SfcMiniAppSplashFragment.AnonymousClass1.C02321.$r8$lambda$CJxmmbriTHU3Gc_R7xVW_Yy6CIM(sfcMiniAppSplashFragment2);
                                throw null;
                            }
                        }, composer, 576, 1);
                    } else if (!composer.getSkipping()) {
                        int i4 = component2 + 93;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                        MiniAppSplashState miniAppSplashState2 = (MiniAppSplashState) SfcMiniAppSplashFragment.access$getMiniAppState$p(this.this$0).getValue();
                        MiniAppSplashError miniAppSplashError2 = (MiniAppSplashError) SfcMiniAppSplashFragment.access$getMiniAppError$p(this.this$0).getValue();
                        SfcMiniAppSplashFragment$onCreateView$1$1$$ExternalSyntheticLambda0 sfcMiniAppSplashFragment$onCreateView$1$1$$ExternalSyntheticLambda02 = new SfcMiniAppSplashFragment$onCreateView$1$1$$ExternalSyntheticLambda0(this.this$0);
                        final SfcMiniAppSplashFragment sfcMiniAppSplashFragment2 = this.this$0;
                        MiniAppSplashScreenKt.MiniAppSplashScreen(null, miniAppSplashState2, miniAppSplashError2, sfcMiniAppSplashFragment$onCreateView$1$1$$ExternalSyntheticLambda02, new Function0() {
                            private static int ShareDataUIState = 0;
                            private static int component3 = 1;

                            @Override
                            public final Object invoke() {
                                int i42 = 2 % 2;
                                int i52 = ShareDataUIState + 89;
                                component3 = i52 % 128;
                                int i6 = i52 % 2;
                                SfcMiniAppSplashFragment sfcMiniAppSplashFragment22 = sfcMiniAppSplashFragment2;
                                if (i6 != 0) {
                                    return SfcMiniAppSplashFragment.AnonymousClass1.C02321.$r8$lambda$CJxmmbriTHU3Gc_R7xVW_Yy6CIM(sfcMiniAppSplashFragment22);
                                }
                                SfcMiniAppSplashFragment.AnonymousClass1.C02321.$r8$lambda$CJxmmbriTHU3Gc_R7xVW_Yy6CIM(sfcMiniAppSplashFragment22);
                                throw null;
                            }
                        }, composer, 576, 1);
                    } else {
                        composer.skipToGroupEnd();
                    }
                    int i6 = component2 + 75;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                }

                private static final Unit invoke$lambda$0(SfcMiniAppSplashFragment sfcMiniAppSplashFragment) {
                    int i = 2 % 2;
                    int i2 = component2 + 93;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(sfcMiniAppSplashFragment, "");
                    L.INSTANCE.d(SfcMiniAppSplashFragment.access$getTAG$p(sfcMiniAppSplashFragment), "reload clicked", new Object[0]);
                    sfcMiniAppSplashFragment.reload();
                    Unit unit = Unit.INSTANCE;
                    int i4 = component2 + 47;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private static final Unit invoke$lambda$1(SfcMiniAppSplashFragment sfcMiniAppSplashFragment) {
                    int i = 2 % 2;
                    int i2 = component3 + 79;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(sfcMiniAppSplashFragment, "");
                    sfcMiniAppSplashFragment.requireActivity().finish();
                    Unit unit = Unit.INSTANCE;
                    int i4 = component3 + 35;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public static Unit $r8$lambda$CJxmmbriTHU3Gc_R7xVW_Yy6CIM(SfcMiniAppSplashFragment sfcMiniAppSplashFragment) {
                    int i = 2 % 2;
                    int i2 = component3 + 27;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitInvoke$lambda$1 = invoke$lambda$1(sfcMiniAppSplashFragment);
                    int i4 = component2 + 39;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unitInvoke$lambda$1;
                    }
                    throw null;
                }

                public static Unit $r8$lambda$MW3Wxbts44oz5PrmvnVwudSx6Qo(SfcMiniAppSplashFragment sfcMiniAppSplashFragment) {
                    int i = 2 % 2;
                    int i2 = component3 + 93;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitInvoke$lambda$0 = invoke$lambda$0(sfcMiniAppSplashFragment);
                    int i4 = component3 + 7;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unitInvoke$lambda$0;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                C02321(SfcMiniAppSplashFragment sfcMiniAppSplashFragment) {
                    this.this$0 = sfcMiniAppSplashFragment;
                }
            }
        }));
        FragmentSfcMiniappSplashBinding fragmentSfcMiniappSplashBinding3 = this.binding;
        if (fragmentSfcMiniappSplashBinding3 == null) {
            int i4 = copydefault + 27;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentSfcMiniappSplashBinding2 = fragmentSfcMiniappSplashBinding3;
        }
        return fragmentSfcMiniappSplashBinding2.getRoot();
    }

    @Override
    public void updateProgress(SplashEntryInfo info) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        super.updateProgress(info);
        if (info != null) {
            L.INSTANCE.d(this.TAG, "update progress " + info.progress, new Object[0]);
            int i4 = component2 + 101;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override
    public void updateLoadingInfo(SplashEntryInfo info) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            L.INSTANCE.d(this.TAG, "update loading info", new Object[0]);
            if (info == null) {
                return;
            }
        } else {
            L.INSTANCE.d(this.TAG, "update loading info", new Object[0]);
            if (info == null) {
                return;
            }
        }
        this.miniAppState.setValue(new MiniAppSplashState(info.appId, info.appName, info.iconUrl, R.drawable.ic_miniapp));
        int i3 = copydefault + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public void showError(String errorCode, String errorMessage) {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        L.INSTANCE.d(this.TAG, "show error", new Object[0]);
        if (errorCode == null) {
            int i4 = copydefault + 91;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str = "";
        } else {
            str = errorCode;
        }
        this.miniAppError.setValue(new MiniAppSplashError(true, str, ErrorCodeMapper.INSTANCE.mapMiniAppErrorCode(errorCode != null ? errorCode : "")));
        Dynatrace.reportError(this.TAG + " + Failed to launch mini app id " + this.miniAppState.getValue().getAppId() + " with error code " + errorCode, errorCode != null ? Integer.parseInt(errorCode) : 0);
    }

    static {
        if (101 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void exit() {
        int i = 2 % 2;
        int i2 = component2 + 103;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }
}
