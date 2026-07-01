package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundTextView;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public final class HomeNavItemBinding implements ViewBinding {
    private final ConstraintLayout ShareDataUIState;
    public final ImageView navIvIcon;
    public final RoundTextView navMarkerText;
    public final RoundImageView navNewIcon;
    public final TextView navTvTitle;
    private static final byte[] $$c = {80, 83, -21, -55};
    private static final int $$f = 57;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarHeader.LF_NORMAL, 86, 58, 71, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 48;
    private static final byte[] $$a = {79, 7, -80, -125, -1, -31, Ascii.VT, -33, SignedBytes.MAX_POWER_OF_TWO, -63, -25, -17, -1, -14, -5, TarHeader.LF_CONTIG, -31, -48, -17, -2, -7, -23, -21, Ascii.US, -45, -15, 3, -21};
    private static final int $$b = 40;
    private static int copydefault = 0;
    private static int component3 = 1;
    private static long component1 = -8350564494592463235L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r5, byte r6, short r7) {
        /*
            int r5 = r5 * 3
            int r5 = 105 - r5
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r3 = r6
            r5 = r7
            r4 = r2
            goto L29
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L27:
            r3 = r1[r7]
        L29:
            int r7 = r7 + 1
            int r5 = r5 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.$$g(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.$$a
            int r7 = r7 + 4
            int r6 = r6 * 6
            int r6 = 106 - r6
            int r8 = r8 * 12
            int r1 = 19 - r8
            byte[] r1 = new byte[r1]
            int r8 = 18 - r8
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-10)
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.a(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 98
            byte[] r0 = com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.$$d
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r8 = r8 * 9
            int r8 = 12 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2b:
            int r7 = r7 + r8
            int r7 = r7 + (-27)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.b(int, short, int, java.lang.Object[]):void");
    }

    @Override
    public View getRoot() {
        ConstraintLayout root;
        int i = 2 % 2;
        int i2 = component3 + 91;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            root = getRoot();
            int i3 = 81 / 0;
        } else {
            root = getRoot();
        }
        int i4 = copydefault + 77;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private HomeNavItemBinding(ConstraintLayout constraintLayout, ImageView imageView, RoundTextView roundTextView, RoundImageView roundImageView, TextView textView) {
        this.ShareDataUIState = constraintLayout;
        this.navIvIcon = imageView;
        this.navMarkerText = roundTextView;
        this.navNewIcon = roundImageView;
        this.navTvTitle = textView;
    }

    @Override
    public ConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        ConstraintLayout constraintLayout = this.ShareDataUIState;
        int i5 = i3 + 75;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return constraintLayout;
    }

    public static HomeNavItemBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component3 = i2 % 128;
        return inflate(layoutInflater, null, i2 % 2 == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[PHI: r3
  0x0022: PHI (r3v4 android.view.View) = (r3v1 android.view.View), (r3v5 android.view.View) binds: [B:8:0x0020, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding inflate(android.view.LayoutInflater r3, android.view.ViewGroup r4, boolean r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.copydefault
            int r1 = r1 + 99
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1a
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.home_nav_item
            android.view.View r3 = r3.inflate(r1, r4, r2)
            r5 = r5 ^ 1
            if (r5 == 0) goto L22
            goto L2e
        L1a:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.layout.home_nav_item
            android.view.View r3 = r3.inflate(r1, r4, r2)
            if (r5 == 0) goto L2e
        L22:
            r4.addView(r3)
            int r4 = com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.component3
            int r4 = r4 + 31
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.copydefault = r5
            int r4 = r4 % r0
        L2e:
            com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding r3 = bind(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.inflate(android.view.LayoutInflater, android.view.ViewGroup, boolean):com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding");
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 85;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    int iKeyCodeFromString = 3266 - KeyEvent.keyCodeFromString("");
                    int iLastIndexOf = 32 - TextUtils.lastIndexOf("", '0', 0, 0);
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 60268);
                    byte b2 = (byte) ($$f & 7);
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, iLastIndexOf, edgeSlop, -834797019, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component1 ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 687, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33, (char) (60373 - (Process.myPid() >> 22)), -1969106284, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 75;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 34, (char) (60373 - TextUtils.indexOf("", "", 0, 0)), -1969106284, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i8 = $11 + 43;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        String str = new String(cArr2);
        int i10 = $10 + 95;
        $11 = i10 % 128;
        if (i10 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i11 = 40 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[PHI: r0
  0x003c: PHI (r0v5 com.huawei.common.widget.round.RoundImageView) = (r0v4 com.huawei.common.widget.round.RoundImageView), (r0v9 com.huawei.common.widget.round.RoundImageView) binds: [B:14:0x0046, B:11:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding bind(android.view.View r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.copydefault
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L72
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.id.nav_iv_icon
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r1)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r5 == 0) goto L5e
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.id.nav_marker_text
            android.view.View r2 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r1)
            r6 = r2
            com.huawei.common.widget.round.RoundTextView r6 = (com.huawei.common.widget.round.RoundTextView) r6
            if (r6 == 0) goto L5e
            int r1 = com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.copydefault
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.component3 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L3e
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.id.nav_new_icon
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r1)
            com.huawei.common.widget.round.RoundImageView r0 = (com.huawei.common.widget.round.RoundImageView) r0
            r2 = 7
            int r2 = r2 / 0
            if (r0 == 0) goto L5e
        L3c:
            r7 = r0
            goto L49
        L3e:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.id.nav_new_icon
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r1)
            com.huawei.common.widget.round.RoundImageView r0 = (com.huawei.common.widget.round.RoundImageView) r0
            if (r0 == 0) goto L5e
            goto L3c
        L49:
            int r1 = com.huawei.digitalpayment.consumer.homeui.R.id.nav_tv_title
            android.view.View r0 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r1)
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L5e
            com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding r0 = new com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding
            r4 = r9
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L5e:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r1)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r9 = r1.concat(r9)
            r0.<init>(r9)
            throw r0
        L72:
            int r0 = com.huawei.digitalpayment.consumer.homeui.R.id.nav_iv_icon
            android.view.View r9 = androidx.viewbinding.ViewBindings.findChildViewById(r9, r0)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.bind(android.view.View):com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding");
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0848 A[PHI: r0
  0x0848: PHI (r0v140 java.lang.reflect.Method) = (r0v139 java.lang.reflect.Method), (r0v146 java.lang.reflect.Method) binds: [B:130:0x0846, B:127:0x0841] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0592 A[Catch: all -> 0x08a0, TryCatch #0 {all -> 0x08a0, blocks: (B:96:0x0684, B:98:0x0691, B:99:0x06cb, B:101:0x06ea, B:102:0x0729, B:72:0x057b, B:74:0x0592, B:75:0x05dc), top: B:140:0x057b }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x05f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int component2(java.util.List r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.homeui.databinding.HomeNavItemBinding.component2(java.util.List):int");
    }
}
