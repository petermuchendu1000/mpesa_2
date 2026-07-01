package com.huawei.digitalpayment.consumer.basicUi.update;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.fragment.BaseFragment;
import com.huawei.digitalpayment.consumer.baselib.service.AppUpdateService;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateBean;
import com.huawei.digitalpayment.consumer.baselib.util.update.UpdateUtil;
import com.huawei.digitalpayment.consumer.baselib.util.update.provider.AppUpdate;
import com.huawei.digitalpayment.consumer.basicModule.R;
import com.huawei.digitalpayment.consumer.basicUi.viewmodel.AboutViewModel;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.getActiveNotifications;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.math.Primes;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/update/CheckUpdateFragment;", "Lcom/huawei/common/fragment/BaseFragment;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CheckUpdateFragment extends BaseFragment {
    private static int[] component1;
    private static int component2;
    private static char component3;
    private static int component4;
    private static long copydefault;
    private static final byte[] $$c = {SignedBytes.MAX_POWER_OF_TWO, -61, 76, -90};
    private static final int $$f = 94;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {35, -11, -97, -73, 38, Ascii.CAN, Ascii.GS, Ascii.EM, Ascii.EM, 17, 35, 32, -39};
    private static final int $$e = 252;
    private static final byte[] $$a = {101, 74, 115, 66, -26, -15, -23, -26, -12, -17, -13, -13, -5, -23, -20, TarHeader.LF_SYMLINK, -12, -29, 20, -33, -26, -18, 2, -28, -15, 36, -49, -23, -5, -15, -17, -8, -20, -6, -31, -5, -10, -28, Ascii.DC2, -47, 5, -33, 1};
    private static final int $$b = Primes.SMALL_FACTOR_LIMIT;
    private static int copy = 0;
    private static int ShareDataUIState = 0;
    private static int getAsAtTimestamp = 1;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class ShareDataUIState implements Observer, FunctionAdapter {
        private static int component2 = 0;
        private static int copydefault = 1;
        private final Function1 component3;

        ShareDataUIState(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (obj instanceof Observer) {
                int i2 = component2 + 7;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    boolean z = obj instanceof FunctionAdapter;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                if (obj instanceof FunctionAdapter) {
                    boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    int i3 = copydefault + 53;
                    component2 = i3 % 128;
                    if (i3 % 2 == 0) {
                        return zAreEqual;
                    }
                    int i4 = 5 / 4;
                    return zAreEqual;
                }
            }
            return false;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component2 + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.component3;
            if (i3 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 79;
            copydefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                getFunctionDelegate().hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = component2 + 67;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                return iHashCode;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 35;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.component3.invoke(obj);
            int i4 = component2 + 73;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 13 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.basicUi.update.CheckUpdateFragment.$$c
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r6 = 107 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L20:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L28:
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.update.CheckUpdateFragment.$$g(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.basicUi.update.CheckUpdateFragment.$$a
            int r7 = r7 + 4
            int r8 = r8 * 6
            int r1 = 28 - r8
            int r6 = r6 * 4
            int r6 = 103 - r6
            byte[] r1 = new byte[r1]
            int r8 = 27 - r8
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-14)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.update.CheckUpdateFragment.a(short, int, byte, java.lang.Object[]):void");
    }

    private static void d(byte b2, int i, short s, Object[] objArr) {
        int i2 = (s * 3) + 99;
        byte[] bArr = $$d;
        int i3 = 4 - (i * 4);
        int i4 = b2 * 4;
        byte[] bArr2 = new byte[10 - i4];
        int i5 = 9 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i3 + i2) - 26;
            i3++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i2;
            i2 = (i7 + bArr[i3]) - 26;
            i3++;
        }
    }

    private static void b(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i5 = $10 + 103;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i7 = $10 + 117;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - Color.red(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 31, (char) (Color.green(0) + 19181), 1912513118, false, $$g((byte) ($$f & 40), b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 7567, 11 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - TextUtils.getCapsMode("", 0, 0), 28 - Color.blue(0), (char) KeyEvent.getDeadChar(0, 0), 931716605, false, $$g((byte) 9, b3, b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    i2 = 2;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 7567, 11 - View.MeasureSpec.getSize(0), (char) (AndroidCharacter.getMirror('0') - '0'), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr2[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component3) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i3 = i2;
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

    private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int[] iArr3;
        int length2;
        int[] iArr4;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr5 = component1;
        int i6 = 684241640;
        int i7 = 1;
        char c2 = 0;
        if (iArr5 != null) {
            int i8 = $10 + 105;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length2 = iArr5.length;
                iArr4 = new int[length2];
                i3 = 1;
            } else {
                length2 = iArr5.length;
                iArr4 = new int[length2];
                i3 = 0;
            }
            while (i3 < length2) {
                int i9 = $11 + 39;
                $10 = i9 % 128;
                int i10 = i9 % i4;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c2] = Integer.valueOf(iArr5[i3]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i6);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 1;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - KeyEvent.keyCodeFromString(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36, (char) (ViewConfiguration.getPressedStateDuration() >> 16), -309236339, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    iArr4[i3] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i3++;
                    i4 = 2;
                    i6 = 684241640;
                    c2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr5 = iArr4;
        }
        int length3 = iArr5.length;
        int[] iArr6 = new int[length3];
        int[] iArr7 = component1;
        if (iArr7 != null) {
            int i11 = $11 + 91;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr7.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                Object[] objArr3 = new Object[i7];
                objArr3[0] = Integer.valueOf(iArr7[i2]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) i7;
                    byte b5 = (byte) (b4 - 1);
                    iArr3 = iArr7;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 4391, View.MeasureSpec.makeMeasureSpec(0, 0) + 37, (char) ExpandableListView.getPackedPositionType(0L), -309236339, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                } else {
                    iArr3 = iArr7;
                }
                iArr2[i2] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i2++;
                iArr7 = iArr3;
                i7 = 1;
            }
            iArr7 = iArr2;
        }
        System.arraycopy(iArr7, 0, iArr6, 0, length3);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            int i12 = $10 + 97;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr6);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr6[i14];
                try {
                    Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 3;
                        byte b7 = (byte) (b6 - 3);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 2968, 16 - KeyEvent.getDeadChar(0, 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 49871), 462826032, false, $$g(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i14++;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i16 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i16;
            getactivenotifications.component2 ^= iArr6[16];
            getactivenotifications.ShareDataUIState ^= iArr6[17];
            int i17 = getactivenotifications.ShareDataUIState;
            int i18 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr6);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 2945, 23 - MotionEvent.axisFromString(""), (char) (27636 - TextUtils.lastIndexOf("", '0', 0)), -1616366948, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault == null) {
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2405;
            int minimumFlingVelocity = 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            char cIndexOf = (char) TextUtils.indexOf("", "", 0);
            byte b2 = $$a[42];
            byte b3 = (byte) (-b2);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 + 5), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, minimumFlingVelocity, cIndexOf, -2047739879, false, (String) objArr2[0], null);
        }
        if (((Field) objCopydefault).getLong(null) != -1) {
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault2 == null) {
                int i2 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2404;
                int iIndexOf = TextUtils.indexOf("", "") + 26;
                char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                byte[] bArr = $$a;
                byte b4 = bArr[42];
                byte b5 = bArr[22];
                Object[] objArr3 = new Object[1];
                a(b4, b5, (byte) (b5 + 1), objArr3);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i2, iIndexOf, c2, 24929979, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b(new char[]{29357, 37988, 22258, 11696}, View.resolveSizeAndState(0, 0, 0), new char[]{59274, 64084, 3684, 58504, 3405, 1485, 52810, 38033, 53456, 3537, 37113, 10244, 12976, 1210, 32160, 60505}, (char) (45142 - (Process.myTid() >> 22)), new char[]{40809, 33381, 44087, 25219}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(new char[]{23161, 15290, 4210, 63150}, TextUtils.lastIndexOf("", '0', 0) + 1, new char[]{30394, 29097, 54523, 29483, 31821, 56158, 21353, 44761, 41615, 30702, 40609, 59360, 36639, 54820, 2976, 49558}, (char) (44561 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), new char[]{40809, 33381, 44087, 25219}, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i3 = ShareDataUIState + 57;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 18135881};
                Object[] objArr7 = new Object[1];
                c(158 - ImageFormat.getBitsPerPixel(0), new int[]{1398491870, 750481643, -1415467459, 1680789254, -624007273, -1341573366, -2123471964, 467505114, 667748459, 1938535590, -731289894, -1974588059, 1413453328, 1898668339, 460193809, 807926300, -602748825, -1608458861, -1771014532, 107881934, 887471865, -443537988, -1188386826, 1725795574, -1186596358, -633558824, 800586464, 1440371753, 1267358764, -1606509758, 417236576, 345775090, 941153081, 1715989809, 1608413239, -1282906669, -2141158680, -2087412038, 957099540, 1870552712, 657406991, 1094294999, -2083767851, 362224899, -1153512079, 1946036707, 1152215546, -622391127, -565458187, -681861943, 367982996, -1423142791, 1414549170, -2033040222, 1076937046, 212291595, -538131093, -1095102840, 1958581914, -208885626, -266932262, 2090635979, -514011511, -100956486, -1677230514, 157660351, -1559868956, -754811780, -447062044, -585047908, 1291312400, 1092302891, -1664261856, 962570824, -1933158898, -878003146, -267025279, 625080455, -533343886, -956863729}, objArr7);
                Class<?> cls2 = Class.forName(((String) objArr7[0]).intern());
                byte b6 = (byte) 0;
                byte b7 = b6;
                Object[] objArr8 = new Object[1];
                d(b6, b7, b7, objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault3 == null) {
                    int iAxisFromString = MotionEvent.axisFromString("") + 2406;
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 26;
                    char size = (char) View.MeasureSpec.getSize(0);
                    byte[] bArr2 = $$a;
                    byte b8 = bArr2[42];
                    byte b9 = bArr2[22];
                    Object[] objArr9 = new Object[1];
                    a(b8, b9, (byte) (b9 + 1), objArr9);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iAxisFromString, longPressTimeout, size, 24929979, false, (String) objArr9[0], null);
                }
                ((Field) objCopydefault3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(new char[]{8877, 3647, '_', 34033}, View.getDefaultSize(0, 0), new char[]{59573, 40489, 57852, 49378, 23247, 44821, 28371, 8092, 64727, 312, 13000, 13561, 13235, 48535, 1921, 59916, 47218, 19650, 61100, 13777, 57326, 1645}, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), new char[]{40809, 33381, 44087, 25219}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(new char[]{18387, 65508, 35958, 31547}, Color.rgb(0, 0, 0) + 2013258823, new char[]{39684, 23995, 35363, 10026, 295, 62754, 56372, 28317, 19703, 20581, 58431, 15168, 17384, 2305, 32895}, (char) (KeyEvent.getDeadChar(0, 0) + 15244), new char[]{40809, 33381, 44087, 25219}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault4 == null) {
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 2405;
                        int i5 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25;
                        char cArgb = (char) Color.argb(0, 0, 0, 0);
                        byte b10 = $$a[42];
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr12 = new Object[1];
                        a(b11, (byte) (b11 | Ascii.VT), (byte) (b10 - 1), objArr12);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, i5, cArgb, -1843538389, false, (String) objArr12[0], null);
                    }
                    ((Field) objCopydefault4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault5 == null) {
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 2405;
                        int i6 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25;
                        char c3 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        byte b12 = $$a[42];
                        byte b13 = (byte) (-b12);
                        Object[] objArr13 = new Object[1];
                        a(b12, b13, (byte) (b13 + 5), objArr13);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(capsMode, i6, c3, -2047739879, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i7 = ((int[]) objArr[0])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6619 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 42 - View.combineMeasuredStates(0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                try {
                    Object[] objArr14 = {-2017267723, Long.valueOf(j4), new ArrayList(), null, true};
                    Class cls4 = (Class) ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6561, 56 - Color.red(0), (char) (TextUtils.lastIndexOf("", '0') + 1));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr15 = new Object[1];
                    d(b14, b15, b15, objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
                    int i9 = getAsAtTimestamp + 63;
                    ShareDataUIState = i9 % 128;
                    int i10 = i9 % 2;
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
        }
        super.onCreate(savedInstanceState);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        AboutViewModel aboutViewModel = (AboutViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(AboutViewModel.class);
        aboutViewModel.versionVerify();
        aboutViewModel.getData().observe(requireActivity(), new ShareDataUIState(new Function1() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i11 = 2 % 2;
                int i12 = copydefault + 67;
                ShareDataUIState = i12 % 128;
                int i13 = i12 % 2;
                Unit unit$r8$lambda$TnO2qOIFufKQhzg3rfX74wkfANc = CheckUpdateFragment.$r8$lambda$TnO2qOIFufKQhzg3rfX74wkfANc(this.f$0, (Resource) obj);
                int i14 = copydefault + 67;
                ShareDataUIState = i14 % 128;
                int i15 = i14 % 2;
                return unit$r8$lambda$TnO2qOIFufKQhzg3rfX74wkfANc;
            }
        }));
    }

    private static final Unit component3(CheckUpdateFragment checkUpdateFragment, Resource resource) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(resource, "");
        if (!(!resource.success())) {
            int i2 = getAsAtTimestamp + 29;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            FragmentActivity fragmentActivityRequireActivity = checkUpdateFragment.requireActivity();
            Intrinsics.checkNotNull(fragmentActivityRequireActivity, "");
            AppCompatActivity appCompatActivity = (AppCompatActivity) fragmentActivityRequireActivity;
            AppUpdate appUpdateCheckUpdate = UpdateUtil.checkUpdate(appCompatActivity, (UpdateBean) resource.getData());
            AppUpdateService appUpdateService = (AppUpdateService) RouteUtils.getService(AppUpdateService.class);
            Intrinsics.checkNotNull(appUpdateCheckUpdate);
            String string = checkUpdateFragment.getString(R.string.appUpdate);
            Intrinsics.checkNotNullExpressionValue(string, "");
            appUpdateService.showAppUpdateDialog(appUpdateCheckUpdate, appCompatActivity, string);
        }
        Unit unit = Unit.INSTANCE;
        int i4 = ShareDataUIState + 23;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static Unit $r8$lambda$TnO2qOIFufKQhzg3rfX74wkfANc(CheckUpdateFragment checkUpdateFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent3 = component3(checkUpdateFragment, resource);
        int i4 = getAsAtTimestamp + 31;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return unitComponent3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        component4 = 1;
        ShareDataUIState();
        component1 = new int[]{-2084935966, 1336858404, 1645444832, 1887216137, 565290108, -2084580522, -210496995, 203313567, 869044883, 2127404149, -1855869416, 31042543, -834200013, -1491109824, 406806477, -823815877, -1883469747, -1099454312};
        int i = copy + 93;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        copydefault = -6266011974580282472L;
        component2 = 1386857713;
        component3 = (char) 50417;
    }
}
