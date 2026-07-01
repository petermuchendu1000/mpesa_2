package com.huawei.digitalpayment.consumer.sfcui.local;

import com.blankj.utilcode.util.GsonUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorChargeBand;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/local/CostCalculatorLocalDataSource;", "", "<init>", "()V", "saveCharges", "", "charges", "", "Lcom/huawei/digitalpayment/consumer/sfcui/api/model/CostCalculatorChargeBand;", "getCharges", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorLocalDataSource {
    public static final int $stable = 0;

    public static final Companion INSTANCE = new Companion(null);
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static final String component3 = "cost_calculator_charges";
    private static int copydefault;

    @Inject
    public CostCalculatorLocalDataSource() {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/local/CostCalculatorLocalDataSource$Companion;", "", "<init>", "()V", "KEY_COST_CALCULATOR_CHARGES", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void saveCharges(List<CostCalculatorChargeBand> charges) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(charges, "");
        SPUtils.getInstance().put(component3, GsonUtils.toJson(charges));
        int i4 = ShareDataUIState + 55;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
    }

    public final List<CostCalculatorChargeBand> getCharges() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance().getString(component3, "");
        Intrinsics.checkNotNull(string);
        if (string.length() != 0) {
            try {
                List<CostCalculatorChargeBand> list = (List) GsonUtils.fromJson(string, new TypeToken<List<? extends CostCalculatorChargeBand>>() {
                }.getType());
                if (list != null) {
                    return list;
                }
                List<CostCalculatorChargeBand> listEmptyList = CollectionsKt.emptyList();
                int i4 = component1 + 33;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return listEmptyList;
                }
                int i5 = 3 % 3;
                return listEmptyList;
            } catch (Exception unused) {
                return CollectionsKt.emptyList();
            }
        }
        int i6 = ShareDataUIState + 9;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return CollectionsKt.emptyList();
    }

    static {
        int i = component2 + 83;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
