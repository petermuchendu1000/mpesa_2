package com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancel;
import kotlin.cancelAll;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u001aH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePaymentPayload;", "Landroid/os/Parcelable;", "msisdn", "", "accountId", "amount", "pin", "channelSessionId", "useOd", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getAccountId", "getAmount", "getPin", "getChannelSessionId", "getUseOd", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibrePaymentPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibrePaymentPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("channelSessionId")
    private final String channelSessionId;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("pin")
    private final String pin;

    @SerializedName("useOd")
    private final String useOd;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibrePaymentPayload> {
        private static final byte[] $$c = {Base64.padSymbol, -49, -70, 93};
        private static final int $$f = 249;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {79, -25, -14, 102, -6, 5, -3};
        private static final int $$e = 187;
        private static final byte[] $$a = {113, 66, TarHeader.LF_CHR, 67, -11, 19, -23, -53, 60, -13, Ascii.VT, -9, -59, 36, Ascii.DC2, 8, -15, -6, 1, 1, -9, -1, -21, Ascii.SI, 0};
        private static final int $$b = 92;
        private static int equals = 0;
        private static int component4 = 1;
        private static char[] ShareDataUIState = {12827, 1969, 2024, 2028, 2021, 2017, 2030, 2034, 2039, 2035, 2019, 2029, 2033, 2037, 2027, 2041, 1971, 2015, 1966, 2031, 2022, 2036, 2042, 12825, 1967, 2018, 2038, 1965, 12824, 12831, 2040, 2020, 2032, 2023, 2025, 12830};
        private static char component1 = 12828;
        private static char[] component3 = {30232, 30239, 30428, 30238, 30250, 30229, 30251, 30234, 30237, 30249, 30236, 30244, 30245, 30248, 30247, 30242, 30255, 30243, 30225, 30235, 30241, 30429, 30231, 30246, 30420, 30431, 30228, 30230, 30259, 30430, 30417, 30253, 30435, 30224};
        private static int component2 = 321287822;
        private static boolean copydefault = true;
        private static boolean getRequestBeneficiariesState = true;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(int r6, int r7, short r8) {
            /*
                int r8 = r8 * 4
                int r0 = r8 + 1
                int r6 = r6 + 68
                byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePaymentPayload.Creator.$$c
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L12
                r3 = r7
                r4 = r2
                goto L28
            L12:
                r3 = r2
            L13:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L22:
                r3 = r1[r7]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r5
            L28:
                int r6 = -r6
                int r6 = r6 + r7
                r7 = r3
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePaymentPayload.Creator.$$g(int, int, short):java.lang.String");
        }

        private static void a(int i, int i2, int i3, Object[] objArr) {
            int i4 = i * 3;
            int i5 = 100 - i3;
            int i6 = i2 + 4;
            byte[] bArr = $$d;
            byte[] bArr2 = new byte[4 - i4];
            int i7 = 3 - i4;
            int i8 = -1;
            if (bArr == null) {
                i5 = i7 + (-i5) + 6;
                i8 = -1;
            }
            while (true) {
                int i9 = i8 + 1;
                bArr2[i9] = (byte) i5;
                i6++;
                if (i9 == i7) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i5 = i5 + (-bArr[i6]) + 6;
                    i8 = i9;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 + 4
                int r7 = 16 - r7
                byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePaymentPayload.Creator.$$a
                int r6 = 115 - r6
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L11
                r4 = r7
                r6 = r8
                r3 = r2
                goto L26
            L11:
                r3 = r2
                r5 = r8
                r8 = r6
                r6 = r5
            L15:
                byte r4 = (byte) r8
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                r4 = r0[r6]
            L26:
                int r8 = r8 + r4
                int r6 = r6 + 1
                int r8 = r8 + 2
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePaymentPayload.Creator.d(byte, short, short, java.lang.Object[]):void");
        }

        private static void c(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            cancel cancelVar = new cancel();
            char[] cArr2 = component3;
            char c2 = '0';
            int i3 = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = $10 + 77;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(cArr2[i6]);
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i3;
                            byte b3 = (byte) (b2 - 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(i3, i3) + 3760, (ViewConfiguration.getJumpTapTimeout() >> 16) + 24, (char) ((-1) - TextUtils.indexOf("", c2)), -1670574543, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i6++;
                        c2 = '0';
                        i3 = 0;
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
            Object[] objArr3 = {Integer.valueOf(component2)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7139, 12 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            if (getRequestBeneficiariesState) {
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                int i7 = $11 + 119;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    try {
                        Object[] objArr4 = {cancelVar, cancelVar};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) (-1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2747 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 19 - TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7644), -327556343, false, $$g((byte) 5, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
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
                int i9 = $11 + 105;
                $10 = i9 % 128;
                if (i9 % 2 == 0) {
                    objArr[0] = str;
                    return;
                } else {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            if (!copydefault) {
                cancelVar.component1 = iArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    cancelVar.component3++;
                    int i10 = $11 + 81;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i12 = $11 + 51;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cancelVar.component1 = cArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) (-1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, (char) (7644 - TextUtils.getTrimmedLength("")), -327556343, false, $$g((byte) 5, b5, (byte) (b5 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
        }

        private static void b(byte b2, char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            int i3 = 2 % 2;
            cancelAll cancelall = new cancelAll();
            char[] cArr2 = ShareDataUIState;
            int i4 = -303193356;
            long j = 0;
            Object obj2 = null;
            if (cArr2 != null) {
                int i5 = $10 + 73;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7421 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, (char) (64291 - ((Process.getThreadPriority(0) + 20) >> 6)), 682917265, false, "v", new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        i7++;
                        i4 = -303193356;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i8 = $11 + 37;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 / 4;
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(component1)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - KeyEvent.getDeadChar(0, 0), 15 - Color.argb(0, 0, 0, 0), (char) (64291 - ((Process.getThreadPriority(0) + 20) >> 6)), 682917265, false, "v", new Class[]{Integer.TYPE});
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
                int i10 = $11 + 109;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cancelall.component2 = 0;
                while (cancelall.component2 < i2) {
                    cancelall.component1 = cArr[cancelall.component2];
                    cancelall.component3 = cArr[cancelall.component2 + 1];
                    if (cancelall.component1 == cancelall.component3) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 7117, 14 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (TextUtils.getCapsMode("", 0, 0) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) (-1);
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 2945, 24 - Color.argb(0, 0, 0, 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27638), 794909189, false, $$g((byte) 51, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                        } else {
                            obj = null;
                            if (cancelall.copydefault == cancelall.ShareDataUIState) {
                                cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                                cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                                int i13 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                                int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                                cArr4[cancelall.component2] = cArr2[i13];
                                cArr4[cancelall.component2 + 1] = cArr2[i14];
                            } else {
                                int i15 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                                int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                                cArr4[cancelall.component2] = cArr2[i15];
                                cArr4[cancelall.component2 + 1] = cArr2[i16];
                                int i17 = $11 + 1;
                                $10 = i17 % 128;
                                int i18 = i17 % 2;
                            }
                        }
                    }
                    cancelall.component2 += 2;
                    obj2 = obj;
                }
            }
            for (int i19 = 0; i19 < i; i19++) {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePaymentPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FibrePaymentPayload fibrePaymentPayload = new FibrePaymentPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = equals + 93;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
            }
            return fibrePaymentPayload;
        }

        @Override
        public FibrePaymentPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = equals + 9;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            FibrePaymentPayload fibrePaymentPayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 82 / 0;
            }
            int i5 = component4 + 123;
            equals = i5 % 128;
            if (i5 % 2 == 0) {
                return fibrePaymentPayloadCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePaymentPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = equals + 5;
            int i4 = i3 % 128;
            component4 = i4;
            int i5 = i3 % 2;
            FibrePaymentPayload[] fibrePaymentPayloadArr = new FibrePaymentPayload[i];
            int i6 = i4 + 63;
            equals = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 96 / 0;
            }
            return fibrePaymentPayloadArr;
        }

        @Override
        public FibrePaymentPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component4 + 77;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(130:0|2|574|3|(1:5)|6|7|8|(1:10)(1:11)|12|13|(7:15|16|(1:18)|19|20|(12:22|23|(1:25)|26|27|28|(1:30)(1:31)|32|(7:34|(1:36)|37|38|(0)(1:41)|72|(6:74|75|(1:77)|78|79|(1:98))(4:82|(5:84|85|(1:87)|88|89)(5:90|91|(1:93)|94|95)|96|(0)))(1:42)|(6:44|45|(1:47)(1:48)|49|50|(0)(2:72|(0)(0)))(1:53)|(6:55|56|(1:58)|59|60|(0)(0))(1:63)|(6:65|66|(1:68)|69|70|(0)))(1:99)|100)(0)|101|102|(1:104)|105|(6:107|108|(1:110)|111|112|(11:114|115|(1:117)|118|119|120|(1:122)(1:123)|124|(115:126|(3:128|(1:130)|131)(4:132|(1:134)|135|136)|137|(0)(5:149|(8:152|153|(1:155)(1:156)|157|158|(2:160|(2:164|584)(2:163|585))(0)|165|150)|583|166|(1:168))|173|174|(1:176)|177|178|179|(1:181)(1:182)|183|184|(1:191)(1:190)|192|193|(1:195)(1:196)|197|198|199|(1:201)|202|203|(2:205|(1:210)(1:209))(0)|211|(1:213)(4:214|(6:216|217|(1:219)(1:220)|221|222|(2:598|224)(1:225))|597|213)|226|578|227|572|228|(1:230)|231|(6:233|234|(2:236|(8:587|241|242|568|243|(1:245)|246|(4:248|249|250|(3:252|(1:254)(6:258|562|259|(1:261)|262|(0)(1:266))|282)(3:255|(1:257)(0)|282))(1:282))(1:239))|586|240|282)(7:241|242|568|243|(0)|246|(0)(0))|283|(1:285)(2:286|(6:288|289|(1:291)|292|(3:294|302|(0)(3:305|(7:308|309|(1:311)(1:312)|313|314|(3:596|316|(1:318)(1:319))(1:320)|306)|595))|285)(6:295|296|(1:298)|299|(3:301|302|(0))|285))|321|322|(1:324)|325|326|(1:328)(2:329|(1:331)(2:332|(4:334|(4:339|(2:372|591)(7:345|579|346|347|(3:581|348|(3:350|(4:353|354|(3:570|356|(2:590|358)(0))(1:594)|351)|593)(2:564|359))|371|592)|373|335)|589|331)(0)))|374|375|(1:377)|378|379|(1:381)(1:382)|383|384|(1:386)|387|388|(1:390)(1:391)|392|393|(1:395)|396|397|(1:399)(1:400)|401|(5:403|404|(1:406)(1:407)|408|409)(1:410)|411|412|(1:414)|415|416|(1:418)(1:419)|420|(2:422|(5:426|(4:428|429|(1:431)(1:432)|433)(4:434|(1:436)|437|438)|439|(3:445|(1:447)(1:448)|449)|450))(1:(0))|451|452|(1:454)|455|456|457|(1:459)(1:460)|461|462|(5:464|465|(1:467)|468|469)|470|471|(1:473)|474|475|(1:477)(1:478)|479|(5:481|482|(1:484)|485|486)(1:487)|488|489|(1:491)|492|493|(1:495)|496|497|(1:499)|500|501|(1:503)(1:504)|505|(1:515)(5:509|510|(1:512)|513|514)|516|(5:518|519|(1:521)(1:522)|523|524)(1:525)|526|(5:528|529|(1:531)|532|533)(1:534)|535|536|(1:538)|539|566|(1:541)(1:543)|542|545|546)(1:140)|(6:142|143|(1:145)|146|147|(0))|169)(1:170))(1:171)|172|173|174|(0)|177|178|179|(0)(0)|183|184|(2:186|191)(0)|192|193|(0)(0)|197|198|199|(0)|202|203|(0)(0)|211|(0)(0)|226|578|227|572|228|(0)|231|(0)(0)|283|(0)(0)|321|322|(0)|325|326|(0)(0)|374|375|(0)|378|379|(0)(0)|383|384|(0)|387|388|(0)(0)|392|393|(0)|396|397|(0)(0)|401|(0)(0)|411|412|(0)|415|416|(0)(0)|420|(0)(0)|451|452|(0)|455|456|457|(0)(0)|461|462|(0)|470|471|(0)|474|475|(0)(0)|479|(0)(0)|488|489|(0)|492|493|(0)|496|497|(0)|500|501|(0)(0)|505|(2:507|515)(0)|516|(0)(0)|526|(0)(0)|535|536|(0)|539|566|(0)(0)|542|545|546|(1:(0))) */
        /* JADX WARN: Removed duplicated region for block: B:149:0x1646 A[PHI: r6 r34 r45
  0x1646: PHI (r6v142 int) = (r6v141 int), (r6v155 int) binds: [B:148:0x1644, B:138:0x1534] A[DONT_GENERATE, DONT_INLINE]
  0x1646: PHI (r34v3 java.lang.String) = (r34v2 java.lang.String), (r34v8 java.lang.String) binds: [B:148:0x1644, B:138:0x1534] A[DONT_GENERATE, DONT_INLINE]
  0x1646: PHI (r45v18 java.lang.String[]) = (r45v17 java.lang.String[]), (r45v24 java.lang.String[]) binds: [B:148:0x1644, B:138:0x1534] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:164:0x17ce  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x185b A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:181:0x1983 A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:182:0x19c9  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x1aa1  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x1af7 A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:196:0x1b35  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x1c0b A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:205:0x1cdf  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x1cfb  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x1e61 A[PHI: r1
  0x1e61: PHI (r1v377 int) = (r1v68 int), (r1v69 int) binds: [B:212:0x1e5f, B:597:0x1e61] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:214:0x1e65  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x200c A[Catch: all -> 0x2237, TryCatch #7 {all -> 0x2237, blocks: (B:228:0x1fff, B:230:0x200c, B:231:0x2052), top: B:572:0x1fff, outer: #12 }] */
        /* JADX WARN: Removed duplicated region for block: B:233:0x205d  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x20a9  */
        /* JADX WARN: Removed duplicated region for block: B:245:0x20dd A[Catch: all -> 0x222d, TryCatch #3 {all -> 0x222d, blocks: (B:243:0x20d0, B:245:0x20dd, B:246:0x2128), top: B:568:0x20d0, outer: #12 }] */
        /* JADX WARN: Removed duplicated region for block: B:248:0x2131  */
        /* JADX WARN: Removed duplicated region for block: B:258:0x2191 A[Catch: Exception -> 0x2241, TRY_LEAVE, TryCatch #12 {Exception -> 0x2241, blocks: (B:227:0x1fd8, B:234:0x205e, B:236:0x2084, B:242:0x20ab, B:249:0x2132, B:252:0x2155, B:258:0x2191, B:264:0x221a, B:266:0x2220, B:268:0x2224, B:270:0x222b, B:271:0x222c, B:255:0x2170, B:273:0x222e, B:275:0x2235, B:276:0x2236, B:278:0x2238, B:280:0x223f, B:281:0x2240, B:259:0x21b9, B:261:0x21c6, B:262:0x220f, B:243:0x20d0, B:245:0x20dd, B:246:0x2128, B:228:0x1fff, B:230:0x200c, B:231:0x2052), top: B:578:0x1fd8, inners: #0, #3, #7 }] */
        /* JADX WARN: Removed duplicated region for block: B:282:0x2241  */
        /* JADX WARN: Removed duplicated region for block: B:285:0x225a A[PHI: r1
  0x225a: PHI (r1v375 int) = (r1v125 int), (r1v125 int), (r1v125 int), (r1v126 int), (r1v125 int) binds: [B:284:0x2258, B:300:0x236b, B:303:0x2391, B:595:0x225a, B:293:0x22f2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:286:0x225f  */
        /* JADX WARN: Removed duplicated region for block: B:305:0x2395  */
        /* JADX WARN: Removed duplicated region for block: B:324:0x2961 A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:328:0x2a4b  */
        /* JADX WARN: Removed duplicated region for block: B:329:0x2a4f  */
        /* JADX WARN: Removed duplicated region for block: B:331:0x2a55  */
        /* JADX WARN: Removed duplicated region for block: B:377:0x2c63 A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:381:0x2d50  */
        /* JADX WARN: Removed duplicated region for block: B:382:0x2d52  */
        /* JADX WARN: Removed duplicated region for block: B:386:0x2d84 A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:390:0x2e7b  */
        /* JADX WARN: Removed duplicated region for block: B:391:0x2e7d  */
        /* JADX WARN: Removed duplicated region for block: B:395:0x2e98 A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:399:0x2f65  */
        /* JADX WARN: Removed duplicated region for block: B:400:0x2f6c  */
        /* JADX WARN: Removed duplicated region for block: B:403:0x2f91  */
        /* JADX WARN: Removed duplicated region for block: B:410:0x30b1  */
        /* JADX WARN: Removed duplicated region for block: B:414:0x30bd A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:418:0x31a0  */
        /* JADX WARN: Removed duplicated region for block: B:419:0x31a7  */
        /* JADX WARN: Removed duplicated region for block: B:422:0x3237  */
        /* JADX WARN: Removed duplicated region for block: B:425:0x323e  */
        /* JADX WARN: Removed duplicated region for block: B:426:0x3240  */
        /* JADX WARN: Removed duplicated region for block: B:454:0x347f A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:459:0x362a A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:460:0x366d  */
        /* JADX WARN: Removed duplicated region for block: B:464:0x3738  */
        /* JADX WARN: Removed duplicated region for block: B:473:0x3840 A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:477:0x3933  */
        /* JADX WARN: Removed duplicated region for block: B:478:0x393d  */
        /* JADX WARN: Removed duplicated region for block: B:481:0x3956  */
        /* JADX WARN: Removed duplicated region for block: B:487:0x3a73  */
        /* JADX WARN: Removed duplicated region for block: B:491:0x3b17 A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:495:0x3bfc  */
        /* JADX WARN: Removed duplicated region for block: B:499:0x3c61 A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:503:0x3d50  */
        /* JADX WARN: Removed duplicated region for block: B:504:0x3d5f  */
        /* JADX WARN: Removed duplicated region for block: B:515:0x3ea8  */
        /* JADX WARN: Removed duplicated region for block: B:518:0x3eb6  */
        /* JADX WARN: Removed duplicated region for block: B:525:0x3fa3  */
        /* JADX WARN: Removed duplicated region for block: B:528:0x3fab  */
        /* JADX WARN: Removed duplicated region for block: B:534:0x4104  */
        /* JADX WARN: Removed duplicated region for block: B:538:0x4132 A[Catch: all -> 0x4297, TryCatch #8 {all -> 0x4297, blocks: (B:3:0x000a, B:5:0x0017, B:6:0x004a, B:8:0x0197, B:10:0x01a6, B:12:0x01f3, B:16:0x02a4, B:18:0x02b1, B:19:0x02fb, B:23:0x03a7, B:25:0x03b4, B:26:0x03fc, B:28:0x0431, B:30:0x043e, B:32:0x048b, B:34:0x0494, B:36:0x04ac, B:37:0x04f5, B:75:0x08ff, B:77:0x090c, B:78:0x0951, B:102:0x10bf, B:104:0x10cc, B:105:0x1115, B:108:0x1168, B:110:0x1175, B:111:0x11b5, B:115:0x1284, B:117:0x1291, B:118:0x12d9, B:120:0x1315, B:122:0x1322, B:124:0x1374, B:128:0x1389, B:130:0x139f, B:131:0x13e7, B:153:0x16bf, B:155:0x16cc, B:157:0x1716, B:174:0x184e, B:176:0x185b, B:177:0x189b, B:179:0x1976, B:181:0x1983, B:183:0x19cd, B:193:0x1aea, B:195:0x1af7, B:197:0x1b37, B:199:0x1bfe, B:201:0x1c0b, B:202:0x1c4e, B:322:0x293e, B:324:0x2961, B:325:0x29b1, B:375:0x2c40, B:377:0x2c63, B:378:0x2ca9, B:384:0x2d7e, B:386:0x2d84, B:387:0x2dbe, B:393:0x2e92, B:395:0x2e98, B:396:0x2ed1, B:404:0x2f94, B:406:0x2f9a, B:408:0x2fdf, B:412:0x30b7, B:414:0x30bd, B:415:0x30f6, B:452:0x3472, B:454:0x347f, B:455:0x34c7, B:457:0x3617, B:459:0x362a, B:461:0x366f, B:465:0x373b, B:467:0x3741, B:468:0x377c, B:471:0x383a, B:473:0x3840, B:474:0x387e, B:482:0x3959, B:484:0x395f, B:485:0x39a2, B:489:0x3af3, B:491:0x3b17, B:492:0x3b6a, B:497:0x3c54, B:499:0x3c61, B:500:0x3ca5, B:510:0x3d97, B:512:0x3d9d, B:513:0x3ddc, B:519:0x3eb9, B:521:0x3ebf, B:523:0x3efa, B:529:0x3fae, B:531:0x3fbb, B:532:0x3ffe, B:536:0x4108, B:538:0x4132, B:539:0x418c, B:429:0x324d, B:431:0x3253, B:433:0x3297, B:434:0x3301, B:436:0x330c, B:437:0x3345, B:289:0x2296, B:291:0x22a3, B:292:0x22e9, B:309:0x2724, B:311:0x2731, B:313:0x2778, B:296:0x230f, B:298:0x231c, B:299:0x2362, B:217:0x1e6b, B:219:0x1e78, B:221:0x1ebd, B:143:0x1540, B:145:0x1557, B:146:0x15a2, B:132:0x1433, B:134:0x144d, B:135:0x149a, B:85:0x0a2d, B:87:0x0a3a, B:88:0x0a7c, B:91:0x0a94, B:93:0x0aa1, B:94:0x0ae6, B:45:0x05af, B:47:0x05c6, B:49:0x0612, B:56:0x06bb, B:58:0x06d2, B:59:0x0716, B:66:0x07cb, B:68:0x07e2, B:69:0x082c), top: B:574:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:541:0x4194 A[Catch: all -> 0x428d, TRY_ENTER, TryCatch #2 {all -> 0x428d, blocks: (B:541:0x4194, B:542:0x41d1, B:543:0x41d5), top: B:566:0x4192 }] */
        /* JADX WARN: Removed duplicated region for block: B:543:0x41d5 A[Catch: all -> 0x428d, TRY_LEAVE, TryCatch #2 {all -> 0x428d, blocks: (B:541:0x4194, B:542:0x41d1, B:543:0x41d5), top: B:566:0x4192 }] */
        /* JADX WARN: Removed duplicated region for block: B:564:0x2b76 A[EXC_TOP_SPLITTER, PHI: r10
  0x2b76: PHI (r10v265 java.io.BufferedInputStream) = (r10v264 java.io.BufferedInputStream), (r10v267 java.io.BufferedInputStream) binds: [B:369:0x2b88, B:349:0x2b58] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x08ca A[PHI: r10
  0x08ca: PHI (r10v726 java.lang.String) = (r10v722 java.lang.String), (r10v722 java.lang.String), (r10v724 java.lang.String), (r10v738 java.lang.String) binds: [B:71:0x08c8, B:61:0x07bb, B:51:0x06b3, B:41:0x05a6] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x08d0  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x09ff  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0b1c  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0b1e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object[] ShareDataUIState$16dd2b22(int r67, int r68, java.lang.Object r69, int r70, boolean r71, boolean r72) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 18182
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibrePaymentPayload.Creator.ShareDataUIState$16dd2b22(int, int, java.lang.Object, int, boolean, boolean):java.lang.Object[]");
        }
    }

    public FibrePaymentPayload(String str, String str2, String str3, String str4, String str5, String str6) {
        this.msisdn = str;
        this.accountId = str2;
        this.amount = str3;
        this.pin = str4;
        this.channelSessionId = str5;
        this.useOd = str6;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 31;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 103;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.accountId;
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component2 + 43;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 67;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPin() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.pin;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return str;
    }

    public final String getChannelSessionId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 45;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.channelSessionId;
        int i5 = i2 + 69;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUseOd() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.useOd;
        int i5 = i3 + 17;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component3 + 21;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static FibrePaymentPayload copy$default(FibrePaymentPayload fibrePaymentPayload, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 97;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        String str9 = (i & 1) != 0 ? fibrePaymentPayload.msisdn : str;
        String str10 = (i & 2) != 0 ? fibrePaymentPayload.accountId : str2;
        String str11 = (i & 4) != 0 ? fibrePaymentPayload.amount : str3;
        String str12 = (i & 8) != 0 ? fibrePaymentPayload.pin : str4;
        if ((i & 16) != 0) {
            int i6 = i3 + 25;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                String str13 = fibrePaymentPayload.channelSessionId;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str7 = fibrePaymentPayload.channelSessionId;
        } else {
            str7 = str5;
        }
        if ((i & 32) != 0) {
            int i7 = i3 + 111;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            str8 = fibrePaymentPayload.useOd;
        } else {
            str8 = str6;
        }
        return fibrePaymentPayload.copy(str9, str10, str11, str12, str7, str8);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 31;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.accountId;
        int i5 = i3 + 27;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 81;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.pin;
        int i4 = i3 + 51;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.channelSessionId;
        int i5 = i3 + 113;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return str;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.useOd;
            int i4 = 84 / 0;
        } else {
            str = this.useOd;
        }
        int i5 = i2 + 7;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return str;
    }

    public final FibrePaymentPayload copy(String msisdn, String accountId, String amount, String pin, String channelSessionId, String useOd) {
        int i = 2 % 2;
        FibrePaymentPayload fibrePaymentPayload = new FibrePaymentPayload(msisdn, accountId, amount, pin, channelSessionId, useOd);
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return fibrePaymentPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 81;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FibrePaymentPayload)) {
            return false;
        }
        FibrePaymentPayload fibrePaymentPayload = (FibrePaymentPayload) other;
        if ((!Intrinsics.areEqual(this.msisdn, fibrePaymentPayload.msisdn)) || !Intrinsics.areEqual(this.accountId, fibrePaymentPayload.accountId) || !Intrinsics.areEqual(this.amount, fibrePaymentPayload.amount) || !Intrinsics.areEqual(this.pin, fibrePaymentPayload.pin)) {
            return false;
        }
        if (Intrinsics.areEqual(this.channelSessionId, fibrePaymentPayload.channelSessionId)) {
            return !(Intrinsics.areEqual(this.useOd, fibrePaymentPayload.useOd) ^ true);
        }
        int i4 = component2 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.msisdn;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.accountId;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.amount;
        if (str3 == null) {
            int i2 = ShareDataUIState + 41;
            component2 = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.pin;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.channelSessionId;
        if (str5 == null) {
            int i3 = ShareDataUIState + 105;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str5.hashCode();
            int i5 = ShareDataUIState + 47;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        String str6 = this.useOd;
        return (((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode2) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibrePaymentPayload(msisdn=" + this.msisdn + ", accountId=" + this.accountId + ", amount=" + this.amount + ", pin=" + this.pin + ", channelSessionId=" + this.channelSessionId + ", useOd=" + this.useOd + ")";
        int i2 = component2 + 65;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.accountId);
        dest.writeString(this.amount);
        dest.writeString(this.pin);
        dest.writeString(this.channelSessionId);
        dest.writeString(this.useOd);
        int i4 = component2 + 121;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
    }
}
