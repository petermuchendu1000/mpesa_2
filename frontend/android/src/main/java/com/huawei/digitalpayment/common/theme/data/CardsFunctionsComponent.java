package com.huawei.digitalpayment.common.theme.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/CardsFunctionsComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", "itemArea", "Lcom/huawei/digitalpayment/common/theme/data/CardsFunctionsItemComponent;", "functions", "", "Lcom/huawei/digitalpayment/common/theme/data/FunctionResp;", "filterFunctions", "<init>", "(Lcom/huawei/digitalpayment/common/theme/data/CardsFunctionsItemComponent;Ljava/util/List;Ljava/util/List;)V", "getItemArea", "()Lcom/huawei/digitalpayment/common/theme/data/CardsFunctionsItemComponent;", "setItemArea", "(Lcom/huawei/digitalpayment/common/theme/data/CardsFunctionsItemComponent;)V", "getFunctions", "()Ljava/util/List;", "setFunctions", "(Ljava/util/List;)V", "getFilterFunctions", "setFilterFunctions", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CardsFunctionsComponent extends BaseComponent {
    private static int component1 = 0;
    private static int component3 = 1;
    private List<? extends FunctionResp> filterFunctions;
    private List<? extends FunctionResp> functions;
    private CardsFunctionsItemComponent itemArea;

    /* JADX WARN: Illegal instructions before constructor call */
    public CardsFunctionsComponent(CardsFunctionsItemComponent cardsFunctionsItemComponent, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 11;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            cardsFunctionsItemComponent = null;
        }
        if ((i & 2) != 0) {
            int i5 = 2 % 2;
            list = null;
        }
        if ((i & 4) != 0) {
            int i6 = component1 + 75;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            list2 = null;
        }
        this(cardsFunctionsItemComponent, list, list2);
    }

    public final CardsFunctionsItemComponent getItemArea() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        CardsFunctionsItemComponent cardsFunctionsItemComponent = this.itemArea;
        int i4 = i2 + 119;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
        return cardsFunctionsItemComponent;
    }

    public final void setItemArea(CardsFunctionsItemComponent cardsFunctionsItemComponent) {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.itemArea = cardsFunctionsItemComponent;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 91;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final List<FunctionResp> getFunctions() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.functions;
        }
        throw null;
    }

    public final void setFunctions(List<? extends FunctionResp> list) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.functions = list;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<FunctionResp> getFilterFunctions() {
        int i = 2 % 2;
        int i2 = component3 + 35;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.filterFunctions;
        }
        throw null;
    }

    public final void setFilterFunctions(List<? extends FunctionResp> list) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.filterFunctions = list;
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
    }

    public CardsFunctionsComponent(CardsFunctionsItemComponent cardsFunctionsItemComponent, List<? extends FunctionResp> list, List<? extends FunctionResp> list2) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.itemArea = cardsFunctionsItemComponent;
        this.functions = list;
        this.filterFunctions = list2;
    }

    public CardsFunctionsComponent() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CardsFunctionsComponent copy$default(CardsFunctionsComponent cardsFunctionsComponent, CardsFunctionsItemComponent cardsFunctionsItemComponent, List list, List list2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 87;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            cardsFunctionsItemComponent = cardsFunctionsComponent.itemArea;
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 71;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                List<? extends FunctionResp> list3 = cardsFunctionsComponent.functions;
                throw null;
            }
            list = cardsFunctionsComponent.functions;
        }
        if ((i & 4) != 0) {
            list2 = cardsFunctionsComponent.filterFunctions;
        }
        return cardsFunctionsComponent.copy(cardsFunctionsItemComponent, list, list2);
    }

    public final CardsFunctionsItemComponent component1() {
        int i = 2 % 2;
        int i2 = component1 + 107;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.itemArea;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<FunctionResp> component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 41;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List list = this.functions;
        int i4 = i2 + 27;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<FunctionResp> component3() {
        List list;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 95 / 0;
            list = this.filterFunctions;
        } else {
            list = this.filterFunctions;
        }
        int i5 = i2 + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final CardsFunctionsComponent copy(CardsFunctionsItemComponent itemArea, List<? extends FunctionResp> functions, List<? extends FunctionResp> filterFunctions) {
        int i = 2 % 2;
        CardsFunctionsComponent cardsFunctionsComponent = new CardsFunctionsComponent(itemArea, functions, filterFunctions);
        int i2 = component1 + 9;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return cardsFunctionsComponent;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 75;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardsFunctionsComponent)) {
            return false;
        }
        CardsFunctionsComponent cardsFunctionsComponent = (CardsFunctionsComponent) other;
        if (!Intrinsics.areEqual(this.itemArea, cardsFunctionsComponent.itemArea)) {
            int i3 = component3 + 125;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.functions, cardsFunctionsComponent.functions)) {
            return false;
        }
        if (Intrinsics.areEqual(this.filterFunctions, cardsFunctionsComponent.filterFunctions)) {
            return true;
        }
        int i5 = component1 + 63;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        CardsFunctionsItemComponent cardsFunctionsItemComponent = this.itemArea;
        int iHashCode2 = cardsFunctionsItemComponent == null ? 0 : cardsFunctionsItemComponent.hashCode();
        List<? extends FunctionResp> list = this.functions;
        if (list == null) {
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
            int i4 = component1 + 65;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        List<? extends FunctionResp> list2 = this.filterFunctions;
        return (((iHashCode2 * 31) + iHashCode) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CardsFunctionsComponent(itemArea=" + this.itemArea + ", functions=" + this.functions + ", filterFunctions=" + this.filterFunctions + ")";
        int i2 = component3 + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
