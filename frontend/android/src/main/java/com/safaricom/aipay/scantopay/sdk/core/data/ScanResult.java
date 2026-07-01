package com.safaricom.aipay.scantopay.sdk.core.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/data/ScanResult;", "", "Success", "Error", "Lcom/safaricom/aipay/scantopay/sdk/core/data/ScanResult$Error;", "Lcom/safaricom/aipay/scantopay/sdk/core/data/ScanResult$Success;", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ScanResult {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/data/ScanResult$Error;", "Lcom/safaricom/aipay/scantopay/sdk/core/data/ScanResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error implements ScanResult {
        private final String message;

        public Error(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }

        public static Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        public final String getMessage() {
            return this.message;
        }

        public final Error copy(String message) {
            Intrinsics.checkNotNullParameter(message, "");
            return new Error(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/safaricom/aipay/scantopay/sdk/core/data/ScanResult$Success;", "Lcom/safaricom/aipay/scantopay/sdk/core/data/ScanResult;", "paymentDetails", "Lcom/safaricom/aipay/scantopay/sdk/core/data/PaymentDetails;", "<init>", "(Lcom/safaricom/aipay/scantopay/sdk/core/data/PaymentDetails;)V", "getPaymentDetails", "()Lcom/safaricom/aipay/scantopay/sdk/core/data/PaymentDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "scan-to-pay-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success implements ScanResult {
        private final PaymentDetails paymentDetails;

        public Success(PaymentDetails paymentDetails) {
            Intrinsics.checkNotNullParameter(paymentDetails, "");
            this.paymentDetails = paymentDetails;
        }

        public final PaymentDetails getPaymentDetails() {
            return this.paymentDetails;
        }

        public static Success copy$default(Success success, PaymentDetails paymentDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentDetails = success.paymentDetails;
            }
            return success.copy(paymentDetails);
        }

        public final PaymentDetails getPaymentDetails() {
            return this.paymentDetails;
        }

        public final Success copy(PaymentDetails paymentDetails) {
            Intrinsics.checkNotNullParameter(paymentDetails, "");
            return new Success(paymentDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.paymentDetails, ((Success) other).paymentDetails);
        }

        public int hashCode() {
            return this.paymentDetails.hashCode();
        }

        public String toString() {
            return "Success(paymentDetails=" + this.paymentDetails + ")";
        }
    }
}
