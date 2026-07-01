package com.huawei.digitalpayment.consumer.sfcui.servicepin.navigation;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.huawei.digitalpayment.consumer.base.resp.ReferenceDataOperationTypes;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.PredictiveBackHandlerKtPredictiveBackHandler31;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen;", "", "<init>", "()V", "CheckStatus", "EnterDetails", ReferenceDataOperationTypes.CONFIRMATION, "ChangePin", "Success", "Error", "Close", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$ChangePin;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$CheckStatus;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$Close;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$Confirmation;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$EnterDetails;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$Error;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$Success;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ServicePinScreen {
    public static final int $stable = 0;
    private static int ShareDataUIState;
    private static char[] component1;
    private static final byte[] $$a = {119, -58, 7, 71};
    private static final int $$b = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;
    private static int component3 = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, short r6, int r7) {
        /*
            int r7 = 115 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.servicepin.navigation.ServicePinScreen.$$a
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r3 = r3 + 1
            r4 = r0[r5]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.servicepin.navigation.ServicePinScreen.$$c(short, short, int):java.lang.String");
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$CheckStatus;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CheckStatus extends ServicePinScreen {
        public static final int $stable = 0;
        public static final CheckStatus INSTANCE = new CheckStatus();
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault;

        private CheckStatus() {
            super(null);
        }

        static {
            int i = copydefault + 115;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component3 + 39;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof CheckStatus)) {
                return false;
            }
            int i4 = component1 + 101;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 17;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return -1976951648;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 73;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return "CheckStatus";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private ServicePinScreen() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$EnterDetails;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EnterDetails extends ServicePinScreen {
        public static final int $stable = 0;
        public static final EnterDetails INSTANCE = new EnterDetails();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;

        private EnterDetails() {
            super(null);
        }

        static {
            int i = component1 + 115;
            component2 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3 + 37;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                int i4 = i3 + 45;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
            if (other instanceof EnterDetails) {
                return true;
            }
            int i6 = i3 + 5;
            component3 = i6 % 128;
            return i6 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 13;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i3 + 119;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 30 / 0;
            }
            return 1707372420;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 37;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 61;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return "EnterDetails";
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$Confirmation;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Confirmation extends ServicePinScreen {
        public static final int $stable = 0;
        public static final Confirmation INSTANCE = new Confirmation();
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;

        private Confirmation() {
            super(null);
        }

        static {
            int i = copydefault + 97;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 1;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof Confirmation) {
                return true;
            }
            int i5 = i2 + 125;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 115;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 81;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 82 / 0;
            }
            return -1393992849;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 67;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return ReferenceDataOperationTypes.CONFIRMATION;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$ChangePin;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChangePin extends ServicePinScreen {
        public static final int $stable = 0;
        public static final ChangePin INSTANCE = new ChangePin();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int copydefault;

        private ChangePin() {
            super(null);
        }

        static {
            int i = component1 + 119;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 67;
            ShareDataUIState = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this != other) {
                if (!(other instanceof ChangePin)) {
                    return false;
                }
                return true;
            }
            int i4 = i2 + 95;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return true;
            }
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 101;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 119;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return 1626690251;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 27;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return "ChangePin";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$Success;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success extends ServicePinScreen {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component2;
        private static int component3;

        private Success() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 33;
            component3 = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component1 + 69;
                component2 = i2 % 128;
                return i2 % 2 == 0;
            }
            if (other instanceof Success) {
                return true;
            }
            int i3 = component2 + 35;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 57;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 59 / 0;
            }
            int i5 = i2 + 51;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return 425743497;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 17;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 45;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return "Success";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$Error;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends ServicePinScreen {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 1;
        private static int copydefault;

        private Error() {
            super(null);
        }

        static {
            int i = ShareDataUIState + 53;
            component3 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copydefault + 23;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (other instanceof Error) {
                return true;
            }
            int i4 = component1 + 17;
            int i5 = i4 % 128;
            copydefault = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 35;
            component1 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 41 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 95;
            copydefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = i2 + 51;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return 420958222;
            }
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = component1 + 77;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 113;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return "Error";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen$Close;", "Lcom/huawei/digitalpayment/consumer/sfcui/servicepin/navigation/ServicePinScreen;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Close extends ServicePinScreen {
        public static final int $stable = 0;
        public static final Close INSTANCE = new Close();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component3 = 1;
        private static int copydefault;

        private Close() {
            super(null);
        }

        static {
            int i = copydefault + 11;
            component3 = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component1 + 97;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                int i4 = i3 + 125;
                component1 = i4 % 128;
                return i4 % 2 != 0;
            }
            if (!(other instanceof Close)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1;
            int i3 = i2 + 31;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 39;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 418929662;
        }

        public String toString() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 19;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return "Close";
            }
            int i3 = 39 / 0;
            return "Close";
        }
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = component1;
        if (cArr2 != null) {
            int i8 = $11 + 121;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                int i9 = $10 + 65;
                $11 = i9 % 128;
                if (i9 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                        if (objCopydefault == null) {
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(657 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getTouchSlop() >> 8) + 14, (char) (65118 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                        }
                        cArr[i] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 657, 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (65118 - TextUtils.getTrimmedLength("")), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i++;
                }
                i2 = 2;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i10 = $10 + 101;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = iTrustedWebActivityService_Parcel.copydefault;
                        Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault3 == null) {
                            byte b2 = (byte) (-1);
                            byte b3 = (byte) (b2 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 4502, (Process.myPid() >> 22) + 36, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27897), -1464227204, false, $$c(b2, b3, (byte) (b3 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr4[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i12 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) (-1);
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 4502, 36 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (27898 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), -1464227204, false, $$c(b4, b5, (byte) (b5 + 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                } else {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr6 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault5 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (b6 + 1);
                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(3579 - TextUtils.lastIndexOf("", '0', 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1180380354, false, $$c(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objCopydefault5).invoke(null, objArr6)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr7 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault6 == null) {
                    byte b8 = (byte) (-1);
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1859 - TextUtils.indexOf("", "", 0), 34 - TextUtils.getOffsetBefore("", 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 80302927, false, $$c(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault6).invoke(null, objArr7);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i14 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i14, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i14);
        }
        if (z) {
            int i15 = $11 + 49;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i5];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                int i17 = $11 + 29;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[i5 >>> iTrustedWebActivityService_Parcel.copydefault];
                } else {
                    cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i5 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                }
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i18 = $10 + 17;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i5) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        ShareDataUIState = 1;
        component3();
        int i = component3 + 49;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ServicePinScreen(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static void component1() throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Member[] memberArr = PredictiveBackHandlerKtPredictiveBackHandler31.component1;
        Object[] objArr = new Object[1];
        a(new int[]{0, 47, 0, 1}, true, new byte[]{1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0}, objArr);
        memberArr[0] = Class.forName(((String) objArr[0]).intern()).getDeclaredField("ShareDataUIState");
        int i4 = component2 + 47;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component3() {
        component1 = new char[]{33518, 33460, 33451, 33453, 33451, 33458, 33465, 33431, 33508, 33439, 33430, 33462, 33462, 33465, 33457, 33422, 33425, 33457, 33457, 33458, 33457, 33462, 33431, 33422, 33454, 33462, 33462, 33452, 33458, 33463, 33457, 33465, 33461, 33457, 33463, 33463, 33465, 33430, 33428, 33464, 33457, 33459, 33460, 33457, 33428, 33426, 33457};
    }
}
