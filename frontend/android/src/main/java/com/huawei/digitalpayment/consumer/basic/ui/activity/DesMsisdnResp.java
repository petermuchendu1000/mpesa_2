package com.huawei.digitalpayment.consumer.basic.ui.activity;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.huawei.http.BaseResp;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/ui/activity/DesMsisdnResp;", "Lcom/huawei/http/BaseResp;", "decMsisdn", "", "<init>", "(Ljava/lang/String;)V", "getDecMsisdn", "()Ljava/lang/String;", "setDecMsisdn", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DesMsisdnResp extends BaseResp {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static long component1;
    private static char component3;
    private static int copydefault;
    private String decMsisdn;
    private static final byte[] $$c = {66, -42, -1, 80};
    private static final int $$d = 195;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {Ascii.ETB, 124, -70, -17, 6, -5, 3};
    private static final int $$b = 225;
    private static int copy = 0;
    private static int component4 = 1;
    private static int component2 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r6, int r7, byte r8) {
        /*
            int r7 = 99 - r7
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.basic.ui.activity.DesMsisdnResp.$$c
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.DesMsisdnResp.$$e(byte, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r8 = r8 * 4
            int r8 = 99 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.basic.ui.activity.DesMsisdnResp.$$a
            int r7 = r7 * 4
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L32
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r3 = r3 + r6
            int r6 = r3 + 6
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.DesMsisdnResp.b(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DesMsisdnResp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component4;
            int i3 = i2 + 35;
            copy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 23;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        this(str);
    }

    public final String getDecMsisdn() {
        int i = 2 % 2;
        int i2 = component4 + 85;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.decMsisdn;
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return str;
    }

    public final void setDecMsisdn(String str) {
        int i = 2 % 2;
        int i2 = component4 + 31;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.decMsisdn = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DesMsisdnResp(String str) {
        this.decMsisdn = str;
    }

    private static void a(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c3 = 2;
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
        while (iNotificationSideChannel.copydefault < length3) {
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int i3 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4037;
                    int minimumFlingVelocity = 31 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    char keyRepeatTimeout = (char) (19181 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    byte b2 = (byte) ($$c[c3] + 1);
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3, minimumFlingVelocity, keyRepeatTimeout, 1912513118, false, $$e(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 7567, (Process.myPid() >> 22) + 11, (char) View.MeasureSpec.getMode(0), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2459;
                            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 28;
                            char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            byte b4 = $$c[2];
                            byte b5 = (byte) (b4 + 1);
                            byte b6 = (byte) (-b4);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity2, maximumDrawingCacheSize, scrollDefaultDelay, 931716605, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0) + 7568, 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) ShareDataUIState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component3) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            int i4 = $10 + 5;
                            $11 = i4 % 128;
                            int i5 = i4 % 2;
                            c3 = 2;
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 13;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    static {
        copydefault = 1;
        ShareDataUIState();
        int i = component2 + 1;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DesMsisdnResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static DesMsisdnResp copy$default(DesMsisdnResp desMsisdnResp, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component4 + 75;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = desMsisdnResp.decMsisdn;
            int i6 = i4 + 113;
            component4 = i6 % 128;
            int i7 = i6 % 2;
        }
        return desMsisdnResp.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 21;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.decMsisdn;
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return str;
    }

    public final DesMsisdnResp copy(String decMsisdn) {
        int i = 2 % 2;
        DesMsisdnResp desMsisdnResp = new DesMsisdnResp(decMsisdn);
        int i2 = component4 + 5;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return desMsisdnResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this != other) {
            if (!(other instanceof DesMsisdnResp)) {
                return false;
            }
            if (Intrinsics.areEqual(this.decMsisdn, ((DesMsisdnResp) other).decMsisdn)) {
                return true;
            }
            int i2 = copy + 1;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = copy;
        int i5 = i4 + 1;
        component4 = i5 % 128;
        boolean z = i5 % 2 != 0;
        int i6 = i4 + 3;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 3 / 0;
        }
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 25;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.decMsisdn;
        if (str == null) {
            int i4 = i3 + 115;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return 0;
        }
        int iHashCode = str.hashCode();
        int i6 = component4 + 99;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DesMsisdnResp(decMsisdn=" + this.decMsisdn + ")";
        int i2 = component4 + 11;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:120|31|32|(1:34)|35|36|116|37|(1:39)(4:40|114|41|(7:43|117|49|(1:51)(15:52|111|53|54|55|56|(2:58|59)(2:60|61)|62|(2:64|65)(1:66)|67|68|(3:70|71|72)(2:73|74)|(2:76|(1:78)(7:79|118|80|81|82|83|(0)(5:86|(1:88)(1:89)|90|(1:92)(1:93)|94)))|102|103)|101|102|103)(1:44))|48|117|49|(0)(0)|101|102|103) */
    /* JADX WARN: Removed duplicated region for block: B:51:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04f0 A[Catch: Exception -> 0x0819, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0819, blocks: (B:49:0x049b, B:52:0x04f0, B:71:0x06ce, B:76:0x0700, B:79:0x0756, B:83:0x07b5, B:96:0x080a, B:97:0x0810, B:74:0x06f8, B:99:0x0812, B:100:0x0818, B:53:0x04fa, B:55:0x0508, B:59:0x0609, B:65:0x0640, B:67:0x0675, B:70:0x06ad, B:73:0x06d7, B:66:0x065c, B:60:0x0615, B:80:0x0760, B:82:0x077b), top: B:117:0x049b, inners: #0, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] component2(int r36, int r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basic.ui.activity.DesMsisdnResp.component2(int, int):java.lang.Object[]");
    }

    static void ShareDataUIState() {
        component1 = -3780477796495014671L;
        ShareDataUIState = -770036759;
        component3 = (char) 50417;
    }
}
