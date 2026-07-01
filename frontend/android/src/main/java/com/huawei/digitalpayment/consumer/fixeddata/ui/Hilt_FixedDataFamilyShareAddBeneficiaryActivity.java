package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;

public abstract class Hilt_FixedDataFamilyShareAddBeneficiaryActivity extends ComponentActivity implements GeneratedComponentManagerHolder {
    private static char[] ShareDataUIState;
    private static long component1;
    private static char component2;
    private static int component3;
    private static long copydefault;
    private static int getRequestBeneficiariesState;
    private volatile ActivityComponentManager componentManager;
    private final Object componentManagerLock;
    private boolean injected;
    private SavedStateHandleHolder savedStateHandleHolder;
    private static final byte[] $$l = {57, 126, 65, 8};
    private static final int $$m = 99;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {Ascii.SI, -12, 105, 108, Ascii.VT, -3, -64, 56, 1, 10, -13, Ascii.FF, -20, -53, TarHeader.LF_CHR, -2, Ascii.DLE, 1, -16, 5, 7, -17, -54, 65, -13, 1, Ascii.SI, -14, -5, 17, -19, Ascii.FF, -69, 70, -2, -12, 2, -63, 33, Ascii.DLE, 5, -3, -19, Ascii.NAK, Ascii.DLE, -22, -35, Ascii.GS, 10, -10, 17, -10, -12, Ascii.DC2, -6, 2, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -67, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -66};
    private static final int $$k = 42;
    private static final byte[] $$d = {115, 102, 60, 8, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 67;
    private static int getAsAtTimestamp = 0;
    private static int component4 = 0;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(byte r5, byte r6, byte r7) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r5 = r5 * 3
            int r5 = r5 + 1
            int r6 = 115 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareAddBeneficiaryActivity.$$l
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r6
            r3 = r2
            r6 = r5
            goto L25
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            r4 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareAddBeneficiaryActivity.$$n(byte, byte, byte):java.lang.String");
    }

    private static void h(short s, int i, byte b2, Object[] objArr) {
        int i2 = (i * 2) + 83;
        int i3 = 99 - b2;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[s + 4];
        int i4 = s + 3;
        int i5 = -1;
        if (bArr == null) {
            int i6 = (i3 + (-i4)) - 8;
            i3 = i3;
            i2 = i6;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i3 + 1;
            i3 = i7;
            i2 = (i2 + (-bArr[i7])) - 8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareAddBeneficiaryActivity.$$j
            int r9 = 65 - r9
            int r7 = r7 * 43
            int r7 = r7 + 10
            int r8 = r8 * 4
            int r8 = r8 + 99
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r8 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L19:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
        L2a:
            int r9 = r9 + r3
            int r8 = r8 + 1
            int r9 = r9 + 1
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareAddBeneficiaryActivity.i(byte, byte, byte, java.lang.Object[]):void");
    }

    @Override
    public GeneratedComponentManager componentManager() {
        int i = 2 % 2;
        int i2 = copy + 45;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ActivityComponentManager activityComponentManagerComponentManager = componentManager();
        int i4 = component4 + 55;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return activityComponentManagerComponentManager;
        }
        throw null;
    }

    Hilt_FixedDataFamilyShareAddBeneficiaryActivity() {
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    Hilt_FixedDataFamilyShareAddBeneficiaryActivity(int i) {
        super(i);
        this.componentManagerLock = new Object();
        this.injected = false;
        _initHiltInternal();
    }

    public class AnonymousClass1 implements OnContextAvailableListener {
        private static int component1 = 1;
        private static int copydefault;

        AnonymousClass1() {
        }

        @Override
        public void onContextAvailable(Context context) {
            int i = 2 % 2;
            int i2 = copydefault + 9;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                Hilt_FixedDataFamilyShareAddBeneficiaryActivity.this.inject();
                throw null;
            }
            Hilt_FixedDataFamilyShareAddBeneficiaryActivity.this.inject();
            int i3 = copydefault + 19;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }

        public static void copydefault() {
            kotlin.ComponentActivity.component1[0] = r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw.component3[0];
        }
    }

    private void _initHiltInternal() {
        int i = 2 % 2;
        addOnContextAvailableListener(new AnonymousClass1());
        int i2 = component4 + 79;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
    }

