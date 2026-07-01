package com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/network/model/ExtResponse;", "", KeysConstants.KEY_SUPPORT_OTP, "", KeysConstants.KEY_SUPPORT_FINGERPRINT, KeysConstants.KEY_SUPPORT_FACE, KeysConstants.KEY_SUPPORT_PIN, KeysConstants.KEY_OTP_TYPE, KeysConstants.KEY_SUPPORT_FORGET_PIN, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSupportOtp", "()Ljava/lang/String;", "setSupportOtp", "(Ljava/lang/String;)V", "getSupportFingerprint", "setSupportFingerprint", "getSupportFace", "setSupportFace", "getSupportPin", "setSupportPin", "getOtpType", "setOtpType", "getSupportForgetPin", "setSupportForgetPin", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtResponse {
    private String ShareDataUIState;
    private String component1;
    private String component2;
    private String component3;
    private String copy;
    private String copydefault;
    private static final byte[] $$c = {46, -95, Ascii.VT, -87};
    private static final int $$d = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {4, 8, -22, -73, -38, -24, -29, -25, -25, -17, -35, -32, 39};
    private static final int $$b = 232;
    private static int getSponsorBeneficiariesState = 0;
    private static int ArtificialStackFrames = 1;
    private static char[] equals = {30691, 30678, 30684, 30674, 30673, 30683, 30614, 30669, 30701, 30667, 30668, 30687, 30679, 30717, 30676, 30685, 30677, 30672, 30706, 30682, 30670, 30681, 30712, 30680};
    private static int component4 = 321287744;
    private static boolean getRequestBeneficiariesState = true;
    private static boolean getAsAtTimestamp = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r7, byte r8, int r9) {
        /*
            int r9 = r9 * 5
            int r9 = r9 + 68
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.model.ExtResponse.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r8 = r8 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.model.ExtResponse.$$e(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 10
            int r5 = r5 * 3
            int r5 = 99 - r5
            byte[] r1 = com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.model.ExtResponse.$$a
            int r7 = r7 * 4
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r7 = r7 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-26)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.login.data.source.network.model.ExtResponse.b(short, short, short, java.lang.Object[]):void");
    }

    public ExtResponse(String str, String str2, String str3, String str4, String str5, String str6) {
        this.component3 = str;
        this.ShareDataUIState = str2;
        this.component2 = str3;
        this.copy = str4;
        this.component1 = str5;
        this.copydefault = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtResponse(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8 = null;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = null;
        }
        String str9 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i3 = getSponsorBeneficiariesState;
            int i4 = i3 + 31;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 79;
            ArtificialStackFrames = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 4;
            } else {
                int i8 = 2 % 2;
            }
            str7 = null;
        } else {
            str7 = str3;
        }
        String str10 = (i & 8) != 0 ? null : str4;
        String str11 = (i & 16) != 0 ? null : str5;
        if ((i & 32) != 0) {
            int i9 = ArtificialStackFrames;
            int i10 = i9 + 79;
            getSponsorBeneficiariesState = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 61;
            getSponsorBeneficiariesState = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } else {
            str8 = str6;
        }
        this(str, str9, str7, str10, str11, str8);
    }

    public final String getSupportOtp() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 125;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 93;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public final void setSupportOtp(String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 117;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        this.component3 = str;
        int i5 = i3 + 45;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getSupportFingerprint() {
        String str;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 85;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            str = this.ShareDataUIState;
            int i4 = 34 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i3 + 79;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSupportFingerprint(String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 23;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState = str;
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
    }

    public final String getSupportFace() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 35;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 123;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setSupportFace(String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 119;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        this.component2 = str;
        int i5 = i2 + 37;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getSupportPin() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 3;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 89;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSupportPin(String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 85;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        this.copy = str;
        if (i4 == 0) {
            int i5 = 51 / 0;
        }
        int i6 = i3 + 109;
        getSponsorBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getOtpType() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 61;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 89;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setOtpType(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 59;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        this.component1 = str;
        int i5 = i2 + 31;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getSupportForgetPin() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 113;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 61;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setSupportForgetPin(String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 91;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        this.copydefault = str;
        int i5 = i2 + 79;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = equals;
        float f = 0.0f;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 27;
                $11 = i6 % 128;
                if (i6 % i2 == 0) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i4] = Integer.valueOf(cArr2[i5]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(i4, f, f) > f ? 1 : (TypedValue.complexToFraction(i4, f, f) == f ? 0 : -1)) + 3760, 25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) TextUtils.getOffsetBefore("", i4), -1670574543, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3760 - TextUtils.getTrimmedLength(""), 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) KeyEvent.keyCodeFromString(""), -1670574543, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                f = 0.0f;
                i4 = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(component4)};
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 7092, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12, (char) (Process.getGidForName("") + 1), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
        if (getAsAtTimestamp) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i7 = $11 + 83;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 2748, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18, (char) (7644 - ((Process.getThreadPriority(0) + 20) >> 6)), -327556343, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!getRequestBeneficiariesState) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $11 + 5;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        int i11 = $11 + 39;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        while (cancelVar.component3 < cancelVar.component1) {
            int i13 = $11 + 21;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 >>> 1) >>> cancelVar.component3] / i] / iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2748 - KeyEvent.keyCodeFromString(""), 19 - View.MeasureSpec.getSize(0), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 7644), -327556343, false, $$e(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            } else {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr7 = {cancelVar, cancelVar};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault6 == null) {
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2748, 18 - ImageFormat.getBitsPerPixel(0), (char) (KeyEvent.getDeadChar(0, 0) + 7644), -327556343, false, $$e(b10, b11, (byte) (b11 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr6);
    }

    public String toString() throws Throwable {
        int i;
        int i2;
        long j;
        int i3 = 2 % 2;
        String str = this.component3;
        String str2 = this.ShareDataUIState;
        String str3 = this.component2;
        String str4 = this.copy;
        String str5 = this.component1;
        String str6 = this.copydefault;
        StringBuilder sb = new StringBuilder("ExtResponse(supportOtp=");
        sb.append(str);
        sb.append(", supportFingerprint=");
        sb.append(str2);
        sb.append(", supportFace=");
        sb.append(str3);
        sb.append(", supportPin=");
        sb.append(str4);
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 67, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33, (char) (19696 - TextUtils.indexOf("", "")), 520092524, false, "component2", null);
        }
        int i4 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a(null, 126 - TextUtils.indexOf((CharSequence) "", '0'), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a(null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, null, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = -167;
        long j3 = -1;
        long j4 = j3 ^ 3111513245218655377L;
        long j5 = (int) Runtime.getRuntime().totalMemory();
        long j6 = (j2 * 1344209851387854948L) + (j2 * 3111513245218655377L) + (((long) 336) * ((((j3 ^ 1344209851387854948L) | j4) ^ j3) | ((j4 | j5) ^ j3))) + (((long) (-168)) * ((4300893663668456693L ^ j3) | ((j5 | 1344209851387854948L) ^ j3))) + (((long) 168) * (j4 | (((j5 ^ j3) | 1344209851387854948L) ^ j3)));
        int i5 = 0;
        while (true) {
            if (i5 == 10) {
                Object[] objArr3 = new Object[1];
                a(null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, new byte[]{-115, -116, -117, -120, -118, -119, -121, -106, -126, -127, -113, -121, -127, -107, -127, -108}, null, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(null, 127 - Color.blue(0), new byte[]{-116, -125, -123, -114, -104, -120, -127, -105, -118, -117, -122, -117, -126, -116, -125, -122}, null, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {2103632211};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1663 - View.MeasureSpec.makeMeasureSpec(0, 0), ExpandableListView.getPackedPositionType(0L) + 10, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1725502044, ((Constructor) objCopydefault2).newInstance(objArr5), false};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault3 == null) {
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1454;
                        int trimmedLength = 22 - TextUtils.getTrimmedLength("");
                        char mode = (char) View.MeasureSpec.getMode(0);
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        b(b2, b3, b3, objArr7);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, trimmedLength, mode, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1639 - AndroidCharacter.getMirror('0'), 39 - View.resolveSize(0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault3).invoke(null, objArr6);
                    int i6 = ((int[]) objArr8[2])[0];
                    int i7 = ((int[]) objArr8[1])[0];
                    if (i7 != i6) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            int i8 = getSponsorBeneficiariesState + 115;
                            ArtificialStackFrames = i8 % 128;
                            for (int i9 = i8 % 2 == 0 ? 1 : 0; i9 < strArr.length; i9++) {
                                arrayList.add(strArr[i9]);
                            }
                        }
                        long j7 = -1;
                        long j8 = ((long) (i7 ^ i6)) & ((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32)));
                        long j9 = 0;
                        long j10 = j8 | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault4 == null) {
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 6618, 42 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault4).invoke(null, null);
                        Object[] objArr9 = {2103632211, Long.valueOf(j10), arrayList, null, false, false};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 6563, 56 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault5).invoke(objInvoke, objArr9);
                        throw null;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                int i10 = getSponsorBeneficiariesState + 21;
                ArtificialStackFrames = i10 % 128;
                if (i10 % 2 == 0) {
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                    if (objCopydefault6 == null) {
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 37, 29 - TextUtils.lastIndexOf("", '0'), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 846241313, false, "copydefault", null);
                    }
                    i = ((Field) objCopydefault6).getInt(null);
                    j = jLongValue;
                    i2 = 1;
                } else {
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                    if (objCopydefault7 == null) {
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(36 - TextUtils.lastIndexOf("", '0', 0), (KeyEvent.getMaxKeyCode() >> 16) + 30, (char) KeyEvent.normalizeMetaState(0), 846241313, false, "copydefault", null);
                    }
                    i = ((Field) objCopydefault7).getInt(null);
                    i2 = 0;
                    j = jLongValue;
                }
                while (true) {
                    for (int i11 = 0; i11 != 8; i11++) {
                        i = (((((int) (j >> i11)) & 255) + (i << 6)) + (i << 16)) - i;
                    }
                    if (i2 != 0) {
                        break;
                    }
                    int i12 = ArtificialStackFrames + 111;
                    getSponsorBeneficiariesState = i12 % 128;
                    i2 = i12 % 2 != 0 ? i2 + 22 : i2 + 1;
                    j = j6;
                }
                if (i == i4) {
                    break;
                }
                int i13 = getSponsorBeneficiariesState + 117;
                ArtificialStackFrames = i13 % 128;
                if (i13 % 2 == 0) {
                    jLongValue -= 1024;
                    i5 += 62;
                } else {
                    jLongValue -= 1024;
                    i5++;
                }
            }
        }
        sb.append(", otpType=");
        sb.append(str5);
        sb.append(", supportForgetPin=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public ExtResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static ExtResponse copy$default(ExtResponse extResponse, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = extResponse.component3;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            int i3 = ArtificialStackFrames + 115;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            str2 = extResponse.ShareDataUIState;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            int i5 = getSponsorBeneficiariesState + 105;
            ArtificialStackFrames = i5 % 128;
            int i6 = i5 % 2;
            str3 = extResponse.component2;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = extResponse.copy;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            int i7 = getSponsorBeneficiariesState + 49;
            ArtificialStackFrames = i7 % 128;
            if (i7 % 2 == 0) {
                String str11 = extResponse.component1;
                throw null;
            }
            str5 = extResponse.component1;
        }
        String str12 = str5;
        if ((i & 32) != 0) {
            int i8 = getSponsorBeneficiariesState + 125;
            ArtificialStackFrames = i8 % 128;
            int i9 = i8 % 2;
            str6 = extResponse.copydefault;
        }
        return extResponse.copy(str7, str8, str9, str10, str12, str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 87;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 91;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 7;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 101;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 5;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 101;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 13;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 45;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ExtResponse copy(String supportOtp, String supportFingerprint, String supportFace, String supportPin, String otpType, String supportForgetPin) {
        int i = 2 % 2;
        ExtResponse extResponse = new ExtResponse(supportOtp, supportFingerprint, supportFace, supportPin, otpType, supportForgetPin);
        int i2 = getSponsorBeneficiariesState + 53;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        return extResponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtResponse)) {
            return false;
        }
        ExtResponse extResponse = (ExtResponse) other;
        if (!Intrinsics.areEqual(this.component3, extResponse.component3) || !Intrinsics.areEqual(this.ShareDataUIState, extResponse.ShareDataUIState) || !Intrinsics.areEqual(this.component2, extResponse.component2) || (!Intrinsics.areEqual(this.copy, extResponse.copy))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, extResponse.component1)) {
            int i2 = getSponsorBeneficiariesState + 31;
            ArtificialStackFrames = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.copydefault, extResponse.copydefault)) {
            return false;
        }
        int i3 = getSponsorBeneficiariesState + 23;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 37;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        if (str == null) {
            int i5 = i3 + 25;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.ShareDataUIState;
        int iHashCode3 = 1;
        if (str2 == null) {
            int i7 = getSponsorBeneficiariesState + 21;
            ArtificialStackFrames = i7 % 128;
            iHashCode2 = i7 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.component2;
        if (str3 == null) {
            int i8 = ArtificialStackFrames + 93;
            getSponsorBeneficiariesState = i8 % 128;
            if (i8 % 2 == 0) {
                iHashCode3 = 0;
            }
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.copy;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.component1;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }
}
