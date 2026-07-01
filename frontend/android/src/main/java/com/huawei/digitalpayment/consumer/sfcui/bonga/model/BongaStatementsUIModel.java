package com.huawei.digitalpayment.consumer.sfcui.bonga.model;

import com.huawei.digitalpayment.consumer.sfcui.bonga.statement.utils.BongaStatement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/model/BongaStatementsUIModel;", "", "accumulatedStatements", "", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/utils/BongaStatement$Accumulated;", "redeemedStatements", "Lcom/huawei/digitalpayment/consumer/sfcui/bonga/statement/utils/BongaStatement$Redeemed;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAccumulatedStatements", "()Ljava/util/List;", "getRedeemedStatements", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaStatementsUIModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 125 % 128;
    private static int equals = 1;
    private final List<BongaStatement.Redeemed> component1;
    private final List<BongaStatement.Accumulated> copydefault;

    public BongaStatementsUIModel(List<BongaStatement.Accumulated> list, List<BongaStatement.Redeemed> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.copydefault = list;
        this.component1 = list2;
    }

    public final List<BongaStatement.Accumulated> getAccumulatedStatements() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        List<BongaStatement.Accumulated> list = this.copydefault;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return list;
    }

    public final List<BongaStatement.Redeemed> getRedeemedStatements() {
        int i = 2 % 2;
        int i2 = component2 + 27;
        equals = i2 % 128;
        int i3 = i2 % 2;
        List<BongaStatement.Redeemed> list = this.component1;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return list;
    }

    static {
        if (125 % 2 == 0) {
            int i = 84 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BongaStatementsUIModel copy$default(BongaStatementsUIModel bongaStatementsUIModel, List list, List list2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2;
            int i4 = i3 + 73;
            equals = i4 % 128;
            int i5 = i4 % 2;
            List<BongaStatement.Accumulated> list3 = bongaStatementsUIModel.copydefault;
            int i6 = i3 + 121;
            equals = i6 % 128;
            int i7 = i6 % 2;
            list = list3;
        }
        if ((i & 2) != 0) {
            list2 = bongaStatementsUIModel.component1;
        }
        return bongaStatementsUIModel.copy(list, list2);
    }

    public final List<BongaStatement.Accumulated> component1() {
        List<BongaStatement.Accumulated> list;
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            list = this.copydefault;
            int i4 = 34 / 0;
        } else {
            list = this.copydefault;
        }
        int i5 = i3 + 27;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final List<BongaStatement.Redeemed> component2() {
        int i = 2 % 2;
        int i2 = component2 + 107;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        List<BongaStatement.Redeemed> list = this.component1;
        int i5 = i3 + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final BongaStatementsUIModel copy(List<BongaStatement.Accumulated> accumulatedStatements, List<BongaStatement.Redeemed> redeemedStatements) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accumulatedStatements, "");
        Intrinsics.checkNotNullParameter(redeemedStatements, "");
        BongaStatementsUIModel bongaStatementsUIModel = new BongaStatementsUIModel(accumulatedStatements, redeemedStatements);
        int i2 = component2 + 41;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 90 / 0;
        }
        return bongaStatementsUIModel;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 25;
            equals = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof BongaStatementsUIModel)) {
            return false;
        }
        BongaStatementsUIModel bongaStatementsUIModel = (BongaStatementsUIModel) other;
        if (!Intrinsics.areEqual(this.copydefault, bongaStatementsUIModel.copydefault)) {
            int i3 = component2 + 75;
            equals = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 61 / 0;
            }
            return false;
        }
        if (Intrinsics.areEqual(this.component1, bongaStatementsUIModel.component1)) {
            return true;
        }
        int i5 = component2 + 11;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.copydefault.hashCode();
        return i3 != 0 ? (iHashCode * 107) % this.component1.hashCode() : (iHashCode * 31) + this.component1.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BongaStatementsUIModel(accumulatedStatements=" + this.copydefault + ", redeemedStatements=" + this.component1 + ")";
        int i2 = equals + 87;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
