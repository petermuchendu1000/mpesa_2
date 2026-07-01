package com.huawei.digitalpayment.consumer.base.database.entities.productcatalog;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006*"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/productcatalog/WithExpiryBundleEntity;", "", "packageName", "", "subPackageName", "productName", "productId", "productAmount", "", "productUnits", "autoRenew", "", "locationId", "limit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "getSubPackageName", "getProductName", "getProductId", "getProductAmount", "()I", "getProductUnits", "getAutoRenew", "()Z", "getLocationId", "getLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WithExpiryBundleEntity {
    private static int getRequestBeneficiariesState = 0;
    private static int getShareableDataState = 1;
    private final int ShareDataUIState;
    private final String component1;
    private final String component2;
    private final boolean component3;
    private final String component4;
    private final String copy;
    private final String copydefault;
    private final String equals;
    private final String getAsAtTimestamp;

    public WithExpiryBundleEntity(String str, String str2, String str3, String str4, int i, String str5, boolean z, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.copydefault = str;
        this.equals = str2;
        this.copy = str3;
        this.getAsAtTimestamp = str4;
        this.ShareDataUIState = i;
        this.component4 = str5;
        this.component3 = z;
        this.component1 = str6;
        this.component2 = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WithExpiryBundleEntity(String str, String str2, String str3, String str4, int i, String str5, boolean z, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        if ((i2 & 256) != 0) {
            int i3 = getRequestBeneficiariesState;
            int i4 = i3 + 111;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 65;
            getShareableDataState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            str8 = null;
        } else {
            str8 = str7;
        }
        this(str, str2, str3, str4, i, str5, z, str6, str8);
    }

    public final String getPackageName() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 45;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 23;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSubPackageName() {
        String str;
        int i = 2 % 2;
        int i2 = getShareableDataState + 5;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            str = this.equals;
            int i4 = 22 / 0;
        } else {
            str = this.equals;
        }
        int i5 = i3 + 91;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 105;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 109;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 27;
        getRequestBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.getAsAtTimestamp;
        int i4 = i2 + 33;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final int getProductAmount() {
        int i;
        int i2 = 2 % 2;
        int i3 = getShareableDataState;
        int i4 = i3 + 23;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            i = this.ShareDataUIState;
            int i5 = 41 / 0;
        } else {
            i = this.ShareDataUIState;
        }
        int i6 = i3 + 55;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final String getProductUnits() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 103;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component4;
        int i4 = i2 + 49;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return str;
    }

    public final boolean getAutoRenew() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 79;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.component3;
        int i5 = i3 + 111;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return z;
    }

    public final String getLocationId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 63;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 33;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String getLimit() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 39;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i2 + 125;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static WithExpiryBundleEntity copy$default(WithExpiryBundleEntity withExpiryBundleEntity, String str, String str2, String str3, String str4, int i, String str5, boolean z, String str6, String str7, int i2, Object obj) {
        String str8;
        int i3;
        String str9;
        String str10;
        int i4 = 2 % 2;
        String str11 = (i2 & 1) != 0 ? withExpiryBundleEntity.copydefault : str;
        if ((i2 & 2) != 0) {
            int i5 = getRequestBeneficiariesState + 37;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            str8 = withExpiryBundleEntity.equals;
        } else {
            str8 = str2;
        }
        String str12 = (i2 & 4) != 0 ? withExpiryBundleEntity.copy : str3;
        String str13 = (i2 & 8) != 0 ? withExpiryBundleEntity.getAsAtTimestamp : str4;
        if ((i2 & 16) != 0) {
            int i7 = getRequestBeneficiariesState + 109;
            getShareableDataState = i7 % 128;
            if (i7 % 2 == 0) {
                i3 = withExpiryBundleEntity.ShareDataUIState;
                int i8 = 91 / 0;
            } else {
                i3 = withExpiryBundleEntity.ShareDataUIState;
            }
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            int i9 = getShareableDataState + 39;
            getRequestBeneficiariesState = i9 % 128;
            if (i9 % 2 != 0) {
                String str14 = withExpiryBundleEntity.component4;
                throw null;
            }
            str9 = withExpiryBundleEntity.component4;
        } else {
            str9 = str5;
        }
        boolean z2 = (i2 & 64) != 0 ? withExpiryBundleEntity.component3 : z;
        if ((i2 & 128) != 0) {
            int i10 = getRequestBeneficiariesState + 93;
            getShareableDataState = i10 % 128;
            int i11 = i10 % 2;
            str10 = withExpiryBundleEntity.component1;
        } else {
            str10 = str6;
        }
        return withExpiryBundleEntity.copy(str11, str8, str12, str13, i3, str9, z2, str10, (i2 & 256) != 0 ? withExpiryBundleEntity.component2 : str7);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 51;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 25;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 45;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.equals;
        int i5 = i3 + 1;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 61;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.copy;
        int i4 = i3 + 79;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = getShareableDataState + 97;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            str = this.getAsAtTimestamp;
            int i4 = 46 / 0;
        } else {
            str = this.getAsAtTimestamp;
        }
        int i5 = i3 + 95;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 47;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        int i5 = this.ShareDataUIState;
        int i6 = i3 + 51;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 109;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component4;
        int i5 = i3 + 105;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 93;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.component3;
        int i4 = i3 + 117;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String component8() {
        String str;
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 33;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.component1;
            int i4 = 24 / 0;
        } else {
            str = this.component1;
        }
        int i5 = i2 + 47;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 101;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component2;
        int i4 = i2 + 125;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final WithExpiryBundleEntity copy(String packageName, String subPackageName, String productName, String productId, int productAmount, String productUnits, boolean autoRenew, String locationId, String limit) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(packageName, "");
        Intrinsics.checkNotNullParameter(subPackageName, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(productUnits, "");
        Intrinsics.checkNotNullParameter(locationId, "");
        WithExpiryBundleEntity withExpiryBundleEntity = new WithExpiryBundleEntity(packageName, subPackageName, productName, productId, productAmount, productUnits, autoRenew, locationId, limit);
        int i2 = getRequestBeneficiariesState + 7;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return withExpiryBundleEntity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithExpiryBundleEntity)) {
            int i2 = getRequestBeneficiariesState + 113;
            getShareableDataState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        WithExpiryBundleEntity withExpiryBundleEntity = (WithExpiryBundleEntity) other;
        if (!Intrinsics.areEqual(this.copydefault, withExpiryBundleEntity.copydefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.equals, withExpiryBundleEntity.equals)) {
            int i4 = getRequestBeneficiariesState + 79;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copy, withExpiryBundleEntity.copy)) {
            int i6 = getRequestBeneficiariesState + 109;
            getShareableDataState = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, withExpiryBundleEntity.getAsAtTimestamp)) {
            int i7 = getShareableDataState + 21;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.ShareDataUIState != withExpiryBundleEntity.ShareDataUIState) {
            int i9 = getRequestBeneficiariesState + 113;
            getShareableDataState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, withExpiryBundleEntity.component4) || this.component3 != withExpiryBundleEntity.component3) {
            return false;
        }
        if (Intrinsics.areEqual(this.component1, withExpiryBundleEntity.component1)) {
            return Intrinsics.areEqual(this.component2, withExpiryBundleEntity.component2);
        }
        int i11 = getRequestBeneficiariesState + 33;
        getShareableDataState = i11 % 128;
        return i11 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = getShareableDataState + 63;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.equals.hashCode();
        int iHashCode4 = this.copy.hashCode();
        int iHashCode5 = this.getAsAtTimestamp.hashCode();
        int iHashCode6 = Integer.hashCode(this.ShareDataUIState);
        int iHashCode7 = this.component4.hashCode();
        int iHashCode8 = Boolean.hashCode(this.component3);
        int iHashCode9 = this.component1.hashCode();
        String str = this.component2;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = getRequestBeneficiariesState + 11;
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode;
        int i7 = getShareableDataState + 99;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WithExpiryBundleEntity(packageName=" + this.copydefault + ", subPackageName=" + this.equals + ", productName=" + this.copy + ", productId=" + this.getAsAtTimestamp + ", productAmount=" + this.ShareDataUIState + ", productUnits=" + this.component4 + ", autoRenew=" + this.component3 + ", locationId=" + this.component1 + ", limit=" + this.component2 + ")";
        int i2 = getRequestBeneficiariesState + 5;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
