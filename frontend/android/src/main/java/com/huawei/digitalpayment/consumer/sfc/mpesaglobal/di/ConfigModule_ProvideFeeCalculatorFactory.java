package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.safaricom.android.design.templates.amountinput.provider.FeeCalculator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;

public final class ConfigModule_ProvideFeeCalculatorFactory implements Factory<FeeCalculator> {
    private static final byte[] $$c = {113, 46, 90, -12};
    private static final int $$d = 19;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {TarHeader.LF_BLK, -107, 59, -11, 35, Ascii.NAK, Ascii.SUB, Ascii.SYN, Ascii.SYN, Ascii.SO, 32, Ascii.GS, -43, 35, Ascii.NAK, Ascii.SUB, Ascii.SYN, Ascii.SYN, Ascii.SO, 32, Ascii.GS, -44, 35, Ascii.CAN, 32, 2, Ascii.CAN, Ascii.CAN, Ascii.DC2, 43, Ascii.SO, Ascii.US, 35, Ascii.CAN, 32};
    private static final int $$b = 25;
    private static int copydefault = 0;
    private static int component2 = 1;
    private static int component3 = -890926566;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r5, byte r6, short r7) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 65
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di.ConfigModule_ProvideFeeCalculatorFactory.$$c
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r5 = r5 * 4
            int r5 = 1 - r5
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r6]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di.ConfigModule_ProvideFeeCalculatorFactory.$$e(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 2
            int r7 = 99 - r7
            int r6 = r6 + 1
            int r5 = r5 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di.ConfigModule_ProvideFeeCalculatorFactory.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r5
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r0[r5]
        L25:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-23)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di.ConfigModule_ProvideFeeCalculatorFactory.b(short, int, int, java.lang.Object[]):void");
    }

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FeeCalculator feeCalculator = get();
        int i4 = component2 + 47;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return feeCalculator;
    }

    @Override
    public FeeCalculator get() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        FeeCalculator feeCalculatorProvideFeeCalculator = provideFeeCalculator();
        int i4 = copydefault + 49;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return feeCalculatorProvideFeeCalculator;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ConfigModule_ProvideFeeCalculatorFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ConfigModule_ProvideFeeCalculatorFactory configModule_ProvideFeeCalculatorFactory = component1.component3;
        int i4 = copydefault + 67;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return configModule_ProvideFeeCalculatorFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static FeeCalculator provideFeeCalculator() {
        FeeCalculator feeCalculator;
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            feeCalculator = (FeeCalculator) Preconditions.checkNotNullFromProvides(ConfigModule.INSTANCE.provideFeeCalculator());
            int i3 = 74 / 0;
        } else {
            feeCalculator = (FeeCalculator) Preconditions.checkNotNullFromProvides(ConfigModule.INSTANCE.provideFeeCalculator());
        }
        int i4 = copydefault + 3;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return feeCalculator;
        }
        throw null;
    }

    static final class component1 {
        private static int ShareDataUIState = 0;
        static final ConfigModule_ProvideFeeCalculatorFactory component3 = new ConfigModule_ProvideFeeCalculatorFactory();
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = ShareDataUIState + 21;
            copydefault = i % 128;
            if (i % 2 == 0) {
                int i2 = 57 / 0;
            }
        }
    }

    private static void a(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
            int i5 = $11 + 69;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3785 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 37, (char) (Color.alpha(0) + 26860), 2015799920, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - TextUtils.getCapsMode("", 0, 0), View.combineMeasuredStates(0, 0) + 16, (char) (ViewConfiguration.getEdgeSlop() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i - iTrustedWebActivityServiceStub.component1);
            int i8 = $11 + 117;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (z) {
            char[] cArr4 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 7406, 16 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((Process.getThreadPriority(0) + 20) >> 6), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i10 = $10 + 41;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0486 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0461  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] copydefault(android.content.Context r27, int r28, int r29, int r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.di.ConfigModule_ProvideFeeCalculatorFactory.copydefault(android.content.Context, int, int, int):java.lang.Object[]");
    }
}
