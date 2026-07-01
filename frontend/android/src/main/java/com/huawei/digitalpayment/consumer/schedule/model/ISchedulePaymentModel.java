package com.huawei.digitalpayment.consumer.schedule.model;

import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.schedule.model.local.BillerTypeInfo;
import com.huawei.digitalpayment.consumer.schedule.model.local.LocalScheduleModel;
import com.huawei.digitalpayment.consumer.schedule.model.local.SchedulePaymentType;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000bH¦@¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H¦@¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H¦@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\u0006\u0010\n\u001a\u00020\u0019H¦@¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/schedule/model/ISchedulePaymentModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "getDynamicsElements", "", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "schedulePaymentType", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/SchedulePaymentType;", "(Lcom/huawei/digitalpayment/consumer/schedule/model/local/SchedulePaymentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSchedule", "Lcom/huawei/http/BaseResp;", "params", "", "", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSchedulePaymentTypes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "querySchedule", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/LocalScheduleModel;", "cancelSchedule", "initiatorPin", "scheduleModel", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/schedule/model/local/LocalScheduleModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryBillerConfig", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/BillerTypeInfo;", "Lcom/huawei/http/BaseRequestParams;", "(Lcom/huawei/http/BaseRequestParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerScheduleModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ISchedulePaymentModel extends BaseModel {
    Object cancelSchedule(String str, LocalScheduleModel localScheduleModel, Continuation<? super BaseResp> continuation);

    Object createSchedule(Map<String, ? extends Object> map, Continuation<? super BaseResp> continuation);

    Object getDynamicsElements(SchedulePaymentType schedulePaymentType, Continuation<? super List<DynamicsElement>> continuation);

    Object getSchedulePaymentTypes(Continuation<? super List<SchedulePaymentType>> continuation);

    Object queryBillerConfig(BaseRequestParams baseRequestParams, Continuation<? super List<BillerTypeInfo>> continuation);

    Object querySchedule(Continuation<? super List<LocalScheduleModel>> continuation);
}
