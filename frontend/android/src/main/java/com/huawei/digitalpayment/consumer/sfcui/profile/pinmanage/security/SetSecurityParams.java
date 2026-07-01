package com.huawei.digitalpayment.consumer.sfcui.profile.pinmanage.security;

import com.huawei.http.BaseRequestParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0015H×\u0001J\t\u0010\u0016\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/SetSecurityParams;", "Lcom/huawei/http/BaseRequestParams;", "initiatorPin", "", "qaList", "", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/pinmanage/security/QAItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getInitiatorPin", "()Ljava/lang/String;", "getQaList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SetSecurityParams extends BaseRequestParams {
    public static final int $stable = 8;
    private static int ShareDataUIState = 9 % 128;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final String initiatorPin;
    private final List<QAItem> qaList;

    public SetSecurityParams(String str, List<QAItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.initiatorPin = str;
        this.qaList = list;
    }

    public final String getInitiatorPin() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.initiatorPin;
        int i5 = i3 + 99;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return str;
    }

    public final List<QAItem> getQaList() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<QAItem> list = this.qaList;
        int i4 = i3 + 113;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    static {
        if (9 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SetSecurityParams copy$default(SetSecurityParams setSecurityParams, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 101;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = setSecurityParams.initiatorPin;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 13;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            list = setSecurityParams.qaList;
            if (i7 == 0) {
                int i8 = 18 / 0;
            }
        }
        SetSecurityParams setSecurityParamsCopy = setSecurityParams.copy(str, list);
        int i9 = copydefault + 103;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return setSecurityParamsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.initiatorPin;
        int i4 = i3 + 53;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return str;
    }

    public final List<QAItem> component2() {
        List<QAItem> list;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            list = this.qaList;
            int i4 = 95 / 0;
        } else {
            list = this.qaList;
        }
        int i5 = i2 + 43;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final SetSecurityParams copy(String initiatorPin, List<QAItem> qaList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(initiatorPin, "");
        SetSecurityParams setSecurityParams = new SetSecurityParams(initiatorPin, qaList);
        int i2 = copydefault + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return setSecurityParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (other instanceof SetSecurityParams) {
            SetSecurityParams setSecurityParams = (SetSecurityParams) other;
            return Intrinsics.areEqual(this.initiatorPin, setSecurityParams.initiatorPin) && Intrinsics.areEqual(this.qaList, setSecurityParams.qaList);
        }
        int i4 = i3 + 123;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 45;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.initiatorPin.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.initiatorPin.hashCode();
        List<QAItem> list = this.qaList;
        int iHashCode2 = (iHashCode * 31) + (list == null ? 0 : list.hashCode());
        int i3 = copydefault + 7;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SetSecurityParams(initiatorPin=" + this.initiatorPin + ", qaList=" + this.qaList + ")";
        int i2 = copydefault + 107;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
