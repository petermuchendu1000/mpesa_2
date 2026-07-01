package com.huawei.digitalpayment.consumer.sfcui.postpay.paybill;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.huawei.digitalpayment.consumer.sfcui.components.bundles.PurchaseBundleFormState;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/paybill/PayPostPayBillEvent;", "", "<init>", "()V", "OnAccountNumberChanged", "OnAmountChanged", "OnUpdateForm", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/paybill/PayPostPayBillEvent$OnAccountNumberChanged;", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/paybill/PayPostPayBillEvent$OnAmountChanged;", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/paybill/PayPostPayBillEvent$OnUpdateForm;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PayPostPayBillEvent {
    public static final int $stable = 0;
    private static int component2 = 1;
    private static int copydefault;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/paybill/PayPostPayBillEvent$OnAccountNumberChanged;", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/paybill/PayPostPayBillEvent;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnAccountNumberChanged extends PayPostPayBillEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 115 % 128;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private final String copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAccountNumberChanged(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public final String getAccountNumber() {
            int i = 2 % 2;
            int i2 = component2 + 117;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.copydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            if (115 % 2 == 0) {
                int i = 10 / 0;
            }
        }

        public static OnAccountNumberChanged copy$default(OnAccountNumberChanged onAccountNumberChanged, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 103;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 25;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                str = onAccountNumberChanged.copydefault;
            }
            return onAccountNumberChanged.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 25;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 85;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final OnAccountNumberChanged copy(String accountNumber) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(accountNumber, "");
            OnAccountNumberChanged onAccountNumberChanged = new OnAccountNumberChanged(accountNumber);
            int i2 = component2 + 15;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 77 / 0;
            }
            return onAccountNumberChanged;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 39;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            if (this == other) {
                int i6 = i2 + 49;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return true;
            }
            if (!(other instanceof OnAccountNumberChanged)) {
                int i8 = i4 + 79;
                component3 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 21 / 0;
                }
                return false;
            }
            if (Intrinsics.areEqual(this.copydefault, ((OnAccountNumberChanged) other).copydefault)) {
                return true;
            }
            int i10 = component2 + 111;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 37;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.copydefault.hashCode();
            int i4 = component2 + 91;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnAccountNumberChanged(accountNumber=" + this.copydefault + ")";
            int i2 = component3 + 93;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    private PayPostPayBillEvent() {
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/paybill/PayPostPayBillEvent$OnAmountChanged;", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/paybill/PayPostPayBillEvent;", "amount", "", "<init>", "(Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnAmountChanged extends PayPostPayBillEvent {
        public static final int $stable = 0;
        private static char ShareDataUIState;
        private static char component1;
        private static char component2;
        private static char copydefault;
        private static int getAsAtTimestamp;
        private final String component3;
        private static final byte[] $$c = {114, 69, -115, -114};
        private static final int $$d = 203;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {10, 80, 9, 70, -35, -21, -26, -22, -22, -14, -32, -29, 43, -35, -21, -26, -22, -22, -14, -32, -29, 44, -35, -24, -32, -2, -24, -24, -18, -43, -14, -31, -35, -24, -32};
        private static final int $$b = 164;
        private static int equals = 0;
        private static int getRequestBeneficiariesState = 1;
        private static int copy = 1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(byte r7, int r8, byte r9) {
            /*
                int r8 = r8 * 3
                int r8 = 4 - r8
                byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.postpay.paybill.PayPostPayBillEvent.OnAmountChanged.$$c
                int r7 = r7 * 4
                int r7 = r7 + 111
                int r9 = r9 * 4
                int r9 = 1 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r7 = r9
                r4 = r2
                goto L2a
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L25:
                r3 = r0[r8]
                r6 = r3
                r3 = r8
                r8 = r6
            L2a:
                int r8 = -r8
                int r7 = r7 + r8
                int r8 = r3 + 1
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.paybill.PayPostPayBillEvent.OnAmountChanged.$$e(byte, int, byte):java.lang.String");
        }

        private static void b(short s, short s2, byte b2, Object[] objArr) {
            byte[] bArr = $$a;
            int i = 99 - (b2 * 2);
            int i2 = s2 + 4;
            byte[] bArr2 = new byte[s + 1];
            int i3 = -1;
            if (bArr == null) {
                i = (i2 + (-s)) - 23;
                i2 = i2;
            }
            while (true) {
                i3++;
                bArr2[i3] = (byte) i;
                if (i3 == s) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i4 = i2 + 1;
                i = (i + (-bArr[i4])) - 23;
                i2 = i4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAmountChanged(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        }

        public final String getAmount() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 89;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 11;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            iNotificationSideChannelDefault.component3 = 0;
            char[] cArr3 = new char[2];
            while (iNotificationSideChannelDefault.component3 < cArr.length) {
                int i4 = $10 + 67;
                $11 = i4 % 128;
                int i5 = i4 % 2;
                cArr3[i3] = cArr[iNotificationSideChannelDefault.component3];
                cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
                int i6 = 58224;
                int i7 = i3;
                while (i7 < 16) {
                    int i8 = $10 + 3;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    char c2 = cArr3[1];
                    char c3 = cArr3[i3];
                    char[] cArr4 = cArr3;
                    try {
                        Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i6) ^ ((c3 << 4) + ((char) (((long) component1) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(copydefault)};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - TextUtils.indexOf("", ""), TextUtils.getOffsetAfter("", 0) + 32, (char) (23251 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 592652048, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                        cArr4[1] = cCharValue;
                        Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = b4;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(845 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 32, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23250), 592652048, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(465 - View.MeasureSpec.getMode(0), 49 - View.MeasureSpec.getMode(0), (char) View.getDefaultSize(0, 0), 1194533216, false, "m", new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        static {
            getAsAtTimestamp = 0;
            component3();
            int i = copy + 107;
            getAsAtTimestamp = i % 128;
            int i2 = i % 2;
        }

        public static OnAmountChanged copy$default(OnAmountChanged onAmountChanged, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = getRequestBeneficiariesState + 103;
            int i4 = i3 % 128;
            equals = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 11;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
                str = onAmountChanged.component3;
            }
            OnAmountChanged onAmountChangedCopy = onAmountChanged.copy(str);
            int i8 = equals + 37;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            return onAmountChangedCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 99;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component3;
            }
            throw null;
        }

        public final OnAmountChanged copy(String amount) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(amount, "");
            OnAmountChanged onAmountChanged = new OnAmountChanged(amount);
            int i2 = getRequestBeneficiariesState + 11;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return onAmountChanged;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 93;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof OnAmountChanged) {
                return Intrinsics.areEqual(this.component3, ((OnAmountChanged) other).component3);
            }
            int i4 = i2 + 99;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = equals + 19;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component3.hashCode();
            int i4 = equals + 9;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnAmountChanged(amount=" + this.component3 + ")";
            int i2 = getRequestBeneficiariesState + 77;
            equals = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 81 / 0;
            }
            return str;
        }

        /* JADX WARN: Removed duplicated region for block: B:136:0x0349 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0332  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.Object[] component2(android.content.Context r34, int r35, int r36, int r37) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2322
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.paybill.PayPostPayBillEvent.OnAmountChanged.component2(android.content.Context, int, int, int):java.lang.Object[]");
        }

        static void component3() {
            ShareDataUIState = (char) 26895;
            component2 = (char) 19624;
            component1 = (char) 52258;
            copydefault = (char) 25997;
        }
    }

    static {
        int i = 1 + 31;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/paybill/PayPostPayBillEvent$OnUpdateForm;", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/paybill/PayPostPayBillEvent;", "formState", "Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/PurchaseBundleFormState;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/PurchaseBundleFormState;)V", "getFormState", "()Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/PurchaseBundleFormState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnUpdateForm extends PayPostPayBillEvent {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component1 = 15 % 128;
        private static int component2 = 0;
        private static int copydefault = 1;
        private final PurchaseBundleFormState component3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUpdateForm(PurchaseBundleFormState purchaseBundleFormState) {
            super(null);
            Intrinsics.checkNotNullParameter(purchaseBundleFormState, "");
            this.component3 = purchaseBundleFormState;
        }

        public final PurchaseBundleFormState getFormState() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 83;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            PurchaseBundleFormState purchaseBundleFormState = this.component3;
            int i5 = i2 + 45;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return purchaseBundleFormState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = 15 % 2;
        }

        public static OnUpdateForm copy$default(OnUpdateForm onUpdateForm, PurchaseBundleFormState purchaseBundleFormState, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 31;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            if ((i & 1) != 0) {
                purchaseBundleFormState = onUpdateForm.component3;
            }
            OnUpdateForm onUpdateFormCopy = onUpdateForm.copy(purchaseBundleFormState);
            int i5 = copydefault + 75;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return onUpdateFormCopy;
        }

        public final PurchaseBundleFormState component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 35;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            PurchaseBundleFormState purchaseBundleFormState = this.component3;
            int i5 = i2 + 11;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return purchaseBundleFormState;
        }

        public final OnUpdateForm copy(PurchaseBundleFormState formState) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(formState, "");
            OnUpdateForm onUpdateForm = new OnUpdateForm(formState);
            int i2 = ShareDataUIState + 73;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 24 / 0;
            }
            return onUpdateForm;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 11;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnUpdateForm) || !Intrinsics.areEqual(this.component3, ((OnUpdateForm) other).component3)) {
                return false;
            }
            int i4 = ShareDataUIState + 27;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 113;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                iHashCode = this.component3.hashCode();
                int i3 = 43 / 0;
            } else {
                iHashCode = this.component3.hashCode();
            }
            int i4 = copydefault + 15;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnUpdateForm(formState=" + this.component3 + ")";
            int i2 = copydefault + 17;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 91 / 0;
            }
            return str;
        }
    }

    public PayPostPayBillEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
