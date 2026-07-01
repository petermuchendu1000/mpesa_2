package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.cancelNotification;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState;", "", "<init>", "()V", "NoAccount", "NoProduct", "Inactive", "Active", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState$Active;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState$Inactive;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState$NoAccount;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState$NoProduct;", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AccountState {
    public static final int $stable = 0;
    private static int component3 = 0;
    private static int copydefault = 71 % 128;

    private AccountState() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState$NoAccount;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoAccount extends AccountState {
        public static final int $stable = 0;
        public static final NoAccount INSTANCE = new NoAccount();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault;

        private NoAccount() {
            super(null);
        }

        static {
            int i = component1 + 111;
            component2 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 105;
            int i3 = i2 % 128;
            copydefault = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoAccount)) {
                return false;
            }
            int i4 = i3 + 105;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 41;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return 1770522671;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 7;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 65;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return "NoAccount";
        }
    }

    static {
        if (71 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState$NoProduct;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoProduct extends AccountState {
        public static final int $stable = 0;
        public static final NoProduct INSTANCE = new NoProduct();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int copydefault;

        private NoProduct() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 51;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1 + 111;
            int i3 = i2 % 128;
            component2 = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof NoProduct) {
                int i4 = i3 + 11;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            int i6 = i3 + 97;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 51;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 == 0) {
                int i4 = 24 / 0;
            }
            int i5 = i3 + 73;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 48 / 0;
            }
            return -1656599823;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 91;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 61;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                return "NoProduct";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public AccountState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState$Inactive;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Inactive extends AccountState {
        public static final int $stable = 0;
        public static final Inactive INSTANCE;
        private static long component1;
        private static char[] component2;
        private static int copydefault;
        private static final byte[] $$c = {125, 44, 8, -98};
        private static final int $$f = 209;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {86, 117, -27, 75, Ascii.DC2, 4, -57, 57, 17, 3, -1, 5, 7, 5, -45, 63, 17, -3, 19, -11, 19, -62, 58, 9, 6, 9, 7, 19, -11, -49, 68, 9, Ascii.VT, 6, -5, 2, -49, 72, 2, -5, Ascii.RS, -14, 19, -62, 36, 41, Ascii.VT, 6, -5, 2, -15, 34, -5, Ascii.RS, -14, 19, -72, Ascii.SYN, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -60};
        private static final int $$e = 37;
        private static final byte[] $$a = {119, -58, 7, 71, Ascii.FS, Ascii.SO, 19, Ascii.SI, Ascii.SI, 7, Ascii.EM, Ascii.SYN, -49, Ascii.FS, 17, Ascii.EM, -5, 17, 17, Ascii.VT, 36, 7, Ascii.CAN, 37, 9, 33, 3, -17, 45, 35, -3, 4, 4, Ascii.SUB, TarHeader.LF_LINK, -3, 35, 1};
        private static final int $$b = 50;
        private static int component3 = 0;
        private static int copy = 1;
        private static int ShareDataUIState = 0;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$g(int r6, int r7, short r8) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState.Inactive.$$c
                int r7 = r7 * 4
                int r7 = 1 - r7
                int r6 = r6 + 117
                int r8 = r8 * 4
                int r8 = 4 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r6 = r7
                r3 = r8
                r5 = r2
                goto L25
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r6
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L23:
                r3 = r0[r8]
            L25:
                int r8 = r8 + 1
                int r6 = r6 + r3
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState.Inactive.$$g(int, int, short):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(byte r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 16
                int r8 = 99 - r8
                int r7 = 22 - r7
                int r9 = 16 - r9
                byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState.Inactive.$$a
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r8
                r5 = r2
                r8 = r7
                goto L2b
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L23:
                int r7 = r7 + 1
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2b:
                int r3 = r3 + r7
                int r7 = r3 + (-16)
                r3 = r5
                r6 = r8
                r8 = r7
                r7 = r6
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState.Inactive.a(byte, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 4
                int r7 = 99 - r7
                int r8 = r8 * 45
                int r0 = 55 - r8
                int r6 = r6 + 4
                byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState.Inactive.$$d
                byte[] r0 = new byte[r0]
                int r8 = 54 - r8
                r2 = 0
                if (r1 != 0) goto L17
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2f
            L17:
                r3 = r2
            L18:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r5
            L2f:
                int r3 = r3 + r6
                int r6 = r3 + (-6)
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState.Inactive.c(int, byte, short, java.lang.Object[]):void");
        }

        private Inactive() {
            super(null);
        }

        private static void b(int i, int i2, char c2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            cancelNotification cancelnotification = new cancelNotification();
            long[] jArr = new long[i];
            cancelnotification.copydefault = 0;
            while (cancelnotification.copydefault < i) {
                int i4 = cancelnotification.copydefault;
                try {
                    Object[] objArr2 = {Integer.valueOf(component2[i2 + i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                    if (objCopydefault == null) {
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 1758;
                        int i5 = 34 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        char defaultSize = (char) View.getDefaultSize(0, 0);
                        byte length = (byte) $$c.length;
                        byte b2 = (byte) (length - 4);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(capsMode, i5, defaultSize, 1159210934, false, $$g(length, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(component1), Integer.valueOf(c2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(3608 - View.combineMeasuredStates(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28, (char) (7171 - KeyEvent.keyCodeFromString("")), 1951385784, false, $$g(b3, b4, b4), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {cancelnotification, cancelnotification};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault3 == null) {
                        byte b5 = (byte) 5;
                        byte b6 = (byte) (b5 - 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.indexOf("", ""), 24 - TextUtils.getTrimmedLength(""), (char) (27761 - TextUtils.indexOf("", "", 0)), -1529629956, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    int i6 = $11 + 47;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
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
                int i8 = $11 + 91;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 5;
                    byte b8 = (byte) (b7 - 5);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "") + 24, (char) (27760 - TextUtils.indexOf((CharSequence) "", '0', 0)), -1529629956, false, $$g(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0218  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1771
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState.Inactive.hashCode():int");
        }

        static {
            copydefault = 1;
            copydefault();
            INSTANCE = new Inactive();
            int i = ShareDataUIState + 19;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 29;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i4 + 67;
                copy = i6 % 128;
                return i6 % 2 != 0;
            }
            if (!(other instanceof Inactive)) {
                int i7 = i4 + 121;
                copy = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            int i9 = i2 + 71;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            return true;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = copy + 97;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 67;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return "Inactive";
        }

        static void copydefault() {
            component2 = new char[]{3095, 5532, 16154, 16520, 27145, 29579, 38154, 48836, 49209, 59809, 62320, 5257, 15935, 18353, 26938, 29359, 37979, 48625, 51026, 59605, 62021, 7113, 3091, 5534, 16159, 16522, 27157, 29575, 38154, 48824, 49203, 59827, 62258, 5294, 15919, 18351, 26923, 3095, 5532, 16154, 16520, 27145, 29579, 38154, 48836, 49207, 59810, 62254, 5364, 15879, 18337, 26938, 29347, 37952, 48603, 51018, 59587, 62066, 7114, 15708, 18127, 26743, 29174, 53818, 52136, 57635, 40615, 46124, 44451, 19253, 24708, 7689, 14221, 11549, 51868, 57354, 39308, 46869, 44172, 19062, 25587, 3100, 5523, 16136, 16539, 27208, 29582, 38159, 48772, 49201, 59900, 62221, 5283, 15925, 18358, 26923, 29351, 13591, 11422, 1555, 31132, 21274, 19075, 44050, 34715, 63766, 53435, 51749, 11706, 1805, 32421, 20514, 19367};
            component1 = -6149643432118839822L;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState$Active;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Active extends AccountState {
        public static final int $stable = 0;
        public static final Active INSTANCE = new Active();
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 1;

        private Active() {
            super(null);
        }

        static {
            int i = component3 + 41;
            component2 = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copydefault + 83;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                int i4 = i3 + 59;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (other instanceof Active) {
                return true;
            }
            int i6 = i3 + 33;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                return false;
            }
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 121;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 103;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return 2119096035;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 19;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return "Active";
            }
            int i3 = 86 / 0;
            return "Active";
        }
    }
}
