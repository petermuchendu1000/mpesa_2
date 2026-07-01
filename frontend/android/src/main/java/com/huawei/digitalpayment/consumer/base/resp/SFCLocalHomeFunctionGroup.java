package com.huawei.digitalpayment.consumer.base.resp;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunctionGroup;", "", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "", "dataList", "", "Lcom/huawei/digitalpayment/consumer/base/resp/SFCLocalHomeFunction;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "getDataList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SFCLocalHomeFunctionGroup {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final String category;
    private final List<SFCLocalHomeFunction> dataList;

    public SFCLocalHomeFunctionGroup(String str, List<SFCLocalHomeFunction> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.category = str;
        this.dataList = list;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.category;
        int i5 = i3 + 43;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<SFCLocalHomeFunction> getDataList() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        List<SFCLocalHomeFunction> list = this.dataList;
        int i5 = i2 + 111;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static SFCLocalHomeFunctionGroup copy$default(SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 19;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 57;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                String str2 = sFCLocalHomeFunctionGroup.category;
                throw null;
            }
            str = sFCLocalHomeFunctionGroup.category;
        }
        if ((i & 2) != 0) {
            list = sFCLocalHomeFunctionGroup.dataList;
        }
        return sFCLocalHomeFunctionGroup.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.category;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    public final List<SFCLocalHomeFunction> component2() {
        List<SFCLocalHomeFunction> list;
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            list = this.dataList;
            int i4 = 43 / 0;
        } else {
            list = this.dataList;
        }
        int i5 = i3 + 125;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final SFCLocalHomeFunctionGroup copy(String category, List<SFCLocalHomeFunction> dataList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(category, "");
        Intrinsics.checkNotNullParameter(dataList, "");
        SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup = new SFCLocalHomeFunctionGroup(category, dataList);
        int i2 = ShareDataUIState + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return sFCLocalHomeFunctionGroup;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 3;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SFCLocalHomeFunctionGroup)) {
            int i4 = component3 + 65;
            int i5 = i4 % 128;
            ShareDataUIState = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 25;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        SFCLocalHomeFunctionGroup sFCLocalHomeFunctionGroup = (SFCLocalHomeFunctionGroup) other;
        if (!Intrinsics.areEqual(this.category, sFCLocalHomeFunctionGroup.category)) {
            int i9 = ShareDataUIState + 5;
            component3 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 12 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.dataList, sFCLocalHomeFunctionGroup.dataList)) {
            return true;
        }
        int i11 = ShareDataUIState + 15;
        component3 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.category.hashCode() >>> 126) * this.dataList.hashCode() : (this.category.hashCode() * 31) + this.dataList.hashCode();
        int i3 = ShareDataUIState + 123;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SFCLocalHomeFunctionGroup(category=" + this.category + ", dataList=" + this.dataList + ")";
        int i2 = component3 + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return str;
    }
}
