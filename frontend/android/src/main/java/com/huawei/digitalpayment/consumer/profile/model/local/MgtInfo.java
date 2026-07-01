package com.huawei.digitalpayment.consumer.profile.model.local;

public class MgtInfo {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private String name;

    public String getName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 99;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 121;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void setName(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.name = str;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
    }
}
