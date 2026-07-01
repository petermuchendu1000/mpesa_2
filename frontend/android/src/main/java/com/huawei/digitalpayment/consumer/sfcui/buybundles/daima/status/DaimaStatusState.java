package com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.status;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProduct;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductPaymentOption;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0007H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/status/DaimaStatusState;", "", "product", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "selectedPaymentOption", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;", "recipientNo", "", Keys.KEY_CUSTOMER_MESSAGE, "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;Ljava/lang/String;Ljava/lang/String;)V", "getProduct", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProduct;", "getSelectedPaymentOption", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;", "getRecipientNo", "()Ljava/lang/String;", "getCustomerMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DaimaStatusState {
    public static final int $stable = 0;
    private static int component1;
    private static long component4;
    private static int copy;
    private static int equals;
    private static byte[] getAsAtTimestamp;
    private static short[] getRequestBeneficiariesState;
    private static int toString;
    private final DaimaProductPaymentOption ShareDataUIState;
    private final String component2;
    private final DaimaProduct component3;
    private final String copydefault;
    private static final byte[] $$c = {99, TarHeader.LF_DIR, 44, 107};
    private static final int $$f = 55;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {117, -24, -14, 98, 39, Ascii.EM, Ascii.RS, Ascii.SUB, Ascii.SUB, Ascii.DC2, 36, 33, -39};
    private static final int $$e = 118;
    private static final byte[] $$a = {77, -64, 102, -128, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK};
    private static final int $$b = 174;
    private static int getSponsorBeneficiariesState = 0;
    private static int getShareableDataState = 1;
    private static int hashCode = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            int r7 = 116 - r7
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r0 = r8 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.status.DaimaStatusState.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L1f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L1f:
            int r6 = r6 + 1
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.status.DaimaStatusState.$$g(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 6
            int r0 = r6 + 10
            int r5 = r5 * 16
            int r5 = r5 + 83
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.status.DaimaStatusState.$$a
            int r7 = r7 * 3
            int r7 = 28 - r7
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r6
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
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-17)
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.status.DaimaStatusState.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 99 - r7
            int r8 = r8 * 2
            int r0 = 10 - r8
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.status.DaimaStatusState.$$d
            byte[] r0 = new byte[r0]
            int r8 = 9 - r8
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r3
            int r7 = r7 + 1
            int r6 = r6 + (-27)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.status.DaimaStatusState.d(short, byte, short, java.lang.Object[]):void");
    }

    public DaimaStatusState(DaimaProduct daimaProduct, DaimaProductPaymentOption daimaProductPaymentOption, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component3 = daimaProduct;
        this.ShareDataUIState = daimaProductPaymentOption;
        this.copydefault = str;
        this.component2 = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DaimaStatusState(DaimaProduct daimaProduct, DaimaProductPaymentOption daimaProductPaymentOption, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = getShareableDataState + 77;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            daimaProduct = null;
        }
        if ((i & 2) != 0) {
            int i5 = getSponsorBeneficiariesState + 121;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            daimaProductPaymentOption = null;
        }
        str = (i & 4) != 0 ? "" : str;
        if ((i & 8) != 0) {
            int i8 = 2 % 2;
            str2 = "";
        }
        this(daimaProduct, daimaProductPaymentOption, str, str2);
    }

    public final DaimaProduct getProduct() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 71;
        getSponsorBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        DaimaProduct daimaProduct = this.component3;
        int i4 = i2 + 59;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return daimaProduct;
        }
        obj.hashCode();
        throw null;
    }

    public final DaimaProductPaymentOption getSelectedPaymentOption() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 5;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        DaimaProductPaymentOption daimaProductPaymentOption = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return daimaProductPaymentOption;
    }

    public final String getRecipientNo() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 11;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 59;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCustomerMessage() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 91;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 15;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component4 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $11 + 81;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component4)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 7032, 33 - TextUtils.lastIndexOf("", '0'), (char) (63440 - View.combineMeasuredStates(0, 0)), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) (-1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 1390, View.resolveSize(0, 0) + 18, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 51269), -1883291598, false, $$g(b2, (byte) (b2 & 13), (byte) 0), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                    int i6 = $11 + 79;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
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
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    private static void c(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(copy)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            int i5 = -1;
            if (objCopydefault == null) {
                byte b3 = (byte) (-1);
                byte b4 = (byte) (b3 + 4);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 998, Color.red(0) + 31, (char) (61685 - TextUtils.getOffsetAfter("", 0)), 1874745193, false, $$g(b3, b4, (byte) (b4 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (!z) {
                j = 7083766810336261929L;
            } else {
                int i6 = $11 + 21;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = getAsAtTimestamp;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                        if (objCopydefault2 == null) {
                            byte b5 = (byte) i5;
                            byte b6 = (byte) (b5 + 1);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - (ViewConfiguration.getTapTimeout() >> 16), 49 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (54462 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), -1178636483, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        bArr2[i7] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        i7++;
                        i5 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getAsAtTimestamp;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component1)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault3 == null) {
                        byte b7 = (byte) (-1);
                        byte b8 = (byte) (b7 + 4);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - View.combineMeasuredStates(0, 0), 31 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 61686), 1874745193, false, $$g(b7, b8, (byte) (b8 - 3)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copy) ^ 7083766810336261929L)));
                    j = 7083766810336261929L;
                } else {
                    j = 7083766810336261929L;
                    iIntValue = (short) (((short) (((long) getRequestBeneficiariesState[i + ((int) (((long) component1) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copy) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) component1) ^ j)) + (!(z ^ true) ? 1 : 0);
                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(equals), sb};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault4 == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1698;
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 37;
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1);
                    byte length2 = (byte) $$c.length;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, packedPositionType, cLastIndexOf, -1454191902, false, $$g((byte) (-1), length2, (byte) (length2 - 4)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = getAsAtTimestamp;
                if (bArr4 != null) {
                    int length3 = bArr4.length;
                    byte[] bArr5 = new byte[length3];
                    int i8 = 0;
                    while (i8 < length3) {
                        bArr5[i8] = (byte) (((long) bArr4[i8]) ^ 7083766810336261929L);
                        i8++;
                        int i9 = $11 + 97;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i11 = $10;
                    int i12 = i11 + 55;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (z2) {
                        int i13 = i11 + 107;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        byte[] bArr6 = getAsAtTimestamp;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = getRequestBeneficiariesState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
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

    public final DaimaStatusState copy(DaimaProduct product, DaimaProductPaymentOption selectedPaymentOption, String recipientNo, String customerMessage) throws Throwable {
        int length;
        Object[] objArr;
        char c2;
        Object[] objArr2;
        int i = 2 % 2;
        int i2 = getShareableDataState + 75;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(recipientNo, "");
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1370061132);
        if (objCopydefault == null) {
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 824;
            int packedPositionType = 20 - ExpandableListView.getPackedPositionType(0L);
            char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 58322);
            byte b2 = (byte) (r4[20] - 1);
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 - 1), (byte) (-$$a[9]), objArr3);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, packedPositionType, doubleTapTimeout, 1796168145, false, (String) objArr3[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr4 = new Object[1];
        b(View.MeasureSpec.getSize(0) + 1, new char[]{13226, 8890, 14891, 13259, 61715, 40385, 39063, 58288, 31961, '0', 52453, 21192, 44541, 21302, 32707, 33097, 56967, 58322, 44733, 61531, 4023, 13006, 55737, 12093, 47173, 32130}, objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        b(1 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{29198, 54272, 20459, 29291, 1963, 59396, 9917, 23960, 15713, 63110, 47397, 60574, 60499, 42398, 2625, 16196, 40755, 5494, 56172}, objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(731302035);
        if (objCopydefault2 == null) {
            int packedPositionGroup = 824 - ExpandableListView.getPackedPositionGroup(0L);
            int i4 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19;
            char cLastIndexOf = (char) (58321 - TextUtils.lastIndexOf("", '0', 0));
            byte b3 = (byte) 0;
            Object[] objArr6 = new Object[1];
            a(b3, (byte) (b3 + 1), (byte) (-$$a[21]), objArr6);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(packedPositionGroup, i4, cLastIndexOf, -288417802, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1370984653);
            if (objCopydefault3 == null) {
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 824;
                int defaultSize = 20 - View.getDefaultSize(0, 0);
                char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 58321);
                byte b4 = (byte) ($$a[20] - 1);
                byte b5 = (byte) (b4 - 1);
                Object[] objArr7 = new Object[1];
                a(b4, b5, b5, objArr7);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity, defaultSize, c3, 1796321366, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{strArr, new int[1], new int[]{i}, new int[]{i}};
            int i5 = ((int[]) objArr8[2])[0];
            int i6 = ((int[]) objArr8[3])[0];
            String[] strArr = (String[]) objArr8[0];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i7 = ~iElapsedRealtime;
            int i8 = ((437951341 + (((~(295230815 | i7)) | (~((-394420868) | iElapsedRealtime))) * 210)) + (((~(iElapsedRealtime | 396034015)) | (~(i7 | (-293617668)))) * 210)) - 2043939454;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[1])[0] = i10 ^ (i10 << 5);
            c2 = 3;
        } else {
            Object[] objArr9 = new Object[1];
            b(TextUtils.getOffsetBefore("", 0) + 1, new char[]{54608, 8803, 14103, 54577, 61898, 37117, 57891, 39172, 39459, 233, 49625, 10364, 19209, 21484, 29345, 64384, 14405, 58139, 41857, 35555, 59734, 12861, 54429, 21919, 24200, 32088, 1151, 58535, 3993, 35944}, objArr9);
            Class<?> cls2 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            b(1 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{38479, 22744, 21748, 38444, 35690, 62216, 14805, 17138, 55606, 31317, 41514, 62437, 2055, 10583, 4446, 8241, 31608, 39330, 49250, 20757, 43600, 18561}, objArr10);
            Context applicationContext = (Context) cls2.getMethod((String) objArr10[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) {
                    int i11 = getShareableDataState + 113;
                    getSponsorBeneficiariesState = i11 % 128;
                    int i12 = i11 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                    int i13 = getSponsorBeneficiariesState + 103;
                    getShareableDataState = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            if (recipientNo != null) {
                length = recipientNo.length();
                int i15 = getSponsorBeneficiariesState + 29;
                getShareableDataState = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 3 % 2;
                }
            } else {
                length = 0;
            }
            Object[] objArr11 = new Object[1];
            b(1 - Color.red(0), new char[]{21267, 24431, 1386, 21365, 35985, 41600, 53268, 43889, 7276, 32238, 62369, 6738, 52552, 11940, 16585, 51707, 48754, 40519, 37305, 47321, 28501, 20333, 59122, 26599, 55550, '_', 13844, 54977, 35209, 61750, 34667, 34189, 31413, 41687, 54366, 30015, 11210, 5036, 9533, 9237, 38103, 50330, 27349, 37757, 17518, 46467, 48125, 16927, 13636, 26277, 2249, 12713, 58917, 54849, 22994, 57555, 22348, 34617, 44788, 45036, 248, 30788, 65093, 7934, 61831, 10549, 20283, 52622}, objArr11);
            String str = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            b((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{47392, 39152, 18330, 47385, 19200, 57457, 16474, 15214, 62991, 47730, 45318, 35406, 10107, 59710, 612, 23008, 21570, 22926, 54044, 10391, 34149, 35060, 42076, 63402, 12954, 51091, 29876, 18138, 25521, 13998, 50638, 5527, 37077, 25886, 38650, 58737, 49657, 54372, 26572, 46166, 32491, 775, 10280, 827, 44555, 29214, 63834, 53763, 57120, 41278, 19052, 41392, 3143, 4486, 6945, 28871, 48507, 16546, 60419, 16298, 60110, 49113, 48318, 36530, 7090, 61177, 3532, 23957}, objArr12);
            String[] strArr2 = {str, (String) objArr12[0]};
            int i17 = getShareableDataState + 93;
            getSponsorBeneficiariesState = i17 % 128;
            int i18 = i17 % 2;
            try {
                Object[] objArr13 = {applicationContext, strArr2, Integer.valueOf(length), 17, -2043939454};
                Object[] objArr14 = new Object[1];
                c((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 2108042773, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 62, (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (byte) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), Color.red(0) + 135094692, objArr14);
                Class<?> cls3 = Class.forName(((String) objArr14[0]).intern());
                byte b6 = (byte) 0;
                byte b7 = b6;
                Object[] objArr15 = new Object[1];
                d(b6, b7, b7, objArr15);
                objArr = (Object[]) cls3.getMethod((String) objArr15[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr13);
                int i19 = ((int[]) objArr[3])[0];
                int i20 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1370984653);
                    if (objCopydefault4 == null) {
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 824;
                        int iResolveOpacity = 20 - Drawable.resolveOpacity(0, 0);
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 58322);
                        byte b8 = (byte) ($$a[20] - 1);
                        byte b9 = (byte) (b8 - 1);
                        Object[] objArr16 = new Object[1];
                        a(b8, b9, b9, objArr16);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(absoluteGravity2, iResolveOpacity, cIndexOf, 1796321366, false, (String) objArr16[0], null);
                    }
                    ((Field) objCopydefault4).set(null, objArr);
                    try {
                        Object[] objArr17 = new Object[1];
                        b(TextUtils.getOffsetAfter("", 0) + 1, new char[]{13226, 8890, 14891, 13259, 61715, 40385, 39063, 58288, 31961, '0', 52453, 21192, 44541, 21302, 32707, 33097, 56967, 58322, 44733, 61531, 4023, 13006, 55737, 12093, 47173, 32130}, objArr17);
                        Class<?> cls4 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        b(TextUtils.indexOf("", "", 0, 0) + 1, new char[]{29198, 54272, 20459, 29291, 1963, 59396, 9917, 23960, 15713, 63110, 47397, 60574, 60499, 42398, 2625, 16196, 40755, 5494, 56172}, objArr18);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(731302035);
                        if (objCopydefault5 == null) {
                            int keyRepeatTimeout = 824 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20;
                            char c4 = (char) (58323 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                            Object[] objArr19 = new Object[1];
                            a(b6, (byte) (b6 + 1), (byte) (-$$a[21]), objArr19);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, doubleTapTimeout2, c4, -288417802, false, (String) objArr19[0], null);
                        }
                        ((Field) objCopydefault5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1370061132);
                        if (objCopydefault6 == null) {
                            int i21 = 825 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                            int i22 = 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                            char c5 = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 58321);
                            byte[] bArr = $$a;
                            byte b10 = (byte) (bArr[20] - 1);
                            Object[] objArr20 = new Object[1];
                            a(b10, (byte) (b10 - 1), (byte) (-bArr[9]), objArr20);
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(i21, i22, c5, 1796168145, false, (String) objArr20[0], null);
                        }
                        ((Field) objCopydefault6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                c2 = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i23 = ((int[]) objArr[c2])[0];
        int i24 = ((int[]) objArr[2])[0];
        if (i24 == i23) {
            Object[] objArr21 = {strArr, new int[1], new int[]{i}, new int[]{i}};
            int i25 = ((int[]) objArr[1])[0];
            int i26 = ((int[]) objArr[2])[0];
            int i27 = ((int[]) objArr[3])[0];
            String[] strArr3 = (String[]) objArr[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i28 = (~((-292641699) | iIdentityHashCode)) | 275777920;
            int i29 = i25 + (-1854434989) + (i28 * 992) + ((i28 | (~((~iIdentityHashCode) | (-176587869)))) * (-496)) + ((iIdentityHashCode | (-193451647)) * 496);
            int i30 = (i29 << 13) ^ i29;
            int i31 = i30 ^ (i30 >>> 17);
            ((int[]) objArr21[1])[0] = i31 ^ (i31 << 5);
            objArr2 = new Object[]{strArr3, new int[1], new int[]{i}, new int[]{i}};
            int i32 = ((int[]) objArr21[1])[0];
            int i33 = ((int[]) objArr21[2])[0];
            int i34 = ((int[]) objArr21[3])[0];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i35 = i32 + 1458436539 + ((506431460 | startElapsedRealtime) * 376) + (((~((~startElapsedRealtime) | 848078470)) | 203620704) * (-376)) + (((~(startElapsedRealtime | (-848078471))) | (-748888419)) * 376);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr2[1])[0] = i37 ^ (i37 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[0];
            if (strArr4 != null) {
                for (String str2 : strArr4) {
                    arrayList.add(str2);
                }
            }
            long j2 = -1;
            long j3 = 0;
            long j4 = (((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i23 ^ i24))) | (((long) 8) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault7 == null) {
                    objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 6618, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault7).invoke(null, null);
                Object[] objArr22 = {-1111542947, Long.valueOf(j4), arrayList, null, false, false};
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 6562, KeyEvent.getDeadChar(0, 0) + 56, (char) KeyEvent.keyCodeFromString(""), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault8).invoke(objInvoke, objArr22);
                Object[] objArr23 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                int i38 = ((int[]) objArr[1])[0];
                int i39 = ((int[]) objArr[2])[0];
                int i40 = ((int[]) objArr[3])[0];
                String[] strArr5 = (String[]) objArr[0];
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i41 = ~iIdentityHashCode2;
                int i42 = i38 + 1837890046 + ((~(536970330 | i41)) * 979) + ((iIdentityHashCode2 | 636160382) * (-979)) + (((~(iIdentityHashCode2 | 536970330)) | (~(i41 | 636160382))) * 979);
                int i43 = (i42 << 13) ^ i42;
                int i44 = i43 ^ (i43 >>> 17);
                ((int[]) objArr23[1])[0] = i44 ^ (i44 << 5);
                int[] iArr = new int[i24];
                int i45 = i24 - 1;
                iArr[i45] = 1;
                Toast.makeText((Context) null, iArr[((i24 * i45) % 2) - 1], 1).show();
                Object[] objArr24 = {strArr, new int[1], new int[]{i}, new int[]{i}};
                int i46 = ((int[]) objArr23[1])[0];
                int i47 = ((int[]) objArr23[2])[0];
                int i48 = ((int[]) objArr23[3])[0];
                String[] strArr6 = (String[]) objArr23[0];
                int i49 = i46 + ((((~(r4 | 377097141)) | (-277907090)) * 56) - 1632139909) + (((~((~System.identityHashCode(this)) | (-277907090))) | 377097141) * 56);
                int i50 = (i49 << 13) ^ i49;
                int i51 = i50 ^ (i50 >>> 17);
                ((int[]) objArr24[1])[0] = i51 ^ (i51 << 5);
                objArr2 = objArr24;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        String strConcat = "13/".concat(Keys.KEY_CUSTOMER_MESSAGE);
        int i52 = ((int[]) objArr2[1])[0];
        int i53 = i52 * i52;
        int i54 = -(447028180 * i52);
        int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
        int i56 = -(i52 * (-1050228202));
        int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
        int i58 = (i57 & (-265937287)) + ((-265937287) | i57);
        int i59 = i58 >> 22;
        int i60 = ((i59 & (-2047)) + (i59 | (-2047))) / 1024;
        int i61 = (i58 - (~(((i60 | 1) << 1) - (i60 ^ 1)))) - 1;
        int i62 = i58 >> 21;
        int i63 = ((i62 ^ (-4095)) + ((i62 & (-4095)) << 1)) / 2048;
        int i64 = -(i61 ^ ((i63 ^ 1) + ((i63 & 1) << 1)));
        int i65 = ((i64 | 2) << 1) - (i64 ^ 2);
        int i66 = i65 >> 24;
        int i67 = ((i66 ^ (-511)) + ((i66 & (-511)) << 1)) / 256;
        int i68 = ((i67 | 1) << 1) - (i67 ^ 1);
        Intrinsics.checkNotNullParameter(customerMessage, strConcat.substring(11436 / (((-((i68 & 1) + (i68 | 1))) & i65) * 1906)));
        return new DaimaStatusState(product, selectedPaymentOption, recipientNo, customerMessage);
    }

    static {
        toString = 1;
        copydefault();
        ShareDataUIState();
        int i = hashCode + 101;
        toString = i % 128;
        if (i % 2 == 0) {
            int i2 = 43 / 0;
        }
    }

    public DaimaStatusState() {
        this(null, null, null, null, 15, null);
    }

    public static DaimaStatusState copy$default(DaimaStatusState daimaStatusState, DaimaProduct daimaProduct, DaimaProductPaymentOption daimaProductPaymentOption, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getSponsorBeneficiariesState + 73;
            getShareableDataState = i3 % 128;
            int i4 = i3 % 2;
            daimaProduct = daimaStatusState.component3;
        }
        if ((i & 2) != 0) {
            daimaProductPaymentOption = daimaStatusState.ShareDataUIState;
        }
        if ((i & 4) != 0) {
            int i5 = getSponsorBeneficiariesState + 95;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            str = daimaStatusState.copydefault;
        }
        if ((i & 8) != 0) {
            int i7 = getShareableDataState + 51;
            getSponsorBeneficiariesState = i7 % 128;
            if (i7 % 2 != 0) {
                str2 = daimaStatusState.component2;
                int i8 = 48 / 0;
            } else {
                str2 = daimaStatusState.component2;
            }
        }
        return daimaStatusState.copy(daimaProduct, daimaProductPaymentOption, str, str2);
    }

    public final DaimaProduct component1() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 55;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        DaimaProduct daimaProduct = this.component3;
        int i4 = i3 + 45;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return daimaProduct;
        }
        throw null;
    }

    public final DaimaProductPaymentOption component2() {
        DaimaProductPaymentOption daimaProductPaymentOption;
        int i = 2 % 2;
        int i2 = getShareableDataState + 87;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            daimaProductPaymentOption = this.ShareDataUIState;
            int i4 = 42 / 0;
        } else {
            daimaProductPaymentOption = this.ShareDataUIState;
        }
        int i5 = i3 + 69;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return daimaProductPaymentOption;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 43;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 23;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 53;
        getSponsorBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i2 + 11;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = getShareableDataState + 59;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof DaimaStatusState)) {
            return false;
        }
        DaimaStatusState daimaStatusState = (DaimaStatusState) other;
        if (!Intrinsics.areEqual(this.component3, daimaStatusState.component3)) {
            int i4 = getShareableDataState + 41;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, daimaStatusState.ShareDataUIState)) {
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, daimaStatusState.copydefault)) {
            return Intrinsics.areEqual(this.component2, daimaStatusState.component2);
        }
        int i6 = getSponsorBeneficiariesState + 87;
        getShareableDataState = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = getShareableDataState + 103;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        DaimaProduct daimaProduct = this.component3;
        if (daimaProduct == null) {
            int i5 = i3 + 25;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = daimaProduct.hashCode();
        }
        DaimaProductPaymentOption daimaProductPaymentOption = this.ShareDataUIState;
        return (((((iHashCode * 31) + (daimaProductPaymentOption != null ? daimaProductPaymentOption.hashCode() : 0)) * 31) + this.copydefault.hashCode()) * 31) + this.component2.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DaimaStatusState(product=" + this.component3 + ", selectedPaymentOption=" + this.ShareDataUIState + ", recipientNo=" + this.copydefault + ", customerMessage=" + this.component2 + ")";
        int i2 = getShareableDataState + 57;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 73;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        component1 = -1938990787;
        copy = -238323958;
        equals = 104458646;
        getAsAtTimestamp = new byte[]{40, -7, -44, 43, -36, 37, 60, -64, -45, -36, 38, -44, -35, 47, -36, Ascii.SI, -50, 34, -38, -43, 36, -40, -43, Ascii.SUB, 8, 41, -103, 47, 32, -47, 47, 47, -58, 5, -28, Base64.padSymbol, -34, -42, Ascii.VT, -64, -33, 32, 59, Ascii.FF, -109, 47, 32, -47, 47, 47, -58, 37, 17, -20, -35, 110, -20, -35, 59, -44, -38, 108, -107, 36, -47, -47, 43, 44, -42, 37, Ascii.FS, -109, 47, 32, -47, -35, TarHeader.LF_LINK, -40, 45, 34, -60, 34, 43, -41, 44, Ascii.US, -20, 45, -57, 63, -59, 36, 19, -24, -41, 37, 41};
        int i5 = i3 + 75;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 63 / 0;
        }
    }

    static void copydefault() {
        component4 = 4806557306349879126L;
    }
}
