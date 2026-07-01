package com.huawei.digitalpayment.consumer.sfcui.servicepin.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.framework.utils.FileUtils;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/model/ServicePinResponse;", "Landroid/os/Parcelable;", "header", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/model/ServicePinResponseHeader;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/model/ServicePinResponseHeader;)V", "getHeader", "()Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/model/ServicePinResponseHeader;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ServicePinResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ServicePinResponse> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("header")
    private final ServicePinResponseHeader header;

    public ServicePinResponse(ServicePinResponseHeader servicePinResponseHeader) {
        Intrinsics.checkNotNullParameter(servicePinResponseHeader, "");
        this.header = servicePinResponseHeader;
    }

    public final ServicePinResponseHeader getHeader() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ServicePinResponseHeader servicePinResponseHeader = this.header;
        int i5 = i3 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return servicePinResponseHeader;
    }

    static {
        int i = component3 + 7;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static ServicePinResponse copy$default(ServicePinResponse servicePinResponse, ServicePinResponseHeader servicePinResponseHeader, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            servicePinResponseHeader = servicePinResponse.header;
        }
        ServicePinResponse servicePinResponseCopy = servicePinResponse.copy(servicePinResponseHeader);
        int i5 = component2 + 101;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return servicePinResponseCopy;
    }

    public final ServicePinResponseHeader component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ServicePinResponseHeader servicePinResponseHeader = this.header;
        int i4 = i2 + 55;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return servicePinResponseHeader;
        }
        obj.hashCode();
        throw null;
    }

    public final ServicePinResponse copy(ServicePinResponseHeader header) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(header, "");
        ServicePinResponse servicePinResponse = new ServicePinResponse(header);
        int i2 = component1 + 71;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
        return servicePinResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 17;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServicePinResponse)) {
            int i2 = component2 + 21;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!Intrinsics.areEqual(this.header, ((ServicePinResponse) other).header))) {
            return true;
        }
        int i3 = component1;
        int i4 = i3 + 31;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 117;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 77 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 35;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.header.hashCode();
            int i3 = 10 / 0;
        } else {
            iHashCode = this.header.hashCode();
        }
        int i4 = component2 + 87;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ServicePinResponse(header=" + this.header + ")";
        int i2 = component2 + 35;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.header.writeToParcel(dest, flags);
        int i4 = component1 + 37;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServicePinResponse> {
        private static final byte[] $$c = {73, 121, -48, -56};
        private static final int $$f = 216;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {7, 80, 121, 38, -19, -5, 56, -65, -20, 13, -29, Ascii.VT, -11, TarHeader.LF_BLK, -61, -12, -5, -9, -18, Ascii.FF, -18, -11, 8, -31, 5, 1, -16, -13, 63, -60, -19, -6, -12, -9, 1, 1, -20, Base64.padSymbol, -69, -10, 1, -9, -12, 57, -78, 5, TarHeader.LF_BLK, -58, -9, -24, 4, -20, 6, -18, -12, 68, -44, 6, -4, -20, -32, -12, Ascii.ESC, -42, 1, -9, -12, 38, -41, -24, 4, -20, 6, -18, -12, 78, -54, -28, 0, -24, 6, Ascii.SUB, -36, -26, Ascii.FF, 5, 5, -17, -40, Ascii.FF, -26, 8, -28, 0, -24, 6, Ascii.SUB, -36, -26, Ascii.FF, 5, 5, -17, -40, Ascii.FF, -26, 8};
        private static final int $$e = FileUtils.JPEG_MARKER_EOI;
        private static final byte[] $$a = {93, -40, 95, -94, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -40, 39, Ascii.US, 7, 38, 34};
        private static final int $$b = 198;
        private static int copydefault = 0;
        private static int component3 = 1;
        private static long ShareDataUIState = -3780477796495014671L;
        private static int component1 = 1386857713;
        private static char component2 = 57418;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(int r6, short r7, byte r8) {
            /*
                int r7 = r7 + 4
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.servicepin.model.ServicePinResponse.Creator.$$c
                int r8 = r8 + 98
                int r6 = r6 * 2
                int r1 = r6 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2a
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r7 = r7 + 1
                if (r3 != r6) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L21:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2a:
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.model.ServicePinResponse.Creator.$$g(int, short, byte):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.servicepin.model.ServicePinResponse.Creator.$$a
                int r8 = r8 * 2
                int r8 = 101 - r8
                int r7 = r7 * 4
                int r7 = 10 - r7
                int r6 = r6 * 9
                int r6 = 22 - r6
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r7
                goto L29
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r6]
            L29:
                int r8 = r8 + r3
                int r8 = r8 + (-27)
                int r6 = r6 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.model.ServicePinResponse.Creator.a(int, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 73
                int r0 = r8 + 16
                int r6 = r6 * 88
                int r6 = r6 + 4
                int r7 = r7 * 16
                int r7 = 99 - r7
                byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.servicepin.model.ServicePinResponse.Creator.$$d
                byte[] r0 = new byte[r0]
                int r8 = r8 + 15
                r2 = 0
                if (r1 != 0) goto L19
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2e
            L19:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L1d:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2c:
                r3 = r1[r7]
            L2e:
                int r3 = -r3
                int r6 = r6 + r3
                int r6 = r6 + (-7)
                int r7 = r7 + 1
                r3 = r4
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.model.ServicePinResponse.Creator.c(byte, int, byte, java.lang.Object[]):void");
        }

        private static void b(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i3 = $10 + 73;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (iNotificationSideChannel.copydefault < length3) {
                try {
                    Object[] objArr2 = {iNotificationSideChannel};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - (Process.myPid() >> 22), (Process.myPid() >> 22) + 31, (char) (19181 - TextUtils.getOffsetBefore("", 0)), 1912513118, false, $$g(b2, b3, (byte) (-b3)), new Class[]{Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7566 - TextUtils.lastIndexOf("", '0', 0, 0), ';' - AndroidCharacter.getMirror('0'), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 2460, (KeyEvent.getMaxKeyCode() >> 16) + 28, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 931716605, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                    if (objCopydefault4 == null) {
                        c3 = 2;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.red(0) + 11, (char) View.getDefaultSize(0, 0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                    } else {
                        c3 = 2;
                    }
                    cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    cArr4[iIntValue2] = iNotificationSideChannel.component3;
                    cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (ShareDataUIState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component1) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component2) ^ (-3780477796495014671L)))));
                    iNotificationSideChannel.copydefault++;
                    int i5 = $11 + 87;
                    $10 = i5 % 128;
                    int i6 = i5 % 2;
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

        @Override
        public ServicePinResponse createFromParcel(Parcel parcel) throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-412868303);
            if (objCopydefault == null) {
                int doubleTapTimeout = 1115 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 22;
                char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                byte b2 = (byte) ($$b & 11);
                byte b3 = (byte) (b2 - 2);
                Object[] objArr2 = new Object[1];
                a(b2, b3, (byte) (b3 + 1), objArr2);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout, edgeSlop, c2, 574488148, false, (String) objArr2[0], null);
            }
            Object obj = null;
            long j = ((Field) objCopydefault).getLong(null);
            Object[] objArr3 = new Object[1];
            b((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0), new char[]{29403, 44402, 10372, 29202, 55856, 25478, 56720, 39030, 17476, 61057, 14598, 62564, 58826, 56458, 13580, 40780, 17404, 21983, 5061, 13055, 55387, 43435}, new char[]{26034, 61592, 14762, 7808}, new char[]{0, 0, 0, 0}, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((char) (TextUtils.getOffsetBefore("", 0) + 28651), ExpandableListView.getPackedPositionGroup(0L) + 222216066, new char[]{24964, 36940, 42846, 37525, 11766, 36958, 12805, 23744, 20726, 48555, 47823, 45402, 13396, 36076, 50416}, new char[]{33324, 16063, 60173, 44399}, new char[]{0, 0, 0, 0}, objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-413791824);
            if (objCopydefault2 == null) {
                int iBlue = Color.blue(0) + 1115;
                int iResolveSizeAndState = 22 - View.resolveSizeAndState(0, 0, 0);
                char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                byte b4 = (byte) 1;
                byte b5 = (byte) (b4 - 1);
                Object[] objArr5 = new Object[1];
                a(b4, b5, (byte) (b5 + 1), objArr5);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, iResolveSizeAndState, offsetAfter, 571463381, false, (String) objArr5[0], null);
            }
            if (j != ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                Object[] objArr6 = new Object[1];
                b((char) (28995 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{20812, 49987, 32764, 36603, 32485, 16268, 44557, 6240, 11932, 29082, 57590, 27734, 15310, 47095, 48154, 32182, 2669, 9877, 9307, 27798, 7945, 56955, Typography.lowDoubleQuote, 20378, 34997, 35468}, new char[]{33284, 52707, 17368, 28273}, new char[]{0, 0, 0, 0}, objArr6);
                Class<?> cls2 = Class.forName((String) objArr6[0]);
                Object[] objArr7 = new Object[1];
                b((char) (35770 - ((byte) KeyEvent.getModifierMetaStateMask())), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{7980, 37874, 45655, 22627, 52112, 55958, 25676, 8597, 45276, 23260, 54575, 55671, 1523, 42129, 38805, 43556, 5340, 18000}, new char[]{12275, 10457, 47969, 14987}, new char[]{0, 0, 0, 0}, objArr7);
                Context applicationContext = (Context) cls2.getMethod((String) objArr7[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr8 = new Object[1];
                b((char) (28398 - Gravity.getAbsoluteGravity(0, 0)), ViewConfiguration.getMaximumFlingVelocity() >> 16, new char[]{6799, 15670, 44650, 53824, 22311, 60266, 31008, 49891, 60213, 10575, 49392, 24567, 57740, 26675, 37068, 27077}, new char[]{19305, 2990, 60943, 47214}, new char[]{0, 0, 0, 0}, objArr8);
                Class<?> cls3 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b((char) (Color.argb(0, 0, 0, 0) + 36418), 1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{45951, 25110, 8261, 33407, 54697, 50029, 52632, 28710, 10090, 65246, 11589, 26299, 9866, 36305, 45425, 44903}, new char[]{22265, 62933, 17085, 40846}, new char[]{0, 0, 0, 0}, objArr9);
                try {
                    Object[] objArr10 = {applicationContext, Integer.valueOf(((Integer) cls3.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 1779663106};
                    byte[] bArr = $$d;
                    byte b6 = bArr[78];
                    Object[] objArr11 = new Object[1];
                    c(b6, b6, bArr[25], objArr11);
                    Class<?> cls4 = Class.forName((String) objArr11[0]);
                    byte b7 = bArr[25];
                    Object[] objArr12 = new Object[1];
                    c(b7, b7, bArr[78], objArr12);
                    Object[] objArr13 = (Object[]) cls4.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                    if (applicationContext != null) {
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1207399525);
                        if (objCopydefault3 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 1);
                            Object[] objArr14 = new Object[1];
                            a(b8, b9, (byte) (b9 - 1), objArr14);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1114, 22 - Color.alpha(0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 2102482174, false, (String) objArr14[0], null);
                        }
                        ((Field) objCopydefault3).set(null, objArr13);
                        try {
                            Object[] objArr15 = new Object[1];
                            b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), View.getDefaultSize(0, 0), new char[]{29403, 44402, 10372, 29202, 55856, 25478, 56720, 39030, 17476, 61057, 14598, 62564, 58826, 56458, 13580, 40780, 17404, 21983, 5061, 13055, 55387, 43435}, new char[]{26034, 61592, 14762, 7808}, new char[]{0, 0, 0, 0}, objArr15);
                            Class<?> cls5 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            b((char) (28651 - Color.red(0)), 222216066 - TextUtils.getOffsetAfter("", 0), new char[]{24964, 36940, 42846, 37525, 11766, 36958, 12805, 23744, 20726, 48555, 47823, 45402, 13396, 36076, 50416}, new char[]{33324, 16063, 60173, 44399}, new char[]{0, 0, 0, 0}, objArr16);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-413791824);
                            if (objCopydefault4 == null) {
                                int gidForName = Process.getGidForName("") + 1116;
                                int i2 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 21;
                                char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                                byte b10 = (byte) 1;
                                byte b11 = (byte) (b10 - 1);
                                Object[] objArr17 = new Object[1];
                                a(b10, b11, (byte) (b11 + 1), objArr17);
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, i2, tapTimeout, 571463381, false, (String) objArr17[0], null);
                            }
                            ((Field) objCopydefault4).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-412868303);
                            if (objCopydefault5 == null) {
                                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1116;
                                int i3 = 22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                                char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                byte b12 = (byte) ($$b & 11);
                                byte b13 = (byte) (b12 - 2);
                                Object[] objArr18 = new Object[1];
                                a(b12, b13, (byte) (b13 + 1), objArr18);
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionChild, i3, c3, 574488148, false, (String) objArr18[0], null);
                            }
                            ((Field) objCopydefault5).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr13;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                int i4 = copydefault + 97;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1207399525);
                if (objCopydefault6 == null) {
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1115;
                    int i6 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21;
                    char mirror = (char) ('0' - AndroidCharacter.getMirror('0'));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr19 = new Object[1];
                    a(b14, b15, (byte) (b15 - 1), objArr19);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, i6, mirror, 2102482174, false, (String) objArr19[0], null);
                }
                Object[] objArr20 = (Object[]) ((Field) objCopydefault6).get(null);
                objArr = new Object[]{new int[1], new int[]{((int[]) objArr20[1])[0]}, new int[]{((int[]) objArr20[2])[0]}, (String[]) objArr20[3]};
                int i7 = ~(((int) Runtime.getRuntime().freeMemory()) | (-95184504));
                int i8 = ((950555997 + (((-288381992) | i7) * (-220))) + ((i7 | 76292688) * 220)) - 1896713676;
                int i9 = (i8 << 13) ^ i8;
                int i10 = i9 ^ (i9 >>> 17);
                ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            }
            int i11 = ((int[]) objArr[1])[0];
            int i12 = ((int[]) objArr[2])[0];
            if (i12 == i11) {
                int i13 = ((int[]) objArr[0])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int i14 = (int) Runtime.getRuntime().totalMemory();
                int i15 = ~i14;
                int i16 = i13 + (-201571201) + (((~(i15 | 443288160)) | (~(250090672 | i15)) | (-518790897)) * 464) + (((-268700225) | i14) * (-464)) + (((~(i14 | 443288160)) | (-518790897)) * 464);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr21[0])[0] = i18 ^ (i18 << 5);
                int i19 = ((int[]) objArr21[0])[0];
                Object[] objArr22 = {new int[1], new int[]{((int[]) objArr21[1])[0]}, new int[]{((int[]) objArr21[2])[0]}, (String[]) objArr21[3]};
                int i20 = ~System.identityHashCode(this);
                int i21 = i19 + ((((-995401753) + (((~(i20 | 1049444344)) | (~((-838935817) | i20))) * (-184))) + (((201853008 | (~((-1040788825) | i20))) | (~(847591336 | i20))) * 184)) - 1592615864);
                int i22 = (i21 << 13) ^ i21;
                int i23 = i22 ^ (i22 >>> 17);
                ((int[]) objArr22[0])[0] = i23 ^ (i23 << 5);
                ServicePinResponse servicePinResponseCreateFromParcel = createFromParcel(parcel);
                int i24 = copydefault + 31;
                component3 = i24 % 128;
                if (i24 % 2 != 0) {
                    return servicePinResponseCreateFromParcel;
                }
                obj.hashCode();
                throw null;
            }
            long j2 = -1;
            long j3 = ((long) (i11 ^ i12)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 7) << 32) | (j4 - ((j4 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 6618, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, (char) TextUtils.getTrimmedLength(""), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr23 = {1842115273, Long.valueOf(j5), new ArrayList(), null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 6562, Color.blue(0) + 56, (char) (ViewConfiguration.getScrollBarSize() >> 8), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr23);
                int i25 = ((int[]) objArr[0])[0];
                Object[] objArr24 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                int i26 = (~(232581193 | startElapsedRealtime)) | 270538160;
                int i27 = ~startElapsedRealtime;
                int i28 = i25 + (-1332716201) + ((i26 | (~((-77340673) | i27))) * 886) + (((~(i27 | (-232581194))) | 425778681) * (-1772)) + ((~(i27 | 425778681)) * 886);
                int i29 = (i28 << 13) ^ i28;
                int i30 = i29 ^ (i29 >>> 17);
                ((int[]) objArr24[0])[0] = i30 ^ (i30 << 5);
                throw null;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ServicePinResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ServicePinResponse servicePinResponse = new ServicePinResponse(ServicePinResponseHeader.CREATOR.createFromParcel(parcel));
            int i2 = copydefault + 17;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return servicePinResponse;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ServicePinResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 9;
            copydefault = i4 % 128;
            ServicePinResponse[] servicePinResponseArr = new ServicePinResponse[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 15;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return servicePinResponseArr;
        }

        @Override
        public ServicePinResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 37;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ServicePinResponse[] servicePinResponseArrNewArray = newArray(i);
            int i4 = component3 + 69;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return servicePinResponseArrNewArray;
        }
    }
}
