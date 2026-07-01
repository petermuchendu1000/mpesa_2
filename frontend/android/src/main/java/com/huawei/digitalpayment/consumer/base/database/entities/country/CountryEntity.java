package com.huawei.digitalpayment.consumer.base.database.entities.country;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.alibaba.griver.ui.ant.utils.IconfontConstants;
import com.huawei.digitalpayment.consumer.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/country/CountryEntity;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "", "emoji", IconfontConstants.KEY_ICON_UNICODE, "alpha2Code", "alpha3Code", "dialCode", Keys.TRANSACTION, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getEmoji", "getUnicode", "getAlpha2Code", "getAlpha3Code", "getDialCode", "getTransaction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountryEntity {
    private static int copy = 1;
    private static int getRequestBeneficiariesState;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final int component3;
    private final String component4;
    private final String copydefault;
    private final String equals;
    private final String getAsAtTimestamp;

    public CountryEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.component3 = i;
        this.equals = str;
        this.component2 = str2;
        this.component4 = str3;
        this.ShareDataUIState = str4;
        this.copydefault = str5;
        this.component1 = str6;
        this.getAsAtTimestamp = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CountryEntity(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        if ((i2 & 1) != 0) {
            int i4 = copy;
            int i5 = i4 + 53;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 1;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 2 % 2;
            i3 = 0;
        } else {
            i3 = i;
        }
        this(i3, str, str2, str3, str4, str5, str6, str7);
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 35;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        int i5 = this.component3;
        int i6 = i3 + 21;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 61;
        copy = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.equals;
        int i4 = i2 + 73;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getEmoji() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 47;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 69;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getUnicode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 97;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component4;
        int i5 = i2 + 13;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAlpha2Code() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 107;
        getRequestBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i2 + 57;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getAlpha3Code() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 5;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 79;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return str;
    }

    public final String getDialCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 81;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 123;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTransaction() {
        int i = 2 % 2;
        int i2 = copy + 87;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getAsAtTimestamp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CountryEntity copy$default(CountryEntity countryEntity, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, Object obj) {
        String str8;
        String str9;
        String str10;
        int i3 = 2 % 2;
        int i4 = getRequestBeneficiariesState + 121;
        int i5 = i4 % 128;
        copy = i5;
        int i6 = i4 % 2;
        int i7 = (i2 & 1) != 0 ? countryEntity.component3 : i;
        if ((i2 & 2) != 0) {
            int i8 = i5 + 87;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            str8 = countryEntity.equals;
        } else {
            str8 = str;
        }
        if ((i2 & 4) != 0) {
            int i10 = i5 + 115;
            getRequestBeneficiariesState = i10 % 128;
            int i11 = i10 % 2;
            str9 = countryEntity.component2;
        } else {
            str9 = str2;
        }
        String str11 = (i2 & 8) != 0 ? countryEntity.component4 : str3;
        String str12 = (i2 & 16) != 0 ? countryEntity.ShareDataUIState : str4;
        Object obj2 = null;
        if ((i2 & 32) != 0) {
            int i12 = getRequestBeneficiariesState + 79;
            copy = i12 % 128;
            if (i12 % 2 == 0) {
                String str13 = countryEntity.copydefault;
                throw null;
            }
            str10 = countryEntity.copydefault;
        } else {
            str10 = str5;
        }
        CountryEntity countryEntityCopy = countryEntity.copy(i7, str8, str9, str11, str12, str10, (i2 & 64) != 0 ? countryEntity.component1 : str6, (i2 & 128) != 0 ? countryEntity.getAsAtTimestamp : str7);
        int i13 = getRequestBeneficiariesState + 25;
        copy = i13 % 128;
        if (i13 % 2 != 0) {
            return countryEntityCopy;
        }
        obj2.hashCode();
        throw null;
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = copy + 95;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            str = this.equals;
            int i4 = 67 / 0;
        } else {
            str = this.equals;
        }
        int i5 = i3 + 107;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 1;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.component2;
            int i4 = 67 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i2 + 109;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copy + 57;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 5;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 93;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 109;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 119;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 7;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i2 + 99;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final CountryEntity copy(int id, String name, String emoji, String unicode, String alpha2Code, String alpha3Code, String dialCode, String transaction) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(emoji, "");
        Intrinsics.checkNotNullParameter(unicode, "");
        Intrinsics.checkNotNullParameter(alpha2Code, "");
        Intrinsics.checkNotNullParameter(alpha3Code, "");
        Intrinsics.checkNotNullParameter(dialCode, "");
        Intrinsics.checkNotNullParameter(transaction, "");
        CountryEntity countryEntity = new CountryEntity(id, name, emoji, unicode, alpha2Code, alpha3Code, dialCode, transaction);
        int i2 = copy + 23;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return countryEntity;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CountryEntity)) {
            int i2 = copy + 71;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        CountryEntity countryEntity = (CountryEntity) other;
        if (this.component3 != countryEntity.component3) {
            int i4 = copy + 57;
            int i5 = i4 % 128;
            getRequestBeneficiariesState = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 121;
            copy = i7 % 128;
            if (i7 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.equals, countryEntity.equals)) {
            int i8 = getRequestBeneficiariesState + 71;
            copy = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, countryEntity.component2) || !Intrinsics.areEqual(this.component4, countryEntity.component4) || !Intrinsics.areEqual(this.ShareDataUIState, countryEntity.ShareDataUIState) || !Intrinsics.areEqual(this.copydefault, countryEntity.copydefault) || !Intrinsics.areEqual(this.component1, countryEntity.component1)) {
            return false;
        }
        if (Intrinsics.areEqual(this.getAsAtTimestamp, countryEntity.getAsAtTimestamp)) {
            return true;
        }
        int i10 = copy + 41;
        getRequestBeneficiariesState = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 33;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((Integer.hashCode(this.component3) * 31) + this.equals.hashCode()) * 31) + this.component2.hashCode()) * 31) + this.component4.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.component1.hashCode()) * 31) + this.getAsAtTimestamp.hashCode();
        int i4 = getRequestBeneficiariesState + 89;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CountryEntity(id=" + this.component3 + ", name=" + this.equals + ", emoji=" + this.component2 + ", unicode=" + this.component4 + ", alpha2Code=" + this.ShareDataUIState + ", alpha3Code=" + this.copydefault + ", dialCode=" + this.component1 + ", transaction=" + this.getAsAtTimestamp + ")";
        int i2 = copy + 13;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
