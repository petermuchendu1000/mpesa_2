package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import com.safaricom.consumer.commons.statements.StatementWrapper;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/StatementGroup;", "Ljava/io/Serializable;", "categoryMonth", "", "dataList", "", "Lcom/safaricom/consumer/commons/statements/StatementWrapper;", "cateGoryDate", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCategoryMonth", "()Ljava/lang/String;", "getDataList", "()Ljava/util/List;", "getCateGoryDate", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StatementGroup implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final String cateGoryDate;
    private final String categoryMonth;
    private final List<StatementWrapper> dataList;

    public StatementGroup(String str, List<StatementWrapper> list, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.categoryMonth = str;
        this.dataList = list;
        this.cateGoryDate = str2;
    }

    public final String getCategoryMonth() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.categoryMonth;
        int i5 = i2 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<StatementWrapper> getDataList() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<StatementWrapper> list = this.dataList;
        int i5 = i2 + 47;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCateGoryDate() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.cateGoryDate;
        if (i3 != 0) {
            int i4 = 24 / 0;
        }
        return str;
    }

    static {
        int i = 1 + 5;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static StatementGroup copy$default(StatementGroup statementGroup, String str, List list, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 49;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = statementGroup.categoryMonth;
            int i6 = i3 + 103;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 3;
            }
        }
        if ((i & 2) != 0) {
            int i8 = i3 + 7;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            list = statementGroup.dataList;
        }
        if ((i & 4) != 0) {
            str2 = statementGroup.cateGoryDate;
        }
        return statementGroup.copy(str, list, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.categoryMonth;
        int i5 = i2 + 43;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<StatementWrapper> component2() {
        List<StatementWrapper> list;
        int i = 2 % 2;
        int i2 = component3 + 23;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            list = this.dataList;
            int i4 = 32 / 0;
        } else {
            list = this.dataList;
        }
        int i5 = i3 + 49;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.cateGoryDate;
            int i4 = 66 / 0;
        } else {
            str = this.cateGoryDate;
        }
        int i5 = i2 + 105;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final StatementGroup copy(String categoryMonth, List<StatementWrapper> dataList, String cateGoryDate) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(categoryMonth, "");
        Intrinsics.checkNotNullParameter(dataList, "");
        Intrinsics.checkNotNullParameter(cateGoryDate, "");
        StatementGroup statementGroup = new StatementGroup(categoryMonth, dataList, cateGoryDate);
        int i2 = component3 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return statementGroup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatementGroup)) {
            return false;
        }
        StatementGroup statementGroup = (StatementGroup) other;
        if (!Intrinsics.areEqual(this.categoryMonth, statementGroup.categoryMonth) || !Intrinsics.areEqual(this.dataList, statementGroup.dataList)) {
            return false;
        }
        if (Intrinsics.areEqual(this.cateGoryDate, statementGroup.cateGoryDate)) {
            return true;
        }
        int i3 = copydefault + 97;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.categoryMonth.hashCode() * 31) + this.dataList.hashCode()) * 31) + this.cateGoryDate.hashCode();
        int i4 = copydefault + 25;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StatementGroup(categoryMonth=" + this.categoryMonth + ", dataList=" + this.dataList + ", cateGoryDate=" + this.cateGoryDate + ")";
        int i2 = component3 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
