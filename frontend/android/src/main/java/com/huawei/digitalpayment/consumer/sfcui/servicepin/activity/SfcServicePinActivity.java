package com.huawei.digitalpayment.consumer.sfcui.servicepin.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.google.common.base.Ascii;
import com.google.gson.Gson;
import com.huawei.digitalpayment.consumer.base.util.DefaultAvatarDisplayUtil;
import com.huawei.digitalpayment.consumer.baseui.databinding.ActivitySfcBasePinBinding;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalCustomer;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalProfileItem;
import com.huawei.digitalpayment.consumer.profile.util.ProfileHelper;
import com.huawei.digitalpayment.consumer.sfcui.servicepin.model.ServicePinResponse;
import com.huawei.digitalpayment.consumer.sfcui.servicepin.viewmodel.ServicePinViewModel;
import com.huawei.image.glide.Base64Mode;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Function;
import kotlin.INotificationSideChannel;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\rH\u0014J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\u0012\u001a\u00020\tH\u0014J\b\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0007H\u0002J\b\u0010\u0016\u001a\u00020\tH\u0002J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/activity/SfcServicePinActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBasePinActivity;", "Lcom/huawei/digitalpayment/consumer/baseui/databinding/ActivitySfcBasePinBinding;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/viewmodel/ServicePinViewModel;", "<init>", "()V", "servicePin", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showBiometric", "", "onConfirmClick", "pin", "biometricResult", "isFaceLogin", "updateUI", "displayOwnAvatar", "displayDefaultAvatarByName", "name", "addObserver", "onPinValidationFailed", "message", "extractMessage", "resource", "Lcom/huawei/payment/mvvm/Resource;", "", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcServicePinActivity extends Hilt_SfcServicePinActivity<ActivitySfcBasePinBinding, ServicePinViewModel> {
    public static final int $stable;

    public static final Companion INSTANCE;
    public static final String EXTRA_AVATAR_LINK = "avatarLink";
    public static final String EXTRA_IMAGE_LINK = "imageLink";
    public static final String EXTRA_IMAGE_RES = "imageRes";
    public static final String EXTRA_PHONE_NUMBER = "phoneNumber";
    public static final String EXTRA_SCREEN_TITLE = "screenTitle";
    public static final String EXTRA_SUB_TITLE = "subTitle";
    public static final String EXTRA_TITLE_TEXT = "titleText";
    private static char ShareDataUIState;
    private static long component1;
    private static char component2;
    private static int component3;
    private static int component4;
    private static char copy;
    private static char copydefault;
    private static char equals;
    private String servicePin = "";
    private static final byte[] $$u = {TarHeader.LF_NORMAL, -22, 122, 126};
    private static final int $$x = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$B = {78, -86, -128, -128, 13, -1, -62, 58, 3, Ascii.FF, -11, Ascii.SO, -18, -51, TarHeader.LF_DIR, 0, Ascii.DC2, 3, -14, 7, 9, -15, -52, 67, -11, 3, 17, -12, -3, 19, -17, Ascii.SO, -67, 72, 0, -10, 4, -61, 35, Ascii.DC2, 7, -1, -17, Ascii.ETB, Ascii.DC2, -20, -33, Ascii.US, Ascii.FF, -8, 19, -8, -10, 20, -4, 4, 13, -1, 4, 0, 0, -8, 10, 7, -65, 13, -1, 4, 0, 0, -8, 10, 7, -64, 5, 6, -7, -2, 6, Ascii.VT, -73, TarHeader.LF_FIFO, 13, 4, -2, 7, 0, -10, 6, -8, Ascii.SI, PSSSigner.TRAILER_IMPLICIT, TarHeader.LF_FIFO, 6, -6, Ascii.SO, 1, -8, 8, 8, PSSSigner.TRAILER_IMPLICIT, 35, 35, -2, -10, Ascii.DC2, -17, 3, Ascii.SO, -30, 17, 13, 2, -10, -64, 33, 34, 2, -4, Ascii.NAK, -8, 9, -42, 37, 4, -3, 8};
    private static final int $$C = 209;
    private static final byte[] $$g = {114, 69, -115, -114, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$h = 34;
    private static int hashCode = 1;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Observer, FunctionAdapter {
        private static int component3 = 0;
        private static int copydefault = 1;
        private final Function1 component2;

        copydefault(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component2 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 99;
            copydefault = i2 % 128;
            boolean zAreEqual = false;
            if (i2 % 2 != 0 ? !(!(obj instanceof Observer)) : (obj instanceof Observer)) {
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            int i3 = copydefault + 89;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return zAreEqual;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = copydefault + 43;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 != 0) {
                Function1 function1 = this.component2;
                throw null;
            }
            Function1 function12 = this.component2;
            int i4 = i3 + 87;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return function12;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 69;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = copydefault + 79;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 75;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            this.component2.invoke(obj);
            if (i3 == 0) {
                int i4 = 39 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$A(byte r6, int r7, short r8) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.$$u
            int r7 = r7 + 98
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.$$A(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void l(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 99 - r8
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r0 = 28 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.$$g
            byte[] r0 = new byte[r0]
            int r6 = 27 - r6
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.l(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.$$B
            int r6 = r6 * 8
            int r6 = r6 + 99
            int r7 = 74 - r7
            int r1 = r8 + 10
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r7 = r7 + r6
            int r6 = r7 + (-1)
            int r7 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.m(short, short, byte, java.lang.Object[]):void");
    }

    public static final ViewDataBinding access$getBinding$p(SfcServicePinActivity sfcServicePinActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 13;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = sfcServicePinActivity.binding;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 13;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 0;
        }
        return binding;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/activity/SfcServicePinActivity$Companion;", "", "<init>", "()V", "EXTRA_SCREEN_TITLE", "", "EXTRA_TITLE_TEXT", "EXTRA_IMAGE_RES", "EXTRA_IMAGE_LINK", "EXTRA_AVATAR_LINK", "EXTRA_SUB_TITLE", "EXTRA_PHONE_NUMBER", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void k(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i3) ^ ((c3 << 4) + ((char) (((long) copy) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(equals)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) (-1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 843, View.MeasureSpec.makeMeasureSpec(0, 0) + 32, (char) (23251 - View.MeasureSpec.getSize(0)), 592652048, false, $$A(b2, (byte) (b2 & 13), (byte) 0), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i3) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) (-1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(844 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 32 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (23250 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 592652048, false, $$A(b3, (byte) (b3 & 13), (byte) 0), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i3 -= 40503;
                    i4++;
                    int i5 = $10 + 29;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 465, (ViewConfiguration.getScrollBarSize() >> 8) + 49, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i7 = $11 + 89;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void j(int i, char[] cArr, char[] cArr2, char[] cArr3, char c2, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i4 = $11 + 23;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            int i6 = $10 + 61;
            $11 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) (-1);
                    byte b3 = (byte) (-b2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - ((Process.getThreadPriority(0) + 20) >> 6), 31 - View.resolveSizeAndState(0, 0, 0), (char) (TextUtils.indexOf("", "", 0) + 19181), 1912513118, false, $$A(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7566, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, (char) View.resolveSizeAndState(0, 0, 0), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) (-1);
                    byte b5 = (byte) (b4 + 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 2459, 29 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) TextUtils.getOffsetBefore("", 0), 931716605, false, $$A(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (Process.myPid() >> 22), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component3) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component2) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 49;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        j(ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{7103, 59361, 34376, 1201, 63466, 52163, 2673, 51032, 32143, 42288, 43640, 60356, 60704, 2697, 38709, 37750, 11351, 11986}, new char[]{24514, 60715, 57900, 41983}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954589_res_0x7f130b9d).substring(0, 2).length() + 65504), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        k(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952016_res_0x7f130190).substring(7, 8).length() + 4, new char[]{16332, 31746, 61665, 64911, 5720, 21415}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = getAsAtTimestamp + 25;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                j(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{24673, 44149, 11946, 40878, 47017, 60917, 27350, 34742, 23326, 25086, 4726, 2544, 28904, 33312, 19712, 62673, 16172, 24450, 14112, 58276, 25617, 29093, 30852, 11114, 9930, 3167}, new char[]{40571, 23717, 62166, 20732}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952719_res_0x7f13044f).substring(6, 7).codePointAt(0) + 64722), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                j(KeyEvent.keyCodeFromString(""), new char[]{10182, 12820, 21328, 42408, 56829, 59496, 6214, 30720, 25126, 62666, 59145, 49174, 170, 50278, 50918, 52543, 57753, 18491}, new char[]{58901, 15541, 1384, 47740}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(10) + 31650), objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = getRequestBeneficiariesState + 29;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i6 = getAsAtTimestamp + 97;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarSize() >> 8), 41 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    j(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{20872, 41403, AbstractJsonLexerKt.END_OBJ, 5703, 53020, 3510, 38577, 53761, 51141, 20958, 32754, 59013, 20718, 42914, 22762, 16966, 23415, 46254, 20119, 57953, 62073, 41124, 19865, 21804, 52867, 65034, 34171, 27013, 64854, 14231, 36981, 37212, 27312, 11874, 16355, 64331, 33022, 30260, 40545, 11834, 6414, 45149, 40028, 34460, 56222, 7585, 40486, 53546}, new char[]{60552, 9623, 20376, 61868}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    k(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952804_res_0x7f1304a4).substring(10, 11).codePointAt(0) + 32, new char[]{24773, 60901, 34401, 58042, 41009, 64421, 50632, 'b', 64076, 13994, 5488, 39388, 45561, 13995, 50632, 'b', 46446, 15259, 39566, 61839, 56826, 60749, 45267, 6728, 63218, 57354, 61362, 28075, 34083, 31709, 21246, 2637, 54728, 16082, 8296, 49015, 7504, 46786, 11268, 39194, 29450, 57291, 42757, 22383, 14480, 62565, 32282, 58428, 35837, 1392, 26692, 39874, 55261, 298, 37618, 30430, 11135, 35781, 9792, 39509, 60903, 1802, 50938, 25560}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    k(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 35, new char[]{56826, 60749, 38036, 18673, 18989, 12675, 2272, 57510, 50127, 12634, 1285, 60084, 61397, 12370, 22835, 25923, 33339, 40404, 50472, 59983, 11355, 26649, 20132, 64674, 53566, 54385, 11135, 35781, 61362, 28075, 15328, 13461, 45657, 37884, 31073, 45661, 38222, 31371, 2663, 52877, 42394, 25807, 53735, 5784, 51074, 56915, 11335, 33561, 36804, 21612, 59063, 12757, 34993, 16480, 21057, 17614, 16090, 4917, 36062, 52875, 13472, 850, 8568, 36292}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    j((-1) - ExpandableListView.getPackedPositionChild(0L), new char[]{9385, 62765, 2046, 48026, 36107, 19925, 15958, 54684, 53015, 56185, 38955, 22810, 60679, 46446, 50498, 30339, 21849, 30116, 16855, 15654, 33922, 61037, 38804, 27823, 49410, 25674, 4984, 64265, 52349, 36199, 15260, 28317, 13182, 62833, 43887, 36813, 60519, 9861, 61142, 48115, 46037, 35085, 11393, 9141, 51936, 42776, 8192, 16213, 35391, 44372, 45306, 14657, 1424, 56055, 40141, 53770, 11891, 64876, 10193, 1173, 34338, 9908, 34181, 25297, 18743, 25357, 22913, 36013, 56798, '5', 39608, 58380}, new char[]{26196, 30874, 43179, 29271}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131955137_res_0x7f130dc1).substring(0, 3).length() - 3), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    k(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 96, new char[]{62363, 43927, 5488, 39388, 17002, 19907}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    k(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954659_res_0x7f130be3).substring(6, 9).length() + 33, new char[]{53680, 38815, 22001, 6155, 62392, 26217, 40479, 5036, 6299, 48886, 54728, 16082, 11045, 57749, 39995, 7120, 50216, 61473, 7859, 60714, 11550, 20168, 27964, 13270, 18585, 42708, 27275, 39075, 26552, 3314, 45561, 13995, 42192, 59786, 61397, 12370}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 6562, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 57, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2405;
            int i8 = 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            char cResolveSize = (char) View.resolveSize(0, 0);
            Object[] objArr13 = new Object[1];
            l((byte) (-$$g[38]), r3[31], (byte) 96, objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(minimumFlingVelocity, i8, cResolveSize, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int offsetAfter = 2405 - TextUtils.getOffsetAfter("", 0);
                int iGreen = Color.green(0) + 26;
                char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                byte[] bArr = $$g;
                Object[] objArr14 = new Object[1];
                l(bArr[95], bArr[31], (byte) 93, objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, iGreen, c2, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            k(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952720_res_0x7f130450).substring(6, 7).length() + 15, new char[]{36172, 29732, 40840, 48720, 60134, 1372, 27983, 48382, 48937, 861, 44088, 26364, 64106, 6151, 34815, 22700}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            j(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29, new char[]{14189, 11592, 6565, 26336, 23371, 16979, 6118, 51928, 9213, 28195, 11776, 19787, 64349, 27501, 49842, 26737}, new char[]{14657, 25176, 2471, 34538}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(28) + 59812), objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -1575607374};
                byte[] bArr2 = $$B;
                byte b2 = bArr2[15];
                Object[] objArr18 = new Object[1];
                m(b2, (byte) (b2 | 70), (byte) 43, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b3 = bArr2[15];
                Object[] objArr19 = new Object[1];
                m(b3, bArr2[16], b3, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int threadPriority = 2405 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25;
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                    byte[] bArr3 = $$g;
                    Object[] objArr20 = new Object[1];
                    l(bArr3[95], bArr3[31], (byte) 93, objArr20);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, i9, cIndexOf, 24929979, false, (String) objArr20[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    k((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, new char[]{27983, 48382, 10705, 20847, 3265, 59661, 27858, 58614, 53926, 22274, 24978, 63254, 35546, 35861, 34244, 10221, 44885, 17531, 58823, 28236, 22009, 32369}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    j(1862899541 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{26684, 61473, 45246, 29023, 32244, 54737, 11769, 49147, 7812, 51336, 56287, 41070, 1960, 60432, 31068}, new char[]{22000, 2455, 21359, 31196}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952847_res_0x7f1304cf).substring(21, 22).codePointAt(0) + 56371), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int touchSlop = 2405 - (ViewConfiguration.getTouchSlop() >> 8);
                        int maxKeyCode = 26 - (KeyEvent.getMaxKeyCode() >> 16);
                        char trimmedLength = (char) TextUtils.getTrimmedLength("");
                        byte b4 = $$g[33];
                        byte b5 = b4;
                        Object[] objArr23 = new Object[1];
                        l(b4, b5, (byte) (b5 | 84), objArr23);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(touchSlop, maxKeyCode, trimmedLength, -1843538389, false, (String) objArr23[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int iBlue = 2405 - Color.blue(0);
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 26;
                        char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                        Object[] objArr24 = new Object[1];
                        l((byte) (-$$g[38]), r6[31], (byte) 96, objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iBlue, deadChar, c3, -2047739879, false, (String) objArr24[0], null);
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
        int i10 = ((int[]) objArr[0])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 'Z' - AndroidCharacter.getMirror('0'), (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i12 = getAsAtTimestamp + 115;
            getRequestBeneficiariesState = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr25 = {1757866590, Long.valueOf(j3), arrayList, null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(View.combineMeasuredStates(0, 0) + 6562, View.MeasureSpec.getSize(0) + 56, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                byte b6 = $$B[15];
                Object[] objArr26 = new Object[1];
                m(b6, r1[20], b6, objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                int i14 = getAsAtTimestamp + 57;
                getRequestBeneficiariesState = i14 % 128;
                int i15 = i14 % 2;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        addObserver();
        int i16 = getRequestBeneficiariesState + 119;
        getAsAtTimestamp = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 69 / 0;
        }
    }

    @Override
    public void onConfirmClick(String pin) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 == 0) {
            int i4 = 94 / 0;
            if (pin == null) {
                return;
            }
        } else if (pin == null) {
            return;
        }
        int i5 = i3 + 23;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        this.servicePin = pin;
        ((ServicePinViewModel) this.viewModel).validateServicePin(pin);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x016a  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateUI() {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.updateUI():void");
    }

    private final void displayDefaultAvatarByName(String name) {
        DefaultAvatarDisplayUtil defaultAvatarDisplayUtil;
        TextView textView;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            ((ActivitySfcBasePinBinding) this.binding).cardAbbr.setVisibility(1);
            defaultAvatarDisplayUtil = DefaultAvatarDisplayUtil.INSTANCE;
            textView = ((ActivitySfcBasePinBinding) this.binding).tvAbbr;
        } else {
            ((ActivitySfcBasePinBinding) this.binding).cardAbbr.setVisibility(0);
            defaultAvatarDisplayUtil = DefaultAvatarDisplayUtil.INSTANCE;
            textView = ((ActivitySfcBasePinBinding) this.binding).tvAbbr;
        }
        Intrinsics.checkNotNullExpressionValue(textView, "");
        defaultAvatarDisplayUtil.displayDefaultAvatar(textView, name);
    }

    private final void addObserver() {
        int i = 2 % 2;
        ((ServicePinViewModel) this.viewModel).getValidateServicePin().observe(this, new copydefault(new Function1() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final Object invoke(Object obj) {
                Unit unitM11910$r8$lambda$FVPeIzLLrziLKX5gono7EgqMww;
                int i2 = 2 % 2;
                int i3 = component1 + 53;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    unitM11910$r8$lambda$FVPeIzLLrziLKX5gono7EgqMww = SfcServicePinActivity.m11910$r8$lambda$FVPeIzLLrziLKX5gono7EgqMww(this.f$0, (Resource) obj);
                    int i4 = 39 / 0;
                } else {
                    unitM11910$r8$lambda$FVPeIzLLrziLKX5gono7EgqMww = SfcServicePinActivity.m11910$r8$lambda$FVPeIzLLrziLKX5gono7EgqMww(this.f$0, (Resource) obj);
                }
                int i5 = ShareDataUIState + 29;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return unitM11910$r8$lambda$FVPeIzLLrziLKX5gono7EgqMww;
            }
        }));
        int i2 = getRequestBeneficiariesState + 11;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r5.success() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r5 = r4.extractMessage(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r5 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.getRequestBeneficiariesState + 75;
        com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.getAsAtTimestamp = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if ((r1 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, "Success") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        r5 = new android.content.Intent();
        r5.putExtra(com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants.KEY_ENCRYPT_PIN, r4.servicePin);
        r5.putExtra(com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants.KEY_ENCRYPT_PIN2, r4.servicePin);
        r4.setResult(-1, r5);
        r4.finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        r4.onPinValidationFailed(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        kotlin.jvm.internal.Intrinsics.areEqual(r5, "Success");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        if (r5.error() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r5.error() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r5 = r5.getMessage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
        r4.onPinValidationFailed(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit addObserver$lambda$5(com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity r4, com.huawei.payment.mvvm.Resource r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.getRequestBeneficiariesState
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 == 0) goto L1e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            boolean r1 = r5.error()
            r3 = 32
            int r3 = r3 / 0
            if (r1 == 0) goto L34
            goto L27
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            boolean r1 = r5.error()
            if (r1 == 0) goto L34
        L27:
            java.lang.String r5 = r5.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            r4.onPinValidationFailed(r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L34:
            boolean r1 = r5.success()
            if (r1 == 0) goto L77
            java.lang.String r5 = r4.extractMessage(r5)
            if (r5 == 0) goto L77
            int r1 = com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.getRequestBeneficiariesState
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            java.lang.String r0 = "Success"
            if (r1 != 0) goto L72
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            if (r0 == 0) goto L6e
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r0 = "encryptPin"
            java.lang.String r1 = r4.servicePin
            r5.putExtra(r0, r1)
            java.lang.String r0 = "encryptPin2"
            java.lang.String r1 = r4.servicePin
            r5.putExtra(r0, r1)
            r0 = -1
            r4.setResult(r0, r5)
            r4.finish()
            goto L77
        L6e:
            r4.onPinValidationFailed(r5)
            goto L77
        L72:
            kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
            r4 = 0
            throw r4
        L77:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.addObserver$lambda$5(com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity, com.huawei.payment.mvvm.Resource):kotlin.Unit");
    }

    private final void onPinValidationFailed(String message) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        showPinError(message);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final String extractMessage(Resource<Object> resource) {
        String responseMessage;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (resource != null) {
            try {
                Gson gson = new Gson();
                responseMessage = ((ServicePinResponse) gson.fromJson(gson.toJson(resource.getData()), ServicePinResponse.class)).getHeader().getResponseMessage();
            } catch (Exception unused) {
                responseMessage = null;
            }
        } else {
            responseMessage = null;
        }
        int i4 = getRequestBeneficiariesState + 11;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return responseMessage;
        }
        obj.hashCode();
        throw null;
    }

    private final void displayOwnAvatar() {
        int i = 2 % 2;
        LocalCustomer customer = ProfileHelper.INSTANCE.getCustomer();
        Iterator<T> it = ProfileHelper.INSTANCE.getProfiles().iterator();
        while (it.hasNext()) {
            int i2 = getRequestBeneficiariesState + 119;
            getAsAtTimestamp = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.areEqual(((LocalProfileItem) it.next()).getName(), "FirstName");
                obj.hashCode();
                throw null;
            }
            LocalProfileItem localProfileItem = (LocalProfileItem) it.next();
            if (Intrinsics.areEqual(localProfileItem.getName(), "FirstName")) {
                int i3 = getRequestBeneficiariesState + 31;
                getAsAtTimestamp = i3 % 128;
                if (i3 % 2 != 0) {
                    localProfileItem.getValue();
                    ProfileHelper.INSTANCE.getProfiles().iterator();
                    throw null;
                }
                String value = localProfileItem.getValue();
                for (LocalProfileItem localProfileItem2 : ProfileHelper.INSTANCE.getProfiles()) {
                    if (Intrinsics.areEqual(localProfileItem2.getName(), "LastName")) {
                        String name = value + " " + localProfileItem2.getValue();
                        String str = "";
                        if (TextUtils.isEmpty(value) && !(!TextUtils.isEmpty(r3))) {
                            int i4 = getAsAtTimestamp + 19;
                            getRequestBeneficiariesState = i4 % 128;
                            if (i4 % 2 == 0) {
                                throw null;
                            }
                            if (customer == null || (name = customer.getName()) == null) {
                                int i5 = getAsAtTimestamp + 107;
                                getRequestBeneficiariesState = i5 % 128;
                                int i6 = i5 % 2;
                                name = "";
                            }
                        }
                        displayDefaultAvatarByName(name);
                        RequestManager requestManagerWith = Glide.with(((ActivitySfcBasePinBinding) this.binding).ivAvatar);
                        if (customer != null) {
                            String avatar = customer.getAvatar();
                            if (avatar == null) {
                                int i7 = getAsAtTimestamp + 101;
                                getRequestBeneficiariesState = i7 % 128;
                                int i8 = i7 % 2;
                            } else {
                                str = avatar;
                            }
                        }
                        requestManagerWith.load((Object) Base64Mode.getConsumerMode(str)).listener(new RequestListener<Drawable>() {
                            private static int component3 = 0;
                            private static int copydefault = 1;

                            @Override
                            public boolean onResourceReady(Drawable drawable, Object obj2, Target<Drawable> target, DataSource dataSource, boolean z) {
                                int i9 = 2 % 2;
                                int i10 = copydefault + 25;
                                component3 = i10 % 128;
                                if (i10 % 2 == 0) {
                                    return onResourceReady2(drawable, obj2, target, dataSource, z);
                                }
                                onResourceReady2(drawable, obj2, target, dataSource, z);
                                throw null;
                            }

                            public boolean onResourceReady2(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                int i9 = 2 % 2;
                                int i10 = copydefault + 49;
                                component3 = i10 % 128;
                                int i11 = i10 % 2;
                                Intrinsics.checkNotNullParameter(resource, "");
                                Intrinsics.checkNotNullParameter(model, "");
                                Intrinsics.checkNotNullParameter(dataSource, "");
                                ((ActivitySfcBasePinBinding) SfcServicePinActivity.access$getBinding$p(SfcServicePinActivity.this)).cardAbbr.setVisibility(8);
                                int i12 = copydefault + 113;
                                component3 = i12 % 128;
                                if (i12 % 2 == 0) {
                                    return false;
                                }
                                throw null;
                            }

                            @Override
                            public boolean onLoadFailed(GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                int i9 = 2 % 2;
                                int i10 = component3 + 55;
                                copydefault = i10 % 128;
                                int i11 = i10 % 2;
                                Intrinsics.checkNotNullParameter(target, "");
                                int i12 = component3 + 57;
                                copydefault = i12 % 128;
                                if (i12 % 2 != 0) {
                                    return false;
                                }
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                        }).into(((ActivitySfcBasePinBinding) this.binding).ivAvatar);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            j(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).length() - 1, new char[]{24673, 44149, 11946, 40878, 47017, 60917, 27350, 34742, 23326, 25086, 4726, 2544, 28904, 33312, 19712, 62673, 16172, 24450, 14112, 58276, 25617, 29093, 30852, 11114, 9930, 3167}, new char[]{40571, 23717, 62166, 20732}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 64753), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            j((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{10182, 12820, 21328, 42408, 56829, 59496, 6214, 30720, 25126, 62666, 59145, 49174, 170, 50278, 50918, 52543, 57753, 18491}, new char[]{58901, 15541, 1384, 47740}, new char[]{0, 0, 0, 0}, (char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 31720), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = getAsAtTimestamp + 89;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6666 - AndroidCharacter.getMirror('0'), (KeyEvent.getMaxKeyCode() >> 16) + 42, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 55, (char) (Process.myTid() >> 22), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i4 = getAsAtTimestamp + 73;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
        int i6 = getRequestBeneficiariesState + 11;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c5  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:(2:50|(5:52|53|(1:55)|56|57)(3:58|(1:60)|61))(61:62|(2:64|(1:70)(1:69))(1:72)|(21:74|75|785|76|770|77|(1:79)|80|81|754|82|(1:84)|85|86|87|(1:89)|90|(1:92)(1:93)|94|(1:96)|97)(48:142|157|822|158|(1:160)|161|(3:163|(1:165)|166)(14:168|169|804|170|(1:172)|173|174|175|(1:177)|178|(1:180)|181|(1:183)|184)|167|185|(9:188|797|189|(1:191)|192|193|194|783|195)|196|(4:227|763|228|(1:234)(1:233))(1:238)|239|810|240|(1:242)|243|799|244|(1:246)|247|271|792|272|(1:274)|275|(3:277|(1:279)|280)(19:281|282|777|283|(1:285)|286|287|761|288|(1:290)|291|292|293|(1:295)|296|(1:298)(1:299)|300|(1:302)|303)|304|(4:307|(2:309|825)(11:310|(3:312|(4:315|(3:828|317|831)(4:827|318|319|830)|829|313)|826)|320|750|321|(1:323)|324|325|744|326|824)|327|305)|823|361|821|362|(1:364)|365|(3:367|(1:369)|370)(19:371|372|806|373|(1:375)|376|377|795|378|(1:380)|381|382|383|(1:385)|386|(1:388)|389|(1:391)|392)|393|(4:396|(3:834|398|837)(12:833|399|(3:401|(3:404|405|402)|838)|406|781|407|(1:409)|410|411|768|412|836)|835|394)|832|447|(1:449)|450|(1:452)|453|(3:455|(1:457)|458)(16:460|461|(1:463)|464|(1:466)|467|468|(1:470)|471|808|472|473|(1:475)|476|(1:478)|479)|459|480|(34:482|(1:484)|485|(3:487|(1:489)|490)(14:491|492|(1:494)|495|496|(1:498)|499|766|500|501|(1:503)|504|(1:506)|507)|508|(1:510)(9:511|(3:513|(2:516|514)|846)|517|518|(1:520)|521|(1:523)|524|525)|526|775|527|(2:786|529)|533|534|772|535|(1:537)|538|(3:540|(1:542)|543)(17:544|(2:546|(1:552)(1:551))|(19:554|555|759|556|(1:558)|559|560|748|561|(1:563)|564|565|566|(1:568)|569|(1:571)|572|(1:574)|575)|634|(1:636)|637|(3:639|(1:641)|642)(13:644|819|645|646|(1:648)|649|790|650|651|(1:653)|654|(1:656)|657)|643|658|(6:661|662|(1:664)|665|666|667)|668|(1:670)|671|(3:673|(1:675)|676)(14:678|679|(1:681)|682|683|(1:685)|686|779|687|688|(1:690)|691|(1:693)|694)|677|695|(1:852)(7:698|699|(1:701)|702|703|704|705))|576|(4:579|(3:841|581|844)(12:840|582|(3:584|(3:587|588|585)|845)|589|815|590|(1:592)|593|594|802|595|843)|842|577)|839|634|(0)|637|(0)(0)|643|658|(0)|668|(0)|671|(0)(0)|677|695|(0)(0))(10:717|(3:719|(2:722|720)|847)|723|724|(1:726)|727|(1:729)|730|731|732))|145|146|788|147|150|151|(1:153)|154|155|801|156|157|822|158|(0)|161|(0)(0)|167|185|(0)|196|(0)(0)|239|810|240|(0)|243|799|244|(0)|247|271|792|272|(0)|275|(0)(0)|304|(1:305)|823|361|821|362|(0)|365|(0)(0)|393|(1:394)|832|447|(0)|450|(0)|453|(0)(0)|459|480|(0)(0))|799|244|(0)|247|271|792|272|(0)|275|(0)(0)|304|(1:305)|823|361|821|362|(0)|365|(0)(0)|393|(1:394)|832|447|(0)|450|(0)|453|(0)(0)|459|480|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(63:0|2|(2:(2:9|(2:11|(2:16|(1:20)(1:19))(0))(2:14|(0)(0)))(1:21)|(9:23|812|24|(1:26)|27|28|29|(1:31)|32)(1:7))(0)|36|793|37|(3:39|758|40)|44|(1:46)|47|48|(2:50|(5:52|53|(1:55)|56|57)(3:58|(1:60)|61))(61:62|(2:64|(1:70)(1:69))(1:72)|(21:74|75|785|76|770|77|(1:79)|80|81|754|82|(1:84)|85|86|87|(1:89)|90|(1:92)(1:93)|94|(1:96)|97)(48:142|157|822|158|(1:160)|161|(3:163|(1:165)|166)(14:168|169|804|170|(1:172)|173|174|175|(1:177)|178|(1:180)|181|(1:183)|184)|167|185|(9:188|797|189|(1:191)|192|193|194|783|195)|196|(4:227|763|228|(1:234)(1:233))(1:238)|239|810|240|(1:242)|243|799|244|(1:246)|247|271|792|272|(1:274)|275|(3:277|(1:279)|280)(19:281|282|777|283|(1:285)|286|287|761|288|(1:290)|291|292|293|(1:295)|296|(1:298)(1:299)|300|(1:302)|303)|304|(4:307|(2:309|825)(11:310|(3:312|(4:315|(3:828|317|831)(4:827|318|319|830)|829|313)|826)|320|750|321|(1:323)|324|325|744|326|824)|327|305)|823|361|821|362|(1:364)|365|(3:367|(1:369)|370)(19:371|372|806|373|(1:375)|376|377|795|378|(1:380)|381|382|383|(1:385)|386|(1:388)|389|(1:391)|392)|393|(4:396|(3:834|398|837)(12:833|399|(3:401|(3:404|405|402)|838)|406|781|407|(1:409)|410|411|768|412|836)|835|394)|832|447|(1:449)|450|(1:452)|453|(3:455|(1:457)|458)(16:460|461|(1:463)|464|(1:466)|467|468|(1:470)|471|808|472|473|(1:475)|476|(1:478)|479)|459|480|(34:482|(1:484)|485|(3:487|(1:489)|490)(14:491|492|(1:494)|495|496|(1:498)|499|766|500|501|(1:503)|504|(1:506)|507)|508|(1:510)(9:511|(3:513|(2:516|514)|846)|517|518|(1:520)|521|(1:523)|524|525)|526|775|527|(2:786|529)|533|534|772|535|(1:537)|538|(3:540|(1:542)|543)(17:544|(2:546|(1:552)(1:551))|(19:554|555|759|556|(1:558)|559|560|748|561|(1:563)|564|565|566|(1:568)|569|(1:571)|572|(1:574)|575)|634|(1:636)|637|(3:639|(1:641)|642)(13:644|819|645|646|(1:648)|649|790|650|651|(1:653)|654|(1:656)|657)|643|658|(6:661|662|(1:664)|665|666|667)|668|(1:670)|671|(3:673|(1:675)|676)(14:678|679|(1:681)|682|683|(1:685)|686|779|687|688|(1:690)|691|(1:693)|694)|677|695|(1:852)(7:698|699|(1:701)|702|703|704|705))|576|(4:579|(3:841|581|844)(12:840|582|(3:584|(3:587|588|585)|845)|589|815|590|(1:592)|593|594|802|595|843)|842|577)|839|634|(0)|637|(0)(0)|643|658|(0)|668|(0)|671|(0)(0)|677|695|(0)(0))(10:717|(3:719|(2:722|720)|847)|723|724|(1:726)|727|(1:729)|730|731|732))|145|146|788|147|150|151|(1:153)|154|155|801|156|157|822|158|(0)|161|(0)(0)|167|185|(0)|196|(0)(0)|239|810|240|(0)|243|799|244|(0)|247|271|792|272|(0)|275|(0)(0)|304|(1:305)|823|361|821|362|(0)|365|(0)(0)|393|(1:394)|832|447|(0)|450|(0)|453|(0)(0)|459|480|(0)(0))|98|(4:101|(2:103|850)(11:104|(3:106|(3:109|110|107)|851)|111|746|112|(1:114)|115|116|813|117|849)|118|99)|848|157|822|158|(0)|161|(0)(0)|167|185|(0)|196|(0)(0)|239|810|240|(0)|243|799|244|(0)|247|271|792|272|(0)|275|(0)(0)|304|(1:305)|823|361|821|362|(0)|365|(0)(0)|393|(1:394)|832|447|(0)|450|(0)|453|(0)(0)|459|480|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0edf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0ee0, code lost:
    
        r8 = new java.lang.Object[1];
        k(((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 18, new char[]{36804, 21612, 36804, 21612, 9792, 39509, 50938, 25560, 7467, 46831, 27876, 30919}, r8);
        r3 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0f17, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0f2e, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0f32, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0f61, code lost:
    
        r8 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0f65, code lost:
    
        if (r8 == null) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0f67, code lost:
    
        r8 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - android.graphics.Color.blue(0), (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 42, (char) android.view.View.resolveSize(0, 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0f8e, code lost:
    
        r8 = ((java.lang.reflect.Method) r8).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0f96, code lost:
    
        r11 = new java.lang.Object[]{-1926356303, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 6562, 55 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (1 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1))));
        r3 = com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.$$B[15];
        r12 = new java.lang.Object[1];
        m(r3, r2[20], r3, r12);
        r1.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x16c8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x16c9, code lost:
    
        r8 = new java.lang.Object[1];
        k(10 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{11218, 21485, 13783, 21337, 52888, 54566, 39995, 7120, 63829, 18013}, r8);
        r3 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x16e5, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x16fc, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x1700, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x172f, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x1733, code lost:
    
        if (r1 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x1735, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 6617, 42 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x1762, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x176a, code lost:
    
        r11 = new java.lang.Object[]{-1926356303, java.lang.Long.valueOf(r3), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.os.Process.myPid() >> 22) + 6562, 56 - android.text.TextUtils.getTrimmedLength(""), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
        r4 = com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.$$B[15];
        r12 = new java.lang.Object[1];
        m(r4, r3[20], r4, r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x1bdf, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x1be0, code lost:
    
        r11 = new java.lang.Object[1];
        j(android.view.View.MeasureSpec.getMode(0) - 545606029, new char[]{63444, 41172, 59779, 19371, 29811, 21218, 59248, 12066, 15076, 55755, 44649}, new char[]{29545, 31414, 55263, 55800}, new char[]{0, 0, 0, 0}, (char) (((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952747_res_0x7f13046b).substring(22, 23).codePointAt(0) - 32), r11);
        r3 = (java.lang.String) r11[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x1c46, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x1c5d, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x1c61, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x1c90, code lost:
    
        r8 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x1c94, code lost:
    
        if (r8 == null) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x1c96, code lost:
    
        r8 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.view.KeyEvent.getDeadChar(0, 0) + 6618, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, (char) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x1cc0, code lost:
    
        r8 = ((java.lang.reflect.Method) r8).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x1cc7, code lost:
    
        r1 = com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.getRequestBeneficiariesState + 77;
        com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.getAsAtTimestamp = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x1cd2, code lost:
    
        r11 = new java.lang.Object[]{-1926356303, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(6561 - android.text.TextUtils.lastIndexOf("", '0'), 55 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16));
        r3 = com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.$$B[15];
        r12 = new java.lang.Object[1];
        m(r3, r2[20], r3, r12);
        r1.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r8, r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0abf A[Catch: all -> 0x0457, TryCatch #37 {all -> 0x0457, blocks: (B:151:0x0ab9, B:153:0x0abf, B:154:0x0aeb, B:662:0x305f, B:664:0x3065, B:665:0x308f, B:699:0x33a8, B:701:0x33ae, B:702:0x33cf, B:679:0x31e0, B:681:0x3203, B:682:0x3259, B:628:0x2d1e, B:630:0x2d24, B:631:0x2d53, B:518:0x25fa, B:520:0x2600, B:521:0x262e, B:523:0x2668, B:524:0x26b2, B:492:0x232c, B:494:0x2341, B:495:0x2371, B:724:0x34a6, B:726:0x34ac, B:727:0x34d9, B:729:0x3513, B:730:0x3559, B:461:0x1ee4, B:463:0x1ef9, B:464:0x1f25, B:466:0x1f59, B:467:0x1fcf, B:441:0x1c90, B:443:0x1c96, B:444:0x1cc0, B:355:0x172f, B:357:0x1735, B:358:0x1762, B:265:0x11ea, B:267:0x11f0, B:268:0x1220, B:219:0x0f61, B:221:0x0f67, B:222:0x0f8e, B:24:0x0229, B:26:0x022f, B:27:0x0259, B:29:0x03c0, B:31:0x03f2, B:32:0x0451), top: B:812:0x0229 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0b7e A[Catch: all -> 0x0edf, TryCatch #43 {all -> 0x0edf, blocks: (B:158:0x0b78, B:160:0x0b7e, B:161:0x0bc8, B:163:0x0bd5, B:165:0x0bde, B:166:0x0c1f, B:185:0x0dce, B:193:0x0e3d, B:199:0x0ec3, B:201:0x0ec9, B:202:0x0eca, B:204:0x0ecc, B:206:0x0ed3, B:207:0x0ed4, B:168:0x0c2b, B:175:0x0cb2, B:177:0x0cb8, B:178:0x0cfb, B:180:0x0d25, B:181:0x0d6d, B:183:0x0d83, B:184:0x0dc6, B:209:0x0ed6, B:211:0x0edd, B:212:0x0ede, B:195:0x0e43, B:189:0x0dff, B:191:0x0e05, B:192:0x0e36, B:170:0x0c4b, B:172:0x0c5d, B:173:0x0ca6), top: B:822:0x0b78, outer: #31, inners: #21, #29, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0bd5 A[Catch: all -> 0x0edf, TryCatch #43 {all -> 0x0edf, blocks: (B:158:0x0b78, B:160:0x0b7e, B:161:0x0bc8, B:163:0x0bd5, B:165:0x0bde, B:166:0x0c1f, B:185:0x0dce, B:193:0x0e3d, B:199:0x0ec3, B:201:0x0ec9, B:202:0x0eca, B:204:0x0ecc, B:206:0x0ed3, B:207:0x0ed4, B:168:0x0c2b, B:175:0x0cb2, B:177:0x0cb8, B:178:0x0cfb, B:180:0x0d25, B:181:0x0d6d, B:183:0x0d83, B:184:0x0dc6, B:209:0x0ed6, B:211:0x0edd, B:212:0x0ede, B:195:0x0e43, B:189:0x0dff, B:191:0x0e05, B:192:0x0e36, B:170:0x0c4b, B:172:0x0c5d, B:173:0x0ca6), top: B:822:0x0b78, outer: #31, inners: #21, #29, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0c2b A[Catch: all -> 0x0edf, TRY_LEAVE, TryCatch #43 {all -> 0x0edf, blocks: (B:158:0x0b78, B:160:0x0b7e, B:161:0x0bc8, B:163:0x0bd5, B:165:0x0bde, B:166:0x0c1f, B:185:0x0dce, B:193:0x0e3d, B:199:0x0ec3, B:201:0x0ec9, B:202:0x0eca, B:204:0x0ecc, B:206:0x0ed3, B:207:0x0ed4, B:168:0x0c2b, B:175:0x0cb2, B:177:0x0cb8, B:178:0x0cfb, B:180:0x0d25, B:181:0x0d6d, B:183:0x0d83, B:184:0x0dc6, B:209:0x0ed6, B:211:0x0edd, B:212:0x0ede, B:195:0x0e43, B:189:0x0dff, B:191:0x0e05, B:192:0x0e36, B:170:0x0c4b, B:172:0x0c5d, B:173:0x0ca6), top: B:822:0x0b78, outer: #31, inners: #21, #29, #33 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0de0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x1014  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x1039  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x1050 A[Catch: all -> 0x1116, TryCatch #36 {all -> 0x1116, blocks: (B:240:0x103b, B:242:0x1050, B:243:0x1083), top: B:810:0x103b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x1096 A[Catch: all -> 0x110c, TryCatch #30 {all -> 0x110c, blocks: (B:244:0x1089, B:246:0x1096, B:247:0x1104), top: B:799:0x1089, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x12ab A[Catch: all -> 0x16c8, TryCatch #26 {all -> 0x16c8, blocks: (B:272:0x12a5, B:274:0x12ab, B:275:0x12ed, B:277:0x12fa, B:279:0x1303, B:280:0x1343, B:304:0x1574, B:305:0x1578, B:307:0x157e, B:310:0x1597, B:313:0x15a4, B:317:0x15b4, B:318:0x15bc, B:330:0x16a2, B:332:0x16a8, B:333:0x16a9, B:335:0x16ab, B:337:0x16b2, B:338:0x16b3, B:281:0x134e, B:293:0x1458, B:295:0x145e, B:296:0x149d, B:298:0x14c7, B:300:0x150f, B:302:0x1526, B:303:0x156c, B:340:0x16b5, B:342:0x16bc, B:343:0x16bd, B:345:0x16bf, B:347:0x16c6, B:348:0x16c7, B:326:0x1621, B:321:0x15eb, B:323:0x15f1, B:324:0x1619, B:288:0x13bd, B:290:0x13d9, B:291:0x144c, B:283:0x136e, B:285:0x1383, B:286:0x13b6), top: B:792:0x12a5, outer: #31, inners: #0, #3, #9, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x12fa A[Catch: all -> 0x16c8, TryCatch #26 {all -> 0x16c8, blocks: (B:272:0x12a5, B:274:0x12ab, B:275:0x12ed, B:277:0x12fa, B:279:0x1303, B:280:0x1343, B:304:0x1574, B:305:0x1578, B:307:0x157e, B:310:0x1597, B:313:0x15a4, B:317:0x15b4, B:318:0x15bc, B:330:0x16a2, B:332:0x16a8, B:333:0x16a9, B:335:0x16ab, B:337:0x16b2, B:338:0x16b3, B:281:0x134e, B:293:0x1458, B:295:0x145e, B:296:0x149d, B:298:0x14c7, B:300:0x150f, B:302:0x1526, B:303:0x156c, B:340:0x16b5, B:342:0x16bc, B:343:0x16bd, B:345:0x16bf, B:347:0x16c6, B:348:0x16c7, B:326:0x1621, B:321:0x15eb, B:323:0x15f1, B:324:0x1619, B:288:0x13bd, B:290:0x13d9, B:291:0x144c, B:283:0x136e, B:285:0x1383, B:286:0x13b6), top: B:792:0x12a5, outer: #31, inners: #0, #3, #9, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x134e A[Catch: all -> 0x16c8, TRY_LEAVE, TryCatch #26 {all -> 0x16c8, blocks: (B:272:0x12a5, B:274:0x12ab, B:275:0x12ed, B:277:0x12fa, B:279:0x1303, B:280:0x1343, B:304:0x1574, B:305:0x1578, B:307:0x157e, B:310:0x1597, B:313:0x15a4, B:317:0x15b4, B:318:0x15bc, B:330:0x16a2, B:332:0x16a8, B:333:0x16a9, B:335:0x16ab, B:337:0x16b2, B:338:0x16b3, B:281:0x134e, B:293:0x1458, B:295:0x145e, B:296:0x149d, B:298:0x14c7, B:300:0x150f, B:302:0x1526, B:303:0x156c, B:340:0x16b5, B:342:0x16bc, B:343:0x16bd, B:345:0x16bf, B:347:0x16c6, B:348:0x16c7, B:326:0x1621, B:321:0x15eb, B:323:0x15f1, B:324:0x1619, B:288:0x13bd, B:290:0x13d9, B:291:0x144c, B:283:0x136e, B:285:0x1383, B:286:0x13b6), top: B:792:0x12a5, outer: #31, inners: #0, #3, #9, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x157e A[Catch: all -> 0x16c8, TryCatch #26 {all -> 0x16c8, blocks: (B:272:0x12a5, B:274:0x12ab, B:275:0x12ed, B:277:0x12fa, B:279:0x1303, B:280:0x1343, B:304:0x1574, B:305:0x1578, B:307:0x157e, B:310:0x1597, B:313:0x15a4, B:317:0x15b4, B:318:0x15bc, B:330:0x16a2, B:332:0x16a8, B:333:0x16a9, B:335:0x16ab, B:337:0x16b2, B:338:0x16b3, B:281:0x134e, B:293:0x1458, B:295:0x145e, B:296:0x149d, B:298:0x14c7, B:300:0x150f, B:302:0x1526, B:303:0x156c, B:340:0x16b5, B:342:0x16bc, B:343:0x16bd, B:345:0x16bf, B:347:0x16c6, B:348:0x16c7, B:326:0x1621, B:321:0x15eb, B:323:0x15f1, B:324:0x1619, B:288:0x13bd, B:290:0x13d9, B:291:0x144c, B:283:0x136e, B:285:0x1383, B:286:0x13b6), top: B:792:0x12a5, outer: #31, inners: #0, #3, #9, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x17eb A[Catch: all -> 0x1bdf, TryCatch #42 {all -> 0x1bdf, blocks: (B:362:0x17e5, B:364:0x17eb, B:365:0x1832, B:367:0x183f, B:369:0x1848, B:370:0x188a, B:393:0x1aa1, B:394:0x1aa5, B:396:0x1aab, B:399:0x1ac3, B:402:0x1ad0, B:404:0x1ad3, B:416:0x1bb9, B:418:0x1bbf, B:419:0x1bc0, B:421:0x1bc2, B:423:0x1bc9, B:424:0x1bca, B:371:0x1895, B:383:0x198f, B:385:0x1995, B:386:0x19d2, B:388:0x19fc, B:389:0x1a43, B:391:0x1a59, B:392:0x1a9b, B:426:0x1bcc, B:428:0x1bd3, B:429:0x1bd4, B:431:0x1bd6, B:433:0x1bdd, B:434:0x1bde, B:412:0x1b3d, B:407:0x1aff, B:409:0x1b05, B:410:0x1b35, B:378:0x1900, B:380:0x1915, B:381:0x1983, B:373:0x18b5, B:375:0x18ca, B:376:0x18f9), top: B:821:0x17e5, outer: #31, inners: #13, #20, #28, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x183f A[Catch: all -> 0x1bdf, TryCatch #42 {all -> 0x1bdf, blocks: (B:362:0x17e5, B:364:0x17eb, B:365:0x1832, B:367:0x183f, B:369:0x1848, B:370:0x188a, B:393:0x1aa1, B:394:0x1aa5, B:396:0x1aab, B:399:0x1ac3, B:402:0x1ad0, B:404:0x1ad3, B:416:0x1bb9, B:418:0x1bbf, B:419:0x1bc0, B:421:0x1bc2, B:423:0x1bc9, B:424:0x1bca, B:371:0x1895, B:383:0x198f, B:385:0x1995, B:386:0x19d2, B:388:0x19fc, B:389:0x1a43, B:391:0x1a59, B:392:0x1a9b, B:426:0x1bcc, B:428:0x1bd3, B:429:0x1bd4, B:431:0x1bd6, B:433:0x1bdd, B:434:0x1bde, B:412:0x1b3d, B:407:0x1aff, B:409:0x1b05, B:410:0x1b35, B:378:0x1900, B:380:0x1915, B:381:0x1983, B:373:0x18b5, B:375:0x18ca, B:376:0x18f9), top: B:821:0x17e5, outer: #31, inners: #13, #20, #28, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x1895 A[Catch: all -> 0x1bdf, TRY_LEAVE, TryCatch #42 {all -> 0x1bdf, blocks: (B:362:0x17e5, B:364:0x17eb, B:365:0x1832, B:367:0x183f, B:369:0x1848, B:370:0x188a, B:393:0x1aa1, B:394:0x1aa5, B:396:0x1aab, B:399:0x1ac3, B:402:0x1ad0, B:404:0x1ad3, B:416:0x1bb9, B:418:0x1bbf, B:419:0x1bc0, B:421:0x1bc2, B:423:0x1bc9, B:424:0x1bca, B:371:0x1895, B:383:0x198f, B:385:0x1995, B:386:0x19d2, B:388:0x19fc, B:389:0x1a43, B:391:0x1a59, B:392:0x1a9b, B:426:0x1bcc, B:428:0x1bd3, B:429:0x1bd4, B:431:0x1bd6, B:433:0x1bdd, B:434:0x1bde, B:412:0x1b3d, B:407:0x1aff, B:409:0x1b05, B:410:0x1b35, B:378:0x1900, B:380:0x1915, B:381:0x1983, B:373:0x18b5, B:375:0x18ca, B:376:0x18f9), top: B:821:0x17e5, outer: #31, inners: #13, #20, #28, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x1aab A[Catch: all -> 0x1bdf, TryCatch #42 {all -> 0x1bdf, blocks: (B:362:0x17e5, B:364:0x17eb, B:365:0x1832, B:367:0x183f, B:369:0x1848, B:370:0x188a, B:393:0x1aa1, B:394:0x1aa5, B:396:0x1aab, B:399:0x1ac3, B:402:0x1ad0, B:404:0x1ad3, B:416:0x1bb9, B:418:0x1bbf, B:419:0x1bc0, B:421:0x1bc2, B:423:0x1bc9, B:424:0x1bca, B:371:0x1895, B:383:0x198f, B:385:0x1995, B:386:0x19d2, B:388:0x19fc, B:389:0x1a43, B:391:0x1a59, B:392:0x1a9b, B:426:0x1bcc, B:428:0x1bd3, B:429:0x1bd4, B:431:0x1bd6, B:433:0x1bdd, B:434:0x1bde, B:412:0x1b3d, B:407:0x1aff, B:409:0x1b05, B:410:0x1b35, B:378:0x1900, B:380:0x1915, B:381:0x1983, B:373:0x18b5, B:375:0x18ca, B:376:0x18f9), top: B:821:0x17e5, outer: #31, inners: #13, #20, #28, #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:449:0x1d54  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x1dbd  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x1e13  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x1ec6  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x2108  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x2d24 A[Catch: all -> 0x0457, TryCatch #37 {all -> 0x0457, blocks: (B:151:0x0ab9, B:153:0x0abf, B:154:0x0aeb, B:662:0x305f, B:664:0x3065, B:665:0x308f, B:699:0x33a8, B:701:0x33ae, B:702:0x33cf, B:679:0x31e0, B:681:0x3203, B:682:0x3259, B:628:0x2d1e, B:630:0x2d24, B:631:0x2d53, B:518:0x25fa, B:520:0x2600, B:521:0x262e, B:523:0x2668, B:524:0x26b2, B:492:0x232c, B:494:0x2341, B:495:0x2371, B:724:0x34a6, B:726:0x34ac, B:727:0x34d9, B:729:0x3513, B:730:0x3559, B:461:0x1ee4, B:463:0x1ef9, B:464:0x1f25, B:466:0x1f59, B:467:0x1fcf, B:441:0x1c90, B:443:0x1c96, B:444:0x1cc0, B:355:0x172f, B:357:0x1735, B:358:0x1762, B:265:0x11ea, B:267:0x11f0, B:268:0x1220, B:219:0x0f61, B:221:0x0f67, B:222:0x0f8e, B:24:0x0229, B:26:0x022f, B:27:0x0259, B:29:0x03c0, B:31:0x03f2, B:32:0x0451), top: B:812:0x0229 }] */
    /* JADX WARN: Removed duplicated region for block: B:636:0x2de4  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x2e37  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x2e8c  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x303d  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x311c  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x3171  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x31c2  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x338a  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x346e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:852:? A[RETURN, SYNTHETIC] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit m11910$r8$lambda$FVPeIzLLrziLKX5gono7EgqMww(SfcServicePinActivity sfcServicePinActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 79;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return addObserver$lambda$5(sfcServicePinActivity, resource);
        }
        addObserver$lambda$5(sfcServicePinActivity, resource);
        throw null;
    }

    static {
        component4 = 0;
        copydefault();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = hashCode + 91;
        component4 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void biometricResult(boolean isFaceLogin, String pin) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 119;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
    }

    @Override
    public boolean showBiometric() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 97;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 49;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 17;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 93;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static void copydefault() {
        component1 = -3780477796495014671L;
        component3 = 1386857713;
        component2 = (char) 54942;
        ShareDataUIState = (char) 8525;
        copydefault = (char) 8747;
        copy = (char) 31615;
        equals = (char) 36967;
    }
}
