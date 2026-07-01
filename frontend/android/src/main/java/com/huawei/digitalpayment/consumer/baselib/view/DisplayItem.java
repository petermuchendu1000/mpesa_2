package com.huawei.digitalpayment.consumer.baselib.view;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\fB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/view/DisplayItem;", "Lcom/huawei/http/BaseResp;", "key", "", "label", "Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;", "value", "showLine", "", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;Z)V", "(Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;)V", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;)V", "(Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;Z)V", "getKey", "()Ljava/lang/String;", "getLabel", "()Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;", "setLabel", "(Lcom/huawei/digitalpayment/consumer/baselib/view/RichText;)V", "getValue", "setValue", "getShowLine", "()Z", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DisplayItem extends BaseResp {
    private static int component1 = 1;
    private static int copydefault;
    private final String key;
    private RichText label;
    private final boolean showLine;
    private RichText value;

    /* JADX WARN: Illegal instructions before constructor call */
    public DisplayItem(String str, RichText richText, RichText richText2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 75;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 28 / 0;
            }
            str = "";
        }
        if ((i & 8) != 0) {
            int i4 = copydefault + 15;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z = false;
        }
        this(str, richText, richText2, z);
    }

    public final String getKey() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.key;
        int i5 = i2 + 59;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final RichText getLabel() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        RichText richText = this.label;
        int i5 = i2 + 25;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return richText;
        }
        throw null;
    }

    public final void setLabel(RichText richText) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(richText, "");
        this.label = richText;
        int i4 = copydefault + 59;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final RichText getValue() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 119;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        RichText richText = this.value;
        int i5 = i2 + 1;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 37 / 0;
        }
        return richText;
    }

    public final void setValue(RichText richText) {
        int i = 2 % 2;
        int i2 = component1 + 15;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(richText, "");
            this.value = richText;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(richText, "");
        this.value = richText;
        int i3 = copydefault + 57;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
    }

    public final boolean getShowLine() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.showLine;
        int i5 = i3 + 23;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public DisplayItem(String str, RichText richText, RichText richText2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(richText, "");
        Intrinsics.checkNotNullParameter(richText2, "");
        this.key = str;
        this.label = richText;
        this.value = richText2;
        this.showLine = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisplayItem(RichText richText, RichText richText2) {
        this(richText, richText2, false);
        Intrinsics.checkNotNullParameter(richText, "");
        Intrinsics.checkNotNullParameter(richText2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisplayItem(String str, RichText richText, RichText richText2) {
        this(str, richText, richText2, false);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(richText, "");
        Intrinsics.checkNotNullParameter(richText2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisplayItem(RichText richText, RichText richText2, boolean z) {
        this("", richText, richText2, z);
        Intrinsics.checkNotNullParameter(richText, "");
        Intrinsics.checkNotNullParameter(richText2, "");
    }
}
