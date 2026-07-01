package com.huawei.digitalpayment.common.theme.data;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/CustomComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CustomComponent extends BaseComponent {
    private static int ShareDataUIState = 1;
    private static int component3;
    private String name;

    public CustomComponent() {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 97;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setName(String str) {
        int i = 2 % 2;
        int i2 = component3 + 103;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.name = str;
        int i5 = i3 + 55;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
