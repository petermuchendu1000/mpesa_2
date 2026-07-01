package com.huawei.digitalpayment.consumer.base.database.di;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.FrequentsDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

public final class AppDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory implements Factory<FrequentsDao> {
    private final Provider<AppDatabase> ShareDataUIState;
    private static final byte[] $$c = {74, 75, -50, -9};
    private static final int $$f = 198;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {99, TarHeader.LF_DIR, 44, 107, 17, 3, -58, 56, Ascii.DLE, 2, -2, 4, 6, 4, -46, 62, Ascii.DLE, -4, Ascii.DC2, -12, Ascii.DC2, -63, 76, -7, -54, 71, 4, 6, 2, -3, Ascii.SO, Ascii.FF, -66, 43, Ascii.SUB, 10, Ascii.DLE, -50, 47, Ascii.SO, 2, -32, Ascii.GS, Ascii.SO, Ascii.FF, -76, Ascii.DC2, 17, 3, 8, 4, 4, -4, Ascii.SO, Ascii.VT, -61};
    private static final int $$e = 76;
    private static final byte[] $$a = {Ascii.VT, -55, -20, -91, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK};
    private static final int $$b = 11;
    private static int component2 = 0;
    private static int getAsAtTimestamp = 1;
    private static long component1 = -3780477796495014671L;
    private static int component3 = 1386857713;
    private static char copydefault = 55915;

    private static String $$g(int i, byte b2, byte b3) {
        int i2 = b3 + 4;
        int i3 = b2 * 4;
        int i4 = i + 98;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i3 + 1];
        int i5 = -1;
        if (bArr == null) {
            i4 += i2;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i2 + 1;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i4 = bArr[i7] + i4;
            i2 = i7;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 6
            int r0 = r6 + 10
            int r7 = r7 + 4
            int r8 = r8 * 16
            int r8 = r8 + 83
            byte[] r1 = com.huawei.digitalpayment.consumer.base.database.di.AppDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-17)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.di.AppDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory.a(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.base.database.di.AppDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory.$$d
            int r6 = r6 * 34
            int r1 = r6 + 10
            int r8 = r8 * 3
            int r8 = 99 - r8
            int r7 = r7 * 43
            int r7 = 46 - r7
            byte[] r1 = new byte[r1]
            int r6 = r6 + 9
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r7 = r7 + r4
            int r7 = r7 + (-5)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.di.AppDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory.c(short, byte, short, java.lang.Object[]):void");
    }