    private void initSavedStateHandleHolder() {
        int i = 2 % 2;
        int i2 = component4 + 55;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (getApplication() instanceof GeneratedComponentManager) {
            int i4 = copy + 13;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            SavedStateHandleHolder savedStateHandleHolder = componentManager().getSavedStateHandleHolder();
            this.savedStateHandleHolder = savedStateHandleHolder;
            if (savedStateHandleHolder.isInvalid()) {
                this.savedStateHandleHolder.setExtras(getDefaultViewModelCreationExtras());
            }
        }
        int i6 = component4 + 97;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        Object obj;
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component1 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (true) {
            obj = null;
            if (iTrustedWebActivityServiceDefault.copydefault >= cArrComponent2.length) {
                break;
            }
            int i3 = $10 + 11;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7032, (ViewConfiguration.getLongPressTimeout() >> 16) + 34, (char) (63440 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1389 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 18, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 51269), -1883291598, false, $$n(b2, (byte) (b2 | Ascii.FF), b2), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $10 + 43;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    private static void j(char c2, char[] cArr, int i, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i5 = $11 + 59;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i7 = $11 + 67;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4036, View.getDefaultSize(0, 0) + 31, (char) (19181 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1912513118, false, $$n(b2, (byte) (b2 | Ascii.DLE), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - View.resolveSize(0, 0), 10 - ImageFormat.getBitsPerPixel(0), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 2459, 28 - (Process.myPid() >> 22), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 931716605, false, $$n(b3, (byte) (b3 | 17), b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    i2 = 2;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - View.MeasureSpec.makeMeasureSpec(0, 0), 11 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((Process.getThreadPriority(0) + 20) >> 6), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[iNotificationSideChannel.copydefault])) ^ (copydefault ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component2) ^ (-3780477796495014671L)))));
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

