package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryGroup;", "Ljava/io/Serializable;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "dataList", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WithExpiryGroup implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 67 % 128;
    private final String category;
    private List<WithExpiryResp> dataList;

    public WithExpiryGroup(String str, List<WithExpiryResp> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.category = str;
        this.dataList = list;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.category;
        int i5 = i3 + 69;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final List<WithExpiryResp> getDataList() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<WithExpiryResp> list = this.dataList;
        int i5 = i3 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final void setDataList(List<WithExpiryResp> list) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            this.dataList = list;
            int i3 = 30 / 0;
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            this.dataList = list;
        }
        int i4 = component3 + 81;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (67 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static WithExpiryGroup copy$default(WithExpiryGroup withExpiryGroup, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 83;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = withExpiryGroup.category;
            int i6 = i4 + 25;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 4;
            }
        }
        if ((i & 2) != 0) {
            int i8 = ShareDataUIState + 65;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            list = withExpiryGroup.dataList;
        }
        return withExpiryGroup.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.category;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    public final List<WithExpiryResp> component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 77;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<WithExpiryResp> list = this.dataList;
        int i4 = i2 + 85;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public final WithExpiryGroup copy(String category, List<WithExpiryResp> dataList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(category, "");
        Intrinsics.checkNotNullParameter(dataList, "");
        WithExpiryGroup withExpiryGroup = new WithExpiryGroup(category, dataList);
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return withExpiryGroup;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithExpiryGroup)) {
            return false;
        }
        WithExpiryGroup withExpiryGroup = (WithExpiryGroup) other;
        if (Intrinsics.areEqual(this.category, withExpiryGroup.category)) {
            return Intrinsics.areEqual(this.dataList, withExpiryGroup.dataList);
        }
        int i4 = ShareDataUIState + 55;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        ShareDataUIState = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.category.hashCode() * 74) % this.dataList.hashCode() : (this.category.hashCode() * 31) + this.dataList.hashCode();
        int i3 = ShareDataUIState + 53;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "WithExpiryGroup(category=" + this.category + ", dataList=" + this.dataList + ")";
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
