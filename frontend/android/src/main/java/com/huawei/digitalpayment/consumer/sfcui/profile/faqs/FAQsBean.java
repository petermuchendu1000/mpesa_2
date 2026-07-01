package com.huawei.digitalpayment.consumer.sfcui.profile.faqs;

import com.alibaba.griver.api.constants.GriverEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/faqs/FAQsBean;", "", "title", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", GriverEvents.EVENT_SET_TITLE, "(Ljava/lang/String;)V", "getDescription", "setDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FAQsBean {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copy = 1;
    private String component3;
    private String copydefault;

    public FAQsBean(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component3 = str;
        this.copydefault = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FAQsBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState;
            int i3 = i2 + 37;
            copy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 9;
            copy = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = "";
        }
        this(str, str2);
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 87;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setTitle(String str) {
        int i = 2 % 2;
        int i2 = copy + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.component3 = str;
        int i4 = copy + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 111;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setDescription(String str) {
        int i = 2 % 2;
        int i2 = copy + 55;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            int i3 = 50 / 0;
        }
    }

    static {
        int i = 1 + 83;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 53 / 0;
        }
    }

    public static FAQsBean copy$default(FAQsBean fAQsBean, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 37;
        int i4 = i3 % 128;
        copy = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = fAQsBean.component3;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 117;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str2 = fAQsBean.copydefault;
            if (i6 != 0) {
                int i7 = 98 / 0;
            }
        }
        FAQsBean fAQsBeanCopy = fAQsBean.copy(str, str2);
        int i8 = ShareDataUIState + 71;
        copy = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 2 / 0;
        }
        return fAQsBeanCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 85;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 35;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 35;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FAQsBean copy(String title, String description) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(title, "");
        Intrinsics.checkNotNullParameter(description, "");
        FAQsBean fAQsBean = new FAQsBean(title, description);
        int i2 = ShareDataUIState + 83;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
        return fAQsBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copy + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof FAQsBean)) {
            int i4 = i3 + 75;
            copy = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.component3, ((FAQsBean) other).component3)) {
            int i5 = ShareDataUIState + 77;
            copy = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, r6.copydefault)) {
            return false;
        }
        int i7 = ShareDataUIState + 107;
        copy = i7 % 128;
        int i8 = i7 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copy + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.component3.hashCode();
        return i3 != 0 ? (iHashCode % 13) / this.copydefault.hashCode() : (iHashCode * 31) + this.copydefault.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FAQsBean(title=" + this.component3 + ", description=" + this.copydefault + ")";
        int i2 = copy + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
