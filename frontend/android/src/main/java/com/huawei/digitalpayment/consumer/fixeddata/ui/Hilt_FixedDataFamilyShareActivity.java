package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.constant.CacheConstants;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.cancelNotification;
import kotlin.io.encoding.Base64;
import org.apache.commons.lang3.CharUtils;

public abstract class Hilt_FixedDataFamilyShareActivity extends AppCompatActivity implements GeneratedComponentManagerHolder {
    private static long ShareDataUIState;
    private static long component1;
    private static char[] component2;
    private static char[] component3;
    private static int component4;
    private static int copydefault;
    private volatile ActivityComponentManager componentManager;
    private final Object componentManagerLock;
    private boolean injected;
    private SavedStateHandleHolder savedStateHandleHolder;
    private static final byte[] $$l = {Base64.padSymbol, -49, -70, 93};
    private static final int $$m = 155;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {Ascii.VT, -55, -20, -91, -20, -6, TarHeader.LF_CONTIG, -59, -19, -5, -1, -7, -9, -7, 43, -59, -25, 1, -21, 9, -21, 60, -59, -23, -8, 58, -27, -55, -8, Ascii.SUB, -41, 3, -9, 57, -22, 6, -21, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -6, -11, -7, -7, 1, -17, -14, 58};
    private static final int $$k = 159;
    private static final byte[] $$d = {117, -24, -14, 98, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 200;
    private static int equals = 0;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;

    private static String $$n(short s, byte b2, byte b3) {
        int i = s * 3;
        int i2 = 122 - b2;
        byte[] bArr = $$l;
        int i3 = 4 - (b3 * 4);
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 = (-i2) + i3;
            i3++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i) {
                return new String(bArr2, 0);
            }
            i2 = (-bArr[i3]) + i2;
            i3++;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.$$d
            int r8 = r8 + 4
            int r6 = 28 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r8]
        L25:
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            int r8 = r8 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.h(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 24
            int r0 = r6 + 10
            int r8 = r8 * 3
            int r8 = 46 - r8
            int r7 = r7 * 4
            int r7 = r7 + 99
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.$$j
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L30
        L18:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1c:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L30:
            int r7 = -r7
            int r8 = r8 + r7
            int r8 = r8 + (-8)
            int r7 = r3 + 1
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.i(short, int, short, java.lang.Object[]):void");
    }

