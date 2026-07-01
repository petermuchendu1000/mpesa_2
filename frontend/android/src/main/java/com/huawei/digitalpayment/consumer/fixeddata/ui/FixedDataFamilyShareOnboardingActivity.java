package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel;
import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataFamilyShareOnboardingActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "fixedDataViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "getFixedDataViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "setFixedDataViewModel", "(Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;)V", "remoteConfig", "Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "getRemoteConfig", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "setRemoteConfig", "(Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataFamilyShareOnboardingActivity extends Hilt_FixedDataFamilyShareOnboardingActivity {
    public static final int $stable = 8;
    private static char[] ShareDataUIState;
    private static char component1;
    private static int component2;
    private static int copydefault;

    @Inject
    public FixedDataViewModel fixedDataViewModel;

    @Inject
    public RemoteConfig remoteConfig;
    private static final byte[] $$c = {Ascii.GS, -26, 91, 68};
    private static final int $$f = 52;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {Ascii.EM, 43, 92, -56, -13, 1, 62, -70, 17, -6, 4, -18, 8, 5, -13, 1, 62, -70, 10, 6, -18, Ascii.FF, 0, -18, Ascii.VT, 58, -54, -13, 1, -4, 0, -5, 13, TarHeader.LF_FIFO, -54, -13, 0, 7, -4, -10, 4, Ascii.VT, -20, 10, -7, 0, 63, -22, -45, 0, 7, -4, -10, 4, 35, -38, 7, -10, 37, -44, Ascii.SO, -9, 72, -30, -35, -18, 10, -7, 0, 42, -38, -2, -8, 75, -32, -48, Ascii.FF, 3, -20, 4, -4, -22, 6, -18, Ascii.FF, 32, -30, -20, Ascii.DC2, Ascii.VT, Ascii.VT, -11, -34, Ascii.DC2, -20, Ascii.SO, -13, 1, -4, 0, 0, 8, -10, -7, SignedBytes.MAX_POWER_OF_TWO, -4, 10, 56, -53, -14, -7, 6, 10, -23, Ascii.NAK, 1, -19, -2, 7, 6, TarHeader.LF_FIFO, -67, -2, 13, TarHeader.LF_BLK, -61, 6, 1, -10, 6, -3, TarHeader.LF_FIFO, -67, -3, 2, -8, Ascii.FF, 4, -2, -14, 67, -75, 10, -7, -1, 68, -43, 10, -7, -1, 5, -8, 8, -27, -21, 40, -18, -9, -10, 42, -31, -10, 8, -14, Ascii.DLE, -20, 4, -4, Ascii.RS, -30, 6, -13, -2, -10, 20, -2, -2, 4, -21, 8, -9, -13, 1, 62, -52, -9, -10, Ascii.SI, -13, Ascii.VT, TarHeader.LF_CHR, -63, -4, -6, -1, 10, 3, TarHeader.LF_FIFO, -52, -14, 4, -5, Ascii.VT, -20, 10, -7, 0, 63, -54, -13, 0, -7, Ascii.SO, -10, -7, 69, -22, -45, 1, -4, 0, -7, 6, 9, Ascii.SI, -31, 8, -5, Ascii.FS, -18, -20, Ascii.VT, 36, -45, 0, -7, Ascii.SO, -10, -7, -13, 1, -4, 0, 0, 8, -10, -7, 65, -13, 1, 62, -52, -12, 2, 6, 0, -2, 0, TarHeader.LF_SYMLINK, -52, -18, 8, -14, Ascii.DLE, -14, 67, -52, -16, -1, 65, -20, -48, -1, 33, -34, 10, -2, SignedBytes.MAX_POWER_OF_TWO, -15, 13, -14};
    private static final int $$h = 253;
    private static final byte[] $$a = {84, 79, Ascii.SYN, 41, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 242;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, int r7, byte r8) {
        /*
            int r7 = r7 * 54
            int r7 = r7 + 65
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.$$c
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.$$i(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = 99 - r7
            int r5 = r5 * 2
            int r5 = r5 + 83
            int r0 = 28 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.$$a
            byte[] r0 = new byte[r0]
            int r6 = 27 - r6
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-8)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r6 + 10
            int r8 = r8 * 4
            int r8 = r8 + 83
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.$$g
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.d(int, short, byte, java.lang.Object[]):void");
    }

    public final FixedDataViewModel getFixedDataViewModel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        FixedDataViewModel fixedDataViewModel = this.fixedDataViewModel;
        if (fixedDataViewModel != null) {
            return fixedDataViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = copy + 37;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setFixedDataViewModel(FixedDataViewModel fixedDataViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
            this.fixedDataViewModel = fixedDataViewModel;
            int i3 = 37 / 0;
        } else {
            Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
            this.fixedDataViewModel = fixedDataViewModel;
        }
        int i4 = copy + 101;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final RemoteConfig getRemoteConfig() {
        int i = 2 % 2;
        int i2 = copy + 51;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        RemoteConfig remoteConfig = this.remoteConfig;
        if (remoteConfig != null) {
            return remoteConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = getRequestBeneficiariesState + 79;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setRemoteConfig(RemoteConfig remoteConfig) {
        int i = 2 % 2;
        int i2 = copy + 37;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(remoteConfig, "");
        this.remoteConfig = remoteConfig;
        int i4 = copy + 55;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;
            final FixedDataFamilyShareOnboardingActivity component1;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 23;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ShareDataUIState(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 53;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
            
                if (r5.getSkipping() == false) goto L13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
            
                r5.skipToGroupEnd();
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
            
                if (r5.getSkipping() == false) goto L13;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ShareDataUIState(androidx.compose.runtime.Composer r5, int r6) {
                /*
                    r4 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    r6 = r6 & 11
                    r1 = 0
                    if (r6 != r0) goto L28
                    int r6 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.component1.AnonymousClass1.component3
                    int r6 = r6 + 11
                    int r2 = r6 % 128
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.component1.AnonymousClass1.ShareDataUIState = r2
                    int r6 = r6 % r0
                    if (r6 == 0) goto L1d
                    boolean r6 = r5.getSkipping()
                    r2 = 54
                    int r2 = r2 / r1
                    if (r6 != 0) goto L24
                    goto L28
                L1d:
                    boolean r6 = r5.getSkipping()
                    if (r6 != 0) goto L24
                    goto L28
                L24:
                    r5.skipToGroupEnd()
                    goto L42
                L28:
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity$onCreate$1$1$$ExternalSyntheticLambda0 r6 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity$onCreate$1$1$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity r2 = r4.component1
                    r6.<init>()
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity$onCreate$1$1$$ExternalSyntheticLambda1 r2 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity$onCreate$1$1$$ExternalSyntheticLambda1
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity r3 = r4.component1
                    r2.<init>()
                    com.huawei.digitalpayment.consumer.fixeddata.ui.screen.FamilyShareOnboardingScreenKt.FamilyShareOnboardingScreen(r6, r2, r5, r1)
                    int r5 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.component1.AnonymousClass1.ShareDataUIState
                    int r5 = r5 + 85
                    int r6 = r5 % 128
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.component1.AnonymousClass1.component3 = r6
                    int r5 = r5 % r0
                L42:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.component1.AnonymousClass1.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit ShareDataUIState(FixedDataFamilyShareOnboardingActivity fixedDataFamilyShareOnboardingActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 5;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataFamilyShareOnboardingActivity, "");
                fixedDataFamilyShareOnboardingActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 51;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 1 / 0;
                }
                return unit;
            }

            private static final Unit component1(FixedDataFamilyShareOnboardingActivity fixedDataFamilyShareOnboardingActivity) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataFamilyShareOnboardingActivity, "");
                Bundle bundle = new Bundle();
                bundle.putBoolean(FixedDataNavKeys.EXTRA_FETCH_PRODUCTS, true);
                bundle.putBoolean(FixedDataNavKeys.EXTRA_IS_FROM_ONBOARDING, true);
                RouteUtils.routeWithExecute(fixedDataFamilyShareOnboardingActivity, RoutePathConstant.SFC_FIXED_DATA_FAMILY_SHARE, bundle);
                fixedDataFamilyShareOnboardingActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i2 = ShareDataUIState + 11;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }

            public static Unit component3(FixedDataFamilyShareOnboardingActivity fixedDataFamilyShareOnboardingActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 63;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    return ShareDataUIState(fixedDataFamilyShareOnboardingActivity);
                }
                ShareDataUIState(fixedDataFamilyShareOnboardingActivity);
                throw null;
            }

            public static Unit component2(FixedDataFamilyShareOnboardingActivity fixedDataFamilyShareOnboardingActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 57;
                component3 = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    component1(fixedDataFamilyShareOnboardingActivity);
                    obj.hashCode();
                    throw null;
                }
                Unit unitComponent1 = component1(fixedDataFamilyShareOnboardingActivity);
                int i3 = component3 + 41;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    return unitComponent1;
                }
                obj.hashCode();
                throw null;
            }

            AnonymousClass1(FixedDataFamilyShareOnboardingActivity fixedDataFamilyShareOnboardingActivity) {
                this.component1 = fixedDataFamilyShareOnboardingActivity;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 87;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            copydefault(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 49;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void copydefault(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 71;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1519416487, true, new AnonymousClass1(FixedDataFamilyShareOnboardingActivity.this), composer, 54), composer, 1572864, 63);
                return;
            }
            composer.skipToGroupEnd();
            int i5 = ShareDataUIState + 13;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }

        component1() {
        }
    }

    private static void a(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr3 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            int i5 = $11 + 63;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr3[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i7]), Integer.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 3785, View.resolveSize(0, 0) + 38, (char) (26908 - AndroidCharacter.getMirror('0')), 2015799920, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 16 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i8 = $10 + 93;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr3, 0, cArr4, 0, i3);
            System.arraycopy(cArr4, 0, cArr3, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr4, iTrustedWebActivityServiceStub.component1, cArr3, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (!(!z)) {
            int i10 = $11 + 43;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr2 = new char[i3];
                iTrustedWebActivityServiceStub.ShareDataUIState = 1;
            } else {
                cArr2 = new char[i3];
                iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            }
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr3[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 7406, ((byte) KeyEvent.getModifierMetaStateMask()) + 17, (char) ((-16777216) - Color.rgb(0, 0, 0)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r33, char[] r34, int r35, java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.b(byte, char[], int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x1285  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x1287  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x2490  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x2491  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x021b  */
    /* JADX WARN: Type inference failed for: r3v280, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 125;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + WSContextConstant.HANDSHAKE_RECEIVE_SIZE, (ViewConfiguration.getTouchSlop() >> 8) + 4, new char[]{15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, CharUtils.CR, CharUtils.CR, 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5}, View.resolveSize(0, 0) + 26, false, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((byte) (7 - TextUtils.getTrimmedLength("")), new char[]{23, '\b', 13807, 13807, 22, 5, 11, 30, 13809, 13809, 1, 7, 18, 2, 7, 0, 22, 3}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = copy + 33;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 % 2;
                }
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = getRequestBeneficiariesState + 11;
                copy = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 6618, 42 - Gravity.getAbsoluteGravity(0, 0), (char) (TextUtils.lastIndexOf("", '0') + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.getOffsetBefore("", 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 55, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), -699576857, false, "component2", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d4  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x09e2 A[Catch: all -> 0x0b13, TryCatch #56 {all -> 0x0b13, blocks: (B:100:0x09d8, B:101:0x09dc, B:103:0x09e2, B:106:0x09fd, B:70:0x06a8, B:87:0x08a7, B:90:0x08f8, B:95:0x0971, B:99:0x09d0), top: B:948:0x06a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0bf6 A[Catch: all -> 0x0527, TryCatch #3 {all -> 0x0527, blocks: (B:164:0x0bf0, B:166:0x0bf6, B:167:0x0c20, B:284:0x11bc, B:286:0x11c2, B:287:0x11ea, B:480:0x1c5f, B:482:0x1c65, B:483:0x1c8f, B:757:0x3301, B:759:0x3307, B:760:0x3330, B:801:0x36aa, B:803:0x36b0, B:804:0x36d4, B:781:0x34d9, B:783:0x34fc, B:784:0x3554, B:723:0x2fb3, B:725:0x2fb9, B:726:0x2fe9, B:824:0x37ab, B:826:0x37b1, B:827:0x37e1, B:829:0x381b, B:830:0x3862, B:594:0x26fd, B:596:0x2712, B:597:0x2744, B:599:0x2778, B:600:0x27f6, B:572:0x23a4, B:574:0x23aa, B:575:0x23d3, B:577:0x240d, B:578:0x2458, B:545:0x20ca, B:547:0x20df, B:548:0x210e, B:529:0x1eb0, B:531:0x1eb6, B:532:0x1ee6, B:369:0x16b1, B:371:0x16b7, B:372:0x16de, B:19:0x0221, B:21:0x0227, B:22:0x024f, B:24:0x0498, B:26:0x04ca, B:27:0x0521, B:490:0x1d20, B:495:0x1d2d, B:514:0x1e16, B:516:0x1e1c, B:517:0x1e1d, B:519:0x1e1f, B:521:0x1e26, B:522:0x1e27, B:499:0x1d39, B:493:0x1d29), top: B:851:0x0221, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0cf8 A[Catch: all -> 0x110f, PHI: r1
  0x0cf8: PHI (r1v602 java.lang.Object) = (r1v601 java.lang.Object), (r1v653 java.lang.Object) binds: [B:172:0x0caa, B:174:0x0cae] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #54 {all -> 0x110f, blocks: (B:171:0x0ca6, B:178:0x0cf8, B:187:0x0d60, B:205:0x0e78, B:209:0x0ec3), top: B:945:0x0ca6 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0d05  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0d60 A[Catch: all -> 0x110f, TRY_ENTER, TRY_LEAVE, TryCatch #54 {all -> 0x110f, blocks: (B:171:0x0ca6, B:178:0x0cf8, B:187:0x0d60, B:205:0x0e78, B:209:0x0ec3), top: B:945:0x0ca6 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0fab A[Catch: all -> 0x10f2, TryCatch #31 {all -> 0x10f2, blocks: (B:222:0x0fa1, B:223:0x0fa5, B:225:0x0fab, B:228:0x0fc6, B:211:0x0ed2, B:217:0x0f3b, B:221:0x0f99), top: B:903:0x0ed2 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x11c2 A[Catch: all -> 0x0527, TryCatch #3 {all -> 0x0527, blocks: (B:164:0x0bf0, B:166:0x0bf6, B:167:0x0c20, B:284:0x11bc, B:286:0x11c2, B:287:0x11ea, B:480:0x1c5f, B:482:0x1c65, B:483:0x1c8f, B:757:0x3301, B:759:0x3307, B:760:0x3330, B:801:0x36aa, B:803:0x36b0, B:804:0x36d4, B:781:0x34d9, B:783:0x34fc, B:784:0x3554, B:723:0x2fb3, B:725:0x2fb9, B:726:0x2fe9, B:824:0x37ab, B:826:0x37b1, B:827:0x37e1, B:829:0x381b, B:830:0x3862, B:594:0x26fd, B:596:0x2712, B:597:0x2744, B:599:0x2778, B:600:0x27f6, B:572:0x23a4, B:574:0x23aa, B:575:0x23d3, B:577:0x240d, B:578:0x2458, B:545:0x20ca, B:547:0x20df, B:548:0x210e, B:529:0x1eb0, B:531:0x1eb6, B:532:0x1ee6, B:369:0x16b1, B:371:0x16b7, B:372:0x16de, B:19:0x0221, B:21:0x0227, B:22:0x024f, B:24:0x0498, B:26:0x04ca, B:27:0x0521, B:490:0x1d20, B:495:0x1d2d, B:514:0x1e16, B:516:0x1e1c, B:517:0x1e1d, B:519:0x1e1f, B:521:0x1e26, B:522:0x1e27, B:499:0x1d39, B:493:0x1d29), top: B:851:0x0221, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x12d1  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x1331 A[Catch: all -> 0x15ff, TRY_ENTER, TRY_LEAVE, TryCatch #42 {all -> 0x15ff, blocks: (B:291:0x1270, B:297:0x12c4, B:307:0x1331, B:317:0x13bc, B:320:0x1406), top: B:924:0x1270 }] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x14f3  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x16b7 A[Catch: all -> 0x0527, TryCatch #3 {all -> 0x0527, blocks: (B:164:0x0bf0, B:166:0x0bf6, B:167:0x0c20, B:284:0x11bc, B:286:0x11c2, B:287:0x11ea, B:480:0x1c5f, B:482:0x1c65, B:483:0x1c8f, B:757:0x3301, B:759:0x3307, B:760:0x3330, B:801:0x36aa, B:803:0x36b0, B:804:0x36d4, B:781:0x34d9, B:783:0x34fc, B:784:0x3554, B:723:0x2fb3, B:725:0x2fb9, B:726:0x2fe9, B:824:0x37ab, B:826:0x37b1, B:827:0x37e1, B:829:0x381b, B:830:0x3862, B:594:0x26fd, B:596:0x2712, B:597:0x2744, B:599:0x2778, B:600:0x27f6, B:572:0x23a4, B:574:0x23aa, B:575:0x23d3, B:577:0x240d, B:578:0x2458, B:545:0x20ca, B:547:0x20df, B:548:0x210e, B:529:0x1eb0, B:531:0x1eb6, B:532:0x1ee6, B:369:0x16b1, B:371:0x16b7, B:372:0x16de, B:19:0x0221, B:21:0x0227, B:22:0x024f, B:24:0x0498, B:26:0x04ca, B:27:0x0521, B:490:0x1d20, B:495:0x1d2d, B:514:0x1e16, B:516:0x1e1c, B:517:0x1e1d, B:519:0x1e1f, B:521:0x1e26, B:522:0x1e27, B:499:0x1d39, B:493:0x1d29), top: B:851:0x0221, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x1767  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x17c0  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x1819 A[Catch: all -> 0x1ba3, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x1ba3, blocks: (B:376:0x1761, B:383:0x17b3, B:424:0x1a44, B:425:0x1a48, B:427:0x1a4e, B:430:0x1a6a, B:392:0x1819, B:410:0x1920, B:413:0x196c, B:419:0x19e1, B:423:0x1a3c), top: B:849:0x1761 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x1a4e A[Catch: all -> 0x1ba3, TryCatch #2 {all -> 0x1ba3, blocks: (B:376:0x1761, B:383:0x17b3, B:424:0x1a44, B:425:0x1a48, B:427:0x1a4e, B:430:0x1a6a, B:392:0x1819, B:410:0x1920, B:413:0x196c, B:419:0x19e1, B:423:0x1a3c), top: B:849:0x1761 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x1c65 A[Catch: all -> 0x0527, TryCatch #3 {all -> 0x0527, blocks: (B:164:0x0bf0, B:166:0x0bf6, B:167:0x0c20, B:284:0x11bc, B:286:0x11c2, B:287:0x11ea, B:480:0x1c5f, B:482:0x1c65, B:483:0x1c8f, B:757:0x3301, B:759:0x3307, B:760:0x3330, B:801:0x36aa, B:803:0x36b0, B:804:0x36d4, B:781:0x34d9, B:783:0x34fc, B:784:0x3554, B:723:0x2fb3, B:725:0x2fb9, B:726:0x2fe9, B:824:0x37ab, B:826:0x37b1, B:827:0x37e1, B:829:0x381b, B:830:0x3862, B:594:0x26fd, B:596:0x2712, B:597:0x2744, B:599:0x2778, B:600:0x27f6, B:572:0x23a4, B:574:0x23aa, B:575:0x23d3, B:577:0x240d, B:578:0x2458, B:545:0x20ca, B:547:0x20df, B:548:0x210e, B:529:0x1eb0, B:531:0x1eb6, B:532:0x1ee6, B:369:0x16b1, B:371:0x16b7, B:372:0x16de, B:19:0x0221, B:21:0x0227, B:22:0x024f, B:24:0x0498, B:26:0x04ca, B:27:0x0521, B:490:0x1d20, B:495:0x1d2d, B:514:0x1e16, B:516:0x1e1c, B:517:0x1e1d, B:519:0x1e1f, B:521:0x1e26, B:522:0x1e27, B:499:0x1d39, B:493:0x1d29), top: B:851:0x0221, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x1d14  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0607 A[Catch: all -> 0x0b33, PHI: r1
  0x0607: PHI (r1v686 java.lang.Object) = (r1v685 java.lang.Object), (r1v726 java.lang.Object) binds: [B:41:0x05b1, B:43:0x05b4] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x0b33, blocks: (B:40:0x059a, B:48:0x0607, B:68:0x069a), top: B:861:0x059a }] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x1d36  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x1d37  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x1d3e  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x1d55 A[Catch: all -> 0x1e1e, TryCatch #62 {all -> 0x1e1e, blocks: (B:503:0x1d40, B:505:0x1d55, B:506:0x1d84), top: B:960:0x1d40, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x1d97 A[Catch: all -> 0x1e14, TryCatch #58 {all -> 0x1e14, blocks: (B:507:0x1d8a, B:509:0x1d97, B:510:0x1e0c), top: B:952:0x1d8a, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x1f6f  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x1fc1  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x20a8  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x225b  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x2363  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x254c  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x25b9  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x2614  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x26df  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x2930  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x2df3  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x2e29 A[Catch: all -> 0x2ee4, TryCatch #22 {all -> 0x2ee4, blocks: (B:685:0x2e23, B:687:0x2e29, B:688:0x2e58), top: B:886:0x2e23, outer: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:725:0x2fb9 A[Catch: all -> 0x0527, TryCatch #3 {all -> 0x0527, blocks: (B:164:0x0bf0, B:166:0x0bf6, B:167:0x0c20, B:284:0x11bc, B:286:0x11c2, B:287:0x11ea, B:480:0x1c5f, B:482:0x1c65, B:483:0x1c8f, B:757:0x3301, B:759:0x3307, B:760:0x3330, B:801:0x36aa, B:803:0x36b0, B:804:0x36d4, B:781:0x34d9, B:783:0x34fc, B:784:0x3554, B:723:0x2fb3, B:725:0x2fb9, B:726:0x2fe9, B:824:0x37ab, B:826:0x37b1, B:827:0x37e1, B:829:0x381b, B:830:0x3862, B:594:0x26fd, B:596:0x2712, B:597:0x2744, B:599:0x2778, B:600:0x27f6, B:572:0x23a4, B:574:0x23aa, B:575:0x23d3, B:577:0x240d, B:578:0x2458, B:545:0x20ca, B:547:0x20df, B:548:0x210e, B:529:0x1eb0, B:531:0x1eb6, B:532:0x1ee6, B:369:0x16b1, B:371:0x16b7, B:372:0x16de, B:19:0x0221, B:21:0x0227, B:22:0x024f, B:24:0x0498, B:26:0x04ca, B:27:0x0521, B:490:0x1d20, B:495:0x1d2d, B:514:0x1e16, B:516:0x1e1c, B:517:0x1e1d, B:519:0x1e1f, B:521:0x1e26, B:522:0x1e27, B:499:0x1d39, B:493:0x1d29), top: B:851:0x0221, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:731:0x3071  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x30c3  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x3121  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x32df  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x33bf  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x340c  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x34bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x368a  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x3772  */
    /* JADX WARN: Removed duplicated region for block: B:869:0x1276 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:993:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v100 */
    /* JADX WARN: Type inference failed for: r11v101 */
    /* JADX WARN: Type inference failed for: r11v102 */
    /* JADX WARN: Type inference failed for: r11v103 */
    /* JADX WARN: Type inference failed for: r11v113, types: [long] */
    /* JADX WARN: Type inference failed for: r11v114 */
    /* JADX WARN: Type inference failed for: r11v115 */
    /* JADX WARN: Type inference failed for: r11v116 */
    /* JADX WARN: Type inference failed for: r11v117 */
    /* JADX WARN: Type inference failed for: r11v118, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v119 */
    /* JADX WARN: Type inference failed for: r11v120 */
    /* JADX WARN: Type inference failed for: r11v121 */
    /* JADX WARN: Type inference failed for: r11v122 */
    /* JADX WARN: Type inference failed for: r11v123 */
    /* JADX WARN: Type inference failed for: r11v124 */
    /* JADX WARN: Type inference failed for: r11v125 */
    /* JADX WARN: Type inference failed for: r11v126 */
    /* JADX WARN: Type inference failed for: r11v127 */
    /* JADX WARN: Type inference failed for: r11v128 */
    /* JADX WARN: Type inference failed for: r11v129 */
    /* JADX WARN: Type inference failed for: r11v130 */
    /* JADX WARN: Type inference failed for: r11v131 */
    /* JADX WARN: Type inference failed for: r11v132 */
    /* JADX WARN: Type inference failed for: r11v133 */
    /* JADX WARN: Type inference failed for: r11v134 */
    /* JADX WARN: Type inference failed for: r11v135 */
    /* JADX WARN: Type inference failed for: r11v136 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v56, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v57, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v91 */
    /* JADX WARN: Type inference failed for: r13v100, types: [long] */
    /* JADX WARN: Type inference failed for: r13v102, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v103 */
    /* JADX WARN: Type inference failed for: r13v104 */
    /* JADX WARN: Type inference failed for: r13v105 */
    /* JADX WARN: Type inference failed for: r13v106 */
    /* JADX WARN: Type inference failed for: r13v107 */
    /* JADX WARN: Type inference failed for: r13v108 */
    /* JADX WARN: Type inference failed for: r13v109 */
    /* JADX WARN: Type inference failed for: r13v110 */
    /* JADX WARN: Type inference failed for: r13v111 */
    /* JADX WARN: Type inference failed for: r13v112 */
    /* JADX WARN: Type inference failed for: r13v113 */
    /* JADX WARN: Type inference failed for: r13v114 */
    /* JADX WARN: Type inference failed for: r13v115 */
    /* JADX WARN: Type inference failed for: r13v116 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v118 */
    /* JADX WARN: Type inference failed for: r13v119 */
    /* JADX WARN: Type inference failed for: r13v120 */
    /* JADX WARN: Type inference failed for: r13v121 */
    /* JADX WARN: Type inference failed for: r13v122 */
    /* JADX WARN: Type inference failed for: r13v123 */
    /* JADX WARN: Type inference failed for: r13v124 */
    /* JADX WARN: Type inference failed for: r13v125 */
    /* JADX WARN: Type inference failed for: r13v128 */
    /* JADX WARN: Type inference failed for: r13v129 */
    /* JADX WARN: Type inference failed for: r13v130 */
    /* JADX WARN: Type inference failed for: r13v131 */
    /* JADX WARN: Type inference failed for: r13v132 */
    /* JADX WARN: Type inference failed for: r13v133 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v66, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v71, types: [long] */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v88 */
    /* JADX WARN: Type inference failed for: r13v90 */
    /* JADX WARN: Type inference failed for: r13v91 */
    /* JADX WARN: Type inference failed for: r13v95 */
    /* JADX WARN: Type inference failed for: r13v96 */
    /* JADX WARN: Type inference failed for: r13v97 */
    /* JADX WARN: Type inference failed for: r13v98 */
    /* JADX WARN: Type inference failed for: r13v99 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v17 */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v19 */
    /* JADX WARN: Type inference failed for: r27v20 */
    /* JADX WARN: Type inference failed for: r27v21 */
    /* JADX WARN: Type inference failed for: r27v22 */
    /* JADX WARN: Type inference failed for: r27v23 */
    /* JADX WARN: Type inference failed for: r27v24 */
    /* JADX WARN: Type inference failed for: r27v25 */
    /* JADX WARN: Type inference failed for: r27v26 */
    /* JADX WARN: Type inference failed for: r27v27 */
    /* JADX WARN: Type inference failed for: r27v28 */
    /* JADX WARN: Type inference failed for: r27v29 */
    /* JADX WARN: Type inference failed for: r27v30 */
    /* JADX WARN: Type inference failed for: r27v31 */
    /* JADX WARN: Type inference failed for: r27v32 */
    /* JADX WARN: Type inference failed for: r27v33 */
    /* JADX WARN: Type inference failed for: r27v37 */
    /* JADX WARN: Type inference failed for: r27v38 */
    /* JADX WARN: Type inference failed for: r27v39 */
    /* JADX WARN: Type inference failed for: r27v40 */
    /* JADX WARN: Type inference failed for: r27v41 */
    /* JADX WARN: Type inference failed for: r27v82 */
    /* JADX WARN: Type inference failed for: r27v83 */
    /* JADX WARN: Type inference failed for: r27v84 */
    /* JADX WARN: Type inference failed for: r27v85 */
    /* JADX WARN: Type inference failed for: r27v86 */
    /* JADX WARN: Type inference failed for: r27v87 */
    /* JADX WARN: Type inference failed for: r4v656 */
    /* JADX WARN: Type inference failed for: r5v158, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v172, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v173, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v175, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v198 */
    /* JADX WARN: Type inference failed for: r7v205 */
    /* JADX WARN: Type inference failed for: r7v209 */
    /* JADX WARN: Type inference failed for: r7v210 */
    /* JADX WARN: Type inference failed for: r8v207 */
    /* JADX WARN: Type inference failed for: r8v208 */
    /* JADX WARN: Type inference failed for: r8v209 */
    /* JADX WARN: Type inference failed for: r8v215 */
    /* JADX WARN: Type inference failed for: r8v216 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v165 */
    /* JADX WARN: Type inference failed for: r9v166 */
    /* JADX WARN: Type inference failed for: r9v167 */
    /* JADX WARN: Type inference failed for: r9v168 */
    /* JADX WARN: Type inference failed for: r9v169 */
    /* JADX WARN: Type inference failed for: r9v170 */
    /* JADX WARN: Type inference failed for: r9v171 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataFamilyShareOnboardingActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        component2 = 0;
        component2();
        int i = component3 + 121;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 54 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 113;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 103;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component2() {
        ShareDataUIState = new char[]{2017, 2025, 1971, 2032, 2030, 1976, 2036, 1972, 1973, 2020, 2005, 2037, 1977, 2024, 1987, 2018, 1992, 2002, 2023, 1970, 2019, 2031, 1974, 2021, 1975, 2029, 1968, 2034, 2022, 2035, 1966, 2028, 2000, 2041, 1969, 1985};
        component1 = (char) 12828;
        copydefault = -890926358;
    }
}
