package com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0000J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/screens/manage/ShareDataEditBeneficiaryFormState;", "", "amountAllocated", "", "amountAllocatedError", "selectedPinType", "Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;", "previousAmount", "isValid", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;Ljava/lang/String;Z)V", "getAmountAllocated", "()Ljava/lang/String;", "getAmountAllocatedError", "getSelectedPinType", "()Lcom/huawei/digitalpayment/consumer/sfcui/utils/PinValidationType;", "getPreviousAmount", "()Z", "validate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareDataEditBeneficiaryFormState {
    public static final int $stable = 0;
    private static int component4;
    private static int copy;
    private static char equals;
    private static long getRequestBeneficiariesState;
    private final String ShareDataUIState;
    private final String component1;
    private final PinValidationType component2;
    private final String component3;
    private final boolean copydefault;
    private static final byte[] $$c = {Ascii.SI, -74, 84, -51};
    private static final int $$d = 155;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {109, 5, -57, 108, -38, -24, -29, -25, -25, -17, -35, -32, 39};
    private static final int $$b = 157;
    private static int hashCode = 0;
    private static int toString = 1;
    private static int getAsAtTimestamp = 0;

    private static String $$e(byte b2, short s, byte b3) {
        int i = s + 98;
        byte[] bArr = $$c;
        int i2 = b2 * 3;
        int i3 = 3 - (b3 * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i += -i3;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i += -bArr[i7];
            i3 = i7;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.$$a
            int r8 = r8 * 2
            int r8 = 10 - r8
            int r7 = r7 * 2
            int r7 = r7 + 99
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r6 = r6 + 1
            int r7 = r7 + (-26)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.b(byte, int, byte, java.lang.Object[]):void");
    }

    public ShareDataEditBeneficiaryFormState(String str, String str2, PinValidationType pinValidationType, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pinValidationType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component1 = str;
        this.component3 = str2;
        this.component2 = pinValidationType;
        this.ShareDataUIState = str3;
        this.copydefault = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShareDataEditBeneficiaryFormState(String str, String str2, PinValidationType pinValidationType, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        boolean z2;
        String str5 = "";
        String str6 = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            int i2 = toString + 23;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = toString + 113;
            hashCode = i5 % 128;
            if (i5 % 2 != 0) {
                pinValidationType = PinValidationType.UNDEFINED;
                int i6 = 42 / 0;
            } else {
                pinValidationType = PinValidationType.UNDEFINED;
            }
        }
        PinValidationType pinValidationType2 = pinValidationType;
        if ((i & 8) != 0) {
            int i7 = toString + 123;
            hashCode = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str5 = str3;
        }
        if ((i & 16) != 0) {
            int i9 = 2 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        this(str6, str4, pinValidationType2, str5, z2);
    }

    public final String getAmountAllocated() {
        int i = 2 % 2;
        int i2 = hashCode + 97;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 13;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmountAllocatedError() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 53;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.component3;
        int i4 = i2 + 29;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final PinValidationType getSelectedPinType() {
        int i = 2 % 2;
        int i2 = toString + 9;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        PinValidationType pinValidationType = this.component2;
        int i5 = i3 + 13;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return pinValidationType;
    }

    public final String getPreviousAmount() {
        int i = 2 % 2;
        int i2 = toString + 7;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 87;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isValid() {
        int i = 2 % 2;
        int i2 = hashCode + 113;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 113;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState validate() {
        /*
            r14 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.hashCode
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.toString = r2
            int r1 = r1 % r0
            java.lang.String r1 = r14.component1
            java.lang.Integer r1 = kotlin.text.StringsKt.toIntOrNull(r1)
            java.lang.String r2 = r14.ShareDataUIState
            java.lang.Integer r2 = kotlin.text.StringsKt.toIntOrNull(r2)
            r3 = 0
            if (r2 == 0) goto L20
            int r2 = r2.intValue()
            goto L21
        L20:
            r2 = r3
        L21:
            java.lang.String r4 = r14.component1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            r5 = 1
            if (r4 == r5) goto L62
            if (r1 != 0) goto L31
            java.lang.String r1 = "Invalid amount"
            goto L64
        L31:
            int r4 = r1.intValue()
            r6 = 10
            if (r4 >= r6) goto L3c
            java.lang.String r1 = "Minimum amount is 10 MB"
            goto L64
        L3c:
            int r4 = r1.intValue()
            r6 = 5120(0x1400, float:7.175E-42)
            if (r4 <= r6) goto L47
            java.lang.String r1 = "Maximum amount is 5120 MB"
            goto L64
        L47:
            int r1 = r1.intValue()
            r4 = 0
            if (r1 != r2) goto L60
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.hashCode
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.toString = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L5c
            java.lang.String r1 = "New amount must be different from previous amount"
            goto L64
        L5c:
            r4.hashCode()
            throw r4
        L60:
            r8 = r4
            goto L65
        L62:
            java.lang.String r1 = "Amount is required"
        L64:
            r8 = r1
        L65:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.toString
            int r1 = r1 + 123
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.hashCode = r2
            int r1 = r1 % r0
            com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType r1 = r14.component2
            com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType r2 = com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType.UNDEFINED
            if (r1 == r2) goto L7f
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.toString
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.hashCode = r2
            int r1 = r1 % r0
            r1 = r5
            goto L80
        L7f:
            r1 = r3
        L80:
            if (r8 != 0) goto L8f
            if (r1 == 0) goto L8f
            int r1 = com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.toString
            int r1 = r1 + 83
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.hashCode = r2
            int r1 = r1 % r0
            r11 = r5
            goto L90
        L8f:
            r11 = r3
        L90:
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 13
            r13 = 0
            r6 = r14
            com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState r0 = copy$default(r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState.validate():com.huawei.digitalpayment.consumer.sfcui.sharedata.screens.manage.ShareDataEditBeneficiaryFormState");
    }

    private static void a(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
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
            int i5 = $10 + 21;
            $11 = i5 % 128;
            int i6 = i5 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int gidForName = Process.getGidForName("") + 4038;
                    int offsetBefore = TextUtils.getOffsetBefore("", i4) + 31;
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i4) + 19182);
                    byte b2 = (byte) i4;
                    byte b3 = (byte) (b2 + 1);
                    String str$$e = $$e(b2, b3, (byte) (b3 - 1));
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(gidForName, offsetBefore, cLastIndexOf, 1912513118, false, str$$e, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i4) + 7567;
                    int i7 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11;
                    char defaultSize = (char) View.getDefaultSize(i4, i4);
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, i7, defaultSize, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i4] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i4;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - (ViewConfiguration.getWindowTouchSlop() >> 8), 28 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 931716605, false, $$e(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7567, 11 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (getRequestBeneficiariesState ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) copy) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) equals) ^ (-3780477796495014671L)))));
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
        }
        String str = new String(cArr6);
        int i9 = $10 + 53;
        $11 = i9 % 128;
        if (i9 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public int hashCode() throws Throwable {
        long j;
        int i = 2 % 2;
        int i2 = hashCode + 105;
        toString = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component1.hashCode();
        String str = this.component3;
        int iHashCode2 = ((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.component2.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 67, 33 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 19697), 520092524, false, "component2", null);
        }
        int i4 = ((Field) objCopydefault).getInt(null);
        Object[] objArr = new Object[1];
        a((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{63021, 42618, 32310, 39223, 57995, 4679, 7701, 62425, 11795, 8888, 32035, 8628, 54157, 46890, 7481, 17618, 29446, 47495, 48145, 1023, 18081, 25006}, new char[]{49008, 32736, 23065, 52213}, new char[]{0, 0, 0, 0}, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        int i5 = 16;
        Object[] objArr2 = new Object[1];
        a((char) (39619 - (ViewConfiguration.getLongPressTimeout() >> 16)), (-1101700301) - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{41735, 23271, 30353, 27355, 62725, 34372, 48447, 9055, 43591, 55701, 48220, 61071, 6863, 65478, 2466}, new char[]{13287, 21859, 50110, 46234}, new char[]{0, 0, 0, 0}, objArr2);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
        long j2 = -575;
        long j3 = (j2 * 384210698946375227L) + (j2 * 4071512397660135098L);
        long j4 = 576;
        long j5 = -1;
        long j6 = j5 ^ 384210698946375227L;
        long j7 = j5 ^ 4071512397660135098L;
        long j8 = (j6 | j7) ^ j5;
        long jIdentityHashCode = System.identityHashCode(this);
        long j9 = j3 + ((j8 | ((j7 | jIdentityHashCode) ^ j5)) * j4) + ((((j6 | 4071512397660135098L) ^ j5) | (((j7 | (jIdentityHashCode ^ j5)) | 384210698946375227L) ^ j5)) * j4) + (j4 * j8);
        int i6 = 0;
        while (true) {
            if (i6 != 10) {
                int i7 = toString + 17;
                hashCode = i7 % 128;
                int i8 = i7 % 2;
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatTimeout() >> i5) + 37, 30 - (ViewConfiguration.getTapTimeout() >> i5), (char) Color.red(0), 846241313, false, "copydefault", null);
                }
                int i9 = ((Field) objCopydefault2).getInt(null);
                long j10 = jLongValue;
                int i10 = 0;
                while (true) {
                    int i11 = 0;
                    while (i11 != 8) {
                        i9 = (((((int) (j10 >> i11)) & 255) + (i9 << 6)) + (i9 << 16)) - i9;
                        i11++;
                        jLongValue = jLongValue;
                    }
                    j = jLongValue;
                    if (i10 != 0) {
                        break;
                    }
                    i10++;
                    j10 = j9;
                    jLongValue = j;
                }
                if (i9 == i4) {
                    break;
                }
                int i12 = hashCode + 77;
                toString = i12 % 128;
                int i13 = i12 % 2;
                jLongValue = j - 1024;
                i6++;
                i5 = 16;
            } else {
                Object[] objArr3 = new Object[1];
                a((char) (47333 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), ViewConfiguration.getFadingEdgeLength() >> 16, new char[]{37951, 30914, 64637, 61837, 19863, 3640, 29043, 34452, 50657, 62860, 11742, 30341, 13024, 36952, 48792, 16640}, new char[]{44239, 26026, 58378, 15288}, new char[]{0, 0, 0, 0}, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a((char) (59236 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{20413, 25996, 56386, 21190, 7312, 253, 51529, 6077, 39456, 28977, 63992, 7947, 64743, 35663, 10618, 50030}, new char[]{2118, 21797, 25349, 48615}, new char[]{0, 0, 0, 0}, objArr4);
                int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr5 = {1343711779};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1662 - TextUtils.indexOf((CharSequence) "", '0', 0), 10 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1006506020, false, null, new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1118622833, ((Constructor) objCopydefault3).newInstance(objArr5), false};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                    if (objCopydefault4 == null) {
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1454;
                        int capsMode = 22 - TextUtils.getCapsMode("", 0, 0);
                        char c2 = (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr7 = new Object[1];
                        b(b2, b3, b3, objArr7);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, capsMode, c2, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 1591, 39 - View.resolveSizeAndState(0, 0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16)), Boolean.TYPE});
                    }
                    Object[] objArr8 = (Object[]) ((Method) objCopydefault4).invoke(null, objArr6);
                    int i14 = ((int[]) objArr8[2])[0];
                    int i15 = ((int[]) objArr8[1])[0];
                    if (i15 != i14) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr8[3];
                        if (strArr != null) {
                            for (String str2 : strArr) {
                                arrayList.add(str2);
                            }
                        }
                        long j11 = -1;
                        long j12 = 0;
                        long j13 = (((j11 - ((j11 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i15 ^ i14))) | (((long) 1) << 32) | (j12 - ((j12 >> 63) << 32));
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                        if (objCopydefault5 == null) {
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 6618, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 41, (char) ExpandableListView.getPackedPositionGroup(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                        }
                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                        Object[] objArr9 = {1343711779, Long.valueOf(j13), arrayList, null, false, false};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                        if (objCopydefault6 == null) {
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault((Process.myTid() >> 22) + 6562, 56 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) KeyEvent.getDeadChar(0, 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                        }
                        ((Method) objCopydefault6).invoke(objInvoke, objArr9);
                        throw null;
                    }
                    int i16 = hashCode + 51;
                    toString = i16 % 128;
                    int i17 = i16 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        return iHashCode2 + Boolean.hashCode(this.copydefault);
    }

    static {
        component4 = 1;
        ShareDataUIState();
        int i = getAsAtTimestamp + 51;
        component4 = i % 128;
        int i2 = i % 2;
    }

    public ShareDataEditBeneficiaryFormState() {
        this(null, null, null, null, false, 31, null);
    }

    public static ShareDataEditBeneficiaryFormState copy$default(ShareDataEditBeneficiaryFormState shareDataEditBeneficiaryFormState, String str, String str2, PinValidationType pinValidationType, String str3, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = hashCode;
        int i4 = i3 + 65;
        toString = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = shareDataEditBeneficiaryFormState.component1;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = shareDataEditBeneficiaryFormState.component3;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            pinValidationType = shareDataEditBeneficiaryFormState.component2;
        }
        PinValidationType pinValidationType2 = pinValidationType;
        if ((i & 8) != 0) {
            str3 = shareDataEditBeneficiaryFormState.ShareDataUIState;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            int i6 = i3 + 77;
            toString = i6 % 128;
            int i7 = i6 % 2;
            z = shareDataEditBeneficiaryFormState.copydefault;
        }
        return shareDataEditBeneficiaryFormState.copy(str4, str5, pinValidationType2, str6, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = toString + 43;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 53;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = toString + 57;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 25;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PinValidationType component3() {
        int i = 2 % 2;
        int i2 = hashCode + 57;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = toString + 53;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 1;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 5;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault;
        int i5 = i2 + 59;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ShareDataEditBeneficiaryFormState copy(String amountAllocated, String amountAllocatedError, PinValidationType selectedPinType, String previousAmount, boolean isValid) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amountAllocated, "");
        Intrinsics.checkNotNullParameter(selectedPinType, "");
        Intrinsics.checkNotNullParameter(previousAmount, "");
        ShareDataEditBeneficiaryFormState shareDataEditBeneficiaryFormState = new ShareDataEditBeneficiaryFormState(amountAllocated, amountAllocatedError, selectedPinType, previousAmount, isValid);
        int i2 = toString + 125;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return shareDataEditBeneficiaryFormState;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = hashCode + 105;
            toString = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof ShareDataEditBeneficiaryFormState)) {
            int i3 = toString + 1;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        ShareDataEditBeneficiaryFormState shareDataEditBeneficiaryFormState = (ShareDataEditBeneficiaryFormState) other;
        if (!Intrinsics.areEqual(this.component1, shareDataEditBeneficiaryFormState.component1)) {
            int i5 = hashCode + 41;
            toString = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, shareDataEditBeneficiaryFormState.component3)) {
            int i7 = hashCode + 123;
            int i8 = i7 % 128;
            toString = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 7;
            hashCode = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.component2 != shareDataEditBeneficiaryFormState.component2) {
            int i12 = toString + 83;
            hashCode = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, shareDataEditBeneficiaryFormState.ShareDataUIState)) {
            return false;
        }
        if (this.copydefault == shareDataEditBeneficiaryFormState.copydefault) {
            return true;
        }
        int i14 = toString + 35;
        hashCode = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ShareDataEditBeneficiaryFormState(amountAllocated=" + this.component1 + ", amountAllocatedError=" + this.component3 + ", selectedPinType=" + this.component2 + ", previousAmount=" + this.ShareDataUIState + ", isValid=" + this.copydefault + ")";
        int i2 = toString + 85;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static void ShareDataUIState() {
        getRequestBeneficiariesState = -3780477796495014671L;
        copy = 1386857713;
        equals = (char) 51471;
    }
}
