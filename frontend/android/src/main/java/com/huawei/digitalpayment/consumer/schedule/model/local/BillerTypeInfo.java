package com.huawei.digitalpayment.consumer.schedule.model.local;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/schedule/model/local/BillerTypeInfo;", "Lcom/huawei/http/BaseResp;", "billerName", "", "billerCode", "referenceName", "referenceCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBillerName", "()Ljava/lang/String;", "setBillerName", "(Ljava/lang/String;)V", "getBillerCode", "setBillerCode", "getReferenceName", "setReferenceName", "getReferenceCode", "setReferenceCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerScheduleModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillerTypeInfo extends BaseResp {
    private static int component2 = 1;
    private static int component3;
    private String billerCode;
    private String billerName;
    private String referenceCode;
    private String referenceName;

    public final String getBillerName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.billerName;
        int i5 = i2 + 105;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setBillerName(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.billerName = str;
        int i5 = i2 + 21;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getBillerCode() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.billerCode;
        int i5 = i2 + 101;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setBillerCode(String str) {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.billerCode = str;
        int i5 = i3 + 63;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getReferenceName() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.referenceName;
        }
        throw null;
    }

    public final void setReferenceName(String str) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.referenceName = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final String getReferenceCode() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.referenceCode;
            int i4 = 4 / 0;
        } else {
            str = this.referenceCode;
        }
        int i5 = i2 + 83;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setReferenceCode(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 99;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.referenceCode = str;
        int i5 = i2 + 9;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public BillerTypeInfo(String str, String str2, String str3, String str4) {
        this.billerName = str;
        this.billerCode = str2;
        this.referenceName = str3;
        this.referenceCode = str4;
    }

    public static BillerTypeInfo copy$default(BillerTypeInfo billerTypeInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = billerTypeInfo.billerName;
            int i3 = component3 + 43;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
        if ((i & 2) != 0) {
            str2 = billerTypeInfo.billerCode;
        }
        if ((i & 4) != 0) {
            str3 = billerTypeInfo.referenceName;
        }
        if ((i & 8) != 0) {
            int i5 = component3 + 17;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str4 = billerTypeInfo.referenceCode;
        }
        return billerTypeInfo.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 109;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.billerName;
        int i4 = i2 + 71;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.billerCode;
        int i5 = i3 + 57;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.referenceName;
        int i5 = i3 + 65;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 8 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.referenceCode;
        int i5 = i3 + 93;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final BillerTypeInfo copy(String billerName, String billerCode, String referenceName, String referenceCode) {
        int i = 2 % 2;
        BillerTypeInfo billerTypeInfo = new BillerTypeInfo(billerName, billerCode, referenceName, referenceCode);
        int i2 = component2 + 81;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
        return billerTypeInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 95;
            component2 = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!(other instanceof BillerTypeInfo)) {
            int i5 = i2 + 19;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        BillerTypeInfo billerTypeInfo = (BillerTypeInfo) other;
        if (Intrinsics.areEqual(this.billerName, billerTypeInfo.billerName)) {
            return !(Intrinsics.areEqual(this.billerCode, billerTypeInfo.billerCode) ^ true) && Intrinsics.areEqual(this.referenceName, billerTypeInfo.referenceName) && Intrinsics.areEqual(this.referenceCode, billerTypeInfo.referenceCode);
        }
        int i7 = component2 + 69;
        component3 = i7 % 128;
        return i7 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.billerName;
        int iHashCode4 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = component2 + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        }
        String str2 = this.billerCode;
        if (str2 == null) {
            int i4 = component2 + 57;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.referenceName;
        if (str3 == null) {
            int i6 = component2 + 109;
            component3 = i6 % 128;
            iHashCode3 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.referenceCode;
        if (str4 != null) {
            iHashCode4 = str4.hashCode();
            int i7 = component2 + 113;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 5;
            }
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BillerTypeInfo(billerName=" + this.billerName + ", billerCode=" + this.billerCode + ", referenceName=" + this.referenceName + ", referenceCode=" + this.referenceCode + ")";
        int i2 = component3 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
