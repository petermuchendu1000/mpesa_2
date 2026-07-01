package com.safaricom.consumer.commons.amountvalidation;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u001a\f\u0010\b\u001a\u00020\u0002*\u0004\u0018\u00010\u0001\u001a\u0011\u0010\t\u001a\u00020\u0002*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"toAmount", "", "", "forcePositivePrefix", "", "forceDecimals", "forceNegativePrefix", "showDecimalPart", "toDoubleOrZero", "orZero", "(Ljava/lang/Double;)D", "ConsumerSfcCommons_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AmountExtensionKt {
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

    public static final double toDoubleOrZero(String str) {
        return orZero(str != null ? StringsKt.toDoubleOrNull(str) : null);
    }

    public static final double orZero(Double d2) {
        if (d2 != null) {
            return d2.doubleValue();
        }
        return 0.0d;
    }
}
