package com.huawei.digitalpayment.consumer.base.database.daos;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.base.database.entities.AllowedMiniApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH§@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u0010\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH§@¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0012\u001a\u00020\bH§@¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\nH§@¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/daos/AllowedMiniAppsDao;", "", "getMiniApp", "Lcom/huawei/digitalpayment/consumer/base/database/entities/AllowedMiniApp;", GriverCacheDao.COLUMN_CACHE_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertAllMiniApps", "", "lsMiniApps", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMiniApp", "miniApp", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/AllowedMiniApp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMiniApp", "updateAllMiniApps", "deleteMiniApp", "deleteAllMiniApps", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMiniApps", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AllowedMiniAppsDao {
    Object deleteAllMiniApps(Continuation<? super Unit> continuation);

    Object deleteMiniApp(AllowedMiniApp allowedMiniApp, Continuation<? super Unit> continuation);

    Object getAllMiniApps(Continuation<? super List<AllowedMiniApp>> continuation);

    Object getMiniApp(String str, Continuation<? super AllowedMiniApp> continuation);

    Object insertAllMiniApps(List<AllowedMiniApp> list, Continuation<? super Unit> continuation);

    Object insertMiniApp(AllowedMiniApp allowedMiniApp, Continuation<? super Unit> continuation);

    Object updateAllMiniApps(List<AllowedMiniApp> list, Continuation<? super Unit> continuation);

    Object updateMiniApp(AllowedMiniApp allowedMiniApp, Continuation<? super Unit> continuation);
}
