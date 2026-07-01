package com.huawei.digitalpayment.consumer.sfcui.bonga;

import com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0003H×\u0001J\t\u0010\u0019\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/OnboardingPage;", "", SfcServicePinActivity.EXTRA_IMAGE_RES, "", "title", "", "description", "isTermsPage", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getImageRes", "()I", "getTitle", "()Ljava/lang/String;", "getDescription", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OnboardingPage {
    public static final int $stable = 0;
    private static int component4 = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private static int getRequestBeneficiariesState = 1;
    private final String ShareDataUIState;
    private final int component1;
    private final String component2;
    private final boolean component3;

    public OnboardingPage(int i, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component1 = i;
        this.component2 = str;
        this.ShareDataUIState = str2;
        this.component3 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OnboardingPage(int i, String str, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 8) != 0) {
            int i3 = equals + 39;
            int i4 = i3 % 128;
            component4 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 9;
            equals = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            z = false;
        }
        this(i, str, str2, z);
    }

    public final int getImageRes() {
        int i = 2 % 2;
        int i2 = component4 + 13;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        int i5 = this.component1;
        int i6 = i3 + 77;
        component4 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 27;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 13;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = component4 + 101;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 39;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    public final boolean isTermsPage() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 125;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component3;
        int i5 = i2 + 1;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static {
        int i = 1 + 55;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static OnboardingPage copy$default(OnboardingPage onboardingPage, int i, String str, String str2, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = component4;
        int i5 = i4 + 73;
        equals = i5 % 128;
        if (i5 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            i = onboardingPage.component1;
        }
        Object obj2 = null;
        if ((i2 & 2) != 0) {
            int i6 = i4 + 85;
            equals = i6 % 128;
            if (i6 % 2 == 0) {
                String str3 = onboardingPage.component2;
                throw null;
            }
            str = onboardingPage.component2;
        }
        if ((i2 & 4) != 0) {
            str2 = onboardingPage.ShareDataUIState;
        }
        if ((i2 & 8) != 0) {
            int i7 = equals + 89;
            component4 = i7 % 128;
            if (i7 % 2 != 0) {
                boolean z2 = onboardingPage.component3;
                obj2.hashCode();
                throw null;
            }
            z = onboardingPage.component3;
        }
        return onboardingPage.copy(i, str, str2, z);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = equals + 121;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.component1;
        int i5 = i3 + 99;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 89;
        equals = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i2 + 23;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component4 + 105;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 95;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 117;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component3;
        int i5 = i2 + 107;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final OnboardingPage copy(int imageRes, String title, String description, boolean isTermsPage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(description, "");
        OnboardingPage onboardingPage = new OnboardingPage(imageRes, title, description, isTermsPage);
        int i2 = component4 + 61;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return onboardingPage;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component4 + 111;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof OnboardingPage)) {
            return false;
        }
        OnboardingPage onboardingPage = (OnboardingPage) other;
        if (this.component1 != onboardingPage.component1) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, onboardingPage.component2)) {
            int i4 = equals + 115;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, onboardingPage.ShareDataUIState)) {
            int i6 = component4 + 125;
            equals = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.component3 == onboardingPage.component3) {
            return true;
        }
        int i8 = equals;
        int i9 = i8 + 123;
        component4 = i9 % 128;
        int i10 = i9 % 2;
        int i11 = i8 + 13;
        component4 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 32 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 39;
        equals = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((Integer.hashCode(this.component1) * 31) + this.component2.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + Boolean.hashCode(this.component3);
        int i4 = component4 + 7;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OnboardingPage(imageRes=" + this.component1 + ", title=" + this.component2 + ", description=" + this.ShareDataUIState + ", isTermsPage=" + this.component3 + ")";
        int i2 = equals + 121;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
