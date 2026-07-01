package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePackageDetail;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.PaymentOperation;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState;
import com.huawei.digitalpayment.consumer.fixeddata.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel;
import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataFamilyShareActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "fixedDataViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "getFixedDataViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "setFixedDataViewModel", "(Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;)V", "remoteConfig", "Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "getRemoteConfig", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "setRemoteConfig", "(Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;)V", "isEnterAnimationComplete", "Landroidx/compose/runtime/MutableState;", "", "onEnterAnimationComplete", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "ConsumerSfcFixedData_release", "enterAnimComplete", "uiState", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FixedDataUiState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataFamilyShareActivity extends Hilt_FixedDataFamilyShareActivity {
    public static final int $stable = 8;
    private static char ShareDataUIState;
    private static int component1;
    private static long component3;
    private static char[] copydefault;
    private static int getRequestBeneficiariesState;

    @Inject
    public FixedDataViewModel fixedDataViewModel;
    private final MutableState<Boolean> isEnterAnimationComplete = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    @Inject
    public RemoteConfig remoteConfig;
    private static final byte[] $$c = {TarHeader.LF_CHR, -113, 92, 4};
    private static final int $$f = 141;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {44, 39, Base64.padSymbol, Ascii.GS, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -61, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 4, -57, 75, -12, Ascii.VT, 1, Ascii.ETB, -3, 0, Ascii.DC2, 4, -57, 60, 7, 20, -4, 4, 13, Ascii.VT, Ascii.FF, 0, 7, -9, Ascii.SO, -57, 59, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, 5, -63, 58, Ascii.EM, 5, 6, 1, 5, Ascii.VT, -63, Ascii.FS, 35, 19, -1, 4, 19, -42, 57, 5, 6, 1, 5, -29, 47, -74, 6, 39, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, Ascii.FF, -6, 3, Ascii.NAK, -5, 0, -17, Ascii.ESC, Ascii.DC2, -5, 8, 3, -43, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -60, Ascii.DC2, 4, -57, 57, 17, 3, -1, 5, 7, 5, -45, 63, 17, -3, 19, -11, 19, -62, 65, 10, -6, Ascii.FF, 4, -49, 72, -2, 13, Ascii.VT, 1, -59, 79, -8, 1, 9, 4, Ascii.NAK, -64, 40, Ascii.RS, 13, Ascii.VT, 1, -39, TarHeader.LF_FIFO, 3, Ascii.SO, 2, -8, -9, Ascii.EM, 2, Ascii.CAN, -77, Ascii.NAK, Ascii.DC2, 4, -57, SignedBytes.MAX_POWER_OF_TWO, 19, -14, Ascii.FS, -12, 10, -53, 60, Ascii.VT, 4, 8, 17, -13, 17, 10, -9, Ascii.RS, -6, -2, Ascii.SI, Ascii.FF, -64, 59, Ascii.DC2, 5, Ascii.VT, 8, -2, -2, 19, -62, 79, -12, 3, Ascii.SUB, -7, 2, Ascii.CAN, -67, 65, Ascii.VT, Ascii.FF, -9, 19, -11, 8, Ascii.ETB, -5, Ascii.FF, 5, -58, 62, Ascii.NAK, -1, -5, Ascii.ETB, -5, Ascii.FF, 5, -58, 43, 39, -13, Ascii.ETB, 8, -30, Ascii.ETB, Ascii.RS, -79, Ascii.ETB, Ascii.DC2, 7, Ascii.SI, -15, 7, 7, 1, Ascii.SUB, -3, Ascii.SO};
    private static final int $$h = BERTags.FLAGS;
    private static final byte[] $$a = {79, Ascii.ETB, 89, Ascii.VT, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 117;
    private static int component4 = 0;
    private static int equals = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r6, int r7, int r8) {
        /*
            int r6 = r6 + 65
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r6 = r8
            r4 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.$$i(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.$$a
            int r1 = 28 - r6
            int r5 = r5 * 2
            int r5 = 103 - r5
            int r7 = 99 - r7
            byte[] r1 = new byte[r1]
            int r6 = 27 - r6
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
        L28:
            int r5 = r5 + r4
            int r5 = r5 + (-8)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.c(byte, int, int, java.lang.Object[]):void");
    }

    private static void e(int i, int i2, short s, Object[] objArr) {
        int i3 = (i2 * 2) + 99;
        byte[] bArr = $$g;
        int i4 = 243 - s;
        byte[] bArr2 = new byte[86 - i];
        int i5 = 85 - i;
        int i6 = -1;
        if (bArr == null) {
            i3 = (i3 + i4) - 6;
            i4++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4;
            i3 = (i3 + bArr[i4]) - 6;
            i4 = i8 + 1;
            i6 = i7;
        }
    }

    public static final MutableState access$isEnterAnimationComplete$p(FixedDataFamilyShareActivity fixedDataFamilyShareActivity) {
        int i = 2 % 2;
        int i2 = component4 + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        MutableState<Boolean> mutableState = fixedDataFamilyShareActivity.isEnterAnimationComplete;
        if (i3 != 0) {
            return mutableState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r2 = r2 + 19;
        com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.equals = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel getFixedDataViewModel() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.equals
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.component4 = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 == 0) goto L18
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r1 = r5.fixedDataViewModel
            r4 = 11
            int r4 = r4 / 0
            if (r1 == 0) goto L27
            goto L1c
        L18:
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel r1 = r5.fixedDataViewModel
            if (r1 == 0) goto L27
        L1c:
            int r2 = r2 + 19
            int r4 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.equals = r4
            int r2 = r2 % r0
            if (r2 == 0) goto L26
            return r1
        L26:
            throw r3
        L27:
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.getFixedDataViewModel():com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel");
    }

    public final void setFixedDataViewModel(FixedDataViewModel fixedDataViewModel) {
        int i = 2 % 2;
        int i2 = equals + 123;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
            this.fixedDataViewModel = fixedDataViewModel;
        } else {
            Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
            this.fixedDataViewModel = fixedDataViewModel;
            throw null;
        }
    }

    public final RemoteConfig getRemoteConfig() {
        int i = 2 % 2;
        RemoteConfig remoteConfig = this.remoteConfig;
        if (remoteConfig != null) {
            int i2 = equals + 125;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return remoteConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = equals + 17;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setRemoteConfig(RemoteConfig remoteConfig) {
        int i = 2 % 2;
        int i2 = component4 + 35;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(remoteConfig, "");
            this.remoteConfig = remoteConfig;
        } else {
            Intrinsics.checkNotNullParameter(remoteConfig, "");
            this.remoteConfig = remoteConfig;
            throw null;
        }
    }

    @Override
    public void onEnterAnimationComplete() {
        MutableState<Boolean> mutableState;
        boolean z;
        int i = 2 % 2;
        int i2 = equals + 51;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            super.onEnterAnimationComplete();
            mutableState = this.isEnterAnimationComplete;
            z = false;
        } else {
            super.onEnterAnimationComplete();
            mutableState = this.isEnterAnimationComplete;
            z = true;
        }
        mutableState.setValue(Boolean.valueOf(z));
        int i3 = equals + 25;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int component1 = 0;
        private static int component3 = 1;
        final boolean copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int component1 = 0;
            private static int component2 = 1;
            final boolean component3;
            final FixedDataFamilyShareActivity copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component1 + 121;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                copydefault(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void copydefault(androidx.compose.runtime.Composer r14, int r15) {
                /*
                    Method dump skipped, instruction units count: 255
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.component2.AnonymousClass1.copydefault(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit copydefault(FixedDataFamilyShareActivity fixedDataFamilyShareActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component1 + 73;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(fixedDataFamilyShareActivity, "");
                    fixedDataFamilyShareActivity.finish();
                    unit = Unit.INSTANCE;
                    int i3 = 0 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(fixedDataFamilyShareActivity, "");
                    fixedDataFamilyShareActivity.finish();
                    unit = Unit.INSTANCE;
                }
                int i4 = component1 + 115;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            private static final Unit copydefault(boolean z, FixedDataFamilyShareActivity fixedDataFamilyShareActivity, List list, boolean z2) {
                int i = 2 % 2;
                int i2 = component1 + 57;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataFamilyShareActivity, "");
                Intrinsics.checkNotNullParameter(list, "");
                if (z) {
                    FibrePackageDetail fibrePackageDetail = (FibrePackageDetail) CollectionsKt.first(list);
                    fixedDataFamilyShareActivity.getFixedDataViewModel().updateSelectedAddons(CollectionsKt.drop(list, 1));
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(FixedDataNavKeys.EXTRA_SELECTED_PACKAGE, fibrePackageDetail);
                    bundle.putParcelable(FixedDataNavKeys.EXTRA_PAYMENT_ACTION, z2 ? PaymentOperation.ChangePlan.INSTANCE : PaymentOperation.BuyPlan.INSTANCE);
                    bundle.putBoolean(FixedDataNavKeys.EXTRA_IS_FAMILY_SHARE, true);
                    RouteUtils.routeWithExecute(fixedDataFamilyShareActivity, RoutePathConstant.SFC_FIXED_DATA_PAYMENT_OPTIONS, bundle);
                } else {
                    Intent intent = new Intent();
                    intent.putParcelableArrayListExtra(FixedDataNavKeys.EXTRA_SELECTED_PLANS, new ArrayList<>(list));
                    intent.putExtra(FixedDataNavKeys.EXTRA_IS_CHANGE_PLAN, z2);
                    fixedDataFamilyShareActivity.setResult(-1, intent);
                    fixedDataFamilyShareActivity.finish();
                }
                Unit unit = Unit.INSTANCE;
                int i4 = component1 + 115;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            private static final boolean ShareDataUIState(MutableState<Boolean> mutableState) {
                int i = 2 % 2;
                int i2 = component2 + 53;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                boolean zBooleanValue = mutableState.getValue().booleanValue();
                int i4 = component2 + 13;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return zBooleanValue;
            }

            private static final FixedDataUiState copydefault(State<FixedDataUiState> state) {
                int i = 2 % 2;
                int i2 = component1 + 43;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                FixedDataUiState value = state.getValue();
                int i4 = component1 + 57;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return value;
            }

            private static final DisposableEffectResult component1(final boolean z, final FixedDataFamilyShareActivity fixedDataFamilyShareActivity, MutableState mutableState, State state, DisposableEffectScope disposableEffectScope) {
                int i = 2 % 2;
                int i2 = component2 + 97;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataFamilyShareActivity, "");
                Intrinsics.checkNotNullParameter(mutableState, "");
                Intrinsics.checkNotNullParameter(state, "");
                Intrinsics.checkNotNullParameter(disposableEffectScope, "");
                if (!(!z) && ShareDataUIState(mutableState)) {
                    int i4 = component1 + 59;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    ExtensionsKt.showProgress(fixedDataFamilyShareActivity, copydefault((State<FixedDataUiState>) state).isLoading());
                    int i6 = component1 + 97;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                }
                return new DisposableEffectResult() {
                    private static int component1 = 1;
                    private static int copydefault;

                    @Override
                    public void dispose() {
                        int i8 = 2 % 2;
                        int i9 = copydefault;
                        int i10 = i9 + 5;
                        component1 = i10 % 128;
                        int i11 = i10 % 2;
                        if (z) {
                            int i12 = i9 + 71;
                            component1 = i12 % 128;
                            int i13 = i12 % 2;
                            ExtensionsKt.showProgress(fixedDataFamilyShareActivity, false);
                        }
                        int i14 = component1 + 67;
                        copydefault = i14 % 128;
                        if (i14 % 2 != 0) {
                            int i15 = 76 / 0;
                        }
                    }
                };
            }

            public static Unit component1(boolean z, FixedDataFamilyShareActivity fixedDataFamilyShareActivity, List list, boolean z2) {
                int i = 2 % 2;
                int i2 = component1 + 17;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(z, fixedDataFamilyShareActivity, list, z2);
                if (i3 == 0) {
                    int i4 = 59 / 0;
                }
                int i5 = component2 + 25;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitCopydefault;
                }
                throw null;
            }

            public static Unit component3(FixedDataFamilyShareActivity fixedDataFamilyShareActivity) {
                int i = 2 % 2;
                int i2 = component1 + 41;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(fixedDataFamilyShareActivity);
                if (i3 == 0) {
                    int i4 = 19 / 0;
                }
                return unitCopydefault;
            }

            public static DisposableEffectResult ShareDataUIState(boolean z, FixedDataFamilyShareActivity fixedDataFamilyShareActivity, MutableState mutableState, State state, DisposableEffectScope disposableEffectScope) {
                int i = 2 % 2;
                int i2 = component1 + 119;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return component1(z, fixedDataFamilyShareActivity, mutableState, state, disposableEffectScope);
                }
                component1(z, fixedDataFamilyShareActivity, mutableState, state, disposableEffectScope);
                throw null;
            }

            AnonymousClass1(FixedDataFamilyShareActivity fixedDataFamilyShareActivity, boolean z) {
                this.copydefault = fixedDataFamilyShareActivity;
                this.component3 = z;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 15;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component2(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 121;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            if (r11.getSkipping() == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            r11.skipToGroupEnd();
            r11 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.component2.component3 + 9;
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.component2.component1 = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            if ((r11 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            r11 = 3 / 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            if (r11.getSkipping() == false) goto L15;
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
                r12 = r12 & 11
                if (r12 != r0) goto L35
                int r12 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.component2.component1
                int r12 = r12 + 105
                int r1 = r12 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.component2.component3 = r1
                int r12 = r12 % r0
                if (r12 != 0) goto L1d
                boolean r12 = r11.getSkipping()
                r1 = 88
                int r1 = r1 / 0
                if (r12 != 0) goto L24
                goto L35
            L1d:
                boolean r12 = r11.getSkipping()
                if (r12 != 0) goto L24
                goto L35
            L24:
                r11.skipToGroupEnd()
                int r11 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.component2.component3
                int r11 = r11 + 9
                int r12 = r11 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.component2.component1 = r12
                int r11 = r11 % r0
                if (r11 == 0) goto L59
                r11 = 3
                int r11 = r11 / r0
                goto L59
            L35:
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity$component2$1 r12 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity$component2$1
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity r6 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.this
                boolean r7 = r10.copydefault
                r12.<init>(r6, r7)
                r6 = 54
                r7 = -1073469347(0xffffffffc004285d, float:-2.0649636)
                r8 = 1
                androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r7, r8, r12, r11, r6)
                r6 = r12
                kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
                r8 = 1572864(0x180000, float:2.204052E-39)
                r9 = 63
                r7 = r11
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            L59:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.component2.component2(androidx.compose.runtime.Composer, int):void");
        }

        component2(boolean z) {
            this.copydefault = z;
        }
    }

    private static void d(int i, char[] cArr, Object[] objArr) throws Throwable {
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
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3265, 33 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (MotionEvent.axisFromString("") + 60269), -834797019, false, $$i((byte) 37, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component3 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(((Process.getThreadPriority(0) + 20) >> 6) + 687, 34 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TextUtils.indexOf("", "") + 60373), -1969106284, false, $$i((byte) 40, b3, b3), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i4 = $11 + 63;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 687, 34 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (60373 - TextUtils.getTrimmedLength("")), -1969106284, false, $$i((byte) 40, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i5 = 75 / 0;
            } else {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 687, (Process.myTid() >> 22) + 34, (char) (60373 - View.getDefaultSize(0, 0)), -1969106284, false, $$i((byte) 40, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        String str = new String(cArr2);
        int i6 = $10 + 61;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void a(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        int i5 = $11 + 93;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 3784, 38 - View.resolveSize(0, 0), (char) (26860 - (ViewConfiguration.getTouchSlop() >> 8)), 2015799920, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 7406, 16 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getTapTimeout() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
                int i8 = $11 + 41;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7407 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getTouchSlop() >> 8), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r31, char[] r32, byte r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.b(int, char[], byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x23c4  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x23c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0234  */
    /* JADX WARN: Type inference failed for: r10v139, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v373 */
    /* JADX WARN: Type inference failed for: r1v374, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v465 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 10188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        Intent intent = getIntent();
        boolean booleanExtra = false;
        if (intent != null) {
            int i2 = component4 + 63;
            equals = i2 % 128;
            int i3 = i2 % 2;
            booleanExtra = intent.getBooleanExtra(FixedDataNavKeys.EXTRA_FETCH_PRODUCTS, false);
        }
        if (!isFinishing()) {
            return;
        }
        int i4 = equals + 85;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        if (booleanExtra) {
            getFixedDataViewModel().updateSelectedAddons(CollectionsKt.emptyList());
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 17;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = equals + 115;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{0, 65502, 65483, CharUtils.CR, CharUtils.CR, 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17}, 15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), true, 27 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952856_res_0x7f1304d8).substring(9, 10).length() + 293, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new char[]{6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952719_res_0x7f13044f).substring(6, 7).codePointAt(0) - 22, false, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 79, KeyEvent.keyCodeFromString("") + 301, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i5 = component4 + 19;
            equals = i5 % 128;
            int i6 = i5 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i7 = equals + 17;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, (char) Gravity.getAbsoluteGravity(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 6562, 57 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), -699576857, false, "component2", new Class[]{Context.class});
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
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0147  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r50) {
        /*
            Method dump skipped, instruction units count: 15174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        getRequestBeneficiariesState = 1;
        copydefault();
        component3();
        int i = component2 + 125;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 95;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component4 + 17;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 53;
        equals = i3 % 128;
        int i4 = i3 % 2;
        component3 = 6282398192621684288L;
        int i5 = i2 + 23;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        copydefault = new char[]{1974, 1977, 2028, 2002, 2034, 1976, 1960, 1975, 1992, 2000, 1970, 2036, 1972, 1971, 2041, 2024, 2022, 1965, 2032, 2017, 2030, 2029, 2035, 2018, 1969, 1973, 2019, 2025, 1966, 2021, 1962, 2020, 1987, 1963, 1968, 2031};
        ShareDataUIState = (char) 12828;
        component1 = -890926502;
    }
}
