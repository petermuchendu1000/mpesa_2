package com.safaricom.android.design.templates.amountinput;

import android.content.Context;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import com.huawei.digitalpayment.form.validator.repository.ValidatorRequestKt;
import com.iap.ac.config.lite.ConfigMerger;
import com.safaricom.android.design.templates.amountinput.model.AmountErrorLabel;
import com.safaricom.android.design.templates.amountinput.model.AmountErrorType;
import com.safaricom.android.design.templates.amountinput.model.AmountInputConfig;
import com.safaricom.android.design.templates.amountinput.model.AmountValidatorType;
import com.safaricom.android.design.templates.amountinput.model.Wallet;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\t\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001ad\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u001a\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\b\u001a%\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0002\u0010\u001d\u001a2\u0010\u001e\u001a\u00020\u0014*\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u0004\u001a\n\u0010$\u001a\u00020\u0014*\u00020\u001f\u001a\n\u0010%\u001a\u00020\u0014*\u00020\u001f\u001a\n\u0010&\u001a\u00020\u0014*\u00020\u0014\u001a\u001e\u0010'\u001a\u00020\u0004*\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u0010¨\u0006("}, d2 = {"toInputTextColor", "Landroidx/compose/ui/graphics/Color;", "Lcom/safaricom/android/design/templates/amountinput/model/AmountErrorType;", "overdrawActive", "", "(Lcom/safaricom/android/design/templates/amountinput/model/AmountErrorType;ZLandroidx/compose/runtime/Composer;I)J", "rememberAmountErrorColor", "formatBasicErrorMessage", "Lcom/safaricom/android/design/templates/amountinput/model/AmountErrorLabel;", "context", "Landroid/content/Context;", ConfigMerger.COMMON_CONFIG_SECTION, "Lcom/safaricom/android/design/templates/amountinput/model/AmountInputConfig;", ValidatorRequestKt.VALIDATOR_SP_NAME, "Lcom/safaricom/android/design/templates/amountinput/model/AmountValidatorType;", "minAmountLabel", "", "maxAmountLabel", "balanceLabel", "penaltyErrorLabel", "", "constraintErrorLabel", "invalidInputErrorLabel", "formatErrorLabelToString", "errorLabel", "isValidAmount", "input", "maxLength", "maxDecimalPlaces", "(Ljava/lang/String;Ljava/lang/Integer;I)Z", "toAmount", "", "forcePositivePrefix", "forceDecimals", "forceNegativePrefix", "showDecimalPart", "toFormattedAmount", "toWholeAmount", "toCleanAmountInput", "isValidAmountFormat", "ConsumerSfcAmountInput_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AmountInputExtensionsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AmountErrorType.values().length];
            try {
                iArr[AmountErrorType.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AmountErrorType.SUBMISSION_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AmountErrorType.OVERDRAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AmountErrorType.NO_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AmountValidatorType.values().length];
            try {
                iArr2[AmountValidatorType.NO_INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AmountValidatorType.ABOVE_MAX_AMOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AmountValidatorType.BELOW_MIN_AMOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AmountValidatorType.ABOVE_CURRENT_BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AmountValidatorType.ABOVE_CURRENT_OVERDRAW_BALANCE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AmountValidatorType.USE_OVERDRAW_BALANCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AmountValidatorType.WARNING.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AmountValidatorType.CONSTRAINTS_VIOLATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[AmountValidatorType.INVALID_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final long toInputTextColor(AmountErrorType amountErrorType, boolean z, Composer composer, int i) {
        long jM2854getSecondary0d7_KjU;
        Intrinsics.checkNotNullParameter(amountErrorType, "");
        composer.startReplaceGroup(-1284525354);
        int i2 = WhenMappings.$EnumSwitchMapping$0[amountErrorType.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(277231960);
            jM2854getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary();
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(277234324);
            jM2854getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError();
            composer.endReplaceGroup();
        } else if (i2 == 3) {
            composer.startReplaceGroup(277235561);
            if (z) {
                composer.startReplaceGroup(277236950);
                jM2854getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary();
            } else {
                composer.startReplaceGroup(277238196);
                jM2854getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError();
            }
            composer.endReplaceGroup();
            composer.endReplaceGroup();
        } else {
            if (i2 != 4) {
                composer.startReplaceGroup(277230081);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(277240184);
            jM2854getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurface();
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        return jM2854getSecondary0d7_KjU;
    }

    public static final long rememberAmountErrorColor(AmountErrorType amountErrorType, boolean z, Composer composer, int i) {
        long jM2854getSecondary0d7_KjU;
        Intrinsics.checkNotNullParameter(amountErrorType, "");
        composer.startReplaceGroup(380580285);
        int i2 = WhenMappings.$EnumSwitchMapping$0[amountErrorType.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(27525329);
            jM2854getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary();
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(27527693);
            jM2854getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError();
            composer.endReplaceGroup();
        } else if (i2 == 3) {
            composer.startReplaceGroup(27528930);
            if (z) {
                composer.startReplaceGroup(27530319);
                jM2854getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary();
            } else {
                composer.startReplaceGroup(27531565);
                jM2854getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError();
            }
            composer.endReplaceGroup();
            composer.endReplaceGroup();
        } else {
            if (i2 != 4) {
                composer.startReplaceGroup(27523448);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(27533551);
            jM2854getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOutline();
            composer.endReplaceGroup();
        }
        long jM6064unboximpl = SingleValueAnimationKt.m447animateColorAsStateeuL9pac(jM2854getSecondary0d7_KjU, AnimationSpecKt.tween$default(300, 0, null, 6, null), "AnimatedInputBorderColor", null, composer, 432, 8).getValue().m6064unboximpl();
        composer.endReplaceGroup();
        return jM6064unboximpl;
    }

    public static final AmountErrorLabel formatBasicErrorMessage(Context context, AmountInputConfig amountInputConfig, AmountValidatorType amountValidatorType, int i, int i2, int i3, String str, String str2, String str3) {
        String currency;
        String formattedAmount;
        String formattedAmount2;
        AmountErrorLabel amountErrorLabel;
        AmountErrorLabel amountErrorLabel2;
        String str4 = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(amountInputConfig, "");
        Wallet selectedWallet = amountInputConfig.getSelectedWallet();
        if (selectedWallet == null || (currency = selectedWallet.getCurrencySymbol()) == null) {
            currency = amountInputConfig.getCurrency();
        }
        switch (amountValidatorType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[amountValidatorType.ordinal()]) {
            case -1:
            case 1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 2:
                String string = context.getString(i2);
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i4 = R.string.common_custom_currencyFormat;
                Double maxAmount = amountInputConfig.getMaxAmount();
                if (maxAmount != null && (formattedAmount = toFormattedAmount(maxAmount.doubleValue())) != null) {
                    str4 = formattedAmount;
                }
                return new AmountErrorLabel(string, context.getString(i4, currency, str4));
            case 3:
                String string2 = context.getString(i);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                int i5 = R.string.common_custom_currencyFormat;
                Double minAmount = amountInputConfig.getMinAmount();
                if (minAmount != null && (formattedAmount2 = toFormattedAmount(minAmount.doubleValue())) != null) {
                    str4 = formattedAmount2;
                }
                return new AmountErrorLabel(string2, context.getString(i5, currency, str4));
            case 4:
                String string3 = context.getString(i3);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                amountErrorLabel = new AmountErrorLabel(string3, null);
                return amountErrorLabel;
            case 5:
                String string4 = context.getString(R.string.amountTransaction_exceedsAvailableCredit);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                amountErrorLabel = new AmountErrorLabel(string4, null);
                return amountErrorLabel;
            case 6:
                String string5 = context.getString(R.string.amountTransaction_usingOverdraft);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                amountErrorLabel = new AmountErrorLabel(string5, null);
                return amountErrorLabel;
            case 7:
                if (str == null) {
                    str = context.getString(R.string.amountTransaction_warning);
                    Intrinsics.checkNotNullExpressionValue(str, "");
                }
                amountErrorLabel2 = new AmountErrorLabel(str, null);
                return amountErrorLabel2;
            case 8:
                if (str2 == null) {
                    str2 = context.getString(R.string.amountTransaction_constraintsViolated);
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                }
                amountErrorLabel2 = new AmountErrorLabel(str2, null);
                return amountErrorLabel2;
            case 9:
                if (str3 == null) {
                    str3 = context.getString(R.string.amountTransaction_invalidInput);
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                }
                amountErrorLabel2 = new AmountErrorLabel(str3, null);
                return amountErrorLabel2;
        }
    }

    public static final String formatErrorLabelToString(AmountErrorLabel amountErrorLabel) {
        if (amountErrorLabel == null) {
            return null;
        }
        if (amountErrorLabel.getValue() != null) {
            return amountErrorLabel.getLabel() + ' ' + amountErrorLabel.getValue();
        }
        return amountErrorLabel.getLabel();
    }

    public static final boolean isValidAmount(String str, Integer num, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (num != null && str.length() > num.intValue()) {
            return false;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
        if (listSplit$default.size() > 2) {
            return false;
        }
        String str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
        return (str2 != null ? str2.length() : 0) <= i;
    }

    public static String toAmount$default(double d2, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z4 = true;
        }
        return toAmount(d2, z, z2, z3, z4);
    }

    public static final String toAmount(double d2, boolean z, boolean z2, boolean z3, boolean z4) {
        if (!z4) {
            if (d2 < 0.0d) {
                d2 = Math.ceil(d2);
            } else {
                d2 = Math.floor(d2);
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setGroupingUsed(true);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormatSymbols.setGroupingSeparator(AbstractJsonLexerKt.COMMA);
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        if (!z4) {
            decimalFormat.setMaximumFractionDigits(0);
        } else if (z2) {
            decimalFormat.setMinimumFractionDigits(2);
            decimalFormat.setMaximumFractionDigits(2);
        } else {
            decimalFormat.setMaximumFractionDigits(2);
        }
        if (z) {
            decimalFormat.setPositivePrefix("+");
        }
        if (z3) {
            decimalFormat.setNegativePrefix("-");
        }
        String str = decimalFormat.format(d2);
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public static final String toFormattedAmount(double d2) {
        return toAmount$default(d2, false, true, false, true, 5, null);
    }

    public static final String toWholeAmount(double d2) {
        return toAmount$default(d2, false, false, false, false, 7, null);
    }

    public static final String toCleanAmountInput(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            } else if (cCharAt == '.' && !z) {
                sb.append(cCharAt);
                z = true;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static boolean isValidAmountFormat$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 10;
        }
        if ((i3 & 2) != 0) {
            i2 = 2;
        }
        return isValidAmountFormat(str, i, i2);
    }

    public static final boolean isValidAmountFormat(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = str;
        if (str2.length() == 0) {
            return true;
        }
        if (str.length() > i) {
            return false;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null);
        int size = listSplit$default.size();
        if (size != 1) {
            return size == 2 && ((String) listSplit$default.get(1)).length() <= i2;
        }
        return true;
    }
}