    @Override
    public Object get() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FrequentsDao frequentsDao = get();
        int i4 = getAsAtTimestamp + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return frequentsDao;
    }

    public AppDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.ShareDataUIState = provider;
    }

    private static void b(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $11 + 45;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 4037;
                    int fadingEdgeLength = 31 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    char c3 = (char) ((ExpandableListView.getPackedPositionForGroup(i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == 0L ? 0 : -1)) + 19181);
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (b2 - 1);
                    String str$$g = $$g(b2, b3, (byte) (b3 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, fadingEdgeLength, c3, 1912513118, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int iIndexOf = 7567 - TextUtils.indexOf("", "", i4);
                        int packedPositionType2 = 11 - ExpandableListView.getPackedPositionType(0L);
                        char cArgb = (char) Color.argb(i4, i4, i4, i4);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, packedPositionType2, cArgb, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    Object[] objArr4 = new Object[3];
                    objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                    objArr4[1] = Integer.valueOf(i7);
                    objArr4[i4] = iNotificationSideChannel;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) i4;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2458, TextUtils.indexOf((CharSequence) "", '0', i4) + 29, (char) Color.argb(i4, i4, i4, i4), 931716605, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 7568, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 10, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = iNotificationSideChannel.component3;
                    cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                    iNotificationSideChannel.copydefault++;
                    i2 = 2;
                    i4 = 0;
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
        String str = new String(cArr6);
        int i8 = $11 + 85;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    @Override
    public FrequentsDao get() throws Throwable {
        Object[] objArr;
        char c2;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1370061132);
        if (objCopydefault == null) {
            int iResolveSize = View.resolveSize(0, 0) + 824;
            int iRed = Color.red(0) + 20;
            char c3 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 58322);
            byte b2 = (byte) 0;
            byte b3 = (byte) (b2 - 1);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (-b3), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, iRed, c3, 1796168145, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b((char) (ViewConfiguration.getLongPressTimeout() >> 16), (-1) - ImageFormat.getBitsPerPixel(0), new char[]{17846, 8014, 38492, 15151, 57016, 56533, 11300, 35737, 38568, 37945, 5673, 9604, 28101, 1886, 21296, 56994, 47684, 13785, 17475, 53463, 4472, 22232}, new char[]{61091, 39603, 11163, 55100}, new char[]{0, 0, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((char) (54456 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 999249519, new char[]{36702, 54248, 30709, 37226, 44064, 59029, 47605, 15547, 8202, 37498, 19508, 47127, 30933, AbstractJsonLexerKt.COMMA, 25120}, new char[]{37621, 28841, 47300, 11220}, new char[]{0, 0, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(731302035);
        if (objCopydefault2 == null) {
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 824;
            int iRed2 = 20 - Color.red(0);
            char mode = (char) (View.MeasureSpec.getMode(0) + 58322);
            Object[] objArr5 = new Object[1];
            a((byte) ($$b & 5), (byte) (-$$a[9]), (byte) 0, objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iRed2, mode, -288417802, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1370984653);
            if (objCopydefault3 == null) {
                int threadPriority = 824 - ((Process.getThreadPriority(0) + 20) >> 6);
                int i2 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20;
                char c4 = (char) (58322 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                byte b4 = (byte) (-$$a[11]);
                Object[] objArr6 = new Object[1];
                a((byte) 0, b4, (byte) (b4 & 1), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, i2, c4, 1796321366, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{strArr, new int[1], new int[]{i}, new int[]{i}};
            int i3 = ((int[]) objArr7[2])[0];
            int i4 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i5 = ((1433635133 + (((-573212965) | (~startElapsedRealtime)) * (-490))) + (((~(startElapsedRealtime | 490828874)) | (-1064041839)) * 490)) - 1861761942;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
            c2 = 3;
        } else {
            Object[] objArr8 = new Object[1];
            b((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 21446), ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{10268, 3607, 36042, 17871, 33187, 51405, 63151, 26377, 56992, 64863, 32312, 56457, 43968, 47523, 31827, 46473, 6686, 56376, 13754, 8860, 13816, 48963, 12365, 42071, 17569, 36447}, new char[]{22486, 61975, 50888, 49491}, new char[]{0, 0, 0, 0}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24625), ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{42704, 1564, 40773, 10478, 56132, 54807, 33967, 39477, 56326, 4578, 44762, 33480, 17591, 20055, 20244, 65343, 43608, 19930}, new char[]{19800, 42095, 12686, 51552}, new char[]{0, 0, 0, 0}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            b((char) (22160 - View.MeasureSpec.makeMeasureSpec(0, 0)), Drawable.resolveOpacity(0, 0), new char[]{4741, 47287, 63350, 14464, 15927, 50229, 31950, 46513, 22698, 35932, 53751, 2500, 62305, 3735, 20919, 26506}, new char[]{36123, 7749, 37091, 342}, new char[]{0, 0, 0, 0}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b((char) (TextUtils.getTrimmedLength("") + 37126), 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{63380, 18887, 12223, 38128, 47958, 61551, 25925, 4993, 16221, 63464, 65091, 24163, 27533, 33091, 26296, 57002}, new char[]{25216, 22362, 1698, 30353}, new char[]{0, 0, 0, 0}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            b((char) (ViewConfiguration.getLongPressTimeout() >> 16), (-1) - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{26975, 48334, 10873, 34276, 486, 36205, 22431, 35609, 23268, 49162, 18876, 26115, 9075, 56530, 37932, 11141, 16340, 51971, 38713, 53954, 55100, 62459, 64961, 56840, 36694, 60749, 10424, 10309, 43269, 19808, 31346, 6617, 31046, 62636, 10202, 34297, 43532, 34881, 62757, 12875, 32867, 53374, 744, 54450, 35144, 18078, 22524, 10219, 51282, 45681, 34778, 48990, 44915, 53449, 2670, 62984, 28642, 16400, 63254, 46552, 1979, 39264, 38618, 1318}, new char[]{5339, 31492, 3754, 55274}, new char[]{0, 0, 0, 0}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            b((char) Color.green(0), KeyEvent.getDeadChar(0, 0), new char[]{31667, 19720, 33197, 49989, 27065, 32001, 22518, 22308, 1843, 4823, 29856, 13990, 42062, 37783, 55020, 3307, 41706, 45827, 22820, 25289, 27178, 38701, 22092, 34126, 14533, 15552, 47091, 43272, 14510, 64918, 37279, 25805, 64528, 65301, 22603, 61204, 35256, 9660, 11523, 29200, 4623, 53610, 2445, 47364, 38112, 58206, 58006, 21373, 42948, 40700, 40781, 15704, 64402, 22135, 22004, 29262, 5162, 29085, 35699, 5050, 13226, 38283, 12022, 34994}, new char[]{50449, 53541, 18220, 35104}, new char[]{0, 0, 0, 0}, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -515296544};
                byte b5 = (byte) ($$d[9] - 1);
                byte b6 = b5;
                Object[] objArr15 = new Object[1];
                c(b5, b6, (byte) (b6 - 1), objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b7 = (byte) 0;
                byte b8 = b7;
                Object[] objArr16 = new Object[1];
                c(b7, b8, b8, objArr16);
                Object[] objArr17 = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i8 = ((int[]) objArr17[3])[0];
                int i9 = ((int[]) objArr17[2])[0];
                if (applicationContext != null) {
                    int i10 = component2 + 81;
                    getAsAtTimestamp = i10 % 128;
                    int i11 = i10 % 2;
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1370984653);
                    if (objCopydefault4 == null) {
                        int packedPositionType = 824 - ExpandableListView.getPackedPositionType(0L);
                        int windowTouchSlop = 20 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        char cRed = (char) (Color.red(0) + 58322);
                        byte b9 = (byte) (-$$a[11]);
                        Object[] objArr18 = new Object[1];
                        a(b7, b9, (byte) (b9 & 1), objArr18);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, windowTouchSlop, cRed, 1796321366, false, (String) objArr18[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{17846, 8014, 38492, 15151, 57016, 56533, 11300, 35737, 38568, 37945, 5673, 9604, 28101, 1886, 21296, 56994, 47684, 13785, 17475, 53463, 4472, 22232}, new char[]{61091, 39603, 11163, 55100}, new char[]{0, 0, 0, 0}, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        b((char) (54456 - KeyEvent.getDeadChar(0, 0)), Color.green(0) - 999249518, new char[]{36702, 54248, 30709, 37226, 44064, 59029, 47605, 15547, 8202, 37498, 19508, 47127, 30933, AbstractJsonLexerKt.COMMA, 25120}, new char[]{37621, 28841, 47300, 11220}, new char[]{0, 0, 0, 0}, objArr20);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr20[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(731302035);
                        if (objCopydefault5 == null) {
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 824;
                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 21;
                            char cGreen = (char) (Color.green(0) + 58322);
                            Object[] objArr21 = new Object[1];
                            a((byte) ($$b & 5), (byte) (-$$a[9]), b7, objArr21);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, iIndexOf2, cGreen, -288417802, false, (String) objArr21[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1370061132);
                        if (objCopydefault6 == null) {
                            int fadingEdgeLength = 824 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int i12 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19;
                            char defaultSize = (char) (View.getDefaultSize(0, 0) + 58322);
                            byte b10 = (byte) (b7 - 1);
                            Object[] objArr22 = new Object[1];
                            a(b7, b10, (byte) (-b10), objArr22);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, i12, defaultSize, 1796168145, false, (String) objArr22[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
                c2 = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[c2])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 == i13) {
            int i15 = getAsAtTimestamp + 7;
            component2 = i15 % 128;
            int i16 = i15 % 2;
            Object[] objArr23 = {strArr, new int[1], new int[]{i}, new int[]{i}};
            int i17 = ((int[]) objArr[1])[0];
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i20 = i17 + (((~(1002171118 | iIdentityHashCode)) | 26370050) * 449) + 1191955278 + (((~((~iIdentityHashCode) | 1002171118)) | 26370050) * 449);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr23[1])[0] = i22 ^ (i22 << 5);
            Object[] objArr24 = {strArr2, new int[1], new int[]{i}, new int[]{i}};
            int i23 = ((int[]) objArr23[1])[0];
            int i24 = ((int[]) objArr23[2])[0];
            int i25 = ((int[]) objArr23[3])[0];
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            int i26 = i23 + (-1199704477) + (((~(61562697 | iFreeMemory)) | 135569444) * 576) + (((~((~iFreeMemory) | 197132141)) | 25183305) * 576) + 778588416;
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr24[1])[0] = i28 ^ (i28 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[0];
            if (strArr3 != null) {
                for (String str2 : strArr3) {
                    int i29 = getAsAtTimestamp + 119;
                    component2 = i29 % 128;
                    int i30 = i29 % 2;
                    arrayList.add(str2);
                }
            }
            long j2 = -1;
            long j3 = 0;
            long j4 = (((long) (i13 ^ i14)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) 8) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 6618, (Process.myPid() >> 22) + 42, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr25 = {1556024437, Long.valueOf(j4), arrayList, null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6562, TextUtils.lastIndexOf("", '0') + 57, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr25);
                Object[] objArr26 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                int i31 = ((int[]) objArr[1])[0];
                int i32 = ((int[]) objArr[2])[0];
                int i33 = ((int[]) objArr[3])[0];
                String[] strArr4 = (String[]) objArr[0];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i34 = i31 + (-1107167230) + ((~((~startUptimeMillis) | (-942231683))) * 433) + (((~(943707302 | startUptimeMillis)) | (-1042897355)) * (-433)) + (((~(startUptimeMillis | (-1042897355))) | 1475620) * 433);
                int i35 = (i34 << 13) ^ i34;
                int i36 = i35 ^ (i35 >>> 17);
                ((int[]) objArr26[1])[0] = i36 ^ (i36 << 5);
                int[] iArr = new int[i14];
                int i37 = i14 - 1;
                iArr[i37] = 1;
                Toast.makeText((Context) null, iArr[((i14 * i37) % 2) - 1], 1).show();
                Object[] objArr27 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                int i38 = ((int[]) objArr26[1])[0];
                int i39 = ((int[]) objArr26[2])[0];
                int i40 = ((int[]) objArr26[3])[0];
                String[] strArr5 = (String[]) objArr26[0];
                int iMyUid = Process.myUid();
                int i41 = (-434985883) + (((-242191141) | iMyUid) * 614);
                int i42 = ~iMyUid;
                int i43 = i38 + i41 + (((~((-465366144) | i42)) | 294675547 | (~((-366176092) | i42))) * (-1228)) + (((~(i42 | (-71500545))) | (~((-170690597) | i42))) * 614);
                int i44 = (i43 << 13) ^ i43;
                int i45 = i44 ^ (i44 >>> 17);
                ((int[]) objArr27[1])[0] = i45 ^ (i45 << 5);
                int i46 = component2 + 37;
                getAsAtTimestamp = i46 % 128;
                if (i46 % 2 == 0) {
                    int i47 = 4 / 5;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        return provideFrequentItemsDao$ConsumerBaseUi_release(this.ShareDataUIState.get());
    }

    public static AppDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 75;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return appDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory;
        }
        throw null;
    }

    public static AppDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = getAsAtTimestamp + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideFrequentItemsDao$ConsumerBaseUi_releaseFactory;
    }

    public static FrequentsDao provideFrequentItemsDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        FrequentsDao frequentsDao = (FrequentsDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideFrequentItemsDao$ConsumerBaseUi_release(appDatabase));
        int i4 = getAsAtTimestamp + 61;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return frequentsDao;
    }
}
