package com.huawei.digitalpayment.history.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.common.widget.dialog.DialogBox;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.service.IHistoryMipmapService;
import com.huawei.digitalpayment.consumer.baselib.util.DensityUtils;
import com.huawei.digitalpayment.consumer.baselib.util.TimeUtils;
import com.huawei.digitalpayment.consumer.history.R;
import com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryDetailCustomerActivityBinding;
import com.huawei.digitalpayment.consumer.service.IProfileService;
import com.huawei.digitalpayment.history.model.request.CancelOrderRequest;
import com.huawei.digitalpayment.history.model.request.TransactionDetailRequest;
import com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse;
import com.huawei.digitalpayment.history.ui.adapter.SettlementAdapter;
import com.huawei.digitalpayment.history.utils.DetailReceiptSaveUtils;
import com.huawei.digitalpayment.history.viewmodel.TransactionHistoryViewModel;
import com.huawei.http.BaseResp;
import com.huawei.image.util.GlideUtils;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.logging.L;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import org.apache.commons.lang3.BooleanUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class TransactionHistoryDetailCustomerActivity extends Hilt_TransactionHistoryDetailCustomerActivity<TransactionHistoryDetailCustomerActivityBinding, TransactionHistoryViewModel> {
    private static int ShareDataUIState;
    private static byte[] component1;
    private static long component2;
    private static int component3;
    private static short[] copy;
    private static int copydefault;
    private static long equals;
    private static int getAsAtTimestamp;
    private String mOrderId;
    private TransactionHistoryDetailResponse mTransRecordDetailRes;
    private String pushType;
    private static final byte[] $$l = {46, -95, Ascii.VT, -87};
    private static final int $$o = 175;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {44, 39, Base64.padSymbol, Ascii.GS, -17, -3, 58, -74, 13, -10, 0, -22, 4, 1, -17, -3, 58, -59, -6, -19, 5, -3, -12, -10, -11, 1, -6, 10, -13, 58, -58, -17, -3, -8, -4, -4, 4, -14, -11, -4, SignedBytes.MAX_POWER_OF_TWO, -58, -10, -6, -12, Base64.padSymbol, -25, -36, -23, 9, Ascii.SUB, -40, -8, -13, 10, -18, 42, -42, -6, -12, 32, -46, 75, -5, -38, -56, -1, 10, -18, -1, 8, -16, 20, -43, 6, -11, 7, -2, -20, 6, 1, Ascii.DC2, -26, -17, 6, -7, -2, 44, -17, -3, -8, -4, -4, 4, -14, -11, Base64.padSymbol, -17, -3, -8, -4, -4, 4, -14, -11, 60};
    private static final int $$k = 183;
    private static final byte[] $$d = {78, -86, -128, -128, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 200;
    private static int getSponsorBeneficiariesState = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001f -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r5, byte r6, byte r7) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r5 = r5 + 102
            byte[] r1 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r5
            r5 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L1f
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L1f:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
        L25:
            int r5 = r5 + r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.$$r(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r0 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.$$d
            int r1 = r8 + 4
            int r6 = 100 - r6
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r7 + 1
            int r7 = r3 + (-8)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.f(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 75
            int r7 = r7 + 10
            byte[] r0 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.$$j
            int r9 = r9 * 4
            int r9 = 99 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2f:
            int r8 = r8 + 1
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + (-5)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.i(int, byte, short, java.lang.Object[]):void");
    }

    private static void j(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 49;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7032, (ViewConfiguration.getLongPressTimeout() >> 16) + 34, (char) (Color.alpha(0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    int fadingEdgeLength = 1390 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                    int i6 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 18;
                    char cCombineMeasuredStates = (char) (51269 - View.combineMeasuredStates(0, 0));
                    byte b2 = (byte) ($$o & 1);
                    byte b3 = (byte) (-b2);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(fadingEdgeLength, i6, cCombineMeasuredStates, -1883291598, false, $$r(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i7 = $10 + 91;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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

    static ViewDataBinding access$000(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = transactionHistoryDetailCustomerActivity.binding;
        if (i3 == 0) {
            int i4 = 98 / 0;
        }
        return binding;
    }

    static ViewDataBinding access$100(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 3;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = transactionHistoryDetailCustomerActivity.binding;
        int i4 = component4 + 87;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return binding;
    }

    static ViewDataBinding access$200(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity) {
        int i = 2 % 2;
        int i2 = component4 + 111;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = transactionHistoryDetailCustomerActivity.binding;
        int i4 = component4 + 73;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return binding;
    }

    static ViewDataBinding access$300(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 9;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = transactionHistoryDetailCustomerActivity.binding;
        if (i3 != 0) {
            return binding;
        }
        throw null;
    }

    static ViewDataBinding access$400(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = transactionHistoryDetailCustomerActivity.binding;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
        return binding;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r22, char[] r23, java.lang.Object[] r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.h(int, char[], java.lang.Object[]):void");
    }

    private static void g(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        int length;
        byte[] bArr;
        int i4 = 2;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(copydefault)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            int i6 = -1;
            if (objCopydefault == null) {
                byte b3 = (byte) (-1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(998 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 61685), 1874745193, false, $$r($$l[2], b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            if (i7 != 0) {
                int i8 = $10 + 121;
                int i9 = i8 % 128;
                $11 = i9;
                int i10 = i8 % 2;
                byte[] bArr2 = component1;
                if (bArr2 != null) {
                    int i11 = i9 + 17;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $10 + 1;
                        $11 = i13 % 128;
                        if (i13 % i4 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i12])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b4 = (byte) i6;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - TextUtils.getCapsMode("", 0, 0), 48 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (54462 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), -1178636483, false, $$r((byte) ($$o & 30), b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr[i12] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            i12 >>>= 1;
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i12])};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault3 == null) {
                                byte b5 = (byte) (-1);
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 2984, ExpandableListView.getPackedPositionGroup(0L) + 48, (char) (54462 - ((Process.getThreadPriority(0) + 20) >> 6)), -1178636483, false, $$r((byte) ($$o & 30), b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr[i12] = ((Byte) ((Method) objCopydefault3).invoke(null, objArr4)).byteValue();
                            i12++;
                        }
                        i4 = 2;
                        i6 = -1;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = component1;
                    try {
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(ShareDataUIState)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault4 == null) {
                            byte b6 = (byte) (-1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1000, 31 - ExpandableListView.getPackedPositionType(0L), (char) (Gravity.getAbsoluteGravity(0, 0) + 61685), 1874745193, false, $$r($$l[2], b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (((long) copy[i + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) copydefault) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i14 = $11 + 61;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L)) + i7;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i2), Integer.valueOf(component3), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    byte b7 = (byte) (-1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1696, 38 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (Color.rgb(0, 0, 0) + 16777216), -1454191902, false, $$r((byte) ($$o & 26), b7, (byte) (b7 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = component1;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = component1;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = copy;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0098  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = component4 + 79;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            super.initToolbar(getString(R.string.history_details_title1));
            int i3 = 72 / 0;
        } else {
            super.initToolbar(getString(R.string.history_details_title1));
        }
        int i4 = component4 + 81;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    protected void initData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 15;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            String stringExtra = getIntent().getStringExtra("orderId");
            this.mOrderId = stringExtra;
            int i3 = 51 / 0;
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
        } else {
            String stringExtra2 = getIntent().getStringExtra("orderId");
            this.mOrderId = stringExtra2;
            if (TextUtils.isEmpty(stringExtra2)) {
                return;
            }
        }
        TransactionDetailRequest transactionDetailRequest = new TransactionDetailRequest();
        transactionDetailRequest.setOrderId(this.mOrderId);
        ((TransactionHistoryViewModel) this.viewModel).requestDetailInfo(transactionDetailRequest);
        int i4 = component4 + 85;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static int lambda$initObserver$0(TransactionHistoryDetailResponse.Field field, TransactionHistoryDetailResponse.Field field2) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 53;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = Integer.parseInt(field.getOrder());
        int i5 = i3 == 0 ? i4 % Integer.parseInt(field2.getOrder()) : i4 - Integer.parseInt(field2.getOrder());
        int i6 = getRequestBeneficiariesState + 115;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private void lambda$initObserver$1(Resource resource) {
        int i = 2 % 2;
        if (resource.loading()) {
            int i2 = getRequestBeneficiariesState + 67;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                DialogManager.showLoading(this);
                int i3 = 45 / 0;
            } else {
                DialogManager.showLoading(this);
            }
            int i4 = component4 + 15;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DialogManager.hideLoading(this);
        if (resource.error()) {
            int i5 = getRequestBeneficiariesState + 93;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                ToastUtils.showShort(resource.getException().getResponseDesc());
                int i6 = 92 / 0;
            } else {
                ToastUtils.showShort(resource.getException().getResponseDesc());
            }
        }
        if (resource.success()) {
            TransactionHistoryDetailResponse transactionHistoryDetailResponse = (TransactionHistoryDetailResponse) resource.getData();
            this.mTransRecordDetailRes = transactionHistoryDetailResponse;
            try {
                transactionHistoryDetailResponse.getTradeDetails().sort(new Comparator() {
                    private static int component2 = 1;
                    private static int copydefault;

                    @Override
                    public final int compare(Object obj2, Object obj3) {
                        int i7 = 2 % 2;
                        int i8 = copydefault + 107;
                        component2 = i8 % 128;
                        int i9 = i8 % 2;
                        int iLambda$initObserver$0 = TransactionHistoryDetailCustomerActivity.lambda$initObserver$0((TransactionHistoryDetailResponse.Field) obj2, (TransactionHistoryDetailResponse.Field) obj3);
                        int i10 = component2 + 41;
                        copydefault = i10 % 128;
                        if (i10 % 2 == 0) {
                            return iLambda$initObserver$0;
                        }
                        throw null;
                    }
                });
            } catch (Exception e) {
                L.INSTANCE.e(this.TAG, e.getMessage(), new Object[0]);
            }
            fillData();
            if ("1".equals(this.pushType)) {
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).tvHelpCenter.setVisibility(8);
            } else {
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).tvHelpCenter.setVisibility(0);
            }
        }
    }

    protected void initObserver() {
        int i = 2 % 2;
        ((TransactionHistoryViewModel) this.viewModel).getDetailResponseMutableLiveData().observe(this, new Observer() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 109;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                TransactionHistoryDetailCustomerActivity.$r8$lambda$4z8RKyB_hJ0lqxkq3v4a9WcuOEE(this.f$0, (Resource) obj);
                int i5 = component1 + 83;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        cancelRiskObserver();
        int i2 = getRequestBeneficiariesState + 25;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private void cancelRiskObserver() {
        int i = 2 % 2;
        ((TransactionHistoryViewModel) this.viewModel).getCancelLiveData().observe(this, new Observer<Resource<BaseResp>>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onChanged(Resource<BaseResp> resource) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 31;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component3(resource);
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = copydefault + 69;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component3(Resource<BaseResp> resource) {
                int i2 = 2 % 2;
                if (resource.loading()) {
                    DialogManager.showLoading(TransactionHistoryDetailCustomerActivity.this);
                    int i3 = copydefault + 111;
                    ShareDataUIState = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 26 / 0;
                        return;
                    }
                    return;
                }
                DialogManager.hideLoading(TransactionHistoryDetailCustomerActivity.this);
                if (resource.error()) {
                    ToastUtils.showShort(resource.getException().getResponseDesc());
                }
                if (resource.success()) {
                    TransactionHistoryDetailCustomerActivity.this.finish();
                    int i5 = ShareDataUIState + 43;
                    copydefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 2 / 5;
                    }
                }
            }
        });
        int i2 = component4 + 57;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 89 / 0;
        }
    }

    private static void lambda$fillData$2(View view) {
        int i = 2 % 2;
        int i2 = component4 + 115;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        AppConfigManager.INSTANCE.goHelp();
        int i4 = getRequestBeneficiariesState + 33;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void fillData() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 59;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        if (this.mTransRecordDetailRes != null) {
            setIcon();
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).ivResultIcon.setVisibility(0);
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).amountDisplayView.setVisibility(0);
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).amountDisplayView.setAmount(this.mTransRecordDetailRes.getAmountDisplay());
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).tvStatus.setText(this.mTransRecordDetailRes.getTradeStatusDesc());
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).amountDisplayView.setUnit(this.mTransRecordDetailRes.getUnit());
            setCancel();
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).tvHelpCenter.setOnClickListener(new View.OnClickListener() {
                private static int component1 = 1;
                private static int component3;

                @Override
                public final void onClick(View view) {
                    int i5 = 2 % 2;
                    int i6 = component3 + 33;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    TransactionHistoryDetailCustomerActivity.$r8$lambda$nhIABv9ORNBzKIAXZgE7qa7LeMM(view);
                    if (i7 == 0) {
                        int i8 = 71 / 0;
                    }
                    int i9 = component3 + 83;
                    component1 = i9 % 128;
                    int i10 = i9 % 2;
                }
            });
            fillNotInGroup();
            fillGroups();
            setButton();
            setSettlement();
            return;
        }
        int i5 = i2 + 43;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    private void setIcon() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 57;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int mipmapIcon = ((IHistoryMipmapService) RouteUtils.getService(IHistoryMipmapService.class)).getMipmapIcon(this.mTransRecordDetailRes.getBusinessType(), R.mipmap.icon_history_details_no_businesses);
        String url = UrlUtils.getURL(AppConfigManager.getAppConfig().getH5BaseUrl(), this.mTransRecordDetailRes.getLogo());
        if (!(!TextUtils.isEmpty(url))) {
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).ivResultIcon.setImageResource(mipmapIcon);
        } else {
            GlideUtils.loadUrl(url, ((TransactionHistoryDetailCustomerActivityBinding) this.binding).ivResultIcon, mipmapIcon, mipmapIcon);
        }
        int i4 = component4 + 77;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private void lambda$setButton$3(View view) {
        int i = 2 % 2;
        int i2 = component4 + 95;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            DetailReceiptSaveUtils.checkPermission(this, this.mTransRecordDetailRes);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        DetailReceiptSaveUtils.checkPermission(this, this.mTransRecordDetailRes);
        int i3 = getRequestBeneficiariesState + 63;
        component4 = i3 % 128;
        int i4 = i3 % 2;
    }

    private void lambda$setButton$4(View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        toBillShare();
        if (i3 == 0) {
            throw null;
        }
    }

    private void setButton() {
        int i = 2 % 2;
        int i2 = component4 + 115;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            if (!this.mTransRecordDetailRes.isExportImage() || "1".equals(this.pushType)) {
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).btnSaveReceipt.setVisibility(8);
            } else {
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).btnSaveReceipt.setVisibility(0);
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).btnSaveReceipt.setOnClickListener(new View.OnClickListener() {
                    private static int component3 = 1;
                    private static int copydefault;

                    @Override
                    public final void onClick(View view) {
                        int i3 = 2 % 2;
                        int i4 = component3 + 63;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        TransactionHistoryDetailCustomerActivity.$r8$lambda$bzw8bvkanO1eWlkIaXI0SO793v8(this.f$0, view);
                        if (i5 != 0) {
                            int i6 = 78 / 0;
                        }
                    }
                });
            }
            if (TextUtils.isEmpty(this.mTransRecordDetailRes.getBillShareButtonText())) {
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).btnBillShare.setVisibility(8);
            } else {
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).btnBillShare.setVisibility(0);
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).btnBillShare.setText(this.mTransRecordDetailRes.getBillShareButtonText());
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).btnBillShare.setOnClickListener(new View.OnClickListener() {
                    private static int component1 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final void onClick(View view) {
                        int i3 = 2 % 2;
                        int i4 = copydefault + 115;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                        TransactionHistoryDetailCustomerActivity.m12233$r8$lambda$rO1SetLWtYfiQy2TGL7wy0TMoA(this.f$0, view);
                        int i6 = component1 + 53;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                    }
                });
            }
            if (((TransactionHistoryDetailCustomerActivityBinding) this.binding).btnSaveReceipt.getVisibility() != 0 || ((TransactionHistoryDetailCustomerActivityBinding) this.binding).btnBillShare.getVisibility() != 0) {
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).viewDivider.setVisibility(8);
                return;
            }
            int i3 = component4 + 115;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 != 0) {
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).viewDivider.setVisibility(1);
                return;
            } else {
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).viewDivider.setVisibility(0);
                return;
            }
        }
        this.mTransRecordDetailRes.isExportImage();
        throw null;
    }

    private void toBillShare() {
        String userProfile;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 23;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            userProfile = ((IProfileService) RouteUtils.getService(IProfileService.class)).getUserProfile();
            int i3 = 26 / 0;
            if (TextUtils.isEmpty(userProfile)) {
                return;
            }
        } else {
            userProfile = ((IProfileService) RouteUtils.getService(IProfileService.class)).getUserProfile();
            if (TextUtils.isEmpty(userProfile)) {
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(userProfile);
            String strOptString = jSONObject.optString("identityId");
            String strOptString2 = jSONObject.optString("name");
            String strOptString3 = jSONObject.optString("avatar");
            Bundle bundle = new Bundle(4);
            bundle.putString("payeeConsumerId", strOptString);
            bundle.putString("payeePhone", SPUtils.getInstance().getString("recent_login_phone_number"));
            bundle.putString("payeeName", strOptString2);
            bundle.putString("payeeAvatar", strOptString3);
            RouteUtils.routeWithExecute(this.mTransRecordDetailRes.getBillShareButtonUrl(), bundle);
            int i4 = component4 + 103;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException e) {
            L.INSTANCE.e(e.getMessage(), new Object[0]);
        }
    }

    private void setSettlement() {
        int i = 2 % 2;
        if (!CollectionUtils.isEmpty(this.mTransRecordDetailRes.getEscrowInfoList())) {
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).llSettlement.setVisibility(0);
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).rvSettlement.setVisibility(8);
            SettlementAdapter settlementAdapter = new SettlementAdapter(this.mTransRecordDetailRes.getEscrowInfoList());
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).rvSettlement.setLayoutManager(new LinearLayoutManager(this));
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).rvSettlement.setAdapter(settlementAdapter);
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).rlSettlementOpen.setOnClickListener(new View.OnClickListener() {
                private static int component2 = 1;
                private static int copydefault;

                @Override
                public void onClick(View view) {
                    int i2 = 2 % 2;
                    int i3 = component2 + 91;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    Callback.onClick_enter(view);
                    try {
                        if (((TransactionHistoryDetailCustomerActivityBinding) TransactionHistoryDetailCustomerActivity.access$000(TransactionHistoryDetailCustomerActivity.this)).rvSettlement.getVisibility() == 0) {
                            int i5 = component2 + 45;
                            copydefault = i5 % 128;
                            int i6 = i5 % 2;
                            ((TransactionHistoryDetailCustomerActivityBinding) TransactionHistoryDetailCustomerActivity.access$100(TransactionHistoryDetailCustomerActivity.this)).rvSettlement.setVisibility(8);
                            ((TransactionHistoryDetailCustomerActivityBinding) TransactionHistoryDetailCustomerActivity.access$200(TransactionHistoryDetailCustomerActivity.this)).imSettlement.setImageResource(R.mipmap.icon_arrow_down);
                        } else {
                            ((TransactionHistoryDetailCustomerActivityBinding) TransactionHistoryDetailCustomerActivity.access$300(TransactionHistoryDetailCustomerActivity.this)).rvSettlement.setVisibility(0);
                            ((TransactionHistoryDetailCustomerActivityBinding) TransactionHistoryDetailCustomerActivity.access$400(TransactionHistoryDetailCustomerActivity.this)).imSettlement.setImageResource(R.mipmap.icon_arrow_up);
                        }
                        Callback.onClick_exit();
                        int i7 = component2 + 87;
                        copydefault = i7 % 128;
                        int i8 = i7 % 2;
                    } catch (Throwable th) {
                        Callback.onClick_exit();
                        throw th;
                    }
                }
            });
            return;
        }
        int i2 = component4 + 37;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).llSettlement.setVisibility(56);
        } else {
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).llSettlement.setVisibility(8);
        }
        int i3 = component4 + 27;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
    }

    private void lambda$setCancel$5(View view) throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 45;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        showCancelDialog();
        if (i3 == 0) {
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 97;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f A[Catch: JSONException -> 0x0067, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0067, blocks: (B:6:0x0017, B:10:0x0039, B:12:0x0041, B:19:0x004f, B:17:0x0047), top: B:29:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setCancel() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.Class<com.huawei.digitalpayment.consumer.service.IProfileService> r1 = com.huawei.digitalpayment.consumer.service.IProfileService.class
            java.lang.Object r1 = com.huawei.arouter.RouteUtils.getService(r1)
            com.huawei.digitalpayment.consumer.service.IProfileService r1 = (com.huawei.digitalpayment.consumer.service.IProfileService) r1
            java.lang.String r1 = r1.getUserProfile()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L16
            return
        L16:
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L67
            r3.<init>(r1)     // Catch: org.json.JSONException -> L67
            java.lang.String r1 = "identityId"
            java.lang.String r1 = r3.optString(r1)     // Catch: org.json.JSONException -> L67
            com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse r3 = r4.mTransRecordDetailRes     // Catch: org.json.JSONException -> L67
            java.lang.String r3 = r3.getPayerIdentityId()     // Catch: org.json.JSONException -> L67
            boolean r1 = android.text.TextUtils.equals(r1, r3)     // Catch: org.json.JSONException -> L67
            if (r1 == 0) goto L79
            int r1 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.component4
            int r1 = r1 + 13
            int r3 = r1 % 128
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.getRequestBeneficiariesState = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L47
            com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse r1 = r4.mTransRecordDetailRes     // Catch: org.json.JSONException -> L67
            boolean r1 = r1.isCancellable()     // Catch: org.json.JSONException -> L67
            r3 = 71
            int r3 = r3 / r2
            if (r1 == 0) goto L79
            goto L4f
        L45:
            r0 = move-exception
            throw r0
        L47:
            com.huawei.digitalpayment.history.model.response.TransactionHistoryDetailResponse r1 = r4.mTransRecordDetailRes     // Catch: org.json.JSONException -> L67
            boolean r1 = r1.isCancellable()     // Catch: org.json.JSONException -> L67
            if (r1 == 0) goto L79
        L4f:
            Binding extends androidx.databinding.ViewDataBinding r1 = r4.binding     // Catch: org.json.JSONException -> L67
            com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryDetailCustomerActivityBinding r1 = (com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryDetailCustomerActivityBinding) r1     // Catch: org.json.JSONException -> L67
            android.widget.TextView r1 = r1.tvCancel     // Catch: org.json.JSONException -> L67
            r1.setVisibility(r2)     // Catch: org.json.JSONException -> L67
            Binding extends androidx.databinding.ViewDataBinding r1 = r4.binding     // Catch: org.json.JSONException -> L67
            com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryDetailCustomerActivityBinding r1 = (com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryDetailCustomerActivityBinding) r1     // Catch: org.json.JSONException -> L67
            android.widget.TextView r1 = r1.tvCancel     // Catch: org.json.JSONException -> L67
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity$$ExternalSyntheticLambda5 r3 = new com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity$$ExternalSyntheticLambda5     // Catch: org.json.JSONException -> L67
            r3.<init>()     // Catch: org.json.JSONException -> L67
            com.huawei.common.util.FastClickUtils.setOnClickListener(r1, r3)     // Catch: org.json.JSONException -> L67
            goto L79
        L67:
            r1 = move-exception
            java.lang.String r3 = r1.getMessage()
            if (r3 == 0) goto L79
            com.safaricom.mpesa.logging.L r3 = com.safaricom.mpesa.logging.L.INSTANCE
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3.e(r1, r2)
        L79:
            int r1 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.getRequestBeneficiariesState
            int r1 = r1 + 89
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.component4 = r2
            int r1 = r1 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.setCancel():void");
    }

    private void cancelRiskTransaction() {
        int i = 2 % 2;
        ((TransactionHistoryViewModel) this.viewModel).cancelRiskTransaction(new CancelOrderRequest(this.mTransRecordDetailRes.getPaymentOrderId(), this.mTransRecordDetailRes.getPaymentOrderId()));
        int i2 = component4 + 51;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void fillNotInGroup() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 55;
        component4 = i2 % 128;
        View view = null;
        if (i2 % 2 != 0) {
            if (this.mTransRecordDetailRes.getTradeDetails() == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<TransactionHistoryDetailResponse.Field> it = this.mTransRecordDetailRes.getTradeDetails().iterator();
            while (it.hasNext()) {
                int i3 = getRequestBeneficiariesState + 117;
                component4 = i3 % 128;
                if (i3 % 2 != 0) {
                    TransactionHistoryDetailResponse.Field next = it.next();
                    if (TextUtils.isEmpty(next.getGroup())) {
                        arrayList.add(next);
                        int i4 = component4 + 115;
                        getRequestBeneficiariesState = i4 % 128;
                        int i5 = i4 % 2;
                    }
                } else {
                    TextUtils.isEmpty(it.next().getGroup());
                    view.hashCode();
                    throw null;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).llFieldList.addView(createFieldView((TransactionHistoryDetailResponse.Field) it2.next()));
                view = new View(this);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ConvertUtils.dp2px(0.33f));
                marginLayoutParams.leftMargin = DensityUtils.dp2px(this, 24.0f);
                marginLayoutParams.rightMargin = DensityUtils.dp2px(this, 24.0f);
                view.setLayoutParams(marginLayoutParams);
                view.setBackgroundColor(ContextCompat.getColor(this, R.color.colorFirstLevelBorder));
                ((TransactionHistoryDetailCustomerActivityBinding) this.binding).llFieldList.addView(view);
            }
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).llFieldList.removeView(view);
            return;
        }
        this.mTransRecordDetailRes.getTradeDetails();
        view.hashCode();
        throw null;
    }

    private void fillGroups() {
        int i = 2 % 2;
        int i2 = component4 + 105;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 51 / 0;
            if (this.mTransRecordDetailRes.getTradeDetails() == null) {
                return;
            }
        } else if (this.mTransRecordDetailRes.getTradeDetails() == null) {
            return;
        }
        HashMap map = new HashMap();
        ArrayList<String> arrayList = new ArrayList();
        for (TransactionHistoryDetailResponse.Field field : this.mTransRecordDetailRes.getTradeDetails()) {
            if (!TextUtils.isEmpty(field.getGroup())) {
                List arrayList2 = (List) map.get(field.getGroup());
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    map.put(field.getGroup(), arrayList2);
                    arrayList.add(field.getGroup());
                }
                arrayList2.add(field);
            }
        }
        for (String str : arrayList) {
            int i4 = component4 + 63;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            List<TransactionHistoryDetailResponse.Field> list = (List) map.get(str);
            View viewInflate = getLayoutInflater().inflate(R.layout.item_detail_group_field, (ViewGroup) ((TransactionHistoryDetailCustomerActivityBinding) this.binding).llFieldList, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_group_name);
            if (textView != null) {
                textView.setText(str);
            }
            fillGroup(viewInflate, list);
            attachEvent(viewInflate);
            ((TransactionHistoryDetailCustomerActivityBinding) this.binding).llFieldList.addView(viewInflate);
            int i6 = getRequestBeneficiariesState + 59;
            component4 = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private void fillGroup(View view, List<TransactionHistoryDetailResponse.Field> list) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 75;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_group_info);
        if (linearLayout != null) {
            Iterator<TransactionHistoryDetailResponse.Field> it = list.iterator();
            int i4 = getRequestBeneficiariesState + 63;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            while (it.hasNext()) {
                int i6 = component4 + 49;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
                linearLayout.addView(createFieldView(it.next()));
            }
        }
    }

    private View createFieldView(TransactionHistoryDetailResponse.Field field) {
        int i = 2 % 2;
        View viewInflate = getLayoutInflater().inflate(R.layout.item_detail_field, (ViewGroup) ((TransactionHistoryDetailCustomerActivityBinding) this.binding).llFieldList, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_field_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_field_value);
        String fieldName = field.getFieldName();
        String fieldValue = formatFieldValue(field);
        if (textView != null) {
            textView.setText(fieldName);
            int i2 = getRequestBeneficiariesState + 5;
            component4 = i2 % 128;
            int i3 = i2 % 2;
        }
        if (textView2 != null) {
            int i4 = getRequestBeneficiariesState + 125;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            textView2.setText(fieldValue);
            if (i5 == 0) {
                int i6 = 93 / 0;
            }
        }
        return viewInflate;
    }

    private String formatFieldValue(TransactionHistoryDetailResponse.Field field) {
        int i = 2 % 2;
        if ("timestamp".equals(field.getType())) {
            int i2 = component4 + 97;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            String timeTodayHms = TimeUtils.formatTimeTodayHms(field.getFieldValue());
            int i4 = component4 + 51;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 46 / 0;
            }
            return timeTodayHms;
        }
        return field.getFieldValue();
    }

    private void attachEvent(View view) {
        int i = 2 % 2;
        final LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_group_title);
        final LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.ll_group_info);
        final ImageView imageView = (ImageView) view.findViewById(R.id.iv_down);
        if (linearLayout != null && linearLayout2 != null) {
            int i2 = getRequestBeneficiariesState + 97;
            int i3 = i2 % 128;
            component4 = i3;
            int i4 = i2 % 2;
            if (imageView == null) {
                int i5 = i3 + 99;
                getRequestBeneficiariesState = i5 % 128;
                int i6 = i5 % 2;
            } else {
                linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                linearLayout2.setTag(Integer.valueOf(linearLayout2.getMeasuredHeight()));
                linearLayout.setOnClickListener(new View.OnClickListener() {
                    private static int ShareDataUIState = 1;
                    private static int component3;

                    @Override
                    public final void onClick(View view2) {
                        int i7 = 2 % 2;
                        int i8 = ShareDataUIState + 113;
                        component3 = i8 % 128;
                        int i9 = i8 % 2;
                        TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity = this.f$0;
                        if (i9 == 0) {
                            TransactionHistoryDetailCustomerActivity.$r8$lambda$A0PHOBCzyFKxhaoMyUDWGJDLltY(transactionHistoryDetailCustomerActivity, linearLayout, imageView, linearLayout2, view2);
                        } else {
                            TransactionHistoryDetailCustomerActivity.$r8$lambda$A0PHOBCzyFKxhaoMyUDWGJDLltY(transactionHistoryDetailCustomerActivity, linearLayout, imageView, linearLayout2, view2);
                            int i10 = 81 / 0;
                        }
                    }
                });
            }
        }
        int i7 = getRequestBeneficiariesState + 11;
        component4 = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void lambda$attachEvent$6(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, View view) {
        int i = 2 % 2;
        int i2 = component4 + 29;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            if (!(!BooleanUtils.TRUE.equals(linearLayout.getTag()))) {
                imageView.setImageResource(R.mipmap.icon_history_arrow_up_gray);
                animateClose(linearLayout2, linearLayout);
            } else {
                imageView.setImageResource(R.mipmap.icon_history_arrow_down);
                animateOpen(linearLayout2, linearLayout);
            }
            int i3 = component4 + 89;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        BooleanUtils.TRUE.equals(linearLayout.getTag());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void animateOpen(LinearLayout linearLayout, final LinearLayout linearLayout2) {
        int i = 2 % 2;
        linearLayout.setVisibility(0);
        ValueAnimator valueAnimatorCreateDropAnimator = createDropAnimator(linearLayout, 0, ((Integer) linearLayout.getTag()).intValue());
        valueAnimatorCreateDropAnimator.addListener(new AnimatorListenerAdapter(this) {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void onAnimationEnd(Animator animator) {
                int i2 = 2 % 2;
                int i3 = copydefault + 43;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    linearLayout2.setTag(BooleanUtils.TRUE);
                } else {
                    linearLayout2.setTag(BooleanUtils.TRUE);
                    throw null;
                }
            }
        });
        valueAnimatorCreateDropAnimator.start();
        int i2 = getRequestBeneficiariesState + 53;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 74 / 0;
        }
    }

    private void animateClose(final LinearLayout linearLayout, final LinearLayout linearLayout2) {
        int i = 2 % 2;
        ValueAnimator valueAnimatorCreateDropAnimator = createDropAnimator(linearLayout, linearLayout.getHeight(), 0);
        valueAnimatorCreateDropAnimator.addListener(new AnimatorListenerAdapter(this) {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onAnimationEnd(Animator animator) {
                LinearLayout linearLayout3;
                int i2;
                int i3 = 2 % 2;
                int i4 = copydefault + 101;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    linearLayout3 = linearLayout;
                    i2 = 55;
                } else {
                    linearLayout3 = linearLayout;
                    i2 = 8;
                }
                linearLayout3.setVisibility(i2);
                linearLayout2.setTag(BooleanUtils.FALSE);
            }
        });
        valueAnimatorCreateDropAnimator.start();
        int i2 = getRequestBeneficiariesState + 37;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private ValueAnimator createDropAnimator(final View view, int i, int i2) {
        int i3 = 2 % 2;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = 2 % 2;
                int i5 = component2 + 89;
                component3 = i5 % 128;
                Object obj = null;
                if (i5 % 2 != 0) {
                    TransactionHistoryDetailCustomerActivity.lambda$createDropAnimator$7(view, valueAnimator);
                    obj.hashCode();
                    throw null;
                }
                TransactionHistoryDetailCustomerActivity.lambda$createDropAnimator$7(view, valueAnimator);
                int i6 = component2 + 49;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i4 = getRequestBeneficiariesState + 81;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return valueAnimatorOfInt;
    }

    static void lambda$createDropAnimator$7(View view, ValueAnimator valueAnimator) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = iIntValue;
            view.setLayoutParams(layoutParams);
            return;
        }
        int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.height = iIntValue2;
        view.setLayoutParams(layoutParams2);
        throw null;
    }

    private void lambda$showCancelDialog$8(View view, String str) {
        int i = 2 % 2;
        int i2 = component4 + 107;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        cancelRiskTransaction();
        if (i3 != 0) {
            throw null;
        }
        int i4 = component4 + 93;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void showCancelDialog() throws Throwable {
        DialogBox.Builder builder;
        Object[] objArr;
        int i = 2 % 2;
        DialogBox.Builder content = DialogBox.builder().setContent(getString(R.string.history_details_cancel_order_tips));
        int i2 = R.string.history_details_cancel_order_cancel;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 999;
            int offsetAfter = 31 - TextUtils.getOffsetAfter("", 0);
            char cIndexOf = (char) (61684 - TextUtils.indexOf((CharSequence) "", '0'));
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            f((byte) 96, (byte) (bArr[11] - 1), bArr[87], objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(packedPositionType, offsetAfter, cIndexOf, -1638177773, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954659_res_0x7f130be3).substring(6, 9).codePointAt(1) - 1050611617, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) - 32), (-210167761) - Color.green(0), (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(28) - 181, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        h((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11800, new char[]{17618, 27330, 6372, 52876, 64672, 41647, 20549, 1610, 13338, 55863, 34849, 49104, 28146, 5023, 49548}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int maxKeyCode = 999 - (KeyEvent.getMaxKeyCode() >> 16);
            int iRed = 31 - Color.red(0);
            char cIndexOf2 = (char) (TextUtils.indexOf("", "") + 61685);
            byte[] bArr2 = $$d;
            builder = content;
            Object[] objArr5 = new Object[1];
            f((byte) 81, (byte) (-bArr2[73]), (byte) (-bArr2[20]), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(maxKeyCode, iRed, cIndexOf2, 1267259187, false, (String) objArr5[0], null);
        } else {
            builder = content;
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i3 = getRequestBeneficiariesState + 23;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int iBlue = 999 - Color.blue(0);
                int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30;
                char cLastIndexOf = (char) (61684 - TextUtils.lastIndexOf("", '0', 0));
                byte b2 = (byte) ($$e & 382);
                byte[] bArr3 = $$d;
                Object[] objArr6 = new Object[1];
                f(b2, (byte) (-bArr3[73]), (byte) (-bArr3[20]), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, i5, cLastIndexOf, 1267122354, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i6 = ((int[]) objArr7[2])[0];
            int i7 = ((int[]) objArr7[1])[0];
            int mode = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getMode();
            int i8 = (-1905128135) + (((~((-591672483) | mode)) | (-157800912)) * (-964)) + (((~((~mode) | (-591672483))) | 570434592) * (-964)) + 919891359;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2217 - Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "", 0, 0) + 45, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objCopydefault4).newInstance(null), 919891359, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int i11 = 999 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int iMyTid = 31 - (Process.myTid() >> 22);
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 61685);
                    byte[] bArr4 = $$d;
                    Object[] objArr9 = new Object[1];
                    f((byte) 63, (byte) (-bArr4[73]), (byte) (-bArr4[20]), objArr9);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i11, iMyTid, cResolveOpacity, 939672146, false, (String) objArr9[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault(1030 - (ViewConfiguration.getLongPressTimeout() >> 16), 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) TextUtils.indexOf("", "")), (Class) ITrustedWebActivityCallbackDefault.copydefault(1072 - TextUtils.getCapsMode("", 0, 0), KeyEvent.normalizeMetaState(0) + 43, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33530)), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objCopydefault5).invoke(null, objArr8);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 999;
                    int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31;
                    char cGreen = (char) (Color.green(0) + 61685);
                    byte b3 = (byte) ($$e & 382);
                    byte[] bArr5 = $$d;
                    Object[] objArr10 = new Object[1];
                    f(b3, (byte) (-bArr5[73]), (byte) (-bArr5[20]), objArr10);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iMakeMeasureSpec, minimumFlingVelocity, cGreen, 1267122354, false, (String) objArr10[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    g(KeyEvent.keyCodeFromString("") - 1050611501, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 102), ((Process.getThreadPriority(0) + 20) >> 6) - 210167761, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).codePointAt(0) - 37), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(22) - 182, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952856_res_0x7f1304d8).substring(9, 10).length() + 11800, new char[]{17618, 27330, 6372, 52876, 64672, 41647, 20549, 1610, 13338, 55863, 34849, 49104, 28146, 5023, 49548}, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 999;
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 31;
                        char cMyPid = (char) ((Process.myPid() >> 22) + 61685);
                        byte[] bArr6 = $$d;
                        Object[] objArr13 = new Object[1];
                        f((byte) 81, (byte) (-bArr6[73]), (byte) (-bArr6[20]), objArr13);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(edgeSlop, iIndexOf, cMyPid, 1267259187, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int i12 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 998;
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0) + 31;
                        char c2 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 61684);
                        Object[] objArr14 = new Object[1];
                        f((byte) 96, (byte) ($$d[11] - 1), r10[87], objArr14);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(i12, iMakeMeasureSpec2, c2, -1638177773, false, (String) objArr14[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 != i13) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                for (String str : strArr) {
                    int i15 = component4 + 113;
                    getRequestBeneficiariesState = i15 % 128;
                    int i16 = i15 % 2;
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = 0;
            long j4 = (((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i13 ^ i14))) | (((long) 11) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 6618, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, (char) Drawable.resolveOpacity(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr15 = {-1168090108, Long.valueOf(j4), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 6562, 56 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) TextUtils.getTrimmedLength(""), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr15);
            Object[] objArr16 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i17 = ((int[]) objArr[3])[0];
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[1])[0];
            int streamVolume = ((AudioManager) ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getStreamVolume(3);
            int i20 = i17 + ((~((-285329413) | streamVolume)) * 521) + 934131196 + (((~((~streamVolume) | (-285329413))) | (-1035860471)) * 521);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr16[3])[0] = i22 ^ (i22 << 5);
            throw new RuntimeException(String.valueOf(i14));
        }
        Object[] objArr17 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
        int i23 = ((int[]) objArr[3])[0];
        int i24 = ((int[]) objArr[2])[0];
        int i25 = ((int[]) objArr[1])[0];
        int iMyTid2 = Process.myTid();
        int i26 = i23 + 1017517323 + (((~((~iMyTid2) | (-545832965))) | (~(749464927 | iMyTid2))) * (-302)) + ((~((-545832965) | iMyTid2)) * (-604)) + (((~(iMyTid2 | 203631963)) | 203623497) * 302);
        int i27 = (i26 << 13) ^ i26;
        int i28 = i27 ^ (i27 >>> 17);
        ((int[]) objArr17[3])[0] = i28 ^ (i28 << 5);
        Object[] objArr18 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
        int i29 = ((int[]) objArr17[3])[0];
        int i30 = ((int[]) objArr17[2])[0];
        int i31 = ((int[]) objArr17[1])[0];
        int iIdentityHashCode = System.identityHashCode(this);
        int i32 = ~iIdentityHashCode;
        int i33 = i29 + (-765846267) + (((~(312202577 | i32)) | 134228000) * (-108)) + (((~(i32 | 437270816)) | (~((-437270817) | iIdentityHashCode)) | 9159761) * 54) + ((iIdentityHashCode | 9159761) * 54);
        int i34 = (i33 << 13) ^ i33;
        int i35 = i34 ^ (i34 >>> 17);
        ((int[]) objArr18[3])[0] = i35 ^ (i35 << 5);
        DialogBox dialogBoxBuild = builder.setLeftButtonText(getString(i2)).setRightButtonText(getString(R.string.history_details_cancel_order_confim)).setRightButtonListener(new DialogBox.DialogBoxListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onButtonClick(View view, String str2) {
                int i36 = 2 % 2;
                int i37 = copydefault + 15;
                component3 = i37 % 128;
                int i38 = i37 % 2;
                TransactionHistoryDetailCustomerActivity.m12232$r8$lambda$nZo7K1lHBLJjYkrdYkPoeWeTsE(this.f$0, view, str2);
                int i39 = component3 + 107;
                copydefault = i39 % 128;
                int i40 = i39 % 2;
            }
        }).build();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        String strConcat = "11;11;20;11;".concat("CancelDialog");
        int i36 = ((int[]) objArr18[3])[0];
        int i37 = i36 * i36;
        int i38 = -(900235142 * i36);
        int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
        int i40 = -(i36 * 1521615404);
        int i41 = (i39 & i40) + (i40 | i39);
        int i42 = (i41 ^ (-323536911)) + (((-323536911) & i41) << 1);
        int i43 = ((i42 >> 17) - 65535) / 32768;
        int i44 = (i43 & 1) + (i43 | 1);
        int i45 = (i42 & i44) + (i44 | i42);
        int i46 = i42 >> 16;
        int i47 = -(i45 ^ ((((i46 ^ (-131071)) + ((i46 & (-131071)) << 1)) / 65536) + 1));
        int i48 = (((r6 >> 21) - 4095) / 2048) + 1;
        dialogBoxBuild.show(supportFragmentManager, strConcat.substring(79500 / (((-((i48 ^ 1) + ((i48 & 1) << 1))) & (((i47 | 5) << 1) - (5 ^ i47))) * 1325)));
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = component4 + 75;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.transaction_history_detail_customer_activity;
        int i5 = getRequestBeneficiariesState + 111;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01b8  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01b9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(45:943|53|(1:55)|56|57|80|(6:931|81|(3:83|967|84)|88|89|920)|(5:91|92|(1:94)|95|96)(46:98|99|923|100|101|911|102|(2:950|104)|108|109|110|(11:112|933|113|117|118|905|119|(3:121|925|122)(1:126)|127|(1:129)|130)(8:117|118|905|119|(0)(0)|127|(0)|130)|180|918|181|(2:896|183)|187|188|917|(4:190|191|(1:193)|194)(19:196|197|901|198|(2:973|200)|204|205|890|206|(2:882|208)|212|213|214|(1:216)|217|(1:219)(1:221)|222|(1:224)|225)|226|(4:229|(2:231|987)(11:232|(3:234|(4:237|(2:239|989)(3:241|242|990)|240|235)|988)|243|869|244|(1:246)|247|248|860|249|986)|250|227)|985|262|291|913|292|(3:294|915|295)|299|300|907|(5:302|303|(1:305)|306|307)(25:308|309|909|310|311|892|312|(2:864|314)|318|319|884|320|(2:888|322)|326|327|328|(2:965|330)|334|335|878|336|(3:338|876|339)(1:341)|342|(1:344)|345)|346|(4:349|(2:351|1006)(11:352|(3:354|(3:357|358|355)|1007)|362|862|363|(1:365)|366|367|975|368|1005)|369|347)|1004|381|414|880|415|(15:908|417|421|422|873|423|(4:903|425|426|427)(1:432)|433|434|947|(4:436|437|(1:439)|440)(13:441|(2:443|(3:445|446|(2:448|450)(1:449))(1:450))(1:452)|(20:454|979|455|(2:927|457)|461|462|955|463|(2:969|465)|469|470|471|(1:473)|474|475|476|(3:478|971|479)(1:481)|482|(2:484|485)|486)(1:536)|541|542|957|543|546|547|(1:549)|550|551|552)|487|(4:490|(2:492|993)(11:493|(3:495|(3:498|499|496)|994)|502|939|503|(1:505)|506|507|937|508|992)|509|488)|991|523)(13:421|422|873|423|(0)(0)|433|434|947|(0)(0)|487|(1:488)|991|523)|553|(1:555)|556|(3:558|(1:560)|561)(14:562|563|(1:565)|566|567|(1:569)|570|961|571|572|(1:574)(1:575)|576|(1:578)|579)|580|(9:582|(1:584)|585|(1:587)(1:588)|589|(3:591|(1:593)|594)(16:596|597|(1:599)|600|(1:602)|603|604|(1:606)|607|867|608|609|(1:611)|612|(1:614)|615)|595|616|(27:618|871|619|(3:621|898|622)|626|(4:628|629|866|630)(1:631)|632|(3:634|(1:636)|637)(18:638|(16:640|(3:642|643|(2:645|647)(1:646))(1:647)|732|(1:734)|735|(3:737|(1:739)|740)(13:742|921|743|744|(1:746)|747|945|748|749|(1:751)|752|(1:754)|755)|741|756|(6:759|760|(1:762)|763|764|765)|766|(1:768)|769|(3:771|(1:773)|774)(14:776|777|(1:779)|780|781|(1:783)|784|959|785|786|(1:788)|789|(1:791)|792)|775|793|(1:1008)(7:796|797|(1:799)|800|801|802|803))|(19:649|650|981|651|(1:653)|654|655|963|656|(1:658)|659|660|661|(1:663)|664|(1:666)|667|(1:669)|670)|715|732|(0)|735|(0)(0)|741|756|(0)|766|(0)|769|(0)(0)|775|793|(0)(0))|671|(4:675|(3:997|677|1000)(12:996|678|(3:680|(4:683|684|685|681)|1001)|686|948|687|(1:689)|690|691|941|692|999)|998|672)|995|674|715|732|(0)|735|(0)(0)|741|756|(0)|766|(0)|769|(0)(0)|775|793|(0)(0))(10:813|(3:815|(2:818|816)|1002)|819|820|(1:822)|823|(1:825)|826|827|828))(10:831|(3:833|(2:836|834)|1003)|837|838|(1:840)|841|(1:843)|844|845|846))|97|131|(1:133)(9:134|894|135|(1:137)|138|139|140|886|141)|180|918|181|(0)|187|188|917|(0)(0)|226|(1:227)|985|262|291|913|292|(0)|299|300|907|(0)(0)|346|(1:347)|1004|381|414|880|415|(0)(0)|553|(0)|556|(0)(0)|580|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x1256, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x1258, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x1259, code lost:
    
        r32 = r9;
        r30 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x125d, code lost:
    
        r1 = r0;
        r11 = r11;
        r30 = r30;
        r32 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x184a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x184f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x1850, code lost:
    
        r11 = r8;
        r9 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x2032, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x2033, code lost:
    
        r32 = r9;
        r7 = r30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1008:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0b62  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0b7b A[Catch: all -> 0x0b5d, TRY_ENTER, TRY_LEAVE, TryCatch #37 {all -> 0x0b5d, blocks: (B:122:0x0b19, B:129:0x0b7b), top: B:925:0x0b19 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0d52 A[Catch: all -> 0x068b, TryCatch #51 {all -> 0x068b, blocks: (B:174:0x0d4c, B:176:0x0d52, B:177:0x0d7a, B:285:0x1350, B:287:0x1356, B:288:0x137d, B:408:0x18d0, B:410:0x18d6, B:411:0x18fd, B:547:0x20c1, B:549:0x20c7, B:550:0x20f4, B:726:0x2f93, B:728:0x2f99, B:729:0x2fc1, B:760:0x346a, B:762:0x3470, B:763:0x3498, B:797:0x37a7, B:799:0x37ad, B:800:0x37ce, B:777:0x35e0, B:779:0x3603, B:780:0x365b, B:820:0x38a2, B:822:0x38a8, B:823:0x38d3, B:825:0x390d, B:826:0x394f, B:597:0x26d8, B:599:0x26ed, B:600:0x271c, B:602:0x2750, B:603:0x27c8, B:838:0x3a28, B:840:0x3a2e, B:841:0x3a50, B:843:0x3a8a, B:844:0x3acd, B:563:0x22b0, B:565:0x22c5, B:566:0x22f7, B:74:0x089b, B:76:0x08a1, B:77:0x08ca, B:23:0x0282, B:25:0x0288, B:26:0x02b0, B:28:0x05f7, B:30:0x0629, B:31:0x0685), top: B:952:0x0282 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0e55  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0eac A[Catch: all -> 0x1258, TRY_ENTER, TRY_LEAVE, TryCatch #33 {all -> 0x1258, blocks: (B:181:0x0df8, B:187:0x0e48, B:226:0x10f1, B:227:0x10f5, B:229:0x10fb, B:232:0x1117, B:196:0x0eac, B:214:0x0fc8, B:217:0x1015, B:222:0x108c, B:225:0x10e9), top: B:918:0x0df8 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x10fb A[Catch: all -> 0x1258, TryCatch #33 {all -> 0x1258, blocks: (B:181:0x0df8, B:187:0x0e48, B:226:0x10f1, B:227:0x10f5, B:229:0x10fb, B:232:0x1117, B:196:0x0eac, B:214:0x0fc8, B:217:0x1015, B:222:0x108c, B:225:0x10e9), top: B:918:0x0df8 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x1356 A[Catch: all -> 0x068b, TryCatch #51 {all -> 0x068b, blocks: (B:174:0x0d4c, B:176:0x0d52, B:177:0x0d7a, B:285:0x1350, B:287:0x1356, B:288:0x137d, B:408:0x18d0, B:410:0x18d6, B:411:0x18fd, B:547:0x20c1, B:549:0x20c7, B:550:0x20f4, B:726:0x2f93, B:728:0x2f99, B:729:0x2fc1, B:760:0x346a, B:762:0x3470, B:763:0x3498, B:797:0x37a7, B:799:0x37ad, B:800:0x37ce, B:777:0x35e0, B:779:0x3603, B:780:0x365b, B:820:0x38a2, B:822:0x38a8, B:823:0x38d3, B:825:0x390d, B:826:0x394f, B:597:0x26d8, B:599:0x26ed, B:600:0x271c, B:602:0x2750, B:603:0x27c8, B:838:0x3a28, B:840:0x3a2e, B:841:0x3a50, B:843:0x3a8a, B:844:0x3acd, B:563:0x22b0, B:565:0x22c5, B:566:0x22f7, B:74:0x089b, B:76:0x08a1, B:77:0x08ca, B:23:0x0282, B:25:0x0288, B:26:0x02b0, B:28:0x05f7, B:30:0x0629, B:31:0x0685), top: B:952:0x0282 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x1405  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x1464  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x14c0 A[Catch: all -> 0x184f, TRY_ENTER, TRY_LEAVE, TryCatch #30 {all -> 0x184f, blocks: (B:292:0x13ff, B:299:0x1457, B:308:0x14c0), top: B:913:0x13ff }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x16fc A[Catch: all -> 0x1830, TryCatch #11 {all -> 0x1830, blocks: (B:346:0x16f2, B:347:0x16f6, B:349:0x16fc, B:352:0x1718, B:336:0x1627, B:342:0x1692, B:345:0x16ea), top: B:878:0x1627 }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x18d6 A[Catch: all -> 0x068b, TryCatch #51 {all -> 0x068b, blocks: (B:174:0x0d4c, B:176:0x0d52, B:177:0x0d7a, B:285:0x1350, B:287:0x1356, B:288:0x137d, B:408:0x18d0, B:410:0x18d6, B:411:0x18fd, B:547:0x20c1, B:549:0x20c7, B:550:0x20f4, B:726:0x2f93, B:728:0x2f99, B:729:0x2fc1, B:760:0x346a, B:762:0x3470, B:763:0x3498, B:797:0x37a7, B:799:0x37ad, B:800:0x37ce, B:777:0x35e0, B:779:0x3603, B:780:0x365b, B:820:0x38a2, B:822:0x38a8, B:823:0x38d3, B:825:0x390d, B:826:0x394f, B:597:0x26d8, B:599:0x26ed, B:600:0x271c, B:602:0x2750, B:603:0x27c8, B:838:0x3a28, B:840:0x3a2e, B:841:0x3a50, B:843:0x3a8a, B:844:0x3acd, B:563:0x22b0, B:565:0x22c5, B:566:0x22f7, B:74:0x089b, B:76:0x08a1, B:77:0x08ca, B:23:0x0282, B:25:0x0288, B:26:0x02b0, B:28:0x05f7, B:30:0x0629, B:31:0x0685), top: B:952:0x0282 }] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x19d3 A[Catch: all -> 0x2032, PHI: r1
  0x19d3: PHI (r1v485 java.lang.Object) = (r1v479 java.lang.Object), (r1v484 java.lang.Object) binds: [B:416:0x1980, B:417:0x1982] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x2032, blocks: (B:415:0x197c, B:421:0x19d3, B:433:0x1a53, B:454:0x1aec, B:471:0x1daa, B:474:0x1df9), top: B:880:0x197c }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x1a51  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x1a69  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x1ac6  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x1ee4 A[Catch: all -> 0x202e, TryCatch #8 {all -> 0x202e, blocks: (B:423:0x19e3, B:487:0x1eda, B:488:0x1ede, B:490:0x1ee4, B:493:0x1eff, B:476:0x1e08, B:482:0x1e71, B:486:0x1ed2), top: B:873:0x19e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:549:0x20c7 A[Catch: all -> 0x068b, TryCatch #51 {all -> 0x068b, blocks: (B:174:0x0d4c, B:176:0x0d52, B:177:0x0d7a, B:285:0x1350, B:287:0x1356, B:288:0x137d, B:408:0x18d0, B:410:0x18d6, B:411:0x18fd, B:547:0x20c1, B:549:0x20c7, B:550:0x20f4, B:726:0x2f93, B:728:0x2f99, B:729:0x2fc1, B:760:0x346a, B:762:0x3470, B:763:0x3498, B:797:0x37a7, B:799:0x37ad, B:800:0x37ce, B:777:0x35e0, B:779:0x3603, B:780:0x365b, B:820:0x38a2, B:822:0x38a8, B:823:0x38d3, B:825:0x390d, B:826:0x394f, B:597:0x26d8, B:599:0x26ed, B:600:0x271c, B:602:0x2750, B:603:0x27c8, B:838:0x3a28, B:840:0x3a2e, B:841:0x3a50, B:843:0x3a8a, B:844:0x3acd, B:563:0x22b0, B:565:0x22c5, B:566:0x22f7, B:74:0x089b, B:76:0x08a1, B:77:0x08ca, B:23:0x0282, B:25:0x0288, B:26:0x02b0, B:28:0x05f7, B:30:0x0629, B:31:0x0685), top: B:952:0x0282 }] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x217a  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x21cc  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x228e  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x2443  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x2f99 A[Catch: all -> 0x068b, TryCatch #51 {all -> 0x068b, blocks: (B:174:0x0d4c, B:176:0x0d52, B:177:0x0d7a, B:285:0x1350, B:287:0x1356, B:288:0x137d, B:408:0x18d0, B:410:0x18d6, B:411:0x18fd, B:547:0x20c1, B:549:0x20c7, B:550:0x20f4, B:726:0x2f93, B:728:0x2f99, B:729:0x2fc1, B:760:0x346a, B:762:0x3470, B:763:0x3498, B:797:0x37a7, B:799:0x37ad, B:800:0x37ce, B:777:0x35e0, B:779:0x3603, B:780:0x365b, B:820:0x38a2, B:822:0x38a8, B:823:0x38d3, B:825:0x390d, B:826:0x394f, B:597:0x26d8, B:599:0x26ed, B:600:0x271c, B:602:0x2750, B:603:0x27c8, B:838:0x3a28, B:840:0x3a2e, B:841:0x3a50, B:843:0x3a8a, B:844:0x3acd, B:563:0x22b0, B:565:0x22c5, B:566:0x22f7, B:74:0x089b, B:76:0x08a1, B:77:0x08ca, B:23:0x0282, B:25:0x0288, B:26:0x02b0, B:28:0x05f7, B:30:0x0629, B:31:0x0685), top: B:952:0x0282 }] */
    /* JADX WARN: Removed duplicated region for block: B:734:0x3056  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x30a4  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x3104  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x344b  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x3520  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x3571  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x35c2  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x3787  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:831:0x39f1  */
    /* JADX WARN: Removed duplicated region for block: B:896:0x0dfe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:903:0x19fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:908:0x1982 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v268 */
    /* JADX WARN: Type inference failed for: r10v269 */
    /* JADX WARN: Type inference failed for: r10v271 */
    /* JADX WARN: Type inference failed for: r10v272 */
    /* JADX WARN: Type inference failed for: r10v273 */
    /* JADX WARN: Type inference failed for: r10v274 */
    /* JADX WARN: Type inference failed for: r10v275 */
    /* JADX WARN: Type inference failed for: r10v276 */
    /* JADX WARN: Type inference failed for: r10v277 */
    /* JADX WARN: Type inference failed for: r10v282, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v283 */
    /* JADX WARN: Type inference failed for: r10v287 */
    /* JADX WARN: Type inference failed for: r10v288 */
    /* JADX WARN: Type inference failed for: r10v289 */
    /* JADX WARN: Type inference failed for: r10v291 */
    /* JADX WARN: Type inference failed for: r10v312 */
    /* JADX WARN: Type inference failed for: r10v313 */
    /* JADX WARN: Type inference failed for: r10v314 */
    /* JADX WARN: Type inference failed for: r10v315 */
    /* JADX WARN: Type inference failed for: r10v316 */
    /* JADX WARN: Type inference failed for: r10v317 */
    /* JADX WARN: Type inference failed for: r10v318 */
    /* JADX WARN: Type inference failed for: r10v319 */
    /* JADX WARN: Type inference failed for: r10v320 */
    /* JADX WARN: Type inference failed for: r10v321 */
    /* JADX WARN: Type inference failed for: r10v322 */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r10v79 */
    /* JADX WARN: Type inference failed for: r10v80, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v81 */
    /* JADX WARN: Type inference failed for: r11v127, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v128 */
    /* JADX WARN: Type inference failed for: r11v129 */
    /* JADX WARN: Type inference failed for: r11v130 */
    /* JADX WARN: Type inference failed for: r11v131 */
    /* JADX WARN: Type inference failed for: r11v132 */
    /* JADX WARN: Type inference failed for: r11v138 */
    /* JADX WARN: Type inference failed for: r11v139 */
    /* JADX WARN: Type inference failed for: r11v140 */
    /* JADX WARN: Type inference failed for: r11v141 */
    /* JADX WARN: Type inference failed for: r11v142 */
    /* JADX WARN: Type inference failed for: r11v143 */
    /* JADX WARN: Type inference failed for: r11v144 */
    /* JADX WARN: Type inference failed for: r11v145 */
    /* JADX WARN: Type inference failed for: r11v147 */
    /* JADX WARN: Type inference failed for: r11v151 */
    /* JADX WARN: Type inference failed for: r11v152 */
    /* JADX WARN: Type inference failed for: r11v153 */
    /* JADX WARN: Type inference failed for: r11v154 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v161 */
    /* JADX WARN: Type inference failed for: r11v162 */
    /* JADX WARN: Type inference failed for: r11v163 */
    /* JADX WARN: Type inference failed for: r11v168 */
    /* JADX WARN: Type inference failed for: r11v175 */
    /* JADX WARN: Type inference failed for: r11v176 */
    /* JADX WARN: Type inference failed for: r11v177 */
    /* JADX WARN: Type inference failed for: r11v178 */
    /* JADX WARN: Type inference failed for: r11v179 */
    /* JADX WARN: Type inference failed for: r11v189 */
    /* JADX WARN: Type inference failed for: r11v190 */
    /* JADX WARN: Type inference failed for: r11v194 */
    /* JADX WARN: Type inference failed for: r11v195 */
    /* JADX WARN: Type inference failed for: r11v203 */
    /* JADX WARN: Type inference failed for: r11v204 */
    /* JADX WARN: Type inference failed for: r11v205 */
    /* JADX WARN: Type inference failed for: r11v206 */
    /* JADX WARN: Type inference failed for: r11v207 */
    /* JADX WARN: Type inference failed for: r11v208 */
    /* JADX WARN: Type inference failed for: r11v209 */
    /* JADX WARN: Type inference failed for: r11v210 */
    /* JADX WARN: Type inference failed for: r11v211 */
    /* JADX WARN: Type inference failed for: r11v212 */
    /* JADX WARN: Type inference failed for: r11v213 */
    /* JADX WARN: Type inference failed for: r11v214 */
    /* JADX WARN: Type inference failed for: r11v215 */
    /* JADX WARN: Type inference failed for: r11v216 */
    /* JADX WARN: Type inference failed for: r11v217 */
    /* JADX WARN: Type inference failed for: r11v218 */
    /* JADX WARN: Type inference failed for: r11v219 */
    /* JADX WARN: Type inference failed for: r11v220 */
    /* JADX WARN: Type inference failed for: r11v221 */
    /* JADX WARN: Type inference failed for: r11v222 */
    /* JADX WARN: Type inference failed for: r11v223 */
    /* JADX WARN: Type inference failed for: r11v224 */
    /* JADX WARN: Type inference failed for: r11v225 */
    /* JADX WARN: Type inference failed for: r11v226 */
    /* JADX WARN: Type inference failed for: r11v227 */
    /* JADX WARN: Type inference failed for: r11v228 */
    /* JADX WARN: Type inference failed for: r11v229 */
    /* JADX WARN: Type inference failed for: r11v230 */
    /* JADX WARN: Type inference failed for: r11v231 */
    /* JADX WARN: Type inference failed for: r11v232 */
    /* JADX WARN: Type inference failed for: r11v233 */
    /* JADX WARN: Type inference failed for: r11v234 */
    /* JADX WARN: Type inference failed for: r11v235 */
    /* JADX WARN: Type inference failed for: r11v236 */
    /* JADX WARN: Type inference failed for: r11v237 */
    /* JADX WARN: Type inference failed for: r11v238 */
    /* JADX WARN: Type inference failed for: r11v239 */
    /* JADX WARN: Type inference failed for: r11v240 */
    /* JADX WARN: Type inference failed for: r11v241 */
    /* JADX WARN: Type inference failed for: r11v242 */
    /* JADX WARN: Type inference failed for: r11v60 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v72, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r24v12 */
    /* JADX WARN: Type inference failed for: r24v13 */
    /* JADX WARN: Type inference failed for: r24v14 */
    /* JADX WARN: Type inference failed for: r24v15 */
    /* JADX WARN: Type inference failed for: r24v16 */
    /* JADX WARN: Type inference failed for: r24v19 */
    /* JADX WARN: Type inference failed for: r24v20 */
    /* JADX WARN: Type inference failed for: r24v21 */
    /* JADX WARN: Type inference failed for: r24v22 */
    /* JADX WARN: Type inference failed for: r24v23 */
    /* JADX WARN: Type inference failed for: r24v24 */
    /* JADX WARN: Type inference failed for: r24v50 */
    /* JADX WARN: Type inference failed for: r24v51 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v11 */
    /* JADX WARN: Type inference failed for: r30v12 */
    /* JADX WARN: Type inference failed for: r30v13 */
    /* JADX WARN: Type inference failed for: r30v14 */
    /* JADX WARN: Type inference failed for: r30v15 */
    /* JADX WARN: Type inference failed for: r30v16 */
    /* JADX WARN: Type inference failed for: r30v17 */
    /* JADX WARN: Type inference failed for: r30v18 */
    /* JADX WARN: Type inference failed for: r30v19 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v20 */
    /* JADX WARN: Type inference failed for: r30v21 */
    /* JADX WARN: Type inference failed for: r30v22 */
    /* JADX WARN: Type inference failed for: r30v23 */
    /* JADX WARN: Type inference failed for: r30v24 */
    /* JADX WARN: Type inference failed for: r30v25 */
    /* JADX WARN: Type inference failed for: r30v26 */
    /* JADX WARN: Type inference failed for: r30v27 */
    /* JADX WARN: Type inference failed for: r30v28 */
    /* JADX WARN: Type inference failed for: r30v29 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v30 */
    /* JADX WARN: Type inference failed for: r30v31 */
    /* JADX WARN: Type inference failed for: r30v32 */
    /* JADX WARN: Type inference failed for: r30v33 */
    /* JADX WARN: Type inference failed for: r30v34 */
    /* JADX WARN: Type inference failed for: r30v35 */
    /* JADX WARN: Type inference failed for: r30v36 */
    /* JADX WARN: Type inference failed for: r30v37 */
    /* JADX WARN: Type inference failed for: r30v38 */
    /* JADX WARN: Type inference failed for: r30v39 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v40 */
    /* JADX WARN: Type inference failed for: r30v41 */
    /* JADX WARN: Type inference failed for: r30v5 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v11 */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v13 */
    /* JADX WARN: Type inference failed for: r32v14 */
    /* JADX WARN: Type inference failed for: r32v15 */
    /* JADX WARN: Type inference failed for: r32v16 */
    /* JADX WARN: Type inference failed for: r32v17 */
    /* JADX WARN: Type inference failed for: r32v18 */
    /* JADX WARN: Type inference failed for: r32v19 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v20 */
    /* JADX WARN: Type inference failed for: r32v21 */
    /* JADX WARN: Type inference failed for: r32v22 */
    /* JADX WARN: Type inference failed for: r32v23 */
    /* JADX WARN: Type inference failed for: r32v24 */
    /* JADX WARN: Type inference failed for: r32v25 */
    /* JADX WARN: Type inference failed for: r32v26 */
    /* JADX WARN: Type inference failed for: r32v27 */
    /* JADX WARN: Type inference failed for: r32v28 */
    /* JADX WARN: Type inference failed for: r32v29 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v30 */
    /* JADX WARN: Type inference failed for: r32v31 */
    /* JADX WARN: Type inference failed for: r32v32 */
    /* JADX WARN: Type inference failed for: r32v33 */
    /* JADX WARN: Type inference failed for: r32v34 */
    /* JADX WARN: Type inference failed for: r32v35 */
    /* JADX WARN: Type inference failed for: r32v36 */
    /* JADX WARN: Type inference failed for: r32v37 */
    /* JADX WARN: Type inference failed for: r32v38 */
    /* JADX WARN: Type inference failed for: r32v39 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v40 */
    /* JADX WARN: Type inference failed for: r32v41 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r6v112, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v122, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v123, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v177, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v199 */
    /* JADX WARN: Type inference failed for: r6v514 */
    /* JADX WARN: Type inference failed for: r7v113 */
    /* JADX WARN: Type inference failed for: r7v114 */
    /* JADX WARN: Type inference failed for: r7v116, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v117 */
    /* JADX WARN: Type inference failed for: r7v120 */
    /* JADX WARN: Type inference failed for: r7v122 */
    /* JADX WARN: Type inference failed for: r7v123 */
    /* JADX WARN: Type inference failed for: r7v124 */
    /* JADX WARN: Type inference failed for: r7v150 */
    /* JADX WARN: Type inference failed for: r7v154 */
    /* JADX WARN: Type inference failed for: r7v165 */
    /* JADX WARN: Type inference failed for: r7v167 */
    /* JADX WARN: Type inference failed for: r7v168, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v172 */
    /* JADX WARN: Type inference failed for: r7v173 */
    /* JADX WARN: Type inference failed for: r7v174 */
    /* JADX WARN: Type inference failed for: r7v188, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v189 */
    /* JADX WARN: Type inference failed for: r7v190 */
    /* JADX WARN: Type inference failed for: r7v191 */
    /* JADX WARN: Type inference failed for: r7v192 */
    /* JADX WARN: Type inference failed for: r7v197 */
    /* JADX WARN: Type inference failed for: r7v198 */
    /* JADX WARN: Type inference failed for: r7v280 */
    /* JADX WARN: Type inference failed for: r7v281 */
    /* JADX WARN: Type inference failed for: r7v282 */
    /* JADX WARN: Type inference failed for: r7v283 */
    /* JADX WARN: Type inference failed for: r7v284 */
    /* JADX WARN: Type inference failed for: r7v285 */
    /* JADX WARN: Type inference failed for: r7v286 */
    /* JADX WARN: Type inference failed for: r7v287 */
    /* JADX WARN: Type inference failed for: r7v288 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r7v85, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v320 */
    /* JADX WARN: Type inference failed for: r8v321 */
    /* JADX WARN: Type inference failed for: r8v322 */
    /* JADX WARN: Type inference failed for: r8v323 */
    /* JADX WARN: Type inference failed for: r8v324 */
    /* JADX WARN: Type inference failed for: r8v328 */
    /* JADX WARN: Type inference failed for: r8v329 */
    /* JADX WARN: Type inference failed for: r8v330 */
    /* JADX WARN: Type inference failed for: r8v331 */
    /* JADX WARN: Type inference failed for: r8v332 */
    /* JADX WARN: Type inference failed for: r8v343 */
    /* JADX WARN: Type inference failed for: r8v345 */
    /* JADX WARN: Type inference failed for: r8v350 */
    /* JADX WARN: Type inference failed for: r8v351 */
    /* JADX WARN: Type inference failed for: r8v352 */
    /* JADX WARN: Type inference failed for: r8v356 */
    /* JADX WARN: Type inference failed for: r8v379 */
    /* JADX WARN: Type inference failed for: r8v380 */
    /* JADX WARN: Type inference failed for: r8v381 */
    /* JADX WARN: Type inference failed for: r8v382 */
    /* JADX WARN: Type inference failed for: r8v383 */
    /* JADX WARN: Type inference failed for: r8v384 */
    /* JADX WARN: Type inference failed for: r8v385 */
    /* JADX WARN: Type inference failed for: r8v386 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66 */
    /* JADX WARN: Type inference failed for: r8v67, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v107 */
    /* JADX WARN: Type inference failed for: r9v108 */
    /* JADX WARN: Type inference failed for: r9v109 */
    /* JADX WARN: Type inference failed for: r9v110, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v111 */
    /* JADX WARN: Type inference failed for: r9v112 */
    /* JADX WARN: Type inference failed for: r9v113 */
    /* JADX WARN: Type inference failed for: r9v114 */
    /* JADX WARN: Type inference failed for: r9v115, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v116, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v117, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v163 */
    /* JADX WARN: Type inference failed for: r9v166 */
    /* JADX WARN: Type inference failed for: r9v167 */
    /* JADX WARN: Type inference failed for: r9v168 */
    /* JADX WARN: Type inference failed for: r9v169 */
    /* JADX WARN: Type inference failed for: r9v177 */
    /* JADX WARN: Type inference failed for: r9v178 */
    /* JADX WARN: Type inference failed for: r9v179 */
    /* JADX WARN: Type inference failed for: r9v180, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v181 */
    /* JADX WARN: Type inference failed for: r9v182 */
    /* JADX WARN: Type inference failed for: r9v183 */
    /* JADX WARN: Type inference failed for: r9v184 */
    /* JADX WARN: Type inference failed for: r9v185 */
    /* JADX WARN: Type inference failed for: r9v186 */
    /* JADX WARN: Type inference failed for: r9v187 */
    /* JADX WARN: Type inference failed for: r9v192 */
    /* JADX WARN: Type inference failed for: r9v193 */
    /* JADX WARN: Type inference failed for: r9v199 */
    /* JADX WARN: Type inference failed for: r9v200 */
    /* JADX WARN: Type inference failed for: r9v201 */
    /* JADX WARN: Type inference failed for: r9v202 */
    /* JADX WARN: Type inference failed for: r9v203, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v204 */
    /* JADX WARN: Type inference failed for: r9v205 */
    /* JADX WARN: Type inference failed for: r9v206 */
    /* JADX WARN: Type inference failed for: r9v210 */
    /* JADX WARN: Type inference failed for: r9v213 */
    /* JADX WARN: Type inference failed for: r9v215 */
    /* JADX WARN: Type inference failed for: r9v221 */
    /* JADX WARN: Type inference failed for: r9v222 */
    /* JADX WARN: Type inference failed for: r9v223 */
    /* JADX WARN: Type inference failed for: r9v224 */
    /* JADX WARN: Type inference failed for: r9v225 */
    /* JADX WARN: Type inference failed for: r9v226 */
    /* JADX WARN: Type inference failed for: r9v227 */
    /* JADX WARN: Type inference failed for: r9v228 */
    /* JADX WARN: Type inference failed for: r9v229 */
    /* JADX WARN: Type inference failed for: r9v230 */
    /* JADX WARN: Type inference failed for: r9v231 */
    /* JADX WARN: Type inference failed for: r9v232 */
    /* JADX WARN: Type inference failed for: r9v233 */
    /* JADX WARN: Type inference failed for: r9v234 */
    /* JADX WARN: Type inference failed for: r9v235 */
    /* JADX WARN: Type inference failed for: r9v236 */
    /* JADX WARN: Type inference failed for: r9v237 */
    /* JADX WARN: Type inference failed for: r9v238 */
    /* JADX WARN: Type inference failed for: r9v239 */
    /* JADX WARN: Type inference failed for: r9v240 */
    /* JADX WARN: Type inference failed for: r9v241 */
    /* JADX WARN: Type inference failed for: r9v242 */
    /* JADX WARN: Type inference failed for: r9v243 */
    /* JADX WARN: Type inference failed for: r9v244 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryDetailCustomerActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$4z8RKyB_hJ0lqxkq3v4a9WcuOEE(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = component4 + 13;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        transactionHistoryDetailCustomerActivity.lambda$initObserver$1(resource);
        int i4 = getRequestBeneficiariesState + 49;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void $r8$lambda$A0PHOBCzyFKxhaoMyUDWGJDLltY(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, View view) {
        int i = 2 % 2;
        int i2 = component4 + 79;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m12234instrumented$0$attachEvent$LandroidviewViewV(transactionHistoryDetailCustomerActivity, linearLayout, imageView, linearLayout2, view);
        int i4 = getRequestBeneficiariesState + 9;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    public static void $r8$lambda$LyRG1MrNCXbeXPPfxay0mnaisHU(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m12237instrumented$0$setCancel$V(transactionHistoryDetailCustomerActivity, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$bzw8bvkanO1eWlkIaXI0SO793v8(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m12236instrumented$0$setButton$V(transactionHistoryDetailCustomerActivity, view);
        int i4 = component4 + 85;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m12232$r8$lambda$nZo7K1lHBLJjYkrdYkPoeWeTsE(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity, View view, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 85;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        transactionHistoryDetailCustomerActivity.lambda$showCancelDialog$8(view, str);
        int i4 = component4 + 27;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$nhIABv9ORNBzKIAXZgE7qa7LeMM(View view) {
        int i = 2 % 2;
        int i2 = component4 + 65;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m12235instrumented$0$fillData$V(view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m12233$r8$lambda$rO1SetLWtYfiQy2TGL7wy0TMoA(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m12238instrumented$1$setButton$V(transactionHistoryDetailCustomerActivity, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void m12234instrumented$0$attachEvent$LandroidviewViewV(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, View view) {
        int i = 2 % 2;
        int i2 = component4 + 41;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            transactionHistoryDetailCustomerActivity.lambda$attachEvent$6(linearLayout, imageView, linearLayout2, view);
            Callback.onClick_exit();
            int i4 = component4 + 107;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 88 / 0;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m12235instrumented$0$fillData$V(View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 55;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                lambda$fillData$2(view);
                Callback.onClick_exit();
            } else {
                lambda$fillData$2(view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m12236instrumented$0$setButton$V(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 57;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            transactionHistoryDetailCustomerActivity.lambda$setButton$3(view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 43;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m12237instrumented$0$setCancel$V(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                transactionHistoryDetailCustomerActivity.lambda$setCancel$5(view);
                Callback.onClick_exit();
                throw null;
            }
            transactionHistoryDetailCustomerActivity.lambda$setCancel$5(view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 55;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m12238instrumented$1$setButton$V(TransactionHistoryDetailCustomerActivity transactionHistoryDetailCustomerActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 45;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                transactionHistoryDetailCustomerActivity.lambda$setButton$4(view);
                Callback.onClick_exit();
                int i4 = 62 / 0;
            } else {
                transactionHistoryDetailCustomerActivity.lambda$setButton$4(view);
                Callback.onClick_exit();
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component4 + 69;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = component4 + 85;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getAsAtTimestamp = 0;
        component2();
        component2 = -5451339171880309849L;
        int i = getSponsorBeneficiariesState + 113;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        ShareDataUIState = -816547836;
        copydefault = -238323889;
        component3 = -45244645;
        component1 = new byte[]{33, -35, 42, 0, -1, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, 42, -43, -38, 35, Base64.padSymbol, -14, 44, 34, -38, 36, -36, 56, Ascii.VT, 58, -105, 41, 38, Ascii.SUB, -29, -46, -45, -44, 39, -33, 36, -42, 47, -36, 58, -41, -45, -44, -43, 41, 6, -28, 47, 32, -38, 41, -44, 59, 7, -44, 42, -42, 44, -43, -41, -4, -41, 3, 46, 40, 40, -26, -43, -42, 41, 44, -42, 7, -25, 7, 45, -26, 6, 42, -5, 5, 41, 45, -26, 5, -8, Ascii.ESC, -45, 41, 42, -6, Ascii.SUB, -30, 43, 5, 40, -7, Ascii.FS, -47, -15, 7, 40, -41, 45, -45, -6, 45, -42, Ascii.ESC, 41, -42, -47, -1, 5, 47, -25, Ascii.CAN, -48, 32, -48, -41, 42, -42, -5, 4, -3, Ascii.SUB, 40, -28, 4, 47, -29, Ascii.SUB, 41, -26, Ascii.CAN, -44, -5, Ascii.EM, -41, -41, 40, 44, -44, 41, -5, -41, 42, 4, 44, -48, -8, 42, 41, 4, 40, 42, -43, 44, -28, 5, -5, Ascii.US, -42, 47, 32, -58, 56, Ascii.US, -44, -107, 110, -110, 40, 39, -41, -48, 44, 19, -17, -48, 38, Ascii.ESC, -21, -41, 37, Ascii.FS, -32, -38, 56, -59, 45, -41, 38, -37, 56, -59, 39, Ascii.DLE, -109, 40, 59, -41, -58, 58, -43, -38, 35, -35, 111, -27, -42, 5, 42, 43, 41, -43, 44, -43, 40, -25, Ascii.SUB, -43, -42, 42, -42, 46, 41, -36, -18, 42, -43, 41, 37, 44, -45, 42, 42, -36, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -18, -48, 36, -36, Ascii.ETB, -28, -62, 60, -34, 40, -36, 5, -14, -36, 59, TarHeader.LF_NORMAL, -26, 44, 34, -36, 47, 32, 40, -46, 43, -43, -41, 40, 45, -42, 45, -45, 44, -48, -48, 45, 40, 40, -45, 41, 40, 42, -44, 41, Ascii.ESC, 40, -48, -41, -4, 40, 3, -4, -42, Ascii.ESC, -8, -43, 4, -6, Ascii.ESC, -6, Ascii.EM, -25, -44, Ascii.FS, -41, -25, 4, 42, -42, -41, 45, -46, -4, 2, 46, -27, Ascii.SUB, -8, -41, 4, 40, 45, -41, -7, 40, 43, 2, -7, Ascii.CAN, -42, -5, Ascii.SUB, -41, -41, -6, -44, Ascii.CAN, -8, 5, -1, -42, -42, Ascii.SUB, -27, 2, -6, -5, 43, 5, 40, 42, -27, 41, Ascii.FS, -25, 43, 3, -42, -6, 45, 3, -3, 6, -42, 40, 41, -25, Ascii.FS, -41, 42, -47, 45, -44, -41, 40, 44, -45, 46, 41, -28, Ascii.GS, 40, -25, Ascii.CAN, -47, -15, 4, 45, -45, 40, -44, 44, -41, -8, 41, -42, 6, -42, -42, 46, -25, -41, 6, -4, 7, -5, -43, 7, -41, -44, 46, -46, 40, -44, 44, -46, 46, -41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41};
        equals = 6761790584471078045L;
    }
}
