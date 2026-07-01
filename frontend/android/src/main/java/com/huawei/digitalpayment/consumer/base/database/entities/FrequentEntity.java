package com.huawei.digitalpayment.consumer.base.database.entities;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Jw\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u0006."}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/FrequentEntity;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "", "number", "type", "Lcom/huawei/digitalpayment/consumer/base/database/entities/FrequentType;", "secondaryNumber", "transactionType", "transactionTitle", "description", "iconUrl", "frequency", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/base/database/entities/FrequentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getNumber", "getType", "()Lcom/huawei/digitalpayment/consumer/base/database/entities/FrequentType;", "getSecondaryNumber", "getTransactionType", "getTransactionTitle", "getDescription", "getIconUrl", "getFrequency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FrequentEntity {
    private static int getShareableDataState = 1;
    private static int hashCode;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final int component3;
    private final String component4;
    private final FrequentType copy;
    private final int copydefault;
    private final String equals;
    private final String getAsAtTimestamp;
    private final String getRequestBeneficiariesState;

    public FrequentEntity(int i, String str, String str2, FrequentType frequentType, String str3, String str4, String str5, String str6, String str7, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(frequentType, "");
        this.copydefault = i;
        this.component1 = str;
        this.getAsAtTimestamp = str2;
        this.copy = frequentType;
        this.component4 = str3;
        this.equals = str4;
        this.getRequestBeneficiariesState = str5;
        this.component2 = str6;
        this.ShareDataUIState = str7;
        this.component3 = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FrequentEntity(int i, String str, String str2, FrequentType frequentType, String str3, String str4, String str5, String str6, String str7, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        String str8;
        String str9;
        String str10;
        String str11;
        int i5;
        if ((i3 & 1) != 0) {
            int i6 = hashCode + 109;
            getShareableDataState = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 16) != 0) {
            int i9 = getShareableDataState;
            int i10 = i9 + 69;
            hashCode = i10 % 128;
            int i11 = i10 % 2;
            int i12 = i9 + 93;
            hashCode = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 % 2;
            }
            str8 = null;
        } else {
            str8 = str3;
        }
        String str12 = (i3 & 32) != 0 ? null : str4;
        if ((i3 & 64) != 0) {
            int i14 = getShareableDataState + 37;
            int i15 = i14 % 128;
            hashCode = i15;
            if (i14 % 2 != 0) {
                int i16 = 29 / 0;
            }
            int i17 = i15 + 119;
            getShareableDataState = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 2 % 2;
            }
            str9 = null;
        } else {
            str9 = str5;
        }
        if ((i3 & 128) != 0) {
            int i19 = 2 % 2;
            str10 = null;
        } else {
            str10 = str6;
        }
        if ((i3 & 256) != 0) {
            int i20 = getShareableDataState + 41;
            hashCode = i20 % 128;
            if (i20 % 2 != 0) {
                throw null;
            }
            str11 = null;
        } else {
            str11 = str7;
        }
        if ((i3 & 512) != 0) {
            int i21 = 2 % 2;
            i5 = 1;
        } else {
            i5 = i2;
        }
        this(i4, str, str2, frequentType, str8, str12, str9, str10, str11, i5);
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 15;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        int i5 = this.copydefault;
        int i6 = i3 + 73;
        getShareableDataState = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 17;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 109;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getNumber() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 57;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 63;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final FrequentType getType() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 85;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        FrequentType frequentType = this.copy;
        int i5 = i2 + 119;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return frequentType;
    }

    public final String getSecondaryNumber() {
        int i = 2 % 2;
        int i2 = hashCode + 1;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component4;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return str;
    }

    public final String getTransactionType() {
        int i = 2 % 2;
        int i2 = hashCode + 23;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.equals;
        int i4 = i3 + 103;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getTransactionTitle() {
        int i = 2 % 2;
        int i2 = hashCode + 31;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getRequestBeneficiariesState;
        }
        throw null;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 13;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 81;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIconUrl() {
        int i = 2 % 2;
        int i2 = hashCode + 43;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.ShareDataUIState;
        int i4 = i3 + 111;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final int getFrequency() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 7;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.component3;
        if (i3 != 0) {
            int i5 = 66 / 0;
        }
        return i4;
    }

    public static FrequentEntity copy$default(FrequentEntity frequentEntity, int i, String str, String str2, FrequentType frequentType, String str3, String str4, String str5, String str6, String str7, int i2, int i3, Object obj) {
        int i4;
        String str8;
        FrequentType frequentType2;
        String str9;
        String str10;
        String str11;
        String str12;
        int i5;
        int i6 = 2 % 2;
        Object obj2 = null;
        if ((i3 & 1) != 0) {
            int i7 = hashCode + 71;
            getShareableDataState = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = frequentEntity.copydefault;
                throw null;
            }
            i4 = frequentEntity.copydefault;
        } else {
            i4 = i;
        }
        String str13 = (i3 & 2) != 0 ? frequentEntity.component1 : str;
        if ((i3 & 4) != 0) {
            int i9 = getShareableDataState + 41;
            hashCode = i9 % 128;
            if (i9 % 2 != 0) {
                String str14 = frequentEntity.getAsAtTimestamp;
                obj2.hashCode();
                throw null;
            }
            str8 = frequentEntity.getAsAtTimestamp;
        } else {
            str8 = str2;
        }
        if ((i3 & 8) != 0) {
            int i10 = hashCode + 35;
            getShareableDataState = i10 % 128;
            int i11 = i10 % 2;
            frequentType2 = frequentEntity.copy;
        } else {
            frequentType2 = frequentType;
        }
        if ((i3 & 16) != 0) {
            str9 = frequentEntity.component4;
            int i12 = hashCode + 33;
            getShareableDataState = i12 % 128;
            int i13 = i12 % 2;
        } else {
            str9 = str3;
        }
        if ((i3 & 32) != 0) {
            int i14 = hashCode + 75;
            getShareableDataState = i14 % 128;
            int i15 = i14 % 2;
            str10 = frequentEntity.equals;
        } else {
            str10 = str4;
        }
        if ((i3 & 64) != 0) {
            int i16 = hashCode + 15;
            getShareableDataState = i16 % 128;
            int i17 = i16 % 2;
            str11 = frequentEntity.getRequestBeneficiariesState;
        } else {
            str11 = str5;
        }
        String str15 = (i3 & 128) != 0 ? frequentEntity.component2 : str6;
        if ((i3 & 256) != 0) {
            str12 = frequentEntity.ShareDataUIState;
            int i18 = hashCode + 15;
            getShareableDataState = i18 % 128;
            int i19 = i18 % 2;
        } else {
            str12 = str7;
        }
        if ((i3 & 512) != 0) {
            int i20 = getShareableDataState + 15;
            hashCode = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = frequentEntity.component3;
                throw null;
            }
            i5 = frequentEntity.component3;
        } else {
            i5 = i2;
        }
        return frequentEntity.copy(i4, str13, str8, frequentType2, str9, str10, str11, str15, str12, i5);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = hashCode + 25;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.copydefault;
        if (i3 == 0) {
            int i5 = 35 / 0;
        }
        return i4;
    }

    public final int component10() {
        int i = 2 % 2;
        int i2 = hashCode + 83;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        int i5 = this.component3;
        int i6 = i3 + 83;
        hashCode = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 19;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component1;
        int i5 = i3 + 23;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = hashCode + 21;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 91;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FrequentType component4() {
        int i = 2 % 2;
        int i2 = hashCode + 1;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        FrequentType frequentType = this.copy;
        int i5 = i3 + 81;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 72 / 0;
        }
        return frequentType;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = hashCode + 47;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component4;
        int i4 = i3 + 59;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 57;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return this.equals;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = hashCode + 11;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 85;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 33;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 61;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 39;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FrequentEntity copy(int id, String name, String number, FrequentType type, String secondaryNumber, String transactionType, String transactionTitle, String description, String iconUrl, int frequency) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(type, "");
        FrequentEntity frequentEntity = new FrequentEntity(id, name, number, type, secondaryNumber, transactionType, transactionTitle, description, iconUrl, frequency);
        int i2 = getShareableDataState + 87;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return frequentEntity;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 89;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrequentEntity)) {
            return false;
        }
        FrequentEntity frequentEntity = (FrequentEntity) other;
        if (this.copydefault != frequentEntity.copydefault) {
            int i5 = i2 + 17;
            hashCode = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.component1, frequentEntity.component1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, frequentEntity.getAsAtTimestamp)) {
            int i6 = getShareableDataState + 101;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.copy != frequentEntity.copy) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, frequentEntity.component4)) {
            int i8 = hashCode + 85;
            getShareableDataState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.equals, frequentEntity.equals)) {
            return Intrinsics.areEqual(this.getRequestBeneficiariesState, frequentEntity.getRequestBeneficiariesState) && !(Intrinsics.areEqual(this.component2, frequentEntity.component2) ^ true) && Intrinsics.areEqual(this.ShareDataUIState, frequentEntity.ShareDataUIState) && this.component3 == frequentEntity.component3;
        }
        int i10 = hashCode + 105;
        getShareableDataState = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iHashCode4 = Integer.hashCode(this.copydefault);
        int iHashCode5 = this.component1.hashCode();
        int iHashCode6 = this.getAsAtTimestamp.hashCode();
        int iHashCode7 = this.copy.hashCode();
        String str = this.component4;
        int iHashCode8 = 1;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = getShareableDataState + 1;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.equals;
        if (str2 == null) {
            int i4 = getShareableDataState + 67;
            hashCode = i4 % 128;
            if (i4 % 2 == 0) {
                iHashCode8 = 0;
            }
        } else {
            iHashCode8 = str2.hashCode();
        }
        String str3 = this.getRequestBeneficiariesState;
        if (str3 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
            int i5 = hashCode + 19;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
        }
        String str4 = this.component2;
        if (str4 == null) {
            int i7 = getShareableDataState + 103;
            hashCode = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.ShareDataUIState;
        return (((((((((((((((((iHashCode4 * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + Integer.hashCode(this.component3);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FrequentEntity(id=" + this.copydefault + ", name=" + this.component1 + ", number=" + this.getAsAtTimestamp + ", type=" + this.copy + ", secondaryNumber=" + this.component4 + ", transactionType=" + this.equals + ", transactionTitle=" + this.getRequestBeneficiariesState + ", description=" + this.component2 + ", iconUrl=" + this.ShareDataUIState + ", frequency=" + this.component3 + ")";
        int i2 = hashCode + 125;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
