package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.work.WorkerParameters;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.base.util.PhoneDataSender;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;

public final class MtandaoWorker_Factory {
    private static char ShareDataUIState;
    private static char component2;
    private static char[] component4;
    private static char equals;
    private static char getRequestBeneficiariesState;
    private static int getSponsorBeneficiariesState;
    private final Provider<PhoneDataSender> component1;
    private final Provider<ConnectionLiveData> component3;
    private final Provider<MtandaoCore> copydefault;
    private static final byte[] $$c = {87, -2, Ascii.VT, -41};
    private static final int $$f = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {111, -17, Ascii.VT, -125, -39, -25, -30, -26, -26, -18, -36, -33, 40};
    private static final int $$e = 249;
    private static final byte[] $$a = {113, 66, TarHeader.LF_CHR, 67, Ascii.GS, Ascii.DC2, Ascii.SUB, -4, Ascii.DC2, Ascii.DC2, Ascii.FF, 37, 8, Ascii.EM, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50};
    private static final int $$b = 148;
    private static int ArtificialStackFrames = 0;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r6, short r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker_Factory.$$c
            int r8 = r8 + 110
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2b:
            int r4 = -r4
            int r7 = r7 + 1
            int r8 = r8 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker_Factory.$$g(short, short, byte):java.lang.String");
    }

    private static void a(short s, byte b2, short s2, Object[] objArr) {
        int i = (b2 * Ascii.DLE) + 83;
        byte[] bArr = $$a;
        int i2 = 28 - (s2 * 5);
        byte[] bArr2 = new byte[s + 10];
        int i3 = s + 9;
        int i4 = -1;
        if (bArr == null) {
            i = (i3 + i2) - 17;
            i2 = i2;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            int i6 = i2 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i = (i + bArr[i6]) - 17;
                i2 = i6;
                i4 = i5;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 99 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker_Factory.$$d
            int r8 = r8 * 3
            int r8 = 10 - r8
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2c:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-27)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker_Factory.d(byte, byte, int, java.lang.Object[]):void");
    }

    public MtandaoWorker_Factory(Provider<PhoneDataSender> provider, Provider<ConnectionLiveData> provider2, Provider<MtandaoCore> provider3) {
        this.component1 = provider;
        this.component3 = provider2;
        this.copydefault = provider3;
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i5 = $11 + 123;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3 << 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                i2 = i4;
            }
            int i6 = $11 + 7;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            while (i2 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[i4];
                int i9 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) equals) ^ 4374495167426960553L)));
                int i10 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getRequestBeneficiariesState);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 844;
                        int keyRepeatDelay = 32 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        char c4 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23250);
                        byte b2 = (byte) i4;
                        byte b3 = b2;
                        String str$$g = $$g(b2, b3, (byte) (b3 + 1));
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(pressedStateDuration, keyRepeatDelay, c4, 592652048, false, str$$g, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 844, 32 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 23251), 592652048, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    cArr3 = cArr4;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 466, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 50, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        byte b2 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = component4;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 69;
                $10 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(656 - Process.getGidForName(""), KeyEvent.keyCodeFromString("") + 14, (char) (65118 - KeyEvent.keyCodeFromString("")), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i10 = $10 + 29;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i12 = $11 + 63;
                $10 = i12 % 128;
                if (i12 % 2 == 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != b2 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 0) {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    try {
                        Object[] objArr3 = new Object[2];
                        objArr3[b2] = Integer.valueOf(c2);
                        objArr3[0] = Integer.valueOf(c3);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3580 - Color.alpha(0), KeyEvent.normalizeMetaState(0) + 28, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + b2), 1180380354, false, $$g(b3, b4, (byte) (b4 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    char c4 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr4 = new Object[2];
                    objArr4[b2] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c4);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        int i15 = 4503 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36;
                        char c5 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27897);
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        String str$$g = $$g(b5, b6, b6);
                        Class[] clsArr = new Class[2];
                        clsArr[0] = Integer.TYPE;
                        clsArr[b2] = Integer.TYPE;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i15, maximumFlingVelocity, c5, -1464227204, false, str$$g, clsArr);
                    }
                    cArr4[i14] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1859 - View.resolveSize(0, 0), 34 - TextUtils.indexOf("", "", 0, 0), (char) ExpandableListView.getPackedPositionType(0L), 80302927, false, $$g(b7, b7, (byte) $$c.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                b2 = 1;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i16, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            int i17 = $10 + 61;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        String str = new String(cArr3);
        int i19 = $11 + 81;
        $10 = i19 % 128;
        int i20 = i19 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker get(android.content.Context r30, androidx.work.WorkerParameters r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker_Factory.get(android.content.Context, androidx.work.WorkerParameters):com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker");
    }

    public static MtandaoWorker_Factory create(javax.inject.Provider<PhoneDataSender> provider, javax.inject.Provider<ConnectionLiveData> provider2, javax.inject.Provider<MtandaoCore> provider3) {
        int i = 2 % 2;
        MtandaoWorker_Factory mtandaoWorker_Factory = new MtandaoWorker_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
        int i2 = copy + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return mtandaoWorker_Factory;
    }

    public static MtandaoWorker_Factory create(Provider<PhoneDataSender> provider, Provider<ConnectionLiveData> provider2, Provider<MtandaoCore> provider3) {
        int i = 2 % 2;
        MtandaoWorker_Factory mtandaoWorker_Factory = new MtandaoWorker_Factory(provider, provider2, provider3);
        int i2 = copy + 47;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
        return mtandaoWorker_Factory;
    }

    public static MtandaoWorker newInstance(Context context, WorkerParameters workerParameters, PhoneDataSender phoneDataSender, ConnectionLiveData connectionLiveData, MtandaoCore mtandaoCore) {
        int i = 2 % 2;
        MtandaoWorker mtandaoWorker = new MtandaoWorker(context, workerParameters, phoneDataSender, connectionLiveData, mtandaoCore);
        int i2 = copy + 111;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return mtandaoWorker;
    }

    static {
        getSponsorBeneficiariesState = 1;
        component1();
        ShareDataUIState = (char) 58069;
        component2 = (char) 46800;
        equals = (char) 57204;
        getRequestBeneficiariesState = (char) 34129;
        int i = ArtificialStackFrames + 85;
        getSponsorBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component4 = new char[]{33510, 33460, 33462, 33464, 33465, 33464, 33462, 33458, 33416, 33415, 33462, 33459, 33452, 33449, 33465, 33439, 33423, 33454, 33425, 33430, 33465, 33459, 33358, 33787, 33731, 33731, 33786, 33778, 33773, 33782, 33784, 33782, 33785, 33781, 33779, 33776, 33774, 33359, 33731, 33789, 33789, 33313, 33755, 33730, 33729, 33790, 33758, 33320, 33730, 33778, 33781, 33788, 33791, 33517, 33467, 33462, 33414, 33418, 33458, 33461, 33419, 33471, 33449, 33457, 33457, 33454, 33462, 33467, 33465};
    }
}
