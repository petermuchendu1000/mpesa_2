package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.fixeddata.constant.HomeInternetConstants;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataCardType;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataLandingActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataLandingActivity extends Hilt_FixedDataLandingActivity {
    public static final int $stable = 0;
    private static char ShareDataUIState;
    private static char component1;
    private static int component2;
    private static char component3;
    private static int copy;
    private static char copydefault;
    private static char[] getRequestBeneficiariesState;
    private static final byte[] $$c = {40, 108, -113, 75};
    private static final int $$f = 107;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {65, -53, 110, -39, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -63, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -61, Ascii.DLE, 2, -59, 63, -4, 19, -62, TarHeader.LF_CONTIG, 6, -49, TarHeader.LF_CONTIG, 17, -6, Ascii.DC2, 1, -2, -1, -50, TarHeader.LF_CONTIG, 6, 20, -65, 69, 5, -7, 17, -13, Ascii.ETB, -7, 10, 3, -60, 56, Ascii.VT, Ascii.NAK, -72, 72, -9, 6, 6, 10, 3, -60, 69, 5, -7, 17, -13, Ascii.ETB, -7, 10, 3, -60, 72, -9, Ascii.SI, 3, 8, -6, Ascii.SI, -1, 7, Ascii.VT, -71, Ascii.FS, 35, 19, -13, 9, -35, 47, 4, -39, TarHeader.LF_CHR, 4, 7, -29, Ascii.ETB, Ascii.DLE, 8, -12, Ascii.DC2, 5, Ascii.DLE, 5, 13, -17, 5, 5, -1, Ascii.CAN, -5, Ascii.FF};
    private static final int $$h = 28;
    private static final byte[] $$a = {59, -24, -77, -23, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 159;
    private static int getAsAtTimestamp = 0;
    private static int equals = 1;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(int r6, int r7, byte r8) {
        /*
            int r6 = 115 - r6
            int r8 = r8 * 2
            int r0 = 1 - r8
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.$$i(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.$$a
            int r6 = r6 * 2
            int r6 = r6 + 83
            int r8 = r8 + 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r6 = r8
            r5 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r7]
        L25:
            int r6 = r6 + r3
            int r6 = r6 + (-8)
            int r7 = r7 + 1
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 99 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.$$g
            int r8 = r8 + 10
            int r7 = 105 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r6 = r8
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-4)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.e(byte, short, byte, java.lang.Object[]):void");
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int component1 = 1;
        private static int component3;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;
            final FixedDataLandingActivity component1;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component3 + 63;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                component2(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 19;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component2(androidx.compose.runtime.Composer r10, int r11) {
                /*
                    r9 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.AnonymousClass1.ShareDataUIState
                    int r1 = r1 + 125
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.AnonymousClass1.component3 = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L13
                    r11 = r11 & 47
                    if (r11 != r0) goto L32
                    goto L17
                L13:
                    r11 = r11 & 11
                    if (r11 != r0) goto L32
                L17:
                    int r2 = r2 + 125
                    int r11 = r2 % 128
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.AnonymousClass1.ShareDataUIState = r11
                    int r2 = r2 % r0
                    boolean r11 = r10.getSkipping()
                    if (r2 == 0) goto L2b
                    r1 = 65
                    int r1 = r1 / 0
                    if (r11 != 0) goto L2e
                    goto L32
                L2b:
                    if (r11 != 0) goto L2e
                    goto L32
                L2e:
                    r10.skipToGroupEnd()
                    goto L8d
                L32:
                    r11 = -1238957029(0xffffffffb627041b, float:-2.488733E-6)
                    r10.startReplaceGroup(r11)
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity r11 = r9.component1
                    boolean r11 = r10.changed(r11)
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity r1 = r9.component1
                    java.lang.Object r2 = r10.rememberedValue()
                    if (r11 != 0) goto L4e
                    androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r11 = r11.getEmpty()
                    if (r2 != r11) goto L56
                L4e:
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity$onCreate$1$1$$ExternalSyntheticLambda0 r2 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity$onCreate$1$1$$ExternalSyntheticLambda0
                    r2.<init>()
                    r10.updateRememberedValue(r2)
                L56:
                    r3 = r2
                    kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                    r10.endReplaceGroup()
                    r11 = -1238937518(0xffffffffb6275052, float:-2.4931692E-6)
                    r10.startReplaceGroup(r11)
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity r11 = r9.component1
                    boolean r11 = r10.changed(r11)
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity r1 = r9.component1
                    java.lang.Object r2 = r10.rememberedValue()
                    if (r11 != 0) goto L78
                    androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r11 = r11.getEmpty()
                    if (r2 != r11) goto L80
                L78:
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity$onCreate$1$1$$ExternalSyntheticLambda1 r2 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity$onCreate$1$1$$ExternalSyntheticLambda1
                    r2.<init>()
                    r10.updateRememberedValue(r2)
                L80:
                    r4 = r2
                    kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
                    r10.endReplaceGroup()
                    r5 = 0
                    r7 = 0
                    r8 = 4
                    r6 = r10
                    com.huawei.digitalpayment.consumer.fixeddata.ui.screen.FixedDataLandingScreenKt.FixedDataLandingScreen(r3, r4, r5, r6, r7, r8)
                L8d:
                    int r10 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.AnonymousClass1.component3
                    int r10 = r10 + 59
                    int r11 = r10 % 128
                    com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.AnonymousClass1.ShareDataUIState = r11
                    int r10 = r10 % r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.AnonymousClass1.component2(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit component1(FixedDataLandingActivity fixedDataLandingActivity, FixedDataCardType fixedDataCardType) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 5;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(fixedDataLandingActivity, "");
                    Intrinsics.checkNotNullParameter(fixedDataCardType, "");
                    fixedDataCardType.getFixedDataType();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(fixedDataLandingActivity, "");
                Intrinsics.checkNotNullParameter(fixedDataCardType, "");
                if (fixedDataCardType.getFixedDataType() != null) {
                    Intent intent = new Intent(fixedDataLandingActivity, (Class<?>) FixedDataEntryPointActivity.class);
                    intent.putExtra(FixedDataEntryPointActivity.EXTRA_CLICKED_TYPE, fixedDataCardType.getFixedDataType().getCode());
                    fixedDataLandingActivity.startActivity(intent);
                    int i3 = ShareDataUIState + 95;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    fixedDataLandingActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(HomeInternetConstants.URL_FIXED_GET_CONNECTED)));
                }
                return Unit.INSTANCE;
            }

            private static final Unit ShareDataUIState(FixedDataLandingActivity fixedDataLandingActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component3 + 77;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fixedDataLandingActivity, "");
                    fixedDataLandingActivity.getOnBackPressedDispatcher().onBackPressed();
                    unit = Unit.INSTANCE;
                    int i3 = 15 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(fixedDataLandingActivity, "");
                    fixedDataLandingActivity.getOnBackPressedDispatcher().onBackPressed();
                    unit = Unit.INSTANCE;
                }
                int i4 = ShareDataUIState + 23;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 77 / 0;
                }
                return unit;
            }

            public static Unit component3(FixedDataLandingActivity fixedDataLandingActivity, FixedDataCardType fixedDataCardType) {
                int i = 2 % 2;
                int i2 = component3 + 13;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return component1(fixedDataLandingActivity, fixedDataCardType);
                }
                component1(fixedDataLandingActivity, fixedDataCardType);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit copydefault(FixedDataLandingActivity fixedDataLandingActivity) {
                int i = 2 % 2;
                int i2 = component3 + 87;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(fixedDataLandingActivity);
                int i4 = component3 + 3;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unitShareDataUIState;
            }

            AnonymousClass1(FixedDataLandingActivity fixedDataLandingActivity) {
                this.component1 = fixedDataLandingActivity;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 73;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = component1 + 1;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 99 / 0;
            }
            return unit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
        
            r13 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.component1 + 97;
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.component3 = r13 % 128;
            r13 = r13 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
        
            r12.skipToGroupEnd();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        
            if (r13 == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
        
            if (r13 == false) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void ShareDataUIState(androidx.compose.runtime.Composer r12, int r13) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.component3
                int r2 = r1 + 27
                int r3 = r2 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.component1 = r3
                int r2 = r2 % r0
                r13 = r13 & 11
                if (r13 != r0) goto L34
                int r1 = r1 + 61
                int r13 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.component1 = r13
                int r1 = r1 % r0
                boolean r13 = r12.getSkipping()
                if (r1 != 0) goto L24
                r1 = 29
                int r1 = r1 / 0
                if (r13 != 0) goto L30
                goto L26
            L24:
                if (r13 != 0) goto L30
            L26:
                int r13 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.component1
                int r13 = r13 + 97
                int r1 = r13 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.component3 = r1
                int r13 = r13 % r0
                goto L34
            L30:
                r12.skipToGroupEnd()
                goto L5f
            L34:
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity$component1$1 r13 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity$component1$1
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity r7 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.this
                r13.<init>(r7)
                r7 = 54
                r8 = -1217363995(0xffffffffb7707fe5, float:-1.43348925E-5)
                r9 = 1
                androidx.compose.runtime.internal.ComposableLambda r13 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r8, r9, r13, r12, r7)
                r7 = r13
                kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                r9 = 1572864(0x180000, float:2.204052E-39)
                r10 = 63
                r8 = r12
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                int r12 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.component3
                int r12 = r12 + 15
                int r13 = r12 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.component1 = r13
                int r12 = r12 % r0
            L5f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.component1.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
        }

        component1() {
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 33;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i7 = $11 + 115;
            $10 = i7 % 128;
            int i8 = 58224;
            char c2 = 1;
            if (i7 % 2 != 0) {
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                char c3 = cArr3[c2];
                char c4 = cArr3[i4];
                char[] cArr4 = cArr3;
                int i9 = (c4 + i8) ^ ((c4 << 4) + ((char) (((long) copydefault) ^ 4374495167426960553L)));
                int i10 = c4 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ShareDataUIState);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[c2] = Integer.valueOf(i9);
                    objArr2[0] = Integer.valueOf(c3);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int iAlpha = 844 - Color.alpha(0);
                        int i11 = 32 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 23251);
                        byte length = (byte) $$c.length;
                        byte b2 = (byte) (length - 4);
                        String str$$i = $$i(length, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, i11, doubleTapTimeout, 592652048, false, str$$i, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[c2] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component1)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int tapTimeout = 844 - (ViewConfiguration.getTapTimeout() >> 16);
                        int iRgb = (-16777184) - Color.rgb(0, 0, 0);
                        char c5 = (char) (23252 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        byte length2 = (byte) $$c.length;
                        byte b3 = (byte) (length2 - 4);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, iRgb, c5, 592652048, false, $$i(length2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
                    c2 = 1;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(464 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf("", "", 0, 0) + 49, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void d(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        int i5 = $10 + 107;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i7 = $10 + 11;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i9 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 39, (char) (26861 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 2015799920, false, $$i((byte) 50, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 16 - Gravity.getAbsoluteGravity(0, 0), (char) TextUtils.indexOf("", "", 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            iTrustedWebActivityServiceStub.component1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i10 = $11 + 115;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            int i12 = $10 + 109;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7406, 16 - ExpandableListView.getPackedPositionGroup(0L), (char) View.resolveSizeAndState(0, 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = getRequestBeneficiariesState;
        float f = 0.0f;
        long j = 0;
        if (cArr != null) {
            int i6 = $10 + 81;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(658 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 14, (char) (65118 - (ViewConfiguration.getTapTimeout() >> 16)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i8++;
                    f = 0.0f;
                    j = 0;
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
                int i9 = $11 + 51;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i11 = $10 + 35;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 5;
                        byte b3 = (byte) (b2 - 5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4502, TextUtils.lastIndexOf("", '0', 0) + 37, (char) (ImageFormat.getBitsPerPixel(0) + 27898), -1464227204, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3580, 28 - View.MeasureSpec.getSize(0), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 1180380354, false, $$i(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1859;
                    int i15 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 33;
                    char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                    byte b6 = (byte) ($$f & 5);
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, i15, cCombineMeasuredStates, 80302927, false, $$i(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i16 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i16, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i16);
        }
        if (!(!z)) {
            char[] cArr6 = new char[i3];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i3 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i17 = $11 + 107;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i3) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0105  */
    /* JADX WARN: Type inference failed for: r2v164, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 59;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = equals + 99;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            a(new byte[]{0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0}, new int[]{5, 26, 0, 12}, true, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(ExpandableListView.getPackedPositionType(0L) + 18, new char[]{38865, 20544, 24132, 53329, 59933, 46173, 25633, 36698, 60181, 20802, 29803, 14661, 12035, 10349, 11889, 8202, 685, 35051}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i5 = equals + 35;
            getAsAtTimestamp = i5 % 128;
            try {
                if (i5 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 6570, Gravity.getAbsoluteGravity(0, 0) + 42, (char) View.MeasureSpec.getMode(0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 6563, ImageFormat.getBitsPerPixel(0) + 57, (char) Color.alpha(0), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i6 = 12 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.resolveSizeAndState(0, 0, 0), 42 - TextUtils.indexOf("", ""), (char) (TextUtils.lastIndexOf("", '0') + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16783778, TextUtils.lastIndexOf("", '0', 0) + 57, (char) (ViewConfiguration.getTapTimeout() >> 16), -960739708, false, "component3", new Class[]{Context.class});
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
        super.onPause();
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r41) {
        /*
            Method dump skipped, instruction units count: 13810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataLandingActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        copy = 0;
        component1();
        component2();
        int i = component4 + 39;
        copy = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 109;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = getAsAtTimestamp + 29;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 15;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        component2 = -890926343;
        int i5 = i2 + 73;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        component3 = (char) 44280;
        component1 = (char) 21755;
        copydefault = (char) 14853;
        ShareDataUIState = (char) 61315;
        getRequestBeneficiariesState = new char[]{33413, 33381, 33393, 33401, 33394, 33480, 33424, 33455, 33463, 33432, 33430, 33465, 33459, 33455, 33460, 33462, 33464, 33469, 33469, 33468, 33460, 33458, 33409, 33465, 33449, 33457, 33456, 33456, 33457, 33460, 33421, 33469, 33391, 33351, 33393, 33390, 33350, 33391, 33304, 33394, 33395, 33392, 33349, 33347, 33350, 33392, 33391, 33392, 33395, 33353, 33351, 33393, 33394, 33352, 33391, 33392, 33350, 33389, 33391, 33393, 33307, 33305, 33302, 33303, 33305, 33396, 33356, 33355, 33351, 33390, 33306, 33393, 33351, 33354, 33354, 33352, 33351, 33351, 33393, 33518, 33429, 33429, 33467, 33468, 33469, 33426, 33515, 33430, 33427, 33512, 33512, 33515, 33428, 33468, 33426, 33514, 33518, 33428, 33428, 33430, 33426, 33515, 33518, 33428, 33468, 33427, 33512, 33513, 33517, 33428, 33427, 33429, 33468, 33428, 33517, 33519, 33517, 33428, 33428, 33514, 33512, 33512, 33513, 33514, 33511, 33513, 33515, 33512, 33424, 33424, 33512, 33427, 33470, 33430, 33428, 33429, 33516, 33514, 33426, 33428, 33514, 33511, 33426, 33517, 33430, 33431, 33462, 33457, 33425, 33431, 33463, 33459, 33427, 33427, 33460, 33461, 33465, 33459, 33452, 33422, 33421, 33419, 33519, 33429, 33458, 33458, 33462, 33454, 33452, 33458, 33457, 33451, 33453, 33454, 33417, 33515, 33520, 33517, 33514, 33513, 33512, 33514, 33427, 33426, 33515, 33516, 33516, 33515, 33517, 33516, 33514, 33426, 33469, 33431, 33422, 33457, 33458, 33460, 33468, 33461, 33460, 33469, 33461, 33452, 33422, 33429, 33457, 33460, 33462, 33460, 33460, 33453, 33452, 33460, 33462, 33513, 33465, 33464, 33461, 33429, 33439, 33465, 33449, 33452, 33459, 33462, 33460, 33466, 33460, 33460, 33432, 33461, 33455, 33452, 33466, 33456, 33469, 33459, 33467, 33455, 33458, 33435, 33457, 33465, 33450, 33451, 33445, 33419, 33520, 33451, 33455, 33520, 33466, 33475, 33511, 33425, 33468, 33429, 33429, 33428, 33426, 33467, 33429, 33515, 33512, 33513, 33426, 33467, 33467, 33427, 33515, 33514, 33513, 33514, 33516, 33517, 33429, 33426, 33514, 33430, 33430, 33519, 33428, 33428, 33517, 33514, 33513, 33514, 33511, 33511, 33514, 33513, 33515, 33518, 33517, 33428, 33426, 33515, 33515, 33515, 33428, 33426, 33427, 33468, 33425, 33512, 33427, 33469, 33429, 33428, 33465, 33427, 33516, 33514, 33427, 33468, 33426, 33478, 33516, 33516, 33515, 33512, 33511, 33514, 33514, 33514, 33515, 33512, 33416, 33395, 33396, 33395, 33393, 33392, 33392, 33391, 33392, 33394, 33393, 33475, 33513, 33513, 33511, 33510, 33513, 33516, 33515, 33512, 33514};
    }
}
