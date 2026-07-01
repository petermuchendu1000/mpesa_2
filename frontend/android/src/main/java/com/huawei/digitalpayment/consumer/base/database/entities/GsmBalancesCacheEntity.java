package com.huawei.digitalpayment.consumer.base.database.entities;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Jt\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/GsmBalancesCacheEntity;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "msisdn", "displayName", "displayOrder", "", "remaining", "", "cumulative", "type", "units", "updatedAtMillis", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getMsisdn", "getDisplayName", "getDisplayOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRemaining", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getCumulative", "getType", "getUnits", "getUpdatedAtMillis", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/huawei/digitalpayment/consumer/base/database/entities/GsmBalancesCacheEntity;", "equals", "", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GsmBalancesCacheEntity {
    private static int copy = 0;
    private static int hashCode = 1;
    private final Integer ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final long component4;
    private final String copydefault;
    private final String equals;
    private final String getAsAtTimestamp;
    private final Float getRequestBeneficiariesState;

    public GsmBalancesCacheEntity(String str, String str2, String str3, Integer num, Float f, String str4, String str5, String str6, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component1 = str;
        this.component2 = str2;
        this.component3 = str3;
        this.ShareDataUIState = num;
        this.getRequestBeneficiariesState = f;
        this.copydefault = str4;
        this.equals = str5;
        this.getAsAtTimestamp = str6;
        this.component4 = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GsmBalancesCacheEntity(String str, String str2, String str3, Integer num, Float f, String str4, String str5, String str6, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Float f2;
        String str7;
        long jCurrentTimeMillis;
        String str8 = (i & 4) != 0 ? null : str3;
        Integer num2 = (i & 8) != 0 ? null : num;
        if ((i & 16) != 0) {
            int i2 = copy + 41;
            int i3 = i2 % 128;
            hashCode = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i4 = i3 + 35;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 3;
            } else {
                int i6 = 2 % 2;
            }
            f2 = null;
        } else {
            f2 = f;
        }
        String str9 = (i & 32) != 0 ? null : str4;
        if ((i & 64) != 0) {
            int i7 = 2 % 2;
            str7 = null;
        } else {
            str7 = str5;
        }
        String str10 = (i & 128) != 0 ? null : str6;
        if ((i & 256) != 0) {
            int i8 = 2 % 2;
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = j;
        }
        this(str, str2, str8, num2, f2, str9, str7, str10, jCurrentTimeMillis);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 97;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 69;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 103;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 105;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDisplayName() {
        int i = 2 % 2;
        int i2 = copy + 125;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 79;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getDisplayOrder() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 43;
        copy = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.ShareDataUIState;
        int i5 = i2 + 117;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Float getRemaining() {
        int i = 2 % 2;
        int i2 = hashCode + 23;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Float f = this.getRequestBeneficiariesState;
        int i5 = i3 + 29;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public final String getCumulative() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 25;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 23;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getType() {
        String str;
        int i = 2 % 2;
        int i2 = hashCode + 77;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 != 0) {
            str = this.equals;
            int i4 = 81 / 0;
        } else {
            str = this.equals;
        }
        int i5 = i3 + 25;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getUnits() {
        int i = 2 % 2;
        int i2 = hashCode + 25;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 73;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final long getUpdatedAtMillis() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 41;
        copy = i3 % 128;
        int i4 = i3 % 2;
        long j = this.component4;
        int i5 = i2 + 85;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public static GsmBalancesCacheEntity copy$default(GsmBalancesCacheEntity gsmBalancesCacheEntity, String str, String str2, String str3, Integer num, Float f, String str4, String str5, String str6, long j, int i, Object obj) {
        Integer num2;
        Float f2;
        String str7;
        long j2;
        int i2 = 2 % 2;
        int i3 = copy;
        int i4 = i3 + 29;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        String str8 = (i & 1) != 0 ? gsmBalancesCacheEntity.component1 : str;
        String str9 = (i & 2) != 0 ? gsmBalancesCacheEntity.component2 : str2;
        String str10 = (i & 4) != 0 ? gsmBalancesCacheEntity.component3 : str3;
        if ((i & 8) != 0) {
            int i6 = i3 + 25;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            num2 = gsmBalancesCacheEntity.ShareDataUIState;
        } else {
            num2 = num;
        }
        if ((i & 16) != 0) {
            f2 = gsmBalancesCacheEntity.getRequestBeneficiariesState;
            int i8 = hashCode + 81;
            copy = i8 % 128;
            int i9 = i8 % 2;
        } else {
            f2 = f;
        }
        String str11 = (i & 32) != 0 ? gsmBalancesCacheEntity.copydefault : str4;
        String str12 = (i & 64) != 0 ? gsmBalancesCacheEntity.equals : str5;
        if ((i & 128) != 0) {
            str7 = gsmBalancesCacheEntity.getAsAtTimestamp;
            int i10 = hashCode + 97;
            copy = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str7 = str6;
        }
        if ((i & 256) != 0) {
            j2 = gsmBalancesCacheEntity.component4;
            int i12 = hashCode + 61;
            copy = i12 % 128;
            int i13 = i12 % 2;
        } else {
            j2 = j;
        }
        return gsmBalancesCacheEntity.copy(str8, str9, str10, num2, f2, str11, str12, str7, j2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = hashCode + 15;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copy + 77;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 55;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy + 25;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 1;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 39;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.ShareDataUIState;
        int i5 = i2 + 93;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Float component5() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 1;
        copy = i3 % 128;
        int i4 = i3 % 2;
        Float f = this.getRequestBeneficiariesState;
        int i5 = i2 + 63;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 24 / 0;
        }
        return f;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = hashCode + 115;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 123;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = hashCode + 79;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.equals;
        int i5 = i3 + 61;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = hashCode + 91;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 39;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 4 / 0;
        }
        return str;
    }

    public final long component9() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 107;
        copy = i3 % 128;
        int i4 = i3 % 2;
        long j = this.component4;
        int i5 = i2 + 125;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GsmBalancesCacheEntity copy(String id, String msisdn, String displayName, Integer displayOrder, Float remaining, String cumulative, String type, String units, long updatedAtMillis) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        GsmBalancesCacheEntity gsmBalancesCacheEntity = new GsmBalancesCacheEntity(id, msisdn, displayName, displayOrder, remaining, cumulative, type, units, updatedAtMillis);
        int i2 = hashCode + 85;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
        return gsmBalancesCacheEntity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r7 instanceof com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r7 = (com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.component1, r7.component1) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r7 = com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.copy + 47;
        com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.hashCode = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r6.component2, r7.component2)) == true) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.component3, r7.component3) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r7 = com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.copy + 65;
        com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.hashCode = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if ((r7 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        r7 = 61 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r6.ShareDataUIState, r7.ShareDataUIState)) == true) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6.getRequestBeneficiariesState, (java.lang.Object) r7.getRequestBeneficiariesState) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r6.copydefault, r7.copydefault)) == true) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.equals, r7.equals) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6.getAsAtTimestamp, r7.getAsAtTimestamp) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        r7 = com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.copy + 115;
        com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.hashCode = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r6.component4 == r7.component4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        r7 = com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.hashCode + 101;
        com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.copy = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ac, code lost:
    
        if ((r7 % 2) == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.hashCode
            int r1 = r1 + 71
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.copy = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L16
            r1 = 46
            int r1 = r1 / r3
            if (r6 != r7) goto L19
            goto L18
        L16:
            if (r6 != r7) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity r7 = (com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity) r7
            java.lang.String r1 = r6.component1
            java.lang.String r4 = r7.component1
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L34
            int r7 = com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.copy
            int r7 = r7 + 47
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.hashCode = r1
            int r7 = r7 % r0
            return r3
        L34:
            java.lang.String r1 = r6.component2
            java.lang.String r4 = r7.component2
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r2
            if (r1 == r2) goto La3
            java.lang.String r1 = r6.component3
            java.lang.String r4 = r7.component3
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L58
            int r7 = com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.copy
            int r7 = r7 + 65
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.hashCode = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L57
            r7 = 61
            int r7 = r7 / r3
        L57:
            return r3
        L58:
            java.lang.Integer r1 = r6.ShareDataUIState
            java.lang.Integer r4 = r7.ShareDataUIState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r2
            if (r1 == r2) goto La2
            java.lang.Float r1 = r6.getRequestBeneficiariesState
            java.lang.Float r4 = r7.getRequestBeneficiariesState
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L6e
            return r3
        L6e:
            java.lang.String r1 = r6.copydefault
            java.lang.String r4 = r7.copydefault
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            r1 = r1 ^ r2
            if (r1 == r2) goto La2
            java.lang.String r1 = r6.equals
            java.lang.String r4 = r7.equals
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L84
            return r3
        L84:
            java.lang.String r1 = r6.getAsAtTimestamp
            java.lang.String r4 = r7.getAsAtTimestamp
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L98
            int r7 = com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.copy
            int r7 = r7 + 115
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.hashCode = r1
            int r7 = r7 % r0
            return r3
        L98:
            long r0 = r6.component4
            long r4 = r7.component4
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 == 0) goto La1
            return r3
        La1:
            return r2
        La2:
            return r3
        La3:
            int r7 = com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.hashCode
            int r7 = r7 + 101
            int r1 = r7 % 128
            com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.copy = r1
            int r7 = r7 % r0
            if (r7 == 0) goto Laf
            return r2
        Laf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iHashCode5 = this.component1.hashCode();
        int iHashCode6 = this.component2.hashCode();
        String str = this.component3;
        if (str == null) {
            int i2 = hashCode + 5;
            copy = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Integer num = this.ShareDataUIState;
        if (num == null) {
            int i4 = hashCode + 49;
            copy = i4 % 128;
            iHashCode2 = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        Float f = this.getRequestBeneficiariesState;
        if (f == null) {
            int i5 = copy + 107;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = f.hashCode();
        }
        String str2 = this.copydefault;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.equals;
        if (str3 == null) {
            int i7 = copy + 17;
            hashCode = i7 % 128;
            int i8 = i7 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str3.hashCode();
        }
        String str4 = this.getAsAtTimestamp;
        return (((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode7) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Long.hashCode(this.component4);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GsmBalancesCacheEntity(id=" + this.component1 + ", msisdn=" + this.component2 + ", displayName=" + this.component3 + ", displayOrder=" + this.ShareDataUIState + ", remaining=" + this.getRequestBeneficiariesState + ", cumulative=" + this.copydefault + ", type=" + this.equals + ", units=" + this.getAsAtTimestamp + ", updatedAtMillis=" + this.component4 + ")";
        int i2 = hashCode + 71;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
