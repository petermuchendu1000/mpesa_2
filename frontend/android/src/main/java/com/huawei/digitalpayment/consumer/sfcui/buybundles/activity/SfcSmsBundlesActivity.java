package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ToastUtils;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivityKt;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel;
import com.huawei.payment.mvvm.Resource;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.getActiveNotifications;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014²\u0006\u0018\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016X\u008a\u0084\u0002²\u0006\u0012\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/SfcSmsBundlesActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initData", "initObservers", "onBundleSelected", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "Companion", "ConsumerSfcUI_release", "otherBundlesResource", "Lcom/huawei/payment/mvvm/Resource;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Plans;", "smsCategoriesData", "", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcSmsBundlesActivity extends Hilt_SfcSmsBundlesActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    public static final String EXTRA_RETURN_TO_SMS_BUNDLES = "extra_return_to_sms_bundles";
    private static char ShareDataUIState;
    private static long component1;
    private static char component2;
    private static char component3;
    private static char copydefault;
    private static int getAsAtTimestamp;
    private static int[] getRequestBeneficiariesState;

    private final Lazy viewModel;
    private static final byte[] $$l = {46, -95, Ascii.VT, -87};
    private static final int $$m = 27;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {Ascii.GS, -26, 91, 68, -19, -5, 56, -59, -26, 1, -10, -11, 8, -5, -12, TarHeader.LF_CHR, -64, -12, -4, -2, -8, TarHeader.LF_NORMAL, -66, -12, -13, 8, -9, -18, 10, -26, 4, -13, -6, 57, -60, -19, -5, -10, -6, -11, 7, TarHeader.LF_NORMAL, -41, -41, 6, -14, -10, 7, -10, Ascii.DC2, -48, -19, -5, -10, -6, -6, 2, -16, -13, 58, -19, -5, 56, -65, -20, 13, -29, Ascii.VT, -11, TarHeader.LF_BLK, -61, -12, -5, -9, -18, Ascii.FF, -18, -11, 8, -31, 5, 1, -16, -13, 63, -60, -19, -6, -12, -9, 1, 1, -20, Base64.padSymbol, -76, 6, -4, -25, 5, TarHeader.LF_BLK, -78, 5, TarHeader.LF_BLK, -58, -9, -24, 4, -20, 6, -18, -12, 68, -44, -25, -16, 3, Ascii.DLE, -41, -6, 2, -27, TarHeader.LF_LINK, -41, -24, 4, -20, 6, -18, -12, 39, -48, 73, -70, -19, -5, -10, -6, -6, 2, -16, -13, 58, -28, 0, -24, 6, Ascii.SUB, -36, -26, Ascii.FF, 5, 5, -17, -40, Ascii.FF, -26, 8, -19, -5, 56, -64, -15, -7, 1, -12, 0, TarHeader.LF_NORMAL, -58, -20, 3, -21, -4, -1, -2, 47, -70, 5, -26, 8, -20, 2, 1, -18, TarHeader.LF_CONTIG, -66, -12, -13, 8, -20, -3, 6, -18, TarHeader.LF_CONTIG, -41, -24, -24, 8, -9, -14, 4, -8, -17, 0, Ascii.VT, -36, 8, -24, -8, 7, Ascii.NAK, -44, -13, 44, -56, -7, 10, -31, 78, -20, -19, -5, -10, -6, -6, 2, -16, -13, 60};
    private static final int $$k = 5;
    private static final byte[] $$d = {Ascii.SI, -12, 105, 108, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 210;
    private static int component4 = 0;
    private static int equals = 0;
    private static int copy = 1;

    private static String $$n(short s, short s2, int i) {
        int i2 = i * 2;
        byte[] bArr = $$l;
        int i3 = 111 - s2;
        int i4 = s + 4;
        byte[] bArr2 = new byte[1 - i2];
        int i5 = 0 - i2;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = i4 + i5;
            i4 = i4;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            int i8 = i4 + 1;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i6 = i7;
            i3 = bArr[i8] + i3;
            i4 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = r5 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.$$d
            int r7 = 28 - r7
            int r6 = 100 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-8)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.h(byte, byte, byte, java.lang.Object[]):void");
    }

    private static void i(byte b2, int i, int i2, Object[] objArr) {
        byte[] bArr = $$j;
        int i3 = (b2 * 16) + 83;
        int i4 = 219 - i2;
        byte[] bArr2 = new byte[83 - i];
        int i5 = 82 - i;
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i3 = (i4 + (-i5)) - 7;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b3 = bArr[i4];
                i4++;
                i3 = (i3 + (-b3)) - 7;
            }
        }
    }

    public static final BuyBundleViewModel access$getViewModel(SfcSmsBundlesActivity sfcSmsBundlesActivity) {
        int i = 2 % 2;
        int i2 = copy + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
        BuyBundleViewModel viewModel = sfcSmsBundlesActivity.getViewModel();
        int i4 = equals + 65;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return viewModel;
    }

    public static final void access$onBundleSelected(SfcSmsBundlesActivity sfcSmsBundlesActivity, WithExpiryResp withExpiryResp) {
        int i = 2 % 2;
        int i2 = copy + 103;
        equals = i2 % 128;
        int i3 = i2 % 2;
        sfcSmsBundlesActivity.onBundleSelected(withExpiryResp);
        int i4 = copy + 15;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public SfcSmsBundlesActivity() {
        final SfcSmsBundlesActivity sfcSmsBundlesActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BuyBundleViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 39;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sfcSmsBundlesActivity.getViewModelStore();
                int i4 = ShareDataUIState + 111;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 23;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = ShareDataUIState + 49;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 63 / 0;
                }
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 81;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                if (i3 != 0) {
                    int i4 = 70 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 65;
                component1 = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    sfcSmsBundlesActivity.getDefaultViewModelProviderFactory();
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = sfcSmsBundlesActivity.getDefaultViewModelProviderFactory();
                int i3 = component1 + 91;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    return defaultViewModelProviderFactory;
                }
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras;
                int i = 2 % 2;
                int i2 = copydefault + 35;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 == null || (defaultViewModelCreationExtras = (CreationExtras) function02.invoke()) == null) {
                    defaultViewModelCreationExtras = sfcSmsBundlesActivity.getDefaultViewModelCreationExtras();
                }
                int i3 = copydefault + 3;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 87 / 0;
                }
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component3 + 27;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = copydefault + 3;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final BuyBundleViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = copy + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
        BuyBundleViewModel buyBundleViewModel = (BuyBundleViewModel) this.viewModel.getValue();
        int i4 = equals + 3;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 66 / 0;
        }
        return buyBundleViewModel;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/SfcSmsBundlesActivity$Companion;", "", "<init>", "()V", "EXTRA_RETURN_TO_SMS_BUNDLES", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Function2<Composer, Integer, Unit> {
        private static int component3 = 0;
        private static int copydefault = 1;

        public static final Resource copydefault(State state) {
            int i = 2 % 2;
            int i2 = component3 + 31;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Resource<List<Plans>> resourceComponent2 = component2(state);
            int i4 = copydefault + 75;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return resourceComponent2;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) throws Throwable {
            int i = 2 % 2;
            int i2 = component3 + 53;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 39;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 63 / 0;
            }
            return unit;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int component3 = 0;
            private static int getRequestBeneficiariesState = 1;
            final List<String> ShareDataUIState;
            final List<WithExpiryResp> component1;
            final State<Resource<List<Plans>>> component2;
            final SfcSmsBundlesActivity copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component3 + 97;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                component2(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = getRequestBeneficiariesState + 29;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void component2(Composer composer, int i) {
                boolean z;
                int i2 = 2 % 2;
                int i3 = getRequestBeneficiariesState + 1;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                Object obj = null;
                if ((i & 11) == 2) {
                    int i6 = i4 + 47;
                    getRequestBeneficiariesState = i6 % 128;
                    if (i6 % 2 == 0) {
                        composer.getSkipping();
                        obj.hashCode();
                        throw null;
                    }
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                }
                List<WithExpiryResp> list = this.component1;
                List<String> list2 = this.ShareDataUIState;
                Resource resourceCopydefault = component3.copydefault(this.component2);
                if (resourceCopydefault == null || !resourceCopydefault.loading()) {
                    z = false;
                } else {
                    int i7 = getRequestBeneficiariesState + 61;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                }
                final SfcSmsBundlesActivity sfcSmsBundlesActivity = this.copydefault;
                Function1 function1 = new Function1() {
                    private static int component2 = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke(Object obj2) {
                        int i9 = 2 % 2;
                        int i10 = component2 + 21;
                        component3 = i10 % 128;
                        int i11 = i10 % 2;
                        SfcSmsBundlesActivity sfcSmsBundlesActivity2 = sfcSmsBundlesActivity;
                        WithExpiryResp withExpiryResp = (WithExpiryResp) obj2;
                        if (i11 != 0) {
                            return SfcSmsBundlesActivity.component3.AnonymousClass1.component1(sfcSmsBundlesActivity2, withExpiryResp);
                        }
                        SfcSmsBundlesActivity.component3.AnonymousClass1.component1(sfcSmsBundlesActivity2, withExpiryResp);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                };
                final SfcSmsBundlesActivity sfcSmsBundlesActivity2 = this.copydefault;
                Function0 function0 = new Function0() {
                    private static int component3 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = component3 + 69;
                        copydefault = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitComponent2 = SfcSmsBundlesActivity.component3.AnonymousClass1.component2(sfcSmsBundlesActivity2);
                        int i12 = component3 + 27;
                        copydefault = i12 % 128;
                        if (i12 % 2 != 0) {
                            int i13 = 48 / 0;
                        }
                        return unitComponent2;
                    }
                };
                final SfcSmsBundlesActivity sfcSmsBundlesActivity3 = this.copydefault;
                SfcSmsBundlesActivityKt.SmsBundlesScreen(list, list2, z, function1, function0, new Function0() {
                    private static int component1 = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = component1 + 27;
                        component3 = i10 % 128;
                        int i11 = i10 % 2;
                        SfcSmsBundlesActivity sfcSmsBundlesActivity4 = sfcSmsBundlesActivity3;
                        if (i11 != 0) {
                            return SfcSmsBundlesActivity.component3.AnonymousClass1.component3(sfcSmsBundlesActivity4);
                        }
                        SfcSmsBundlesActivity.component3.AnonymousClass1.component3(sfcSmsBundlesActivity4);
                        throw null;
                    }
                }, PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsetsKt.asPaddingValues(WindowInsetsKt.m1239onlybOOhFvg(WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer, 8), WindowInsetsSides.INSTANCE.m1267getTopJoeWqyM()), composer, 0)), composer, 72, 0);
            }

            private static final Unit copydefault(SfcSmsBundlesActivity sfcSmsBundlesActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = component3 + 19;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcSmsBundlesActivity, "");
                Intrinsics.checkNotNullParameter(withExpiryResp, "");
                SfcSmsBundlesActivity.access$onBundleSelected(sfcSmsBundlesActivity, withExpiryResp);
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 107;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit ShareDataUIState(SfcSmsBundlesActivity sfcSmsBundlesActivity) {
                int i = 2 % 2;
                int i2 = component3 + 17;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcSmsBundlesActivity, "");
                SfcSmsBundlesActivity.access$getViewModel(sfcSmsBundlesActivity).getExpiryBundlesCatalog();
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 67;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component1(SfcSmsBundlesActivity sfcSmsBundlesActivity) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 121;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcSmsBundlesActivity, "");
                sfcSmsBundlesActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = getRequestBeneficiariesState + 87;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public static Unit component3(SfcSmsBundlesActivity sfcSmsBundlesActivity) {
                int i = 2 % 2;
                int i2 = component3 + 25;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(sfcSmsBundlesActivity);
                int i4 = getRequestBeneficiariesState + 77;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 26 / 0;
                }
                return unitComponent1;
            }

            public static Unit component1(SfcSmsBundlesActivity sfcSmsBundlesActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 123;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(sfcSmsBundlesActivity, withExpiryResp);
                int i4 = component3 + 63;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 != 0) {
                    return unitCopydefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component2(SfcSmsBundlesActivity sfcSmsBundlesActivity) {
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 23;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(sfcSmsBundlesActivity);
                if (i3 != 0) {
                    int i4 = 26 / 0;
                }
                return unitShareDataUIState;
            }

            AnonymousClass1(List<WithExpiryResp> list, List<String> list2, State<Resource<List<Plans>>> state, SfcSmsBundlesActivity sfcSmsBundlesActivity) {
                this.component1 = list;
                this.ShareDataUIState = list2;
                this.component2 = state;
                this.copydefault = sfcSmsBundlesActivity;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01e0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void ShareDataUIState(androidx.compose.runtime.Composer r37, int r38) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 529
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.component3.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
        }

        private static final Resource<List<Plans>> component2(State<Resource<List<Plans>>> state) {
            int i = 2 % 2;
            int i2 = copydefault + 39;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Resource<List<Plans>> value = state.getValue();
            int i4 = copydefault + 93;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        private static final List<String> component3(State<? extends List<String>> state) {
            int i = 2 % 2;
            int i2 = component3 + 57;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            List<String> value = state.getValue();
            if (i3 == 0) {
                int i4 = 59 / 0;
            }
            int i5 = component3 + 7;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return value;
            }
            throw null;
        }

        component3() {
        }
    }

    private static void j(int i, char[] cArr, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component1 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 117;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            obj = null;
            if (iTrustedWebActivityServiceDefault.copydefault >= cArrComponent2.length) {
                break;
            }
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 7032, Color.green(0) + 34, (char) (TextUtils.getCapsMode("", 0, 0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) (-1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1391 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), MotionEvent.axisFromString("") + 19, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 51269), -1883291598, false, $$n(b2, (byte) (b2 & 8), (byte) 0), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 55;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 9;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i6 = $10 + 39;
            $11 = i6 % 128;
            int i7 = 58224;
            if (i6 % 2 == 0) {
                cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 / i3];
            } else {
                cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            }
            int i8 = i3;
            while (i8 < 16) {
                int i9 = $11 + 29;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i3];
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(component2);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int touchSlop = 844 - (ViewConfiguration.getTouchSlop() >> 8);
                        int size = View.MeasureSpec.getSize(i3) + 32;
                        char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 23251);
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 + 1);
                        String str$$n = $$n(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(touchSlop, size, scrollBarSize, 592652048, false, str$$n, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(845 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 32, (char) (MotionEvent.axisFromString("") + 23252), 592652048, false, $$n(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 464, 49 - (KeyEvent.getMaxKeyCode() >> 16), (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void g(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int[] iArr3;
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = getRequestBeneficiariesState;
        int i3 = 684241640;
        int i4 = 1;
        int i5 = 0;
        if (iArr4 != null) {
            int length2 = iArr4.length;
            int[] iArr5 = new int[length2];
            int i6 = $10 + 43;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 4;
            }
            int i8 = 0;
            while (i8 < length2) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i5] = Integer.valueOf(iArr4[i8]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-1);
                        byte b3 = (byte) (b2 & 5);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4390 - (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37, (char) (MotionEvent.axisFromString("") + 1), -309236339, false, $$n(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE});
                    }
                    iArr5[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = 684241640;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $10 + 11;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            iArr4 = iArr5;
        }
        int length3 = iArr4.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = getRequestBeneficiariesState;
        if (iArr7 != null) {
            int i11 = $10 + 125;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = iArr7.length;
                iArr2 = new int[length];
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
            }
            int i12 = 0;
            while (i12 < length) {
                Object[] objArr3 = new Object[i4];
                objArr3[0] = Integer.valueOf(iArr7[i12]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 & 5);
                    iArr3 = iArr7;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 4391, 37 - Color.alpha(0), (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -309236339, false, $$n(b4, b5, (byte) (b5 - 5)), new Class[]{Integer.TYPE});
                } else {
                    iArr3 = iArr7;
                }
                iArr2[i12] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i12++;
                iArr7 = iArr3;
                i4 = 1;
            }
            iArr7 = iArr2;
        }
        char c2 = 0;
        System.arraycopy(iArr7, 0, iArr6, 0, length3);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr6);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                int i15 = $11 + 83;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                getactivenotifications.ShareDataUIState ^= iArr6[i13];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) (-1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 2968, ((Process.getThreadPriority(0) + 20) >> 6) + 16, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 49870), 462826032, false, $$n(b6, (byte) (b6 & 7), (byte) 0), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i13++;
            }
            int i17 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i17;
            getactivenotifications.component2 ^= iArr6[16];
            getactivenotifications.ShareDataUIState ^= iArr6[17];
            int i18 = getactivenotifications.ShareDataUIState;
            int i19 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr6);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 2944;
                int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 24;
                char c3 = (char) (27637 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                byte length4 = (byte) $$l.length;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, tapTimeout, c3, -1616366948, false, $$n((byte) (-1), length4, (byte) (length4 - 4)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x013f  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.onCreate(android.os.Bundle):void");
    }

    private final void initData() {
        int i = 2 % 2;
        int i2 = copy + 69;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getViewModel().getExpiryBundlesCatalog();
            obj.hashCode();
            throw null;
        }
        getViewModel().getExpiryBundlesCatalog();
        int i3 = copy + 93;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void initObservers() {
        int i = 2 % 2;
        getViewModel().getOtherBundlesData().observe(this, new SfcSmsBundlesActivityKt.component3(new Function1() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 33;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$pKeUf9DaoNODOqs5dx9q3vWnxjQ = SfcSmsBundlesActivity.$r8$lambda$pKeUf9DaoNODOqs5dx9q3vWnxjQ((Resource) obj);
                if (i4 == 0) {
                    int i5 = 59 / 0;
                }
                int i6 = component2 + 87;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    return unit$r8$lambda$pKeUf9DaoNODOqs5dx9q3vWnxjQ;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = equals + 47;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit initObservers$lambda$0(Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 41;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            if (resource.error()) {
                int i3 = copy + 91;
                equals = i3 % 128;
                int i4 = i3 % 2;
                ToastUtils.showLong(resource.getException().getMessage(), new Object[0]);
                int i5 = equals + 95;
                copy = i5 % 128;
                int i6 = i5 % 2;
            }
            return Unit.INSTANCE;
        }
        resource.error();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onBundleSelected(com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp r22) {
        /*
            r21 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = r22.getValidity()
            int r2 = r1.hashCode()
            r3 = -1707840351(0xffffffff9a346ca1, float:-3.7310877E-23)
            if (r2 == r3) goto L46
            r3 = -1393678355(0xffffffffacee27ed, float:-6.7687995E-12)
            if (r2 == r3) goto L39
            int r3 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.equals
            int r3 = r3 + 53
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.copy = r4
            int r3 = r3 % r0
            r3 = 65793529(0x3ebedf9, float:1.38666945E-36)
            if (r2 == r3) goto L24
            goto L5c
        L24:
            java.lang.String r2 = "Daily"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2d
            goto L5c
        L2d:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.equals
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.copy = r2
            int r1 = r1 % r0
            java.lang.String r1 = "1 Day"
            goto L44
        L39:
            java.lang.String r2 = "Monthly"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L42
            goto L5c
        L42:
            java.lang.String r1 = "30 Days"
        L44:
            r9 = r1
            goto L61
        L46:
            java.lang.String r2 = "Weekly"
            boolean r1 = r1.equals(r2)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L5c
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.copy
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.equals = r2
            int r1 = r1 % r0
            java.lang.String r1 = "7 Days"
            goto L44
        L5c:
            java.lang.String r1 = r22.getValidity()
            goto L44
        L61:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 65471(0xffbf, float:9.1744E-41)
            r20 = 0
            r2 = r22
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>(r0)
            java.lang.String r0 = "withExpiryResp"
            java.io.Serializable r1 = (java.io.Serializable) r1
            r2.putSerializable(r0, r1)
            java.lang.String r0 = "key_return_destination"
            java.lang.String r1 = "/sfcModule/smsBundles"
            r2.putString(r0, r1)
            r0 = r21
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.String r1 = "/sfcModule/bundlePurchase"
            com.huawei.arouter.RouteUtils.routeWithExecute(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.onBundleSelected(com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ea, code lost:
    
        if (r1 != ((((-1035942200) + (((~((-675250654) | r3)) | 136413648) * (-108))) + (((~(r3 | 463572466)) | ((~((-463572467) | r2)) | (-1002409472))) * 54)) + ((r2 | (-1002409472)) * 54))) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ec, code lost:
    
        r1 = ((java.lang.reflect.Field) kotlin.activityDestroyed.component2[0]).getInt(null);
        r2 = (int) android.os.SystemClock.uptimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x011a, code lost:
    
        if (r1 != (((131231111 + ((~((~r2) | (-1107361857))) * (-116))) + ((482784191 | r2) * 116)) + (((~(r2 | 1380266331)) | 209879716) * 116))) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x011c, code lost:
    
        super.onStart();
        r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.equals + 115;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.copy = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0128, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x012a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x012b, code lost:
    
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x012e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x013b, code lost:
    
        throw new java.lang.RuntimeException(java.lang.String.valueOf(431600549));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0148, code lost:
    
        throw new java.lang.RuntimeException(java.lang.String.valueOf(1006201155));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0149, code lost:
    
        r0 = (java.lang.Integer) null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x014c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0071, code lost:
    
        if (r1 == ((((-1832548145) + ((r7 | (~(1688653350 | r8))) * (-1808))) + (((~((-547540481) | r6)) | (~(r8 | 1874845431))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(r6 | (-1688653351))) | 186192081) | (~(733732561 | r8))) * androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_BOOLEAN))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009a, code lost:
    
        if (r1 == (((((~(2143256059 | r6)) | 1577187) * 449) + 1255368621) + (((~((~r6) | 2143256059)) | 1577187) * 449))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009c, code lost:
    
        r1 = ((java.lang.reflect.Field) kotlin.getCustom.ShareDataUIState[0]).getInt(null);
        r3 = (java.lang.Object[]) null;
        r2 = android.provider.Settings.System.getInt(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getContentResolver(), "screen_brightness", -1);
        r3 = ~r2;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStart() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.onStart():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(90:111|112|127|128|825|129|132|133|(0)|136|137|794|138|139|831|140|(0)|143|(0)(0)|171|(1:172)|866|227|843|228|(0)|231|(0)(0)|237|255|(0)|295|841|296|(0)|303|(0)|307|308|(6:804|(0)(0)|361|(1:362)|872|409)|(0)(0)|439|768|440|(0)|443|856|444|(0)|447|471|(0)|474|(0)(0)|498|(0)(0)|516|(0)|519|(0)|522|(0)(0)|528|549|(0)(0)|567|797|568|(0)|571|(0)|574|(0)(0)|618|(1:619)|876|672|(0)|675|(0)(0)|681|696|(0)(0)|706|(0)|709|(0)(0)|715|733|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x2cd8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x2cd9, code lost:
    
        r6 = new java.lang.Object[1];
        g(android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 11, new int[]{1282515797, 965348307, -639860334, 1640479851, 1733627409, -694246273}, r6);
        r2 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x2cf3, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r3);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x2d0a, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x2d0e, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
        r13 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r1 = ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32))) | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x2d3e, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x2d42, code lost:
    
        if (r4 == null) goto L668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x2d44, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.widget.ExpandableListView.getPackedPositionType(0) + 6618, (android.os.Process.myTid() >> 22) + 42, (char) (1 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1))), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x2d75, code lost:
    
        r4 = ((java.lang.reflect.Method) r4).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x2d7d, code lost:
    
        r7 = new java.lang.Object[]{539970914, java.lang.Long.valueOf(r1), r3, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0') + 6563, 55 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), (char) ((android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) - 1));
        r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.$$j;
        r8 = new java.lang.Object[1];
        i(r2[9], r2[131(0x83, float:1.84E-43)], (short) 168, r8);
        r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r4, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x082e A[Catch: all -> 0x0362, TryCatch #22 {all -> 0x0362, blocks: (B:419:0x186f, B:421:0x1875, B:422:0x189e, B:737:0x33fd, B:739:0x3403, B:740:0x3427, B:717:0x3229, B:719:0x324c, B:720:0x32a4, B:700:0x309f, B:702:0x30a5, B:703:0x30d4, B:666:0x2d3e, B:668:0x2d44, B:669:0x2d75, B:559:0x265c, B:561:0x2662, B:562:0x268c, B:564:0x26c6, B:565:0x2710, B:530:0x22e0, B:532:0x22f5, B:533:0x232b, B:535:0x235f, B:536:0x23d7, B:508:0x1f4c, B:510:0x1f52, B:511:0x1f7a, B:513:0x1fb4, B:514:0x1ffe, B:481:0x1c9b, B:483:0x1cb0, B:484:0x1cdc, B:465:0x1a92, B:467:0x1a98, B:468:0x1ac2, B:289:0x11eb, B:291:0x11f1, B:292:0x1221, B:221:0x0d63, B:223:0x0d69, B:224:0x0d95, B:133:0x0828, B:135:0x082e, B:136:0x0857, B:19:0x0176, B:21:0x017c, B:22:0x01a2, B:24:0x02d2, B:26:0x0304, B:27:0x035c), top: B:805:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x08e5 A[Catch: all -> 0x0cfb, TryCatch #35 {all -> 0x0cfb, blocks: (B:140:0x08df, B:142:0x08e5, B:143:0x0925, B:145:0x0932, B:147:0x093b, B:148:0x0985, B:171:0x0bb4, B:172:0x0bb8, B:175:0x0bc9, B:178:0x0be0, B:181:0x0bed, B:184:0x0bfa, B:196:0x0cd5, B:198:0x0cdb, B:199:0x0cdc, B:201:0x0cde, B:203:0x0ce5, B:204:0x0ce6, B:149:0x0990, B:161:0x0a9f, B:163:0x0aa5, B:164:0x0aeb, B:166:0x0b15, B:167:0x0b5a, B:169:0x0b70, B:170:0x0bae, B:206:0x0ce8, B:208:0x0cef, B:209:0x0cf0, B:211:0x0cf2, B:213:0x0cf9, B:214:0x0cfa, B:192:0x0c58, B:187:0x0c26, B:189:0x0c2c, B:190:0x0c50, B:156:0x0a02, B:158:0x0a1e, B:159:0x0a93, B:151:0x09b0, B:153:0x09c5, B:154:0x09fb), top: B:831:0x08df, outer: #15, inners: #14, #18, #24, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0932 A[Catch: all -> 0x0cfb, TryCatch #35 {all -> 0x0cfb, blocks: (B:140:0x08df, B:142:0x08e5, B:143:0x0925, B:145:0x0932, B:147:0x093b, B:148:0x0985, B:171:0x0bb4, B:172:0x0bb8, B:175:0x0bc9, B:178:0x0be0, B:181:0x0bed, B:184:0x0bfa, B:196:0x0cd5, B:198:0x0cdb, B:199:0x0cdc, B:201:0x0cde, B:203:0x0ce5, B:204:0x0ce6, B:149:0x0990, B:161:0x0a9f, B:163:0x0aa5, B:164:0x0aeb, B:166:0x0b15, B:167:0x0b5a, B:169:0x0b70, B:170:0x0bae, B:206:0x0ce8, B:208:0x0cef, B:209:0x0cf0, B:211:0x0cf2, B:213:0x0cf9, B:214:0x0cfa, B:192:0x0c58, B:187:0x0c26, B:189:0x0c2c, B:190:0x0c50, B:156:0x0a02, B:158:0x0a1e, B:159:0x0a93, B:151:0x09b0, B:153:0x09c5, B:154:0x09fb), top: B:831:0x08df, outer: #15, inners: #14, #18, #24, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0990 A[Catch: all -> 0x0cfb, TRY_LEAVE, TryCatch #35 {all -> 0x0cfb, blocks: (B:140:0x08df, B:142:0x08e5, B:143:0x0925, B:145:0x0932, B:147:0x093b, B:148:0x0985, B:171:0x0bb4, B:172:0x0bb8, B:175:0x0bc9, B:178:0x0be0, B:181:0x0bed, B:184:0x0bfa, B:196:0x0cd5, B:198:0x0cdb, B:199:0x0cdc, B:201:0x0cde, B:203:0x0ce5, B:204:0x0ce6, B:149:0x0990, B:161:0x0a9f, B:163:0x0aa5, B:164:0x0aeb, B:166:0x0b15, B:167:0x0b5a, B:169:0x0b70, B:170:0x0bae, B:206:0x0ce8, B:208:0x0cef, B:209:0x0cf0, B:211:0x0cf2, B:213:0x0cf9, B:214:0x0cfa, B:192:0x0c58, B:187:0x0c26, B:189:0x0c2c, B:190:0x0c50, B:156:0x0a02, B:158:0x0a1e, B:159:0x0a93, B:151:0x09b0, B:153:0x09c5, B:154:0x09fb), top: B:831:0x08df, outer: #15, inners: #14, #18, #24, #29 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0bbe  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0e20 A[Catch: all -> 0x1185, TryCatch #42 {all -> 0x1185, blocks: (B:228:0x0e1a, B:230:0x0e20, B:231:0x0e64, B:233:0x0e71, B:235:0x0e7a, B:236:0x0ebb, B:255:0x1077, B:263:0x10e4, B:269:0x1169, B:271:0x116f, B:272:0x1170, B:274:0x1172, B:276:0x1179, B:277:0x117a, B:238:0x0ec7, B:245:0x0f4d, B:247:0x0f53, B:248:0x0f96, B:250:0x0fc0, B:251:0x100e, B:253:0x1024, B:254:0x106f, B:279:0x117c, B:281:0x1183, B:282:0x1184, B:265:0x10ea, B:259:0x10ac, B:261:0x10b2, B:262:0x10dd, B:240:0x0ee7, B:242:0x0ef9, B:243:0x0f41), top: B:843:0x0e1a, outer: #15, inners: #26, #30, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0e71 A[Catch: all -> 0x1185, TryCatch #42 {all -> 0x1185, blocks: (B:228:0x0e1a, B:230:0x0e20, B:231:0x0e64, B:233:0x0e71, B:235:0x0e7a, B:236:0x0ebb, B:255:0x1077, B:263:0x10e4, B:269:0x1169, B:271:0x116f, B:272:0x1170, B:274:0x1172, B:276:0x1179, B:277:0x117a, B:238:0x0ec7, B:245:0x0f4d, B:247:0x0f53, B:248:0x0f96, B:250:0x0fc0, B:251:0x100e, B:253:0x1024, B:254:0x106f, B:279:0x117c, B:281:0x1183, B:282:0x1184, B:265:0x10ea, B:259:0x10ac, B:261:0x10b2, B:262:0x10dd, B:240:0x0ee7, B:242:0x0ef9, B:243:0x0f41), top: B:843:0x0e1a, outer: #15, inners: #26, #30, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0ec7 A[Catch: all -> 0x1185, TRY_LEAVE, TryCatch #42 {all -> 0x1185, blocks: (B:228:0x0e1a, B:230:0x0e20, B:231:0x0e64, B:233:0x0e71, B:235:0x0e7a, B:236:0x0ebb, B:255:0x1077, B:263:0x10e4, B:269:0x1169, B:271:0x116f, B:272:0x1170, B:274:0x1172, B:276:0x1179, B:277:0x117a, B:238:0x0ec7, B:245:0x0f4d, B:247:0x0f53, B:248:0x0f96, B:250:0x0fc0, B:251:0x100e, B:253:0x1024, B:254:0x106f, B:279:0x117c, B:281:0x1183, B:282:0x1184, B:265:0x10ea, B:259:0x10ac, B:261:0x10b2, B:262:0x10dd, B:240:0x0ee7, B:242:0x0ef9, B:243:0x0f41), top: B:843:0x0e1a, outer: #15, inners: #26, #30, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x1089  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x132e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x1386  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x13e5  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x16ba A[Catch: all -> 0x17fd, TryCatch #36 {all -> 0x17fd, blocks: (B:361:0x16b0, B:362:0x16b4, B:364:0x16ba, B:367:0x16d6, B:330:0x1404, B:347:0x1586, B:351:0x15d0, B:357:0x164b, B:360:0x16aa), top: B:832:0x1404 }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x1875 A[Catch: all -> 0x0362, TryCatch #22 {all -> 0x0362, blocks: (B:419:0x186f, B:421:0x1875, B:422:0x189e, B:737:0x33fd, B:739:0x3403, B:740:0x3427, B:717:0x3229, B:719:0x324c, B:720:0x32a4, B:700:0x309f, B:702:0x30a5, B:703:0x30d4, B:666:0x2d3e, B:668:0x2d44, B:669:0x2d75, B:559:0x265c, B:561:0x2662, B:562:0x268c, B:564:0x26c6, B:565:0x2710, B:530:0x22e0, B:532:0x22f5, B:533:0x232b, B:535:0x235f, B:536:0x23d7, B:508:0x1f4c, B:510:0x1f52, B:511:0x1f7a, B:513:0x1fb4, B:514:0x1ffe, B:481:0x1c9b, B:483:0x1cb0, B:484:0x1cdc, B:465:0x1a92, B:467:0x1a98, B:468:0x1ac2, B:289:0x11eb, B:291:0x11f1, B:292:0x1221, B:221:0x0d63, B:223:0x0d69, B:224:0x0d95, B:133:0x0828, B:135:0x082e, B:136:0x0857, B:19:0x0176, B:21:0x017c, B:22:0x01a2, B:24:0x02d2, B:26:0x0304, B:27:0x035c), top: B:805:0x0176 }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x1922  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x194c  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x1963 A[Catch: all -> 0x1a24, TryCatch #1 {all -> 0x1a24, blocks: (B:440:0x194e, B:442:0x1963, B:443:0x1993), top: B:768:0x194e, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x19a6 A[Catch: all -> 0x1a1a, TryCatch #49 {all -> 0x1a1a, blocks: (B:444:0x1999, B:446:0x19a6, B:447:0x1a12), top: B:856:0x1999, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x1b50  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x1b9c  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x1c79  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x1e1b  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x1f00  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x2120  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x2186  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x21e3  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x22c2  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x2515  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x261c  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x280e A[Catch: all -> 0x2cd8, TryCatch #17 {all -> 0x2cd8, blocks: (B:568:0x2808, B:570:0x280e, B:571:0x2858, B:573:0x287f, B:574:0x28c8, B:576:0x28de, B:578:0x28e7, B:579:0x292f, B:618:0x2b9e, B:619:0x2ba2, B:621:0x2ba8, B:624:0x2bc0, B:627:0x2bcd, B:629:0x2bd0, B:641:0x2cb2, B:643:0x2cb8, B:644:0x2cb9, B:646:0x2cbb, B:648:0x2cc2, B:649:0x2cc3, B:585:0x294a, B:590:0x2957, B:594:0x2963, B:588:0x2953, B:596:0x2969, B:608:0x2a7c, B:610:0x2a82, B:611:0x2ad0, B:613:0x2afa, B:614:0x2b40, B:616:0x2b56, B:617:0x2b98, B:651:0x2cc5, B:653:0x2ccc, B:654:0x2ccd, B:656:0x2ccf, B:658:0x2cd6, B:659:0x2cd7, B:637:0x2c34, B:632:0x2bfc, B:634:0x2c02, B:635:0x2c2c, B:603:0x29d5, B:605:0x29f4, B:606:0x2a70, B:598:0x2989, B:600:0x299e, B:601:0x29ce), top: B:797:0x2808, outer: #15, inners: #3, #5, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x287f A[Catch: all -> 0x2cd8, TryCatch #17 {all -> 0x2cd8, blocks: (B:568:0x2808, B:570:0x280e, B:571:0x2858, B:573:0x287f, B:574:0x28c8, B:576:0x28de, B:578:0x28e7, B:579:0x292f, B:618:0x2b9e, B:619:0x2ba2, B:621:0x2ba8, B:624:0x2bc0, B:627:0x2bcd, B:629:0x2bd0, B:641:0x2cb2, B:643:0x2cb8, B:644:0x2cb9, B:646:0x2cbb, B:648:0x2cc2, B:649:0x2cc3, B:585:0x294a, B:590:0x2957, B:594:0x2963, B:588:0x2953, B:596:0x2969, B:608:0x2a7c, B:610:0x2a82, B:611:0x2ad0, B:613:0x2afa, B:614:0x2b40, B:616:0x2b56, B:617:0x2b98, B:651:0x2cc5, B:653:0x2ccc, B:654:0x2ccd, B:656:0x2ccf, B:658:0x2cd6, B:659:0x2cd7, B:637:0x2c34, B:632:0x2bfc, B:634:0x2c02, B:635:0x2c2c, B:603:0x29d5, B:605:0x29f4, B:606:0x2a70, B:598:0x2989, B:600:0x299e, B:601:0x29ce), top: B:797:0x2808, outer: #15, inners: #3, #5, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:576:0x28de A[Catch: all -> 0x2cd8, TryCatch #17 {all -> 0x2cd8, blocks: (B:568:0x2808, B:570:0x280e, B:571:0x2858, B:573:0x287f, B:574:0x28c8, B:576:0x28de, B:578:0x28e7, B:579:0x292f, B:618:0x2b9e, B:619:0x2ba2, B:621:0x2ba8, B:624:0x2bc0, B:627:0x2bcd, B:629:0x2bd0, B:641:0x2cb2, B:643:0x2cb8, B:644:0x2cb9, B:646:0x2cbb, B:648:0x2cc2, B:649:0x2cc3, B:585:0x294a, B:590:0x2957, B:594:0x2963, B:588:0x2953, B:596:0x2969, B:608:0x2a7c, B:610:0x2a82, B:611:0x2ad0, B:613:0x2afa, B:614:0x2b40, B:616:0x2b56, B:617:0x2b98, B:651:0x2cc5, B:653:0x2ccc, B:654:0x2ccd, B:656:0x2ccf, B:658:0x2cd6, B:659:0x2cd7, B:637:0x2c34, B:632:0x2bfc, B:634:0x2c02, B:635:0x2c2c, B:603:0x29d5, B:605:0x29f4, B:606:0x2a70, B:598:0x2989, B:600:0x299e, B:601:0x29ce), top: B:797:0x2808, outer: #15, inners: #3, #5, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:581:0x293a  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x2960  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x2961  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x2ba8 A[Catch: all -> 0x2cd8, TryCatch #17 {all -> 0x2cd8, blocks: (B:568:0x2808, B:570:0x280e, B:571:0x2858, B:573:0x287f, B:574:0x28c8, B:576:0x28de, B:578:0x28e7, B:579:0x292f, B:618:0x2b9e, B:619:0x2ba2, B:621:0x2ba8, B:624:0x2bc0, B:627:0x2bcd, B:629:0x2bd0, B:641:0x2cb2, B:643:0x2cb8, B:644:0x2cb9, B:646:0x2cbb, B:648:0x2cc2, B:649:0x2cc3, B:585:0x294a, B:590:0x2957, B:594:0x2963, B:588:0x2953, B:596:0x2969, B:608:0x2a7c, B:610:0x2a82, B:611:0x2ad0, B:613:0x2afa, B:614:0x2b40, B:616:0x2b56, B:617:0x2b98, B:651:0x2cc5, B:653:0x2ccc, B:654:0x2ccd, B:656:0x2ccf, B:658:0x2cd6, B:659:0x2cd7, B:637:0x2c34, B:632:0x2bfc, B:634:0x2c02, B:635:0x2c2c, B:603:0x29d5, B:605:0x29f4, B:606:0x2a70, B:598:0x2989, B:600:0x299e, B:601:0x29ce), top: B:797:0x2808, outer: #15, inners: #3, #5, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:674:0x2e02  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x2e54  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x2eaf  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x3072  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x307d  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x3166  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x31bb  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x320b  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x33df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x12b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:885:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v102 */
    /* JADX WARN: Type inference failed for: r10v103 */
    /* JADX WARN: Type inference failed for: r10v104 */
    /* JADX WARN: Type inference failed for: r10v105 */
    /* JADX WARN: Type inference failed for: r10v106 */
    /* JADX WARN: Type inference failed for: r10v111 */
    /* JADX WARN: Type inference failed for: r10v112 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v114 */
    /* JADX WARN: Type inference failed for: r13v115 */
    /* JADX WARN: Type inference failed for: r13v116 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v118 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v92 */
    /* JADX WARN: Type inference failed for: r13v98, types: [long] */
    /* JADX WARN: Type inference failed for: r13v99 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26, types: [int] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r1v411 */
    /* JADX WARN: Type inference failed for: r1v417 */
    /* JADX WARN: Type inference failed for: r1v418 */
    /* JADX WARN: Type inference failed for: r1v428, types: [int] */
    /* JADX WARN: Type inference failed for: r1v429 */
    /* JADX WARN: Type inference failed for: r1v430 */
    /* JADX WARN: Type inference failed for: r1v431 */
    /* JADX WARN: Type inference failed for: r1v432 */
    /* JADX WARN: Type inference failed for: r1v433 */
    /* JADX WARN: Type inference failed for: r1v434 */
    /* JADX WARN: Type inference failed for: r1v441 */
    /* JADX WARN: Type inference failed for: r1v583 */
    /* JADX WARN: Type inference failed for: r1v584 */
    /* JADX WARN: Type inference failed for: r1v585 */
    /* JADX WARN: Type inference failed for: r1v586 */
    /* JADX WARN: Type inference failed for: r1v587 */
    /* JADX WARN: Type inference failed for: r1v588 */
    /* JADX WARN: Type inference failed for: r1v589 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r28v15 */
    /* JADX WARN: Type inference failed for: r28v16 */
    /* JADX WARN: Type inference failed for: r28v17 */
    /* JADX WARN: Type inference failed for: r28v180 */
    /* JADX WARN: Type inference failed for: r28v181 */
    /* JADX WARN: Type inference failed for: r28v182 */
    /* JADX WARN: Type inference failed for: r28v183 */
    /* JADX WARN: Type inference failed for: r28v184 */
    /* JADX WARN: Type inference failed for: r28v52 */
    /* JADX WARN: Type inference failed for: r28v54 */
    /* JADX WARN: Type inference failed for: r28v56 */
    /* JADX WARN: Type inference failed for: r28v57 */
    /* JADX WARN: Type inference failed for: r28v67 */
    /* JADX WARN: Type inference failed for: r28v68 */
    /* JADX WARN: Type inference failed for: r28v69 */
    /* JADX WARN: Type inference failed for: r28v70 */
    /* JADX WARN: Type inference failed for: r2v545, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v553 */
    /* JADX WARN: Type inference failed for: r2v556 */
    /* JADX WARN: Type inference failed for: r2v585 */
    /* JADX WARN: Type inference failed for: r2v586 */
    /* JADX WARN: Type inference failed for: r2v599, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v608 */
    /* JADX WARN: Type inference failed for: r2v783 */
    /* JADX WARN: Type inference failed for: r2v784 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v291 */
    /* JADX WARN: Type inference failed for: r6v323 */
    /* JADX WARN: Type inference failed for: r6v324 */
    /* JADX WARN: Type inference failed for: r6v325 */
    /* JADX WARN: Type inference failed for: r6v326 */
    /* JADX WARN: Type inference failed for: r6v327 */
    /* JADX WARN: Type inference failed for: r6v341 */
    /* JADX WARN: Type inference failed for: r6v342 */
    /* JADX WARN: Type inference failed for: r6v343 */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r8v207, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v82 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcSmsBundlesActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$pKeUf9DaoNODOqs5dx9q3vWnxjQ(Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 95;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return initObservers$lambda$0(resource);
        }
        initObservers$lambda$0(resource);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getAsAtTimestamp = 1;
        component1();
        component2();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = component4 + 57;
        getAsAtTimestamp = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 39;
        equals = i3 % 128;
        int i4 = i3 % 2;
        component1 = 1167927603593685639L;
        int i5 = i2 + 35;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        copydefault = (char) 44569;
        component3 = (char) 61194;
        ShareDataUIState = (char) 20039;
        component2 = (char) 39552;
        getRequestBeneficiariesState = new int[]{1800204904, 1242260463, -2007638374, 794617093, -545246157, 2049811713, 316062790, -1769643758, -2079322071, 2015582680, -1921277608, 53501982, 209156541, -487379160, 63782435, 1580076348, 2102896454, -1405683650};
    }
}
