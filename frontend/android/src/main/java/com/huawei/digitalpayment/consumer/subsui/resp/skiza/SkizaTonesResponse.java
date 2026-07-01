package com.huawei.digitalpayment.consumer.subsui.resp.skiza;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.common.base.Ascii;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Metadata;
import kotlin.cancel;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/resp/skiza/SkizaTonesResponse;", "Landroid/os/Parcelable;", "subscriptions", "", "Lcom/huawei/digitalpayment/consumer/subsui/resp/skiza/SkizaTone;", "<init>", "(Ljava/util/List;)V", "getSubscriptions", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SkizaTonesResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SkizaTonesResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @SerializedName("subscriptions")
    private final List<SkizaTone> subscriptions;

    public SkizaTonesResponse(List<SkizaTone> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.subscriptions = list;
    }

    public final List<SkizaTone> getSubscriptions() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.subscriptions;
        }
        throw null;
    }

    static {
        int i = component2 + 29;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SkizaTonesResponse copy$default(SkizaTonesResponse skizaTonesResponse, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 33;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            list = skizaTonesResponse.subscriptions;
            int i6 = i3 + 39;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        return skizaTonesResponse.copy(list);
    }

    public final List<SkizaTone> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<SkizaTone> list = this.subscriptions;
        int i5 = i3 + 79;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SkizaTonesResponse copy(List<SkizaTone> subscriptions) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(subscriptions, "");
        SkizaTonesResponse skizaTonesResponse = new SkizaTonesResponse(subscriptions);
        int i2 = ShareDataUIState + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return skizaTonesResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 66 / 0;
        }
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 97;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SkizaTonesResponse)) {
            int i4 = component3 + 69;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.subscriptions, ((SkizaTonesResponse) other).subscriptions)) {
            return true;
        }
        int i6 = ShareDataUIState + 31;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        List<SkizaTone> list = this.subscriptions;
        if (i3 != 0) {
            return list.hashCode();
        }
        list.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SkizaTonesResponse(subscriptions=" + this.subscriptions + ")";
        int i2 = ShareDataUIState + 79;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<SkizaTone> list = this.subscriptions;
        dest.writeInt(list.size());
        Iterator<SkizaTone> it = list.iterator();
        while (it.hasNext()) {
            int i2 = ShareDataUIState + 79;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                it.next().writeToParcel(dest, flags);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            it.next().writeToParcel(dest, flags);
            int i3 = component3 + 69;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SkizaTonesResponse> {
        private static final byte[] $$a = {1, -53, Ascii.US, 101};
        private static final int $$b = 250;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int getRequestBeneficiariesState = 0;
        private static int component4 = 1;
        private static int component3 = -890926382;
        private static char[] ShareDataUIState = {30231, 30229, 30218, 30254, 30233, 30235, 30227, 30253, 30220, 30216, 30234, 30223, 30225, 30412, 30222, 30221, 30219, 30213, 30246, 30405, 30414, 30401, 30264, 30209, 30265};
        private static int component2 = 321287934;
        private static boolean component1 = true;
        private static boolean copydefault = true;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$c(int r5, short r6, short r7) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.subsui.resp.skiza.SkizaTonesResponse.Creator.$$a
                int r7 = r7 * 4
                int r7 = r7 + 4
                int r5 = 73 - r5
                int r6 = r6 * 2
                int r1 = r6 + 1
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r6
                r4 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                return r5
            L22:
                r3 = r0[r7]
            L24:
                int r7 = r7 + 1
                int r5 = r5 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.subsui.resp.skiza.SkizaTonesResponse.Creator.$$c(int, short, short):java.lang.String");
        }

        private static void a(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
            char[] cArr2;
            int i4 = 2 % 2;
            ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
            char[] cArr3 = new char[i];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            int i5 = $11 + 19;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                int i7 = $10 + 99;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
                cArr3[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
                int i9 = iTrustedWebActivityServiceStub.ShareDataUIState;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i9]), Integer.valueOf(component3)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                    if (objCopydefault == null) {
                        byte b2 = (byte) ($$a[0] - 1);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3784 - (KeyEvent.getMaxKeyCode() >> 16), (-16777178) - Color.rgb(0, 0, 0), (char) (TextUtils.getCapsMode("", 0, 0) + 26860), 2015799920, false, $$c((byte) ($$b & 12), b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7407 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 17, (char) KeyEvent.keyCodeFromString(""), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
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
                iTrustedWebActivityServiceStub.component1 = i2;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
                System.arraycopy(cArr4, iTrustedWebActivityServiceStub.component1, cArr3, 0, i - iTrustedWebActivityServiceStub.component1);
            }
            if (!(!z)) {
                int i10 = $10 + 85;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr2 = new char[i];
                    iTrustedWebActivityServiceStub.ShareDataUIState = 1;
                } else {
                    cArr2 = new char[i];
                    iTrustedWebActivityServiceStub.ShareDataUIState = 0;
                }
                while (iTrustedWebActivityServiceStub.ShareDataUIState < i) {
                    cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr3[(i - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7406, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 15, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                }
                int i11 = $11 + 43;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                cArr3 = cArr2;
            }
            objArr[0] = new String(cArr3);
        }

        private static void b(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2;
            int i4 = 2 % 2;
            cancel cancelVar = new cancel();
            char[] cArr2 = ShareDataUIState;
            long j = 0;
            float f = 0.0f;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    int i6 = $11 + 91;
                    $10 = i6 % 128;
                    if (i6 % i3 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                            if (objCopydefault == null) {
                                byte b2 = (byte) 5;
                                byte b3 = (byte) (b2 - 5);
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3761 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 24, (char) View.MeasureSpec.getSize(0), -1670574543, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                            i5 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 5;
                            byte b5 = (byte) (b4 - 5);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3759, (-16777192) - Color.rgb(0, 0, 0), (char) View.combineMeasuredStates(0, 0), -1670574543, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                        i5++;
                    }
                    i3 = 2;
                    j = 0;
                    f = 0.0f;
                }
                cArr2 = cArr3;
            }
            try {
                Object[] objArr4 = {Integer.valueOf(component2)};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7141 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 13, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 1487437377, false, "C", new Class[]{Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                if (!(!copydefault)) {
                    int i7 = $10 + 103;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cancelVar.component1 = bArr.length;
                        i2 = cancelVar.component1;
                    } else {
                        cancelVar.component1 = bArr.length;
                        i2 = cancelVar.component1;
                    }
                    char[] cArr4 = new char[i2];
                    cancelVar.component3 = 0;
                    while (cancelVar.component3 < cancelVar.component1) {
                        cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                        Object[] objArr5 = {cancelVar, cancelVar};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault4 == null) {
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2748;
                            int maximumFlingVelocity = 19 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 7644);
                            byte b6 = (byte) ($$a[0] - 1);
                            byte b7 = b6;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, maximumFlingVelocity, keyRepeatDelay, -327556343, false, $$c(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault4).invoke(null, objArr5);
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!component1) {
                    cancelVar.component1 = iArr.length;
                    char[] cArr5 = new char[cancelVar.component1];
                    cancelVar.component3 = 0;
                    while (cancelVar.component3 < cancelVar.component1) {
                        cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                        cancelVar.component3++;
                    }
                    String str = new String(cArr5);
                    int i8 = $11 + 13;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    objArr[0] = str;
                    return;
                }
                cancelVar.component1 = cArr.length;
                char[] cArr6 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i10 = $11 + 95;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr6[cancelVar.component3] = (char) (cArr2[cArr[cancelVar.component1 >> cancelVar.component3] - i] >> iIntValue);
                        Object[] objArr6 = {cancelVar, cancelVar};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault5 == null) {
                            int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2748;
                            int iRgb = Color.rgb(0, 0, 0) + 16777235;
                            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 7644);
                            byte b8 = (byte) ($$a[0] - 1);
                            byte b9 = b8;
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity2, iRgb, threadPriority, -327556343, false, $$c(b8, b9, b9), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault5).invoke(null, objArr6);
                    } else {
                        cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                        Object[] objArr7 = {cancelVar, cancelVar};
                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                        if (objCopydefault6 == null) {
                            int iIndexOf = 2748 - TextUtils.indexOf("", "");
                            int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 20;
                            char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7643);
                            byte b10 = (byte) ($$a[0] - 1);
                            byte b11 = b10;
                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, i11, c2, -327556343, false, $$c(b10, b11, b11), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault6).invoke(null, objArr7);
                    }
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SkizaTonesResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 0;
            while (i3 != i2) {
                int i4 = getRequestBeneficiariesState + 69;
                component4 = i4 % 128;
                if (i4 % 2 == 0) {
                    arrayList.add(SkizaTone.CREATOR.createFromParcel(parcel));
                    i3 += 100;
                } else {
                    arrayList.add(SkizaTone.CREATOR.createFromParcel(parcel));
                    i3++;
                }
            }
            SkizaTonesResponse skizaTonesResponse = new SkizaTonesResponse(arrayList);
            int i5 = component4 + 121;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return skizaTonesResponse;
        }

        @Override
        public SkizaTonesResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 99;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SkizaTonesResponse skizaTonesResponseCreateFromParcel = createFromParcel(parcel);
            int i3 = getRequestBeneficiariesState + 19;
            component4 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 44 / 0;
            }
            return skizaTonesResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SkizaTonesResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component4;
            int i4 = i3 + 13;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            SkizaTonesResponse[] skizaTonesResponseArr = new SkizaTonesResponse[i];
            int i6 = i3 + 79;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 == 0) {
                return skizaTonesResponseArr;
            }
            throw null;
        }

        @Override
        public SkizaTonesResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = getRequestBeneficiariesState + 57;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            SkizaTonesResponse[] skizaTonesResponseArrNewArray = newArray(i);
            int i5 = getRequestBeneficiariesState + 73;
            component4 = i5 % 128;
            if (i5 % 2 != 0) {
                return skizaTonesResponseArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0de3  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0df4  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0e2f  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0e40  */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v38 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object[] component2(android.content.Context r30, int r31, int r32) {
            /*
                Method dump skipped, instruction units count: 4401
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.subsui.resp.skiza.SkizaTonesResponse.Creator.component2(android.content.Context, int, int):java.lang.Object[]");
        }
    }
}
