package com.huawei.digitalpayment.consumer.home.ui.viewmodel;

import com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.CounterUnits;
import com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.CounterType;
import com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.UsageConsumptionDetailsUIModel;
import com.huawei.hms.common.util.Logger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u000e\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\u0005H\u0002\u001a\u000e\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\u0005H\u0002¨\u0006\n"}, d2 = {"toUsageConsumptionDetailsUIModel", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/UsageConsumptionDetailsUIModel;", "Lcom/huawei/digitalpayment/consumer/base/database/entities/GsmBalancesCacheEntity;", "toGsmBalancesCacheEntity", "msisdn", "", "toCounterType", "Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/model/CounterType;", "toCounterUnits", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/CounterUnits;", "ConsumerHomeUi_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GsmBalancesCacheMappersKt {
    private static int component3 = 1;
    private static int copydefault;

    public static final UsageConsumptionDetailsUIModel toUsageConsumptionDetailsUIModel(GsmBalancesCacheEntity gsmBalancesCacheEntity) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(gsmBalancesCacheEntity, "");
        UsageConsumptionDetailsUIModel usageConsumptionDetailsUIModel = new UsageConsumptionDetailsUIModel(gsmBalancesCacheEntity.getDisplayName(), gsmBalancesCacheEntity.getDisplayOrder(), gsmBalancesCacheEntity.getRemaining(), gsmBalancesCacheEntity.getCumulative(), null, ShareDataUIState(gsmBalancesCacheEntity.getType()), component2(gsmBalancesCacheEntity.getUnits()), null, 144, null);
        int i2 = component3 + 121;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return usageConsumptionDetailsUIModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final GsmBalancesCacheEntity toGsmBalancesCacheEntity(UsageConsumptionDetailsUIModel usageConsumptionDetailsUIModel, String str) {
        String strName;
        String str2;
        int i = 2 % 2;
        String str3 = "";
        Intrinsics.checkNotNullParameter(usageConsumptionDetailsUIModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        CounterType type = usageConsumptionDetailsUIModel.getType();
        String strName2 = type != null ? type.name() : null;
        if (strName2 == null) {
            int i2 = component3 + 29;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        } else {
            str3 = strName2;
        }
        String str4 = str + Logger.f2811c + str3;
        String displayName = usageConsumptionDetailsUIModel.getDisplayName();
        Integer displayOrder = usageConsumptionDetailsUIModel.getDisplayOrder();
        Float remaining = usageConsumptionDetailsUIModel.getRemaining();
        String cumulative = usageConsumptionDetailsUIModel.getCumulative();
        CounterType type2 = usageConsumptionDetailsUIModel.getType();
        if (type2 != null) {
            int i4 = component3 + 105;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            strName = type2.name();
        } else {
            strName = null;
        }
        CounterUnits units = usageConsumptionDetailsUIModel.getUnits();
        if (units != null) {
            int i6 = component3 + 83;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            String strName3 = units.name();
            int i8 = component3 + 11;
            copydefault = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 / 2;
            }
            str2 = strName3;
        } else {
            str2 = null;
        }
        return new GsmBalancesCacheEntity(str4, str, displayName, displayOrder, remaining, cumulative, strName, str2, System.currentTimeMillis());
    }

    private static final CounterType ShareDataUIState(String str) {
        Object objM13069constructorimpl;
        int i = 2 % 2;
        int i2 = component3 + 103;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String string = null;
        if (str != null) {
            int i5 = i3 + 7;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                StringsKt.trim(str).toString();
                string.hashCode();
                throw null;
            }
            string = StringsKt.trim(str).toString();
        }
        if (string == null) {
            int i6 = component3 + 93;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            string = "";
        }
        if (string.length() == 0) {
            return CounterType.UNDEFINED;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM13069constructorimpl = Result.m13069constructorimpl(CounterType.valueOf(string));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM13069constructorimpl = Result.m13069constructorimpl(ResultKt.createFailure(th));
        }
        CounterType counterType = CounterType.UNDEFINED;
        if (Result.m13075isFailureimpl(objM13069constructorimpl)) {
            objM13069constructorimpl = counterType;
        }
        return (CounterType) objM13069constructorimpl;
    }

    private static final CounterUnits component2(String str) {
        Object objM13069constructorimpl;
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String string = str != null ? StringsKt.trim(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return CounterUnits.UNDEFINED;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM13069constructorimpl = Result.m13069constructorimpl(CounterUnits.valueOf(string));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM13069constructorimpl = Result.m13069constructorimpl(ResultKt.createFailure(th));
        }
        CounterUnits counterUnits = CounterUnits.UNDEFINED;
        if (Result.m13075isFailureimpl(objM13069constructorimpl)) {
            int i3 = copydefault + 53;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            objM13069constructorimpl = counterUnits;
        }
        return (CounterUnits) objM13069constructorimpl;
    }
}
