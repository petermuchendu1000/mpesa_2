package com.huawei.digitalpayment.common.theme.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/TabGroupItemComponent;", "Lcom/huawei/digitalpayment/common/theme/data/GroupComponent;", "tabIcon", "", "tabText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTabIcon", "()Ljava/lang/String;", "setTabIcon", "(Ljava/lang/String;)V", "getTabText", "setTabText", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class TabGroupItemComponent extends GroupComponent {
    private static int component2 = 0;
    private static int component3 = 1;
    private String tabIcon;
    private String tabText;

    /* JADX WARN: Illegal instructions before constructor call */
    public TabGroupItemComponent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i & 1) != 0) {
            int i2 = component3 + 55;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = component3 + 113;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
            str2 = null;
        }
        this(str, str2);
    }

    public final String getTabIcon() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tabIcon;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTabIcon(String str) {
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.tabIcon = str;
        if (i4 == 0) {
            int i5 = 45 / 0;
        }
        int i6 = i3 + 49;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getTabText() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.tabText;
        int i4 = i2 + 69;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setTabText(String str) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.tabText = str;
        int i5 = i2 + 123;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public TabGroupItemComponent(String str, String str2) {
        super(null, null, null, null, 15, null);
        this.tabIcon = str;
        this.tabText = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TabGroupItemComponent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
