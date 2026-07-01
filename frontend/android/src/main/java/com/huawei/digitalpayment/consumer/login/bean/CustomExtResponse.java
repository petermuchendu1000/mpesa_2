package com.huawei.digitalpayment.consumer.login.bean;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.constants.Keys;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010+\u001a\u00020,H×\u0001J\t\u0010-\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006."}, d2 = {"Lcom/huawei/digitalpayment/consumer/login/bean/CustomExtResponse;", "", KeysConstants.KEY_SUPPORT_OTP, "", KeysConstants.KEY_SUPPORT_FINGERPRINT, KeysConstants.KEY_SUPPORT_FACE, KeysConstants.KEY_SUPPORT_PIN, KeysConstants.KEY_OTP_TYPE, KeysConstants.KEY_SUPPORT_FORGET_PIN, Keys.KEY_HEADER_URL, "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSupportOtp", "()Ljava/lang/String;", "setSupportOtp", "(Ljava/lang/String;)V", "getSupportFingerprint", "setSupportFingerprint", "getSupportFace", "setSupportFace", "getSupportPin", "setSupportPin", "getOtpType", "setOtpType", "getSupportForgetPin", "setSupportForgetPin", "getAvatarUrl", "setAvatarUrl", "getName", "setName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerLoginUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CustomExtResponse {
    public static final int $stable = 8;
    private static long ShareDataUIState;
    private static int component1;
    private String avatarUrl;
    private String name;
    private String otpType;
    private String supportFace;
    private String supportFingerprint;
    private String supportForgetPin;
    private String supportOtp;
    private String supportPin;
    private static final byte[] $$c = {2, 105, -126, -86};
    private static final int $$f = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {89, 120, -98, -110, 17, 3, -58, 63, Ascii.DC2, -15, Ascii.ESC, -13, 9, -54, 63, 10, Ascii.VT, -64, 58, 17, 3, 5, 7, 4, -59, 39, 39, -8, 3, 17, 4, -5, 10, Ascii.DLE, -6, Ascii.VT, 4, 10, Ascii.SUB, -2, Ascii.SYN, -8, -28, 34, Ascii.CAN, -14, -7, -7, Ascii.SI, 38, -14, Ascii.CAN, -10};
    private static final int $$e = 42;
    private static final byte[] $$a = {5, -4, -80, 1, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK};
    private static final int $$b = 74;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r6, int r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 * 3
            int r7 = 105 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.login.bean.CustomExtResponse.$$c
            int r8 = r8 * 3
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L30
        L18:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L29:
            int r7 = r7 + 1
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L30:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.bean.CustomExtResponse.$$g(byte, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 6
            int r0 = r7 + 10
            int r6 = r6 * 16
            int r6 = 99 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.login.bean.CustomExtResponse.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 9
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r8 = r8 + 1
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-17)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.bean.CustomExtResponse.a(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 34
            int r5 = 37 - r5
            byte[] r0 = com.huawei.digitalpayment.consumer.login.bean.CustomExtResponse.$$d
            int r6 = r6 * 19
            int r1 = 35 - r6
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r1 = new byte[r1]
            int r6 = 34 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2d
        L19:
            r3 = r2
        L1a:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2d:
            int r7 = r7 + r4
            int r7 = r7 + (-5)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.login.bean.CustomExtResponse.c(byte, int, short, java.lang.Object[]):void");
    }

    public CustomExtResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.supportOtp = str;
        this.supportFingerprint = str2;
        this.supportFace = str3;
        this.supportPin = str4;
        this.otpType = str5;
        this.supportForgetPin = str6;
        this.avatarUrl = str7;
        this.name = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomExtResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13 = (i & 1) != 0 ? null : str;
        String str14 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i2 = component3;
            int i3 = i2 + 43;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 66 / 0;
            }
            int i5 = i2 + 71;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str9 = null;
        } else {
            str9 = str3;
        }
        if ((i & 8) != 0) {
            int i8 = component3 + 103;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str10 = null;
        } else {
            str10 = str4;
        }
        String str15 = (i & 16) != 0 ? null : str5;
        if ((i & 32) != 0) {
            int i10 = component3 + 79;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            str11 = null;
        } else {
            str11 = str6;
        }
        if ((i & 64) != 0) {
            int i13 = 2 % 2;
            str12 = null;
        } else {
            str12 = str7;
        }
        this(str13, str14, str9, str10, str15, str11, str12, (i & 128) == 0 ? str8 : null);
    }

    public final String getSupportOtp() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 33;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.supportOtp;
        int i4 = i2 + 33;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setSupportOtp(String str) {
        int i = 2 % 2;
        int i2 = component2 + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.supportOtp = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSupportFingerprint() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.supportFingerprint;
        int i4 = i3 + 13;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setSupportFingerprint(String str) {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.supportFingerprint = str;
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
    }

    public final String getSupportFace() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.supportFace;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSupportFace(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.supportFace = str;
        int i5 = i2 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getSupportPin() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.supportPin;
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return str;
    }

    public final void setSupportPin(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.supportPin = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 59;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
    }

    public final String getOtpType() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.otpType;
        int i5 = i3 + 45;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setOtpType(String str) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.otpType = str;
        int i5 = i3 + 19;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String getSupportForgetPin() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.supportForgetPin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSupportForgetPin(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.supportForgetPin = str;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 87;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 52 / 0;
        }
    }

    public final String getAvatarUrl() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.avatarUrl;
        int i5 = i3 + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setAvatarUrl(String str) {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.avatarUrl = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 57;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setName(String str) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.name = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $11 + 85;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) ($$f - 2);
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3267 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 33 - TextUtils.getCapsMode("", 0, 0), (char) (Color.red(0) + 60268), -834797019, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (ShareDataUIState ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    int i6 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 687;
                    int capsMode = 34 - TextUtils.getCapsMode("", 0, 0);
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 60373);
                    byte b4 = (byte) ($$f - 2);
                    byte b5 = b4;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i6, capsMode, cIndexOf, -1969106284, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
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
        int i7 = $11 + 79;
        $10 = i7 % 128;
        int i8 = i7 % 2;
        while (notifyVar.copydefault < cArr.length) {
            int i9 = $10 + 87;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                int defaultSize = 687 - View.getDefaultSize(0, 0);
                int scrollBarSize = 34 - (ViewConfiguration.getScrollBarSize() >> 8);
                char c2 = (char) (60373 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                byte b6 = (byte) ($$f - 2);
                byte b7 = b6;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, scrollBarSize, c2, -1969106284, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    public final String component7() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = this.avatarUrl;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
        if (objCopydefault == null) {
            int iCombineMeasuredStates = 2026 - View.combineMeasuredStates(0, 0);
            int i2 = 23 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            char deadChar = (char) (6164 - KeyEvent.getDeadChar(0, 0));
            byte b2 = $$a[3];
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (-b3), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, i2, deadChar, 163751008, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(43480 - TextUtils.lastIndexOf("", '0'), new char[]{22800, 61638, 2727, 42120, 65146, 2085, 41475, 64944, 6102, 41379, 64293, 5489, 44836, 63751, 4315, 43683, 50316, 7771, 43103, 49669, 7654, 47063}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(22901 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{22804, GMTDateParser.HOURS, 60410, 21854, 15574, 58973, 16811, 11024, 37564, 31757, 10127, 33026, 26724, 54253, 48498}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
        if (objCopydefault2 == null) {
            int iNormalizeMetaState = 2026 - KeyEvent.normalizeMetaState(0);
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 23;
            char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 6164);
            byte b4 = (byte) ($$a[3] - 1);
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 | Ascii.SO), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, iResolveOpacity, touchSlop, 381780032, false, (String) objArr5[0], null);
        }
        if (j != ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object[] objArr6 = new Object[1];
            b(54833 - (ViewConfiguration.getPressedStateDuration() >> 16), new char[]{22811, 36641, 62821, 56195, 411, 30696, 23606, 33352, 59550, 57062, 1224, 27923, 21326, 47480, 61370, 54723}, objArr6);
            Class<?> cls2 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            b(35527 - TextUtils.indexOf("", ""), new char[]{22808, 54226, 19610, 63818, 29209, 60667, 6575, 37497, 3841, 47599, 12996, 44948, 55398, 21765, 53239, 30909}, objArr7);
            try {
                Object[] objArr8 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr7[0], Object.class).invoke(null, this)).intValue()), 0, -2115658687};
                byte b6 = (byte) 1;
                byte b7 = (byte) (b6 - 1);
                Object[] objArr9 = new Object[1];
                c(b6, b7, b7, objArr9);
                Class<?> cls3 = Class.forName((String) objArr9[0]);
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 + 1);
                Object[] objArr10 = new Object[1];
                c(b8, b9, b9, objArr10);
                objArr = (Object[]) cls3.getMethod((String) objArr10[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
                if (objCopydefault3 == null) {
                    int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 2027;
                    int offsetBefore = 23 - TextUtils.getOffsetBefore("", 0);
                    char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 6164);
                    byte[] bArr = $$a;
                    byte b10 = (byte) (bArr[3] - 1);
                    Object[] objArr11 = new Object[1];
                    a(b10, b10, (byte) (-bArr[26]), objArr11);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, offsetBefore, cIndexOf, 385853891, false, (String) objArr11[0], null);
                }
                ((Field) objCopydefault3).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    b(43481 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), new char[]{22800, 61638, 2727, 42120, 65146, 2085, 41475, 64944, 6102, 41379, 64293, 5489, 44836, 63751, 4315, 43683, 50316, 7771, 43103, 49669, 7654, 47063}, objArr12);
                    Class<?> cls4 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b(22901 - TextUtils.getCapsMode("", 0, 0), new char[]{22804, GMTDateParser.HOURS, 60410, 21854, 15574, 58973, 16811, 11024, 37564, 31757, 10127, 33026, 26724, 54253, 48498}, objArr13);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
                    if (objCopydefault4 == null) {
                        int i3 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2025;
                        int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0');
                        char tapTimeout = (char) (6164 - (ViewConfiguration.getTapTimeout() >> 16));
                        byte b11 = (byte) ($$a[3] - 1);
                        byte b12 = b11;
                        Object[] objArr14 = new Object[1];
                        a(b11, b12, (byte) (b12 | Ascii.SO), objArr14);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i3, iIndexOf, tapTimeout, 381780032, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
                    if (objCopydefault5 == null) {
                        int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2027;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 23;
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6164);
                        byte b13 = $$a[3];
                        byte b14 = b13;
                        Object[] objArr15 = new Object[1];
                        a(b13, b14, (byte) (-b14), objArr15);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i4, packedPositionGroup, maximumDrawingCacheSize, 163751008, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            int i5 = component2 + 45;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
            if (objCopydefault6 == null) {
                int trimmedLength = TextUtils.getTrimmedLength("") + 2026;
                int fadingEdgeLength = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                char c2 = (char) (6165 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                byte[] bArr2 = $$a;
                byte b15 = (byte) (bArr2[3] - 1);
                Object[] objArr16 = new Object[1];
                a(b15, b15, (byte) (-bArr2[26]), objArr16);
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(trimmedLength, fadingEdgeLength, c2, 385853891, false, (String) objArr16[0], null);
            }
            Object[] objArr17 = (Object[]) ((Field) objCopydefault6).get(null);
            objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i7 = ((int[]) objArr17[1])[0];
            int i8 = ((int[]) objArr17[3])[0];
            String[] strArr = (String[]) objArr17[2];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i9 = ~elapsedCpuTime;
            int i10 = (~((-900305955) | i9)) | 816350210;
            int i11 = ~(elapsedCpuTime | (-1108371778));
            int i12 = (((39686412 + ((i10 | i11) * (-713))) + (i11 * 1426)) + ((~((-1192327522) | i9)) * 713)) - 2115658687;
            int i13 = (i12 << 13) ^ i12;
            int i14 = i13 ^ (i13 >>> 17);
            ((int[]) objArr[0])[0] = i14 ^ (i14 << 5);
        }
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[1])[0];
        if (i16 == i15) {
            Object[] objArr18 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i17 = ((int[]) objArr[0])[0];
            int i18 = ((int[]) objArr[1])[0];
            int i19 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[2];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i20 = ~startElapsedRealtime;
            int i21 = i17 + 2137605987 + (((~(i20 | 2077816043)) | (-2080046332) | (~((-12587145) | startElapsedRealtime))) * 717) + (((~(startElapsedRealtime | 2077816043)) | (~(i20 | (-12587145))) | (-2080046332)) * 717);
            int i22 = (i21 << 13) ^ i21;
            int i23 = i22 ^ (i22 >>> 17);
            ((int[]) objArr18[0])[0] = i23 ^ (i23 << 5);
            Object[] objArr19 = {new int[1], new int[]{i}, strArr2, new int[]{i}};
            int i24 = ((int[]) objArr18[0])[0];
            int i25 = ((int[]) objArr18[1])[0];
            int i26 = ((int[]) objArr18[3])[0];
            int iMyTid = Process.myTid();
            int i27 = 1069121491 + (((~((-433589611) | iMyTid)) | 12582920 | (~((-1659043866) | iMyTid))) * (-880));
            int i28 = (~((-433589611) | (~iMyTid))) | 1659043865;
            int i29 = ~(iMyTid | 433589610);
            int i30 = i24 + i27 + ((i28 | i29) * (-880)) + (i29 * 880);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr19[0])[0] = i32 ^ (i32 << 5);
            int i33 = component2 + 95;
            component3 = i33 % 128;
            int i34 = i33 % 2;
            return str;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[2];
        if (strArr3 != null) {
            int i35 = component3 + 95;
            component2 = i35 % 128;
            int i36 = i35 % 2;
            int i37 = 0;
            while (i37 < strArr3.length) {
                arrayList.add(strArr3[i37]);
                i37++;
                int i38 = component3 + 67;
                component2 = i38 % 128;
                int i39 = i38 % 2;
            }
        }
        long j2 = -1;
        long j3 = ((long) (i15 ^ i16)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
        long j4 = 0;
        long j5 = j3 | (((long) 10) << 32) | (j4 - ((j4 >> 63) << 32));
        try {
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 6618, 42 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
            Object[] objArr20 = {1543725496, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - ExpandableListView.getPackedPositionType(0L), 56 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) Color.alpha(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault8).invoke(objInvoke, objArr20);
            Object[] objArr21 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i40 = ((int[]) objArr[0])[0];
            int i41 = ((int[]) objArr[1])[0];
            int i42 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[2];
            int iIdentityHashCode = System.identityHashCode(this);
            int i43 = ~iIdentityHashCode;
            int i44 = i40 + 1419701755 + ((iIdentityHashCode | 1721757971) * 140) + (((~(1721757971 | i43)) | 268438624) * (-280)) + (((~(iIdentityHashCode | (-268438625))) | (~(370875504 | i43)) | 1619321091) * 140);
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr21[0])[0] = i46 ^ (i46 << 5);
            throw null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    static {
        component1 = 0;
        copydefault();
        int i = copydefault + 99;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public CustomExtResponse() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static CustomExtResponse copy$default(CustomExtResponse customExtResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i2 = 2 % 2;
        String str14 = (i & 1) != 0 ? customExtResponse.supportOtp : str;
        if ((i & 2) != 0) {
            int i3 = component3 + 37;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str9 = customExtResponse.supportFingerprint;
        } else {
            str9 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = component3 + 35;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str10 = customExtResponse.supportFace;
        } else {
            str10 = str3;
        }
        String str15 = (i & 8) != 0 ? customExtResponse.supportPin : str4;
        if ((i & 16) != 0) {
            int i7 = component2 + 13;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str11 = customExtResponse.otpType;
        } else {
            str11 = str5;
        }
        String str16 = (i & 32) != 0 ? customExtResponse.supportForgetPin : str6;
        if ((i & 64) != 0) {
            str12 = customExtResponse.avatarUrl;
            int i9 = component2 + 105;
            component3 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str12 = str7;
        }
        if ((i & 128) != 0) {
            int i11 = component3 + 85;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            str13 = customExtResponse.name;
        } else {
            str13 = str8;
        }
        return customExtResponse.copy(str14, str9, str10, str15, str11, str16, str12, str13);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.supportOtp;
        int i5 = i3 + 69;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.supportFingerprint;
        int i5 = i2 + 87;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.supportFace;
        int i5 = i3 + 7;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.supportPin;
        int i5 = i2 + 89;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.otpType;
        int i5 = i3 + 121;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 73;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.supportForgetPin;
            int i4 = 46 / 0;
        } else {
            str = this.supportForgetPin;
        }
        int i5 = i2 + 69;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.name;
        }
        throw null;
    }

    public final CustomExtResponse copy(String supportOtp, String supportFingerprint, String supportFace, String supportPin, String otpType, String supportForgetPin, String avatarUrl, String name) {
        int i = 2 % 2;
        CustomExtResponse customExtResponse = new CustomExtResponse(supportOtp, supportFingerprint, supportFace, supportPin, otpType, supportForgetPin, avatarUrl, name);
        int i2 = component2 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return customExtResponse;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 53;
            component3 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof CustomExtResponse)) {
            return false;
        }
        CustomExtResponse customExtResponse = (CustomExtResponse) other;
        if (!Intrinsics.areEqual(this.supportOtp, customExtResponse.supportOtp) || !Intrinsics.areEqual(this.supportFingerprint, customExtResponse.supportFingerprint) || !Intrinsics.areEqual(this.supportFace, customExtResponse.supportFace)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.supportPin, customExtResponse.supportPin)) {
            int i3 = component3 + 87;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.otpType, customExtResponse.otpType) || !Intrinsics.areEqual(this.supportForgetPin, customExtResponse.supportForgetPin)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.avatarUrl, customExtResponse.avatarUrl)) {
            int i5 = component3 + 79;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.name, customExtResponse.name)) {
            return true;
        }
        int i7 = component3 + 43;
        component2 = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = component2 + 123;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.supportOtp;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.supportFingerprint;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.supportFace;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.supportPin;
        if (str4 == null) {
            int i4 = component2 + 43;
            component3 = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str4.hashCode();
        }
        String str5 = this.otpType;
        if (str5 == null) {
            int i5 = component3 + 105;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str5.hashCode();
        }
        String str6 = this.supportForgetPin;
        if (str6 == null) {
            int i7 = component2 + 5;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str6.hashCode();
        }
        String str7 = this.avatarUrl;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.name;
        return (((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CustomExtResponse(supportOtp=" + this.supportOtp + ", supportFingerprint=" + this.supportFingerprint + ", supportFace=" + this.supportFace + ", supportPin=" + this.supportPin + ", otpType=" + this.otpType + ", supportForgetPin=" + this.supportForgetPin + ", avatarUrl=" + this.avatarUrl + ", name=" + this.name + ")";
        int i2 = component3 + 9;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        ShareDataUIState = -5902840227558008485L;
    }
}
