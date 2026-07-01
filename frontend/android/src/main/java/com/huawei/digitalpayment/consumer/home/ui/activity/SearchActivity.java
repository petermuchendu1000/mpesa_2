package com.huawei.digitalpayment.consumer.home.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.blankj.utilcode.constant.CacheConstants;
import com.blankj.utilcode.util.CollectionUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.SPUtils;
import com.huawei.common.widget.SearchView;
import com.huawei.common.widget.dialog.DialogBox;
import com.huawei.digitalpayment.consumer.home.ui.adapter.SearchAdapter;
import com.huawei.digitalpayment.consumer.home.ui.adapter.SearchHistoryAdapter;
import com.huawei.digitalpayment.consumer.home.ui.fragment.MiniAppFragment;
import com.huawei.digitalpayment.consumer.home.widget.OnFunctionClick;
import com.huawei.digitalpayment.consumer.home.widget.OnMiniAppLoadListener;
import com.huawei.digitalpayment.consumer.homeui.databinding.ActivitySearchBinding;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import com.huawei.digitalpayment.home.data.source.locaL.SearchHistoryList;
import com.huawei.digitalpayment.home.viewmodel.HomeSearchViewModel;
import com.huawei.payment.mvvm.DataBindingAdapter;
import com.safaricom.mpesa.lifestyle.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.getSmallIconId;
import kotlin.io.encoding.Base64;
import kotlin.notify;
import org.apache.commons.lang3.CharUtils;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.signers.PSSSigner;

