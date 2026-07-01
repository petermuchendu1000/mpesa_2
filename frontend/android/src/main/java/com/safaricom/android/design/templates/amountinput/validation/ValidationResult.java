package com.safaricom.android.design.templates.amountinput.validation;

import com.safaricom.android.design.templates.amountinput.model.AmountValidatorType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "", "<init>", "()V", "Valid", "Empty", "Invalid", "Warning", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult$Empty;", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult$Invalid;", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult$Valid;", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult$Warning;", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ValidationResult {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult$Valid;", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "<init>", "()V", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Valid extends ValidationResult {
        public static final int $stable = 0;
        public static final Valid INSTANCE = new Valid();

        private Valid() {
            super(null);
        }
    }

    private ValidationResult() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult$Empty;", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "<init>", "()V", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Empty extends ValidationResult {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        private Empty() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult$Invalid;", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "type", "Lcom/safaricom/android/design/templates/amountinput/model/AmountValidatorType;", "message", "", "<init>", "(Lcom/safaricom/android/design/templates/amountinput/model/AmountValidatorType;Ljava/lang/String;)V", "getType", "()Lcom/safaricom/android/design/templates/amountinput/model/AmountValidatorType;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Invalid extends ValidationResult {
        public static final int $stable = 0;
        private final String ShareDataUIState;
        private final AmountValidatorType component2;

        public Invalid(AmountValidatorType amountValidatorType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(amountValidatorType, (i & 2) != 0 ? null : str);
        }

        public final AmountValidatorType getType() {
            return this.component2;
        }

        public final String getMessage() {
            return this.ShareDataUIState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Invalid(AmountValidatorType amountValidatorType, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(amountValidatorType, "");
            this.component2 = amountValidatorType;
            this.ShareDataUIState = str;
        }

        public static Invalid copy$default(Invalid invalid, AmountValidatorType amountValidatorType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                amountValidatorType = invalid.component2;
            }
            if ((i & 2) != 0) {
                str = invalid.ShareDataUIState;
            }
            return invalid.copy(amountValidatorType, str);
        }

        public final AmountValidatorType getComponent2() {
            return this.component2;
        }

        public final String getShareDataUIState() {
            return this.ShareDataUIState;
        }

        public final Invalid copy(AmountValidatorType type, String message) {
            Intrinsics.checkNotNullParameter(type, "");
            return new Invalid(type, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Invalid)) {
                return false;
            }
            Invalid invalid = (Invalid) other;
            return this.component2 == invalid.component2 && Intrinsics.areEqual(this.ShareDataUIState, invalid.ShareDataUIState);
        }

        public int hashCode() {
            int iHashCode = this.component2.hashCode();
            String str = this.ShareDataUIState;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Invalid(type=" + this.component2 + ", message=" + this.ShareDataUIState + ')';
        }
    }

    public ValidationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult$Warning;", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "type", "Lcom/safaricom/android/design/templates/amountinput/model/AmountValidatorType;", "message", "", "<init>", "(Lcom/safaricom/android/design/templates/amountinput/model/AmountValidatorType;Ljava/lang/String;)V", "getType", "()Lcom/safaricom/android/design/templates/amountinput/model/AmountValidatorType;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Warning extends ValidationResult {
        public static final int $stable = 0;
        private final String ShareDataUIState;
        private final AmountValidatorType component2;

        public Warning(AmountValidatorType amountValidatorType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(amountValidatorType, (i & 2) != 0 ? null : str);
        }

        public final AmountValidatorType getType() {
            return this.component2;
        }

        public final String getMessage() {
            return this.ShareDataUIState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Warning(AmountValidatorType amountValidatorType, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(amountValidatorType, "");
            this.component2 = amountValidatorType;
            this.ShareDataUIState = str;
        }

        public static Warning copy$default(Warning warning, AmountValidatorType amountValidatorType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                amountValidatorType = warning.component2;
            }
            if ((i & 2) != 0) {
                str = warning.ShareDataUIState;
            }
            return warning.copy(amountValidatorType, str);
        }

        public final AmountValidatorType getComponent2() {
            return this.component2;
        }

        public final String getShareDataUIState() {
            return this.ShareDataUIState;
        }

        public final Warning copy(AmountValidatorType type, String message) {
            Intrinsics.checkNotNullParameter(type, "");
            return new Warning(type, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Warning)) {
                return false;
            }
            Warning warning = (Warning) other;
            return this.component2 == warning.component2 && Intrinsics.areEqual(this.ShareDataUIState, warning.ShareDataUIState);
        }

        public int hashCode() {
            int iHashCode = this.component2.hashCode();
            String str = this.ShareDataUIState;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Warning(type=" + this.component2 + ", message=" + this.ShareDataUIState + ')';
        }
    }
}
