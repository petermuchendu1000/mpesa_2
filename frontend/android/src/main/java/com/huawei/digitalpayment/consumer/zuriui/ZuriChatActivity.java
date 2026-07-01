package com.huawei.digitalpayment.consumer.zuriui;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.zuriui.models.ChatAction;
import com.huawei.digitalpayment.consumer.zuriui.state.ChatUiState;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/zuriui/ZuriChatActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/zuriui/ZuriChatViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/zuriui/ZuriChatViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcZuriUi_release", "uiState", "Lcom/huawei/digitalpayment/consumer/zuriui/state/ChatUiState;", "isFirstTime", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class ZuriChatActivity extends Hilt_ZuriChatActivity {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static long component1;
    private static char[] component3;
    private static char[] copydefault;

    private final Lazy viewModel;
    private static final byte[] $$l = {107, -21, -54, -113};
    private static final int $$m = BERTags.PRIVATE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {79, 9, 94, -7, Ascii.SO, 0, -61, 59, 10, 2, -6, 7, -5, -53, 78, 0, -13, 7, -5, -55, 68, -10, 4, -48, -1, 8, -7, 56, 3, 0, Ascii.SO, -9, 3, Ascii.SI, -66, Ascii.SYN, 33, 19, -13, Ascii.SO, -9, 3, -22, Ascii.SUB, 17, -17, 5, -1, Ascii.NAK, -17, Ascii.ETB, -5, 19, -11, -31, Ascii.US, Ascii.NAK, -17, -10, -10, Ascii.FF, 35, -17, Ascii.NAK, -13, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -63, Ascii.SO, 0, -61, 71, -16, 7, -3, 19, -7, -4, Ascii.SO, 0, -61, TarHeader.LF_DIR, Ascii.SI, -8, Ascii.DLE, -1, -4, -3, -52, 56, 3, Ascii.DLE, -8, 0, 9, -62, 72, -13, 10, 5, -2, -9, Ascii.NAK, -13, Ascii.DLE, -67, 56, Ascii.DLE, -1, 3, -10, 13, 10, -7, -3, 7, 4, 7, 1, PSSSigner.TRAILER_IMPLICIT, Ascii.CAN, TarHeader.LF_NORMAL, -1, 3, -10, 13, 10, -7, -35, 39, 4, 7, 1, -31, 20, 0, 19, -9, 8, 1, -33, 43, -78, TarHeader.LF_LINK, Ascii.ETB, -5, 19, -11, -31, Ascii.US, Ascii.NAK, -17, -10, -10, Ascii.FF, 35, -17, Ascii.NAK, -13, -63, 19, Ascii.SO, 3, Ascii.VT, -19, 3, 3, -3, Ascii.SYN, -7, 10, 6, 7, -6, -1, 7, Ascii.FF, -72, TarHeader.LF_CONTIG, Ascii.SO, 5, -1, 8, 1, -9, 7, -7, Ascii.DLE, -67, 56, 3, -1, Ascii.NAK, -12, -55, Base64.padSymbol, 7, 8, -13, Ascii.SI, -2, -11, 13, -60, Ascii.CAN, 35, -1, Ascii.NAK, -12, -34, 46, 5, -1, 8, 1, -9, 7, -7, -26, 39, -6, Ascii.VT, -36, 38, 5, -2, -70, TarHeader.LF_LINK, Ascii.ETB, -5, 19, -11, -31, Ascii.US, Ascii.NAK, -17, -10, -10, Ascii.FF, 35, -17, Ascii.NAK, -13, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -64};
    private static final int $$k = 107;
    private static final byte[] $$d = {90, 10, -103, 87, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 231;
    private static int getAsAtTimestamp = 0;
    private static int component4 = 1;
    private static int component2 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(byte r5, short r6, short r7) {
        /*
            int r6 = 115 - r6
            int r5 = r5 * 4
            int r0 = r5 + 1
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r7]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.$$n(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 83
            int r0 = r7 + 4
            int r6 = 100 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-8)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.h(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 8
            int r8 = 107 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.$$j
            int r6 = r6 + 10
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r7]
        L24:
            int r8 = r8 + r3
            int r8 = r8 + (-2)
            int r7 = r7 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.i(byte, int, short, java.lang.Object[]):void");
    }

    public static final ZuriChatViewModel access$getViewModel(ZuriChatActivity zuriChatActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 13;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ZuriChatViewModel viewModel = zuriChatActivity.getViewModel();
        int i4 = getAsAtTimestamp + 39;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return viewModel;
    }

    public ZuriChatActivity() {
        final ZuriChatActivity zuriChatActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ZuriChatViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 115;
                component1 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    zuriChatActivity.getViewModelStore();
                    obj.hashCode();
                    throw null;
                }
                ViewModelStore viewModelStore = zuriChatActivity.getViewModelStore();
                int i3 = component1 + 115;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    return viewModelStore;
                }
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 31;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                if (i3 == 0) {
                    int i4 = 57 / 0;
                }
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 109;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = copydefault + 89;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                int i2 = copydefault + 3;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    defaultViewModelProviderFactory = zuriChatActivity.getDefaultViewModelProviderFactory();
                    int i3 = 50 / 0;
                } else {
                    defaultViewModelProviderFactory = zuriChatActivity.getDefaultViewModelProviderFactory();
                }
                int i4 = copydefault + 21;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 0 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras;
                int i = 2 % 2;
                Function0 function02 = function0;
                if (function02 == null || (defaultViewModelCreationExtras = (CreationExtras) function02.invoke()) == null) {
                    defaultViewModelCreationExtras = zuriChatActivity.getDefaultViewModelCreationExtras();
                    int i2 = ShareDataUIState + 27;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                }
                int i4 = copydefault + 47;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 83 / 0;
                }
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 3;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = copydefault + 95;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final ZuriChatViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.viewModel.getValue();
        if (i3 != 0) {
            return (ZuriChatViewModel) value;
        }
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        public static final boolean component3(State state) {
            int i = 2 % 2;
            int i2 = copydefault + 9;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return ShareDataUIState(state);
            }
            ShareDataUIState(state);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final ChatUiState copydefault(State state) {
            int i = 2 % 2;
            int i2 = copydefault + 109;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ChatUiState chatUiStateComponent2 = component2(state);
            int i4 = copydefault + 55;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return chatUiStateComponent2;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = copydefault + 25;
            ShareDataUIState = i2 % 128;
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

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            private static int component1 = 1;
            private static int component3;
            final ZuriChatActivity ShareDataUIState;
            final State<Boolean> component2;
            final State<ChatUiState> copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component3 + 109;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                component2(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 73;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit copydefault(ZuriChatActivity zuriChatActivity) {
                int i = 2 % 2;
                int i2 = component1 + 35;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(zuriChatActivity, "");
                ZuriChatActivity.access$getViewModel(zuriChatActivity).onStartChat();
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 83;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit ShareDataUIState(ZuriChatActivity zuriChatActivity) {
                int i = 2 % 2;
                int i2 = component3 + 5;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(zuriChatActivity, "");
                zuriChatActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 31;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component2(androidx.compose.runtime.Composer r8, int r9) {
                /*
                    r7 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    r9 = r9 & 11
                    if (r9 != r0) goto L2d
                    int r9 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.AnonymousClass3.component3
                    int r9 = r9 + 9
                    int r1 = r9 % 128
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.AnonymousClass3.component1 = r1
                    int r9 = r9 % r0
                    boolean r9 = r8.getSkipping()
                    if (r9 != 0) goto L20
                    int r9 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.AnonymousClass3.component1
                    int r9 = r9 + 113
                    int r1 = r9 % 128
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.AnonymousClass3.component3 = r1
                    int r9 = r9 % r0
                    goto L2d
                L20:
                    r8.skipToGroupEnd()
                    int r8 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.AnonymousClass3.component3
                    int r8 = r8 + 35
                    int r9 = r8 % 128
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.AnonymousClass3.component1 = r9
                L2b:
                    int r8 = r8 % r0
                    goto L96
                L2d:
                    androidx.compose.runtime.State<java.lang.Boolean> r9 = r7.component2
                    boolean r9 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.component3(r9)
                    if (r9 == 0) goto L54
                    r9 = -219450098(0xfffffffff2eb750e, float:-9.3274224E30)
                    r8.startReplaceGroup(r9)
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity$onCreate$1$1$$ExternalSyntheticLambda0 r0 = new com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity$onCreate$1$1$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity r9 = r7.ShareDataUIState
                    r0.<init>()
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity$onCreate$1$1$$ExternalSyntheticLambda1 r1 = new com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity$onCreate$1$1$$ExternalSyntheticLambda1
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity r9 = r7.ShareDataUIState
                    r1.<init>()
                    r2 = 0
                    r4 = 0
                    r5 = 4
                    r3 = r8
                    com.huawei.digitalpayment.consumer.zuriui.ZuriLandingScreenKt.ZuriLandingScreen(r0, r1, r2, r3, r4, r5)
                    r8.endReplaceGroup()
                    goto L96
                L54:
                    r9 = -219319650(0xfffffffff2ed729e, float:-9.4062734E30)
                    r8.startReplaceGroup(r9)
                    androidx.compose.runtime.State<com.huawei.digitalpayment.consumer.zuriui.state.ChatUiState> r9 = r7.copydefault
                    com.huawei.digitalpayment.consumer.zuriui.state.ChatUiState r1 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.copydefault(r9)
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity r9 = r7.ShareDataUIState
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel r9 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.access$getViewModel(r9)
                    kotlinx.coroutines.flow.SharedFlow r9 = r9.getEvents()
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity$copydefault$3$2 r2 = new com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity$copydefault$3$2
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity r3 = r7.ShareDataUIState
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel r3 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.access$getViewModel(r3)
                    r2.<init>(r3)
                    kotlin.reflect.KFunction r2 = (kotlin.reflect.KFunction) r2
                    kotlinx.coroutines.flow.Flow r9 = (kotlinx.coroutines.flow.Flow) r9
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity$onCreate$1$1$$ExternalSyntheticLambda2 r3 = new com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity$onCreate$1$1$$ExternalSyntheticLambda2
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity r4 = r7.ShareDataUIState
                    r3.<init>()
                    r4 = r2
                    kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
                    r6 = 64
                    r2 = r9
                    r5 = r8
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatScreenKt.ZuriChatScreen(r1, r2, r3, r4, r5, r6)
                    r8.endReplaceGroup()
                    int r8 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.AnonymousClass3.component1
                    int r8 = r8 + 99
                    int r9 = r8 % 128
                    com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.AnonymousClass3.component3 = r9
                    goto L2b
                L96:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.AnonymousClass3.component2(androidx.compose.runtime.Composer, int):void");
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass2 extends FunctionReferenceImpl implements Function1<ChatAction, Unit> {
                private static int component2 = 0;
                private static int copydefault = 1;

                public final void component2(ChatAction chatAction) {
                    int i = 2 % 2;
                    int i2 = copydefault + 23;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(chatAction, "");
                    ((ZuriChatViewModel) this.receiver).onChatAction(chatAction);
                    int i4 = copydefault + 99;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 89 / 0;
                    }
                }

                @Override
                public Unit invoke(ChatAction chatAction) {
                    int i = 2 % 2;
                    int i2 = component2 + 101;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    component2(chatAction);
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 89;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                AnonymousClass2(Object obj) {
                    super(1, obj, ZuriChatViewModel.class, "onChatAction", "onChatAction(Lcom/huawei/digitalpayment/consumer/zuriui/models/ChatAction;)V", 0);
                }
            }

            private static final Unit copy(ZuriChatActivity zuriChatActivity) {
                int i = 2 % 2;
                int i2 = component1 + 77;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(zuriChatActivity, "");
                    zuriChatActivity.finish();
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(zuriChatActivity, "");
                zuriChatActivity.finish();
                int i3 = 65 / 0;
                return Unit.INSTANCE;
            }

            public static Unit component3(ZuriChatActivity zuriChatActivity) {
                int i = 2 % 2;
                int i2 = component1 + 89;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(zuriChatActivity);
                int i4 = component3 + 79;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitShareDataUIState;
                }
                throw null;
            }

            public static Unit component2(ZuriChatActivity zuriChatActivity) {
                int i = 2 % 2;
                int i2 = component1 + 125;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    copydefault(zuriChatActivity);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitCopydefault = copydefault(zuriChatActivity);
                int i3 = component3 + 89;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 8 / 0;
                }
                return unitCopydefault;
            }

            public static Unit component1(ZuriChatActivity zuriChatActivity) {
                int i = 2 % 2;
                int i2 = component3 + 29;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopy = copy(zuriChatActivity);
                if (i3 == 0) {
                    int i4 = 52 / 0;
                }
                return unitCopy;
            }

            AnonymousClass3(ZuriChatActivity zuriChatActivity, State<Boolean> state, State<ChatUiState> state2) {
                this.ShareDataUIState = zuriChatActivity;
                this.component2 = state;
                this.copydefault = state2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void copydefault(androidx.compose.runtime.Composer r13, int r14) {
            /*
                r12 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.copydefault
                int r1 = r1 + 69
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.ShareDataUIState = r2
                int r1 = r1 % r0
                r14 = r14 & 11
                if (r14 != r0) goto L22
                int r2 = r2 + 115
                int r14 = r2 % 128
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.copydefault = r14
                int r2 = r2 % r0
                boolean r14 = r13.getSkipping()
                if (r14 != 0) goto L1e
                goto L22
            L1e:
                r13.skipToGroupEnd()
                goto L69
            L22:
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity r14 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.this
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel r14 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.access$getViewModel(r14)
                kotlinx.coroutines.flow.StateFlow r1 = r14.getUiState()
                r2 = 0
                r3 = 0
                r4 = 0
                r6 = 8
                r7 = 7
                r5 = r13
                androidx.compose.runtime.State r14 = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle(r1, r2, r3, r4, r5, r6, r7)
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity r1 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.this
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatViewModel r1 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.access$getViewModel(r1)
                kotlinx.coroutines.flow.StateFlow r2 = r1.isFirstTimeChattingZuri()
                r5 = 0
                r7 = 8
                r8 = 7
                r6 = r13
                androidx.compose.runtime.State r1 = androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle(r2, r3, r4, r5, r6, r7, r8)
                r2 = 0
                r6 = 0
                r7 = 0
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity$copydefault$3 r8 = new com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity$copydefault$3
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity r9 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.this
                r8.<init>(r9, r1, r14)
                r14 = 54
                r1 = -1304591711(0xffffffffb23d82a1, float:-1.10309495E-8)
                r9 = 1
                androidx.compose.runtime.internal.ComposableLambda r14 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r1, r9, r8, r13, r14)
                r8 = r14
                kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
                r10 = 1572864(0x180000, float:2.204052E-39)
                r11 = 63
                r9 = r13
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            L69:
                int r13 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.copydefault
                int r13 = r13 + 3
                int r14 = r13 % 128
                com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.ShareDataUIState = r14
                int r13 = r13 % r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.copydefault.copydefault(androidx.compose.runtime.Composer, int):void");
        }

        private static final ChatUiState component2(State<ChatUiState> state) {
            int i = 2 % 2;
            int i2 = copydefault + 75;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ChatUiState value = state.getValue();
            int i4 = copydefault + 11;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return value;
            }
            throw null;
        }

        private static final boolean ShareDataUIState(State<Boolean> state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 45;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = state.getValue().booleanValue();
            if (i3 == 0) {
                int i4 = 79 / 0;
            }
            return zBooleanValue;
        }

        copydefault() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r22, char[] r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.g(int, char[], java.lang.Object[]):void");
    }

    private static void f(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = copydefault;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 657, 14 - ExpandableListView.getPackedPositionGroup(j), (char) (65118 - TextUtils.indexOf("", "")), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i7 = $11 + 41;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i9 = $11 + 55;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i11 = $10 + 3;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 4503, ExpandableListView.getPackedPositionChild(0L) + 37, (char) (27897 - ((Process.getThreadPriority(0) + 20) >> 6)), -1464227204, false, $$n(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - KeyEvent.keyCodeFromString(""), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28, (char) ((-1) - Process.getGidForName("")), 1180380354, false, $$n(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 34, (char) View.getDefaultSize(0, 0), 80302927, false, $$n(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i15 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i15, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i16 = $10 + 37;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i18 = $10 + 1;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] / iArr[2]);
                } else {
                    cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                }
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void j(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = component3;
        if (cArr2 != null) {
            int i7 = $11 + 79;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 93;
                $10 = i9 % 128;
                if (i9 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 658, 14 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (65118 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i8 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(657 - Color.blue(0), TextUtils.lastIndexOf("", '0') + 15, (char) (65118 - TextUtils.indexOf("", "", 0, 0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i = 2;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35, (char) (27898 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), -1464227204, false, $$n(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(3580 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28, (char) Color.argb(0, 0, 0, 0), 1180380354, false, $$n(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                try {
                    Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                    if (objCopydefault5 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1859 - ExpandableListView.getPackedPositionGroup(0L), 34 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 80302927, false, $$n(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i12 = $10 + 125;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 1, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 >>> i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 - i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i13 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i13, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i13);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            int i14 = $11 + 121;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:304:0x21a2  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x21a3  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x21b2  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x21b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x010e  */
    /* JADX WARN: Type inference failed for: r5v244, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9118
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:(8:854|118|(1:120)|121|(3:123|(1:125)|126)(19:127|128|846|129|(1:131)|132|133|837|134|(1:136)|137|138|139|(1:141)|142|(1:144)|145|(1:147)|148)|149|(4:152|(3:903|154|906)(12:902|155|(3:157|(3:160|161|158)|907)|162|827|163|(1:165)|166|167|816|168|905)|904|150)|901)|841|314|(1:316)|317|341|835|342|(13:344|844|345|349|(5:839|351|352|863|353)(1:358)|829|359|360|801|(4:362|363|(1:365)|366)(12:(2:368|(1:374)(1:373))(1:378)|(20:380|810|381|(2:833|383)|387|388|802|389|(2:866|391)|395|396|397|(1:399)|400|401|402|(1:404)(1:405)|406|(1:408)|409)(1:465)|470|471|883|472|475|476|(1:478)|479|480|481)|410|(5:414|(13:416|(3:418|421|929)|422|(3:424|(4:427|(3:932|429|935)(4:931|430|431|934)|933|425)|930)|432|893|433|(1:435)|436|437|878|438|928)(2:419|(2:421|929)(11:422|(0)|432|893|433|(0)|436|437|878|438|928))|439|411|412)|927)(10:349|(0)(0)|829|359|360|801|(0)(0)|410|(2:411|412)|927)|482|(1:484)|485|(3:487|(1:489)|490)(14:491|492|(1:494)|495|496|(1:498)|499|857|500|501|(1:503)|504|(1:506)|507)|508|(27:510|(1:512)|513|(1:515)|516|(3:518|(1:520)|521)(16:523|524|(1:526)|527|(1:529)|530|531|(1:533)|534|897|535|536|(1:538)|539|(1:541)|542)|522|543|(1:545)(9:546|(3:548|(2:551|549)|925)|552|553|(1:555)|556|(1:558)|559|560)|561|848|562|(13:809|564|569|(1:571)|572|573|843|(4:575|576|(1:578)|579)(4:580|(2:582|(1:588)(1:587))|(22:590|591|812|592|593|831|594|(2:889|596)|600|601|818|602|(2:825|604)|608|609|610|(3:612|821|613)|614|(2:616|617)|618|(2:620|621)|622)|674)|623|(4:626|(2:628|923)(11:629|(3:631|(3:634|635|632)|924)|638|804|639|(1:641)|642|643|895|644|922)|645|624)|921|657|674)(11:569|(0)|572|573|843|(0)(0)|623|(1:624)|921|657|674)|689|(1:691)|692|(3:694|(1:696)|697)(13:699|814|700|701|(1:703)|704|859|705|706|(1:708)|709|(1:711)|712)|698|713|(6:716|717|(1:719)|720|721|722)|723|(1:725)|726|(3:728|(1:730)|731)(14:733|734|(1:736)|737|738|(1:740)|741|864|742|743|(1:745)|746|(1:748)|749)|732|750|(1:936)(7:753|754|(1:756)|757|758|759|760))(10:772|(3:774|(2:777|775)|926)|778|779|(1:781)|782|(1:784)|785|786|787)) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|806|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(10:899|32|(3:34|869|35)|39|40|882|(5:42|43|(1:45)|46|47)(16:49|50|885|51|(2:855|53)|57|58|59|(2:61|62)|63|64|65|(1:67)|68|(1:70)|71)|48|72|(9:75|872|76|(1:78)|79|80|81|870|82))|117|(19:(8:854|118|(1:120)|121|(3:123|(1:125)|126)(19:127|128|846|129|(1:131)|132|133|837|134|(1:136)|137|138|139|(1:141)|142|(1:144)|145|(1:147)|148)|149|(4:152|(3:903|154|906)(12:902|155|(3:157|(3:160|161|158)|907)|162|827|163|(1:165)|166|167|816|168|905)|904|150)|901)|850|310|(1:312)|313|841|314|(1:316)|317|341|835|342|(13:344|844|345|349|(5:839|351|352|863|353)(1:358)|829|359|360|801|(4:362|363|(1:365)|366)(12:(2:368|(1:374)(1:373))(1:378)|(20:380|810|381|(2:833|383)|387|388|802|389|(2:866|391)|395|396|397|(1:399)|400|401|402|(1:404)(1:405)|406|(1:408)|409)(1:465)|470|471|883|472|475|476|(1:478)|479|480|481)|410|(5:414|(13:416|(3:418|421|929)|422|(3:424|(4:427|(3:932|429|935)(4:931|430|431|934)|933|425)|930)|432|893|433|(1:435)|436|437|878|438|928)(2:419|(2:421|929)(11:422|(0)|432|893|433|(0)|436|437|878|438|928))|439|411|412)|927)(10:349|(0)(0)|829|359|360|801|(0)(0)|410|(2:411|412)|927)|482|(1:484)|485|(3:487|(1:489)|490)(14:491|492|(1:494)|495|496|(1:498)|499|857|500|501|(1:503)|504|(1:506)|507)|508|(27:510|(1:512)|513|(1:515)|516|(3:518|(1:520)|521)(16:523|524|(1:526)|527|(1:529)|530|531|(1:533)|534|897|535|536|(1:538)|539|(1:541)|542)|522|543|(1:545)(9:546|(3:548|(2:551|549)|925)|552|553|(1:555)|556|(1:558)|559|560)|561|848|562|(13:809|564|569|(1:571)|572|573|843|(4:575|576|(1:578)|579)(4:580|(2:582|(1:588)(1:587))|(22:590|591|812|592|593|831|594|(2:889|596)|600|601|818|602|(2:825|604)|608|609|610|(3:612|821|613)|614|(2:616|617)|618|(2:620|621)|622)|674)|623|(4:626|(2:628|923)(11:629|(3:631|(3:634|635|632)|924)|638|804|639|(1:641)|642|643|895|644|922)|645|624)|921|657|674)(11:569|(0)|572|573|843|(0)(0)|623|(1:624)|921|657|674)|689|(1:691)|692|(3:694|(1:696)|697)(13:699|814|700|701|(1:703)|704|859|705|706|(1:708)|709|(1:711)|712)|698|713|(6:716|717|(1:719)|720|721|722)|723|(1:725)|726|(3:728|(1:730)|731)(14:733|734|(1:736)|737|738|(1:740)|741|864|742|743|(1:745)|746|(1:748)|749)|732|750|(1:936)(7:753|754|(1:756)|757|758|759|760))(10:772|(3:774|(2:777|775)|926)|778|779|(1:781)|782|(1:784)|785|786|787))|203|820|204|(1:206)|207|(3:209|(1:211)|212)(19:213|214|807|215|(1:217)|218|219|799|220|(1:222)|223|224|225|(1:227)|228|(1:230)|231|(1:233)|234)|235|(4:239|(3:910|241|913)(12:908|242|(5:244|(1:246)(1:247)|920|(4:250|(3:916|252|919)(4:915|253|254|918)|917|248)|914)|255|891|256|(1:258)|259|260|876|261|912)|911|236)|909|238|(3:868|298|(1:304)(1:303))(1:308)|309|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x10b4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x10b5, code lost:
    
        r6 = new java.lang.Object[1];
        f(new byte[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0}, new int[]{249, 10, 95, 9}, true, r6);
        r4 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x10d4, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r2);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x10eb, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x10ef, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r4);
        r14 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r4 = r4 | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x111d, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x1121, code lost:
    
        if (r1 == null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x1123, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.view.KeyEvent.keyCodeFromString(""), (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 42, (char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0)), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x1150, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x1158, code lost:
    
        r9 = new java.lang.Object[]{-1116119288, java.lang.Long.valueOf(r4), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.graphics.Color.red(0) + 6562, 56 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16));
        r4 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.$$j;
        r10 = new java.lang.Object[1];
        i(r4[5], r4[201(0xc9, float:2.82E-43)], r4[68], r10);
        r2.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x11d1, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.component4 + 43;
        com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.getAsAtTimestamp = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x19c2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x19c3, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x068f A[Catch: all -> 0x02a2, TryCatch #4 {all -> 0x02a2, blocks: (B:111:0x0689, B:113:0x068f, B:114:0x06c1, B:476:0x1a44, B:478:0x1a4a, B:479:0x1a73, B:683:0x2b37, B:685:0x2b3d, B:686:0x2b6a, B:717:0x2e8c, B:719:0x2e92, B:720:0x2eb6, B:754:0x31f4, B:756:0x31fa, B:757:0x321b, B:734:0x3013, B:736:0x3036, B:737:0x3091, B:553:0x23dc, B:555:0x23e2, B:556:0x2410, B:558:0x244a, B:559:0x2493, B:524:0x208f, B:526:0x20a4, B:527:0x20d5, B:529:0x2109, B:530:0x218c, B:779:0x32f7, B:781:0x32fd, B:782:0x3325, B:784:0x335f, B:785:0x33a0, B:492:0x1c5d, B:494:0x1c72, B:495:0x1ca3, B:335:0x1346, B:337:0x134c, B:338:0x1374, B:290:0x111d, B:292:0x1123, B:293:0x1150, B:197:0x0bbf, B:199:0x0bc5, B:200:0x0bf1, B:19:0x0105, B:21:0x010b, B:22:0x0134, B:24:0x021a, B:26:0x024c, B:27:0x029c, B:204:0x0c76, B:206:0x0c7c, B:207:0x0cc5, B:209:0x0cd2, B:211:0x0cdb, B:212:0x0d21, B:235:0x0f52, B:236:0x0f56, B:239:0x0f61, B:242:0x0f78, B:248:0x0f93, B:252:0x0fa2, B:253:0x0faa, B:265:0x108e, B:267:0x1094, B:268:0x1095, B:270:0x1097, B:272:0x109e, B:273:0x109f, B:213:0x0d2c, B:225:0x0e37, B:227:0x0e3d, B:228:0x0e81, B:230:0x0eab, B:231:0x0ef3, B:233:0x0f09, B:234:0x0f4c, B:275:0x10a1, B:277:0x10a8, B:278:0x10a9, B:280:0x10ab, B:282:0x10b2, B:283:0x10b3, B:118:0x0743, B:120:0x0749, B:121:0x078e, B:123:0x079b, B:125:0x07a4, B:126:0x07ea, B:149:0x0a16, B:150:0x0a1a, B:152:0x0a20, B:155:0x0a38, B:158:0x0a45, B:160:0x0a48, B:172:0x0b34, B:174:0x0b3a, B:175:0x0b3b, B:177:0x0b3d, B:179:0x0b44, B:180:0x0b45, B:127:0x07f5, B:139:0x08f2, B:141:0x08f8, B:142:0x093d, B:144:0x0967, B:145:0x09b1, B:147:0x09c7, B:148:0x0a10, B:182:0x0b47, B:184:0x0b4e, B:185:0x0b4f, B:187:0x0b51, B:189:0x0b58, B:190:0x0b59, B:298:0x11df, B:300:0x11e3, B:321:0x12cd, B:323:0x12d3, B:324:0x12d4, B:326:0x12d6, B:328:0x12dd, B:329:0x12de, B:304:0x11ef), top: B:806:0x0105, inners: #12, #30, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0c7c A[Catch: all -> 0x10b4, TryCatch #12 {all -> 0x10b4, blocks: (B:204:0x0c76, B:206:0x0c7c, B:207:0x0cc5, B:209:0x0cd2, B:211:0x0cdb, B:212:0x0d21, B:235:0x0f52, B:236:0x0f56, B:239:0x0f61, B:242:0x0f78, B:248:0x0f93, B:252:0x0fa2, B:253:0x0faa, B:265:0x108e, B:267:0x1094, B:268:0x1095, B:270:0x1097, B:272:0x109e, B:273:0x109f, B:213:0x0d2c, B:225:0x0e37, B:227:0x0e3d, B:228:0x0e81, B:230:0x0eab, B:231:0x0ef3, B:233:0x0f09, B:234:0x0f4c, B:275:0x10a1, B:277:0x10a8, B:278:0x10a9, B:280:0x10ab, B:282:0x10b2, B:283:0x10b3, B:220:0x0d9a, B:222:0x0db6, B:223:0x0e2b, B:215:0x0d4c, B:217:0x0d61, B:218:0x0d93, B:261:0x1012, B:256:0x0fd6, B:258:0x0fdc, B:259:0x100a), top: B:820:0x0c76, outer: #4, inners: #0, #5, #43, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0cd2 A[Catch: all -> 0x10b4, TryCatch #12 {all -> 0x10b4, blocks: (B:204:0x0c76, B:206:0x0c7c, B:207:0x0cc5, B:209:0x0cd2, B:211:0x0cdb, B:212:0x0d21, B:235:0x0f52, B:236:0x0f56, B:239:0x0f61, B:242:0x0f78, B:248:0x0f93, B:252:0x0fa2, B:253:0x0faa, B:265:0x108e, B:267:0x1094, B:268:0x1095, B:270:0x1097, B:272:0x109e, B:273:0x109f, B:213:0x0d2c, B:225:0x0e37, B:227:0x0e3d, B:228:0x0e81, B:230:0x0eab, B:231:0x0ef3, B:233:0x0f09, B:234:0x0f4c, B:275:0x10a1, B:277:0x10a8, B:278:0x10a9, B:280:0x10ab, B:282:0x10b2, B:283:0x10b3, B:220:0x0d9a, B:222:0x0db6, B:223:0x0e2b, B:215:0x0d4c, B:217:0x0d61, B:218:0x0d93, B:261:0x1012, B:256:0x0fd6, B:258:0x0fdc, B:259:0x100a), top: B:820:0x0c76, outer: #4, inners: #0, #5, #43, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0d2c A[Catch: all -> 0x10b4, TRY_LEAVE, TryCatch #12 {all -> 0x10b4, blocks: (B:204:0x0c76, B:206:0x0c7c, B:207:0x0cc5, B:209:0x0cd2, B:211:0x0cdb, B:212:0x0d21, B:235:0x0f52, B:236:0x0f56, B:239:0x0f61, B:242:0x0f78, B:248:0x0f93, B:252:0x0fa2, B:253:0x0faa, B:265:0x108e, B:267:0x1094, B:268:0x1095, B:270:0x1097, B:272:0x109e, B:273:0x109f, B:213:0x0d2c, B:225:0x0e37, B:227:0x0e3d, B:228:0x0e81, B:230:0x0eab, B:231:0x0ef3, B:233:0x0f09, B:234:0x0f4c, B:275:0x10a1, B:277:0x10a8, B:278:0x10a9, B:280:0x10ab, B:282:0x10b2, B:283:0x10b3, B:220:0x0d9a, B:222:0x0db6, B:223:0x0e2b, B:215:0x0d4c, B:217:0x0d61, B:218:0x0d93, B:261:0x1012, B:256:0x0fd6, B:258:0x0fdc, B:259:0x100a), top: B:820:0x0c76, outer: #4, inners: #0, #5, #43, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0f61 A[Catch: all -> 0x10b4, TryCatch #12 {all -> 0x10b4, blocks: (B:204:0x0c76, B:206:0x0c7c, B:207:0x0cc5, B:209:0x0cd2, B:211:0x0cdb, B:212:0x0d21, B:235:0x0f52, B:236:0x0f56, B:239:0x0f61, B:242:0x0f78, B:248:0x0f93, B:252:0x0fa2, B:253:0x0faa, B:265:0x108e, B:267:0x1094, B:268:0x1095, B:270:0x1097, B:272:0x109e, B:273:0x109f, B:213:0x0d2c, B:225:0x0e37, B:227:0x0e3d, B:228:0x0e81, B:230:0x0eab, B:231:0x0ef3, B:233:0x0f09, B:234:0x0f4c, B:275:0x10a1, B:277:0x10a8, B:278:0x10a9, B:280:0x10ab, B:282:0x10b2, B:283:0x10b3, B:220:0x0d9a, B:222:0x0db6, B:223:0x0e2b, B:215:0x0d4c, B:217:0x0d61, B:218:0x0d93, B:261:0x1012, B:256:0x0fd6, B:258:0x0fdc, B:259:0x100a), top: B:820:0x0c76, outer: #4, inners: #0, #5, #43, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x11f8  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x120f A[Catch: all -> 0x12d5, TryCatch #28 {all -> 0x12d5, blocks: (B:310:0x11fa, B:312:0x120f, B:313:0x1242), top: B:850:0x11fa, outer: #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x1255 A[Catch: all -> 0x12cb, TryCatch #23 {all -> 0x12cb, blocks: (B:314:0x1248, B:316:0x1255, B:317:0x12c3), top: B:841:0x1248, outer: #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x1405  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x1454 A[Catch: all -> 0x19c2, PHI: r2
  0x1454: PHI (r2v436 java.lang.Object) = (r2v435 java.lang.Object), (r2v510 java.lang.Object) binds: [B:343:0x1403, B:345:0x1406] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x19c2, blocks: (B:342:0x13ff, B:349:0x1454), top: B:835:0x13ff }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x14d2  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x14e8  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x1556  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x1840  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x188b  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x18d6 A[Catch: all -> 0x1996, TryCatch #52 {all -> 0x1996, blocks: (B:433:0x18d0, B:435:0x18d6, B:436:0x1904), top: B:893:0x18d0, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x1a4a A[Catch: all -> 0x02a2, TryCatch #4 {all -> 0x02a2, blocks: (B:111:0x0689, B:113:0x068f, B:114:0x06c1, B:476:0x1a44, B:478:0x1a4a, B:479:0x1a73, B:683:0x2b37, B:685:0x2b3d, B:686:0x2b6a, B:717:0x2e8c, B:719:0x2e92, B:720:0x2eb6, B:754:0x31f4, B:756:0x31fa, B:757:0x321b, B:734:0x3013, B:736:0x3036, B:737:0x3091, B:553:0x23dc, B:555:0x23e2, B:556:0x2410, B:558:0x244a, B:559:0x2493, B:524:0x208f, B:526:0x20a4, B:527:0x20d5, B:529:0x2109, B:530:0x218c, B:779:0x32f7, B:781:0x32fd, B:782:0x3325, B:784:0x335f, B:785:0x33a0, B:492:0x1c5d, B:494:0x1c72, B:495:0x1ca3, B:335:0x1346, B:337:0x134c, B:338:0x1374, B:290:0x111d, B:292:0x1123, B:293:0x1150, B:197:0x0bbf, B:199:0x0bc5, B:200:0x0bf1, B:19:0x0105, B:21:0x010b, B:22:0x0134, B:24:0x021a, B:26:0x024c, B:27:0x029c, B:204:0x0c76, B:206:0x0c7c, B:207:0x0cc5, B:209:0x0cd2, B:211:0x0cdb, B:212:0x0d21, B:235:0x0f52, B:236:0x0f56, B:239:0x0f61, B:242:0x0f78, B:248:0x0f93, B:252:0x0fa2, B:253:0x0faa, B:265:0x108e, B:267:0x1094, B:268:0x1095, B:270:0x1097, B:272:0x109e, B:273:0x109f, B:213:0x0d2c, B:225:0x0e37, B:227:0x0e3d, B:228:0x0e81, B:230:0x0eab, B:231:0x0ef3, B:233:0x0f09, B:234:0x0f4c, B:275:0x10a1, B:277:0x10a8, B:278:0x10a9, B:280:0x10ab, B:282:0x10b2, B:283:0x10b3, B:118:0x0743, B:120:0x0749, B:121:0x078e, B:123:0x079b, B:125:0x07a4, B:126:0x07ea, B:149:0x0a16, B:150:0x0a1a, B:152:0x0a20, B:155:0x0a38, B:158:0x0a45, B:160:0x0a48, B:172:0x0b34, B:174:0x0b3a, B:175:0x0b3b, B:177:0x0b3d, B:179:0x0b44, B:180:0x0b45, B:127:0x07f5, B:139:0x08f2, B:141:0x08f8, B:142:0x093d, B:144:0x0967, B:145:0x09b1, B:147:0x09c7, B:148:0x0a10, B:182:0x0b47, B:184:0x0b4e, B:185:0x0b4f, B:187:0x0b51, B:189:0x0b58, B:190:0x0b59, B:298:0x11df, B:300:0x11e3, B:321:0x12cd, B:323:0x12d3, B:324:0x12d4, B:326:0x12d6, B:328:0x12dd, B:329:0x12de, B:304:0x11ef), top: B:806:0x0105, inners: #12, #30, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x1afe  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x1b4e  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x1c3d  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x1ddb  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x2656 A[Catch: all -> 0x262a, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x262a, blocks: (B:564:0x25e1, B:571:0x2656, B:576:0x26bb, B:578:0x26c1, B:579:0x2702, B:582:0x2713, B:584:0x2717, B:588:0x2723), top: B:809:0x25e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x26b8  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x270f  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x2979 A[Catch: all -> 0x2aaf, TryCatch #8 {all -> 0x2aaf, blocks: (B:623:0x296f, B:624:0x2973, B:626:0x2979, B:629:0x2995, B:592:0x2737, B:610:0x284f, B:614:0x2899, B:618:0x290d, B:622:0x2969), top: B:812:0x2737 }] */
    /* JADX WARN: Removed duplicated region for block: B:685:0x2b3d A[Catch: all -> 0x02a2, TryCatch #4 {all -> 0x02a2, blocks: (B:111:0x0689, B:113:0x068f, B:114:0x06c1, B:476:0x1a44, B:478:0x1a4a, B:479:0x1a73, B:683:0x2b37, B:685:0x2b3d, B:686:0x2b6a, B:717:0x2e8c, B:719:0x2e92, B:720:0x2eb6, B:754:0x31f4, B:756:0x31fa, B:757:0x321b, B:734:0x3013, B:736:0x3036, B:737:0x3091, B:553:0x23dc, B:555:0x23e2, B:556:0x2410, B:558:0x244a, B:559:0x2493, B:524:0x208f, B:526:0x20a4, B:527:0x20d5, B:529:0x2109, B:530:0x218c, B:779:0x32f7, B:781:0x32fd, B:782:0x3325, B:784:0x335f, B:785:0x33a0, B:492:0x1c5d, B:494:0x1c72, B:495:0x1ca3, B:335:0x1346, B:337:0x134c, B:338:0x1374, B:290:0x111d, B:292:0x1123, B:293:0x1150, B:197:0x0bbf, B:199:0x0bc5, B:200:0x0bf1, B:19:0x0105, B:21:0x010b, B:22:0x0134, B:24:0x021a, B:26:0x024c, B:27:0x029c, B:204:0x0c76, B:206:0x0c7c, B:207:0x0cc5, B:209:0x0cd2, B:211:0x0cdb, B:212:0x0d21, B:235:0x0f52, B:236:0x0f56, B:239:0x0f61, B:242:0x0f78, B:248:0x0f93, B:252:0x0fa2, B:253:0x0faa, B:265:0x108e, B:267:0x1094, B:268:0x1095, B:270:0x1097, B:272:0x109e, B:273:0x109f, B:213:0x0d2c, B:225:0x0e37, B:227:0x0e3d, B:228:0x0e81, B:230:0x0eab, B:231:0x0ef3, B:233:0x0f09, B:234:0x0f4c, B:275:0x10a1, B:277:0x10a8, B:278:0x10a9, B:280:0x10ab, B:282:0x10b2, B:283:0x10b3, B:118:0x0743, B:120:0x0749, B:121:0x078e, B:123:0x079b, B:125:0x07a4, B:126:0x07ea, B:149:0x0a16, B:150:0x0a1a, B:152:0x0a20, B:155:0x0a38, B:158:0x0a45, B:160:0x0a48, B:172:0x0b34, B:174:0x0b3a, B:175:0x0b3b, B:177:0x0b3d, B:179:0x0b44, B:180:0x0b45, B:127:0x07f5, B:139:0x08f2, B:141:0x08f8, B:142:0x093d, B:144:0x0967, B:145:0x09b1, B:147:0x09c7, B:148:0x0a10, B:182:0x0b47, B:184:0x0b4e, B:185:0x0b4f, B:187:0x0b51, B:189:0x0b58, B:190:0x0b59, B:298:0x11df, B:300:0x11e3, B:321:0x12cd, B:323:0x12d3, B:324:0x12d4, B:326:0x12d6, B:328:0x12dd, B:329:0x12de, B:304:0x11ef), top: B:806:0x0105, inners: #12, #30, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:691:0x2c01  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x2c4f  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x2cac  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x2e6b  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x2f4d  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x2fa0  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x2ff5  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x31d4  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x32c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:839:0x147b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:868:0x11df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:936:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v104 */
    /* JADX WARN: Type inference failed for: r10v105 */
    /* JADX WARN: Type inference failed for: r10v106, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v113 */
    /* JADX WARN: Type inference failed for: r10v114 */
    /* JADX WARN: Type inference failed for: r10v115 */
    /* JADX WARN: Type inference failed for: r10v116 */
    /* JADX WARN: Type inference failed for: r10v117 */
    /* JADX WARN: Type inference failed for: r10v118 */
    /* JADX WARN: Type inference failed for: r10v120 */
    /* JADX WARN: Type inference failed for: r10v121 */
    /* JADX WARN: Type inference failed for: r10v132 */
    /* JADX WARN: Type inference failed for: r10v133 */
    /* JADX WARN: Type inference failed for: r10v134 */
    /* JADX WARN: Type inference failed for: r10v135 */
    /* JADX WARN: Type inference failed for: r10v266 */
    /* JADX WARN: Type inference failed for: r10v267 */
    /* JADX WARN: Type inference failed for: r10v268 */
    /* JADX WARN: Type inference failed for: r10v269 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v17 */
    /* JADX WARN: Type inference failed for: r32v18 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v323 */
    /* JADX WARN: Type inference failed for: r7v324 */
    /* JADX WARN: Type inference failed for: r7v325 */
    /* JADX WARN: Type inference failed for: r7v335 */
    /* JADX WARN: Type inference failed for: r7v336 */
    /* JADX WARN: Type inference failed for: r7v340 */
    /* JADX WARN: Type inference failed for: r7v342 */
    /* JADX WARN: Type inference failed for: r7v343 */
    /* JADX WARN: Type inference failed for: r7v344 */
    /* JADX WARN: Type inference failed for: r7v345 */
    /* JADX WARN: Type inference failed for: r7v346 */
    /* JADX WARN: Type inference failed for: r7v347 */
    /* JADX WARN: Type inference failed for: r7v348 */
    /* JADX WARN: Type inference failed for: r7v349 */
    /* JADX WARN: Type inference failed for: r7v350 */
    /* JADX WARN: Type inference failed for: r7v351 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v103 */
    /* JADX WARN: Type inference failed for: r8v106 */
    /* JADX WARN: Type inference failed for: r8v107 */
    /* JADX WARN: Type inference failed for: r8v108, types: [long] */
    /* JADX WARN: Type inference failed for: r8v109 */
    /* JADX WARN: Type inference failed for: r8v110 */
    /* JADX WARN: Type inference failed for: r8v118 */
    /* JADX WARN: Type inference failed for: r8v122 */
    /* JADX WARN: Type inference failed for: r8v128 */
    /* JADX WARN: Type inference failed for: r8v130 */
    /* JADX WARN: Type inference failed for: r8v131, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v134 */
    /* JADX WARN: Type inference failed for: r8v135 */
    /* JADX WARN: Type inference failed for: r8v139 */
    /* JADX WARN: Type inference failed for: r8v312 */
    /* JADX WARN: Type inference failed for: r8v313 */
    /* JADX WARN: Type inference failed for: r8v314 */
    /* JADX WARN: Type inference failed for: r8v74 */
    /* JADX WARN: Type inference failed for: r8v75 */
    /* JADX WARN: Type inference failed for: r8v76, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.zuriui.ZuriChatActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        ShareDataUIState = 0;
        copydefault();
        component1();
        int i = component2 + 59;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 105;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getAsAtTimestamp + 25;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 85;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        component3 = new char[]{33514, 33454, 33449, 33418, 33420, 33449, 33452, 33451, 33449, 33456, 33420, 33422, 33457, 33455, 33455, 33449, 33453, 33457, 33449, 33455, 33450, 33444, 33454, 33454, 33446, 33414, 33423, 33454, 33449, 33447, 33443, 33446, 33454, 33452, 33415, 33415, 33451, 33459, 33451, 33448, 33420, 33423, 33452, 33440, 33450, 33452, 33446, 33454, 33455, 33455, 33451, 33415, 33415, 33446, 33448, 33446, 33449, 33456, 33448, 33412, 33415, 33446, 33448, 33446, 33449, 33456, 33448, 33466, 33468, 33446, 33454, 33455, 33455, 33451, 33468, 33470, 33449, 33453, 33456, 33450, 33448, 33418, 33431, 33462, 33448, 33446, 33449, 33456, 33448, 33466, 33468, 33446, 33454, 33455, 33455, 33451, 33468, 33470, 33449, 33453, 33456, 33450, 33448, 33462, 33464, 33456, 33449, 33461, 33465, 33454, 33459, 33455, 33423, 33428, 33454, 33449, 33453, 33456, 33450, 33448, 33408, 33468, 33446, 33454, 33455, 33455, 33469, 33461, 33444, 33453, 33458, 33459, 33453, 33451, 33427, 33516};
        int i5 = i3 + 21;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    static void copydefault() {
        copydefault = new char[]{33519, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33425, 33454, 33423, 33504, 33470, 33455, 33462, 33467, 33459, 33452, 33401, 33349, 33358, 33353, 33373, 33428, 33352, 33354, 33352, 33356, 33364, 33360, 33356, 33352, 33350, 33374, 33372, 33349, 33357, 33355, 33348, 33347, 33354, 33518, 33428, 33514, 33514, 33515, 33517, 33517, 33514, 33428, 33469, 33425, 33514, 33518, 33519, 33431, 33468, 33466, 33465, 33468, 33470, 33428, 33426, 33424, 33513, 33427, 33426, 33515, 33429, 33428, 33514, 33516, 33430, 33427, 33426, 33427, 33513, 33510, 33512, 33427, 33430, 33429, 33467, 33426, 33513, 33425, 33428, 33514, 33426, 33458, 33351, 33351, 33465, 33350, 33349, 33352, 33351, 33458, 33466, 33352, 33460, 33458, 33460, 33463, 33350, 33351, 33458, 33463, 33466, 33348, 33466, 33352, 33458, 33466, 33463, 33351, 33351, 33460, 33457, 33462, 33465, 33348, 33464, 33351, 33351, 33462, 33466, 33465, 33463, 33350, 33464, 33457, 33460, 33457, 33463, 33458, 33457, 33463, 33460, 33458, 33348, 33458, 33459, 33352, 33353, 33464, 33350, 33465, 33461, 33461, 33348, 33465, 33457, 33477, 33514, 33516, 33429, 33429, 33430, 33428, 33514, 33516, 33429, 33427, 33518, 33521, 33519, 33515, 33515, 33521, 33519, 33515, 33514, 33514, 33518, 33432, 33429, 33517, 33430, 33432, 33518, 33426, 33427, 33427, 33425, 33513, 33513, 33512, 33428, 33519, 33451, 33365, 33369, 33371, 33372, 33371, 33369, 33367, 33362, 33366, 33372, 33465, 33460, 33361, 33458, 33410, 33372, 33356, 33359, 33366, 33369, 33519, 33464, 33461, 33429, 33439, 33465, 33449, 33452, 33459, 33462, 33460, 33466, 33460, 33460, 33432, 33426, 33476, 33511, 33511, 33512, 33512, 33514, 33515, 33513, 33517, 33515, 33515, 33479, 33516, 33512, 33514, 33515, 33513, 33512, 33513, 33513, 33514, 33516, 33427, 33353, 33356, 33357, 33354, 33351, 33352, 33354, 33354, 33355, 33411, 33383, 33386, 33387, 33384, 33386, 33387, 33387, 33388, 33387, 33385, 33475, 33511, 33425, 33468, 33429, 33429, 33428, 33426, 33467, 33429, 33515, 33512, 33513, 33426, 33467, 33467, 33427, 33515, 33514, 33513, 33514, 33516, 33517, 33429, 33426, 33514, 33430, 33430, 33519, 33428, 33428, 33517, 33514, 33513, 33514, 33511, 33511, 33514, 33513, 33515, 33518, 33517, 33428, 33426, 33515, 33515, 33515, 33428, 33426, 33427, 33468, 33425, 33512, 33427, 33469, 33429, 33428, 33465, 33427, 33516, 33514, 33427, 33468, 33426, 33476, 33515, 33514, 33512, 33514, 33516, 33514, 33513, 33513, 33512};
        component1 = -12548947835499179L;
    }
}
