package com.huawei.digitalpayment.common.theme.data;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/ThemeChangeSkinResp;", "Lcom/huawei/http/BaseResp;", "jsonConfig", "", "<init>", "(Ljava/lang/String;)V", "getJsonConfig", "()Ljava/lang/String;", "setJsonConfig", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ThemeChangeSkinResp extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private String jsonConfig;

    /* JADX WARN: Illegal instructions before constructor call */
    public ThemeChangeSkinResp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component3 + 107;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 62 / 0;
            }
            int i4 = 2 % 2;
            str = null;
        }
        this(str);
    }

    public final String getJsonConfig() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.jsonConfig;
        int i4 = i2 + 63;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setJsonConfig(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Object obj = null;
        this.jsonConfig = str;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 61;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public ThemeChangeSkinResp(String str) {
        this.jsonConfig = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThemeChangeSkinResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
