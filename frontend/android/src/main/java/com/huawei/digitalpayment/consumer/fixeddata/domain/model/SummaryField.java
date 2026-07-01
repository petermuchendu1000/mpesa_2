package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/SummaryField;", "", "title", "", "value", "hasIcon", "", "onClick", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "getTitle", "()Ljava/lang/String;", "getValue", "getHasIcon", "()Z", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SummaryField {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int copy = 31 % 128;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final String component1;
    private final String component2;
    private final Function0<Unit> component3;
    private final boolean copydefault;

    public SummaryField(String str, String str2, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.component2 = str;
        this.component1 = str2;
        this.copydefault = z;
        this.component3 = function0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SummaryField(String str, String str2, boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = equals + 103;
            ShareDataUIState = i2 % 128;
            z = i2 % 2 != 0;
            int i3 = 2 % 2;
        }
        this(str, str2, z, (i & 8) != 0 ? new SummaryField$$ExternalSyntheticLambda0() : function0);
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 75;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 25;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return str;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = equals + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 65;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean getHasIcon() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit copydefault() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 27;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = equals + 13;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return unit;
    }

    public final Function0<Unit> getOnClick() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function0<Unit> function0 = this.component3;
        int i4 = i3 + 109;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return function0;
    }

    public static Unit $r8$lambda$SrY2d3WnfVGI_VeCQ0o1VEzG8Zw() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault();
        int i4 = equals + 79;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return unitCopydefault;
    }

    static {
        int i = 31 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SummaryField copy$default(SummaryField summaryField, String str, String str2, boolean z, Function0 function0, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = equals + 65;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                String str3 = summaryField.component2;
                throw null;
            }
            str = summaryField.component2;
        }
        if ((i & 2) != 0) {
            int i4 = ShareDataUIState + 109;
            equals = i4 % 128;
            if (i4 % 2 == 0) {
                String str4 = summaryField.component1;
                obj2.hashCode();
                throw null;
            }
            str2 = summaryField.component1;
        }
        if ((i & 4) != 0) {
            int i5 = equals + 81;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                boolean z2 = summaryField.copydefault;
                throw null;
            }
            z = summaryField.copydefault;
        }
        if ((i & 8) != 0) {
            function0 = summaryField.component3;
            int i6 = ShareDataUIState + 95;
            equals = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 4 / 2;
            }
        }
        SummaryField summaryFieldCopy = summaryField.copy(str, str2, z, function0);
        int i8 = equals + 117;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 33 / 0;
        }
        return summaryFieldCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 121;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 99;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 88 / 0;
        }
        return z;
    }

    public final Function0<Unit> component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Function0<Unit> function0 = this.component3;
        int i4 = i3 + 75;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return function0;
    }

    public final SummaryField copy(String title, String value, boolean hasIcon, Function0<Unit> onClick) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(value, "");
        Intrinsics.checkNotNullParameter(onClick, "");
        SummaryField summaryField = new SummaryField(title, value, hasIcon, onClick);
        int i2 = equals + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return summaryField;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = equals + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryField)) {
            return false;
        }
        SummaryField summaryField = (SummaryField) other;
        if (!Intrinsics.areEqual(this.component2, summaryField.component2)) {
            int i4 = ShareDataUIState + 115;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, summaryField.component1)) {
            int i6 = equals + 107;
            ShareDataUIState = i6 % 128;
            return i6 % 2 != 0;
        }
        if (this.copydefault != summaryField.copydefault) {
            int i7 = ShareDataUIState + 29;
            equals = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component3, summaryField.component3)) {
            return true;
        }
        int i9 = equals + 1;
        ShareDataUIState = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.component2.hashCode() * 31) + this.component1.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + this.component3.hashCode();
        int i4 = ShareDataUIState + 105;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SummaryField(title=" + this.component2 + ", value=" + this.component1 + ", hasIcon=" + this.copydefault + ", onClick=" + this.component3 + ")";
        int i2 = ShareDataUIState + 87;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
