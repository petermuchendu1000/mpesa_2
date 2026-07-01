package com.huawei.digitalpayment.mobileapp.report;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.mobileapp.report.repository.EventReportRequest;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.io.encoding.Base64;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.crypto.signers.PSSSigner;

public class ReportIntentService extends IntentService {
    private static final String ACTION_REPORT_CRASH;
    public static final String PARAMS = "params";
    private static int ShareDataUIState = 0;
    private static final String TAG = "ReportIntentService";
    private static int component1;
    private static int component2;
    private static char[] component3;
    private static int component4;
    private static short[] copy;
    private static int copydefault;
    private static byte[] equals;
    private static final byte[] $$c = {9, 8, 112, 107};
    private static final int $$f = 187;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {57, Ascii.SYN, -21, -92, -18, -4, -9, -5, -5, 3, -15, -12, 59, -18, -4, 57, -75, Ascii.FF, -11, -1, -23, 3, 0, -18, -4, 57, -75, 5, 1, -23, 7, -5, -23, 6, TarHeader.LF_DIR, -59, -18, -4, -9, -5, -10, 8, TarHeader.LF_LINK, -59, -18, -5, 2, -9, -15, -1, 6, -25, 5, -12, -5, 58, -27, -50, -5, 2, -9, -15, -1, Ascii.RS, -43, 2, -15, 32, -49, 9, -14, 67, -35, -40, -23, 5, -12, -5, 37, -43, -7, -13, 70, -37, -53, 7, -2, -25, -1, -9, -27, 1, -23, 7, Ascii.ESC, -35, -25, 13, 6, 6, -16, -39, 13, -25, 9, -18, -4, 57, -57, -17, -3, 1, -5, -7, -5, 45, -63, -17, 3, -19, Ascii.VT, -19, 62, -58, -5, -24, 8, TarHeader.LF_LINK, -77, 6, TarHeader.LF_DIR, -79, 8, -1, -9, -4, -21, SignedBytes.MAX_POWER_OF_TWO, -31, -49, 3, -19, Ascii.VT, -19, 41, -43, -3, -4, -14, 35, -51, -15, -18, -7, -15, Ascii.SI, -7, -7, -1, -26, 3, -14, -12, 59, -74, 7, -2, -8, -23, 5, -19, Ascii.VT, -25, 68, -65, -11, -12, 9, -19, -2, 7, -17, 56, -71, -7, 5, -19, Ascii.VT, -25, -1, -9, -7, 63, -71, 7, -23, 8, -19, -10, Ascii.SI, -7, -16, 1, TarHeader.LF_LINK, -39, -25, -23, 8, -19, -10, Ascii.SI, -7, -16, 1, 8, -24, -11, 4, -17, -14, 47, -51, -12, 1, 4, -3, -23, -13, 79, -69, -18, -4, -9, -5, -5, 3, -15, -12, 59};
    private static final int $$e = 200;
    private static final byte[] $$a = {117, -24, -14, 98, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 9, 17, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 177;
    private static int getShareableDataState = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, int r7, int r8) {
        /*
            int r7 = r7 + 65
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r8 = r8 + 4
            byte[] r1 = com.huawei.digitalpayment.mobileapp.report.ReportIntentService.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L20:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L29:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.mobileapp.report.ReportIntentService.$$g(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.mobileapp.report.ReportIntentService.$$a
            int r1 = r6 + 4
            int r8 = 100 - r8
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2e
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r8 = r8 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.mobileapp.report.ReportIntentService.d(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.mobileapp.report.ReportIntentService.$$d
            int r8 = r8 * 2
            int r8 = 105 - r8
            int r6 = 161 - r6
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-6)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.mobileapp.report.ReportIntentService.e(short, int, short, java.lang.Object[]):void");
    }

    public ReportIntentService() {
        super(TAG);
    }

    public static void startReportAction(Context context, HashMap<String, Object> map) {
        int i = 2 % 2;
        Intent intent = new Intent(context, (Class<?>) ReportIntentService.class);
        Object[] objArr = new Object[1];
        a(new char[]{0, 20, 7, 65485, '\f', 14, 2, 65511, 65522, 65504, 65521, 65506, 65485, CharUtils.CR, 14, '\b', 19, 2, 0, 65485, 19, 17, 14, 15, 4, 17, 65485, 15, 15, 0, 4, 11, '\b', 1, 14, '\f', 65485, 19, CharUtils.CR, 4, '\f', 24, 0, 15, 11, 0, 19, '\b', 6, '\b', 3, 65485, '\b', 4, 22}, 168 - TextUtils.indexOf("", "", 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 54, (ViewConfiguration.getFadingEdgeLength() >> 16) + 7, true, objArr);
        intent.setAction(((String) objArr[0]).intern());
        intent.putExtra("params", map);
        context.startService(intent);
        int i2 = getAsAtTimestamp + 123;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    protected void onHandleIntent(Intent intent) throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 85;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        if (intent != null) {
            int i5 = i2 + 49;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            String action = intent.getAction();
            char[] cArr = {0, 20, 7, 65485, '\f', 14, 2, 65511, 65522, 65504, 65521, 65506, 65485, CharUtils.CR, 14, '\b', 19, 2, 0, 65485, 19, 17, 14, 15, 4, 17, 65485, 15, 15, 0, 4, 11, '\b', 1, 14, '\f', 65485, 19, CharUtils.CR, 4, '\f', 24, 0, 15, 11, 0, 19, '\b', 6, '\b', 3, 65485, '\b', 4, 22};
            Object[] objArr = new Object[1];
            b(new int[]{0, 26, 0, 4}, true, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(TextUtils.indexOf((CharSequence) "", '0', 0) + 1480286437, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(23) + 5), (-1351421500) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (short) ((((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.safaricom.mpesa.lifestyle.R.integer._2131427364_res_0x7f0b0024) & (-3)) + 44), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 189, objArr2);
            int iCodePointAt = ((Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 66;
            int i7 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 55;
            Object[] objArr3 = new Object[1];
            b(new int[]{0, 26, 0, 4}, true, null, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(22) + 1480286334, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952716_res_0x7f13044c).substring(6, 7).codePointAt(0) + 74), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) - 1351429725, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952790_res_0x7f130496).substring(7, 8).length() + 44), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(24) - 202, objArr4);
            int iCodePointAt2 = ((Context) cls2.getMethod((String) objArr4[0], new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953368_res_0x7f1306d8).substring(0, 6).codePointAt(2) - 60;
            Object[] objArr5 = new Object[1];
            a(cArr, iCodePointAt, i7, iCodePointAt2, true, objArr5);
            if (((String) objArr5[0]).intern().equals(action)) {
                try {
                    L.d(TAG, "onHandleIntent: " + new EventReportRequest((Map) intent.getSerializableExtra("params")).sendSyncRequest().getResponseCode());
                    int i8 = getAsAtTimestamp + 27;
                    getRequestBeneficiariesState = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Exception e) {
                    L.e(TAG, "onHandleIntent: " + e.getMessage());
                }
            }
        }
    }

    private static void a(char[] cArr, int i, int i2, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.green(0) + 38, (char) (26860 - Drawable.resolveOpacity(0, 0)), 2015799920, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.blue(0) + 16, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 101;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            iTrustedWebActivityServiceStub.component1 = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i8 = $10 + 31;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - (ViewConfiguration.getWindowTouchSlop() >> 8), 16 - (Process.myPid() >> 22), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i10 = $11 + 47;
        $10 = i10 % 128;
        int i11 = i10 % 2;
        objArr[0] = str;
    }

    private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = component3;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 657, (ViewConfiguration.getLongPressTimeout() >> 16) + 14, (char) (65118 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $10 + 101;
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
            int i10 = $11 + 111;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i12 = $11 + 63;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i14 = $11 + 113;
                $10 = i14 % 128;
                if (i14 % 2 == 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != 1 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 0) {
                    int i15 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 3581, KeyEvent.getDeadChar(0, 0) + 28, (char) ((-1) - MotionEvent.axisFromString("")), 1180380354, false, $$g(b2, (byte) (b2 | TarHeader.LF_SYMLINK), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i16 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(0, 0) + 4502, TextUtils.lastIndexOf("", '0', 0) + 37, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 27897), -1464227204, false, $$g(b3, (byte) (b3 | 45), (byte) (-1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 1859, Color.alpha(0) + 34, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 80302927, false, $$g(b4, (byte) (b4 | TarHeader.LF_LINK), (byte) (-1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i17 = $11 + 71;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i19 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i19, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i19);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i20 = $11 + 23;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = iTrustedWebActivityService_Parcel.copydefault;
                    int i22 = i4 % iTrustedWebActivityService_Parcel.copydefault;
                    cArr6[i21] = cArr3[0];
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
            cArr3 = cArr6;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r26, byte r27, int r28, short r29, int r30, java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.mobileapp.report.ReportIntentService.c(int, byte, int, short, int, java.lang.Object[]):void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r44) {
        /*
            Method dump skipped, instruction units count: 14021
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.mobileapp.report.ReportIntentService.attachBaseContext(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x143f  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.mobileapp.report.ReportIntentService.onCreate():void");
    }

    static {
        component4 = 0;
        component2();
        component1();
        Object[] objArr = new Object[1];
        a(new char[]{0, 20, 7, 65485, '\f', 14, 2, 65511, 65522, 65504, 65521, 65506, 65485, CharUtils.CR, 14, '\b', 19, 2, 0, 65485, 19, 17, 14, 15, 4, 17, 65485, 15, 15, 0, 4, 11, '\b', 1, 14, '\f', 65485, 19, CharUtils.CR, 4, '\f', 24, 0, 15, 11, 0, 19, '\b', 6, '\b', 3, 65485, '\b', 4, 22}, 168 - ExpandableListView.getPackedPositionType(0L), 55 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6, true, objArr);
        ACTION_REPORT_CRASH = ((String) objArr[0]).intern();
        int i = getShareableDataState + 11;
        component4 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 63;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        component2 = -890926370;
        int i5 = i2 + 33;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static void component2() {
        component3 = new char[]{33453, 33467, 33457, 33470, 33467, 33470, 33466, 33453, 33463, 33419, 33446, 33451, 33462, 33449, 33462, 33451, 33468, 33438, 33521, 33455, 33455, 33470, 33521, 33467, 33462, 33456, 33513, 33452, 33464, 33408, 33465, 33453, 33452, 33444, 33402, 33446, 33452, 33402, 33451, 33444, 33453, 33446, 33444, 33447, 33446, 33400, 33445, 33401, 33452, 33453, 33402, 33447, 33453, 33399, 33450, 33450, 33401, 33450, 33447, 33401, 33449, 33447, 33445, 33446, 33451, 33448, 33448, 33402, 33400, 33403, 33448, 33453, 33446, 33399, 33402, 33402, 33447, 33448, 33451, 33447, 33452, 33401, 33445, 33399, 33453, 33402, 33448, 33449, 33447, 33451, 33445, 33400, 33404, 33403, 33453, 33515, 33457, 33451, 33453, 33454, 33417, 33515, 33520, 33517, 33514, 33513, 33512, 33514, 33427, 33426, 33515, 33516, 33516, 33515, 33517, 33516, 33514, 33426, 33469, 33431, 33422, 33457, 33458, 33460, 33468, 33461, 33460, 33469, 33461, 33452, 33422, 33429, 33457, 33460, 33462, 33460, 33460, 33453, 33452, 33460, 33462, 33460, 33430, 33431, 33462, 33457, 33425, 33431, 33463, 33459, 33427, 33427, 33460, 33461, 33465, 33459, 33452, 33422, 33421, 33419, 33519, 33429, 33458, 33458, 33462, 33454, 33452, 33517, 33460, 33458, 33456, 33451, 33455, 33461, 33426, 33421, 33450, 33419, 33435, 33461, 33445, 33448, 33455, 33458, 33411, 33412, 33454, 33458, 33460, 33514, 33466, 33460, 33460, 33432, 33426, 33465, 33464, 33461, 33429, 33439, 33465, 33449, 33452, 33459, 33462, 33517, 33467, 33462, 33414, 33418, 33458, 33461, 33419, 33471, 33449, 33457, 33457, 33454, 33462, 33467, 33465, 33284, 33283, 33282, 33397, 33281, 33388, 33343, 33282, 33282, 33396, 33397, 33390, 33388, 33281, 33282, 33388, 33281, 33280, 33394, 33283, 33343, 33388, 33343, 33393, 33284, 33396, 33282, 33343, 33396, 33394, 33280, 33389, 33392, 33391, 33389, 33393, 33388, 33281, 33388, 33395, 33343, 33394, 33283, 33281, 33390, 33391, 33395, 33393, 33281, 33282, 33284, 33391, 33343, 33392, 33391, 33281, 33396, 33394, 33392, 33283, 33280, 33393, 33282, 33390, 33477, 33516, 33515, 33512, 33511, 33514, 33514, 33514, 33515, 33512, 33514, 33521, 33412, 33410, 33409, 33409, 33408, 33409, 33411, 33410, 33408, 33412, 33478, 33514, 33512, 33515, 33516, 33513, 33510, 33511, 33513, 33513, 33529, 33426, 33428, 33429, 33427, 33426, 33427, 33427, 33428, 33430};
        copydefault = 1443883061;
        component1 = -238323841;
        ShareDataUIState = -1589216841;
        equals = new byte[]{-107, 65, Ascii.SYN, 91, 101, 78, 74, 67, SignedBytes.MAX_POWER_OF_TWO, 20, TarHeader.LF_LINK, 83, Ascii.SYN, Ascii.US, 69, 20, 67, 98, -107, 10, Ascii.FF, 8, -122, -97, 40, 40, 81, TarHeader.LF_FIFO, 75, -64, -111, -112, -97, Ascii.FF, -124, Ascii.SI, -13, -18, Base64.padSymbol, -61, 63, -59, 60, 62, Ascii.NAK, 62, -22, -57, -63, -63, Ascii.SI, 60, 63, -64, -59, 63, -18, Ascii.SO, -18, -60, Ascii.SI, -17, -61, Ascii.DC2, -20, -64, -60, Ascii.SI, -20, 17, -14, 58, -64, -61, 19, -13, Ascii.VT, -62, -20, -63, Ascii.DLE, -11, 56, Ascii.CAN, -61, -51, -109, -10, -107, -111, -10, -109, -98, -70, 46, -49, -69, -49, 33, -114, -35, -112, -52, -127, -37, -108, -49, -69, -52, -38, -125, -111, -51, -111, 37, -60, -114, 32, -98, -54, -51, -127, -49, 37, -53, -51, -126, -58, -114, 34, -60, -109, PSSSigner.TRAILER_IMPLICIT, -52, 35, -109, -53, -51, -123, -40, -127, -52, 33, -56, -111, -98, -127, -38, -103, 101, 44, 103, 103, -43, -25, 89, 127, -81, Ascii.ETB, 93, 117, 92, -81, 1, -117, 107, 73, -73, Ascii.SO, 92, -81, 4, 67, 113, 112, 113, 115, 93, 88, 72, 112, 127, 67, -92, 107, 91, 90, -91, 0, -115, -100, -124, -34, -48, -125, -122, -47, -122, -36, -121, -37, -112, 110, -14, 101, -2, -13, 106, -37, Ascii.FS, 111, 120, -53, -1, 101, -9, -61, SignedBytes.MAX_POWER_OF_TWO, -112, -74, -109, -111, 86, -110, -81, 84, -112, -120, 101, 65, -98, -120, 78, -75, 101, -109, -110, 84, -81, 100, -111, 122, -98, 103, 100, -109, -97, 120, -99, -110, 87, -82, -109, 84, -93, 122, 90, -73, -98, 120, -109, 103, -97, 100, 67, -110, 101, -75, 101, 101, -99, 84, 100, -75, 79, -76, SignedBytes.MAX_POWER_OF_TWO, 102, -76, 100, -100, 88, 81, 92, 85, 70, 89, 82, 94, 90, 94};
    }
}
