package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.google.common.base.Ascii;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelAll;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.asn1.BERTags;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo;", "", "<init>", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "subtitle", "getSubtitle", "DailyLimit", "MaximumLimit", "MinimumLimit", "WrongPin", "InsufficientFunds", "ValidationIdExpired", "Generic", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$DailyLimit;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$Generic;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$InsufficientFunds;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$MaximumLimit;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$MinimumLimit;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$ValidationIdExpired;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$WrongPin;", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ErrorInfo {
    public static final int $stable = 0;
    private static int component2 = 1;
    private static int component3;

    public abstract String getDescription();

    public abstract String getSubtitle();

    private ErrorInfo() {
    }

    static {
        int i = 1 + 91;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public ErrorInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$DailyLimit;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo;", "description", "", "subtitle", "limit", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getDescription", "()Ljava/lang/String;", "getSubtitle", "getLimit", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DailyLimit extends ErrorInfo {
        public static final int $stable = 8;
        private static char ShareDataUIState;
        private static char[] component2;
        private static byte[] component4;
        private static int copy;
        private static short[] equals;
        private static int getAsAtTimestamp;
        private static int getRequestBeneficiariesState;
        private static int hashCode;
        private final String component1;
        private final String component3;
        private final BigDecimal copydefault;
        private static final byte[] $$c = {57, 126, 65, 8};
        private static final int $$f = 63;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {119, -40, Ascii.DLE, 123, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39};
        private static final int $$e = 222;
        private static final byte[] $$a = {120, -46, -95, -23, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_SYMLINK, -28, -17, -25, 5, -17, -17, -11, -36, -7, -24};
        private static final int $$b = 27;
        private static int ArtificialStackFrames = 0;
        private static int getShareableDataState = 1;
        private static int toString = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(byte r6, byte r7, byte r8) {
            /*
                int r7 = r7 * 3
                int r7 = 4 - r7
                byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.DailyLimit.$$c
                int r6 = r6 * 2
                int r1 = r6 + 1
                int r8 = 119 - r8
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r6
                r8 = r7
                r3 = r2
                goto L28
            L15:
                r3 = r2
                r5 = r8
                r8 = r7
                r7 = r5
            L19:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L24:
                r4 = r0[r8]
                int r3 = r3 + 1
            L28:
                int r7 = r7 + r4
                int r8 = r8 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.DailyLimit.$$g(byte, byte, byte):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.DailyLimit.$$a
                int r1 = 16 - r7
                int r8 = r8 * 16
                int r8 = 99 - r8
                int r6 = r6 * 3
                int r6 = 27 - r6
                byte[] r1 = new byte[r1]
                int r7 = 15 - r7
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2e
            L16:
                r3 = r2
            L17:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2e:
                int r8 = -r8
                int r3 = r3 + r8
                int r8 = r3 + (-16)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.DailyLimit.a(short, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void d(int r5, short r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 4
                int r5 = r5 + 99
                int r6 = r6 * 4
                int r6 = 10 - r6
                int r7 = r7 * 2
                int r7 = r7 + 4
                byte[] r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.DailyLimit.$$d
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L16
                r4 = r7
                r3 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L26:
                r4 = r0[r7]
            L28:
                int r7 = r7 + 1
                int r5 = r5 + r4
                int r5 = r5 + (-27)
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.DailyLimit.d(int, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DailyLimit(String str, String str2, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = getShareableDataState + 33;
                int i3 = i2 % 128;
                ArtificialStackFrames = i3;
                if (i2 % 2 != 0) {
                    int i4 = 37 / 0;
                }
                int i5 = i3 + 117;
                getShareableDataState = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str2 = null;
            }
            this(str, str2, bigDecimal);
        }

        @Override
        public String getDescription() {
            int i = 2 % 2;
            int i2 = ArtificialStackFrames + 105;
            int i3 = i2 % 128;
            getShareableDataState = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 125;
            ArtificialStackFrames = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DailyLimit(String str, String str2, BigDecimal bigDecimal) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.component3 = str;
            this.component1 = str2;
            this.copydefault = bigDecimal;
        }

        private static void b(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
            long j;
            int i4;
            boolean z;
            int i5 = 2 % 2;
            getSmallIconId getsmalliconid = new getSmallIconId();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(copy)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                if (objCopydefault == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 31 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (61685 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 1874745193, false, $$g(b3, b4, (byte) (b4 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                boolean z2 = iIntValue == -1;
                float f = 0.0f;
                if (z2) {
                    byte[] bArr = component4;
                    char c2 = '0';
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i6 = 0;
                        while (i6 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2984;
                                int iIndexOf = 47 - TextUtils.indexOf("", c2, 0, 0);
                                char c3 = (char) ((TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 54462);
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarFadeDuration, iIndexOf, c3, -1178636483, false, $$g(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i6++;
                            f = 0.0f;
                            c2 = '0';
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        int i7 = $11 + 87;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        byte[] bArr3 = component4;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(getRequestBeneficiariesState)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = b7;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 'O' - AndroidCharacter.getMirror('0'), (char) (61685 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 1874745193, false, $$g(b7, b8, (byte) (b8 | 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copy) ^ 7083766810336261929L)));
                        j = 7083766810336261929L;
                    } else {
                        j = 7083766810336261929L;
                        iIntValue = (short) (((short) (((long) equals[i2 + ((int) (((long) getRequestBeneficiariesState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copy) ^ 7083766810336261929L)));
                    }
                } else {
                    j = 7083766810336261929L;
                }
                if (iIntValue > 0) {
                    int i9 = ((i2 + iIntValue) - 2) + ((int) (((long) getRequestBeneficiariesState) ^ j));
                    if (z2) {
                        int i10 = $11 + 35;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    getsmalliconid.copydefault = i9 + i4;
                    Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(getAsAtTimestamp), sb};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                    if (objCopydefault4 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1697 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), View.MeasureSpec.getSize(0) + 37, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -1454191902, false, $$g(b9, b10, (byte) (b10 | 7)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    byte[] bArr4 = component4;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i12 = 0; i12 < length2; i12++) {
                            bArr5[i12] = (byte) (((long) bArr4[i12]) ^ 7083766810336261929L);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i13 = $10 + 11;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    getsmalliconid.component2 = 1;
                    int i15 = $10 + 67;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    while (getsmalliconid.component2 < iIntValue) {
                        if (!z) {
                            short[] sArr = equals;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                            int i17 = $11 + 97;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                        } else {
                            int i19 = $11 + 91;
                            $10 = i19 % 128;
                            if (i19 % 2 != 0) {
                                byte[] bArr6 = component4;
                                getsmalliconid.copydefault = getsmalliconid.copydefault % 0;
                                getsmalliconid.component1 = (char) (getsmalliconid.component3 / (((byte) (((byte) (((long) bArr6[r8]) % 7083766810336261929L)) % s)) ^ b2));
                            } else {
                                byte[] bArr7 = component4;
                                getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                                getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                                sb.append(getsmalliconid.component1);
                                getsmalliconid.component3 = getsmalliconid.component1;
                                getsmalliconid.component2++;
                            }
                        }
                        sb.append(getsmalliconid.component1);
                        getsmalliconid.component3 = getsmalliconid.component1;
                        getsmalliconid.component2++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2;
            int i4 = 2 % 2;
            cancelAll cancelall = new cancelAll();
            char[] cArr2 = component2;
            float f = 0.0f;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 7421, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, (char) (64291 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i5++;
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
            Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            char c2 = '0';
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 7423, View.resolveSizeAndState(0, 0, 0) + 15, (char) (64290 - TextUtils.lastIndexOf("", '0', 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b2);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                cancelall.component2 = 0;
                while (cancelall.component2 < i2) {
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = cancelall;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = cancelall;
                        objArr4[9] = cancelall;
                        objArr4[8] = Integer.valueOf(cCharValue);
                        objArr4[7] = cancelall;
                        objArr4[6] = cancelall;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = cancelall;
                        objArr4[3] = cancelall;
                        objArr4[i3] = Integer.valueOf(cCharValue);
                        objArr4[1] = cancelall;
                        objArr4[0] = cancelall;
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            int i6 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 7117;
                            int iLastIndexOf = TextUtils.lastIndexOf("", c2, 0, 0) + 15;
                            char c3 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44463);
                            Class[] clsArr = new Class[13];
                            clsArr[0] = Object.class;
                            clsArr[1] = Object.class;
                            clsArr[i3] = Integer.TYPE;
                            clsArr[3] = Object.class;
                            clsArr[4] = Object.class;
                            clsArr[5] = Integer.TYPE;
                            clsArr[6] = Object.class;
                            clsArr[7] = Object.class;
                            clsArr[8] = Integer.TYPE;
                            clsArr[9] = Object.class;
                            clsArr[10] = Object.class;
                            clsArr[11] = Integer.TYPE;
                            clsArr[12] = Object.class;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i6, iLastIndexOf, c3, 1150140696, false, "x", clsArr);
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() != cancelall.getAsAtTimestamp) {
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i7 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i8 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i7];
                                cArr4[cancelall.component2 + 1] = cArr2[i8];
                            } else {
                                int i9 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i9];
                                cArr4[cancelall.component2 + 1] = cArr2[i10];
                            }
                        } else {
                            int i11 = $10 + 73;
                            $11 = i11 % 128;
                            int i12 = i11 % i3;
                            try {
                                Object[] objArr5 = new Object[11];
                                objArr5[10] = cancelall;
                                objArr5[9] = Integer.valueOf(cCharValue);
                                objArr5[8] = cancelall;
                                objArr5[7] = Integer.valueOf(cCharValue);
                                objArr5[6] = Integer.valueOf(cCharValue);
                                objArr5[5] = cancelall;
                                objArr5[4] = cancelall;
                                objArr5[3] = Integer.valueOf(cCharValue);
                                objArr5[i3] = Integer.valueOf(cCharValue);
                                objArr5[1] = cancelall;
                                objArr5[0] = cancelall;
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                                if (objCopydefault4 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 24 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 27637), 794909189, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                                int i13 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[iIntValue];
                                cArr4[cancelall.component2 + 1] = cArr2[i13];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                    }
                    cancelall.component2 += 2;
                    obj2 = obj;
                    i3 = 2;
                    c2 = '0';
                }
            }
            int i14 = $11 + 67;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            int i16 = 0;
            while (i16 < i) {
                int i17 = $11 + 39;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr4[i16] = (char) (cArr4[i16] ^ 1606);
                    i16 += 74;
                } else {
                    cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                    i16++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        @Override
        public String getSubtitle() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
            if (objCopydefault == null) {
                int iBlue = Color.blue(0) + 2984;
                int pressedStateDuration = 48 - (ViewConfiguration.getPressedStateDuration() >> 16);
                char cNormalizeMetaState = (char) (54462 - KeyEvent.normalizeMetaState(0));
                byte b2 = (byte) ($$b & 44);
                byte b3 = $$a[18];
                Object[] objArr2 = new Object[1];
                a(b2, (byte) (b3 + 1), (byte) (-b3), objArr2);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iBlue, pressedStateDuration, cNormalizeMetaState, 1571866973, false, (String) objArr2[0], null);
            }
            long j = ((Field) objCopydefault).getLong(null);
            Object[] objArr3 = new Object[1];
            b((-3) - TextUtils.indexOf((CharSequence) "", '0'), (byte) ExpandableListView.getPackedPositionGroup(0L), (-1304220877) - (ViewConfiguration.getJumpTapTimeout() >> 16), (short) ExpandableListView.getPackedPositionType(0L), 467404394 + (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((-10) - TextUtils.lastIndexOf("", '0', 0, 0), (byte) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getTapTimeout() >> 16) - 1304220856, (short) TextUtils.getTrimmedLength(""), 467404399 - (Process.myTid() >> 22), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1682519065);
            if (objCopydefault2 == null) {
                int iRed = 2984 - Color.red(0);
                int pressedStateDuration2 = 48 - (ViewConfiguration.getPressedStateDuration() >> 16);
                char cIndexOf = (char) (54462 - TextUtils.indexOf("", "", 0));
                byte[] bArr = $$a;
                byte b4 = bArr[11];
                Object[] objArr5 = new Object[1];
                a(b4, (byte) (b4 + 3), (byte) (bArr[18] + 1), objArr5);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iRed, pressedStateDuration2, cIndexOf, -1592726660, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
                if (objCopydefault3 == null) {
                    int i2 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2984;
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 48;
                    char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 54462);
                    byte[] bArr2 = $$a;
                    byte b5 = (byte) (bArr2[18] + 1);
                    byte b6 = bArr2[31];
                    Object[] objArr6 = new Object[1];
                    a(b5, b6, (byte) (b6 - 5), objArr6);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i2, offsetAfter, capsMode, -635740813, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
                objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, new int[1], (String[]) objArr7[3]};
                int i3 = ~((int) Runtime.getRuntime().totalMemory());
                int i4 = ((285694299 + (((~(i3 | (-1898337914))) | (~((-8956163) | i3))) * (-184))) + (((101711876 | (~((-110668039) | i3))) | (~((-2000049790) | i3))) * 184)) - 42908799;
                int i5 = (i4 << 13) ^ i4;
                int i6 = i5 ^ (i5 >>> 17);
                ((int[]) objArr[2])[0] = i6 ^ (i6 << 5);
            } else {
                Object[] objArr8 = new Object[1];
                b(View.resolveSize(0, 0) + 2, (byte) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1304220842, (short) View.combineMeasuredStates(0, 0), 467404394 - MotionEvent.axisFromString(""), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                b((-6) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) TextUtils.indexOf("", "", 0, 0), (-1304220817) - (ViewConfiguration.getEdgeSlop() >> 16), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 467404396, objArr9);
                Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                if (applicationContext != null) {
                    int i7 = ArtificialStackFrames + 57;
                    getShareableDataState = i7 % 128;
                    if (i7 % 2 == 0) {
                        boolean z = applicationContext instanceof ContextWrapper;
                        throw null;
                    }
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                }
                Object[] objArr10 = new Object[1];
                b((-8) - Color.blue(0), (byte) Color.blue(0), TextUtils.getCapsMode("", 0, 0) - 1304220800, (short) (MotionEvent.axisFromString("") + 1), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 467404404, objArr10);
                Class<?> cls3 = Class.forName((String) objArr10[0]);
                Object[] objArr11 = new Object[1];
                b((KeyEvent.getMaxKeyCode() >> 16) - 8, (byte) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getOffsetAfter("", 0) - 1304220785, (short) (AndroidCharacter.getMirror('0') - '0'), TextUtils.lastIndexOf("", '0', 0) + 467404404, objArr11);
                int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
                int i8 = getShareableDataState + 11;
                ArtificialStackFrames = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -332816327};
                    Object[] objArr13 = new Object[1];
                    c(new char[]{4, 7, 25, CharUtils.CR, ' ', 24, '\"', 29, 27, 30, '\t', 1, '#', 3, 30, '\t', ' ', 17, 5, '\"', CharUtils.CR, 22, 25, 28, 7, '\b', 4, 7, 24, 21, 25, 20, 27, '\f', 6, 19, 31, 4, 27, ' ', '\b', 19, 28, 14, JSONLexer.EOI, ' ', '!', '\t', '\f', JSONLexer.EOI, 19, 6, '\f', 27, 22, 0, 6, 1, 7, 22, JSONLexer.EOI, 0, 11, 17, 16, '\t', 22, 7, '\n', '!', 30, 28, 16, '\f', CharUtils.CR, 16, 29, 30, 7, 11, 13882}, (byte) (82 - ExpandableListView.getPackedPositionGroup(0L)), TextUtils.indexOf("", "") + 81, objArr13);
                    Class<?> cls4 = Class.forName(((String) objArr13[0]).intern());
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    Object[] objArr14 = new Object[1];
                    d(b7, b8, b8, objArr14);
                    Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                    if (applicationContext != null) {
                        int i10 = ArtificialStackFrames + 39;
                        getShareableDataState = i10 % 128;
                        int i11 = i10 % 2;
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(524452374);
                        if (objCopydefault4 == null) {
                            int i12 = 2984 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 48;
                            char deadChar = (char) (54462 - KeyEvent.getDeadChar(0, 0));
                            byte[] bArr3 = $$a;
                            byte b9 = (byte) (bArr3[18] + 1);
                            byte b10 = bArr3[31];
                            Object[] objArr16 = new Object[1];
                            a(b9, b10, (byte) (b10 - 5), objArr16);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(i12, threadPriority, deadChar, -635740813, false, (String) objArr16[0], null);
                        }
                        ((Field) objCopydefault4).set(null, objArr15);
                        try {
                            Object[] objArr17 = new Object[1];
                            b((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 2, (byte) (Process.getGidForName("") + 1), (-1304220877) - View.resolveSizeAndState(0, 0, 0), (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 467404395 - TextUtils.indexOf("", "", 0, 0), objArr17);
                            Class<?> cls5 = Class.forName((String) objArr17[0]);
                            Object[] objArr18 = new Object[1];
                            b((-9) - View.MeasureSpec.getSize(0), (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (Process.myPid() >> 22) - 1304220856, (short) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 467404399, objArr18);
                            long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1682519065);
                            if (objCopydefault5 == null) {
                                int iGreen = Color.green(0) + 2984;
                                int iRgb = (-16777168) - Color.rgb(0, 0, 0);
                                char mirror = (char) (54510 - AndroidCharacter.getMirror('0'));
                                byte[] bArr4 = $$a;
                                byte b11 = bArr4[11];
                                Object[] objArr19 = new Object[1];
                                a(b11, (byte) (b11 + 3), (byte) (bArr4[18] + 1), objArr19);
                                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iGreen, iRgb, mirror, -1592726660, false, (String) objArr19[0], null);
                            }
                            ((Field) objCopydefault5).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1729554888);
                            if (objCopydefault6 == null) {
                                int iIndexOf = 2983 - TextUtils.indexOf((CharSequence) "", '0');
                                int i13 = 48 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                char packedPositionChild = (char) (54461 - ExpandableListView.getPackedPositionChild(0L));
                                byte b12 = (byte) ($$b & 44);
                                byte b13 = $$a[18];
                                Object[] objArr20 = new Object[1];
                                a(b12, (byte) (b13 + 1), (byte) (-b13), objArr20);
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, i13, packedPositionChild, 1571866973, false, (String) objArr20[0], null);
                            }
                            ((Field) objCopydefault6).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    }
                    objArr = objArr15;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i14 = ((int[]) objArr[0])[0];
            int i15 = ((int[]) objArr[1])[0];
            if (i15 == i14) {
                int i16 = ((int[]) objArr[2])[0];
                Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, new int[1], (String[]) objArr[3]};
                int iUptimeMillis = (int) SystemClock.uptimeMillis();
                int i17 = i16 + 1328404809 + (((~((~iUptimeMillis) | (-1149884662))) | 65668) * 446) + (((~(iUptimeMillis | (-1149818994))) | 960767498) * 446) + 29287928;
                int i18 = (i17 << 13) ^ i17;
                int i19 = i18 ^ (i18 >>> 17);
                ((int[]) objArr21[2])[0] = i19 ^ (i19 << 5);
                int i20 = ((int[]) objArr21[2])[0];
                Object[] objArr22 = {new int[]{((int[]) objArr21[0])[0]}, new int[]{((int[]) objArr21[1])[0]}, new int[1], (String[]) objArr21[3]};
                int iIdentityHashCode = System.identityHashCode(this);
                int i21 = ~iIdentityHashCode;
                int i22 = i20 + (-653352509) + ((361004147 | i21) * (-192)) + (((~((-1748599565) | i21)) | 1114116) * (-384)) + (((~(iIdentityHashCode | 2109603711)) | (~(i21 | (-1747485449))) | (~((-1114117) | iIdentityHashCode))) * BERTags.PRIVATE);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr22[2])[0] = i24 ^ (i24 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[3];
                if (strArr != null) {
                    int i25 = ArtificialStackFrames + 111;
                    getShareableDataState = i25 % 128;
                    int i26 = i25 % 2;
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                long j2 = -1;
                long j3 = ((long) (i14 ^ i15)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                long j4 = 0;
                long j5 = j3 | (((long) 3) << 32) | (j4 - ((j4 >> 63) << 32));
                try {
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault7 == null) {
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 42, (char) (TextUtils.lastIndexOf("", '0') + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                    Object[] objArr23 = {-188011901, Long.valueOf(j5), arrayList, null, false, false};
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault8 == null) {
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 56 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault8).invoke(objInvoke, objArr23);
                    int i27 = ((int[]) objArr[2])[0];
                    Object[] objArr24 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, new int[1], (String[]) objArr[3]};
                    int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                    int i28 = ~iMaxMemory;
                    int i29 = i27 + (-1616457887) + (((~((-1879433068) | i28)) | (~((-231284761) | iMaxMemory))) * 1900) + (((~(i28 | 231284760)) | (~(iMaxMemory | 1879433067))) * (-950)) + (((~(iMaxMemory | 231284760)) | (~(i28 | 1879433067))) * 950);
                    int i30 = (i29 << 13) ^ i29;
                    int i31 = i30 ^ (i30 >>> 17);
                    ((int[]) objArr24[2])[0] = i31 ^ (i31 << 5);
                    Toast.makeText((Context) null, i15 / (((i15 - 1) * i15) % 2), 0).show();
                    int i32 = ((int[]) objArr24[2])[0];
                    Object[] objArr25 = {new int[]{((int[]) objArr24[0])[0]}, new int[]{((int[]) objArr24[1])[0]}, new int[1], (String[]) objArr24[3]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i33 = (-1593626813) + (((~(508392452 | startUptimeMillis)) | 1602325375) * 672);
                    int i34 = ~startUptimeMillis;
                    int i35 = i32 + i33 + (((~(startUptimeMillis | 1602325375)) | (~((-508392453) | i34))) * (-672)) + (((~((-1602325376) | i34)) | 1098943355) * 672);
                    int i36 = (i35 << 13) ^ i35;
                    int i37 = i36 ^ (i36 >>> 17);
                    ((int[]) objArr25[2])[0] = i37 ^ (i37 << 5);
                    int i38 = ArtificialStackFrames + 19;
                    getShareableDataState = i38 % 128;
                    int i39 = i38 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            return this.component1;
        }

        public final BigDecimal getLimit() {
            int i = 2 % 2;
            int i2 = ArtificialStackFrames + 105;
            int i3 = i2 % 128;
            getShareableDataState = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            BigDecimal bigDecimal = this.copydefault;
            int i4 = i3 + 91;
            ArtificialStackFrames = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 49 / 0;
            }
            return bigDecimal;
        }

        static {
            hashCode = 0;
            ShareDataUIState();
            copydefault();
            int i = toString + 99;
            hashCode = i % 128;
            int i2 = i % 2;
        }

        public static DailyLimit copy$default(DailyLimit dailyLimit, String str, String str2, BigDecimal bigDecimal, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                str = dailyLimit.component3;
                int i3 = ArtificialStackFrames + 31;
                getShareableDataState = i3 % 128;
                int i4 = i3 % 2;
            }
            if ((i & 2) != 0) {
                int i5 = ArtificialStackFrames + 71;
                getShareableDataState = i5 % 128;
                int i6 = i5 % 2;
                str2 = dailyLimit.component1;
            }
            if ((i & 4) != 0) {
                bigDecimal = dailyLimit.copydefault;
            }
            return dailyLimit.copy(str, str2, bigDecimal);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = ArtificialStackFrames;
            int i3 = i2 + 117;
            getShareableDataState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component3;
            int i5 = i2 + 51;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = getShareableDataState + 55;
            ArtificialStackFrames = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component1;
            }
            throw null;
        }

        public final BigDecimal component3() {
            int i = 2 % 2;
            int i2 = ArtificialStackFrames;
            int i3 = i2 + 15;
            getShareableDataState = i3 % 128;
            int i4 = i3 % 2;
            BigDecimal bigDecimal = this.copydefault;
            int i5 = i2 + 59;
            getShareableDataState = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 77 / 0;
            }
            return bigDecimal;
        }

        public final DailyLimit copy(String description, String subtitle, BigDecimal limit) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(description, "");
            Intrinsics.checkNotNullParameter(limit, "");
            DailyLimit dailyLimit = new DailyLimit(description, subtitle, limit);
            int i2 = ArtificialStackFrames + 65;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            return dailyLimit;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof DailyLimit)) {
                return false;
            }
            DailyLimit dailyLimit = (DailyLimit) other;
            if (!Intrinsics.areEqual(this.component3, dailyLimit.component3)) {
                int i2 = ArtificialStackFrames + 7;
                getShareableDataState = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.component1, dailyLimit.component1)) {
                return Intrinsics.areEqual(this.copydefault, dailyLimit.copydefault);
            }
            int i4 = getShareableDataState + 89;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = ArtificialStackFrames + 81;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.component3.hashCode();
            String str = this.component1;
            if (str == null) {
                int i4 = getShareableDataState + 67;
                int i5 = i4 % 128;
                ArtificialStackFrames = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 107;
                getShareableDataState = i7 % 128;
                int i8 = i7 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode) * 31) + this.copydefault.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "DailyLimit(description=" + this.component3 + ", subtitle=" + this.component1 + ", limit=" + this.copydefault + ')';
            int i2 = ArtificialStackFrames + 1;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        static void copydefault() {
            int i = 2 % 2;
            int i2 = getShareableDataState + 5;
            ArtificialStackFrames = i2 % 128;
            if (i2 % 2 == 0) {
                component2 = new char[]{1992, 2019, 1973, 2020, 2032, 2023, 2036, 1966, 1997, 1999, 2031, 2000, 1987, 1986, 2028, 2034, 2041, 1956, 2035, 2029, 2018, 1990, 1991, 1993, 2021, 1998, 2037, 2030, 2039, 1985, 2024, 1996, 1984, 2025, 2022, 2017};
                ShareDataUIState = (char) 12828;
            } else {
                component2 = new char[]{1992, 2019, 1973, 2020, 2032, 2023, 2036, 1966, 1997, 1999, 2031, 2000, 1987, 1986, 2028, 2034, 2041, 1956, 2035, 2029, 2018, 1990, 1991, 1993, 2021, 1998, 2037, 2030, 2039, 1985, 2024, 1996, 1984, 2025, 2022, 2017};
                ShareDataUIState = (char) 12828;
                int i3 = 45 / 0;
            }
        }

        static void ShareDataUIState() {
            getRequestBeneficiariesState = -1133009948;
            copy = -238323919;
            getAsAtTimestamp = 367562463;
            component4 = new byte[]{33, -35, 42, 0, -1, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, -47, 45, -36, 33, 34, -43, 58, -57, -42, -37, 42, 38, -36, 46, 42, -43, -38, 35, Base64.padSymbol, -14, 44, 34, -38, 36, -36, 56, Ascii.VT, 58, -105, 41, 38, Ascii.SUB, -29, -46, -45, -44, 39, -33, 36, -42, 47, -36, 58, -41, -45, -44, -43, 41, 6, -28, 47, 32, -38, 41, -44, 59, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, 40, -36, 5, -14, -36, 59, TarHeader.LF_NORMAL, -26, 44, 34, -36, 47, 32, 40, -46, 41, 41, 41, 41, 41, 41};
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$MaximumLimit;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo;", "description", "", "subtitle", "maxAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getDescription", "()Ljava/lang/String;", "getSubtitle", "getMaxAmount", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MaximumLimit extends ErrorInfo {
        public static final int $stable = 8;
        private static int component3 = 0;
        private static int copy = 1;
        private static int copydefault = 61 % 128;
        private static int getRequestBeneficiariesState;
        private final BigDecimal ShareDataUIState;
        private final String component1;
        private final String component2;

        /* JADX WARN: Illegal instructions before constructor call */
        public MaximumLimit(String str, String str2, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = getRequestBeneficiariesState + 101;
                int i3 = i2 % 128;
                copy = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 45;
                getRequestBeneficiariesState = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                str2 = null;
            }
            this(str, str2, bigDecimal);
        }

        @Override
        public String getDescription() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 31;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public String getSubtitle() {
            String str;
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 115;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.component2;
                int i4 = 7 / 0;
            } else {
                str = this.component2;
            }
            int i5 = i2 + 45;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return str;
        }

        public final BigDecimal getMaxAmount() {
            int i = 2 % 2;
            int i2 = copy + 55;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                return this.ShareDataUIState;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaximumLimit(String str, String str2, BigDecimal bigDecimal) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.component1 = str;
            this.component2 = str2;
            this.ShareDataUIState = bigDecimal;
        }

        static {
            int i = 61 % 2;
        }

        public static MaximumLimit copy$default(MaximumLimit maximumLimit, String str, String str2, BigDecimal bigDecimal, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = getRequestBeneficiariesState;
            int i4 = i3 + 49;
            copy = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                str = maximumLimit.component1;
            }
            if ((i & 2) != 0) {
                str2 = maximumLimit.component2;
            }
            if ((i & 4) != 0) {
                int i6 = i3 + 45;
                copy = i6 % 128;
                int i7 = i6 % 2;
                bigDecimal = maximumLimit.ShareDataUIState;
            }
            return maximumLimit.copy(str, str2, bigDecimal);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copy + 119;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component1;
            if (i3 != 0) {
                int i4 = 56 / 0;
            }
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = copy + 107;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component2;
            if (i3 != 0) {
                int i4 = 3 / 0;
            }
            return str;
        }

        public final BigDecimal component3() {
            int i = 2 % 2;
            int i2 = copy + 79;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            BigDecimal bigDecimal = this.ShareDataUIState;
            if (i3 != 0) {
                int i4 = 56 / 0;
            }
            return bigDecimal;
        }

        public final MaximumLimit copy(String description, String subtitle, BigDecimal maxAmount) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(description, "");
            Intrinsics.checkNotNullParameter(maxAmount, "");
            MaximumLimit maximumLimit = new MaximumLimit(description, subtitle, maxAmount);
            int i2 = copy + 61;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                return maximumLimit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit) != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            r2 = r2 + 107;
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit.copy = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component1, r6.component1) == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.component2, r6.component2) != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.ShareDataUIState, r6.ShareDataUIState) == true) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        
            r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit.getRequestBeneficiariesState + 67;
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit.copy = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r2 = r2 + 81;
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit.copy = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit.copy
                int r1 = r1 + 15
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit.getRequestBeneficiariesState = r2
                int r1 = r1 % r0
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L16
                r1 = 72
                int r1 = r1 / r4
                if (r5 != r6) goto L20
                goto L18
            L16:
                if (r5 != r6) goto L20
            L18:
                int r2 = r2 + 81
                int r6 = r2 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit.copy = r6
                int r2 = r2 % r0
                return r3
            L20:
                boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit
                if (r1 != 0) goto L2c
                int r2 = r2 + 107
                int r6 = r2 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit.copy = r6
                int r2 = r2 % r0
                return r4
            L2c:
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo$MaximumLimit r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit) r6
                java.lang.String r1 = r5.component1
                java.lang.String r2 = r6.component1
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 == 0) goto L58
                java.lang.String r1 = r5.component2
                java.lang.String r2 = r6.component2
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                if (r1 != 0) goto L43
                return r4
            L43:
                java.math.BigDecimal r1 = r5.ShareDataUIState
                java.math.BigDecimal r6 = r6.ShareDataUIState
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
                if (r6 == r3) goto L57
                int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit.getRequestBeneficiariesState
                int r6 = r6 + 67
                int r1 = r6 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit.copy = r1
                int r6 = r6 % r0
                return r4
            L57:
                return r3
            L58:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorInfo.MaximumLimit.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int i3 = copy + 49;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 != 0) {
                this.component1.hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = this.component1.hashCode();
            String str = this.component2;
            if (str == null) {
                i = 0;
            } else {
                int iHashCode2 = str.hashCode();
                int i4 = getRequestBeneficiariesState + 107;
                copy = i4 % 128;
                int i5 = i4 % 2;
                i = iHashCode2;
            }
            return (((iHashCode * 31) + i) * 31) + this.ShareDataUIState.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MaximumLimit(description=" + this.component1 + ", subtitle=" + this.component2 + ", maxAmount=" + this.ShareDataUIState + ')';
            int i2 = copy + 59;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$MinimumLimit;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo;", "description", "", "subtitle", "minAmount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getDescription", "()Ljava/lang/String;", "getSubtitle", "getMinAmount", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MinimumLimit extends ErrorInfo {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component2 = 71 % 128;
        private static int equals = 0;
        private static int getAsAtTimestamp = 1;
        private final String component1;
        private final BigDecimal component3;
        private final String copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        public MinimumLimit(String str, String str2, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = equals + 45;
                int i3 = i2 % 128;
                getAsAtTimestamp = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i4 = i3 + 13;
                equals = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                str2 = null;
            }
            this(str, str2, bigDecimal);
        }

        @Override
        public String getDescription() {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 65;
            getAsAtTimestamp = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.component1;
            int i4 = i2 + 71;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public String getSubtitle() {
            int i = 2 % 2;
            int i2 = equals + 53;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            String str = this.copydefault;
            int i5 = i3 + 59;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final BigDecimal getMinAmount() {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 43;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            BigDecimal bigDecimal = this.component3;
            int i5 = i2 + 9;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            return bigDecimal;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MinimumLimit(String str, String str2, BigDecimal bigDecimal) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.component1 = str;
            this.copydefault = str2;
            this.component3 = bigDecimal;
        }

        static {
            if (71 % 2 == 0) {
                int i = 33 / 0;
            }
        }

        public static MinimumLimit copy$default(MinimumLimit minimumLimit, String str, String str2, BigDecimal bigDecimal, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = getAsAtTimestamp;
            int i4 = i3 + 121;
            equals = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 53;
                equals = i6 % 128;
                int i7 = i6 % 2;
                str = minimumLimit.component1;
                if (i7 != 0) {
                    int i8 = 77 / 0;
                }
            }
            if ((i & 2) != 0) {
                str2 = minimumLimit.copydefault;
            }
            if ((i & 4) != 0) {
                bigDecimal = minimumLimit.component3;
            }
            return minimumLimit.copy(str, str2, bigDecimal);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 79;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component1;
            int i5 = i2 + 77;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 89;
            equals = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 97;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final BigDecimal component3() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 101;
            equals = i3 % 128;
            int i4 = i3 % 2;
            BigDecimal bigDecimal = this.component3;
            int i5 = i2 + 113;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return bigDecimal;
        }

        public final MinimumLimit copy(String description, String subtitle, BigDecimal minAmount) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(description, "");
            Intrinsics.checkNotNullParameter(minAmount, "");
            MinimumLimit minimumLimit = new MinimumLimit(description, subtitle, minAmount);
            int i2 = getAsAtTimestamp + 31;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 6 / 0;
            }
            return minimumLimit;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = getAsAtTimestamp + 59;
                equals = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof MinimumLimit)) {
                return false;
            }
            MinimumLimit minimumLimit = (MinimumLimit) other;
            if (!Intrinsics.areEqual(this.component1, minimumLimit.component1)) {
                int i4 = equals + 79;
                getAsAtTimestamp = i4 % 128;
                return i4 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.copydefault, minimumLimit.copydefault)) {
                return false;
            }
            if (Intrinsics.areEqual(this.component3, minimumLimit.component3)) {
                return true;
            }
            int i5 = getAsAtTimestamp + 103;
            equals = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 9;
            equals = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.component1.hashCode();
            String str = this.copydefault;
            if (str == null) {
                int i4 = getAsAtTimestamp + 95;
                equals = i4 % 128;
                iHashCode = i4 % 2 != 0 ? 1 : 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (((iHashCode2 * 31) + iHashCode) * 31) + this.component3.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "MinimumLimit(description=" + this.component1 + ", subtitle=" + this.copydefault + ", minAmount=" + this.component3 + ')';
            int i2 = getAsAtTimestamp + 87;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0006H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$WrongPin;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo;", "description", "", "subtitle", "attemptsRemaining", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getSubtitle", "getAttemptsRemaining", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WrongPin extends ErrorInfo {
        public static final int $stable = 0;
        private static int ShareDataUIState = 21 % 128;
        private static int component1 = 0;
        private static int equals = 0;
        private static int getRequestBeneficiariesState = 1;
        private final int component2;
        private final String component3;
        private final String copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        public WrongPin(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i2 & 2) != 0) {
                int i3 = getRequestBeneficiariesState;
                int i4 = i3 + 103;
                equals = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 65;
                equals = i6 % 128;
                int i7 = i6 % 2;
                int i8 = 2 % 2;
                str2 = null;
            }
            this(str, str2, i);
        }

        @Override
        public String getDescription() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 87;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                return this.copydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public String getSubtitle() {
            int i = 2 % 2;
            int i2 = equals + 51;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 45;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 0;
            }
            return str;
        }

        public final int getAttemptsRemaining() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 113;
            equals = i2 % 128;
            int i3 = i2 % 2;
            int i4 = this.component2;
            if (i3 != 0) {
                int i5 = 83 / 0;
            }
            return i4;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WrongPin(String str, String str2, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.component3 = str2;
            this.component2 = i;
        }

        static {
            if (21 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static WrongPin copy$default(WrongPin wrongPin, String str, String str2, int i, int i2, Object obj) {
            int i3 = 2 % 2;
            int i4 = equals + 21;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            if ((i2 & 1) != 0) {
                str = wrongPin.copydefault;
            }
            if ((i2 & 2) != 0) {
                str2 = wrongPin.component3;
            }
            if ((i2 & 4) != 0) {
                i = wrongPin.component2;
            }
            WrongPin wrongPinCopy = wrongPin.copy(str, str2, i);
            int i6 = equals + 119;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return wrongPinCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 71;
            equals = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 67;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 22 / 0;
            }
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 109;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 63;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final int component3() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 97;
            equals = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.component2;
            int i6 = i2 + 71;
            equals = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final WrongPin copy(String description, String subtitle, int attemptsRemaining) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(description, "");
            WrongPin wrongPin = new WrongPin(description, subtitle, attemptsRemaining);
            int i2 = equals + 79;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                return wrongPin;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof WrongPin)) {
                int i2 = getRequestBeneficiariesState + 3;
                equals = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 52 / 0;
                }
                return false;
            }
            WrongPin wrongPin = (WrongPin) other;
            if (!Intrinsics.areEqual(this.copydefault, wrongPin.copydefault)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.component3, wrongPin.component3)) {
                int i4 = getRequestBeneficiariesState + 27;
                equals = i4 % 128;
                return i4 % 2 != 0;
            }
            if (this.component2 == wrongPin.component2) {
                return true;
            }
            int i5 = equals + 67;
            getRequestBeneficiariesState = i5 % 128;
            return i5 % 2 == 0;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int iHashCode = this.copydefault.hashCode();
            String str = this.component3;
            if (str == null) {
                int i3 = getRequestBeneficiariesState + 79;
                equals = i3 % 128;
                int i4 = i3 % 2;
                i = 0;
            } else {
                int iHashCode2 = str.hashCode();
                int i5 = equals + 79;
                getRequestBeneficiariesState = i5 % 128;
                int i6 = i5 % 2;
                i = iHashCode2;
            }
            return (((iHashCode * 31) + i) * 31) + Integer.hashCode(this.component2);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "WrongPin(description=" + this.copydefault + ", subtitle=" + this.component3 + ", attemptsRemaining=" + this.component2 + ')';
            int i2 = getRequestBeneficiariesState + 113;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$InsufficientFunds;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo;", "description", "", "subtitle", "availableBalance", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getDescription", "()Ljava/lang/String;", "getSubtitle", "getAvailableBalance", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InsufficientFunds extends ErrorInfo {
        public static final int $stable = 8;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int equals = 1;
        private static int getAsAtTimestamp;
        private final BigDecimal ShareDataUIState;
        private final String component2;
        private final String copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        public InsufficientFunds(String str, String str2, BigDecimal bigDecimal, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = getAsAtTimestamp;
                int i3 = i2 + 31;
                equals = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i2 + 43;
                equals = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                str2 = null;
            }
            this(str, str2, bigDecimal);
        }

        @Override
        public String getDescription() {
            int i = 2 % 2;
            int i2 = equals + 111;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public String getSubtitle() {
            String str;
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 41;
            int i3 = i2 % 128;
            equals = i3;
            if (i2 % 2 == 0) {
                str = this.copydefault;
                int i4 = 28 / 0;
            } else {
                str = this.copydefault;
            }
            int i5 = i3 + 75;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final BigDecimal getAvailableBalance() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 25;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            BigDecimal bigDecimal = this.ShareDataUIState;
            int i5 = i3 + 125;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            return bigDecimal;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InsufficientFunds(String str, String str2, BigDecimal bigDecimal) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.component2 = str;
            this.copydefault = str2;
            this.ShareDataUIState = bigDecimal;
        }

        static {
            int i = 1 + 49;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public static InsufficientFunds copy$default(InsufficientFunds insufficientFunds, String str, String str2, BigDecimal bigDecimal, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = equals;
            int i4 = i3 + 47;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                str = insufficientFunds.component2;
            }
            if ((i & 2) != 0) {
                int i6 = i3 + 75;
                getAsAtTimestamp = i6 % 128;
                if (i6 % 2 != 0) {
                    String str3 = insufficientFunds.copydefault;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str2 = insufficientFunds.copydefault;
            }
            if ((i & 4) != 0) {
                bigDecimal = insufficientFunds.ShareDataUIState;
            }
            InsufficientFunds insufficientFundsCopy = insufficientFunds.copy(str, str2, bigDecimal);
            int i7 = getAsAtTimestamp + 43;
            equals = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 12 / 0;
            }
            return insufficientFundsCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp;
            int i3 = i2 + 79;
            equals = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component2;
            int i5 = i2 + 45;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 99;
            getAsAtTimestamp = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 41;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final BigDecimal component3() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 3;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                return this.ShareDataUIState;
            }
            int i3 = 2 / 0;
            return this.ShareDataUIState;
        }

        public final InsufficientFunds copy(String description, String subtitle, BigDecimal availableBalance) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(description, "");
            Intrinsics.checkNotNullParameter(availableBalance, "");
            InsufficientFunds insufficientFunds = new InsufficientFunds(description, subtitle, availableBalance);
            int i2 = equals + 9;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 14 / 0;
            }
            return insufficientFunds;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 29;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(!(other instanceof InsufficientFunds))) {
                InsufficientFunds insufficientFunds = (InsufficientFunds) other;
                return Intrinsics.areEqual(this.component2, insufficientFunds.component2) && Intrinsics.areEqual(this.copydefault, insufficientFunds.copydefault) && Intrinsics.areEqual(this.ShareDataUIState, insufficientFunds.ShareDataUIState);
            }
            int i5 = i3 + 117;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int iHashCode = this.component2.hashCode();
            String str = this.copydefault;
            if (str == null) {
                int i3 = equals + 89;
                getAsAtTimestamp = i3 % 128;
                int i4 = i3 % 2;
                i = 0;
            } else {
                int iHashCode2 = str.hashCode();
                int i5 = equals + 15;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
                i = iHashCode2;
            }
            return (((iHashCode * 31) + i) * 31) + this.ShareDataUIState.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "InsufficientFunds(description=" + this.component2 + ", subtitle=" + this.copydefault + ", availableBalance=" + this.ShareDataUIState + ')';
            int i2 = equals + 51;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$ValidationIdExpired;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo;", "description", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ValidationIdExpired extends ErrorInfo {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int copydefault = 0;
        private static int equals = 1;
        private final String ShareDataUIState;
        private final String component3;

        /* JADX WARN: Illegal instructions before constructor call */
        public ValidationIdExpired(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = equals + 109;
                int i3 = i2 % 128;
                copydefault = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 11;
                equals = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
                str2 = null;
            }
            this(str, str2);
        }

        @Override
        public String getDescription() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 85;
            equals = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ShareDataUIState;
            int i5 = i2 + 59;
            equals = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        @Override
        public String getSubtitle() {
            int i = 2 % 2;
            int i2 = copydefault + 11;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 71;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationIdExpired(String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.ShareDataUIState = str;
            this.component3 = str2;
        }

        static {
            int i = 1 + 51;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public static ValidationIdExpired copy$default(ValidationIdExpired validationIdExpired, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault + 27;
            int i4 = i3 % 128;
            equals = i4;
            if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
                str = validationIdExpired.ShareDataUIState;
            }
            if ((i & 2) != 0) {
                int i5 = i4 + 91;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                str2 = validationIdExpired.component3;
            }
            return validationIdExpired.copy(str, str2);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = copydefault + 85;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                return this.ShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 41;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component3;
            int i5 = i2 + 61;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 75 / 0;
            }
            return str;
        }

        public final ValidationIdExpired copy(String description, String subtitle) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(description, "");
            ValidationIdExpired validationIdExpired = new ValidationIdExpired(description, subtitle);
            int i2 = copydefault + 107;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                return validationIdExpired;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copydefault + 53;
                equals = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof ValidationIdExpired)) {
                int i4 = equals + 99;
                copydefault = i4 % 128;
                return i4 % 2 != 0;
            }
            if (!Intrinsics.areEqual(this.ShareDataUIState, ((ValidationIdExpired) other).ShareDataUIState)) {
                int i5 = copydefault + 61;
                equals = i5 % 128;
                if (i5 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            if (!(!Intrinsics.areEqual(this.component3, r6.component3))) {
                return true;
            }
            int i6 = equals + 113;
            copydefault = i6 % 128;
            return i6 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = equals + 111;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.ShareDataUIState.hashCode();
            String str = this.component3;
            if (str == null) {
                int i4 = equals + 69;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ValidationIdExpired(description=" + this.ShareDataUIState + ", subtitle=" + this.component3 + ')';
            int i2 = copydefault + 79;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 94 / 0;
            }
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo$Generic;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorInfo;", "description", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Generic extends ErrorInfo {
        public static final int $stable = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int component4 = 1;
        private static int copydefault;
        private final String ShareDataUIState;
        private final String component1;

        /* JADX WARN: Illegal instructions before constructor call */
        public Generic(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = component4;
                int i3 = i2 + 5;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 29;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
                str2 = null;
            }
            this(str, str2);
        }

        @Override
        public String getDescription() {
            String str;
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 103;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.component1;
                int i4 = 39 / 0;
            } else {
                str = this.component1;
            }
            int i5 = i2 + 43;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override
        public String getSubtitle() {
            int i = 2 % 2;
            int i2 = component3 + 61;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            String str = this.ShareDataUIState;
            int i5 = i3 + 3;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Generic(String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.component1 = str;
            this.ShareDataUIState = str2;
        }

        static {
            int i = 1 + 23;
            copydefault = i % 128;
            if (i % 2 != 0) {
                int i2 = 96 / 0;
            }
        }

        public static Generic copy$default(Generic generic, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component3 + 15;
                component4 = i3 % 128;
                if (i3 % 2 == 0) {
                    String str3 = generic.component1;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str = generic.component1;
            }
            if ((i & 2) != 0) {
                int i4 = component4 + 59;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                str2 = generic.ShareDataUIState;
            }
            return generic.copy(str, str2);
        }

        public final String component1() {
            String str;
            int i = 2 % 2;
            int i2 = component4 + 1;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 != 0) {
                str = this.component1;
                int i4 = 50 / 0;
            } else {
                str = this.component1;
            }
            int i5 = i3 + 85;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String component2() {
            String str;
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 27;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.ShareDataUIState;
                int i4 = 28 / 0;
            } else {
                str = this.ShareDataUIState;
            }
            int i5 = i2 + 87;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Generic copy(String description, String subtitle) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(description, "");
            Generic generic = new Generic(description, subtitle);
            int i2 = component4 + 83;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return generic;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3 + 19;
            component4 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof Generic)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.component1, ((Generic) other).component1)) {
                int i3 = component3 + 21;
                component4 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.ShareDataUIState, r7.ShareDataUIState)) {
                int i5 = component4 + 53;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            int i6 = component3 + 113;
            component4 = i6 % 128;
            if (i6 % 2 != 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int iHashCode = this.component1.hashCode();
            String str = this.ShareDataUIState;
            if (str == null) {
                int i3 = component4 + 101;
                component3 = i3 % 128;
                i = i3 % 2 != 0 ? 1 : 0;
            } else {
                int iHashCode2 = str.hashCode();
                int i4 = component3 + 41;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                i = iHashCode2;
            }
            return (iHashCode * 31) + i;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Generic(description=" + this.component1 + ", subtitle=" + this.ShareDataUIState + ')';
            int i2 = component4 + 87;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            throw null;
        }
    }
}
