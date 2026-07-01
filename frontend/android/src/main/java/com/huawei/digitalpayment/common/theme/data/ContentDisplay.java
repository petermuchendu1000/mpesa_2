package com.huawei.digitalpayment.common.theme.data;

import com.huawei.digitalpayment.consumer.baselib.util.sort.Order;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J>\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/ContentDisplay;", "Lcom/huawei/http/BaseResp;", "Lcom/huawei/digitalpayment/consumer/baselib/util/sort/Order;", "contentImage", "", "contentText", "contentExecute", "order", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getContentImage", "()Ljava/lang/String;", "getContentText", "getContentExecute", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSortOrder", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/common/theme/data/ContentDisplay;", "equals", "", "other", "", "hashCode", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContentDisplay extends BaseResp implements Order {
    private static int component1 = 1;
    private static int copydefault;
    private final String contentExecute;
    private final String contentImage;
    private final String contentText;
    private final Integer order;

    /* JADX WARN: Illegal instructions before constructor call */
    public ContentDisplay(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = copydefault + 37;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            str2 = null;
        }
        str3 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            int i4 = component1 + 13;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 28 / 0;
            }
            int i6 = 2 % 2;
            num = null;
        }
        this(str, str2, str3, num);
    }

    public final String getContentImage() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.contentImage;
        int i4 = i3 + 65;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getContentText() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.contentText;
            int i4 = 94 / 0;
        } else {
            str = this.contentText;
        }
        int i5 = i3 + 95;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getContentExecute() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.contentExecute;
        int i4 = i2 + 25;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer getOrder() {
        Integer num;
        int i = 2 % 2;
        int i2 = copydefault + 105;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            num = this.order;
            int i4 = 43 / 0;
        } else {
            num = this.order;
        }
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public ContentDisplay(String str, String str2, String str3, Integer num) {
        this.contentImage = str;
        this.contentText = str2;
        this.contentExecute = str3;
        this.order = num;
    }

    @Override
    public Integer getSortOrder() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.order;
        int i5 = i2 + 13;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ContentDisplay() {
        this(null, null, null, null, 15, null);
    }

    public static ContentDisplay copy$default(ContentDisplay contentDisplay, String str, String str2, String str3, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = contentDisplay.contentImage;
        }
        if ((i & 2) != 0) {
            str2 = contentDisplay.contentText;
        }
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i3 = component1 + 93;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                String str4 = contentDisplay.contentExecute;
                obj2.hashCode();
                throw null;
            }
            str3 = contentDisplay.contentExecute;
        }
        if ((i & 8) != 0) {
            num = contentDisplay.order;
        }
        ContentDisplay contentDisplayCopy = contentDisplay.copy(str, str2, str3, num);
        int i4 = copydefault + 57;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return contentDisplayCopy;
        }
        obj2.hashCode();
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.contentImage;
        int i5 = i2 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.contentText;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.contentExecute;
        int i5 = i3 + 83;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.order;
        int i5 = i2 + 15;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final ContentDisplay copy(String contentImage, String contentText, String contentExecute, Integer order) {
        int i = 2 % 2;
        ContentDisplay contentDisplay = new ContentDisplay(contentImage, contentText, contentExecute, order);
        int i2 = copydefault + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return contentDisplay;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentDisplay)) {
            return false;
        }
        ContentDisplay contentDisplay = (ContentDisplay) other;
        if (!Intrinsics.areEqual(this.contentImage, contentDisplay.contentImage)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.contentText, contentDisplay.contentText)) {
            int i4 = copydefault + 25;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.contentExecute, contentDisplay.contentExecute)) {
            return false;
        }
        if (Intrinsics.areEqual(this.order, contentDisplay.order)) {
            return true;
        }
        int i6 = copydefault + 11;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.contentImage;
        if (str == null) {
            int i2 = component1 + 113;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = copydefault + 67;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
        String str2 = this.contentText;
        if (str2 == null) {
            int i6 = copydefault + 111;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.contentExecute;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.order;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ContentDisplay(contentImage=" + this.contentImage + ", contentText=" + this.contentText + ", contentExecute=" + this.contentExecute + ", order=" + this.order + ")";
        int i2 = copydefault + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
