package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProduct;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.profile.resp.TariffResp;
import com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.MyProfileViewModel;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\u0012\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/SfcDaimaServiceActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "myProfileViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/MyProfileViewModel;", "getMyProfileViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/MyProfileViewModel;", "myProfileViewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleNavigation", "product", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "mapDaimaProductToWithExpiryResp", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "ConsumerSfcUI_release", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/daimaService/DaimaServiceState;", "tariffResource", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/resp/TariffResp;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcDaimaServiceActivity extends Hilt_SfcDaimaServiceActivity {
    public static final int $stable = 8;
    private static long ShareDataUIState;
    private static int component2;
    private static char[] component3;
    private static char[] copydefault;
    private static int equals;

    private final Lazy myProfileViewModel = LazyKt.lazy(new Function0() {
        private static int component1 = 0;
        private static int component2 = 1;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component2 + 123;
            component1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                SfcDaimaServiceActivity.$r8$lambda$8WVqv7NKY7nKZQHzYxR9LZ9XwQc(this.f$0);
                obj.hashCode();
                throw null;
            }
            MyProfileViewModel myProfileViewModel$r8$lambda$8WVqv7NKY7nKZQHzYxR9LZ9XwQc = SfcDaimaServiceActivity.$r8$lambda$8WVqv7NKY7nKZQHzYxR9LZ9XwQc(this.f$0);
            int i3 = component2 + 85;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return myProfileViewModel$r8$lambda$8WVqv7NKY7nKZQHzYxR9LZ9XwQc;
            }
            throw null;
        }
    });

    private final Lazy viewModel;
    private static final byte[] $$l = {Ascii.GS, -59, -25, -119};
    private static final int $$m = 39;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {102, Ascii.GS, -34, 39, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -62, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -60, -60, Ascii.CAN, 39, Ascii.SYN, -6, Ascii.VT, 4, -28, Ascii.GS, Ascii.SO, Ascii.FF, -39, TarHeader.LF_NORMAL, -10, 13, -18, Ascii.CAN, 1, Ascii.ETB, -34, 36, 6, 10, 0, -40, 35, Ascii.DLE, 5, -5, 4, 7, 13, 17, 3, -58, 56, Ascii.DLE, 2, -2, 4, 6, 4, -46, 62, Ascii.DLE, -4, Ascii.DC2, -12, Ascii.DC2, -63, SignedBytes.MAX_POWER_OF_TWO, 9, -7, Ascii.VT, 3, -50, 71, -3, Ascii.FF, 10, 0, -60, 78, -9, 0, 8, 3, 20, -65, 39, Ascii.GS, Ascii.FF, 10, 0, -40, TarHeader.LF_DIR, 2, 13, 1, -9, -10, Ascii.CAN, 1, Ascii.ETB, -78, 20};
    private static final int $$k = BERTags.FLAGS;
    private static final byte[] $$d = {77, -64, 102, -128, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 11;
    private static int getAsAtTimestamp = 0;
    private static int component1 = 0;
    private static int getRequestBeneficiariesState = 1;

    private static String $$n(byte b2, int i, short s) {
        byte[] bArr = $$l;
        int i2 = i * 2;
        int i3 = 122 - s;
        int i4 = b2 + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = (-i4) + i5;
            i4 = i4;
        }
        while (true) {
            int i7 = i4 + 1;
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i5) {
                return new String(bArr2, 0);
            }
            i6 = i8;
            i3 = (-bArr[i7]) + i3;
            i4 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = 28 - r7
            int r5 = r5 * 2
            int r5 = r5 + 83
            int r6 = 100 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.$$d
            byte[] r0 = new byte[r0]
            int r7 = 27 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r5
            r5 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
        L27:
            int r5 = r5 + r4
            int r5 = r5 + (-8)
            int r6 = r6 + 1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.g(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 12
            int r8 = 111 - r8
            int r6 = r6 + 4
            int r7 = r7 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.$$j
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            int r6 = r6 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r6]
        L26:
            int r8 = r8 + r3
            int r8 = r8 + (-5)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.i(int, int, int, java.lang.Object[]):void");
    }

    public static final MyProfileViewModel access$getMyProfileViewModel(SfcDaimaServiceActivity sfcDaimaServiceActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return sfcDaimaServiceActivity.getMyProfileViewModel();
        }
        sfcDaimaServiceActivity.getMyProfileViewModel();
        throw null;
    }

    public static final DaimaServiceViewModel access$getViewModel(SfcDaimaServiceActivity sfcDaimaServiceActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 21;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            sfcDaimaServiceActivity.getViewModel();
            obj.hashCode();
            throw null;
        }
        DaimaServiceViewModel viewModel = sfcDaimaServiceActivity.getViewModel();
        int i3 = getRequestBeneficiariesState + 43;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            return viewModel;
        }
        throw null;
    }

    public static final void access$handleNavigation(SfcDaimaServiceActivity sfcDaimaServiceActivity, DaimaProduct daimaProduct) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        sfcDaimaServiceActivity.handleNavigation(daimaProduct);
        int i4 = getRequestBeneficiariesState + 61;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SfcDaimaServiceActivity() {
        final SfcDaimaServiceActivity sfcDaimaServiceActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(DaimaServiceViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 5;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ComponentActivity componentActivity = sfcDaimaServiceActivity;
                if (i3 != 0) {
                    return componentActivity.getViewModelStore();
                }
                componentActivity.getViewModelStore();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 29;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 23;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component2 + 43;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 37;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = sfcDaimaServiceActivity.getDefaultViewModelProviderFactory();
                int i4 = component2 + 19;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return defaultViewModelProviderFactory;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault;
                int i3 = i2 + 91;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i2 + 43;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return sfcDaimaServiceActivity.getDefaultViewModelCreationExtras();
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1 + 41;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = copydefault + 43;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final DaimaServiceViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        DaimaServiceViewModel daimaServiceViewModel = (DaimaServiceViewModel) this.viewModel.getValue();
        int i4 = component1 + 97;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return daimaServiceViewModel;
    }

    private final MyProfileViewModel getMyProfileViewModel() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        MyProfileViewModel myProfileViewModel = (MyProfileViewModel) this.myProfileViewModel.getValue();
        int i4 = component1 + 87;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return myProfileViewModel;
    }

    private static final MyProfileViewModel myProfileViewModel_delegate$lambda$0(SfcDaimaServiceActivity sfcDaimaServiceActivity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sfcDaimaServiceActivity, "");
        MyProfileViewModel myProfileViewModel = (MyProfileViewModel) new ViewModelProvider(sfcDaimaServiceActivity).get(MyProfileViewModel.class);
        int i2 = getRequestBeneficiariesState + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return myProfileViewModel;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        public static final DaimaServiceState component2(State state) {
            int i = 2 % 2;
            int i2 = component1 + 47;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return copydefault(state);
            }
            copydefault(state);
            throw null;
        }

        public static final Resource component3(State state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 123;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return component1(state);
            }
            component1(state);
            throw null;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 89;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 8 / 0;
            }
            return unit;
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity$onCreate$1$1", f = "SfcDaimaServiceActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;
            int component1;
            final SfcDaimaServiceActivity component2;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 79;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    throw null;
                }
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.component1 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                SfcDaimaServiceActivity.access$getMyProfileViewModel(this.component2).queryTariff();
                Unit unit = Unit.INSTANCE;
                int i3 = ShareDataUIState + 81;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SfcDaimaServiceActivity sfcDaimaServiceActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.component2 = sfcDaimaServiceActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.component2, continuation);
                int i2 = ShareDataUIState + 105;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 63;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
                int i4 = component3 + 65;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 10 / 0;
                }
                return objShareDataUIState;
            }

            public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 97;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) create(coroutineScope, continuation);
                if (i3 == 0) {
                    anonymousClass4.invokeSuspend(Unit.INSTANCE);
                    obj.hashCode();
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass4.invokeSuspend(Unit.INSTANCE);
                int i4 = component3 + 79;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity$onCreate$1$2", f = "SfcDaimaServiceActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component1 = 0;
            private static int component3 = 1;
            final SfcDaimaServiceActivity ShareDataUIState;
            int component2;
            final State<Resource<TariffResp>> copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                String customerType;
                int i = 2 % 2;
                int i2 = component1 + 49;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.component2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Resource resourceComponent3 = ShareDataUIState.component3(this.copydefault);
                if (resourceComponent3 != null) {
                    int i4 = component3 + 25;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    SfcDaimaServiceActivity sfcDaimaServiceActivity = this.ShareDataUIState;
                    if (resourceComponent3.success() && resourceComponent3.getData() != null) {
                        int i6 = component1 + 113;
                        component3 = i6 % 128;
                        int i7 = i6 % 2;
                        TariffResp tariffResp = (TariffResp) resourceComponent3.getData();
                        if (tariffResp == null || (customerType = tariffResp.getCustomerType()) == null) {
                            int i8 = component1 + 11;
                            component3 = i8 % 128;
                            int i9 = i8 % 2;
                            customerType = "Prepaid";
                        }
                        SfcDaimaServiceActivity.access$getViewModel(sfcDaimaServiceActivity).updateTariff(customerType);
                        int i10 = component1 + 83;
                        component3 = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(State<Resource<TariffResp>> state, SfcDaimaServiceActivity sfcDaimaServiceActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.copydefault = state;
                this.ShareDataUIState = sfcDaimaServiceActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.copydefault, this.ShareDataUIState, continuation);
                int i2 = component1 + 45;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass2;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 35;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
                int i4 = component3 + 13;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return objShareDataUIState;
                }
                throw null;
            }

            public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 9;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    anonymousClass2.invokeSuspend(unit);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass2.invokeSuspend(unit);
                int i4 = component1 + 33;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 56 / 0;
                }
                return objInvokeSuspend;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 implements Function2<Composer, Integer, Unit> {
            private static int component3 = 1;
            private static int copydefault;
            final State<DaimaServiceState> ShareDataUIState;
            final SfcDaimaServiceActivity component1;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component3 + 59;
                copydefault = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 == 0) {
                    copydefault(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }
                copydefault(composer2, num2.intValue());
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void copydefault(androidx.compose.runtime.Composer r11, int r12) {
                /*
                    r10 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.ShareDataUIState.AnonymousClass5.component3
                    int r1 = r1 + 59
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.ShareDataUIState.AnonymousClass5.copydefault = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L14
                    r12 = r12 & 73
                    r1 = 3
                    if (r12 != r1) goto L2c
                    goto L18
                L14:
                    r12 = r12 & 11
                    if (r12 != r0) goto L2c
                L18:
                    boolean r12 = r11.getSkipping()
                    if (r12 != 0) goto L1f
                    goto L2c
                L1f:
                    r11.skipToGroupEnd()
                    int r11 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.ShareDataUIState.AnonymousClass5.component3
                    int r11 = r11 + 57
                    int r12 = r11 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.ShareDataUIState.AnonymousClass5.copydefault = r12
                    int r11 = r11 % r0
                    goto L75
                L2c:
                    androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.INSTANCE
                    androidx.compose.ui.Modifier r12 = (androidx.compose.ui.Modifier) r12
                    r1 = 1
                    r2 = 0
                    r3 = 0
                    androidx.compose.ui.Modifier r12 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r12, r3, r1, r2)
                    androidx.compose.foundation.layout.WindowInsets$Companion r1 = androidx.compose.foundation.layout.WindowInsets.INSTANCE
                    r2 = 8
                    androidx.compose.foundation.layout.WindowInsets r1 = androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(r1, r11, r2)
                    androidx.compose.foundation.layout.WindowInsetsSides$Companion r2 = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE
                    int r2 = r2.m1267getTopJoeWqyM()
                    androidx.compose.foundation.layout.WindowInsets r1 = androidx.compose.foundation.layout.WindowInsetsKt.m1239onlybOOhFvg(r1, r2)
                    r2 = 0
                    androidx.compose.foundation.layout.PaddingValues r1 = androidx.compose.foundation.layout.WindowInsetsKt.asPaddingValues(r1, r11, r2)
                    androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.PaddingKt.padding(r12, r1)
                    androidx.compose.runtime.State<com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.DaimaServiceState> r12 = r10.ShareDataUIState
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.DaimaServiceState r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.ShareDataUIState.component2(r12)
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity$onCreate$1$3$$ExternalSyntheticLambda0 r3 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity$onCreate$1$3$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity r12 = r10.component1
                    r3.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity$onCreate$1$3$$ExternalSyntheticLambda1 r4 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity$onCreate$1$3$$ExternalSyntheticLambda1
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity r12 = r10.component1
                    r4.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity$onCreate$1$3$$ExternalSyntheticLambda2 r5 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity$onCreate$1$3$$ExternalSyntheticLambda2
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity r12 = r10.component1
                    r5.<init>()
                    r8 = 32768(0x8000, float:4.5918E-41)
                    r9 = 0
                    r7 = r11
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.DaimaServiceScreenKt.DaimaServiceScreen(r2, r3, r4, r5, r6, r7, r8, r9)
                L75:
                    int r11 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.ShareDataUIState.AnonymousClass5.copydefault
                    int r11 = r11 + 71
                    int r12 = r11 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.ShareDataUIState.AnonymousClass5.component3 = r12
                    int r11 = r11 % r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.ShareDataUIState.AnonymousClass5.copydefault(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit copydefault(SfcDaimaServiceActivity sfcDaimaServiceActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 79;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sfcDaimaServiceActivity, "");
                    sfcDaimaServiceActivity.finish();
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sfcDaimaServiceActivity, "");
                sfcDaimaServiceActivity.finish();
                Unit unit2 = Unit.INSTANCE;
                int i3 = copydefault + 101;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            private static final Unit component3(SfcDaimaServiceActivity sfcDaimaServiceActivity) {
                int i = 2 % 2;
                int i2 = component3 + 87;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sfcDaimaServiceActivity, "");
                    SfcDaimaServiceActivity.access$getViewModel(sfcDaimaServiceActivity).onRefresh();
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(sfcDaimaServiceActivity, "");
                SfcDaimaServiceActivity.access$getViewModel(sfcDaimaServiceActivity).onRefresh();
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit component1(SfcDaimaServiceActivity sfcDaimaServiceActivity, DaimaProduct daimaProduct) {
                int i = 2 % 2;
                int i2 = copydefault + 123;
                component3 = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sfcDaimaServiceActivity, "");
                    Intrinsics.checkNotNullParameter(daimaProduct, "");
                    SfcDaimaServiceActivity.access$handleNavigation(sfcDaimaServiceActivity, daimaProduct);
                    Unit unit = Unit.INSTANCE;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sfcDaimaServiceActivity, "");
                Intrinsics.checkNotNullParameter(daimaProduct, "");
                SfcDaimaServiceActivity.access$handleNavigation(sfcDaimaServiceActivity, daimaProduct);
                Unit unit2 = Unit.INSTANCE;
                int i3 = component3 + 25;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    return unit2;
                }
                throw null;
            }

            public static Unit component1(SfcDaimaServiceActivity sfcDaimaServiceActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 55;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(sfcDaimaServiceActivity);
                int i4 = component3 + 39;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent3;
            }

            public static Unit component2(SfcDaimaServiceActivity sfcDaimaServiceActivity, DaimaProduct daimaProduct) {
                int i = 2 % 2;
                int i2 = copydefault + 65;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    return component1(sfcDaimaServiceActivity, daimaProduct);
                }
                component1(sfcDaimaServiceActivity, daimaProduct);
                throw null;
            }

            public static Unit ShareDataUIState(SfcDaimaServiceActivity sfcDaimaServiceActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 107;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(sfcDaimaServiceActivity);
                if (i3 == 0) {
                    int i4 = 75 / 0;
                }
                int i5 = component3 + 45;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitCopydefault;
                }
                throw null;
            }

            AnonymousClass5(State<DaimaServiceState> state, SfcDaimaServiceActivity sfcDaimaServiceActivity) {
                this.ShareDataUIState = state;
                this.component1 = sfcDaimaServiceActivity;
            }
        }

        public final void component3(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 97;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0 ? (i & 11) == 2 : (i & 15) == 3) {
                if (!composer.getSkipping()) {
                    int i4 = component1 + 87;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(SfcDaimaServiceActivity.access$getViewModel(SfcDaimaServiceActivity.this).getState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(SfcDaimaServiceActivity.access$getMyProfileViewModel(SfcDaimaServiceActivity.this).getTariffRespData(), composer, 8);
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new AnonymousClass4(SfcDaimaServiceActivity.this, null), composer, 70);
            EffectsKt.LaunchedEffect(component1(stateObserveAsState), new AnonymousClass2(stateObserveAsState, SfcDaimaServiceActivity.this, null), composer, 72);
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-404656283, true, new AnonymousClass5(stateCollectAsStateWithLifecycle, SfcDaimaServiceActivity.this), composer, 54), composer, 1572864, 63);
            int i6 = component1 + 113;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }

        private static final DaimaServiceState copydefault(State<DaimaServiceState> state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 93;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            DaimaServiceState value = state.getValue();
            if (i3 == 0) {
                throw null;
            }
            int i4 = ShareDataUIState + 15;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return value;
            }
            obj.hashCode();
            throw null;
        }

        private static final Resource<TariffResp> component1(State<Resource<TariffResp>> state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 79;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Resource<TariffResp> value = state.getValue();
            if (i3 == 0) {
                throw null;
            }
            int i4 = ShareDataUIState + 41;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        ShareDataUIState() {
        }
    }

    private static void e(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i5 = $11 + 69;
            $10 = i5 % 128;
            if (i5 % i3 != 0) {
                int i6 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(copydefault[i + i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - TextUtils.indexOf("", ""), 34 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getEdgeSlop() >> 16), 1159210934, false, $$n(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - View.MeasureSpec.getSize(0), TextUtils.getOffsetBefore("", 0) + 29, (char) (7171 - (Process.myPid() >> 22)), 1951385784, false, $$n(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) (-1);
                        byte b7 = (byte) (b6 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 23 - TextUtils.lastIndexOf("", '0', 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27760), -1529629956, false, $$n(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i7 = cancelnotification.copydefault;
                try {
                    Object[] objArr5 = {Integer.valueOf(copydefault[i + i7])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) (-1);
                        byte b9 = (byte) (b8 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1758 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34, (char) ((-16777216) - Color.rgb(0, 0, 0)), 1159210934, false, $$n(b8, b9, (byte) (b9 + 1)), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                        if (objCopydefault5 == null) {
                            byte b10 = (byte) (-1);
                            byte b11 = (byte) (b10 + 1);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(3608 - View.getDefaultSize(0, 0), 30 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 7171), 1951385784, false, $$n(b10, b11, (byte) (b11 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                        Object[] objArr7 = {cancelnotification, cancelnotification};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault6 == null) {
                            byte b12 = (byte) (-1);
                            byte b13 = (byte) (b12 + 1);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 4014, ExpandableListView.getPackedPositionChild(0L) + 25, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 27761), -1529629956, false, $$n(b12, b13, b13), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault6).invoke(null, objArr7);
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i8 = $11 + 45;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr8 = {cancelnotification, cancelnotification};
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault7 == null) {
                    byte b14 = (byte) (-1);
                    byte b15 = (byte) (b14 + 1);
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.getCapsMode("", 0, 0) + 24, (char) (TextUtils.getOffsetBefore("", 0) + 27761), -1529629956, false, $$n(b14, b15, b15), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objCopydefault7).invoke(null, objArr8);
                obj.hashCode();
                throw null;
            }
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr9 = {cancelnotification, cancelnotification};
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault8 == null) {
                byte b16 = (byte) (-1);
                byte b17 = (byte) (b16 + 1);
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 4013, (Process.myPid() >> 22) + 24, (char) (27761 - (ViewConfiguration.getPressedStateDuration() >> 16)), -1529629956, false, $$n(b16, b17, b17), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault8).invoke(null, objArr9);
        }
        String str = new String(cArr);
        int i9 = $11 + 39;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    private static void h(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - KeyEvent.normalizeMetaState(0), 38 - Color.blue(0), (char) (View.getDefaultSize(0, 0) + 26860), 2015799920, false, $$n(b2, b3, (byte) (b3 | 57)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7405, 15 - ExpandableListView.getPackedPositionChild(0L), (char) (Color.rgb(0, 0, 0) + 16777216), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            int i6 = $10 + 111;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            iTrustedWebActivityServiceStub.component1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i8 = $11 + 85;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 7406, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, (char) ExpandableListView.getPackedPositionType(0L), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = component3;
        if (cArr != null) {
            int i7 = $11 + 93;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 81;
                $11 = i10 % 128;
                if (i10 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 657, 14 - TextUtils.getOffsetBefore("", 0), (char) (View.resolveSizeAndState(0, 0, 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 658, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, (char) (65118 - View.resolveSize(0, 0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault3 == null) {
                            byte b2 = (byte) (-1);
                            byte b3 = (byte) (b2 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4503 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 36 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 27897), -1464227204, false, $$n(b2, b3, (byte) (b3 | Ascii.FF)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault4 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 3580, Drawable.resolveOpacity(0, 0) + 28, (char) (Process.myTid() >> 22), 1180380354, false, $$n(b4, b5, (byte) (b5 | 7)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) (-1);
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1859 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 34 - ExpandableListView.getPackedPositionGroup(0L), (char) TextUtils.getCapsMode("", 0, 0), 80302927, false, $$n(b6, b7, (byte) (b7 | 8)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i13 = $10 + 29;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 1, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 >>> i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i4 << i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i14 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i14, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i14);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
                int i15 = $11 + 21;
                $10 = i15 % 128;
                int i16 = i15 % 2;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i17 = $11 + 39;
                $10 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:305:0x221f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x2220  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01e0  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 8924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.onCreate(android.os.Bundle):void");
    }

    private final void handleNavigation(DaimaProduct product) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        WithExpiryResp withExpiryRespMapDaimaProductToWithExpiryResp = mapDaimaProductToWithExpiryResp(product);
        Intrinsics.checkNotNull(withExpiryRespMapDaimaProductToWithExpiryResp, "");
        RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_BUNDLE_PURCHASE, BundleKt.bundleOf(TuplesKt.to("withExpiryResp", withExpiryRespMapDaimaProductToWithExpiryResp), TuplesKt.to(Keys.KEY_BUNDLE_TYPE, Keys.BUNDLE_TYPE_DAIMA), TuplesKt.to("daimaProduct", product), TuplesKt.to("SELECTED_TARIFF", getViewModel().getState().getValue().getTariff())));
        int i4 = component1 + 125;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final WithExpiryResp mapDaimaProductToWithExpiryResp(DaimaProduct product) {
        int i = 2 % 2;
        String description = product.getDescription();
        int priceKES = (int) product.getPriceKES();
        WithExpiryResp withExpiryResp = new WithExpiryResp(description, String.valueOf(priceKES), "Ksh", false, false, product.getCode(), product.getValidityMonths() + " months", null, null, Keys.BUNDLE_TYPE_DAIMA, null, product.getDescription(), null, "Daima Bundles", R.drawable.ic_daima, null, 38296, null);
        int i2 = component1 + 11;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return withExpiryResp;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 54119), 5 - (ViewConfiguration.getEdgeSlop() >> 16), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952767_res_0x7f13047f).substring(12, 13).codePointAt(0) - 6, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 17893), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952826_res_0x7f1304ba).substring(7, 8).length() + 30, Color.green(0) + 18, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = component1 + 71;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = getRequestBeneficiariesState + 85;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = component1 + 95;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            int i8 = getRequestBeneficiariesState + 79;
            component1 = i8 % 128;
            try {
                if (i8 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.makeMeasureSpec(0, 0) + 42, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 6562, (ViewConfiguration.getScrollBarSize() >> 8) + 56, (char) View.resolveSizeAndState(0, 0, 0), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i9 = 28 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 6618, (KeyEvent.getMaxKeyCode() >> 16) + 42, (char) KeyEvent.normalizeMetaState(0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 6563, 55 - TextUtils.indexOf((CharSequence) "", '0'), (char) View.getDefaultSize(0, 0), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0101  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(56:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|781|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(3:823|33|(1:39)(1:38))(1:43)|44|767|45|(1:47)|48|749|49|(1:51)|52|76|(11:821|77|(2:832|79)|83|84|805|(5:86|87|(1:89)|90|91)(19:93|94|815|95|96|806|97|(2:808|99)|103|104|105|(2:753|107)|111|112|113|(1:115)|116|(1:118)|119)|92|120|(9:123|789|124|(1:126)|127|128|129|777|130)|131)|167|793|168|(1:170)|171|(3:173|(1:175)|176)(19:177|178|784|179|(1:181)|182|183|763|184|(1:186)|187|188|189|(1:191)|192|(1:194)(1:195)|196|(1:198)|199)|200|(6:204|205|(3:838|207|841)(12:837|208|(3:210|(4:213|214|215|211)|842)|216|834|217|(1:219)|220|221|819|222|840)|839|201|202)|836|257|799|258|(3:260|782|261)|265|(4:267|268|794|269)(1:270)|271|(3:273|(1:275)|276)(21:(2:278|(2:284|285)(1:283))(1:286)|(18:288|775|289|(1:291)|292|293|759|294|(1:296)|297|298|299|(1:301)|302|(1:304)|305|(1:307)|308)|351|368|810|369|(1:371)|372|(3:374|(1:376)|377)(19:378|379|797|380|(1:382)|383|384|786|385|(1:387)|388|389|390|(1:392)|393|(1:395)(1:396)|397|(1:399)|400)|401|(4:404|(3:845|406|848)(12:844|407|(3:409|(4:412|413|414|410)|849)|415|769|416|(1:418)|419|420|751|421|847)|846|402)|843|456|(1:458)|459|(1:461)|462|(3:464|(1:466)|467)(16:469|470|(1:472)|473|(1:475)|476|477|(1:479)|480|828|481|482|(1:484)|485|(1:487)|488)|468|489|(30:491|(1:493)|494|(3:496|(1:498)|499)(14:500|501|(1:503)|504|505|(1:507)|508|811|509|510|(1:512)|513|(1:515)|516)|517|(1:519)(9:520|(3:522|(2:525|523)|862)|526|527|(1:529)|530|(1:532)|533|534)|535|788|536|(1:538)|539|(1:541)|542|(3:544|(1:546)|547)(16:548|(2:550|(1:556)(1:555))|(19:558|559|773|560|(1:562)|563|564|757|565|(1:567)|568|569|570|(1:572)|573|(1:575)|576|(1:578)|579)|640|(1:642)|643|(3:645|(1:647)|648)(13:649|801|650|651|(1:653)|654|830|655|656|(1:658)|659|(1:661)|662)|663|(6:666|667|(1:669)|670|671|672)|673|(1:675)|676|(3:678|(1:680)|681)(14:683|684|(1:686)|687|688|(1:690)|691|761|692|693|(1:695)|696|(1:698)|699)|682|700|(1:871)(7:703|704|(1:706)|707|708|709|710))|580|(5:584|(3:855|586|(3:853|588|860)(12:852|592|(3:594|(3:597|598|595)|861)|599|824|600|(1:602)|603|604|813|605|859))(3:851|589|(3:854|591|858)(12:856|592|(0)|599|824|600|(0)|603|604|813|605|859))|857|581|582)|850|640|(0)|643|(0)(0)|663|(0)|673|(0)|676|(0)(0)|682|700|(0)(0))(10:722|(3:724|(2:727|725)|863)|728|729|(1:731)|732|(1:734)|735|736|737))|309|(4:312|(3:866|314|869)(12:865|315|(3:317|(3:320|321|318)|870)|322|826|323|(1:325)|326|327|817|328|868)|867|310)|864|351|368|810|369|(0)|372|(0)(0)|401|(1:402)|843|456|(0)|459|(0)|462|(0)(0)|468|489|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x1b0a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x1b0b, code lost:
    
        r10 = new java.lang.Object[1];
        f(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 1, 1}, new int[]{322, 10, 0, 0}, true, r10);
        r4 = (java.lang.String) r10[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x1b26, code lost:
    
        r7 = new java.io.ByteArrayOutputStream();
        r8 = new java.io.PrintStream(r7);
        r0.printStackTrace(r8);
        r8.close();
        r2 = r7.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x1b3d, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x1b41, code lost:
    
        r7 = new java.util.ArrayList(2);
        r7.add(r2);
        r7.add(r4);
        r14 = -1;
        r8 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r8 = r8 | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x1b70, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x1b74, code lost:
    
        if (r4 == null) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x1b76, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.graphics.Color.blue(0) + 6618, 41 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (char) ((-1) - android.text.TextUtils.lastIndexOf(r6, '0')), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x1ba1, code lost:
    
        r4 = ((java.lang.reflect.Method) r4).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x1ba9, code lost:
    
        r12 = new java.lang.Object[]{-962154432, java.lang.Long.valueOf(r8), r7, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6563 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), 56 - android.text.TextUtils.indexOf(r6, r6, 0), (char) (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16));
        r7 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.$$j;
        r13 = new java.lang.Object[1];
        i(r7[6], r7[45], r7[39], r13);
        r2.getMethod((java.lang.String) r13[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r4, r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0a64 A[Catch: all -> 0x03f2, TryCatch #16 {all -> 0x03f2, blocks: (B:362:0x1632, B:364:0x1638, B:365:0x1662, B:667:0x3276, B:669:0x327c, B:670:0x32a2, B:704:0x35c8, B:706:0x35ce, B:707:0x35f3, B:684:0x33f9, B:686:0x341c, B:687:0x3472, B:634:0x2c20, B:636:0x2c26, B:637:0x2c50, B:527:0x2500, B:529:0x2506, B:530:0x2535, B:532:0x256f, B:533:0x25b8, B:501:0x2241, B:503:0x2256, B:504:0x228b, B:729:0x36cc, B:731:0x36d2, B:732:0x36fb, B:734:0x3735, B:735:0x3775, B:470:0x1dde, B:472:0x1df3, B:473:0x1e25, B:475:0x1e59, B:476:0x1ed1, B:450:0x1b70, B:452:0x1b76, B:453:0x1ba1, B:251:0x0fa5, B:253:0x0fab, B:254:0x0fdc, B:161:0x0a5e, B:163:0x0a64, B:164:0x0a90, B:70:0x0555, B:72:0x055b, B:73:0x0582, B:19:0x0146, B:21:0x014c, B:22:0x0170, B:24:0x0366, B:26:0x0397, B:27:0x03ec, B:536:0x26e7, B:538:0x26ed, B:539:0x2730, B:541:0x2757, B:542:0x279b, B:544:0x27af, B:546:0x27b8, B:547:0x2800, B:580:0x2a56, B:581:0x2a5a, B:586:0x2a6e, B:592:0x2a9e, B:595:0x2aab, B:597:0x2aae, B:609:0x2b93, B:611:0x2b99, B:612:0x2b9a, B:614:0x2b9c, B:616:0x2ba3, B:617:0x2ba4, B:589:0x2a86, B:550:0x280f, B:555:0x281f, B:553:0x2816, B:558:0x2827, B:570:0x2939, B:572:0x293f, B:573:0x2987, B:575:0x29b1, B:576:0x29f3, B:578:0x2a09, B:579:0x2a50, B:619:0x2ba6, B:621:0x2bad, B:622:0x2bae, B:624:0x2bb0, B:626:0x2bb7, B:627:0x2bb8, B:168:0x0b13, B:170:0x0b19, B:171:0x0b5f, B:173:0x0b6c, B:175:0x0b75, B:176:0x0bb6, B:200:0x0de5, B:201:0x0de9, B:205:0x0dfb, B:208:0x0e13, B:211:0x0e20, B:214:0x0e2d, B:226:0x0f17, B:228:0x0f1d, B:229:0x0f1e, B:231:0x0f20, B:233:0x0f27, B:234:0x0f28, B:177:0x0bc1, B:189:0x0cba, B:191:0x0cc0, B:192:0x0d08, B:194:0x0d32, B:196:0x0d80, B:198:0x0d96, B:199:0x0ddd, B:236:0x0f2a, B:238:0x0f31, B:239:0x0f32, B:241:0x0f34, B:243:0x0f3b, B:244:0x0f3c, B:369:0x16e9, B:371:0x16ef, B:372:0x1736, B:374:0x1743, B:376:0x174c, B:377:0x1795, B:401:0x19c6, B:402:0x19ca, B:404:0x19d0, B:407:0x19e7, B:410:0x19f4, B:413:0x1a01, B:425:0x1ae4, B:427:0x1aea, B:428:0x1aeb, B:430:0x1aed, B:432:0x1af4, B:433:0x1af5, B:378:0x17a0, B:390:0x18ab, B:392:0x18b1, B:393:0x18f2, B:395:0x191c, B:397:0x1965, B:399:0x197b, B:400:0x19be, B:435:0x1af7, B:437:0x1afe, B:438:0x1aff, B:440:0x1b01, B:442:0x1b08, B:443:0x1b09, B:33:0x0403, B:35:0x0407, B:56:0x04e2, B:58:0x04e8, B:59:0x04e9, B:61:0x04eb, B:63:0x04f2, B:64:0x04f3, B:39:0x0413), top: B:781:0x0146, inners: #20, #23, #33, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0b19 A[Catch: all -> 0x0f3d, TryCatch #23 {all -> 0x0f3d, blocks: (B:168:0x0b13, B:170:0x0b19, B:171:0x0b5f, B:173:0x0b6c, B:175:0x0b75, B:176:0x0bb6, B:200:0x0de5, B:201:0x0de9, B:205:0x0dfb, B:208:0x0e13, B:211:0x0e20, B:214:0x0e2d, B:226:0x0f17, B:228:0x0f1d, B:229:0x0f1e, B:231:0x0f20, B:233:0x0f27, B:234:0x0f28, B:177:0x0bc1, B:189:0x0cba, B:191:0x0cc0, B:192:0x0d08, B:194:0x0d32, B:196:0x0d80, B:198:0x0d96, B:199:0x0ddd, B:236:0x0f2a, B:238:0x0f31, B:239:0x0f32, B:241:0x0f34, B:243:0x0f3b, B:244:0x0f3c, B:184:0x0c29, B:186:0x0c3e, B:187:0x0cae, B:179:0x0be1, B:181:0x0bf6, B:182:0x0c22, B:222:0x0e97, B:217:0x0e59, B:219:0x0e5f, B:220:0x0e8f), top: B:793:0x0b13, outer: #16, inners: #7, #18, #38, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b6c A[Catch: all -> 0x0f3d, TryCatch #23 {all -> 0x0f3d, blocks: (B:168:0x0b13, B:170:0x0b19, B:171:0x0b5f, B:173:0x0b6c, B:175:0x0b75, B:176:0x0bb6, B:200:0x0de5, B:201:0x0de9, B:205:0x0dfb, B:208:0x0e13, B:211:0x0e20, B:214:0x0e2d, B:226:0x0f17, B:228:0x0f1d, B:229:0x0f1e, B:231:0x0f20, B:233:0x0f27, B:234:0x0f28, B:177:0x0bc1, B:189:0x0cba, B:191:0x0cc0, B:192:0x0d08, B:194:0x0d32, B:196:0x0d80, B:198:0x0d96, B:199:0x0ddd, B:236:0x0f2a, B:238:0x0f31, B:239:0x0f32, B:241:0x0f34, B:243:0x0f3b, B:244:0x0f3c, B:184:0x0c29, B:186:0x0c3e, B:187:0x0cae, B:179:0x0be1, B:181:0x0bf6, B:182:0x0c22, B:222:0x0e97, B:217:0x0e59, B:219:0x0e5f, B:220:0x0e8f), top: B:793:0x0b13, outer: #16, inners: #7, #18, #38, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0bc1 A[Catch: all -> 0x0f3d, TRY_LEAVE, TryCatch #23 {all -> 0x0f3d, blocks: (B:168:0x0b13, B:170:0x0b19, B:171:0x0b5f, B:173:0x0b6c, B:175:0x0b75, B:176:0x0bb6, B:200:0x0de5, B:201:0x0de9, B:205:0x0dfb, B:208:0x0e13, B:211:0x0e20, B:214:0x0e2d, B:226:0x0f17, B:228:0x0f1d, B:229:0x0f1e, B:231:0x0f20, B:233:0x0f27, B:234:0x0f28, B:177:0x0bc1, B:189:0x0cba, B:191:0x0cc0, B:192:0x0d08, B:194:0x0d32, B:196:0x0d80, B:198:0x0d96, B:199:0x0ddd, B:236:0x0f2a, B:238:0x0f31, B:239:0x0f32, B:241:0x0f34, B:243:0x0f3b, B:244:0x0f3c, B:184:0x0c29, B:186:0x0c3e, B:187:0x0cae, B:179:0x0be1, B:181:0x0bf6, B:182:0x0c22, B:222:0x0e97, B:217:0x0e59, B:219:0x0e5f, B:220:0x0e8f), top: B:793:0x0b13, outer: #16, inners: #7, #18, #38, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0df1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x1066  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x10df A[Catch: all -> 0x1580, TRY_LEAVE, TryCatch #27 {all -> 0x1580, blocks: (B:258:0x1060, B:265:0x10b8, B:267:0x10df), top: B:799:0x1060 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x1129  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x113e A[Catch: all -> 0x157e, TryCatch #24 {all -> 0x157e, blocks: (B:269:0x1112, B:271:0x112b, B:273:0x113e, B:275:0x1147, B:276:0x118e, B:309:0x1437, B:310:0x143b, B:312:0x1441, B:315:0x1459, B:318:0x1465, B:320:0x1468, B:332:0x1554, B:334:0x155a, B:335:0x155b, B:337:0x155d, B:339:0x1564, B:340:0x1565, B:278:0x119b, B:280:0x119f, B:288:0x11bd, B:299:0x1313, B:301:0x1319, B:302:0x1361, B:304:0x138b, B:305:0x13d1, B:307:0x13e7, B:308:0x1431, B:342:0x1567, B:344:0x156e, B:345:0x156f, B:347:0x1571, B:349:0x1578, B:350:0x1579, B:284:0x11ab, B:294:0x1264, B:296:0x1288, B:297:0x1307, B:289:0x121c, B:291:0x1230, B:292:0x125d, B:328:0x14d7, B:323:0x1494, B:325:0x149a, B:326:0x14c5), top: B:794:0x1112, inners: #5, #13, #37, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x1199  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x1441 A[Catch: all -> 0x157e, TryCatch #24 {all -> 0x157e, blocks: (B:269:0x1112, B:271:0x112b, B:273:0x113e, B:275:0x1147, B:276:0x118e, B:309:0x1437, B:310:0x143b, B:312:0x1441, B:315:0x1459, B:318:0x1465, B:320:0x1468, B:332:0x1554, B:334:0x155a, B:335:0x155b, B:337:0x155d, B:339:0x1564, B:340:0x1565, B:278:0x119b, B:280:0x119f, B:288:0x11bd, B:299:0x1313, B:301:0x1319, B:302:0x1361, B:304:0x138b, B:305:0x13d1, B:307:0x13e7, B:308:0x1431, B:342:0x1567, B:344:0x156e, B:345:0x156f, B:347:0x1571, B:349:0x1578, B:350:0x1579, B:284:0x11ab, B:294:0x1264, B:296:0x1288, B:297:0x1307, B:289:0x121c, B:291:0x1230, B:292:0x125d, B:328:0x14d7, B:323:0x1494, B:325:0x149a, B:326:0x14c5), top: B:794:0x1112, inners: #5, #13, #37, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x1638 A[Catch: all -> 0x03f2, TryCatch #16 {all -> 0x03f2, blocks: (B:362:0x1632, B:364:0x1638, B:365:0x1662, B:667:0x3276, B:669:0x327c, B:670:0x32a2, B:704:0x35c8, B:706:0x35ce, B:707:0x35f3, B:684:0x33f9, B:686:0x341c, B:687:0x3472, B:634:0x2c20, B:636:0x2c26, B:637:0x2c50, B:527:0x2500, B:529:0x2506, B:530:0x2535, B:532:0x256f, B:533:0x25b8, B:501:0x2241, B:503:0x2256, B:504:0x228b, B:729:0x36cc, B:731:0x36d2, B:732:0x36fb, B:734:0x3735, B:735:0x3775, B:470:0x1dde, B:472:0x1df3, B:473:0x1e25, B:475:0x1e59, B:476:0x1ed1, B:450:0x1b70, B:452:0x1b76, B:453:0x1ba1, B:251:0x0fa5, B:253:0x0fab, B:254:0x0fdc, B:161:0x0a5e, B:163:0x0a64, B:164:0x0a90, B:70:0x0555, B:72:0x055b, B:73:0x0582, B:19:0x0146, B:21:0x014c, B:22:0x0170, B:24:0x0366, B:26:0x0397, B:27:0x03ec, B:536:0x26e7, B:538:0x26ed, B:539:0x2730, B:541:0x2757, B:542:0x279b, B:544:0x27af, B:546:0x27b8, B:547:0x2800, B:580:0x2a56, B:581:0x2a5a, B:586:0x2a6e, B:592:0x2a9e, B:595:0x2aab, B:597:0x2aae, B:609:0x2b93, B:611:0x2b99, B:612:0x2b9a, B:614:0x2b9c, B:616:0x2ba3, B:617:0x2ba4, B:589:0x2a86, B:550:0x280f, B:555:0x281f, B:553:0x2816, B:558:0x2827, B:570:0x2939, B:572:0x293f, B:573:0x2987, B:575:0x29b1, B:576:0x29f3, B:578:0x2a09, B:579:0x2a50, B:619:0x2ba6, B:621:0x2bad, B:622:0x2bae, B:624:0x2bb0, B:626:0x2bb7, B:627:0x2bb8, B:168:0x0b13, B:170:0x0b19, B:171:0x0b5f, B:173:0x0b6c, B:175:0x0b75, B:176:0x0bb6, B:200:0x0de5, B:201:0x0de9, B:205:0x0dfb, B:208:0x0e13, B:211:0x0e20, B:214:0x0e2d, B:226:0x0f17, B:228:0x0f1d, B:229:0x0f1e, B:231:0x0f20, B:233:0x0f27, B:234:0x0f28, B:177:0x0bc1, B:189:0x0cba, B:191:0x0cc0, B:192:0x0d08, B:194:0x0d32, B:196:0x0d80, B:198:0x0d96, B:199:0x0ddd, B:236:0x0f2a, B:238:0x0f31, B:239:0x0f32, B:241:0x0f34, B:243:0x0f3b, B:244:0x0f3c, B:369:0x16e9, B:371:0x16ef, B:372:0x1736, B:374:0x1743, B:376:0x174c, B:377:0x1795, B:401:0x19c6, B:402:0x19ca, B:404:0x19d0, B:407:0x19e7, B:410:0x19f4, B:413:0x1a01, B:425:0x1ae4, B:427:0x1aea, B:428:0x1aeb, B:430:0x1aed, B:432:0x1af4, B:433:0x1af5, B:378:0x17a0, B:390:0x18ab, B:392:0x18b1, B:393:0x18f2, B:395:0x191c, B:397:0x1965, B:399:0x197b, B:400:0x19be, B:435:0x1af7, B:437:0x1afe, B:438:0x1aff, B:440:0x1b01, B:442:0x1b08, B:443:0x1b09, B:33:0x0403, B:35:0x0407, B:56:0x04e2, B:58:0x04e8, B:59:0x04e9, B:61:0x04eb, B:63:0x04f2, B:64:0x04f3, B:39:0x0413), top: B:781:0x0146, inners: #20, #23, #33, #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x16ef A[Catch: all -> 0x1b0a, TryCatch #33 {all -> 0x1b0a, blocks: (B:369:0x16e9, B:371:0x16ef, B:372:0x1736, B:374:0x1743, B:376:0x174c, B:377:0x1795, B:401:0x19c6, B:402:0x19ca, B:404:0x19d0, B:407:0x19e7, B:410:0x19f4, B:413:0x1a01, B:425:0x1ae4, B:427:0x1aea, B:428:0x1aeb, B:430:0x1aed, B:432:0x1af4, B:433:0x1af5, B:378:0x17a0, B:390:0x18ab, B:392:0x18b1, B:393:0x18f2, B:395:0x191c, B:397:0x1965, B:399:0x197b, B:400:0x19be, B:435:0x1af7, B:437:0x1afe, B:438:0x1aff, B:440:0x1b01, B:442:0x1b08, B:443:0x1b09, B:421:0x1a6b, B:416:0x1a2c, B:418:0x1a32, B:419:0x1a63, B:385:0x180d, B:387:0x1829, B:388:0x189f, B:380:0x17c0, B:382:0x17d5, B:383:0x1806), top: B:810:0x16e9, outer: #16, inners: #1, #10, #19, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x1743 A[Catch: all -> 0x1b0a, TryCatch #33 {all -> 0x1b0a, blocks: (B:369:0x16e9, B:371:0x16ef, B:372:0x1736, B:374:0x1743, B:376:0x174c, B:377:0x1795, B:401:0x19c6, B:402:0x19ca, B:404:0x19d0, B:407:0x19e7, B:410:0x19f4, B:413:0x1a01, B:425:0x1ae4, B:427:0x1aea, B:428:0x1aeb, B:430:0x1aed, B:432:0x1af4, B:433:0x1af5, B:378:0x17a0, B:390:0x18ab, B:392:0x18b1, B:393:0x18f2, B:395:0x191c, B:397:0x1965, B:399:0x197b, B:400:0x19be, B:435:0x1af7, B:437:0x1afe, B:438:0x1aff, B:440:0x1b01, B:442:0x1b08, B:443:0x1b09, B:421:0x1a6b, B:416:0x1a2c, B:418:0x1a32, B:419:0x1a63, B:385:0x180d, B:387:0x1829, B:388:0x189f, B:380:0x17c0, B:382:0x17d5, B:383:0x1806), top: B:810:0x16e9, outer: #16, inners: #1, #10, #19, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x17a0 A[Catch: all -> 0x1b0a, TRY_LEAVE, TryCatch #33 {all -> 0x1b0a, blocks: (B:369:0x16e9, B:371:0x16ef, B:372:0x1736, B:374:0x1743, B:376:0x174c, B:377:0x1795, B:401:0x19c6, B:402:0x19ca, B:404:0x19d0, B:407:0x19e7, B:410:0x19f4, B:413:0x1a01, B:425:0x1ae4, B:427:0x1aea, B:428:0x1aeb, B:430:0x1aed, B:432:0x1af4, B:433:0x1af5, B:378:0x17a0, B:390:0x18ab, B:392:0x18b1, B:393:0x18f2, B:395:0x191c, B:397:0x1965, B:399:0x197b, B:400:0x19be, B:435:0x1af7, B:437:0x1afe, B:438:0x1aff, B:440:0x1b01, B:442:0x1b08, B:443:0x1b09, B:421:0x1a6b, B:416:0x1a2c, B:418:0x1a32, B:419:0x1a63, B:385:0x180d, B:387:0x1829, B:388:0x189f, B:380:0x17c0, B:382:0x17d5, B:383:0x1806), top: B:810:0x16e9, outer: #16, inners: #1, #10, #19, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x19d0 A[Catch: all -> 0x1b0a, TryCatch #33 {all -> 0x1b0a, blocks: (B:369:0x16e9, B:371:0x16ef, B:372:0x1736, B:374:0x1743, B:376:0x174c, B:377:0x1795, B:401:0x19c6, B:402:0x19ca, B:404:0x19d0, B:407:0x19e7, B:410:0x19f4, B:413:0x1a01, B:425:0x1ae4, B:427:0x1aea, B:428:0x1aeb, B:430:0x1aed, B:432:0x1af4, B:433:0x1af5, B:378:0x17a0, B:390:0x18ab, B:392:0x18b1, B:393:0x18f2, B:395:0x191c, B:397:0x1965, B:399:0x197b, B:400:0x19be, B:435:0x1af7, B:437:0x1afe, B:438:0x1aff, B:440:0x1b01, B:442:0x1b08, B:443:0x1b09, B:421:0x1a6b, B:416:0x1a2c, B:418:0x1a32, B:419:0x1a63, B:385:0x180d, B:387:0x1829, B:388:0x189f, B:380:0x17c0, B:382:0x17d5, B:383:0x1806), top: B:810:0x16e9, outer: #16, inners: #1, #10, #19, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x1c2e  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x1c97  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x1cf5  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x1dc0  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x200c  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x2aaa  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x2adf A[Catch: all -> 0x2b9b, TryCatch #41 {all -> 0x2b9b, blocks: (B:600:0x2ad9, B:602:0x2adf, B:603:0x2b0a), top: B:824:0x2ad9, outer: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:642:0x2cdd  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x2d31  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x2d8c  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x3257  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x3332  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x3385  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x33db  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x35a8  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x3694  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:871:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.daimaService.SfcDaimaServiceActivity.attachBaseContext(android.content.Context):void");
    }

    public static MyProfileViewModel $r8$lambda$8WVqv7NKY7nKZQHzYxR9LZ9XwQc(SfcDaimaServiceActivity sfcDaimaServiceActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 47;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return myProfileViewModel_delegate$lambda$0(sfcDaimaServiceActivity);
        }
        myProfileViewModel_delegate$lambda$0(sfcDaimaServiceActivity);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        equals = 1;
        copydefault();
        component2();
        int i = getAsAtTimestamp + 31;
        equals = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component1 + 123;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 71;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        component2 = -890926440;
        int i5 = i3 + 13;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    static void copydefault() {
        component3 = new char[]{33370, 33743, 33741, 33739, 33734, 33738, 33744, 33325, 33320, 33733, 33318, 33335, 33749, 33734, 33741, 33746, 33738, 33731, 33440, 33335, 33295, 33294, 33295, 33294, 33333, 33312, 33314, 33338, 33299, 33299, 33294, 33333, 33334, 33295, 33337, 33337, 33294, 33295, 33296, 33291, 33292, 33293, 33333, 33333, 33333, 33337, 33299, 33338, 33335, 33296, 33336, 33335, 33296, 33336, 33336, 33295, 33334, 33335, 33294, 33292, 33292, 33295, 33296, 33294, 33335, 33759, 33312, 33336, 33297, 33296, 33333, 33759, 33312, 33335, 33294, 33296, 33295, 33296, 33337, 33333, 33332, 33336, 33477, 33519, 33521, 33515, 33515, 33519, 33521, 33518, 33427, 33429, 33516, 33514, 33428, 33430, 33429, 33429, 33516, 33514, 33429, 33428, 33512, 33513, 33513, 33425, 33427, 33427, 33426, 33518, 33432, 33430, 33517, 33429, 33432, 33518, 33514, 33514, 33480, 33432, 33460, 33460, 33466, 33460, 33462, 33459, 33452, 33449, 33465, 33439, 33429, 33461, 33464, 33465, 33465, 33299, 33294, 33310, 33378, 33290, 33293, 33379, 33303, 33281, 33289, 33289, 33286, 33294, 33299, 33297, 33519, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33425, 33454, 33423, 33439, 33465, 33449, 33452, 33459, 33462, 33415, 33416, 33458, 33462, 33464, 33477, 33516, 33515, 33512, 33512, 33514, 33516, 33517, 33516, 33516, 33515, 33522, 33411, 33410, 33408, 33471, 33471, 33470, 33471, 33409, 33408, 33470, 33461, 33291, 33290, 33330, 33332, 33294, 33333, 33756, 33334, 33335, 33334, 33331, 33329, 33329, 33756, 33334, 33332, 33756, 33330, 33330, 33757, 33330, 33288, 33293, 33296, 33334, 33757, 33756, 33329, 33330, 33334, 33335, 33758, 33759, 33332, 33331, 33333, 33332, 33757, 33333, 33292, 33294, 33334, 33331, 33291, 33331, 33330, 33333, 33758, 33757, 33332, 33293, 33292, 33290, 33331, 33757, 33334, 33332, 33332, 33291, 33330, 33330, 33290, 33290, 33518, 33428, 33515, 33515, 33515, 33426, 33428, 33517, 33518, 33515, 33513, 33514, 33511, 33511, 33514, 33513, 33514, 33517, 33428, 33428, 33519, 33430, 33430, 33514, 33426, 33429, 33517, 33516, 33514, 33513, 33514, 33515, 33427, 33467, 33467, 33426, 33513, 33512, 33515, 33429, 33467, 33426, 33428, 33429, 33429, 33468, 33425, 33511, 33512, 33426, 33468, 33427, 33514, 33516, 33427, 33465, 33428, 33429, 33469, 33427, 33512, 33425, 33468, 33427, 33478, 33514, 33512, 33515, 33516, 33513, 33510, 33511, 33513, 33513, 33478, 33516, 33514, 33512, 33514, 33515, 33513, 33512, 33513, 33513};
        copydefault = new char[]{3099, 37311, 14147, 54543, 31442, 57235, 16940, 58614, 1680, 43357, 52203, 28086, 36876, 12819, 21682, 63330, 6476, 48115, 56929, 16422, 58059, 1156, 42795, 51686, 27547, 36454, 12522, 21152, 62791, 5907, 47526, 18929, 54359, 29312, 37104, 16183, 23948, 64454, 1539, 42082, 49874, 24862, 36715, 11697, 18435, 54854, 29867, 37629, 12620, 3095, 37375, 14119, 54528, 31360, 6193, 48693, 17347, 57798, 34597, 9376, 51935, 26639, 3509, 37811, 12560, 55060, 29943, 6691, 47187, 24023, 58165, 33120, 9923, 50370, 27262, 4080, 44498, 13140, 53479, 30384, 5184, 47635, 24487, 64806, 33623, 8324, 50751, 25653, 2503, 44992, 19826, 53926, 28883, 5634, 48049, 23010, 65348, 3140, 37282, 14117, 54615, 31366, 6194, 48693, 17349, 57796, 34592, 9383, 51922, 26639, 3504, 37813, 12613, 55109, 29942, 6702, 47108, 23942, 58208, 33126, 9877, 50382, 27173, 4082, 44501, 13056, 53438, 30432, 5188, 47686, 24574, 64885, 33540, 8403, 50786, 25703, 2501, 44949, 19838, 53935, 28887, 5712, 48051, 23011, 65303, 40210, 8948, 49271, 26116, 2945, 43326, 20272, 60574, 29376, 4213, 46511, 23518, 63749, 40639, 15584, 49695, 3102, 37298, 14178, 54550, 31429, 6204, 48761, 17289, 57792, 34675, 9390, 51921, 26629, 3552, 37858, 12563, 55111, 29936, 6692, 47188, 23938, 58161, 33077, 9924, 50392, 27186, 4094, 44436, 13139, 53479, 30370, 5189, 47639, 24501, 64866, 33608, 8401, 50803, 25655, 2516, 44946, 19765, 53991, 28819, 5719, 48116, 22963, 65288, 40213, 8873, 49275, 26185, 3031, 43382, 20287, 60553, 29343, 4136, 46577, 23427, 63813, 40690, 15609, 49744, 24644, 1513, 43891, 18704, 61139, 35944, 4642, 47061, 7759, 33768, 9511, 51026, 26776, 2613, 3091, 37290, 14199, 54550, 31429, 6243, 48690, 17396, 57747, 34599, 9466, 51858, 26719, 3563, 37811, 5025, 36375, 10433, 51895, 25961, 2008, 41350, 23673, 65057, 39064, 15172, 'f', 40401, 15110, 55664, 30380, 5138, 45638, 20413, 60902, 35667, 10381};
        ShareDataUIState = 2934985944639181254L;
    }
}
