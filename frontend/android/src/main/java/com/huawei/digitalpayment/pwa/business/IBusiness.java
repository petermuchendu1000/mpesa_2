package com.huawei.digitalpayment.pwa.business;

import android.app.Activity;
import android.net.Uri;

public interface IBusiness {
    String getBusinessName();

    void init(Activity activity);

    void parseUri(Uri uri);
}
