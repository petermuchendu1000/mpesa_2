package com.huawei.digitalpayment.consumer.notification.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.util.ToastUtils;
import com.huawei.common.widget.dialog.DialogBox;
import com.huawei.common.widget.tab.CommonTabItemView;
import com.huawei.common.widget.tab.CommonTabView;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils;
import com.huawei.digitalpayment.consumer.baselib.widget.text.TypefaceManager;
import com.huawei.digitalpayment.consumer.notification.ui.activity.NotificationActivity;
import com.huawei.digitalpayment.consumer.notification.ui.adapter.NotTabViewPagerAdapter;
import com.huawei.digitalpayment.consumer.push_ui.R;
import com.huawei.digitalpayment.consumer.push_ui.databinding.ActivityNotificationBinding;
import com.huawei.digitalpayment.consumer.request.UpdateNotificationsRequest;
import com.huawei.digitalpayment.consumer.service.INotificationService;
import com.huawei.digitalpayment.consumer.service.UnreadState;
import com.huawei.digitalpayment.consumer.viewmodel.NotificationRecordViewModel;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.ITrustedWebActivityServiceStub;
import org.apache.commons.lang3.CharUtils;
import org.greenrobot.eventbus.EventBus;

public class NotificationActivity extends Hilt_NotificationActivity<ActivityNotificationBinding, NotificationRecordViewModel> {
    private static final int COUNT_99 = 99;
    private static final String MORE_COUNT = "99+";
    private static char ShareDataUIState;
    private static char component1;
    private static int component2;
    private static char component3;
    private static long component4;
    private static int copy;
    private static char copydefault;
    private int currentCategory;
    private List<String> titles;
    private static final byte[] $$l = {TarHeader.LF_BLK, -58, -85, 74};
    private static final int $$o = 69;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {Ascii.SI, 58, -59, Ascii.ETB, 9, Ascii.SO, 10, 10, 2, 20, 17, -55, Ascii.ETB, 9, Ascii.SO, 10, 10, 2, 20, 17, -54, Ascii.ETB, 9, -52, 68, 19, Ascii.VT, 3, Ascii.DLE, 4, -44, 62, Ascii.CAN, 1, Ascii.EM, 8, 5, 6, -43, 74, -1, Ascii.RS, -4, Ascii.CAN, 2, 3, Ascii.SYN, -51, 70, Ascii.DLE, 17, -4, Ascii.CAN, 7, -2, Ascii.SYN, -51, 45, Ascii.FS, Ascii.FS, -4, 13, Ascii.DC2, 0, Ascii.FF, Ascii.NAK, 4, -7, 40, -4, Ascii.FS, Ascii.FF, -3, -17, TarHeader.LF_NORMAL, 17, -40, 60, Ascii.VT, -6, 35, -74, Ascii.CAN, Ascii.ETB, 9, Ascii.SO, 10, 10, 2, 20, 17, -56};
    private static final int $$k = 13;
    private static final byte[] $$d = {94, -43, -105, 125, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 61;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 0;
    private static int equals = 1;

    public static class RefreshEvent {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r5, int r6, short r7) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 65
            int r5 = r5 * 2
            int r0 = r5 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.notification.ui.activity.NotificationActivity.$$l
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
        L27:
            int r6 = r6 + 1
            int r4 = -r4
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.notification.ui.activity.NotificationActivity.$$r(short, int, short):java.lang.String");
    }

    private static void h(byte b2, byte b3, byte b4, Object[] objArr) {
        int i = 100 - b4;
        byte[] bArr = $$d;
        int i2 = (b2 * 2) + 83;
        byte[] bArr2 = new byte[b3 + 4];
        int i3 = b3 + 3;
        int i4 = -1;
        if (bArr == null) {
            i2 = (i3 + (-i2)) - 8;
            i++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + (-bArr[i])) - 8;
            i++;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 53
            int r0 = 63 - r7
            int r6 = 83 - r6
            int r8 = r8 * 3
            int r8 = 99 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.notification.ui.activity.NotificationActivity.$$j
            byte[] r0 = new byte[r0]
            int r7 = 62 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.notification.ui.activity.NotificationActivity.j(byte, byte, short, java.lang.Object[]):void");
    }

