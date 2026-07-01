package com.safaricom.consumer.commons.withdraw;

import java.lang.Enum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\bf\u0018\u0000 \t*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\tJ\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lcom/safaricom/consumer/commons/withdraw/WithdrawFeesMethod;", "SubType", "", "", "retrieveFeeCharge", "", "value", "subtype", "(DLjava/lang/Enum;)D", "Companion", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WithdrawFeesMethod<SubType extends Enum<SubType>> {

    public static final Companion INSTANCE = Companion.component2;
    public static final double DEFAULT_FEE = 0.0d;

    double retrieveFeeCharge(double value, SubType subtype);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/safaricom/consumer/commons/withdraw/WithdrawFeesMethod$Companion;", "", "<init>", "()V", "DEFAULT_FEE", "", "SUBTYPE", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final double DEFAULT_FEE = 0.0d;
        static final Companion component2 = new Companion();

        private Companion() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/safaricom/consumer/commons/withdraw/WithdrawFeesMethod$Companion$SUBTYPE;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SUBTYPE {
            private static final EnumEntries $ENTRIES;
            private static final SUBTYPE[] $VALUES;
            public static final SUBTYPE DEFAULT = new SUBTYPE("DEFAULT", 0);

            private SUBTYPE(String str, int i) {
            }

            static {
                SUBTYPE[] subtypeArr$values = $values();
                $VALUES = subtypeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(subtypeArr$values);
            }

            public static SUBTYPE valueOf(String str) {
                return (SUBTYPE) Enum.valueOf(SUBTYPE.class, str);
            }

            public static SUBTYPE[] values() {
                return (SUBTYPE[]) $VALUES.clone();
            }

            private static final SUBTYPE[] $values() {
                return new SUBTYPE[]{DEFAULT};
            }

            public static EnumEntries<SUBTYPE> getEntries() {
                return $ENTRIES;
            }
        }
    }
}
