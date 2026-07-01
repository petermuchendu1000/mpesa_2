package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.baselib.model.BaseViewModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.ModifySecurityResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.model.ISecurityQuestionModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.ModifySecurityParams;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.register.data.QuerySecurityQuestionParams;
import com.huawei.http.BaseRequestParams;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import org.apache.commons.lang3.CharUtils;

public class BaseModifySecurityQuestionsViewModel<Model extends ISecurityQuestionModel> extends BaseViewModel<Model> {
    private final MutableLiveData<Resource<ModifySecurityResp>> component1;
    private final MutableLiveData<Resource<List<LocalQuestionItem>>> component3;
    private final MutableLiveData<Resource<List<LocalQuestionItem>>> copydefault;
    private static final byte[] $$c = {69, -38, -90, 81};
    private static final int $$d = 165;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {112, 44, -46, -27, -38, -10, -34, -4, Ascii.DLE, -46, -36, 2, -5, -5, -27, -50, 2, -36, -2, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_SYMLINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_LINK, -29, -15, -20, -16, -16, -8, -26, -23, TarHeader.LF_NORMAL};
    private static final int $$b = 206;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int ShareDataUIState = -890926584;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(byte r6, int r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.BaseModifySecurityQuestionsViewModel.$$c
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r6 = r6 * 3
            int r6 = 65 - r6
            int r7 = r7 * 3
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.BaseModifySecurityQuestionsViewModel.$$e(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 16
            int r6 = 99 - r6
            int r8 = r8 * 3
            int r8 = 36 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.BaseModifySecurityQuestionsViewModel.$$a
            int r7 = r7 * 6
            int r1 = r7 + 10
            byte[] r1 = new byte[r1]
            int r7 = r7 + 9
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L31
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L31:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-17)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel.BaseModifySecurityQuestionsViewModel.a(byte, int, short, java.lang.Object[]):void");
    }

