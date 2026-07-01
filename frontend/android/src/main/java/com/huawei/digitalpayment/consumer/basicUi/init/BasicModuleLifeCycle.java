package com.huawei.digitalpayment.consumer.basicUi.init;

import android.content.Context;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ThreadUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.module.UserLifecycle;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.consumer.basicUi.util.PinFreeManager;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.json.JSONObject;

public class BasicModuleLifeCycle implements UserLifecycle {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;

    public class AnonymousClass4 extends ThreadUtils.SimpleTask<Void> {
        final String ShareDataUIState;
        private static final byte[] $$c = {69, 81, 99, -123};
        private static final int $$f = 66;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {Ascii.EM, 43, 92, -56, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
        private static final int $$e = 30;
        private static final byte[] $$a = {SignedBytes.MAX_POWER_OF_TWO, -61, 76, -90, Ascii.SI, -8, Ascii.DLE, -1, -4, -3, -52, TarHeader.LF_CONTIG, Ascii.SO, 1, 8, -13, Ascii.VT, 8, PSSSigner.TRAILER_IMPLICIT, 68, -1, -61, 36, 19, 4, 10, -8, 8, 0, -22, Ascii.SYN, Ascii.SI, -11, 8, 0, Ascii.SI, 0, 17, -34, 19, 4, 10, -8, 8, 0, -26, 39, -6, Ascii.VT};
        private static final int $$b = 119;
        private static int component1 = 0;
        private static int component2 = 1;
        private static long component3 = 7095484752261435666L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(int r5, short r6, int r7) {
            /*
                int r6 = r6 * 3
                int r6 = 105 - r6
                byte[] r0 = com.huawei.digitalpayment.consumer.basicUi.init.BasicModuleLifeCycle.AnonymousClass4.$$c
                int r7 = r7 * 4
                int r7 = 3 - r7
                int r5 = r5 * 4
                int r5 = 1 - r5
                byte[] r1 = new byte[r5]
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r5
                r3 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r7 = r7 + 1
                int r3 = r3 + 1
                if (r3 != r5) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L26:
                r4 = r0[r7]
            L28:
                int r4 = -r4
                int r6 = r6 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.init.BasicModuleLifeCycle.AnonymousClass4.$$g(int, short, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 32
                int r7 = 35 - r7
                byte[] r0 = com.huawei.digitalpayment.consumer.basicUi.init.BasicModuleLifeCycle.AnonymousClass4.$$a
                int r8 = r8 * 19
                int r1 = 33 - r8
                int r6 = r6 * 6
                int r6 = 103 - r6
                byte[] r1 = new byte[r1]
                int r8 = 32 - r8
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L30
            L18:
                r3 = r2
            L19:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r4
                r4 = r5
            L30:
                int r6 = r6 + r7
                int r6 = r6 + (-2)
                r7 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.init.BasicModuleLifeCycle.AnonymousClass4.a(int, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 3
                int r0 = 10 - r8
                int r6 = r6 + 98
                byte[] r1 = com.huawei.digitalpayment.consumer.basicUi.init.BasicModuleLifeCycle.AnonymousClass4.$$d
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                int r8 = 9 - r8
                r2 = 0
                if (r1 != 0) goto L15
                r6 = r7
                r3 = r8
                r4 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r7 = r7 + 1
                int r4 = r3 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r1[r7]
                r5 = r7
                r7 = r6
                r6 = r5
            L2c:
                int r7 = r7 + r3
                int r7 = r7 + (-27)
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.init.BasicModuleLifeCycle.AnonymousClass4.b(byte, byte, short, java.lang.Object[]):void");
        }

        AnonymousClass4(BasicModuleLifeCycle basicModuleLifeCycle, String str) {
            this.ShareDataUIState = str;
        }

        @Override
        public Object doInBackground() throws Throwable {
            int i = 2 % 2;
            int i2 = component2 + 17;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Void voidComponent1 = component1();
            int i4 = component2 + 17;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return voidComponent1;
        }

        @Override
        public void onSuccess(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 23;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component3((Void) obj);
            int i4 = component1 + 97;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public Void component1() throws Throwable {
            int i = 2 % 2;
            try {
                PinFreeManager.INSTANCE.update(new JSONObject(this.ShareDataUIState).optJSONObject("customer"));
                int i2 = component1 + 39;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return null;
                }
                int i3 = 3 % 5;
                return null;
            } catch (Exception e) {
                L.d("BasicModuleLifeCycle", "onAfterLogin: " + e.getMessage());
                return null;
            }
        }

        private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            notify notifyVar = new notify();
            notifyVar.component3 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            notifyVar.copydefault = 0;
            int i3 = $10 + 31;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (notifyVar.copydefault < cArr.length) {
                int i5 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 3266, KeyEvent.getDeadChar(0, 0) + 33, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 60267), -834797019, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component3 ^ 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(687 - View.MeasureSpec.getSize(0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 35, (char) (60373 - (KeyEvent.getMaxKeyCode() >> 16)), -1969106284, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                    int i6 = $10 + 117;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
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
            int i8 = $11 + 79;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (notifyVar.copydefault < cArr.length) {
                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                try {
                    Object[] objArr4 = {notifyVar, notifyVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - TextUtils.getOffsetBefore("", 0), MotionEvent.axisFromString("") + 35, (char) (View.resolveSize(0, 0) + 60373), -1969106284, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArr2);
        }

        public void component3(Void r3) {
            int i = 2 % 2;
            int i2 = component1 + 33;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:123:0x0855, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:124:0x0856, code lost:
        
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:125:0x085a, code lost:
        
            if (r1 != null) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x085c, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:127:0x085d, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x055f, code lost:
        
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0566, code lost:
        
            if (r0 != null) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0568, code lost:
        
            r0 = (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1342;
            r25 = android.graphics.ImageFormat.getBitsPerPixel(0) + 34;
            r1 = (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 6425);
            r3 = (byte) 1;
            r4 = (byte) (-r3);
            r9 = new java.lang.Object[1];
            b(r3, r4, (byte) (r4 + 1), r9);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r0, r25, r1, 1443979249, false, (java.lang.String) r9[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x059f, code lost:
        
            ((java.lang.reflect.Field) r0).set(null, r14);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x05ac, code lost:
        
            if (r0 != null) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x05ae, code lost:
        
            r9 = 1342 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8);
            r10 = 33 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            r11 = (char) (6425 - android.graphics.Color.alpha(0));
            r0 = (byte) 1;
            r1 = (byte) (-r0);
            r4 = new java.lang.Object[1];
            b(r0, r1, (byte) (r1 + 1), r4);
            r0 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r9, r10, r11, 1443979249, false, (java.lang.String) r4[0], null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x05e9, code lost:
        
            r3 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r0).get(null)};
            r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x05fd, code lost:
        
            if (r4 != null) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x05ff, code lost:
        
            r9 = (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 1341;
            r10 = 32 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0);
            r11 = (char) (android.graphics.Color.red(0) + 6425);
            r0 = (byte) (com.huawei.digitalpayment.consumer.basicUi.init.BasicModuleLifeCycle.AnonymousClass4.$$e & 3);
            r1 = (byte) (r0 << 2);
            r6 = new java.lang.Object[1];
            b(r0, r1, (byte) (r1 - 5), r6);
            r4 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r9, r10, r11, -181198845, false, (java.lang.String) r6[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0640, code lost:
        
            ((java.lang.Long) ((java.lang.reflect.Method) r4).invoke(null, r3)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x064c, code lost:
        
            r0 = com.huawei.digitalpayment.consumer.basicUi.init.BasicModuleLifeCycle.AnonymousClass4.component1 + 51;
            com.huawei.digitalpayment.consumer.basicUi.init.BasicModuleLifeCycle.AnonymousClass4.component2 = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Removed duplicated region for block: B:110:0x082d  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x04a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int component2(java.util.List r31) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2380
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.init.BasicModuleLifeCycle.AnonymousClass4.component2(java.util.List):int");
        }
    }

    @Override
    public void onAfterLogin(Context context, String str, boolean z) {
        int i = 2 % 2;
        ThreadUtils.executeByCached(new AnonymousClass4(this, str));
        int i2 = ShareDataUIState + 85;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onLogout(Context context) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        PinFreeManager.INSTANCE.clean();
        int i4 = copydefault + 69;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public int getPriority() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        copydefault = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    @Override
    public void loginFail(Context context, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }
}
