package com.huawei.digitalpayment.home.data.source.remote;

import android.graphics.ImageFormat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/remote/FilterConfig;", "", "filterKey", "", "filterValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFilterKey", "()Ljava/lang/String;", "getFilterValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FilterConfig {
    private final String component3;
    private final String copydefault;
    private static final byte[] $$c = {86, 117, -27, 75};
    private static final int $$f = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {107, -21, -54, -113, -12, -1, -9, -12, -1, -9, Ascii.NAK, -1, -1, 5, -20, 9, -8};
    private static final int $$e = 64;
    private static final byte[] $$a = {115, -125, 45, -41, -15, 8, -16, 1, 4, 3, TarHeader.LF_BLK, -55, -14, -1, -8, 13, -11, -8, 68, PSSSigner.TRAILER_IMPLICIT, 1, Base64.padSymbol, -21, -49, -2, 2, 1, 4, 0, -21, 9, -8, -1, 35, -39, 6, -11, 1, -21, 17, Ascii.ESC, -39, -11, 7, -23, 19, TarHeader.LF_LINK, -64, 9, -15, 5, TarHeader.LF_CONTIG, -40, -22, -12, Ascii.VT, 2, -5, -3, 17, -19, -4, 5, 5, -2, -13, -7, 4, -7};
    private static final int $$b = 206;
    private static int component1 = 0;
    private static int getRequestBeneficiariesState = 1;
    private static long ShareDataUIState = -2165901914813382138L;
    private static int component2 = -890926536;

    private static String $$g(short s, int i, short s2) {
        int i2 = 103 - (s2 * 38);
        int i3 = i + 4;
        byte[] bArr = $$c;
        int i4 = s * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i2 += i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            i3++;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            i2 += bArr[i3];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 34 - r7
            int r8 = r8 * 3
            int r8 = 115 - r8
            int r6 = r6 + 4
            byte[] r1 = com.huawei.digitalpayment.home.data.source.remote.FilterConfig.$$a
            byte[] r0 = new byte[r0]
            int r7 = 33 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-2)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.source.remote.FilterConfig.c(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.home.data.source.remote.FilterConfig.$$d
            int r8 = r8 + 4
            int r1 = r7 + 1
            int r6 = r6 + 98
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L11
            r6 = r7
            r3 = r8
            r4 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L29:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.source.remote.FilterConfig.d(short, byte, int, java.lang.Object[]):void");
    }

    public FilterConfig(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.component3 = str2;
    }

    public final String getFilterKey() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 3;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String getFilterValue() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 23;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 103;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(ShareDataUIState ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 97;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7031 - ImageFormat.getBitsPerPixel(0), KeyEvent.getDeadChar(0, 0) + 34, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1389, 18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 51269), -1883291598, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $11 + 77;
                $10 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i8 = $11 + 27;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - View.MeasureSpec.makeMeasureSpec(0, 0), KeyEvent.normalizeMetaState(0) + 38, (char) (26908 - AndroidCharacter.getMirror('0')), 2015799920, false, $$g(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - View.MeasureSpec.getSize(0), TextUtils.getCapsMode("", 0, 0) + 16, (char) (TextUtils.lastIndexOf("", '0') + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i6 = $11 + 105;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr4 = new char[i3];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollDefaultDelay() >> 16) + 7406, 16 - TextUtils.getCapsMode("", 0, 0), (char) TextUtils.getCapsMode("", 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i8 = $11 + 123;
        $10 = i8 % 128;
        if (i8 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i9 = 67 / 0;
            objArr[0] = str;
        }
    }

    public static FilterConfig copy$default(FilterConfig filterConfig, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 53;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = filterConfig.copydefault;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 61;
            int i7 = i6 % 128;
            component1 = i7;
            int i8 = i6 % 2;
            String str3 = filterConfig.component3;
            int i9 = i7 + 23;
            getRequestBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
            str2 = str3;
        }
        return filterConfig.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 31;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 != 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    public final FilterConfig copy(String filterKey, String filterValue) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(filterKey, "");
        Intrinsics.checkNotNullParameter(filterValue, "");
        FilterConfig filterConfig = new FilterConfig(filterKey, filterValue);
        int i2 = getRequestBeneficiariesState + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return filterConfig;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterConfig)) {
            return false;
        }
        FilterConfig filterConfig = (FilterConfig) other;
        if (!Intrinsics.areEqual(this.copydefault, filterConfig.copydefault) || !Intrinsics.areEqual(this.component3, filterConfig.component3)) {
            return false;
        }
        int i4 = component1 + 17;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        getRequestBeneficiariesState = i2 % 128;
        int iHashCode = (i2 % 2 == 0 ? this.copydefault.hashCode() % 38 : this.copydefault.hashCode() * 31) + this.component3.hashCode();
        int i3 = component1 + 55;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FilterConfig(filterKey=" + this.copydefault + ", filterValue=" + this.component3 + ")";
        int i2 = getRequestBeneficiariesState + 87;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0e43  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0eb6 A[Catch: Exception -> 0x0ef1, all -> 0x0f13, IOException -> 0x0f17, TryCatch #6 {Exception -> 0x0ef1, blocks: (B:76:0x091c, B:100:0x0c5c, B:102:0x0c6a, B:103:0x0ca9, B:105:0x0cbf, B:106:0x0d07, B:140:0x0e6b, B:142:0x0e6d, B:144:0x0e74, B:145:0x0e75, B:152:0x0e85, B:154:0x0e8c, B:155:0x0e8d, B:162:0x0eaf, B:164:0x0eb6, B:165:0x0eb7, B:172:0x0ecf, B:174:0x0eda, B:175:0x0edb), top: B:283:0x091c }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0eb7 A[Catch: Exception -> 0x0ef1, all -> 0x0f13, IOException -> 0x0f17, TryCatch #6 {Exception -> 0x0ef1, blocks: (B:76:0x091c, B:100:0x0c5c, B:102:0x0c6a, B:103:0x0ca9, B:105:0x0cbf, B:106:0x0d07, B:140:0x0e6b, B:142:0x0e6d, B:144:0x0e74, B:145:0x0e75, B:152:0x0e85, B:154:0x0e8c, B:155:0x0e8d, B:162:0x0eaf, B:164:0x0eb6, B:165:0x0eb7, B:172:0x0ecf, B:174:0x0eda, B:175:0x0edb), top: B:283:0x091c }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0eda A[Catch: Exception -> 0x0ef1, all -> 0x0f13, IOException -> 0x0f17, TryCatch #6 {Exception -> 0x0ef1, blocks: (B:76:0x091c, B:100:0x0c5c, B:102:0x0c6a, B:103:0x0ca9, B:105:0x0cbf, B:106:0x0d07, B:140:0x0e6b, B:142:0x0e6d, B:144:0x0e74, B:145:0x0e75, B:152:0x0e85, B:154:0x0e8c, B:155:0x0e8d, B:162:0x0eaf, B:164:0x0eb6, B:165:0x0eb7, B:172:0x0ecf, B:174:0x0eda, B:175:0x0edb), top: B:283:0x091c }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0edb A[Catch: Exception -> 0x0ef1, all -> 0x0f13, IOException -> 0x0f17, TRY_LEAVE, TryCatch #6 {Exception -> 0x0ef1, blocks: (B:76:0x091c, B:100:0x0c5c, B:102:0x0c6a, B:103:0x0ca9, B:105:0x0cbf, B:106:0x0d07, B:140:0x0e6b, B:142:0x0e6d, B:144:0x0e74, B:145:0x0e75, B:152:0x0e85, B:154:0x0e8c, B:155:0x0e8d, B:162:0x0eaf, B:164:0x0eb6, B:165:0x0eb7, B:172:0x0ecf, B:174:0x0eda, B:175:0x0edb), top: B:283:0x091c }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x13e5 A[PHI: r1 r2 r3
  0x13e5: PHI (r1v101 int) = (r1v98 int), (r1v98 int), (r1v103 int) binds: [B:197:0x1022, B:199:0x106b, B:332:0x13e5] A[DONT_GENERATE, DONT_INLINE]
  0x13e5: PHI (r2v116 int) = (r2v113 int), (r2v113 int), (r2v122 int) binds: [B:197:0x1022, B:199:0x106b, B:332:0x13e5] A[DONT_GENERATE, DONT_INLINE]
  0x13e5: PHI (r3v109 java.lang.String[]) = (r3v108 java.lang.String[]), (r3v108 java.lang.String[]), (r3v114 java.lang.String[]) binds: [B:197:0x1022, B:199:0x106b, B:332:0x13e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x062d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object[] component1(android.content.Context r56, int r57, int r58, int r59) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 7926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.home.data.source.remote.FilterConfig.component1(android.content.Context, int, int, int):java.lang.Object[]");
    }
}
