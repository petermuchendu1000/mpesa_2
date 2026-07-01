package com.huawei.digitalpayment.consumer.sfcui.helper;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.core.common.monitor.UrlContentDecoderMonitorHelper;
import com.google.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState;", "T", "", "<init>", "()V", "Loading", "Success", "SuccessWithError", "Error", "Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState$Error;", "Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState$Loading;", "Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState$Success;", "Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState$SuccessWithError;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UIState<T> {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component2;

    private UIState() {
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH×\u0003J\t\u0010\t\u001a\u00020\nH×\u0001J\t\u0010\u000b\u001a\u00020\fH×\u0001¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState$Loading;", "Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState;", "", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Loading extends UIState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;

        private Loading() {
            super(null);
        }

        static {
            int i = copydefault + 95;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = ShareDataUIState + 61;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof Loading) {
                return true;
            }
            int i4 = ShareDataUIState + 33;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 5;
            int i3 = i2 % 128;
            component3 = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 125;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return -2103308505;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component3 + 61;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return "Loading";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = 1 + 9;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 29 / 0;
        }
    }

    public UIState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÇ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState$Success;", "T", "Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState;", "data", "<init>", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success<T> extends UIState<T> {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private final T copydefault;

        public Success(T t) {
            super(null);
            this.copydefault = t;
        }

        public final T getData() {
            int i = 2 % 2;
            int i2 = component3 + 115;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            T t = this.copydefault;
            int i5 = i3 + 13;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return t;
        }

        static {
            int i = 1 + 103;
            component2 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Success copy$default(Success success, Object obj, int i, Object obj2) {
            int i2 = 2 % 2;
            int i3 = component3 + 5;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 27;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    T t = success.copydefault;
                    throw null;
                }
                obj = success.copydefault;
            }
            return success.copy(obj);
        }

        public final T component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 19;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            T t = this.copydefault;
            int i5 = i2 + 11;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return t;
        }

        public final Success<T> copy(T data) {
            int i = 2 % 2;
            Success<T> success = new Success<>(data);
            int i2 = component3 + 79;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return success;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3 + 15;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            if (Intrinsics.areEqual(this.copydefault, ((Success) other).copydefault)) {
                return true;
            }
            int i4 = component3 + 37;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 19;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            T t = this.copydefault;
            if (t == null) {
                int i5 = i2 + 75;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = t.hashCode();
            }
            int i7 = ShareDataUIState + 21;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Success(data=" + this.copydefault + ")";
            int i2 = component3 + 121;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 54 / 0;
            }
            return str;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState$SuccessWithError;", "T", "Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState;", "data", "error", "Lcom/alibaba/griver/core/common/monitor/UrlContentDecoderMonitorHelper$ErrorType;", "<init>", "(Ljava/lang/Object;Lcom/alibaba/griver/core/common/monitor/UrlContentDecoderMonitorHelper$ErrorType;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/alibaba/griver/core/common/monitor/UrlContentDecoderMonitorHelper$ErrorType;", "component1", "component2", "copy", "(Ljava/lang/Object;Lcom/alibaba/griver/core/common/monitor/UrlContentDecoderMonitorHelper$ErrorType;)Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState$SuccessWithError;", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuccessWithError<T> extends UIState<T> {
        public static final int $stable = 0;
        private static int component2;
        private static char[] component3;
        private static long copydefault;
        private final UrlContentDecoderMonitorHelper.ErrorType ShareDataUIState;
        private final T component1;
        private static final byte[] $$c = {70, -47, -65, TarHeader.LF_BLK};
        private static final int $$d = 238;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {TarHeader.LF_CHR, -39, 98, -44, -38, -24, -29, -25, -25, -17, -35, -32, 39};
        private static final int $$b = 50;
        private static int getAsAtTimestamp = 0;
        private static int getRequestBeneficiariesState = 1;
        private static int equals = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(byte r6, short r7, int r8) {
            /*
                int r8 = 122 - r8
                int r7 = r7 * 2
                int r0 = 1 - r7
                byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.helper.UIState.SuccessWithError.$$c
                int r6 = r6 * 4
                int r6 = r6 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2c
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                return r6
            L23:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r6 = -r6
                int r6 = r6 + r3
                int r8 = r8 + 1
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.helper.UIState.SuccessWithError.$$e(byte, short, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(int r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 4
                int r6 = r6 + 4
                int r8 = r8 * 3
                int r0 = 10 - r8
                int r7 = r7 * 4
                int r7 = 99 - r7
                byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.helper.UIState.SuccessWithError.$$a
                byte[] r0 = new byte[r0]
                int r8 = 9 - r8
                r2 = 0
                if (r1 != 0) goto L19
                r7 = r6
                r4 = r8
                r3 = r2
                goto L2e
            L19:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L1d:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2a:
                r4 = r1[r7]
                int r3 = r3 + 1
            L2e:
                int r4 = -r4
                int r6 = r6 + r4
                int r6 = r6 + (-26)
                int r7 = r7 + 1
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.helper.UIState.SuccessWithError.b(int, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuccessWithError(T t, UrlContentDecoderMonitorHelper.ErrorType errorType) {
            super(null);
            Intrinsics.checkNotNullParameter(errorType, "");
            this.component1 = t;
            this.ShareDataUIState = errorType;
        }

        public final T getData() {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 7;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            T t = this.component1;
            int i5 = i3 + 33;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 85 / 0;
            }
            return t;
        }

        public final UrlContentDecoderMonitorHelper.ErrorType getError() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 1;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                return this.ShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            cancelNotification cancelnotification = new cancelNotification();
            long[] jArr = new long[i];
            cancelnotification.copydefault = 0;
            int i4 = $10 + 107;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            while (cancelnotification.copydefault < i) {
                int i6 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(component3[i2 + i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 1758, (-16777182) - Color.rgb(0, 0, 0), (char) (Process.myTid() >> 22), 1159210934, false, $$e(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(copydefault), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 3608, 28 - TextUtils.lastIndexOf("", '0', 0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7171), 1951385784, false, $$e(b4, b5, (byte) (b5 + 5)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b6 = (byte) 0;
                        byte b7 = b6;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, (char) (27761 - TextUtils.getOffsetBefore("", 0)), -1529629956, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i];
            cancelnotification.copydefault = 0;
            while (cancelnotification.copydefault < i) {
                int i7 = $11 + 125;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getJumpTapTimeout() >> 16) + 4013, 24 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-16749455) - Color.rgb(0, 0, 0)), -1529629956, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        public final UrlContentDecoderMonitorHelper.ErrorType component2() throws Throwable {
            int i;
            int i2;
            long j;
            int i3 = 2 % 2;
            int i4 = getAsAtTimestamp + 63;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-609868791);
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - Color.blue(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 19696), 520092524, false, "component2", null);
            }
            int i6 = ((Field) objCopydefault).getInt(null);
            Object[] objArr = new Object[1];
            a(ImageFormat.getBitsPerPixel(0) + 23, Color.alpha(0), (char) (TextUtils.indexOf("", "", 0, 0) + 60177), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 14, 22 - Color.blue(0), (char) (TextUtils.lastIndexOf("", '0') + 1), objArr2);
            long j2 = -721;
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).longValue() & (-1024);
            long jMaxMemory = (int) Runtime.getRuntime().maxMemory();
            long j3 = -1;
            long j4 = j3 ^ 1194662963414538307L;
            long j5 = j3 ^ 3261060133191972018L;
            long j6 = 4455713611037015283L ^ j3;
            long j7 = (j2 * 1194662963414538307L) + (j2 * 3261060133191972018L) + (((long) 1444) * ((jMaxMemory ^ j3) | ((j4 | j5) ^ j3) | j6)) + (((long) (-1444)) * (j6 | ((jMaxMemory | 1194662963414538307L) ^ j3) | ((jMaxMemory | 3261060133191972018L) ^ j3))) + (((long) 722) * ((j3 ^ (j5 | 1194662963414538307L)) | ((j4 | 3261060133191972018L) ^ j3)));
            int i7 = 0;
            while (true) {
                if (i7 != 10) {
                    int i8 = getAsAtTimestamp + 85;
                    getRequestBeneficiariesState = i8 % 128;
                    if (i8 % 2 == 0) {
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                        if (objCopydefault2 == null) {
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(36 - ((byte) KeyEvent.getModifierMetaStateMask()), 30 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 846241313, false, "copydefault", null);
                        }
                        i = ((Field) objCopydefault2).getInt(null);
                        j = jLongValue;
                        i2 = 1;
                    } else {
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-148291260);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.US, (char) ((-1) - MotionEvent.axisFromString("")), 846241313, false, "copydefault", null);
                        }
                        i = ((Field) objCopydefault3).getInt(null);
                        i2 = 0;
                        j = jLongValue;
                    }
                    while (true) {
                        for (int i9 = 0; i9 != 8; i9++) {
                            i = (((((int) (j >> i9)) & 255) + (i << 6)) + (i << 16)) - i;
                        }
                        if (i2 != 0) {
                            break;
                        }
                        i2++;
                        j = j7;
                    }
                    if (i == i6) {
                        break;
                    }
                    int i10 = getRequestBeneficiariesState + 105;
                    getAsAtTimestamp = i10 % 128;
                    if (i10 % 2 != 0) {
                        jLongValue -= 1024;
                        i7 += 110;
                    } else {
                        jLongValue -= 1024;
                        i7++;
                    }
                } else {
                    Object[] objArr3 = new Object[1];
                    a(17 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), View.getDefaultSize(0, 0) + 37, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 18042), objArr3);
                    Class<?> cls2 = Class.forName((String) objArr3[0]);
                    Object[] objArr4 = new Object[1];
                    a(15 - ImageFormat.getBitsPerPixel(0), Color.argb(0, 0, 0, 0) + 53, (char) KeyEvent.getDeadChar(0, 0), objArr4);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr5 = {-513478632};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-22556863);
                        if (objCopydefault4 == null) {
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1663 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 11, (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1006506020, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 790087849, ((Constructor) objCopydefault4).newInstance(objArr5), false};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1259975545);
                        if (objCopydefault5 == null) {
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1455;
                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22;
                            char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            Object[] objArr7 = new Object[1];
                            b(b2, b3, b3, objArr7);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, scrollBarFadeDuration, packedPositionType, 1908380642, false, (String) objArr7[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, (Class) ITrustedWebActivityCallbackDefault.copydefault(1591 - (ViewConfiguration.getLongPressTimeout() >> 16), View.resolveSize(0, 0) + 39, (char) (ViewConfiguration.getFadingEdgeLength() >> 16)), Boolean.TYPE});
                        }
                        Object[] objArr8 = (Object[]) ((Method) objCopydefault5).invoke(null, objArr6);
                        int i11 = ((int[]) objArr8[2])[0];
                        int i12 = ((int[]) objArr8[1])[0];
                        if (i12 != i11) {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr8[3];
                            if (strArr != null) {
                                int i13 = getAsAtTimestamp + 119;
                                getRequestBeneficiariesState = i13 % 128;
                                int i14 = i13 % 2;
                                for (String str : strArr) {
                                    arrayList.add(str);
                                }
                            }
                            long j8 = i12 ^ i11;
                            long j9 = -1;
                            long j10 = 0;
                            long j11 = (((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32))) & j8) | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                            if (objCopydefault6 == null) {
                                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 6618, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                            }
                            Object objInvoke = ((Method) objCopydefault6).invoke(null, null);
                            Object[] objArr9 = {-513478632, Long.valueOf(j11), arrayList, null, false, false};
                            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                            if (objCopydefault7 == null) {
                                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getKeyRepeatDelay() >> 16) + 6562, TextUtils.indexOf((CharSequence) "", '0') + 57, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                            }
                            ((Method) objCopydefault7).invoke(objInvoke, objArr9);
                            int[] iArr = new int[i12];
                            int i15 = i12 - 1;
                            iArr[i15] = 1;
                            Toast.makeText((Context) null, iArr[((i15 * i12) % 2) - 1], 1).show();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
            return this.ShareDataUIState;
        }

        static {
            component2 = 0;
            component3();
            int i = equals + 55;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SuccessWithError copy$default(SuccessWithError successWithError, Object obj, UrlContentDecoderMonitorHelper.ErrorType errorType, int i, Object obj2) {
            int i2 = 2 % 2;
            int i3 = getRequestBeneficiariesState;
            int i4 = i3 + 3;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
                obj = successWithError.component1;
                int i5 = i3 + 19;
                getAsAtTimestamp = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 3 / 4;
                }
            }
            if ((i & 2) != 0) {
                int i7 = i3 + 75;
                getAsAtTimestamp = i7 % 128;
                int i8 = i7 % 2;
                errorType = successWithError.ShareDataUIState;
            }
            return successWithError.copy(obj, errorType);
        }

        public final T component1() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 39;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            T t = this.component1;
            if (i3 != 0) {
                int i4 = 15 / 0;
            }
            return t;
        }

        public final SuccessWithError<T> copy(T data, UrlContentDecoderMonitorHelper.ErrorType error) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(error, "");
            SuccessWithError<T> successWithError = new SuccessWithError<>(data, error);
            int i2 = getRequestBeneficiariesState + 89;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return successWithError;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 97;
            int i3 = i2 % 128;
            getAsAtTimestamp = i3;
            int i4 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuccessWithError)) {
                int i5 = i3 + 25;
                getRequestBeneficiariesState = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            SuccessWithError successWithError = (SuccessWithError) other;
            if (!Intrinsics.areEqual(this.component1, successWithError.component1)) {
                return false;
            }
            if (this.ShareDataUIState == successWithError.ShareDataUIState) {
                return true;
            }
            int i7 = getRequestBeneficiariesState + 87;
            getAsAtTimestamp = i7 % 128;
            return i7 % 2 != 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[PHI: r1
  0x001c: PHI (r1v10 T) = (r1v4 T), (r1v11 T) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.helper.UIState.SuccessWithError.getRequestBeneficiariesState
                int r1 = r1 + 83
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.helper.UIState.SuccessWithError.getAsAtTimestamp = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L17
                T r1 = r4.component1
                r3 = 36
                int r3 = r3 / r2
                if (r1 != 0) goto L1c
                goto L20
            L17:
                T r1 = r4.component1
                if (r1 != 0) goto L1c
                goto L20
            L1c:
                int r2 = r1.hashCode()
            L20:
                int r2 = r2 * 31
                com.alibaba.griver.core.common.monitor.UrlContentDecoderMonitorHelper$ErrorType r1 = r4.ShareDataUIState
                int r1 = r1.hashCode()
                int r2 = r2 + r1
                int r1 = com.huawei.digitalpayment.consumer.sfcui.helper.UIState.SuccessWithError.getAsAtTimestamp
                int r1 = r1 + 23
                int r3 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.helper.UIState.SuccessWithError.getRequestBeneficiariesState = r3
                int r1 = r1 % r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.helper.UIState.SuccessWithError.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "SuccessWithError(data=" + this.component1 + ", error=" + this.ShareDataUIState + ")";
            int i2 = getAsAtTimestamp + 61;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        static void component3() {
            component3 = new char[]{59142, 36078, 12493, 42144, 18580, 64653, 24681, 5144, 47152, 11275, 53327, 17881, 59850, 40367, 433, 46475, 22906, 52595, 28981, 58669, 35080, 16127, 3091, 26621, 56281, 20403, 41881, 6032, 35704, 65397, 21291, 50952, 15132, 44783, 715, 30368, 60081, 19046, 8586, 40372, 2520, 58814, 20963, 52487, 47411, 5459, 33085, 32089, 59544, 17579, 12483, 44235, 6376, 3103, 26613, 56285, 20397, 41886, 6044, 35688, 65374, 21254, 50952, 15107, 44787, 737, 30370, 60080, 24218};
            copydefault = 6679356841316738961L;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState$Error;", "Lcom/huawei/digitalpayment/consumer/sfcui/helper/UIState;", "", "error", "Lcom/alibaba/griver/core/common/monitor/UrlContentDecoderMonitorHelper$ErrorType;", "<init>", "(Lcom/alibaba/griver/core/common/monitor/UrlContentDecoderMonitorHelper$ErrorType;)V", "getError", "()Lcom/alibaba/griver/core/common/monitor/UrlContentDecoderMonitorHelper$ErrorType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends UIState {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int component3;
        private final UrlContentDecoderMonitorHelper.ErrorType copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(UrlContentDecoderMonitorHelper.ErrorType errorType) {
            super(null);
            Intrinsics.checkNotNullParameter(errorType, "");
            this.copydefault = errorType;
        }

        public final UrlContentDecoderMonitorHelper.ErrorType getError() {
            int i = 2 % 2;
            int i2 = component1 + 41;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            UrlContentDecoderMonitorHelper.ErrorType errorType = this.copydefault;
            int i5 = i3 + 9;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return errorType;
        }

        static {
            int i = 1 + 125;
            component3 = i % 128;
            int i2 = i % 2;
        }

        public static Error copy$default(Error error, UrlContentDecoderMonitorHelper.ErrorType errorType, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component1 + 117;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                errorType = error.copydefault;
            }
            Error errorCopy = error.copy(errorType);
            int i5 = component1 + 91;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return errorCopy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final UrlContentDecoderMonitorHelper.ErrorType component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 119;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            UrlContentDecoderMonitorHelper.ErrorType errorType = this.copydefault;
            int i5 = i3 + 65;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return errorType;
            }
            throw null;
        }

        public final Error copy(UrlContentDecoderMonitorHelper.ErrorType error) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(error, "");
            Error error2 = new Error(error);
            int i2 = component1 + 99;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return error2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 3;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                int i6 = i2 + 73;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.copydefault == ((Error) other).copydefault) {
                return true;
            }
            int i8 = i4 + 103;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 97;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                this.copydefault.hashCode();
                throw null;
            }
            int iHashCode = this.copydefault.hashCode();
            int i3 = ShareDataUIState + 67;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 45 / 0;
            }
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Error(error=" + this.copydefault + ")";
            int i2 = component1 + 85;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
