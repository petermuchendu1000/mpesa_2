package com.huawei.digitalpayment.consumer.base.resp;

import com.huawei.digitalpayment.consumer.base.constants.KeysConstants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/WithdrawResultResp;", "Ljava/io/Serializable;", "businessTitle", "", "agentNumber", KeysConstants.KEY_STORE_NUMBER, "publicName", "resIcon", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBusinessTitle", "()Ljava/lang/String;", "getAgentNumber", "getStoreNumber", "getPublicName", "getResIcon", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WithdrawResultResp implements Serializable {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final String agentNumber;
    private final String businessTitle;
    private final String publicName;
    private final int resIcon;
    private final String storeNumber;

    public WithdrawResultResp(String str, String str2, String str3, String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.businessTitle = str;
        this.agentNumber = str2;
        this.storeNumber = str3;
        this.publicName = str4;
        this.resIcon = i;
    }

    public final String getBusinessTitle() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.businessTitle;
        int i5 = i2 + 51;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAgentNumber() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.agentNumber;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStoreNumber() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.storeNumber;
        int i4 = i3 + 61;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getPublicName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.publicName;
        int i5 = i2 + 5;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getResIcon() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 105;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.resIcon;
        int i6 = i2 + 35;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public static WithdrawResultResp copy$default(WithdrawResultResp withdrawResultResp, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 103;
        int i5 = i4 % 128;
        component2 = i5;
        int i6 = i4 % 2;
        if ((i2 & 1) != 0) {
            int i7 = i5 + 69;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            str = withdrawResultResp.businessTitle;
        }
        String str5 = str;
        if ((i2 & 2) != 0) {
            str2 = withdrawResultResp.agentNumber;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = withdrawResultResp.storeNumber;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = withdrawResultResp.publicName;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            int i9 = i5 + 25;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            i = withdrawResultResp.resIcon;
        }
        return withdrawResultResp.copy(str5, str6, str7, str8, i);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.businessTitle;
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            str = this.agentNumber;
            int i4 = 40 / 0;
        } else {
            str = this.agentNumber;
        }
        int i5 = i3 + 7;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.storeNumber;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.publicName;
        int i5 = i2 + 81;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.resIcon;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final WithdrawResultResp copy(String businessTitle, String agentNumber, String storeNumber, String publicName, int resIcon) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(businessTitle, "");
        Intrinsics.checkNotNullParameter(agentNumber, "");
        Intrinsics.checkNotNullParameter(storeNumber, "");
        Intrinsics.checkNotNullParameter(publicName, "");
        WithdrawResultResp withdrawResultResp = new WithdrawResultResp(businessTitle, agentNumber, storeNumber, publicName, resIcon);
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return withdrawResultResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawResultResp)) {
            int i5 = i3 + 77;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        WithdrawResultResp withdrawResultResp = (WithdrawResultResp) other;
        if (!Intrinsics.areEqual(this.businessTitle, withdrawResultResp.businessTitle) || !Intrinsics.areEqual(this.agentNumber, withdrawResultResp.agentNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.storeNumber, withdrawResultResp.storeNumber)) {
            int i7 = ShareDataUIState + 43;
            component2 = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.publicName, withdrawResultResp.publicName)) {
            int i8 = component2 + 13;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 94 / 0;
            }
            return false;
        }
        if (this.resIcon == withdrawResultResp.resIcon) {
            return true;
        }
        int i10 = ShareDataUIState + 101;
        component2 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.businessTitle.hashCode() * 31) + this.agentNumber.hashCode()) * 31) + this.storeNumber.hashCode()) * 31) + this.publicName.hashCode()) * 31) + Integer.hashCode(this.resIcon);
        int i4 = ShareDataUIState + 21;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WithdrawResultResp(businessTitle=" + this.businessTitle + ", agentNumber=" + this.agentNumber + ", storeNumber=" + this.storeNumber + ", publicName=" + this.publicName + ", resIcon=" + this.resIcon + ")";
        int i2 = ShareDataUIState + 43;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
