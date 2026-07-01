package com.huawei.digitalpayment.common.theme.data;

import com.huawei.common.util.NumberUtils;
import com.huawei.common.widget.text.MarqueeView;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\n\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/TipsResp;", "Lcom/huawei/http/BaseResp;", "Lcom/huawei/common/widget/text/MarqueeView$IMarqueeItem;", "bulletin", "", "showSeconds", "icon", KeysConstants.KEY_EXECUTE, "order", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBulletin", "()Ljava/lang/String;", "setBulletin", "(Ljava/lang/String;)V", "getShowSeconds", "setShowSeconds", "getIcon", "setIcon", "getExecute", "setExecute", "getOrder", "()Ljava/lang/Integer;", "setOrder", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "marqueeMessage", "marqueeIcon", "getFlipInterval", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class TipsResp extends BaseResp implements MarqueeView.IMarqueeItem {
    private static int component1 = 1;
    private static int component3;
    private String bulletin;
    private String execute;
    private String icon;
    private Integer order;
    private String showSeconds;

    @Override
    public CharSequence marqueeMessage() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String strMarqueeMessage = marqueeMessage();
        int i4 = component1 + 43;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return strMarqueeMessage;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TipsResp(String str, String str2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        String str7;
        Integer num2 = null;
        if ((i & 1) != 0) {
            int i2 = component3 + 99;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i4 = component3 + 91;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = 2 % 2;
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            int i7 = component1 + 83;
            component3 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 33 / 0;
            }
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i & 16) != 0) {
            int i9 = component1 + 1;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 % 3;
            } else {
                int i11 = 2 % 2;
            }
        } else {
            num2 = num;
        }
        this(str, str5, str6, str7, num2);
    }

    public final String getBulletin() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 25;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bulletin;
        int i5 = i2 + 59;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setBulletin(String str) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.bulletin = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getShowSeconds() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.showSeconds;
            int i4 = 28 / 0;
        } else {
            str = this.showSeconds;
        }
        int i5 = i2 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setShowSeconds(String str) {
        int i = 2 % 2;
        int i2 = component3 + 13;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.showSeconds = str;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 35;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getIcon() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.icon;
        int i5 = i2 + 73;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setIcon(String str) {
        int i = 2 % 2;
        int i2 = component3 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.icon = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.execute;
        int i4 = i3 + 47;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = component1 + 19;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.execute = str;
        int i5 = i3 + 59;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 97;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.order;
        int i5 = i2 + 55;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void setOrder(Integer num) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.order = num;
        int i5 = i2 + 19;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public TipsResp(String str, String str2, String str3, String str4, Integer num) {
        this.bulletin = str;
        this.showSeconds = str2;
        this.icon = str3;
        this.execute = str4;
        this.order = num;
    }

    @Override
    public String marqueeMessage() {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bulletin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String marqueeIcon() {
        int i = 2 % 2;
        String str = this.icon;
        if (str == null) {
            int i2 = component3 + 23;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            str = "";
        }
        int i3 = component3 + 51;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
        }
        return str;
    }

    @Override
    public int getFlipInterval() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = NumberUtils.parseInt(this.showSeconds, 3) * 1000;
        int i5 = component1 + 29;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public TipsResp() {
        this(null, null, null, null, null, 31, null);
    }
}
