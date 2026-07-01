package com.huawei.digitalpayment.history.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.CollectionUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnLoadMoreListener;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.language.LanguageUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.digitalpayment.consumer.base.ui.widget.CustomerLoadMoreView;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils;
import com.huawei.digitalpayment.consumer.baselib.util.TimeUtils;
import com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryActivityBinding;
import com.huawei.digitalpayment.datepicker.library.FullDay;
import com.huawei.digitalpayment.datepicker.widget.RangeDatePickerFragment;
import com.huawei.digitalpayment.history.model.entity.ChannelTypeResponse;
import com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean;
import com.huawei.digitalpayment.history.model.entity.TransactionHistoryListBean;
import com.huawei.digitalpayment.history.model.request.TransChannelAndTypesRequest;
import com.huawei.digitalpayment.history.model.request.TransactionHistoryListRequest;
import com.huawei.digitalpayment.history.model.response.TransactionRecordResponse;
import com.huawei.digitalpayment.history.ui.adapter.HistoryGroupAdapter;
import com.huawei.digitalpayment.history.ui.adapter.TransactionSelectTagAdapter;
import com.huawei.digitalpayment.history.ui.data.HistoryGroupInfo;
import com.huawei.digitalpayment.history.ui.view.RecordFilter;
import com.huawei.digitalpayment.history.ui.view.TransactionHistoryView;
import com.huawei.digitalpayment.history.ui.view.TransferTypeFilterDialog;
import com.huawei.digitalpayment.history.viewmodel.TransactionHistoryViewModel;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.lifestyle.R;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.io.encoding.Base64;
import kotlin.text.Typography;
import org.bouncycastle.crypto.signers.PSSSigner;

