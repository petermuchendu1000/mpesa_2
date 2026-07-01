package com.huawei.digitalpayment.pwa.viewmodel;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.pwa.model.IPwaModel;
import com.huawei.digitalpayment.pwa.model.response.GetH5AccessTokenResp;
import com.huawei.digitalpayment.pwa.model.response.ScanQrResp;
import com.huawei.digitalpayment.pwa.model.resquest.AnalysisResultRequest;
import com.huawei.digitalpayment.pwa.model.resquest.H5AccessTokenRequest;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.notify;

public class BasePwaViewModel<Model extends IPwaModel> extends ViewModel {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final MutableLiveData<Resource<ScanQrResp>> component2 = new MutableLiveData<>();
    private final MutableLiveData<Resource<GetH5AccessTokenResp>> copydefault = new MutableLiveData<>();
    protected final Model model;

    public MutableLiveData<Resource<GetH5AccessTokenResp>> getGetTokenLiveData() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<GetH5AccessTokenResp>> mutableLiveData = this.copydefault;
        int i5 = i3 + 73;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableLiveData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MutableLiveData<Resource<ScanQrResp>> getScanLiveData() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        MutableLiveData<Resource<ScanQrResp>> mutableLiveData = this.component2;
        int i5 = i3 + 7;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public BasePwaViewModel(Model model) {
        this.model = model;
    }

