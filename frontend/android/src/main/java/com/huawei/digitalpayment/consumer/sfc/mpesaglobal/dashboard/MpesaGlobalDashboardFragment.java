package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.MpesaGlobalViewModel;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardFragment;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.model.MpesaGlobalDashboardItem;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.collections.immutable.ImmutableList;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/MpesaGlobalDashboardFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "mpesaGlobalViewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/MpesaGlobalViewModel;", "getMpesaGlobalViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/MpesaGlobalViewModel;", "mpesaGlobalViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/MpesaGlobalDashboardViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/MpesaGlobalDashboardViewModel;", "viewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcUiMpesaGlobal_release", "isViewModeGridView", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class MpesaGlobalDashboardFragment extends Hilt_MpesaGlobalDashboardFragment {
    public static final int $stable = 8;
    private static int ShareDataUIState = 49 % 128;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int copydefault;
    private final Lazy component1;
    private final Lazy component3;

    public static final MpesaGlobalViewModel access$getMpesaGlobalViewModel(MpesaGlobalDashboardFragment mpesaGlobalDashboardFragment) {
        int i = 2 % 2;
        int i2 = component4 + 53;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            mpesaGlobalDashboardFragment.component1();
            obj.hashCode();
            throw null;
        }
        MpesaGlobalViewModel mpesaGlobalViewModelComponent1 = mpesaGlobalDashboardFragment.component1();
        int i3 = copydefault + 121;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            return mpesaGlobalViewModelComponent1;
        }
        throw null;
    }

    public static final MpesaGlobalDashboardViewModel access$getViewModel(MpesaGlobalDashboardFragment mpesaGlobalDashboardFragment) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        MpesaGlobalDashboardViewModel mpesaGlobalDashboardViewModelComponent2 = mpesaGlobalDashboardFragment.component2();
        int i4 = component4 + 113;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return mpesaGlobalDashboardViewModelComponent2;
    }

    public MpesaGlobalDashboardFragment() {
        final MpesaGlobalDashboardFragment mpesaGlobalDashboardFragment = this;
        final Function0 function0 = null;
        this.component3 = FragmentViewModelLazyKt.createViewModelLazy(mpesaGlobalDashboardFragment, Reflection.getOrCreateKotlinClass(MpesaGlobalViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 109;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 87;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    mpesaGlobalDashboardFragment.requireActivity().getViewModelStore();
                    throw null;
                }
                ViewModelStore viewModelStore = mpesaGlobalDashboardFragment.requireActivity().getViewModelStore();
                int i3 = component3 + 1;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return viewModelStore;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 117;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    invoke();
                    throw null;
                }
                CreationExtras creationExtrasInvoke = invoke();
                int i3 = component2 + 111;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras;
                int i = 2 % 2;
                Function0 function02 = function0;
                if (function02 == null || (defaultViewModelCreationExtras = (CreationExtras) function02.invoke()) == null) {
                    defaultViewModelCreationExtras = mpesaGlobalDashboardFragment.requireActivity().getDefaultViewModelCreationExtras();
                    int i2 = component2 + 87;
                    component1 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 4 % 5;
                    }
                }
                int i4 = component1 + 107;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 117;
                component1 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    invoke();
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i3 = component3 + 65;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    return factoryInvoke;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 43;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = mpesaGlobalDashboardFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i4 = component3 + 43;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
        this.component1 = FragmentViewModelLazyKt.createViewModelLazy(mpesaGlobalDashboardFragment, Reflection.getOrCreateKotlinClass(MpesaGlobalDashboardViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 19;
                component2 = i2 % 128;
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
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 117;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                FragmentActivity fragmentActivityRequireActivity = mpesaGlobalDashboardFragment.requireActivity();
                if (i3 == 0) {
                    return fragmentActivityRequireActivity.getViewModelStore();
                }
                fragmentActivityRequireActivity.getViewModelStore();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public CreationExtras invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = component1 + 31;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - ExpandableListView.getPackedPositionGroup(0L), 33 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (19697 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 518907119, false, "component3", null);
                }
                int i4 = ((Field) objCopydefault).getInt(null);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getEdgeSlop() >> 16), MotionEvent.axisFromString("") + 31, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 55511118, false, "component2", null);
                }
                int i5 = ((Field) objCopydefault2).getInt(null);
                long j = i5;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - View.resolveSizeAndState(0, 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 30, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 58536393, false, "component3", null);
                }
                int i6 = ((Field) objCopydefault3).getInt(null);
                long j2 = -1;
                long j3 = j2 ^ (-448532559831313846L);
                long jIdentityHashCode = System.identityHashCode(this);
                long j4 = jIdentityHashCode | 1241236013475518270L;
                long j5 = (((long) (-1335)) * 1241236013475518270L) + (((long) (-667)) * (-448532559831313846L)) + (((long) (-668)) * (j3 | (j4 ^ j2))) + (((long) 1336) * ((j2 ^ (j3 | jIdentityHashCode)) | 1241236013475518270L)) + (((long) 668) * (j4 | j3));
                int i7 = component3 + 113;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                int i9 = 0;
                while (true) {
                    int i10 = 0;
                    while (i10 != 8) {
                        int i11 = component3 + 119;
                        component1 = i11 % 128;
                        if (i11 % 2 != 0) {
                            i6 = (((((int) (j >> i10)) & 49) * (i6 * 120)) >> (i6 >>> 11)) / i6;
                            i10 += 91;
                        } else {
                            i6 = (((((int) (j >> i10)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                            i10++;
                        }
                    }
                    if (i9 != 0) {
                        break;
                    }
                    i9++;
                    j = j5;
                }
                if (i6 != i4) {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault('s' - AndroidCharacter.getMirror('0'), 33 - TextUtils.indexOf("", "", 0, 0), (char) (19696 - Color.argb(0, 0, 0, 0)), 1457147715, false, "copydefault", null);
                    }
                    Object obj = ((Field) objCopydefault4).get(null);
                    long j6 = -1;
                    long j7 = 0;
                    long j8 = (((long) (i5 ^ i4)) & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)))) | (((long) 1) << 32) | (j7 - ((j7 >> 63) << 32));
                    try {
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 6618, ExpandableListView.getPackedPositionChild(0L) + 43, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                        Object[] objArr = {-31736463, Long.valueOf(j8), obj, null, false, false};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 6563, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 56, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault6).invoke(objInvoke, objArr);
                        throw null;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                return invoke();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 27;
                int i3 = i2 % 128;
                component1 = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 != null) {
                    int i4 = i3 + 67;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return mpesaGlobalDashboardFragment.requireActivity().getDefaultViewModelCreationExtras();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 119;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component1 + 57;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 97;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = mpesaGlobalDashboardFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i4 = component1 + 107;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
    }

    private final MpesaGlobalViewModel component1() {
        int i = 2 % 2;
        int i2 = component4 + 27;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        MpesaGlobalViewModel mpesaGlobalViewModel = (MpesaGlobalViewModel) this.component3.getValue();
        int i3 = component4 + 3;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return mpesaGlobalViewModel;
        }
        throw null;
    }

    private final MpesaGlobalDashboardViewModel component2() {
        MpesaGlobalDashboardViewModel mpesaGlobalDashboardViewModel;
        int i = 2 % 2;
        int i2 = component4 + 25;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            mpesaGlobalDashboardViewModel = (MpesaGlobalDashboardViewModel) this.component1.getValue();
            int i3 = 82 / 0;
        } else {
            mpesaGlobalDashboardViewModel = (MpesaGlobalDashboardViewModel) this.component1.getValue();
        }
        int i4 = copydefault + 75;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return mpesaGlobalDashboardViewModel;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(inflater, "");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        ComposeView composeView = new ComposeView(fragmentActivityRequireActivity, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-25674611, true, new component2()));
        ComposeView composeView2 = composeView;
        int i2 = component4 + 107;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return composeView2;
        }
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        public static final boolean component2(State state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 1;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                ShareDataUIState(state);
                throw null;
            }
            boolean zShareDataUIState = ShareDataUIState(state);
            int i3 = ShareDataUIState + 21;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return zShareDataUIState;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 81;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component1(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = copydefault + 59;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int copydefault;
            final State<Boolean> component2;
            final MpesaGlobalDashboardFragment component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 7;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                component3(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 39;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void component3(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 21;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                if ((i & 11) == 2) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    } else {
                        int i5 = ShareDataUIState + 31;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                ImmutableList<MpesaGlobalDashboardItem> globalDashboardItems = MpesaGlobalDashboardFragment.access$getViewModel(this.component3).getGlobalDashboardItems();
                boolean zComponent2 = component2.component2(this.component2);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(MpesaGlobalDashboardFragment.access$getViewModel(this.component3));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(MpesaGlobalDashboardFragment.access$getMpesaGlobalViewModel(this.component3));
                final MpesaGlobalDashboardFragment mpesaGlobalDashboardFragment = this.component3;
                MpesaGlobalDashboardScreenKt.MpesaGlobalDashboardScreen(globalDashboardItems, zComponent2, new AnonymousClass1(MpesaGlobalDashboardFragment.access$getViewModel(this.component3)), anonymousClass2, anonymousClass3, new Function0() {
                    private static int component3 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = component3 + 51;
                        copydefault = i8 % 128;
                        int i9 = i8 % 2;
                        Unit unitComponent3 = MpesaGlobalDashboardFragment.component2.AnonymousClass4.component3(mpesaGlobalDashboardFragment);
                        int i10 = component3 + 41;
                        copydefault = i10 % 128;
                        if (i10 % 2 == 0) {
                            return unitComponent3;
                        }
                        throw null;
                    }
                }, composer, 8, 0);
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
                private static int component1 = 0;
                private static int component2 = 1;

                public final void ShareDataUIState(boolean z) {
                    int i = 2 % 2;
                    int i2 = component1 + 113;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    ((MpesaGlobalDashboardViewModel) this.receiver).onViewModeChanged(z);
                    int i4 = component1 + 9;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                }

                @Override
                public Unit invoke(Boolean bool) {
                    int i = 2 % 2;
                    int i2 = component1 + 9;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    boolean zBooleanValue = bool.booleanValue();
                    if (i3 != 0) {
                        ShareDataUIState(zBooleanValue);
                        return Unit.INSTANCE;
                    }
                    ShareDataUIState(zBooleanValue);
                    int i4 = 0 / 0;
                    return Unit.INSTANCE;
                }

                AnonymousClass2(Object obj) {
                    super(1, obj, MpesaGlobalDashboardViewModel.class, "onViewModeChanged", "onViewModeChanged(Z)V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int component3 = 0;
                private static int copydefault = 1;

                public final void component2() {
                    int i = 2 % 2;
                    int i2 = component3 + 3;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    ((MpesaGlobalViewModel) this.receiver).onActionOptOut();
                    if (i3 == 0) {
                        throw null;
                    }
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = copydefault + 119;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    component2();
                    Unit unit = Unit.INSTANCE;
                    int i4 = component3 + 123;
                    copydefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unit;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                AnonymousClass3(Object obj) {
                    super(0, obj, MpesaGlobalViewModel.class, "onActionOptOut", "onActionOptOut()V", 0);
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass1 extends FunctionReferenceImpl implements Function1<MpesaGlobalDashboardItem, Unit> {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;

                public final void copydefault(MpesaGlobalDashboardItem mpesaGlobalDashboardItem) {
                    int i = 2 % 2;
                    int i2 = copydefault + 57;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(mpesaGlobalDashboardItem, "");
                    ((MpesaGlobalDashboardViewModel) this.receiver).handleItemClick(mpesaGlobalDashboardItem);
                    int i4 = ShareDataUIState + 79;
                    copydefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Unit invoke(MpesaGlobalDashboardItem mpesaGlobalDashboardItem) {
                    int i = 2 % 2;
                    int i2 = copydefault + 15;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault(mpesaGlobalDashboardItem);
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 63;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 64 / 0;
                    }
                    return unit;
                }

                AnonymousClass1(Object obj) {
                    super(1, obj, MpesaGlobalDashboardViewModel.class, "handleItemClick", "handleItemClick(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItem;)V", 0);
                }
            }

            private static final Unit ShareDataUIState(MpesaGlobalDashboardFragment mpesaGlobalDashboardFragment) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 83;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(mpesaGlobalDashboardFragment, "");
                    mpesaGlobalDashboardFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(mpesaGlobalDashboardFragment, "");
                mpesaGlobalDashboardFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                int i3 = 83 / 0;
                return Unit.INSTANCE;
            }

            public static Unit component3(MpesaGlobalDashboardFragment mpesaGlobalDashboardFragment) {
                int i = 2 % 2;
                int i2 = copydefault + 51;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    ShareDataUIState(mpesaGlobalDashboardFragment);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitShareDataUIState = ShareDataUIState(mpesaGlobalDashboardFragment);
                int i3 = ShareDataUIState + 117;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 63 / 0;
                }
                return unitShareDataUIState;
            }

            AnonymousClass4(MpesaGlobalDashboardFragment mpesaGlobalDashboardFragment, State<Boolean> state) {
                this.component3 = mpesaGlobalDashboardFragment;
                this.component2 = state;
            }
        }

        public final void component1(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 63;
            copydefault = i3 % 128;
            if (i3 % 2 == 0 ? (i & 11) == 2 : (i & 110) == 2) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    int i4 = copydefault + 111;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 2 % 5;
                        return;
                    }
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1202360310, true, new AnonymousClass4(MpesaGlobalDashboardFragment.this, FlowExtKt.collectAsStateWithLifecycle(MpesaGlobalDashboardFragment.access$getViewModel(MpesaGlobalDashboardFragment.this).isGridView(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7)), composer, 54), composer, 1572864, 63);
        }

        private static final boolean ShareDataUIState(State<Boolean> state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = state.getValue().booleanValue();
            int i4 = copydefault + 109;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return zBooleanValue;
            }
            throw null;
        }

        component2() {
        }
    }

    static {
        int i = 49 % 2;
    }
}
