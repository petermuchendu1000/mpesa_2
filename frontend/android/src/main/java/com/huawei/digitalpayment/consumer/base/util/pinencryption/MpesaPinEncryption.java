package com.huawei.digitalpayment.consumer.base.util.pinencryption;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baseui.R;
import com.huawei.hms.common.util.Logger;
import com.huawei.hms.feature.dynamic.f.e;
import com.safaricom.mpesa.logging.L;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.X509EncodedKeySpec;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0015J.\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/pinencryption/MpesaPinEncryption;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getMpesaPublicKey", "Ljava/security/PublicKey;", "treadStonePublicKey", "getTreadStonePublicKey", "()Ljava/security/PublicKey;", "encrypt", "", "input", "", "publicKey", KeysConstants.KEY_ENCRYPT_PIN, "mpesaPin", "doubleEncryption", "", "encryptParameters", "senderNumber", "receiverNumber", "amount", "accountReference", "pin", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaPinEncryption {
    public static final String ALGORITHM = "RSA";

    public static final Companion INSTANCE;
    private static char ShareDataUIState = 0;
    public static final String TRANSFORMATION = "RSA/ECB/PKCS1Padding";
    private static long component1;
    private static int copydefault;
    private static int equals;
    private final Context component2;
    private static final byte[] $$c = {102, -86, -98, TarHeader.LF_DIR};
    private static final int $$f = 122;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {13, 38, -109, 117, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39, 39, Ascii.FS, 36};
    private static final int $$e = 48;
    private static final byte[] $$a = {69, -50, 81, 75, 1, Ascii.DC2, -40, 40, 8, 4, -16, Ascii.DLE, -8, 5};
    private static final int $$b = 8;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private static int component3 = 0;

    private static String $$g(int i, int i2, byte b2) {
        int i3 = 99 - b2;
        int i4 = i2 * 4;
        byte[] bArr = $$c;
        int i5 = i + 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i3 = i5 + i4;
            i5 = i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i5 + 1;
            i3 += bArr[i7];
            i5 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.base.util.pinencryption.MpesaPinEncryption.$$a
            int r6 = r6 * 4
            int r6 = r6 + 103
            int r8 = r8 * 2
            int r8 = r8 + 11
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r7 = r7 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r6 = r6 + r7
            int r6 = r6 + (-3)
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.pinencryption.MpesaPinEncryption.a(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.base.util.pinencryption.MpesaPinEncryption.$$d
            int r9 = r9 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r7 = r7 + 98
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r5 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            int r9 = r9 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r7 = r7 + r9
            int r7 = r7 + (-27)
            r9 = r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.pinencryption.MpesaPinEncryption.b(short, byte, short, java.lang.Object[]):void");
    }

    public MpesaPinEncryption(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.component2 = context;
    }

    public final Context getContext() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 73;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/util/pinencryption/MpesaPinEncryption$Companion;", "", "<init>", "()V", "ALGORITHM", "", "TRANSFORMATION", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final PublicKey component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 73;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        InputStream inputStreamOpenRawResource = this.component2.getResources().openRawResource(R.raw.mpesa_production_public_key);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "");
        PublicKey publicKey = null;
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance(e.f2905b).generateCertificate(inputStreamOpenRawResource);
            Intrinsics.checkNotNullExpressionValue(certificateGenerateCertificate, "");
            publicKey = certificateGenerateCertificate.getPublicKey();
            inputStreamOpenRawResource.close();
            int i4 = getRequestBeneficiariesState + 121;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 5;
            }
        } catch (IOException e) {
            String message = e.getMessage();
            if (message != null) {
                L.INSTANCE.e(message, new Object[0]);
            }
        } catch (CertificateException e2) {
            String message2 = e2.getMessage();
            if (message2 != null) {
                L.INSTANCE.e(message2, new Object[0]);
            }
        }
        int i6 = getRequestBeneficiariesState + 25;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return publicKey;
    }

    private final PublicKey component2() throws NoSuchAlgorithmException, IOException {
        int i = 2 % 2;
        String string = this.component2.getString(R.string.header_tag);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String string2 = this.component2.getString(R.string.footer_tag);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        InputStream inputStreamOpenRawResource = this.component2.getResources().openRawResource(R.raw.m_treadstone_public_key);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "");
        byte[] bArr = new byte[32];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int i2 = inputStreamOpenRawResource.read(bArr);
                if (i2 == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "");
                    X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode(StringsKt.replace$default(StringsKt.replace$default(new String(byteArray, Charsets.UTF_8), string, "", false, 4, (Object) null), string2, "", false, 4, (Object) null), 0));
                    KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                    Intrinsics.checkNotNullExpressionValue(keyFactory, "");
                    return keyFactory.generatePublic(x509EncodedKeySpec);
                }
                int i3 = getAsAtTimestamp + 73;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (InvalidParameterSpecException e) {
                String message = e.getMessage();
                if (message != null) {
                    L.INSTANCE.e(message, new Object[0]);
                }
                return null;
            }
        }
    }

    private static void c(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $10 + 17;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int touchSlop = 4037 - (ViewConfiguration.getTouchSlop() >> 8);
                    int touchSlop2 = 31 - (ViewConfiguration.getTouchSlop() >> 8);
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(i4, i4) + 19181);
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (b2 + 1);
                    String str$$g = $$g(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(touchSlop, touchSlop2, cResolveOpacity, 1912513118, false, str$$g, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        int absoluteGravity = 7567 - Gravity.getAbsoluteGravity(i4, i4);
                        int iIndexOf = TextUtils.indexOf("", "", i4, i4) + 11;
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        Class[] clsArr2 = new Class[1];
                        clsArr2[i4] = Object.class;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, iIndexOf, packedPositionType, 2006389106, false, "e", clsArr2);
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                    try {
                        Object[] objArr4 = new Object[3];
                        objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                        objArr4[1] = Integer.valueOf(i7);
                        objArr4[i4] = iNotificationSideChannel;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) (-1);
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 2459, 28 - View.MeasureSpec.makeMeasureSpec(i4, i4), (char) (TextUtils.lastIndexOf("", '0') + 1), 931716605, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7568 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), AndroidCharacter.getMirror('0') - '%', (char) ((-1) - Process.getGidForName("")), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) copydefault) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
                            i2 = 2;
                            i4 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 61;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x083f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0840, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0844, code lost:
    
        if (r1 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0846, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0847, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0337, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.base.util.pinencryption.MpesaPinEncryption.getAsAtTimestamp + 5;
        com.huawei.digitalpayment.consumer.base.util.pinencryption.MpesaPinEncryption.getRequestBeneficiariesState = r1 % 128;
        r1 = r1 % 2;
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0348, code lost:
    
        if (r3 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x034a, code lost:
    
        r1 = 1342 - android.widget.ExpandableListView.getPackedPositionGroup(0);
        r31 = ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 33;
        r3 = (char) ((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 6425);
        r7 = (byte) 1;
        r8 = (byte) (r7 + 2);
        r11 = new java.lang.Object[1];
        b(r7, r8, (byte) (r8 - 4), r11);
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r31, r3, 1443979249, false, (java.lang.String) r11[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0387, code lost:
    
        ((java.lang.reflect.Field) r3).set(null, r12);
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-1823965036);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0394, code lost:
    
        if (r3 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0396, code lost:
    
        r1 = android.text.TextUtils.getOffsetBefore("", 0) + 1342;
        r31 = android.view.MotionEvent.axisFromString("") + 34;
        r3 = (char) ((android.os.Process.myPid() >> 22) + 6425);
        r7 = (byte) 1;
        r8 = (byte) (r7 + 2);
        r11 = new java.lang.Object[1];
        b(r7, r8, (byte) (r8 - 4), r11);
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r31, r3, 1443979249, false, (java.lang.String) r11[0], null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x03d7, code lost:
    
        r6 = new java.lang.Object[]{0L, ((java.lang.reflect.Field) r3).get(null)};
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(812318566);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x03ea, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x03ec, code lost:
    
        r1 = 1342 - (android.os.Process.myPid() >> 22);
        r31 = 32 - ((byte) android.view.KeyEvent.getModifierMetaStateMask());
        r3 = (char) (android.view.MotionEvent.axisFromString("") + 6426);
        r8 = (byte) 2;
        r7 = (byte) (r8 - 2);
        r12 = new java.lang.Object[1];
        b(r8, r7, (byte) (r7 | 8), r12);
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r1, r31, r3, -181198845, false, (java.lang.String) r12[0], new java.lang.Class[]{java.lang.Long.TYPE, java.lang.reflect.Method.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0432, code lost:
    
        ((java.lang.Long) ((java.lang.reflect.Method) r1).invoke(null, r6)).longValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x062f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final byte[] copydefault(java.lang.String r38, java.security.PublicKey r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.util.pinencryption.MpesaPinEncryption.copydefault(java.lang.String, java.security.PublicKey):byte[]");
    }

    public static String encryptPin$default(MpesaPinEncryption mpesaPinEncryption, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = getAsAtTimestamp;
            int i4 = i3 + 47;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 75;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        return mpesaPinEncryption.encryptPin(str, z);
    }

    public final String encryptPin(String mpesaPin, boolean doubleEncryption) {
        UnsupportedEncodingException e;
        String strEncodeToString;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 45;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(mpesaPin, "");
        try {
            strEncodeToString = Base64.encodeToString(copydefault(mpesaPin, component3()), 2);
            if (doubleEncryption) {
                int i4 = getRequestBeneficiariesState + 113;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                try {
                    strEncodeToString = Base64.encodeToString(copydefault(strEncodeToString, component2()), 2);
                } catch (UnsupportedEncodingException e2) {
                    e = e2;
                    L l = L.INSTANCE;
                    String message = e.getMessage();
                    l.d(message != null ? message : "", new Object[0]);
                }
            }
        } catch (UnsupportedEncodingException e3) {
            e = e3;
            strEncodeToString = "";
        }
        int i6 = getRequestBeneficiariesState + 51;
        getAsAtTimestamp = i6 % 128;
        int i7 = i6 % 2;
        return strEncodeToString;
    }

    public final String encryptParameters(String senderNumber, String receiverNumber, String amount, String accountReference, String pin) {
        int i = 2 % 2;
        String strEncodeToString = "";
        Intrinsics.checkNotNullParameter(senderNumber, "");
        Intrinsics.checkNotNullParameter(receiverNumber, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(accountReference, "");
        Intrinsics.checkNotNullParameter(pin, "");
        try {
            strEncodeToString = Base64.encodeToString(copydefault(senderNumber + Logger.f2811c + amount + Logger.f2811c + senderNumber + Logger.f2811c + receiverNumber + Logger.f2811c + accountReference + Logger.f2811c + pin, component2()), 2);
        } catch (UnsupportedEncodingException e) {
            L l = L.INSTANCE;
            String message = e.getMessage();
            if (message == null) {
                int i2 = getRequestBeneficiariesState + 35;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
                message = "";
            }
            l.d(message, new Object[0]);
            int i4 = getRequestBeneficiariesState + 73;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = getRequestBeneficiariesState + 73;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 == 0) {
            return strEncodeToString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        equals = 1;
        component1();
        INSTANCE = new Companion(null);
        int i = component3 + 115;
        equals = i % 128;
        int i2 = i % 2;
    }

    static void component1() {
        component1 = -3780477796495014671L;
        copydefault = 1386857713;
        ShareDataUIState = (char) 57711;
    }
}
