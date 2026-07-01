package com.huawei.digitalpayment.consumer.webview.model;

import dagger.internal.Factory;

public final class WebDispatcherModel_Factory implements Factory<WebDispatcherModel> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        WebDispatcherModel webDispatcherModel;
        int i = 2 % 2;
        int i2 = component1 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            webDispatcherModel = get();
            int i3 = 3 / 0;
        } else {
            webDispatcherModel = get();
        }
        int i4 = component1 + 117;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return webDispatcherModel;
    }

    @Override
    public WebDispatcherModel get() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        WebDispatcherModel webDispatcherModelNewInstance = newInstance();
        int i4 = copydefault + 47;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return webDispatcherModelNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static WebDispatcherModel_Factory create() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        WebDispatcherModel_Factory webDispatcherModel_Factory = ShareDataUIState.component2;
        if (i3 != 0) {
            return webDispatcherModel_Factory;
        }
        throw null;
    }

    public static WebDispatcherModel newInstance() {
        int i = 2 % 2;
        WebDispatcherModel webDispatcherModel = new WebDispatcherModel();
        int i2 = copydefault + 73;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return webDispatcherModel;
    }

    static final class ShareDataUIState {
        private static int ShareDataUIState = 1;
        static final WebDispatcherModel_Factory component2 = new WebDispatcherModel_Factory();
        private static int component3;

        private ShareDataUIState() {
        }

        static {
            int i = ShareDataUIState + 121;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
