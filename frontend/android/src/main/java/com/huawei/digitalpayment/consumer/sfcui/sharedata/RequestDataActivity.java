package com.huawei.digitalpayment.consumer.sfcui.sharedata;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.base.resp.Balances;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.favorites.viewall.ViewAllFavoritesScreenKt;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.model.DataSharingResponse;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.model.ShareDataBeneficiary;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import defpackage.ShareDataUIState;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.getActiveNotifications;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u008a\u0084\u0002²\u0006\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/RequestDataActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcUI_release", "shareDataUIState", "LShareDataUIState;", "requestDataResult", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/DataSharingResponse;", "balances", "", "Lcom/huawei/digitalpayment/consumer/base/resp/Balances;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class RequestDataActivity extends Hilt_RequestDataActivity {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static int component1;
    private static int[] component2;
    private static byte[] component3;
    private static int component4;
    private static int copydefault;
    private static short[] equals;

    private final Lazy viewModel;
    private static final byte[] $$l = {1, -128, 109, -128};
    private static final int $$m = 94;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {87, -2, Ascii.VT, -41, -18, -4, 57, -64, -19, Ascii.SO, -28, Ascii.FF, -10, TarHeader.LF_DIR, -60, -11, -4, -8, -17, 13, -17, -10, 9, -30, 6, 2, -15, -12, SignedBytes.MAX_POWER_OF_TWO, -59, -18, -5, -11, -8, 2, 2, -19, 62, -79, Ascii.FF, -3, -26, 7, -2, -24, 67, -65, -11, -12, 9, -19, Ascii.VT, -8, -23, 5, -12, -5, 58, -62, -21, 1, 5, -23, 5, -12, -5, 58, -43, -39, 13, -23, -8, Ascii.RS, -23, -30, 79, -23, -18, -7, -15, Ascii.SI, -7, -7, -1, -26, 3, -14, -18, -4, -9, -5, -5, 3, -15, -12, 59, -18, -4, 57, -57, -17, -3, 1, -5, -7, -5, 45, -57, -23, 3, -19, Ascii.VT, -19, 62, -67, 0, -19, -2, 3, -13, 56, -65, -13, 7, 47, -33, -45, 7, Ascii.DLE, -30, -20, -6, Ascii.FF, -12, -4, Ascii.FS, -50, -5, -11, -7, 13, -19, -12, -5, 59, -25, -40, -23, 5, -12, -5, Ascii.ESC, -30, -15, -13, 38, -49, 9, -14, 17, -25, -2, -24, 33, -37, -7, -11, -1, 39, -36, -17, -6, 4, -5, -8, -14, -10, -11, 2, -3, -11, -16, 68, -59, -18, -9, -3, -12, -5, 5, -11, 3, -20, 63, -59, -11, 1, -19, -6, 3, -13, -13, 63, -40, -40, -3, 5, -23, Ascii.FF, -8, -19, Ascii.EM, -22, -18, -7, 5, 59, -38, -39, -7, -1, -26, 3, -14, 37, -42, -9, -2, -13, -18, -4, -9, -5, -5, 3, -15, -12, 60};
    private static final int $$k = 51;
    private static final byte[] $$d = {120, Ascii.VT, 65, 93, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 38;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(int r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestDataActivity.$$l
            int r6 = r6 * 4
            int r6 = 4 - r6
            int r8 = 116 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r6 = r6 + 1
            int r8 = r8 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestDataActivity.$$n(int, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestDataActivity.$$d
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r6 = 100 - r6
            int r1 = r5 + 4
            byte[] r1 = new byte[r1]
            int r5 = r5 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            int r6 = r6 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestDataActivity.h(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 111 - r6
            int r0 = r8 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestDataActivity.$$j
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r8 = r8 + 9
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-6)
            int r7 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestDataActivity.i(int, short, int, java.lang.Object[]):void");
    }

    public static final ShareDataViewModel access$getViewModel(RequestDataActivity requestDataActivity) {
        int i = 2 % 2;
        int i2 = copy + 13;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ShareDataViewModel viewModel = requestDataActivity.getViewModel();
        int i4 = getAsAtTimestamp + 39;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return viewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RequestDataActivity() {
        final RequestDataActivity requestDataActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ShareDataViewModel.class), new Function0<ViewModelStore>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 37;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = requestDataActivity.getViewModelStore();
                if (i3 != 0) {
                    int i4 = 26 / 0;
                }
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 75;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = copydefault + 57;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return viewModelStoreInvoke;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 111;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = copydefault + 23;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 87;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = requestDataActivity.getDefaultViewModelProviderFactory();
                int i4 = copydefault + 83;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return defaultViewModelProviderFactory;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras;
                int i = 2 % 2;
                int i2 = copydefault + 13;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Function0 function02 = function0;
                if (function02 == null || (defaultViewModelCreationExtras = (CreationExtras) function02.invoke()) == null) {
                    defaultViewModelCreationExtras = requestDataActivity.getDefaultViewModelCreationExtras();
                }
                int i4 = copydefault + 93;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return defaultViewModelCreationExtras;
                }
                throw null;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 31;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component3 + 27;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 35 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final ShareDataViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = copy + 63;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ShareDataViewModel shareDataViewModel = (ShareDataViewModel) this.viewModel.getValue();
        int i4 = copy + 41;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return shareDataViewModel;
        }
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 1;
        private static int component1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int component2 = 1;
            private static int component3;
            final RequestDataActivity ShareDataUIState;

            public static Object ShareDataUIState(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
                int i7 = ~i5;
                int i8 = ~i2;
                int i9 = (~(i7 | i8)) | (~(i7 | i6));
                int i10 = ~(i5 | i6);
                int i11 = ~i6;
                int i12 = (~(i2 | i7 | i11)) | i10;
                int i13 = i7 | (~(i8 | i11));
                int i14 = i5 + i6 + i4 + ((-1570926368) * i3) + ((-1409401439) * i);
                int i15 = i14 * i14;
                int i16 = (((-543990125) * i5) - 657981440) + (821186744 * i6) + ((-1953193618) * i9) + ((-976596809) * i12) + (976596809 * i13) + (1797783552 * i4) + (1124073472 * i3) + ((-332922880) * i) + ((-1182662656) * i15);
                int i17 = (i5 * 1410161459) + 847508490 + (i6 * 1410159032) + (i9 * (-1618)) + (i12 * (-809)) + (i13 * 809) + (i4 * 1410159841) + (i3 * 1126552800) + (i * (-1948647807)) + (i15 * (-1287520256));
                return i16 + ((i17 * i17) * (-1577189376)) != 1 ? component3(objArr) : component1(objArr);
            }

            public static final Resource component2(State state) {
                int i = 2 % 2;
                int i2 = component3 + 73;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Resource<DataSharingResponse> resourceCopydefault = copydefault((State<Resource<DataSharingResponse>>) state);
                if (i3 == 0) {
                    int i4 = 83 / 0;
                }
                int i5 = component3 + 73;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return resourceCopydefault;
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component3 + 37;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                component2(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 17;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestDataActivity$onCreate$1$1$1", f = "RequestDataActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private static int ShareDataUIState = 1;
                private static int component1;
                int component2;
                final RequestDataActivity component3;
                final State<Resource<DataSharingResponse>> copydefault;

                /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        Method dump skipped, instruction units count: 238
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestDataActivity.copydefault.AnonymousClass4.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(RequestDataActivity requestDataActivity, State<Resource<DataSharingResponse>> state, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.component3 = requestDataActivity;
                    this.copydefault = state;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component3, this.copydefault, continuation);
                    int i2 = ShareDataUIState + 95;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass2;
                }

                @Override
                public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 31;
                    component1 = i2 % 128;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 == 0) {
                        return ShareDataUIState(coroutineScope2, continuation2);
                    }
                    ShareDataUIState(coroutineScope2, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 9;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(coroutineScope, continuation);
                    if (i3 != 0) {
                        anonymousClass2.invokeSuspend(Unit.INSTANCE);
                        throw null;
                    }
                    Object objInvokeSuspend = anonymousClass2.invokeSuspend(Unit.INSTANCE);
                    int i4 = component1 + 3;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
            
                if (r22.getSkipping() == false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
            
                r22.skipToGroupEnd();
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
            
                if (r22.getSkipping() == false) goto L13;
             */
            /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component2(androidx.compose.runtime.Composer r22, int r23) {
                /*
                    Method dump skipped, instruction units count: 288
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestDataActivity.copydefault.AnonymousClass4.component2(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit copydefault(RequestDataFormState requestDataFormState) {
                int i = 2 % 2;
                int i2 = component3 + 99;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(requestDataFormState, "");
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(requestDataFormState, "");
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            private static final Unit component2(RequestDataActivity requestDataActivity, ShareDataBeneficiary shareDataBeneficiary) {
                int i = 2 % 2;
                int i2 = component2 + 95;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(requestDataActivity, "");
                if (shareDataBeneficiary != null) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("beneficiary", shareDataBeneficiary);
                    bundle.putBoolean("isDeleteSponsor", true);
                    RouteUtils.routeWithExecute(requestDataActivity, RoutePathConstant.SFC_SHARE_DATA_DELETE_BENEFICIARY, bundle);
                    int i4 = component2 + 121;
                    component3 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 / 2;
                    }
                }
                return Unit.INSTANCE;
            }

            private static Object component1(Object[] objArr) {
                Unit unit;
                RequestDataActivity requestDataActivity = (RequestDataActivity) objArr[0];
                int i = 2 % 2;
                int i2 = component2 + 1;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(requestDataActivity, "");
                    RequestDataActivity.access$getViewModel(requestDataActivity).querySponsors();
                    unit = Unit.INSTANCE;
                    int i3 = 83 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(requestDataActivity, "");
                    RequestDataActivity.access$getViewModel(requestDataActivity).querySponsors();
                    unit = Unit.INSTANCE;
                }
                int i4 = component2 + 49;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            private static final Unit ShareDataUIState(RequestDataActivity requestDataActivity, String str, String str2) {
                int i = 2 % 2;
                int i2 = component3 + 125;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(requestDataActivity, "");
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    RequestDataActivity.access$getViewModel(requestDataActivity).requestData(str, str2);
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(requestDataActivity, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                RequestDataActivity.access$getViewModel(requestDataActivity).requestData(str, str2);
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            private static final ShareDataUIState component1(State<ShareDataUIState> state) {
                int i = 2 % 2;
                int i2 = component2 + 55;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ShareDataUIState value = state.getValue();
                int i4 = component3 + 123;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 87 / 0;
                }
                return value;
            }

            private static final Resource<DataSharingResponse> copydefault(State<Resource<DataSharingResponse>> state) {
                int i = 2 % 2;
                int i2 = component3 + 87;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Resource<DataSharingResponse> value = state.getValue();
                int i4 = component2 + 95;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return value;
            }

            private static final List<Balances> ShareDataUIState(State<? extends List<Balances>> state) {
                int i = 2 % 2;
                int i2 = component2 + 37;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                List<Balances> value = state.getValue();
                int i4 = component2 + 75;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return value;
            }

            public static Unit component3(RequestDataActivity requestDataActivity) {
                int i = 2 % 2;
                int i2 = component2 + 99;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                int iComponent2 = ViewAllFavoritesScreenKt.copydefault.component2();
                int iComponent22 = ViewAllFavoritesScreenKt.copydefault.component2();
                int iComponent23 = ViewAllFavoritesScreenKt.copydefault.component2();
                Unit unit = (Unit) ShareDataUIState(ViewAllFavoritesScreenKt.copydefault.component2(), iComponent2, iComponent23, iComponent22, 870363303, new Object[]{requestDataActivity}, -870363302);
                int i4 = component2 + 117;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component3(RequestDataFormState requestDataFormState) {
                int i = 2 % 2;
                int i2 = component2 + 83;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return copydefault(requestDataFormState);
                }
                copydefault(requestDataFormState);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component1(RequestDataActivity requestDataActivity, ShareDataBeneficiary shareDataBeneficiary) {
                int i = 2 % 2;
                int i2 = component3 + 97;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return component2(requestDataActivity, shareDataBeneficiary);
                }
                component2(requestDataActivity, shareDataBeneficiary);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component1(RequestDataActivity requestDataActivity, String str, String str2) {
                int iComponent2 = ViewAllFavoritesScreenKt.copydefault.component2();
                int iComponent22 = ViewAllFavoritesScreenKt.copydefault.component2();
                int iComponent23 = ViewAllFavoritesScreenKt.copydefault.component2();
                return (Unit) ShareDataUIState(ViewAllFavoritesScreenKt.copydefault.component2(), iComponent2, iComponent23, iComponent22, -652425760, new Object[]{requestDataActivity, str, str2}, 652425760);
            }

            AnonymousClass4(RequestDataActivity requestDataActivity) {
                this.ShareDataUIState = requestDataActivity;
            }

            private static final Unit ShareDataUIState(RequestDataActivity requestDataActivity) {
                int iComponent2 = ViewAllFavoritesScreenKt.copydefault.component2();
                int iComponent22 = ViewAllFavoritesScreenKt.copydefault.component2();
                int iComponent23 = ViewAllFavoritesScreenKt.copydefault.component2();
                return (Unit) ShareDataUIState(ViewAllFavoritesScreenKt.copydefault.component2(), iComponent2, iComponent23, iComponent22, 870363303, new Object[]{requestDataActivity}, -870363302);
            }

            private static Object component3(Object[] objArr) {
                RequestDataActivity requestDataActivity = (RequestDataActivity) objArr[0];
                String str = (String) objArr[1];
                String str2 = (String) objArr[2];
                int i = 2 % 2;
                int i2 = component2 + 71;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(requestDataActivity, str, str2);
                int i4 = component2 + 19;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitShareDataUIState;
                }
                throw null;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 33;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            copydefault(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void copydefault(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 7;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0 ? (i & 11) == 2 : (i & 35) == 4) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                } else {
                    int i4 = component1 + 9;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-285780512, true, new AnonymousClass4(RequestDataActivity.this), composer, 54), composer, 1572864, 63);
            int i6 = ShareDataUIState + 41;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }

        copydefault() {
        }
    }

    private static void g(int i, int[] iArr, Object[] objArr) throws Throwable {
        String str;
        String str2 = "";
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component2;
        long j = 0;
        int i3 = 684241640;
        int i4 = 1;
        char c2 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c2] = Integer.valueOf(iArr2[i5]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) ($$l[c2] - 1);
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4392 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), -309236339, false, $$n(b2, b3, (byte) (b3 | 10)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i5] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i5++;
                    j = 0;
                    i3 = 684241640;
                    c2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $10 + 119;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component2;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr5[i8]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) ($$l[0] - 1);
                    byte b5 = b4;
                    str = str2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - TextUtils.indexOf(str2, str2), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36, (char) ((-1) - TextUtils.indexOf((CharSequence) str2, '0', 0)), -309236339, false, $$n(b4, b5, (byte) (b5 | 10)), new Class[]{Integer.TYPE});
                } else {
                    str = str2;
                }
                iArr6[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i8++;
                str2 = str;
                i4 = 1;
            }
            iArr5 = iArr6;
        }
        char c3 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c3] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            for (int i9 = 0; i9 < 16; i9++) {
                int i10 = $11 + 83;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                getactivenotifications.ShareDataUIState ^= iArr4[i9];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    int edgeSlop = 2968 - (ViewConfiguration.getEdgeSlop() >> 16);
                    int longPressTimeout = 16 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49871);
                    byte b6 = (byte) ($$l[0] - 1);
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, longPressTimeout, keyRepeatTimeout, 462826032, false, $$n(b6, b7, (byte) (b7 | Ascii.FF)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
            }
            int i12 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i12;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i13 = getactivenotifications.ShareDataUIState;
            int i14 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2944;
                int i15 = 24 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                char cRed = (char) (27637 - Color.red(0));
                byte b8 = (byte) ($$l[0] - 1);
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, i15, cRed, -1616366948, false, $$n(b8, b9, (byte) (b9 | 9)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            c3 = 0;
        }
        String str3 = new String(cArr2, 0, i);
        int i16 = $10 + 35;
        $11 = i16 % 128;
        int i17 = i16 % 2;
        objArr[0] = str3;
    }

    private static void f(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(ShareDataUIState)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 999;
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 31;
                char cResolveOpacity = (char) (61685 - Drawable.resolveOpacity(0, 0));
                byte b3 = (byte) ($$l[0] - 1);
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, threadPriority, cResolveOpacity, 1874745193, false, $$n(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = component3;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2984;
                                int gidForName = Process.getGidForName("") + 49;
                                char scrollBarFadeDuration = (char) (54462 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                                byte b5 = (byte) ($$l[0] - 1);
                                byte b6 = b5;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSizeAndState, gidForName, scrollBarFadeDuration, -1178636483, false, $$n(b5, b6, b6), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = component3;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component1)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        int i8 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 998;
                        int i9 = 31 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        char defaultSize = (char) (61685 - View.getDefaultSize(0, 0));
                        byte b7 = (byte) ($$l[0] - 1);
                        byte b8 = b7;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i8, i9, defaultSize, 1874745193, false, $$n(b7, b8, (byte) (b8 + 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                    int i10 = $10 + 95;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 3 % 3;
                    }
                    i4 = 2;
                } else {
                    iIntValue = (short) (((short) (((long) equals[i + ((int) (((long) component1) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)));
                    int i12 = $11 + 79;
                    $10 = i12 % 128;
                    i4 = 2;
                    int i13 = i12 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                int i14 = ((i + iIntValue) - i4) + ((int) (((long) component1) ^ 7083766810336261929L));
                if (z) {
                    int i15 = $11 + 123;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                getsmalliconid.copydefault = i14 + i5;
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i2), Integer.valueOf(copydefault), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    int i17 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1697;
                    int iMyPid = (Process.myPid() >> 22) + 37;
                    char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                    byte[] bArr4 = $$l;
                    byte b9 = (byte) (bArr4[0] - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i17, iMyPid, packedPositionType, -1454191902, false, $$n(b9, b9, (byte) bArr4.length), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr5 = component3;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr6[i18] = (byte) (((long) bArr5[i18]) ^ 7083766810336261929L);
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (!z2) {
                        short[] sArr = equals;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        byte[] bArr7 = component3;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x02ea  */
    /* JADX WARN: Type inference failed for: r1v463, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestDataActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestDataActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 19;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr = new Object[1];
                f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1793648988, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952721_res_0x7f130451).substring(6, 7).codePointAt(0) + 935427048, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952747_res_0x7f13046b).substring(22, 23).length() + 49), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 129, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new int[]{348655342, 1107629623, 269873964, 686256465, 579550249, 1257967099, -1782255204, -1647209280, 532399638, 36827392}, objArr2);
                baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i3 = getAsAtTimestamp + 13;
                copy = i3 % 128;
                if (i3 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    throw null;
                }
                baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6617, (ViewConfiguration.getWindowTouchSlop() >> 8) + 42, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 6563, TextUtils.getCapsMode("", 0, 0) + 56, (char) (TextUtils.lastIndexOf("", '0') + 1), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            super.onPause();
            return;
        }
        getBaseContext();
        throw null;
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r51) {
        /*
            Method dump skipped, instruction units count: 14722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestDataActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        component4 = 0;
        component2();
        int i = getRequestBeneficiariesState + 45;
        component4 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 123;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copy + 73;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
    }

    static void component2() {
        component2 = new int[]{181841026, -686424553, 2003797895, 659002110, -1455697182, 785515520, -1370396082, 4437476, -1289397679, 1254788324, 844277516, 299391178, -1969958651, -419944433, -1395988257, -1761682098, 857936330, -1566769006};
        component1 = 1692164514;
        ShareDataUIState = -238323941;
        copydefault = 972419952;
        component3 = new byte[]{-61, 42, -30, -46, -8, -29, -24, -15, -53, -128, -6, -16, -24, -14, -22, -10, -39, -56, -91, -25, -12, 40, -79, -32, -31, -30, -11, -19, -14, Ascii.US, Ascii.EM, Ascii.DLE, 7, Ascii.ESC, Ascii.DLE, Ascii.EM, Ascii.CAN, 44, 72, Ascii.GS, 33, Ascii.GS, 75, 40, 79, 6, Ascii.SUB, 43, 65, 2, Ascii.GS, 33, Ascii.SUB, 76, 41, Ascii.ESC, Ascii.US, Ascii.ESC, 119, Ascii.DC2, 40, 118, Ascii.CAN, Ascii.FS, Ascii.US, 43, Ascii.GS, 119, 17, Ascii.US, -44, SignedBytes.MAX_POWER_OF_TWO, 40, 116, Ascii.DC2, Ascii.EM, 42, Ascii.SUB, 73, Ascii.EM, 17, Ascii.US, -41, 78, 43, Ascii.SUB, 75, Ascii.RS, Ascii.ESC, Ascii.CAN, 43, 76, -46, -25, -30, -8, -18, -119, -8, -27, -42, -28, -27, -20, -118, -48, -6, -78, -41, -17, -1, -17, -30, -7, -27, -74, -45, -120, 41, -25, -77, -45, -6, -66, 41, -28, -75, -41, -29, -74, -44, -30, -30, -25, -5, -29, -28, -74, -30, -7, -45, -5, -17, -73, -7, -28, -45, -25, -7, -32, -5, -77, -48, -74, 42, 20, 109, 110, 4, 102, 93, Ascii.DC2, -45, -84, -48, Ascii.SYN, 101, Ascii.NAK, Ascii.RS, 106, 81, 45, Ascii.RS, 100, 89, 41, Ascii.NAK, 99, 90, 46, Ascii.CAN, 102, 3, 107, Ascii.NAK, 100, Ascii.EM, 102, 3, 101, 94, -47, Ascii.SYN, 121, Ascii.NAK, 4, 120, 19, Ascii.CAN, 97, Ascii.ESC, -83, 35, 20, 67, 104, 105, Ascii.ETB, 19, 106, 19, Ascii.SYN, 37, 88, 19, 20, 104, 20, 108, Ascii.ETB, Ascii.SUB, 44, 104, 19, Ascii.ETB, 99, -86, 81, -88, -88, 90, -48, -53, -37, -62, 62, 63, -111, -61, -41, -49, 6, -105, -11, 47, -63, 38, -46, 35, Ascii.EM, -12, 38, -47, 33, 40, 4, 5, -21, 34, 97, -8, 43, 40, 45, 60, -44, Base64.padSymbol, -52, 62, -49, -9, -54, -109, -49, 38, -109, -51, 62, -97, -56, 59, -111, 62, -111, 60, -102, -53, TarHeader.LF_CHR, -54, -102, 59, -63, -51, -54, -64, -55, -109, 57, -59, -104, TarHeader.LF_LINK, -97, -54, 59, -49, -64, -54, -100, -49, -50, 57, -100, 63, -51, -98, TarHeader.LF_LINK, -54, -54, -111, -53, 63, -97, 56, -110, -51, -51, TarHeader.LF_LINK, -104, 57, -111, -84, -71, -88, -91, -82, -95, -94, -90, -86, -90, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41};
    }
}
