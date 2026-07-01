package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import com.alibaba.griver.beehive.lottie.player.LottieParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ChangeHomePlan;", "", "title", "", LottieParams.KEY_SPEED, "paymentAmount", "isSelected", "", "hasMultiBundles", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getTitle", "()Ljava/lang/String;", "getSpeed", "getPaymentAmount", "()Z", "getHasMultiBundles", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChangeHomePlan {
    public static final int $stable = 0;
    private static int copy = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final String ShareDataUIState;
    private final boolean component1;
    private final String component2;
    private final String component3;
    private final boolean copydefault;

    public ChangeHomePlan(String str, String str2, String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component3 = str;
        this.ShareDataUIState = str2;
        this.component2 = str3;
        this.copydefault = z;
        this.component1 = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChangeHomePlan(String str, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 16) != 0) {
            int i2 = getAsAtTimestamp + 107;
            int i3 = i2 % 128;
            copy = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 89;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z2 = false;
        }
        this(str, str2, str3, z, z2);
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 81;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 31;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSpeed() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 61;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 71;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getPaymentAmount() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 19;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 15;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isSelected() {
        int i = 2 % 2;
        int i2 = copy + 5;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 115;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean getHasMultiBundles() {
        int i = 2 % 2;
        int i2 = copy + 99;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        throw null;
    }

    static {
        int i = 1 + 25;
        equals = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static ChangeHomePlan copy$default(ChangeHomePlan changeHomePlan, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = getAsAtTimestamp + 57;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                String str4 = changeHomePlan.component3;
                throw null;
            }
            str = changeHomePlan.component3;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = changeHomePlan.ShareDataUIState;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = changeHomePlan.component2;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            z = changeHomePlan.copydefault;
            int i4 = copy + 51;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = changeHomePlan.component1;
        }
        ChangeHomePlan changeHomePlanCopy = changeHomePlan.copy(str5, str6, str7, z3, z2);
        int i6 = getAsAtTimestamp + 11;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return changeHomePlanCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 121;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 103;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.ShareDataUIState;
            int i4 = 47 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i2 + 113;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 61 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 9;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 33;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = copy + 117;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 27;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 67;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        boolean z = this.component1;
        int i5 = i3 + 57;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ChangeHomePlan copy(String title, String speed, String paymentAmount, boolean isSelected, boolean hasMultiBundles) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(speed, "");
        Intrinsics.checkNotNullParameter(paymentAmount, "");
        ChangeHomePlan changeHomePlan = new ChangeHomePlan(title, speed, paymentAmount, isSelected, hasMultiBundles);
        int i2 = getAsAtTimestamp + 111;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return changeHomePlan;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copy + 77;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeHomePlan)) {
            return false;
        }
        ChangeHomePlan changeHomePlan = (ChangeHomePlan) other;
        if (!Intrinsics.areEqual(this.component3, changeHomePlan.component3)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, changeHomePlan.ShareDataUIState)) {
            int i3 = getAsAtTimestamp + 99;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, changeHomePlan.component2)) {
            int i5 = copy + 61;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (this.copydefault != changeHomePlan.copydefault) {
            int i7 = copy + 79;
            getAsAtTimestamp = i7 % 128;
            return i7 % 2 != 0;
        }
        if (this.component1 == changeHomePlan.component1) {
            return true;
        }
        int i8 = getAsAtTimestamp + 53;
        copy = i8 % 128;
        if (i8 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 5;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.component3.hashCode() * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component2.hashCode()) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.component1);
        int i4 = getAsAtTimestamp + 79;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ChangeHomePlan(title=" + this.component3 + ", speed=" + this.ShareDataUIState + ", paymentAmount=" + this.component2 + ", isSelected=" + this.copydefault + ", hasMultiBundles=" + this.component1 + ")";
        int i2 = copy + 67;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
