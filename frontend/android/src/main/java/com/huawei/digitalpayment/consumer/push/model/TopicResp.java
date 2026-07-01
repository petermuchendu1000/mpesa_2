package com.huawei.digitalpayment.consumer.push.model;

import com.huawei.http.BaseResp;
import java.util.List;

public class TopicResp extends BaseResp {
    private static int component2 = 0;
    private static int component3 = 1;
    private List<String> topics;

    public List<String> getTopics() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<String> list = this.topics;
        int i4 = i2 + 23;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return list;
    }

    public void setTopics(List<String> list) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.topics = list;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