    private static void g(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = ShareDataUIState;
        char c2 = '0';
        if (cArr2 != null) {
            int i7 = $11 + 91;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", c2, 0, 0) + 658, 14 - TextUtils.getOffsetBefore("", 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 65119), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i9++;
                    c2 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $11 + 105;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i12 = $10 + 93;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            char c3 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 4502, 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (27897 - (ViewConfiguration.getTapTimeout() >> 16)), -1464227204, false, $$n(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3579, View.getDefaultSize(0, 0) + 28, (char) TextUtils.indexOf("", "", 0, 0), 1180380354, false, $$n(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 1859, TextUtils.indexOf("", "") + 34, (char) ('0' - AndroidCharacter.getMirror('0')), 80302927, false, $$n(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            int i15 = $10 + 49;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i17 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i17, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i18 = $10 + 29;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr4[i4 >>> iTrustedWebActivityService_Parcel.copydefault];
                    i = iTrustedWebActivityService_Parcel.copydefault / 0;
                } else {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 2139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareAddBeneficiaryActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    protected void onDestroy() {
        int i = 2 % 2;
        int i2 = copy + 11;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        SavedStateHandleHolder savedStateHandleHolder = this.savedStateHandleHolder;
        if (savedStateHandleHolder != null) {
            int i4 = copy + 119;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            savedStateHandleHolder.clear();
            int i6 = component4 + 13;
            copy = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 2;
            }
        }
    }

    @Override
    public final Object generatedComponent() {
        int i = 2 % 2;
        int i2 = component4 + 45;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Object objGeneratedComponent = componentManager().generatedComponent();
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        return objGeneratedComponent;
    }

    protected ActivityComponentManager createComponentManager() {
        int i = 2 % 2;
        ActivityComponentManager activityComponentManager = new ActivityComponentManager(this);
        int i2 = copy + 119;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return activityComponentManager;
    }

    @Override
    public final ActivityComponentManager componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }

    protected void inject() {
        int i = 2 % 2;
        int i2 = copy + 39;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (!this.injected) {
                this.injected = true;
                ((FixedDataFamilyShareAddBeneficiaryActivity_GeneratedInjector) generatedComponent()).injectFixedDataFamilyShareAddBeneficiaryActivity((FixedDataFamilyShareAddBeneficiaryActivity) UnsafeCasts.unsafeCast(this));
            }
            int i3 = component4 + 25;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = component4 + 117;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
            return DefaultViewModelFactories.getActivityFactory(this, defaultViewModelProviderFactory);
        }
        DefaultViewModelFactories.getActivityFactory(this, defaultViewModelProviderFactory);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = component4 + 91;
            copy = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            g(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{0, 26, 0, 0}, false, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109, new char[]{49340, 49375, 15326, 8033, 49459, 28085, 45871, 49947, 39073, 49997, 47087, 39304, 28732, 27339, 61039, 28728, 51639, 12882, 1791, 51376, 41267, 55845}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((!(baseContext instanceof ContextWrapper)) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                baseContext = baseContext.getApplicationContext();
            } else {
                int i4 = copy + 13;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            }
        }
        if (baseContext != null) {
            int i6 = component4 + 37;
            copy = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 6618, TextUtils.indexOf("", "") + 42, (char) (Process.myTid() >> 22), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 57, (char) ExpandableListView.getPackedPositionType(0L), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i8 = copy + 65;
                component4 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-610792312);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 19, TextUtils.getTrimmedLength("") + 33, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 19697), 516019181, false, "component1", null);
        }
        Object obj = ((Field) objCopydefault3).get(null);
        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-233037212);
        if (objCopydefault4 == null) {
            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 67, 33 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (19695 - TextUtils.lastIndexOf("", '0', 0, 0)), 927333633, false, "component2", new Class[0]);
        }
        ((Method) objCopydefault4).invoke(obj, null);
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareAddBeneficiaryActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:0|2|(2:(2:9|(2:11|(1:15)(1:14))(0))(1:16)|(8:772|18|(1:20)|21|22|23|(1:25)|26)(1:7))(0)|30|754|31|(12:801|33|37|(1:39)|40|41|790|(4:43|44|(1:46)|47)(14:48|(2:50|(3:52|53|(2:55|57)(1:56))(1:57))(1:59)|(21:61|62|743|63|812|64|(2:774|66)|70|71|795|72|(2:747|74)|78|79|80|(2:815|82)|83|(1:85)(1:87)|88|(2:90|91)|92)(1:144)|147|148|793|149|152|153|(1:155)|156|157|753|158)|93|(4:96|(2:98|823)(11:99|(3:101|(3:104|105|102)|824)|108|780|109|(1:111)|112|113|764|114|822)|115|94)|821|129)(10:37|(0)|40|41|790|(0)(0)|93|(1:94)|821|129)|159|742|160|(1:162)|163|(3:165|(1:167)|168)(19:169|170|819|171|(1:173)|174|175|802|176|(1:178)|179|180|181|(1:183)|184|(1:186)|187|(1:189)|190)|191|(4:194|(3:827|196|830)(12:826|197|(3:199|(3:202|203|200)|831)|204|784|205|(1:207)|208|209|770|210|829)|828|192)|825|245|(49:(8:814|246|(1:248)|249|(3:251|(1:253)|254)(19:255|256|797|257|(1:259)|260|261|782|262|(1:264)|265|266|267|(1:269)|270|(1:272)|273|(1:275)|276)|277|(4:280|(3:834|282|837)(12:833|283|(3:285|(3:288|289|286)|838)|290|768|291|(1:293)|294|295|760|296|836)|835|278)|832)|808|416|(1:418)|419|791|420|(1:422)|423|447|(1:449)|450|(3:452|(1:454)|455)(14:456|457|(1:459)|460|461|(1:463)|464|745|465|466|(1:468)(1:469)|470|(1:472)|473)|474|(1:476)(9:477|(3:479|(2:482|480)|847)|483|484|(1:486)|487|(1:489)|490|491)|492|(1:494)|495|(1:497)|498|(3:500|(1:502)|503)(16:505|506|(1:508)|509|(1:511)|512|513|(1:515)|516|756|517|518|(1:520)|521|(1:523)|524)|504|525|(1:527)(9:528|(3:530|(2:533|531)|846)|534|535|(1:537)|538|(1:540)|541|542)|543|737|544|(1:546)|547|(1:549)|550|(3:552|(1:554)|555)(16:(3:558|559|(1:565)(1:564))|(19:567|568|804|569|(1:571)|572|573|786|574|(1:576)|577|578|579|(1:581)|582|(1:584)|585|(1:587)|588)|643|(1:645)|646|(3:648|(1:650)|651)(13:653|810|654|655|(1:657)|658|778|659|660|(1:662)|663|(1:665)|666)|652|667|(6:670|671|(1:673)|674|675|676)|677|(1:679)|680|(3:682|(1:684)|685)(14:687|688|(1:690)|691|692|(1:694)|695|788|696|697|(1:699)|700|(1:702)|703)|686|704|(1:848)(7:707|708|(1:710)|711|712|713|714))|589|(4:592|(3:841|594|844)(12:839|595|(3:597|(3:600|601|598)|845)|602|776|603|(1:605)|606|607|762|608|843)|842|590)|840|643|(0)|646|(0)(0)|652|667|(0)|677|(0)|680|(0)(0)|686|704|(0)(0))|331|758|332|(1:334)|335|(3:337|(1:339)|340)(14:342|343|749|344|(1:346)|347|348|349|(1:351)|352|(1:354)|355|(1:357)|358)|341|359|(9:362|738|363|(1:365)|366|367|368|806|369)|370|759|(2:401|(2:403|(1:409)(1:408))(2:412|413))(1:414)|415|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(45:(8:814|246|(1:248)|249|(3:251|(1:253)|254)(19:255|256|797|257|(1:259)|260|261|782|262|(1:264)|265|266|267|(1:269)|270|(1:272)|273|(1:275)|276)|277|(4:280|(3:834|282|837)(12:833|283|(3:285|(3:288|289|286)|838)|290|768|291|(1:293)|294|295|760|296|836)|835|278)|832)|791|420|(1:422)|423|447|(1:449)|450|(3:452|(1:454)|455)(14:456|457|(1:459)|460|461|(1:463)|464|745|465|466|(1:468)(1:469)|470|(1:472)|473)|474|(1:476)(9:477|(3:479|(2:482|480)|847)|483|484|(1:486)|487|(1:489)|490|491)|492|(1:494)|495|(1:497)|498|(3:500|(1:502)|503)(16:505|506|(1:508)|509|(1:511)|512|513|(1:515)|516|756|517|518|(1:520)|521|(1:523)|524)|504|525|(1:527)(9:528|(3:530|(2:533|531)|846)|534|535|(1:537)|538|(1:540)|541|542)|543|737|544|(1:546)|547|(1:549)|550|(3:552|(1:554)|555)(16:(3:558|559|(1:565)(1:564))|(19:567|568|804|569|(1:571)|572|573|786|574|(1:576)|577|578|579|(1:581)|582|(1:584)|585|(1:587)|588)|643|(1:645)|646|(3:648|(1:650)|651)(13:653|810|654|655|(1:657)|658|778|659|660|(1:662)|663|(1:665)|666)|652|667|(6:670|671|(1:673)|674|675|676)|677|(1:679)|680|(3:682|(1:684)|685)(14:687|688|(1:690)|691|692|(1:694)|695|788|696|697|(1:699)|700|(1:702)|703)|686|704|(1:848)(7:707|708|(1:710)|711|712|713|714))|589|(4:592|(3:841|594|844)(12:839|595|(3:597|(3:600|601|598)|845)|602|776|603|(1:605)|606|607|762|608|843)|842|590)|840|643|(0)|646|(0)(0)|652|667|(0)|677|(0)|680|(0)(0)|686|704|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x1734, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x1735, code lost:
    
        r7 = new java.lang.Object[1];
        g(new byte[]{0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0}, new int[]{275, 11, 0, 0}, true, r7);
        r2 = (java.lang.String) r7[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x1750, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r3);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x1767, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x176b, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
        r13 = -1;
        r6 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r1 = ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32))) | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x179b, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x179f, code lost:
    
        if (r6 == null) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x17a1, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6618, 42 - android.text.TextUtils.indexOf("", ""), (char) android.view.View.MeasureSpec.getSize(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x17cb, code lost:
    
        r6 = ((java.lang.reflect.Method) r6).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x17d2, code lost:
    
        r4 = com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareAddBeneficiaryActivity.copy + 95;
        com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareAddBeneficiaryActivity.component4 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x17dd, code lost:
    
        r8 = new java.lang.Object[]{-1258789556, java.lang.Long.valueOf(r1), r3, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6563 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), 'h' - android.text.AndroidCharacter.getMirror('0'), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        r2 = (byte) (com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareAddBeneficiaryActivity.$$j[8] - 1);
        r4 = r2;
        r10 = new java.lang.Object[1];
        i(r2, r4, r4, r10);
        r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x1875, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x1962, code lost:
    
        r8 = new java.lang.Object[1];
        g(new byte[]{0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1}, new int[]{286, 11, 0, 0}, true, r8);
        r3 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x197c, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r4);
        r0.printStackTrace(r6);
        r6.close();
        r2 = r4.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x1993, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x1997, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r2);
        r4.add(r3);
        r13 = -1;
        r6 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r6 = r6 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x19c6, code lost:
    
        r8 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x19ca, code lost:
    
        if (r8 == null) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x19cc, code lost:
    
        r8 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), android.text.TextUtils.getCapsMode("", 0, 0) + 42, (char) android.view.View.MeasureSpec.getMode(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x19f2, code lost:
    
        r3 = ((java.lang.reflect.Method) r8).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x19fa, code lost:
    
        r10 = new java.lang.Object[]{-1258789556, java.lang.Long.valueOf(r6), r4, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6562, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 56, (char) (android.text.TextUtils.lastIndexOf("", '0') + 1));
        r6 = (byte) (com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareAddBeneficiaryActivity.$$j[8] - 1);
        r7 = r6;
        r11 = new java.lang.Object[1];
        i(r6, r7, r7, r11);
        r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r3, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x2b20, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x2b21, code lost:
    
        r6 = new java.lang.Object[1];
        f(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{24075, 24127, 55403, 58096, 5289, 36423, 20213, 5831, 1610, 8423, 19062, 19495, 61122, 35199}, r6);
        r3 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x2b58, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x2b6f, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x2b73, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x2ba1, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x2ba5, code lost:
    
        if (r6 == null) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x2ba7, code lost:
    
        r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.os.Process.myTid() >> 22) + 6618, 42 - android.view.View.combineMeasuredStates(0, 0), (char) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x2bd8, code lost:
    
        r6 = ((java.lang.reflect.Method) r6).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x2be0, code lost:
    
        r8 = new java.lang.Object[]{-1258789556, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.text.TextUtils.getCapsMode("", 0, 0) + 6562, android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 57, (char) android.text.TextUtils.indexOf("", ""));
        r2 = (byte) (com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareAddBeneficiaryActivity.$$j[8] - 1);
        r4 = r2;
        r10 = new java.lang.Object[1];
        i(r2, r4, r4, r10);
        r1.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r6, r8);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08c8 A[Catch: all -> 0x0301, TryCatch #20 {all -> 0x0301, blocks: (B:153:0x08c2, B:155:0x08c8, B:156:0x08f4, B:671:0x2fa7, B:673:0x2fad, B:674:0x2fd6, B:708:0x32e5, B:710:0x32eb, B:711:0x3310, B:688:0x3121, B:690:0x3144, B:691:0x3198, B:637:0x2ba1, B:639:0x2ba7, B:640:0x2bd8, B:535:0x24c4, B:537:0x24ca, B:538:0x24f7, B:540:0x2531, B:541:0x257d, B:506:0x218b, B:508:0x21a0, B:509:0x21cc, B:511:0x2200, B:512:0x2279, B:484:0x1e45, B:486:0x1e4b, B:487:0x1e71, B:489:0x1eab, B:490:0x1ef5, B:457:0x1baa, B:459:0x1bbf, B:460:0x1bef, B:441:0x19c6, B:443:0x19cc, B:444:0x19f2, B:393:0x179b, B:395:0x17a1, B:396:0x17cb, B:325:0x132d, B:327:0x1333, B:328:0x135d, B:239:0x0dd0, B:241:0x0dd6, B:242:0x0e07, B:18:0x0148, B:20:0x014e, B:21:0x0178, B:23:0x0270, B:25:0x02a1, B:26:0x02fb), top: B:772:0x0148 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x13e2 A[Catch: all -> 0x1734, TryCatch #12 {all -> 0x1734, blocks: (B:332:0x13dc, B:334:0x13e2, B:335:0x1423, B:337:0x1430, B:339:0x1439, B:340:0x1478, B:359:0x162e, B:367:0x1695, B:373:0x1718, B:375:0x171e, B:376:0x171f, B:378:0x1721, B:380:0x1728, B:381:0x1729, B:342:0x1484, B:349:0x150f, B:351:0x1515, B:352:0x1558, B:354:0x1582, B:355:0x15c9, B:357:0x15df, B:358:0x1626, B:383:0x172b, B:385:0x1732, B:386:0x1733, B:363:0x165f, B:365:0x1665, B:366:0x168e, B:344:0x14a4, B:346:0x14b6, B:347:0x1503, B:369:0x169b), top: B:758:0x13dc, outer: #9, inners: #1, #7, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x1430 A[Catch: all -> 0x1734, TryCatch #12 {all -> 0x1734, blocks: (B:332:0x13dc, B:334:0x13e2, B:335:0x1423, B:337:0x1430, B:339:0x1439, B:340:0x1478, B:359:0x162e, B:367:0x1695, B:373:0x1718, B:375:0x171e, B:376:0x171f, B:378:0x1721, B:380:0x1728, B:381:0x1729, B:342:0x1484, B:349:0x150f, B:351:0x1515, B:352:0x1558, B:354:0x1582, B:355:0x15c9, B:357:0x15df, B:358:0x1626, B:383:0x172b, B:385:0x1732, B:386:0x1733, B:363:0x165f, B:365:0x1665, B:366:0x168e, B:344:0x14a4, B:346:0x14b6, B:347:0x1503, B:369:0x169b), top: B:758:0x13dc, outer: #9, inners: #1, #7, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x1484 A[Catch: all -> 0x1734, TRY_LEAVE, TryCatch #12 {all -> 0x1734, blocks: (B:332:0x13dc, B:334:0x13e2, B:335:0x1423, B:337:0x1430, B:339:0x1439, B:340:0x1478, B:359:0x162e, B:367:0x1695, B:373:0x1718, B:375:0x171e, B:376:0x171f, B:378:0x1721, B:380:0x1728, B:381:0x1729, B:342:0x1484, B:349:0x150f, B:351:0x1515, B:352:0x1558, B:354:0x1582, B:355:0x15c9, B:357:0x15df, B:358:0x1626, B:383:0x172b, B:385:0x1732, B:386:0x1733, B:363:0x165f, B:365:0x1665, B:366:0x168e, B:344:0x14a4, B:346:0x14b6, B:347:0x1503, B:369:0x169b), top: B:758:0x13dc, outer: #9, inners: #1, #7, #38 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x1640  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0380 A[Catch: all -> 0x0353, TRY_ENTER, TRY_LEAVE, TryCatch #35 {all -> 0x0353, blocks: (B:33:0x030e, B:39:0x0380, B:44:0x03e5, B:46:0x03eb, B:47:0x042c, B:50:0x0441, B:53:0x044f, B:57:0x045b), top: B:801:0x030e }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x1854  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x187d  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x1894 A[Catch: all -> 0x1958, TryCatch #39 {all -> 0x1958, blocks: (B:416:0x187f, B:418:0x1894, B:419:0x18c7), top: B:808:0x187f, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x18da A[Catch: all -> 0x194e, TryCatch #30 {all -> 0x194e, blocks: (B:420:0x18cd, B:422:0x18da, B:423:0x1946), top: B:791:0x18cd, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x1a7a  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x1ac8  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x1b8a  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x1d37  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x1e05  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x1fe6  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x2050  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x20a6  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x216d  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x23a5  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x2485  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x2691 A[Catch: all -> 0x2b20, TryCatch #0 {all -> 0x2b20, blocks: (B:544:0x268b, B:546:0x2691, B:547:0x26d1, B:549:0x26f8, B:550:0x273d, B:552:0x2750, B:554:0x2759, B:555:0x2798, B:589:0x29eb, B:590:0x29ef, B:592:0x29f5, B:595:0x2a0d, B:598:0x2a1a, B:600:0x2a1d, B:612:0x2afa, B:614:0x2b00, B:615:0x2b01, B:617:0x2b03, B:619:0x2b0a, B:620:0x2b0b, B:559:0x27af, B:561:0x27b3, B:565:0x27bf, B:567:0x27c5, B:579:0x28d3, B:581:0x28d9, B:582:0x291d, B:584:0x2947, B:585:0x298a, B:587:0x29a0, B:588:0x29e5, B:622:0x2b0d, B:624:0x2b14, B:625:0x2b15, B:627:0x2b17, B:629:0x2b1e, B:630:0x2b1f, B:608:0x2a83, B:603:0x2a49, B:605:0x2a4f, B:606:0x2a7b, B:574:0x2832, B:576:0x2851, B:577:0x28c7, B:569:0x27e5, B:571:0x27fa, B:572:0x282b), top: B:737:0x268b, outer: #9, inners: #15, #22, #27, #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x26f8 A[Catch: all -> 0x2b20, TryCatch #0 {all -> 0x2b20, blocks: (B:544:0x268b, B:546:0x2691, B:547:0x26d1, B:549:0x26f8, B:550:0x273d, B:552:0x2750, B:554:0x2759, B:555:0x2798, B:589:0x29eb, B:590:0x29ef, B:592:0x29f5, B:595:0x2a0d, B:598:0x2a1a, B:600:0x2a1d, B:612:0x2afa, B:614:0x2b00, B:615:0x2b01, B:617:0x2b03, B:619:0x2b0a, B:620:0x2b0b, B:559:0x27af, B:561:0x27b3, B:565:0x27bf, B:567:0x27c5, B:579:0x28d3, B:581:0x28d9, B:582:0x291d, B:584:0x2947, B:585:0x298a, B:587:0x29a0, B:588:0x29e5, B:622:0x2b0d, B:624:0x2b14, B:625:0x2b15, B:627:0x2b17, B:629:0x2b1e, B:630:0x2b1f, B:608:0x2a83, B:603:0x2a49, B:605:0x2a4f, B:606:0x2a7b, B:574:0x2832, B:576:0x2851, B:577:0x28c7, B:569:0x27e5, B:571:0x27fa, B:572:0x282b), top: B:737:0x268b, outer: #9, inners: #15, #22, #27, #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x2750 A[Catch: all -> 0x2b20, TryCatch #0 {all -> 0x2b20, blocks: (B:544:0x268b, B:546:0x2691, B:547:0x26d1, B:549:0x26f8, B:550:0x273d, B:552:0x2750, B:554:0x2759, B:555:0x2798, B:589:0x29eb, B:590:0x29ef, B:592:0x29f5, B:595:0x2a0d, B:598:0x2a1a, B:600:0x2a1d, B:612:0x2afa, B:614:0x2b00, B:615:0x2b01, B:617:0x2b03, B:619:0x2b0a, B:620:0x2b0b, B:559:0x27af, B:561:0x27b3, B:565:0x27bf, B:567:0x27c5, B:579:0x28d3, B:581:0x28d9, B:582:0x291d, B:584:0x2947, B:585:0x298a, B:587:0x29a0, B:588:0x29e5, B:622:0x2b0d, B:624:0x2b14, B:625:0x2b15, B:627:0x2b17, B:629:0x2b1e, B:630:0x2b1f, B:608:0x2a83, B:603:0x2a49, B:605:0x2a4f, B:606:0x2a7b, B:574:0x2832, B:576:0x2851, B:577:0x28c7, B:569:0x27e5, B:571:0x27fa, B:572:0x282b), top: B:737:0x268b, outer: #9, inners: #15, #22, #27, #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:557:0x27a3  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x29f5 A[Catch: all -> 0x2b20, TryCatch #0 {all -> 0x2b20, blocks: (B:544:0x268b, B:546:0x2691, B:547:0x26d1, B:549:0x26f8, B:550:0x273d, B:552:0x2750, B:554:0x2759, B:555:0x2798, B:589:0x29eb, B:590:0x29ef, B:592:0x29f5, B:595:0x2a0d, B:598:0x2a1a, B:600:0x2a1d, B:612:0x2afa, B:614:0x2b00, B:615:0x2b01, B:617:0x2b03, B:619:0x2b0a, B:620:0x2b0b, B:559:0x27af, B:561:0x27b3, B:565:0x27bf, B:567:0x27c5, B:579:0x28d3, B:581:0x28d9, B:582:0x291d, B:584:0x2947, B:585:0x298a, B:587:0x29a0, B:588:0x29e5, B:622:0x2b0d, B:624:0x2b14, B:625:0x2b15, B:627:0x2b17, B:629:0x2b1e, B:630:0x2b1f, B:608:0x2a83, B:603:0x2a49, B:605:0x2a4f, B:606:0x2a7b, B:574:0x2832, B:576:0x2851, B:577:0x28c7, B:569:0x27e5, B:571:0x27fa, B:572:0x282b), top: B:737:0x268b, outer: #9, inners: #15, #22, #27, #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:645:0x2c5a  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x2ca8  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x2cff  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x2f88  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x3062  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x30b2  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x3103  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x32c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:848:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06eb A[Catch: all -> 0x0828, TryCatch #4 {all -> 0x0828, blocks: (B:93:0x06e1, B:94:0x06e5, B:96:0x06eb, B:99:0x0706, B:63:0x0470, B:80:0x05bb, B:83:0x0609, B:88:0x067d, B:92:0x06db), top: B:743:0x0470 }] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v15 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v537 */
    /* JADX WARN: Type inference failed for: r4v538 */
    /* JADX WARN: Type inference failed for: r4v539 */
    /* JADX WARN: Type inference failed for: r4v549 */
    /* JADX WARN: Type inference failed for: r4v550 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r42) {
        /*
            Method dump skipped, instruction units count: 14086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.Hilt_FixedDataFamilyShareAddBeneficiaryActivity.attachBaseContext(android.content.Context):void");
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 119;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        getRequestBeneficiariesState = 1;
        component2();
        copydefault = -3780477796495014671L;
        component3 = 1052327102;
        component2 = (char) 50417;
        int i = getAsAtTimestamp + 31;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component1 = -6790205695614354801L;
        ShareDataUIState = new char[]{33519, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33432, 33463, 33455, 33424, 33512, 33421, 33460, 33457, 33456, 33456, 33457, 33449, 33465, 33409, 33458, 33460, 33468, 33469, 33476, 33426, 33467, 33429, 33430, 33427, 33512, 33510, 33513, 33427, 33426, 33427, 33430, 33516, 33514, 33428, 33429, 33515, 33426, 33427, 33513, 33424, 33426, 33428, 33470, 33468, 33465, 33466, 33468, 33431, 33519, 33518, 33514, 33425, 33469, 33428, 33514, 33517, 33517, 33515, 33514, 33514, 33428, 33470, 33426, 33514, 33428, 33425, 33460, 33283, 33341, 33343, 33280, 33307, 33405, 33346, 33407, 33404, 33403, 33402, 33404, 33381, 33380, 33405, 33406, 33406, 33405, 33407, 33406, 33404, 33380, 33295, 33385, 33376, 33283, 33284, 33286, 33294, 33287, 33286, 33295, 33287, 33342, 33376, 33383, 33283, 33286, 33288, 33286, 33286, 33343, 33342, 33286, 33288, 33286, 33384, 33385, 33288, 33283, 33379, 33385, 33289, 33285, 33381, 33381, 33286, 33287, 33291, 33285, 33342, 33376, 33311, 33309, 33345, 33383, 33284, 33284, 33288, 33280, 33342, 33513, 33462, 33459, 33452, 33449, 33465, 33439, 33429, 33461, 33464, 33465, 33426, 33432, 33460, 33460, 33466, 33517, 33462, 33454, 33457, 33457, 33449, 33471, 33419, 33461, 33458, 33418, 33414, 33462, 33467, 33464, 33465, 33421, 33384, 33304, 33307, 33378, 33381, 33398, 33399, 33377, 33381, 33383, 33384, 33383, 33381, 33379, 33310, 33378, 33384, 33349, 33344, 33309, 33406, 33433, 33367, 33347, 33347, 33372, 33345, 33345, 33370, 33367, 33366, 33367, 33364, 33364, 33367, 33366, 33368, 33371, 33370, 33345, 33407, 33368, 33368, 33368, 33345, 33407, 33344, 33385, 33406, 33365, 33344, 33386, 33346, 33345, 33382, 33344, 33369, 33367, 33344, 33385, 33407, 33365, 33364, 33406, 33385, 33346, 33346, 33345, 33407, 33384, 33346, 33368, 33365, 33366, 33407, 33384, 33384, 33344, 33368, 33367, 33366, 33367, 33369, 33370, 33346, 33518, 33469, 33468, 33469, 33469, 33470, 33408, 33409, 33408, 33468, 33470, 33477, 33513, 33515, 33514, 33512, 33512, 33511, 33511, 33515, 33515, 33515, 33477, 33516, 33515, 33512, 33512, 33514, 33516, 33517, 33516, 33516, 33515};
    }
}
