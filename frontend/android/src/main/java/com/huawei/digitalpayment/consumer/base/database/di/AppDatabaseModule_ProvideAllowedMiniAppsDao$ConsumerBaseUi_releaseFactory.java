package com.huawei.digitalpayment.consumer.base.database.di;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.AllowedMiniAppsDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.cancel;

public final class AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory implements Factory<AllowedMiniAppsDao> {
    private final Provider<AppDatabase> component3;
    private static final byte[] $$c = {86, 117, -27, 75};
    private static final int $$f = 140;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {41, -64, -63, -4, 7, 8, -5, 0, 8, -61, 62, 9, -62, Ascii.CAN, 47, 2, 8, -1, 0, -4, -23, 44, Ascii.SI, 4, Ascii.FF, -18, 4, 4, -2, Ascii.ETB, -6, Ascii.VT};
    private static final int $$e = 75;
    private static final byte[] $$a = {TarHeader.LF_NORMAL, -42, 66, -37, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_LINK, -28, -17, -25, 5, -17, -17, -11, -36, -7, -24, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1};
    private static final int $$b = 180;
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;
    private static char[] component1 = {30676, 30667, 30673, 30663, 30666, 30668, 30603, 30662, 30694, 30524, 30657, 30672, 30664, 30710, 30665, 30678, 30670, 30661, 30695, 30708, 30659, 30689, 30669, 30656, 30671, 30674, 30701};
    private static int component2 = 321288117;
    private static boolean copydefault = true;
    private static boolean ShareDataUIState = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 4
            int r0 = 1 - r8
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.base.database.di.AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory.$$c
            int r7 = r7 * 5
            int r7 = 73 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2f
        L19:
            r3 = r2
        L1a:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2f:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.di.AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory.$$g(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            int r5 = r5 * 16
            int r5 = 99 - r5
            byte[] r0 = com.huawei.digitalpayment.consumer.base.database.di.AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory.$$a
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-16)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.di.AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory.a(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 8
            int r6 = r6 + 11
            int r7 = r7 * 8
            int r7 = 107 - r7
            int r5 = r5 * 18
            int r5 = r5 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.base.database.di.AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r5]
        L28:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-3)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.di.AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory.c(byte, byte, byte, java.lang.Object[]):void");
    }

    @Override
    public Object get() throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 115;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        AllowedMiniAppsDao allowedMiniAppsDao = get();
        int i4 = getRequestBeneficiariesState + 71;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return allowedMiniAppsDao;
    }

    public AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory(Provider<AppDatabase> provider) {
        this.component3 = provider;
    }

    private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        char[] cArr2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component1;
        int i4 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr3[i5]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i4;
                        byte b3 = (byte) (b2 + 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 3760, 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -1670574543, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    int i6 = $10 + 13;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(component2)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 7140, (ViewConfiguration.getTouchSlop() >> 8) + 13, (char) TextUtils.getOffsetAfter("", 0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i8 = 689978476;
        if (ShareDataUIState) {
            int i9 = $11 + 73;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cancelVar.component1 = bArr.length;
                cArr2 = new char[cancelVar.component1];
                i2 = 0;
            } else {
                i2 = 0;
                cancelVar.component1 = bArr.length;
                cArr2 = new char[cancelVar.component1];
            }
            cancelVar.component3 = i2;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr2[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i8);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 2749, ((Process.getThreadPriority(0) + 20) >> 6) + 19, (char) (7644 - Color.argb(0, 0, 0, 0)), -327556343, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i8 = 689978476;
            }
            objArr[0] = new String(cArr2);
            return;
        }
        if (copydefault) {
            int i10 = $11 + 11;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i12 = $10 + 81;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr5[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - TextUtils.getOffsetAfter("", 0), 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (7644 - (ViewConfiguration.getPressedStateDuration() >> 16)), -327556343, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i14 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i14;
            if (cancelVar.component3 >= cancelVar.component1) {
                String str = new String(cArr6);
                int i15 = $11 + 65;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                objArr[0] = str;
                return;
            }
            cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            i14 = cancelVar.component3 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01f7  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.digitalpayment.consumer.base.database.daos.AllowedMiniAppsDao get() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.di.AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory.get():com.huawei.digitalpayment.consumer.base.database.daos.AllowedMiniAppsDao");
    }

    public static AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory create(javax.inject.Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory(Providers.asDaggerProvider(provider));
        int i2 = component4 + 95;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return appDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory;
    }

    public static AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory create(Provider<AppDatabase> provider) {
        int i = 2 % 2;
        AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory appDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory = new AppDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory(provider);
        int i2 = component4 + 25;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
        return appDatabaseModule_ProvideAllowedMiniAppsDao$ConsumerBaseUi_releaseFactory;
    }

    public static AllowedMiniAppsDao provideAllowedMiniAppsDao$ConsumerBaseUi_release(AppDatabase appDatabase) {
        int i = 2 % 2;
        int i2 = component4 + 57;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AllowedMiniAppsDao allowedMiniAppsDao = (AllowedMiniAppsDao) Preconditions.checkNotNullFromProvides(AppDatabaseModule.INSTANCE.provideAllowedMiniAppsDao$ConsumerBaseUi_release(appDatabase));
        int i3 = getRequestBeneficiariesState + 71;
        component4 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 39 / 0;
        }
        return allowedMiniAppsDao;
    }
}
