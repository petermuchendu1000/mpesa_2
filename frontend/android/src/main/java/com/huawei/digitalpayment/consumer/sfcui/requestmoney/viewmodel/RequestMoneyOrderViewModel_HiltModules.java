package com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.engine.common.track.recovery.DeepRecoverARiverProxy;
import com.google.common.base.Ascii;
import com.tbuonomo.viewpagerdotsindicator.attacher.ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelNotification;
import kotlin.text.Typography;

public final class RequestMoneyOrderViewModel_HiltModules {
    private RequestMoneyOrderViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(RequestMoneyOrderViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(RequestMoneyOrderViewModel requestMoneyOrderViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static final byte[] $$a = {104, -2, Ascii.CAN, -74};
        private static final int $$b = 92;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int copy = 0;
        private static int getAsAtTimestamp = 1;
        private static long copydefault = -3780477796495014671L;
        private static int component3 = -2077187403;
        private static char ShareDataUIState = 50417;
        private static char[] component2 = {48947, 2412, 54151, 40388, 26225, 12499, 64210, 17264, 3482, 55256, 41059, 27308, 13533, 64868, 18415, 4564, 55916, 42169, 28377, 14155, 33201, 19336, 5201, 57061, 43159, 28981, 15332, 34229, 20057, 6285, 58099, 43804, 30135, 16366, 34840, 21077, 7400, 58641, 58076, 21750, 36450, 49200, 15331, 28020, 42842, 7826, 20561, 35343, 64933, 14188, 26886, 41151, 6699, 19504, 34705, 63798, 13110, 27341, 56427, 5641, 18888, 33658, 62747, 11403, 26195, 55334, 5069, 17774, 48928, 3095, 47692, 24762, 12024, 54601, 33723, 18922, 61460, 48821, 25837, 4944, 55710, 34787, 20060, 62618, 41652, 26997, 6029, 56816, 33854, 12931, 63722, 42810, 3089, 47687, 24746, 11994, 54599, 33713, 18917, 61531, 48817, 25831, 4979, 55691, 34792, 20051, 62601, 41727, 26948, 35124, 16239, 58777, 43995, 20586, 1688, 52425, 30007, 15254, 57806, 38515, 23741, 704, 52095, 29113, 10135, 60517, 37548, 22675, 313, 47012, 32210, 8710, 59576, 40658, 18180, 3472, 46056, 30731, 11952, 54506, 40220, 17319, 34955, 16093, 58416, 43584, 20957, 1835, 52607, 29889, 14891, 57469, 38893, 23838, 890, 51911, 43976, 7658, 50957, 35164, 29433, 46704, Typography.amp, 56011, 38050, 28457, 14784, 62363, 19002, 1241, 56960, 43322, 22447, 57844, 15106, 30016, 36593, 55299, 4690, 43948, 58637, 16213, 18664, 33318, 56411, 5604, 44834, 63756, 13054, 19511, 34312, 57249, 26935, 41805, 64664, 13859, 16474, 39311, 54068, 28023, 3074, 47693, 24732, 12019, 54610, 33719, 18895, 61512, 48804, 25827, 4935};
        private static long component1 = -4543833511383090654L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r6, short r7, short r8) {
            /*
                int r6 = r6 + 4
                int r7 = r7 * 4
                int r0 = 1 - r7
                byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel_HiltModules.KeyModule.$$a
                int r8 = 122 - r8
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L14
                r3 = r6
                r4 = r2
                goto L2c
            L14:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L18:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r8 = r8 + 1
                int r4 = r3 + 1
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L27:
                r3 = r1[r8]
                r5 = r3
                r3 = r8
                r8 = r5
            L2c:
                int r8 = -r8
                int r6 = r6 + r8
                r8 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel_HiltModules.KeyModule.$$c(int, short, short):java.lang.String");
        }

        private KeyModule() {
        }

        private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
            int i3 = 2;
            int i4 = 2 % 2;
            cancelNotification cancelnotification = new cancelNotification();
            long[] jArr = new long[i2];
            cancelnotification.copydefault = 0;
            while (cancelnotification.copydefault < i2) {
                int i5 = $10 + 51;
                $11 = i5 % 128;
                if (i5 % i3 == 0) {
                    int i6 = cancelnotification.copydefault;
                    try {
                        Object[] objArr2 = {Integer.valueOf(component2[i - i6])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                        if (objCopydefault == null) {
                            int iIndexOf = 1758 - TextUtils.indexOf("", "", 0, 0);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 34;
                            char cGreen = (char) Color.green(0);
                            byte b2 = (byte) ($$a[1] + 1);
                            byte b3 = (byte) (b2 + 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iResolveOpacity, cGreen, 1159210934, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(component1), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                        if (objCopydefault2 == null) {
                            int iIndexOf2 = 3608 - TextUtils.indexOf("", "", 0, 0);
                            int modifierMetaStateMask = 28 - ((byte) KeyEvent.getModifierMetaStateMask());
                            char size = (char) (7171 - View.MeasureSpec.getSize(0));
                            byte b4 = (byte) ($$a[1] + 1);
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, modifierMetaStateMask, size, 1951385784, false, $$c(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {cancelnotification, cancelnotification};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault3 == null) {
                            int defaultSize = View.getDefaultSize(0, 0) + 4013;
                            int iCombineMeasuredStates = 24 - View.combineMeasuredStates(0, 0);
                            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 27761);
                            byte b6 = (byte) ($$a[1] + 1);
                            byte b7 = (byte) (b6 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, iCombineMeasuredStates, cResolveSizeAndState, -1529629956, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i7 = cancelnotification.copydefault;
                    Object[] objArr5 = {Integer.valueOf(component2[i + i7])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault4 == null) {
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1758;
                        int iMyPid = 34 - (Process.myPid() >> 22);
                        char c3 = (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b8 = (byte) ($$a[1] + 1);
                        byte b9 = (byte) (b8 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(touchSlop, iMyPid, c3, 1159210934, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objCopydefault4).invoke(null, objArr5)).longValue()), Long.valueOf(i7), Long.valueOf(component1), Integer.valueOf(c2)};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault5 == null) {
                        int packedPositionType = 3608 - ExpandableListView.getPackedPositionType(0L);
                        int i8 = 30 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                        char cRed = (char) (7171 - Color.red(0));
                        byte b10 = (byte) ($$a[1] + 1);
                        byte b11 = (byte) (b10 + 1);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, i8, cRed, 1951385784, false, $$c(b10, b11, (byte) (b11 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objCopydefault5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {cancelnotification, cancelnotification};
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault6 == null) {
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4013;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24;
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 27762);
                        byte b12 = (byte) ($$a[1] + 1);
                        byte b13 = (byte) (b12 + 1);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, scrollDefaultDelay, packedPositionChild, -1529629956, false, $$c(b12, b13, b13), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault6).invoke(null, objArr7);
                }
                int i9 = $10 + 117;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                i3 = 2;
            }
            char[] cArr = new char[i2];
            cancelnotification.copydefault = 0;
            while (cancelnotification.copydefault < i2) {
                int i11 = $10 + 71;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                    Object[] objArr8 = {cancelnotification, cancelnotification};
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault7 == null) {
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 4013;
                        int iResolveSize = View.resolveSize(0, 0) + 24;
                        char cAxisFromString = (char) (MotionEvent.axisFromString("") + 27762);
                        byte b14 = (byte) ($$a[1] + 1);
                        byte b15 = (byte) (b14 + 1);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, iResolveSize, cAxisFromString, -1529629956, false, $$c(b14, b15, b15), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault7).invoke(null, objArr8);
                    int i12 = 84 / 0;
                } else {
                    cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                    Object[] objArr9 = {cancelnotification, cancelnotification};
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault8 == null) {
                        int offsetAfter = 4013 - TextUtils.getOffsetAfter("", 0);
                        int iIndexOf3 = 23 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        char c4 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27761);
                        byte b16 = (byte) ($$a[1] + 1);
                        byte b17 = (byte) (b16 + 1);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, iIndexOf3, c4, -1529629956, false, $$c(b16, b17, b17), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault8).invoke(null, objArr9);
                }
            }
            objArr[0] = new String(cArr);
        }

        private static void a(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
            char c3;
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
            int i3 = $10 + 7;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (iNotificationSideChannel.copydefault < length3) {
                int i5 = $10 + 39;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {iNotificationSideChannel};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                    if (objCopydefault == null) {
                        int defaultSize = View.getDefaultSize(0, 0) + 4037;
                        int i7 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 30;
                        char c4 = (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 19181);
                        byte b2 = (byte) ($$a[1] + 1);
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, i7, c4, 1912513118, false, $$c(b2, b3, (byte) (b3 | Ascii.ETB)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getTapTimeout() >> 16), 12 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                    if (objCopydefault3 == null) {
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2459;
                        int fadingEdgeLength = 28 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b4 = (byte) ($$a[1] + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, fadingEdgeLength, windowTouchSlop, 931716605, false, $$c(b4, (byte) (b4 + 1), r16[2]), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                    if (objCopydefault4 == null) {
                        c3 = 2;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - Process.getGidForName(""), 11 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        c3 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = iNotificationSideChannel.component3;
                    cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                    iNotificationSideChannel.copydefault++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr6);
        }

        @Provides
        @LazyClassKey(RequestMoneyOrderViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copy + 75;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 75;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                return true;
            }
            throw null;
        }

        public static Object[] copydefault(Context context, int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            Object objNewInstance;
            Object objNewInstance2;
            int i9;
            int i10;
            int i11;
            int iResolveSize;
            int packedPositionGroup;
            Object[] objArr;
            int length;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int minimumFlingVelocity;
            char[] cArr;
            int i18;
            char[] cArr2;
            int jumpTapTimeout;
            char[] cArr3;
            int i19 = 2 % 2;
            if (context != null) {
                try {
                    int i20 = -TextUtils.lastIndexOf("", '0', 0);
                    char c2 = (char) ((i20 & 26733) + (i20 | 26733));
                    int i21 = -TextUtils.indexOf("", "", 0, 0);
                    int iShareDataUIState = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                    int i22 = copy;
                    int i23 = i22 + 121;
                    getAsAtTimestamp = i23 % 128;
                    int i24 = i23 % 2;
                    int i25 = (i21 * (-391)) + 561711082;
                    int i26 = ~(((-1803208243) & i21) | ((-1803208243) ^ i21));
                    int i27 = i22 + 21;
                    getAsAtTimestamp = i27 % 128;
                    if (i27 % 2 == 0) {
                        int i28 = ~((iShareDataUIState ^ 1803208242) | (iShareDataUIState & 1803208242));
                        i6 = i25 >> ((-197) - (~(-(-((i26 ^ i28) | (i26 & i28))))));
                    } else {
                        int i29 = ~((iShareDataUIState ^ 1803208242) | (iShareDataUIState & 1803208242));
                        i6 = (((i26 ^ i29) | (i26 & i29)) * (-196)) + i25;
                    }
                    int i30 = (i6 - (~(-(-(392 * ((i21 ^ 1803208242) | (i21 & 1803208242))))))) - 1;
                    int i31 = ~((~i21) | (-1803208243));
                    int i32 = ~((iShareDataUIState & 1803208242) | (iShareDataUIState ^ 1803208242));
                    int i33 = ((i31 & i32) | (i31 ^ i32)) * 196;
                    int i34 = ((i30 | i33) << 1) - (i30 ^ i33);
                    Object[] objArr2 = new Object[1];
                    a(c2, i34, new char[]{14862, 14403, 13641, 38782, 7642, 32314, 39852, 21667, 43439, 21064, 8406, 14545, 37170, 55865, 8863, 47821, 10587, 21932, 50114, 14299, 38749, 64993, 9082, 17447, 60610, 29805, 56833, 41793, 24929, 31482, 34276}, new char[]{12926, 31430, 28267, 14184}, new char[]{0, 0, 0, 0}, objArr2);
                    try {
                        Object[] objArr3 = {(String) objArr2[0]};
                        int i35 = -(SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int i36 = ~i35;
                        i7 = ~i;
                        int i37 = ~((i36 ^ i7) | (i36 & i7));
                        int i38 = ~(((-2) ^ i35) | ((-2) & i35));
                        int i39 = (i37 ^ i38) | (i38 & i37);
                        int i40 = ~((i35 ^ i) | (i35 & i));
                        int i41 = (((i35 * (-337)) + 339) - (~(-(-(((i39 ^ i40) | (i39 & i40)) * (-338)))))) - 1;
                        int i42 = ~i35;
                        int i43 = -(-((~(i42 | 1)) * 338));
                        int i44 = (i41 & i43) + (i41 | i43);
                        i8 = ~i;
                        int i45 = ~((i42 & i8) | (i42 ^ i8));
                        int i46 = (i35 & 1) | (i35 ^ 1);
                        int i47 = ~((i46 & i) | (i46 ^ i));
                        int i48 = ((i45 & i47) | (i45 ^ i47)) * 338;
                        int i49 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L);
                        Object[] objArr4 = new Object[1];
                        b(((i44 | i48) << 1) - (i44 ^ i48), (i49 ^ 38) + ((i49 & 38) << 1), (char) (((packedPositionType | 45871) << 1) - (packedPositionType ^ 45871)), objArr4);
                        objNewInstance = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class).newInstance(objArr3);
                        int i50 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iShareDataUIState2 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                        int i51 = ~i50;
                        int i52 = ~((~iShareDataUIState2) | i51);
                        int i53 = ~(((-39) ^ i50) | ((-39) & i50));
                        int i54 = (i52 ^ i53) | (i52 & i53);
                        int i55 = ~((i50 ^ iShareDataUIState2) | (i50 & iShareDataUIState2));
                        int i56 = (((i50 * (-337)) + 12882) - (~(-(-(((i54 ^ i55) | (i54 & i55)) * (-338)))))) - 1;
                        int i57 = ~i50;
                        int i58 = i56 + ((~((i57 & 38) | (i57 ^ 38))) * 338);
                        int i59 = (i50 & 38) | (i50 ^ 38);
                        int i60 = -(-(((~((i59 & iShareDataUIState2) | (i59 ^ iShareDataUIState2))) | (~((~iShareDataUIState2) | i51))) * 338));
                        Object[] objArr5 = new Object[1];
                        b((i58 & i60) + (i60 | i58), 31 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask())))), (char) (61160 - (~(-View.getDefaultSize(0, 0)))), objArr5);
                        String str = (String) objArr5[0];
                        int i61 = getAsAtTimestamp;
                        int i62 = (i61 ^ 81) + ((i61 & 81) << 1);
                        copy = i62 % 128;
                        int i63 = i62 % 2;
                        try {
                            Object[] objArr6 = {str};
                            int i64 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i65 = -ExpandableListView.getPackedPositionGroup(0L);
                            int iShareDataUIState3 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                            int i66 = i65 * 495;
                            int i67 = ((((i66 | (-18734)) << 1) - (i66 ^ (-18734))) - (~(((i65 ^ (-39)) | (i65 & (-39))) * (-988)))) - 1;
                            int i68 = getAsAtTimestamp;
                            int i69 = (i68 & 65) + (i68 | 65);
                            copy = i69 % 128;
                            int i70 = i69 % 2;
                            int i71 = ~i65;
                            int i72 = (38 & i71) | (38 ^ i71);
                            int i73 = ~iShareDataUIState3;
                            int i74 = 494 * ((i72 ^ i73) | (i72 & i73));
                            int i75 = (i67 ^ i74) + ((i74 & i67) << 1);
                            int i76 = ~((~i65) | (-39));
                            int i77 = ~iShareDataUIState3;
                            int i78 = ~((i77 & 38) | (i77 ^ 38));
                            int i79 = (i78 & i76) | (i76 ^ i78);
                            int i80 = ~((i65 & 38) | (i65 ^ 38));
                            int i81 = (i75 - (~(((i80 & i79) | (i79 ^ i80)) * 494))) - 1;
                            int i82 = -(-(PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                            Object[] objArr7 = new Object[1];
                            b(i64, i81, (char) ((i82 ^ 45871) + ((i82 & 45871) << 1)), objArr7);
                            objNewInstance2 = Class.forName((String) objArr7[0]).getDeclaredConstructor(String.class).newInstance(objArr6);
                            int i83 = getAsAtTimestamp;
                            int i84 = (i83 ^ 55) + ((i83 & 55) << 1);
                            copy = i84 % 128;
                            int i85 = i84 % 2;
                            try {
                                Object[] objArr8 = new Object[1];
                                b(KeyEvent.getDeadChar(0, 0) + 69, 22 - (~(-(-(ViewConfiguration.getKeyRepeatTimeout() >> 16)))), (char) KeyEvent.getDeadChar(0, 0), objArr8);
                                Class<?> cls = Class.forName((String) objArr8[0]);
                                int i86 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int iShareDataUIState4 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                                int i87 = (i86 * 477) - 43225;
                                int i88 = ~i86;
                                int i89 = ~((i88 & 91) | (i88 ^ 91));
                                int i90 = getAsAtTimestamp;
                                int i91 = (i90 & 73) + (i90 | 73);
                                copy = i91 % 128;
                                if (i91 % 2 != 0) {
                                    i10 = (-92) | i86;
                                    int i92 = -(-((~((i10 ^ iShareDataUIState4) | (i10 & iShareDataUIState4))) | i89));
                                    int i93 = -(-(((i92 | (-476)) << 1) - (i92 ^ (-476))));
                                    i9 = (i87 & i93) + (i93 | i87);
                                } else {
                                    int i94 = (-92) | i86;
                                    int i95 = ~((i94 & iShareDataUIState4) | (i94 ^ iShareDataUIState4));
                                    int i96 = ((i95 & i89) | (i89 ^ i95)) * (-476);
                                    i9 = (i87 & i96) + (i96 | i87);
                                    i10 = ((-92) & i86) | ((-92) ^ i86);
                                }
                                int i97 = -(-(952 * (~(i10 | iShareDataUIState4))));
                                int i98 = (i9 & i97) + (i97 | i9);
                                int i99 = ~iShareDataUIState4;
                                int i100 = (i99 & (-92)) | ((-92) ^ i99);
                                int i101 = i90 + 47;
                                copy = i101 % 128;
                                int i102 = i101 % 2;
                                int i103 = ~((i100 & i86) | (i100 ^ i86));
                                if (i102 != 0) {
                                    i11 = i98 % (476 - i103);
                                    iResolveSize = View.resolveSize(0, 1) * 33;
                                    packedPositionGroup = ExpandableListView.getPackedPositionGroup(1L);
                                } else {
                                    int i104 = i103 * 476;
                                    i11 = (i98 & i104) + (i104 | i98);
                                    iResolveSize = View.resolveSize(0, 0) + 17;
                                    packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                }
                                Object[] objArr9 = new Object[1];
                                b(i11, iResolveSize, (char) packedPositionGroup, objArr9);
                                Object objInvoke = cls.getMethod((String) objArr9[0], null).invoke(context, null);
                                try {
                                    int i105 = -(ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    int i106 = i105 * 829;
                                    int i107 = (i106 ^ 57201) + ((i106 & 57201) << 1);
                                    int i108 = ~i105;
                                    int i109 = ~((i108 & (-70)) | (i108 ^ (-70)));
                                    int i110 = (i7 ^ i105) | (i7 & i105);
                                    int i111 = ~((i110 & 69) | (i110 ^ 69));
                                    int i112 = (i107 - (~(-(-(((i109 & i111) | (i109 ^ i111)) * (-828)))))) - 1;
                                    int i113 = i105 | 69;
                                    int i114 = -(-(((i113 ^ i7) | (i113 & i7)) * (-828)));
                                    int i115 = ((i112 | i114) << 1) - (i112 ^ i114);
                                    int i116 = (~i113) * 828;
                                    Object[] objArr10 = new Object[1];
                                    b((i115 & i116) + (i116 | i115), 23 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr10);
                                    Class<?> cls2 = Class.forName((String) objArr10[0]);
                                    int i117 = -(SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    int iShareDataUIState5 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                                    int i118 = (i117 * (-963)) + 34359791;
                                    int i119 = -(-(((~i117) | (~(((-35608) ^ iShareDataUIState5) | ((-35608) & iShareDataUIState5)))) * (-964)));
                                    int i120 = ((i118 | i119) << 1) - (i118 ^ i119);
                                    int i121 = ~iShareDataUIState5;
                                    int i122 = ~((i121 & (-35608)) | ((-35608) ^ i121));
                                    int i123 = ~(i117 | (-35608));
                                    int i124 = -(-(((i123 & i122) | (i122 ^ i123)) * (-964)));
                                    Object[] objArr11 = new Object[1];
                                    a((char) ((i120 & i124) + (i124 | i120)), KeyEvent.keyCodeFromString(""), new char[]{26047, 327, 43762, 52121, 27285, 3077, 17045, 37899, 46814, 35447, 1762, 20327, 41008, 52550}, new char[]{38729, 49339, 5634, 22411}, new char[]{0, 0, 0, 0}, objArr11);
                                    Object objInvoke2 = cls2.getMethod((String) objArr11[0], null).invoke(context, null);
                                    ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                                    try {
                                        Object[] objArr12 = {objInvoke2, 64};
                                        int i125 = -(-TextUtils.indexOf("", ""));
                                        int i126 = (i125 & 109) + (i125 | 109);
                                        int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                        int iShareDataUIState6 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                                        int i127 = keyRepeatTimeout * (-432);
                                        int i128 = (i127 ^ 14322) + ((i127 & 14322) << 1);
                                        int i129 = ~keyRepeatTimeout;
                                        int i130 = ~iShareDataUIState6;
                                        int i131 = (i130 & i129) | (i129 ^ i130);
                                        int i132 = (i128 - (~(-(-((~((i131 & 33) | (i131 ^ 33))) * 433))))) - 1;
                                        int i133 = -(-((i129 | (~(((-34) ^ iShareDataUIState6) | ((-34) & iShareDataUIState6)))) * (-433)));
                                        int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
                                        int i135 = ~keyRepeatTimeout;
                                        int i136 = ~((iShareDataUIState6 & i135) | (i135 ^ iShareDataUIState6));
                                        int i137 = ~((keyRepeatTimeout & 33) | (keyRepeatTimeout ^ 33));
                                        int i138 = i134 + (((i137 & i136) | (i136 ^ i137)) * 433);
                                        int i139 = -TextUtils.getTrimmedLength("");
                                        Object[] objArr13 = new Object[1];
                                        b(i126, i138, (char) ((i139 & 34083) + (i139 | 34083)), objArr13);
                                        Class<?> cls3 = Class.forName((String) objArr13[0]);
                                        int i140 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        int iShareDataUIState7 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                                        int i141 = i140 * (-464);
                                        int i142 = (i141 ^ (-131918)) + ((i141 & (-131918)) << 1);
                                        int i143 = ~i140;
                                        int i144 = (iShareDataUIState7 & 142) | (iShareDataUIState7 ^ 142);
                                        int i145 = ~i144;
                                        int i146 = ((i143 ^ i145) | (i143 & i145)) * (-465);
                                        int i147 = ((i142 | i146) << 1) - (i146 ^ i142);
                                        int i148 = ~i140;
                                        int i149 = ((~((iShareDataUIState7 & i148) | (i148 ^ iShareDataUIState7))) | 142) * 930;
                                        int i150 = (i147 & i149) + (i149 | i147);
                                        int i151 = ((i148 & i144) | (i144 ^ i148)) * 465;
                                        int i152 = -(-TextUtils.getOffsetAfter("", 0));
                                        Object[] objArr14 = new Object[1];
                                        b((i150 ^ i151) + ((i151 & i150) << 1), (i152 & 14) + (i152 | 14), (char) (33945 - (~(-Gravity.getAbsoluteGravity(0, 0)))), objArr14);
                                        Object objInvoke3 = cls3.getMethod((String) objArr14[0], String.class, Integer.TYPE).invoke(objInvoke, objArr12);
                                        int i153 = -Color.green(0);
                                        Object[] objArr15 = new Object[1];
                                        a((char) (((i153 | 816) << 1) - (i153 ^ 816)), ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{36058, 62343, 39560, 15030, 49528, 64648, 456, 50460, 41231, 23090, 55273, 55117, 21659, 57916, 10755, 61396, 43125, 47950, 63987, 41541, 37643, 27875, 40598, 33084, 11065, 33872, 46032, 62908, 19577, 10802}, new char[]{56830, 39476, 12508, 52739}, new char[]{0, 0, 0, 0}, objArr15);
                                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                                        char defaultSize = (char) View.getDefaultSize(0, 0);
                                        int i154 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                        int iShareDataUIState8 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                                        int i155 = (i154 * (-515)) - 517;
                                        int i156 = ~iShareDataUIState8;
                                        int i157 = ~((~iShareDataUIState8) | i154);
                                        int i158 = ((i156 & i157) | (i156 ^ i157)) * (-516);
                                        int i159 = (i155 ^ i158) + ((i155 & i158) << 1);
                                        int i160 = ~((~i154) | iShareDataUIState8);
                                        int i161 = ~i154;
                                        int i162 = ~iShareDataUIState8;
                                        int i163 = (i161 ^ i162) | (i161 & i162);
                                        int i164 = ~(i163 | (~i163));
                                        int i165 = -(-(((i160 & i164) | (i160 ^ i164)) * DeepRecoverARiverProxy.TYPE_EXCEPTION_CANNOT_CRASH_PAGE));
                                        int i166 = ~(i161 | (~i161));
                                        int i167 = ~(i162 | (~i162));
                                        Object[] objArr16 = new Object[1];
                                        a(defaultSize, ((((i159 | i165) << 1) - (i165 ^ i159)) - (~(((i166 & i167) | (i166 ^ i167)) * DeepRecoverARiverProxy.TYPE_EXCEPTION_CANNOT_CRASH_PAGE))) - 1, new char[]{11820, 32822, 9221, 55063, 9869, 16297, 52034, 50763, 58228, 28766}, new char[]{23458, 17700, 32331, 35188}, new char[]{0, 0, 0, 0}, objArr16);
                                        objArr = (Object[]) cls4.getField((String) objArr16[0]).get(objInvoke3);
                                        length = objArr.length;
                                        i12 = 0;
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause != null) {
                                            throw cause;
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 != null) {
                                throw cause4;
                            }
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        Throwable cause5 = th5.getCause();
                        if (cause5 != null) {
                            throw cause5;
                        }
                        throw th5;
                    }
                } catch (Throwable unused) {
                }
                while (i12 < length) {
                    Object obj = objArr[i12];
                    int i168 = -ExpandableListView.getPackedPositionChild(0L);
                    int i169 = i168 * 989;
                    int i170 = (i169 & (-152985)) + (i169 | (-152985));
                    int i171 = ((-156) & i7) | ((-156) ^ i7);
                    int i172 = (i168 ^ 155) | (i168 & 155);
                    int i173 = ((~((i171 & i168) | (i171 ^ i168))) | (~((i172 & i) | (i172 ^ i)))) * 988;
                    int i174 = (i170 & i173) + (i173 | i170) + ((i168 | (-156)) * (-988));
                    int i175 = getAsAtTimestamp + 79;
                    copy = i175 % 128;
                    if (i175 % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    int i176 = (~((~i168) | (-156))) | (~((-156) | i));
                    int i177 = (i168 & i8) | (i8 ^ i168);
                    int i178 = ~((i177 & 155) | (i177 ^ 155));
                    int i179 = i174 + (988 * ((i178 & i176) | (i176 ^ i178)));
                    int i180 = -Color.argb(0, 0, 0, 0);
                    int i181 = (i180 ^ 5) + ((i180 & 5) << 1);
                    int i182 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                    int iShareDataUIState9 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                    int i183 = copy + 41;
                    getAsAtTimestamp = i183 % 128;
                    if (i183 % 2 == 0) {
                        i13 = (-1939) / i182;
                        i14 = 124288;
                    } else {
                        i13 = i182 * (-1939);
                        i14 = 41736493;
                    }
                    int i184 = ((i13 | i14) << 1) - (i13 ^ i14);
                    int i185 = ~(((-42984) & i182) | ((-42984) ^ i182));
                    int iShareDataUIState10 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                    Object[] objArr17 = objArr;
                    int i186 = -(-((~(((-1031835580) ^ iShareDataUIState10) | ((-1031835580) & iShareDataUIState10))) * 216));
                    int i187 = (586314152 & i186) + (586314152 | i186);
                    int i188 = ~iShareDataUIState10;
                    int i189 = -(-((((-285215777) ^ i188) | ((-285215777) & i188)) * (-216)));
                    int i190 = (i187 ^ i189) + ((i187 & i189) << 1);
                    int i191 = ~iShareDataUIState10;
                    int i192 = (i190 - (~(((~((i191 & (-1031835580)) | (i191 ^ (-1031835580)))) | 1392983140) * 216))) - 1;
                    int i193 = ~((i8 ^ (-246759520)) | ((-246759520) & i8));
                    int i194 = length;
                    int i195 = -(-(((1071902313 ^ i193) | (1071902313 & i193)) * 764));
                    int i196 = (((-204763951) | i195) << 1) - ((-204763951) ^ i195);
                    int i197 = ~((i8 ^ 1071902313) | (i8 & 1071902313));
                    if (i192 > i196 + ((((-1073213056) ^ i197) | ((-1073213056) & i197)) * (-1528)) + ((((-827764279) ^ i193) | ((-827764279) & i193)) * 764)) {
                        int i198 = ~iShareDataUIState9;
                        int i199 = (i184 - (~(-((-970) - ((~((i198 ^ 42983) | (i198 & 42983))) | i185))))) - 1;
                        int i200 = ~i182;
                        i15 = i199 * (1940 / (~((i200 & 42983) | (i200 ^ 42983))));
                    } else {
                        int i201 = ~iShareDataUIState9;
                        int i202 = ~((i201 ^ 42983) | (i201 & 42983));
                        int i203 = i184 + ((-970) * ((i185 ^ i202) | (i202 & i185)));
                        int i204 = (~((~i182) | 42983)) * 1940;
                        i15 = ((i203 | i204) << 1) - (i203 ^ i204);
                    }
                    int i205 = ~i182;
                    int i206 = ~((i205 & (-42984)) | (i205 ^ (-42984)));
                    int i207 = ~iShareDataUIState9;
                    int i208 = ~((i207 & 42983) | (i207 ^ 42983));
                    Object[] objArr18 = new Object[1];
                    b(i179, i181, (char) (i15 + (970 * ((i206 & i208) | (i206 ^ i208)))), objArr18);
                    String str2 = (String) objArr18[0];
                    int i209 = copy + 45;
                    int i210 = i209 % 128;
                    getAsAtTimestamp = i210;
                    int i211 = i209 % 2;
                    int i212 = ((i210 | 89) << 1) - (i210 ^ 89);
                    copy = i212 % 128;
                    int i213 = i212 % 2;
                    try {
                        Object[] objArr19 = {str2};
                        Object[] objArr20 = new Object[1];
                        a((char) Drawable.resolveOpacity(0, 0), (-547319906) - (~((Process.getThreadPriority(0) + 20) >> 6)), new char[]{10632, 27991, 37363, 44969, 46391, 55798, 27356, 31531, 46745, Typography.registered, 42958, 52199, 24117, 3275, 28707, 60692, 24226, 48158, 44042, 31827, 29521, 40113, 13209, 23024, 32248, 40025, 50668, 44594, 54387, 33831, 10866, 16266, 51639, 63352, 65348, 21913, 29443}, new char[]{40711, 24719, 5087, 28288}, new char[]{0, 0, 0, 0}, objArr20);
                        Class<?> cls5 = Class.forName((String) objArr20[0]);
                        int i214 = -Color.blue(0);
                        int i215 = (i214 ^ 161) + ((i214 & 161) << 1);
                        int maximumDrawingCacheSize = ViewConfiguration.getMaximumDrawingCacheSize() >> 24;
                        int iShareDataUIState11 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                        int i216 = copy + 17;
                        int i217 = i216 % 128;
                        getAsAtTimestamp = i217;
                        if (i216 % 2 == 0) {
                            int i218 = (maximumDrawingCacheSize * (-432)) / 4774;
                            int i219 = ~maximumDrawingCacheSize;
                            i16 = i12;
                            int i220 = ~iShareDataUIState11;
                            int i221 = (i219 ^ i220) | (i220 & i219);
                            i17 = i218 * (433 / (~((i221 & 11) | (i221 ^ 11))));
                        } else {
                            i16 = i12;
                            int i222 = (maximumDrawingCacheSize * (-432)) + 4774;
                            int i223 = ~maximumDrawingCacheSize;
                            int i224 = ~iShareDataUIState11;
                            int i225 = (i223 ^ i224) | (i223 & i224);
                            int i226 = (~((i225 & 11) | (i225 ^ 11))) * 433;
                            i17 = (i222 & i226) + (i222 | i226);
                        }
                        int i227 = ~maximumDrawingCacheSize;
                        int i228 = ~(((-12) ^ iShareDataUIState11) | ((-12) & iShareDataUIState11));
                        int i229 = -(-((-433) * ((i227 ^ i228) | (i227 & i228))));
                        int i230 = ((i17 | i229) << 1) - (i229 ^ i17);
                        int i231 = ~((~maximumDrawingCacheSize) | iShareDataUIState11);
                        int i232 = (i217 & 29) + (i217 | 29);
                        copy = i232 % 128;
                        int i233 = i232 % 2;
                        int i234 = ~(maximumDrawingCacheSize | 11);
                        int i235 = ((i234 & i231) | (i231 ^ i234)) * 433;
                        int i236 = ((i230 | i235) << 1) - (i235 ^ i230);
                        int edgeSlop = ViewConfiguration.getEdgeSlop() >> 16;
                        int iShareDataUIState12 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                        int i237 = ~edgeSlop;
                        int i238 = ~((i237 ^ 47713) | (i237 & 47713));
                        int i239 = ((-47714) ^ edgeSlop) | ((-47714) & edgeSlop);
                        Object obj3 = objNewInstance2;
                        int i240 = (((((edgeSlop * 450) - 21375424) - (~(-(-(((~((i239 ^ iShareDataUIState12) | (i239 & iShareDataUIState12))) | i238) * 449))))) - 1) - (~((~(i237 | 47713)) * (-1347)))) - 1;
                        int i241 = ~iShareDataUIState12;
                        int i242 = ~(edgeSlop | (i241 & (-47714)) | ((-47714) ^ i241));
                        char c3 = (char) (i240 + (((i242 & i238) | (i238 ^ i242)) * 449));
                        Object[] objArr21 = new Object[1];
                        b(i215, i236, c3, objArr21);
                        Object objInvoke4 = cls5.getMethod((String) objArr21[0], String.class).invoke(null, objArr19);
                        try {
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0);
                            int i243 = (iLastIndexOf ^ 173) + ((iLastIndexOf & 173) << 1);
                            int i244 = -ExpandableListView.getPackedPositionGroup(0L);
                            int i245 = ((i244 | 28) << 1) - (i244 ^ 28);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                            int i246 = copy;
                            int i247 = ((i246 | 111) << 1) - (i246 ^ 111);
                            getAsAtTimestamp = i247 % 128;
                            int i248 = i247 % 2;
                            int i249 = 784 * iNormalizeMetaState;
                            int i250 = ((i249 ^ (-18361360)) + ((i249 & (-18361360)) << 1)) - (-18385623);
                            int i251 = ~iNormalizeMetaState;
                            int i252 = i251 | i8;
                            int i253 = -(-((~((i252 & 23480) | (i252 ^ 23480))) * (-783)));
                            int i254 = (i250 ^ i253) + ((i253 & i250) << 1);
                            int i255 = (i246 & 77) + (i246 | 77);
                            getAsAtTimestamp = i255 % 128;
                            int i256 = i255 % 2;
                            int i257 = ~((i7 ^ 23480) | (i7 & 23480));
                            int i258 = -(-(783 * ((i257 & i251) | (i251 ^ i257))));
                            Object[] objArr22 = new Object[1];
                            b(i243, i245, (char) (((i254 | i258) << 1) - (i258 ^ i254)), objArr22);
                            Class<?> cls6 = Class.forName((String) objArr22[0]);
                            int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0);
                            int iShareDataUIState13 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
                            int i259 = iNormalizeMetaState2 * (-711);
                            int i260 = ~(((-201) ^ iNormalizeMetaState2) | ((-201) & iNormalizeMetaState2));
                            int i261 = ~iShareDataUIState13;
                            int i262 = ~(i261 | iNormalizeMetaState2);
                            int i263 = ((((i259 | 142600) << 1) - (i259 ^ 142600)) - (~(((i260 ^ i262) | (i260 & i262)) * (-712)))) - 1;
                            int i264 = ~iShareDataUIState13;
                            int i265 = ((-201) & i264) | ((-201) ^ i264);
                            int i266 = (iNormalizeMetaState2 ^ 200) | (iNormalizeMetaState2 & 200);
                            int i267 = i263 + (((~((iShareDataUIState13 & i266) | (i266 ^ iShareDataUIState13))) | (~((i265 & iNormalizeMetaState2) | (i265 ^ iNormalizeMetaState2)))) * (-712));
                            int i268 = ~((i261 ^ iNormalizeMetaState2) | (iNormalizeMetaState2 & i261));
                            int i269 = (i267 - (~(-(-(((i268 & (-201)) | ((-201) ^ i268)) * 712))))) - 1;
                            int i270 = -KeyEvent.getDeadChar(0, 0);
                            int i271 = i270 * 829;
                            int i272 = ((i271 | 9119) << 1) - (i271 ^ 9119);
                            int i273 = ~i270;
                            int i274 = copy + 69;
                            getAsAtTimestamp = i274 % 128;
                            int i275 = i274 % 2;
                            int i276 = ~((i273 & (-12)) | (i273 ^ (-12)));
                            int i277 = i7 | i270;
                            int i278 = ~((i277 & 11) | (i277 ^ 11));
                            int i279 = ((i276 & i278) | (i276 ^ i278)) * (-828);
                            int i280 = (i272 ^ i279) + ((i279 & i272) << 1);
                            int i281 = (i270 ^ 11) | (i270 & 11);
                            int i282 = ((i281 ^ i7) | (i281 & i7)) * (-828);
                            int i283 = ((i280 | i282) << 1) - (i282 ^ i280);
                            int i284 = (~i281) * 828;
                            int i285 = (i283 ^ i284) + ((i284 & i283) << 1);
                            int i286 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            Object[] objArr23 = new Object[1];
                            b(i269, i285, (char) ((i286 & 1) + (i286 | 1)), objArr23);
                            try {
                                Object[] objArr24 = {new ByteArrayInputStream((byte[]) cls6.getMethod((String) objArr23[0], null).invoke(obj, null))};
                                int iAlpha = Color.alpha(0);
                                int i287 = getAsAtTimestamp;
                                int i288 = (i287 ^ 99) + ((i287 & 99) << 1);
                                copy = i288 % 128;
                                char c4 = (char) iAlpha;
                                if (i288 % 2 != 0) {
                                    minimumFlingVelocity = (-547319905) % (ViewConfiguration.getMinimumFlingVelocity() >>> 61);
                                    cArr = new char[37];
                                } else {
                                    int i289 = -(ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                    minimumFlingVelocity = (i289 ^ (-547319905)) + ((i289 & (-547319905)) << 1);
                                    cArr = new char[37];
                                }
                                
                                cArr[0] = 10632;
                                cArr[1] = 27991;
                                cArr[2] = 37363;
                                cArr[3] = 44969;
                                cArr[4] = 46391;
                                cArr[5] = 55798;
                                cArr[6] = 27356;
                                cArr[7] = 31531;
                                cArr[8] = 46745;
                                cArr[9] = 174;
                                cArr[10] = 42958;
                                cArr[11] = 52199;
                                cArr[12] = 24117;
                                cArr[13] = 3275;
                                cArr[14] = 28707;
                                cArr[15] = 60692;
                                cArr[16] = 24226;
                                cArr[17] = 48158;
                                cArr[18] = 44042;
                                cArr[19] = 31827;
                                cArr[20] = 29521;
                                cArr[21] = 40113;
                                cArr[22] = 13209;
                                cArr[23] = 23024;
                                cArr[24] = 32248;
                                cArr[25] = 40025;
                                cArr[26] = 50668;
                                cArr[27] = 44594;
                                cArr[28] = 54387;
                                cArr[29] = 33831;
                                cArr[30] = 10866;
                                cArr[31] = 16266;
                                cArr[32] = 51639;
                                cArr[33] = 63352;
                                cArr[34] = 65348;
                                cArr[35] = 21913;
                                cArr[36] = 29443;
                                Object[] objArr25 = new Object[1];
                                a(c4, minimumFlingVelocity, cArr, new char[]{40711, 24719, 5087, 28288}, new char[]{0, 0, 0, 0}, objArr25);
                                Class<?> cls7 = Class.forName((String) objArr25[0]);
                                int i290 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                char c5 = (char) (((i290 | 60746) << 1) - (i290 ^ 60746));
                                int i291 = copy;
                                int i292 = (i291 ^ 85) + ((i291 & 85) << 1);
                                getAsAtTimestamp = i292 % 128;
                                if (i292 % 2 == 0) {
                                    int jumpTapTimeout2 = ViewConfiguration.getJumpTapTimeout();
                                    jumpTapTimeout = 2032381023 % ((jumpTapTimeout2 & 78) + (jumpTapTimeout2 | 78));
                                    cArr2 = new char[]{20357, 9279, 9996, 25103, 15077, 7616, 13356, 52102, 60209, 11260, 20440, 48321, 44618, 19665, 14134, 45818, 63852, 21365, 2733};
                                    cArr3 = new char[]{24369, 9132, 19321, 20461};
                                    i18 = 4;
                                } else {
                                    i18 = 4;
                                    cArr2 = new char[]{20357, 9279, 9996, 25103, 15077, 7616, 13356, 52102, 60209, 11260, 20440, 48321, 44618, 19665, 14134, 45818, 63852, 21365, 2733};
                                    jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2032381023;
                                    cArr3 = new char[]{24369, 9132, 19321, 20461};
                                }
                                char[] cArr4 = new char[i18];
                                
                                cArr4[0] = 0;
                                cArr4[1] = 0;
                                cArr4[2] = 0;
                                cArr4[3] = 0;
                                Object[] objArr26 = new Object[1];
                                a(c5, jumpTapTimeout, cArr2, cArr3, cArr4, objArr26);
                                String str3 = (String) objArr26[0];
                                Class<?>[] clsArr = new Class[1];
                                int i293 = getAsAtTimestamp;
                                int i294 = (i293 ^ 57) + ((i293 & 57) << 1);
                                copy = i294 % 128;
                                int i295 = i294 % 2;
                                clsArr[0] = InputStream.class;
                                Object objInvoke5 = cls7.getMethod(str3, clsArr).invoke(objInvoke4, objArr24);
                                try {
                                    Object[] objArr27 = new Object[1];
                                    a((char) TextUtils.getOffsetAfter("", 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{39531, 12308, 900, 19414, 16596, 46362, 44707, 54053, 42914, 10299, 3914, 4152, 42230, 6479, 12915, 27672, 17179, 29890, 41752, 8130, 15674, 33449, 7821, 23943, 7630, 44322, 38598, 41919, 48908, 49202, 22438, 8088, 42420, 16339}, new char[]{49667, 60241, 41679, 44372}, new char[]{0, 0, 0, 0}, objArr27);
                                    Class<?> cls8 = Class.forName((String) objArr27[0]);
                                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                    int threadPriority = Process.getThreadPriority(0);
                                    int i296 = threadPriority * (-489);
                                    int i297 = ((9820 | i296) << 1) - (i296 ^ 9820);
                                    int i298 = ~threadPriority;
                                    int i299 = ((-21) & i298) | ((-21) ^ i298);
                                    int i300 = -((((i297 + (((i299 & i7) | (i299 ^ i7)) * (-490))) - (~(((~(i298 | i)) | (~((i298 ^ 20) | (i298 & 20)))) * 490))) - 10291) >> 6);
                                    int i301 = i300 * (-813);
                                    int i302 = (i301 & (-1507628592)) + (i301 | (-1507628592));
                                    int i303 = (i300 ^ i) | (i300 & i);
                                    int i304 = -(-(((~((1645888545 ^ i300) | (1645888545 & i300))) | (~i303)) * (-814)));
                                    int i305 = (i302 ^ i304) + ((i304 & i302) << 1);
                                    int i306 = ~((1645888545 & i7) | (1645888545 ^ i7));
                                    int i307 = ~i300;
                                    int i308 = ~((i307 ^ (-1645888546)) | (i307 & (-1645888546)));
                                    int i309 = (i306 ^ i308) | (i306 & i308);
                                    int i310 = ~i303;
                                    int i311 = i305 + (((i309 ^ i310) | (i309 & i310)) * 407);
                                    int i312 = ~((~i300) | i);
                                    int i313 = (i312 & i308) | (i308 ^ i312);
                                    int i314 = ~((i ^ (-1645888546)) | (i & (-1645888546)));
                                    Object[] objArr28 = new Object[1];
                                    a(pressedStateDuration, (i311 - (~(-(-(((i313 & i314) | (i313 ^ i314)) * 407))))) - 1, new char[]{10928, 23015, 22232, 16929, 33747, 55154, 31088, 49963, 44564, 1057, 2277, 49108, 47740, 2252, 64887, 52614, 26066, 33852, 25273, 25065, 63614, 31572, 38495}, new char[]{56843, 58811, 30109, 22360}, new char[]{0, 0, 0, 0}, objArr28);
                                    if (!objNewInstance.equals(cls8.getMethod((String) objArr28[0], null).invoke(objInvoke5, null))) {
                                        try {
                                            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                                            int iResolveOpacity = Drawable.resolveOpacity(0, 0);
                                            char[] cArr5 = {39531, 12308, 900, 19414, 16596, 46362, 44707, 54053, 42914, 10299, 3914, 4152, 42230, 6479, 12915, 27672, 17179, 29890, 41752, 8130, 15674, 33449, 7821, 23943, 7630, 44322, 38598, 41919, 48908, 49202, 22438, 8088, 42420, 16339};
                                            int i315 = getAsAtTimestamp + 83;
                                            copy = i315 % 128;
                                            int i316 = i315 % 2;
                                            Object[] objArr29 = new Object[1];
                                            a(offsetAfter, iResolveOpacity, cArr5, new char[]{49667, 60241, 41679, 44372}, new char[]{0, 0, 0, 0}, objArr29);
                                            Class<?> cls9 = Class.forName((String) objArr29[0]);
                                            a((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (-1645888547) - (~(-TextUtils.getOffsetAfter("", 0))), new char[]{10928, 23015, 22232, 16929, 33747, 55154, 31088, 49963, 44564, 1057, 2277, 49108, 47740, 2252, 64887, 52614, 26066, 33852, 25273, 25065, 63614, 31572, 38495}, new char[]{56843, 58811, 30109, 22360}, new char[]{0, 0, 0, 0}, new Object[1]);
                                            if (!obj3.equals(cls9.getMethod((String) r7[0], null).invoke(objInvoke5, null))) {
                                                i12 = i16 + 1;
                                                int i317 = copy;
                                                int i318 = (i317 & 109) + (i317 | 109);
                                                getAsAtTimestamp = i318 % 128;
                                                int i319 = i318 % 2;
                                                objNewInstance2 = obj3;
                                                objArr = objArr17;
                                                length = i194;
                                            }
                                        } catch (Throwable th6) {
                                            Throwable cause6 = th6.getCause();
                                            if (cause6 != null) {
                                                throw cause6;
                                            }
                                            throw th6;
                                        }
                                    }
                                    Object[] objArr30 = {new int[1], new int[]{i ^ 1}, new int[]{i}, null};
                                    int i320 = (int) Runtime.getRuntime().totalMemory();
                                    int i321 = 1098604877 + (((~((-10232129) | i320)) | (-182965360)) * (-318));
                                    int i322 = ~((-182965360) | i320);
                                    int i323 = ~i320;
                                    int i324 = i321 + ((i322 | (~(184546671 | i323))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i320 | 184546671)) | (~((-174314544) | i323))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET);
                                    int i325 = -(-(((i324 | 16) << 1) - (i324 ^ 16)));
                                    int i326 = ((i2 | i325) << 1) - (i2 ^ i325);
                                    int i327 = i326 << 13;
                                    int i328 = (i327 & (~i326)) | ((~i327) & i326);
                                    int i329 = i328 >>> 17;
                                    int i330 = (i328 | i329) & (~(i328 & i329));
                                    ((int[]) objArr30[0])[0] = i330 ^ (i330 << 5);
                                    return objArr30;
                                } catch (Throwable th7) {
                                    Throwable cause7 = th7.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th7;
                                }
                            } catch (Throwable th8) {
                                Throwable cause8 = th8.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th8;
                            }
                        } catch (Throwable th9) {
                            Throwable cause9 = th9.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th9;
                        }
                    } catch (Throwable th10) {
                        Throwable cause10 = th10.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th10;
                    }
                    i3 = 4;
                }
                i3 = 4;
            } else {
                i3 = 4;
            }
            Object[] objArr31 = new Object[i3];
            objArr31[0] = new int[1];
            objArr31[1] = new int[]{i};
            objArr31[2] = new int[]{i};
            objArr31[3] = null;
            int i331 = (-2020366482) + (((~(i | (-641025086))) | (-834222574)) * (-465)) + (((-641025086) | (~((-834222574) | i))) * 930) + (((-540082222) | i) * 465);
            int iShareDataUIState14 = ViewPager2Attacher$buildPager$1$addOnPageChangeListener$1.ShareDataUIState();
            int i332 = (-1) - (~(i331 * (-279)));
            int i333 = -(-(((i331 ^ iShareDataUIState14) | (i331 & iShareDataUIState14)) * 140));
            int i334 = (i332 & i333) + (i333 | i332);
            int i335 = copy;
            int i336 = ((i335 | 73) << 1) - (i335 ^ 73);
            getAsAtTimestamp = i336 % 128;
            int i337 = i336 % 2;
            int i338 = ~(((-1) ^ i331) | i331);
            if (i337 == 0) {
                i4 = ~iShareDataUIState14;
                i5 = i334 / ((-280) >> (i338 | (~((i4 ^ i331) | (i4 & i331)))));
            } else {
                i4 = ~iShareDataUIState14;
                int i339 = ~((i4 ^ i331) | (i4 & i331));
                i5 = i334 + (((i338 & i339) | (i338 ^ i339)) * (-280));
            }
            int i340 = (~(~i331)) | (~i4);
            int i341 = ((-1) ^ i331) | i331;
            int i342 = ~((iShareDataUIState14 & i341) | (i341 ^ iShareDataUIState14));
            int i343 = -(-(140 * ((i342 & i340) | (i340 ^ i342))));
            int i344 = -(-((i5 & i343) + (i343 | i5)));
            int i345 = ((i2 | i344) << 1) - (i2 ^ i344);
            int i346 = i345 << 13;
            int i347 = (i346 & (~i345)) | ((~i346) & i345);
            int i348 = i347 >>> 17;
            int i349 = ((~i347) & i348) | ((~i348) & i347);
            int i350 = i349 << 5;
            ((int[]) objArr31[0])[0] = (i349 | i350) & (~(i349 & i350));
            return objArr31;
        }
    }
}
