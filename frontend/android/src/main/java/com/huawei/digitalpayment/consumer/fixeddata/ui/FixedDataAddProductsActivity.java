package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.alibaba.ariver.commonability.device.jsapi.wifi.sdk.WifiConnectorCompat;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePackageDetail;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentOperation;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState;
import com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity;
import com.huawei.digitalpayment.consumer.fixeddata.ui.screen.AddProductsScreenKt;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel;
import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import com.huawei.digitalpayment.consumer.remoteconfig.models.FixedDataFamilyShareConfig;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelNotification;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;
import kotlin.text.Typography;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.math.Primes;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataAddProductsActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "fixedDataViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "getFixedDataViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "setFixedDataViewModel", "(Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;)V", "remoteConfig", "Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "getRemoteConfig", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "setRemoteConfig", "(Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "ConsumerSfcFixedData_release", "uiState", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FixedDataUiState;", "fibreAccountState", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState;", "selectedAddons", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePackageDetail;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataAddProductsActivity extends Hilt_FixedDataAddProductsActivity {
    public static final int $stable = 8;
    private static long ShareDataUIState;
    private static long component2;
    private static char[] component3;
    private static int copy;
    private static int copydefault;

    @Inject
    public FixedDataViewModel fixedDataViewModel;

    @Inject
    public RemoteConfig remoteConfig;
    private static final byte[] $$c = {69, -38, -90, 81};
    private static final int $$f = 244;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {80, 83, -21, -55, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -63, Ascii.SO, 0, -61, 60, Ascii.SI, -18, Ascii.CAN, -16, 6, -57, 56, 7, 0, 4, 13, -17, 13, 6, -13, Ascii.SUB, -10, -6, Ascii.VT, 8, PSSSigner.TRAILER_IMPLICIT, TarHeader.LF_CONTIG, Ascii.SO, 1, 7, 4, -6, -6, Ascii.SI, -66, 71, -11, -1, 20, -10, -57, TarHeader.LF_FIFO, Ascii.NAK, 6, -21, Ascii.NAK, -5, -8, 10, -5, Ascii.DLE, -67, TarHeader.LF_FIFO, Ascii.FF, -1, Ascii.SI, -15, -1, Ascii.NAK, -5, -8, 10, -5, Ascii.DLE, -67, Ascii.SYN, Ascii.FF, Ascii.US, Ascii.SI, -15, -33, TarHeader.LF_DIR, -5, -8, 10, -5, Ascii.DLE, -30, Ascii.DC2, 17, -11, 2, Ascii.VT, -33, 43, -78, 65, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -63, -13, 65, Ascii.SO, 3, Ascii.VT, -19, 3, 3, -3, Ascii.SYN, -7, 10, Ascii.SO, 0, 5, 1, 1, -7, Ascii.VT, 8, -65, Ascii.SO, 0, -61, 59, 10, 2, -6, 7, -5, -53, 78, 0, -13, 7, -5, -55, 68, -10, 4, -48, -1, 8, -7, 56, 3, 0, Ascii.SO, -9, 3, Ascii.SI, -66, Ascii.SYN, 33, 19, -13, Ascii.SO, -9, 3, -22, Ascii.SUB, 17, -17, 5, -1, Ascii.NAK, -17, Ascii.ETB, -5, 19, -11, -31, Ascii.US, Ascii.NAK, -17, -10, -10, Ascii.FF, 35, -17, Ascii.NAK, -13};
    private static final int $$h = 247;
    private static final byte[] $$a = {87, -2, Ascii.VT, -41, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 173;
    private static int getAsAtTimestamp = 0;
    private static int equals = 1;
    private static int component1 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(int r5, byte r6, int r7) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r7 = 122 - r7
            int r5 = r5 * 2
            int r5 = r5 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r3 = r1[r5]
        L25:
            int r7 = r7 + r3
            int r5 = r5 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.$$i(int, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.$$a
            int r1 = r6 + 4
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r7 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r8 = r8 + r3
            int r8 = r8 + (-8)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.c(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 16
            int r6 = r6 + 83
            int r8 = r8 + 4
            int r7 = 108 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.$$g
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2b
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r8 = r8 + r6
            int r6 = r8 + (-2)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.e(short, int, short, java.lang.Object[]):void");
    }

    public final FixedDataViewModel getFixedDataViewModel() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 123;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        FixedDataViewModel fixedDataViewModel = this.fixedDataViewModel;
        if (fixedDataViewModel != null) {
            int i5 = i3 + 37;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            return fixedDataViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i7 = getAsAtTimestamp + 53;
        equals = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final void setFixedDataViewModel(FixedDataViewModel fixedDataViewModel) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 107;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
        this.fixedDataViewModel = fixedDataViewModel;
        int i4 = getAsAtTimestamp + 65;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final RemoteConfig getRemoteConfig() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 119;
        getAsAtTimestamp = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        RemoteConfig remoteConfig = this.remoteConfig;
        if (remoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i4 = getAsAtTimestamp + 55;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        int i6 = i2 + 57;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            return remoteConfig;
        }
        obj.hashCode();
        throw null;
    }

    public final void setRemoteConfig(RemoteConfig remoteConfig) {
        int i = 2 % 2;
        int i2 = equals + 85;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(remoteConfig, "");
        this.remoteConfig = remoteConfig;
        int i4 = getAsAtTimestamp + 13;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int getRequestBeneficiariesState = 1;
        final PaymentOperation component1;
        final FibrePackageDetail component2;
        final String copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 0;
            private static int getAsAtTimestamp = 1;
            final String component1;
            final PaymentOperation component2;
            final FixedDataAddProductsActivity component3;
            final FibrePackageDetail copydefault;

            public static Object component1(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
                int i7 = ~i5;
                int i8 = ~i6;
                int i9 = ~(i7 | i8);
                int i10 = ~(i7 | i6);
                int i11 = ~i2;
                int i12 = (~(i8 | i11 | i5)) | i10;
                int i13 = (~(i6 | i11)) | (~(i7 | i11));
                int i14 = i5 + i2 + i3 + (1941422536 * i4) + ((-555707305) * i);
                int i15 = i14 * i14;
                int i16 = (i5 * (-2131549542)) + 177471488 + ((-2131549542) * i2) + (i9 * (-207299225)) + (i12 * (-207299225)) + ((-207299225) * i13) + (1956118528 * i3) + ((-1363148800) * i4) + (2141716480 * i) + ((-573308928) * i15);
                int i17 = ((i5 * 487360618) - 1291405921) + (i2 * 487360618) + (i9 * 543) + (i12 * 543) + (i13 * 543) + (i3 * 487361161) + (i4 * (-1188264952)) + (i * 624576655) + (i15 * (-25952256));
                return i16 + ((i17 * i17) * 74186752) != 1 ? component2(objArr) : component3(objArr);
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                Unit unit;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 113;
                getAsAtTimestamp = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 == 0) {
                    component3(composer2, num2.intValue());
                    unit = Unit.INSTANCE;
                    int i3 = 39 / 0;
                } else {
                    component3(composer2, num2.intValue());
                    unit = Unit.INSTANCE;
                }
                int i4 = ShareDataUIState + 33;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static final kotlin.Unit component3(com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity r17, androidx.compose.runtime.MutableState r18, androidx.compose.runtime.State r19, androidx.activity.result.ActivityResult r20) {
                /*
                    Method dump skipped, instruction units count: 302
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.component2.AnonymousClass2.component3(com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity, androidx.compose.runtime.MutableState, androidx.compose.runtime.State, androidx.activity.result.ActivityResult):kotlin.Unit");
            }

            public final void component3(Composer composer, int i) {
                int i2 = 2 % 2;
                if ((i & 11) == 2) {
                    int i3 = ShareDataUIState + 19;
                    getAsAtTimestamp = i3 % 128;
                    int i4 = i3 % 2;
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    } else {
                        int i5 = ShareDataUIState + 41;
                        getAsAtTimestamp = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
                State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(this.component3.getFixedDataViewModel().getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
                final State stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(this.component3.getFixedDataViewModel().getAccountState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
                final State stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(this.component3.getFixedDataViewModel().getSelectedAddons(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
                composer.startReplaceGroup(-1746853669);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    int i7 = getAsAtTimestamp + 19;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                final MutableState mutableState = (MutableState) objRememberedValue;
                composer.endReplaceGroup();
                FixedDataFamilyShareConfig fixedDataFamilyShareConfig = this.component3.getRemoteConfig().getFixedDataFamilyShareConfig();
                boolean zIsEnabled = fixedDataFamilyShareConfig != null ? fixedDataFamilyShareConfig.isEnabled() : false;
                ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
                final FixedDataAddProductsActivity fixedDataAddProductsActivity = this.component3;
                final ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, new Function1() {
                    private static int component1 = 0;
                    private static int component2 = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        Unit unitComponent1;
                        int i9 = 2 % 2;
                        int i10 = component1 + 51;
                        component2 = i10 % 128;
                        if (i10 % 2 == 0) {
                            unitComponent1 = FixedDataAddProductsActivity.component2.AnonymousClass2.component1(fixedDataAddProductsActivity, mutableState, stateCollectAsStateWithLifecycle3, (ActivityResult) obj);
                            int i11 = 57 / 0;
                        } else {
                            unitComponent1 = FixedDataAddProductsActivity.component2.AnonymousClass2.component1(fixedDataAddProductsActivity, mutableState, stateCollectAsStateWithLifecycle3, (ActivityResult) obj);
                        }
                        int i12 = component1 + 79;
                        component2 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 96 / 0;
                        }
                        return unitComponent1;
                    }
                }, composer, 8);
                FixedDataUiState fixedDataUiStateComponent2 = component2((State<FixedDataUiState>) stateCollectAsStateWithLifecycle);
                FibrePackageDetail fibrePackageDetail = this.copydefault;
                int iComponent2 = WifiConnectorCompat.component2();
                List list = (List) component1(WifiConnectorCompat.component2(), -431100674, WifiConnectorCompat.component2(), WifiConnectorCompat.component2(), 431100674, new Object[]{stateCollectAsStateWithLifecycle3}, iComponent2);
                final FixedDataAddProductsActivity fixedDataAddProductsActivity2 = this.component3;
                Function1 function1 = new Function1() {
                    private static int ShareDataUIState = 1;
                    private static int component2;

                    @Override
                    public final Object invoke(Object obj) {
                        int i9 = 2 % 2;
                        int i10 = component2 + 25;
                        ShareDataUIState = i10 % 128;
                        int i11 = i10 % 2;
                        FixedDataAddProductsActivity fixedDataAddProductsActivity3 = fixedDataAddProductsActivity2;
                        List list2 = (List) obj;
                        if (i11 != 0) {
                            return FixedDataAddProductsActivity.component2.AnonymousClass2.copydefault(fixedDataAddProductsActivity3, list2);
                        }
                        FixedDataAddProductsActivity.component2.AnonymousClass2.copydefault(fixedDataAddProductsActivity3, list2);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                final FixedDataAddProductsActivity fixedDataAddProductsActivity3 = this.component3;
                Function0 function0 = new Function0() {
                    private static int component2 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = component2 + 125;
                        copydefault = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitComponent3 = FixedDataAddProductsActivity.component2.AnonymousClass2.component3(fixedDataAddProductsActivity3);
                        int i12 = copydefault + 99;
                        component2 = i12 % 128;
                        int i13 = i12 % 2;
                        return unitComponent3;
                    }
                };
                final FixedDataAddProductsActivity fixedDataAddProductsActivity4 = this.component3;
                final FibrePackageDetail fibrePackageDetail2 = this.copydefault;
                Function0 function02 = new Function0() {
                    private static int ShareDataUIState = 1;
                    private static int component2;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = component2 + 55;
                        ShareDataUIState = i10 % 128;
                        int i11 = i10 % 2;
                        FixedDataAddProductsActivity fixedDataAddProductsActivity5 = fixedDataAddProductsActivity4;
                        if (i11 != 0) {
                            return FixedDataAddProductsActivity.component2.AnonymousClass2.copydefault(fixedDataAddProductsActivity5, managedActivityResultLauncherRememberLauncherForActivityResult, fibrePackageDetail2);
                        }
                        FixedDataAddProductsActivity.component2.AnonymousClass2.copydefault(fixedDataAddProductsActivity5, managedActivityResultLauncherRememberLauncherForActivityResult, fibrePackageDetail2);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                };
                final PaymentOperation paymentOperation = this.component2;
                final FixedDataAddProductsActivity fixedDataAddProductsActivity5 = this.component3;
                final FibrePackageDetail fibrePackageDetail3 = this.copydefault;
                final String str = this.component1;
                AddProductsScreenKt.AddProductsScreen(fixedDataUiStateComponent2, fibrePackageDetail, list, zIsEnabled, function1, function0, function02, new Function0() {
                    private static int ShareDataUIState = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = component3 + 59;
                        ShareDataUIState = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitComponent3 = FixedDataAddProductsActivity.component2.AnonymousClass2.component3(mutableState, paymentOperation, fixedDataAddProductsActivity5, stateCollectAsStateWithLifecycle2, fibrePackageDetail3, str);
                        int i12 = component3 + 63;
                        ShareDataUIState = i12 % 128;
                        int i13 = i12 % 2;
                        return unitComponent3;
                    }
                }, composer, 584, 0);
            }

            private static final Unit component2(FixedDataAddProductsActivity fixedDataAddProductsActivity, List list) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 43;
                getAsAtTimestamp = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fixedDataAddProductsActivity, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    fixedDataAddProductsActivity.getFixedDataViewModel().updateSelectedAddons(list);
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(fixedDataAddProductsActivity, "");
                Intrinsics.checkNotNullParameter(list, "");
                fixedDataAddProductsActivity.getFixedDataViewModel().updateSelectedAddons(list);
                int i3 = 53 / 0;
                return Unit.INSTANCE;
            }

            private static Object component3(Object[] objArr) {
                FixedDataAddProductsActivity fixedDataAddProductsActivity = (FixedDataAddProductsActivity) objArr[0];
                int i = 2 % 2;
                int i2 = getAsAtTimestamp + 87;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataAddProductsActivity, "");
                fixedDataAddProductsActivity.getOnBackPressedDispatcher().onBackPressed();
                Unit unit = Unit.INSTANCE;
                int i4 = getAsAtTimestamp + 103;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 93 / 0;
                }
                return unit;
            }

            private static final Unit ShareDataUIState(FixedDataAddProductsActivity fixedDataAddProductsActivity, ManagedActivityResultLauncher managedActivityResultLauncher, FibrePackageDetail fibrePackageDetail) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataAddProductsActivity, "");
                Intrinsics.checkNotNullParameter(managedActivityResultLauncher, "");
                Intent intent = new Intent(fixedDataAddProductsActivity, (Class<?>) FixedDataFamilyShareActivity.class);
                intent.putExtra(FixedDataNavKeys.EXTRA_SELECTED_PACKAGE, fibrePackageDetail);
                managedActivityResultLauncher.launch(intent);
                Unit unit = Unit.INSTANCE;
                int i2 = ShareDataUIState + 89;
                getAsAtTimestamp = i2 % 128;
                if (i2 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static final kotlin.Unit ShareDataUIState(androidx.compose.runtime.MutableState r3, com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentOperation r4, com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity r5, androidx.compose.runtime.State r6, com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePackageDetail r7, java.lang.String r8) {
                /*
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.component2.AnonymousClass2.getAsAtTimestamp
                    int r1 = r1 + 109
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.component2.AnonymousClass2.ShareDataUIState = r2
                    int r1 = r1 % r0
                    java.lang.String r1 = ""
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r1)
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
                    java.lang.Object r3 = r3.getValue()
                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                    boolean r3 = r3.booleanValue()
                    r3 = r3 ^ 1
                    if (r3 == 0) goto L3a
                    if (r4 != 0) goto L48
                    com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState r3 = ShareDataUIState(r6)
                    com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState$Active r4 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState.Active.INSTANCE
                    boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
                    if (r3 == 0) goto L37
                    goto L3a
                L37:
                    com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentOperation$BuyPlan r3 = com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentOperation.BuyPlan.INSTANCE
                    goto L3c
                L3a:
                    com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentOperation$ChangePlan r3 = com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentOperation.ChangePlan.INSTANCE
                L3c:
                    r4 = r3
                    com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentOperation r4 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentOperation) r4
                    int r3 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.component2.AnonymousClass2.getAsAtTimestamp
                    int r3 = r3 + 41
                    int r6 = r3 % 128
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.component2.AnonymousClass2.ShareDataUIState = r6
                    int r3 = r3 % r0
                L48:
                    android.os.Bundle r3 = new android.os.Bundle
                    r3.<init>()
                    java.lang.String r6 = "extra_selected_package"
                    android.os.Parcelable r7 = (android.os.Parcelable) r7
                    r3.putParcelable(r6, r7)
                    java.lang.String r6 = "extra_payment_action"
                    android.os.Parcelable r4 = (android.os.Parcelable) r4
                    r3.putParcelable(r6, r4)
                    java.lang.String r4 = "extra_product_type"
                    r3.putString(r4, r8)
                    android.app.Activity r5 = (android.app.Activity) r5
                    java.lang.String r4 = "/sfcModule/fixedDataPaymentOptions"
                    com.huawei.arouter.RouteUtils.routeWithExecute(r5, r4, r3)
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.component2.AnonymousClass2.ShareDataUIState(androidx.compose.runtime.MutableState, com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentOperation, com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity, androidx.compose.runtime.State, com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePackageDetail, java.lang.String):kotlin.Unit");
            }

            private static final FixedDataUiState component2(State<FixedDataUiState> state) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 1;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                FixedDataUiState value = state.getValue();
                if (i3 == 0) {
                    throw null;
                }
                int i4 = getAsAtTimestamp + 81;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 9 / 0;
                }
                return value;
            }

            private static final AccountState ShareDataUIState(State<? extends AccountState> state) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 89;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                AccountState value = state.getValue();
                if (i3 != 0) {
                    return value;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static Object component2(Object[] objArr) {
                State state = (State) objArr[0];
                int i = 2 % 2;
                int i2 = ShareDataUIState + 9;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                List list = (List) state.getValue();
                int i4 = ShareDataUIState + 121;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                return list;
            }

            public static Unit component1(FixedDataAddProductsActivity fixedDataAddProductsActivity, MutableState mutableState, State state, ActivityResult activityResult) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 25;
                getAsAtTimestamp = i2 % 128;
                if (i2 % 2 == 0) {
                    component3(fixedDataAddProductsActivity, mutableState, state, activityResult);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitComponent3 = component3(fixedDataAddProductsActivity, mutableState, state, activityResult);
                int i3 = ShareDataUIState + 75;
                getAsAtTimestamp = i3 % 128;
                int i4 = i3 % 2;
                return unitComponent3;
            }

            public static Unit component3(MutableState mutableState, PaymentOperation paymentOperation, FixedDataAddProductsActivity fixedDataAddProductsActivity, State state, FibrePackageDetail fibrePackageDetail, String str) {
                int i = 2 % 2;
                int i2 = getAsAtTimestamp + 57;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(mutableState, paymentOperation, fixedDataAddProductsActivity, state, fibrePackageDetail, str);
                if (i3 != 0) {
                    int i4 = 69 / 0;
                }
                return unitShareDataUIState;
            }

            public static Unit copydefault(FixedDataAddProductsActivity fixedDataAddProductsActivity, List list) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 25;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent2 = component2(fixedDataAddProductsActivity, list);
                if (i3 == 0) {
                    int i4 = 65 / 0;
                }
                int i5 = ShareDataUIState + 105;
                getAsAtTimestamp = i5 % 128;
                if (i5 % 2 != 0) {
                    return unitComponent2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit copydefault(FixedDataAddProductsActivity fixedDataAddProductsActivity, ManagedActivityResultLauncher managedActivityResultLauncher, FibrePackageDetail fibrePackageDetail) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 89;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(fixedDataAddProductsActivity, managedActivityResultLauncher, fibrePackageDetail);
                int i4 = getAsAtTimestamp + 85;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitShareDataUIState;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component3(FixedDataAddProductsActivity fixedDataAddProductsActivity) {
                int i = 2 % 2;
                int i2 = getAsAtTimestamp + 13;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                int iComponent2 = WifiConnectorCompat.component2();
                int iComponent22 = WifiConnectorCompat.component2();
                int iComponent23 = WifiConnectorCompat.component2();
                Unit unit = (Unit) component1(WifiConnectorCompat.component2(), 1910494122, iComponent22, iComponent23, -1910494121, new Object[]{fixedDataAddProductsActivity}, iComponent2);
                int i4 = getAsAtTimestamp + 123;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            AnonymousClass2(FixedDataAddProductsActivity fixedDataAddProductsActivity, FibrePackageDetail fibrePackageDetail, PaymentOperation paymentOperation, String str) {
                this.component3 = fixedDataAddProductsActivity;
                this.copydefault = fibrePackageDetail;
                this.component2 = paymentOperation;
                this.component1 = str;
            }

            private static final List<FibrePackageDetail> component1(State<? extends List<FibrePackageDetail>> state) {
                int iComponent2 = WifiConnectorCompat.component2();
                int iComponent22 = WifiConnectorCompat.component2();
                int iComponent23 = WifiConnectorCompat.component2();
                return (List) component1(WifiConnectorCompat.component2(), -431100674, iComponent22, iComponent23, 431100674, new Object[]{state}, iComponent2);
            }

            private static final Unit component2(FixedDataAddProductsActivity fixedDataAddProductsActivity) {
                int iComponent2 = WifiConnectorCompat.component2();
                int iComponent22 = WifiConnectorCompat.component2();
                int iComponent23 = WifiConnectorCompat.component2();
                return (Unit) component1(WifiConnectorCompat.component2(), 1910494122, iComponent22, iComponent23, -1910494121, new Object[]{fixedDataAddProductsActivity}, iComponent2);
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 125;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                int i4 = 80 / 0;
            }
            return unit;
        }

        public final void ShareDataUIState(Composer composer, int i) {
            int i2;
            int i3 = 2 % 2;
            int i4 = ShareDataUIState + 43;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                i2 = getRequestBeneficiariesState + 57;
            } else {
                OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1983053111, true, new AnonymousClass2(FixedDataAddProductsActivity.this, this.component2, this.component1, this.copydefault), composer, 54), composer, 1572864, 63);
                i2 = getRequestBeneficiariesState + 99;
            }
            ShareDataUIState = i2 % 128;
            int i6 = i2 % 2;
        }

        component2(FibrePackageDetail fibrePackageDetail, PaymentOperation paymentOperation, String str) {
            this.component2 = fibrePackageDetail;
            this.component1 = paymentOperation;
            this.copydefault = str;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3266, 32 - ImageFormat.getBitsPerPixel(0), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 60268), -834797019, false, $$i(b2, b3, (byte) (b3 | 20)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component2 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - TextUtils.indexOf("", "", 0), View.getDefaultSize(0, 0) + 34, (char) (Drawable.resolveOpacity(0, 0) + 60373), -1969106284, false, $$i(b4, b5, (byte) (b5 | 17)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i4 = $10 + 89;
                $11 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        int i6 = $10 + 65;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            try {
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - View.resolveSizeAndState(0, 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 35, (char) (TextUtils.indexOf("", "", 0) + 60373), -1969106284, false, $$i(b6, b7, (byte) (b7 | 17)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    private static void d(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i5 = $11 + 63;
            $10 = i5 % 128;
            int i6 = i5 % i3;
            int i7 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component3[i + i7])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - Color.alpha(0), (Process.myTid() >> 22) + 34, (char) TextUtils.getOffsetAfter("", 0), 1159210934, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((-16773608) - Color.rgb(0, 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 29, (char) (7170 - TextUtils.lastIndexOf("", '0', 0)), 1951385784, false, $$i(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {cancelnotification, cancelnotification};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 4013, TextUtils.lastIndexOf("", '0') + 25, (char) (27761 - (ViewConfiguration.getTapTimeout() >> 16)), -1529629956, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        int i8 = $10 + 43;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        i3 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
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
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        int i10 = $11 + 43;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        while (cancelnotification.copydefault < i2) {
            int i12 = $11 + 121;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 4013, 24 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27760), -1529629956, false, $$i(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void a(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        int i5 = $10 + 9;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (ViewConfiguration.getLongPressTimeout() >> 16), 37 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (26860 - KeyEvent.keyCodeFromString("")), 2015799920, false, $$i(b2, b3, (byte) (b3 | 57)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7405, TextUtils.lastIndexOf("", '0', 0, 0) + 17, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i8 = $10 + 101;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 7406, 15 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (Process.myTid() >> 22), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x24f6  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x24f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0287  */
    /* JADX WARN: Type inference failed for: r10v70, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v359, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    protected void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        if (isFinishing()) {
            int i2 = getAsAtTimestamp + 9;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                getFixedDataViewModel().updateSelectedAddons(CollectionsKt.emptyList());
                throw null;
            }
            getFixedDataViewModel().updateSelectedAddons(CollectionsKt.emptyList());
        }
        int i3 = equals + 117;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 16 / 0;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i2 = equals + 43;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, CharUtils.CR, CharUtils.CR, 65483, 65502, 0, 17, 6, 19}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 20, false, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).length() + 25, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + Primes.SMALL_FACTOR_LIMIT, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new char[]{65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(22) - 97, true, KeyEvent.getDeadChar(0, 0) + 18, (ViewConfiguration.getTouchSlop() >> 8) + 218, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = equals + 43;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i5 = getAsAtTimestamp + 27;
            equals = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 6618, KeyEvent.getDeadChar(0, 0) + 42, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 6562, 56 - TextUtils.getCapsMode("", 0, 0), (char) Color.red(0), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i7 = getAsAtTimestamp + 95;
                equals = i7 % 128;
                int i8 = i7 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0c39 A[Catch: all -> 0x048b, TryCatch #54 {all -> 0x048b, blocks: (B:529:0x1df4, B:531:0x1dfa, B:532:0x1e22, B:775:0x33d5, B:777:0x33db, B:778:0x3408, B:812:0x3719, B:814:0x371f, B:815:0x374c, B:792:0x3552, B:794:0x3575, B:795:0x35ca, B:741:0x3098, B:743:0x309e, B:744:0x30c5, B:628:0x297f, B:630:0x2985, B:631:0x29aa, B:633:0x29e4, B:634:0x2a2f, B:599:0x261e, B:601:0x2633, B:602:0x2664, B:604:0x2698, B:605:0x2712, B:576:0x22ac, B:578:0x22b2, B:579:0x22e2, B:581:0x231c, B:583:0x2367, B:546:0x1ff6, B:548:0x200b, B:549:0x2039, B:395:0x1763, B:397:0x1769, B:398:0x1795, B:308:0x11fb, B:310:0x1201, B:311:0x122c, B:195:0x0c33, B:197:0x0c39, B:198:0x0c63, B:74:0x0660, B:76:0x0666, B:77:0x068f, B:23:0x023c, B:25:0x0242, B:26:0x026c, B:28:0x03fa, B:30:0x042c, B:31:0x0485), top: B:940:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0cee A[Catch: all -> 0x1137, TryCatch #9 {all -> 0x1137, blocks: (B:202:0x0ce8, B:204:0x0cee, B:205:0x0d34, B:209:0x0d4e, B:211:0x0d54, B:212:0x0d95, B:277:0x1105, B:279:0x110b, B:280:0x110c, B:282:0x110e, B:284:0x1115, B:285:0x1116, B:213:0x0da2, B:289:0x111f, B:291:0x1125, B:292:0x1126, B:295:0x112b, B:297:0x1131, B:298:0x1132, B:273:0x1083, B:268:0x104f, B:270:0x1055, B:271:0x107b), top: B:857:0x0ce8, inners: #48, #55 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0d41  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0da2 A[Catch: all -> 0x1137, TRY_LEAVE, TryCatch #9 {all -> 0x1137, blocks: (B:202:0x0ce8, B:204:0x0cee, B:205:0x0d34, B:209:0x0d4e, B:211:0x0d54, B:212:0x0d95, B:277:0x1105, B:279:0x110b, B:280:0x110c, B:282:0x110e, B:284:0x1115, B:285:0x1116, B:213:0x0da2, B:289:0x111f, B:291:0x1125, B:292:0x1126, B:295:0x112b, B:297:0x1131, B:298:0x1132, B:273:0x1083, B:268:0x104f, B:270:0x1055, B:271:0x107b), top: B:857:0x0ce8, inners: #48, #55 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0fdc  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0fe5 A[Catch: all -> 0x1133, TryCatch #6 {all -> 0x1133, blocks: (B:248:0x0fcc, B:252:0x0fdf, B:254:0x0fe5, B:257:0x1001, B:215:0x0db0, B:233:0x0ea4, B:239:0x0ef4, B:244:0x0f6a, B:247:0x0fc4), top: B:851:0x0db0 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x1201 A[Catch: all -> 0x048b, TryCatch #54 {all -> 0x048b, blocks: (B:529:0x1df4, B:531:0x1dfa, B:532:0x1e22, B:775:0x33d5, B:777:0x33db, B:778:0x3408, B:812:0x3719, B:814:0x371f, B:815:0x374c, B:792:0x3552, B:794:0x3575, B:795:0x35ca, B:741:0x3098, B:743:0x309e, B:744:0x30c5, B:628:0x297f, B:630:0x2985, B:631:0x29aa, B:633:0x29e4, B:634:0x2a2f, B:599:0x261e, B:601:0x2633, B:602:0x2664, B:604:0x2698, B:605:0x2712, B:576:0x22ac, B:578:0x22b2, B:579:0x22e2, B:581:0x231c, B:583:0x2367, B:546:0x1ff6, B:548:0x200b, B:549:0x2039, B:395:0x1763, B:397:0x1769, B:398:0x1795, B:308:0x11fb, B:310:0x1201, B:311:0x122c, B:195:0x0c33, B:197:0x0c39, B:198:0x0c63, B:74:0x0660, B:76:0x0666, B:77:0x068f, B:23:0x023c, B:25:0x0242, B:26:0x026c, B:28:0x03fa, B:30:0x042c, B:31:0x0485), top: B:940:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x130e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x13d3 A[Catch: all -> 0x1697, TRY_ENTER, TRY_LEAVE, TryCatch #60 {all -> 0x1697, blocks: (B:315:0x12b2, B:321:0x1301, B:337:0x13d3), top: B:951:0x12b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x1597  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x1769 A[Catch: all -> 0x048b, TryCatch #54 {all -> 0x048b, blocks: (B:529:0x1df4, B:531:0x1dfa, B:532:0x1e22, B:775:0x33d5, B:777:0x33db, B:778:0x3408, B:812:0x3719, B:814:0x371f, B:815:0x374c, B:792:0x3552, B:794:0x3575, B:795:0x35ca, B:741:0x3098, B:743:0x309e, B:744:0x30c5, B:628:0x297f, B:630:0x2985, B:631:0x29aa, B:633:0x29e4, B:634:0x2a2f, B:599:0x261e, B:601:0x2633, B:602:0x2664, B:604:0x2698, B:605:0x2712, B:576:0x22ac, B:578:0x22b2, B:579:0x22e2, B:581:0x231c, B:583:0x2367, B:546:0x1ff6, B:548:0x200b, B:549:0x2039, B:395:0x1763, B:397:0x1769, B:398:0x1795, B:308:0x11fb, B:310:0x1201, B:311:0x122c, B:195:0x0c33, B:197:0x0c39, B:198:0x0c63, B:74:0x0660, B:76:0x0666, B:77:0x068f, B:23:0x023c, B:25:0x0242, B:26:0x026c, B:28:0x03fa, B:30:0x042c, B:31:0x0485), top: B:940:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x1872 A[Catch: all -> 0x1d89, PHI: r1 r4
  0x1872: PHI (r1v276 java.lang.Object) = (r1v269 java.lang.Object), (r1v274 java.lang.Object) binds: [B:403:0x181d, B:404:0x181f] A[DONT_GENERATE, DONT_INLINE]
  0x1872: PHI (r4v120 ??) = (r4v334 ??), (r4v335 ??) binds: [B:403:0x181d, B:404:0x181f] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #51 {all -> 0x1d89, blocks: (B:402:0x1819, B:409:0x1872, B:413:0x18dc, B:435:0x1974), top: B:934:0x1819 }] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x1899  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x18ef  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x194e  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x1c2c A[Catch: all -> 0x1d65, TryCatch #27 {all -> 0x1d65, blocks: (B:467:0x1c22, B:468:0x1c26, B:470:0x1c2c, B:473:0x1c48, B:437:0x1982, B:454:0x1b01, B:457:0x1b4d, B:463:0x1bbe, B:466:0x1c1a), top: B:891:0x1982 }] */
    /* JADX WARN: Removed duplicated region for block: B:531:0x1dfa A[Catch: all -> 0x048b, TryCatch #54 {all -> 0x048b, blocks: (B:529:0x1df4, B:531:0x1dfa, B:532:0x1e22, B:775:0x33d5, B:777:0x33db, B:778:0x3408, B:812:0x3719, B:814:0x371f, B:815:0x374c, B:792:0x3552, B:794:0x3575, B:795:0x35ca, B:741:0x3098, B:743:0x309e, B:744:0x30c5, B:628:0x297f, B:630:0x2985, B:631:0x29aa, B:633:0x29e4, B:634:0x2a2f, B:599:0x261e, B:601:0x2633, B:602:0x2664, B:604:0x2698, B:605:0x2712, B:576:0x22ac, B:578:0x22b2, B:579:0x22e2, B:581:0x231c, B:583:0x2367, B:546:0x1ff6, B:548:0x200b, B:549:0x2039, B:395:0x1763, B:397:0x1769, B:398:0x1795, B:308:0x11fb, B:310:0x1201, B:311:0x122c, B:195:0x0c33, B:197:0x0c39, B:198:0x0c63, B:74:0x0660, B:76:0x0666, B:77:0x068f, B:23:0x023c, B:25:0x0242, B:26:0x026c, B:28:0x03fa, B:30:0x042c, B:31:0x0485), top: B:940:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x1eb0  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x1f03  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x1fd6  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x2175  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x2255  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x247b  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x24e6  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x253d  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x2600  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x2847  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x2942  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x2bcf A[Catch: all -> 0x2ba2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x2ba2, blocks: (B:639:0x2b5b, B:645:0x2bcf, B:650:0x2c32, B:652:0x2c38, B:653:0x2c7a, B:656:0x2c8b, B:658:0x2c8f, B:662:0x2c9b), top: B:841:0x2b5b }] */
    /* JADX WARN: Removed duplicated region for block: B:649:0x2c2f  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x2c87  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x2ed5 A[Catch: all -> 0x2ff5, TryCatch #38 {all -> 0x2ff5, blocks: (B:688:0x2ecb, B:689:0x2ecf, B:691:0x2ed5, B:694:0x2eed, B:697:0x2efa, B:699:0x2efd, B:711:0x2fe3, B:713:0x2fe9, B:714:0x2fea, B:716:0x2fec, B:718:0x2ff3, B:719:0x2ff4, B:666:0x2caf, B:678:0x2daf, B:680:0x2db5, B:681:0x2df9, B:683:0x2e23, B:684:0x2e68, B:686:0x2e7e, B:687:0x2ec5, B:723:0x2ff8, B:725:0x2fff, B:726:0x3000, B:728:0x3002, B:730:0x3009, B:731:0x300a, B:707:0x2f61, B:702:0x2f29, B:704:0x2f2f, B:705:0x2f59, B:673:0x2d13, B:675:0x2d32, B:676:0x2da3, B:668:0x2cc3, B:670:0x2cd8, B:671:0x2d0c), top: B:910:0x2caf, inners: #23, #32, #40, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:743:0x309e A[Catch: all -> 0x048b, TryCatch #54 {all -> 0x048b, blocks: (B:529:0x1df4, B:531:0x1dfa, B:532:0x1e22, B:775:0x33d5, B:777:0x33db, B:778:0x3408, B:812:0x3719, B:814:0x371f, B:815:0x374c, B:792:0x3552, B:794:0x3575, B:795:0x35ca, B:741:0x3098, B:743:0x309e, B:744:0x30c5, B:628:0x297f, B:630:0x2985, B:631:0x29aa, B:633:0x29e4, B:634:0x2a2f, B:599:0x261e, B:601:0x2633, B:602:0x2664, B:604:0x2698, B:605:0x2712, B:576:0x22ac, B:578:0x22b2, B:579:0x22e2, B:581:0x231c, B:583:0x2367, B:546:0x1ff6, B:548:0x200b, B:549:0x2039, B:395:0x1763, B:397:0x1769, B:398:0x1795, B:308:0x11fb, B:310:0x1201, B:311:0x122c, B:195:0x0c33, B:197:0x0c39, B:198:0x0c63, B:74:0x0660, B:76:0x0666, B:77:0x068f, B:23:0x023c, B:25:0x0242, B:26:0x026c, B:28:0x03fa, B:30:0x042c, B:31:0x0485), top: B:940:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:749:0x3154  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x31a4  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x31fc  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x33b5  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x3499  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x34e5  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x3534  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0203 A[PHI: r13
  0x0203: PHI (r13v166 char) = (r13v18 char), (r13v168 char) binds: [B:21:0x0237, B:5:0x0200] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:811:0x36fb  */
    /* JADX WARN: Removed duplicated region for block: B:841:0x2b5b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:899:0x181f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x020d A[PHI: r13
  0x020d: PHI (r13v18 char) = (r13v17 char), (r13v169 char) binds: [B:3:0x01f1, B:5:0x0200] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:917:0x12b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:983:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v104, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v111 */
    /* JADX WARN: Type inference failed for: r11v112 */
    /* JADX WARN: Type inference failed for: r11v113 */
    /* JADX WARN: Type inference failed for: r11v115 */
    /* JADX WARN: Type inference failed for: r11v136 */
    /* JADX WARN: Type inference failed for: r11v142 */
    /* JADX WARN: Type inference failed for: r11v143 */
    /* JADX WARN: Type inference failed for: r11v144 */
    /* JADX WARN: Type inference failed for: r11v147 */
    /* JADX WARN: Type inference failed for: r11v148 */
    /* JADX WARN: Type inference failed for: r11v155 */
    /* JADX WARN: Type inference failed for: r11v173 */
    /* JADX WARN: Type inference failed for: r11v174 */
    /* JADX WARN: Type inference failed for: r11v175 */
    /* JADX WARN: Type inference failed for: r11v176 */
    /* JADX WARN: Type inference failed for: r11v177 */
    /* JADX WARN: Type inference failed for: r11v178 */
    /* JADX WARN: Type inference failed for: r11v179 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r13v119 */
    /* JADX WARN: Type inference failed for: r13v120 */
    /* JADX WARN: Type inference failed for: r13v121 */
    /* JADX WARN: Type inference failed for: r13v122 */
    /* JADX WARN: Type inference failed for: r13v123 */
    /* JADX WARN: Type inference failed for: r13v124 */
    /* JADX WARN: Type inference failed for: r13v125 */
    /* JADX WARN: Type inference failed for: r13v127 */
    /* JADX WARN: Type inference failed for: r13v128 */
    /* JADX WARN: Type inference failed for: r13v129 */
    /* JADX WARN: Type inference failed for: r13v130 */
    /* JADX WARN: Type inference failed for: r13v131 */
    /* JADX WARN: Type inference failed for: r13v148, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v149 */
    /* JADX WARN: Type inference failed for: r13v153 */
    /* JADX WARN: Type inference failed for: r13v154 */
    /* JADX WARN: Type inference failed for: r13v155 */
    /* JADX WARN: Type inference failed for: r13v156 */
    /* JADX WARN: Type inference failed for: r13v158 */
    /* JADX WARN: Type inference failed for: r13v159 */
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
    /* JADX WARN: Type inference failed for: r13v183 */
    /* JADX WARN: Type inference failed for: r13v184 */
    /* JADX WARN: Type inference failed for: r13v185 */
    /* JADX WARN: Type inference failed for: r13v186 */
    /* JADX WARN: Type inference failed for: r13v187 */
    /* JADX WARN: Type inference failed for: r13v188 */
    /* JADX WARN: Type inference failed for: r13v189 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v64 */
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
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v71, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r1v220, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v563 */
    /* JADX WARN: Type inference failed for: r1v564 */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v510 */
    /* JADX WARN: Type inference failed for: r2v523 */
    /* JADX WARN: Type inference failed for: r2v524 */
    /* JADX WARN: Type inference failed for: r2v530, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v531 */
    /* JADX WARN: Type inference failed for: r2v532 */
    /* JADX WARN: Type inference failed for: r2v541 */
    /* JADX WARN: Type inference failed for: r2v565, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v568 */
    /* JADX WARN: Type inference failed for: r2v569 */
    /* JADX WARN: Type inference failed for: r2v570 */
    /* JADX WARN: Type inference failed for: r2v571 */
    /* JADX WARN: Type inference failed for: r2v588 */
    /* JADX WARN: Type inference failed for: r2v592 */
    /* JADX WARN: Type inference failed for: r2v679 */
    /* JADX WARN: Type inference failed for: r2v680 */
    /* JADX WARN: Type inference failed for: r2v681 */
    /* JADX WARN: Type inference failed for: r33v101 */
    /* JADX WARN: Type inference failed for: r33v103 */
    /* JADX WARN: Type inference failed for: r33v104 */
    /* JADX WARN: Type inference failed for: r33v105 */
    /* JADX WARN: Type inference failed for: r33v108 */
    /* JADX WARN: Type inference failed for: r33v109 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v110 */
    /* JADX WARN: Type inference failed for: r33v112 */
    /* JADX WARN: Type inference failed for: r33v113 */
    /* JADX WARN: Type inference failed for: r33v119 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v120 */
    /* JADX WARN: Type inference failed for: r33v121 */
    /* JADX WARN: Type inference failed for: r33v122 */
    /* JADX WARN: Type inference failed for: r33v123 */
    /* JADX WARN: Type inference failed for: r33v124 */
    /* JADX WARN: Type inference failed for: r33v125 */
    /* JADX WARN: Type inference failed for: r33v126 */
    /* JADX WARN: Type inference failed for: r33v127 */
    /* JADX WARN: Type inference failed for: r33v128 */
    /* JADX WARN: Type inference failed for: r33v129 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v130 */
    /* JADX WARN: Type inference failed for: r33v131 */
    /* JADX WARN: Type inference failed for: r33v132 */
    /* JADX WARN: Type inference failed for: r33v133 */
    /* JADX WARN: Type inference failed for: r33v136 */
    /* JADX WARN: Type inference failed for: r33v137 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v16 */
    /* JADX WARN: Type inference failed for: r33v17 */
    /* JADX WARN: Type inference failed for: r33v18 */
    /* JADX WARN: Type inference failed for: r33v19 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v20 */
    /* JADX WARN: Type inference failed for: r33v21 */
    /* JADX WARN: Type inference failed for: r33v25 */
    /* JADX WARN: Type inference failed for: r33v26 */
    /* JADX WARN: Type inference failed for: r33v40 */
    /* JADX WARN: Type inference failed for: r33v41 */
    /* JADX WARN: Type inference failed for: r33v42 */
    /* JADX WARN: Type inference failed for: r33v43 */
    /* JADX WARN: Type inference failed for: r33v44 */
    /* JADX WARN: Type inference failed for: r33v45 */
    /* JADX WARN: Type inference failed for: r33v47 */
    /* JADX WARN: Type inference failed for: r33v48 */
    /* JADX WARN: Type inference failed for: r33v53 */
    /* JADX WARN: Type inference failed for: r33v56 */
    /* JADX WARN: Type inference failed for: r33v57 */
    /* JADX WARN: Type inference failed for: r33v58 */
    /* JADX WARN: Type inference failed for: r33v60 */
    /* JADX WARN: Type inference failed for: r33v65 */
    /* JADX WARN: Type inference failed for: r33v69 */
    /* JADX WARN: Type inference failed for: r33v79 */
    /* JADX WARN: Type inference failed for: r33v80 */
    /* JADX WARN: Type inference failed for: r33v81 */
    /* JADX WARN: Type inference failed for: r33v84 */
    /* JADX WARN: Type inference failed for: r33v85 */
    /* JADX WARN: Type inference failed for: r33v86 */
    /* JADX WARN: Type inference failed for: r33v87 */
    /* JADX WARN: Type inference failed for: r33v89 */
    /* JADX WARN: Type inference failed for: r33v90 */
    /* JADX WARN: Type inference failed for: r33v91 */
    /* JADX WARN: Type inference failed for: r33v92 */
    /* JADX WARN: Type inference failed for: r34v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v24 */
    /* JADX WARN: Type inference failed for: r34v68 */
    /* JADX WARN: Type inference failed for: r34v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v651 */
    /* JADX WARN: Type inference failed for: r3v652 */
    /* JADX WARN: Type inference failed for: r3v653 */
    /* JADX WARN: Type inference failed for: r3v667 */
    /* JADX WARN: Type inference failed for: r3v668 */
    /* JADX WARN: Type inference failed for: r4v101 */
    /* JADX WARN: Type inference failed for: r4v104, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v105 */
    /* JADX WARN: Type inference failed for: r4v106 */
    /* JADX WARN: Type inference failed for: r4v107 */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v119 */
    /* JADX WARN: Type inference failed for: r4v120 */
    /* JADX WARN: Type inference failed for: r4v121 */
    /* JADX WARN: Type inference failed for: r4v122 */
    /* JADX WARN: Type inference failed for: r4v125, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v126 */
    /* JADX WARN: Type inference failed for: r4v127 */
    /* JADX WARN: Type inference failed for: r4v128 */
    /* JADX WARN: Type inference failed for: r4v129 */
    /* JADX WARN: Type inference failed for: r4v130 */
    /* JADX WARN: Type inference failed for: r4v191 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v332 */
    /* JADX WARN: Type inference failed for: r4v333 */
    /* JADX WARN: Type inference failed for: r4v334 */
    /* JADX WARN: Type inference failed for: r4v335 */
    /* JADX WARN: Type inference failed for: r4v336 */
    /* JADX WARN: Type inference failed for: r4v337 */
    /* JADX WARN: Type inference failed for: r4v338 */
    /* JADX WARN: Type inference failed for: r4v339 */
    /* JADX WARN: Type inference failed for: r4v340 */
    /* JADX WARN: Type inference failed for: r4v341 */
    /* JADX WARN: Type inference failed for: r4v342 */
    /* JADX WARN: Type inference failed for: r4v343 */
    /* JADX WARN: Type inference failed for: r4v344 */
    /* JADX WARN: Type inference failed for: r4v345 */
    /* JADX WARN: Type inference failed for: r4v346 */
    /* JADX WARN: Type inference failed for: r4v347 */
    /* JADX WARN: Type inference failed for: r4v348 */
    /* JADX WARN: Type inference failed for: r4v349 */
    /* JADX WARN: Type inference failed for: r4v350 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r4v93 */
    /* JADX WARN: Type inference failed for: r4v94 */
    /* JADX WARN: Type inference failed for: r6v324 */
    /* JADX WARN: Type inference failed for: r6v325 */
    /* JADX WARN: Type inference failed for: r6v326 */
    /* JADX WARN: Type inference failed for: r6v340 */
    /* JADX WARN: Type inference failed for: r6v343 */
    /* JADX WARN: Type inference failed for: r6v349 */
    /* JADX WARN: Type inference failed for: r6v374 */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v508 */
    /* JADX WARN: Type inference failed for: r7v509 */
    /* JADX WARN: Type inference failed for: r7v510 */
    /* JADX WARN: Type inference failed for: r7v521 */
    /* JADX WARN: Type inference failed for: r7v522 */
    /* JADX WARN: Type inference failed for: r8v230 */
    /* JADX WARN: Type inference failed for: r8v246 */
    /* JADX WARN: Type inference failed for: r8v302, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v303 */
    /* JADX WARN: Type inference failed for: r8v304 */
    /* JADX WARN: Type inference failed for: r8v305 */
    /* JADX WARN: Type inference failed for: r8v306 */
    /* JADX WARN: Type inference failed for: r8v308 */
    /* JADX WARN: Type inference failed for: r8v310 */
    /* JADX WARN: Type inference failed for: r8v339 */
    /* JADX WARN: Type inference failed for: r8v340 */
    /* JADX WARN: Type inference failed for: r8v52, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataAddProductsActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        copy = 1;
        component3();
        copydefault();
        int i = component1 + 43;
        copy = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 113;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getAsAtTimestamp + 33;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 117;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        component3 = new char[]{3093, 34211, 8047, 37238, 10998, 48289, 13899, 51223, 16835, 56213, 27932, 59116, 30887, 62051, 33843, 7652, 38839, 10560, 41746, 13529, 52871, 16473, 55791, 21422, 58738, 32626, 61681, 35463, 7232, 38423, 12239, 41373, 15187, 52478, 18156, 55403, 21048, 60407, 32159, 63305, 35144, 734, 38023, 11825, 42988, 14769, 45940, 17716, 57082, 20617, 59985, 31830, 62936, 36757, 295, 39657, 11434, 42597, 14385, 45511, 19328, 56650, 22303, 59603, 25218, 62562, 36343, 1969, 39216, 4882, 42187, 16013, 45135, 18960, 50123, 21835, 61217, 24810, 64180, 35957, 1589, 40920, 4512, 43853, 15632, 46800, 18534, 49701, 23541, 60815, 26481, 63770, 29387, 1153, 40532, 4155, 43458, 9000, 46340, 20217, 49331, 23165, 60422, 26073, 65445, 29011, 2844, 40102, 5739, 43047, 8686, 48018, 19811, 50946, 22726, 53908, 25691, 65031, 30617, 2403, 33588, 5369, 44727, 8262, 47678, 13270, 50591, 24390, 53535, 27305, 64629, 30332, 4015, 33264, 6926, 44325, 9950, 47240, 12887, 52218, 23968, 55141, 26934, 58051, 29871, 3650, 32790, 6608, 37787, 9536, 48867, 12451, 51786, 23613, 54783, 28554, 57674, 31493, 3208, 24207, 55097, 19957, 50156, 30828, 60987, 25809, 39565, 4953, 35087, 16262, 46198, 10813, 41209, 54953, 20350, 50477, 31706, 61832, 26179, 39965, 4803, 35701, 308, 47080, 11752, 41579, 55325, 20186, 50317, 32085, 62215, 27081, 40548, 5238, 35569, Typography.cent, 47469, 12126, 42455, 56204, 20547, 50715, 31923, 62835, 27442, 57839, 6056, 35949, 538, 47254, 11910, 42821, 56605, 21432, 51320, 32307, 62695, 27322, 58198, 6490, 36851, 1424, 47695, 12319, 42679, 57183, 21806, 52203, 16812, 63057, 27670, 58104, 6279, 37211, 2042, 48566, 12913, 43041, 57080, 21672, 52581, 17179, 63952, 28545, 58443, 6910, 37009, 2408, 48994, 13740, 43959, 8268, 22026, 52421, 17048, 64322, 29175, 59316, 7249, 37437, 2272, 48772, 14162, 44313, 9170, 22913, 52785, 17624, 64191, 29549, 59688, 8168, 38295, 2569, 32850};
        ShareDataUIState = -5686874727955659316L;
        int i5 = i3 + 95;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static void component3() {
        component2 = -391590812227383611L;
        copydefault = -890926359;
    }
}
