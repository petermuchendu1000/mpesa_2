package com.huawei.digitalpayment.consumer.base.database.repository.mtandao;

import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.UserDataDAO;
import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.UserData;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

@Singleton
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\rJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/UserDataRepository;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "userDataDAO", "Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/UserDataDAO;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/UserDataDAO;)V", "getUserData", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/UserData;", "datasession", "", "insert", "", "userData", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/UserData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "delete", "deleteAllUserData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserDataRepository implements BaseModel {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final UserDataDAO component2;

    @Inject
    public UserDataRepository(UserDataDAO userDataDAO) {
        Intrinsics.checkNotNullParameter(userDataDAO, "");
        this.component2 = userDataDAO;
    }

    public final UserData getUserData(String datasession) {
        int i = 2 % 2;
        int i2 = component3 + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(datasession, "");
        UserData allUserData = this.component2.getAllUserData(datasession);
        int i4 = component3 + 17;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return allUserData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r4 = kotlin.Unit.INSTANCE;
        r5 = com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository.component3 + 115;
        com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository.copydefault = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r4 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insert(com.huawei.digitalpayment.consumer.base.database.entities.mtandao.UserData r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository.component3
            int r1 = r1 + 53
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository.copydefault = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1f
            com.huawei.digitalpayment.consumer.base.database.daos.mtandao.UserDataDAO r1 = r3.component2
            java.lang.Object r4 = r1.insertUserData(r4, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = 17
            int r1 = r1 / 0
            if (r4 != r5) goto L2c
            goto L2b
        L1f:
            com.huawei.digitalpayment.consumer.base.database.daos.mtandao.UserDataDAO r1 = r3.component2
            java.lang.Object r4 = r1.insertUserData(r4, r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L2c
        L2b:
            return r4
        L2c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            int r5 = com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository.component3
            int r5 = r5 + 115
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository.copydefault = r1
            int r5 = r5 % r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository.insert(com.huawei.digitalpayment.consumer.base.database.entities.mtandao.UserData, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object update(UserData userData, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = component3 + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object objUpdateUserData = this.component2.updateUserData(userData, continuation);
        if (objUpdateUserData == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objUpdateUserData;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = component3 + 21;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void delete(String datasession) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(datasession, "");
            this.component2.deleteUserData(datasession);
            int i3 = 82 / 0;
        } else {
            Intrinsics.checkNotNullParameter(datasession, "");
            this.component2.deleteUserData(datasession);
        }
        int i4 = component3 + 23;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final Object deleteAllUserData(Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = component3 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object objDeleteAllUserData = this.component2.deleteAllUserData(continuation);
        if (objDeleteAllUserData != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return Unit.INSTANCE;
        }
        int i4 = copydefault + 7;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return objDeleteAllUserData;
    }
}
