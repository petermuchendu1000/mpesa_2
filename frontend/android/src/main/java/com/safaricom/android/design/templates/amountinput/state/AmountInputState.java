package com.safaricom.android.design.templates.amountinput.state;

import android.content.Context;
import com.huawei.digitalpayment.form.validator.repository.ValidatorRequestKt;
import com.iap.ac.config.lite.ConfigMerger;
import com.safaricom.android.design.templates.amountinput.AmountInputExtensionsKt;
import com.safaricom.android.design.templates.amountinput.model.AmountErrorType;
import com.safaricom.android.design.templates.amountinput.model.AmountInputConfig;
import com.safaricom.android.design.templates.amountinput.model.AmountValidatorType;
import com.safaricom.android.design.templates.amountinput.model.OverdraftInfo;
import com.safaricom.android.design.templates.amountinput.validation.ValidationResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018JR\u00107\u001a\u0004\u0018\u00010\u00032\u0006\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020;2\b\b\u0002\u0010<\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020;2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0007HÆ\u0003J\t\u0010[\u001a\u00020\tHÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010^\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010_\u001a\u00020\u0007HÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\"J\t\u0010b\u001a\u00020\u0007HÆ\u0003J\t\u0010c\u001a\u00020\u0007HÆ\u0003J\t\u0010d\u001a\u00020\u0007HÆ\u0003J\t\u0010e\u001a\u00020\u0016HÆ\u0003J¬\u0001\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001¢\u0006\u0002\u0010gJ\u0013\u0010h\u001a\u00020\u00072\b\u0010i\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010j\u001a\u00020;HÖ\u0001J\t\u0010k\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001dR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b&\u0010\"R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b'\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b.\u0010\u001dR\u0011\u0010/\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u00103\u001a\u0004\u0018\u0001048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010A\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bB\u0010\u001dR\u0013\u0010C\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bD\u0010\"R\u0013\u0010E\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bF\u0010\"R\u0013\u0010G\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bH\u0010\"R\u0013\u0010I\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bJ\u0010\"R\u0011\u0010K\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bK\u0010\u001dR\u0011\u0010L\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bM\u0010\u001dR\u0011\u0010N\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bO\u0010\u001dR\u0011\u0010P\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bQ\u0010\u001dR\u0011\u0010R\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bS\u0010\u001dR\u0011\u0010T\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bU\u0010\u001dR\u0011\u0010V\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bV\u0010\u001d¨\u0006l"}, d2 = {"Lcom/safaricom/android/design/templates/amountinput/state/AmountInputState;", "", "amountText", "", "hintText", "helperText", "isValid", "", "validationResult", "Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "currencyLabel", "balance", "", "overdraftInfo", "Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "isBalanceOutdated", "fastWithdrawFee", "withdrawalFee", "withdrawalFeeChecked", "supportsMultipleWallet", "showMultipleWalletTooltip", ConfigMerger.COMMON_CONFIG_SECTION, "Lcom/safaricom/android/design/templates/amountinput/model/AmountInputConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;Ljava/lang/String;Ljava/lang/Double;Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;ZLjava/lang/Double;Ljava/lang/Double;ZZZLcom/safaricom/android/design/templates/amountinput/model/AmountInputConfig;)V", "getAmountText", "()Ljava/lang/String;", "getHintText", "getHelperText", "()Z", "getValidationResult", "()Lcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;", "getCurrencyLabel", "getBalance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOverdraftInfo", "()Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;", "getFastWithdrawFee", "getWithdrawalFee", "getWithdrawalFeeChecked", "getSupportsMultipleWallet", "getShowMultipleWalletTooltip", "getConfig", "()Lcom/safaricom/android/design/templates/amountinput/model/AmountInputConfig;", "canSubmit", "getCanSubmit", "errorType", "Lcom/safaricom/android/design/templates/amountinput/model/AmountErrorType;", "getErrorType", "()Lcom/safaricom/android/design/templates/amountinput/model/AmountErrorType;", ValidatorRequestKt.VALIDATOR_SP_NAME, "Lcom/safaricom/android/design/templates/amountinput/model/AmountValidatorType;", "getValidator", "()Lcom/safaricom/android/design/templates/amountinput/model/AmountValidatorType;", "getErrorMessage", "context", "Landroid/content/Context;", "minAmountLabel", "", "maxAmountLabel", "balanceLabel", "penaltyErrorLabel", "constraintErrorLabel", "invalidInputErrorLabel", "overdrawIsActive", "getOverdrawIsActive", "overdraftBalance", "getOverdraftBalance", "totalAvailableBalance", "getTotalAvailableBalance", "minAmount", "getMinAmount", "maxAmount", "getMaxAmount", "isEditable", "showBalance", "getShowBalance", "showCurrency", "getShowCurrency", "supportsOverdraft", "getSupportsOverdraft", "allowDecimalAmount", "getAllowDecimalAmount", "showWithdrawalFeeToggle", "getShowWithdrawalFeeToggle", "isBalanceCheckEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/safaricom/android/design/templates/amountinput/validation/ValidationResult;Ljava/lang/String;Ljava/lang/Double;Lcom/safaricom/android/design/templates/amountinput/model/OverdraftInfo;ZLjava/lang/Double;Ljava/lang/Double;ZZZLcom/safaricom/android/design/templates/amountinput/model/AmountInputConfig;)Lcom/safaricom/android/design/templates/amountinput/state/AmountInputState;", "equals", "other", "hashCode", "toString", "ConsumerSfcAmountInput_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AmountInputState {
    public static final int $stable = 0;
    private final boolean ArtificialStackFrames;
    private final String ShareDataUIState;
    private final AmountInputConfig component1;
    private final String component2;
    private final Double component3;
    private final String component4;
    private final boolean copy;
    private final Double copydefault;
    private final boolean equals;
    private final OverdraftInfo getAsAtTimestamp;
    private final String getRequestBeneficiariesState;
    private final ValidationResult getShareableDataState;
    private final Double getSponsorBeneficiariesState;
    private final boolean hashCode;
    private final boolean toString;

    public AmountInputState(String str, String str2, String str3, boolean z, ValidationResult validationResult, String str4, Double d2, OverdraftInfo overdraftInfo, boolean z2, Double d3, Double d4, boolean z3, boolean z4, boolean z5, AmountInputConfig amountInputConfig) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(validationResult, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(amountInputConfig, "");
        this.ShareDataUIState = str;
        this.getRequestBeneficiariesState = str2;
        this.component4 = str3;
        this.copy = z;
        this.getShareableDataState = validationResult;
        this.component2 = str4;
        this.copydefault = d2;
        this.getAsAtTimestamp = overdraftInfo;
        this.equals = z2;
        this.component3 = d3;
        this.getSponsorBeneficiariesState = d4;
        this.toString = z3;
        this.ArtificialStackFrames = z4;
        this.hashCode = z5;
        this.component1 = amountInputConfig;
    }

    public AmountInputState(String str, String str2, String str3, boolean z, ValidationResult validationResult, String str4, Double d2, OverdraftInfo overdraftInfo, boolean z2, Double d3, Double d4, boolean z3, boolean z4, boolean z5, AmountInputConfig amountInputConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? ValidationResult.Valid.INSTANCE : validationResult, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : d2, (i & 128) != 0 ? null : overdraftInfo, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : d3, (i & 1024) != 0 ? null : d4, (i & 2048) != 0 ? false : z3, (i & 4096) != 0 ? false : z4, (i & 8192) != 0 ? false : z5, amountInputConfig);
    }

    public final String getAmountText() {
        return this.ShareDataUIState;
    }

    public final String getHintText() {
        return this.getRequestBeneficiariesState;
    }

    public final String getHelperText() {
        return this.component4;
    }

    public final boolean isValid() {
        return this.copy;
    }

    public final ValidationResult getValidationResult() {
        return this.getShareableDataState;
    }

    public final String getCurrencyLabel() {
        return this.component2;
    }

    public final Double getBalance() {
        return this.copydefault;
    }

    public final OverdraftInfo getOverdraftInfo() {
        return this.getAsAtTimestamp;
    }

    public final boolean isBalanceOutdated() {
        return this.equals;
    }

    public final Double getFastWithdrawFee() {
        return this.component3;
    }

    public final Double getWithdrawalFee() {
        return this.getSponsorBeneficiariesState;
    }

    public final boolean getWithdrawalFeeChecked() {
        return this.toString;
    }

    public final boolean getSupportsMultipleWallet() {
        return this.ArtificialStackFrames;
    }

    public final boolean getShowMultipleWalletTooltip() {
        return this.hashCode;
    }

    public final AmountInputConfig getConfig() {
        return this.component1;
    }

    public final boolean getCanSubmit() {
        return this.copy && (this.getShareableDataState instanceof ValidationResult.Valid);
    }

    public final AmountErrorType getErrorType() {
        ValidationResult validationResult = this.getShareableDataState;
        if (!(validationResult instanceof ValidationResult.Valid) && !(validationResult instanceof ValidationResult.Empty)) {
            if (validationResult instanceof ValidationResult.Invalid) {
                if (((ValidationResult.Invalid) validationResult).getType() == AmountValidatorType.USE_OVERDRAW_BALANCE) {
                    return AmountErrorType.OVERDRAW;
                }
                return AmountErrorType.SUBMISSION_ERROR;
            }
            if (validationResult instanceof ValidationResult.Warning) {
                return AmountErrorType.WARNING;
            }
            throw new NoWhenBranchMatchedException();
        }
        return AmountErrorType.NO_ERROR;
    }

    public final AmountValidatorType getValidator() {
        ValidationResult validationResult = this.getShareableDataState;
        if (validationResult instanceof ValidationResult.Invalid) {
            return ((ValidationResult.Invalid) validationResult).getType();
        }
        if (validationResult instanceof ValidationResult.Warning) {
            return ((ValidationResult.Warning) validationResult).getType();
        }
        return null;
    }

    public final String getErrorMessage(Context context, int minAmountLabel, int maxAmountLabel, int balanceLabel, String penaltyErrorLabel, String constraintErrorLabel, String invalidInputErrorLabel) {
        Intrinsics.checkNotNullParameter(context, "");
        return AmountInputExtensionsKt.formatErrorLabelToString(AmountInputExtensionsKt.formatBasicErrorMessage(context, this.component1, getValidator(), minAmountLabel, maxAmountLabel, balanceLabel, penaltyErrorLabel, constraintErrorLabel, invalidInputErrorLabel));
    }

    public final boolean getOverdrawIsActive() {
        OverdraftInfo overdraftInfo = this.getAsAtTimestamp;
        return overdraftInfo != null && overdraftInfo.isActive();
    }

    public final Double getOverdraftBalance() {
        OverdraftInfo overdraftInfo = this.getAsAtTimestamp;
        if (overdraftInfo != null) {
            return Double.valueOf(overdraftInfo.getBalance());
        }
        return null;
    }

    public final Double getTotalAvailableBalance() {
        Double d2 = this.copydefault;
        if (d2 == null) {
            return null;
        }
        double dDoubleValue = d2.doubleValue();
        Double overdraftBalance = getOverdraftBalance();
        return Double.valueOf(dDoubleValue + (overdraftBalance != null ? overdraftBalance.doubleValue() : 0.0d));
    }

    public final Double getMinAmount() {
        return this.component1.getMinAmount();
    }

    public final Double getMaxAmount() {
        return this.component1.getMaxAmount();
    }

    public final boolean isEditable() {
        return this.component1.isAmountEditable();
    }

    public final boolean getShowBalance() {
        return this.component1.getShowBalance();
    }

    public final boolean getShowCurrency() {
        return this.component1.getShowCurrency();
    }

    public final boolean getSupportsOverdraft() {
        return this.component1.getSupportsOverdraw();
    }

    public final boolean getAllowDecimalAmount() {
        return this.component1.getAllowDecimal();
    }

    public final boolean getShowWithdrawalFeeToggle() {
        return this.component1.getShowWithdrawalFees();
    }

    public final boolean isBalanceCheckEnabled() {
        return this.component1.isBalanceCheckEnabled();
    }

    public final String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final Double getComponent3() {
        return this.component3;
    }

    public final Double getGetSponsorBeneficiariesState() {
        return this.getSponsorBeneficiariesState;
    }

    public final boolean getToString() {
        return this.toString;
    }

    public final boolean getArtificialStackFrames() {
        return this.ArtificialStackFrames;
    }

    public final boolean getHashCode() {
        return this.hashCode;
    }

    public final AmountInputConfig getComponent1() {
        return this.component1;
    }

    public final String getGetRequestBeneficiariesState() {
        return this.getRequestBeneficiariesState;
    }

    public final String getComponent4() {
        return this.component4;
    }

    public final boolean getCopy() {
        return this.copy;
    }

    public final ValidationResult getGetShareableDataState() {
        return this.getShareableDataState;
    }

    public final String getComponent2() {
        return this.component2;
    }

    public final Double getCopydefault() {
        return this.copydefault;
    }

    public final OverdraftInfo getGetAsAtTimestamp() {
        return this.getAsAtTimestamp;
    }

    public final boolean getEquals() {
        return this.equals;
    }

    public final AmountInputState copy(String amountText, String hintText, String helperText, boolean isValid, ValidationResult validationResult, String currencyLabel, Double balance, OverdraftInfo overdraftInfo, boolean isBalanceOutdated, Double fastWithdrawFee, Double withdrawalFee, boolean withdrawalFeeChecked, boolean supportsMultipleWallet, boolean showMultipleWalletTooltip, AmountInputConfig config) {
        Intrinsics.checkNotNullParameter(amountText, "");
        Intrinsics.checkNotNullParameter(hintText, "");
        Intrinsics.checkNotNullParameter(helperText, "");
        Intrinsics.checkNotNullParameter(validationResult, "");
        Intrinsics.checkNotNullParameter(currencyLabel, "");
        Intrinsics.checkNotNullParameter(config, "");
        return new AmountInputState(amountText, hintText, helperText, isValid, validationResult, currencyLabel, balance, overdraftInfo, isBalanceOutdated, fastWithdrawFee, withdrawalFee, withdrawalFeeChecked, supportsMultipleWallet, showMultipleWalletTooltip, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmountInputState)) {
            return false;
        }
        AmountInputState amountInputState = (AmountInputState) other;
        return Intrinsics.areEqual(this.ShareDataUIState, amountInputState.ShareDataUIState) && Intrinsics.areEqual(this.getRequestBeneficiariesState, amountInputState.getRequestBeneficiariesState) && Intrinsics.areEqual(this.component4, amountInputState.component4) && this.copy == amountInputState.copy && Intrinsics.areEqual(this.getShareableDataState, amountInputState.getShareableDataState) && Intrinsics.areEqual(this.component2, amountInputState.component2) && Intrinsics.areEqual((Object) this.copydefault, (Object) amountInputState.copydefault) && Intrinsics.areEqual(this.getAsAtTimestamp, amountInputState.getAsAtTimestamp) && this.equals == amountInputState.equals && Intrinsics.areEqual((Object) this.component3, (Object) amountInputState.component3) && Intrinsics.areEqual((Object) this.getSponsorBeneficiariesState, (Object) amountInputState.getSponsorBeneficiariesState) && this.toString == amountInputState.toString && this.ArtificialStackFrames == amountInputState.ArtificialStackFrames && this.hashCode == amountInputState.hashCode && Intrinsics.areEqual(this.component1, amountInputState.component1);
    }

    public int hashCode() {
        int iHashCode = this.ShareDataUIState.hashCode();
        int iHashCode2 = this.getRequestBeneficiariesState.hashCode();
        int iHashCode3 = this.component4.hashCode();
        int iHashCode4 = Boolean.hashCode(this.copy);
        int iHashCode5 = this.getShareableDataState.hashCode();
        int iHashCode6 = this.component2.hashCode();
        Double d2 = this.copydefault;
        int iHashCode7 = d2 == null ? 0 : d2.hashCode();
        OverdraftInfo overdraftInfo = this.getAsAtTimestamp;
        int iHashCode8 = overdraftInfo == null ? 0 : overdraftInfo.hashCode();
        int iHashCode9 = Boolean.hashCode(this.equals);
        Double d3 = this.component3;
        int iHashCode10 = d3 == null ? 0 : d3.hashCode();
        Double d4 = this.getSponsorBeneficiariesState;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (d4 != null ? d4.hashCode() : 0)) * 31) + Boolean.hashCode(this.toString)) * 31) + Boolean.hashCode(this.ArtificialStackFrames)) * 31) + Boolean.hashCode(this.hashCode)) * 31) + this.component1.hashCode();
    }

    public String toString() {
        return "AmountInputState(amountText=" + this.ShareDataUIState + ", hintText=" + this.getRequestBeneficiariesState + ", helperText=" + this.component4 + ", isValid=" + this.copy + ", validationResult=" + this.getShareableDataState + ", currencyLabel=" + this.component2 + ", balance=" + this.copydefault + ", overdraftInfo=" + this.getAsAtTimestamp + ", isBalanceOutdated=" + this.equals + ", fastWithdrawFee=" + this.component3 + ", withdrawalFee=" + this.getSponsorBeneficiariesState + ", withdrawalFeeChecked=" + this.toString + ", supportsMultipleWallet=" + this.ArtificialStackFrames + ", showMultipleWalletTooltip=" + this.hashCode + ", config=" + this.component1 + ')';
    }
}
