package com.huawei.digitalpayment.consumer.sfcui.components;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfc.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.addCallback;
import kotlin.cancelAll;
import kotlin.dispatchOnBackProgressed;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001b\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/ComposeBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "composableContent", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "heightFraction", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onCreateDialog", "Landroid/app/Dialog;", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeBottomSheetFragment extends BottomSheetDialogFragment {
    public static final int $stable;

    public static final Companion INSTANCE;
    private static long ShareDataUIState;
    private static char component1;
    private static char[] component3;
    private static int copy;
    private static final byte[] $$c = {4, -80, 45, 109};
    private static final int $$f = 10;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {115, Ascii.RS, 119, 102, -39, -25, -30, -26, -26, -18, -36, -33, 40, -39, -25, -30, -26, -26, -18, -36, -33, 38};
    private static final int $$e = 33;
    private static final byte[] $$a = {TarHeader.LF_NORMAL, -22, 122, 126, -26, -15, -23, -26, -12, -17, -13, -13, -5, -23, -20, TarHeader.LF_SYMLINK, -12, -29, 20, -33, -26, -18, 2, -28, -15, 36, -49, -23, -5, -15, -17, -8, -20, -6, -31, -5, -10, -28, Ascii.DC2, -47, 5, -33, 1};
    private static final int $$b = 255;
    private static int getAsAtTimestamp = 0;
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;
    private Function2<? super Composer, ? super Integer, Unit> copydefault = ComposableSingletons$ComposeBottomSheetFragmentKt.INSTANCE.m11411getLambda1$ConsumerSfcUI_release();
    private float component2 = 0.75f;

    private static String $$g(short s, byte b2, short s2) {
        int i = 4 - (s2 * 2);
        int i2 = s * 2;
        int i3 = 119 - b2;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i3 += -i;
            i++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i;
            i3 += -bArr[i];
            i = i7 + 1;
            i5 = i6;
        }
    }

    private static void a(int i, int i2, short s, Object[] objArr) {
        int i3 = 15 - (i * 3);
        byte[] bArr = $$a;
        int i4 = 103 - (s * 4);
        int i5 = i2 * 6;
        byte[] bArr2 = new byte[i5 + 4];
        int i6 = i5 + 3;
        int i7 = -1;
        if (bArr == null) {
            i7 = -1;
            i4 = (i6 + (-i3)) - 14;
            i3 = i3;
        }
        while (true) {
            int i8 = i7 + 1;
            int i9 = i3 + 1;
            bArr2[i8] = (byte) i4;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = i8;
            i4 = (i4 + (-bArr[i9])) - 14;
            i3 = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment.$$d
            int r7 = r7 * 4
            int r7 = 99 - r7
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r6 = r6 + 9
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-27)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment.d(int, byte, int, java.lang.Object[]):void");
    }

    public static final Function2 access$getComposableContent$p(ComposeBottomSheetFragment composeBottomSheetFragment) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        Function2<? super Composer, ? super Integer, Unit> function2 = composeBottomSheetFragment.copydefault;
        if (i4 != 0) {
            int i5 = 94 / 0;
        }
        int i6 = i3 + 123;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 66 / 0;
        }
        return function2;
    }

    public static final void access$setComposableContent$p(ComposeBottomSheetFragment composeBottomSheetFragment, Function2 function2) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 85;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        composeBottomSheetFragment.copydefault = function2;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$setHeightFraction$p(ComposeBottomSheetFragment composeBottomSheetFragment, float f) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 17;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        composeBottomSheetFragment.component2 = f;
        int i5 = i2 + 89;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int component1 = 0;
        private static int component3 = 1;

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 63;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 93;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            if (r11.getSkipping() == false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            r11.skipToGroupEnd();
            r11 = com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment.copydefault.component3 + 99;
            com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment.copydefault.component1 = r11 % 128;
            r11 = r11 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            if (r11.getSkipping() == false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component3(androidx.compose.runtime.Composer r11, int r12) {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                r12 = r12 & 11
                if (r12 != r0) goto L31
                int r12 = com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment.copydefault.component1
                int r12 = r12 + 109
                int r1 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment.copydefault.component3 = r1
                int r12 = r12 % r0
                if (r12 != 0) goto L1d
                boolean r12 = r11.getSkipping()
                r1 = 97
                int r1 = r1 / 0
                if (r12 != 0) goto L24
                goto L31
            L1d:
                boolean r12 = r11.getSkipping()
                if (r12 != 0) goto L24
                goto L31
            L24:
                r11.skipToGroupEnd()
                int r11 = com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment.copydefault.component3
                int r11 = r11 + 99
                int r12 = r11 % 128
                com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment.copydefault.component1 = r12
                int r11 = r11 % r0
                goto L53
            L31:
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment$copydefault$4 r12 = new com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment$copydefault$4
                com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment r6 = com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment.this
                r12.<init>()
                r6 = 54
                r7 = -1394535039(0xfffffffface11581, float:-6.397272E-12)
                r8 = 1
                androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r7, r8, r12, r11, r6)
                r6 = r12
                kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
                r8 = 1572864(0x180000, float:2.204052E-39)
                r9 = 63
                r7 = r11
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            L53:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.components.ComposeBottomSheetFragment.copydefault.component3(androidx.compose.runtime.Composer, int):void");
        }

        copydefault() {
        }

        public static void ShareDataUIState() {
            dispatchOnBackProgressed.component3[0] = addCallback.component2[0];
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/ComposeBottomSheetFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/huawei/digitalpayment/consumer/sfcui/components/ComposeBottomSheetFragment;", "heightFraction", "", "content", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(FLkotlin/jvm/functions/Function2;)Lcom/huawei/digitalpayment/consumer/sfcui/components/ComposeBottomSheetFragment;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static int ShareDataUIState = 0;
        public static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;

        private Companion() {
        }

        public static ComposeBottomSheetFragment newInstance$default(Companion companion, float f, Function2 function2, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component3;
                int i4 = i3 + 11;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 55;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                f = 0.75f;
            }
            return companion.newInstance(f, function2);
        }

        public final ComposeBottomSheetFragment newInstance(float heightFraction, Function2<? super Composer, ? super Integer, Unit> content) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(content, "");
            ComposeBottomSheetFragment composeBottomSheetFragment = new ComposeBottomSheetFragment();
            ComposeBottomSheetFragment.access$setComposableContent$p(composeBottomSheetFragment, content);
            ComposeBottomSheetFragment.access$setHeightFraction$p(composeBottomSheetFragment, heightFraction);
            int i2 = component3 + 83;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return composeBottomSheetFragment;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int ShareDataUIState() {
            int i = component1;
            int i2 = i % 6934248;
            component1 = i + 1;
            if (i2 != 0) {
                return ShareDataUIState;
            }
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            ShareDataUIState = startUptimeMillis;
            return startUptimeMillis;
        }
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = $10 + 21;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 3266, 32 - MotionEvent.axisFromString(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 60269), -834797019, false, $$g(b2, (byte) (b2 | 17), b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (ShareDataUIState ^ 5431355972723572778L);
                Object[] objArr3 = {notifyVar, notifyVar};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(0, 0) + 687, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 34, (char) (TextUtils.getOffsetBefore("", 0) + 60373), -1969106284, false, $$g(b3, (byte) (b3 | Ascii.SO), b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $10 + 97;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            Object[] objArr4 = {notifyVar, notifyVar};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
            if (objCopydefault3 == null) {
                byte b4 = (byte) 0;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 687, 34 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 60374), -1969106284, false, $$g(b4, (byte) (b4 | Ascii.SO), b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault == null) {
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 2405;
            int iResolveOpacity = 26 - Drawable.resolveOpacity(0, 0);
            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
            byte b2 = (byte) ($$b & 4);
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 - 4), $$a[42], objArr2);
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(capsMode, iResolveOpacity, packedPositionType, -2047739879, false, (String) objArr2[0], null);
        }
        if (((Field) objCopydefault).getLong(null) != -1) {
            int i2 = getRequestBeneficiariesState + 57;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault2 == null) {
                byte b3 = (byte) ($$b & 3);
                byte b4 = $$a[42];
                Object[] objArr3 = new Object[1];
                a(b3, b4, b4, objArr3);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 2405, 26 - TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 24929979, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b(new char[]{23, 3, 3, 21, 7, 23, 20, 3, '\b', CharUtils.CR, '\n', 15, 22, 17, 5, '\b'}, (byte) (119 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(new char[]{11, 16, 5, 4, 11, 7, CharUtils.CR, 11, 22, 24, 22, 7, 14, 3, 14, 6}, (byte) (View.MeasureSpec.getSize(0) + 68), View.resolveSizeAndState(0, 0, 0) + 16, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i4 = component4 + 23;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -619781769};
                Object[] objArr7 = new Object[1];
                c(37441 - (Process.myTid() >> 22), new char[]{29437, 57520, 22129, 50291, 15346, 43438, 8057, 36142, 57587, 22206, 50234, 14897, 43515, 8116, 36217, 58149, 22255, 50339, 14972, 43052, 8179, 36262, 58221, 20775, 50418, 15081, 43111, 7722, 36332, 58288, 20853, 50988, 15067, 43149, 7698, 35854, 58319, 20889, 51019, 13580, 43231, 7897, 35910, 57872, 20929, 51075, 13598, 43778, 7877, 35974, 57942, 20492, 51076, 13752, 43843, 6400, 36060, 57990, 20592, 50698, 13772, 43910, 6404, 36642, 58028, 20602, 50749, 13801, 43957, 6505}, objArr7);
                Class<?> cls2 = Class.forName(((String) objArr7[0]).intern());
                byte b5 = (byte) 0;
                byte b6 = b5;
                Object[] objArr8 = new Object[1];
                d(b5, b6, (byte) (b6 - 1), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault3 == null) {
                    int i6 = 2405 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int i7 = 26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    char cAlpha = (char) Color.alpha(0);
                    byte b7 = (byte) ($$b & 3);
                    byte b8 = $$a[42];
                    Object[] objArr9 = new Object[1];
                    a(b7, b8, b8, objArr9);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i6, i7, cAlpha, 24929979, false, (String) objArr9[0], null);
                }
                ((Field) objCopydefault3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(new char[]{20, 3, '\f', '\n', 1, '\t', CharUtils.CR, 6, 2, 19, '\t', 6, '\f', 15, 14, 7, '\b', '\f', 24, 2, 24, 4}, (byte) (Process.getGidForName("") + 19), 22 - Gravity.getAbsoluteGravity(0, 0), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(new char[]{7, 24, 24, 21, 19, 7, 16, 21, '\b', 24, 2, 17, 7, '\b', 13932}, (byte) ((Process.myTid() >> 22) + 109), 15 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault4 == null) {
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2405;
                        int absoluteGravity = 26 - Gravity.getAbsoluteGravity(0, 0);
                        char c2 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        byte b9 = (byte) ($$a[42] - 1);
                        byte b10 = (byte) (b9 + 4);
                        Object[] objArr12 = new Object[1];
                        a(b9, b10, (byte) (b10 - 4), objArr12);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(iNormalizeMetaState, absoluteGravity, c2, -1843538389, false, (String) objArr12[0], null);
                    }
                    ((Field) objCopydefault4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault5 == null) {
                        int i8 = 2406 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int i9 = 26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        char c3 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        byte b11 = (byte) ($$b & 4);
                        Object[] objArr13 = new Object[1];
                        a(b11, (byte) (b11 - 4), $$a[42], objArr13);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i8, i9, c3, -2047739879, false, (String) objArr13[0], null);
                    }
                    ((Field) objCopydefault5).set(null, lValueOf2);
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
        int i10 = ((int[]) objArr[0])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i10 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 6618, 42 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) Color.red(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                try {
                    Object[] objArr14 = {-185383339, Long.valueOf(j3), new ArrayList(), null, true};
                    Class cls4 = (Class) ITrustedWebActivityCallbackDefault.copydefault(MotionEvent.axisFromString("") + 6563, 56 - KeyEvent.normalizeMetaState(0), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr15 = new Object[1];
                    d(b12, b13, (byte) (b13 | 8), objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.TransparentBottomSheetDialog);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(inflater, "");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-138596322, true, new copydefault()));
        ComposeView composeView2 = composeView;
        int i2 = getRequestBeneficiariesState + 85;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return composeView2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void copydefault(ComposeBottomSheetFragment composeBottomSheetFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(composeBottomSheetFragment, "");
        Intrinsics.checkNotNull(dialogInterface, "");
        View viewFindViewById = ((BottomSheetDialog) dialogInterface).findViewById(com.google.android.material.R.id.design_bottom_sheet);
        if (viewFindViewById != null) {
            int i2 = component4 + 119;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            viewFindViewById.setBackgroundColor(0);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "");
            int i4 = (int) (composeBottomSheetFragment.getResources().getDisplayMetrics().heightPixels * composeBottomSheetFragment.component2);
            bottomSheetBehaviorFrom.setPeekHeight(i4);
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setDraggable(true);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = i4;
            viewFindViewById.setLayoutParams(layoutParams);
            int i5 = component4 + 5;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int i = 2 % 2;
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNull(dialogOnCreateDialog, "");
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialogOnCreateDialog;
        bottomSheetDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onShow(DialogInterface dialogInterface) {
                int i2 = 2 % 2;
                int i3 = copydefault + 93;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    ComposeBottomSheetFragment.m11415$r8$lambda$bM9fcEZt59gIt4UHG4zhGEOTUo(this.f$0, dialogInterface);
                    int i4 = 5 / 0;
                } else {
                    ComposeBottomSheetFragment.m11415$r8$lambda$bM9fcEZt59gIt4UHG4zhGEOTUo(this.f$0, dialogInterface);
                }
                int i5 = copydefault + 51;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        BottomSheetDialog bottomSheetDialog2 = bottomSheetDialog;
        int i2 = getRequestBeneficiariesState + 55;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return bottomSheetDialog2;
    }

    private static void b(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component3;
        char c2 = '0';
        long j = 0;
        int i4 = -303193356;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 7421, 14 - TextUtils.indexOf("", c2), (char) (64291 - Color.argb(0, 0, 0, 0)), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i5++;
                    c2 = '0';
                    j = 0;
                    i4 = -303193356;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component1)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - (Process.myPid() >> 22), 15 - View.MeasureSpec.getMode(0), (char) (TextUtils.getTrimmedLength("") + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i6 = $11 + 31;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 / b2);
                        int i7 = cancelall.component2;
                        cArr4[0] = (char) (cancelall.component3 + b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7117 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 15 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        int i8 = $11 + 31;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        try {
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2943 - TextUtils.indexOf((CharSequence) "", '0', 0), 23 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (TextUtils.getOffsetBefore("", 0) + 27637), 794909189, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i10 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i10];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i11 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i11];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                        } else {
                            int i13 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i13];
                            cArr4[cancelall.component2 + 1] = cArr2[i14];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static void m11415$r8$lambda$bM9fcEZt59gIt4UHG4zhGEOTUo(ComposeBottomSheetFragment composeBottomSheetFragment, DialogInterface dialogInterface) {
        int i = 2 % 2;
        int i2 = component4 + 77;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        copydefault(composeBottomSheetFragment, dialogInterface);
        int i4 = getRequestBeneficiariesState + 49;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        copy = 1;
        component3();
        ShareDataUIState();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = getAsAtTimestamp + 65;
        copy = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = component4 + 19;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        ShareDataUIState = -8209079930329894220L;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 111;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    static void component3() {
        component3 = new char[]{2030, 2038, 2024, 2023, 2031, 2003, 2025, 2029, 1966, 2021, 2041, 2020, 2036, 1987, 2034, 2018, 2002, 2035, 2026, 2019, 2032, 1992, 2028, 2017, 2027};
        component1 = (char) 12831;
    }
}