public class SearchActivity extends Hilt_SearchActivity<ActivitySearchBinding, HomeSearchViewModel> {
    private static byte[] ShareDataUIState;
    private static int component1;
    private static int component2;
    private static int component3;
    private static char component4;
    private static long copydefault;
    private static short[] equals;
    private static char[] getAsAtTimestamp;
    private static int hashCode;
    private LinearLayoutManager layoutManager;
    private MiniAppFragment miniAppFragment;
    private SearchAdapter recyclerAdapter;
    private SearchHistoryAdapter searchHistoryAdapter;
    private static final byte[] $$l = {66, 42, 112, 97};
    private static final int $$o = BERTags.PRIVATE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {119, -27, 13, -93, Ascii.DLE, 2, -59, 63, -4, 19, -62, TarHeader.LF_CONTIG, 6, -49, TarHeader.LF_CONTIG, 17, -6, Ascii.DC2, 1, -2, -1, -50, TarHeader.LF_CONTIG, 6, 20, -65, 69, 5, -7, 17, -13, Ascii.ETB, -7, 10, 3, -60, 56, Ascii.VT, Ascii.NAK, -72, 72, -9, 6, 6, 10, 3, -60, 69, 5, -7, 17, -13, Ascii.ETB, -7, 10, 3, -60, 72, -9, Ascii.SI, 3, 8, -6, Ascii.SI, -1, 7, Ascii.VT, -71, Ascii.FS, 35, 19, -13, 9, -35, 47, 4, -39, TarHeader.LF_CHR, 4, 7, -29, Ascii.ETB, Ascii.DLE, 8, -12, Ascii.DC2, 5, Ascii.DLE, 5, 13, -17, 5, 5, -1, Ascii.CAN, -5, Ascii.FF, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -61};
    private static final int $$k = 222;
    private static final byte[] $$d = {7, 75, -84, -52, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 87;
    private static int getShareableDataState = 1;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private boolean showAll = false;
    private final OnFunctionClick onFunctionClick = new OnFunctionClick() {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        @Override
        public void onClick(LocalHomeFunction localHomeFunction) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 27;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                ((HomeSearchViewModel) SearchActivity.access$000(SearchActivity.this)).saveHistory(localHomeFunction);
                int i3 = 7 / 0;
            } else {
                ((HomeSearchViewModel) SearchActivity.access$000(SearchActivity.this)).saveHistory(localHomeFunction);
            }
            int i4 = ShareDataUIState + 121;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r6, int r7, short r8) {
        /*
            int r8 = 119 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.$$l
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.$$r(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = 28 - r7
            int r6 = r6 * 2
            int r6 = r6 + 83
            int r8 = r8 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.$$d
            byte[] r0 = new byte[r0]
            int r7 = 27 - r7
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r8 = r8 + 1
            r3 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2c:
            int r8 = r8 + r6
            int r6 = r8 + (-8)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.h(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.$$j
            int r7 = r7 + 10
            int r5 = r5 + 4
            int r6 = r6 * 4
            int r6 = 99 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r5
            r6 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r0[r5]
        L25:
            int r5 = r5 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-4)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.i(int, int, byte, java.lang.Object[]):void");
    }

    static ViewModel access$000(SearchActivity searchActivity) {
        int i = 2 % 2;
        int i2 = copy + 71;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        VM vm = searchActivity.viewModel;
        int i4 = getRequestBeneficiariesState + 99;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return vm;
        }
        throw null;
    }

    static ViewModel access$100(SearchActivity searchActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 61;
        copy = i2 % 128;
        int i3 = i2 % 2;
        VM vm = searchActivity.viewModel;
        if (i3 == 0) {
            return vm;
        }
        throw null;
    }

    private static void j(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 113;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = notifyVar.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = (byte) (b2 - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - TextUtils.getCapsMode("", 0, 0), 33 - TextUtils.getOffsetBefore("", 0), (char) (60269 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), -834797019, false, $$r(b2, b3, (byte) (b3 & 17)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() | (copydefault + 5431355972723572778L);
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 687, (ViewConfiguration.getTapTimeout() >> 16) + 34, (char) (60373 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), -1969106284, false, $$r(b4, b5, (byte) (b5 & Ascii.SO)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifyVar.copydefault;
                Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 3266, (ViewConfiguration.getWindowTouchSlop() >> 8) + 33, (char) (View.combineMeasuredStates(0, 0) + 60268), -834797019, false, $$r(b6, b7, (byte) (b7 & 17)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (copydefault ^ 5431355972723572778L);
                Object[] objArr5 = {notifyVar, notifyVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(686 - ImageFormat.getBitsPerPixel(0), Drawable.resolveOpacity(0, 0) + 34, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 60373), -1969106284, false, $$r(b8, b9, (byte) (b9 & Ascii.SO)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr6 = {notifyVar, notifyVar};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault5 == null) {
                byte b10 = (byte) 0;
                byte b11 = (byte) (b10 - 1);
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(687 - Color.alpha(0), 34 - Color.blue(0), (char) (TextUtils.indexOf("", "") + 60373), -1969106284, false, $$r(b10, b11, (byte) (b11 & Ascii.SO)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        String str = new String(cArr2);
        int i6 = $10 + 5;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void f(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(component1)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = (byte) (b3 - 1);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 999, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 61684), 1874745193, false, $$r(b3, b4, (byte) (b4 & 6)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = ShareDataUIState;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = $11 + 27;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    for (int i9 = 0; i9 < length; i9++) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault2 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = (byte) (b5 - 1);
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - TextUtils.indexOf("", ""), 48 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (54462 - Color.green(0)), -1178636483, false, $$r(b5, b6, (byte) (b6 + 4)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i10 = $10 + 101;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        byte[] bArr3 = ShareDataUIState;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(component2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 - 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 1000, 31 - Color.argb(0, 0, 0, 0), (char) (61685 - (KeyEvent.getMaxKeyCode() >> 16)), 1874745193, false, $$r(b7, b8, (byte) (b8 & 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) & 7083766810336261929L)) - ((int) (((long) component1) / 7083766810336261929L));
                    } else {
                        byte[] bArr4 = ShareDataUIState;
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(component2)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault4 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 - 1);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 999, 31 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (61685 - (ViewConfiguration.getLongPressTimeout() >> 16)), 1874745193, false, $$r(b9, b10, (byte) (b10 & 6)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i4 = ((byte) (((long) bArr4[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L));
                    }
                    iIntValue = (byte) i4;
                } else {
                    iIntValue = (short) (((short) (((long) equals[i + ((int) (((long) component2) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) component2) ^ 7083766810336261929L)) + i6;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i2), Integer.valueOf(component3), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    byte b11 = (byte) 0;
                    byte b12 = (byte) (b11 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 1698, (ViewConfiguration.getPressedStateDuration() >> 16) + 37, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -1454191902, false, $$r(b11, b12, (byte) (b12 & 7)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr5 = ShareDataUIState;
                if (bArr5 != null) {
                    int i11 = $11 + 95;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    int i13 = 0;
                    while (i13 < length2) {
                        bArr6[i13] = (byte) (((long) bArr5[i13]) ^ 7083766810336261929L);
                        i13++;
                        int i14 = $10 + 57;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i16 = $10 + 121;
                    $11 = i16 % 128;
                    int i17 = i16 % 2;
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    int i18 = $11 + 27;
                    $10 = i18 % 128;
                    if (i18 % 2 != 0) {
                        throw null;
                    }
                    if (z) {
                        byte[] bArr7 = ShareDataUIState;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = equals;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                    int i19 = $10 + 55;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
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

    @Override
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952805_res_0x7f1304a5).substring(19, 20).length() - 25510482, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 53), (-2091026124) + ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954889_res_0x7f130cc9).substring(0, 1).length(), (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952721_res_0x7f130451).substring(6, 7).codePointAt(0) - 32), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952792_res_0x7f130498).substring(2, 3).codePointAt(0) - 68, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        g(5 - View.resolveSize(0, 0), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 71), new char[]{16, '#', 17, JSONLexer.EOI, 13866}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = getRequestBeneficiariesState + 91;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952715_res_0x7f13044b).substring(6, 7).length() - 25510464, (byte) ((((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer._2131427364_res_0x7f0b0024) & (-3)) - 88), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 2091026123, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).length() - 1), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953980_res_0x7f13093c).substring(0, 4).codePointAt(0) - 73, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) - 25510469, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(13) - 139), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2091026150, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(25) - 116), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952793_res_0x7f130499).substring(6, 7).length() - 37, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollBarSize() >> 8) + 6618, 42 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 19, (byte) (120 - MotionEvent.axisFromString("")), new char[]{2, 4, 0, 1, 23, 7, 23, '\"', 16, 28, 21, 1, 2, 21, 31, 23, 11, 0, 13864, 13864, 2, 19, 23, 31, 30, CharUtils.CR, 1, 30, 7, 0, 13941, 13941, 31, 5, 11, 4, 3, 4, 19, 4, 25, 1, 6, '\"', '#', 7, 30, 7}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952805_res_0x7f1304a5).substring(19, 20).length() + 63, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 26), new char[]{'\b', 14, 23, 2, 7, '\"', 13940, 13940, 3, 1, 1, '#', 1, 21, 13940, 13940, 22, '\b', 18, '\f', 6, 4, '\b', 22, 16, 18, 14, JSONLexer.EOI, 18, CharUtils.CR, 18, 7, 6, 16, 18, '\n', ' ', 11, 4, 23, 18, 16, 4, 0, 6, 0, '#', 0, 14, '\b', 0, 7, 6, 17, 6, 18, 20, 21, 0, 15, 21, 2, 21, 1}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f((-25510419) - ExpandableListView.getPackedPositionGroup(0L), (byte) ((ViewConfiguration.getEdgeSlop() >> 16) - 65), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(1) - 2091026218, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952793_res_0x7f130499).substring(6, 7).codePointAt(0) - 68, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 25510384, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 82), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952767_res_0x7f13047f).substring(12, 13).codePointAt(0) - 2091026148, (short) (KeyEvent.getMaxKeyCode() >> 16), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952718_res_0x7f13044e).substring(6, 7).codePointAt(0) - 68, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952016_res_0x7f130190).substring(7, 8).codePointAt(0) - 40, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 18), new char[]{1, '\t', 1, '#', '\b', 19}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    g((ViewConfiguration.getFadingEdgeLength() >> 16) + 36, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 9), new char[]{11, 2, 7, 25, ' ', 19, 7, 18, '\"', '\t', 6, 16, '\t', '\"', ' ', 31, 31, 18, 31, 3, '\"', 7, '\t', 30, 23, 31, ' ', 30, CharUtils.CR, 30, 1, 21, 7, 1, 6, 11}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - ((Process.getThreadPriority(0) + 20) >> 6), 56 - Gravity.getAbsoluteGravity(0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2405;
            int size = View.MeasureSpec.getSize(0) + 26;
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            h((byte) (-bArr[22]), (byte) (-bArr[38]), bArr[12], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, size, packedPositionType, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i4 = getRequestBeneficiariesState + 67;
            copy = i4 % 128;
            int i5 = i4 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                Object[] objArr14 = new Object[1];
                h((byte) (-$$d[22]), r0[95], r0[31], objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2404 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 25510312, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 34), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2091026143, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952847_res_0x7f1304cf).substring(21, 22).codePointAt(0) - 32), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952016_res_0x7f130190).substring(7, 8).codePointAt(0) - 82, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952754_res_0x7f130472).substring(2, 3).length() - 25510268, (byte) (36 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 2091026115, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952016_res_0x7f130190).substring(7, 8).codePointAt(0) - 46), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 82, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -930552943};
                byte[] bArr2 = $$j;
                byte b2 = (byte) (bArr2[18] - 1);
                byte b3 = b2;
                Object[] objArr18 = new Object[1];
                i(b2, b3, (byte) (b3 | 74), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b4 = bArr2[18];
                Object[] objArr19 = new Object[1];
                i((byte) 83, (byte) (b4 - 1), b4, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iIndexOf = 2404 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int iKeyCodeFromString = 26 - KeyEvent.keyCodeFromString("");
                    char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr3 = $$d;
                    byte b5 = (byte) (-bArr3[22]);
                    byte b6 = bArr3[95];
                    byte b7 = bArr3[31];
                    Object[] objArr20 = new Object[1];
                    h(b5, b6, b7, objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iKeyCodeFromString, c2, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 25510280, (byte) ((-86) - View.combineMeasuredStates(0, 0)), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 2091026169, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954589_res_0x7f130b9d).substring(0, 2).length() - 2), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952790_res_0x7f130496).substring(7, 8).codePointAt(0) - 68, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952804_res_0x7f1304a4).substring(10, 11).length() + 14, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(21) - 89), new char[]{'!', 17, 0, 19, 23, '!', '\n', JSONLexer.EOI, 31, 5, 21, 15, '#', 23, 13839}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2405;
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 26;
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        byte b8 = $$d[9];
                        Object[] objArr23 = new Object[1];
                        h((byte) (b8 - 1), r7[33], b8, objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout, iResolveSizeAndState, cResolveSizeAndState, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int iKeyCodeFromString2 = 2405 - KeyEvent.keyCodeFromString("");
                        int iAxisFromString = 25 - MotionEvent.axisFromString("");
                        char cRed = (char) Color.red(0);
                        byte[] bArr4 = $$d;
                        Object[] objArr24 = new Object[1];
                        h((byte) (-bArr4[22]), (byte) (-bArr4[38]), bArr4[12], objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString2, iAxisFromString, cRed, -2047739879, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i6 = ((int[]) objArr[0])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i7 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 6618, 43 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i8 = getRequestBeneficiariesState + 87;
            copy = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr25 = {1411181175, Long.valueOf(j3), arrayList, null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - View.MeasureSpec.getSize(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 57, (char) View.resolveSize(0, 0));
                byte[] bArr5 = $$j;
                byte b9 = (byte) (-bArr5[3]);
                byte b10 = (byte) (bArr5[18] - 1);
                Object[] objArr26 = new Object[1];
                i(b9, b10, b10, objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        initView();
        initListener();
        initObserver();
        initData();
    }

    protected void initView() {
        int i = 2 % 2;
        ((ActivitySearchBinding) this.binding).nvlist.setVisibility(8);
        this.layoutManager = new LinearLayoutManager(this);
        ((ActivitySearchBinding) this.binding).searchView.getEditText().requestFocus();
        getWindow().setSoftInputMode(5);
        initSearchListView();
        initHistoryView();
        int i2 = getRequestBeneficiariesState + 89;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
    }

    private void initObserver() {
        int i = 2 % 2;
        ((HomeSearchViewModel) this.viewModel).getSpHistoryObjectLiveData().observe(this, new Observer<SearchHistoryList>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void onChanged(SearchHistoryList searchHistoryList) {
                int i2 = 2 % 2;
                int i3 = copydefault + 79;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                component2(searchHistoryList);
                if (i4 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i5 = copydefault + 21;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            public void component2(SearchHistoryList searchHistoryList) {
                int i2 = 2 % 2;
                int i3 = component3 + 105;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                SearchActivity.m10480$$Nest$mupdateHistoryTags(SearchActivity.this, searchHistoryList);
                int i5 = component3 + 29;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getRequestBeneficiariesState + 35;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r30, byte r31, char[] r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.g(int, byte, char[], java.lang.Object[]):void");
    }

    private void searchMiniApp() {
        int i = 2 % 2;
        if (CollectionUtils.isEmpty(((HomeSearchViewModel) this.viewModel).getSearchResultLiveData().getValue())) {
            int i2 = copy + 81;
            getRequestBeneficiariesState = i2 % 128;
            (i2 % 2 == 0 ? (ActivitySearchBinding) this.binding : (ActivitySearchBinding) this.binding).tvSearching.setVisibility(0);
        }
        MiniAppFragment miniAppFragment = this.miniAppFragment;
        if (miniAppFragment == null) {
            int i3 = copy + 63;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            initMiniAppFragment();
            return;
        }
        miniAppFragment.setKeywords(getSearchString());
        int i5 = copy + 75;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    private void initMiniAppFragment() {
        int i = 2 % 2;
        MiniAppFragment miniAppFragmentNewInstance = MiniAppFragment.newInstance(getSearchString());
        this.miniAppFragment = miniAppFragmentNewInstance;
        miniAppFragmentNewInstance.setFunctionClick(this.onFunctionClick);
        this.miniAppFragment.setOnMiniAppLoadListener(new OnMiniAppLoadListener() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onDataBack(List<LocalHomeFunction> list) {
                int i2 = 2 % 2;
                int i3 = component3 + 117;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                SearchActivity.m10478$$Nest$msetMiniAppSearchResult(SearchActivity.this, list);
                int i5 = component2 + 77;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(com.huawei.digitalpayment.consumer.homeui.R.id.miniapp, this.miniAppFragment, "miniApp");
        fragmentTransactionBeginTransaction.commit();
        int i2 = copy + 69;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void setMiniAppSearchResult(List<LocalHomeFunction> list) {
        ConstraintLayout constraintLayout;
        int i;
        int i2 = 2 % 2;
        ((ActivitySearchBinding) this.binding).tvSearching.setVisibility(8);
        if (!CollectionUtils.isEmpty(((HomeSearchViewModel) this.viewModel).getSearchResultLiveData().getValue()) || !CollectionUtils.isEmpty(list) || TextUtils.isEmpty(getSearchString())) {
            ((ActivitySearchBinding) this.binding).noresultconstraint.setVisibility(8);
            return;
        }
        int i3 = copy + 123;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            constraintLayout = ((ActivitySearchBinding) this.binding).noresultconstraint;
            i = 1;
        } else {
            constraintLayout = ((ActivitySearchBinding) this.binding).noresultconstraint;
            i = 0;
        }
        constraintLayout.setVisibility(i);
        int i4 = getRequestBeneficiariesState + 41;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private void updateHistoryTags(SearchHistoryList searchHistoryList) {
        int i = 2 % 2;
        int i2 = copy + 89;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        setHistoryData(searchHistoryList.getHomeFunctions());
        int i4 = getRequestBeneficiariesState + 47;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setHistoryData(java.util.List<com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction> r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r3.showAll
            if (r1 != 0) goto L2d
            int r1 = com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.getRequestBeneficiariesState
            int r1 = r1 + 31
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.copy = r2
            int r1 = r1 % r0
            int r1 = r4.size()
            r2 = 8
            if (r1 > r2) goto L19
            goto L2d
        L19:
            r1 = 0
            r2 = 7
            java.util.List r4 = r4.subList(r1, r2)
            com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction r1 = new com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction
            r1.<init>()
            r4.add(r1)
            com.huawei.digitalpayment.consumer.home.ui.adapter.SearchHistoryAdapter r1 = r3.searchHistoryAdapter
            r1.submitList(r4)
            goto L3b
        L2d:
            com.huawei.digitalpayment.consumer.home.ui.adapter.SearchHistoryAdapter r1 = r3.searchHistoryAdapter
            r1.submitList(r4)
            int r4 = com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.getRequestBeneficiariesState
            int r4 = r4 + 11
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.copy = r1
            int r4 = r4 % r0
        L3b:
            int r4 = com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.copy
            int r4 = r4 + 77
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.getRequestBeneficiariesState = r1
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.setHistoryData(java.util.List):void");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 29;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = com.huawei.digitalpayment.consumer.homeui.R.layout.activity_search;
        if (i3 == 0) {
            return i4;
        }
        throw null;
    }

    private void initData() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 41;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            ((HomeSearchViewModel) this.viewModel).initSearchRepoFunctions();
            SearchHistoryList searchHistoryList = ((HomeSearchViewModel) this.viewModel).getSearchHistoryList();
            ((HomeSearchViewModel) this.viewModel).setHistoryData(searchHistoryList.getHomeFunctions());
            setHistoryData(searchHistoryList.getHomeFunctions());
            showHistory();
            int i3 = 25 / 0;
            return;
        }
        ((HomeSearchViewModel) this.viewModel).initSearchRepoFunctions();
        SearchHistoryList searchHistoryList2 = ((HomeSearchViewModel) this.viewModel).getSearchHistoryList();
        ((HomeSearchViewModel) this.viewModel).setHistoryData(searchHistoryList2.getHomeFunctions());
        setHistoryData(searchHistoryList2.getHomeFunctions());
        showHistory();
    }

    private void initSearchListView() {
        int i = 2 % 2;
        ((ActivitySearchBinding) this.binding).listview.setLayoutManager(this.layoutManager);
        this.recyclerAdapter = new SearchAdapter(getApplicationContext(), ((HomeSearchViewModel) this.viewModel).getSearchResultLiveData().getValue(), this.onFunctionClick, getSearchString());
        ((ActivitySearchBinding) this.binding).listview.setAdapter(this.recyclerAdapter);
        int i2 = copy + 29;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void initHistoryView() {
        int i = 2 % 2;
        this.searchHistoryAdapter = new SearchHistoryAdapter();
        ((ActivitySearchBinding) this.binding).rvSearchhistory.setLayoutManager(new GridLayoutManager(this, 4));
        ((ActivitySearchBinding) this.binding).rvSearchhistory.setAdapter(this.searchHistoryAdapter);
        int i2 = copy + 55;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
        }
    }

    private void lambda$initListener$0(View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 99;
        copy = i2 % 128;
        int i3 = i2 % 2;
        finish();
        if (i3 != 0) {
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 101;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private void lambda$initListener$1(View view) {
        int i = 2 % 2;
        int i2 = copy + 65;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        confirmClearSearchHistory();
        if (i3 == 0) {
            throw null;
        }
        int i4 = copy + 11;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private void initListener() {
        int i = 2 % 2;
        ((ActivitySearchBinding) this.binding).searchView.setOnSearchResultListener(new SearchView.OnSearchResultListener() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public void onClickSearch(String str) {
                int i2 = 2 % 2;
                int i3 = component3 + 33;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                if (!TextUtils.isEmpty(str)) {
                    SearchActivity.m10479$$Nest$mtoSearch(SearchActivity.this);
                    return;
                }
                int i5 = component3 + 119;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onAutoSearch(String str) {
                int i2 = 2 % 2;
                int i3 = component3 + 29;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                if (!TextUtils.isEmpty(str)) {
                    SearchActivity.m10479$$Nest$mtoSearch(SearchActivity.this);
                    int i5 = component3 + 107;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                int i7 = component2 + 103;
                component3 = i7 % 128;
                if (i7 % 2 == 0) {
                    SearchActivity.m10476$$Nest$mclearSearch(SearchActivity.this);
                } else {
                    SearchActivity.m10476$$Nest$mclearSearch(SearchActivity.this);
                    throw null;
                }
            }
        });
        ((ActivitySearchBinding) this.binding).searchback.setOnClickListener(new View.OnClickListener() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 15;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    SearchActivity.m10474$r8$lambda$IfCG9pKQc5Vx6AjpNorlTZtVrM(this.f$0, view);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                SearchActivity.m10474$r8$lambda$IfCG9pKQc5Vx6AjpNorlTZtVrM(this.f$0, view);
                int i4 = component2 + 13;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        ((ActivitySearchBinding) this.binding).deleteHistory.setOnClickListener(new View.OnClickListener() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component2 + 53;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                SearchActivity.$r8$lambda$HH_RkUZOEACg4UCDBWShNOO07Mc(this.f$0, view);
                int i5 = copydefault + 69;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        this.searchHistoryAdapter.setOnItemClickListener(new DataBindingAdapter.OnItemClickListener<LocalHomeFunction>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public void onItemClick(DataBindingAdapter dataBindingAdapter, View view, int i2, LocalHomeFunction localHomeFunction) {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 85;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                component1(dataBindingAdapter, view, i2, localHomeFunction);
                int i6 = component2 + 61;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
            }

            public void component1(DataBindingAdapter dataBindingAdapter, View view, int i2, LocalHomeFunction localHomeFunction) {
                SearchActivity searchActivity;
                int i3 = 2 % 2;
                if (TextUtils.isEmpty(localHomeFunction.getFuncName())) {
                    int i4 = component2 + 31;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        SearchActivity.m10475$$Nest$fputshowAll(SearchActivity.this, false);
                        searchActivity = SearchActivity.this;
                    } else {
                        SearchActivity.m10475$$Nest$fputshowAll(SearchActivity.this, true);
                        searchActivity = SearchActivity.this;
                    }
                    SearchActivity.m10477$$Nest$msetHistoryData(searchActivity, ((HomeSearchViewModel) SearchActivity.access$100(searchActivity)).getSearchHistoryList().getHomeFunctions());
                } else {
                    RouteUtils.routeWithExecute(SearchActivity.this, localHomeFunction.getExecute());
                    int i5 = component2 + 43;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                }
                int i7 = ShareDataUIState + 45;
                component2 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 33 / 0;
                }
            }
        });
        int i2 = copy + 55;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void toSearch() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 47;
        copy = i2 % 128;
        int i3 = i2 % 2;
        hideHistory();
        ((ActivitySearchBinding) this.binding).nvlist.setVisibility(0);
        startSearch();
        int i4 = getRequestBeneficiariesState + 79;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void clearSearch() {
        int i = 2 % 2;
        ((ActivitySearchBinding) this.binding).tvSearching.setVisibility(8);
        ((HomeSearchViewModel) this.viewModel).clearSearchResultData();
        this.recyclerAdapter.setData(new ArrayList());
        ((ActivitySearchBinding) this.binding).nvlist.setVisibility(8);
        ((ActivitySearchBinding) this.binding).noresultconstraint.setVisibility(8);
        this.miniAppFragment.stopSearch();
        showHistory();
        int i2 = copy + 75;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private void startSearch() {
        int i = 2 % 2;
        int i2 = copy + 65;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ((ActivitySearchBinding) this.binding).tvSearching.setVisibility(8);
        this.recyclerAdapter.setKeywords(getSearchString());
        ((HomeSearchViewModel) this.viewModel).setSearchResultData(getSearchString());
        this.recyclerAdapter.setData(((HomeSearchViewModel) this.viewModel).getSearchResultLiveData().getValue());
        ((ActivitySearchBinding) this.binding).noresultconstraint.setVisibility(8);
        searchMiniApp();
        int i4 = getRequestBeneficiariesState + 73;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private String getSearchString() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String searchText = ((ActivitySearchBinding) this.binding).searchView.getSearchText();
        int i4 = getRequestBeneficiariesState + 45;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return searchText;
    }

    private void showHistory() {
        Object obj;
        int i = 2 % 2;
        int i2 = copy + 77;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        List<LocalHomeFunction> homeFunctions = ((HomeSearchViewModel) this.viewModel).getSearchHistoryList().getHomeFunctions();
        if (homeFunctions != null) {
            int i4 = getRequestBeneficiariesState + 27;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                homeFunctions.size();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (homeFunctions.size() > 0) {
                int i5 = copy + 21;
                getRequestBeneficiariesState = i5 % 128;
                if (i5 % 2 == 0) {
                    ((ActivitySearchBinding) this.binding).layoutHistoryTitleBar.setVisibility(0);
                    obj = this.binding;
                } else {
                    ((ActivitySearchBinding) this.binding).layoutHistoryTitleBar.setVisibility(0);
                    obj = this.binding;
                }
                ((ActivitySearchBinding) obj).rvSearchhistory.setVisibility(0);
                int i6 = copy + 93;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }

    private void hideHistory() {
        int i = 2 % 2;
        int i2 = copy + 59;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ((ActivitySearchBinding) this.binding).layoutHistoryTitleBar.setVisibility(8);
        ((ActivitySearchBinding) this.binding).rvSearchhistory.setVisibility(8);
        int i4 = copy + 75;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 28 / 0;
        }
    }

    private void lambda$confirmClearSearchHistory$2(View view, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 97;
        copy = i2 % 128;
        int i3 = i2 % 2;
        SPUtils.getInstance().put(((HomeSearchViewModel) this.viewModel).getSearchHistoryKey(), "");
        hideHistory();
        ((HomeSearchViewModel) this.viewModel).clearHistory();
        int i4 = copy + 1;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private void confirmClearSearchHistory() {
        int i = 2 % 2;
        DialogBox.builder().setContent(getString(com.huawei.digitalpayment.consumer.homeui.R.string.home_search_tips7)).setLeftButtonText(getString(com.huawei.digitalpayment.consumer.homeui.R.string.home_search_button2)).setRightButtonText(getString(com.huawei.digitalpayment.consumer.homeui.R.string.home_search_button3)).setRightButtonListener(new DialogBox.DialogBoxListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final void onButtonClick(View view, String str) {
                int i2 = 2 % 2;
                int i3 = copydefault + 45;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SearchActivity.$r8$lambda$cgeR7OHf2l3IxTK0vENLxuB0_jg(this.f$0, view, str);
                int i5 = component1 + 41;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 68 / 0;
                }
            }
        }).build().show(getSupportFragmentManager(), "ClearSearchHistoryDialog");
        int i2 = copy + 99;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01ce  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01ac  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.onPause():void");
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r45) {
        /*
            Method dump skipped, instruction units count: 15777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.activity.SearchActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$HH_RkUZOEACg4UCDBWShNOO07Mc(SearchActivity searchActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 125;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m10482instrumented$1$initListener$V(searchActivity, view);
        int i4 = copy + 45;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10474$r8$lambda$IfCG9pKQc5Vx6AjpNorlTZtVrM(SearchActivity searchActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m10481instrumented$0$initListener$V(searchActivity, view);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$cgeR7OHf2l3IxTK0vENLxuB0_jg(SearchActivity searchActivity, View view, String str) {
        int i = 2 % 2;
        int i2 = copy + 23;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        searchActivity.lambda$confirmClearSearchHistory$2(view, str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void m10475$$Nest$fputshowAll(SearchActivity searchActivity, boolean z) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 27;
        copy = i3 % 128;
        int i4 = i3 % 2;
        searchActivity.showAll = z;
        int i5 = i2 + 41;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    static void m10476$$Nest$mclearSearch(SearchActivity searchActivity) {
        int i = 2 % 2;
        int i2 = copy + 109;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        searchActivity.clearSearch();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void m10477$$Nest$msetHistoryData(SearchActivity searchActivity, List list) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 17;
        copy = i2 % 128;
        int i3 = i2 % 2;
        searchActivity.setHistoryData(list);
        int i4 = copy + 99;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void m10478$$Nest$msetMiniAppSearchResult(SearchActivity searchActivity, List list) {
        int i = 2 % 2;
        int i2 = copy + 75;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        searchActivity.setMiniAppSearchResult(list);
        if (i3 == 0) {
            throw null;
        }
    }

    static void m10479$$Nest$mtoSearch(SearchActivity searchActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 9;
        copy = i2 % 128;
        int i3 = i2 % 2;
        searchActivity.toSearch();
        int i4 = copy + 33;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static void m10480$$Nest$mupdateHistoryTags(SearchActivity searchActivity, SearchHistoryList searchHistoryList) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 61;
        copy = i2 % 128;
        int i3 = i2 % 2;
        searchActivity.updateHistoryTags(searchHistoryList);
        if (i3 != 0) {
            throw null;
        }
        int i4 = copy + 95;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void m10481instrumented$0$initListener$V(SearchActivity searchActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            searchActivity.lambda$initListener$0(view);
            Callback.onClick_exit();
            int i4 = copy + 15;
            getRequestBeneficiariesState = i4 % 128;
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

    private static void m10482instrumented$1$initListener$V(SearchActivity searchActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 9;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                searchActivity.lambda$initListener$1(view);
                Callback.onClick_exit();
                int i4 = 45 / 0;
            } else {
                searchActivity.lambda$initListener$1(view);
                Callback.onClick_exit();
            }
            int i5 = copy + 13;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        int i2 = copy + 113;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 51;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copy + 117;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        hashCode = 0;
        component2();
        copydefault = -5945252144928198153L;
        int i = getShareableDataState + 23;
        hashCode = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        component2 = -263309960;
        component1 = -238323958;
        component3 = -1922437115;
        ShareDataUIState = new byte[]{-58, 123, 117, 121, -113, -122, 89, 89, -64, 127, 58, -79, -128, -127, -122, 117, -115, 118, -34, -125, 124, 115, -118, -108, 91, -123, -117, 115, -115, 117, -111, -94, -109, 62, -128, -113, -77, 74, 123, 122, 125, -114, 118, -115, -58, 117, -116, 127, -103, 116, 112, 119, 118, -118, -91, 71, -116, -125, 121, -118, 119, -104, TarHeader.LF_BLK, -72, -105, 104, -110, 108, 69, -110, 105, -92, -106, 105, 110, SignedBytes.MAX_POWER_OF_TWO, -70, -112, 88, -89, 111, -97, 111, 104, -107, 105, 68, -69, 66, -91, -105, 91, -69, -112, 92, -91, -106, 89, -89, 107, 68, -90, 104, 104, -105, -109, 107, -106, 68, 104, -107, -69, -109, 111, 71, -107, -106, -69, -105, -107, 106, -109, 91, -70, 68, -96, Ascii.FF, -123, 124, 115, -107, 107, 76, -121, -58, Base64.padSymbol, -63, 123, 116, -124, -125, 127, SignedBytes.MAX_POWER_OF_TWO, PSSSigner.TRAILER_IMPLICIT, -125, 117, 72, -72, -124, 118, 79, -77, -119, 107, -106, 126, -124, 117, -120, 107, -106, 116, 67, -64, 123, 104, -124, -107, 105, -122, -119, 112, -114, 60, -74, -123, 86, 121, 120, 122, -122, 127, -122, 123, -76, 73, -122, -123, 121, -123, 125, 122, -113, -67, 121, -122, 122, 118, -60, Ascii.RS, -25, Ascii.ETB, -20, TarHeader.LF_NORMAL, TarHeader.LF_CHR, -47, -17, Ascii.ESC, -29, 40, -37, -3, 3, -31, -60, Ascii.FF, -8, 33, -42, -8, Ascii.US, 20, -62, 8, 6, -8, Ascii.VT, 4, Ascii.FF, -10, -38, -117, 119, -128, -86, 85, -117, 114, -126, 121, -91, -90, 56, -121, -62, 73, 120, 121, 126, -115, 117, -114, TarHeader.LF_BLK, -2, -52, -1, 7, 0, 43, -1, -44, 43, 1, -52, 47, 2, -45, 45, -52, 45, -50, TarHeader.LF_NORMAL, 3, -53, 0, TarHeader.LF_NORMAL, -45, -3, 1, 0, -6, 5, 43, -43, -7, TarHeader.LF_SYMLINK, -51, 47, 0, -45, -1, -6, 0, 46, -1, -4, -43, 46, -49, 1, 44, -51, 0, 0, 45, 3, -49, 47, -46, 40, 1, 1, -51, TarHeader.LF_SYMLINK, -43, 45, TarHeader.LF_BLK, 71, -105, -71, -108, -106, 89, -107, -96, 91, -105, -65, 106, 70, -111, -65, 65, -70, 106, -108, -107, 91, -96, 107, -106, 109, -111, 104, 107, -108, -112, 111, -110, -107, 88, -95, -108, 91, -92, 109, 77, -72, -111, 111, -108, 104, -112, 107, 68, -107, 106, -70, 106, 106, -110, 91, 107, -70, SignedBytes.MAX_POWER_OF_TWO, -69, 71, 105, -69, 107, -63, -90, -89, 95, -95, 88, 90, -96, -90, 91, -91, -63, 120, -122, -124, 123, 126, -123, 126, -128, 127, -125, -63, 43, 44, -42, 42, -48, 44, -44, 42, -42, 47, -63, 105, -110, 109, -106, 107, 106, -105, -109, 111, -109};
        getAsAtTimestamp = new char[]{2022, 2017, 1970, 1977, 1052, 1969, 2018, 1966, 2020, 2036, 1968, 1975, 1976, 1055, 2005, 2028, 2023, 2029, 2032, 1974, 1971, 2035, 2019, 1049, 1053, 1050, 1054, 1048, 2002, 2025, 1973, 1972, 1051, 1965, 2041, 2021};
        component4 = (char) 12828;
    }
}
