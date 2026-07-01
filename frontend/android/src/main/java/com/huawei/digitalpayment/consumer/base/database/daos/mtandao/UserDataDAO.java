package com.huawei.digitalpayment.consumer.base.database.daos.mtandao;

import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.UserData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH'J\u000e\u0010\u000b\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH'¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/UserDataDAO;", "", "insertUserData", "", "userData", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/UserData;", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/UserData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserData", "deleteUserData", "datasession", "", "deleteAllUserData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllUserData", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UserDataDAO {
    Object deleteAllUserData(Continuation<? super Unit> continuation);

    void deleteUserData(String datasession);

    UserData getAllUserData(String datasession);

    Object insertUserData(UserData userData, Continuation<? super Unit> continuation);

    Object updateUserData(UserData userData, Continuation<? super Unit> continuation);
}
