package com.huawei.digitalpayment.consumer.sfcui.sharedata;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.android.gms.measurement.internal.zzlq;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.model.DataSharingResponse;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import io.ktor.util.date.GMTDateParser;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\u0012\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/RequestSponsorActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/ShareDataViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "contactLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcUI_release", "rawRequestFormState", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/request/RequestDataFormState;", "requestDataResult", "Lcom/huawei/payment/mvvm/Resource;", "Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/model/DataSharingResponse;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class RequestSponsorActivity extends Hilt_RequestSponsorActivity {
    public static final int $stable = 8;
    private static char[] ShareDataUIState;
    private static long component1;
    private static long component2;
    private static int component3;
    private static char component4;
    private static char[] copydefault;
    private static int getRequestBeneficiariesState;
    private final ActivityResultLauncher<Intent> contactLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component1 = 0;
        private static int copydefault = 1;

        @Override
        public final void onActivityResult(Object obj) throws IOException {
            int i = 2 % 2;
            int i2 = component1 + 117;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                RequestSponsorActivity.$r8$lambda$1V7FSqnE3em0WC7HZev2pvx5ZUc(this.f$0, (ActivityResult) obj);
                int i3 = 48 / 0;
            } else {
                RequestSponsorActivity.$r8$lambda$1V7FSqnE3em0WC7HZev2pvx5ZUc(this.f$0, (ActivityResult) obj);
            }
            int i4 = copydefault + 57;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    });

    private final Lazy viewModel;
    private static final byte[] $$l = {121, -58, 81, 67};
    private static final int $$m = 158;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {TarHeader.LF_SYMLINK, -82, -81, 124, -18, -4, 57, -63, -14, -6, 2, -11, 1, TarHeader.LF_LINK, -62, -9, -15, 7, -3, -5, -24, 8, TarHeader.LF_LINK, -75, 8, -20, -6, 4, -12, -5, -11, 63, -60, -3, -12, -6, -4, -19, 62, -65, -11, -12, 9, -19, -2, 7, -17, 56, -40, -40, 7, -4, -18, -5, 4, -11, -17, 5, -12, -5, -11, -27, 1, -23, 7, Ascii.ESC, -35, -25, 13, 6, 6, -16, -39, 13, -25, 9, -18, -4, -9, -5, -5, 3, -15, -12, 59, -18, -4, -9, -5, -5, 3, -15, -12, 60, -12, 59, -74, 7, -2, -8, -23, 5, -19, Ascii.VT, -25, 68, -65, -11, -12, 9, -19, -2, 7, -17, 56, -71, -7, 5, -19, Ascii.VT, -25, -1, -9, -7, 63, -71, 7, -23, 8, -19, -10, Ascii.SI, -7, -16, 1, TarHeader.LF_LINK, -39, -25, -23, 8, -19, -10, Ascii.SI, -7, -16, 1, 8, -24, -11, 4, -17, -14, 47, -51, -12, 1, 4, -3, -23, -13, 79, -69, -18, -4, -9, -5, -5, 3, -15, -12, 59, -18, -7, -15, Ascii.SI, -7, -7, -1, -26, 3, -14, -18, -4, 57, -64, -19, Ascii.SO, -28, Ascii.FF, -10, TarHeader.LF_DIR, -60, -11, -4, -8, -17, 13, -17, -10, 9, -30, 6, 2, -15, -12, SignedBytes.MAX_POWER_OF_TWO, -59, -18, -5, -11, -8, 2, 2, -19, 62, -79, Ascii.FF, -3, -26, 7, -2, -24, 67, -65, -11, -12, 9, -19, Ascii.VT, -8, -23, 5, -12, -5, 58, -62, -21, 1, 5, -23, 5, -12, -5, 58, -43, -39, 13, -23, -8, Ascii.RS, -23, -30, 79, -23};
    private static final int $$k = 214;
    private static final byte[] $$d = {35, -11, -97, -73, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 143;
    private static int getAsAtTimestamp = 1;
    private static int copy = 0;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(short r7, byte r8, int r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.$$l
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = 122 - r8
            int r9 = r9 * 4
            int r9 = 4 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L28:
            int r8 = r8 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.$$n(short, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.$$d
            int r1 = r7 + 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-8)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.g(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 83
            int r8 = 181 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.$$j
            int r1 = 78 - r6
            byte[] r1 = new byte[r1]
            int r6 = 77 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            int r7 = r7 + (-6)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.h(short, short, short, java.lang.Object[]):void");
    }

    public static final ActivityResultLauncher access$getContactLauncher$p(RequestSponsorActivity requestSponsorActivity) {
        int i = 2 % 2;
        int i2 = equals + 33;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ActivityResultLauncher<Intent> activityResultLauncher = requestSponsorActivity.contactLauncher;
        if (i3 == 0) {
            return activityResultLauncher;
        }
        throw null;
    }

    public static final ShareDataViewModel access$getViewModel(RequestSponsorActivity requestSponsorActivity) {
        int i = 2 % 2;
        int i2 = copy + 73;
        equals = i2 % 128;
        int i3 = i2 % 2;
        ShareDataViewModel viewModel = requestSponsorActivity.getViewModel();
        int i4 = equals + 103;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return viewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RequestSponsorActivity() {
        final RequestSponsorActivity requestSponsorActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ShareDataViewModel.class), new Function0<ViewModelStore>() {
            private static int component1 = 0;
            private static int component2 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 101;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    requestSponsorActivity.getViewModelStore();
                    throw null;
                }
                ViewModelStore viewModelStore = requestSponsorActivity.getViewModelStore();
                int i3 = component2 + 47;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 25;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    invoke();
                    throw null;
                }
                ViewModelStore viewModelStoreInvoke = invoke();
                int i3 = component1 + 67;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 7 / 0;
                }
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 109;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                if (i3 == 0) {
                    int i4 = 47 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component1 + 35;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = requestSponsorActivity.getDefaultViewModelProviderFactory();
                int i4 = component2 + 119;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1 + 3;
                int i3 = i2 % 128;
                copydefault = i3;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 != null) {
                    int i4 = i3 + 15;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                return requestSponsorActivity.getDefaultViewModelCreationExtras();
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 103;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = component1 + 57;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return creationExtrasInvoke;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final ShareDataViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = copy + 85;
        equals = i2 % 128;
        int i3 = i2 % 2;
        ShareDataViewModel shareDataViewModel = (ShareDataViewModel) this.viewModel.getValue();
        if (i3 == 0) {
            int i4 = 87 / 0;
        }
        return shareDataViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void contactLauncher$lambda$1(com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity r12, androidx.activity.result.ActivityResult r13) throws java.io.IOException {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.equals
            int r1 = r1 + 97
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.copy = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            if (r13 == 0) goto Lac
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.copy
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.equals = r2
            int r1 = r1 % r0
            int r1 = r13.getResultCode()
            r2 = -1
            if (r1 != r2) goto Lac
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.equals
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.copy = r2
            int r1 = r1 % r0
            if (r1 != 0) goto La7
            android.content.Intent r13 = r13.getData()
            if (r13 == 0) goto Lac
            java.lang.String r1 = "contactResp"
            java.io.Serializable r13 = r13.getSerializableExtra(r1)
            com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact r13 = (com.huawei.digitalpayment.consumer.sfcui.ui.resp.SfcContact) r13
            if (r13 == 0) goto Lac
            java.lang.String r2 = r13.getRealPhoneNumber()
            if (r2 == 0) goto Lac
            int r13 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.copy
            int r13 = r13 + 29
            int r1 = r13 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.equals = r1
            int r13 = r13 % r0
            if (r13 != 0) goto L66
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r13 = r12.getViewModel()
            androidx.lifecycle.LiveData r13 = r13.getRequestFormState()
            java.lang.Object r13 = r13.getValue()
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState r13 = (com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState) r13
            r1 = 41
            int r1 = r1 / 0
            if (r13 != 0) goto L64
            goto L76
        L64:
            r1 = r13
            goto L86
        L66:
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r13 = r12.getViewModel()
            androidx.lifecycle.LiveData r13 = r13.getRequestFormState()
            java.lang.Object r13 = r13.getValue()
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState r13 = (com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState) r13
            if (r13 != 0) goto L64
        L76:
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState r13 = new com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 63
            r11 = 0
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L64
        L86:
            com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r12 = r12.getViewModel()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            r9 = 0
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState r13 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12.updateRequestFormState(r13)
            int r12 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.equals
            int r12 = r12 + 87
            int r13 = r12 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.copy = r13
            int r12 = r12 % r0
            if (r12 == 0) goto Lac
            r12 = 5
            int r12 = r12 / r0
            goto Lac
        La7:
            r13.getData()
            r12 = 0
            throw r12
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.contactLauncher$lambda$1(com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity, androidx.activity.result.ActivityResult):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function2<Composer, Integer, Unit> {
        private static int component3 = 0;
        private static int copydefault = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int component1 = 0;
            private static int component3 = 1;
            final RequestSponsorActivity component2;

            public static Object copydefault(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
                int i7 = ~i4;
                int i8 = ~i6;
                int i9 = ~(i7 | i8);
                int i10 = (~(i7 | i3)) | i9;
                int i11 = (~((~i3) | i7 | i6)) | (~(i8 | i4));
                int i12 = i4 + i6 + i + (531708263 * i5) + ((-608630064) * i2);
                int i13 = i12 * i12;
                int i14 = (i4 * (-228234701)) + 730857472 + ((-228234701) * i6) + (i9 * (-1010133554)) + (i10 * (-1010133554)) + ((-1010133554) * i11) + ((-1238368256) * i) + ((-45088768) * i5) + ((-419430400) * i2) + ((-1471938560) * i13);
                int i15 = ((i4 * (-1679524527)) - 150938974) + (i6 * (-1679524527)) + (i9 * 282) + (i10 * 282) + (i11 * 282) + (i * (-1679524245)) + (i5 * (-166744051)) + (i2 * 2062148848) + (i13 * (-865337344));
                int i16 = i14 + (i15 * i15 * (-1617166336));
                return i16 != 1 ? i16 != 2 ? component2(objArr) : ShareDataUIState(objArr) : copydefault(objArr);
            }

            public static final Resource ShareDataUIState(State state) {
                int i = 2 % 2;
                int i2 = component3 + 35;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                int iComponent1 = zzlq.component1();
                int iComponent12 = zzlq.component1();
                int iComponent13 = zzlq.component1();
                Resource resource = (Resource) copydefault(iComponent12, zzlq.component1(), new Object[]{state}, iComponent1, -270849535, iComponent13, 270849535);
                int i4 = component1 + 67;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return resource;
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component3 + 119;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                component2(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = component3 + 7;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 18 / 0;
                }
                return unit;
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity$onCreate$1$1$1", f = "RequestSponsorActivity.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
            static final class C02961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private static int component3 = 0;
                private static int copydefault = 1;
                int ShareDataUIState;
                final RequestSponsorActivity component1;
                final State<Resource<DataSharingResponse>> component2;

                /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        Method dump skipped, instruction units count: 282
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.ShareDataUIState.AnonymousClass1.C02961.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02961(RequestSponsorActivity requestSponsorActivity, State<Resource<DataSharingResponse>> state, Continuation<? super C02961> continuation) {
                    super(2, continuation);
                    this.component1 = requestSponsorActivity;
                    this.component2 = state;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    C02961 c02961 = new C02961(this.component1, this.component2, continuation);
                    int i2 = copydefault + 31;
                    component3 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 58 / 0;
                    }
                    return c02961;
                }

                @Override
                public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 91;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objCopydefault = copydefault(coroutineScope, continuation);
                    int i4 = copydefault + 3;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return objCopydefault;
                }

                public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 71;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((C02961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = copydefault + 109;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }
            }

            private static final Unit component3(RequestSponsorActivity requestSponsorActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component1 + 53;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(requestSponsorActivity, "");
                    requestSponsorActivity.finish();
                    unit = Unit.INSTANCE;
                    int i3 = 76 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(requestSponsorActivity, "");
                    requestSponsorActivity.finish();
                    unit = Unit.INSTANCE;
                }
                int i4 = component1 + 39;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit copydefault(RequestSponsorActivity requestSponsorActivity, RequestDataFormState requestDataFormState) throws IOException {
                int i = 2 % 2;
                int i2 = component1 + 15;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(requestSponsorActivity, "");
                Intrinsics.checkNotNullParameter(requestDataFormState, "");
                RequestSponsorActivity.access$getViewModel(requestSponsorActivity).updateRequestFormState(requestDataFormState);
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 69;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static final kotlin.Unit ShareDataUIState(com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState r3, com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity r4) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.ShareDataUIState.AnonymousClass1.component3
                    int r1 = r1 + 33
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.ShareDataUIState.AnonymousClass1.component1 = r2
                    int r1 = r1 % r0
                    java.lang.String r2 = ""
                    if (r1 == 0) goto L21
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
                    boolean r1 = r3.isValid()
                    r2 = 45
                    int r2 = r2 / 0
                    if (r1 == 0) goto L42
                    goto L2d
                L21:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
                    boolean r1 = r3.isValid()
                    if (r1 == 0) goto L42
                L2d:
                    java.lang.String r1 = r3.getSponsorMsisdn()
                    r2 = 9
                    java.lang.String r1 = kotlin.text.StringsKt.takeLast(r1, r2)
                    com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataViewModel r4 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.access$getViewModel(r4)
                    java.lang.String r3 = r3.getRequestedAmount()
                    r4.requestData(r1, r3)
                L42:
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    int r4 = com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.ShareDataUIState.AnonymousClass1.component1
                    int r4 = r4 + 1
                    int r1 = r4 % 128
                    com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.ShareDataUIState.AnonymousClass1.component3 = r1
                    int r4 = r4 % r0
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.ShareDataUIState.AnonymousClass1.ShareDataUIState(com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.request.RequestDataFormState, com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity):kotlin.Unit");
            }

            private static Object ShareDataUIState(Object[] objArr) {
                RequestSponsorActivity requestSponsorActivity = (RequestSponsorActivity) objArr[0];
                int i = 2 % 2;
                int i2 = component3 + 11;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(requestSponsorActivity, "");
                    RouteUtils.routeWithExecute(requestSponsorActivity, RoutePathConstant.SELECT_CONTACT, null, RequestSponsorActivity.access$getContactLauncher$p(requestSponsorActivity));
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(requestSponsorActivity, "");
                RouteUtils.routeWithExecute(requestSponsorActivity, RoutePathConstant.SELECT_CONTACT, null, RequestSponsorActivity.access$getContactLauncher$p(requestSponsorActivity));
                Unit unit2 = Unit.INSTANCE;
                int i3 = component1 + 111;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            private static final Unit getAsAtTimestamp(RequestSponsorActivity requestSponsorActivity) {
                int i = 2 % 2;
                int i2 = component1 + 75;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(requestSponsorActivity, "");
                requestSponsorActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 125;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static Object copydefault(Object[] objArr) {
                int i = 2 % 2;
                int i2 = component1 + 91;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 89;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0182  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x01f7  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component2(androidx.compose.runtime.Composer r29, int r30) {
                /*
                    Method dump skipped, instruction units count: 564
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.ShareDataUIState.AnonymousClass1.component2(androidx.compose.runtime.Composer, int):void");
            }

            private static final RequestDataFormState copydefault(State<RequestDataFormState> state) {
                int i = 2 % 2;
                int i2 = component1 + 109;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                RequestDataFormState value = state.getValue();
                int i4 = component3 + 97;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return value;
            }

            private static Object component2(Object[] objArr) {
                State state = (State) objArr[0];
                int i = 2 % 2;
                int i2 = component3 + 61;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Resource resource = (Resource) state.getValue();
                int i4 = component1 + 31;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return resource;
            }

            public static Unit component1() {
                Unit unit;
                int i = 2 % 2;
                int i2 = component1 + 85;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    int iComponent1 = zzlq.component1();
                    int iComponent12 = zzlq.component1();
                    int iComponent13 = zzlq.component1();
                    unit = (Unit) copydefault(iComponent12, zzlq.component1(), new Object[0], iComponent1, 1436062071, iComponent13, -1436062070);
                    int i3 = 67 / 0;
                } else {
                    int iComponent14 = zzlq.component1();
                    int iComponent15 = zzlq.component1();
                    int iComponent16 = zzlq.component1();
                    unit = (Unit) copydefault(iComponent15, zzlq.component1(), new Object[0], iComponent14, 1436062071, iComponent16, -1436062070);
                }
                int i4 = component3 + 17;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 6 / 0;
                }
                return unit;
            }

            public static Unit component2(RequestSponsorActivity requestSponsorActivity) {
                int i = 2 % 2;
                int i2 = component3 + 103;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Unit asAtTimestamp = getAsAtTimestamp(requestSponsorActivity);
                int i4 = component3 + 19;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return asAtTimestamp;
            }

            public static Unit component1(RequestDataFormState requestDataFormState, RequestSponsorActivity requestSponsorActivity) {
                int i = 2 % 2;
                int i2 = component3 + 89;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(requestDataFormState, requestSponsorActivity);
                int i4 = component1 + 87;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unitShareDataUIState;
            }

            public static Unit ShareDataUIState(RequestSponsorActivity requestSponsorActivity) {
                int i = 2 % 2;
                int i2 = component1 + 21;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(requestSponsorActivity);
                int i4 = component3 + 61;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent3;
            }

            public static Unit component2(RequestSponsorActivity requestSponsorActivity, RequestDataFormState requestDataFormState) throws IOException {
                int i = 2 % 2;
                int i2 = component1 + 115;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(requestSponsorActivity, requestDataFormState);
                int i4 = component3 + 23;
                component1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitCopydefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit copydefault(RequestSponsorActivity requestSponsorActivity) {
                int i = 2 % 2;
                int i2 = component3 + 65;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                int iComponent1 = zzlq.component1();
                int iComponent12 = zzlq.component1();
                int iComponent13 = zzlq.component1();
                Unit unit = (Unit) copydefault(iComponent12, zzlq.component1(), new Object[]{requestSponsorActivity}, iComponent1, 1944326516, iComponent13, -1944326514);
                int i4 = component3 + 33;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            AnonymousClass1(RequestSponsorActivity requestSponsorActivity) {
                this.component2 = requestSponsorActivity;
            }

            private static final Resource<DataSharingResponse> component2(State<Resource<DataSharingResponse>> state) {
                int iComponent1 = zzlq.component1();
                int iComponent12 = zzlq.component1();
                int iComponent13 = zzlq.component1();
                return (Resource) copydefault(iComponent12, zzlq.component1(), new Object[]{state}, iComponent1, -270849535, iComponent13, 270849535);
            }

            private static final Unit component1(RequestSponsorActivity requestSponsorActivity) {
                int iComponent1 = zzlq.component1();
                int iComponent12 = zzlq.component1();
                int iComponent13 = zzlq.component1();
                return (Unit) copydefault(iComponent12, zzlq.component1(), new Object[]{requestSponsorActivity}, iComponent1, 1944326516, iComponent13, -1944326514);
            }

            private static final Unit component3() {
                int iComponent1 = zzlq.component1();
                int iComponent12 = zzlq.component1();
                int iComponent13 = zzlq.component1();
                return (Unit) copydefault(iComponent12, zzlq.component1(), new Object[0], iComponent1, 1436062071, iComponent13, -1436062070);
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 95;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component2(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                throw null;
            }
            int i4 = component3 + 11;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void component2(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 57;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            if ((i & 11) == 2) {
                int i6 = i4 + 15;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(840142546, true, new AnonymousClass1(RequestSponsorActivity.this), composer, 54), composer, 1572864, 63);
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
        int i5 = $11 + 17;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (cancelnotification.copydefault < i2) {
            int i7 = $11 + 73;
            $10 = i7 % 128;
            if (i7 % i3 != 0) {
                int i8 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(copydefault[i % i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34, (char) Color.argb(0, 0, 0, 0), 1159210934, false, $$n(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(component1), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3607, 28 - MotionEvent.axisFromString(""), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7170), 1951385784, false, $$n(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 4013, (ViewConfiguration.getTapTimeout() >> 16) + 24, (char) (27760 - ExpandableListView.getPackedPositionChild(0L)), -1529629956, false, $$n(b6, b7, b7), new Class[]{Object.class, Object.class});
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
                int i9 = cancelnotification.copydefault;
                Object[] objArr5 = {Integer.valueOf(copydefault[i + i9])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 1758, 34 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 1159210934, false, $$n(b8, b9, (byte) (b9 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(component1), Integer.valueOf(c2)};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault5 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 3608, (ViewConfiguration.getScrollBarSize() >> 8) + 29, (char) (7170 - TextUtils.indexOf((CharSequence) "", '0')), 1951385784, false, $$n(b10, b11, (byte) (b11 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {cancelnotification, cancelnotification};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault6 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4013, AndroidCharacter.getMirror('0') - 24, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 27761), -1529629956, false, $$n(b12, b13, b13), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr8 = {cancelnotification, cancelnotification};
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault7 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 4013, 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27761), -1529629956, false, $$n(b14, b15, b15), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault7).invoke(null, objArr8);
        }
        String str = new String(cArr);
        int i10 = $11 + 69;
        $10 = i10 % 128;
        if (i10 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void f(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i4 = $11 + 1;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4036, 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ViewConfiguration.getTouchSlop() >> 8) + 19181), 1912513118, false, $$n(b2, (byte) (b2 | Ascii.ETB), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 11 - (ViewConfiguration.getTouchSlop() >> 8), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i6 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i6);
                objArr4[0] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 27, (char) ExpandableListView.getPackedPositionType(0L), 931716605, false, $$n(b3, (byte) (b3 | Ascii.CAN), b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - TextUtils.getOffsetBefore("", 0), 11 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (Process.myPid() >> 22), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component4) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i7 = $10 + 81;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void i(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = ShareDataUIState;
        Object obj = null;
        if (cArr != null) {
            int i6 = $11 + 59;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(656 - ImageFormat.getBitsPerPixel(0), 13 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (View.resolveSize(0, 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                int i9 = $10 + 5;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 4502, 37 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (27897 - Color.green(0)), -1464227204, false, $$n(b2, (byte) (b2 | Ascii.FF), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objCopydefault2).invoke(obj, objArr3)).charValue();
                } else {
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3580 - (Process.myTid() >> 22), 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((-16777216) - Color.rgb(0, 0, 0)), 1180380354, false, $$n(b3, (byte) (b3 | 7), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objCopydefault3).invoke(obj, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 1859, 34 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 80302927, false, $$n(b4, (byte) (b4 | 8), b4), new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i13 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i13, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
                int i14 = $10 + 109;
                $11 = i14 % 128;
                int i15 = i14 % 2;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i16 = $11 + 57;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x028b  */
    /* JADX WARN: Type inference failed for: r2v267, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 10404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = equals + 113;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = equals + 29;
            copy = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            e((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(24) - 115), 23 - ExpandableListView.getPackedPositionType(0L), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952812_res_0x7f1304ac).substring(55, 56).length() + 25, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(new char[]{15992, 20451, 64192, 64965, 33056, 23979, 56957, 14970, 8418, 34654, 42075, 52873, 15629, 4429, 4607, 49517, 49281, 24423}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).codePointAt(0) - 32, new char[]{33908, 18380, 64350, 40830}, (char) (15587 - ExpandableListView.getPackedPositionGroup(0L)), new char[]{52520, 3264, 58222, 34364}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i6 = copy + 37;
            equals = i6 % 128;
            int i7 = i6 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - Drawable.resolveOpacity(0, 0), 42 - TextUtils.getOffsetAfter("", 0), (char) (TextUtils.lastIndexOf("", '0') + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - View.MeasureSpec.getSize(0), Gravity.getAbsoluteGravity(0, 0) + 56, (char) Drawable.resolveOpacity(0, 0), -699576857, false, "component2", new Class[]{Context.class});
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
        super.onResume();
        int i8 = copy + 15;
        equals = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 6, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(new char[]{15992, 20451, 64192, 64965, 33056, 23979, 56957, 14970, 8418, 34654, 42075, 52873, 15629, 4429, 4607, 49517, 49281, 24423}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{33908, 18380, 64350, 40830}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952747_res_0x7f13046b).substring(22, 23).length() + 15586), new char[]{52520, 3264, 58222, 34364}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - TextUtils.lastIndexOf("", '0', 0), 42 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ExpandableListView.getPackedPositionType(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6561, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 55, (char) (KeyEvent.getMaxKeyCode() >> 16), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i2 = copy + 21;
                equals = i2 % 128;
                int i3 = i2 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
        int i4 = copy + 13;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1000:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0aba A[Catch: all -> 0x05a2, TryCatch #1 {all -> 0x05a2, blocks: (B:144:0x0ab4, B:146:0x0aba, B:147:0x0ae5, B:293:0x1269, B:295:0x126f, B:296:0x1297, B:545:0x1f51, B:547:0x1f57, B:548:0x1f81, B:773:0x3364, B:775:0x336a, B:776:0x338e, B:810:0x36ca, B:812:0x36d0, B:813:0x36f5, B:790:0x34e4, B:792:0x3507, B:793:0x3562, B:739:0x3028, B:741:0x302e, B:742:0x3059, B:624:0x2910, B:626:0x2916, B:627:0x293d, B:629:0x2977, B:630:0x29c4, B:594:0x25ba, B:596:0x25cf, B:597:0x25fa, B:599:0x262e, B:600:0x26b1, B:835:0x37d3, B:837:0x37d9, B:838:0x3803, B:840:0x383d, B:841:0x3881, B:561:0x2180, B:563:0x2195, B:564:0x21c1, B:434:0x19c9, B:436:0x19cf, B:437:0x19f5, B:341:0x14ef, B:343:0x14f5, B:344:0x1520, B:23:0x02af, B:25:0x02b5, B:26:0x02db, B:28:0x050d, B:30:0x053f, B:31:0x059c, B:303:0x132b, B:305:0x132f, B:327:0x1427, B:329:0x142d, B:330:0x142e, B:332:0x1430, B:334:0x1437, B:335:0x1438, B:309:0x133b, B:312:0x1344, B:313:0x134a), top: B:857:0x02af, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0b74  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0bca A[Catch: all -> 0x11c1, PHI: r1
  0x0bca: PHI (r1v632 java.lang.Object) = (r1v631 java.lang.Object), (r1v691 java.lang.Object) binds: [B:152:0x0b72, B:154:0x0b76] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #22 {all -> 0x11c1, blocks: (B:151:0x0b6e, B:158:0x0bca), top: B:896:0x0b6e }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0c5d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0cc1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x1048  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x1084 A[PHI: r11
  0x1084: PHI (r11v245 ??) = (r11v326 ??), (r11v327 ??) binds: [B:237:0x1082, B:234:0x106a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x1089 A[Catch: all -> 0x11bd, PHI: r3 r4 r6 r9
  0x1089: PHI (r3v439 java.lang.Object[]) = (r3v438 java.lang.Object[]), (r3v454 java.lang.Object[]) binds: [B:237:0x1082, B:234:0x106a] A[DONT_GENERATE, DONT_INLINE]
  0x1089: PHI (r4v613 char) = (r4v612 char), (r4v636 char) binds: [B:237:0x1082, B:234:0x106a] A[DONT_GENERATE, DONT_INLINE]
  0x1089: PHI (r6v560 int) = (r6v559 int), (r6v586 int) binds: [B:237:0x1082, B:234:0x106a] A[DONT_GENERATE, DONT_INLINE]
  0x1089: PHI (r9v227 int) = (r9v296 int), (r9v297 int) binds: [B:237:0x1082, B:234:0x106a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #17 {all -> 0x11bd, blocks: (B:168:0x0c46, B:226:0x103c, B:227:0x1040, B:239:0x1089, B:236:0x106d, B:190:0x0cdd, B:207:0x0f07, B:211:0x0f55, B:222:0x0fd4, B:225:0x1036), top: B:887:0x0c46 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x126f A[Catch: all -> 0x05a2, TryCatch #1 {all -> 0x05a2, blocks: (B:144:0x0ab4, B:146:0x0aba, B:147:0x0ae5, B:293:0x1269, B:295:0x126f, B:296:0x1297, B:545:0x1f51, B:547:0x1f57, B:548:0x1f81, B:773:0x3364, B:775:0x336a, B:776:0x338e, B:810:0x36ca, B:812:0x36d0, B:813:0x36f5, B:790:0x34e4, B:792:0x3507, B:793:0x3562, B:739:0x3028, B:741:0x302e, B:742:0x3059, B:624:0x2910, B:626:0x2916, B:627:0x293d, B:629:0x2977, B:630:0x29c4, B:594:0x25ba, B:596:0x25cf, B:597:0x25fa, B:599:0x262e, B:600:0x26b1, B:835:0x37d3, B:837:0x37d9, B:838:0x3803, B:840:0x383d, B:841:0x3881, B:561:0x2180, B:563:0x2195, B:564:0x21c1, B:434:0x19c9, B:436:0x19cf, B:437:0x19f5, B:341:0x14ef, B:343:0x14f5, B:344:0x1520, B:23:0x02af, B:25:0x02b5, B:26:0x02db, B:28:0x050d, B:30:0x053f, B:31:0x059c, B:303:0x132b, B:305:0x132f, B:327:0x1427, B:329:0x142d, B:330:0x142e, B:332:0x1430, B:334:0x1437, B:335:0x1438, B:309:0x133b, B:312:0x1344, B:313:0x134a), top: B:857:0x02af, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x131f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x134b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x1362 A[Catch: all -> 0x142f, TryCatch #10 {all -> 0x142f, blocks: (B:316:0x134d, B:318:0x1362, B:319:0x1398), top: B:873:0x134d, outer: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x13ab A[Catch: all -> 0x1425, TryCatch #3 {all -> 0x1425, blocks: (B:320:0x139e, B:322:0x13ab, B:323:0x141d), top: B:860:0x139e, outer: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x160a  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x1667 A[Catch: all -> 0x193f, TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x193f, blocks: (B:348:0x15a9, B:354:0x15fd, B:364:0x1667), top: B:893:0x15a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x1830  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x19cf A[Catch: all -> 0x05a2, TryCatch #1 {all -> 0x05a2, blocks: (B:144:0x0ab4, B:146:0x0aba, B:147:0x0ae5, B:293:0x1269, B:295:0x126f, B:296:0x1297, B:545:0x1f51, B:547:0x1f57, B:548:0x1f81, B:773:0x3364, B:775:0x336a, B:776:0x338e, B:810:0x36ca, B:812:0x36d0, B:813:0x36f5, B:790:0x34e4, B:792:0x3507, B:793:0x3562, B:739:0x3028, B:741:0x302e, B:742:0x3059, B:624:0x2910, B:626:0x2916, B:627:0x293d, B:629:0x2977, B:630:0x29c4, B:594:0x25ba, B:596:0x25cf, B:597:0x25fa, B:599:0x262e, B:600:0x26b1, B:835:0x37d3, B:837:0x37d9, B:838:0x3803, B:840:0x383d, B:841:0x3881, B:561:0x2180, B:563:0x2195, B:564:0x21c1, B:434:0x19c9, B:436:0x19cf, B:437:0x19f5, B:341:0x14ef, B:343:0x14f5, B:344:0x1520, B:23:0x02af, B:25:0x02b5, B:26:0x02db, B:28:0x050d, B:30:0x053f, B:31:0x059c, B:303:0x132b, B:305:0x132f, B:327:0x1427, B:329:0x142d, B:330:0x142e, B:332:0x1430, B:334:0x1437, B:335:0x1438, B:309:0x133b, B:312:0x1344, B:313:0x134a), top: B:857:0x02af, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x1a86  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x1ae3  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x1b3c A[Catch: all -> 0x1eca, TRY_ENTER, TRY_LEAVE, TryCatch #29 {all -> 0x1eca, blocks: (B:441:0x1a80, B:448:0x1ad6, B:490:0x1d70, B:491:0x1d74, B:493:0x1d7a, B:496:0x1d98, B:457:0x1b3c, B:475:0x1c4e, B:479:0x1c95, B:485:0x1d0c, B:489:0x1d68), top: B:909:0x1a80 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x1d7a A[Catch: all -> 0x1eca, TryCatch #29 {all -> 0x1eca, blocks: (B:441:0x1a80, B:448:0x1ad6, B:490:0x1d70, B:491:0x1d74, B:493:0x1d7a, B:496:0x1d98, B:457:0x1b3c, B:475:0x1c4e, B:479:0x1c95, B:485:0x1d0c, B:489:0x1d68), top: B:909:0x1a80 }] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1f57 A[Catch: all -> 0x05a2, TryCatch #1 {all -> 0x05a2, blocks: (B:144:0x0ab4, B:146:0x0aba, B:147:0x0ae5, B:293:0x1269, B:295:0x126f, B:296:0x1297, B:545:0x1f51, B:547:0x1f57, B:548:0x1f81, B:773:0x3364, B:775:0x336a, B:776:0x338e, B:810:0x36ca, B:812:0x36d0, B:813:0x36f5, B:790:0x34e4, B:792:0x3507, B:793:0x3562, B:739:0x3028, B:741:0x302e, B:742:0x3059, B:624:0x2910, B:626:0x2916, B:627:0x293d, B:629:0x2977, B:630:0x29c4, B:594:0x25ba, B:596:0x25cf, B:597:0x25fa, B:599:0x262e, B:600:0x26b1, B:835:0x37d3, B:837:0x37d9, B:838:0x3803, B:840:0x383d, B:841:0x3881, B:561:0x2180, B:563:0x2195, B:564:0x21c1, B:434:0x19c9, B:436:0x19cf, B:437:0x19f5, B:341:0x14ef, B:343:0x14f5, B:344:0x1520, B:23:0x02af, B:25:0x02b5, B:26:0x02db, B:28:0x050d, B:30:0x053f, B:31:0x059c, B:303:0x132b, B:305:0x132f, B:327:0x1427, B:329:0x142d, B:330:0x142e, B:332:0x1430, B:334:0x1437, B:335:0x1438, B:309:0x133b, B:312:0x1344, B:313:0x134a), top: B:857:0x02af, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x200b  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x205c  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x215e  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x230a  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x302e A[Catch: all -> 0x05a2, TryCatch #1 {all -> 0x05a2, blocks: (B:144:0x0ab4, B:146:0x0aba, B:147:0x0ae5, B:293:0x1269, B:295:0x126f, B:296:0x1297, B:545:0x1f51, B:547:0x1f57, B:548:0x1f81, B:773:0x3364, B:775:0x336a, B:776:0x338e, B:810:0x36ca, B:812:0x36d0, B:813:0x36f5, B:790:0x34e4, B:792:0x3507, B:793:0x3562, B:739:0x3028, B:741:0x302e, B:742:0x3059, B:624:0x2910, B:626:0x2916, B:627:0x293d, B:629:0x2977, B:630:0x29c4, B:594:0x25ba, B:596:0x25cf, B:597:0x25fa, B:599:0x262e, B:600:0x26b1, B:835:0x37d3, B:837:0x37d9, B:838:0x3803, B:840:0x383d, B:841:0x3881, B:561:0x2180, B:563:0x2195, B:564:0x21c1, B:434:0x19c9, B:436:0x19cf, B:437:0x19f5, B:341:0x14ef, B:343:0x14f5, B:344:0x1520, B:23:0x02af, B:25:0x02b5, B:26:0x02db, B:28:0x050d, B:30:0x053f, B:31:0x059c, B:303:0x132b, B:305:0x132f, B:327:0x1427, B:329:0x142d, B:330:0x142e, B:332:0x1430, B:334:0x1437, B:335:0x1438, B:309:0x133b, B:312:0x1344, B:313:0x134a), top: B:857:0x02af, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:747:0x30e2  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x312f  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x3189  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x3346  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x3422  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x3474  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x34c6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:809:0x36aa  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x379b  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x0bf1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:936:0x15af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v197 */
    /* JADX WARN: Type inference failed for: r10v202 */
    /* JADX WARN: Type inference failed for: r10v203 */
    /* JADX WARN: Type inference failed for: r10v204 */
    /* JADX WARN: Type inference failed for: r10v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r11v153 */
    /* JADX WARN: Type inference failed for: r11v157 */
    /* JADX WARN: Type inference failed for: r11v158 */
    /* JADX WARN: Type inference failed for: r11v160 */
    /* JADX WARN: Type inference failed for: r11v161 */
    /* JADX WARN: Type inference failed for: r11v162 */
    /* JADX WARN: Type inference failed for: r11v163 */
    /* JADX WARN: Type inference failed for: r11v164 */
    /* JADX WARN: Type inference failed for: r11v165 */
    /* JADX WARN: Type inference failed for: r11v171, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v172 */
    /* JADX WARN: Type inference failed for: r11v177 */
    /* JADX WARN: Type inference failed for: r11v178 */
    /* JADX WARN: Type inference failed for: r11v180 */
    /* JADX WARN: Type inference failed for: r11v181 */
    /* JADX WARN: Type inference failed for: r11v191 */
    /* JADX WARN: Type inference failed for: r11v199, types: [long] */
    /* JADX WARN: Type inference failed for: r11v224, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v227 */
    /* JADX WARN: Type inference failed for: r11v228 */
    /* JADX WARN: Type inference failed for: r11v240 */
    /* JADX WARN: Type inference failed for: r11v241 */
    /* JADX WARN: Type inference failed for: r11v242 */
    /* JADX WARN: Type inference failed for: r11v245 */
    /* JADX WARN: Type inference failed for: r11v246 */
    /* JADX WARN: Type inference failed for: r11v249, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v250 */
    /* JADX WARN: Type inference failed for: r11v304 */
    /* JADX WARN: Type inference failed for: r11v305 */
    /* JADX WARN: Type inference failed for: r11v306 */
    /* JADX WARN: Type inference failed for: r11v307 */
    /* JADX WARN: Type inference failed for: r11v308 */
    /* JADX WARN: Type inference failed for: r11v309 */
    /* JADX WARN: Type inference failed for: r11v310 */
    /* JADX WARN: Type inference failed for: r11v311 */
    /* JADX WARN: Type inference failed for: r11v312 */
    /* JADX WARN: Type inference failed for: r11v313 */
    /* JADX WARN: Type inference failed for: r11v314 */
    /* JADX WARN: Type inference failed for: r11v315 */
    /* JADX WARN: Type inference failed for: r11v316 */
    /* JADX WARN: Type inference failed for: r11v317 */
    /* JADX WARN: Type inference failed for: r11v318 */
    /* JADX WARN: Type inference failed for: r11v319 */
    /* JADX WARN: Type inference failed for: r11v320 */
    /* JADX WARN: Type inference failed for: r11v321 */
    /* JADX WARN: Type inference failed for: r11v322 */
    /* JADX WARN: Type inference failed for: r11v323 */
    /* JADX WARN: Type inference failed for: r11v324 */
    /* JADX WARN: Type inference failed for: r11v325 */
    /* JADX WARN: Type inference failed for: r11v326 */
    /* JADX WARN: Type inference failed for: r11v327 */
    /* JADX WARN: Type inference failed for: r11v328 */
    /* JADX WARN: Type inference failed for: r11v329 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v330 */
    /* JADX WARN: Type inference failed for: r11v331 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r13v104 */
    /* JADX WARN: Type inference failed for: r13v105 */
    /* JADX WARN: Type inference failed for: r13v109 */
    /* JADX WARN: Type inference failed for: r13v110 */
    /* JADX WARN: Type inference failed for: r13v111 */
    /* JADX WARN: Type inference failed for: r13v115 */
    /* JADX WARN: Type inference failed for: r13v116 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v118 */
    /* JADX WARN: Type inference failed for: r13v129 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v137 */
    /* JADX WARN: Type inference failed for: r13v139 */
    /* JADX WARN: Type inference failed for: r13v141 */
    /* JADX WARN: Type inference failed for: r13v142 */
    /* JADX WARN: Type inference failed for: r13v143 */
    /* JADX WARN: Type inference failed for: r13v144 */
    /* JADX WARN: Type inference failed for: r13v145 */
    /* JADX WARN: Type inference failed for: r13v146 */
    /* JADX WARN: Type inference failed for: r13v147 */
    /* JADX WARN: Type inference failed for: r13v148 */
    /* JADX WARN: Type inference failed for: r13v149 */
    /* JADX WARN: Type inference failed for: r13v150 */
    /* JADX WARN: Type inference failed for: r13v151 */
    /* JADX WARN: Type inference failed for: r13v152 */
    /* JADX WARN: Type inference failed for: r13v153 */
    /* JADX WARN: Type inference failed for: r13v154 */
    /* JADX WARN: Type inference failed for: r13v155 */
    /* JADX WARN: Type inference failed for: r13v156 */
    /* JADX WARN: Type inference failed for: r13v157 */
    /* JADX WARN: Type inference failed for: r13v158 */
    /* JADX WARN: Type inference failed for: r13v159 */
    /* JADX WARN: Type inference failed for: r13v160 */
    /* JADX WARN: Type inference failed for: r13v161 */
    /* JADX WARN: Type inference failed for: r13v162 */
    /* JADX WARN: Type inference failed for: r13v163 */
    /* JADX WARN: Type inference failed for: r13v164 */
    /* JADX WARN: Type inference failed for: r13v165 */
    /* JADX WARN: Type inference failed for: r13v166 */
    /* JADX WARN: Type inference failed for: r13v167 */
    /* JADX WARN: Type inference failed for: r13v168 */
    /* JADX WARN: Type inference failed for: r13v171 */
    /* JADX WARN: Type inference failed for: r13v172 */
    /* JADX WARN: Type inference failed for: r13v173 */
    /* JADX WARN: Type inference failed for: r13v174 */
    /* JADX WARN: Type inference failed for: r13v175 */
    /* JADX WARN: Type inference failed for: r13v176 */
    /* JADX WARN: Type inference failed for: r13v177 */
    /* JADX WARN: Type inference failed for: r13v178 */
    /* JADX WARN: Type inference failed for: r13v179 */
    /* JADX WARN: Type inference failed for: r13v180 */
    /* JADX WARN: Type inference failed for: r13v181 */
    /* JADX WARN: Type inference failed for: r13v182 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v80, types: [long] */
    /* JADX WARN: Type inference failed for: r13v95 */
    /* JADX WARN: Type inference failed for: r13v96 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v14 */
    /* JADX WARN: Type inference failed for: r28v15 */
    /* JADX WARN: Type inference failed for: r28v16 */
    /* JADX WARN: Type inference failed for: r28v17 */
    /* JADX WARN: Type inference failed for: r28v18 */
    /* JADX WARN: Type inference failed for: r28v19 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v20 */
    /* JADX WARN: Type inference failed for: r28v21 */
    /* JADX WARN: Type inference failed for: r28v22 */
    /* JADX WARN: Type inference failed for: r28v23 */
    /* JADX WARN: Type inference failed for: r28v24 */
    /* JADX WARN: Type inference failed for: r28v25 */
    /* JADX WARN: Type inference failed for: r28v26 */
    /* JADX WARN: Type inference failed for: r28v27 */
    /* JADX WARN: Type inference failed for: r28v28 */
    /* JADX WARN: Type inference failed for: r28v29 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v30 */
    /* JADX WARN: Type inference failed for: r28v31 */
    /* JADX WARN: Type inference failed for: r28v32 */
    /* JADX WARN: Type inference failed for: r28v33 */
    /* JADX WARN: Type inference failed for: r28v34 */
    /* JADX WARN: Type inference failed for: r28v35 */
    /* JADX WARN: Type inference failed for: r28v36 */
    /* JADX WARN: Type inference failed for: r28v37 */
    /* JADX WARN: Type inference failed for: r28v38 */
    /* JADX WARN: Type inference failed for: r28v39 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v41 */
    /* JADX WARN: Type inference failed for: r28v42 */
    /* JADX WARN: Type inference failed for: r28v43 */
    /* JADX WARN: Type inference failed for: r28v44 */
    /* JADX WARN: Type inference failed for: r28v45 */
    /* JADX WARN: Type inference failed for: r28v46 */
    /* JADX WARN: Type inference failed for: r28v47 */
    /* JADX WARN: Type inference failed for: r28v48 */
    /* JADX WARN: Type inference failed for: r28v49 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v50 */
    /* JADX WARN: Type inference failed for: r28v51 */
    /* JADX WARN: Type inference failed for: r28v52 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r4v624 */
    /* JADX WARN: Type inference failed for: r9v295 */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v75 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.RequestSponsorActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$1V7FSqnE3em0WC7HZev2pvx5ZUc(RequestSponsorActivity requestSponsorActivity, ActivityResult activityResult) throws IOException {
        int i = 2 % 2;
        int i2 = copy + 27;
        equals = i2 % 128;
        int i3 = i2 % 2;
        contactLauncher$lambda$1(requestSponsorActivity, activityResult);
        int i4 = equals + 47;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getRequestBeneficiariesState = 0;
        component3();
        ShareDataUIState();
        int i = getAsAtTimestamp + 51;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 77;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = equals + 99;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 73;
        copy = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState = new char[]{33507, 33458, 33460, 33454, 33462, 33463, 33463, 33459, 33423, 33423, 33460, 33459, 33454, 33424, 33508, 33412, 33457, 33462, 33426, 33425, 33412, 33470, 33455, 33457, 33457, 33408, 33413, 33465, 33466, 33460, 33428, 33516, 33413, 33460, 33468, 33461, 33454, 33455, 33461, 33462, 33457, 33426, 33428, 33457, 33460, 33459, 33457, 33464, 33428, 33430, 33465, 33463, 33463, 33457, 33461, 33465, 33457, 33463, 33458, 33452, 33462, 33462, 33454, 33422, 33431, 33462, 33457, 33455, 33451, 33454, 33462, 33460, 33423, 33423, 33459, 33467, 33459, 33456, 33428, 33431, 33460};
        int i5 = i2 + 119;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    static void component3() {
        copydefault = new char[]{8959, 51589, 62480, 57523, 36645, 48062, 42564, 21123, 31065, 26096, 4130, 15561, 11152, 54784, 49819, 59680, 38333, 32808, 44632, 17721, 30858, 27651, 901, 3095, 59245, 56056, 52827, 41421, 38230, 34988, 31851, 22463, 19227, 16020, 4703, 1355, 63716, 60516, 51140, 47952, 44762, 33336, 30112, 26886, 23687, 12298, 11152, 7919, 62079, 46886, 23644, 25033, 30058, 6908, 11879, 13213, 51034, 60544, 61481, 34299, 43283, 48706, 17349, 22357, 31993, GMTDateParser.ZONE, 5569, 14609, 52871, 53760, 59317, 3141, 59191, 55983, 52764, 41371, 38152, 35067, 31869, 22509, 19293, 16092};
        component1 = -2281194035509795069L;
        component2 = 6122626269086826629L;
        component3 = 1386857713;
        component4 = (char) 50417;
    }
}
