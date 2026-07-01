package com.huawei.digitalpayment.consumer.sfcui.components.bundles;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\bH×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/PurchaseBundleInfoCardData;", "", "description", "", "expiryText", "annotatedExpiryText", "Landroidx/compose/ui/text/AnnotatedString;", "iconResource", "", "iconDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getExpiryText", "getAnnotatedExpiryText", "()Landroidx/compose/ui/text/AnnotatedString;", "getIconResource", "()I", "getIconDescription", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchaseBundleInfoCardData {
    public static final int $stable = 0;
    private static int component4 = 0;
    private static int copy = 1;
    private static int equals = 79 % 128;
    private static int getRequestBeneficiariesState;
    private final String ShareDataUIState;
    private final AnnotatedString component1;
    private final String component2;
    private final int component3;
    private final String copydefault;

    public PurchaseBundleInfoCardData(String str, String str2, AnnotatedString annotatedString, int i, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component2 = str;
        this.ShareDataUIState = str2;
        this.component1 = annotatedString;
        this.component3 = i;
        this.copydefault = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PurchaseBundleInfoCardData(String str, String str2, AnnotatedString annotatedString, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        String str5;
        Object obj = null;
        if ((i2 & 2) != 0) {
            int i3 = copy + 77;
            int i4 = i3 % 128;
            getRequestBeneficiariesState = i4;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 83;
            copy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str4 = null;
        } else {
            str4 = str2;
        }
        AnnotatedString annotatedString2 = (i2 & 4) != 0 ? null : annotatedString;
        if ((i2 & 16) != 0) {
            int i7 = copy + 19;
            getRequestBeneficiariesState = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str5 = null;
        } else {
            str5 = str3;
        }
        this(str, str4, annotatedString2, i, str5);
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 5;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 75;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return str;
    }

    public final String getExpiryText() {
        int i = 2 % 2;
        int i2 = copy + 15;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AnnotatedString getAnnotatedExpiryText() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 29;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        AnnotatedString annotatedString = this.component1;
        int i5 = i2 + 21;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return annotatedString;
        }
        throw null;
    }

    public final int getIconResource() {
        int i;
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState;
        int i4 = i3 + 29;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.component3;
            int i5 = 7 / 0;
        } else {
            i = this.component3;
        }
        int i6 = i3 + 53;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final String getIconDescription() {
        int i = 2 % 2;
        int i2 = copy + 17;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 123;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = 79 % 2;
    }

    public static PurchaseBundleInfoCardData copy$default(PurchaseBundleInfoCardData purchaseBundleInfoCardData, String str, String str2, AnnotatedString annotatedString, int i, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = copy + 69;
        int i5 = i4 % 128;
        getRequestBeneficiariesState = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 21;
            copy = i7 % 128;
            int i8 = i7 % 2;
            str = purchaseBundleInfoCardData.component2;
        }
        String str4 = str;
        if ((i2 & 2) != 0) {
            int i9 = i5 + 59;
            copy = i9 % 128;
            int i10 = i9 % 2;
            str2 = purchaseBundleInfoCardData.ShareDataUIState;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            annotatedString = purchaseBundleInfoCardData.component1;
        }
        AnnotatedString annotatedString2 = annotatedString;
        if ((i2 & 8) != 0) {
            i = purchaseBundleInfoCardData.component3;
        }
        int i11 = i;
        if ((i2 & 16) != 0) {
            int i12 = i5 + 35;
            copy = i12 % 128;
            int i13 = i12 % 2;
            str3 = purchaseBundleInfoCardData.copydefault;
        }
        return purchaseBundleInfoCardData.copy(str4, str5, annotatedString2, i11, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 117;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 31;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy + 33;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AnnotatedString component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 55;
        copy = i3 % 128;
        int i4 = i3 % 2;
        AnnotatedString annotatedString = this.component1;
        int i5 = i2 + 31;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return annotatedString;
        }
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 41;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.component3;
        int i5 = i2 + 119;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 79;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 19;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return str;
    }

    public final PurchaseBundleInfoCardData copy(String description, String expiryText, AnnotatedString annotatedExpiryText, int iconResource, String iconDescription) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(description, "");
        PurchaseBundleInfoCardData purchaseBundleInfoCardData = new PurchaseBundleInfoCardData(description, expiryText, annotatedExpiryText, iconResource, iconDescription);
        int i2 = getRequestBeneficiariesState + 47;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
        return purchaseBundleInfoCardData;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseBundleInfoCardData)) {
            int i2 = copy + 51;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PurchaseBundleInfoCardData purchaseBundleInfoCardData = (PurchaseBundleInfoCardData) other;
        if (!Intrinsics.areEqual(this.component2, purchaseBundleInfoCardData.component2)) {
            int i4 = copy + 29;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, purchaseBundleInfoCardData.ShareDataUIState)) {
            int i6 = copy + 79;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component1, purchaseBundleInfoCardData.component1)) {
            return this.component3 == purchaseBundleInfoCardData.component3 && !(Intrinsics.areEqual(this.copydefault, purchaseBundleInfoCardData.copydefault) ^ true);
        }
        int i8 = getRequestBeneficiariesState + 13;
        copy = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.component2.hashCode();
        String str = this.ShareDataUIState;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = getRequestBeneficiariesState + 61;
            copy = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = copy + 123;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
        AnnotatedString annotatedString = this.component1;
        int iHashCode4 = annotatedString == null ? 0 : annotatedString.hashCode();
        int iHashCode5 = Integer.hashCode(this.component3);
        String str2 = this.copydefault;
        if (str2 == null) {
            int i6 = getRequestBeneficiariesState + 5;
            copy = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode3 = str2.hashCode();
        }
        return (((((((iHashCode2 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = this.component2;
        String str2 = this.ShareDataUIState;
        AnnotatedString annotatedString = this.component1;
        String str3 = "PurchaseBundleInfoCardData(description=" + str + ", expiryText=" + str2 + ", annotatedExpiryText=" + ((Object) annotatedString) + ", iconResource=" + this.component3 + ", iconDescription=" + this.copydefault + ")";
        int i2 = getRequestBeneficiariesState + 49;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 23 / 0;
        }
        return str3;
    }
}
