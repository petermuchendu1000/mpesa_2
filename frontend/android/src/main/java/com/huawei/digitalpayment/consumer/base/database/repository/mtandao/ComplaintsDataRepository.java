package com.huawei.digitalpayment.consumer.base.database.repository.mtandao;

import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.ComplaintsDataDAO;
import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.ComplaintsData;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\rJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/ComplaintsDataRepository;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "complaintsDataDAO", "Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/ComplaintsDataDAO;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/ComplaintsDataDAO;)V", "allcomplaintsdata", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/ComplaintsData;", "datasession", "", "insert", "", "complaintsData", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/ComplaintsData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "delete", "deleteAllComplaintsData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComplaintsDataRepository implements BaseModel {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final ComplaintsDataDAO component2;

    @Inject
    public ComplaintsDataRepository(ComplaintsDataDAO complaintsDataDAO) {
        Intrinsics.checkNotNullParameter(complaintsDataDAO, "");
        this.component2 = complaintsDataDAO;
    }

    public final ComplaintsData allcomplaintsdata(String datasession) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(datasession, "");
        ComplaintsData allComplaintsData = this.component2.getAllComplaintsData(datasession);
        int i4 = ShareDataUIState + 21;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return allComplaintsData;
    }

    public final Object insert(ComplaintsData complaintsData, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            this.component2.insertComplaintsData(complaintsData, continuation);
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            throw null;
        }
        Object objInsertComplaintsData = this.component2.insertComplaintsData(complaintsData, continuation);
        if (objInsertComplaintsData != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i3 = component1 + 35;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return objInsertComplaintsData;
    }

    public final Object update(ComplaintsData complaintsData, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object objUpdateComplaintsData = this.component2.updateComplaintsData(complaintsData, continuation);
        if (objUpdateComplaintsData != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i4 = ShareDataUIState + 13;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return objUpdateComplaintsData;
        }
        throw null;
    }

    public final void delete(String datasession) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(datasession, "");
        this.component2.deleteComplaintsData(datasession);
        int i4 = ShareDataUIState + 99;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final Object deleteAllComplaintsData(Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object objDeleteAllComplaintsData = this.component2.deleteAllComplaintsData(continuation);
        if (objDeleteAllComplaintsData == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i4 = ShareDataUIState + 25;
            int i5 = i4 % 128;
            component1 = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 43;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return objDeleteAllComplaintsData;
        }
        Unit unit = Unit.INSTANCE;
        int i9 = component1 + 79;
        ShareDataUIState = i9 % 128;
        if (i9 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
