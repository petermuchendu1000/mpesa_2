package com.huawei.digitalpayment.consumer.sfcui.bonga.calculator;

import com.huawei.digitalpayment.consumer.sfcui.bonga.model.BongaConversionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/calculator/BongaCalculatorEvent;", "", "<init>", "()V", "OnInputValueChange", "OnConversionTypeSelected", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/calculator/BongaCalculatorEvent$OnConversionTypeSelected;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/calculator/BongaCalculatorEvent$OnInputValueChange;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BongaCalculatorEvent {
    public static final int $stable = 0;
    private static int ShareDataUIState = 1;
    private static int component3;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/calculator/BongaCalculatorEvent$OnInputValueChange;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/calculator/BongaCalculatorEvent;", "inputValue", "", "<init>", "(Ljava/lang/String;)V", "getInputValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnInputValueChange extends BongaCalculatorEvent {
        public static final int $stable = 0;
        private static int ShareDataUIState = 0;
        private static int component1 = 125 % 128;
        private static int component2 = 0;
        private static int copydefault = 1;
        private final String component3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnInputValueChange(String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.component3 = str;
        }

        public final String getInputValue() {
            String str;
            int i = 2 % 2;
            int i2 = copydefault + 77;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 != 0) {
                str = this.component3;
                int i4 = 64 / 0;
            } else {
                str = this.component3;
            }
            int i5 = i3 + 73;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            if (125 % 2 == 0) {
                int i = 42 / 0;
            }
        }

        public static OnInputValueChange copy$default(OnInputValueChange onInputValueChange, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 125;
            copydefault = i4 % 128;
            Object obj2 = null;
            int i5 = i & 1;
            if (i4 % 2 != 0 ? i5 != 0 : i5 != 0) {
                int i6 = i3 + 119;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    String str2 = onInputValueChange.component3;
                    obj2.hashCode();
                    throw null;
                }
                str = onInputValueChange.component3;
            }
            OnInputValueChange onInputValueChangeCopy = onInputValueChange.copy(str);
            int i7 = component2 + 105;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                return onInputValueChangeCopy;
            }
            throw null;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component2 + 89;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 101;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 24 / 0;
            }
            return str;
        }

        public final OnInputValueChange copy(String inputValue) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(inputValue, "");
            OnInputValueChange onInputValueChange = new OnInputValueChange(inputValue);
            int i2 = component2 + 125;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return onInputValueChange;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnInputValueChange)) {
                int i2 = component2 + 61;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.component3, ((OnInputValueChange) other).component3)) {
                return true;
            }
            int i4 = component2 + 91;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 121;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.component3.hashCode();
            int i4 = component2 + 39;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnInputValueChange(inputValue=" + this.component3 + ")";
            int i2 = component2 + 11;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    private BongaCalculatorEvent() {
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/calculator/BongaCalculatorEvent$OnConversionTypeSelected;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/calculator/BongaCalculatorEvent;", "conversionType", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionType;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionType;)V", "getConversionType", "()Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaConversionType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnConversionTypeSelected extends BongaCalculatorEvent {
        public static final int $stable = 0;
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 41 % 128;
        private final BongaConversionType ShareDataUIState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnConversionTypeSelected(BongaConversionType bongaConversionType) {
            super(null);
            Intrinsics.checkNotNullParameter(bongaConversionType, "");
            this.ShareDataUIState = bongaConversionType;
        }

        public final BongaConversionType getConversionType() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 65;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            BongaConversionType bongaConversionType = this.ShareDataUIState;
            int i5 = i2 + 51;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return bongaConversionType;
        }

        static {
            if (41 % 2 == 0) {
                int i = 43 / 0;
            }
        }

        public static OnConversionTypeSelected copy$default(OnConversionTypeSelected onConversionTypeSelected, BongaConversionType bongaConversionType, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component1 + 27;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i & 1;
            if (i3 % 2 == 0 ? i5 != 0 : i5 != 0) {
                bongaConversionType = onConversionTypeSelected.ShareDataUIState;
                int i6 = i4 + 105;
                component1 = i6 % 128;
                int i7 = i6 % 2;
            }
            return onConversionTypeSelected.copy(bongaConversionType);
        }

        public final BongaConversionType component1() {
            int i = 2 % 2;
            int i2 = component2 + 101;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.ShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final OnConversionTypeSelected copy(BongaConversionType conversionType) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(conversionType, "");
            OnConversionTypeSelected onConversionTypeSelected = new OnConversionTypeSelected(conversionType);
            int i2 = component1 + 7;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return onConversionTypeSelected;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 61;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            if (this != other) {
                if (other instanceof OnConversionTypeSelected) {
                    return Intrinsics.areEqual(this.ShareDataUIState, ((OnConversionTypeSelected) other).ShareDataUIState);
                }
                int i5 = i2 + 107;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            int i7 = i2 + 25;
            component1 = i7 % 128;
            boolean z = i7 % 2 != 0;
            int i8 = i2 + 23;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 117;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.ShareDataUIState.hashCode();
            int i4 = component2 + 9;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "OnConversionTypeSelected(conversionType=" + this.ShareDataUIState + ")";
            int i2 = component1 + 75;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    static {
        int i = 1 + 1;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public BongaCalculatorEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
