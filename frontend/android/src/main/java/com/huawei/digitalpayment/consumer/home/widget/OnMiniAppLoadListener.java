package com.huawei.digitalpayment.consumer.home.widget;

import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import java.util.List;

public interface OnMiniAppLoadListener {
    void onDataBack(List<LocalHomeFunction> list);
}
