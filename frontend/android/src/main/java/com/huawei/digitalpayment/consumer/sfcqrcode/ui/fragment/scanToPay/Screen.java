package com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.Screen;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.cancel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/fragment/scanToPay/Screen;", "", "<init>", "()V", "Permissions", "ScanToPayCamera", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/fragment/scanToPay/Screen$Permissions;", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/fragment/scanToPay/Screen$ScanToPayCamera;", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class Screen {
    private Screen() {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/fragment/scanToPay/Screen$Permissions;", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/fragment/scanToPay/Screen;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class Permissions extends Screen {
        public static final int $stable = 0;
        public static final Permissions INSTANCE;
        private static char ShareDataUIState;
        private static int component2;
        private static long component3;
        private static int component4;
        private static final Lazy<KSerializer<Object>> copydefault;
        private static final byte[] $$a = {96, -37, -4, -26};
        private static final int $$b = 2;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getAsAtTimestamp = 0;
        private static int component1 = 0;
        private static int getRequestBeneficiariesState = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r5, byte r6, int r7) {
            /*
                int r5 = 99 - r5
                int r6 = r6 * 4
                int r0 = 1 - r6
                int r7 = r7 * 4
                int r7 = 4 - r7
                byte[] r1 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.Screen.Permissions.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L16
                r4 = r7
                r3 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                r0[r3] = r4
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L22:
                int r3 = r3 + 1
                r4 = r1[r7]
            L26:
                int r7 = r7 + 1
                int r5 = r5 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.Screen.Permissions.$$c(byte, byte, int):java.lang.String");
        }

        static {
            component4 = 1;
            ShareDataUIState();
            INSTANCE = new Permissions();
            copydefault = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() {
                private static int component1 = 0;
                private static int copydefault = 1;

                @Override
                public final Object invoke() throws Throwable {
                    int i = 2 % 2;
                    int i2 = copydefault + 107;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializerM11093$r8$lambda$V8y0gvLk9QjxkBKOFtd0MeWYo = Screen.Permissions.m11093$r8$lambda$V8y0gvLk9QjxkBKOFtd0MeWYo();
                    if (i3 != 0) {
                        int i4 = 39 / 0;
                    }
                    return kSerializerM11093$r8$lambda$V8y0gvLk9QjxkBKOFtd0MeWYo;
                }
            });
            int i = getAsAtTimestamp + 39;
            component4 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private final KSerializer component1() {
            int i = 2 % 2;
            int i2 = component1 + 43;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<Object> value = copydefault.getValue();
            if (i3 != 0) {
                return value;
            }
            throw null;
        }

        private static final KSerializer component2() throws Throwable {
            int i = 2 % 2;
            Object[] objArr = new Object[1];
            a(new char[]{26258, 65102, 2078, 7343, 48051, 47120, 9537, 50477, 22367, 65368, 49427, 2973, 7644, 6303, 33681, 12999, 6209, 40206, 62343, 33717, 29852, 13576, 26058, 18721, 48922, 25316, 65265, 2037, 14509, 38441, 36660, 44282, 41738, 32058, 54336, 49768, 10431, 27529, 58615, 45872, 5390, 37246, 56791, 23843, 7062, 47571, 52340, 26104, 56309, 17325, 47128, 1346, 10849, 26675, 45975, 27933, 33205, 22562, 55524, 5390, 3410, 35942, 38024, 28308, 22889, 43779, 52704, 8486, 24874, 13216, 43076, 26174, 7364, 23137, 15675, 46668, 60884, 32348, 26448, 14813, 26603, 38449, 9715, 48783, 47294}, new char[]{41401, 27907, 5985, 41692}, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1634534305 - TextUtils.indexOf("", "", 0), new char[]{17156, 3464, 59320, 31429}, objArr);
            ObjectSerializer objectSerializer = new ObjectSerializer(((String) objArr[0]).intern(), INSTANCE, new Annotation[0]);
            int i2 = component1 + 29;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 59 / 0;
            }
            return objectSerializer;
        }

        public final KSerializer<Permissions> serializer() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 77;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<Permissions> kSerializerComponent1 = component1();
            int i4 = getRequestBeneficiariesState + 83;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 59 / 0;
            }
            return kSerializerComponent1;
        }

        private Permissions() {
            super(null);
        }

        private static void a(char[] cArr, char[] cArr2, char c2, int i, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i5 = $11 + 13;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (iNotificationSideChannel.copydefault < length3) {
                int i7 = $10 + 105;
                $11 = i7 % 128;
                int i8 = i7 % i2;
                try {
                    Object[] objArr2 = {iNotificationSideChannel};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                    if (objCopydefault == null) {
                        int edgeSlop = 4037 - (ViewConfiguration.getEdgeSlop() >> 16);
                        int tapTimeout = 31 - (ViewConfiguration.getTapTimeout() >> 16);
                        char cRed = (char) (19181 - Color.red(i4));
                        byte b2 = (byte) ($$b - i2);
                        byte b3 = b2;
                        String str$$c = $$c(b2, b3, b3);
                        Class[] clsArr = new Class[1];
                        clsArr[i4] = Object.class;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, tapTimeout, cRed, 1912513118, false, str$$c, clsArr);
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    try {
                        Object[] objArr3 = {iNotificationSideChannel};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                        if (objCopydefault2 == null) {
                            int trimmedLength = 7567 - TextUtils.getTrimmedLength("");
                            int i9 = 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                            char defaultSize = (char) View.getDefaultSize(i4, i4);
                            Class[] clsArr2 = new Class[1];
                            clsArr2[i4] = Object.class;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(trimmedLength, i9, defaultSize, 2006389106, false, "e", clsArr2);
                        }
                        int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        int i10 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                        try {
                            Object[] objArr4 = new Object[3];
                            objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                            objArr4[1] = Integer.valueOf(i10);
                            objArr4[i4] = iNotificationSideChannel;
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                            if (objCopydefault3 == null) {
                                byte b4 = (byte) ($$b - 1);
                                byte b5 = (byte) (b4 - 1);
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - (ExpandableListView.getPackedPositionForGroup(i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i4) == 0L ? 0 : -1)), 28 - Drawable.resolveOpacity(i4, i4), (char) (ImageFormat.getBitsPerPixel(i4) + 1), 931716605, false, $$c(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objCopydefault3).invoke(null, objArr4);
                            try {
                                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                                if (objCopydefault4 == null) {
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7567, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
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
            int i11 = $11 + 49;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }

        public static KSerializer m11093$r8$lambda$V8y0gvLk9QjxkBKOFtd0MeWYo() throws Throwable {
            int i = 2 % 2;
            int i2 = component1 + 19;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            KSerializer kSerializerComponent2 = component2();
            if (i3 == 0) {
                int i4 = 0 / 0;
            }
            return kSerializerComponent2;
        }

        static void ShareDataUIState() {
            component3 = -5670897515497420811L;
            component2 = 1386857713;
            ShareDataUIState = (char) 50417;
        }
    }

    public Screen(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/fragment/scanToPay/Screen$ScanToPayCamera;", "Lcom/huawei/digitalpayment/consumer/sfcqrcode/ui/fragment/scanToPay/Screen;", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "ConsumerSfcQrCodeUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final class ScanToPayCamera extends Screen {
        public static final int $stable = 0;
        public static final ScanToPayCamera INSTANCE;
        private static final Lazy<KSerializer<Object>> ShareDataUIState;
        private static boolean component1;
        private static boolean component2;
        private static char[] component3;
        private static int copy;
        private static int copydefault;
        private static final byte[] $$a = {40, 108, -113, 75};
        private static final int $$b = 149;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int component4 = 1;
        private static int getAsAtTimestamp = 0;
        private static int getRequestBeneficiariesState = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(byte r5, short r6, short r7) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.Screen.ScanToPayCamera.$$a
                int r6 = r6 * 4
                int r6 = 1 - r6
                int r5 = r5 * 5
                int r5 = 73 - r5
                int r7 = r7 * 2
                int r7 = 4 - r7
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L17
                r5 = r6
                r4 = r7
                r3 = r2
                goto L27
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L25:
                r4 = r0[r7]
            L27:
                int r7 = r7 + 1
                int r4 = -r4
                int r5 = r5 + r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcqrcode.ui.fragment.scanToPay.Screen.ScanToPayCamera.$$c(byte, short, short):java.lang.String");
        }

        static {
            copy = 0;
            component1();
            INSTANCE = new ScanToPayCamera();
            ShareDataUIState = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() {
                private static int component1 = 0;
                private static int component3 = 1;

                @Override
                public final Object invoke() throws Throwable {
                    int i = 2 % 2;
                    int i2 = component3 + 25;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    KSerializer kSerializer$r8$lambda$WaM9o77cJPqybQZqQjThgwAllTE = Screen.ScanToPayCamera.$r8$lambda$WaM9o77cJPqybQZqQjThgwAllTE();
                    int i4 = component3 + 73;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    return kSerializer$r8$lambda$WaM9o77cJPqybQZqQjThgwAllTE;
                }
            });
            int i = component4 + 77;
            copy = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private static final KSerializer ShareDataUIState() throws Throwable {
            int i = 2 % 2;
            Object[] objArr = new Object[1];
            a(TextUtils.getCapsMode("", 0, 0) + 127, null, new byte[]{-121, -109, -119, -125, -121, -103, -112, -121, -105, -126, -106, -111, -121, -127, -104, -124, -111, -119, -119, -109, -127, -104, -124, -112, -121, -105, -126, -106, -111, -121, -127, -110, -124, -115, -111, -119, -125, -116, -121, -109, -108, -124, -118, -122, -124, -119, -117, -126, -127, -109, -107, -127, -108, -110, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr);
            ObjectSerializer objectSerializer = new ObjectSerializer(((String) objArr[0]).intern(), INSTANCE, new Annotation[0]);
            int i2 = getRequestBeneficiariesState + 77;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 89 / 0;
            }
            return objectSerializer;
        }

        private final KSerializer component2() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 19;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            KSerializer<Object> value = ShareDataUIState.getValue();
            int i4 = getRequestBeneficiariesState + 39;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                return value;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final KSerializer<ScanToPayCamera> serializer() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 81;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                component2();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            KSerializer<ScanToPayCamera> kSerializerComponent2 = component2();
            int i3 = getRequestBeneficiariesState + 99;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            return kSerializerComponent2;
        }

        private ScanToPayCamera() {
            super(null);
        }

        private static void a(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i2 = 2 % 2;
            cancel cancelVar = new cancel();
            char[] cArr3 = component3;
            char c2 = '0';
            int i3 = 0;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    int i5 = $11 + 75;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr3[i4]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            int iIndexOf = 3759 - TextUtils.indexOf("", c2);
                            int edgeSlop = 24 - (ViewConfiguration.getEdgeSlop() >> 16);
                            char cCombineMeasuredStates = (char) View.combineMeasuredStates(i3, i3);
                            byte b2 = (byte) ($$b & 3);
                            byte b3 = (byte) (b2 - 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, edgeSlop, cCombineMeasuredStates, -1670574543, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr4[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i4++;
                        c2 = '0';
                        i3 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            Object[] objArr3 = {Integer.valueOf(copydefault)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7140, 12 - MotionEvent.axisFromString(""), (char) View.MeasureSpec.getMode(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i7 = 689978476;
            if (!(!component2)) {
                int i8 = $10 + 27;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cancelVar.component1 = bArr.length;
                    cArr2 = new char[cancelVar.component1];
                    cancelVar.component3 = 1;
                } else {
                    cancelVar.component1 = bArr.length;
                    cArr2 = new char[cancelVar.component1];
                    cancelVar.component3 = 0;
                }
                while (cancelVar.component3 < cancelVar.component1) {
                    int i9 = $11 + 85;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        cArr2[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 >>> 1) - cancelVar.component3] >>> i] % iIntValue);
                        Object[] objArr4 = {cancelVar, cancelVar};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - Color.alpha(0), 19 - TextUtils.indexOf("", "", 0, 0), (char) (7643 - TextUtils.lastIndexOf("", '0', 0, 0)), -327556343, false, $$c(b4, b5, b5), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                    } else {
                        cArr2[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                        Object[] objArr5 = {cancelVar, cancelVar};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - TextUtils.indexOf("", "", 0, 0), 19 - KeyEvent.normalizeMetaState(0), (char) (7644 - (ViewConfiguration.getPressedStateDuration() >> 16)), -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
                    }
                    i7 = 689978476;
                }
                objArr[0] = new String(cArr2);
                return;
            }
            if (component1) {
                cancelVar.component1 = cArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i10 = $11 + 101;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        int i11 = cancelVar.component3;
                        int i12 = cancelVar.component1;
                        cArr5[i11] = (char) (cArr3[cArr[0 - cancelVar.component3] % i] * iIntValue);
                        Object[] objArr6 = {cancelVar, cancelVar};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault5 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 2748, 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 7644), -327556343, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault5).invoke(null, objArr6);
                    } else {
                        cArr5[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                        Object[] objArr7 = {cancelVar, cancelVar};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault6 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 19, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7644), -327556343, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault6).invoke(null, objArr7);
                    }
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i13 = 0;
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            while (true) {
                cancelVar.component3 = i13;
                if (cancelVar.component3 >= cancelVar.component1) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    i13 = cancelVar.component3 + 1;
                }
            }
        }

        public static KSerializer $r8$lambda$WaM9o77cJPqybQZqQjThgwAllTE() throws Throwable {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 53;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                return ShareDataUIState();
            }
            ShareDataUIState();
            throw null;
        }

        static void component1() {
            component3 = new char[]{30699, 30687, 30685, 30620, 30694, 30677, 30697, 30679, 30693, 30689, 30698, 30695, 30682, 30690, 30686, 30673, 30684, 30683, 30680, 30692, 30681, 30714, 30718, 30715, 30603};
            copydefault = 321287758;
            component1 = true;
            component2 = true;
        }
    }
}
