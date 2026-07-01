package com.huawei.common.widget.tab;

import com.alibaba.griver.api.constants.GriverEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/huawei/common/widget/tab/CommonTabItem;", "", "title", "", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", GriverEvents.EVENT_SET_TITLE, "(Ljava/lang/String;)V", "getIcon", "setIcon", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonTabItem {
    private String component1;
    private String component3;

    public CommonTabItem(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = str;
        this.component1 = str2;
    }

    public CommonTabItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getTitle() {
        return this.component3;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = str;
    }

    public final String getIcon() {
        return this.component1;
    }

    public final void setIcon(String str) {
        this.component1 = str;
    }

    public static CommonTabItem copy$default(CommonTabItem commonTabItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonTabItem.component3;
        }
        if ((i & 2) != 0) {
            str2 = commonTabItem.component1;
        }
        return commonTabItem.copy(str, str2);
    }

    public final String getComponent3() {
        return this.component3;
    }

    public final String getComponent1() {
        return this.component1;
    }

    public final CommonTabItem copy(String title, String icon) {
        Intrinsics.checkNotNullParameter(title, "");
        return new CommonTabItem(title, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonTabItem)) {
            return false;
        }
        CommonTabItem commonTabItem = (CommonTabItem) other;
        return Intrinsics.areEqual(this.component3, commonTabItem.component3) && Intrinsics.areEqual(this.component1, commonTabItem.component1);
    }

    public int hashCode() {
        int iHashCode = this.component3.hashCode();
        String str = this.component1;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CommonTabItem(title=" + this.component3 + ", icon=" + this.component1 + ")";
    }
}
