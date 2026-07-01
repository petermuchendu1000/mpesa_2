package com.huawei.digitalpayment.consumer.pochiwallet.ui.resp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u0005H×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/pochiwallet/ui/resp/PochiWalletFunction;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "iconRes", "", "name", KeysConstants.KEY_EXECUTE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getIconRes", "()I", "setIconRes", "(I)V", "getName", "setName", "getExecute", "setExecute", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcPochiWallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PochiWalletFunction {
    public static final int $stable = 8;
    private static long component2;
    private static int copy;
    private String ShareDataUIState;
    private int component1;
    private String component3;
    private String copydefault;
    private static final byte[] $$c = {70, 83, 77, 1};
    private static final int $$d = 31;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {99, TarHeader.LF_DIR, 44, 107, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
    private static final int $$b = 5;
    private static int getAsAtTimestamp = 0;
    private static int equals = 1;
    private static int component4 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r5, int r6, byte r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction.$$c
            int r7 = r7 * 3
            int r7 = 105 - r7
            int r5 = r5 * 2
            int r1 = 1 - r5
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r5
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
        L29:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction.$$e(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r9 = r9 * 3
            int r9 = r9 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction.$$a
            int r8 = r8 * 3
            int r8 = r8 + 99
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-26)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction.b(byte, byte, byte, java.lang.Object[]):void");
    }

    public PochiWalletFunction(String str, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component3 = str;
        this.component1 = i;
        this.copydefault = str2;
        this.ShareDataUIState = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PochiWalletFunction(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = equals;
            int i4 = i3 + 31;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 83;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 / 4;
            } else {
                int i8 = 2 % 2;
            }
            str = "";
        }
        if ((i2 & 4) != 0) {
            int i9 = getAsAtTimestamp + 97;
            equals = i9 % 128;
            if (i9 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i10 = 2 % 2;
            str2 = "";
        }
        this(str, i, str2, str3);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 83;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setId(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 53;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
            int i3 = 18 / 0;
        }
    }

    public final int getIconRes() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 89;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.component1;
        int i6 = i2 + 27;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setIconRes(int i) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 39;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        this.component1 = i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 23;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 83;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 113;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 95 / 0;
        }
        return str;
    }

    public final void setName(String str) {
        int i = 2 % 2;
        int i2 = equals + 93;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        int i3 = getAsAtTimestamp + 19;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 11;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 57;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = equals + 79;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.ShareDataUIState = str;
        int i4 = getAsAtTimestamp + 9;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r22, char[] r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction.a(int, char[], java.lang.Object[]):void");
    }

    public final PochiWalletFunction copy(String id, int iconRes, String name, String execute) throws Throwable {
        long j;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 67, View.getDefaultSize(0, 0) + 33, (char) (19696 - KeyEvent.keyCodeFromString("")), 520092524, false, "component2", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getLongPressTimeout() >> 16) + 27427, new char[]{19900, 9872, 39935, 3270, 57662, 23067, 53099, 40966, 5290, 35221, 25261, 55055, 18432, 15721, 38467, 2741, 65408, 20685, 50631, 48683, 4866, 33897}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), new char[]{19896, 19860, 19958, 19906, 19770, 19713, 19815, 19596, 19600, 19697, 19651, 19518, 19464, 19537, 20414}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = 520;
        long j3 = -1;
        long j4 = j3 ^ 484245851913619088L;
        long j5 = j3 ^ 3971477244692891237L;
        long jMyTid = Process.myTid();
        long j6 = jMyTid ^ j3;
        long j7 = (((long) (-519)) * 484245851913619088L) + (((long) 521) * 3971477244692891237L) + (((((j4 | j5) | j6) ^ j3) | ((jMyTid | 3971477244692891237L) ^ j3)) * j2);
        int i3 = i2;
        long j8 = (jMyTid | 484245851913619088L) ^ j3;
        long j9 = j7 + (((long) (-1040)) * (((j5 | j6) ^ j3) | j8)) + (j2 * (((j4 | j6) ^ j3) | (j3 ^ (j5 | 484245851913619088L)) | j8));
        int i4 = 0;
        while (true) {
            if (i4 != 10) {
                int i5 = equals + 65;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getFadingEdgeLength() >> 16), 29 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (Color.rgb(0, 0, 0) + 16777216), 846241313, false, "copydefault", null);
                }
                int i7 = ((Field) objCopydefault2).getInt(null);
                long j10 = jLongValue;
                int i8 = 0;
                while (true) {
                    int i9 = 0;
                    while (i9 != 8) {
                        i7 = (((((int) (j10 >> i9)) & 255) + (i7 << 6)) + (i7 << 16)) - i7;
                        i9++;
                        j9 = j9;
                    }
                    j = j9;
                    if (i8 != 0) {
                        break;
                    }
                    i8++;
                    j10 = j;
                    j9 = j10;
                }
                int i10 = i3;
                if (i7 == i10) {
                    break;
                }
                int i11 = getAsAtTimestamp + 19;
                int i12 = i11 % 128;
                equals = i12;
                if (i11 % 2 == 0) {
                    jLongValue *= 1024;
                    i4 += 47;
                } else {
                    jLongValue -= 1024;
                    i4++;
                }
                int i13 = i12 + 75;
                getAsAtTimestamp = i13 % 128;
                int i14 = i13 % 2;
                i3 = i10;
                j9 = j;
            } else {
                try {
                    Object[] objArr3 = {-1441098168};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1662 - TextUtils.lastIndexOf("", '0'), View.MeasureSpec.makeMeasureSpec(0, 0) + 10, (char) View.resolveSizeAndState(0, 0, 0), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr4 = {Integer.valueOf(iconRes), 0, 15854141, ((Constructor) objCopydefault3).newInstance(objArr3), false};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault4 == null) {
                        int i15 = 1454 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int iRgb = Color.rgb(0, 0, 0) + 16777238;
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        byte b2 = (byte) ($$b - 5);
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        b(b2, b3, b3, objArr5);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i15, iRgb, scrollBarSize, 1908380642, false, (String) objArr5[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1590 - ((byte) KeyEvent.getModifierMetaStateMask()), 39 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getScrollBarSize() >> 8)), Boolean.TYPE});
                    }
                    Object[] objArr6 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr4);
                    int i16 = ((int[]) objArr6[2])[0];
                    int i17 = ((int[]) objArr6[1])[0];
                    if (i17 != i16) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr6[3];
                        if (strArr != null) {
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                        }
                        long j11 = -1;
                        long j12 = 0;
                        long j13 = (((long) 1) << 32) | (j12 - ((j12 >> 63) << 32)) | (((((long) 0) << 32) | (j11 - ((j11 >> 63) << 32))) & ((long) (i17 ^ i16)));
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16783834, (ViewConfiguration.getFadingEdgeLength() >> 16) + 42, (char) ((-1) - MotionEvent.axisFromString("")), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                        Object[] objArr7 = {-1441098168, Long.valueOf(j13), arrayList, null, false, false};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), View.getDefaultSize(0, 0) + 56, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault6).invoke(objInvoke, objArr7);
                        int[] iArr = new int[i17];
                        int i18 = i17 - 1;
                        iArr[i18] = 1;
                        Toast.makeText((Context) null, iArr[((i18 * i17) % 2) - 1], 1).show();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(execute, "");
        return new PochiWalletFunction(id, iconRes, name, execute);
    }

    static {
        copy = 1;
        copydefault();
        int i = component4 + 37;
        copy = i % 128;
        int i2 = i % 2;
    }

    public static PochiWalletFunction copy$default(PochiWalletFunction pochiWalletFunction, String str, int i, String str2, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = equals + 103;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            str = pochiWalletFunction.component3;
        }
        Object obj2 = null;
        if ((i2 & 2) != 0) {
            int i6 = getAsAtTimestamp + 115;
            equals = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = pochiWalletFunction.component1;
                obj2.hashCode();
                throw null;
            }
            i = pochiWalletFunction.component1;
        }
        if ((i2 & 4) != 0) {
            int i8 = equals + 103;
            getAsAtTimestamp = i8 % 128;
            if (i8 % 2 != 0) {
                String str4 = pochiWalletFunction.copydefault;
                obj2.hashCode();
                throw null;
            }
            str2 = pochiWalletFunction.copydefault;
        }
        if ((i2 & 8) != 0) {
            str3 = pochiWalletFunction.ShareDataUIState;
        }
        return pochiWalletFunction.copy(str, i, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 45;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 57;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 37;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 49;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 115;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 55;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r2 = r2 + 63;
        com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction.getAsAtTimestamp = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component3, r6.component3) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r5.component1 == r6.component1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, r6.copydefault) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r2 = r2 + 13;
        com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction.getAsAtTimestamp = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction.getAsAtTimestamp
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction.equals = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L16
            r1 = 12
            int r1 = r1 / r4
            if (r5 != r6) goto L20
            goto L18
        L16:
            if (r5 != r6) goto L20
        L18:
            int r2 = r2 + 13
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction.getAsAtTimestamp = r6
            int r2 = r2 % r0
            return r3
        L20:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction
            if (r1 != 0) goto L2c
            int r2 = r2 + 63
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction.getAsAtTimestamp = r6
            int r2 = r2 % r0
            return r4
        L2c:
            com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction r6 = (com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction) r6
            java.lang.String r0 = r5.component3
            java.lang.String r1 = r6.component3
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == r3) goto L39
            return r4
        L39:
            int r0 = r5.component1
            int r1 = r6.component1
            if (r0 == r1) goto L40
            return r4
        L40:
            java.lang.String r0 = r5.copydefault
            java.lang.String r1 = r6.copydefault
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 != 0) goto L4b
            return r4
        L4b:
            java.lang.String r0 = r5.ShareDataUIState
            java.lang.String r6 = r6.ShareDataUIState
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L56
            return r4
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.pochiwallet.ui.resp.PochiWalletFunction.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 119;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.component3.hashCode() * 31) + Integer.hashCode(this.component1)) * 31) + this.copydefault.hashCode()) * 31) + this.ShareDataUIState.hashCode();
        int i4 = equals + 63;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PochiWalletFunction(id=" + this.component3 + ", iconRes=" + this.component1 + ", name=" + this.copydefault + ", execute=" + this.ShareDataUIState + ")";
        int i2 = equals + 63;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static void copydefault() {
        component2 = -4277622453750149641L;
    }
}
