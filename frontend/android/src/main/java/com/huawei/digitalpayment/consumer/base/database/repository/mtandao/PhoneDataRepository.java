package com.huawei.digitalpayment.consumer.base.database.repository.mtandao;

import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.PhoneDataDAO;
import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.PhoneData;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0086@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/PhoneDataRepository;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "phoneDataDAO", "Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/PhoneDataDAO;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/PhoneDataDAO;)V", "allphonedata", "", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/PhoneData;", "datasession", "", "insert", "", "phoneData", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/PhoneData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "delete", "deleteAllPhoneData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhoneDataRepository implements BaseModel {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final PhoneDataDAO component2;

    @Inject
    public PhoneDataRepository(PhoneDataDAO phoneDataDAO) {
        Intrinsics.checkNotNullParameter(phoneDataDAO, "");
        this.component2 = phoneDataDAO;
    }

    public final List<PhoneData> allphonedata(String datasession) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(datasession, "");
        List<PhoneData> allPhoneData = this.component2.getAllPhoneData(datasession);
        int i4 = copydefault + 53;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 55 / 0;
        }
        return allPhoneData;
    }

    public final Object insert(PhoneData phoneData, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objInsertPhoneData = this.component2.insertPhoneData(phoneData, continuation);
        if (objInsertPhoneData != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i2 = copydefault;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 9;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return objInsertPhoneData;
    }

    public final Object update(PhoneData phoneData, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.component2.updatePhoneData(phoneData, continuation);
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            obj.hashCode();
            throw null;
        }
        Object objUpdatePhoneData = this.component2.updatePhoneData(phoneData, continuation);
        if (objUpdatePhoneData != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i3 = component1 + 23;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return objUpdatePhoneData;
        }
        throw null;
    }

    public final void delete(String datasession) {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(datasession, "");
            this.component2.deletePhoneData(datasession);
        } else {
            Intrinsics.checkNotNullParameter(datasession, "");
            this.component2.deletePhoneData(datasession);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final Object deleteAllPhoneData(Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object objDeleteAllPhoneData = this.component2.deleteAllPhoneData(continuation);
        if (objDeleteAllPhoneData == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i4 = copydefault + 43;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 93 / 0;
            }
            return objDeleteAllPhoneData;
        }
        Unit unit = Unit.INSTANCE;
        int i6 = copydefault + 97;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
