package com.safaricom.mtandaoapp.database.dao;

import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.SpeedTestsHistoryData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u000e\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000bH'¨\u0006\r"}, d2 = {"Lcom/safaricom/mtandaoapp/database/dao/SpeedTestsHistoryDataDAO;", "", "insertSpeedTestsHistoryData", "", "speedTestsHistoryData", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/SpeedTestsHistoryData;", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/SpeedTestsHistoryData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSpeedTestsHistoryData", "deleteAllSpeedTestsHistoryData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllSpeedTestsHistoryData", "Lkotlinx/coroutines/flow/Flow;", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SpeedTestsHistoryDataDAO {
    Object deleteAllSpeedTestsHistoryData(Continuation<? super Unit> continuation);

    Flow<List<SpeedTestsHistoryData>> getAllSpeedTestsHistoryData();

    Object insertSpeedTestsHistoryData(SpeedTestsHistoryData speedTestsHistoryData, Continuation<? super Unit> continuation);

    Object updateSpeedTestsHistoryData(SpeedTestsHistoryData speedTestsHistoryData, Continuation<? super Unit> continuation);
}
