package com.huawei.digitalpayment.checkout.resp;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.iap.ac.android.acs.plugin.utils.Constants;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003JM\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÇ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H×\u0003J\t\u0010'\u001a\u00020\u0003H×\u0001J\t\u0010(\u001a\u00020\u0005H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/checkout/resp/TransactionPeopleBean;", "Ljava/io/Serializable;", "iconRes", "", "name", "", GriverCacheDao.COLUMN_CACHE_ID, "phoneNumber", "accountNumber", Keys.KEY_HEADER_URL, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconRes", "()I", "setIconRes", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getId", "setId", Constants.JS_API_GET_PHONE_NUMBER, "setPhoneNumber", "getAccountNumber", "setAccountNumber", "getAvatarUrl", "setAvatarUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TransactionPeopleBean implements Serializable {
    public static final int $stable = 8;
    private static char ShareDataUIState;
    private static char component1;
    private static char component2;
    private static char component3;
    private static int equals;
    private String accountNumber;
    private String avatarUrl;
    private int iconRes;
    private String id;
    private String name;
    private String phoneNumber;
    private static final byte[] $$c = {90, 10, -103, 87};
    private static final int $$f = 202;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {120, -46, -95, -23, -9, 62, -71, 10, 1, -5, -20, 8, -16, Ascii.SO, -22, 71, -62, -8, -9, Ascii.FF, -16, 1, 10, -14, 59, PSSSigner.TRAILER_IMPLICIT, -4, 8, -16, Ascii.SO, -22, 2, -6, -4, 66, -56, -15, -1, -6, 1, 4, -18, Ascii.DLE, -4, -13, 4, TarHeader.LF_BLK, -24, -47, -1, -6, 1, 4, -18, Ascii.DLE, -4, -13, 4, Ascii.SI, -37, Ascii.DLE, -20, 13, -18, 6, 4, -6, 19, -34, 71, -66, -15, -4, -12, Ascii.DC2, -4, -4, 2, -23, 6, -11, -15, -1, -6, -2, -2, 6, -12, -9, 62};
    private static final int $$e = 37;
    private static final byte[] $$a = {79, 7, -80, -125, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK};
    private static final int $$b = 145;
    private static int getRequestBeneficiariesState = 0;
    private static int component4 = 1;
    private static int copydefault = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(short r7, byte r8, int r9) {
        /*
            int r9 = r9 * 3
            int r9 = 1 - r9
            int r7 = r7 * 3
            int r7 = r7 + 111
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.$$g(short, byte, int):java.lang.String");
    }

    private static void a(short s, int i, int i2, Object[] objArr) {
        int i3 = 28 - (i * 3);
        byte[] bArr = $$a;
        int i4 = 99 - (s * 16);
        int i5 = i2 * 6;
        byte[] bArr2 = new byte[16 - i5];
        int i6 = 15 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 = (i6 + (-i4)) - 17;
            i3++;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = (i4 + (-bArr[i3])) - 17;
            i3++;
            i7 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r9 = r9 * 6
            int r9 = r9 + 99
            byte[] r0 = com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.$$d
            int r8 = r8 * 68
            int r8 = 78 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            int r7 = r7 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-3)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.c(short, int, byte, java.lang.Object[]):void");
    }

    public TransactionPeopleBean(int i, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str5, "");
        this.iconRes = i;
        this.name = str;
        this.id = str2;
        this.phoneNumber = str3;
        this.accountNumber = str4;
        this.avatarUrl = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TransactionPeopleBean(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        String str8;
        Object obj = null;
        if ((i2 & 1) != 0) {
            int i3 = getRequestBeneficiariesState + 57;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
            i = -1;
        }
        String str9 = "";
        if ((i2 & 2) != 0) {
            int i5 = getRequestBeneficiariesState + 39;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str6 = "";
        } else {
            str6 = str;
        }
        if ((i2 & 4) != 0) {
            int i8 = component4 + 65;
            getRequestBeneficiariesState = i8 % 128;
            if (i8 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str7 = "";
        } else {
            str7 = str2;
        }
        if ((i2 & 8) != 0) {
            int i9 = 2 % 2;
            str8 = "";
        } else {
            str8 = str3;
        }
        String str10 = (i2 & 16) != 0 ? "" : str4;
        if ((i2 & 32) != 0) {
            int i10 = getRequestBeneficiariesState + 125;
            component4 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str9 = str5;
        }
        this(i, str6, str7, str8, str10, str9);
    }

    public final int getIconRes() {
        int i = 2 % 2;
        int i2 = component4 + 33;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        int i5 = this.iconRes;
        int i6 = i3 + 55;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        throw null;
    }

    public final void setIconRes(int i) {
        int i2 = 2 % 2;
        int i3 = component4 + 103;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        this.iconRes = i;
        if (i4 != 0) {
            int i5 = 50 / 0;
        }
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 97;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setName(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 51;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        this.name = str;
        int i5 = i2 + 7;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 95;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.id;
        int i4 = i2 + 109;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return str;
    }

    public final void setId(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        this.id = str;
        int i5 = i3 + 25;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = component4 + 31;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.phoneNumber;
        int i5 = i3 + 77;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return str;
    }

    public final void setPhoneNumber(String str) {
        int i = 2 % 2;
        int i2 = component4 + 69;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        this.phoneNumber = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 91;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNumber;
        int i5 = i2 + 23;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setAccountNumber(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        this.accountNumber = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 121;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getAvatarUrl() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 41;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.avatarUrl;
        int i4 = i2 + 89;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setAvatarUrl(String str) {
        int i = 2 % 2;
        int i2 = component4 + 119;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.avatarUrl = str;
        int i4 = component4 + 81;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i4 = $10 + 31;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 105;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(843 - MotionEvent.axisFromString(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31, (char) (23251 - View.resolveSizeAndState(0, 0, 0)), 592652048, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 843, 32 - View.MeasureSpec.getMode(0), (char) (23251 - (Process.myPid() >> 22)), 592652048, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - Color.green(0), TextUtils.getCapsMode("", 0, 0) + 49, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public final String component2() throws Throwable {
        Object[] objArr;
        char c2;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
        if (objCopydefault == null) {
            int iResolveSizeAndState = 2026 - View.resolveSizeAndState(0, 0, 0);
            int trimmedLength = 23 - TextUtils.getTrimmedLength("");
            char c3 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6163);
            Object[] objArr2 = new Object[1];
            a((byte) ($$b & 7), (byte) (-$$a[24]), (byte) 0, objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iResolveSizeAndState, trimmedLength, c3, 163751008, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{24119, 47555, 53733, 4681, 14185, 19024, 12840, 21528, 18090, 18039, 52213, 48007, 47109, 29568, 28073, 59033, 3005, 13881, 11655, 10429, 25537, 56530}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(14 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{44030, 29476, 58642, 34305, 555, 32280, 4978, 4912, 9962, 60214, 46525, 11952, 48588, 56801, 46756, 30064}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
        if (objCopydefault2 == null) {
            int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2026;
            int iArgb = Color.argb(0, 0, 0, 0) + 23;
            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 6164);
            byte b2 = (byte) 0;
            byte b3 = (byte) (b2 + 3);
            Object[] objArr5 = new Object[1];
            a(b2, b3, (byte) (b3 - 2), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i2, iArgb, maxKeyCode, 381780032, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = component4 + 7;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
            if (objCopydefault3 == null) {
                int i5 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2025;
                int iIndexOf = 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                char cRed = (char) (Color.red(0) + 6164);
                byte b4 = (byte) 0;
                byte b5 = b4;
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 + 1), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i5, iIndexOf, cRed, 385853891, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{i}, strArr, new int[]{i}};
            int i6 = ((int[]) objArr7[1])[0];
            int i7 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[2];
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = (-48510773) + (((~(8081228 | iIdentityHashCode)) | (-2088763264) | (~(2084552247 | iIdentityHashCode))) * (-744)) + (((~iIdentityHashCode) | 3870212) * 744) + ((iIdentityHashCode | 2088763263) * 744) + 1607926698;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[0])[0] = i10 ^ (i10 << 5);
            int i11 = getRequestBeneficiariesState + 61;
            component4 = i11 % 128;
            int i12 = i11 % 2;
            c2 = 3;
        } else {
            Object[] objArr8 = new Object[1];
            b((ViewConfiguration.getJumpTapTimeout() >> 16) + 16, new char[]{24324, 34311, 59767, 47408, 60171, 7525, 24119, 47555, 13283, 42618, 32252, 21181, 52782, 53591, 25194, 2552}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(View.resolveSizeAndState(0, 0, 0) + 16, new char[]{35488, 25186, 65068, 28437, 3998, 59684, 26063, 10312, 63933, 50961, 37485, 37651, 46634, 53325, 1493, 3488}, objArr9);
            try {
                Object[] objArr10 = {null, Integer.valueOf(((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue()), 0, 1607926698};
                byte[] bArr = $$d;
                byte b6 = bArr[37];
                Object[] objArr11 = new Object[1];
                c(b6, (byte) (b6 + 1), bArr[8], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b7 = bArr[8];
                Object[] objArr12 = new Object[1];
                c((byte) 76, b7, (byte) (b7 - 1), objArr12);
                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-744065370);
                if (objCopydefault4 == null) {
                    int i13 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2025;
                    int i14 = 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    char cRgb = (char) (Color.rgb(0, 0, 0) + 16783380);
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    Object[] objArr13 = new Object[1];
                    a(b8, b9, (byte) (b9 + 1), objArr13);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i13, i14, cRgb, 385853891, false, (String) objArr13[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr);
                try {
                    Object[] objArr14 = new Object[1];
                    b(View.MeasureSpec.getSize(0) + 22, new char[]{24119, 47555, 53733, 4681, 14185, 19024, 12840, 21528, 18090, 18039, 52213, 48007, 47109, 29568, 28073, 59033, 3005, 13881, 11655, 10429, 25537, 56530}, objArr14);
                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    b(15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{44030, 29476, 58642, 34305, 555, 32280, 4978, 4912, 9962, 60214, 46525, 11952, 48588, 56801, 46756, 30064}, objArr15);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-744988891);
                    if (objCopydefault5 == null) {
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2026;
                        int iGreen = Color.green(0) + 23;
                        char c4 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6163);
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 3);
                        Object[] objArr16 = new Object[1];
                        a(b10, b11, (byte) (b11 - 2), objArr16);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString, iGreen, c4, 381780032, false, (String) objArr16[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-862225659);
                    if (objCopydefault6 == null) {
                        int iArgb2 = Color.argb(0, 0, 0, 0) + 2026;
                        int iMyTid = 23 - (Process.myTid() >> 22);
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 6164);
                        Object[] objArr17 = new Object[1];
                        a((byte) ($$b & 7), (byte) (-$$a[24]), (byte) 0, objArr17);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iArgb2, iMyTid, threadPriority, 163751008, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
                    c2 = 3;
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
        }
        int i15 = ((int[]) objArr[c2])[0];
        int i16 = ((int[]) objArr[1])[0];
        if (i16 == i15) {
            int i17 = component4 + 39;
            getRequestBeneficiariesState = i17 % 128;
            int i18 = i17 % 2;
            Object[] objArr18 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[1])[0];
            int i21 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[2];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i22 = (~((-774324423) | iIdentityHashCode2)) | 235094148;
            int i23 = i19 + (-766451789) + (i22 * 992) + ((i22 | (~((~iIdentityHashCode2) | 1857539327))) * (-496)) + ((iIdentityHashCode2 | 1318309053) * 496);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr18[0])[0] = i25 ^ (i25 << 5);
            Object[] objArr19 = {new int[1], new int[]{i}, strArr2, new int[]{i}};
            int i26 = ((int[]) objArr18[0])[0];
            int i27 = ((int[]) objArr18[1])[0];
            int i28 = ((int[]) objArr18[3])[0];
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i29 = ~((-33559045) | iIdentityHashCode3);
            int i30 = ~iIdentityHashCode3;
            int i31 = i26 + 934857716 + ((i29 | (~((-1085317409) | i30))) * 497) + (((~(iIdentityHashCode3 | (-1085317409))) | (~((-973757024) | i30)) | 940197979) * 497);
            int i32 = (i31 << 13) ^ i31;
            int i33 = i32 ^ (i32 >>> 17);
            ((int[]) objArr19[0])[0] = i33 ^ (i33 << 5);
            return this.name;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[2];
        if (strArr3 != null) {
            for (String str : strArr3) {
                int i34 = getRequestBeneficiariesState + 49;
                component4 = i34 % 128;
                int i35 = i34 % 2;
                arrayList.add(str);
            }
        }
        long j2 = -1;
        long j3 = ((long) (i15 ^ i16)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
        long j4 = 0;
        long j5 = j3 | (((long) 10) << 32) | (j4 - ((j4 >> 63) << 32));
        try {
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6617 - Process.getGidForName(""), 42 - Color.argb(0, 0, 0, 0), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
            Object[] objArr20 = {-1268259791, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6561 - ImageFormat.getBitsPerPixel(0), 56 - View.MeasureSpec.getMode(0), (char) KeyEvent.keyCodeFromString(""), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault8).invoke(objInvoke, objArr20);
            Object[] objArr21 = {new int[1], new int[]{i}, strArr, new int[]{i}};
            int i36 = ((int[]) objArr[0])[0];
            int i37 = ((int[]) objArr[1])[0];
            int i38 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[2];
            int iIdentityHashCode4 = System.identityHashCode(this);
            int i39 = ~iIdentityHashCode4;
            int i40 = i36 + 337475413 + (((~((-1442103086) | i39)) | (~((-650530391) | iIdentityHashCode4))) * 210) + (((~(iIdentityHashCode4 | (-1362145578))) | (~(i39 | (-570572883)))) * 210);
            int i41 = (i40 << 13) ^ i40;
            int i42 = i41 ^ (i41 >>> 17);
            ((int[]) objArr21[0])[0] = i42 ^ (i42 << 5);
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
        equals = 1;
        copydefault();
        int i = copydefault + 53;
        equals = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public TransactionPeopleBean() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static TransactionPeopleBean copy$default(TransactionPeopleBean transactionPeopleBean, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        String str6;
        String str7;
        String str8;
        int i3 = 2 % 2;
        int i4 = component4;
        int i5 = i4 + 47;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = (i2 & 1) != 0 ? transactionPeopleBean.iconRes : i;
        String str9 = (i2 & 2) != 0 ? transactionPeopleBean.name : str;
        String str10 = (i2 & 4) != 0 ? transactionPeopleBean.id : str2;
        if ((i2 & 8) != 0) {
            str6 = transactionPeopleBean.phoneNumber;
            int i8 = i4 + 7;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str6 = str3;
        }
        if ((i2 & 16) != 0) {
            int i10 = getRequestBeneficiariesState + 71;
            component4 = i10 % 128;
            int i11 = i10 % 2;
            str7 = transactionPeopleBean.accountNumber;
        } else {
            str7 = str4;
        }
        if ((i2 & 32) != 0) {
            int i12 = getRequestBeneficiariesState + 47;
            component4 = i12 % 128;
            int i13 = i12 % 2;
            str8 = transactionPeopleBean.avatarUrl;
            if (i13 == 0) {
                int i14 = 79 / 0;
            }
        } else {
            str8 = str5;
        }
        return transactionPeopleBean.copy(i7, str9, str10, str6, str7, str8);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component4 + 53;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        int i5 = this.iconRes;
        int i6 = i3 + 51;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component4 + 3;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 91;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 31;
        component4 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.phoneNumber;
        int i4 = i2 + 99;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component4 + 69;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.accountNumber;
        int i5 = i3 + 41;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component4 + 11;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.avatarUrl;
        int i5 = i3 + 19;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final TransactionPeopleBean copy(int iconRes, String name, String id, String phoneNumber, String accountNumber, String avatarUrl) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(avatarUrl, "");
        TransactionPeopleBean transactionPeopleBean = new TransactionPeopleBean(iconRes, name, id, phoneNumber, accountNumber, avatarUrl);
        int i2 = component4 + 79;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return transactionPeopleBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 87;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionPeopleBean)) {
            int i5 = i2 + 111;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        TransactionPeopleBean transactionPeopleBean = (TransactionPeopleBean) other;
        if (this.iconRes != transactionPeopleBean.iconRes) {
            return false;
        }
        if (!Intrinsics.areEqual(this.name, transactionPeopleBean.name)) {
            int i7 = component4 + 69;
            getRequestBeneficiariesState = i7 % 128;
            return !(i7 % 2 == 0);
        }
        if (!Intrinsics.areEqual(this.id, transactionPeopleBean.id)) {
            int i8 = getRequestBeneficiariesState + 7;
            component4 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.phoneNumber, transactionPeopleBean.phoneNumber)) {
            int i10 = component4 + 111;
            getRequestBeneficiariesState = i10 % 128;
            return i10 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.accountNumber, transactionPeopleBean.accountNumber)) {
            int i11 = component4 + 7;
            getRequestBeneficiariesState = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.avatarUrl, transactionPeopleBean.avatarUrl)) {
            return true;
        }
        int i13 = getRequestBeneficiariesState + 57;
        component4 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[PHI: r1 r3
  0x002f: PHI (r1v18 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x002f: PHI (r3v6 java.lang.String) = (r3v0 java.lang.String), (r3v8 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v20 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.getRequestBeneficiariesState
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.component4 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1a
            int r1 = r7.iconRes
            int r1 = java.lang.Integer.hashCode(r1)
            java.lang.String r3 = r7.name
            if (r3 != 0) goto L2f
            goto L24
        L1a:
            int r1 = r7.iconRes
            int r1 = java.lang.Integer.hashCode(r1)
            java.lang.String r3 = r7.name
            if (r3 != 0) goto L2f
        L24:
            int r3 = com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.getRequestBeneficiariesState
            int r3 = r3 + 43
            int r4 = r3 % 128
            com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.component4 = r4
            int r3 = r3 % r0
            r3 = r2
            goto L33
        L2f:
            int r3 = r3.hashCode()
        L33:
            java.lang.String r4 = r7.id
            if (r4 != 0) goto L47
            int r4 = com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.getRequestBeneficiariesState
            int r4 = r4 + 51
            int r5 = r4 % 128
            com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.component4 = r5
            int r4 = r4 % r0
            if (r4 != 0) goto L45
            r4 = 5
            int r4 = r4 % 4
        L45:
            r4 = r2
            goto L4b
        L47:
            int r4 = r4.hashCode()
        L4b:
            java.lang.String r5 = r7.phoneNumber
            if (r5 != 0) goto L5e
            int r5 = com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.getRequestBeneficiariesState
            int r5 = r5 + 23
            int r6 = r5 % 128
            com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.component4 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L5c
            r0 = 1
            goto L62
        L5c:
            r0 = r2
            goto L62
        L5e:
            int r0 = r5.hashCode()
        L62:
            java.lang.String r5 = r7.accountNumber
            if (r5 != 0) goto L67
            goto L6b
        L67:
            int r2 = r5.hashCode()
        L6b:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.String r0 = r7.avatarUrl
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.resp.TransactionPeopleBean.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TransactionPeopleBean(iconRes=" + this.iconRes + ", name=" + this.name + ", id=" + this.id + ", phoneNumber=" + this.phoneNumber + ", accountNumber=" + this.accountNumber + ", avatarUrl=" + this.avatarUrl + ")";
        int i2 = component4 + 17;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static void copydefault() {
        component3 = (char) 1340;
        ShareDataUIState = (char) 36210;
        component1 = (char) 62403;
        component2 = (char) 62659;
    }
}