    static ViewDataBinding access$000(NotificationActivity notificationActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 119;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = notificationActivity.binding;
        int i4 = equals + 27;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return binding;
    }

    static ViewDataBinding access$100(NotificationActivity notificationActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = notificationActivity.binding;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 15;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return binding;
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component4 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 93;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $10 + 37;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component4)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, (char) (51269 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), -1883291598, false, $$r(b2, b3, (byte) (b3 | 19)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
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

    private static void i(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i4 = $10 + 83;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 43;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - TextUtils.getOffsetAfter("", 0), Color.green(0) + 32, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 23251), 592652048, false, $$r(b2, b3, (byte) (b3 | Ascii.ETB)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component1)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 32, (char) (23251 - KeyEvent.getDeadChar(0, 0)), 592652048, false, $$r(b4, b5, (byte) (b5 | Ascii.ETB)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 465, (ViewConfiguration.getEdgeSlop() >> 16) + 49, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void f(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i5 = $10 + 97;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 3784, 38 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 26860), 2015799920, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 7406, 16 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
            int i8 = $10 + 43;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            int i10 = $10 + 79;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(0, 0) + 7406, Color.argb(0, 0, 0, 0) + 16, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    class AnonymousClass3 extends FilterFastClickListener {
        private static int component1 = 0;
        private static int component2 = 1;

        AnonymousClass3() {
        }

        private void component1(View view, String str) {
            int i = 2 % 2;
            int i2 = component1 + 79;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            NotificationActivity.m10785$$Nest$mupdateStatus(NotificationActivity.this, "1");
            int i4 = component2 + 109;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public void onFilterClick(View view) {
            int i = 2 % 2;
            DialogBox.builder().setContent(NotificationActivity.this.getString(R.string.pushmessage_read_all_title)).setLeftButtonText(NotificationActivity.this.getString(R.string.pushmessage_cancel)).setLeftButtonTextColor(NotificationActivity.this.getColor(R.color.colorSecondaryText)).setRightButtonText(NotificationActivity.this.getString(R.string.pushmessage_confirm)).setRightButtonListener(new DialogBox.DialogBoxListener() {
                private static int ShareDataUIState = 0;
                private static int component3 = 1;

                @Override
                public final void onButtonClick(View view2, String str) {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 85;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    NotificationActivity.AnonymousClass3.component3(this.f$0, view2, str);
                    int i5 = component3 + 77;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                }
            }).setRightButtonTextColor(NotificationActivity.this.getColor(R.color.colorPrimary)).build().show(NotificationActivity.this.getSupportFragmentManager(), "ReadDialog");
            int i2 = component2 + 105;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        }

        public static void component3(AnonymousClass3 anonymousClass3, View view, String str) {
            int i = 2 % 2;
            int i2 = component2 + 125;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            anonymousClass3.component1(view, str);
            if (i3 != 0) {
                int i4 = 90 / 0;
            }
        }
    }

    class AnonymousClass1 extends FilterFastClickListener {
        private static int ShareDataUIState = 1;
        private static int component1;

        AnonymousClass1() {
        }

        private void copydefault(View view, String str) {
            int i = 2 % 2;
            int i2 = component1 + 61;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                NotificationActivity.m10785$$Nest$mupdateStatus(NotificationActivity.this, "2");
                int i3 = 36 / 0;
            } else {
                NotificationActivity.m10785$$Nest$mupdateStatus(NotificationActivity.this, "2");
            }
            int i4 = component1 + 119;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override
        public void onFilterClick(View view) {
            int i = 2 % 2;
            DialogBox.builder().setContent(NotificationActivity.this.getString(R.string.pushmessage_delete_all_title)).setLeftButtonText(NotificationActivity.this.getString(R.string.pushmessage_cancel)).setLeftButtonTextColor(NotificationActivity.this.getColor(R.color.colorSecondaryText)).setRightButtonText(NotificationActivity.this.getString(R.string.pushmessage_confirm)).setRightButtonListener(new DialogBox.DialogBoxListener() {
                private static int ShareDataUIState = 0;
                private static int component3 = 1;

                @Override
                public final void onButtonClick(View view2, String str) {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 57;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    NotificationActivity.AnonymousClass1.ShareDataUIState(this.f$0, view2, str);
                    if (i4 == 0) {
                        throw null;
                    }
                }
            }).setRightButtonTextColor(NotificationActivity.this.getColor(R.color.colorPrimary)).build().show(NotificationActivity.this.getSupportFragmentManager(), "DeleteDialog");
            int i2 = component1 + 27;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
        }

        public static void ShareDataUIState(AnonymousClass1 anonymousClass1, View view, String str) {
            int i = 2 % 2;
            int i2 = component1 + 83;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            anonymousClass1.copydefault(view, str);
            int i4 = component1 + 103;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static class TabSelectedEvent {
        private static int component1 = 1;
        private static int component2;
        private final int copydefault;

        TabSelectedEvent(int i) {
            this.copydefault = i;
        }

        public int getPosition() {
            int i = 2 % 2;
            int i2 = component1 + 37;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = this.copydefault;
            int i6 = i3 + 39;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.notification.ui.activity.NotificationActivity.onCreate(android.os.Bundle):void");
    }

    private void initData() {
        int i = 2 % 2;
        ((NotificationRecordViewModel) this.viewModel).getUpdateStatusData().observe(this, new Observer() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 41;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                NotificationActivity.$r8$lambda$bRUk3AVC83R7IJzLqv0kEH6anDE(this.f$0, (Resource) obj);
                int i5 = copydefault + 71;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getRequestBeneficiariesState + 81;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void lambda$initData$0(Resource resource) {
        int i = 2 % 2;
        if (!resource.error()) {
            if (resource.loading()) {
                DialogUtils.showLoading(this);
                return;
            } else {
                DialogUtils.hideLoading(this);
                EventBus.getDefault().post(new RefreshEvent());
                return;
            }
        }
        int i2 = getRequestBeneficiariesState + 9;
        equals = i2 % 128;
        int i3 = i2 % 2;
        ToastUtils.showLong(resource.getMessage());
        DialogUtils.hideLoading(this);
        int i4 = getRequestBeneficiariesState + 49;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    private void initTab() {
        int i = 2 % 2;
        ((ActivityNotificationBinding) this.binding).viewPager.setAdapter(new NotTabViewPagerAdapter(getSupportFragmentManager(), getLifecycle()));
        ((ActivityNotificationBinding) this.binding).viewPager.setOffscreenPageLimit(-1);
        ((ActivityNotificationBinding) this.binding).viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onPageSelected(int i2) {
                CommonTabView commonTabView;
                boolean z;
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 83;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    NotificationActivity.m10784$$Nest$fputcurrentCategory(NotificationActivity.this, i2);
                    commonTabView = ((ActivityNotificationBinding) NotificationActivity.access$000(NotificationActivity.this)).tabLayout;
                    z = false;
                } else {
                    NotificationActivity.m10784$$Nest$fputcurrentCategory(NotificationActivity.this, i2);
                    commonTabView = ((ActivityNotificationBinding) NotificationActivity.access$000(NotificationActivity.this)).tabLayout;
                    z = true;
                }
                commonTabView.setSelectedTab(i2, z);
            }
        });
        ((ActivityNotificationBinding) this.binding).tabLayout.setItemSpacing(SizeUtils.dp2px(32.0f));
        ((ActivityNotificationBinding) this.binding).tabLayout.setTabTextColor(ColorUtils.getColor(R.color.colorMainText), ColorUtils.getColor(R.color.colorSecondaryText));
        ((ActivityNotificationBinding) this.binding).tabLayout.setIndicatorColor(ColorUtils.getColor(R.color.colorPrimary));
        ((ActivityNotificationBinding) this.binding).tabLayout.setCallback(new CommonTabView.OnTabSelectedCallback() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public void onTabSelected(CommonTabView commonTabView, int i2) {
                int i3 = 2 % 2;
                EventBus.getDefault().post(new TabSelectedEvent(i2));
                ((ActivityNotificationBinding) NotificationActivity.access$100(NotificationActivity.this)).viewPager.setCurrentItem(i2, true);
                TypefaceManager.INSTANCE.setTextStyle(commonTabView.getTabViewAt(i2).getTitleView(), 1);
                int i4 = component1 + 87;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onTabUnselected(CommonTabView commonTabView, int i2) {
                int i3 = 2 % 2;
                int i4 = component3 + 89;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    TypefaceManager.INSTANCE.setTextStyle(commonTabView.getTabViewAt(i2).getTitleView(), 1);
                } else {
                    TypefaceManager.INSTANCE.setTextStyle(commonTabView.getTabViewAt(i2).getTitleView(), 0);
                }
                int i5 = component1 + 73;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 54 / 0;
                }
            }
        });
        ArrayList arrayList = new ArrayList();
        this.titles = arrayList;
        arrayList.add(getString(R.string.pushmessage_system));
        this.titles.add(getString(R.string.pushmessage_transaction));
        this.titles.add(getString(R.string.pushmessage_promotion));
        ((ActivityNotificationBinding) this.binding).tabLayout.setDataSource(this.titles);
        int i2 = getRequestBeneficiariesState + 61;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void initToolbar(String str) {
        int i = 2 % 2;
        super.initToolbar(str, R.layout.notification_toolbar_layout, null);
        findViewById(R.id.ivReadButton).setOnClickListener(new AnonymousClass3());
        findViewById(R.id.ivDeleteButton).setOnClickListener(new AnonymousClass1());
        int i2 = getRequestBeneficiariesState + 23;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void updateStatus(String str) {
        int i = 2 % 2;
        ((NotificationRecordViewModel) this.viewModel).updateAppNotificationStatus(new UpdateNotificationsRequest(String.valueOf(this.currentCategory), str, null, null));
        int i2 = getRequestBeneficiariesState + 99;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private void observerUnreadNum() {
        int i = 2 % 2;
        ((INotificationService) RouteUtils.getService(INotificationService.class)).unreadState().observe(this, new Observer() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final void onChanged(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 93;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                NotificationActivity.m10783$r8$lambda$dfSqKKCod_5ydcHuG0vPtOuM1g(this.f$0, (UnreadState) obj);
                int i5 = copydefault + 111;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = getRequestBeneficiariesState + 55;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
    }

    private void lambda$observerUnreadNum$1(UnreadState unreadState) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 53;
        equals = i2 % 128;
        int i3 = i2 % 2;
        setTabText(((ActivityNotificationBinding) this.binding).tabLayout.getTabViewAt(0), unreadState.getSystem(), this.titles.get(0));
        setTabText(((ActivityNotificationBinding) this.binding).tabLayout.getTabViewAt(1), unreadState.getTransaction(), this.titles.get(1));
        setTabText(((ActivityNotificationBinding) this.binding).tabLayout.getTabViewAt(2), unreadState.getPromotion(), this.titles.get(2));
        ((ActivityNotificationBinding) this.binding).tabLayout.requestLayoutIfNeed();
        int i4 = equals + 19;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setTabText(CommonTabItemView commonTabItemView, int i, String str) {
        int i2 = 2 % 2;
        int i3 = equals;
        int i4 = i3 + 113;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (commonTabItemView == null) {
            int i5 = i3 + 95;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        if (i == 0) {
            commonTabItemView.getTitleView().setText(str);
            return;
        }
        if (i > 99) {
            commonTabItemView.getTitleView().setText(str + " 99+");
        } else {
            commonTabItemView.getTitleView().setText(str + " " + i);
        }
        int i7 = equals + 3;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override
    public void onBackPressed() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            super.onBackPressed();
            ((INotificationService) RouteUtils.getService(INotificationService.class)).reportMsgReadStatus();
        } else {
            super.onBackPressed();
            ((INotificationService) RouteUtils.getService(INotificationService.class)).reportMsgReadStatus();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i;
        int i2 = 2 % 2;
        int i3 = equals + 63;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_notification;
            int i4 = 47 / 0;
        } else {
            i = R.layout.activity_notification;
        }
        int i5 = getRequestBeneficiariesState + 21;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0125  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.notification.ui.activity.NotificationActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getRequestBeneficiariesState + 5;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f(new char[]{1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, CharUtils.CR, CharUtils.CR, 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 28, false, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952812_res_0x7f1304ac).substring(55, 56).codePointAt(0) - 6, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952792_res_0x7f130498).substring(2, 3).length() + 151, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954589_res_0x7f130b9d).substring(0, 2).codePointAt(1) - 45, new char[]{3080, 3179, 9468, 52391, 12164, 56015, 20550, 8281, 28947, 5075, 36509, 15369, 21520, 18425, 41545, 2293, 35063, 43828, 22117, 54457, 48311, 40783}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = equals + 87;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 4;
                }
            }
        }
        if (baseContext != null) {
            int i6 = getRequestBeneficiariesState + 125;
            equals = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6619 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getTapTimeout() >> 16), 57 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) View.MeasureSpec.getMode(0), -960739708, false, "component3", new Class[]{Context.class});
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

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r50) {
        /*
            Method dump skipped, instruction units count: 14848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.notification.ui.activity.NotificationActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10782$r8$lambda$ETq6CtLNmpcdV7wfFNKegqBP0g(NotificationActivity notificationActivity) {
        int i = 2 % 2;
        int i2 = equals + 41;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        notificationActivity.observerUnreadNum();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$bRUk3AVC83R7IJzLqv0kEH6anDE(NotificationActivity notificationActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 17;
        equals = i2 % 128;
        int i3 = i2 % 2;
        notificationActivity.lambda$initData$0(resource);
        int i4 = equals + 105;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void m10783$r8$lambda$dfSqKKCod_5ydcHuG0vPtOuM1g(NotificationActivity notificationActivity, UnreadState unreadState) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        equals = i2 % 128;
        int i3 = i2 % 2;
        notificationActivity.lambda$observerUnreadNum$1(unreadState);
        int i4 = getRequestBeneficiariesState + 55;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void m10784$$Nest$fputcurrentCategory(NotificationActivity notificationActivity, int i) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 103;
        int i4 = i3 % 128;
        equals = i4;
        int i5 = i3 % 2;
        notificationActivity.currentCategory = i;
        if (i5 == 0) {
            int i6 = 62 / 0;
        }
        int i7 = i4 + 71;
        getRequestBeneficiariesState = i7 % 128;
        int i8 = i7 % 2;
    }

    static void m10785$$Nest$mupdateStatus(NotificationActivity notificationActivity, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 15;
        equals = i2 % 128;
        int i3 = i2 % 2;
        notificationActivity.updateStatus(str);
        int i4 = getRequestBeneficiariesState + 33;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 105;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = equals + 39;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        copy = 1;
        component1();
        ShareDataUIState = (char) 55652;
        component1 = (char) 63174;
        component3 = (char) 33102;
        copydefault = (char) 17775;
        int i = getAsAtTimestamp + 87;
        copy = i % 128;
        if (i % 2 == 0) {
            int i2 = 90 / 0;
        }
    }

    static void component1() {
        component2 = -890926420;
        component4 = -3217431970336725092L;
    }
}
