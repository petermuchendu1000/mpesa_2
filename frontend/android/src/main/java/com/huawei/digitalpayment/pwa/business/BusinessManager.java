package com.huawei.digitalpayment.pwa.business;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.digitalpayment.pwa.aapay.AaPay;
import com.huawei.digitalpayment.pwa.h5pay.H5Pay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BusinessManager {
    private static int component1 = 1;
    private static int component3;
    private List<IBusiness> copydefault;

    public void init(Activity activity) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            this.copydefault.isEmpty();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.copydefault.isEmpty()) {
            this.copydefault.add(new Mandate(activity));
            this.copydefault.add(new MandatePay(activity));
            this.copydefault.add(new AaPay(activity));
            this.copydefault.add(new H5Pay(activity));
            this.copydefault.add(new OpenApp(activity));
            return;
        }
        Iterator<IBusiness> it = this.copydefault.iterator();
        int i3 = component1 + 89;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        while (!(!it.hasNext())) {
            int i5 = component3 + 119;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                it.next().init(activity);
                int i6 = 74 / 0;
            } else {
                it.next().init(activity);
            }
        }
    }

    public void parseUri(Uri uri) {
        int i = 2 % 2;
        if (uri == null || this.copydefault == null) {
            return;
        }
        String host = uri.getHost();
        int i2 = component1 + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        for (IBusiness iBusiness : this.copydefault) {
            if (TextUtils.equals(host, iBusiness.getBusinessName())) {
                int i4 = component3 + 29;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                iBusiness.parseUri(uri);
            }
        }
    }

    private BusinessManager() {
        this.copydefault = new ArrayList();
    }

    public static BusinessManager get() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return component2.component1();
        }
        component2.component1();
        throw null;
    }

    static class component2 {
        private static int ShareDataUIState = 1;
        private static int component1 = 0;
        private static int component2 = 1;
        private static final BusinessManager component3;
        private static int copydefault;

        component2() {
        }

        static {
            BusinessManagerIA businessManagerIA = null;
            component3 = new BusinessManager();
            int i = copydefault + 73;
            ShareDataUIState = i % 128;
            if (i % 2 != 0) {
                return;
            }
            businessManagerIA.hashCode();
            throw null;
        }

        static BusinessManager component1() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 3;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            BusinessManager businessManager = component3;
            int i5 = i2 + 97;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return businessManager;
        }
    }
}
