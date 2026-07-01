package com.huawei.digitalpayment.consumer.scan.ui.dialog;

import android.app.Dialog;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ThreadUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.common.widget.dialog.BaseDialog;
import com.huawei.digitalpayment.consumer.qrcode.R;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancelAll;

public class ScanNormalDataSelectDialog extends BaseDialog {
    private OnItemClick component2;
    private static final byte[] $$c = {70, -47, -65, TarHeader.LF_BLK};
    private static final int $$f = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {79, -7, -1, -17, 3, -11, -57, 69, -7, -6, -50, TarHeader.LF_FIFO, -60, 58, -3, 7, 4, -11, 13, 1, -69, 32, 1, 1, -4, 35, -8, 0, -2, 13, -44, Ascii.ESC, 2, 17, -5, 3, 7, Ascii.FF, -2, 3, -1, -1, -9, 9, 6, -66};
    private static final int $$h = 79;
    private static final byte[] $$a = {TarHeader.LF_NORMAL, -22, 122, 126, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK};
    private static final int $$b = 129;
    private static int copydefault = 0;
    private static int component1 = 1;
    private static char[] component3 = {2030, 1052, 1054, 2024, 2021, 1972, 1987, 1975, 2029, 1042, 1051, 1053, 2018, 1992, 2026, 2028, 2032, 2034, 2020, 1050, 2004, 2025, 1969, 2037, 2035, 1970, 1973, 1048, 2019, 1976, 2003, 2038, 1985, 2023, 2041, 2002, 1055, 2031, 1049, 1974, 1968, 2017, 1966, 1971, 2036, 2016, 2022, 2027, 1977};
    private static char ShareDataUIState = 12829;

    public interface OnItemClick {
        void onItemClick(int i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r7, int r8, byte r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.scan.ui.dialog.ScanNormalDataSelectDialog.$$c
            int r8 = r8 * 3
            int r8 = r8 + 119
            int r7 = r7 + 4
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.dialog.ScanNormalDataSelectDialog.$$i(short, int, byte):java.lang.String");
    }

    private static void a(short s, byte b2, int i, Object[] objArr) {
        int i2 = b2 * 6;
        int i3 = i + 4;
        byte[] bArr = $$a;
        int i4 = (s * 16) + 83;
        byte[] bArr2 = new byte[i2 + 10];
        int i5 = i2 + 9;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + (-i4)) - 17;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i3 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = (i4 + (-bArr[i8])) - 17;
            i3 = i8;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 24
            int r0 = 34 - r7
            int r8 = r8 * 33
            int r8 = 37 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.scan.ui.dialog.ScanNormalDataSelectDialog.$$g
            int r6 = r6 * 12
            int r6 = 111 - r6
            byte[] r0 = new byte[r0]
            int r7 = 33 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L30
        L18:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r1[r6]
            r5 = r3
            r3 = r6
            r6 = r5
        L30:
            int r8 = r8 + r6
            int r6 = r3 + 1
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.dialog.ScanNormalDataSelectDialog.c(byte, int, byte, java.lang.Object[]):void");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.qrcode_layout_scan_guide_dialog;
        if (i3 != 0) {
            int i5 = 50 / 0;
        }
        return i4;
    }

    @Override
    public void onStart() {
        Window window;
        int i = 2 % 2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        window.setGravity(80);
        window.setLayout(-1, -2);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        window.setWindowAnimations(R.style.BottomAnimation);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        int i4 = component1 + 123;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(byte b2, char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component3;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 7422, ExpandableListView.getPackedPositionChild(j) + 16, (char) (TextUtils.indexOf((CharSequence) "", '0') + 64292), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - TextUtils.indexOf("", ""), 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (64292 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            int i5 = $11 + 65;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (cancelall.component2 < i2) {
                int i7 = $10 + 65;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i9 = $10 + 95;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 << b2);
                        cArr4[cancelall.component2 / 0] = (char) (cancelall.component3 >>> b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, (char) (TextUtils.indexOf("", "", 0) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        int i10 = $11 + 47;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) (-1);
                            byte b4 = (byte) (b3 + 1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 2944, 24 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27636), 794909189, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i12];
                    } else if (cancelall.copydefault == cancelall.ShareDataUIState) {
                        cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                        cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                        int i13 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                        int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[i13];
                        cArr4[cancelall.component2 + 1] = cArr2[i14];
                    } else {
                        int i15 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                        int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                        cArr4[cancelall.component2] = cArr2[i15];
                        cArr4[cancelall.component2 + 1] = cArr2[i16];
                    }
                }
                cancelall.component2 += 2;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
            i17++;
            int i18 = $10 + 105;
            $11 = i18 % 128;
            int i19 = i18 % 2;
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x021d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r21, android.os.Bundle r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2073
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scan.ui.dialog.ScanNormalDataSelectDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private void ShareDataUIState(View view) {
        int i = 2 % 2;
        ThreadUtils.runOnUiThreadDelayed(new Runnable() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public final void run() {
                int i2 = 2 % 2;
                int i3 = component3 + 93;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ScanNormalDataSelectDialog.$r8$lambda$Orp_nrqKiVQHPYUlfz_v8hpbcf4(this.f$0);
                int i5 = component3 + 25;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        }, 300L);
        int i2 = copydefault + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void component2() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        dismiss();
        this.component2.onItemClick(1);
        int i4 = copydefault + 113;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.component2 = onItemClick;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 41;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static void m10966$r8$lambda$5sw7C63jW5OeBbaW0gXWbeQd5w(ScanNormalDataSelectDialog scanNormalDataSelectDialog, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        component2(scanNormalDataSelectDialog, view);
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
    }

    public static void $r8$lambda$Orp_nrqKiVQHPYUlfz_v8hpbcf4(ScanNormalDataSelectDialog scanNormalDataSelectDialog) {
        int i = 2 % 2;
        int i2 = component1 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        scanNormalDataSelectDialog.component2();
        int i4 = component1 + 121;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Finally extract failed */
    private static void component2(ScanNormalDataSelectDialog scanNormalDataSelectDialog, View view) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                scanNormalDataSelectDialog.ShareDataUIState(view);
                Callback.onClick_exit();
                throw null;
            }
            scanNormalDataSelectDialog.ShareDataUIState(view);
            Callback.onClick_exit();
            int i4 = component1 + 61;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }
}
