package com.huawei.common.widget.dialog;

import android.R;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import androidx.fragment.app.DialogFragment;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.KeyboardUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.common.databinding.CommonDialogAddNoteBinding;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.MaskBlurUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public class AddNoteDialog extends DialogFragment {
    private static long component3;
    private static int copy;
    private static long getAsAtTimestamp;
    private final ApiCallback<String> ShareDataUIState;
    private CommonDialogAddNoteBinding component1;
    private final String component2;
    private final String copydefault;
    private static final byte[] $$c = {77, -64, 102, -128};
    private static final int $$f = 169;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {62, TarHeader.LF_FIFO, 60, 44, 34, Ascii.ETB, Ascii.US, 1, Ascii.ETB, Ascii.ETB, 17, 42, 13, Ascii.RS, 34, 20, Ascii.EM, Ascii.NAK, Ascii.NAK, 13, Ascii.US, Ascii.FS, -43};
    private static final int $$e = 43;
    private static final byte[] $$a = {Ascii.SI, -74, 84, -51, Ascii.SUB, Ascii.SI, Ascii.ETB, Ascii.SUB, Ascii.FF, 17, 13, 13, 5, Ascii.ETB, 20, -50, Ascii.FF, Ascii.GS, -20, 33, Ascii.SUB, Ascii.DC2, -2, Ascii.FS, Ascii.SI, -36, TarHeader.LF_LINK, Ascii.ETB, 5, Ascii.SI, 17, 8, 20, 6, Ascii.US, 5, 10, Ascii.FS, -18, 47, -5, 33, -1};
    private static final int $$b = 46;
    private static int getRequestBeneficiariesState = 1;
    private static int equals = 0;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, short r7, short r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 102
            byte[] r0 = com.huawei.common.widget.dialog.AddNoteDialog.$$c
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.dialog.AddNoteDialog.$$g(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 6
            int r7 = 28 - r7
            int r9 = r9 * 4
            int r9 = 103 - r9
            byte[] r0 = com.huawei.common.widget.dialog.AddNoteDialog.$$a
            int r8 = r8 * 3
            int r8 = 15 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2f:
            int r3 = r3 + r8
            int r8 = r3 + (-14)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.dialog.AddNoteDialog.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 11 - r7
            int r6 = r6 * 10
            int r6 = 13 - r6
            byte[] r0 = com.huawei.common.widget.dialog.AddNoteDialog.$$d
            int r8 = r8 * 4
            int r8 = 99 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r5 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r8 = r8 + r3
            int r8 = r8 + (-22)
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.common.widget.dialog.AddNoteDialog.d(byte, int, int, java.lang.Object[]):void");
    }

    public AddNoteDialog(String str, String str2, ApiCallback<String> apiCallback) {
        this.copydefault = str;
        this.component2 = str2;
        this.ShareDataUIState = apiCallback;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            int i2 = component4 + 11;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Window window = dialog.getWindow();
            if (window != null) {
                int i4 = equals + 101;
                component4 = i4 % 128;
                if (i4 % 2 == 0) {
                    window.setGravity(15);
                    window.setLayout(-1, 66);
                    window.setBackgroundDrawableResource(R.color.transparent);
                    window.setWindowAnimations(com.huawei.common.R.style.BottomAnimation);
                    dialog.setCanceledOnTouchOutside(false);
                } else {
                    window.setGravity(80);
                    window.setLayout(-1, -2);
                    window.setBackgroundDrawableResource(R.color.transparent);
                    window.setWindowAnimations(com.huawei.common.R.style.BottomAnimation);
                    dialog.setCanceledOnTouchOutside(true);
                }
                dialog.setCancelable(true);
            }
        }
        MaskBlurUtils.addMask(getContext());
        int i5 = component4 + 97;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 36 / 0;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 79;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16780482, 33 - ExpandableListView.getPackedPositionType(0L), (char) (60267 - Process.getGidForName("")), -834797019, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() % (getAsAtTimestamp - 5431355972723572778L);
                    try {
                        Object[] objArr3 = {notifyVar, notifyVar};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                        if (objCopydefault2 == null) {
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 687;
                            int absoluteGravity = 34 - Gravity.getAbsoluteGravity(0, 0);
                            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 60373);
                            byte b4 = (byte) ($$f & 7);
                            byte b5 = (byte) (b4 - 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, absoluteGravity, edgeSlop, -1969106284, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
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
            } else {
                int i5 = notifyVar.copydefault;
                try {
                    Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(3266 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 33 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (Color.alpha(0) + 60268), -834797019, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (getAsAtTimestamp ^ 5431355972723572778L);
                    Object[] objArr5 = {notifyVar, notifyVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault4 == null) {
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 687;
                        int i6 = 35 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                        char size = (char) (View.MeasureSpec.getSize(0) + 60373);
                        byte b8 = (byte) ($$f & 7);
                        byte b9 = (byte) (b8 - 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, i6, size, -1969106284, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i7 = $10 + 81;
            $11 = i7 % 128;
            int i8 = i7 % 2;
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i9 = $10 + 35;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                Object[] objArr6 = {notifyVar, notifyVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault5 == null) {
                    int iMyTid = 687 - (Process.myTid() >> 22);
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 35;
                    char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 60373);
                    byte b10 = (byte) ($$f & 7);
                    byte b11 = (byte) (b10 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iMyTid, iIndexOf, c2, -1969106284, false, $$g(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                throw null;
            }
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr7 = {notifyVar, notifyVar};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault6 == null) {
                int iLastIndexOf = 686 - TextUtils.lastIndexOf("", '0', 0, 0);
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 34;
                char cRed = (char) (60373 - Color.red(0));
                byte b12 = (byte) ($$f & 7);
                byte b13 = (byte) (b12 - 1);
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, iCombineMeasuredStates, cRed, -1969106284, false, $$g(b12, b13, (byte) (b13 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        int i3 = $10 + 47;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3266, 33 - TextUtils.indexOf("", "", 0, 0), (char) (KeyEvent.keyCodeFromString("") + 60268), -834797019, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component3 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 687;
                    int iNormalizeMetaState2 = 34 - KeyEvent.normalizeMetaState(0);
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 60373);
                    byte b4 = (byte) ($$f & 7);
                    byte b5 = (byte) (b4 - 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, iNormalizeMetaState2, cResolveSizeAndState, -1969106284, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i6 = $11 + 7;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                int iIndexOf = TextUtils.indexOf("", "", 0) + 687;
                int size = 34 - View.MeasureSpec.getSize(0);
                char keyRepeatDelay = (char) (60373 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                byte b6 = (byte) ($$f & 7);
                byte b7 = (byte) (b6 - 1);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, size, keyRepeatDelay, -1969106284, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        String str = new String(cArr2);
        int i8 = $10 + 57;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = component4 + 27;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault == null) {
            int iRgb = (-16774811) - Color.rgb(0, 0, 0);
            int doubleTapTimeout = 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            char packedPositionChild = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
            byte b2 = (byte) ($$b & 21);
            Object[] objArr2 = new Object[1];
            a(b2, b2, (byte) (-$$a[42]), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iRgb, doubleTapTimeout, packedPositionChild, -2047739879, false, (String) objArr2[0], null);
        }
        if (((Field) objCopydefault).getLong(null) != -1) {
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault2 == null) {
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2405;
                int iResolveSize = View.resolveSize(0, 0) + 26;
                char cArgb = (char) Color.argb(0, 0, 0, 0);
                byte b3 = (byte) 3;
                Object[] objArr3 = new Object[1];
                a(b3, b3, (byte) (-$$a[42]), objArr3);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, iResolveSize, cArgb, 24929979, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b(View.resolveSizeAndState(0, 0, 0) + 33287, new char[]{58012, 24720, 59022, 25730, 60100, 26809, 61117, 27817, 62121, 28903, 63203, 29890, 64209, 30937, 65265, 31986}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((KeyEvent.getMaxKeyCode() >> 16) + 57773, new char[]{58015, 831, 8649, 18335, 25654, 35582, 43148, 51508, 61398, 3458, 12871, 20721, 30377, 38736, 46564, 56240}, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i4 = component4 + 97;
            equals = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 2146995039};
                Object[] objArr7 = new Object[1];
                c(14087 - View.MeasureSpec.getSize(0), new char[]{28846, 18341, 7854, 54774, 44217, 25499, 14982, 61835, 51344, 40859, 22181, 11748, 58608, 48113, 29382, 18896, 220, 55254, 44739, 25897, 15416, 62259, 51762, 33026, 22545, 12108, 58904, 48415, 29799, 19317, 618, 55673, 36936, 26456, 15885, 62794, 52308, 33955, 23464, 4776, 59824, 41137, 30596, 20110, 1439, 56479, 37864, 27306, 8671, 63688}, objArr7);
                Class<?> cls2 = Class.forName(((String) objArr7[0]).intern());
                byte b4 = $$d[7];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr8 = new Object[1];
                d(b4, b5, b5, objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault3 == null) {
                    int jumpTapTimeout = 2405 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int iRed = Color.red(0) + 26;
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
                    byte b6 = (byte) 3;
                    Object[] objArr9 = new Object[1];
                    a(b6, b6, (byte) (-$$a[42]), objArr9);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(jumpTapTimeout, iRed, cIndexOf, 24929979, false, (String) objArr9[0], null);
                }
                ((Field) objCopydefault3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(TextUtils.lastIndexOf("", '0') + 11864, new char[]{58007, 52431, 48700, 27009, 23493, 1324, 62616, 42681, 36897, 17290, 11710, 7960, 52891, 47342, 27200, 21898, 2027, 61810, 41092, 37612, 31833, 12222}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(26293 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{58003, 33839, 12285, 54937, 30801, 58138, 35500, 11351, 55099, 32458, 57736, 35653, 13027, 54698, 32629}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault4 == null) {
                        int iKeyCodeFromString = 2405 - KeyEvent.keyCodeFromString("");
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 26;
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        byte b7 = (byte) ($$a[42] + 1);
                        byte b8 = b7;
                        Object[] objArr12 = new Object[1];
                        a(b7, b8, b8, objArr12);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, iResolveOpacity, cNormalizeMetaState, -1843538389, false, (String) objArr12[0], null);
                    }
                    ((Field) objCopydefault4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault5 == null) {
                        int iIndexOf = 2404 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 26;
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b9 = (byte) ($$b & 21);
                        Object[] objArr13 = new Object[1];
                        a(b9, b9, (byte) (-$$a[42]), objArr13);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, tapTimeout, threadPriority, -2047739879, false, (String) objArr13[0], null);
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
        int i6 = ((int[]) objArr[0])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i6 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), Process.getGidForName("") + 43, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                int i8 = component4 + 65;
                equals = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr14 = {-959438984, Long.valueOf(j3), arrayList, null, true};
                    Class cls4 = (Class) ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 6562, (ViewConfiguration.getLongPressTimeout() >> 16) + 56, (char) (KeyEvent.getMaxKeyCode() >> 16));
                    byte b10 = $$d[7];
                    byte b11 = (byte) (b10 - 1);
                    byte b12 = b10;
                    Object[] objArr15 = new Object[1];
                    d(b11, b12, (byte) (b12 - 1), objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
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
        super.onCreate(bundle);
        setReenterTransition(true);
    }

    @Override
    public void onStop() {
        int i = 2 % 2;
        int i2 = component4 + 93;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            super.onStop();
            MaskBlurUtils.removeMask(getContext());
            int i3 = equals + 37;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onStop();
        MaskBlurUtils.removeMask(getContext());
        throw null;
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = component4 + 5;
        equals = i2 % 128;
        CommonDialogAddNoteBinding commonDialogAddNoteBindingInflate = i2 % 2 != 0 ? CommonDialogAddNoteBinding.inflate(layoutInflater, viewGroup, false) : CommonDialogAddNoteBinding.inflate(layoutInflater, viewGroup, false);
        this.component1 = commonDialogAddNoteBindingInflate;
        return commonDialogAddNoteBindingInflate.getRoot();
    }

    private void component1(View view) {
        int i = 2 % 2;
        int i2 = component4 + 49;
        equals = i2 % 128;
        int i3 = i2 % 2;
        dismiss();
        int i4 = component4 + 41;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private void component2(View view) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 71;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        ApiCallback<String> apiCallback = this.ShareDataUIState;
        if (apiCallback != null) {
            int i5 = i2 + 109;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            apiCallback.onSuccess(this.component1.etNote.getText().toString());
        }
        dismiss();
    }

    private void component1() {
        int i = 2 % 2;
        int i2 = equals + 103;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        KeyboardUtils.showSoftInput(this.component1.etNote);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override
    public void onViewCreated(View view, Bundle bundle) {
        int i = 2 % 2;
        super.onViewCreated(view, bundle);
        this.component1.tvTitle.setText(this.copydefault);
        this.component1.etNote.setInputType(1);
        this.component1.etNote.requestFocus();
        this.component1.etNote.setFocusableInTouchMode(true);
        this.component1.btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                AddNoteDialog.$r8$lambda$lz8ucAJ4xg9vjr615LxgqU2z_Rc(this.f$0, view2);
            }
        });
        this.component1.etNote.setText(this.component2);
        if (this.component2 != null) {
            this.component1.etNote.setSelection(this.component2.length());
            int i2 = equals + 87;
            component4 = i2 % 128;
            int i3 = i2 % 2;
        }
        this.component1.btnSure.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                AddNoteDialog.$r8$lambda$gfdjLGRnNBhhKBKdi2VJdi9T5Ao(this.f$0, view2);
            }
        });
        this.component1.etNote.post(new Runnable() {
            @Override
            public final void run() {
                AddNoteDialog.m10046$r8$lambda$0dkwlcl21h9_o8l5b4ru6e9bzk(this.f$0);
            }
        });
        int i4 = component4 + 61;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
    }

    public static void m10046$r8$lambda$0dkwlcl21h9_o8l5b4ru6e9bzk(AddNoteDialog addNoteDialog) {
        int i = 2 % 2;
        int i2 = equals + 59;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        addNoteDialog.component1();
        int i4 = component4 + 99;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$gfdjLGRnNBhhKBKdi2VJdi9T5Ao(AddNoteDialog addNoteDialog, View view) {
        int i = 2 % 2;
        int i2 = equals + 31;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState(addNoteDialog, view);
        int i4 = component4 + 101;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$lz8ucAJ4xg9vjr615LxgqU2z_Rc(AddNoteDialog addNoteDialog, View view) {
        int i = 2 % 2;
        int i2 = equals + 105;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        component2(addNoteDialog, view);
        int i4 = component4 + 65;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Finally extract failed */
    private static void component2(AddNoteDialog addNoteDialog, View view) {
        int i = 2 % 2;
        int i2 = component4 + 25;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                addNoteDialog.component1(view);
                Callback.onClick_exit();
                throw null;
            }
            addNoteDialog.component1(view);
            Callback.onClick_exit();
            int i4 = component4 + 47;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void ShareDataUIState(AddNoteDialog addNoteDialog, View view) {
        int i = 2 % 2;
        int i2 = component4 + 85;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            addNoteDialog.component2(view);
            Callback.onClick_exit();
            int i4 = component4 + 81;
            equals = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    static {
        copy = 0;
        ShareDataUIState();
        component3 = -4317948194763116313L;
        int i = getRequestBeneficiariesState + 53;
        copy = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static void ShareDataUIState() {
        getAsAtTimestamp = 4742071866891461340L;
    }
}
