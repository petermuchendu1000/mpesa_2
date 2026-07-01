package com.safaricom.consumer.commons.amountvalidation;

import com.safaricom.consumer.commons.amountvalidation.AmountViewModel;
import com.safaricom.consumer.commons.util.TextResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003J\u009d\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u00106\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010&\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010\u0019¨\u0006;"}, d2 = {"Lcom/safaricom/consumer/commons/amountvalidation/AmountDetailsState;", "", "amount", "", "isAmountEmpty", "", "isAmountEditable", "amountHasError", "amountErrorText", "Lcom/safaricom/consumer/commons/util/TextResource;", "amountErrorType", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;", "isAmountExceedingBalance", "isAmountExceedingOverdraftBalance", "shouldUseOverdraftAmount", "mpesaBalance", "", "shouldShowBalances", "currencyText", "exchangeAmount", "exchangeCurrencyText", "<init>", "(Ljava/lang/String;ZZZLcom/safaricom/consumer/commons/util/TextResource;Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;ZZZDZLcom/safaricom/consumer/commons/util/TextResource;Ljava/lang/String;Lcom/safaricom/consumer/commons/util/TextResource;)V", "getAmount", "()Ljava/lang/String;", "()Z", "getAmountHasError", "getAmountErrorText", "()Lcom/safaricom/consumer/commons/util/TextResource;", "getAmountErrorType", "()Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;", "getShouldUseOverdraftAmount", "getMpesaBalance", "()D", "getShouldShowBalances", "getCurrencyText", "getExchangeAmount", "getExchangeCurrencyText", "isButtonEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountDetailsState {
    private final boolean ArtificialStackFrames;
    private final String ShareDataUIState;
    private final boolean component1;
    private final AmountViewModel.AmountErrorType component2;
    private final TextResource component3;
    private final boolean component4;
    private final boolean copy;
    private final TextResource copydefault;
    private final String equals;
    private final TextResource getAsAtTimestamp;
    private final boolean getRequestBeneficiariesState;
    private final boolean getShareableDataState;
    private final boolean getSponsorBeneficiariesState;
    private final double toString;

    public AmountDetailsState(String str, boolean z, boolean z2, boolean z3, TextResource textResource, AmountViewModel.AmountErrorType amountErrorType, boolean z4, boolean z5, boolean z6, double d2, boolean z7, TextResource textResource2, String str2, TextResource textResource3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ShareDataUIState = str;
        this.copy = z;
        this.getRequestBeneficiariesState = z2;
        this.component1 = z3;
        this.component3 = textResource;
        this.component2 = amountErrorType;
        this.component4 = z4;
        this.ArtificialStackFrames = z5;
        this.getSponsorBeneficiariesState = z6;
        this.toString = d2;
        this.getShareableDataState = z7;
        this.copydefault = textResource2;
        this.equals = str2;
        this.getAsAtTimestamp = textResource3;
    }

    public AmountDetailsState(String str, boolean z, boolean z2, boolean z3, TextResource textResource, AmountViewModel.AmountErrorType amountErrorType, boolean z4, boolean z5, boolean z6, double d2, boolean z7, TextResource textResource2, String str2, TextResource textResource3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : textResource, (i & 32) != 0 ? null : amountErrorType, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? false : z5, (i & 256) == 0 ? z6 : false, (i & 512) != 0 ? 0.0d : d2, (i & 1024) == 0 ? z7 : true, (i & 2048) != 0 ? null : textResource2, (i & 4096) == 0 ? str2 : "", (i & 8192) != 0 ? null : textResource3);
    }

    public final String getAmount() {
        return this.ShareDataUIState;
    }

    public final boolean isAmountEmpty() {
        return this.copy;
    }

    public final boolean isAmountEditable() {
        return this.getRequestBeneficiariesState;
    }

    public final boolean getAmountHasError() {
        return this.component1;
    }

    public final TextResource getAmountErrorText() {
        return this.component3;
    }

    public final AmountViewModel.AmountErrorType getAmountErrorType() {
        return this.component2;
    }

    public final boolean isAmountExceedingBalance() {
        return this.component4;
    }

    public final boolean isAmountExceedingOverdraftBalance() {
        return this.ArtificialStackFrames;
    }

    public final boolean getShouldUseOverdraftAmount() {
        return this.getSponsorBeneficiariesState;
    }

    public final double getMpesaBalance() {
        return this.toString;
    }

    public final boolean getShouldShowBalances() {
        return this.getShareableDataState;
    }

    public final TextResource getCurrencyText() {
        return this.copydefault;
    }

    public final String getExchangeAmount() {
        return this.equals;
    }

    public final TextResource getExchangeCurrencyText() {
        return this.getAsAtTimestamp;
    }

    public final boolean isButtonEnabled() {
        return (this.copy || this.component1) ? false : true;
    }

    public AmountDetailsState() {
        this(null, false, false, false, null, null, false, false, false, 0.0d, false, null, null, null, 16383, null);
    }

    public final String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final double getToString() {
        return this.toString;
    }

    public final boolean getGetShareableDataState() {
        return this.getShareableDataState;
    }

    public final TextResource getCopydefault() {
        return this.copydefault;
    }

    public final String getEquals() {
        return this.equals;
    }

    public final TextResource getGetAsAtTimestamp() {
        return this.getAsAtTimestamp;
    }

    public final boolean getCopy() {
        return this.copy;
    }

    public final boolean getGetRequestBeneficiariesState() {
        return this.getRequestBeneficiariesState;
    }

    public final boolean getComponent1() {
        return this.component1;
    }

    public final TextResource getComponent3() {
        return this.component3;
    }

    public final AmountViewModel.AmountErrorType getComponent2() {
        return this.component2;
    }

    public final boolean getComponent4() {
        return this.component4;
    }

    public final boolean getArtificialStackFrames() {
        return this.ArtificialStackFrames;
    }

    public final boolean getGetSponsorBeneficiariesState() {
        return this.getSponsorBeneficiariesState;
    }

    public final AmountDetailsState copy(String amount, boolean isAmountEmpty, boolean isAmountEditable, boolean amountHasError, TextResource amountErrorText, AmountViewModel.AmountErrorType amountErrorType, boolean isAmountExceedingBalance, boolean isAmountExceedingOverdraftBalance, boolean shouldUseOverdraftAmount, double mpesaBalance, boolean shouldShowBalances, TextResource currencyText, String exchangeAmount, TextResource exchangeCurrencyText) {
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(exchangeAmount, "");
        return new AmountDetailsState(amount, isAmountEmpty, isAmountEditable, amountHasError, amountErrorText, amountErrorType, isAmountExceedingBalance, isAmountExceedingOverdraftBalance, shouldUseOverdraftAmount, mpesaBalance, shouldShowBalances, currencyText, exchangeAmount, exchangeCurrencyText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmountDetailsState)) {
            return false;
        }
        AmountDetailsState amountDetailsState = (AmountDetailsState) other;
        return Intrinsics.areEqual(this.ShareDataUIState, amountDetailsState.ShareDataUIState) && this.copy == amountDetailsState.copy && this.getRequestBeneficiariesState == amountDetailsState.getRequestBeneficiariesState && this.component1 == amountDetailsState.component1 && Intrinsics.areEqual(this.component3, amountDetailsState.component3) && this.component2 == amountDetailsState.component2 && this.component4 == amountDetailsState.component4 && this.ArtificialStackFrames == amountDetailsState.ArtificialStackFrames && this.getSponsorBeneficiariesState == amountDetailsState.getSponsorBeneficiariesState && Double.compare(this.toString, amountDetailsState.toString) == 0 && this.getShareableDataState == amountDetailsState.getShareableDataState && Intrinsics.areEqual(this.copydefault, amountDetailsState.copydefault) && Intrinsics.areEqual(this.equals, amountDetailsState.equals) && Intrinsics.areEqual(this.getAsAtTimestamp, amountDetailsState.getAsAtTimestamp);
    }

    public int hashCode() {
        int iHashCode = this.ShareDataUIState.hashCode();
        int iHashCode2 = Boolean.hashCode(this.copy);
        int iHashCode3 = Boolean.hashCode(this.getRequestBeneficiariesState);
        int iHashCode4 = Boolean.hashCode(this.component1);
        TextResource textResource = this.component3;
        int iHashCode5 = textResource == null ? 0 : textResource.hashCode();
        AmountViewModel.AmountErrorType amountErrorType = this.component2;
        int iHashCode6 = amountErrorType == null ? 0 : amountErrorType.hashCode();
        int iHashCode7 = Boolean.hashCode(this.component4);
        int iHashCode8 = Boolean.hashCode(this.ArtificialStackFrames);
        int iHashCode9 = Boolean.hashCode(this.getSponsorBeneficiariesState);
        int iHashCode10 = Double.hashCode(this.toString);
        int iHashCode11 = Boolean.hashCode(this.getShareableDataState);
        TextResource textResource2 = this.copydefault;
        int iHashCode12 = textResource2 == null ? 0 : textResource2.hashCode();
        int iHashCode13 = this.equals.hashCode();
        TextResource textResource3 = this.getAsAtTimestamp;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (textResource3 != null ? textResource3.hashCode() : 0);
    }

    public String toString() {
        return "AmountDetailsState(amount=" + this.ShareDataUIState + ", isAmountEmpty=" + this.copy + ", isAmountEditable=" + this.getRequestBeneficiariesState + ", amountHasError=" + this.component1 + ", amountErrorText=" + this.component3 + ", amountErrorType=" + this.component2 + ", isAmountExceedingBalance=" + this.component4 + ", isAmountExceedingOverdraftBalance=" + this.ArtificialStackFrames + ", shouldUseOverdraftAmount=" + this.getSponsorBeneficiariesState + ", mpesaBalance=" + this.toString + ", shouldShowBalances=" + this.getShareableDataState + ", currencyText=" + this.copydefault + ", exchangeAmount=" + this.equals + ", exchangeCurrencyText=" + this.getAsAtTimestamp + ')';
    }
}
