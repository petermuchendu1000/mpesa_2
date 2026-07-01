package com.huawei.digitalpayment.consumer.home.ui.resp;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import com.huawei.common.interceptor.AppLogInterceptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u001fH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/SecureCallBean;", "", "globalStatus", "", AppLogInterceptor.MESSAGE_ID, "proxiedResponse", "Lcom/huawei/digitalpayment/consumer/home/ui/resp/ProxiedResponse;", "requestId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/home/ui/resp/ProxiedResponse;Ljava/lang/String;)V", "getGlobalStatus", "()Ljava/lang/String;", "setGlobalStatus", "(Ljava/lang/String;)V", "getMessageId", "setMessageId", "getProxiedResponse", "()Lcom/huawei/digitalpayment/consumer/home/ui/resp/ProxiedResponse;", "setProxiedResponse", "(Lcom/huawei/digitalpayment/consumer/home/ui/resp/ProxiedResponse;)V", "getRequestId", "setRequestId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SecureCallBean {
    public static final int $stable = 8;
    private static int component2;
    private static long component3;

    @SerializedName("globalStatus")
    private String globalStatus;

    @SerializedName(AppLogInterceptor.MESSAGE_ID)
    private String messageId;

    @SerializedName("proxiedResponse")
    private ProxiedResponse proxiedResponse;

    @SerializedName("requestId")
    private String requestId;
    private static final byte[] $$c = {107, -21, -54, -113};
    private static final int $$f = 118;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {99, TarHeader.LF_DIR, 44, 107, 17, 3, -58, 56, Ascii.DLE, 2, -2, 4, 6, 4, -46, 62, Ascii.DLE, -4, Ascii.DC2, -12, Ascii.DC2, -63, 67, 8, 10, 5, -6, 1, -50, 70, 1, 3, Ascii.VT, -60, 38, 33, 3, Ascii.VT, -70, 20, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -60};
    private static final int $$e = 116;
    private static final byte[] $$a = {70, -47, -65, TarHeader.LF_BLK, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -25, -30, -26, -26, -18, -36, -33, 40, -39, -31, -7, -38, -34};
    private static final int $$b = 83;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int copydefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r5, short r6, int r7) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.resp.SecureCallBean.$$c
            int r5 = r5 * 2
            int r1 = 1 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
        L29:
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.resp.SecureCallBean.$$g(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.resp.SecureCallBean.$$a
            int r7 = r7 * 4
            int r1 = 10 - r7
            int r8 = r8 * 9
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r6 = r6 + 99
            byte[] r1 = new byte[r1]
            int r7 = 9 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2e
        L19:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1d:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2e:
            int r4 = -r4
            int r8 = r8 + r4
            int r6 = r6 + 1
            int r8 = r8 + (-27)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.resp.SecureCallBean.a(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 36
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.resp.SecureCallBean.$$d
            int r7 = r7 * 2
            int r7 = 99 - r7
            int r8 = r8 * 27
            int r1 = r8 + 10
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r6
            int r6 = r7 + 1
            int r7 = r3 + (-5)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.resp.SecureCallBean.c(int, int, byte, java.lang.Object[]):void");
    }

    public SecureCallBean(String str, String str2, ProxiedResponse proxiedResponse, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(proxiedResponse, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.globalStatus = str;
        this.messageId = str2;
        this.proxiedResponse = proxiedResponse;
        this.requestId = str3;
    }

    public final String getGlobalStatus() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.globalStatus;
        int i5 = i3 + 83;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setGlobalStatus(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.globalStatus = str;
        int i4 = component1 + 35;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getMessageId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 81;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.messageId;
        int i5 = i2 + 113;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setMessageId(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.messageId = str;
            int i3 = 86 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.messageId = str;
        }
        int i4 = ShareDataUIState + 87;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final ProxiedResponse getProxiedResponse() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        ProxiedResponse proxiedResponse = this.proxiedResponse;
        int i5 = i2 + 53;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return proxiedResponse;
        }
        throw null;
    }

    public final void setProxiedResponse(ProxiedResponse proxiedResponse) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(proxiedResponse, "");
        this.proxiedResponse = proxiedResponse;
        int i4 = ShareDataUIState + 47;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getRequestId() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.requestId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRequestId(String str) {
        int i = 2 % 2;
        int i2 = component1 + 39;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.requestId = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.requestId = str;
        int i3 = component1 + 119;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component3 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 123;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $10 + 75;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionChild(0L) + 35, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - Color.green(0), TextUtils.indexOf("", "") + 18, (char) (51269 - TextUtils.getOffsetAfter("", 0)), -1883291598, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    public String toString() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = this.globalStatus;
        String str2 = this.messageId;
        ProxiedResponse proxiedResponse = this.proxiedResponse;
        String str3 = this.requestId;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-412868303);
        if (objCopydefault == null) {
            int mode = View.MeasureSpec.getMode(0) + 1115;
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 22;
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            byte b2 = (byte) 0;
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, b3, objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(mode, windowTouchSlop, longPressTimeout, 574488148, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b((-1) - ExpandableListView.getPackedPositionChild(0L), new char[]{6108, 21843, 6077, 11585, 57902, 43353, 54765, 6000, 58915, 47310, 51069, 1212, 62611, 35492, 63111, 14897, 49941, 33844, 57421, 11159, 53745, 38836, 37413, 22829, 41071, 57612}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((Process.getThreadPriority(0) + 20) >> 6, new char[]{29880, 29086, 29917, 20538, 8016, 36246, 43155, 59916, 34139, 39951, 47622, 63934, 38909, 44667, 35774, 51048, 41057, 41191, 40231}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-413791824);
        if (objCopydefault2 == null) {
            int gidForName = Process.getGidForName("") + 1116;
            int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 22;
            char longPressTimeout3 = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            byte b4 = (byte) 0;
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 + 1), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, longPressTimeout2, longPressTimeout3, 571463381, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1207399525);
            if (objCopydefault3 == null) {
                int iBlue = 1115 - Color.blue(0);
                int mirror = AndroidCharacter.getMirror('0') - 26;
                char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
                byte b6 = (byte) ($$b & 5);
                byte b7 = b6;
                Object[] objArr6 = new Object[1];
                a(b6, b7, (byte) (b7 + 1), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, mirror, cLastIndexOf, 2102482174, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i2 = ((((-1811812073) + ((((~(853599518 | iUptimeMillis)) | 85723744) | (~((-660402031) | iUptimeMillis))) * (-744))) + (((~iUptimeMillis) | 278921232) * 744)) + ((iUptimeMillis | (-85723745)) * 744)) - 147300386;
            int i3 = (i2 << 13) ^ i2;
            int i4 = i3 ^ (i3 >>> 17);
            ((int[]) objArr[0])[0] = i4 ^ (i4 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{13393, 1408, 13360, 6334, 6560, 63882, 57362, 60670, 50606, 59421, 62082, 65330, 55056, 55924, 49958, 49602, 57504, 54519, 54706, 53269, 62055, 51021, 42946, 41653, 33749, 45532, 43092, 46393, 40272, 40992}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{50950, 17078, 51045, 59918, 265, 48807, 4788, 62551, 14067, 44844, '\"', 59380, 9302, 40258, 12682, 55596, 5077, 37827, 9986, 51388, 297, 32892}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            b((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{30633, 31169, 30659, 31562, 2990, 34244, 33780, 65251, 34327, 37977, 37235, 60796, 38126, 42603, 41201, 54171, 41834, 43169, 46679, 49695}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(AndroidCharacter.getMirror('0') - '0', new char[]{8465, 64683, 8568, 13161, 15511, 171, 52164, 51669, 53493, 4406, 55621, 55890, 49785, 9038, 59634, 58547, 62946, 11728, 65141, 62766}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i5 = ShareDataUIState + 15;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -147300386};
                byte[] bArr = $$d;
                byte b8 = bArr[27];
                byte b9 = (byte) (b8 - 1);
                Object[] objArr13 = new Object[1];
                c(b9, b9, b8, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b10 = bArr[27];
                byte b11 = (byte) (b10 - 1);
                Object[] objArr14 = new Object[1];
                c(b10, b11, b11, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1207399525);
                    if (objCopydefault4 == null) {
                        int i7 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1115;
                        int maximumFlingVelocity = 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                        byte b12 = (byte) ($$b & 5);
                        byte b13 = b12;
                        Object[] objArr15 = new Object[1];
                        a(b12, b13, (byte) (b13 + 1), objArr15);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i7, maximumFlingVelocity, absoluteGravity, 2102482174, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        b(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{6108, 21843, 6077, 11585, 57902, 43353, 54765, 6000, 58915, 47310, 51069, 1212, 62611, 35492, 63111, 14897, 49941, 33844, 57421, 11159, 53745, 38836, 37413, 22829, 41071, 57612}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        b(ViewConfiguration.getEdgeSlop() >> 16, new char[]{29880, 29086, 29917, 20538, 8016, 36246, 43155, 59916, 34139, 39951, 47622, 63934, 38909, 44667, 35774, 51048, 41057, 41191, 40231}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-413791824);
                        if (objCopydefault5 == null) {
                            int i8 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1115;
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 22;
                            char cMyPid = (char) (Process.myPid() >> 22);
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            Object[] objArr18 = new Object[1];
                            a(b14, b15, (byte) (b15 + 1), objArr18);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i8, fadingEdgeLength, cMyPid, 571463381, false, (String) objArr18[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-412868303);
                        if (objCopydefault6 == null) {
                            int iIndexOf = TextUtils.indexOf("", "") + 1115;
                            int i9 = 22 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            byte b16 = (byte) 0;
                            byte b17 = b16;
                            Object[] objArr19 = new Object[1];
                            a(b16, b17, b17, objArr19);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, i9, scrollDefaultDelay, 574488148, false, (String) objArr19[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i10 = ((int[]) objArr[1])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i13 = i12 + (-684545936) + (((~((~iIdentityHashCode) | 324312149)) | 75506336) * 529) + (((~(iIdentityHashCode | 324312149)) | 131114661) * 529);
            int i14 = (i13 << 13) ^ i13;
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr20[0])[0] = i15 ^ (i15 << 5);
            int i16 = ((int[]) objArr20[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr20[1])[0]}, new int[]{((int[]) objArr20[2])[0]}, (String[]) objArr20[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i17 = ~iIdentityHashCode2;
            int i18 = i16 + 297149810 + (((~(425434695 | i17)) | 618632183) * (-90)) + (((~(425434695 | iIdentityHashCode2)) | 419433472) * (-45)) + (((~(iIdentityHashCode2 | (-618632184))) | 425434695 | (~(i17 | 618632183))) * 45);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr21[0])[0] = i20 ^ (i20 << 5);
        } else {
            long j2 = -1;
            long j3 = 0;
            long j4 = (((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i10 ^ i11))) | (((long) 7) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getLongPressTimeout() >> 16), 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr22 = {-271136503, Long.valueOf(j4), new ArrayList(), null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 6562, 56 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr22);
                int i21 = ((int[]) objArr[0])[0];
                Object[] objArr23 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iIdentityHashCode3 = System.identityHashCode(this);
                int i22 = ~iIdentityHashCode3;
                int i23 = (-758082789) + (((~((-896391096) | i22)) | 335812016 | (~(703193607 | i22)) | (~((-142614529) | iIdentityHashCode3))) * (-84));
                int i24 = (~(iIdentityHashCode3 | 703193607)) | 896391095;
                int i25 = ~(i22 | (-703193608));
                int i26 = i21 + i23 + ((i24 | i25) * (-84)) + ((142614528 | i25) * 84);
                int i27 = (i26 << 13) ^ i26;
                int i28 = i27 ^ (i27 >>> 17);
                ((int[]) objArr23[0])[0] = i28 ^ (i28 << 5);
                Toast.makeText((Context) null, i11 / (((i11 - 1) * i11) % 2), 0).show();
                int i29 = ((int[]) objArr23[0])[0];
                Object[] objArr24 = {new int[1], new int[]{((int[]) objArr23[1])[0]}, new int[]{((int[]) objArr23[2])[0]}, (String[]) objArr23[3]};
                int iIdentityHashCode4 = System.identityHashCode(this);
                int i30 = i29 + 869413844 + ((~((-151261969) | iIdentityHashCode4)) * (-301)) + (((~(722745147 | iIdentityHashCode4)) | (~((~iIdentityHashCode4) | 915942635))) * (-301)) + (((~(iIdentityHashCode4 | (-915942636))) | 722745147) * 301);
                int i31 = (i30 << 13) ^ i30;
                int i32 = i31 ^ (i31 >>> 17);
                ((int[]) objArr24[0])[0] = i32 ^ (i32 << 5);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        String str4 = "SecureCallBean(globalStatus=" + str + ", messageId=" + str2 + ", proxiedResponse=" + proxiedResponse + ", requestId=" + str3 + ")";
        int i33 = ShareDataUIState + 63;
        component1 = i33 % 128;
        int i34 = i33 % 2;
        return str4;
    }

    static {
        component2 = 0;
        copydefault();
        int i = copydefault + 103;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SecureCallBean copy$default(SecureCallBean secureCallBean, String str, String str2, ProxiedResponse proxiedResponse, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = secureCallBean.globalStatus;
        }
        if ((i & 2) != 0) {
            str2 = secureCallBean.messageId;
        }
        if ((i & 4) != 0) {
            int i3 = component1 + 97;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                ProxiedResponse proxiedResponse2 = secureCallBean.proxiedResponse;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            proxiedResponse = secureCallBean.proxiedResponse;
        }
        if ((i & 8) != 0) {
            int i4 = ShareDataUIState + 81;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                str3 = secureCallBean.requestId;
                int i5 = 4 / 0;
            } else {
                str3 = secureCallBean.requestId;
            }
        }
        return secureCallBean.copy(str, str2, proxiedResponse, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.globalStatus;
        int i5 = i3 + 41;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.messageId;
        int i4 = i2 + 85;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final ProxiedResponse component3() {
        ProxiedResponse proxiedResponse;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            proxiedResponse = this.proxiedResponse;
            int i4 = 24 / 0;
        } else {
            proxiedResponse = this.proxiedResponse;
        }
        int i5 = i3 + 25;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return proxiedResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.requestId;
        int i5 = i2 + 35;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SecureCallBean copy(String globalStatus, String messageId, ProxiedResponse proxiedResponse, String requestId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(globalStatus, "");
        Intrinsics.checkNotNullParameter(messageId, "");
        Intrinsics.checkNotNullParameter(proxiedResponse, "");
        Intrinsics.checkNotNullParameter(requestId, "");
        SecureCallBean secureCallBean = new SecureCallBean(globalStatus, messageId, proxiedResponse, requestId);
        int i2 = component1 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return secureCallBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 63;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(other instanceof SecureCallBean)) {
            int i3 = component1 + 53;
            ShareDataUIState = i3 % 128;
            return i3 % 2 != 0;
        }
        SecureCallBean secureCallBean = (SecureCallBean) other;
        if (!Intrinsics.areEqual(this.globalStatus, secureCallBean.globalStatus)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.messageId, secureCallBean.messageId)) {
            int i4 = component1 + 25;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.proxiedResponse, secureCallBean.proxiedResponse)) {
            int i6 = ShareDataUIState + 115;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.requestId, secureCallBean.requestId)) {
            return false;
        }
        int i8 = ShareDataUIState + 1;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.globalStatus.hashCode() * 31) + this.messageId.hashCode()) * 31) + this.proxiedResponse.hashCode()) * 31) + this.requestId.hashCode();
        int i4 = component1 + 37;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    static void copydefault() {
        component3 = 2917698442799468789L;
    }
}
