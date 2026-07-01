package com.safaricom.designsystem.components.selectablemenu;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.safaricom.designsystem.components.selectablemenu.SelectableMenuKt;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.BERTags;

public final class SelectableMenuKt$DropdownMenuItem$1$$ExternalSyntheticLambda0 implements Function0 {
    public final Function0 f$0;
    private static final byte[] $$c = {1, -128, 109, -128};
    private static final int $$f = 61;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {89, 120, -98, -110, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
    private static final int $$e = BERTags.PRIVATE;
    private static final byte[] $$a = {84, -122, 19, 43, 1, Ascii.US, -11, 33, -64, 63, Ascii.EM, 17, 1, Ascii.SO, 5, -55, Ascii.US, TarHeader.LF_NORMAL, 17, 2, 7, Ascii.ETB, Ascii.NAK, -31, 45, Ascii.SI, -3, Ascii.NAK};
    private static final int $$b = 209;
    private static int component1 = 0;
    private static int copy = 1;
    private static char component2 = 63930;
    private static char ShareDataUIState = 30885;
    private static char component3 = 34875;
    private static char copydefault = 22850;

    private static String $$g(byte b2, int i, int i2) {
        byte[] bArr = $$c;
        int i3 = (i * 4) + 111;
        int i4 = i2 * 4;
        int i5 = (b2 * 2) + 4;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5++;
            i3 = i5 + i3;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i5];
            i5++;
            i3 += b3;
        }
    }

    public SelectableMenuKt$DropdownMenuItem$1$$ExternalSyntheticLambda0(Function0 function0) {
        this.f$0 = function0;
    }

    private static void a(short s, int i, int i2, Object[] objArr) {
        byte[] bArr = $$a;
        int i3 = 106 - (s * 6);
        int i4 = i * 12;
        int i5 = i2 + 4;
        byte[] bArr2 = new byte[i4 + 7];
        int i6 = i4 + 6;
        int i7 = -1;
        if (bArr == null) {
            i3 = (i6 + i3) - 10;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i3;
            i5++;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 = (i3 + bArr[i5]) - 10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r0 = com.safaricom.designsystem.components.selectablemenu.SelectableMenuKt$DropdownMenuItem$1$$ExternalSyntheticLambda0.$$d
            int r6 = r6 * 9
            int r6 = 13 - r6
            int r8 = 100 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r8]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-27)
            int r8 = r8 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.selectablemenu.SelectableMenuKt$DropdownMenuItem$1$$ExternalSyntheticLambda0.b(short, int, short, java.lang.Object[]):void");
    }

    @Override
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent3 = SelectableMenuKt.ShareDataUIState.component3(this.f$0);
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return unitComponent3;
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 1;
            $10 = i5 % 128;
            int i6 = i5 % i2;
            cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i7 = 58224;
            int i8 = i4;
            while (i8 < 16) {
                int i9 = $10 + 49;
                $11 = i9 % 128;
                int i10 = i9 % i2;
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                int i11 = (c3 + i7) ^ ((c3 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)));
                int i12 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(copydefault);
                    objArr2[i2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int i13 = 845 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int iLastIndexOf = 31 - TextUtils.lastIndexOf("", '0', i4, i4);
                        char c4 = (char) ((TypedValue.complexToFraction(i4, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i4, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23251);
                        byte b2 = (byte) ($$c[i4] - 1);
                        byte b3 = b2;
                        String str$$g = $$g(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i13, iLastIndexOf, c4, 592652048, false, str$$g, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 845;
                        int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 33;
                        char longPressTimeout = (char) (23251 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        byte b4 = (byte) ($$c[0] - 1);
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iLastIndexOf2, longPressTimeout, 592652048, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    int i14 = $10 + 65;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    cArr3 = cArr4;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 49, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i16 = $10 + 37;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            i2 = 2;
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0858, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0859, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x085d, code lost:
    
        if (r1 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x085f, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0860, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0494, code lost:
    
        r0 = com.safaricom.designsystem.components.selectablemenu.SelectableMenuKt$DropdownMenuItem$1$$ExternalSyntheticLambda0.copy;
        r3 = ((r0 | 15) << 1) - (r0 ^ 15);
        com.safaricom.designsystem.components.selectablemenu.SelectableMenuKt$DropdownMenuItem$1$$ExternalSyntheticLambda0.component1 = r3 % 128;
        r3 = r3 % 2;
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x04a9, code lost:
    
        if (r0 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x04ab, code lost:
    
        r0 = (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1342;
        r22 = 33 - android.view.View.MeasureSpec.getMode(0);
        r3 = (char) (6425 - android.graphics.Color.blue(0));
        r5 = (byte) 1;
        r6 = (byte) (r5 + 2);
        r9 = new java.lang.Object[1];
        b(r5, r6, (byte) (r6 - 2), r9);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r22, r3, 1443979249, false, (java.lang.String) r9[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x04e2, code lost:
    
        ((java.lang.reflect.Field) r0).set(null, r12);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04ef, code lost:
    
        if (r0 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x04f1, code lost:
    
        r0 = 1343 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1));
        r22 = (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 33;
        r3 = (char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 6426);
        r5 = (byte) 1;
        r6 = (byte) (r5 + 2);
        r9 = new java.lang.Object[1];
        b(r5, r6, (byte) (r6 - 2), r9);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r22, r3, 1443979249, false, (java.lang.String) r9[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0535, code lost:
    
        r5 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0548, code lost:
    
        if (r0 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x054a, code lost:
    
        r0 = 1343 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1));
        r22 = 34 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1));
        r3 = (char) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 6425);
        r6 = (byte) 0;
        r8 = r6;
        r10 = new java.lang.Object[1];
        b(r6, r8, r8, r10);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r22, r3, -181198845, false, (java.lang.String) r10[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x058c, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r5)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0598, code lost:
    
        r0 = com.safaricom.designsystem.components.selectablemenu.SelectableMenuKt$DropdownMenuItem$1$$ExternalSyntheticLambda0.component1;
        r3 = (r0 & 91) + (r0 | 91);
        com.safaricom.designsystem.components.selectablemenu.SelectableMenuKt$DropdownMenuItem$1$$ExternalSyntheticLambda0.copy = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x05a6, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x05a7, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x05aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0784 A[PHI: r4
  0x0784: PHI (r4v14 int) = (r4v13 int), (r4v22 int) binds: [B:94:0x0782, B:91:0x077e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0787 A[PHI: r4
  0x0787: PHI (r4v21 int) = (r4v13 int), (r4v22 int) binds: [B:94:0x0782, B:91:0x077e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int component2(java.util.List r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.selectablemenu.SelectableMenuKt$DropdownMenuItem$1$$ExternalSyntheticLambda0.component2(java.util.List):int");
    }
}