    @Override
    public GeneratedComponentManager componentManager() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 53;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ActivityComponentManager activityComponentManagerComponentManager = componentManager();
        int i4 = copy + 55;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return activityComponentManagerComponentManager;
        }
        throw null;
    }

    Hilt_FixedDataFamilyShareActivity() {
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    Hilt_FixedDataFamilyShareActivity(int i) {
        super(i);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    public class AnonymousClass1 implements OnContextAvailableListener {
        private static final byte[] $$c = {112, 44, -46, -27};
        private static final int $$f = 56;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {2, 77, TarHeader.LF_CONTIG, -86, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
        private static final int $$e = 35;
        private static final byte[] $$a = {57, Ascii.SYN, -21, -92, -1, -31, Ascii.VT, -33, SignedBytes.MAX_POWER_OF_TWO, -63, -25, -17, -1, -14, -5, TarHeader.LF_CONTIG, -31, -48, -17, -2, -7, -23, -21, Ascii.US, -45, -15, 3, -21};
        private static final int $$b = 213;
        private static int component2 = 0;
        private static int component1 = 1;
        private static int component3 = -890926441;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(short r7, int r8, int r9) {
            /*
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r9 = r9 * 2
                int r9 = 1 - r9
                byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.AnonymousClass1.$$c
                int r8 = r8 * 4
                int r8 = 65 - r8
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r5 = r2
                r8 = r7
                goto L2b
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2b:
                int r7 = -r7
                int r7 = r7 + r3
                int r8 = r8 + 1
                r3 = r5
                r6 = r8
                r8 = r7
                r7 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.AnonymousClass1.$$g(short, int, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 12
                int r6 = r6 + 7
                byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.AnonymousClass1.$$a
                int r7 = r7 * 6
                int r7 = r7 + 100
                int r8 = r8 * 18
                int r8 = 22 - r8
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r6
                r5 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r0[r8]
            L28:
                int r3 = -r3
                int r8 = r8 + 1
                int r7 = r7 + r3
                int r7 = r7 + (-10)
                r3 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.AnonymousClass1.a(int, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(short r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 + 4
                byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.AnonymousClass1.$$d
                int r5 = r5 * 3
                int r1 = 10 - r5
                int r7 = 100 - r7
                byte[] r1 = new byte[r1]
                int r5 = 9 - r5
                r2 = -1
                if (r0 != 0) goto L14
                r3 = r2
                r2 = r6
                goto L2f
            L14:
                r4 = r7
                r7 = r6
                r6 = r4
            L17:
                int r2 = r2 + 1
                byte r3 = (byte) r6
                r1[r2] = r3
                if (r2 != r5) goto L27
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r1, r6)
                r8[r6] = r5
                return
            L27:
                int r7 = r7 + 1
                r3 = r0[r7]
                r4 = r2
                r2 = r7
                r7 = r3
                r3 = r4
            L2f:
                int r7 = -r7
                int r6 = r6 + r7
                int r6 = r6 + (-27)
                r7 = r2
                r2 = r3
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.AnonymousClass1.b(short, short, byte, java.lang.Object[]):void");
        }

        AnonymousClass1() {
        }

        @Override
        public void onContextAvailable(Context context) {
            int i = 2 % 2;
            int i2 = component2 + 93;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Hilt_FixedDataFamilyShareActivity.this.inject();
            int i4 = component2 + 101;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }

        private static void c(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
            char[] cArr2 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            int i5 = $11 + 33;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                int i7 = $11 + 51;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
                cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
                int i9 = iTrustedWebActivityServiceStub.ShareDataUIState;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9]), Integer.valueOf(component3)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3784, (ViewConfiguration.getTouchSlop() >> 8) + 38, (char) (26860 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 2015799920, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.keyCodeFromString("") + 16, (char) ExpandableListView.getPackedPositionGroup(0L), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            }
            if (z) {
                int i10 = $10 + 25;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                char[] cArr4 = new char[i];
                iTrustedWebActivityServiceStub.ShareDataUIState = 0;
                while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                    try {
                        Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7405 - TextUtils.lastIndexOf("", '0', 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:143:0x0c0e, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:144:0x0c0f, code lost:
        
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:145:0x0c13, code lost:
        
            if (r1 != null) goto L146;
         */
        /* JADX WARN: Code restructure failed: missing block: B:146:0x0c15, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:147:0x0c16, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0855, code lost:
        
            r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.AnonymousClass1.component2 + 123;
            com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.AnonymousClass1.component1 = r0 % 128;
            r0 = r0 % 2;
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0866, code lost:
        
            if (r0 != null) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0868, code lost:
        
            r8 = 1342 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1));
            r9 = 33 - android.graphics.Color.green(0);
            r10 = (char) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 6425);
            r0 = (byte) 0;
            r4 = (byte) (r0 - 1);
            r6 = new java.lang.Object[1];
            b(r0, r4, (byte) (-r4), r6);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r8, r9, r10, 1443979249, false, (java.lang.String) r6[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x089c, code lost:
        
            ((java.lang.reflect.Field) r0).set(null, r15);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x08a9, code lost:
        
            if (r0 != null) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x08ab, code lost:
        
            r4 = (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1342;
            r5 = android.text.TextUtils.getTrimmedLength("") + 33;
            r6 = (char) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 6425);
            r2 = (byte) 0;
            r9 = (byte) (r2 - 1);
            r11 = new java.lang.Object[1];
            b(r2, r9, (byte) (-r9), r11);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r4, r5, r6, 1443979249, false, (java.lang.String) r11[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x08e8, code lost:
        
            r4 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x08fc, code lost:
        
            if (r0 != null) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x08fe, code lost:
        
            r5 = (-16775874) - android.graphics.Color.rgb(0, 0, 0);
            r6 = android.view.KeyEvent.keyCodeFromString("") + 33;
            r7 = (char) (6425 - (android.view.ViewConfiguration.getScrollBarSize() >> 8));
            r0 = (byte) (com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.AnonymousClass1.$$e & 15);
            r12 = new java.lang.Object[1];
            b(r0, (byte) (r0 + 5), (byte) 0, r12);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r5, r6, r7, -181198845, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0940, code lost:
        
            ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r4)).longValue();
         */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0b72  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x0b7b  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0462 A[Catch: all -> 0x0968, TRY_ENTER, TryCatch #0 {all -> 0x0968, blocks: (B:15:0x00d9, B:17:0x0271, B:20:0x030a, B:22:0x034b, B:26:0x03ea, B:34:0x0462, B:42:0x052b, B:46:0x0571, B:48:0x0590, B:50:0x05cd, B:56:0x0604, B:58:0x0652, B:60:0x06d9, B:62:0x0740, B:47:0x0574, B:35:0x048e, B:30:0x0415, B:21:0x0327), top: B:148:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x048e A[Catch: all -> 0x0968, TRY_LEAVE, TryCatch #0 {all -> 0x0968, blocks: (B:15:0x00d9, B:17:0x0271, B:20:0x030a, B:22:0x034b, B:26:0x03ea, B:34:0x0462, B:42:0x052b, B:46:0x0571, B:48:0x0590, B:50:0x05cd, B:56:0x0604, B:58:0x0652, B:60:0x06d9, B:62:0x0740, B:47:0x0574, B:35:0x048e, B:30:0x0415, B:21:0x0327), top: B:148:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x04db  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x04f2  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0560  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0574 A[Catch: all -> 0x0968, TryCatch #0 {all -> 0x0968, blocks: (B:15:0x00d9, B:17:0x0271, B:20:0x030a, B:22:0x034b, B:26:0x03ea, B:34:0x0462, B:42:0x052b, B:46:0x0571, B:48:0x0590, B:50:0x05cd, B:56:0x0604, B:58:0x0652, B:60:0x06d9, B:62:0x0740, B:47:0x0574, B:35:0x048e, B:30:0x0415, B:21:0x0327), top: B:148:0x00d9 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x05f7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int component2(java.util.List r35) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 3362
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.AnonymousClass1.component2(java.util.List):int");
        }
    }

    private void _initHiltInternal() {
        int i = 2 % 2;
        addOnContextAvailableListener(new AnonymousClass1());
        int i2 = copy + 11;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private void initSavedStateHandleHolder() {
        int i = 2 % 2;
        if (getApplication() instanceof GeneratedComponentManager) {
            int i2 = getAsAtTimestamp + 115;
            copy = i2 % 128;
            int i3 = i2 % 2;
            SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
            this.savedStateHandleHolder = savedStateHandleHolder;
            if (savedStateHandleHolder.isInvalid()) {
                int i4 = getAsAtTimestamp + 49;
                copy = i4 % 128;
                if (i4 % 2 != 0) {
                    this.savedStateHandleHolder.setExtras(getDefaultViewModelCreationExtras());
                    int i5 = 53 / 0;
                } else {
                    this.savedStateHandleHolder.setExtras(getDefaultViewModelCreationExtras());
                }
                int i6 = getAsAtTimestamp + 101;
                copy = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private static void f(char c2, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i5 = $11 + 7;
            $10 = i5 % 128;
            int i6 = i5 % i3;
            int i7 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component2[i + i7])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1758, 34 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) View.resolveSize(0, 0), 1159210934, false, $$n(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(ShareDataUIState), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 28 - MotionEvent.axisFromString(""), (char) (7171 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 1951385784, false, $$n(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i7] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 4013, Color.green(0) + 24, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 27761), -1529629956, false, $$n(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i8 = $11 + 95;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i3 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            try {
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 4013, 24 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 27761), -1529629956, false, $$n(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void j(int i, char c2, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i];
        cancelnotification.copydefault = 0;
        int i4 = $11 + 65;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (cancelnotification.copydefault < i) {
            int i6 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component3[i2 + i6])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1758 - TextUtils.getTrimmedLength(""), 34 - TextUtils.indexOf("", ""), (char) (Process.myTid() >> 22), 1159210934, false, $$n(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component1), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3607 - MotionEvent.axisFromString(""), TextUtils.getOffsetBefore("", 0) + 29, (char) (7170 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1951385784, false, $$n(b4, b5, (byte) (b5 - 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 4014, 24 - View.resolveSizeAndState(0, 0, 0), (char) (Color.alpha(0) + 27761), -1529629956, false, $$n(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i) {
            int i7 = $11 + 61;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
            Object[] objArr5 = {cancelnotification, cancelnotification};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - ExpandableListView.getPackedPositionGroup(0L), 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (27761 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), -1529629956, false, $$n(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void g(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (true) {
            i4 = -476425232;
            if (iTrustedWebActivityServiceStub.ShareDataUIState >= i2) {
                break;
            }
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i6 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - TextUtils.getCapsMode("", 0, 0), 'V' - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 26860), 2015799920, false, $$n(b2, (byte) (b2 | 57), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7406, 17 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) Color.blue(0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
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
                int i7 = $11 + 31;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                try {
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 7406, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 15, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    int i9 = $11 + 19;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = -476425232;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        Object obj = null;
        Object[] objArr2 = new Object[1];
        f((char) (18615 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, 18 - View.getDefaultSize(0, 0), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 18 - TextUtils.getOffsetAfter("", 0), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952847_res_0x7f1304cf).substring(21, 22).length() + 4, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = getAsAtTimestamp + 25;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                f((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 33645), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952754_res_0x7f130472).substring(2, 3).codePointAt(0) - 9, 25 - MotionEvent.axisFromString(""), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f((char) View.MeasureSpec.getMode(0), 50 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = getAsAtTimestamp + 63;
                copy = i4 % 128;
                if (i4 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 6618, 42 - View.combineMeasuredStates(0, 0), (char) (Process.myTid() >> 22), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 34528), (Process.myTid() >> 22) + 67, 48 - (ViewConfiguration.getTouchSlop() >> 8), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 55400), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 69, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952805_res_0x7f1304a5).substring(19, 20).length() + 63, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) - 32), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952721_res_0x7f130451).substring(6, 7).length() + 178, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952812_res_0x7f1304ac).substring(55, 56).codePointAt(0) + 32, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(new char[]{22, 15, CharUtils.CR, 27, 28, 65495, 30, 65498, 65495, CharUtils.CR, 30, CharUtils.CR, 22, 28, 27, 16, 28, 28, 24, 27, 65506, 65495, 65495, 65502, 65501, 65504, 65503, 65499, 14, 65500, 65501, 65497, 65502, 65498, 65498, 65500, 65503, 11, '\n', 65494, 28, 16, JSONLexer.EOI, CharUtils.CR, '\t', 28, 11, '\t', 27, 28, 65494, 15, 29, '\t', JSONLexer.EOI, '\f', 27, 25, 29, '\t', JSONLexer.EOI, CharUtils.CR, 65494, 11, 23, 21, 65495, '\t', 24, 17, 65495, 17}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953647_res_0x7f1307ef).substring(0, 4).length() + 11, false, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 43, 140 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f((char) (ViewConfiguration.getTapTimeout() >> 16), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 214, 5 - TextUtils.indexOf((CharSequence) "", '0'), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    g(new char[]{'(', 65529, 65520, '%', 65523, 65527, '$', 65520, 65529, 65528, 65528, 65527, 65520, 65523, 65531, 65523, 65523, 65520, 65529, '%', 65526, 65527, 65529, '$', 65524, '\'', 65523, 65530, 65527, '$', 65529, 65532, 65527, 65531, '(', 65527}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952715_res_0x7f13044b).substring(6, 7).length() + 25, true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 7, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 83, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 56, (char) View.MeasureSpec.getSize(0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-610792312);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 67, 33 - (Process.myPid() >> 22), (char) (19696 - (ViewConfiguration.getLongPressTimeout() >> 16)), 516019181, false, "component1", null);
        }
        Object obj2 = ((Field) objCopydefault3).get(null);
        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-233037212);
        if (objCopydefault4 == null) {
            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 67, 34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (KeyEvent.normalizeMetaState(0) + 19696), 927333633, false, "component2", new Class[0]);
        }
        ((Method) objCopydefault4).invoke(obj2, null);
        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault5 == null) {
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2405;
            int gidForName = 25 - Process.getGidForName("");
            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            h((byte) (-bArr[1]), (byte) (-bArr[22]), bArr[33], objArr13);
            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, gidForName, maximumFlingVelocity, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault5).getLong(null) != -1) {
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault6 == null) {
                int touchSlop = 2405 - (ViewConfiguration.getTouchSlop() >> 8);
                int i5 = 26 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                Object[] objArr14 = new Object[1];
                h(r2[95], (byte) (-$$d[22]), r2[81], objArr14);
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(touchSlop, i5, c2, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault6).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            g(new char[]{18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 26, false, 15 - TextUtils.lastIndexOf("", '0', 0, 0), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952793_res_0x7f130499).substring(6, 7).codePointAt(0) + 117, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            g(new char[]{19, 65506, 65531, CharUtils.CR, 2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).length() + 8, false, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952719_res_0x7f13044f).substring(6, 7).codePointAt(0) - 16, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 44, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 1687964853};
                byte[] bArr2 = $$j;
                byte b2 = bArr2[17];
                Object[] objArr18 = new Object[1];
                i(b2, (byte) (b2 - 1), (byte) (-bArr2[44]), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b3 = (byte) (bArr2[17] - 1);
                Object[] objArr19 = new Object[1];
                i(b3, b3, bArr2[31], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault7 == null) {
                    int iIndexOf = 2404 - TextUtils.indexOf((CharSequence) "", '0');
                    int defaultSize = 26 - View.getDefaultSize(0, 0);
                    char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                    Object[] objArr20 = new Object[1];
                    h(r7[95], (byte) (-$$d[22]), r7[81], objArr20);
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, defaultSize, deadChar, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault7).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    g(new char[]{'\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f'}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, true, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) - 10, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952720_res_0x7f130450).substring(6, 7).length() + 149, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(25) + 8424), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(22) + 147, 16 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault8 == null) {
                        int mode = View.MeasureSpec.getMode(0) + 2405;
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                        char gidForName2 = (char) ((-1) - Process.getGidForName(""));
                        byte b4 = $$d[33];
                        Object[] objArr23 = new Object[1];
                        h(b4, (byte) (b4 | 10), r8[21], objArr23);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(mode, packedPositionType, gidForName2, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault9 == null) {
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 2405;
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 26;
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                        byte[] bArr3 = $$d;
                        Object[] objArr24 = new Object[1];
                        h((byte) (-bArr3[1]), (byte) (-bArr3[22]), bArr3[33], objArr24);
                        objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, tapTimeout, cAxisFromString, -2047739879, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault9).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i6 = ((int[]) objArr[0])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i7 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.resolveSize(0, 0), TextUtils.getOffsetAfter("", 0) + 42, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault10).invoke(null, null);
            try {
                Object[] objArr25 = {-286321631, Long.valueOf(j3), new ArrayList(), null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0'), 56 - (ViewConfiguration.getTouchSlop() >> 8), (char) (Process.myTid() >> 22));
                byte b5 = (byte) ($$j[17] - 1);
                Object[] objArr26 = new Object[1];
                i(b5, b5, r1[31], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override
    public void onDestroy() {
        SavedStateHandleHolder savedStateHandleHolder;
        int i = 2 % 2;
        int i2 = copy + 81;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            savedStateHandleHolder = this.savedStateHandleHolder;
            int i3 = 77 / 0;
            if (savedStateHandleHolder == null) {
                return;
            }
        } else {
            super.onDestroy();
            savedStateHandleHolder = this.savedStateHandleHolder;
            if (savedStateHandleHolder == null) {
                return;
            }
        }
        savedStateHandleHolder.clear();
        int i4 = getAsAtTimestamp + 41;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = componentManager().generatedComponent();
        int i4 = copy + 19;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return objGeneratedComponent;
    }

    protected ActivityComponentManager createComponentManager() {
        int i = 2 % 2;
        ActivityComponentManager activityComponentManager = new ActivityComponentManager(this);
        int i2 = copy + 57;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return activityComponentManager;
    }

    @Override
    public final ActivityComponentManager componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }

    protected void inject() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 29;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            if (this.injected) {
                return;
            }
            int i4 = i2 + 39;
            copy = i4 % 128;
            int i5 = i4 % 2;
            this.injected = true;
            ((FixedDataFamilyShareActivity_GeneratedInjector) generatedComponent()).injectFixedDataFamilyShareActivity((FixedDataFamilyShareActivity) UnsafeCasts.unsafeCast(this));
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 1;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.Factory activityFactory = DefaultViewModelFactories.getActivityFactory(this, super.getDefaultViewModelProviderFactory());
        int i4 = getAsAtTimestamp + 103;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return activityFactory;
        }
        throw null;
    }

    @Override
    public void onResume() {
        int i = 2 % 2;
        int i2 = copy + 35;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr = new Object[1];
                f((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 33616), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952793_res_0x7f130499).substring(6, 7).length() + 22, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 26, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                f((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952848_res_0x7f1304d0).substring(39, 40).codePointAt(0) + 17, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952848_res_0x7f1304d0).substring(39, 40).length() + 17, objArr2);
                baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6618, 42 - (KeyEvent.getMaxKeyCode() >> 16), (char) TextUtils.getCapsMode("", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (KeyEvent.getMaxKeyCode() >> 16), 56 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), -699576857, false, "component2", new Class[]{Context.class});
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
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-610792312);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 67, 32 - ExpandableListView.getPackedPositionChild(0L), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 19696), 516019181, false, "component1", null);
            }
            Object obj2 = ((Field) objCopydefault3).get(null);
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-233037212);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - Color.green(0), 33 - Color.argb(0, 0, 0, 0), (char) (19696 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 927333633, false, "component2", new Class[0]);
            }
            ((Method) objCopydefault4).invoke(obj2, null);
            super.onResume();
            int i3 = copy + 19;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 80 / 0;
                return;
            }
            return;
        }
        getBaseContext();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00dc  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(68:884|128|129|(0)(0)|142|797|143|(0)|146|899|147|(0)|150|151|174|(3:894|175|(0)(0))|328|(8:881|329|(0)|332|(0)(0)|360|(1:361)|907)|415|808|416|(0)|419|(0)(0)|447|(1:448)|914|504|(0)|507|(0)|510|(0)(0)|516|537|(0)(0)|555|(0)|558|(0)(0)|581|(0)(0)|602|805|603|(0)|606|(0)|609|(0)(0)|647|(1:648)|926|690|703|(0)|706|(0)(0)|712|727|(0)(0)|737|(0)|740|(0)(0)|746|764|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x1e2d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x1e2e, code lost:
    
        r9 = new java.lang.Object[1];
        f((char) (((android.content.Context) java.lang.Class.forName(r30).getMethod(r15, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 111), ((android.content.Context) java.lang.Class.forName(r30).getMethod(r15, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(1) + 251, 10 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), r9);
        r2 = (java.lang.String) r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x1e8e, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r3);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x1ea5, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x1ea9, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
        r11 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r11 - ((r11 >> 63) << 32)));
        r11 = 0;
        r1 = ((((long) 19) << 32) | (r11 - ((r11 >> 63) << 32))) | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x1ed9, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x1edd, code lost:
    
        if (r4 == null) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x1edf, code lost:
    
        r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - (android.os.Process.myPid() >> 22), 41 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), (char) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x1f0c, code lost:
    
        r4 = ((java.lang.reflect.Method) r4).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x1f14, code lost:
    
        r9 = new java.lang.Object[]{-1895815872, java.lang.Long.valueOf(r1), r3, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6561 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), 56 - android.view.View.resolveSize(0, 0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
        r5 = (byte) (com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.$$j[17] - 1);
        r10 = new java.lang.Object[1];
        i(r5, r5, r2[31], r10);
        r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r4, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x30a7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x30a8, code lost:
    
        r10 = new java.lang.Object[1];
        f((char) (((android.content.Context) java.lang.Class.forName(r30).getMethod(r4, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952767_res_0x7f13047f).substring(12, 13).codePointAt(0) + 22678), ((android.content.Context) java.lang.Class.forName(r30).getMethod(r4, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(14) + 198, ((android.content.Context) java.lang.Class.forName(r30).getMethod(r4, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 19, r10);
        r2 = (java.lang.String) r10[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x3122, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r3);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x3139, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x313d, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
        r11 = r8;
        r7 = -1;
        r13 = 0;
        r7 = (((r7 - ((r7 >> 63) << 32)) | (((long) 0) << 32)) & ((long) 1)) | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x316d, code lost:
    
        r2 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:698:0x3171, code lost:
    
        if (r2 == null) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x3173, code lost:
    
        r2 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.text.TextUtils.indexOf(r12, r12, 0) + 6618, android.text.TextUtils.lastIndexOf(r12, '0') + 43, (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x319d, code lost:
    
        r2 = ((java.lang.reflect.Method) r2).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x31a5, code lost:
    
        r9 = new java.lang.Object[]{-1895815872, java.lang.Long.valueOf(r7), r3, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6561 - android.text.TextUtils.lastIndexOf(r12, '0', 0, 0), 56 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) - 1));
        r7 = (byte) (com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.$$j[17] - 1);
        r10 = new java.lang.Object[1];
        i(r7, r7, r3[31], r10);
        r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r2, r9);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x09f7 A[Catch: all -> 0x0569, TryCatch #28 {all -> 0x0569, blocks: (B:322:0x13da, B:324:0x13e0, B:325:0x140a, B:768:0x3ac0, B:770:0x3ac6, B:771:0x3ae6, B:748:0x390a, B:750:0x392d, B:751:0x397a, B:731:0x3790, B:733:0x3796, B:734:0x37bf, B:697:0x316d, B:699:0x3173, B:700:0x319d, B:594:0x2a42, B:596:0x2a48, B:597:0x2a72, B:599:0x2aac, B:600:0x2af7, B:565:0x2799, B:567:0x27ae, B:568:0x27dd, B:547:0x24a7, B:549:0x24ad, B:550:0x24d4, B:552:0x250e, B:553:0x2550, B:518:0x2150, B:520:0x2165, B:521:0x2195, B:523:0x21c9, B:524:0x2242, B:498:0x1ed9, B:500:0x1edf, B:501:0x1f0c, B:409:0x1967, B:411:0x196d, B:412:0x1995, B:168:0x0c66, B:170:0x0c6c, B:171:0x0c95, B:123:0x09f1, B:125:0x09f7, B:126:0x0a20, B:19:0x0227, B:21:0x022d, B:22:0x0255, B:24:0x04d5, B:26:0x0507, B:27:0x0563, B:603:0x2bf0, B:605:0x2bf6, B:606:0x2c42, B:608:0x2c69, B:609:0x2cad, B:611:0x2cc0, B:613:0x2cc9, B:614:0x2d0f, B:647:0x2f63, B:648:0x2f67, B:650:0x2f6d, B:653:0x2f85, B:656:0x2f92, B:659:0x2f9f, B:671:0x307e, B:673:0x3084, B:674:0x3085, B:676:0x3087, B:678:0x308e, B:679:0x308f, B:617:0x2d1e, B:619:0x2d22, B:623:0x2d2e, B:625:0x2d34, B:637:0x2e44, B:639:0x2e4a, B:640:0x2e90, B:642:0x2eba, B:643:0x2eff, B:645:0x2f15, B:646:0x2f5d, B:681:0x3091, B:683:0x3098, B:684:0x3099, B:686:0x309b, B:688:0x30a2, B:689:0x30a3, B:667:0x3005, B:662:0x2fce, B:664:0x2fd4, B:665:0x2ffd, B:632:0x2d9e, B:634:0x2dbd, B:635:0x2e38, B:627:0x2d54, B:629:0x2d69, B:630:0x2d97, B:416:0x1a22, B:418:0x1a28, B:419:0x1a6c, B:421:0x1a79, B:423:0x1a82, B:424:0x1ac4, B:447:0x1ce2, B:448:0x1ce6, B:450:0x1cec, B:453:0x1d03, B:456:0x1d10, B:460:0x1d20, B:461:0x1d28, B:473:0x1e07, B:475:0x1e0d, B:476:0x1e0e, B:478:0x1e10, B:480:0x1e17, B:481:0x1e18, B:425:0x1acf, B:437:0x1bd0, B:439:0x1bd6, B:440:0x1c15, B:442:0x1c3f, B:443:0x1c80, B:445:0x1c96, B:446:0x1cdc, B:483:0x1e1a, B:485:0x1e21, B:486:0x1e22, B:488:0x1e24, B:490:0x1e2b, B:491:0x1e2c, B:427:0x1aef, B:429:0x1b04, B:430:0x1b38, B:469:0x1d8c, B:464:0x1d54, B:466:0x1d5a, B:467:0x1d84, B:432:0x1b3f, B:434:0x1b5b, B:435:0x1bc4, B:131:0x0aa3, B:133:0x0aa7, B:154:0x0b98, B:156:0x0b9e, B:157:0x0b9f, B:159:0x0ba1, B:161:0x0ba8, B:162:0x0ba9, B:137:0x0ab3, B:143:0x0abe, B:145:0x0ad3, B:146:0x0b08, B:147:0x0b0e, B:149:0x0b1b, B:150:0x0b8b, B:329:0x148d, B:331:0x1493, B:332:0x14d5, B:334:0x14e2, B:336:0x14eb, B:337:0x1530, B:360:0x174a, B:361:0x174e, B:363:0x1754, B:366:0x176c, B:369:0x1779, B:372:0x1786, B:384:0x1863, B:386:0x1869, B:387:0x186a, B:389:0x186c, B:391:0x1873, B:392:0x1874, B:338:0x153b, B:350:0x1631, B:352:0x1637, B:353:0x167a, B:355:0x16a4, B:356:0x16e5, B:358:0x16fb, B:359:0x1744, B:394:0x1876, B:396:0x187d, B:397:0x187e, B:399:0x1880, B:401:0x1887, B:402:0x1888), top: B:848:0x0227, inners: #4, #6, #11, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0ad3 A[Catch: all -> 0x0ba0, TryCatch #0 {all -> 0x0ba0, blocks: (B:143:0x0abe, B:145:0x0ad3, B:146:0x0b08), top: B:797:0x0abe, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0b1b A[Catch: all -> 0x0b96, TryCatch #55 {all -> 0x0b96, blocks: (B:147:0x0b0e, B:149:0x0b1b, B:150:0x0b8b), top: B:899:0x0b0e, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0d1d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0d6d A[Catch: all -> 0x1313, PHI: r2
  0x0d6d: PHI (r2v731 java.lang.Object) = (r2v730 java.lang.Object), (r2v803 java.lang.Object) binds: [B:176:0x0d1b, B:178:0x0d1e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #52 {all -> 0x1313, blocks: (B:175:0x0d17, B:183:0x0d6d), top: B:894:0x0d17 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0de3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0dfb  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0e61  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x11bd A[Catch: all -> 0x12de, TryCatch #22 {all -> 0x12de, blocks: (B:254:0x11b3, B:255:0x11b7, B:257:0x11bd, B:260:0x11d8, B:244:0x10eb, B:249:0x1150, B:253:0x11ab), top: B:837:0x10eb }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x13e0 A[Catch: all -> 0x0569, TryCatch #28 {all -> 0x0569, blocks: (B:322:0x13da, B:324:0x13e0, B:325:0x140a, B:768:0x3ac0, B:770:0x3ac6, B:771:0x3ae6, B:748:0x390a, B:750:0x392d, B:751:0x397a, B:731:0x3790, B:733:0x3796, B:734:0x37bf, B:697:0x316d, B:699:0x3173, B:700:0x319d, B:594:0x2a42, B:596:0x2a48, B:597:0x2a72, B:599:0x2aac, B:600:0x2af7, B:565:0x2799, B:567:0x27ae, B:568:0x27dd, B:547:0x24a7, B:549:0x24ad, B:550:0x24d4, B:552:0x250e, B:553:0x2550, B:518:0x2150, B:520:0x2165, B:521:0x2195, B:523:0x21c9, B:524:0x2242, B:498:0x1ed9, B:500:0x1edf, B:501:0x1f0c, B:409:0x1967, B:411:0x196d, B:412:0x1995, B:168:0x0c66, B:170:0x0c6c, B:171:0x0c95, B:123:0x09f1, B:125:0x09f7, B:126:0x0a20, B:19:0x0227, B:21:0x022d, B:22:0x0255, B:24:0x04d5, B:26:0x0507, B:27:0x0563, B:603:0x2bf0, B:605:0x2bf6, B:606:0x2c42, B:608:0x2c69, B:609:0x2cad, B:611:0x2cc0, B:613:0x2cc9, B:614:0x2d0f, B:647:0x2f63, B:648:0x2f67, B:650:0x2f6d, B:653:0x2f85, B:656:0x2f92, B:659:0x2f9f, B:671:0x307e, B:673:0x3084, B:674:0x3085, B:676:0x3087, B:678:0x308e, B:679:0x308f, B:617:0x2d1e, B:619:0x2d22, B:623:0x2d2e, B:625:0x2d34, B:637:0x2e44, B:639:0x2e4a, B:640:0x2e90, B:642:0x2eba, B:643:0x2eff, B:645:0x2f15, B:646:0x2f5d, B:681:0x3091, B:683:0x3098, B:684:0x3099, B:686:0x309b, B:688:0x30a2, B:689:0x30a3, B:667:0x3005, B:662:0x2fce, B:664:0x2fd4, B:665:0x2ffd, B:632:0x2d9e, B:634:0x2dbd, B:635:0x2e38, B:627:0x2d54, B:629:0x2d69, B:630:0x2d97, B:416:0x1a22, B:418:0x1a28, B:419:0x1a6c, B:421:0x1a79, B:423:0x1a82, B:424:0x1ac4, B:447:0x1ce2, B:448:0x1ce6, B:450:0x1cec, B:453:0x1d03, B:456:0x1d10, B:460:0x1d20, B:461:0x1d28, B:473:0x1e07, B:475:0x1e0d, B:476:0x1e0e, B:478:0x1e10, B:480:0x1e17, B:481:0x1e18, B:425:0x1acf, B:437:0x1bd0, B:439:0x1bd6, B:440:0x1c15, B:442:0x1c3f, B:443:0x1c80, B:445:0x1c96, B:446:0x1cdc, B:483:0x1e1a, B:485:0x1e21, B:486:0x1e22, B:488:0x1e24, B:490:0x1e2b, B:491:0x1e2c, B:427:0x1aef, B:429:0x1b04, B:430:0x1b38, B:469:0x1d8c, B:464:0x1d54, B:466:0x1d5a, B:467:0x1d84, B:432:0x1b3f, B:434:0x1b5b, B:435:0x1bc4, B:131:0x0aa3, B:133:0x0aa7, B:154:0x0b98, B:156:0x0b9e, B:157:0x0b9f, B:159:0x0ba1, B:161:0x0ba8, B:162:0x0ba9, B:137:0x0ab3, B:143:0x0abe, B:145:0x0ad3, B:146:0x0b08, B:147:0x0b0e, B:149:0x0b1b, B:150:0x0b8b, B:329:0x148d, B:331:0x1493, B:332:0x14d5, B:334:0x14e2, B:336:0x14eb, B:337:0x1530, B:360:0x174a, B:361:0x174e, B:363:0x1754, B:366:0x176c, B:369:0x1779, B:372:0x1786, B:384:0x1863, B:386:0x1869, B:387:0x186a, B:389:0x186c, B:391:0x1873, B:392:0x1874, B:338:0x153b, B:350:0x1631, B:352:0x1637, B:353:0x167a, B:355:0x16a4, B:356:0x16e5, B:358:0x16fb, B:359:0x1744, B:394:0x1876, B:396:0x187d, B:397:0x187e, B:399:0x1880, B:401:0x1887, B:402:0x1888), top: B:848:0x0227, inners: #4, #6, #11, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x1493 A[Catch: all -> 0x1889, TryCatch #45 {all -> 0x1889, blocks: (B:329:0x148d, B:331:0x1493, B:332:0x14d5, B:334:0x14e2, B:336:0x14eb, B:337:0x1530, B:360:0x174a, B:361:0x174e, B:363:0x1754, B:366:0x176c, B:369:0x1779, B:372:0x1786, B:384:0x1863, B:386:0x1869, B:387:0x186a, B:389:0x186c, B:391:0x1873, B:392:0x1874, B:338:0x153b, B:350:0x1631, B:352:0x1637, B:353:0x167a, B:355:0x16a4, B:356:0x16e5, B:358:0x16fb, B:359:0x1744, B:394:0x1876, B:396:0x187d, B:397:0x187e, B:399:0x1880, B:401:0x1887, B:402:0x1888, B:380:0x17e9, B:375:0x17b2, B:377:0x17b8, B:378:0x17e1, B:345:0x15aa, B:347:0x15bf, B:348:0x1625, B:340:0x155b, B:342:0x1570, B:343:0x15a3), top: B:881:0x148d, outer: #28, inners: #26, #29, #34, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x14e2 A[Catch: all -> 0x1889, TryCatch #45 {all -> 0x1889, blocks: (B:329:0x148d, B:331:0x1493, B:332:0x14d5, B:334:0x14e2, B:336:0x14eb, B:337:0x1530, B:360:0x174a, B:361:0x174e, B:363:0x1754, B:366:0x176c, B:369:0x1779, B:372:0x1786, B:384:0x1863, B:386:0x1869, B:387:0x186a, B:389:0x186c, B:391:0x1873, B:392:0x1874, B:338:0x153b, B:350:0x1631, B:352:0x1637, B:353:0x167a, B:355:0x16a4, B:356:0x16e5, B:358:0x16fb, B:359:0x1744, B:394:0x1876, B:396:0x187d, B:397:0x187e, B:399:0x1880, B:401:0x1887, B:402:0x1888, B:380:0x17e9, B:375:0x17b2, B:377:0x17b8, B:378:0x17e1, B:345:0x15aa, B:347:0x15bf, B:348:0x1625, B:340:0x155b, B:342:0x1570, B:343:0x15a3), top: B:881:0x148d, outer: #28, inners: #26, #29, #34, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x153b A[Catch: all -> 0x1889, TRY_LEAVE, TryCatch #45 {all -> 0x1889, blocks: (B:329:0x148d, B:331:0x1493, B:332:0x14d5, B:334:0x14e2, B:336:0x14eb, B:337:0x1530, B:360:0x174a, B:361:0x174e, B:363:0x1754, B:366:0x176c, B:369:0x1779, B:372:0x1786, B:384:0x1863, B:386:0x1869, B:387:0x186a, B:389:0x186c, B:391:0x1873, B:392:0x1874, B:338:0x153b, B:350:0x1631, B:352:0x1637, B:353:0x167a, B:355:0x16a4, B:356:0x16e5, B:358:0x16fb, B:359:0x1744, B:394:0x1876, B:396:0x187d, B:397:0x187e, B:399:0x1880, B:401:0x1887, B:402:0x1888, B:380:0x17e9, B:375:0x17b2, B:377:0x17b8, B:378:0x17e1, B:345:0x15aa, B:347:0x15bf, B:348:0x1625, B:340:0x155b, B:342:0x1570, B:343:0x15a3), top: B:881:0x148d, outer: #28, inners: #26, #29, #34, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x1754 A[Catch: all -> 0x1889, TryCatch #45 {all -> 0x1889, blocks: (B:329:0x148d, B:331:0x1493, B:332:0x14d5, B:334:0x14e2, B:336:0x14eb, B:337:0x1530, B:360:0x174a, B:361:0x174e, B:363:0x1754, B:366:0x176c, B:369:0x1779, B:372:0x1786, B:384:0x1863, B:386:0x1869, B:387:0x186a, B:389:0x186c, B:391:0x1873, B:392:0x1874, B:338:0x153b, B:350:0x1631, B:352:0x1637, B:353:0x167a, B:355:0x16a4, B:356:0x16e5, B:358:0x16fb, B:359:0x1744, B:394:0x1876, B:396:0x187d, B:397:0x187e, B:399:0x1880, B:401:0x1887, B:402:0x1888, B:380:0x17e9, B:375:0x17b2, B:377:0x17b8, B:378:0x17e1, B:345:0x15aa, B:347:0x15bf, B:348:0x1625, B:340:0x155b, B:342:0x1570, B:343:0x15a3), top: B:881:0x148d, outer: #28, inners: #26, #29, #34, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x1a28 A[Catch: all -> 0x1e2d, TryCatch #6 {all -> 0x1e2d, blocks: (B:416:0x1a22, B:418:0x1a28, B:419:0x1a6c, B:421:0x1a79, B:423:0x1a82, B:424:0x1ac4, B:447:0x1ce2, B:448:0x1ce6, B:450:0x1cec, B:453:0x1d03, B:456:0x1d10, B:460:0x1d20, B:461:0x1d28, B:473:0x1e07, B:475:0x1e0d, B:476:0x1e0e, B:478:0x1e10, B:480:0x1e17, B:481:0x1e18, B:425:0x1acf, B:437:0x1bd0, B:439:0x1bd6, B:440:0x1c15, B:442:0x1c3f, B:443:0x1c80, B:445:0x1c96, B:446:0x1cdc, B:483:0x1e1a, B:485:0x1e21, B:486:0x1e22, B:488:0x1e24, B:490:0x1e2b, B:491:0x1e2c, B:427:0x1aef, B:429:0x1b04, B:430:0x1b38, B:469:0x1d8c, B:464:0x1d54, B:466:0x1d5a, B:467:0x1d84, B:432:0x1b3f, B:434:0x1b5b, B:435:0x1bc4), top: B:808:0x1a22, outer: #28, inners: #1, #42, #49, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x1a79 A[Catch: all -> 0x1e2d, TryCatch #6 {all -> 0x1e2d, blocks: (B:416:0x1a22, B:418:0x1a28, B:419:0x1a6c, B:421:0x1a79, B:423:0x1a82, B:424:0x1ac4, B:447:0x1ce2, B:448:0x1ce6, B:450:0x1cec, B:453:0x1d03, B:456:0x1d10, B:460:0x1d20, B:461:0x1d28, B:473:0x1e07, B:475:0x1e0d, B:476:0x1e0e, B:478:0x1e10, B:480:0x1e17, B:481:0x1e18, B:425:0x1acf, B:437:0x1bd0, B:439:0x1bd6, B:440:0x1c15, B:442:0x1c3f, B:443:0x1c80, B:445:0x1c96, B:446:0x1cdc, B:483:0x1e1a, B:485:0x1e21, B:486:0x1e22, B:488:0x1e24, B:490:0x1e2b, B:491:0x1e2c, B:427:0x1aef, B:429:0x1b04, B:430:0x1b38, B:469:0x1d8c, B:464:0x1d54, B:466:0x1d5a, B:467:0x1d84, B:432:0x1b3f, B:434:0x1b5b, B:435:0x1bc4), top: B:808:0x1a22, outer: #28, inners: #1, #42, #49, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x1acf A[Catch: all -> 0x1e2d, TRY_LEAVE, TryCatch #6 {all -> 0x1e2d, blocks: (B:416:0x1a22, B:418:0x1a28, B:419:0x1a6c, B:421:0x1a79, B:423:0x1a82, B:424:0x1ac4, B:447:0x1ce2, B:448:0x1ce6, B:450:0x1cec, B:453:0x1d03, B:456:0x1d10, B:460:0x1d20, B:461:0x1d28, B:473:0x1e07, B:475:0x1e0d, B:476:0x1e0e, B:478:0x1e10, B:480:0x1e17, B:481:0x1e18, B:425:0x1acf, B:437:0x1bd0, B:439:0x1bd6, B:440:0x1c15, B:442:0x1c3f, B:443:0x1c80, B:445:0x1c96, B:446:0x1cdc, B:483:0x1e1a, B:485:0x1e21, B:486:0x1e22, B:488:0x1e24, B:490:0x1e2b, B:491:0x1e2c, B:427:0x1aef, B:429:0x1b04, B:430:0x1b38, B:469:0x1d8c, B:464:0x1d54, B:466:0x1d5a, B:467:0x1d84, B:432:0x1b3f, B:434:0x1b5b, B:435:0x1bc4), top: B:808:0x1a22, outer: #28, inners: #1, #42, #49, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x1cec A[Catch: all -> 0x1e2d, TryCatch #6 {all -> 0x1e2d, blocks: (B:416:0x1a22, B:418:0x1a28, B:419:0x1a6c, B:421:0x1a79, B:423:0x1a82, B:424:0x1ac4, B:447:0x1ce2, B:448:0x1ce6, B:450:0x1cec, B:453:0x1d03, B:456:0x1d10, B:460:0x1d20, B:461:0x1d28, B:473:0x1e07, B:475:0x1e0d, B:476:0x1e0e, B:478:0x1e10, B:480:0x1e17, B:481:0x1e18, B:425:0x1acf, B:437:0x1bd0, B:439:0x1bd6, B:440:0x1c15, B:442:0x1c3f, B:443:0x1c80, B:445:0x1c96, B:446:0x1cdc, B:483:0x1e1a, B:485:0x1e21, B:486:0x1e22, B:488:0x1e24, B:490:0x1e2b, B:491:0x1e2c, B:427:0x1aef, B:429:0x1b04, B:430:0x1b38, B:469:0x1d8c, B:464:0x1d54, B:466:0x1d5a, B:467:0x1d84, B:432:0x1b3f, B:434:0x1b5b, B:435:0x1bc4), top: B:808:0x1a22, outer: #28, inners: #1, #42, #49, #56 }] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x1f95  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x1fff  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x2055  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x2132  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x2377  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x2467  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x2676  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x26c4  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x2779  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x2917  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x29f5  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x2bf6 A[Catch: all -> 0x30a7, TryCatch #4 {all -> 0x30a7, blocks: (B:603:0x2bf0, B:605:0x2bf6, B:606:0x2c42, B:608:0x2c69, B:609:0x2cad, B:611:0x2cc0, B:613:0x2cc9, B:614:0x2d0f, B:647:0x2f63, B:648:0x2f67, B:650:0x2f6d, B:653:0x2f85, B:656:0x2f92, B:659:0x2f9f, B:671:0x307e, B:673:0x3084, B:674:0x3085, B:676:0x3087, B:678:0x308e, B:679:0x308f, B:617:0x2d1e, B:619:0x2d22, B:623:0x2d2e, B:625:0x2d34, B:637:0x2e44, B:639:0x2e4a, B:640:0x2e90, B:642:0x2eba, B:643:0x2eff, B:645:0x2f15, B:646:0x2f5d, B:681:0x3091, B:683:0x3098, B:684:0x3099, B:686:0x309b, B:688:0x30a2, B:689:0x30a3, B:667:0x3005, B:662:0x2fce, B:664:0x2fd4, B:665:0x2ffd, B:632:0x2d9e, B:634:0x2dbd, B:635:0x2e38, B:627:0x2d54, B:629:0x2d69, B:630:0x2d97), top: B:805:0x2bf0, outer: #28, inners: #38, #43, #51, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:608:0x2c69 A[Catch: all -> 0x30a7, TryCatch #4 {all -> 0x30a7, blocks: (B:603:0x2bf0, B:605:0x2bf6, B:606:0x2c42, B:608:0x2c69, B:609:0x2cad, B:611:0x2cc0, B:613:0x2cc9, B:614:0x2d0f, B:647:0x2f63, B:648:0x2f67, B:650:0x2f6d, B:653:0x2f85, B:656:0x2f92, B:659:0x2f9f, B:671:0x307e, B:673:0x3084, B:674:0x3085, B:676:0x3087, B:678:0x308e, B:679:0x308f, B:617:0x2d1e, B:619:0x2d22, B:623:0x2d2e, B:625:0x2d34, B:637:0x2e44, B:639:0x2e4a, B:640:0x2e90, B:642:0x2eba, B:643:0x2eff, B:645:0x2f15, B:646:0x2f5d, B:681:0x3091, B:683:0x3098, B:684:0x3099, B:686:0x309b, B:688:0x30a2, B:689:0x30a3, B:667:0x3005, B:662:0x2fce, B:664:0x2fd4, B:665:0x2ffd, B:632:0x2d9e, B:634:0x2dbd, B:635:0x2e38, B:627:0x2d54, B:629:0x2d69, B:630:0x2d97), top: B:805:0x2bf0, outer: #28, inners: #38, #43, #51, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:611:0x2cc0 A[Catch: all -> 0x30a7, TryCatch #4 {all -> 0x30a7, blocks: (B:603:0x2bf0, B:605:0x2bf6, B:606:0x2c42, B:608:0x2c69, B:609:0x2cad, B:611:0x2cc0, B:613:0x2cc9, B:614:0x2d0f, B:647:0x2f63, B:648:0x2f67, B:650:0x2f6d, B:653:0x2f85, B:656:0x2f92, B:659:0x2f9f, B:671:0x307e, B:673:0x3084, B:674:0x3085, B:676:0x3087, B:678:0x308e, B:679:0x308f, B:617:0x2d1e, B:619:0x2d22, B:623:0x2d2e, B:625:0x2d34, B:637:0x2e44, B:639:0x2e4a, B:640:0x2e90, B:642:0x2eba, B:643:0x2eff, B:645:0x2f15, B:646:0x2f5d, B:681:0x3091, B:683:0x3098, B:684:0x3099, B:686:0x309b, B:688:0x30a2, B:689:0x30a3, B:667:0x3005, B:662:0x2fce, B:664:0x2fd4, B:665:0x2ffd, B:632:0x2d9e, B:634:0x2dbd, B:635:0x2e38, B:627:0x2d54, B:629:0x2d69, B:630:0x2d97), top: B:805:0x2bf0, outer: #28, inners: #38, #43, #51, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:615:0x2d1a  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x2f6d A[Catch: all -> 0x30a7, TryCatch #4 {all -> 0x30a7, blocks: (B:603:0x2bf0, B:605:0x2bf6, B:606:0x2c42, B:608:0x2c69, B:609:0x2cad, B:611:0x2cc0, B:613:0x2cc9, B:614:0x2d0f, B:647:0x2f63, B:648:0x2f67, B:650:0x2f6d, B:653:0x2f85, B:656:0x2f92, B:659:0x2f9f, B:671:0x307e, B:673:0x3084, B:674:0x3085, B:676:0x3087, B:678:0x308e, B:679:0x308f, B:617:0x2d1e, B:619:0x2d22, B:623:0x2d2e, B:625:0x2d34, B:637:0x2e44, B:639:0x2e4a, B:640:0x2e90, B:642:0x2eba, B:643:0x2eff, B:645:0x2f15, B:646:0x2f5d, B:681:0x3091, B:683:0x3098, B:684:0x3099, B:686:0x309b, B:688:0x30a2, B:689:0x30a3, B:667:0x3005, B:662:0x2fce, B:664:0x2fd4, B:665:0x2ffd, B:632:0x2d9e, B:634:0x2dbd, B:635:0x2e38, B:627:0x2d54, B:629:0x2d69, B:630:0x2d97), top: B:805:0x2bf0, outer: #28, inners: #38, #43, #51, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:705:0x322a  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x3279  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x32d4  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x3766  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x3771  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x384d  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x38a1  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x38ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x3aa0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x07a2 A[Catch: all -> 0x0783, TRY_ENTER, TRY_LEAVE, TryCatch #40 {all -> 0x0783, blocks: (B:71:0x0741, B:78:0x07a2), top: B:871:0x0741 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x0aa3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:834:0x0d95 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:940:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v118 */
    /* JADX WARN: Type inference failed for: r11v119, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v135 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v137 */
    /* JADX WARN: Type inference failed for: r13v138 */
    /* JADX WARN: Type inference failed for: r13v139 */
    /* JADX WARN: Type inference failed for: r13v140 */
    /* JADX WARN: Type inference failed for: r13v141 */
    /* JADX WARN: Type inference failed for: r13v142 */
    /* JADX WARN: Type inference failed for: r13v144 */
    /* JADX WARN: Type inference failed for: r13v145 */
    /* JADX WARN: Type inference failed for: r13v146 */
    /* JADX WARN: Type inference failed for: r13v147 */
    /* JADX WARN: Type inference failed for: r13v153 */
    /* JADX WARN: Type inference failed for: r13v157 */
    /* JADX WARN: Type inference failed for: r13v160 */
    /* JADX WARN: Type inference failed for: r13v161 */
    /* JADX WARN: Type inference failed for: r13v162 */
    /* JADX WARN: Type inference failed for: r13v163 */
    /* JADX WARN: Type inference failed for: r13v165 */
    /* JADX WARN: Type inference failed for: r13v166 */
    /* JADX WARN: Type inference failed for: r13v167 */
    /* JADX WARN: Type inference failed for: r13v168 */
    /* JADX WARN: Type inference failed for: r13v169 */
    /* JADX WARN: Type inference failed for: r13v170 */
    /* JADX WARN: Type inference failed for: r13v171 */
    /* JADX WARN: Type inference failed for: r13v172 */
    /* JADX WARN: Type inference failed for: r13v173 */
    /* JADX WARN: Type inference failed for: r13v174 */
    /* JADX WARN: Type inference failed for: r13v175 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v55, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
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
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v20 */
    /* JADX WARN: Type inference failed for: r30v21 */
    /* JADX WARN: Type inference failed for: r30v22 */
    /* JADX WARN: Type inference failed for: r30v23 */
    /* JADX WARN: Type inference failed for: r30v24 */
    /* JADX WARN: Type inference failed for: r30v25 */
    /* JADX WARN: Type inference failed for: r30v28 */
    /* JADX WARN: Type inference failed for: r30v29 */
    /* JADX WARN: Type inference failed for: r30v30 */
    /* JADX WARN: Type inference failed for: r30v31 */
    /* JADX WARN: Type inference failed for: r30v32 */
    /* JADX WARN: Type inference failed for: r30v33 */
    /* JADX WARN: Type inference failed for: r30v34 */
    /* JADX WARN: Type inference failed for: r30v47 */
    /* JADX WARN: Type inference failed for: r30v48 */
    /* JADX WARN: Type inference failed for: r30v49 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r31v13 */
    /* JADX WARN: Type inference failed for: r31v37 */
    /* JADX WARN: Type inference failed for: r31v38 */
    /* JADX WARN: Type inference failed for: r31v39 */
    /* JADX WARN: Type inference failed for: r31v40 */
    /* JADX WARN: Type inference failed for: r31v45 */
    /* JADX WARN: Type inference failed for: r31v55 */
    /* JADX WARN: Type inference failed for: r31v56 */
    /* JADX WARN: Type inference failed for: r3v162, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v166, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v385 */
    /* JADX WARN: Type inference failed for: r3v613 */
    /* JADX WARN: Type inference failed for: r4v146, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v147, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v260 */
    /* JADX WARN: Type inference failed for: r4v541 */
    /* JADX WARN: Type inference failed for: r8v149 */
    /* JADX WARN: Type inference failed for: r8v151 */
    /* JADX WARN: Type inference failed for: r8v153 */
    /* JADX WARN: Type inference failed for: r8v158 */
    /* JADX WARN: Type inference failed for: r8v159 */
    /* JADX WARN: Type inference failed for: r8v160 */
    /* JADX WARN: Type inference failed for: r8v161 */
    /* JADX WARN: Type inference failed for: r8v163 */
    /* JADX WARN: Type inference failed for: r8v175 */
    /* JADX WARN: Type inference failed for: r8v180 */
    /* JADX WARN: Type inference failed for: r8v192 */
    /* JADX WARN: Type inference failed for: r8v194 */
    /* JADX WARN: Type inference failed for: r8v199, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v200 */
    /* JADX WARN: Type inference failed for: r8v201 */
    /* JADX WARN: Type inference failed for: r8v202 */
    /* JADX WARN: Type inference failed for: r8v203 */
    /* JADX WARN: Type inference failed for: r8v204 */
    /* JADX WARN: Type inference failed for: r8v205 */
    /* JADX WARN: Type inference failed for: r8v209 */
    /* JADX WARN: Type inference failed for: r8v210 */
    /* JADX WARN: Type inference failed for: r8v243 */
    /* JADX WARN: Type inference failed for: r8v244 */
    /* JADX WARN: Type inference failed for: r8v245 */
    /* JADX WARN: Type inference failed for: r8v246 */
    /* JADX WARN: Type inference failed for: r8v247 */
    /* JADX WARN: Type inference failed for: r8v248 */
    /* JADX WARN: Type inference failed for: r8v249 */
    /* JADX WARN: Type inference failed for: r8v250 */
    /* JADX WARN: Type inference failed for: r8v251 */
    /* JADX WARN: Type inference failed for: r8v252 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v64, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v412, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v469 */
    /* JADX WARN: Type inference failed for: r9v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v470 */
    /* JADX WARN: Type inference failed for: r9v471 */
    /* JADX WARN: Type inference failed for: r9v472 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v481 */
    /* JADX WARN: Type inference failed for: r9v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v490 */
    /* JADX WARN: Type inference failed for: r9v497 */
    /* JADX WARN: Type inference failed for: r9v498 */
    /* JADX WARN: Type inference failed for: r9v499 */
    /* JADX WARN: Type inference failed for: r9v500 */
    /* JADX WARN: Type inference failed for: r9v504 */
    /* JADX WARN: Type inference failed for: r9v505 */
    /* JADX WARN: Type inference failed for: r9v506 */
    /* JADX WARN: Type inference failed for: r9v507 */
    /* JADX WARN: Type inference failed for: r9v508 */
    /* JADX WARN: Type inference failed for: r9v509 */
    /* JADX WARN: Type inference failed for: r9v510 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 99;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        component4 = 1;
        component1();
        component3 = new char[]{10166, 34113, 25166, 53002, 44113, 2375, 63062, 21375, 12392, 40303, 31285, 10104, 33912, 24845, 52742, 43796, 2052, 62738, 20995, 16149, 39984, 31023, 9762, 33590, 24617, 52600, 43720, 6083, 62671, 20937, 16074, 39901, 30928, 9724, 33453, 28663, 52474, 43514, 5874, 62348, 20632, 15754, 39582, 18313, 9368, 33252, 28346, 52137, 43243, 5567, 62135, 24501, 15705, 39510, 18242, 9290, 33043, 28279, 52094, 43128, 5486, 62071, 24446, 15460, 39292, 17933, 9011, 32773, 27904, 51743, 46866, 5158, 61753, 24071, 15167, 38973, 17697, 8926, 36810, 27858};
        component1 = 7224859043353636493L;
        int i = equals + 49;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component2 = new char[]{17569, 2500, 56944, 44172, 28935, 51131, 38104, 22792, 12287, 64521, 17098, 5918, 58442, 43725, 32623, 52627, 37395, 24761, 3099, 16741, 38647, 58401, 14778, 36730, 49695, 5547, 26455, 47836, 3168, 24323, 37587, 58410, 14289, 35151, 56507, 12194, 24858, 46243, 1604, 22989, 43896, 65051, 12732, 33543, 54977, 10357, 31736, 52874, '%', 3093, 16745, 38608, 58426, 14779, 36618, 56446, 4561, 26454, 46268, 2622, 24465, 44269, 57973, 14286, 34089, 55993, 10258, 35670, 50788, 4562, 25455, 48809, 2066, 23336, 38580, 57431, 13294, 36133, 55424, 11254, 25958, 45214, 567, 24053, 44812, 64118, 13788, 34590, 53942, 11293, 32724, 51955, 1109, 22421, 41261, 64717, 20052, 39229, 54407, 9746, 29180, 49939, 7800, 27117, 47964, 63208, 16496, 37777, 61177, 14435, 35788, 50491, 4258, 25103, 48419, 54465, 39421, 19988, 15612, 57707, 22485, 1260, 51574, 49041, 27695, 53990, 34633, 29746, 15015, 61276, 23974, 608, 61641, 42431, 27215, 55435, 36135, 29663, 8262, 38203, 23498, 2131, 65262, 41821, 4553, 50857, 35655, 31107, 11873, 40068, 16879, 13950, 58565, 43390, 8118, 52224, 45361, 26542, 54284, 39597, 20324, 15818, 58036, 22391, 1419, 51750, 47247, 27980, 53817, 32969, 29965, 15349, 59482, 24270, 933, 61464, 42632, 27497, 55772, 3142, 16762, 38554, 58412, 14831, 36690, 56376, 4517, 26384, 46255, 2609, 24478, 44217, 57892, 14223, 34082, 55987, 10271, 32055, 45725, '\f', 22003, 43858, 63686, 19890, 33608, 53380, 9835, 31626, 51527, 7721, 21446, 41222, 63210, 17409, 39224, 61103, 15424, 29170, 50997, 5329, 27066, 48939, 3215, 17022, 38893, 58696, 14947, 36775, 56587, 4769, 24657, 46543, 2740, 22554, 44498, 58151, 12425, 34378, 56106, 10392, 32256, 46063, 259, 3151, 16690, 38547, 58492, 14832, 36695, 11599, 24620, 47007, 50532, 6385, 44637, 64818, 12446, 17951, 38385, 11106, 32464, 36283, 49957, 5763, 3143, 16683, 38547, 58495, 14823, 36700, 56380, 4521, 26391, 46324, 2662, 58799, 43212, 32629, 3481, 53259, 26294, 13788, 63561, 36593, 23839, 58247, 3141, 16680, 38545, 58493, 14823, 36691, 56377, 4520, 26389, 46330, 2666, 3150, 16681, 38554, 58481, 14823, 36695, 56382, 4517, 26399, 46334, 21748, 6552, 52781, 48330, 24913, 55268, 33931, 18708, 16297, 60492};
        ShareDataUIState = -317435110556942052L;
        copydefault = -890926422;
    }
}
