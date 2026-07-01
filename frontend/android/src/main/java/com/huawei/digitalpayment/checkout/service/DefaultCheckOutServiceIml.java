package com.huawei.digitalpayment.checkout.service;

public class DefaultCheckOutServiceIml implements CheckOutService {
    private static int component3 = 1;
    private static int copydefault;

    @Override
    public void setCurrentPayWay(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 73;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