    @Deprecated
    public void analysisResult(String str, String str2) {
        int i = 2 % 2;
        analysisResult(new AnalysisResultRequest(str, str2));
        int i2 = component1 + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void analysisResult(AnalysisResultRequest analysisResultRequest) {
        int i = 2 % 2;
        getScanLiveData().postValue(Resource.loading(null));
        this.model.analysisResult(analysisResultRequest, new ApiCallback<ScanQrResp>() {
            private static final byte[] $$c = {19, TarHeader.LF_SYMLINK, -9, 119};
            private static final int $$d = 175;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {4, -80, 45, 109, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48};
            private static final int $$b = 6;
            private static int component3 = 0;
            private static int component1 = 1;
            private static long component2 = -3024447384225589248L;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$e(int r6, short r7, byte r8) {
                /*
                    byte[] r0 = com.huawei.digitalpayment.pwa.viewmodel.BasePwaViewModel.AnonymousClass5.$$c
                    int r7 = r7 * 3
                    int r1 = 1 - r7
                    int r6 = r6 * 2
                    int r6 = r6 + 4
                    int r8 = r8 * 3
                    int r8 = 105 - r8
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r7 = 0 - r7
                    if (r0 != 0) goto L19
                    r8 = r6
                    r3 = r7
                    r4 = r2
                    goto L2d
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r7) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L27:
                    r3 = r0[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r3
                    r3 = r5
                L2d:
                    int r6 = -r6
                    int r6 = r6 + r3
                    int r8 = r8 + 1
                    r3 = r4
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.viewmodel.BasePwaViewModel.AnonymousClass5.$$e(int, short, byte):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(int r5, short r6, int r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 * 16
                    int r7 = 99 - r7
                    byte[] r0 = com.huawei.digitalpayment.pwa.viewmodel.BasePwaViewModel.AnonymousClass5.$$a
                    int r5 = r5 * 6
                    int r5 = r5 + 10
                    int r6 = r6 * 3
                    int r6 = 37 - r6
                    byte[] r1 = new byte[r5]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r4 = r7
                    r3 = r2
                    r7 = r5
                    goto L29
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r5) goto L27
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L27:
                    r4 = r0[r6]
                L29:
                    int r6 = r6 + 1
                    int r7 = r7 + r4
                    int r7 = r7 + (-17)
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.pwa.viewmodel.BasePwaViewModel.AnonymousClass5.a(int, short, int, java.lang.Object[]):void");
            }

            private static void b(int i2, char[] cArr, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                notify notifyVar = new notify();
                notifyVar.component3 = i2;
                int length = cArr.length;
                long[] jArr = new long[length];
                notifyVar.copydefault = 0;
                while (notifyVar.copydefault < cArr.length) {
                    int i4 = $11 + 97;
                    $10 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = notifyVar.copydefault;
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                            if (objCopydefault == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3266 - View.resolveSize(0, 0), (Process.myTid() >> 22) + 33, (char) (MotionEvent.axisFromString("") + 60269), -834797019, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() % (component2 / 5431355972723572778L);
                            Object[] objArr3 = {notifyVar, notifyVar};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                            if (objCopydefault2 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 687, 34 - View.MeasureSpec.getSize(0), (char) ((KeyEvent.getMaxKeyCode() >> 16) + 60373), -1969106284, false, $$e(b4, b5, b5), new Class[]{Object.class, Object.class});
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
                        int i6 = notifyVar.copydefault;
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                            if (objCopydefault3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 3266, Drawable.resolveOpacity(0, 0) + 33, (char) (60267 - TextUtils.lastIndexOf("", '0', 0, 0)), -834797019, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                            }
                            jArr[i6] = ((Long) ((Method) objCopydefault3).invoke(null, objArr4)).longValue() ^ (component2 ^ 5431355972723572778L);
                            Object[] objArr5 = {notifyVar, notifyVar};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                            if (objCopydefault4 == null) {
                                byte b8 = (byte) 0;
                                byte b9 = b8;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(687 - View.getDefaultSize(0, 0), 34 - KeyEvent.normalizeMetaState(0), (char) (View.resolveSize(0, 0) + 60373), -1969106284, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objCopydefault4).invoke(null, objArr5);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                }
                char[] cArr2 = new char[length];
                notifyVar.copydefault = 0;
                while (notifyVar.copydefault < cArr.length) {
                    int i7 = $10 + 79;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                    Object[] objArr6 = {notifyVar, notifyVar};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault5 == null) {
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 687, 'R' - AndroidCharacter.getMirror('0'), (char) (Color.rgb(0, 0, 0) + 16837589), -1969106284, false, $$e(b10, b11, b11), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault5).invoke(null, objArr6);
                }
                objArr[0] = new String(cArr2);
            }

            @Override
            public void onSuccess(ScanQrResp scanQrResp) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                if (objCopydefault == null) {
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 999;
                    int packedPositionGroup = 31 - ExpandableListView.getPackedPositionGroup(0L);
                    char cRgb = (char) ((-16715531) - Color.rgb(0, 0, 0));
                    byte b2 = (byte) ($$b - 5);
                    byte b3 = (byte) (b2 | 10);
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, (byte) (b3 & 5), objArr2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(longPressTimeout, packedPositionGroup, cRgb, -1638177773, false, (String) objArr2[0], null);
                }
                long j = ((Field) objCopydefault).getLong(null);
                Object[] objArr3 = new Object[1];
                b(TextUtils.getTrimmedLength("") + 42239, new char[]{22603, 64699, 4528, 46757, 52153, 24760, 34228, 56061, 32701, 38062, 10738, 20108, 58279, 14506, 23980, 62142, 6071, 44166, 49576, 26280, 48037, 53418}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                b((KeyEvent.getMaxKeyCode() >> 16) + 50459, new char[]{22607, 40285, 53885, 5899, 19509, 33224, 50924, 15301, 28823, 46520, 60232, 8311, 25863, 23064, 40757}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                if (objCopydefault2 == null) {
                    int i3 = 1000 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    int i4 = 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    char fadingEdgeLength = (char) (61685 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    byte b4 = (byte) 0;
                    Object[] objArr5 = new Object[1];
                    a(b4, (byte) $$b, b4, objArr5);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i3, i4, fadingEdgeLength, 1267259187, false, (String) objArr5[0], null);
                }
                if (j != ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                    try {
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2217, 45 - Color.green(0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), -2019038240, false, null, new Class[0]);
                        }
                        Object[] objArr6 = {null, ((Constructor) objCopydefault3).newInstance(null), -1462665604, 1};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                        if (objCopydefault4 == null) {
                            int doubleTapTimeout = 999 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int deadChar = KeyEvent.getDeadChar(0, 0) + 31;
                            char cRed = (char) (Color.red(0) + 61685);
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            Object[] objArr7 = new Object[1];
                            a(b5, b6, b6, objArr7);
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout, deadChar, cRed, 939672146, false, (String) objArr7[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault(Color.argb(0, 0, 0, 0) + 1030, Color.green(0) + 42, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (Class) ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1071, (ViewConfiguration.getPressedStateDuration() >> 16) + 43, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33531)), Integer.TYPE, Integer.TYPE});
                        }
                        objArr = (Object[]) ((Method) objCopydefault4).invoke(null, objArr6);
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                        if (objCopydefault5 == null) {
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1000;
                            int iArgb = 31 - Color.argb(0, 0, 0, 0);
                            char maximumDrawingCacheSize = (char) (61685 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                            byte b7 = (byte) 0;
                            byte b8 = (byte) (b7 + 3);
                            Object[] objArr8 = new Object[1];
                            a(b7, b8, (byte) (b8 - 3), objArr8);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iArgb, maximumDrawingCacheSize, 1267122354, false, (String) objArr8[0], null);
                        }
                        ((Field) objCopydefault5).set(null, objArr);
                        try {
                            Object[] objArr9 = new Object[1];
                            b((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42239, new char[]{22603, 64699, 4528, 46757, 52153, 24760, 34228, 56061, 32701, 38062, 10738, 20108, 58279, 14506, 23980, 62142, 6071, 44166, 49576, 26280, 48037, 53418}, objArr9);
                            Class<?> cls2 = Class.forName((String) objArr9[0]);
                            Object[] objArr10 = new Object[1];
                            b(50459 - Color.green(0), new char[]{22607, 40285, 53885, 5899, 19509, 33224, 50924, 15301, 28823, 46520, 60232, 8311, 25863, 23064, 40757}, objArr10);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                            if (objCopydefault6 == null) {
                                int gidForName = 998 - Process.getGidForName("");
                                int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 31;
                                char cIndexOf = (char) (61685 - TextUtils.indexOf("", "", 0, 0));
                                byte b9 = (byte) 0;
                                Object[] objArr11 = new Object[1];
                                a(b9, (byte) $$b, b9, objArr11);
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(gidForName, iResolveOpacity, cIndexOf, 1267259187, false, (String) objArr11[0], null);
                            }
                            ((Field) objCopydefault6).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                            if (objCopydefault7 == null) {
                                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 999;
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 31;
                                char gidForName2 = (char) (Process.getGidForName("") + 61686);
                                byte b10 = (byte) ($$b - 5);
                                byte b11 = (byte) (b10 | 10);
                                Object[] objArr12 = new Object[1];
                                a(b10, b11, (byte) (b11 & 5), objArr12);
                                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, iNormalizeMetaState, gidForName2, -1638177773, false, (String) objArr12[0], null);
                            }
                            ((Field) objCopydefault7).set(null, lValueOf2);
                            int i5 = component1 + 69;
                            component3 = i5 % 128;
                            int i6 = i5 % 2;
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
                } else {
                    int i7 = component3 + 25;
                    component1 = i7 % 128;
                    int i8 = i7 % 2;
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                    if (objCopydefault8 == null) {
                        int i9 = 999 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 31;
                        char size = (char) (View.MeasureSpec.getSize(0) + 61685);
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 + 3);
                        Object[] objArr13 = new Object[1];
                        a(b12, b13, (byte) (b13 - 3), objArr13);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(i9, iNormalizeMetaState2, size, 1267122354, false, (String) objArr13[0], null);
                    }
                    Object[] objArr14 = (Object[]) ((Field) objCopydefault8).get(null);
                    objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
                    int i10 = ((int[]) objArr14[2])[0];
                    int i11 = ((int[]) objArr14[1])[0];
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i12 = ((894631461 + (((~((-10103482) | iIdentityHashCode)) | (-739369913)) * (-948))) + ((~((~iIdentityHashCode) | (-1057465))) * (-948))) - 1448356076;
                    int i13 = (i12 << 13) ^ i12;
                    int i14 = i13 ^ (i13 >>> 17);
                    ((int[]) objArr[3])[0] = i14 ^ (i14 << 5);
                }
                int i15 = ((int[]) objArr[1])[0];
                int i16 = ((int[]) objArr[2])[0];
                if (i16 == i15) {
                    Object[] objArr15 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
                    int i17 = ((int[]) objArr[3])[0];
                    int i18 = ((int[]) objArr[2])[0];
                    int i19 = ((int[]) objArr[1])[0];
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i20 = (~((-642779703) | iIdentityHashCode2)) | 105906226;
                    int i21 = ~((~iIdentityHashCode2) | 643567167);
                    int i22 = i17 + (-1014207939) + ((i20 | i21) * (-470)) + (((~(iIdentityHashCode2 | (-536873477))) | i21) * 470);
                    int i23 = (i22 << 13) ^ i22;
                    int i24 = i23 ^ (i23 >>> 17);
                    ((int[]) objArr15[3])[0] = i24 ^ (i24 << 5);
                    Object[] objArr16 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
                    int i25 = ((int[]) objArr15[3])[0];
                    int i26 = ((int[]) objArr15[2])[0];
                    int i27 = ((int[]) objArr15[1])[0];
                    int i28 = i25 + ((((~((-301373803) | r0)) | 21137512) * (-283)) - 1858545303) + ((~(System.identityHashCode(this) | (-280236291))) * 283);
                    int i29 = (i28 << 13) ^ i28;
                    int i30 = i29 ^ (i29 >>> 17);
                    ((int[]) objArr16[3])[0] = i30 ^ (i30 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[0];
                    if (strArr != null) {
                        int i31 = component3 + 13;
                        component1 = i31 % 128;
                        for (int i32 = i31 % 2 == 0 ? 1 : 0; i32 < strArr.length; i32++) {
                            arrayList.add(strArr[i32]);
                        }
                    }
                    long j2 = -1;
                    long j3 = ((long) (i15 ^ i16)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                    long j4 = 0;
                    long j5 = j3 | (((long) 11) << 32) | (j4 - ((j4 >> 63) << 32));
                    Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault9 == null) {
                        objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6617, 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
                    Object[] objArr17 = {-64170473, Long.valueOf(j5), arrayList, null, false, false};
                    Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                    if (objCopydefault10 == null) {
                        objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 6563, 56 - TextUtils.indexOf("", ""), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                    }
                    ((Method) objCopydefault10).invoke(objInvoke, objArr17);
                    Object[] objArr18 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
                    int i33 = ((int[]) objArr[3])[0];
                    int i34 = ((int[]) objArr[2])[0];
                    int i35 = ((int[]) objArr[1])[0];
                    int iIdentityHashCode3 = System.identityHashCode(this);
                    int i36 = i33 + (-541468844) + ((~((-671318337) | iIdentityHashCode3)) * 623) + (((~iIdentityHashCode3) | 527373) * (-623)) + (((~(iIdentityHashCode3 | 39341215)) | (~((-710132179) | iIdentityHashCode3)) | 671318336) * 623);
                    int i37 = (i36 << 13) ^ i36;
                    int i38 = i37 ^ (i37 >>> 17);
                    ((int[]) objArr18[3])[0] = i38 ^ (i38 << 5);
                    int[] iArr = new int[i16];
                    int i39 = i16 - 1;
                    iArr[i39] = 1;
                    Toast.makeText((Context) null, iArr[((i16 * i39) % 2) - 1], 1).show();
                    Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
                    int i40 = ((int[]) objArr18[3])[0];
                    int i41 = ((int[]) objArr18[2])[0];
                    int i42 = ((int[]) objArr18[1])[0];
                    int iIdentityHashCode4 = System.identityHashCode(this);
                    int i43 = ~iIdentityHashCode4;
                    int i44 = i40 + 924825460 + (((~((-429110744) | i43)) | (~(463207903 | iIdentityHashCode4))) * (-831)) + ((~((-142845254) | iIdentityHashCode4)) * (-1662)) + (((~(iIdentityHashCode4 | 429110743)) | (~(i43 | (-320362651))) | (~(320362650 | iIdentityHashCode4))) * 831);
                    int i45 = (i44 << 13) ^ i44;
                    int i46 = i45 ^ (i45 >>> 17);
                    ((int[]) objArr19[3])[0] = i46 ^ (i46 << 5);
                }
                copydefault(scanQrResp);
            }

            public void copydefault(ScanQrResp scanQrResp) {
                int i2 = 2 % 2;
                int i3 = component1 + 111;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(scanQrResp);
                BasePwaViewModel.this.getScanLiveData().postValue(Resource.success(scanQrResp));
                int i5 = component1 + 107;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = component3 + 53;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onError(baseException);
                    BasePwaViewModel.this.getScanLiveData().postValue(Resource.error(baseException, null));
                    int i4 = 12 / 0;
                } else {
                    super.onError(baseException);
                    BasePwaViewModel.this.getScanLiveData().postValue(Resource.error(baseException, null));
                }
            }
        });
        int i2 = component1 + 65;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Deprecated
    public void getH5AccessToken(String str) {
        int i = 2 % 2;
        getH5AccessToken(new H5AccessTokenRequest(str));
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 30 / 0;
        }
    }

    public class AnonymousClass4 implements ApiCallback<GetH5AccessTokenResp> {
        public static int ShareDataUIState = 0;
        public static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;

        AnonymousClass4() {
        }

        @Override
        public void onSuccess(GetH5AccessTokenResp getH5AccessTokenResp) {
            int i = 2 % 2;
            int i2 = component3 + 91;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            copydefault(getH5AccessTokenResp);
            if (i3 != 0) {
                int i4 = 72 / 0;
            }
            int i5 = component2 + 19;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }

        public void copydefault(GetH5AccessTokenResp getH5AccessTokenResp) {
            int i = 2 % 2;
            int i2 = component2 + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            super.onSuccess(getH5AccessTokenResp);
            BasePwaViewModel.this.getGetTokenLiveData().postValue(Resource.success(getH5AccessTokenResp));
            int i4 = component3 + 115;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override
        public void onError(BaseException baseException) {
            int i = 2 % 2;
            int i2 = component2 + 65;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            super.onError(baseException);
            Object obj = null;
            BasePwaViewModel.this.getGetTokenLiveData().postValue(Resource.error(baseException, null));
            int i4 = component2 + 81;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        public static int component3() {
            int i = component1;
            int i2 = i % 8615550;
            component1 = i + 1;
            if (i2 != 0) {
                return ShareDataUIState;
            }
            int iMyPid = Process.myPid();
            ShareDataUIState = iMyPid;
            return iMyPid;
        }
    }

    public void getH5AccessToken(H5AccessTokenRequest h5AccessTokenRequest) {
        int i = 2 % 2;
        getGetTokenLiveData().postValue(Resource.loading(null));
        this.model.getH5AccessToken(h5AccessTokenRequest, new AnonymousClass4());
        int i2 = component1 + 61;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
