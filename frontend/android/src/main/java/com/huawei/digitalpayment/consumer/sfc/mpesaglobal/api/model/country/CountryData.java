package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.cancel;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0013H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryData;", "Landroid/os/Parcelable;", "key", "", "value", "additionalInfo", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryDetails;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryDetails;)V", "getKey", "()Ljava/lang/String;", "getValue", "getAdditionalInfo", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/country/CountryDetails;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CountryData> CREATOR;
    private static char[] ShareDataUIState;
    private static char[] component1;
    private static boolean component2;
    private static int component3;
    private static int component4;
    private static boolean copydefault;

    @SerializedName("additionalInfo")
    private final CountryDetails additionalInfo;

    @SerializedName("key")
    private final String key;

    @SerializedName("value")
    private final String value;
    private static final byte[] $$c = {40, 108, -113, 75};
    private static final int $$f = 174;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {119, -27, 13, -93, -12, -1, -9, Ascii.NAK, -1, -1, 5, -20, 9, -8};
    private static final int $$e = 133;
    private static final byte[] $$a = {Ascii.EM, 43, 92, -56, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -40, 39, Ascii.US, 7, 38, 34};
    private static final int $$b = 213;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int copy = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CountryData> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            CountryData countryData = new CountryData(parcel.readString(), parcel.readString(), CountryDetails.CREATOR.createFromParcel(parcel));
            int i2 = ShareDataUIState + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return countryData;
        }

        @Override
        public CountryData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 5;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            CountryData countryDataCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 9;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return countryDataCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CountryData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 95;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            CountryData[] countryDataArr = new CountryData[i];
            int i6 = i3 + 125;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return countryDataArr;
        }

        @Override
        public CountryData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 101;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            CountryData[] countryDataArrNewArray = newArray(i);
            int i5 = component3 + 31;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return countryDataArrNewArray;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r7, byte r8, short r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country.CountryData.$$c
            int r9 = r9 + 68
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country.CountryData.$$g(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country.CountryData.$$a
            int r6 = r6 * 2
            int r6 = 101 - r6
            int r7 = r7 * 4
            int r1 = 10 - r7
            byte[] r1 = new byte[r1]
            int r7 = 9 - r7
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r5]
            int r3 = r3 + 1
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + (-27)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.country.CountryData.a(int, int, byte, java.lang.Object[]):void");
    }

    private static void d(int i, short s, int i2, Object[] objArr) {
        int i3 = 3 - (s * 2);
        byte[] bArr = $$d;
        int i4 = i * 4;
        int i5 = 99 - (i2 * 3);
        byte[] bArr2 = new byte[11 - i4];
        int i6 = 10 - i4;
        int i7 = -1;
        if (bArr == null) {
            i7 = -1;
            i5 = (-i3) + i6;
            i3 = i3;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i5;
            int i9 = i3 + 1;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = i8;
            i5 = (-bArr[i9]) + i5;
            i3 = i9;
        }
    }

    public CountryData(String str, String str2, CountryDetails countryDetails) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(countryDetails, "");
        this.key = str;
        this.value = str2;
        this.additionalInfo = countryDetails;
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 103;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.key;
        int i4 = i3 + 9;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i4 = i3 + 53;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final CountryDetails getAdditionalInfo() {
        int i = 2 % 2;
        int i2 = equals + 31;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        CountryDetails countryDetails = this.additionalInfo;
        int i5 = i3 + 67;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return countryDetails;
        }
        throw null;
    }

    private static void c(int i, int[] iArr, byte[] bArr, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component1;
        long j = 0;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 3760, (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 23, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), -1670574543, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                    f = 0.0f;
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
        try {
            Object[] objArr3 = {Integer.valueOf(component3)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 7140, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            if (copydefault) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    try {
                        Object[] objArr4 = {cancelVar, cancelVar};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 2748, 19 - KeyEvent.getDeadChar(0, 0), (char) (7644 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), -327556343, false, $$g(b4, b5, (byte) (b5 + 5)), new Class[]{Object.class, Object.class});
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
                String str = new String(cArr4);
                int i4 = $10 + 105;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                objArr[0] = str;
                return;
            }
            if (!component2) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i6 = $11 + 37;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i8 = $11 + 79;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                try {
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2747, 19 - KeyEvent.getDeadChar(0, 0), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 7644), -327556343, false, $$g(b6, b7, (byte) (b7 + 5)), new Class[]{Object.class, Object.class});
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
            objArr[0] = new String(cArr6);
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = ShareDataUIState;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 115;
                $11 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(656 - ImageFormat.getBitsPerPixel(0), (Process.myPid() >> 22) + 14, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
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
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 4502, (ViewConfiguration.getPressedStateDuration() >> 16) + 36, (char) (27897 - (ViewConfiguration.getTapTimeout() >> 16)), -1464227204, false, $$g(b2, b3, (byte) (b3 | 42)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3579, 29 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), 1180380354, false, $$g(b4, b5, (byte) (b5 | 47)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1860 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 34 - TextUtils.indexOf("", "", 0, 0), (char) View.resolveSize(0, 0), 80302927, false, $$g(b6, b7, (byte) (b7 | 46)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                int i12 = $10 + 51;
                $11 = i12 % 128;
                int i13 = i12 % 2;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i14 = $11 + 91;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 0, cArr5, 1, i4);
                System.arraycopy(cArr5, 0, cArr3, i4 * i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 + i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i15 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i15, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i15);
            }
        }
        if (z) {
            char[] cArr7 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr7[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i16 = $10 + 125;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v68, types: [char, int] */
    public String toString() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CountryData(key=");
        sb.append(this.key);
        sb.append(", value=");
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-412868303);
        if (objCopydefault == null) {
            int defaultSize = 1115 - View.getDefaultSize(0, 0);
            int iMyTid = 22 - (Process.myTid() >> 22);
            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
            byte b2 = (byte) (-1);
            byte b3 = (byte) (-b2);
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 - 1), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, iMyTid, deadChar, 574488148, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new int[]{0, 22, 155, 9}, false, new byte[]{0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new int[]{22, 15, 16, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-413791824);
        if (objCopydefault2 == null) {
            byte b4 = (byte) ($$a[24] + 1);
            byte b5 = (byte) ($$b & 3);
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 - 1), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1115, 22 - View.getDefaultSize(0, 0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 571463381, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1207399525);
            if (objCopydefault3 == null) {
                int i2 = 1116 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                int keyRepeatDelay = 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                char cAlpha = (char) Color.alpha(0);
                byte b6 = (byte) 0;
                Object[] objArr6 = new Object[1];
                a((byte) ($$b & 59), b6, (byte) (b6 + 1), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i2, keyRepeatDelay, cAlpha, 2102482174, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = (-1237322474) + ((~((~iIdentityHashCode) | (-2621581))) * 433) + (((~((-114785060) | iIdentityHashCode)) | (-78412429)) * (-433)) + (((~(iIdentityHashCode | (-78412429))) | (-117406640)) * 433) + 808225969;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(new int[]{37, 26, 109, 0}, false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new int[]{63, 18, 2, 12}, false, new byte[]{0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i6 = getRequestBeneficiariesState + 11;
                equals = i6 % 128;
                int i7 = i6 % 2;
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            b(new int[]{81, 16, 86, 1}, true, null, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            b(new int[]{97, 16, 0, 0}, false, new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i8 = getRequestBeneficiariesState + 117;
            equals = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 808225969};
                Object[] objArr13 = new Object[1];
                c(127 - KeyEvent.keyCodeFromString(""), null, new byte[]{-96, -121, -117, -106, -125, -121, -97, -127, -118, -115, -119, -123, -115, -111, -112, -105, -114, -121, -111, -109, -119, -115, -98, -99, -104, -104, -100, -104, -101, -102, -121, -117, -106, -125, -121, -114, -104, -115, -103, -111, -119, -119, -109, -127, -105, -115, -127, -121, -115, -111, -126, -107, -127, -108, -105, -104, -110, -111, -126, -115, -119, -114, -116, -111, -118, -105, -119, -114, -106, -121, -110, -126, -113, -125, -126, -107, -124, -115, -127, -121, -115, -111, -126, -127, -124, -118, -122, -124, -118, -122, -127, -108, -110, -124, -109, -119, -125, -122, -110, -111, -126, -127, -124, -115, -111, -119, -125, -112, -121, -113, -114, -121, -115, -118, -116, -118, -117, -124, -118, -119, -120, -121, -122, -123, -124, -125, -126, -127}, null, objArr13);
                Class<?> cls4 = Class.forName(((String) objArr13[0]).intern());
                byte b7 = (byte) ($$d[5] + 1);
                byte b8 = b7;
                Object[] objArr14 = new Object[1];
                d(b7, b8, b8, objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1207399525);
                    if (objCopydefault4 == null) {
                        int absoluteGravity = 1115 - Gravity.getAbsoluteGravity(0, 0);
                        int i10 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 23;
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        byte b9 = (byte) 0;
                        Object[] objArr15 = new Object[1];
                        a((byte) ($$b & 59), b9, (byte) (b9 + 1), objArr15);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, i10, tapTimeout, 2102482174, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        b(new int[]{0, 22, 155, 9}, false, new byte[]{0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0}, objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        b(new int[]{22, 15, 16, 0}, false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-413791824);
                        if (objCopydefault5 == null) {
                            int scrollDefaultDelay = 1115 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int iIndexOf = 21 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 1);
                            byte b10 = (byte) ($$a[24] + 1);
                            byte b11 = (byte) ($$b & 3);
                            Object[] objArr18 = new Object[1];
                            a(b10, b11, (byte) (b11 - 1), objArr18);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, iIndexOf, cLastIndexOf, 571463381, false, (String) objArr18[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-412868303);
                        if (objCopydefault6 == null) {
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1115;
                            int iMyTid2 = (Process.myTid() >> 22) + 22;
                            char size = (char) View.MeasureSpec.getSize(0);
                            byte b12 = (byte) (-1);
                            byte b13 = (byte) (-b12);
                            Object[] objArr19 = new Object[1];
                            a(b12, b13, (byte) (b13 - 1), objArr19);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, iMyTid2, size, 574488148, false, (String) objArr19[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                        int i11 = getRequestBeneficiariesState + 65;
                        equals = i11 % 128;
                        int i12 = i11 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 != i13) {
            long j2 = -1;
            long j3 = ((long) (i13 ^ i14)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 7) << 32) | (j4 - ((j4 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "", 0) + 42, (char) (ViewConfiguration.getEdgeSlop() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr20 = {-1185519198, Long.valueOf(j5), new ArrayList(), null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 6563, Color.red(0) + 56, (char) Color.blue(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr20);
                int i15 = ((int[]) objArr[0])[0];
                Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i16 = i15 + 385672495 + (((~((-168398662) | iMaxMemory)) | 24798826) * (-366)) + (((~(iMaxMemory | (-167872774))) | 24272938) * 366);
                int i17 = (i16 << 13) ^ i16;
                int i18 = i17 ^ (i17 >>> 17);
                ((int[]) objArr21[0])[0] = i18 ^ (i18 << 5);
                throw null;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        int i19 = getRequestBeneficiariesState + 1;
        equals = i19 % 128;
        int i20 = i19 % 2;
        int i21 = ((int[]) objArr[0])[0];
        Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
        int i22 = ~((int) SystemClock.uptimeMillis());
        int i23 = i21 + 115087847 + ((1067225086 | i22) * 184) + (((~(i22 | 1058571614)) | 210504432) * 184);
        int i24 = (i23 << 13) ^ i23;
        int i25 = i24 ^ (i24 >>> 17);
        ((int[]) objArr22[0])[0] = i25 ^ (i25 << 5);
        int i26 = ((int[]) objArr22[0])[0];
        Object[] objArr23 = {new int[1], new int[]{((int[]) objArr22[1])[0]}, new int[]{((int[]) objArr22[2])[0]}, (String[]) objArr22[3]};
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i27 = i26 + (-1415957377) + (((~((-530881) | (~elapsedCpuTime))) | (~(192666607 | elapsedCpuTime))) * (-272)) + (((~((-22584295) | elapsedCpuTime)) | 22053414) * (-272)) + (((~(elapsedCpuTime | 22584294)) | 170613193) * 272);
        int i28 = (i27 << 13) ^ i27;
        int i29 = i28 ^ (i28 >>> 17);
        ((int[]) objArr23[0])[0] = i29 ^ (i29 << 5);
        sb.append(this.value);
        sb.append(", additionalInfo=");
        sb.append(this.additionalInfo);
        int i30 = ((int[]) objArr23[0])[0];
        int i31 = ((i30 * i30) - (~(-(1828540891 * i30)))) - 1;
        int i32 = -(i30 * 66348971);
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        int i34 = (i33 ^ 87014537) + ((87014537 & i33) << 1);
        int i35 = i34 >> 21;
        int i36 = i35 | (-4095);
        int i37 = ((i36 << 1) - (i35 ^ (-4095))) / 2048;
        int i38 = -(((i37 ^ 1) + ((i37 & 1) << 1)) ^ ((i34 - (~((((i35 & (-4095)) + i36) / 2048) - (-1)))) - 1));
        int i39 = ((i38 | 4) << 1) - (i38 ^ 4);
        int i40 = i39 >> 21;
        int i41 = ((i40 & (-4095)) + (i40 | (-4095))) / 2048;
        int i42 = (i41 & 1) + (i41 | 1);
        sb.append((char) (257152 / (((-(((i42 | 1) << 1) - (i42 ^ 1))) & i39) * 1568)));
        return sb.toString();
    }

    static {
        component4 = 0;
        copydefault();
        ShareDataUIState();
        CREATOR = new Creator();
        int i = copy + 107;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public static CountryData copy$default(CountryData countryData, String str, String str2, CountryDetails countryDetails, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = equals + 81;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                String str3 = countryData.key;
                throw null;
            }
            str = countryData.key;
        }
        if ((i & 2) != 0) {
            str2 = countryData.value;
        }
        if ((i & 4) != 0) {
            countryDetails = countryData.additionalInfo;
        }
        CountryData countryDataCopy = countryData.copy(str, str2, countryDetails);
        int i4 = equals + 47;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return countryDataCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 89;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 13;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 111;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.value;
        int i5 = i2 + 107;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
        return str;
    }

    public final CountryDetails component3() {
        int i = 2 % 2;
        int i2 = equals + 5;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        CountryDetails countryDetails = this.additionalInfo;
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
        return countryDetails;
    }

    public final CountryData copy(String key, String value, CountryDetails additionalInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(value, "");
        Intrinsics.checkNotNullParameter(additionalInfo, "");
        CountryData countryData = new CountryData(key, value, additionalInfo);
        int i2 = getRequestBeneficiariesState + 77;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return countryData;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 9;
        equals = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 67;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryData)) {
            int i2 = equals + 91;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CountryData countryData = (CountryData) other;
        if (!Intrinsics.areEqual(this.key, countryData.key)) {
            int i4 = getRequestBeneficiariesState + 51;
            equals = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.value, countryData.value)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.additionalInfo, countryData.additionalInfo))) {
            return true;
        }
        int i5 = getRequestBeneficiariesState + 43;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 47;
        getRequestBeneficiariesState = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (((this.key.hashCode() + 18) << this.value.hashCode()) >>> 41) - this.additionalInfo.hashCode() : (((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + this.additionalInfo.hashCode();
        int i3 = getRequestBeneficiariesState + 55;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 81;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.key);
        dest.writeString(this.value);
        this.additionalInfo.writeToParcel(dest, flags);
        int i4 = getRequestBeneficiariesState + 75;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = equals + 73;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        component1 = new char[]{30602, 30718, 30716, 30655, 30593, 30708, 30600, 30710, 30596, 30592, 30597, 30598, 30709, 30717, 30713, 30704, 30719, 30714, 30715, 30599, 30634, 30603, 30618, 30277, 30626, 30652, 30650, 30648, 30628, 30705, 30621, 30645};
        component3 = 321287785;
        component2 = true;
        copydefault = true;
        int i5 = i3 + 103;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static void copydefault() {
        ShareDataUIState = new char[]{33368, 33745, 33752, 33755, 33324, 33325, 33751, 33755, 33757, 33758, 33757, 33755, 33753, 33748, 33752, 33758, 33339, 33334, 33747, 33332, 33284, 33758, 33509, 33447, 33449, 33447, 33374, 33443, 33451, 33460, 33460, 33452, 33449, 33375, 33441, 33444, 33446, 33464, 33291, 33289, 33287, 33282, 33286, 33292, 33385, 33387, 33290, 33282, 33379, 33403, 33376, 33287, 33284, 33283, 33283, 33284, 33340, 33292, 33300, 33285, 33287, 33295, 33296, 33508, 33411, 33413, 33453, 33455, 33459, 33463, 33467, 33459, 33455, 33457, 33455, 33461, 33457, 33450, 33451, 33458, 33460, 33311, 33308, 33380, 33301, 33302, 33296, 33398, 33371, 33378, 33307, 33384, 33309, 33371, 33384, 33299, 33384, 33515, 33465, 33467, 33462, 33454, 33457, 33457, 33449, 33471, 33419, 33461, 33458, 33418, 33414, 33462, 33467};
    }
}
