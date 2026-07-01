package com.huawei.digitalpayment.consumer.sfcui.reportfraud;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÇ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001f\u001a\u00020\u0003H×\u0001J\t\u0010 \u001a\u00020!H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/StepInfo;", "", "currentStep", "", "totalSteps", "progress", "", "isFirstStep", "", "isLastStep", "journey", "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney;", "<init>", "(IIFZZLcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney;)V", "getCurrentStep", "()I", "getTotalSteps", "getProgress", "()F", "()Z", "getJourney", "()Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/FraudReportJourney;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StepInfo {
    public static final int $stable = 8;

    public static final Companion INSTANCE;
    private static int copy = 1;
    private static int equals = 0;
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final boolean ShareDataUIState;
    private final float component1;
    private final boolean component2;
    private final int component3;
    private final int component4;
    private final FraudReportJourney copydefault;

    public StepInfo(int i, int i2, float f, boolean z, boolean z2, FraudReportJourney fraudReportJourney) {
        Intrinsics.checkNotNullParameter(fraudReportJourney, "");
        this.component3 = i;
        this.component4 = i2;
        this.component1 = f;
        this.component2 = z;
        this.ShareDataUIState = z2;
        this.copydefault = fraudReportJourney;
    }

    public final int getCurrentStep() {
        int i = 2 % 2;
        int i2 = equals + 57;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getTotalSteps() {
        int i = 2 % 2;
        int i2 = equals + 45;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        int i5 = this.component4;
        int i6 = i3 + 31;
        equals = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 79 / 0;
        }
        return i5;
    }

    public final float getProgress() {
        int i = 2 % 2;
        int i2 = copy + 19;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isFirstStep() {
        int i = 2 % 2;
        int i2 = copy + 123;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        boolean z = this.component2;
        int i5 = i3 + 71;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean isLastStep() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 121;
        copy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 39;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return z;
    }

    public final FraudReportJourney getJourney() {
        int i = 2 % 2;
        int i2 = equals + 83;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/StepInfo$Companion;", "", "<init>", "()V", "from", "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/StepInfo;", "screenName", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 1;
        private static int copydefault;

        private Companion() {
        }

        public final StepInfo from(String screenName) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(screenName, "");
            FraudReportJourney fraudReportJourneyFromScreen = FraudReportJourney.INSTANCE.fromScreen(screenName);
            if (fraudReportJourneyFromScreen == null) {
                int i2 = component2 + 65;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return null;
                }
                stepInfo.hashCode();
                throw null;
            }
            int currentStep = fraudReportJourneyFromScreen.getCurrentStep(screenName);
            stepInfo = currentStep > 0 ? new StepInfo(currentStep, fraudReportJourneyFromScreen.getTotalSteps(), fraudReportJourneyFromScreen.getProgress(screenName), fraudReportJourneyFromScreen.isFirstStep(screenName), fraudReportJourneyFromScreen.isLastStep(screenName), fraudReportJourneyFromScreen) : null;
            int i3 = component2 + 5;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return stepInfo;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = getRequestBeneficiariesState + 31;
        getAsAtTimestamp = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static StepInfo copy$default(StepInfo stepInfo, int i, int i2, float f, boolean z, boolean z2, FraudReportJourney fraudReportJourney, int i3, Object obj) {
        int i4;
        int i5;
        boolean z3;
        int i6 = 2 % 2;
        if ((i3 & 1) != 0) {
            i4 = stepInfo.component3;
            int i7 = copy + 39;
            equals = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            int i9 = equals + 11;
            copy = i9 % 128;
            if (i9 % 2 == 0) {
                i5 = stepInfo.component4;
                int i10 = 31 / 0;
            } else {
                i5 = stepInfo.component4;
            }
        } else {
            i5 = i2;
        }
        float f2 = (i3 & 4) != 0 ? stepInfo.component1 : f;
        boolean z4 = (i3 & 8) != 0 ? stepInfo.component2 : z;
        if ((i3 & 16) != 0) {
            int i11 = equals + 57;
            copy = i11 % 128;
            if (i11 % 2 == 0) {
                boolean z5 = stepInfo.ShareDataUIState;
                throw null;
            }
            z3 = stepInfo.ShareDataUIState;
        } else {
            z3 = z2;
        }
        return stepInfo.copy(i4, i5, f2, z4, z3, (i3 & 32) != 0 ? stepInfo.copydefault : fraudReportJourney);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = equals + 121;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.component3;
        int i5 = i3 + 71;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = copy + 27;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component4;
        }
        throw null;
    }

    public final float component3() {
        int i = 2 % 2;
        int i2 = equals + 81;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = copy + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.component2;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return z;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = copy + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return z;
    }

    public final FraudReportJourney component6() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 25;
        equals = i3 % 128;
        int i4 = i3 % 2;
        FraudReportJourney fraudReportJourney = this.copydefault;
        int i5 = i2 + 33;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return fraudReportJourney;
        }
        throw null;
    }

    public final StepInfo copy(int currentStep, int totalSteps, float progress, boolean isFirstStep, boolean isLastStep, FraudReportJourney journey) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(journey, "");
        StepInfo stepInfo = new StepInfo(currentStep, totalSteps, progress, isFirstStep, isLastStep, journey);
        int i2 = equals + 77;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return stepInfo;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepInfo)) {
            return false;
        }
        StepInfo stepInfo = (StepInfo) other;
        if (this.component3 != stepInfo.component3) {
            return false;
        }
        if (this.component4 != stepInfo.component4) {
            int i2 = equals + 95;
            copy = i2 % 128;
            return i2 % 2 == 0;
        }
        if (Float.compare(this.component1, stepInfo.component1) != 0) {
            int i3 = copy + 125;
            equals = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.component2 != stepInfo.component2 || this.ShareDataUIState != stepInfo.ShareDataUIState || !Intrinsics.areEqual(this.copydefault, stepInfo.copydefault)) {
            return false;
        }
        int i5 = equals + 99;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 99;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Integer.hashCode(this.component3) * 31) + Integer.hashCode(this.component4)) * 31) + Float.hashCode(this.component1)) * 31) + Boolean.hashCode(this.component2)) * 31) + Boolean.hashCode(this.ShareDataUIState)) * 31) + this.copydefault.hashCode();
        int i4 = copy + 61;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StepInfo(currentStep=" + this.component3 + ", totalSteps=" + this.component4 + ", progress=" + this.component1 + ", isFirstStep=" + this.component2 + ", isLastStep=" + this.ShareDataUIState + ", journey=" + this.copydefault + ")";
        int i2 = copy + 61;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
        }
        return str;
    }
}
