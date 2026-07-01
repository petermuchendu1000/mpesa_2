package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;

public final class DeviceDataUsageViewModel_HiltModules {
    private DeviceDataUsageViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(DeviceDataUsageViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(DeviceDataUsageViewModel deviceDataUsageViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static final byte[] $$c = {77, -67, -125, 9};
        private static final int $$f = 49;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {TarHeader.LF_CHR, -39, 98, -44, -39, -25, -30, -26, -26, -18, -36, -33, 39, -39, -28, -36};
        private static final int $$e = 190;
        private static final byte[] $$a = {120, Ascii.VT, 65, 93, 2, -10, 10};
        private static final int $$b = 219;
        private static int ShareDataUIState = 0;
        private static int copy = 1;
        private static char component2 = 11912;
        private static char copydefault = 26116;
        private static char component3 = 63982;
        private static char component1 = 45620;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(int r7, int r8, byte r9) {
            /*
                int r8 = r8 * 3
                int r8 = r8 + 111
                int r7 = r7 * 2
                int r7 = r7 + 1
                int r9 = r9 + 4
                byte[] r0 = com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.DeviceDataUsageViewModel_HiltModules.KeyModule.$$c
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r9
                r4 = r2
                goto L2a
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L22
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L22:
                int r9 = r9 + 1
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2a:
                int r8 = -r8
                int r8 = r8 + r9
                r9 = r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.DeviceDataUsageViewModel_HiltModules.KeyModule.$$g(int, int, byte):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 4
                int r5 = 4 - r5
                int r7 = r7 * 2
                int r7 = r7 + 111
                byte[] r0 = com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.DeviceDataUsageViewModel_HiltModules.KeyModule.$$a
                int r6 = r6 * 4
                int r1 = r6 + 4
                byte[] r1 = new byte[r1]
                int r6 = r6 + 3
                r2 = 0
                if (r0 != 0) goto L18
                r4 = r6
                r3 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r0[r5]
            L2a:
                int r7 = r7 + r4
                int r7 = r7 + (-1)
                int r5 = r5 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.DeviceDataUsageViewModel_HiltModules.KeyModule.a(int, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = 100 - r8
                byte[] r0 = com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.DeviceDataUsageViewModel_HiltModules.KeyModule.$$d
                int r7 = r7 * 3
                int r1 = r7 + 1
                int r6 = r6 * 9
                int r6 = 12 - r6
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r8
                r3 = r2
                r8 = r6
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r6 = r6 + 1
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                int r3 = r3 + 1
                r4 = r0[r6]
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
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.DeviceDataUsageViewModel_HiltModules.KeyModule.b(byte, byte, byte, java.lang.Object[]):void");
        }

        private KeyModule() {
        }

        private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
            char[] cArr2 = new char[cArr.length];
            int i5 = 0;
            iNotificationSideChannelDefault.component3 = 0;
            char[] cArr3 = new char[2];
            int i6 = $10 + 7;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            while (iNotificationSideChannelDefault.component3 < cArr.length) {
                int i8 = $10 + 95;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                cArr3[i5] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                int i10 = 58224;
                int i11 = i5;
                while (i11 < 16) {
                    int i12 = $10 + 43;
                    $11 = i12 % 128;
                    int i13 = i12 % i3;
                    char c2 = cArr3[1];
                    char c3 = cArr3[i5];
                    int i14 = (c3 + i10) ^ ((c3 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)));
                    int i15 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(component1);
                        objArr2[i3] = Integer.valueOf(i15);
                        objArr2[1] = Integer.valueOf(i14);
                        objArr2[i5] = Integer.valueOf(c2);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                        if (objCopydefault == null) {
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(i5) + 844;
                            int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 33;
                            char scrollBarSize = (char) (23251 - (ViewConfiguration.getScrollBarSize() >> 8));
                            byte b2 = (byte) i5;
                            byte b3 = b2;
                            String str$$g = $$g(b2, b3, (byte) (b3 - 1));
                            Class[] clsArr = new Class[4];
                            clsArr[i5] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, modifierMetaStateMask, scrollBarSize, 592652048, false, str$$g, clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 844, KeyEvent.keyCodeFromString("") + 32, (char) (ExpandableListView.getPackedPositionChild(0L) + 23252), 592652048, false, $$g(b4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i10 -= 40503;
                        i11++;
                        cArr3 = cArr4;
                        i3 = 2;
                        i5 = 0;
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
                    i2 = 2;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 49 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
                } else {
                    i2 = 2;
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i3 = i2;
                cArr3 = cArr5;
                i5 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        @Provides
        @LazyClassKey(DeviceDataUsageViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 51;
            copy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 111;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:127:0x07bb  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0591 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x047e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int component3(java.util.List r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2298
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.DeviceDataUsageViewModel_HiltModules.KeyModule.component3(java.util.List):int");
        }
    }
}
