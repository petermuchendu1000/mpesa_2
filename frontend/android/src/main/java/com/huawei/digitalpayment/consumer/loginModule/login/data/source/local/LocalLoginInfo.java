package com.huawei.digitalpayment.consumer.loginModule.login.data.source.local;

import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/LocalLoginInfo;", "Lcom/huawei/http/BaseResp;", KeysConstants.KEY_EXECUTE, "", "token", "homeConfig", "", "customer", AppConfigManager.MERCHANT_APP_ID_CONFIG, "customerProfiles", "asyncRegisterDesc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V", "getExecute", "()Ljava/lang/String;", "setExecute", "(Ljava/lang/String;)V", "getToken", "getHomeConfig", "()Ljava/lang/Object;", "getCustomer", "getMerchantAppIdConfig", "getCustomerProfiles", "getAsyncRegisterDesc", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalLoginInfo extends BaseResp {
    private final String asyncRegisterDesc;
    private final Object customer;
    private final Object customerProfiles;
    private String execute;
    private final Object homeConfig;
    private final Object merchantAppIdConfig;
    private final String token;
    private static final byte[] $$c = {5, -4, -80, 1};
    private static final int $$f = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {1, -9, -86, 35, Ascii.DC2, 4, -57, 65, -2, Ascii.NAK, -60, 57, 8, -47, 57, 19, -4, 20, 3, 0, 1, -48, 57, 8, Ascii.SYN, -63, 72, 2, Ascii.SI, -8, 8, Ascii.VT, -58, 60, 17, Ascii.SO, -3, -1, 17, -11, 9, 7, -49, 66, Ascii.SI, -12, Ascii.NAK, -1, -53, 65, Ascii.VT, Ascii.FF, -9, 19, -9, 8, 17, 10, 1, 9, -62, 33, -2, Ascii.NAK, 0, Ascii.SI, -12, Ascii.NAK, -1, 13, 40, -7, -22, 43, Ascii.FF, -9, 19, -9, 8, 17, 10, 1, 9, -72, 19, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59};
    private static final int $$e = 129;
    private static final byte[] $$a = {34, -56, Ascii.SUB, -92, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -25, -30, -26, -26, -18, -36, -33, 40, -39, -31, -7, -38, -34};
    private static final int $$b = 188;
    private static int copydefault = 0;
    private static int component1 = 1;
    private static long component2 = -2443432255916391316L;
    private static int component3 = 1386857713;
    private static char ShareDataUIState = 50417;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(int r6, int r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r0 = 1 - r6
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo.$$c
            int r7 = 99 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo.$$i(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 99
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r0 = 10 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo.$$a
            byte[] r0 = new byte[r0]
            int r7 = 9 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r8 = r8 + 1
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-27)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 99 - r8
            int r6 = r6 * 81
            int r6 = 84 - r6
            int r7 = r7 * 72
            int r0 = 82 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo.$$d
            byte[] r0 = new byte[r0]
            int r7 = 81 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L32
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r3 = r3 + r6
            int r6 = r3 + (-6)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalLoginInfo(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        Object obj5 = (i & 32) != 0 ? null : obj4;
        if ((i & 64) != 0) {
            int i2 = component1;
            int i3 = i2 + 51;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 75;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str4 = null;
        } else {
            str4 = str3;
        }
        this(str, str2, obj, obj2, obj3, obj5, str4);
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.execute;
        }
        throw null;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.execute = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final String getToken() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 61;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.token;
        int i5 = i2 + 87;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 86 / 0;
        }
        return str;
    }

    public final Object getHomeConfig() {
        Object obj;
        int i = 2 % 2;
        int i2 = component1 + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            obj = this.homeConfig;
            int i4 = 70 / 0;
        } else {
            obj = this.homeConfig;
        }
        int i5 = i3 + 11;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    public final Object getCustomer() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Object obj = this.customer;
        int i5 = i3 + 107;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return obj;
    }

    public final Object getMerchantAppIdConfig() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Object obj = this.merchantAppIdConfig;
        int i4 = i3 + 9;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    public final Object getCustomerProfiles() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.customerProfiles;
        }
        throw null;
    }

    public final String getAsyncRegisterDesc() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.asyncRegisterDesc;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public LocalLoginInfo(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, String str3) {
        this.execute = str;
        this.token = str2;
        this.homeConfig = obj;
        this.customer = obj2;
        this.merchantAppIdConfig = obj3;
        this.customerProfiles = obj4;
        this.asyncRegisterDesc = str3;
    }

    private static void b(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i3 = $11 + 11;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int i5 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4037;
                    int scrollBarFadeDuration = 31 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 19181);
                    byte b2 = (byte) ($$c[3] - 1);
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5, scrollBarFadeDuration, cMakeMeasureSpec, 1912513118, false, $$i(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7568 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 11, (char) View.MeasureSpec.getSize(0), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    int i6 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2458;
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 28;
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    byte b4 = $$c[3];
                    byte b5 = (byte) (b4 - 1);
                    byte b6 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i6, iResolveSizeAndState, cIndexOf, 931716605, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - ExpandableListView.getPackedPositionChild(0L), 11 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) KeyEvent.keyCodeFromString(""), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i7 = $10 + 45;
        $11 = i7 % 128;
        if (i7 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i8 = 99 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x024f  */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.LocalLoginInfo.equals(java.lang.Object):boolean");
    }

    public static LocalLoginInfo copy$default(LocalLoginInfo localLoginInfo, String str, String str2, Object obj, Object obj2, Object obj3, Object obj4, String str3, int i, Object obj5) {
        String str4;
        Object obj6;
        Object obj7;
        int i2 = 2 % 2;
        int i3 = component1 + 77;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) {
            str4 = str;
        } else {
            int i5 = i4 + 47;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str4 = localLoginInfo.execute;
        }
        String str5 = (i & 2) != 0 ? localLoginInfo.token : str2;
        if ((i & 4) != 0) {
            int i7 = component1 + 53;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                Object obj8 = localLoginInfo.homeConfig;
                throw null;
            }
            obj6 = localLoginInfo.homeConfig;
        } else {
            obj6 = obj;
        }
        Object obj9 = (i & 8) != 0 ? localLoginInfo.customer : obj2;
        if ((i & 16) != 0) {
            int i8 = component1 + 49;
            copydefault = i8 % 128;
            if (i8 % 2 != 0) {
                Object obj10 = localLoginInfo.merchantAppIdConfig;
                throw null;
            }
            obj7 = localLoginInfo.merchantAppIdConfig;
        } else {
            obj7 = obj3;
        }
        LocalLoginInfo localLoginInfoCopy = localLoginInfo.copy(str4, str5, obj6, obj9, obj7, (i & 32) != 0 ? localLoginInfo.customerProfiles : obj4, (i & 64) != 0 ? localLoginInfo.asyncRegisterDesc : str3);
        int i9 = copydefault + 69;
        component1 = i9 % 128;
        int i10 = i9 % 2;
        return localLoginInfoCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.execute;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.token;
        int i5 = i3 + 111;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Object component3() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.homeConfig;
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return obj;
    }

    public final Object component4() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.customer;
        }
        throw null;
    }

    public final Object component5() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Object obj = this.merchantAppIdConfig;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final Object component6() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 31;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.customerProfiles;
        int i5 = i2 + 17;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.asyncRegisterDesc;
        int i5 = i2 + 73;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final LocalLoginInfo copy(String execute, String token, Object homeConfig, Object customer, Object merchantAppIdConfig, Object customerProfiles, String asyncRegisterDesc) {
        int i = 2 % 2;
        LocalLoginInfo localLoginInfo = new LocalLoginInfo(execute, token, homeConfig, customer, merchantAppIdConfig, customerProfiles, asyncRegisterDesc);
        int i2 = component1 + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return localLoginInfo;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        int iHashCode3 = (i2 % 2 == 0 ? (str = this.execute) != null : (str = this.execute) != null) ? str.hashCode() : 0;
        String str2 = this.token;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Object obj = this.homeConfig;
        int iHashCode5 = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.customer;
        if (obj2 == null) {
            int i3 = component1 + 7;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = obj2.hashCode();
        }
        Object obj3 = this.merchantAppIdConfig;
        int iHashCode6 = obj3 == null ? 0 : obj3.hashCode();
        Object obj4 = this.customerProfiles;
        if (obj4 == null) {
            int i5 = component1 + 79;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = obj4.hashCode();
        }
        String str3 = this.asyncRegisterDesc;
        return (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalLoginInfo(execute=" + this.execute + ", token=" + this.token + ", homeConfig=" + this.homeConfig + ", customer=" + this.customer + ", merchantAppIdConfig=" + this.merchantAppIdConfig + ", customerProfiles=" + this.customerProfiles + ", asyncRegisterDesc=" + this.asyncRegisterDesc + ")";
        int i2 = copydefault + 91;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
