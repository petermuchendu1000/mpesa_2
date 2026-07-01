package com.safaricom.android.design.templates.dropdowninput;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.safaricom.android.design.templates.commons.model.InputErrorData;
import com.safaricom.android.design.templates.dropdowninput.model.DropdownItem;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.getActiveNotifications;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\u0013\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f¨\u0006!"}, d2 = {"Lcom/safaricom/android/design/templates/dropdowninput/DropdownInputViewModel;", "T", "Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_options", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "options", "Lkotlinx/coroutines/flow/StateFlow;", "getOptions", "()Lkotlinx/coroutines/flow/StateFlow;", "_selectedItem", "selectedItem", "getSelectedItem", "_errorData", "Lcom/safaricom/android/design/templates/commons/model/InputErrorData;", "errorData", "getErrorData", "_isValid", "", "isValid", "setOptions", "", FirebaseAnalytics.Param.ITEMS, "selectItem", "item", "(Lcom/safaricom/android/design/templates/dropdowninput/model/DropdownItem;)V", "clearSelection", "showError", "message", "", "ConsumerSfcDropdownInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DropdownInputViewModel<T extends DropdownItem> extends ViewModel {
    public static final int $stable = 8;
    private static int[] component4;
    private static int getShareableDataState;
    private final MutableStateFlow<List<T>> ShareDataUIState;
    private final StateFlow<InputErrorData> component1;
    private final MutableStateFlow<Boolean> component2;
    private final MutableStateFlow<T> component3;
    private final MutableStateFlow<InputErrorData> copydefault;
    private final StateFlow<Boolean> equals;
    private final StateFlow<T> getAsAtTimestamp;
    private final StateFlow<List<T>> getRequestBeneficiariesState;
    private static final byte[] $$c = {118, 33, 67, 92};
    private static final int $$f = 75;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {79, -7, -1, -17, -7, SignedBytes.MAX_POWER_OF_TWO, -62, -10, 4, -4, 67, -59, -13, -1, 3, 65, -67, Ascii.SO, -18, -2, 9, -6, 6, 56, -35, -18, -18, -2, 13, Ascii.US, -52, 20, -3, -12, -5, 10, -7, 0, -13, -2, -10, 20, -2, -2, 4, -21, 8, -9};
    private static final int $$e = 97;
    private static final byte[] $$a = {19, TarHeader.LF_SYMLINK, -9, 119, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -49, Ascii.FS, 17, Ascii.EM, -5, 17, 17, Ascii.VT, 36, 7, Ascii.CAN, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1};
    private static final int $$b = 164;
    private static int hashCode = 0;
    private static int ArtificialStackFrames = 1;
    private static int copy = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r5, short r6, short r7) {
        /*
            byte[] r0 = com.safaricom.android.design.templates.dropdowninput.DropdownInputViewModel.$$c
            int r5 = r5 * 2
            int r1 = 1 - r5
            int r7 = r7 + 4
            int r6 = r6 + 104
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L15
            r3 = r6
            r4 = r2
            r6 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r3 = r0[r7]
        L27:
            int r6 = r6 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.android.design.templates.dropdowninput.DropdownInputViewModel.$$g(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = 22 - r6
            int r0 = r7 + 10
            int r5 = r5 * 16
            int r5 = 99 - r5
            byte[] r1 = com.safaricom.android.design.templates.dropdowninput.DropdownInputViewModel.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 9
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r1[r6]
        L28:
            int r5 = r5 + r3
            int r5 = r5 + (-16)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.android.design.templates.dropdowninput.DropdownInputViewModel.a(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 6
            int r6 = 105 - r6
            int r8 = r8 * 34
            int r8 = 38 - r8
            byte[] r0 = com.safaricom.android.design.templates.dropdowninput.DropdownInputViewModel.$$d
            int r7 = r7 * 24
            int r7 = r7 + 11
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            int r8 = r8 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.android.design.templates.dropdowninput.DropdownInputViewModel.c(short, int, int, java.lang.Object[]):void");
    }

    public DropdownInputViewModel() {
        MutableStateFlow<List<T>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.ShareDataUIState = MutableStateFlow;
        this.getRequestBeneficiariesState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<T> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.component3 = MutableStateFlow2;
        this.getAsAtTimestamp = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<InputErrorData> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow3;
        this.component1 = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(false);
        this.component2 = MutableStateFlow4;
        this.equals = FlowKt.asStateFlow(MutableStateFlow4);
    }

    public final StateFlow<List<T>> getOptions() {
        int i = 2 % 2;
        int i2 = hashCode + 115;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        StateFlow<List<T>> stateFlow = this.getRequestBeneficiariesState;
        int i5 = i3 + 89;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateFlow<T> getSelectedItem() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 27;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        StateFlow<T> stateFlow = this.getAsAtTimestamp;
        int i5 = i3 + 65;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<InputErrorData> getErrorData() {
        int i = 2 % 2;
        int i2 = hashCode + 107;
        int i3 = i2 % 128;
        ArtificialStackFrames = i3;
        int i4 = i2 % 2;
        StateFlow<InputErrorData> stateFlow = this.component1;
        int i5 = i3 + 125;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<Boolean> isValid() {
        StateFlow<Boolean> stateFlow;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 117;
        int i3 = i2 % 128;
        hashCode = i3;
        if (i2 % 2 != 0) {
            stateFlow = this.equals;
            int i4 = 12 / 0;
        } else {
            stateFlow = this.equals;
        }
        int i5 = i3 + 121;
        ArtificialStackFrames = i5 % 128;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        throw null;
    }

    public final void setOptions(List<? extends T> items) {
        int i = 2 % 2;
        int i2 = hashCode + 115;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(items, "");
        this.ShareDataUIState.setValue(items);
        int i4 = ArtificialStackFrames + 53;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void selectItem(T item) {
        int i = 2 % 2;
        int i2 = hashCode + 49;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(item, "");
            this.component3.setValue(item);
            this.component2.setValue(true);
        } else {
            Intrinsics.checkNotNullParameter(item, "");
            this.component3.setValue(item);
            this.component2.setValue(true);
        }
        this.copydefault.setValue(null);
        int i3 = ArtificialStackFrames + 29;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void clearSelection() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 73;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        this.component3.setValue(null);
        this.component2.setValue(false);
        int i4 = ArtificialStackFrames + 35;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int[] iArr2;
        int length;
        int[] iArr3;
        int i2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = component4;
        int i4 = 684241640;
        int i5 = 1;
        int i6 = 0;
        if (iArr4 != null) {
            int i7 = $11 + 85;
            int i8 = i7 % 128;
            $10 = i8;
            if (i7 % 2 != 0) {
                length = iArr4.length;
                iArr3 = new int[length];
                i2 = 1;
            } else {
                length = iArr4.length;
                iArr3 = new int[length];
                i2 = 0;
            }
            int i9 = i8 + 35;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 5 / 4;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i6] = Integer.valueOf(iArr4[i2]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i6;
                        byte b3 = (byte) (b2 + 2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', i6, i6) + 4392, 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), -309236339, false, $$g(b2, b3, (byte) (b3 - 3)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i2] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i2++;
                    i4 = 684241640;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length2 = iArr4.length;
        int[] iArr5 = new int[length2];
        int[] iArr6 = component4;
        if (iArr6 != null) {
            int i11 = $10 + 115;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr6.length;
            int[] iArr7 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                try {
                    Object[] objArr3 = new Object[i5];
                    objArr3[0] = Integer.valueOf(iArr6[i13]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 2);
                        iArr2 = iArr6;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 4390, 37 - View.MeasureSpec.getSize(0), (char) (Process.getGidForName("") + 1), -309236339, false, $$g(b4, b5, (byte) (b5 - 3)), new Class[]{Integer.TYPE});
                    } else {
                        iArr2 = iArr6;
                    }
                    iArr7[i13] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i13++;
                    int i14 = $11 + 85;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    iArr6 = iArr2;
                    i5 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i16 = $10 + 19;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            iArr6 = iArr7;
        }
        char c2 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length2);
        getactivenotifications.component1 = 0;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[c2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            for (int i18 = 0; i18 < 16; i18++) {
                getactivenotifications.ShareDataUIState ^= iArr5[i18];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2967 - Process.getGidForName(""), TextUtils.indexOf((CharSequence) "", '0', 0) + 17, (char) (Process.getGidForName("") + 49872), 462826032, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
            }
            int i19 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i19;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i20 = getactivenotifications.ShareDataUIState;
            int i21 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = (byte) (b8 + 3);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2943 - MotionEvent.axisFromString(""), (-16777192) - Color.rgb(0, 0, 0), (char) (27637 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), -1616366948, false, $$g(b8, b9, (byte) (b9 - 4)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            c2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0225  */
    /* JADX WARN: Type inference failed for: r5v55, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showError(java.lang.String r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.safaricom.android.design.templates.dropdowninput.DropdownInputViewModel.showError(java.lang.String):void");
    }

    static {
        getShareableDataState = 1;
        component3();
        int i = copy + 1;
        getShareableDataState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    static void component3() {
        component4 = new int[]{-751583483, 1124500294, -1472868049, -1588374250, -456548070, 2021504547, -882732598, 666923755, 1209541891, -634233782, -1877944639, 1278411889, -165119696, -253171629, 1566394545, -874845467, 15226187, 1025470136};
    }
}
