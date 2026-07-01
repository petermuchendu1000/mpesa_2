package com.huawei.digitalpayment.consumer.base.reporting;

import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b0\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/reporting/MarketingEventPayload;", "Landroid/os/Parcelable;", "eventName", "", "getEventName", "()Ljava/lang/String;", "toAttributes", "", "", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface MarketingEventPayload extends Parcelable {
    String getEventName();

    List<Map<String, Object>> toAttributes();
}