    public MutableLiveData<Resource<List<LocalQuestionItem>>> getAllSecurityData() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 51;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<List<LocalQuestionItem>>> mutableLiveData = this.component3;
        int i5 = i2 + 57;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return mutableLiveData;
    }

    public MutableLiveData<Resource<List<LocalQuestionItem>>> getSecurityData() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<List<LocalQuestionItem>>> mutableLiveData = this.copydefault;
        int i5 = i2 + 1;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public MutableLiveData<Resource<ModifySecurityResp>> getModifyData() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 81;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableLiveData<Resource<ModifySecurityResp>> mutableLiveData = this.component1;
        int i5 = i2 + 65;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return mutableLiveData;
    }

    public BaseModifySecurityQuestionsViewModel(Model model) {
        super(model);
        this.component1 = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.component3 = new MutableLiveData<>();
    }

    private static void b(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (ViewConfiguration.getEdgeSlop() >> 16), KeyEvent.getDeadChar(0, 0) + 38, (char) (26860 - Color.alpha(0)), 2015799920, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7406, 17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            int i6 = $10 + 17;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 7406, 16 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) TextUtils.indexOf("", "", 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i8 = $11 + 31;
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public void changeSecurityQuestions(ModifySecurityParams modifySecurityParams) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = component4 + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getModifyData().postValue(Resource.loading(null));
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
        if (objCopydefault == null) {
            int i4 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 998;
            int iMyTid = (Process.myTid() >> 22) + 31;
            char cGreen = (char) (Color.green(0) + 61685);
            byte b2 = (byte) ($$a[11] - 1);
            byte b3 = b2;
            Object[] objArr2 = new Object[1];
            a(b2, b3, (byte) (b3 | 10), objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4, iMyTid, cGreen, -1638177773, false, (String) objArr2[0], null);
        }
        long j = ((Field) objCopydefault).getLong(null);
        Object[] objArr3 = new Object[1];
        b(AndroidCharacter.getMirror('0') - 26, Color.alpha(0) + 21, new char[]{11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534}, 243 - ((byte) KeyEvent.getModifierMetaStateMask()), false, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(15 - TextUtils.getCapsMode("", 0, 0), Color.rgb(0, 0, 0) + 16777225, new char[]{65533, 65515, 65534, 65530, 5, CharUtils.CR, 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, 248 - TextUtils.indexOf("", "", 0), false, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
        if (objCopydefault2 == null) {
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 999;
            int iKeyCodeFromString = 31 - KeyEvent.keyCodeFromString("");
            char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 61685);
            byte b4 = (byte) 0;
            byte b5 = b4;
            Object[] objArr5 = new Object[1];
            a(b4, b5, (byte) (b5 | 6), objArr5);
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(scrollDefaultDelay, iKeyCodeFromString, c2, 1267259187, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
            int i5 = component2 + 33;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
            if (objCopydefault3 == null) {
                int minimumFlingVelocity = 999 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int i7 = 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                char c3 = (char) (61686 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                byte b6 = (byte) 0;
                byte b7 = b6;
                Object[] objArr6 = new Object[1];
                a(b6, b7, (byte) (b7 + 3), objArr6);
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity, i7, c3, 1267122354, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
            objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i8 = ((int[]) objArr7[2])[0];
            int i9 = ((int[]) objArr7[1])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i10 = ~iIdentityHashCode;
            int i11 = 684790736 + (((~((-425569271) | i10)) | 135367044) * 98) + (((~(i10 | (-323904124))) | (-425569271) | (~(323904123 | iIdentityHashCode))) * (-49)) + (((~(iIdentityHashCode | (-425569271))) | (-459271168)) * 49) + 41807629;
            int i12 = (i11 << 13) ^ i11;
            int i13 = i12 ^ (i12 >>> 17);
            ((int[]) objArr[3])[0] = i13 ^ (i13 << 5);
            int i14 = component4 + 17;
            component2 = i14 % 128;
            int i15 = i14 % 2;
        } else {
            try {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 2217, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 45, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), -2019038240, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objCopydefault4).newInstance(null), 41807629, 1};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                if (objCopydefault5 == null) {
                    int i16 = 1000 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31;
                    char cLastIndexOf = (char) (61684 - TextUtils.lastIndexOf("", '0', 0, 0));
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    Object[] objArr9 = new Object[1];
                    a(b8, b9, b9, objArr9);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i16, maximumFlingVelocity, cLastIndexOf, 939672146, false, (String) objArr9[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault(1078 - AndroidCharacter.getMirror('0'), Color.blue(0) + 42, (char) Color.red(0)), (Class) ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1072, Drawable.resolveOpacity(0, 0) + 43, (char) (33531 - TextUtils.indexOf("", "", 0))), Integer.TYPE, Integer.TYPE});
                }
                objArr = (Object[]) ((Method) objCopydefault5).invoke(null, objArr8);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault6 == null) {
                    int iArgb = Color.argb(0, 0, 0, 0) + 999;
                    int i17 = 32 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                    char cRed = (char) (Color.red(0) + 61685);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr10 = new Object[1];
                    a(b10, b11, (byte) (b11 + 3), objArr10);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, i17, cRed, 1267122354, false, (String) objArr10[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 22, ExpandableListView.getPackedPositionChild(0L) + 22, new char[]{11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534}, 245 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), false, objArr11);
                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(TextUtils.lastIndexOf("", '0', 0, 0) + 16, 9 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{65533, 65515, 65534, 65530, 5, CharUtils.CR, 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534}, 248 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, objArr12);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                    if (objCopydefault7 == null) {
                        int mode = 999 - View.MeasureSpec.getMode(0);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 31;
                        char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 61686);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr13 = new Object[1];
                        a(b12, b13, (byte) (b13 | 6), objArr13);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(mode, pressedStateDuration, c4, 1267259187, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                    if (objCopydefault8 == null) {
                        int mode2 = 999 - View.MeasureSpec.getMode(0);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32;
                        char c5 = (char) (61684 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        byte b14 = (byte) ($$a[11] - 1);
                        byte b15 = b14;
                        Object[] objArr14 = new Object[1];
                        a(b14, b15, (byte) (b15 | 10), objArr14);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(mode2, iIndexOf, c5, -1638177773, false, (String) objArr14[0], null);
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
        int i18 = ((int[]) objArr[1])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 == i18) {
            Object[] objArr15 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i20 = ((int[]) objArr[3])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[1])[0];
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            int i23 = i20 + 60282855 + (((~(70846758 | startUptimeMillis)) | 68683814) * (-502)) + ((~((~startUptimeMillis) | 889003966)) * (-502)) + (((~(startUptimeMillis | (-820320153))) | 70846758) * 502);
            int i24 = (i23 << 13) ^ i23;
            int i25 = i24 ^ (i24 >>> 17);
            ((int[]) objArr15[3])[0] = i25 ^ (i25 << 5);
            Object[] objArr16 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i26 = ((int[]) objArr15[3])[0];
            int i27 = ((int[]) objArr15[2])[0];
            int i28 = ((int[]) objArr15[1])[0];
            int i29 = ~(((int) Runtime.getRuntime().freeMemory()) | (-22044455));
            int i30 = i26 + ((((-643034017) + (((-771517849) | i29) * (-220))) + ((i29 | 4646) * 220)) - 838716946);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr16[3])[0] = i32 ^ (i32 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[0];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            long j2 = -1;
            long j3 = ((long) (i18 ^ i19)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            long j4 = 0;
            long j5 = j3 | (((long) 11) << 32) | (j4 - ((j4 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6618 - Gravity.getAbsoluteGravity(0, 0), 41 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) Color.alpha(0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
            Object[] objArr17 = {-482532355, Long.valueOf(j5), arrayList, null, false, false};
            Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
            if (objCopydefault10 == null) {
                objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6561, 56 - Gravity.getAbsoluteGravity(0, 0), (char) (ViewConfiguration.getEdgeSlop() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
            }
            ((Method) objCopydefault10).invoke(objInvoke, objArr17);
            Object[] objArr18 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i33 = ((int[]) objArr[3])[0];
            int i34 = ((int[]) objArr[2])[0];
            int i35 = ((int[]) objArr[1])[0];
            int i36 = ~System.identityHashCode(this);
            int i37 = i33 + ((((-1456815123) + (((~((-67109415) | i36)) | 816582808) * (-828))) + ((i36 | (-67109415)) * (-828))) - 267980056);
            int i38 = (i37 << 13) ^ i37;
            int i39 = i38 ^ (i38 >>> 17);
            ((int[]) objArr18[3])[0] = i39 ^ (i39 << 5);
            int[] iArr = new int[i19];
            int i40 = i19 - 1;
            iArr[i40] = 1;
            Toast.makeText((Context) null, iArr[((i19 * i40) % 2) - 1], 1).show();
            Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
            int i41 = ((int[]) objArr18[3])[0];
            int i42 = ((int[]) objArr18[2])[0];
            int i43 = ((int[]) objArr18[1])[0];
            int i44 = i41 + ((((~(903100414 | r4)) | 8390208) * 449) - 724805584) + (((~((~System.identityHashCode(this)) | 903100414)) | 8390208) * 449);
            int i45 = (i44 << 13) ^ i44;
            int i46 = i45 ^ (i45 >>> 17);
            ((int[]) objArr19[3])[0] = i46 ^ (i46 << 5);
        }
        ((ISecurityQuestionModel) this.model).changeSecurityQuestions(modifySecurityParams, new ApiCallback<ModifySecurityResp>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onSuccess(ModifySecurityResp modifySecurityResp) {
                int i47 = 2 % 2;
                int i48 = component1 + 111;
                component2 = i48 % 128;
                int i49 = i48 % 2;
                copydefault(modifySecurityResp);
                if (i49 != 0) {
                    int i50 = 1 / 0;
                }
                int i51 = component1 + 7;
                component2 = i51 % 128;
                int i52 = i51 % 2;
            }

            public void copydefault(ModifySecurityResp modifySecurityResp) {
                int i47 = 2 % 2;
                int i48 = component2 + 85;
                component1 = i48 % 128;
                if (i48 % 2 != 0) {
                    super.onSuccess(modifySecurityResp);
                    BaseModifySecurityQuestionsViewModel.this.getModifyData().postValue(Resource.success(modifySecurityResp));
                } else {
                    super.onSuccess(modifySecurityResp);
                    BaseModifySecurityQuestionsViewModel.this.getModifyData().postValue(Resource.success(modifySecurityResp));
                    throw null;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i47 = 2 % 2;
                int i48 = component2 + 95;
                component1 = i48 % 128;
                int i49 = i48 % 2;
                super.onError(baseException);
                BaseModifySecurityQuestionsViewModel.this.getModifyData().postValue(Resource.error(baseException, null));
                int i50 = component1 + 77;
                component2 = i50 % 128;
                if (i50 % 2 != 0) {
                    int i51 = 44 / 0;
                }
            }
        });
        int i47 = component4 + 17;
        component2 = i47 % 128;
        if (i47 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void getSecurityQuestion(BaseRequestParams baseRequestParams) {
        int i = 2 % 2;
        getSecurityData().postValue(Resource.loading(null));
        ((ISecurityQuestionModel) this.model).getQuestions(baseRequestParams, new ApiCallback<List<LocalQuestionItem>>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(List<LocalQuestionItem> list) {
                int i2 = 2 % 2;
                int i3 = copydefault + 55;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                copydefault(list);
                int i5 = component3 + 65;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            public void copydefault(List<LocalQuestionItem> list) {
                int i2 = 2 % 2;
                int i3 = component3 + 55;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    super.onSuccess(list);
                    BaseModifySecurityQuestionsViewModel.this.getSecurityData().postValue(Resource.success(list));
                    int i4 = 17 / 0;
                } else {
                    super.onSuccess(list);
                    BaseModifySecurityQuestionsViewModel.this.getSecurityData().postValue(Resource.success(list));
                }
                int i5 = component3 + 79;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = copydefault + 83;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseModifySecurityQuestionsViewModel.this.getSecurityData().postValue(Resource.error(baseException, null));
                int i5 = component3 + 41;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        });
        int i2 = component2 + 39;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
    }

    public void queryAllQuestionList(QuerySecurityQuestionParams querySecurityQuestionParams) {
        int i = 2 % 2;
        Object obj = null;
        getAllSecurityData().postValue(Resource.loading(null));
        ((ISecurityQuestionModel) this.model).queryList(querySecurityQuestionParams, new ApiCallback<List<LocalQuestionItem>>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public void onSuccess(List<LocalQuestionItem> list) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 13;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                component1(list);
                if (i4 == 0) {
                    throw null;
                }
            }

            public void component1(List<LocalQuestionItem> list) {
                int i2 = 2 % 2;
                int i3 = copydefault + 91;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                super.onSuccess(list);
                BaseModifySecurityQuestionsViewModel.this.getAllSecurityData().postValue(Resource.success(list));
                int i5 = ShareDataUIState + 71;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 45 / 0;
                }
            }

            @Override
            public void onError(BaseException baseException) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 125;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                super.onError(baseException);
                BaseModifySecurityQuestionsViewModel.this.getAllSecurityData().postValue(Resource.error(baseException, null));
                int i5 = copydefault + 65;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = component2 + 63;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
