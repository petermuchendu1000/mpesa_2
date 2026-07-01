package com.huawei.digitalpayment.consumer.ootb;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static final SparseIntArray component2 = new SparseIntArray(0);
    private static int component3 = 1;
    private static int copydefault = 1;

    static {
        int i = component3 + 31;
        component1 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = 2 % 2;
        if (component2.get(i) <= 0) {
            return null;
        }
        int i3 = copydefault + 73;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        int i5 = copydefault + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 63;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i3 % 2;
        if (viewArr == null) {
            return null;
        }
        int i6 = i4 + 39;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        if (viewArr.length == 0 || component2.get(i) <= 0) {
            return null;
        }
        int i8 = copydefault + 23;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
        if (viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override
    public int getLayoutId(String str) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (str != null) {
            Integer num = ShareDataUIState.component2.get(str);
            if (num == null) {
                return 0;
            }
            return num.intValue();
        }
        int i5 = i2 + 5;
        int i6 = i5 % 128;
        ShareDataUIState = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 33;
        copydefault = i8 % 128;
        int i9 = i8 % 2;
        return 0;
    }

    @Override
    public String convertBrIdToString(int i) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = copydefault.component2.get(i);
        int i5 = ShareDataUIState + 29;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return str;
    }

    @Override
    public List<DataBinderMapper> collectDependencies() {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(59);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.huawei.arouter.DataBinderMapperImpl());
        arrayList.add(new com.huawei.biometric.DataBinderMapperImpl());
        arrayList.add(new com.huawei.common.DataBinderMapperImpl());
        arrayList.add(new com.huawei.customer.digitalpayment.checkout.DataBinderMapperImpl());
        arrayList.add(new com.huawei.customer.digitalpayment.scan.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.checkoutModule.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.checkoutUi.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.common.theme.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.baselib.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.baseui.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.basic.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.basicModule.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.developer.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.history.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.homeModule.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.homeui.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.login.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.loginModule.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.manageandviewdata.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.miniapps.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.nfcui.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.profile.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.profileui.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.push.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.push_ui.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.pushmessage.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.qrcode.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.qrcodeModule.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.remoteconfig.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.risk.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.riskui.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.schedule.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.scheduleui.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.service.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.sfc.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.sfc.global.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.sfcadjust.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.sfcfixeddata.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.sfcpochiwallet.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.sfcprofile.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.sfcqrcode.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.subsui.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.webview.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.webviewui.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.consumer.zuriui.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.customer.dynamics.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.datepicker.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.form.validator.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.mobileapp.report.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.pwa.DataBinderMapperImpl());
        arrayList.add(new com.huawei.digitalpayment.pwaui.DataBinderMapperImpl());
        arrayList.add(new com.huawei.history.DataBinderMapperImpl());
        arrayList.add(new com.huawei.http.DataBinderMapperImpl());
        arrayList.add(new com.huawei.image.DataBinderMapperImpl());
        arrayList.add(new com.huawei.mobileapp.resourcelib.DataBinderMapperImpl());
        arrayList.add(new com.huawei.payment.lib.image.DataBinderMapperImpl());
        arrayList.add(new com.huawei.payment.mvvm.DataBinderMapperImpl());
        arrayList.add(new com.safaricom.consumer.commons.DataBinderMapperImpl());
        int i2 = copydefault + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return arrayList;
    }

    static class copydefault {
        private static int ShareDataUIState = 1;
        static final SparseArray<String> component2;
        private static int component3;

        private copydefault() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(12);
            component2 = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "balance2IsVisible");
            sparseArray.put(2, "balanceDetails");
            sparseArray.put(3, "cardExpandState");
            sparseArray.put(4, "description");
            sparseArray.put(5, "hasSwitch");
            sparseArray.put(6, "icon");
            sparseArray.put(7, "isAmend");
            sparseArray.put(8, GriverMonitorConstants.KEY_IS_LOADING);
            sparseArray.put(9, "limit");
            sparseArray.put(10, "title");
            sparseArray.put(11, "transactionIsVisible");
            int i = component3 + 19;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }

    static class ShareDataUIState {
        private static int ShareDataUIState = 1;
        private static int component1;
        static final HashMap<String, Integer> component2 = new HashMap<>(0);

        private ShareDataUIState() {
        }

        static {
            int i = component1 + 55;
            ShareDataUIState = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
