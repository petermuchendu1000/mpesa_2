package com.safaricom.designsystem.components.spacers;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"VerticalSpace", "", "space", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "VerticalSpace--orJrPs", "(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "VerticalSpacePreview", "(Landroidx/compose/runtime/Composer;I)V", "DesignSystem_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class VerticalSpaceKt {
    private static final byte[] $$c = {94, -43, -105, 125};
    private static final int $$f = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {10, 80, 9, 70, -39, -25, -30, -26, -26, -18, -36, -33, 39};
    private static final int $$e = 149;
    private static final byte[] $$a = {107, -21, -54, -113, 7, -23, 19, -25, 72, -55, -17, -9, 7, -6, 3, 63, -71, 1, 9, 0, TarHeader.LF_CHR, -39, -20, 0, -17, Ascii.VT, -17, 39, -28, -22, 36, -31, 9, 0};
    private static final int $$b = 233;
    private static int copydefault = 0;
    private static int ShareDataUIState = 1;
    private static int component2 = -890926464;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r5, short r6, int r7) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = com.safaricom.designsystem.components.spacers.VerticalSpaceKt.$$c
            int r5 = r5 * 3
            int r5 = 65 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r7]
        L26:
            int r7 = r7 + 1
            int r3 = -r3
            int r5 = r5 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.spacers.VerticalSpaceKt.$$g(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = 31 - r6
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r8 = r8 * 3
            int r8 = r8 + 106
            byte[] r1 = com.safaricom.designsystem.components.spacers.VerticalSpaceKt.$$a
            byte[] r0 = new byte[r0]
            int r6 = 30 - r6
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r7]
            r5 = r3
            r3 = r8
            r8 = r5
        L2d:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-2)
            int r7 = r7 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.spacers.VerticalSpaceKt.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 9
            int r0 = 10 - r7
            byte[] r1 = com.safaricom.designsystem.components.spacers.VerticalSpaceKt.$$d
            int r8 = r8 + 97
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r7 = 9 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-27)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.spacers.VerticalSpaceKt.b(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12680VerticalSpaceorJrPs(final float r6, final androidx.compose.ui.Modifier r7, androidx.compose.runtime.Composer r8, final int r9, final int r10) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = -1556073685(0xffffffffa340332b, float:-1.0419176E-17)
            androidx.compose.runtime.Composer r8 = r8.startRestartGroup(r1)
            r1 = r10 & 1
            r2 = 0
            if (r1 == 0) goto L12
            r1 = r9 | 6
            goto L37
        L12:
            r1 = r9 & 14
            if (r1 != 0) goto L36
            int r1 = com.safaricom.designsystem.components.spacers.VerticalSpaceKt.ShareDataUIState
            int r1 = r1 + 57
            int r3 = r1 % 128
            com.safaricom.designsystem.components.spacers.VerticalSpaceKt.copydefault = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L2b
            boolean r1 = r8.changed(r6)
            r3 = 36
            int r3 = r3 / r2
            if (r1 == 0) goto L33
            goto L31
        L2b:
            boolean r1 = r8.changed(r6)
            if (r1 == 0) goto L33
        L31:
            r1 = 4
            goto L34
        L33:
            r1 = r0
        L34:
            r1 = r1 | r9
            goto L37
        L36:
            r1 = r9
        L37:
            r3 = r10 & 2
            if (r3 == 0) goto L3e
            r1 = r1 | 48
            goto L62
        L3e:
            r4 = r9 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L62
            int r4 = com.safaricom.designsystem.components.spacers.VerticalSpaceKt.ShareDataUIState
            int r4 = r4 + 51
            int r5 = r4 % 128
            com.safaricom.designsystem.components.spacers.VerticalSpaceKt.copydefault = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L5a
            boolean r4 = r8.changed(r7)
            if (r4 == 0) goto L56
            r4 = 32
            goto L58
        L56:
            r4 = 16
        L58:
            r1 = r1 | r4
            goto L62
        L5a:
            r8.changed(r7)
            r6 = 0
            r6.hashCode()
            throw r6
        L62:
            r1 = r1 & 91
            r4 = 18
            if (r1 != r4) goto L73
            boolean r1 = r8.getSkipping()
            if (r1 != 0) goto L6f
            goto L73
        L6f:
            r8.skipToGroupEnd()
            goto L80
        L73:
            if (r3 == 0) goto L79
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.INSTANCE
            androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
        L79:
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.m1197height3ABfNKs(r7, r6)
            androidx.compose.foundation.layout.SpacerKt.Spacer(r1, r8, r2)
        L80:
            androidx.compose.runtime.ScopeUpdateScope r8 = r8.endRestartGroup()
            if (r8 == 0) goto L97
            com.safaricom.designsystem.components.spacers.VerticalSpaceKt$$ExternalSyntheticLambda0 r1 = new com.safaricom.designsystem.components.spacers.VerticalSpaceKt$$ExternalSyntheticLambda0
            r1.<init>()
            r8.updateScope(r1)
            int r6 = com.safaricom.designsystem.components.spacers.VerticalSpaceKt.copydefault
            int r6 = r6 + 57
            int r7 = r6 % 128
            com.safaricom.designsystem.components.spacers.VerticalSpaceKt.ShareDataUIState = r7
            int r6 = r6 % r0
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.spacers.VerticalSpaceKt.m12680VerticalSpaceorJrPs(float, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void ShareDataUIState(androidx.compose.runtime.Composer r6, final int r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 2084430618(0x7c3de31a, float:3.943801E36)
            androidx.compose.runtime.Composer r6 = r6.startRestartGroup(r1)
            r1 = 0
            if (r7 != 0) goto L2a
            int r2 = com.safaricom.designsystem.components.spacers.VerticalSpaceKt.ShareDataUIState
            int r2 = r2 + 85
            int r3 = r2 % 128
            com.safaricom.designsystem.components.spacers.VerticalSpaceKt.copydefault = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L23
            boolean r2 = r6.getSkipping()
            if (r2 != 0) goto L1f
            goto L2a
        L1f:
            r6.skipToGroupEnd()
            goto L41
        L23:
            r6.getSkipping()
            r1.hashCode()
            throw r1
        L2a:
            r2 = 16
            float r2 = (float) r2
            float r2 = androidx.compose.ui.unit.Dp.m8795constructorimpl(r2)
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.INSTANCE
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r4 = 0
            r5 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r3, r4, r5, r1)
            r3 = 54
            r4 = 0
            m12680VerticalSpaceorJrPs(r2, r1, r6, r3, r4)
        L41:
            androidx.compose.runtime.ScopeUpdateScope r6 = r6.endRestartGroup()
            if (r6 == 0) goto L4f
            com.safaricom.designsystem.components.spacers.VerticalSpaceKt$$ExternalSyntheticLambda1 r1 = new com.safaricom.designsystem.components.spacers.VerticalSpaceKt$$ExternalSyntheticLambda1
            r1.<init>()
            r6.updateScope(r1)
        L4f:
            int r6 = com.safaricom.designsystem.components.spacers.VerticalSpaceKt.copydefault
            int r6 = r6 + 5
            int r7 = r6 % 128
            com.safaricom.designsystem.components.spacers.VerticalSpaceKt.ShareDataUIState = r7
            int r6 = r6 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.spacers.VerticalSpaceKt.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
    }

    private static void c(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr3 = new char[i];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr3[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 38 - (KeyEvent.getMaxKeyCode() >> 16), (char) (View.MeasureSpec.getMode(0) + 26860), 2015799920, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 7406, 15 - ExpandableListView.getPackedPositionChild(0L), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            int i6 = $10 + 17;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr4, iTrustedWebActivityServiceStub.component1, cArr3, 0, i - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i8 = $11 + 67;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2 = new char[i];
                iTrustedWebActivityServiceStub.ShareDataUIState = 1;
            } else {
                cArr2 = new char[i];
                iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            }
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr3[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                try {
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7406 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getEdgeSlop() >> 16) + 16, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    public static Unit m12679$r8$lambda$8Rd3j4XC359oK2hNEE08EArOLs(int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = copydefault + 51;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        Unit unitCopydefault = copydefault(i, composer, i2);
        if (i5 == 0) {
            int i6 = 70 / 0;
        }
        int i7 = copydefault + 99;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 93 / 0;
        }
        return unitCopydefault;
    }

    public static Unit $r8$lambda$hlBJkEKIJq0VeglLKbZZDZNtWUo(float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        int i4 = 2 % 2;
        int i5 = copydefault + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            ShareDataUIState(f, modifier, i, i2, composer, i3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitShareDataUIState = ShareDataUIState(f, modifier, i, i2, composer, i3);
        int i6 = copydefault + 25;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return unitShareDataUIState;
    }

    private static final Unit copydefault(int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = copydefault + 87;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        ShareDataUIState(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = ShareDataUIState + 53;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static final Unit ShareDataUIState(float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        int i4 = 2 % 2;
        int i5 = ShareDataUIState + 39;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        m12680VerticalSpaceorJrPs(f, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = ShareDataUIState + 7;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 39 / 0;
        }
        return unit;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0c1e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0c1f, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0c23, code lost:
    
        if (r1 != null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0c25, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0c26, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x08ee, code lost:
    
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x08f5, code lost:
    
        if (r0 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x08f7, code lost:
    
        r3 = (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1342;
        r4 = 33 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
        r5 = (char) (android.os.Process.getGidForName("") + 6426);
        r1 = (byte) (-1);
        r0 = (byte) (r1 + 1);
        r10 = new java.lang.Object[1];
        b(r1, r0, (byte) (r0 + 2), r10);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r3, r4, r5, 1443979249, false, (java.lang.String) r10[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x092e, code lost:
    
        ((java.lang.reflect.Field) r0).set(null, r12);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x093b, code lost:
    
        if (r0 != null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x093d, code lost:
    
        r3 = (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 1342;
        r4 = 32 - android.text.TextUtils.lastIndexOf("", '0', 0, 0);
        r5 = (char) (6426 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
        r1 = (byte) (-1);
        r0 = (byte) (r1 + 1);
        r10 = new java.lang.Object[1];
        b(r1, r0, (byte) (r0 + 2), r10);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r3, r4, r5, 1443979249, false, (java.lang.String) r10[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x097d, code lost:
    
        r3 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0992, code lost:
    
        if (r0 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0994, code lost:
    
        r4 = ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1342;
        r5 = 34 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
        r6 = (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 6425);
        r0 = (byte) (com.safaricom.designsystem.components.spacers.VerticalSpaceKt.$$d[2] - 1);
        r9 = (byte) (com.safaricom.designsystem.components.spacers.VerticalSpaceKt.$$e & 3);
        r11 = new java.lang.Object[1];
        b(r0, r9, (byte) (r9 + 2), r11);
        r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r4, r5, r6, -181198845, false, (java.lang.String) r11[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x09dd, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, r3)).longValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0a09 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0607 A[Catch: all -> 0x09f9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x09f9, blocks: (B:22:0x0134, B:24:0x01d7, B:26:0x02ce, B:28:0x02f6, B:31:0x04cf, B:37:0x0563, B:41:0x05c2, B:49:0x0607, B:55:0x06d0, B:57:0x076b, B:46:0x05ea), top: B:138:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x09ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int copydefault(java.util.List r35) {
        /*
            Method dump skipped, instruction units count: 3322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.designsystem.components.spacers.VerticalSpaceKt.copydefault(java.util.List):int");
    }
}
