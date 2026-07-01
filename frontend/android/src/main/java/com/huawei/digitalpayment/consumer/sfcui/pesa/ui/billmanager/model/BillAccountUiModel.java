package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.alibaba.griver.core.GriverParams;
import com.huawei.digitalpayment.consumer.sfcui.sharedata.ShareDataEditBeneficiaryActivity$special$$inlined$viewModels$default$1;
import com.iap.ac.android.acs.operation.log.LogConstants;
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

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\u0090\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÇ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010/\u001a\u000200H×\u0001J\t\u00101\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001f¨\u00062"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillAccountUiModel;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "billType", "merchantName", LogConstants.Mpm.CodeInfo.MERCHANT_TYPE, "tillNumber", "accountNumber", "date", "amount", "", "currencyLabel", GriverParams.ShareParams.IMAGE_URL, "isPayEnabled", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getBillType", "getMerchantName", "getMerchantType", "getTillNumber", "getAccountNumber", "getDate", "getAmount", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCurrencyLabel", "getImageUrl", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Z)Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillAccountUiModel;", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BillAccountUiModel {
    public static final int $stable = 0;
    private static long ArtificialStackFrames;
    private static int CoroutineDebuggingKt;
    private static int getShareableDataState;
    private static char hashCode;
    private final String ShareDataUIState;
    private final String component1;
    private final Float component2;
    private final String component3;
    private final String component4;
    private final String copy;
    private final String copydefault;
    private final String equals;
    private final boolean getAsAtTimestamp;
    private final String getRequestBeneficiariesState;
    private final String toString;
    private static final byte[] $$c = {70, -47, -65, TarHeader.LF_BLK};
    private static final int $$d = 225;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {119, -27, 13, -93, -28, -17, -25, 5, -17, -17, -11, -36, -7, -24, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_LINK};
    private static final int $$b = 43;
    private static int coroutineCreation = 0;
    private static int getARTIFICIAL_FRAME_PACKAGE_NAME = 1;
    private static int getSponsorBeneficiariesState = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r5, short r6, short r7) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.$$c
            int r7 = 99 - r7
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r5]
        L27:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.$$e(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.$$a
            int r9 = 16 - r9
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L29:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-16)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.a(byte, byte, byte, java.lang.Object[]):void");
    }

    public BillAccountUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, Float f, String str8, String str9, boolean z) {
        this.getRequestBeneficiariesState = str;
        this.component1 = str2;
        this.copy = str3;
        this.equals = str4;
        this.toString = str5;
        this.component3 = str6;
        this.ShareDataUIState = str7;
        this.component2 = f;
        this.copydefault = str8;
        this.component4 = str9;
        this.getAsAtTimestamp = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BillAccountUiModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, Float f, String str8, String str9, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        String str11;
        boolean z2;
        if ((i & 32) != 0) {
            int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 85;
            coroutineCreation = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str10 = null;
        } else {
            str10 = str6;
        }
        if ((i & 256) != 0) {
            int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 1;
            coroutineCreation = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            str11 = "Ksh";
        } else {
            str11 = str8;
        }
        if ((i & 1024) != 0) {
            int i7 = coroutineCreation + 39;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i7 % 128;
            z2 = i7 % 2 != 0;
        } else {
            z2 = z;
        }
        this(str, str2, str3, str4, str5, str10, str7, f, str11, str9, z2);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = coroutineCreation;
        int i3 = i2 + 37;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i2 + 37;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBillType() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 115;
        coroutineCreation = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMerchantName() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 59;
        int i3 = i2 % 128;
        coroutineCreation = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 99;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMerchantType() {
        int i = 2 % 2;
        int i2 = coroutineCreation;
        int i3 = i2 + 31;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        String str = this.equals;
        int i5 = i2 + 9;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTillNumber() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 55;
        int i3 = i2 % 128;
        coroutineCreation = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.toString;
        int i4 = i3 + 103;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
        return str;
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 69;
        int i3 = i2 % 128;
        coroutineCreation = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 11;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDate() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 13;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 63;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Float getAmount() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 57;
        coroutineCreation = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final String getCurrencyLabel() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 31;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
        return str;
    }

    public final String getImageUrl() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 25;
        coroutineCreation = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isPayEnabled() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 51;
        int i3 = i2 % 128;
        coroutineCreation = i3;
        int i4 = i2 % 2;
        boolean z = this.getAsAtTimestamp;
        int i5 = i3 + 83;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return z;
    }

    private static void b(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        char c3 = 2;
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i3 = 0;
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i4 = $11 + 111;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    int i6 = 4038 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    int iResolveSizeAndState = 31 - View.resolveSizeAndState(i3, i3, i3);
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 19181);
                    byte b2 = (byte) i3;
                    byte b3 = b2;
                    String str$$e = $$e(b2, b3, b3);
                    Class[] clsArr = new Class[1];
                    clsArr[i3] = Object.class;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i6, iResolveSizeAndState, keyRepeatDelay, 1912513118, false, str$$e, clsArr);
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    int defaultSize = View.getDefaultSize(i3, i3) + 7567;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 12;
                    char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i3] = Object.class;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(defaultSize, iIndexOf, cIndexOf, 2006389106, false, "e", clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                int i7 = cArr4[iNotificationSideChannel.copydefault % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[c3] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[i3] = iNotificationSideChannel;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i3;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2459, 29 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TypedValue.complexToFloat(i3) > 0.0f ? 1 : (TypedValue.complexToFloat(i3) == 0.0f ? 0 : -1)), 931716605, false, $$e(b4, b5, (byte) (b5 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - ExpandableListView.getPackedPositionChild(0L), View.resolveSizeAndState(0, 0, 0) + 11, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (ArtificialStackFrames ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) getShareableDataState) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) hashCode) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                c3 = 2;
                i3 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $10 + 107;
        $11 = i8 % 128;
        if (i8 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i9 = 52 / 0;
            objArr[0] = str;
        }
    }

    public final String component1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = this.getRequestBeneficiariesState;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
        if (objCopydefault == null) {
            int iGreen = 2405 - Color.green(0);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
            char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            byte b2 = $$a[28];
            Object[] objArr2 = new Object[1];
            a((byte) (b2 + 1), b2, r3[7], objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iGreen, scrollDefaultDelay, c2, 1926552790, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b((char) KeyEvent.normalizeMetaState(0), Drawable.resolveOpacity(0, 0), new char[]{15294, 26397, 60116, 27394, 56411, 11251, 36164, 40449, 3949, 16202, 14445, 60829, 14627, 20895, 59189, 7655, 28498, 29616, 45109, 5428, 29269, 53397}, new char[]{360, 60038, 64985, 32767}, new char[]{0, 0, 0, 0}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b((char) (18058 - TextUtils.getOffsetAfter("", 0)), (-297483575) - KeyEvent.getDeadChar(0, 0), new char[]{62136, 40890, 60275, 54071, 57880, 6457, 590, 59122, 6182, 16864, 56708, 31500, 1628, 62272, 25403}, new char[]{51545, 17602, 35566, 54342}, new char[]{0, 0, 0, 0}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
        if (objCopydefault2 == null) {
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2405;
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26;
            char cIndexOf = (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0));
            byte[] bArr = $$a;
            byte b3 = bArr[28];
            Object[] objArr5 = new Object[1];
            a((byte) (-b3), (byte) (-bArr[15]), (byte) (b3 + 1), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, doubleTapTimeout, cIndexOf, 246010334, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
            if (objCopydefault3 == null) {
                int i2 = 2405 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                int iCombineMeasuredStates = 26 - View.combineMeasuredStates(0, 0);
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                byte[] bArr2 = $$a;
                byte b4 = (byte) (bArr2[28] + 1);
                byte b5 = (byte) (-bArr2[13]);
                Object[] objArr6 = new Object[1];
                a(b4, b5, (byte) (b5 >>> 2), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i2, iCombineMeasuredStates, deadChar, 21921080, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            int i3 = ((int[]) objArr7[2])[0];
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{i3}, (String[]) objArr7[3]};
            int iMyPid = Process.myPid();
            int i4 = ~((-238818371) | iMyPid);
            int i5 = ~iMyPid;
            int i6 = (((1450658225 + ((i4 | (~((-176060009) | i5))) * (-1808))) + (((~((-67108867) | iMyPid)) | (~(i5 | (-4350505)))) * TypedValues.Custom.TYPE_BOOLEAN)) + ((((~(iMyPid | 176060008)) | 171709504) | (~(238818370 | i5))) * TypedValues.Custom.TYPE_BOOLEAN)) - 6705955;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            b((char) (((Process.getThreadPriority(0) + 20) >> 6) + 16976), View.getDefaultSize(0, 0), new char[]{17022, 38443, 30027, 65188, 1927, 7005, 25642, 36154, 23705, 51731, 20390, 11172, 27967, 35577, 12822, 6071}, new char[]{17460, 43385, 20597, 47682}, new char[]{0, 0, 0, 0}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b((char) (View.getDefaultSize(0, 0) + 37520), ((byte) KeyEvent.getModifierMetaStateMask()) + 1, new char[]{31850, 15485, 49871, 22535, 40206, 1077, 15900, 4330, 2082, 30564, 12780, 14621, 37497, 13370, 49652, 4187}, new char[]{6462, 54589, 37084, 62098}, new char[]{0, 0, 0, 0}, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {-352009486};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2036074497);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2393 - View.MeasureSpec.getMode(0), TextUtils.getTrimmedLength("") + 12, (char) (30139 - (ViewConfiguration.getTouchSlop() >> 8)), 1140467866, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrComponent3$16dd2b22 = ShareDataEditBeneficiaryActivity$special$$inlined$viewModels$default$1.component3$16dd2b22(iIntValue, 0, ((Constructor) objCopydefault4).newInstance(objArr10), -6705955, false, false);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1005084067);
                if (objCopydefault5 == null) {
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2405;
                    int iAxisFromString = MotionEvent.axisFromString("") + 27;
                    char trimmedLength = (char) TextUtils.getTrimmedLength("");
                    byte[] bArr3 = $$a;
                    byte b6 = (byte) (bArr3[28] + 1);
                    byte b7 = (byte) (-bArr3[13]);
                    Object[] objArr11 = new Object[1];
                    a(b6, b7, (byte) (b7 >>> 2), objArr11);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, iAxisFromString, trimmedLength, 21921080, false, (String) objArr11[0], null);
                }
                ((Field) objCopydefault5).set(null, objArrComponent3$16dd2b22);
                try {
                    Object[] objArr12 = new Object[1];
                    b((char) (ViewConfiguration.getWindowTouchSlop() >> 8), KeyEvent.normalizeMetaState(0), new char[]{15294, 26397, 60116, 27394, 56411, 11251, 36164, 40449, 3949, 16202, 14445, 60829, 14627, 20895, 59189, 7655, 28498, 29616, 45109, 5428, 29269, 53397}, new char[]{360, 60038, 64985, 32767}, new char[]{0, 0, 0, 0}, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    b((char) (18059 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (-297483575) - Color.argb(0, 0, 0, 0), new char[]{62136, 40890, 60275, 54071, 57880, 6457, 590, 59122, 6182, 16864, 56708, 31500, 1628, 62272, 25403}, new char[]{51545, 17602, 35566, 54342}, new char[]{0, 0, 0, 0}, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-873460037);
                    if (objCopydefault6 == null) {
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2405;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 26;
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        byte[] bArr4 = $$a;
                        byte b8 = bArr4[28];
                        Object[] objArr14 = new Object[1];
                        a((byte) (-b8), (byte) (-bArr4[15]), (byte) (b8 + 1), objArr14);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, iKeyCodeFromString, cCombineMeasuredStates, 246010334, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1215495245);
                    if (objCopydefault7 == null) {
                        int bitsPerPixel = 2404 - ImageFormat.getBitsPerPixel(0);
                        int i9 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26;
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        byte b9 = $$a[28];
                        Object[] objArr15 = new Object[1];
                        a((byte) (b9 + 1), b9, r9[7], objArr15);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(bitsPerPixel, i9, defaultSize, 1926552790, false, (String) objArr15[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                    objArr = objArrComponent3$16dd2b22;
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
        int i10 = ((int[]) objArr[0])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 == i10) {
            int i12 = ((int[]) objArr[1])[0];
            int i13 = ((int[]) objArr[2])[0];
            Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{i13}, (String[]) objArr[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i14 = (-2138303797) + (((~((-365997934) | iIdentityHashCode)) | 269484289 | (~((-303239572) | iIdentityHashCode))) * (-754));
            int i15 = ~((-269484290) | iIdentityHashCode);
            int i16 = ~iIdentityHashCode;
            int i17 = i12 + i14 + ((i15 | (~((-33755283) | i16))) * (-754)) + ((i16 | (-365997934)) * 754);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr16[1])[0] = i19 ^ (i19 << 5);
            int i20 = ((int[]) objArr16[1])[0];
            int i21 = ((int[]) objArr16[2])[0];
            Object[] objArr17 = {new int[]{((int[]) objArr16[0])[0]}, new int[1], new int[]{i21}, (String[]) objArr16[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i22 = ~iIdentityHashCode2;
            int i23 = i20 + (-928643639) + ((~(319873778 | i22)) * (-560)) + ((~(iIdentityHashCode2 | 525592570)) * (-560)) + (((~((-257115417) | i22)) | 51396624) * 560);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr17[1])[0] = i25 ^ (i25 << 5);
            return str;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[3];
        if (strArr != null) {
            int i26 = getARTIFICIAL_FRAME_PACKAGE_NAME + 125;
            int i27 = i26 % 128;
            coroutineCreation = i27;
            int i28 = 2;
            int i29 = i26 % 2;
            int i30 = i27 + 97;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i30 % 128;
            int i31 = i30 % 2;
            int i32 = 0;
            while (i32 < strArr.length) {
                int i33 = coroutineCreation + 121;
                getARTIFICIAL_FRAME_PACKAGE_NAME = i33 % 128;
                int i34 = i33 % i28;
                arrayList.add(strArr[i32]);
                i32++;
                i28 = 2;
            }
        }
        long j2 = -1;
        long j3 = 0;
        long j4 = (((long) (i10 ^ i11)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
        Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
        if (objCopydefault8 == null) {
            objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 42, (char) TextUtils.indexOf("", "", 0), 428292935, false, "ShareDataUIState", new Class[0]);
        }
        Object objInvoke = ((Method) objCopydefault8).invoke(null, null);
        Object[] objArr18 = {-352009486, Long.valueOf(j4), arrayList, null, false, false};
        Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
        if (objCopydefault9 == null) {
            objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.indexOf((CharSequence) "", '0'), 56 - TextUtils.getCapsMode("", 0, 0), (char) ExpandableListView.getPackedPositionType(0L), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
        }
        ((Method) objCopydefault9).invoke(objInvoke, objArr18);
        int i35 = ((int[]) objArr[1])[0];
        int i36 = ((int[]) objArr[2])[0];
        Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{i36}, (String[]) objArr[3]};
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i37 = ~(493412234 | startElapsedRealtime);
        int i38 = i35 + (-1325308762) + (((-501997499) | i37) * (-814)) + ((i37 | (~((~startElapsedRealtime) | 430653872)) | 422068608) * 407) + (((~(startElapsedRealtime | (-430653873))) | (~((-493412235) | startElapsedRealtime)) | 422068608) * 407);
        int i39 = (i38 << 13) ^ i38;
        int i40 = i39 ^ (i39 >>> 17);
        ((int[]) objArr19[1])[0] = i40 ^ (i40 << 5);
        throw new RuntimeException(String.valueOf(i11));
    }

    static {
        CoroutineDebuggingKt = 1;
        copydefault();
        int i = getSponsorBeneficiariesState + 7;
        CoroutineDebuggingKt = i % 128;
        int i2 = i % 2;
    }

    public static BillAccountUiModel copy$default(BillAccountUiModel billAccountUiModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, Float f, String str8, String str9, boolean z, int i, Object obj) {
        String str10;
        Float f2;
        int i2 = 2 % 2;
        String str11 = (i & 1) != 0 ? billAccountUiModel.getRequestBeneficiariesState : str;
        String str12 = (i & 2) != 0 ? billAccountUiModel.component1 : str2;
        String str13 = (i & 4) != 0 ? billAccountUiModel.copy : str3;
        String str14 = (i & 8) != 0 ? billAccountUiModel.equals : str4;
        if ((i & 16) != 0) {
            int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 39;
            int i4 = i3 % 128;
            coroutineCreation = i4;
            if (i3 % 2 != 0) {
                str10 = billAccountUiModel.toString;
                int i5 = 95 / 0;
            } else {
                str10 = billAccountUiModel.toString;
            }
            int i6 = i4 + 125;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str10 = str5;
        }
        String str15 = (i & 32) != 0 ? billAccountUiModel.component3 : str6;
        String str16 = (i & 64) != 0 ? billAccountUiModel.ShareDataUIState : str7;
        if ((i & 128) != 0) {
            f2 = billAccountUiModel.component2;
            int i8 = coroutineCreation + 81;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i8 % 128;
            int i9 = i8 % 2;
        } else {
            f2 = f;
        }
        return billAccountUiModel.copy(str11, str12, str13, str14, str10, str15, str16, f2, (i & 256) != 0 ? billAccountUiModel.copydefault : str8, (i & 512) != 0 ? billAccountUiModel.component4 : str9, (i & 1024) != 0 ? billAccountUiModel.getAsAtTimestamp : z);
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 59;
        int i3 = i2 % 128;
        coroutineCreation = i3;
        int i4 = i2 % 2;
        String str = this.component4;
        int i5 = i3 + 15;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component11() {
        int i = 2 % 2;
        int i2 = coroutineCreation;
        int i3 = i2 + 59;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.getAsAtTimestamp;
        int i5 = i2 + 9;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 95;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 55;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 69;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 1;
        coroutineCreation = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 65;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.equals;
        int i4 = i3 + 91;
        coroutineCreation = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 67;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            return this.toString;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 111;
        int i3 = i2 % 128;
        coroutineCreation = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 91;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 89;
        int i3 = i2 % 128;
        coroutineCreation = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 91;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Float component8() {
        Float f;
        int i = 2 % 2;
        int i2 = coroutineCreation + 95;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        if (i2 % 2 == 0) {
            f = this.component2;
            int i4 = 83 / 0;
        } else {
            f = this.component2;
        }
        int i5 = i3 + 91;
        coroutineCreation = i5 % 128;
        if (i5 % 2 == 0) {
            return f;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 33;
        coroutineCreation = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 113;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final BillAccountUiModel copy(String id, String billType, String merchantName, String merchantType, String tillNumber, String accountNumber, String date, Float amount, String currencyLabel, String imageUrl, boolean isPayEnabled) {
        int i = 2 % 2;
        BillAccountUiModel billAccountUiModel = new BillAccountUiModel(id, billType, merchantName, merchantType, tillNumber, accountNumber, date, amount, currencyLabel, imageUrl, isPayEnabled);
        int i2 = coroutineCreation + 19;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            return billAccountUiModel;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillAccountUiModel)) {
            return false;
        }
        BillAccountUiModel billAccountUiModel = (BillAccountUiModel) other;
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, billAccountUiModel.getRequestBeneficiariesState) || !Intrinsics.areEqual(this.component1, billAccountUiModel.component1) || !Intrinsics.areEqual(this.copy, billAccountUiModel.copy)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.equals, billAccountUiModel.equals)) {
            int i2 = coroutineCreation + 79;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
            return i2 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.toString, billAccountUiModel.toString) || !Intrinsics.areEqual(this.component3, billAccountUiModel.component3) || !Intrinsics.areEqual(this.ShareDataUIState, billAccountUiModel.ShareDataUIState)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.component2, (Object) billAccountUiModel.component2)) {
            int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 67;
            coroutineCreation = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, billAccountUiModel.copydefault)) {
            int i5 = coroutineCreation + 59;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.component4, billAccountUiModel.component4)) {
            return false;
        }
        if (this.getAsAtTimestamp == billAccountUiModel.getAsAtTimestamp) {
            return true;
        }
        int i6 = coroutineCreation + 123;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1 r3
  0x001c: PHI (r1v27 java.lang.String) = (r1v4 java.lang.String), (r1v29 java.lang.String) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]
  0x001c: PHI (r3v5 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[PHI: r3
  0x001a: PHI (r3v1 int) = (r3v0 int), (r3v6 int) binds: [B:8:0x0018, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r12 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.coroutineCreation
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.getARTIFICIAL_FRAME_PACKAGE_NAME = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L15
            java.lang.String r1 = r12.getRequestBeneficiariesState
            r3 = 1
            if (r1 != 0) goto L1c
            goto L1a
        L15:
            java.lang.String r1 = r12.getRequestBeneficiariesState
            r3 = r2
            if (r1 != 0) goto L1c
        L1a:
            r1 = r2
            goto L20
        L1c:
            int r1 = r1.hashCode()
        L20:
            java.lang.String r4 = r12.component1
            if (r4 != 0) goto L2f
            int r4 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.coroutineCreation
            int r4 = r4 + 33
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.getARTIFICIAL_FRAME_PACKAGE_NAME = r5
            int r4 = r4 % r0
            r4 = r2
            goto L33
        L2f:
            int r4 = r4.hashCode()
        L33:
            java.lang.String r5 = r12.copy
            if (r5 != 0) goto L39
            r5 = r2
            goto L3d
        L39:
            int r5 = r5.hashCode()
        L3d:
            java.lang.String r6 = r12.equals
            if (r6 != 0) goto L43
            r6 = r2
            goto L47
        L43:
            int r6 = r6.hashCode()
        L47:
            java.lang.String r7 = r12.toString
            if (r7 != 0) goto L4d
            r7 = r2
            goto L5f
        L4d:
            int r7 = r7.hashCode()
            int r8 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.coroutineCreation
            int r8 = r8 + 39
            int r9 = r8 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.getARTIFICIAL_FRAME_PACKAGE_NAME = r9
            int r8 = r8 % r0
            if (r8 != 0) goto L5f
            r8 = 4
            int r8 = r8 / 3
        L5f:
            java.lang.String r8 = r12.component3
            if (r8 != 0) goto L65
            r8 = r2
            goto L69
        L65:
            int r8 = r8.hashCode()
        L69:
            java.lang.String r9 = r12.ShareDataUIState
            if (r9 != 0) goto L78
            int r9 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.getARTIFICIAL_FRAME_PACKAGE_NAME
            int r9 = r9 + 5
            int r10 = r9 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.coroutineCreation = r10
            int r9 = r9 % r0
            r9 = r2
            goto L7c
        L78:
            int r9 = r9.hashCode()
        L7c:
            java.lang.Float r10 = r12.component2
            if (r10 != 0) goto L8b
            int r10 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.getARTIFICIAL_FRAME_PACKAGE_NAME
            int r10 = r10 + 27
            int r11 = r10 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.coroutineCreation = r11
            int r10 = r10 % r0
            r0 = r2
            goto L8f
        L8b:
            int r0 = r10.hashCode()
        L8f:
            java.lang.String r10 = r12.copydefault
            if (r10 != 0) goto L94
            goto L98
        L94:
            int r2 = r10.hashCode()
        L98:
            java.lang.String r10 = r12.component4
            if (r10 != 0) goto L9d
            goto La1
        L9d:
            int r3 = r10.hashCode()
        La1:
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r6
            int r1 = r1 * 31
            int r1 = r1 + r7
            int r1 = r1 * 31
            int r1 = r1 + r8
            int r1 = r1 * 31
            int r1 = r1 + r9
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            boolean r0 = r12.getAsAtTimestamp
            int r0 = java.lang.Boolean.hashCode(r0)
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BillAccountUiModel(id=" + this.getRequestBeneficiariesState + ", billType=" + this.component1 + ", merchantName=" + this.copy + ", merchantType=" + this.equals + ", tillNumber=" + this.toString + ", accountNumber=" + this.component3 + ", date=" + this.ShareDataUIState + ", amount=" + this.component2 + ", currencyLabel=" + this.copydefault + ", imageUrl=" + this.component4 + ", isPayEnabled=" + this.getAsAtTimestamp + ")";
        int i2 = coroutineCreation + 57;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static void copydefault() {
        ArtificialStackFrames = -3780477796495014671L;
        getShareableDataState = 1386857713;
        hashCode = (char) 17741;
    }
}
