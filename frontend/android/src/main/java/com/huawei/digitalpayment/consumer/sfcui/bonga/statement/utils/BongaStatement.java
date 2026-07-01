package com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/utils/BongaStatement;", "", "<init>", "()V", "points", "", "getPoints", "()Ljava/lang/String;", "balance", "getBalance", "date", "getDate", "additionalInfo", "getAdditionalInfo", "Accumulated", "Redeemed", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/utils/BongaStatement$Accumulated;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/utils/BongaStatement$Redeemed;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BongaStatement {
    public static final int $stable = 0;
    private static int component1 = 1;
    private static int component2;

    public abstract String getAdditionalInfo();

    public abstract String getBalance();

    public abstract String getDate();

    public abstract String getPoints();

    private BongaStatement() {
    }

    static {
        int i = 1 + 123;
        component2 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BongaStatement(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/utils/BongaStatement$Accumulated;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/utils/BongaStatement;", "points", "", "balance", "date", "additionalInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPoints", "()Ljava/lang/String;", "getBalance", "getDate", "getAdditionalInfo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Accumulated extends BongaStatement {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int copy = 1;
        private static int equals = 0;
        private static int getAsAtTimestamp = 1;
        private final String ShareDataUIState;
        private final String component2;
        private final String component3;
        private final String copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        public Accumulated(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 8) != 0) {
                int i2 = equals;
                int i3 = i2 + 61;
                copy = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 51;
                copy = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
                str4 = null;
            }
            this(str, str2, str3, str4);
        }

        @Override
        public String getPoints() {
            int i = 2 % 2;
            int i2 = equals;
            int i3 = i2 + 77;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.copydefault;
            int i4 = i2 + 53;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 73 / 0;
            }
            return str;
        }

        @Override
        public String getBalance() {
            int i = 2 % 2;
            int i2 = copy;
            int i3 = i2 + 33;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.component3;
            int i4 = i2 + 51;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        @Override
        public String getDate() {
            int i = 2 % 2;
            int i2 = copy + 73;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 95;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 33 / 0;
            }
            return str;
        }

        @Override
        public String getAdditionalInfo() {
            int i = 2 % 2;
            int i2 = copy + 15;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            String str = this.ShareDataUIState;
            int i5 = i3 + 37;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Accumulated(String str, String str2, String str3, String str4) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.copydefault = str;
            this.component3 = str2;
            this.component2 = str3;
            this.ShareDataUIState = str4;
        }

        static {
            int i = 1 + 109;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public static Accumulated copy$default(Accumulated accumulated, String str, String str2, String str3, String str4, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = equals + 99;
            int i4 = i3 % 128;
            copy = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                str = accumulated.copydefault;
            }
            if ((i & 2) != 0) {
                int i6 = i4 + 75;
                equals = i6 % 128;
                int i7 = i6 % 2;
                str2 = accumulated.component3;
            }
            if ((i & 4) != 0) {
                str3 = accumulated.component2;
            }
            if ((i & 8) != 0) {
                str4 = accumulated.ShareDataUIState;
            }
            Accumulated accumulatedCopy = accumulated.copy(str, str2, str3, str4);
            int i8 = equals + 81;
            copy = i8 % 128;
            if (i8 % 2 != 0) {
                return accumulatedCopy;
            }
            throw null;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = equals + 101;
            copy = i2 % 128;
            int i3 = i2 % 2;
            String str = this.copydefault;
            if (i3 == 0) {
                int i4 = 18 / 0;
            }
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = equals + 121;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                return this.component3;
            }
            throw null;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = copy + 113;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component2;
            }
            throw null;
        }

        public final String component4() {
            int i = 2 % 2;
            int i2 = equals + 13;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                return this.ShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Accumulated copy(String points, String balance, String date, String additionalInfo) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(points, "");
            Intrinsics.checkNotNullParameter(balance, "");
            Intrinsics.checkNotNullParameter(date, "");
            Accumulated accumulated = new Accumulated(points, balance, date, additionalInfo);
            int i2 = copy + 55;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return accumulated;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = copy + 121;
            int i3 = i2 % 128;
            equals = i3;
            int i4 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Accumulated)) {
                int i5 = i3 + 51;
                copy = i5 % 128;
                if (i5 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            Accumulated accumulated = (Accumulated) other;
            if (!Intrinsics.areEqual(this.copydefault, accumulated.copydefault) || !Intrinsics.areEqual(this.component3, accumulated.component3)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.component2, accumulated.component2)) {
                int i6 = copy + 3;
                equals = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.ShareDataUIState, accumulated.ShareDataUIState)) {
                return true;
            }
            int i8 = copy + 37;
            equals = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[PHI: r1 r3 r4 r5
  0x0049: PHI (r1v14 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r3v4 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r4v4 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r5v4 java.lang.String) = (r5v0 java.lang.String), (r5v5 java.lang.String) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003f A[PHI: r1 r3 r4
  0x003f: PHI (r1v6 int) = (r1v5 int), (r1v16 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r3v2 int) = (r3v1 int), (r3v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:8:0x003d, B:5:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.BongaStatement.Accumulated.copy
                int r1 = r1 + 109
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.BongaStatement.Accumulated.equals = r2
                int r1 = r1 % r0
                r2 = 0
                if (r1 == 0) goto L29
                java.lang.String r1 = r7.copydefault
                int r1 = r1.hashCode()
                java.lang.String r3 = r7.component3
                int r3 = r3.hashCode()
                java.lang.String r4 = r7.component2
                int r4 = r4.hashCode()
                java.lang.String r5 = r7.ShareDataUIState
                r6 = 98
                int r6 = r6 / r2
                if (r5 != 0) goto L49
                goto L3f
            L29:
                java.lang.String r1 = r7.copydefault
                int r1 = r1.hashCode()
                java.lang.String r3 = r7.component3
                int r3 = r3.hashCode()
                java.lang.String r4 = r7.component2
                int r4 = r4.hashCode()
                java.lang.String r5 = r7.ShareDataUIState
                if (r5 != 0) goto L49
            L3f:
                int r5 = com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.BongaStatement.Accumulated.equals
                int r5 = r5 + 57
                int r6 = r5 % 128
                com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.BongaStatement.Accumulated.copy = r6
                int r5 = r5 % r0
                goto L4d
            L49:
                int r2 = r5.hashCode()
            L4d:
                int r1 = r1 * 31
                int r1 = r1 + r3
                int r1 = r1 * 31
                int r1 = r1 + r4
                int r1 = r1 * 31
                int r1 = r1 + r2
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.BongaStatement.Accumulated.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Accumulated(points=" + this.copydefault + ", balance=" + this.component3 + ", date=" + this.component2 + ", additionalInfo=" + this.ShareDataUIState + ")";
            int i2 = equals + 77;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/utils/BongaStatement$Redeemed;", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/utils/BongaStatement;", "points", "", "balance", "date", "additionalInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPoints", "()Ljava/lang/String;", "getBalance", "getDate", "getAdditionalInfo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Redeemed extends BongaStatement {
        public static final int $stable = 0;
        private static int component1 = 0;
        private static int component4 = 0;
        private static int equals = 1;
        private static int getRequestBeneficiariesState = 1;
        private final String ShareDataUIState;
        private final String component2;
        private final String component3;
        private final String copydefault;

        /* JADX WARN: Illegal instructions before constructor call */
        public Redeemed(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 8) != 0) {
                int i2 = getRequestBeneficiariesState + 33;
                component4 = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i3 = 2 % 2;
                str4 = null;
            }
            this(str, str2, str3, str4);
        }

        @Override
        public String getPoints() {
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 47;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 27;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override
        public String getBalance() {
            int i = 2 % 2;
            int i2 = component4 + 73;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            String str = this.component2;
            int i5 = i3 + 87;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override
        public String getDate() {
            int i = 2 % 2;
            int i2 = component4;
            int i3 = i2 + 111;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.ShareDataUIState;
            int i5 = i2 + 123;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        @Override
        public String getAdditionalInfo() {
            int i = 2 % 2;
            int i2 = component4 + 51;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            int i4 = i2 % 2;
            String str = this.component3;
            int i5 = i3 + 11;
            component4 = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Redeemed(String str, String str2, String str3, String str4) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.copydefault = str;
            this.component2 = str2;
            this.ShareDataUIState = str3;
            this.component3 = str4;
        }

        static {
            int i = 1 + 93;
            component1 = i % 128;
            int i2 = i % 2;
        }

        public static Redeemed copy$default(Redeemed redeemed, String str, String str2, String str3, String str4, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component4;
            int i4 = i3 + 111;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                str = redeemed.copydefault;
            }
            if ((i & 2) != 0) {
                int i6 = i3 + 107;
                getRequestBeneficiariesState = i6 % 128;
                int i7 = i6 % 2;
                str2 = redeemed.component2;
            }
            if ((i & 4) != 0) {
                str3 = redeemed.ShareDataUIState;
            }
            if ((i & 8) != 0) {
                str4 = redeemed.component3;
                int i8 = getRequestBeneficiariesState + 21;
                component4 = i8 % 128;
                int i9 = i8 % 2;
            }
            return redeemed.copy(str, str2, str3, str4);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState;
            int i3 = i2 + 57;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.copydefault;
            int i5 = i2 + 83;
            component4 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 57;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.component2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 5;
            int i3 = i2 % 128;
            component4 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.ShareDataUIState;
            int i4 = i3 + 115;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String component4() {
            int i = 2 % 2;
            int i2 = component4 + 63;
            int i3 = i2 % 128;
            getRequestBeneficiariesState = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            String str = this.component3;
            int i4 = i3 + 95;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final Redeemed copy(String points, String balance, String date, String additionalInfo) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(points, "");
            Intrinsics.checkNotNullParameter(balance, "");
            Intrinsics.checkNotNullParameter(date, "");
            Redeemed redeemed = new Redeemed(points, balance, date, additionalInfo);
            int i2 = component4 + 63;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 95 / 0;
            }
            return redeemed;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 25;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof Redeemed)) {
                return false;
            }
            Redeemed redeemed = (Redeemed) other;
            if (!Intrinsics.areEqual(this.copydefault, redeemed.copydefault)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.component2, redeemed.component2)) {
                int i4 = getRequestBeneficiariesState + 103;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.ShareDataUIState, redeemed.ShareDataUIState) || !Intrinsics.areEqual(this.component3, redeemed.component3)) {
                return false;
            }
            int i6 = component4 + 5;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 91;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode2 = this.copydefault.hashCode();
            int iHashCode3 = this.component2.hashCode();
            int iHashCode4 = this.ShareDataUIState.hashCode();
            String str = this.component3;
            if (str == null) {
                int i4 = getRequestBeneficiariesState + 123;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            int i6 = (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
            int i7 = getRequestBeneficiariesState + 97;
            component4 = i7 % 128;
            int i8 = i7 % 2;
            return i6;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Redeemed(points=" + this.copydefault + ", balance=" + this.component2 + ", date=" + this.ShareDataUIState + ", additionalInfo=" + this.component3 + ")";
            int i2 = getRequestBeneficiariesState + 3;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }
    }
}
