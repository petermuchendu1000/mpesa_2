package com.huawei.digitalpayment.consumer.sfcui.sambaza;

import androidx.autofill.HintConstants;
import com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.FetchSambazaAccount;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent;", "", "<init>", "()V", "OnAirtimePhoneInput", "OnAirtimeAmount", "OnDataPhoneInput", "OnTabSelected", "OnDataTypeSelected", "OnResourceOptionSelected", "OnDataMbAmountChange", "OnDataTypesLoaded", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnAirtimeAmount;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnAirtimePhoneInput;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnDataMbAmountChange;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnDataPhoneInput;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnDataTypeSelected;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnDataTypesLoaded;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnResourceOptionSelected;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnTabSelected;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SambazaEvent {
    public static final int $stable = 0;
    private static int component1 = 13 % 128;
    private static int copydefault;

    private SambazaEvent() {
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnAirtimePhoneInput;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent;", HintConstants.AUTOFILL_HINT_PHONE, "", "<init>", "(Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnAirtimePhoneInput extends SambazaEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component2 = 1;
        private static int component3;
        private static int copydefault;
        private final String component1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAirtimePhoneInput(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.component1 = str;
        }

        public final String getPhone() {
            String str;
            int i = 2 % 2;
            int i2 = copydefault + 123;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 == 0) {
                str = this.component1;
                int i4 = 59 / 0;
            } else {
                str = this.component1;
            }
            int i5 = i3 + 19;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        static {
            int i = 1 + 71;
            component3 = i % 128;
            if (i % 2 != 0) {
                int i2 = 31 / 0;
            }
        }

        public static OnAirtimePhoneInput copy$default(OnAirtimePhoneInput onAirtimePhoneInput, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 99;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 105;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                str = onAirtimePhoneInput.component1;
            }
            return onAirtimePhoneInput.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2 + 69;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.component1;
            int i5 = i3 + 99;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final OnAirtimePhoneInput copy(String phone) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(phone, "");
            OnAirtimePhoneInput onAirtimePhoneInput = new OnAirtimePhoneInput(phone);
            int i2 = component2 + 33;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 12 / 0;
            }
            return onAirtimePhoneInput;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = copydefault + 9;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof OnAirtimePhoneInput)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.component1, ((OnAirtimePhoneInput) other).component1)) {
                int i4 = copydefault + 55;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = component2 + 65;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 3;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component1.hashCode();
            int i4 = copydefault + 59;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnAirtimePhoneInput(phone=" + this.component1 + ")";
            int i2 = component2 + 41;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        if (13 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SambazaEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnAirtimeAmount;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent;", "amount", "", "<init>", "(Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnAirtimeAmount extends SambazaEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 1;
        private static int component3;
        private static int copydefault;
        private final String component2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAirtimeAmount(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.component2 = str;
        }

        public final String getAmount() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 29;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.component2;
            int i4 = i2 + 83;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        static {
            int i = 1 + 29;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        public static OnAirtimeAmount copy$default(OnAirtimeAmount onAirtimeAmount, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 101;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 65;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                str = onAirtimeAmount.component2;
            }
            return onAirtimeAmount.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 73;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.component2;
            int i5 = i2 + 19;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 62 / 0;
            }
            return str;
        }

        public final OnAirtimeAmount copy(String amount) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(amount, "");
            OnAirtimeAmount onAirtimeAmount = new OnAirtimeAmount(amount);
            int i2 = component3 + 31;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return onAirtimeAmount;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3 + 111;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            if (this == other) {
                int i5 = i3 + 3;
                component3 = i5 % 128;
                return i5 % 2 == 0;
            }
            if (!(other instanceof OnAirtimeAmount)) {
                return false;
            }
            if (!(!Intrinsics.areEqual(this.component2, ((OnAirtimeAmount) other).component2))) {
                return true;
            }
            int i6 = ShareDataUIState + 87;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 101;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.component2;
            if (i3 == 0) {
                return str.hashCode();
            }
            str.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnAirtimeAmount(amount=" + this.component2 + ")";
            int i2 = ShareDataUIState + 97;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnDataPhoneInput;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent;", HintConstants.AUTOFILL_HINT_PHONE, "", "<init>", "(Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnDataPhoneInput extends SambazaEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 35 % 128;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;
        private final String component1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDataPhoneInput(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.component1 = str;
        }

        public final String getPhone() {
            int i = 2 % 2;
            int i2 = component2 + 77;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            if (35 % 2 == 0) {
                int i = 80 / 0;
            }
        }

        public static OnDataPhoneInput copy$default(OnDataPhoneInput onDataPhoneInput, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault + 51;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 125;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    String str2 = onDataPhoneInput.component1;
                    throw null;
                }
                str = onDataPhoneInput.component1;
            }
            OnDataPhoneInput onDataPhoneInputCopy = onDataPhoneInput.copy(str);
            int i7 = copydefault + 5;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 12 / 0;
            }
            return onDataPhoneInputCopy;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2 + 125;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.component1;
            int i5 = i3 + 63;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final OnDataPhoneInput copy(String phone) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(phone, "");
            OnDataPhoneInput onDataPhoneInput = new OnDataPhoneInput(phone);
            int i2 = copydefault + 19;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return onDataPhoneInput;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 103;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(!(other instanceof OnDataPhoneInput))) {
                return Intrinsics.areEqual(this.component1, ((OnDataPhoneInput) other).component1);
            }
            int i4 = copydefault + 13;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 36 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = copydefault + 71;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                this.component1.hashCode();
                throw null;
            }
            int iHashCode = this.component1.hashCode();
            int i3 = component2 + 5;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnDataPhoneInput(phone=" + this.component1 + ")";
            int i2 = component2 + 119;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnTabSelected;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent;", "tab", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaTabState;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaTabState;)V", "getTab", "()Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaTabState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnTabSelected extends SambazaEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 0;
        private static int copydefault = 65 % 128;
        private final SambazaTabState component1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnTabSelected(SambazaTabState sambazaTabState) {
            super(null);
            Intrinsics.checkNotNullParameter(sambazaTabState, "");
            this.component1 = sambazaTabState;
        }

        public final SambazaTabState getTab() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 57;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            SambazaTabState sambazaTabState = this.component1;
            int i4 = i2 + 115;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return sambazaTabState;
        }

        static {
            if (65 % 2 == 0) {
                int i = 21 / 0;
            }
        }

        public static OnTabSelected copy$default(OnTabSelected onTabSelected, SambazaTabState sambazaTabState, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 21;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                sambazaTabState = onTabSelected.component1;
                int i6 = i4 + 53;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
            }
            return onTabSelected.copy(sambazaTabState);
        }

        public final SambazaTabState component1() {
            int i = 2 % 2;
            int i2 = component2 + 95;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final OnTabSelected copy(SambazaTabState tab) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(tab, "");
            OnTabSelected onTabSelected = new OnTabSelected(tab);
            int i2 = component2 + 63;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 48 / 0;
            }
            return onTabSelected;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (other instanceof OnTabSelected) {
                if (this.component1 == ((OnTabSelected) other).component1) {
                    return true;
                }
                int i2 = ShareDataUIState + 5;
                component2 = i2 % 128;
                return i2 % 2 == 0;
            }
            int i3 = ShareDataUIState + 5;
            int i4 = i3 % 128;
            component2 = i4;
            boolean z = i3 % 2 == 0;
            int i5 = i4 + 63;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 79;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                this.component1.hashCode();
                throw null;
            }
            int iHashCode = this.component1.hashCode();
            int i3 = component2 + 109;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnTabSelected(tab=" + this.component1 + ")";
            int i2 = component2 + 5;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 75 / 0;
            }
            return str;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnDataTypeSelected;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent;", "dataType", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/FetchSambazaAccount;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/FetchSambazaAccount;)V", "getDataType", "()Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/FetchSambazaAccount;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnDataTypeSelected extends SambazaEvent {
        public static final int $stable = 8;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 117 % 128;
        private final FetchSambazaAccount copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDataTypeSelected(FetchSambazaAccount fetchSambazaAccount) {
            super(null);
            Intrinsics.checkNotNullParameter(fetchSambazaAccount, "");
            this.copydefault = fetchSambazaAccount;
        }

        public final FetchSambazaAccount getDataType() {
            int i = 2 % 2;
            int i2 = component2 + 89;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            FetchSambazaAccount fetchSambazaAccount = this.copydefault;
            int i5 = i3 + 21;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return fetchSambazaAccount;
        }

        static {
            if (117 % 2 == 0) {
                int i = 19 / 0;
            }
        }

        public static OnDataTypeSelected copy$default(OnDataTypeSelected onDataTypeSelected, FetchSambazaAccount fetchSambazaAccount, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 73;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 45;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                fetchSambazaAccount = onDataTypeSelected.copydefault;
                int i8 = i4 + 95;
                component2 = i8 % 128;
                int i9 = i8 % 2;
            }
            return onDataTypeSelected.copy(fetchSambazaAccount);
        }

        public final FetchSambazaAccount component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 43;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            FetchSambazaAccount fetchSambazaAccount = this.copydefault;
            int i5 = i2 + 23;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return fetchSambazaAccount;
            }
            throw null;
        }

        public final OnDataTypeSelected copy(FetchSambazaAccount dataType) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(dataType, "");
            OnDataTypeSelected onDataTypeSelected = new OnDataTypeSelected(dataType);
            int i2 = component2 + 87;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 0;
            }
            return onDataTypeSelected;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2;
                int i3 = i2 + 101;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 75;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (other instanceof OnDataTypeSelected) {
                return Intrinsics.areEqual(this.copydefault, ((OnDataTypeSelected) other).copydefault);
            }
            int i7 = component2;
            int i8 = i7 + 25;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            int i10 = i7 + 103;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 125;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.copydefault.hashCode();
            int i4 = ShareDataUIState + 27;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnDataTypeSelected(dataType=" + this.copydefault + ")";
            int i2 = ShareDataUIState + 61;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 71 / 0;
            }
            return str;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnResourceOptionSelected;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent;", "option", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions;)V", "getOption", "()Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaOptions;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnResourceOptionSelected extends SambazaEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component3 = 1;
        private static int copydefault;
        private final SambazaOptions component2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnResourceOptionSelected(SambazaOptions sambazaOptions) {
            super(null);
            Intrinsics.checkNotNullParameter(sambazaOptions, "");
            this.component2 = sambazaOptions;
        }

        public final SambazaOptions getOption() {
            int i = 2 % 2;
            int i2 = component1 + 43;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            SambazaOptions sambazaOptions = this.component2;
            int i5 = i3 + 95;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return sambazaOptions;
        }

        static {
            int i = 1 + 51;
            copydefault = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static OnResourceOptionSelected copy$default(OnResourceOptionSelected onResourceOptionSelected, SambazaOptions sambazaOptions, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3 + 125;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 31;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    SambazaOptions sambazaOptions2 = onResourceOptionSelected.component2;
                    throw null;
                }
                sambazaOptions = onResourceOptionSelected.component2;
            }
            OnResourceOptionSelected onResourceOptionSelectedCopy = onResourceOptionSelected.copy(sambazaOptions);
            int i7 = component1 + 103;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                return onResourceOptionSelectedCopy;
            }
            throw null;
        }

        public final SambazaOptions component1() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 85;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            SambazaOptions sambazaOptions = this.component2;
            int i4 = i2 + 29;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return sambazaOptions;
        }

        public final OnResourceOptionSelected copy(SambazaOptions option) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(option, "");
            OnResourceOptionSelected onResourceOptionSelected = new OnResourceOptionSelected(option);
            int i2 = component1 + 65;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return onResourceOptionSelected;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 125;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnResourceOptionSelected)) {
                int i5 = i2 + 111;
                component1 = i5 % 128;
                return i5 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.component2, ((OnResourceOptionSelected) other).component2)) {
                return true;
            }
            int i6 = component1 + 73;
            component3 = i6 % 128;
            return i6 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 83;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component2.hashCode();
            int i4 = component3 + 45;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnResourceOptionSelected(option=" + this.component2 + ")";
            int i2 = component1 + 23;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnDataMbAmountChange;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent;", "amount", "", "<init>", "(Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnDataMbAmountChange extends SambazaEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private final String copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDataMbAmountChange(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public final String getAmount() {
            String str;
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 3;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.copydefault;
                int i4 = 80 / 0;
            } else {
                str = this.copydefault;
            }
            int i5 = i2 + 85;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 21 / 0;
            }
            return str;
        }

        static {
            int i = 1 + 43;
            component1 = i % 128;
            if (i % 2 != 0) {
                int i2 = 42 / 0;
            }
        }

        public static OnDataMbAmountChange copy$default(OnDataMbAmountChange onDataMbAmountChange, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 35;
            ShareDataUIState = i4 % 128;
            int i5 = i & 1;
            if (i4 % 2 == 0 ? i5 != 0 : i5 != 0) {
                int i6 = i3 + 27;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    String str2 = onDataMbAmountChange.copydefault;
                    throw null;
                }
                str = onDataMbAmountChange.copydefault;
            }
            return onDataMbAmountChange.copy(str);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.copydefault;
            if (i3 == 0) {
                int i4 = 88 / 0;
            }
            return str;
        }

        public final OnDataMbAmountChange copy(String amount) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(amount, "");
            OnDataMbAmountChange onDataMbAmountChange = new OnDataMbAmountChange(amount);
            int i2 = component2 + 67;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return onDataMbAmountChange;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2 + 95;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            if (this == other) {
                int i5 = i3 + 55;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
            if (!(other instanceof OnDataMbAmountChange)) {
                return false;
            }
            if (Intrinsics.areEqual(this.copydefault, ((OnDataMbAmountChange) other).copydefault)) {
                return true;
            }
            int i7 = ShareDataUIState + 61;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 53;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                this.copydefault.hashCode();
                throw null;
            }
            int iHashCode = this.copydefault.hashCode();
            int i3 = component2 + 101;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnDataMbAmountChange(amount=" + this.copydefault + ")";
            int i2 = ShareDataUIState + 49;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent$OnDataTypesLoaded;", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/SambazaEvent;", "dataTypes", "", "Lcom/huawei/digitalpayment/consumer/sfcui/sambaza/resp/FetchSambazaAccount;", "<init>", "(Ljava/util/List;)V", "getDataTypes", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnDataTypesLoaded extends SambazaEvent {
        public static final int $stable = 8;
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private final List<FetchSambazaAccount> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnDataTypesLoaded(List<FetchSambazaAccount> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }

        public final List<FetchSambazaAccount> getDataTypes() {
            int i = 2 % 2;
            int i2 = component3 + 43;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.copydefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = 1 + 107;
            component2 = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static OnDataTypesLoaded copy$default(OnDataTypesLoaded onDataTypesLoaded, List list, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 53;
            component3 = i4 % 128;
            int i5 = i & 1;
            if (i4 % 2 != 0 ? i5 != 0 : i5 != 0) {
                list = onDataTypesLoaded.copydefault;
                int i6 = i3 + 21;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }
            return onDataTypesLoaded.copy(list);
        }

        public final List<FetchSambazaAccount> component1() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 71;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            List<FetchSambazaAccount> list = this.copydefault;
            int i5 = i2 + 9;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final OnDataTypesLoaded copy(List<FetchSambazaAccount> dataTypes) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(dataTypes, "");
            OnDataTypesLoaded onDataTypesLoaded = new OnDataTypesLoaded(dataTypes);
            int i2 = component3 + 1;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return onDataTypesLoaded;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            if ((r6 instanceof com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded) != false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        
            r2 = r2 + 121;
            com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded.component1 = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            if ((r2 % 2) == 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.copydefault, ((com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded) r6).copydefault)) == true) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        
            r6 = com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded.component3 + 119;
            com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded.component1 = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded.component1
                int r1 = r1 + 9
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded.component3 = r2
                int r1 = r1 % r0
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L16
                r1 = 81
                int r1 = r1 / r3
                if (r5 != r6) goto L19
                goto L18
            L16:
                if (r5 != r6) goto L19
            L18:
                return r4
            L19:
                boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded
                if (r1 != 0) goto L28
                int r2 = r2 + 121
                int r6 = r2 % 128
                com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded.component1 = r6
                int r2 = r2 % r0
                if (r2 == 0) goto L27
                return r4
            L27:
                return r3
            L28:
                com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent$OnDataTypesLoaded r6 = (com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded) r6
                java.util.List<com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.FetchSambazaAccount> r1 = r5.copydefault
                java.util.List<com.huawei.digitalpayment.consumer.sfcui.sambaza.resp.FetchSambazaAccount> r6 = r6.copydefault
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
                r6 = r6 ^ r4
                if (r6 == r4) goto L36
                return r4
            L36:
                int r6 = com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded.component3
                int r6 = r6 + 119
                int r1 = r6 % 128
                com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded.component1 = r1
                int r6 = r6 % r0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.sambaza.SambazaEvent.OnDataTypesLoaded.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 81;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.copydefault.hashCode();
            int i4 = component3 + 19;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnDataTypesLoaded(dataTypes=" + this.copydefault + ")";
            int i2 = component1 + 13;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }
    }
}
