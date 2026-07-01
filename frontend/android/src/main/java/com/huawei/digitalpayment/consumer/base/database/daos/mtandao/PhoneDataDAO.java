package com.huawei.digitalpayment.consumer.base.database.daos.mtandao;

import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.PhoneData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH'J\u000e\u0010\u000b\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\t\u001a\u00020\nH'¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/PhoneDataDAO;", "", "insertPhoneData", "", "phoneData", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/PhoneData;", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/PhoneData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePhoneData", "deletePhoneData", "datasession", "", "deleteAllPhoneData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPhoneData", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PhoneDataDAO {
    Object deleteAllPhoneData(Continuation<? super Unit> continuation);

    void deletePhoneData(String datasession);

    List<PhoneData> getAllPhoneData(String datasession);

    Object insertPhoneData(PhoneData phoneData, Continuation<? super Unit> continuation);

    Object updatePhoneData(PhoneData phoneData, Continuation<? super Unit> continuation);
}
