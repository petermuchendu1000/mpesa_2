package com.huawei.digitalpayment.consumer.base.resp;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/StatementResp;", "Ljava/io/Serializable;", GriverCacheDao.COLUMN_CACHE_ID, "", "amountDisplay", "unit", "isBound", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getAmountDisplay", "setAmountDisplay", "getUnit", "setUnit", "()Z", "setBound", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatementResp implements Serializable {
    private static int component2 = 0;
    private static int copydefault = 1;
    private String amountDisplay;
    private String id;
    private boolean isBound;
    private String unit;

    public StatementResp(String str, String str2, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.amountDisplay = str2;
        this.unit = str3;
        this.isBound = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StatementResp(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copydefault + 17;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = copydefault + 113;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i6 = 2 % 2;
            str3 = "";
        }
        this(str, str2, str3, (i & 8) != 0 ? false : z);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 87;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setId(String str) {
        int i = 2 % 2;
        int i2 = component2 + 27;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        int i4 = component2 + 3;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amountDisplay;
        int i5 = i2 + 15;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAmountDisplay(String str) {
        int i = 2 % 2;
        int i2 = component2 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.amountDisplay = str;
        int i4 = copydefault + 87;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getUnit() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.unit;
        int i5 = i3 + 95;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setUnit(String str) {
        int i = 2 % 2;
        int i2 = component2 + 41;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.unit = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.unit = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final boolean isBound() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 97;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isBound;
        int i5 = i2 + 119;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 19 / 0;
        }
        return z;
    }

    public final void setBound(boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.isBound = z;
        int i5 = i3 + 121;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public StatementResp() {
        this(null, null, null, false, 15, null);
    }

    public static StatementResp copy$default(StatementResp statementResp, String str, String str2, String str3, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 93;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = statementResp.id;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i5 = i4 + 105;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                String str4 = statementResp.amountDisplay;
                obj2.hashCode();
                throw null;
            }
            str2 = statementResp.amountDisplay;
        }
        if ((i & 4) != 0) {
            int i6 = i4 + 71;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                String str5 = statementResp.unit;
                obj2.hashCode();
                throw null;
            }
            str3 = statementResp.unit;
        }
        if ((i & 8) != 0) {
            z = statementResp.isBound;
        }
        return statementResp.copy(str, str2, str3, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 83;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amountDisplay;
        int i5 = i2 + 47;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 29;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.unit;
            int i4 = 47 / 0;
        } else {
            str = this.unit;
        }
        int i5 = i3 + 123;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isBound;
        int i5 = i2 + 119;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
        return z;
    }

    public final StatementResp copy(String id, String amountDisplay, String unit, boolean isBound) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(amountDisplay, "");
        Intrinsics.checkNotNullParameter(unit, "");
        StatementResp statementResp = new StatementResp(id, amountDisplay, unit, isBound);
        int i2 = copydefault + 17;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 92 / 0;
        }
        return statementResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 23;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof StatementResp)) {
            int i4 = copydefault + 13;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        StatementResp statementResp = (StatementResp) other;
        if (!Intrinsics.areEqual(this.id, statementResp.id)) {
            int i6 = copydefault + 53;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.amountDisplay, statementResp.amountDisplay) || !Intrinsics.areEqual(this.unit, statementResp.unit)) {
            return false;
        }
        if (this.isBound == statementResp.isBound) {
            return true;
        }
        int i8 = component2 + 25;
        copydefault = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.id.hashCode();
        return i3 == 0 ? (((((iHashCode + 70) << this.amountDisplay.hashCode()) / 97) / this.unit.hashCode()) / 104) >>> Boolean.hashCode(this.isBound) : (((((iHashCode * 31) + this.amountDisplay.hashCode()) * 31) + this.unit.hashCode()) * 31) + Boolean.hashCode(this.isBound);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StatementResp(id=" + this.id + ", amountDisplay=" + this.amountDisplay + ", unit=" + this.unit + ", isBound=" + this.isBound + ")";
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 35 / 0;
        }
        return str;
    }
}
