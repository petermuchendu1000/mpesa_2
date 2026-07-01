package com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityMyRequestsBinding;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.viewmodel.RequestMoneyOrderViewModel;
import com.huawei.digitalpayment.consumer.sfcui.ui.adapter.TabViewAdapter;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000f\u001a\u00020\nH\u0014J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0014J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0006\u0010\u0016\u001a\u00020\u0011J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0006\u0010\u001c\u001a\u00020\u0011J\u0016\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/ui/activity/MyRequestsActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityMyRequestsBinding;", "Lcom/huawei/digitalpayment/consumer/sfcui/requestmoney/viewmodel/RequestMoneyOrderViewModel;", "<init>", "()V", "titles", "", "", "currentPosition", "", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "getLayoutId", "initToolbar", "", "title", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "initView", "updateTabView", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "selected", "", "initObserver", "updateTitleCount", "count", "pos", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class MyRequestsActivity extends Hilt_MyRequestsActivity<ActivityMyRequestsBinding, RequestMoneyOrderViewModel> {
    public static final int $stable = 8;
    private static int component1;
    private static long component3;
    private static int getAsAtTimestamp;
    private int currentPosition;
    private List<String> titles = new ArrayList();
    private static final byte[] $$l = {TarHeader.LF_NORMAL, 86, 58, 71};
    private static final int $$o = 172;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {62, TarHeader.LF_FIFO, 60, 44, -11, 3, SignedBytes.MAX_POWER_OF_TWO, -56, -7, 1, 9, -4, 8, 56, -55, -2, -8, Ascii.SO, 4, 2, -17, Ascii.SI, 56, PSSSigner.TRAILER_IMPLICIT, Ascii.SI, -13, 1, Ascii.VT, -5, 2, -4, 70, -53, 4, -5, 1, 3, -12, 69, -58, -4, -5, Ascii.DLE, -12, 5, Ascii.SO, -10, 63, -33, -33, Ascii.SO, 3, -11, 2, Ascii.VT, -4, -10, Ascii.FF, -5, 2, -4, -20, 8, -16, Ascii.SO, 34, -28, -18, 20, 13, 13, -9, -32, 20, -18, Ascii.DLE, -11, 3, -2, 2, 2, 10, -8, -5, 66, -11, 3, SignedBytes.MAX_POWER_OF_TWO, -69, 19, -18, 7, 2, 0, 3, -1, 66, -71, Ascii.SO, 5, -17, 8, Ascii.DLE, -5, 3, -12, Ascii.SI, -10, -4, 2, Ascii.VT, -4, Ascii.VT, -4, 7, 3, -18, 6, -2, 69, -35, 47, -71, Ascii.FF, -23, Ascii.VT, -5, 2, -11, 0, -8, Ascii.SYN, 0, 0, 6, -19, 10, -7};
    private static final int $$t = 186;
    private static final byte[] $$d = {112, 44, -46, -27, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 47;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Observer, FunctionAdapter {
        private static int component1 = 0;
        private static int copydefault = 1;
        private final Function1 component2;

        component1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component2 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 47;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            if (!(!(obj instanceof Observer))) {
                int i5 = i3 + 77;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                if (obj instanceof FunctionAdapter) {
                    boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    int i7 = component1 + 109;
                    copydefault = i7 % 128;
                    if (i7 % 2 != 0) {
                        return zAreEqual;
                    }
                    int i8 = 4 % 3;
                    return zAreEqual;
                }
            }
            return false;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 99;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.component2;
            int i5 = i2 + 3;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 13;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component1 + 59;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 81;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                this.component2.invoke(obj);
                throw null;
            }
            this.component2.invoke(obj);
            int i3 = copydefault + 17;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    private static String $$r(short s, int i, int i2) {
        int i3 = s * 3;
        int i4 = 103 - (i2 * 38);
        byte[] bArr = $$l;
        int i5 = 4 - (i * 4);
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5++;
            i4 = i5 + i3;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i4;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            byte b2 = bArr[i5];
            i5++;
            i4 += b2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 100 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.MyRequestsActivity.$$d
            int r1 = 28 - r8
            int r6 = r6 * 2
            int r6 = r6 + 83
            byte[] r1 = new byte[r1]
            int r8 = 27 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            int r6 = r6 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.MyRequestsActivity.h(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.MyRequestsActivity.$$s
            int r1 = 58 - r7
            int r8 = 127 - r8
            int r6 = r6 * 16
            int r6 = 99 - r6
            byte[] r1 = new byte[r1]
            int r7 = 57 - r7
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.MyRequestsActivity.i(int, int, short, java.lang.Object[]):void");
    }

    public static final void access$updateTabView(MyRequestsActivity myRequestsActivity, TabLayout.Tab tab, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        myRequestsActivity.updateTabView(tab, z);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
    }

    public final int getCurrentPosition() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.currentPosition;
        int i5 = i3 + 75;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final void setCurrentPosition(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 101;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        this.currentPosition = i;
        int i6 = i3 + 3;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component3 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 1;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (KeyEvent.getMaxKeyCode() >> 16), 34 - (Process.myTid() >> 22), (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 1390, 18 - (Process.myTid() >> 22), (char) (51268 - MotionEvent.axisFromString("")), -1883291598, false, $$r(b2, b3, b3), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 27;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void g(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr3 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr3[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i5]), Integer.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 3784, 38 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (26860 - KeyEvent.normalizeMetaState(0)), 2015799920, false, $$r(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getFadingEdgeLength() >> 16) + 7406, 16 - TextUtils.getOffsetBefore("", 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i6 = $11 + 11;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr4 = new char[i2];
            System.arraycopy(cArr3, 0, cArr4, 0, i2);
            System.arraycopy(cArr4, 0, cArr3, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr4, iTrustedWebActivityServiceStub.component1, cArr3, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            int i8 = $10 + 125;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2 = new char[i2];
                iTrustedWebActivityServiceStub.ShareDataUIState = 1;
            } else {
                cArr2 = new char[i2];
                iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            }
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr3[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 7406, ImageFormat.getBitsPerPixel(0) + 17, (char) (MotionEvent.axisFromString("") + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i9 = $10 + 123;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    @Override
    public int getLayoutId() throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 66, 33 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (Color.argb(0, 0, 0, 0) + 19696), 518907119, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(36 - MotionEvent.axisFromString(""), 29 - ExpandableListView.getPackedPositionChild(0L), (char) Gravity.getAbsoluteGravity(0, 0), 55511118, false, "component2", null);
        }
        int i5 = ((Field) objCopydefault2).getInt(null);
        long j = i5;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 30 - KeyEvent.getDeadChar(0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 58536393, false, "component3", null);
        }
        int i6 = ((Field) objCopydefault3).getInt(null);
        long j2 = -344;
        long j3 = (j2 * 2509001417143133353L) + (j2 * (-1716297963498928929L));
        long j4 = 345;
        long j5 = -1;
        long j6 = j5 ^ 2509001417143133353L;
        long j7 = j5 ^ (-1716297963498928929L);
        long j8 = j6 | j7;
        long jCodePointAt = ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952856_res_0x7f1304d8).substring(9, 10).codePointAt(0) + 1446699903;
        long j9 = j3 + (((j8 ^ j5) | ((j6 | jCodePointAt) ^ j5)) * j4) + ((((j6 | (jCodePointAt ^ j5)) ^ j5) | ((j7 | 2509001417143133353L) ^ j5)) * j4) + (j4 * (j5 ^ (j8 | jCodePointAt)));
        int i7 = 0;
        while (true) {
            for (int i8 = 0; i8 != 8; i8++) {
                int i9 = component2 + 101;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
                i6 = (((((int) (j >> i8)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
            }
            if (i7 != 0) {
                break;
            }
            int i11 = component2 + 121;
            copydefault = i11 % 128;
            int i12 = i11 % 2;
            i7++;
            j = j9;
        }
        if (i6 != i4) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - View.resolveSize(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32, (char) (Color.argb(0, 0, 0, 0) + 19696), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j10 = -1;
            long j11 = ((long) (i5 ^ i4)) & ((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32)));
            long j12 = 0;
            long j13 = j11 | (((long) 1) << 32) | (j12 - ((j12 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 42, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {1977416601, Long.valueOf(j13), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 6562, (ViewConfiguration.getScrollBarSize() >> 8) + 56, (char) (KeyEvent.getMaxKeyCode() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return com.huawei.digitalpayment.consumer.sfc.R.layout.activity_my_requests;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = component2 + 43;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(com.huawei.digitalpayment.consumer.sfc.R.string.my_requests));
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0068  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.MyRequestsActivity.onCreate(android.os.Bundle):void");
    }

    private static final void initView$lambda$0(MyRequestsActivity myRequestsActivity, TabLayout.Tab tab, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(myRequestsActivity, "");
        View viewInflate = LayoutInflater.from(myRequestsActivity).inflate(com.huawei.digitalpayment.consumer.sfc.R.layout.custom_tab, (ViewGroup) null);
        ((RoundTextView) viewInflate.findViewById(com.huawei.digitalpayment.consumer.sfc.R.id.tv_title)).setText(myRequestsActivity.titles.get(i));
        if (tab != null) {
            tab.setCustomView(viewInflate);
            int i5 = component2 + 105;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public final void initView() {
        int i = 2 % 2;
        List<String> list = this.titles;
        String string = getString(com.huawei.digitalpayment.consumer.sfc.R.string.my_requests_sent);
        Intrinsics.checkNotNullExpressionValue(string, "");
        list.add(string);
        List<String> list2 = this.titles;
        String string2 = getString(com.huawei.digitalpayment.consumer.sfc.R.string.my_requests_received);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        list2.add(string2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(RequestMoneyRecordFragment.INSTANCE.newInstance(RequestMoneyRecordFragment.MY_REQUEST_SENT));
        arrayList.add(RequestMoneyRecordFragment.INSTANCE.newInstance(RequestMoneyRecordFragment.MY_REQUEST_RECEIVED));
        ((ActivityMyRequestsBinding) this.binding).viewPager.setAdapter(new TabViewAdapter(this, arrayList));
        ((ActivityMyRequestsBinding) this.binding).viewPager.setOffscreenPageLimit(2);
        ((ActivityMyRequestsBinding) this.binding).viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onPageSelected(int position) {
                int i2 = 2 % 2;
                int i3 = component1 + 37;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    MyRequestsActivity.this.setCurrentPosition(position);
                    throw null;
                }
                MyRequestsActivity.this.setCurrentPosition(position);
                int i4 = component1 + 73;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 61 / 0;
                }
            }
        });
        new TabLayoutMediator(((ActivityMyRequestsBinding) this.binding).tabLayout, ((ActivityMyRequestsBinding) this.binding).viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final void onConfigureTab(TabLayout.Tab tab, int i2) {
                int i3 = 2 % 2;
                int i4 = component2 + 3;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                MyRequestsActivity.m11841$r8$lambda$HkvXLswSqaNodmzKxDhLO0QOI(this.f$0, tab, i2);
                int i6 = ShareDataUIState + 97;
                component2 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 84 / 0;
                }
            }
        }).attach();
        ((ActivityMyRequestsBinding) this.binding).tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int i2 = 2 % 2;
                int i3 = component1 + 123;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(tab, "");
                MyRequestsActivity.access$updateTabView(MyRequestsActivity.this, tab, true);
                int i5 = component1 + 21;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int i2 = 2 % 2;
                int i3 = component1 + 99;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(tab, "");
                MyRequestsActivity.access$updateTabView(MyRequestsActivity.this, tab, false);
                int i5 = component1 + 45;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                int i2 = 2 % 2;
                int i3 = component1 + 39;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        TabLayout.Tab tabAt = ((ActivityMyRequestsBinding) this.binding).tabLayout.getTabAt(0);
        Intrinsics.checkNotNull(tabAt);
        updateTabView(tabAt, true);
        int i2 = copydefault + 119;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void updateTabView(TabLayout.Tab tab, boolean selected) {
        RoundTextView roundTextView;
        int i = 2 % 2;
        View customView = tab.getCustomView();
        if (customView != null) {
            int i2 = copydefault + 37;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            roundTextView = (RoundTextView) customView.findViewById(com.huawei.digitalpayment.consumer.sfc.R.id.tv_title);
        } else {
            roundTextView = null;
        }
        if (!selected) {
            if (roundTextView != null) {
                roundTextView.setBackgroundColor(getColor(com.huawei.digitalpayment.consumer.sfc.R.color.color_component_background));
            }
            if (roundTextView != null) {
                int i4 = component2 + 81;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                roundTextView.setTextColor(getColor(com.huawei.digitalpayment.consumer.sfc.R.color.color_on_background));
                return;
            }
            return;
        }
        if (roundTextView != null) {
            int i6 = copydefault + 25;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            roundTextView.setBackgroundColor(getColor(com.huawei.digitalpayment.consumer.sfc.R.color.color_primary));
            int i8 = copydefault + 21;
            component2 = i8 % 128;
            int i9 = i8 % 2;
        }
        if (roundTextView != null) {
            roundTextView.setTextColor(getColor(com.huawei.digitalpayment.consumer.sfc.R.color.color_on_primary));
        }
    }

    private static final Unit initObserver$lambda$1(MyRequestsActivity myRequestsActivity, Integer num) {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(myRequestsActivity, "");
        } else {
            Intrinsics.checkNotNullParameter(myRequestsActivity, "");
        }
        Intrinsics.checkNotNull(num);
        myRequestsActivity.updateTitleCount(num.intValue(), 0);
        Unit unit = Unit.INSTANCE;
        int i3 = copydefault + 39;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public final void initObserver() {
        int i = 2 % 2;
        MyRequestsActivity myRequestsActivity = this;
        ((RequestMoneyOrderViewModel) this.viewModel).senderAllCount().observe(myRequestsActivity, new component1(new Function1() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 17;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                MyRequestsActivity myRequestsActivity2 = this.f$0;
                Integer num = (Integer) obj;
                if (i4 == 0) {
                    return MyRequestsActivity.$r8$lambda$zDavrm6X5uycDF7uErT6LUaF91c(myRequestsActivity2, num);
                }
                Unit unit$r8$lambda$zDavrm6X5uycDF7uErT6LUaF91c = MyRequestsActivity.$r8$lambda$zDavrm6X5uycDF7uErT6LUaF91c(myRequestsActivity2, num);
                int i5 = 63 / 0;
                return unit$r8$lambda$zDavrm6X5uycDF7uErT6LUaF91c;
            }
        }));
        ((RequestMoneyOrderViewModel) this.viewModel).receiverAllCount().observe(myRequestsActivity, new component1(new Function1() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 25;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$IVlpOotc9B6MLlGSWb2NBvo6DJQ = MyRequestsActivity.$r8$lambda$IVlpOotc9B6MLlGSWb2NBvo6DJQ(this.f$0, (Integer) obj);
                int i5 = copydefault + 47;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return unit$r8$lambda$IVlpOotc9B6MLlGSWb2NBvo6DJQ;
            }
        }));
        int i2 = copydefault + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit initObserver$lambda$2(MyRequestsActivity myRequestsActivity, Integer num) {
        int iIntValue;
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 33;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(myRequestsActivity, "");
            Intrinsics.checkNotNull(num);
            iIntValue = num.intValue();
            i = 0;
        } else {
            Intrinsics.checkNotNullParameter(myRequestsActivity, "");
            Intrinsics.checkNotNull(num);
            iIntValue = num.intValue();
            i = 1;
        }
        myRequestsActivity.updateTitleCount(iIntValue, i);
        Unit unit = Unit.INSTANCE;
        int i4 = copydefault + 113;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void updateTitleCount(int count, int pos) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (((ActivityMyRequestsBinding) this.binding).tabLayout.getTabCount() < 2) {
            return;
        }
        TabLayout.Tab tabAt = ((ActivityMyRequestsBinding) this.binding).tabLayout.getTabAt(pos);
        Intrinsics.checkNotNull(tabAt);
        View customView = tabAt.getCustomView();
        Intrinsics.checkNotNull(customView);
        RoundTextView roundTextView = (RoundTextView) customView.findViewById(com.huawei.digitalpayment.consumer.sfc.R.id.tv_title);
        if (count == 0) {
            roundTextView.setText(this.titles.get(pos));
            int i4 = copydefault + 33;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        roundTextView.setText(((Object) this.titles.get(pos)) + " (" + count + ")");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.MyRequestsActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{44372, 62935, 44341, 51560, 41453, 19465, 24996, 45191, 64619, 20506, 12532, 619, 3989, 851, 33360, 54203, 24293, 48624, 21892, 48268, 59490, 27690, 9460, 3660, 15248, 8027, 63010, 57312, 19157, 51591}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(new char[]{11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535, 5, 4, 65529}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 17, false, (ViewConfiguration.getTouchSlop() >> 8) + 18, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if (!(!(baseContext instanceof ContextWrapper)) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i3 = component2 + 87;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i5 = copydefault + 71;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 42 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 56, (char) Color.argb(0, 0, 0, 0), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
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

    /* JADX WARN: Can't wrap try/catch for region: R(27:681|(2:683|(1:689)(1:688))|(22:691|692|1007|693|694|986|695|(2:926|697)|701|702|972|703|(2:984|705)|709|710|711|(2:966|713)|714|(2:716|717)(1:719)|720|(2:722|723)|724)(15:776|794|(1:796)|797|(3:799|(1:801)|802)(13:804|1005|805|806|(1:808)|809|924|810|811|(1:813)|814|(1:816)|817)|803|818|(6:821|822|(1:824)|825|826|827)|828|(1:830)|831|(3:833|(1:835)|836)(14:838|839|(1:841)|842|843|(1:845)|846|940|847|848|(1:850)|851|(1:853)|854)|837|855|(1:1068)(7:858|859|(1:861)|862|863|864|865))|782|783|1015|784|787|788|(1:790)|791|792|793|794|(0)|797|(0)(0)|803|818|(0)|828|(0)|831|(0)(0)|837|855|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(62:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|965|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|946|32|(3:34|910|35)|39|40|939|(5:42|43|(1:45)|46|47)(25:48|49|944|50|51|918|52|(2:1031|54)|58|59|912|60|(2:904|62)|66|67|68|(2:1025|70)|74|75|906|76|(2:1048|78)(1:80)|81|(2:83|84)|85)|86|(5:89|90|(2:92|1066)(11:93|(3:95|(3:98|99|96)|1067)|102|1043|103|(1:105)|106|107|1036|108|1065)|109|87)|1064|121|154|980|155|(2:1045|157)|161|162|949|(5:164|165|(1:167)|168|169)(17:171|172|959|173|(2:1034|175)|179|180|181|(2:183|184)|185|186|954|187|(3:189|190|191)(1:192)|193|(1:195)|196)|170|197|(9:200|937|201|(1:203)|204|205|206|922|207)|208|(1:1033)|(2:246|(24:248|(2:250|(3:252|(2:254|259)|258)(3:255|(2:257|259)|258))(1:259)|297|1023|298|(14:933|300|305|(5:931|307|308|928|309)(1:314)|1019|315|316|948|(5:318|319|(1:321)|322|323)(12:(2:327|(3:329|(3:331|334|(1:336)(1:337))|338)(2:332|(2:334|(0)(0))(1:338)))(1:340)|(27:342|343|1000|344|345|956|346|982|347|(3:349|914|350)|354|355|970|356|(2:974|358)|362|363|364|(3:366|968|367)|368|369|961|370|(4:916|372|373|374)(1:378)|379|(1:381)|382)(2:438|439)|445|446|976|447|450|451|(1:453)|454|455|456)|383|(4:386|(2:388|1052)(11:389|(3:391|(3:394|395|392)|1053)|398|935|399|(1:401)|402|403|920|404|1051)|405|384)|1050|419|439)(12:305|(0)(0)|1019|315|316|948|(0)(0)|383|(1:384)|1050|419|439)|457|1039|458|(2:1041|460)|464|465|1038|(4:467|468|(1:470)|471)(22:473|474|1029|475|(2:992|477)|481|482|1013|483|(3:485|1011|486)|490|491|492|(2:494|495)|496|497|1009|498|(4:950|500|501|502)(1:506)|507|(2:509|510)|511)|512|(4:516|(2:518|1056)(11:519|(3:521|(3:524|525|522)|1057)|526|994|527|(1:529)|530|531|978|532|1055)|533|513)|1054|515|575|(1:577)|578|(3:580|(1:582)|583)(14:584|585|(1:587)|588|589|(1:591)|592|929|593|594|(1:596)(1:597)|598|(1:600)|601)|602|(37:604|(1:606)|607|(1:609)(1:610)|611|(3:613|(1:615)|616)(16:618|619|(1:621)|622|(1:624)|625|626|(1:628)|629|908|630|631|(1:633)|634|(1:636)|637)|617|638|(1:640)(9:641|(3:643|(2:646|644)|1062)|647|648|(1:650)|651|(1:653)|654|655)|656|1021|657|(5:963|659|660|958|661)(1:668)|1017|669|(1:671)|672|673|1002|(5:675|676|(1:678)|679|680)(27:681|(2:683|(1:689)(1:688))|(22:691|692|1007|693|694|986|695|(2:926|697)|701|702|972|703|(2:984|705)|709|710|711|(2:966|713)|714|(2:716|717)(1:719)|720|(2:722|723)|724)(15:776|794|(1:796)|797|(3:799|(1:801)|802)(13:804|1005|805|806|(1:808)|809|924|810|811|(1:813)|814|(1:816)|817)|803|818|(6:821|822|(1:824)|825|826|827)|828|(1:830)|831|(3:833|(1:835)|836)(14:838|839|(1:841)|842|843|(1:845)|846|940|847|848|(1:850)|851|(1:853)|854)|837|855|(1:1068)(7:858|859|(1:861)|862|863|864|865))|782|783|1015|784|787|788|(1:790)|791|792|793|794|(0)|797|(0)(0)|803|818|(0)|828|(0)|831|(0)(0)|837|855|(0)(0))|725|(5:728|729|(2:731|1060)(11:732|(3:734|(3:737|738|735)|1061)|741|952|742|(1:744)|745|746|942|747|1059)|748|726)|1058|794|(0)|797|(0)(0)|803|818|(0)|828|(0)|831|(0)(0)|837|855|(0)(0))(10:877|(3:879|(2:882|880)|1063)|883|884|(1:886)|887|(1:889)|890|891|892))(2:262|263))(1:264)|265|1003|266|(1:268)|269|988|270|(1:272)|273|274|297|1023|298|(0)(0)|457|1039|458|(0)|464|465|1038|(0)(0)|512|(1:513)|1054|515|575|(0)|578|(0)(0)|602|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(62:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|965|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|946|32|(3:34|910|35)|39|40|939|(5:42|43|(1:45)|46|47)(25:48|49|944|50|51|918|52|(2:1031|54)|58|59|912|60|(2:904|62)|66|67|68|(2:1025|70)|74|75|906|76|(2:1048|78)(1:80)|81|(2:83|84)|85)|86|(5:89|90|(2:92|1066)(11:93|(3:95|(3:98|99|96)|1067)|102|1043|103|(1:105)|106|107|1036|108|1065)|109|87)|1064|121|154|980|155|(2:1045|157)|161|162|949|(5:164|165|(1:167)|168|169)(17:171|172|959|173|(2:1034|175)|179|180|181|(2:183|184)|185|186|954|187|(3:189|190|191)(1:192)|193|(1:195)|196)|170|197|(9:200|937|201|(1:203)|204|205|206|922|207)|208|1033|(2:246|(24:248|(2:250|(3:252|(2:254|259)|258)(3:255|(2:257|259)|258))(1:259)|297|1023|298|(14:933|300|305|(5:931|307|308|928|309)(1:314)|1019|315|316|948|(5:318|319|(1:321)|322|323)(12:(2:327|(3:329|(3:331|334|(1:336)(1:337))|338)(2:332|(2:334|(0)(0))(1:338)))(1:340)|(27:342|343|1000|344|345|956|346|982|347|(3:349|914|350)|354|355|970|356|(2:974|358)|362|363|364|(3:366|968|367)|368|369|961|370|(4:916|372|373|374)(1:378)|379|(1:381)|382)(2:438|439)|445|446|976|447|450|451|(1:453)|454|455|456)|383|(4:386|(2:388|1052)(11:389|(3:391|(3:394|395|392)|1053)|398|935|399|(1:401)|402|403|920|404|1051)|405|384)|1050|419|439)(12:305|(0)(0)|1019|315|316|948|(0)(0)|383|(1:384)|1050|419|439)|457|1039|458|(2:1041|460)|464|465|1038|(4:467|468|(1:470)|471)(22:473|474|1029|475|(2:992|477)|481|482|1013|483|(3:485|1011|486)|490|491|492|(2:494|495)|496|497|1009|498|(4:950|500|501|502)(1:506)|507|(2:509|510)|511)|512|(4:516|(2:518|1056)(11:519|(3:521|(3:524|525|522)|1057)|526|994|527|(1:529)|530|531|978|532|1055)|533|513)|1054|515|575|(1:577)|578|(3:580|(1:582)|583)(14:584|585|(1:587)|588|589|(1:591)|592|929|593|594|(1:596)(1:597)|598|(1:600)|601)|602|(37:604|(1:606)|607|(1:609)(1:610)|611|(3:613|(1:615)|616)(16:618|619|(1:621)|622|(1:624)|625|626|(1:628)|629|908|630|631|(1:633)|634|(1:636)|637)|617|638|(1:640)(9:641|(3:643|(2:646|644)|1062)|647|648|(1:650)|651|(1:653)|654|655)|656|1021|657|(5:963|659|660|958|661)(1:668)|1017|669|(1:671)|672|673|1002|(5:675|676|(1:678)|679|680)(27:681|(2:683|(1:689)(1:688))|(22:691|692|1007|693|694|986|695|(2:926|697)|701|702|972|703|(2:984|705)|709|710|711|(2:966|713)|714|(2:716|717)(1:719)|720|(2:722|723)|724)(15:776|794|(1:796)|797|(3:799|(1:801)|802)(13:804|1005|805|806|(1:808)|809|924|810|811|(1:813)|814|(1:816)|817)|803|818|(6:821|822|(1:824)|825|826|827)|828|(1:830)|831|(3:833|(1:835)|836)(14:838|839|(1:841)|842|843|(1:845)|846|940|847|848|(1:850)|851|(1:853)|854)|837|855|(1:1068)(7:858|859|(1:861)|862|863|864|865))|782|783|1015|784|787|788|(1:790)|791|792|793|794|(0)|797|(0)(0)|803|818|(0)|828|(0)|831|(0)(0)|837|855|(0)(0))|725|(5:728|729|(2:731|1060)(11:732|(3:734|(3:737|738|735)|1061)|741|952|742|(1:744)|745|746|942|747|1059)|748|726)|1058|794|(0)|797|(0)(0)|803|818|(0)|828|(0)|831|(0)(0)|837|855|(0)(0))(10:877|(3:879|(2:882|880)|1063)|883|884|(1:886)|887|(1:889)|890|891|892))(2:262|263))(1:264)|265|1003|266|(1:268)|269|988|270|(1:272)|273|274|297|1023|298|(0)(0)|457|1039|458|(0)|464|465|1038|(0)(0)|512|(1:513)|1054|515|575|(0)|578|(0)(0)|602|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x1778, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x1779, code lost:
    
        r15 = com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD;
        r42 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x1d0b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x1d0d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x2e73, code lost:
    
        r1 = java.lang.String.valueOf(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1041:0x18ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1045:0x0a52 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1068:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x099e A[Catch: all -> 0x044f, TryCatch #33 {all -> 0x044f, blocks: (B:148:0x0998, B:150:0x099e, B:151:0x09c7, B:451:0x180e, B:453:0x1814, B:454:0x183f, B:788:0x2ea2, B:790:0x2ea8, B:791:0x2ed2, B:822:0x31d4, B:824:0x31da, B:825:0x3209, B:859:0x3533, B:861:0x3539, B:862:0x355e, B:839:0x335b, B:841:0x337e, B:842:0x33d9, B:648:0x273a, B:650:0x2740, B:651:0x276e, B:653:0x27a8, B:654:0x27f4, B:619:0x23e0, B:621:0x23f5, B:622:0x2428, B:624:0x245c, B:625:0x24db, B:884:0x363d, B:886:0x3643, B:887:0x366c, B:889:0x36a6, B:890:0x36e9, B:585:0x1fba, B:587:0x1fcf, B:588:0x1fff, B:569:0x1dcc, B:571:0x1dd2, B:572:0x1dfe, B:291:0x1133, B:293:0x1139, B:294:0x1163, B:238:0x0e99, B:240:0x0e9f, B:241:0x0ec6, B:19:0x01f0, B:21:0x01f6, B:22:0x0228, B:24:0x03b8, B:26:0x03ea, B:27:0x0449, B:248:0x0f57, B:252:0x0f65, B:277:0x1062, B:279:0x1068, B:280:0x1069, B:282:0x106b, B:284:0x1072, B:285:0x1073, B:255:0x0f73, B:259:0x0f7f, B:262:0x0f88, B:263:0x0f8b), top: B:965:0x01f0, inners: #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0b08 A[Catch: all -> 0x0ddb, TRY_ENTER, TRY_LEAVE, TryCatch #41 {all -> 0x0ddb, blocks: (B:155:0x0a4c, B:161:0x0a9f, B:171:0x0b08, B:181:0x0b99, B:185:0x0be3), top: B:980:0x0a4c }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0cd6  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0e9f A[Catch: all -> 0x044f, TryCatch #33 {all -> 0x044f, blocks: (B:148:0x0998, B:150:0x099e, B:151:0x09c7, B:451:0x180e, B:453:0x1814, B:454:0x183f, B:788:0x2ea2, B:790:0x2ea8, B:791:0x2ed2, B:822:0x31d4, B:824:0x31da, B:825:0x3209, B:859:0x3533, B:861:0x3539, B:862:0x355e, B:839:0x335b, B:841:0x337e, B:842:0x33d9, B:648:0x273a, B:650:0x2740, B:651:0x276e, B:653:0x27a8, B:654:0x27f4, B:619:0x23e0, B:621:0x23f5, B:622:0x2428, B:624:0x245c, B:625:0x24db, B:884:0x363d, B:886:0x3643, B:887:0x366c, B:889:0x36a6, B:890:0x36e9, B:585:0x1fba, B:587:0x1fcf, B:588:0x1fff, B:569:0x1dcc, B:571:0x1dd2, B:572:0x1dfe, B:291:0x1133, B:293:0x1139, B:294:0x1163, B:238:0x0e99, B:240:0x0e9f, B:241:0x0ec6, B:19:0x01f0, B:21:0x01f6, B:22:0x0228, B:24:0x03b8, B:26:0x03ea, B:27:0x0449, B:248:0x0f57, B:252:0x0f65, B:277:0x1062, B:279:0x1068, B:280:0x1069, B:282:0x106b, B:284:0x1072, B:285:0x1073, B:255:0x0f73, B:259:0x0f7f, B:262:0x0f88, B:263:0x0f8b), top: B:965:0x01f0, inners: #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0f4b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0f8c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0fa3 A[Catch: all -> 0x106a, TryCatch #53 {all -> 0x106a, blocks: (B:266:0x0f8e, B:268:0x0fa3, B:269:0x0fd4), top: B:1003:0x0f8e, outer: #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0fe7 A[Catch: all -> 0x1060, TryCatch #45 {all -> 0x1060, blocks: (B:270:0x0fda, B:272:0x0fe7, B:273:0x1055), top: B:988:0x0fda, outer: #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x1245 A[Catch: all -> 0x1778, PHI: r2
  0x1245: PHI (r2v339 java.lang.Object) = (r2v334 java.lang.Object), (r2v338 java.lang.Object) binds: [B:299:0x11eb, B:300:0x11ed] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #63 {all -> 0x1778, blocks: (B:298:0x11e7, B:305:0x1245), top: B:1023:0x11e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x12bf  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x12d7  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x133a  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x135e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x135f  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x161f A[Catch: all -> 0x174a, TryCatch #28 {all -> 0x174a, blocks: (B:383:0x1615, B:384:0x1619, B:386:0x161f, B:389:0x1639, B:346:0x13af, B:364:0x14e5, B:368:0x1532, B:379:0x15b3, B:382:0x160d), top: B:956:0x13af }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x1814 A[Catch: all -> 0x044f, TryCatch #33 {all -> 0x044f, blocks: (B:148:0x0998, B:150:0x099e, B:151:0x09c7, B:451:0x180e, B:453:0x1814, B:454:0x183f, B:788:0x2ea2, B:790:0x2ea8, B:791:0x2ed2, B:822:0x31d4, B:824:0x31da, B:825:0x3209, B:859:0x3533, B:861:0x3539, B:862:0x355e, B:839:0x335b, B:841:0x337e, B:842:0x33d9, B:648:0x273a, B:650:0x2740, B:651:0x276e, B:653:0x27a8, B:654:0x27f4, B:619:0x23e0, B:621:0x23f5, B:622:0x2428, B:624:0x245c, B:625:0x24db, B:884:0x363d, B:886:0x3643, B:887:0x366c, B:889:0x36a6, B:890:0x36e9, B:585:0x1fba, B:587:0x1fcf, B:588:0x1fff, B:569:0x1dcc, B:571:0x1dd2, B:572:0x1dfe, B:291:0x1133, B:293:0x1139, B:294:0x1163, B:238:0x0e99, B:240:0x0e9f, B:241:0x0ec6, B:19:0x01f0, B:21:0x01f6, B:22:0x0228, B:24:0x03b8, B:26:0x03ea, B:27:0x0449, B:248:0x0f57, B:252:0x0f65, B:277:0x1062, B:279:0x1068, B:280:0x1069, B:282:0x106b, B:284:0x1072, B:285:0x1073, B:255:0x0f73, B:259:0x0f7f, B:262:0x0f88, B:263:0x0f8b), top: B:965:0x01f0, inners: #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x1924  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x1982 A[Catch: all -> 0x1d0d, TRY_ENTER, TRY_LEAVE, TryCatch #72 {all -> 0x1d0d, blocks: (B:458:0x18c4, B:464:0x1917, B:512:0x1bb2, B:513:0x1bb6, B:516:0x1bc2, B:519:0x1bdd, B:473:0x1982, B:492:0x1a83, B:496:0x1acf, B:507:0x1b51, B:511:0x1baa), top: B:1039:0x18c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x1bc2 A[Catch: all -> 0x1d0d, TryCatch #72 {all -> 0x1d0d, blocks: (B:458:0x18c4, B:464:0x1917, B:512:0x1bb2, B:513:0x1bb6, B:516:0x1bc2, B:519:0x1bdd, B:473:0x1982, B:492:0x1a83, B:496:0x1acf, B:507:0x1b51, B:511:0x1baa), top: B:1039:0x18c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:571:0x1dd2 A[Catch: all -> 0x044f, TryCatch #33 {all -> 0x044f, blocks: (B:148:0x0998, B:150:0x099e, B:151:0x09c7, B:451:0x180e, B:453:0x1814, B:454:0x183f, B:788:0x2ea2, B:790:0x2ea8, B:791:0x2ed2, B:822:0x31d4, B:824:0x31da, B:825:0x3209, B:859:0x3533, B:861:0x3539, B:862:0x355e, B:839:0x335b, B:841:0x337e, B:842:0x33d9, B:648:0x273a, B:650:0x2740, B:651:0x276e, B:653:0x27a8, B:654:0x27f4, B:619:0x23e0, B:621:0x23f5, B:622:0x2428, B:624:0x245c, B:625:0x24db, B:884:0x363d, B:886:0x3643, B:887:0x366c, B:889:0x36a6, B:890:0x36e9, B:585:0x1fba, B:587:0x1fcf, B:588:0x1fff, B:569:0x1dcc, B:571:0x1dd2, B:572:0x1dfe, B:291:0x1133, B:293:0x1139, B:294:0x1163, B:238:0x0e99, B:240:0x0e9f, B:241:0x0ec6, B:19:0x01f0, B:21:0x01f6, B:22:0x0228, B:24:0x03b8, B:26:0x03ea, B:27:0x0449, B:248:0x0f57, B:252:0x0f65, B:277:0x1062, B:279:0x1068, B:280:0x1069, B:282:0x106b, B:284:0x1072, B:285:0x1073, B:255:0x0f73, B:259:0x0f7f, B:262:0x0f88, B:263:0x0f8b), top: B:965:0x01f0, inners: #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x1e86  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x1ed9  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x1f9a  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x2143  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x2ea8 A[Catch: all -> 0x044f, TryCatch #33 {all -> 0x044f, blocks: (B:148:0x0998, B:150:0x099e, B:151:0x09c7, B:451:0x180e, B:453:0x1814, B:454:0x183f, B:788:0x2ea2, B:790:0x2ea8, B:791:0x2ed2, B:822:0x31d4, B:824:0x31da, B:825:0x3209, B:859:0x3533, B:861:0x3539, B:862:0x355e, B:839:0x335b, B:841:0x337e, B:842:0x33d9, B:648:0x273a, B:650:0x2740, B:651:0x276e, B:653:0x27a8, B:654:0x27f4, B:619:0x23e0, B:621:0x23f5, B:622:0x2428, B:624:0x245c, B:625:0x24db, B:884:0x363d, B:886:0x3643, B:887:0x366c, B:889:0x36a6, B:890:0x36e9, B:585:0x1fba, B:587:0x1fcf, B:588:0x1fff, B:569:0x1dcc, B:571:0x1dd2, B:572:0x1dfe, B:291:0x1133, B:293:0x1139, B:294:0x1163, B:238:0x0e99, B:240:0x0e9f, B:241:0x0ec6, B:19:0x01f0, B:21:0x01f6, B:22:0x0228, B:24:0x03b8, B:26:0x03ea, B:27:0x0449, B:248:0x0f57, B:252:0x0f65, B:277:0x1062, B:279:0x1068, B:280:0x1069, B:282:0x106b, B:284:0x1072, B:285:0x1073, B:255:0x0f73, B:259:0x0f7f, B:262:0x0f88, B:263:0x0f8b), top: B:965:0x01f0, inners: #68 }] */
    /* JADX WARN: Removed duplicated region for block: B:796:0x2f59  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x2fa5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x3000  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x31b6  */
    /* JADX WARN: Removed duplicated region for block: B:830:0x3294  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x32e6  */
    /* JADX WARN: Removed duplicated region for block: B:838:0x333d  */
    /* JADX WARN: Removed duplicated region for block: B:858:0x3514  */
    /* JADX WARN: Removed duplicated region for block: B:877:0x35fb  */
    /* JADX WARN: Removed duplicated region for block: B:931:0x126c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:933:0x11ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v61 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r10v65 */
    /* JADX WARN: Type inference failed for: r10v69 */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v255, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v280 */
    /* JADX WARN: Type inference failed for: r11v282 */
    /* JADX WARN: Type inference failed for: r11v283 */
    /* JADX WARN: Type inference failed for: r11v284 */
    /* JADX WARN: Type inference failed for: r11v285 */
    /* JADX WARN: Type inference failed for: r11v286 */
    /* JADX WARN: Type inference failed for: r11v292, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v296 */
    /* JADX WARN: Type inference failed for: r11v297 */
    /* JADX WARN: Type inference failed for: r11v348 */
    /* JADX WARN: Type inference failed for: r11v353, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v358 */
    /* JADX WARN: Type inference failed for: r11v372 */
    /* JADX WARN: Type inference failed for: r11v373 */
    /* JADX WARN: Type inference failed for: r11v374 */
    /* JADX WARN: Type inference failed for: r11v375 */
    /* JADX WARN: Type inference failed for: r11v376 */
    /* JADX WARN: Type inference failed for: r11v377 */
    /* JADX WARN: Type inference failed for: r11v378 */
    /* JADX WARN: Type inference failed for: r11v379 */
    /* JADX WARN: Type inference failed for: r11v380 */
    /* JADX WARN: Type inference failed for: r11v381 */
    /* JADX WARN: Type inference failed for: r11v385 */
    /* JADX WARN: Type inference failed for: r11v386 */
    /* JADX WARN: Type inference failed for: r12v207 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v121, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v122 */
    /* JADX WARN: Type inference failed for: r13v123 */
    /* JADX WARN: Type inference failed for: r13v124 */
    /* JADX WARN: Type inference failed for: r13v125 */
    /* JADX WARN: Type inference failed for: r13v128 */
    /* JADX WARN: Type inference failed for: r13v129 */
    /* JADX WARN: Type inference failed for: r13v139 */
    /* JADX WARN: Type inference failed for: r13v140 */
    /* JADX WARN: Type inference failed for: r13v141 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v84 */
    /* JADX WARN: Type inference failed for: r13v85 */
    /* JADX WARN: Type inference failed for: r13v86 */
    /* JADX WARN: Type inference failed for: r13v88 */
    /* JADX WARN: Type inference failed for: r13v89 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v100, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v114 */
    /* JADX WARN: Type inference failed for: r15v115 */
    /* JADX WARN: Type inference failed for: r15v116 */
    /* JADX WARN: Type inference failed for: r15v119 */
    /* JADX WARN: Type inference failed for: r15v121 */
    /* JADX WARN: Type inference failed for: r15v122 */
    /* JADX WARN: Type inference failed for: r15v123 */
    /* JADX WARN: Type inference failed for: r15v124 */
    /* JADX WARN: Type inference failed for: r15v125 */
    /* JADX WARN: Type inference failed for: r15v126 */
    /* JADX WARN: Type inference failed for: r15v127 */
    /* JADX WARN: Type inference failed for: r15v128 */
    /* JADX WARN: Type inference failed for: r15v129 */
    /* JADX WARN: Type inference failed for: r15v130 */
    /* JADX WARN: Type inference failed for: r15v131 */
    /* JADX WARN: Type inference failed for: r15v132 */
    /* JADX WARN: Type inference failed for: r15v133 */
    /* JADX WARN: Type inference failed for: r15v134 */
    /* JADX WARN: Type inference failed for: r15v135 */
    /* JADX WARN: Type inference failed for: r15v136 */
    /* JADX WARN: Type inference failed for: r15v137 */
    /* JADX WARN: Type inference failed for: r15v138 */
    /* JADX WARN: Type inference failed for: r15v139 */
    /* JADX WARN: Type inference failed for: r15v140 */
    /* JADX WARN: Type inference failed for: r15v141 */
    /* JADX WARN: Type inference failed for: r15v142 */
    /* JADX WARN: Type inference failed for: r15v143 */
    /* JADX WARN: Type inference failed for: r15v144 */
    /* JADX WARN: Type inference failed for: r15v145 */
    /* JADX WARN: Type inference failed for: r15v146 */
    /* JADX WARN: Type inference failed for: r15v147 */
    /* JADX WARN: Type inference failed for: r15v148 */
    /* JADX WARN: Type inference failed for: r15v149 */
    /* JADX WARN: Type inference failed for: r15v150 */
    /* JADX WARN: Type inference failed for: r15v151 */
    /* JADX WARN: Type inference failed for: r15v152 */
    /* JADX WARN: Type inference failed for: r15v153 */
    /* JADX WARN: Type inference failed for: r15v154 */
    /* JADX WARN: Type inference failed for: r15v155 */
    /* JADX WARN: Type inference failed for: r15v156 */
    /* JADX WARN: Type inference failed for: r15v157 */
    /* JADX WARN: Type inference failed for: r15v158 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v50, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v79 */
    /* JADX WARN: Type inference failed for: r15v80 */
    /* JADX WARN: Type inference failed for: r15v84, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r29v11 */
    /* JADX WARN: Type inference failed for: r29v12 */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v16 */
    /* JADX WARN: Type inference failed for: r29v17 */
    /* JADX WARN: Type inference failed for: r29v18 */
    /* JADX WARN: Type inference failed for: r29v19 */
    /* JADX WARN: Type inference failed for: r29v20 */
    /* JADX WARN: Type inference failed for: r29v24 */
    /* JADX WARN: Type inference failed for: r29v25 */
    /* JADX WARN: Type inference failed for: r29v28 */
    /* JADX WARN: Type inference failed for: r29v29 */
    /* JADX WARN: Type inference failed for: r29v30 */
    /* JADX WARN: Type inference failed for: r29v55 */
    /* JADX WARN: Type inference failed for: r29v56 */
    /* JADX WARN: Type inference failed for: r29v57 */
    /* JADX WARN: Type inference failed for: r29v58 */
    /* JADX WARN: Type inference failed for: r2v554, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v106 */
    /* JADX WARN: Type inference failed for: r32v110 */
    /* JADX WARN: Type inference failed for: r32v111 */
    /* JADX WARN: Type inference failed for: r32v112 */
    /* JADX WARN: Type inference failed for: r32v115 */
    /* JADX WARN: Type inference failed for: r32v116 */
    /* JADX WARN: Type inference failed for: r32v117 */
    /* JADX WARN: Type inference failed for: r32v119 */
    /* JADX WARN: Type inference failed for: r32v121 */
    /* JADX WARN: Type inference failed for: r32v122 */
    /* JADX WARN: Type inference failed for: r32v123 */
    /* JADX WARN: Type inference failed for: r32v124 */
    /* JADX WARN: Type inference failed for: r32v125 */
    /* JADX WARN: Type inference failed for: r32v126 */
    /* JADX WARN: Type inference failed for: r32v26 */
    /* JADX WARN: Type inference failed for: r32v27 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v50 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v96 */
    /* JADX WARN: Type inference failed for: r32v97 */
    /* JADX WARN: Type inference failed for: r32v98 */
    /* JADX WARN: Type inference failed for: r32v99 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v10 */
    /* JADX WARN: Type inference failed for: r41v11 */
    /* JADX WARN: Type inference failed for: r41v12 */
    /* JADX WARN: Type inference failed for: r41v13 */
    /* JADX WARN: Type inference failed for: r41v14 */
    /* JADX WARN: Type inference failed for: r41v15 */
    /* JADX WARN: Type inference failed for: r41v17 */
    /* JADX WARN: Type inference failed for: r41v18 */
    /* JADX WARN: Type inference failed for: r41v19 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v20 */
    /* JADX WARN: Type inference failed for: r41v21 */
    /* JADX WARN: Type inference failed for: r41v22 */
    /* JADX WARN: Type inference failed for: r41v23 */
    /* JADX WARN: Type inference failed for: r41v24 */
    /* JADX WARN: Type inference failed for: r41v25 */
    /* JADX WARN: Type inference failed for: r41v26 */
    /* JADX WARN: Type inference failed for: r41v27 */
    /* JADX WARN: Type inference failed for: r41v28 */
    /* JADX WARN: Type inference failed for: r41v29 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v32 */
    /* JADX WARN: Type inference failed for: r41v33 */
    /* JADX WARN: Type inference failed for: r41v35 */
    /* JADX WARN: Type inference failed for: r41v36 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v40 */
    /* JADX WARN: Type inference failed for: r41v45 */
    /* JADX WARN: Type inference failed for: r41v46 */
    /* JADX WARN: Type inference failed for: r41v48 */
    /* JADX WARN: Type inference failed for: r41v49 */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r41v51 */
    /* JADX WARN: Type inference failed for: r41v58 */
    /* JADX WARN: Type inference failed for: r41v59 */
    /* JADX WARN: Type inference failed for: r41v61 */
    /* JADX WARN: Type inference failed for: r41v65 */
    /* JADX WARN: Type inference failed for: r41v66 */
    /* JADX WARN: Type inference failed for: r41v67 */
    /* JADX WARN: Type inference failed for: r41v68 */
    /* JADX WARN: Type inference failed for: r41v69 */
    /* JADX WARN: Type inference failed for: r41v70 */
    /* JADX WARN: Type inference failed for: r41v71 */
    /* JADX WARN: Type inference failed for: r41v72 */
    /* JADX WARN: Type inference failed for: r41v73 */
    /* JADX WARN: Type inference failed for: r41v74 */
    /* JADX WARN: Type inference failed for: r41v75 */
    /* JADX WARN: Type inference failed for: r41v76 */
    /* JADX WARN: Type inference failed for: r41v77 */
    /* JADX WARN: Type inference failed for: r41v78 */
    /* JADX WARN: Type inference failed for: r41v79 */
    /* JADX WARN: Type inference failed for: r41v80 */
    /* JADX WARN: Type inference failed for: r41v81 */
    /* JADX WARN: Type inference failed for: r41v82 */
    /* JADX WARN: Type inference failed for: r41v83 */
    /* JADX WARN: Type inference failed for: r41v84 */
    /* JADX WARN: Type inference failed for: r41v85 */
    /* JADX WARN: Type inference failed for: r41v86 */
    /* JADX WARN: Type inference failed for: r41v87 */
    /* JADX WARN: Type inference failed for: r41v9 */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v13 */
    /* JADX WARN: Type inference failed for: r42v14 */
    /* JADX WARN: Type inference failed for: r42v15 */
    /* JADX WARN: Type inference failed for: r42v16 */
    /* JADX WARN: Type inference failed for: r42v17 */
    /* JADX WARN: Type inference failed for: r42v18 */
    /* JADX WARN: Type inference failed for: r42v19 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v20 */
    /* JADX WARN: Type inference failed for: r42v21 */
    /* JADX WARN: Type inference failed for: r42v22 */
    /* JADX WARN: Type inference failed for: r42v23 */
    /* JADX WARN: Type inference failed for: r42v24 */
    /* JADX WARN: Type inference failed for: r42v25 */
    /* JADX WARN: Type inference failed for: r42v26 */
    /* JADX WARN: Type inference failed for: r42v27 */
    /* JADX WARN: Type inference failed for: r42v28 */
    /* JADX WARN: Type inference failed for: r42v29 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v30 */
    /* JADX WARN: Type inference failed for: r42v31 */
    /* JADX WARN: Type inference failed for: r42v32 */
    /* JADX WARN: Type inference failed for: r42v33 */
    /* JADX WARN: Type inference failed for: r42v34 */
    /* JADX WARN: Type inference failed for: r42v35 */
    /* JADX WARN: Type inference failed for: r42v36 */
    /* JADX WARN: Type inference failed for: r42v37 */
    /* JADX WARN: Type inference failed for: r42v38 */
    /* JADX WARN: Type inference failed for: r42v39 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v40 */
    /* JADX WARN: Type inference failed for: r42v41 */
    /* JADX WARN: Type inference failed for: r42v48 */
    /* JADX WARN: Type inference failed for: r42v49 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r42v50 */
    /* JADX WARN: Type inference failed for: r42v51 */
    /* JADX WARN: Type inference failed for: r42v52 */
    /* JADX WARN: Type inference failed for: r42v53 */
    /* JADX WARN: Type inference failed for: r42v54 */
    /* JADX WARN: Type inference failed for: r42v55 */
    /* JADX WARN: Type inference failed for: r42v56 */
    /* JADX WARN: Type inference failed for: r42v57 */
    /* JADX WARN: Type inference failed for: r42v58 */
    /* JADX WARN: Type inference failed for: r42v59 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v60 */
    /* JADX WARN: Type inference failed for: r42v61 */
    /* JADX WARN: Type inference failed for: r42v62 */
    /* JADX WARN: Type inference failed for: r42v63 */
    /* JADX WARN: Type inference failed for: r42v64 */
    /* JADX WARN: Type inference failed for: r42v65 */
    /* JADX WARN: Type inference failed for: r42v66 */
    /* JADX WARN: Type inference failed for: r42v67 */
    /* JADX WARN: Type inference failed for: r42v68 */
    /* JADX WARN: Type inference failed for: r42v69 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r4v122, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v129 */
    /* JADX WARN: Type inference failed for: r4v247 */
    /* JADX WARN: Type inference failed for: r4v248 */
    /* JADX WARN: Type inference failed for: r4v249 */
    /* JADX WARN: Type inference failed for: r4v263 */
    /* JADX WARN: Type inference failed for: r4v273 */
    /* JADX WARN: Type inference failed for: r4v295, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v304 */
    /* JADX WARN: Type inference failed for: r4v305, types: [long] */
    /* JADX WARN: Type inference failed for: r4v306 */
    /* JADX WARN: Type inference failed for: r4v307 */
    /* JADX WARN: Type inference failed for: r4v310 */
    /* JADX WARN: Type inference failed for: r4v316, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v318 */
    /* JADX WARN: Type inference failed for: r4v319 */
    /* JADX WARN: Type inference failed for: r4v320 */
    /* JADX WARN: Type inference failed for: r4v321 */
    /* JADX WARN: Type inference failed for: r4v322 */
    /* JADX WARN: Type inference failed for: r4v323 */
    /* JADX WARN: Type inference failed for: r4v445 */
    /* JADX WARN: Type inference failed for: r4v446 */
    /* JADX WARN: Type inference failed for: r4v447 */
    /* JADX WARN: Type inference failed for: r4v448 */
    /* JADX WARN: Type inference failed for: r4v449 */
    /* JADX WARN: Type inference failed for: r4v450 */
    /* JADX WARN: Type inference failed for: r4v451 */
    /* JADX WARN: Type inference failed for: r4v452 */
    /* JADX WARN: Type inference failed for: r4v453 */
    /* JADX WARN: Type inference failed for: r4v454 */
    /* JADX WARN: Type inference failed for: r4v455 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v121 */
    /* JADX WARN: Type inference failed for: r7v122 */
    /* JADX WARN: Type inference failed for: r7v129, types: [long] */
    /* JADX WARN: Type inference failed for: r7v130 */
    /* JADX WARN: Type inference failed for: r7v131 */
    /* JADX WARN: Type inference failed for: r7v133, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v134 */
    /* JADX WARN: Type inference failed for: r7v135 */
    /* JADX WARN: Type inference failed for: r7v136 */
    /* JADX WARN: Type inference failed for: r7v137 */
    /* JADX WARN: Type inference failed for: r7v141 */
    /* JADX WARN: Type inference failed for: r7v144 */
    /* JADX WARN: Type inference failed for: r7v153 */
    /* JADX WARN: Type inference failed for: r7v154 */
    /* JADX WARN: Type inference failed for: r7v155 */
    /* JADX WARN: Type inference failed for: r7v156, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v157 */
    /* JADX WARN: Type inference failed for: r7v158 */
    /* JADX WARN: Type inference failed for: r7v159 */
    /* JADX WARN: Type inference failed for: r7v160 */
    /* JADX WARN: Type inference failed for: r7v161 */
    /* JADX WARN: Type inference failed for: r7v162 */
    /* JADX WARN: Type inference failed for: r7v198 */
    /* JADX WARN: Type inference failed for: r7v199 */
    /* JADX WARN: Type inference failed for: r7v200 */
    /* JADX WARN: Type inference failed for: r7v201 */
    /* JADX WARN: Type inference failed for: r7v202 */
    /* JADX WARN: Type inference failed for: r7v203 */
    /* JADX WARN: Type inference failed for: r7v204 */
    /* JADX WARN: Type inference failed for: r7v205 */
    /* JADX WARN: Type inference failed for: r7v206 */
    /* JADX WARN: Type inference failed for: r7v207 */
    /* JADX WARN: Type inference failed for: r7v208 */
    /* JADX WARN: Type inference failed for: r7v209 */
    /* JADX WARN: Type inference failed for: r7v210 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v94 */
    /* JADX WARN: Type inference failed for: r7v95 */
    /* JADX WARN: Type inference failed for: r7v96, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v84, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v120, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v277 */
    /* JADX WARN: Type inference failed for: r9v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v69, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v97 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.activity.MyRequestsActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m11841$r8$lambda$HkvXLswSqaNodmzKxDhLO0QOI(MyRequestsActivity myRequestsActivity, TabLayout.Tab tab, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 39;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        initView$lambda$0(myRequestsActivity, tab, i);
        int i5 = copydefault + 13;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Unit $r8$lambda$IVlpOotc9B6MLlGSWb2NBvo6DJQ(MyRequestsActivity myRequestsActivity, Integer num) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitObserver$lambda$2 = initObserver$lambda$2(myRequestsActivity, num);
        int i4 = component2 + 123;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return unitInitObserver$lambda$2;
        }
        throw null;
    }

    public static Unit $r8$lambda$zDavrm6X5uycDF7uErT6LUaF91c(MyRequestsActivity myRequestsActivity, Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitInitObserver$lambda$1 = initObserver$lambda$1(myRequestsActivity, num);
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        int i5 = copydefault + 29;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return unitInitObserver$lambda$1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getAsAtTimestamp = 1;
        copydefault();
        int i = ShareDataUIState + 119;
        getAsAtTimestamp = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    static void copydefault() {
        component3 = -8374015112747059003L;
        component1 = -890926437;
    }
}