public class TransactionHistoryActivity extends Hilt_TransactionHistoryActivity<TransactionHistoryActivityBinding, TransactionHistoryViewModel> {
    private static final int MAX_QUERY_NUM = 3;
    private static final int PAGE_SIZE = 20;
    private String bankCardNo;
    private RecordFilter currentFilterEvent;
    private int[] currentYearMonth;
    private String fromReceiveCodeActivity;
    private HistoryGroupAdapter mAdapter;
    private List<TransactionHistoryView> mRecordList;
    private TransactionSelectTagAdapter selectTypeAdapter;
    private int[] tempYearMonth;
    private static final byte[] $$l = {78, -86, -128, -128};
    private static final int $$o = 73;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {68, -59, -116, 119, -17, -3, 58, -74, 13, -10, 0, -22, 4, 1, -17, -3, 58, -59, -6, -19, 5, -3, -12, -10, -11, 1, -6, 10, -13, 58, -58, -17, -3, -8, -4, -4, 4, -14, -11, -4, SignedBytes.MAX_POWER_OF_TWO, -58, -10, -6, -12, Base64.padSymbol, -25, -36, -23, 9, Ascii.SUB, -40, -8, -13, 10, -18, 42, -42, -6, -12, 32, -46, 75, -5, -38, -56, -1, 10, -18, -1, 8, -16, 20, -43, 6, -11, 7, -2, -20, 6, 1, Ascii.DC2, -26, -17, 6, -7, -2, 44, -17, -3, -8, -4, -4, 4, -14, -11, Base64.padSymbol, -17, -3, -8, -4, -4, 4, -14, -11, 60, -11, 60, -73, 8, -1, -7, -22, 6, -18, Ascii.FF, -24, 69, -64, -10, -11, 10, -18, -1, 8, -16, 57, -70, -6, 6, -18, Ascii.FF, -24, 0, -8, -6, SignedBytes.MAX_POWER_OF_TWO, -61, -11, -8, -13, 17, -6, -15, 2, TarHeader.LF_SYMLINK, -29, -43, -8, -13, 17, -6, -15, 2, Ascii.FF, -18, -15, 1, 9, -22, -6, -8, 2, 60, PSSSigner.TRAILER_IMPLICIT, -17, -6, -14, Ascii.DLE, -6, -6, 0, -25, 4, -13};
    private static final int $$k = 142;
    private static final byte[] $$d = {102, Ascii.GS, -34, 39, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 179;
    private static int getRequestBeneficiariesState = 0;
    private static int copy = 1;
    private static char[] component2 = {33425, 33405, 33403, 33401, 33396, 33400, 33406, 33371, 33366, 33395, 33364, 33445, 33347, 33396, 33403, 33344, 33400, 33393, 33511, 33463, 33432, 33430, 33465, 33459, 33455, 33460, 33462, 33464, 33469, 33469, 33468, 33460, 33458, 33409, 33465, 33449, 33457, 33456, 33456, 33457, 33460, 33421, 33512, 33424, 33518, 33459, 33452, 33453, 33460, 33462, 33454, 33413, 33415, 33455, 33457, 33461, 33465, 33469, 33461, 33457, 33459, 33457, 33479, 33519, 33517, 33428, 33468, 33429, 33427, 33428, 33517, 33513, 33512, 33427, 33468, 33428, 33518, 33515, 33426, 33430, 33428, 33428, 33518, 33514, 33426, 33468, 33428, 33515, 33512, 33512, 33427, 33430, 33515, 33426, 33469, 33468, 33467, 33429, 33429, 33468, 33426, 33511, 33514, 33428, 33426, 33514, 33516, 33429, 33428, 33430, 33470, 33427, 33512, 33424, 33424, 33512, 33515, 33513, 33511, 33514, 33513, 33512, 33512, 33514, 33428, 33428, 33530, 33431, 33430, 33429, 33432, 33428, 33471, 33308, 33306, 33285, 33284, 33304, 33305, 33305, 33281, 33283, 33283, 33282, 33310, 33288, 33286, 33309, 33285, 33288, 33310, 33306, 33306, 33307, 33311, 33377, 33307, 33307, 33311, 33377, 33310, 33283, 33285, 33308, 33306, 33284, 33286, 33285, 33408, 33381, 33311, 33311, 33347, 33405, 33380, 33379, 33376, 33344, 33354, 33380, 33300, 33303, 33310, 33377, 33517, 33462, 33460, 33457, 33455, 33465, 33468, 33412, 33412, 33467, 33459, 33454, 33463, 33465, 33463, 33417, 33353, 33441, 33442, 33440, 33441, 33441, 33353, 33353, 33442, 33355, 33355, 33357, 33396, 33354, 33441, 33443, 33444, 33355, 33396, 33397, 33356, 33353, 33354, 33442, 33354, 33357, 33445, 33443, 33356, 33396, 33355, 33356, 33354, 33355, 33398, 33397, 33358, 33357, 33353, 33352, 33395, 33396, 33357, 33447, 33444, 33375, 33353, 33396, 33353, 33353, 33395, 33355, 33357, 33395, 33352, 33352, 33354, 33357, 33358, 33357, 33395, 33356, 33445, 33464, 33296, 33297, 33300, 33301, 33301, 33299, 33297, 33300, 33299, 33299, 33465, 33303, 33304, 33304, 33305, 33304, 33302, 33300, 33300, 33303, 33304, 33478, 33513, 33510, 33511, 33513, 33513, 33514, 33514, 33512, 33515, 33416, 33390, 33392, 33391, 33389, 33389, 33388, 33388, 33392, 33392, 33392};
    private static char component1 = 19022;
    private static char copydefault = 57471;
    private static char component3 = 23325;
    private static char ShareDataUIState = 4831;
    private int mStartNum = 0;
    private List<String> titleList = new ArrayList();
    private ArrayList<TradeTypeConfigBean> mTypeList = new ArrayList<>();
    private boolean hasMoreData = false;
    private boolean showLoading = true;
    private final Map<String, List<TransactionHistoryView>> groupMap = new LinkedHashMap();
    private boolean isLoading = false;
    private int times = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, int r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r8 = r8 + 110
            byte[] r0 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.$$l
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L25
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.$$r(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = 100 - r9
            int r7 = r7 * 2
            int r7 = r7 + 83
            int r8 = 28 - r8
            byte[] r0 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L2b
        L12:
            r3 = r2
        L13:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r9 = r9 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.h(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 6
            int r8 = 105 - r8
            int r7 = r7 * 15
            int r7 = 85 - r7
            int r9 = r9 * 3
            int r9 = r9 + 4
            byte[] r0 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.$$j
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2c:
            int r9 = -r9
            int r8 = r8 + r9
            int r9 = r3 + 1
            int r8 = r8 + (-5)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.i(int, byte, int, java.lang.Object[]):void");
    }

    static ViewDataBinding access$000(TransactionHistoryActivity transactionHistoryActivity) {
        int i = 2 % 2;
        int i2 = copy + 23;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = transactionHistoryActivity.binding;
        if (i3 == 0) {
            return binding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static ViewDataBinding access$100(TransactionHistoryActivity transactionHistoryActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 51;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = transactionHistoryActivity.binding;
        int i4 = getRequestBeneficiariesState + 33;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return binding;
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 33;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 3;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16778060, 32 - View.MeasureSpec.getSize(0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23250), 592652048, false, $$r(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(843 - ExpandableListView.getPackedPositionChild(0L), View.combineMeasuredStates(0, 0) + 32, (char) (23251 - View.MeasureSpec.getMode(0)), 592652048, false, $$r(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 465, (ViewConfiguration.getWindowTouchSlop() >> 8) + 49, (char) TextUtils.indexOf("", "", 0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void f(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        byte b2 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = component2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 15, (char) (65117 - ((byte) KeyEvent.getModifierMetaStateMask())), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == b2) {
                    int i8 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    try {
                        Object[] objArr3 = new Object[2];
                        objArr3[b2] = Integer.valueOf(c2);
                        objArr3[0] = Integer.valueOf(c3);
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            int i9 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4502;
                            int offsetBefore = 36 - TextUtils.getOffsetBefore("", 0);
                            char cBlue = (char) (27897 - Color.blue(0));
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            String str$$r = $$r(b3, b4, b4);
                            Class[] clsArr = new Class[2];
                            clsArr[0] = Integer.TYPE;
                            clsArr[b2] = Integer.TYPE;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i9, offsetBefore, cBlue, -1464227204, false, str$$r, clsArr);
                        }
                        cArr4[i8] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    char c4 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr4 = new Object[2];
                    objArr4[b2] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c4);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault3 == null) {
                        int iNormalizeMetaState = 3580 - KeyEvent.normalizeMetaState(0);
                        int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                        char c5 = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        String str$$r2 = $$r(b5, b6, (byte) (b6 + 5));
                        Class[] clsArr2 = new Class[2];
                        clsArr2[0] = Integer.TYPE;
                        clsArr2[b2] = Integer.TYPE;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, i11, c5, 1180380354, false, str$$r2, clsArr2);
                    }
                    cArr4[i10] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 1859, 34 - ((Process.getThreadPriority(0) + 20) >> 6), (char) Color.red(0), 80302927, false, $$r(b7, b7, (byte) $$l.length), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                b2 = 1;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i13 = $10 + 119;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[i4 / iTrustedWebActivityService_Parcel.copydefault];
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
            int i14 = $10 + 75;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        f(new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0}, new int[]{0, 18, 59, 0}, false, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object obj = null;
        Object[] objArr3 = new Object[1];
        g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).length() + 3, new char[]{52485, 8023, 11796, 596, GMTDateParser.HOURS, 32090}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f(new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0}, new int[]{18, 26, 0, 10}, true, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{44, 18, 0, 0}, false, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = getRequestBeneficiariesState;
                int i3 = i2 + 93;
                copy = i3 % 128;
                int i4 = i3 % 2;
                if (!(!(baseContext instanceof ContextWrapper))) {
                    int i5 = i2 + 111;
                    copy = i5 % 128;
                    if (i5 % 2 == 0) {
                        ((ContextWrapper) baseContext).getBaseContext();
                        obj.hashCode();
                        throw null;
                    }
                    if (((ContextWrapper) baseContext).getBaseContext() == null) {
                        baseContext = null;
                    }
                }
                baseContext = baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        try {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, (char) (ViewConfiguration.getLongPressTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                        } catch (Throwable th) {
                            th = th;
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 19, new char[]{27486, 1789, 47198, 8845, 50801, 23378, 13558, 32423, 32493, 23195, 4657, 62694, 36318, 2354, 28448, 12844, 47391, 37370, 13664, 29285, 59714, 52124, 19968, 46131, 56141, 47081, 56302, 52650, 29940, 22225, 35113, 50427, 8126, 65070, 28157, 7467, 7471, 47370, 39155, 16342, 26739, 10198, 29435, 63600, 8895, 46573, Typography.section, 55034}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1}, new int[]{62, 64, 0, 61}, false, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    g(64 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{61453, 36895, 62651, 52275, 57488, 36510, 43014, 27480, 57018, 45345, 20353, 58985, 59434, 57115, 11934, 48611, 25263, 12803, 13664, 29285, 10342, 58542, 45099, 41054, 3806, 57304, 49256, 25846, 19108, 13343, 21169, 43584, 8239, 27366, 17368, 16631, 2668, 65527, 19069, 7942, 48141, 65416, 20322, 38349, 57578, 48632, 13450, 29517, 11743, 21898, 9899, 36289, Typography.dagger, 16921, 48549, 24251, 54340, 42146, 9535, 54310, 26739, 10198, 51141, 2060}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    g(View.MeasureSpec.getSize(0) + 72, new char[]{65512, 65311, 6178, 54700, 3708, 17243, 4111, 36464, 60613, 58603, 17759, 34394, 21169, 43584, 13918, 53274, 57488, 36510, 11186, 21017, 8895, 46573, 32511, 2133, 29268, 4500, 22704, 58948, 8126, 65070, 2308, 12618, 56611, 9378, 55275, 36946, 24844, 44946, 64182, 56795, 58010, 64002, 26944, 909, 64182, 56795, 20543, 52671, 37818, 58398, 35346, 33607, 8351, 9279, 26112, 50839, 58904, 43975, 32746, 63213, 14435, 6020, 24679, 18101, 36611, 1843, 11562, 17139, 61785, 15498, 61244, 8492}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(new byte[]{1, 1, 0, 1, 1, 1}, new int[]{126, 6, 24, 6}, true, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(new byte[]{0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1}, new int[]{132, 36, 144, 0}, true, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.blue(0), ((Process.getThreadPriority(0) + 20) >> 6) + 56, (char) (MotionEvent.axisFromString("") + 1), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2405;
            int i6 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26;
            char c2 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
            byte[] bArr = $$d;
            byte b2 = bArr[22];
            byte b3 = bArr[38];
            Object[] objArr13 = new Object[1];
            h(b2, b3, (byte) (b3 << 2), objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(scrollBarSize, i6, c2, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i7 = copy + 87;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2405;
                int i9 = 26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                Object[] objArr14 = new Object[1];
                h(r0[22], (byte) (-$$d[95]), (byte) 93, objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, i9, packedPositionGroup, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f(new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, new int[]{168, 16, 85, 0}, false, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953647_res_0x7f1307ef).substring(0, 4).length() + 12, new char[]{51280, 62790, 61785, 15498, 45783, 6303, 1233, 17075, 58926, 5389, 61273, 27860, 42049, 13212, 34940, 55499}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -1842828601};
                byte b4 = $$j[10];
                Object[] objArr18 = new Object[1];
                i(b4, r0[13], b4, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                i(r0[20], r0[13], (byte) 28, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 2405;
                    int iMyPid = 26 - (Process.myPid() >> 22);
                    char cResolveSize = (char) View.resolveSize(0, 0);
                    Object[] objArr20 = new Object[1];
                    h(r1[22], (byte) (-$$d[95]), (byte) 93, objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iMyPid, cResolveSize, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    g(View.MeasureSpec.getMode(0) + 22, new char[]{4509, 62469, 19681, 40755, 54869, 52470, 53403, 10380, 40716, 58992, 44819, 17928, 23175, 53330, 46814, 54727, 59531, 27050, 49733, 27652, 37075, 24957}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f(new byte[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, new int[]{184, 15, 0, 0}, true, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int iResolveSize = 2405 - View.resolveSize(0, 0);
                        int offsetAfter = 26 - TextUtils.getOffsetAfter("", 0);
                        char packedPositionGroup2 = (char) ExpandableListView.getPackedPositionGroup(0L);
                        byte[] bArr2 = $$d;
                        byte b5 = (byte) (bArr2[40] - 1);
                        byte b6 = bArr2[33];
                        Object[] objArr23 = new Object[1];
                        h(b5, b6, (byte) (b6 | 84), objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iResolveSize, offsetAfter, packedPositionGroup2, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int mirror = 2453 - AndroidCharacter.getMirror('0');
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        byte[] bArr3 = $$d;
                        byte b7 = bArr3[22];
                        byte b8 = bArr3[38];
                        Object[] objArr24 = new Object[1];
                        h(b7, b8, (byte) (b8 << 2), objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(mirror, packedPositionType, deadChar, -2047739879, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        }
        int i10 = ((int[]) objArr[0])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Drawable.resolveOpacity(0, 0), KeyEvent.getDeadChar(0, 0) + 42, (char) ((-1) - Process.getGidForName("")), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i12 = copy + 109;
            getRequestBeneficiariesState = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr25 = {2125100029, Long.valueOf(j3), arrayList, null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6562, ExpandableListView.getPackedPositionGroup(0L) + 56, (char) Color.argb(0, 0, 0, 0));
                byte[] bArr4 = $$j;
                byte b9 = bArr4[20];
                byte b10 = bArr4[13];
                Object[] objArr26 = new Object[1];
                i(b9, b10, (byte) (b10 | Ascii.RS), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 == null) {
                    throw th4;
                }
                throw cause3;
            }
        }
        this.fromReceiveCodeActivity = getIntent().getStringExtra("fromReceiveCodeActivity");
        this.bankCardNo = getIntent().getStringExtra(KeysConstants.KEY_BANK_CARD_NO);
        super.onCreate(bundle);
        initViews();
        initListener();
        initData();
        initObserver();
    }

    @Override
    public void initToolbar(String str) {
        String string;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        copy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            TextUtils.isEmpty(this.fromReceiveCodeActivity);
            throw null;
        }
        if (TextUtils.isEmpty(this.fromReceiveCodeActivity)) {
            int i3 = copy + 83;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 != 0) {
                getString(com.huawei.digitalpayment.consumer.history.R.string.history_list_title1);
                obj.hashCode();
                throw null;
            }
            string = getString(com.huawei.digitalpayment.consumer.history.R.string.history_list_title1);
        } else {
            String str2 = this.fromReceiveCodeActivity;
            int i4 = copy + 115;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            string = str2;
        }
        super.initToolbar(string);
    }

    protected void initViews() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (!TextUtils.isEmpty(this.fromReceiveCodeActivity)) {
            int i4 = copy + 7;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            ((TransactionHistoryActivityBinding) this.binding).tagType.setVisibility(8);
        }
        initTypeRecycler();
        ((TransactionHistoryActivityBinding) this.binding).viewSearch.etSearch.setEnabled(false);
    }

    private void lambda$initListener$0(RefreshLayout refreshLayout) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.showLoading = true;
        this.mStartNum = 0;
        this.mAdapter.getLoadMoreModule().setEnableLoadMore(true);
        this.currentYearMonth = getCurrentYearAndMonth();
        this.mRecordList.clear();
        this.groupMap.clear();
        int[] iArr = this.currentYearMonth;
        queryTransactionHistoryList(false, false, iArr, iArr);
        int i4 = getRequestBeneficiariesState + 23;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private void lambda$initListener$1(View view) {
        int i = 2 % 2;
        int i2 = copy + 5;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((TransactionHistoryActivityBinding) this.binding).tagDate.isSelected();
            obj.hashCode();
            throw null;
        }
        if (((TransactionHistoryActivityBinding) this.binding).tagDate.isSelected()) {
            int i3 = getRequestBeneficiariesState + 31;
            int i4 = i3 % 128;
            copy = i4;
            int i5 = i3 % 2;
            RecordFilter recordFilter = this.currentFilterEvent;
            if (recordFilter != null) {
                int i6 = i4 + 9;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
                recordFilter.setStartDay(null);
                this.currentFilterEvent.setEndDay(null);
                onReceiveFilterEvent();
                return;
            }
        }
        showDateDialog();
        int i8 = copy + 73;
        getRequestBeneficiariesState = i8 % 128;
        int i9 = i8 % 2;
    }

    private void initListener() {
        int i = 2 % 2;
        ((TransactionHistoryActivityBinding) this.binding).tagAll.setOnClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 37;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Callback.onClick_enter(view);
                try {
                    if (TransactionHistoryActivity.m12224$$Nest$fgetcurrentFilterEvent(TransactionHistoryActivity.this) != null) {
                        TransactionHistoryActivity.m12224$$Nest$fgetcurrentFilterEvent(TransactionHistoryActivity.this).setEndDay(null);
                        TransactionHistoryActivity.m12224$$Nest$fgetcurrentFilterEvent(TransactionHistoryActivity.this).setStartDay(null);
                        TransactionHistoryActivity.m12224$$Nest$fgetcurrentFilterEvent(TransactionHistoryActivity.this).setFilterChannels(null);
                        TransactionHistoryActivity.m12224$$Nest$fgetcurrentFilterEvent(TransactionHistoryActivity.this).setFilterTypes(null);
                        TransactionHistoryActivity.this.onReceiveFilterEvent();
                        return;
                    }
                    int i5 = copydefault + 13;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    Callback.onClick_exit();
                    int i7 = ShareDataUIState + 117;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        ((TransactionHistoryActivityBinding) this.binding).srlRefresh.setOnRefreshListener(new OnRefreshListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final void onRefresh(RefreshLayout refreshLayout) {
                int i2 = 2 % 2;
                int i3 = component1 + 99;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                TransactionHistoryActivity.$r8$lambda$Cp5oaQN8bmmvKMUiigsVrBGleqM(this.f$0, refreshLayout);
                int i5 = component1 + 119;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        ((TransactionHistoryActivityBinding) this.binding).tagDate.setOnClickListener(new View.OnClickListener() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 51;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    TransactionHistoryActivity.m12222$r8$lambda$fx6O50TGRngU1qJnCS0NtxKAyU(this.f$0, view);
                    int i4 = 62 / 0;
                } else {
                    TransactionHistoryActivity.m12222$r8$lambda$fx6O50TGRngU1qJnCS0NtxKAyU(this.f$0, view);
                }
                int i5 = component3 + 79;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((TransactionHistoryActivityBinding) this.binding).tagType.setOnClickListener(new View.OnClickListener() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 109;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                TransactionHistoryActivity.$r8$lambda$PL7hMKqU3S9IvNh_JyrOsr2TGY0(this.f$0, view);
                if (i4 != 0) {
                    throw null;
                }
            }
        });
        int i2 = copy + 103;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void lambda$initListener$2(View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 93;
        copy = i2 % 128;
        int i3 = i2 % 2;
        showTypeDialog();
        int i4 = getRequestBeneficiariesState + 7;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private void queryTransactionHistoryList(boolean z, boolean z2, int[] iArr, int[] iArr2) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.isLoading = true;
        ((TransactionHistoryViewModel) this.viewModel).queryTransactionHistoryList(getRequest(z2, iArr, iArr2), z);
        int i4 = copy + 113;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private void showDateDialog() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 21;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (this.currentFilterEvent == null) {
            return;
        }
        RangeDatePickerFragment rangeDatePickerFragment = new RangeDatePickerFragment();
        rangeDatePickerFragment.setSelectedSegment(this.currentFilterEvent.getStartDay(), this.currentFilterEvent.getEndDay());
        rangeDatePickerFragment.setSelectListener(new RangeDatePickerFragment.OnSelectListener() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onSelectDateRange(FullDay fullDay, FullDay fullDay2) {
                int i4 = 2 % 2;
                int i5 = component2 + 99;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                TransactionHistoryActivity.m12224$$Nest$fgetcurrentFilterEvent(TransactionHistoryActivity.this).setStartDay(fullDay);
                TransactionHistoryActivity.m12224$$Nest$fgetcurrentFilterEvent(TransactionHistoryActivity.this).setEndDay(fullDay2);
                TransactionHistoryActivity.this.onReceiveFilterEvent();
                int i7 = component2 + 85;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        rangeDatePickerFragment.show(getSupportFragmentManager(), "");
        int i4 = copy + 119;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private void lambda$showTypeDialog$3(TransferTypeFilterDialog transferTypeFilterDialog, View view) {
        int i = 2 % 2;
        int i2 = copy + 17;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        transferTypeFilterDialog.dismiss();
        this.currentFilterEvent.setFilterTypes(transferTypeFilterDialog.getSelectedItem());
        onReceiveFilterEvent();
        int i4 = getRequestBeneficiariesState + 85;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 6 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r1 = new com.huawei.digitalpayment.history.ui.view.TransferTypeFilterDialog(getString(com.huawei.digitalpayment.consumer.history.R.string.history_list_title6), r5.currentFilterEvent.getFilterTypes(), r5.mTypeList);
        r1.setOnClickListener(new com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity$$ExternalSyntheticLambda1(r5, r1));
        r1.show(getSupportFragmentManager(), "");
        r1 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.getRequestBeneficiariesState + 31;
        com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.copy = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if ((r1 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        r0 = 49 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r5.currentFilterEvent == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r5.currentFilterEvent == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r1 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.getRequestBeneficiariesState + 7;
        com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.copy = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void showTypeDialog() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.getRequestBeneficiariesState
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.copy = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L1d
            Binding extends androidx.databinding.ViewDataBinding r1 = r5.binding
            com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryActivityBinding r1 = (com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryActivityBinding) r1
            com.huawei.common.widget.round.RoundLinearLayout r1 = r1.tagType
            r1.setSelected(r2)
            com.huawei.digitalpayment.history.ui.view.RecordFilter r1 = r5.currentFilterEvent
            if (r1 != 0) goto L38
            goto L2a
        L1d:
            Binding extends androidx.databinding.ViewDataBinding r1 = r5.binding
            com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryActivityBinding r1 = (com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryActivityBinding) r1
            com.huawei.common.widget.round.RoundLinearLayout r1 = r1.tagType
            r1.setSelected(r2)
            com.huawei.digitalpayment.history.ui.view.RecordFilter r1 = r5.currentFilterEvent
            if (r1 != 0) goto L38
        L2a:
            int r1 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.getRequestBeneficiariesState
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.copy = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L36
            return
        L36:
            r0 = 0
            throw r0
        L38:
            com.huawei.digitalpayment.history.ui.view.TransferTypeFilterDialog r1 = new com.huawei.digitalpayment.history.ui.view.TransferTypeFilterDialog
            int r2 = com.huawei.digitalpayment.consumer.history.R.string.history_list_title6
            java.lang.String r2 = r5.getString(r2)
            com.huawei.digitalpayment.history.ui.view.RecordFilter r3 = r5.currentFilterEvent
            java.util.List r3 = r3.getFilterTypes()
            java.util.ArrayList<com.huawei.digitalpayment.history.model.entity.TradeTypeConfigBean> r4 = r5.mTypeList
            r1.<init>(r2, r3, r4)
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity$$ExternalSyntheticLambda1 r2 = new com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity$$ExternalSyntheticLambda1
            r2.<init>()
            r1.setOnClickListener(r2)
            androidx.fragment.app.FragmentManager r2 = r5.getSupportFragmentManager()
            java.lang.String r3 = ""
            r1.show(r2, r3)
            int r1 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.getRequestBeneficiariesState
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.copy = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L6b
            r0 = 49
            int r0 = r0 / 0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.showTypeDialog():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void lambda$initData$4() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.getRequestBeneficiariesState
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.copy = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L21
            Binding extends androidx.databinding.ViewDataBinding r1 = r4.binding
            com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryActivityBinding r1 = (com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryActivityBinding) r1
            com.huawei.common.widget.round.RoundLinearLayout r1 = r1.tagDate
            boolean r1 = r1.isSelected()
            r3 = 48
            int r3 = r3 / 0
            r1 = r1 ^ r2
            if (r1 == 0) goto L2d
            goto L45
        L21:
            Binding extends androidx.databinding.ViewDataBinding r1 = r4.binding
            com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryActivityBinding r1 = (com.huawei.digitalpayment.consumer.history.databinding.TransactionHistoryActivityBinding) r1
            com.huawei.common.widget.round.RoundLinearLayout r1 = r1.tagDate
            boolean r1 = r1.isSelected()
            if (r1 == 0) goto L45
        L2d:
            boolean r1 = r4.hasMoreData
            if (r1 == 0) goto L32
            goto L45
        L32:
            com.huawei.digitalpayment.history.ui.adapter.HistoryGroupAdapter r1 = r4.mAdapter
            com.chad.library.adapter.base.module.BaseLoadMoreModule r1 = r1.getLoadMoreModule()
            r1.loadMoreEnd()
            int r1 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.getRequestBeneficiariesState
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.copy = r2
            int r1 = r1 % r0
            return
        L45:
            boolean r1 = r4.isLoading
            if (r1 == 0) goto L53
            int r1 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.getRequestBeneficiariesState
            int r1 = r1 + 107
            int r2 = r1 % 128
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.copy = r2
            int r1 = r1 % r0
            return
        L53:
            int[] r0 = r4.currentYearMonth
            r4.queryTransactionHistoryList(r2, r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.lambda$initData$4():void");
    }

    protected void initData() {
        int i = 2 % 2;
        this.currentYearMonth = getCurrentYearAndMonth();
        this.mRecordList = new ArrayList();
        this.currentFilterEvent = new RecordFilter();
        HistoryGroupAdapter historyGroupAdapter = new HistoryGroupAdapter(new ArrayList());
        this.mAdapter = historyGroupAdapter;
        historyGroupAdapter.getLoadMoreModule().setOnLoadMoreListener(new OnLoadMoreListener() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final void onLoadMore() {
                int i2 = 2 % 2;
                int i3 = copydefault + 71;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                TransactionHistoryActivity.$r8$lambda$uieBPelsE1R82JJSbIecq3nLHoA(this.f$0);
                int i5 = copydefault + 77;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        ((TransactionHistoryActivityBinding) this.binding).rvRecord.setAdapter(this.mAdapter);
        CustomerLoadMoreView customerLoadMoreView = new CustomerLoadMoreView();
        customerLoadMoreView.setLoadingDrawable(AppCompatResources.getDrawable(this, com.huawei.digitalpayment.consumer.history.R.mipmap.base_ic_refresh));
        this.mAdapter.getLoadMoreModule().setLoadMoreView(customerLoadMoreView);
        int[] iArr = this.currentYearMonth;
        queryTransactionHistoryList(false, false, iArr, iArr);
        ArrayList arrayList = new ArrayList();
        arrayList.add("tradeTypeConfig");
        TransChannelAndTypesRequest transChannelAndTypesRequest = new TransChannelAndTypesRequest();
        transChannelAndTypesRequest.setConfigTypes(arrayList);
        ((TransactionHistoryViewModel) this.viewModel).queryTransChannelAndTypes(transChannelAndTypesRequest);
        int i2 = getRequestBeneficiariesState + 19;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private TransactionHistoryListRequest getRequest(boolean z, int[] iArr, int[] iArr2) {
        int i = 2 % 2;
        TransactionHistoryListRequest transactionHistoryListRequest = new TransactionHistoryListRequest();
        if (!TextUtils.isEmpty(this.fromReceiveCodeActivity)) {
            transactionHistoryListRequest.setDirection("C");
        }
        transactionHistoryListRequest.setStartNum(this.mStartNum);
        transactionHistoryListRequest.setCount(20);
        RecordFilter recordFilter = this.currentFilterEvent;
        if (recordFilter != null) {
            List<TradeTypeConfigBean> filterTypes = recordFilter.getFilterTypes();
            if (!CollectionUtils.isEmpty(filterTypes)) {
                ArrayList arrayList = new ArrayList();
                Iterator<TradeTypeConfigBean> it = filterTypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getServiceKey());
                    int i2 = copy + 15;
                    getRequestBeneficiariesState = i2 % 128;
                    int i3 = i2 % 2;
                }
                transactionHistoryListRequest.setFilterTypes(arrayList);
            }
            setTimeParams(transactionHistoryListRequest, z, iArr, iArr2);
            int i4 = getRequestBeneficiariesState + 73;
            copy = i4 % 128;
            int i5 = i4 % 2;
        }
        transactionHistoryListRequest.setIsHomePage(String.valueOf(false));
        if (!TextUtils.isEmpty(transactionHistoryListRequest.getDirection())) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("CashIn_Out");
            arrayList2.add("Transfer");
            transactionHistoryListRequest.setFilterTypes(arrayList2);
        }
        if (!TextUtils.isEmpty(this.bankCardNo)) {
            HashMap map = new HashMap();
            map.put(KeysConstants.KEY_BANK_CARD_NO, this.bankCardNo);
            transactionHistoryListRequest.setExtension(map);
            int i6 = getRequestBeneficiariesState + 1;
            copy = i6 % 128;
            int i7 = i6 % 2;
        }
        return transactionHistoryListRequest;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[PHI: r12
  0x006f: PHI (r12v15 java.util.Calendar) = (r12v14 java.util.Calendar), (r12v20 java.util.Calendar) binds: [B:13:0x006d, B:10:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setTimeParams(com.huawei.digitalpayment.history.model.request.TransactionHistoryListRequest r10, boolean r11, int[] r12, int[] r13) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.setTimeParams(com.huawei.digitalpayment.history.model.request.TransactionHistoryListRequest, boolean, int[], int[]):void");
    }

    protected void initObserver() {
        int i = 2 % 2;
        ((TransactionHistoryViewModel) this.viewModel).getChannelTypeResponseMutableLiveData().observe(this, new Observer<ChannelTypeResponse>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public void onChanged(ChannelTypeResponse channelTypeResponse) {
                int i2 = 2 % 2;
                int i3 = component2 + 13;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                ShareDataUIState(channelTypeResponse);
                if (i4 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = component2 + 125;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            public void ShareDataUIState(ChannelTypeResponse channelTypeResponse) {
                int i2 = 2 % 2;
                int i3 = component2 + 21;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                TransactionHistoryActivity.this.setTransChannelAndTypes(channelTypeResponse);
                int i5 = component2 + 93;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        ((TransactionHistoryViewModel) this.viewModel).getListLiveData().observe(this, new Observer<Resource<TransactionRecordResponse>>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void onChanged(Resource<TransactionRecordResponse> resource) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 121;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                component3(resource);
                int i5 = ShareDataUIState + 3;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 14 / 0;
                }
            }

            public void component3(Resource<TransactionRecordResponse> resource) {
                TransactionHistoryActivity transactionHistoryActivity;
                TransactionRecordResponse data;
                int i2 = 2 % 2;
                int i3 = component1 + 95;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    resource.loading();
                    throw null;
                }
                if (resource.loading()) {
                    int i4 = ShareDataUIState + 95;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    if (TransactionHistoryActivity.m12225$$Nest$fgetshowLoading(TransactionHistoryActivity.this)) {
                        DialogUtils.showLoading(TransactionHistoryActivity.this);
                        int i6 = ShareDataUIState + 89;
                        component1 = i6 % 128;
                        int i7 = i6 % 2;
                        return;
                    }
                }
                if (resource.success()) {
                    int i8 = ShareDataUIState + 55;
                    component1 = i8 % 128;
                    if (i8 % 2 == 0) {
                        ((TransactionHistoryActivityBinding) TransactionHistoryActivity.access$000(TransactionHistoryActivity.this)).srlRefresh.finishRefresh();
                        transactionHistoryActivity = TransactionHistoryActivity.this;
                        data = resource.getData();
                    } else {
                        ((TransactionHistoryActivityBinding) TransactionHistoryActivity.access$000(TransactionHistoryActivity.this)).srlRefresh.finishRefresh();
                        transactionHistoryActivity = TransactionHistoryActivity.this;
                        data = resource.getData();
                    }
                    TransactionHistoryActivity.m12227$$Nest$msetData(transactionHistoryActivity, TransactionHistoryActivity.m12228$$Nest$mtransData(transactionHistoryActivity, data.getTransactionHistoryList()), false);
                }
                if (resource.error()) {
                    TransactionHistoryActivity.m12226$$Nest$fputisLoading(TransactionHistoryActivity.this, false);
                    DialogUtils.hideLoading(TransactionHistoryActivity.this);
                    ((TransactionHistoryActivityBinding) TransactionHistoryActivity.access$100(TransactionHistoryActivity.this)).srlRefresh.finishRefresh();
                    ToastUtils.showShort(resource.getException().getResponseDesc());
                }
            }
        });
        ((TransactionHistoryViewModel) this.viewModel).getListMoreLiveData().observe(this, new Observer<Resource<TransactionRecordResponse>>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public void onChanged(Resource<TransactionRecordResponse> resource) {
                int i2 = 2 % 2;
                int i3 = component3 + 113;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                component2(resource);
                if (i4 != 0) {
                    throw null;
                }
                int i5 = component3 + 13;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component2(Resource<TransactionRecordResponse> resource) {
                int i2 = 2 % 2;
                int i3 = component2 + 33;
                component3 = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    resource.loading();
                    obj.hashCode();
                    throw null;
                }
                if (resource.loading()) {
                    int i4 = component3 + 69;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        TransactionHistoryActivity.m12225$$Nest$fgetshowLoading(TransactionHistoryActivity.this);
                        obj.hashCode();
                        throw null;
                    }
                    if (TransactionHistoryActivity.m12225$$Nest$fgetshowLoading(TransactionHistoryActivity.this)) {
                        DialogUtils.showLoading(TransactionHistoryActivity.this);
                        return;
                    }
                }
                DialogUtils.hideLoading(TransactionHistoryActivity.this);
                if (resource.success()) {
                    TransactionHistoryActivity transactionHistoryActivity = TransactionHistoryActivity.this;
                    TransactionHistoryActivity.m12227$$Nest$msetData(transactionHistoryActivity, TransactionHistoryActivity.m12228$$Nest$mtransData(transactionHistoryActivity, resource.getData().getTransactionHistoryList()), true);
                }
                if (resource.error()) {
                    int i5 = component3 + 25;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        TransactionHistoryActivity.m12226$$Nest$fputisLoading(TransactionHistoryActivity.this, true);
                    } else {
                        TransactionHistoryActivity.m12226$$Nest$fputisLoading(TransactionHistoryActivity.this, false);
                    }
                    ToastUtils.showShort(resource.getException().getResponseDesc());
                    TransactionHistoryActivity.this.onLoadMoreError();
                    int i6 = component3 + 27;
                    component2 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        });
        int i2 = copy + 69;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void initTypeRecycler() {
        int i = 2 % 2;
        ((TransactionHistoryActivityBinding) this.binding).selectTypeRecycler.setLayoutManager(new LinearLayoutManager(this, 0, false));
        ((TransactionHistoryActivityBinding) this.binding).selectTypeRecycler.setNestedScrollingEnabled(false);
        this.selectTypeAdapter = new TransactionSelectTagAdapter();
        ((TransactionHistoryActivityBinding) this.binding).selectTypeRecycler.setAdapter(this.selectTypeAdapter);
        this.selectTypeAdapter.setOnItemClickListener(new OnItemClickListener() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                int i3 = 2 % 2;
                int i4 = component2 + 29;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    TransactionHistoryActivity.$r8$lambda$18Vakf_A8rzsMdiLpzPGLGukvvE(this.f$0, baseQuickAdapter, view, i2);
                    throw null;
                }
                TransactionHistoryActivity.$r8$lambda$18Vakf_A8rzsMdiLpzPGLGukvvE(this.f$0, baseQuickAdapter, view, i2);
                int i5 = component2 + 59;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }
        });
        int i2 = copy + 93;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$initTypeRecycler$5(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 37;
        copy = i3 % 128;
        int i4 = i3 % 2;
        RecordFilter recordFilter = this.currentFilterEvent;
        if (recordFilter == null) {
            return;
        }
        recordFilter.getFilterTypes().remove(i);
        onReceiveFilterEvent();
        int i5 = getRequestBeneficiariesState + 95;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private List<TransactionHistoryView> transData(List<TransactionHistoryListBean> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            int i2 = copy + 85;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        for (TransactionHistoryListBean transactionHistoryListBean : list) {
            TransactionHistoryView transactionHistoryView = new TransactionHistoryView();
            transactionHistoryView.setAmountDisplay(transactionHistoryListBean.getAmountDisplay());
            transactionHistoryView.setOrderId(transactionHistoryListBean.getId());
            transactionHistoryView.setCurrency(transactionHistoryListBean.getCurrency().getDisplayName());
            transactionHistoryView.setTransTime(transactionHistoryListBean.getTransTime());
            transactionHistoryView.setTransTypeDisplay(transactionHistoryListBean.getTransTypeDisplay());
            transactionHistoryView.setLogo(UrlUtils.getURL(AppConfigManager.getAppConfig().getH5BaseUrl(), transactionHistoryListBean.getLogo()));
            transactionHistoryView.setReceiverIsConsumer(transactionHistoryListBean.isReceiverIsConsumer());
            transactionHistoryView.setTransType(transactionHistoryListBean.getTransType());
            arrayList.add(transactionHistoryView);
        }
        int i4 = copy + 43;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setData(java.util.List<com.huawei.digitalpayment.history.ui.view.TransactionHistoryView> r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.setData(java.util.List, boolean):void");
    }

    private void filterGroup(List<TransactionHistoryView> list) {
        String month;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 105;
        copy = i2 % 128;
        int i3 = i2 % 2;
        if (((TransactionHistoryActivityBinding) this.binding).tagDate.isSelected()) {
            month = getFilterDataTitle();
        } else {
            month = getMonth(getNextStartTime(this.currentYearMonth));
        }
        List<TransactionHistoryView> list2 = this.groupMap.get(month);
        if (list2 != null && !CollectionUtils.isEmpty(list)) {
            list2.addAll(list);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<TransactionHistoryView>> entry : this.groupMap.entrySet()) {
            HistoryGroupInfo historyGroupInfo = new HistoryGroupInfo();
            historyGroupInfo.setMouth(entry.getKey());
            historyGroupInfo.setDatas(entry.getValue());
            arrayList.add(historyGroupInfo);
            int i4 = getRequestBeneficiariesState + 125;
            copy = i4 % 128;
            int i5 = i4 % 2;
        }
        this.mAdapter.setList(arrayList);
    }

    private String getFilterDataTitle() {
        int i = 2 % 2;
        FullDay startDay = this.currentFilterEvent.getStartDay();
        FullDay endDay = this.currentFilterEvent.getEndDay();
        if (startDay == null || endDay == null) {
            int i2 = copy + 57;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        int i4 = copy + 27;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return String.format(getString(com.huawei.digitalpayment.consumer.history.R.string.history_list_data_from), startDay.dateFormat(getString(com.huawei.digitalpayment.consumer.history.R.string.history_list_data_format)), endDay.dateFormat(getString(com.huawei.digitalpayment.consumer.history.R.string.history_list_data_format)));
    }

    public void onLoadMoreError() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            this.mAdapter.getLoadMoreModule().loadMoreFail();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.mAdapter.getLoadMoreModule().loadMoreFail();
        int i3 = getRequestBeneficiariesState + 123;
        copy = i3 % 128;
        int i4 = i3 % 2;
    }

    public void setTransChannelAndTypes(ChannelTypeResponse channelTypeResponse) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 7;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (channelTypeResponse != null) {
            this.mTypeList = channelTypeResponse.getJsonContent().getTradeTypeConfig();
            int i3 = getRequestBeneficiariesState + 111;
            copy = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceiveFilterEvent() {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.onReceiveFilterEvent():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setPullAction(java.util.List<com.huawei.digitalpayment.history.ui.view.TransactionHistoryView> r7, java.util.List<java.lang.String> r8, com.huawei.digitalpayment.history.ui.view.RecordFilter r9, android.content.res.Resources r10) {
        /*
            r6 = this;
            r10 = 2
            int r0 = r10 % r10
            r8.clear()
            if (r9 != 0) goto L9
            return
        L9:
            com.huawei.digitalpayment.datepicker.library.FullDay r0 = r9.getStartDay()
            com.huawei.digitalpayment.datepicker.library.FullDay r9 = r9.getEndDay()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L4b
            int r3 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.getRequestBeneficiariesState
            int r4 = r3 + 117
            int r5 = r4 % 128
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.copy = r5
            int r4 = r4 % r10
            if (r9 == 0) goto L4b
            int r3 = r3 + 19
            int r4 = r3 % 128
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.copy = r4
            int r3 = r3 % r10
            int r3 = com.huawei.digitalpayment.consumer.history.R.string.history_list_data_format
            java.lang.String r3 = r6.getString(r3)
            java.lang.String r0 = r0.dateFormat(r3)
            int r3 = com.huawei.digitalpayment.consumer.history.R.string.history_list_data_format
            java.lang.String r3 = r6.getString(r3)
            java.lang.String r9 = r9.dateFormat(r3)
            int r3 = com.huawei.digitalpayment.consumer.history.R.string.history_list_data_from
            java.lang.String r3 = r6.getString(r3)
            java.lang.Object[] r9 = new java.lang.Object[]{r0, r9}
            java.lang.String r9 = java.lang.String.format(r3, r9)
            r0 = r2
            goto L4e
        L4b:
            java.lang.String r9 = ""
            r0 = r1
        L4e:
            int r3 = r7.size()
            if (r1 >= r3) goto L7b
            int r3 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.copy
            int r3 = r3 + 63
            int r4 = r3 % 128
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.getRequestBeneficiariesState = r4
            int r3 = r3 % r10
            if (r0 == r2) goto L75
            java.lang.Object r3 = r7.get(r1)
            com.huawei.digitalpayment.history.ui.view.TransactionHistoryView r3 = (com.huawei.digitalpayment.history.ui.view.TransactionHistoryView) r3
            java.lang.String r3 = r3.getTransTime()
            long r3 = java.lang.Long.parseLong(r3)
            java.lang.String r3 = r6.getMonth(r3)
            r8.add(r3)
            goto L78
        L75:
            r8.add(r9)
        L78:
            int r1 = r1 + 1
            goto L4e
        L7b:
            int r7 = com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.copy
            int r7 = r7 + 109
            int r8 = r7 % 128
            com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.getRequestBeneficiariesState = r8
            int r7 = r7 % r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.setPullAction(java.util.List, java.util.List, com.huawei.digitalpayment.history.ui.view.RecordFilter, android.content.res.Resources):void");
    }

    private String getMonth(long j) {
        SimpleDateFormat simpleDateFormat;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 81;
        copy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            String currentLang = LanguageUtils.getInstance().getCurrentLang();
            if (!TextUtils.isEmpty(currentLang)) {
                simpleDateFormat = new SimpleDateFormat("MMMM-yyyy", new Locale(currentLang.split("_")[0]));
            } else {
                simpleDateFormat = new SimpleDateFormat("MMMM-yyyy", Locale.US);
            }
            String str = simpleDateFormat.format(new Date(j));
            int i3 = copy + 101;
            getRequestBeneficiariesState = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }
        TextUtils.isEmpty(LanguageUtils.getInstance().getCurrentLang());
        obj.hashCode();
        throw null;
    }

    private long getNextStartTime(int[] iArr) {
        long firstDayOfMonth;
        int i = 2 % 2;
        int i2 = copy + 71;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = iArr[0];
            firstDayOfMonth = getFirstDayOfMonth(i3, i3);
        } else {
            firstDayOfMonth = getFirstDayOfMonth(iArr[0], iArr[1]);
        }
        return TimeUtils.getTimeTodayStart(firstDayOfMonth);
    }

    private long getNextEndTime(int[] iArr) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        copy = i2 % 128;
        int i3 = i2 % 2;
        long timeTodayEnd = TimeUtils.getTimeTodayEnd(getLastDayOfMonth(iArr[0], iArr[1]));
        int i4 = copy + 51;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return timeTodayEnd;
    }

    public static long getFirstDayOfMonth(int i, int i2) {
        Calendar calendar;
        int i3;
        int i4 = 2 % 2;
        int i5 = copy + 113;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            calendar = Calendar.getInstance();
            i3 = 0;
        } else {
            calendar = Calendar.getInstance();
            i3 = 1;
            i2--;
        }
        calendar.set(i, i2, i3);
        return calendar.getTimeInMillis();
    }

    public static long getLastDayOfMonth(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState + 115;
        copy = i4 % 128;
        int i5 = i4 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2 - 1, 1);
        calendar.add(2, 1);
        calendar.add(5, -1);
        long timeInMillis = calendar.getTimeInMillis();
        int i6 = copy + 43;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 77 / 0;
        }
        return timeInMillis;
    }

    public static int[] getPreviousMonth(int i, int i2) {
        int[] iArr;
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState + 71;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(i, i2, 0);
            calendar.add(5, -1);
            int i5 = calendar.get(0);
            int i6 = calendar.get(5);
            iArr = new int[]{0, i5};
            iArr[1] = i6;
        } else {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(i, i2 - 1, 1);
            calendar2.add(2, -1);
            iArr = new int[]{calendar2.get(1), calendar2.get(2) + 1};
        }
        int i7 = getRequestBeneficiariesState + 99;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return iArr;
    }

    public static int[] getCurrentYearAndMonth() {
        int[] iArr;
        int i = 2 % 2;
        int i2 = copy + 81;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Calendar calendar = Calendar.getInstance();
            iArr = new int[]{calendar.get(0), 0, 0};
            iArr[0] = calendar.get(5) + 1;
        } else {
            Calendar calendar2 = Calendar.getInstance();
            iArr = new int[]{calendar2.get(1), calendar2.get(2) + 1};
        }
        int i3 = getRequestBeneficiariesState + 121;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            return iArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 47;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = com.huawei.digitalpayment.consumer.history.R.layout.transaction_history_activity;
        int i5 = getRequestBeneficiariesState + 1;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        Method method;
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = copy + 3;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                f(new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0}, new int[]{18, 26, 0, 10}, true, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                f(new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{44, 18, 0, 0}, false, objArr2);
                method = cls.getMethod((String) objArr2[0], new Class[1]);
            } else {
                Object[] objArr3 = new Object[1];
                f(new byte[]{0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0}, new int[]{18, 26, 0, 10}, true, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                f(new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{44, 18, 0, 0}, false, objArr4);
                method = cls2.getMethod((String) objArr4[0], new Class[0]);
            }
            baseContext = (Context) method.invoke(null, null);
            int i3 = getRequestBeneficiariesState + 7;
            copy = i3 % 128;
            int i4 = i3 % 2;
        }
        if (baseContext != null) {
            baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - TextUtils.indexOf("", "", 0), 42 - Drawable.resolveOpacity(0, 0), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr5 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6563, 56 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) View.resolveSize(0, 0), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr5);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(66:0|2|(2:4|(2:6|(2:(2:12|(1:17)(2:15|(0)(1:18)))(1:19)|(9:21|947|22|(1:24)|25|26|27|(1:29)|30)(1:34))(0))(2:9|10))(0)|35|923|36|(2:909|38)|43|(2:45|46)|47|48|(1:878)|(5:50|51|(1:53)|54|55)(3:56|(3:921|58|(1:64)(1:63))(1:68)|(22:917|70|71|888|72|901|73|(3:75|838|76)|80|81|893|82|(2:895|84)|88|89|90|(2:891|92)|93|(2:95|96)(1:98)|99|(1:101)|102)(49:156|(3:849|173|(1:179)(1:178))(1:183)|184|945|185|(1:187)|188|933|189|(1:191)|192|216|847|217|(2:939|219)|224|225|840|(5:227|228|(1:230)|231|232)(25:233|234|841|235|236|950|237|(2:886|239)|243|244|943|245|(2:903|247)|251|252|253|(2:864|255)|259|260|937|261|(3:263|876|264)(1:266)|267|(2:269|270)|271)|272|(5:276|(2:278|(2:285|962)(11:286|(3:288|(4:291|292|293|289)|963)|294|927|295|(1:297)|298|299|915|300|961))(2:283|(0)(0))|301|273|274)|960|313|346|890|347|(1:349)|350|(3:352|(1:354)|355)(22:356|357|884|358|359|870|360|(2:952|362)|366|367|860|368|(2:852|370)|374|375|376|(3:378|850|379)|380|(2:382|383)(1:385)|386|(1:388)|389)|390|(4:393|(2:395|966)(11:396|(3:398|(3:401|402|399)|967)|405|845|406|(1:408)|409|410|836|411|965)|412|391)|964|424|452|929|453|(3:455|866|456)|460|461|(5:463|464|(1:466)|467|468)(17:470|471|926|472|473|913|474|(1:476)|477|478|479|(1:481)|482|(1:484)(1:485)|486|(1:488)|489)|469|490|(9:493|905|494|(1:496)|497|498|499|899|500)|534|(1:536)|537|(3:539|(1:541)|542)(14:543|544|(1:546)|547|548|(1:550)|551|879|552|553|(1:555)(1:556)|557|(1:559)|560)|561|(35:563|(1:565)|566|(1:568)|569|(3:571|(1:573)|574)(16:576|577|(1:579)|580|(1:582)|583|584|(1:586)|587|911|588|589|(1:591)|592|(1:594)|595)|575|596|(1:598)(9:599|(3:601|(2:604|602)|975)|605|606|(1:608)|609|(1:611)|612|613)|614|907|615|(2:925|617)|621|(2:623|624)|625|626|(4:628|629|(1:631)|632)(27:633|(2:635|(1:641)(1:640))|(22:643|644|881|645|646|897|647|(1:649)|650|651|882|652|(1:654)|655|656|657|(1:659)|660|(1:662)|663|(1:665)|666)(15:711|726|(1:728)|729|(3:731|(1:733)|734)(13:736|843|737|738|(1:740)|741|931|742|743|(1:745)|746|(1:748)|749)|735|750|(6:753|754|(1:756)|757|758|759)|760|(1:762)|763|(3:765|(1:767)|768)(14:770|771|(1:773)|774|775|(1:777)|778|919|779|780|(1:782)|783|(1:785)|786)|769|787|(1:977)(7:790|791|(1:793)|794|795|796|797))|714|715|954|716|719|720|(1:722)|723|724|725|726|(0)|729|(0)(0)|735|750|(0)|760|(0)|763|(0)(0)|769|787|(0)(0))|667|(4:670|(3:970|672|973)(12:969|673|(3:675|(3:678|679|676)|974)|680|872|681|(1:683)|684|685|862|686|972)|971|668)|968|726|(0)|729|(0)(0)|735|750|(0)|760|(0)|763|(0)(0)|769|787|(0)(0))(10:809|(3:811|(2:814|812)|976)|815|816|(1:818)|819|(1:821)|822|823|824)))|103|(4:106|(2:108|958)(11:109|(3:111|(3:114|115|112)|959)|118|868|119|(1:121)|122|123|858|124|957)|125|104)|956|139|(0)(0)|184|945|185|(0)|188|933|189|(0)|192|216|847|217|(0)|224|225|840|(0)(0)|272|(2:273|274)|960|313|346|890|347|(0)|350|(0)(0)|390|(1:391)|964|424|452|929|453|(0)|460|461|(0)(0)|469|490|(0)|534|(0)|537|(0)(0)|561|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0fa6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0fac, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x086c A[Catch: all -> 0x0291, TryCatch #59 {all -> 0x0291, blocks: (B:166:0x0866, B:168:0x086c, B:169:0x0897, B:340:0x103b, B:342:0x1041, B:343:0x106c, B:528:0x1a66, B:530:0x1a6c, B:531:0x1a99, B:754:0x2e1c, B:756:0x2e22, B:757:0x2e49, B:791:0x3166, B:793:0x316c, B:794:0x3193, B:771:0x2f9a, B:773:0x2fbd, B:774:0x3014, B:720:0x2ad1, B:722:0x2ad7, B:723:0x2b09, B:606:0x2401, B:608:0x2407, B:609:0x242f, B:611:0x2469, B:612:0x24b3, B:577:0x2097, B:579:0x20ac, B:580:0x20db, B:582:0x210f, B:583:0x218b, B:816:0x3270, B:818:0x3276, B:819:0x329b, B:821:0x32d5, B:822:0x3316, B:544:0x1c78, B:546:0x1c8d, B:547:0x1cbe, B:446:0x15bc, B:448:0x15c2, B:449:0x15ef, B:210:0x0a7c, B:212:0x0a82, B:213:0x0ab0, B:22:0x0127, B:24:0x012d, B:25:0x0159, B:27:0x01fe, B:29:0x0230, B:30:0x028b, B:173:0x091a, B:175:0x091e, B:196:0x0a04, B:198:0x0a0a, B:199:0x0a0b, B:201:0x0a0d, B:203:0x0a14, B:204:0x0a15, B:179:0x092a, B:189:0x0982, B:191:0x098f, B:192:0x09fa, B:185:0x0935, B:187:0x094a, B:188:0x097c), top: B:947:0x0127, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x094a A[Catch: all -> 0x0a0c, TryCatch #58 {all -> 0x0a0c, blocks: (B:185:0x0935, B:187:0x094a, B:188:0x097c), top: B:945:0x0935, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x098f A[Catch: all -> 0x0a02, TryCatch #52 {all -> 0x0a02, blocks: (B:189:0x0982, B:191:0x098f, B:192:0x09fa), top: B:933:0x0982, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0b9a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0bed A[Catch: all -> 0x0fac, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x0fac, blocks: (B:217:0x0b41, B:224:0x0b8d, B:233:0x0bed), top: B:847:0x0b41 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0e25  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0e6b A[Catch: all -> 0x0f88, PHI: r5 r8 r9
  0x0e6b: PHI (r5v589 java.lang.Object[]) = (r5v588 java.lang.Object[]), (r5v608 java.lang.Object[]) binds: [B:284:0x0e64, B:279:0x0e46] A[DONT_GENERATE, DONT_INLINE]
  0x0e6b: PHI (r8v534 int) = (r8v533 int), (r8v561 int) binds: [B:284:0x0e64, B:279:0x0e46] A[DONT_GENERATE, DONT_INLINE]
  0x0e6b: PHI (r9v347 int) = (r9v346 int), (r9v352 int) binds: [B:284:0x0e64, B:279:0x0e46] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #54 {all -> 0x0f88, blocks: (B:272:0x0e19, B:273:0x0e1d, B:286:0x0e6b, B:283:0x0e4f, B:261:0x0d52, B:267:0x0db7, B:271:0x0e11), top: B:937:0x0d52 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x1041 A[Catch: all -> 0x0291, TryCatch #59 {all -> 0x0291, blocks: (B:166:0x0866, B:168:0x086c, B:169:0x0897, B:340:0x103b, B:342:0x1041, B:343:0x106c, B:528:0x1a66, B:530:0x1a6c, B:531:0x1a99, B:754:0x2e1c, B:756:0x2e22, B:757:0x2e49, B:791:0x3166, B:793:0x316c, B:794:0x3193, B:771:0x2f9a, B:773:0x2fbd, B:774:0x3014, B:720:0x2ad1, B:722:0x2ad7, B:723:0x2b09, B:606:0x2401, B:608:0x2407, B:609:0x242f, B:611:0x2469, B:612:0x24b3, B:577:0x2097, B:579:0x20ac, B:580:0x20db, B:582:0x210f, B:583:0x218b, B:816:0x3270, B:818:0x3276, B:819:0x329b, B:821:0x32d5, B:822:0x3316, B:544:0x1c78, B:546:0x1c8d, B:547:0x1cbe, B:446:0x15bc, B:448:0x15c2, B:449:0x15ef, B:210:0x0a7c, B:212:0x0a82, B:213:0x0ab0, B:22:0x0127, B:24:0x012d, B:25:0x0159, B:27:0x01fe, B:29:0x0230, B:30:0x028b, B:173:0x091a, B:175:0x091e, B:196:0x0a04, B:198:0x0a0a, B:199:0x0a0b, B:201:0x0a0d, B:203:0x0a14, B:204:0x0a15, B:179:0x092a, B:189:0x0982, B:191:0x098f, B:192:0x09fa, B:185:0x0935, B:187:0x094a, B:188:0x097c), top: B:947:0x0127, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x10fa A[Catch: all -> 0x1555, TryCatch #29 {all -> 0x1555, blocks: (B:347:0x10f4, B:349:0x10fa, B:350:0x1142, B:352:0x114f, B:354:0x1158, B:355:0x119f, B:415:0x1523, B:417:0x1529, B:418:0x152a, B:420:0x152c, B:422:0x1533, B:423:0x1534, B:356:0x11ac, B:427:0x153d, B:429:0x1543, B:430:0x1544, B:433:0x1549, B:435:0x154f, B:436:0x1550, B:411:0x14a6, B:406:0x145f, B:408:0x1465, B:409:0x1494), top: B:890:0x10f4, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x114f A[Catch: all -> 0x1555, TryCatch #29 {all -> 0x1555, blocks: (B:347:0x10f4, B:349:0x10fa, B:350:0x1142, B:352:0x114f, B:354:0x1158, B:355:0x119f, B:415:0x1523, B:417:0x1529, B:418:0x152a, B:420:0x152c, B:422:0x1533, B:423:0x1534, B:356:0x11ac, B:427:0x153d, B:429:0x1543, B:430:0x1544, B:433:0x1549, B:435:0x154f, B:436:0x1550, B:411:0x14a6, B:406:0x145f, B:408:0x1465, B:409:0x1494), top: B:890:0x10f4, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x11ac A[Catch: all -> 0x1555, TRY_LEAVE, TryCatch #29 {all -> 0x1555, blocks: (B:347:0x10f4, B:349:0x10fa, B:350:0x1142, B:352:0x114f, B:354:0x1158, B:355:0x119f, B:415:0x1523, B:417:0x1529, B:418:0x152a, B:420:0x152c, B:422:0x1533, B:423:0x1534, B:356:0x11ac, B:427:0x153d, B:429:0x1543, B:430:0x1544, B:433:0x1549, B:435:0x154f, B:436:0x1550, B:411:0x14a6, B:406:0x145f, B:408:0x1465, B:409:0x1494), top: B:890:0x10f4, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x13fd A[Catch: all -> 0x1551, TryCatch #26 {all -> 0x1551, blocks: (B:390:0x13f3, B:391:0x13f7, B:393:0x13fd, B:396:0x1418, B:358:0x11ba, B:376:0x12c5, B:380:0x1313, B:386:0x138e, B:389:0x13eb), top: B:884:0x11ba }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x15c2 A[Catch: all -> 0x0291, TryCatch #59 {all -> 0x0291, blocks: (B:166:0x0866, B:168:0x086c, B:169:0x0897, B:340:0x103b, B:342:0x1041, B:343:0x106c, B:528:0x1a66, B:530:0x1a6c, B:531:0x1a99, B:754:0x2e1c, B:756:0x2e22, B:757:0x2e49, B:791:0x3166, B:793:0x316c, B:794:0x3193, B:771:0x2f9a, B:773:0x2fbd, B:774:0x3014, B:720:0x2ad1, B:722:0x2ad7, B:723:0x2b09, B:606:0x2401, B:608:0x2407, B:609:0x242f, B:611:0x2469, B:612:0x24b3, B:577:0x2097, B:579:0x20ac, B:580:0x20db, B:582:0x210f, B:583:0x218b, B:816:0x3270, B:818:0x3276, B:819:0x329b, B:821:0x32d5, B:822:0x3316, B:544:0x1c78, B:546:0x1c8d, B:547:0x1cbe, B:446:0x15bc, B:448:0x15c2, B:449:0x15ef, B:210:0x0a7c, B:212:0x0a82, B:213:0x0ab0, B:22:0x0127, B:24:0x012d, B:25:0x0159, B:27:0x01fe, B:29:0x0230, B:30:0x028b, B:173:0x091a, B:175:0x091e, B:196:0x0a04, B:198:0x0a0a, B:199:0x0a0b, B:201:0x0a0d, B:203:0x0a14, B:204:0x0a15, B:179:0x092a, B:189:0x0982, B:191:0x098f, B:192:0x09fa, B:185:0x0935, B:187:0x094a, B:188:0x097c), top: B:947:0x0127, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:455:0x1677  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x16d1  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x1730 A[Catch: all -> 0x19fc, TRY_ENTER, TRY_LEAVE, TryCatch #50 {all -> 0x19fc, blocks: (B:453:0x1671, B:460:0x16c4, B:470:0x1730), top: B:929:0x1671 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x18f9  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x1a6c A[Catch: all -> 0x0291, TryCatch #59 {all -> 0x0291, blocks: (B:166:0x0866, B:168:0x086c, B:169:0x0897, B:340:0x103b, B:342:0x1041, B:343:0x106c, B:528:0x1a66, B:530:0x1a6c, B:531:0x1a99, B:754:0x2e1c, B:756:0x2e22, B:757:0x2e49, B:791:0x3166, B:793:0x316c, B:794:0x3193, B:771:0x2f9a, B:773:0x2fbd, B:774:0x3014, B:720:0x2ad1, B:722:0x2ad7, B:723:0x2b09, B:606:0x2401, B:608:0x2407, B:609:0x242f, B:611:0x2469, B:612:0x24b3, B:577:0x2097, B:579:0x20ac, B:580:0x20db, B:582:0x210f, B:583:0x218b, B:816:0x3270, B:818:0x3276, B:819:0x329b, B:821:0x32d5, B:822:0x3316, B:544:0x1c78, B:546:0x1c8d, B:547:0x1cbe, B:446:0x15bc, B:448:0x15c2, B:449:0x15ef, B:210:0x0a7c, B:212:0x0a82, B:213:0x0ab0, B:22:0x0127, B:24:0x012d, B:25:0x0159, B:27:0x01fe, B:29:0x0230, B:30:0x028b, B:173:0x091a, B:175:0x091e, B:196:0x0a04, B:198:0x0a0a, B:199:0x0a0b, B:201:0x0a0d, B:203:0x0a14, B:204:0x0a15, B:179:0x092a, B:189:0x0982, B:191:0x098f, B:192:0x09fa, B:185:0x0935, B:187:0x094a, B:188:0x097c), top: B:947:0x0127, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:536:0x1b28  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x1b7b  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x1c58  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x1e01  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x2ad7 A[Catch: all -> 0x0291, TryCatch #59 {all -> 0x0291, blocks: (B:166:0x0866, B:168:0x086c, B:169:0x0897, B:340:0x103b, B:342:0x1041, B:343:0x106c, B:528:0x1a66, B:530:0x1a6c, B:531:0x1a99, B:754:0x2e1c, B:756:0x2e22, B:757:0x2e49, B:791:0x3166, B:793:0x316c, B:794:0x3193, B:771:0x2f9a, B:773:0x2fbd, B:774:0x3014, B:720:0x2ad1, B:722:0x2ad7, B:723:0x2b09, B:606:0x2401, B:608:0x2407, B:609:0x242f, B:611:0x2469, B:612:0x24b3, B:577:0x2097, B:579:0x20ac, B:580:0x20db, B:582:0x210f, B:583:0x218b, B:816:0x3270, B:818:0x3276, B:819:0x329b, B:821:0x32d5, B:822:0x3316, B:544:0x1c78, B:546:0x1c8d, B:547:0x1cbe, B:446:0x15bc, B:448:0x15c2, B:449:0x15ef, B:210:0x0a7c, B:212:0x0a82, B:213:0x0ab0, B:22:0x0127, B:24:0x012d, B:25:0x0159, B:27:0x01fe, B:29:0x0230, B:30:0x028b, B:173:0x091a, B:175:0x091e, B:196:0x0a04, B:198:0x0a0a, B:199:0x0a0b, B:201:0x0a0d, B:203:0x0a14, B:204:0x0a15, B:179:0x092a, B:189:0x0982, B:191:0x098f, B:192:0x09fa, B:185:0x0935, B:187:0x094a, B:188:0x097c), top: B:947:0x0127, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:728:0x2b92  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x2be0  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x2c37  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x2dfe  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x2eda  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x2f2b  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x2f7c  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x3147  */
    /* JADX WARN: Removed duplicated region for block: B:809:0x3238  */
    /* JADX WARN: Removed duplicated region for block: B:849:0x091a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:939:0x0b47 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:977:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v121 */
    /* JADX WARN: Type inference failed for: r10v125 */
    /* JADX WARN: Type inference failed for: r10v126 */
    /* JADX WARN: Type inference failed for: r10v128 */
    /* JADX WARN: Type inference failed for: r10v129 */
    /* JADX WARN: Type inference failed for: r10v130, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v132 */
    /* JADX WARN: Type inference failed for: r10v133 */
    /* JADX WARN: Type inference failed for: r10v145 */
    /* JADX WARN: Type inference failed for: r10v146 */
    /* JADX WARN: Type inference failed for: r10v147 */
    /* JADX WARN: Type inference failed for: r10v148 */
    /* JADX WARN: Type inference failed for: r10v149 */
    /* JADX WARN: Type inference failed for: r10v150 */
    /* JADX WARN: Type inference failed for: r10v151 */
    /* JADX WARN: Type inference failed for: r10v152 */
    /* JADX WARN: Type inference failed for: r10v153 */
    /* JADX WARN: Type inference failed for: r10v154 */
    /* JADX WARN: Type inference failed for: r10v155 */
    /* JADX WARN: Type inference failed for: r10v156 */
    /* JADX WARN: Type inference failed for: r10v157 */
    /* JADX WARN: Type inference failed for: r10v158 */
    /* JADX WARN: Type inference failed for: r10v159 */
    /* JADX WARN: Type inference failed for: r10v160 */
    /* JADX WARN: Type inference failed for: r10v161 */
    /* JADX WARN: Type inference failed for: r10v162 */
    /* JADX WARN: Type inference failed for: r10v163 */
    /* JADX WARN: Type inference failed for: r10v164 */
    /* JADX WARN: Type inference failed for: r10v165 */
    /* JADX WARN: Type inference failed for: r10v166 */
    /* JADX WARN: Type inference failed for: r10v167 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r10v69 */
    /* JADX WARN: Type inference failed for: r10v78, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v79 */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r10v81 */
    /* JADX WARN: Type inference failed for: r10v82 */
    /* JADX WARN: Type inference failed for: r10v84 */
    /* JADX WARN: Type inference failed for: r10v85 */
    /* JADX WARN: Type inference failed for: r10v87 */
    /* JADX WARN: Type inference failed for: r11v360, types: [int[]] */
    /* JADX WARN: Type inference failed for: r12v239, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v371 */
    /* JADX WARN: Type inference failed for: r1v377 */
    /* JADX WARN: Type inference failed for: r1v378 */
    /* JADX WARN: Type inference failed for: r1v391, types: [int] */
    /* JADX WARN: Type inference failed for: r1v392 */
    /* JADX WARN: Type inference failed for: r1v393 */
    /* JADX WARN: Type inference failed for: r1v394 */
    /* JADX WARN: Type inference failed for: r1v395 */
    /* JADX WARN: Type inference failed for: r1v396 */
    /* JADX WARN: Type inference failed for: r1v403 */
    /* JADX WARN: Type inference failed for: r1v414 */
    /* JADX WARN: Type inference failed for: r1v415 */
    /* JADX WARN: Type inference failed for: r1v416 */
    /* JADX WARN: Type inference failed for: r1v417 */
    /* JADX WARN: Type inference failed for: r1v418 */
    /* JADX WARN: Type inference failed for: r1v419 */
    /* JADX WARN: Type inference failed for: r1v420 */
    /* JADX WARN: Type inference failed for: r1v421 */
    /* JADX WARN: Type inference failed for: r1v422 */
    /* JADX WARN: Type inference failed for: r1v423 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v100 */
    /* JADX WARN: Type inference failed for: r28v101 */
    /* JADX WARN: Type inference failed for: r28v104 */
    /* JADX WARN: Type inference failed for: r28v105 */
    /* JADX WARN: Type inference failed for: r28v108 */
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v110 */
    /* JADX WARN: Type inference failed for: r28v111 */
    /* JADX WARN: Type inference failed for: r28v121 */
    /* JADX WARN: Type inference failed for: r28v122 */
    /* JADX WARN: Type inference failed for: r28v123 */
    /* JADX WARN: Type inference failed for: r28v124 */
    /* JADX WARN: Type inference failed for: r28v127 */
    /* JADX WARN: Type inference failed for: r28v128 */
    /* JADX WARN: Type inference failed for: r28v129 */
    /* JADX WARN: Type inference failed for: r28v139 */
    /* JADX WARN: Type inference failed for: r28v140 */
    /* JADX WARN: Type inference failed for: r28v141 */
    /* JADX WARN: Type inference failed for: r28v142 */
    /* JADX WARN: Type inference failed for: r28v143 */
    /* JADX WARN: Type inference failed for: r28v144 */
    /* JADX WARN: Type inference failed for: r28v145 */
    /* JADX WARN: Type inference failed for: r28v146 */
    /* JADX WARN: Type inference failed for: r28v147 */
    /* JADX WARN: Type inference failed for: r28v148 */
    /* JADX WARN: Type inference failed for: r28v149 */
    /* JADX WARN: Type inference failed for: r28v21 */
    /* JADX WARN: Type inference failed for: r28v22 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v47 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v66 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v76 */
    /* JADX WARN: Type inference failed for: r28v77 */
    /* JADX WARN: Type inference failed for: r28v78 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v81 */
    /* JADX WARN: Type inference failed for: r28v82 */
    /* JADX WARN: Type inference failed for: r28v83 */
    /* JADX WARN: Type inference failed for: r28v84 */
    /* JADX WARN: Type inference failed for: r28v85 */
    /* JADX WARN: Type inference failed for: r28v86 */
    /* JADX WARN: Type inference failed for: r28v87 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r28v94 */
    /* JADX WARN: Type inference failed for: r28v97 */
    /* JADX WARN: Type inference failed for: r28v98 */
    /* JADX WARN: Type inference failed for: r28v99 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v720, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v724 */
    /* JADX WARN: Type inference failed for: r3v756 */
    /* JADX WARN: Type inference failed for: r3v757 */
    /* JADX WARN: Type inference failed for: r3v770, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v780 */
    /* JADX WARN: Type inference failed for: r3v792 */
    /* JADX WARN: Type inference failed for: r3v793 */
    /* JADX WARN: Type inference failed for: r4v102 */
    /* JADX WARN: Type inference failed for: r4v103 */
    /* JADX WARN: Type inference failed for: r4v104 */
    /* JADX WARN: Type inference failed for: r4v109 */
    /* JADX WARN: Type inference failed for: r4v112, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v113 */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v123 */
    /* JADX WARN: Type inference failed for: r4v127, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v128 */
    /* JADX WARN: Type inference failed for: r4v129 */
    /* JADX WARN: Type inference failed for: r4v131 */
    /* JADX WARN: Type inference failed for: r4v138 */
    /* JADX WARN: Type inference failed for: r4v162, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v165 */
    /* JADX WARN: Type inference failed for: r4v166 */
    /* JADX WARN: Type inference failed for: r4v167 */
    /* JADX WARN: Type inference failed for: r4v168 */
    /* JADX WARN: Type inference failed for: r4v184 */
    /* JADX WARN: Type inference failed for: r4v186 */
    /* JADX WARN: Type inference failed for: r4v233, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v236 */
    /* JADX WARN: Type inference failed for: r4v237 */
    /* JADX WARN: Type inference failed for: r4v238 */
    /* JADX WARN: Type inference failed for: r4v239 */
    /* JADX WARN: Type inference failed for: r4v240 */
    /* JADX WARN: Type inference failed for: r4v257 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v372, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v383 */
    /* JADX WARN: Type inference failed for: r4v384 */
    /* JADX WARN: Type inference failed for: r4v385 */
    /* JADX WARN: Type inference failed for: r4v386 */
    /* JADX WARN: Type inference failed for: r4v387 */
    /* JADX WARN: Type inference failed for: r4v388 */
    /* JADX WARN: Type inference failed for: r4v389 */
    /* JADX WARN: Type inference failed for: r4v390 */
    /* JADX WARN: Type inference failed for: r4v391 */
    /* JADX WARN: Type inference failed for: r4v392 */
    /* JADX WARN: Type inference failed for: r4v393 */
    /* JADX WARN: Type inference failed for: r4v394 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v638, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v639 */
    /* JADX WARN: Type inference failed for: r5v640 */
    /* JADX WARN: Type inference failed for: r5v641 */
    /* JADX WARN: Type inference failed for: r5v642 */
    /* JADX WARN: Type inference failed for: r5v655 */
    /* JADX WARN: Type inference failed for: r5v656 */
    /* JADX WARN: Type inference failed for: r5v665 */
    /* JADX WARN: Type inference failed for: r5v666 */
    /* JADX WARN: Type inference failed for: r9v368 */
    /* JADX WARN: Type inference failed for: r9v369 */
    /* JADX WARN: Type inference failed for: r9v370 */
    /* JADX WARN: Type inference failed for: r9v389 */
    /* JADX WARN: Type inference failed for: r9v390 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.history.ui.activity.TransactionHistoryActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$18Vakf_A8rzsMdiLpzPGLGukvvE(TransactionHistoryActivity transactionHistoryActivity, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        int i2 = 2 % 2;
        int i3 = copy + 29;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        transactionHistoryActivity.lambda$initTypeRecycler$5(baseQuickAdapter, view, i);
        int i5 = copy + 17;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void $r8$lambda$Cp5oaQN8bmmvKMUiigsVrBGleqM(TransactionHistoryActivity transactionHistoryActivity, RefreshLayout refreshLayout) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        copy = i2 % 128;
        int i3 = i2 % 2;
        transactionHistoryActivity.lambda$initListener$0(refreshLayout);
        if (i3 == 0) {
            throw null;
        }
    }

    public static void $r8$lambda$PL7hMKqU3S9IvNh_JyrOsr2TGY0(TransactionHistoryActivity transactionHistoryActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 25;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m12231instrumented$2$initListener$V(transactionHistoryActivity, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m12222$r8$lambda$fx6O50TGRngU1qJnCS0NtxKAyU(TransactionHistoryActivity transactionHistoryActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 75;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m12230instrumented$1$initListener$V(transactionHistoryActivity, view);
        int i4 = copy + 113;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m12223$r8$lambda$ntw5BlTjk_vuoter9v0HmXxULI(TransactionHistoryActivity transactionHistoryActivity, TransferTypeFilterDialog transferTypeFilterDialog, View view) {
        int i = 2 % 2;
        int i2 = copy + 83;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m12229instrumented$0$showTypeDialog$V(transactionHistoryActivity, transferTypeFilterDialog, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$uieBPelsE1R82JJSbIecq3nLHoA(TransactionHistoryActivity transactionHistoryActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 29;
        copy = i2 % 128;
        int i3 = i2 % 2;
        transactionHistoryActivity.lambda$initData$4();
        int i4 = getRequestBeneficiariesState + 91;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    static RecordFilter m12224$$Nest$fgetcurrentFilterEvent(TransactionHistoryActivity transactionHistoryActivity) {
        int i = 2 % 2;
        int i2 = copy + 97;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        RecordFilter recordFilter = transactionHistoryActivity.currentFilterEvent;
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return recordFilter;
    }

    static boolean m12225$$Nest$fgetshowLoading(TransactionHistoryActivity transactionHistoryActivity) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 51;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = transactionHistoryActivity.showLoading;
        int i5 = i2 + 47;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static void m12226$$Nest$fputisLoading(TransactionHistoryActivity transactionHistoryActivity, boolean z) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 13;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        transactionHistoryActivity.isLoading = z;
        int i5 = i2 + 51;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    static void m12227$$Nest$msetData(TransactionHistoryActivity transactionHistoryActivity, List list, boolean z) {
        int i = 2 % 2;
        int i2 = copy + 19;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        transactionHistoryActivity.setData(list, z);
        if (i3 != 0) {
            throw null;
        }
    }

    static List m12228$$Nest$mtransData(TransactionHistoryActivity transactionHistoryActivity, List list) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        copy = i2 % 128;
        int i3 = i2 % 2;
        List<TransactionHistoryView> listTransData = transactionHistoryActivity.transData(list);
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        return listTransData;
    }

    private static void m12229instrumented$0$showTypeDialog$V(TransactionHistoryActivity transactionHistoryActivity, TransferTypeFilterDialog transferTypeFilterDialog, View view) {
        int i = 2 % 2;
        int i2 = copy + 41;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                transactionHistoryActivity.lambda$showTypeDialog$3(transferTypeFilterDialog, view);
                Callback.onClick_exit();
            } else {
                transactionHistoryActivity.lambda$showTypeDialog$3(transferTypeFilterDialog, view);
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

    private static void m12230instrumented$1$initListener$V(TransactionHistoryActivity transactionHistoryActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 67;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            transactionHistoryActivity.lambda$initListener$1(view);
            Callback.onClick_exit();
            int i4 = copy + 53;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
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

    private static void m12231instrumented$2$initListener$V(TransactionHistoryActivity transactionHistoryActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 83;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                transactionHistoryActivity.lambda$initListener$2(view);
                Callback.onClick_exit();
            } else {
                transactionHistoryActivity.lambda$initListener$2(view);
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

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 23;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = copy + 69;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
