package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponseHeader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfigServiceResponse;", "Landroid/os/Parcelable;", "responseHeader", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "body", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfigBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfigBody;)V", "getResponseHeader", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfigBody;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankInputFieldsConfigServiceResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BankInputFieldsConfigServiceResponse> CREATOR;
    private static long component2;
    private static int copydefault;

    @SerializedName("Body")
    private final BankInputFieldsConfigBody body;

    @SerializedName("ResponseHeader")
    private final ImtServiceResponseHeader responseHeader;
    private static final byte[] $$c = {96, -37, -4, -26};
    private static final int $$f = 241;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {101, 74, 115, 66, -10, 4, 65, PSSSigner.TRAILER_IMPLICIT, 20, -17, 8, 3, 1, 4, 0, 67, -70, Ascii.SI, 6, -16, 9, 17, -4, 4, -11, Ascii.DLE, -9, -3, 3, Ascii.FF, -3, Ascii.FF, -3, 8, 4, -17, 7, -1, 70, -34, TarHeader.LF_NORMAL, -67, -3, -4, 17, 0, 4, -11, -10, 4, -1, 3, 3, Ascii.VT, -7, -4, 69};
    private static final int $$e = 77;
    private static final byte[] $$a = {84, 79, Ascii.SYN, 41, -2, Ascii.SI, -51, TarHeader.LF_SYMLINK, -50, TarHeader.LF_CHR, -32, Ascii.NAK, 4, -8, Ascii.SO, 1, -19, Ascii.FF, 3, -2, Ascii.SI, -34, 19, Ascii.FF, 4, -16, Ascii.SO, 1, -50, 35, 9, -9, 1, 3, -6, 6, -8, 17, -9, -4, Ascii.SO, -32, 33, -19, 19, -15, Ascii.FF, 1, 9};
    private static final int $$b = 173;
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private static int component1 = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankInputFieldsConfigServiceResponse> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankInputFieldsConfigServiceResponse createFromParcel(Parcel parcel) {
            ImtServiceResponseHeader imtServiceResponseHeaderCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                int i2 = component3 + 95;
                int i3 = i2 % 128;
                component2 = i3;
                if (i2 % 2 == 0) {
                    int i4 = 99 / 0;
                }
                int i5 = i3 + 37;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                imtServiceResponseHeaderCreateFromParcel = null;
            } else {
                imtServiceResponseHeaderCreateFromParcel = ImtServiceResponseHeader.CREATOR.createFromParcel(parcel);
                int i7 = component2 + 3;
                component3 = i7 % 128;
                int i8 = i7 % 2;
            }
            return new BankInputFieldsConfigServiceResponse(imtServiceResponseHeaderCreateFromParcel, parcel.readInt() != 0 ? BankInputFieldsConfigBody.CREATOR.createFromParcel(parcel) : null);
        }

        @Override
        public BankInputFieldsConfigServiceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 53;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            BankInputFieldsConfigServiceResponse bankInputFieldsConfigServiceResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 39;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return bankInputFieldsConfigServiceResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankInputFieldsConfigServiceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 69;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            BankInputFieldsConfigServiceResponse[] bankInputFieldsConfigServiceResponseArr = new BankInputFieldsConfigServiceResponse[i];
            int i6 = i4 + 67;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return bankInputFieldsConfigServiceResponseArr;
            }
            throw null;
        }

        @Override
        public BankInputFieldsConfigServiceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 109;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            BankInputFieldsConfigServiceResponse[] bankInputFieldsConfigServiceResponseArrNewArray = newArray(i);
            int i5 = component3 + 29;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return bankInputFieldsConfigServiceResponseArrNewArray;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(byte r7, short r8, short r9) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankInputFieldsConfigServiceResponse.$$c
            int r7 = r7 * 3
            int r7 = 103 - r7
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r5 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2a:
            int r7 = r7 + r9
            r9 = r3
            r3 = r5
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankInputFieldsConfigServiceResponse.$$g(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 12
            int r0 = r8 + 4
            int r7 = r7 * 4
            int r7 = r7 + 99
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankInputFieldsConfigServiceResponse.$$a
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankInputFieldsConfigServiceResponse.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 99
            int r8 = r8 * 35
            int r0 = 45 - r8
            int r6 = r6 * 44
            int r6 = 47 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankInputFieldsConfigServiceResponse.$$d
            byte[] r0 = new byte[r0]
            int r8 = 44 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r6
            r4 = r8
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L30:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + 2
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankInputFieldsConfigServiceResponse.c(int, short, short, java.lang.Object[]):void");
    }

    public BankInputFieldsConfigServiceResponse(ImtServiceResponseHeader imtServiceResponseHeader, BankInputFieldsConfigBody bankInputFieldsConfigBody) {
        this.responseHeader = imtServiceResponseHeader;
        this.body = bankInputFieldsConfigBody;
    }

    public final ImtServiceResponseHeader getResponseHeader() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        ImtServiceResponseHeader imtServiceResponseHeader = this.responseHeader;
        int i5 = i2 + 113;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return imtServiceResponseHeader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BankInputFieldsConfigBody getBody() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.body;
        }
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $11 + 51;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $10 + 91;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getJumpTapTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 35, (char) (63440 - (KeyEvent.getMaxKeyCode() >> 16)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 17, (char) (51269 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), -1883291598, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    public final BankInputFieldsConfigServiceResponse copy(ImtServiceResponseHeader responseHeader, BankInputFieldsConfigBody body) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
        if (objCopydefault == null) {
            int scrollDefaultDelay = 1115 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int iGreen = 22 - Color.green(0);
            char c2 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            byte b2 = $$a[15];
            byte b3 = (byte) (-b2);
            byte b4 = b2;
            Object[] objArr2 = new Object[1];
            a(b3, b4, b4, objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, iGreen, c2, -1308762862, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{18278, 18183, 61034, 41505, 34658, 18105, 62271, 32039, 58877, 42418, 22059, 6759, 737, 188, 13677, 50990, 44995, 32640, 38915, 25620, 52443, 55972, 32519, 266, 27073, 14720}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(-ImageFormat.getBitsPerPixel(0), new char[]{35732, 35825, 52126, 39930, 50439, 25423, 51937, 16192, 10515, 32842, 28656, 22654, 52761, 9562, 3316, 34156, 25377, 23146, 41417}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
        if (objCopydefault2 == null) {
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1116;
            int tapTimeout = 22 - (ViewConfiguration.getTapTimeout() >> 16);
            char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
            Object[] objArr5 = new Object[1];
            a(r18[14], r18[15], (byte) (-$$a[4]), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, tapTimeout, capsMode, -206681338, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
            if (objCopydefault3 == null) {
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1115;
                int i2 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                byte[] bArr = $$a;
                byte b5 = bArr[3];
                byte b6 = (byte) (bArr[15] - 1);
                Object[] objArr6 = new Object[1];
                a(b5, b6, b6, objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, i2, cCombineMeasuredStates, 44744436, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = ((((-742874525) + ((~((~iIdentityHashCode) | (-142610593))) * (-116))) + ((373067603 | iIdentityHashCode) * 116)) + (((~(iIdentityHashCode | 179870115)) | 335808080) * 116)) - 1186549363;
            int i4 = (i3 << 13) ^ i3;
            int i5 = i4 ^ (i4 >>> 17);
            ((int[]) objArr[0])[0] = i5 ^ (i5 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b(1 - Drawable.resolveOpacity(0, 0), new char[]{12808, 12898, Typography.amp, 51604, 22424, 43258, 39064, 44494, 37074, 19451, 15771, 51933, 30599, 61101, 24229, 6142, 55975, 37323, 62375, 46310}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b((ViewConfiguration.getTouchSlop() >> 8) + 1, new char[]{52931, 52906, 55185, 60361, 31177, 32584, 47830, 33680, 27715, 40009, 8147, 58523, 35683, 14677, 31960, 14782, 9820, 18023, 53755, 39615}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i6 = component3 + 31;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -1186549363};
                byte[] bArr2 = $$d;
                byte b7 = bArr2[12];
                byte b8 = bArr2[14];
                Object[] objArr11 = new Object[1];
                c(b7, b8, b8, objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b9 = bArr2[14];
                Object[] objArr12 = new Object[1];
                c(b9, b9, bArr2[12], objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-940351087);
                if (objCopydefault4 == null) {
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1115;
                    int size = View.MeasureSpec.getSize(0) + 22;
                    char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                    byte[] bArr3 = $$a;
                    byte b10 = bArr3[3];
                    byte b11 = (byte) (bArr3[15] - 1);
                    Object[] objArr14 = new Object[1];
                    a(b10, b11, b11, objArr14);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout, size, offsetBefore, 44744436, false, (String) objArr14[0], null);
                }
                ((Field) objCopydefault4).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, new char[]{18278, 18183, 61034, 41505, 34658, 18105, 62271, 32039, 58877, 42418, 22059, 6759, 737, 188, 13677, 50990, 44995, 32640, 38915, 25620, 52443, 55972, 32519, 266, 27073, 14720}, objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    b((Process.myTid() >> 22) + 1, new char[]{35732, 35825, 52126, 39930, 50439, 25423, 51937, 16192, 10515, 32842, 28656, 22654, 52761, 9562, 3316, 34156, 25377, 23146, 41417}, objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(922195043);
                    if (objCopydefault5 == null) {
                        int i8 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1115;
                        int packedPositionType = 22 - ExpandableListView.getPackedPositionType(0L);
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        Object[] objArr17 = new Object[1];
                        a(r14[14], r14[15], (byte) (-$$a[4]), objArr17);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i8, packedPositionType, edgeSlop, -206681338, false, (String) objArr17[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1956905591);
                    if (objCopydefault6 == null) {
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1115;
                        int iGreen2 = 22 - Color.green(0);
                        char offsetBefore2 = (char) TextUtils.getOffsetBefore("", 0);
                        byte b12 = $$a[15];
                        byte b13 = (byte) (-b12);
                        byte b14 = b12;
                        Object[] objArr18 = new Object[1];
                        a(b13, b14, b14, objArr18);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity, iGreen2, offsetBefore2, -1308762862, false, (String) objArr18[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf2);
                    objArr = objArr13;
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
        int i9 = ((int[]) objArr[1])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 == i9) {
            int i11 = ShareDataUIState + 65;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = ((int[]) objArr[0])[0];
            Object[] objArr19 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i14 = i13 + (-1247598877) + (((~(117435759 | iElapsedRealtime)) | 75761728) * (-756)) + (((~iElapsedRealtime) | 117435759) * 756);
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
            ((int[]) objArr19[0])[0] = i16 ^ (i16 << 5);
            int i17 = ((int[]) objArr19[0])[0];
            Object[] objArr20 = {new int[1], new int[]{((int[]) objArr19[1])[0]}, new int[]{((int[]) objArr19[2])[0]}, (String[]) objArr19[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i18 = i17 + 1131021489 + (((~(501366990 | iIdentityHashCode2)) | 343949440) * (-502)) + ((~((~iIdentityHashCode2) | 1038513918)) * (-502)) + (((~(iIdentityHashCode2 | (-694564479))) | 501366990) * 502);
            int i19 = (i18 << 13) ^ i18;
            int i20 = i19 ^ (i19 >>> 17);
            ((int[]) objArr20[0])[0] = i20 ^ (i20 << 5);
            return new BankInputFieldsConfigServiceResponse(responseHeader, body);
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[3];
        if (strArr != null) {
            int i21 = component3 + 27;
            ShareDataUIState = i21 % 128;
            for (int i22 = i21 % 2 != 0 ? 1 : 0; i22 < strArr.length; i22++) {
                arrayList.add(strArr[i22]);
            }
        }
        long j2 = -1;
        long j3 = ((long) (i9 ^ i10)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
        long j4 = 0;
        long j5 = j3 | (((long) 6) << 32) | (j4 - ((j4 >> 63) << 32));
        try {
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 6618, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
            Object[] objArr21 = {-1322803350, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.alpha(0), TextUtils.getOffsetBefore("", 0) + 56, (char) View.MeasureSpec.makeMeasureSpec(0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault8).invoke(objInvoke, objArr21);
            int i23 = ((int[]) objArr[0])[0];
            Object[] objArr22 = {new int[1], new int[]{((int[]) objArr[1])[0]}, new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
            int i24 = (~((-572311946) | iElapsedRealtime2)) | 537135104;
            int i25 = i23 + (-1143475553) + (i24 * 992) + ((i24 | (~((~iElapsedRealtime2) | (-343937617)))) * (-496)) + ((iElapsedRealtime2 | (-379114458)) * 496);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr22[0])[0] = i27 ^ (i27 << 5);
            throw new RuntimeException(String.valueOf(i10));
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    static {
        copydefault = 0;
        ShareDataUIState();
        CREATOR = new Creator();
        int i = component1 + 71;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BankInputFieldsConfigServiceResponse copy$default(BankInputFieldsConfigServiceResponse bankInputFieldsConfigServiceResponse, ImtServiceResponseHeader imtServiceResponseHeader, BankInputFieldsConfigBody bankInputFieldsConfigBody, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 75;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 59;
            int i7 = i6 % 128;
            component3 = i7;
            int i8 = i6 % 2;
            ImtServiceResponseHeader imtServiceResponseHeader2 = bankInputFieldsConfigServiceResponse.responseHeader;
            int i9 = i7 + 85;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            imtServiceResponseHeader = imtServiceResponseHeader2;
        }
        if ((i & 2) != 0) {
            int i11 = ShareDataUIState + 59;
            component3 = i11 % 128;
            if (i11 % 2 == 0) {
                BankInputFieldsConfigBody bankInputFieldsConfigBody2 = bankInputFieldsConfigServiceResponse.body;
                throw null;
            }
            bankInputFieldsConfigBody = bankInputFieldsConfigServiceResponse.body;
        }
        return bankInputFieldsConfigServiceResponse.copy(imtServiceResponseHeader, bankInputFieldsConfigBody);
    }

    public final ImtServiceResponseHeader component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        ImtServiceResponseHeader imtServiceResponseHeader = this.responseHeader;
        int i5 = i2 + 119;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return imtServiceResponseHeader;
    }

    public final BankInputFieldsConfigBody component2() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        BankInputFieldsConfigBody bankInputFieldsConfigBody = this.body;
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return bankInputFieldsConfigBody;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(!(other instanceof BankInputFieldsConfigServiceResponse))) {
            BankInputFieldsConfigServiceResponse bankInputFieldsConfigServiceResponse = (BankInputFieldsConfigServiceResponse) other;
            return Intrinsics.areEqual(this.responseHeader, bankInputFieldsConfigServiceResponse.responseHeader) && Intrinsics.areEqual(this.body, bankInputFieldsConfigServiceResponse.body);
        }
        int i4 = i3 + 45;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        ImtServiceResponseHeader imtServiceResponseHeader;
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component3 = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 == 0) {
            imtServiceResponseHeader = this.responseHeader;
            iHashCode = 1;
            if (imtServiceResponseHeader != null) {
                iHashCode2 = 1;
                iHashCode = iHashCode2;
                iHashCode2 = imtServiceResponseHeader.hashCode();
            }
        } else {
            imtServiceResponseHeader = this.responseHeader;
            if (imtServiceResponseHeader == null) {
                iHashCode = 0;
            } else {
                iHashCode = iHashCode2;
                iHashCode2 = imtServiceResponseHeader.hashCode();
            }
        }
        BankInputFieldsConfigBody bankInputFieldsConfigBody = this.body;
        if (bankInputFieldsConfigBody != null) {
            iHashCode = bankInputFieldsConfigBody.hashCode();
        }
        int i3 = (iHashCode2 * 31) + iHashCode;
        int i4 = ShareDataUIState + 81;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return i3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankInputFieldsConfigServiceResponse(responseHeader=" + this.responseHeader + ", body=" + this.body + ')';
        int i2 = component3 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        ImtServiceResponseHeader imtServiceResponseHeader = this.responseHeader;
        if (imtServiceResponseHeader == null) {
            int i2 = ShareDataUIState + 99;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imtServiceResponseHeader.writeToParcel(dest, flags);
        }
        BankInputFieldsConfigBody bankInputFieldsConfigBody = this.body;
        if (bankInputFieldsConfigBody != null) {
            dest.writeInt(1);
            bankInputFieldsConfigBody.writeToParcel(dest, flags);
        } else {
            int i4 = component3 + 59;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        }
    }

    static void ShareDataUIState() {
        component2 = -2497703038861802452L;
    }
}
