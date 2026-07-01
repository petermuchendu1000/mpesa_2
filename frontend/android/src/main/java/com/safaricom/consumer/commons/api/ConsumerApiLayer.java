package com.safaricom.consumer.commons.api;

import com.safaricom.consumer.commons.bonga.BongaPointsInfoPayloadDto;
import com.safaricom.consumer.commons.resource.ErrorType;
import com.safaricom.consumer.commons.resource.Resource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u0002H\u00060\nH\u0086@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/safaricom/consumer/commons/api/ConsumerApiLayer;", "", "<init>", "()V", "getBongaPointsInfo", "Lcom/safaricom/consumer/commons/resource/Resource;", "T", "msisdn", "", "transformation", "Lkotlin/Function1;", "Lcom/safaricom/consumer/commons/bonga/BongaPointsInfoPayloadDto$BongaPointsInfoDto;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcCommons_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConsumerApiLayer {
    @Inject
    public ConsumerApiLayer() {
    }

    public final <T> Object getBongaPointsInfo(String str, Function1<? super BongaPointsInfoPayloadDto.BongaPointsInfoDto, ? extends T> function1, Continuation<? super Resource<? extends T>> continuation) {
        return Resource.INSTANCE.error(ErrorType.Storage.INSTANCE);
    }
}
