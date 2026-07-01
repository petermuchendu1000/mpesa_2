package com.huawei.digitalpayment.home.data.source.locaL;

import com.huawei.common.util.NumberUtils;
import com.huawei.common.util.image.UrlUtils;
import com.huawei.common.widget.text.MarqueeView;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0015\u0010\u0010\u001a\n \u0011*\u0004\u0018\u00010\u00040\u0004H\u0016¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0013HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeTips;", "Lcom/huawei/common/widget/text/MarqueeView$IMarqueeItem;", "Lcom/huawei/http/BaseResp;", "content", "", "showSeconds", "icon", KeysConstants.KEY_EXECUTE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getShowSeconds", "getIcon", "getExecute", "marqueeMessage", "marqueeIcon", "kotlin.jvm.PlatformType", "getFlipInterval", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalHomeTips extends BaseResp implements MarqueeView.IMarqueeItem {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final String content;
    private final String execute;
    private final String icon;
    private final String showSeconds;

    @Override
    public CharSequence marqueeMessage() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            marqueeMessage();
            throw null;
        }
        String strMarqueeMessage = marqueeMessage();
        int i3 = ShareDataUIState + 5;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return strMarqueeMessage;
        }
        throw null;
    }

    public final String getContent() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 39;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.content;
        int i5 = i2 + 105;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getShowSeconds() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.showSeconds;
        int i5 = i3 + 45;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return str;
    }

    public final String getIcon() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.icon;
        int i5 = i3 + 41;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 75;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LocalHomeTips(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.content = str;
        this.showSeconds = str2;
        this.icon = str3;
        this.execute = str4;
    }

    @Override
    public String marqueeMessage() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 123;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.content;
        int i5 = i2 + 13;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    @Override
    public String marqueeIcon() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String h5BaseUrl = AppConfigManager.getAppConfig().getH5BaseUrl();
        if (i3 != 0) {
            return UrlUtils.getURL(h5BaseUrl, this.icon);
        }
        int i4 = 25 / 0;
        return UrlUtils.getURL(h5BaseUrl, this.icon);
    }

    @Override
    public int getFlipInterval() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component1 = i2 % 128;
        return i2 % 2 == 0 ? NumberUtils.parseInt(this.showSeconds, 2) % 11375 : NumberUtils.parseInt(this.showSeconds, 3) * 1000;
    }

    public static LocalHomeTips copy$default(LocalHomeTips localHomeTips, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 13;
        ShareDataUIState = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 113;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                String str5 = localHomeTips.content;
                obj2.hashCode();
                throw null;
            }
            str = localHomeTips.content;
        }
        if ((i & 2) != 0) {
            str2 = localHomeTips.showSeconds;
        }
        if ((i & 4) != 0) {
            int i6 = ShareDataUIState + 73;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                String str6 = localHomeTips.icon;
                obj2.hashCode();
                throw null;
            }
            str3 = localHomeTips.icon;
        }
        if ((i & 8) != 0) {
            str4 = localHomeTips.execute;
        }
        return localHomeTips.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 81;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.content;
        int i5 = i2 + 3;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.showSeconds;
        int i5 = i3 + 53;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 6 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 75;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.icon;
        int i4 = i2 + 91;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.execute;
        int i5 = i3 + 85;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final LocalHomeTips copy(String content, String showSeconds, String icon, String execute) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(content, "");
        Intrinsics.checkNotNullParameter(showSeconds, "");
        Intrinsics.checkNotNullParameter(icon, "");
        Intrinsics.checkNotNullParameter(execute, "");
        LocalHomeTips localHomeTips = new LocalHomeTips(content, showSeconds, icon, execute);
        int i2 = ShareDataUIState + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return localHomeTips;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 81;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof LocalHomeTips) {
            LocalHomeTips localHomeTips = (LocalHomeTips) other;
            if (!Intrinsics.areEqual(this.content, localHomeTips.content)) {
                return false;
            }
            if (Intrinsics.areEqual(this.showSeconds, localHomeTips.showSeconds)) {
                return Intrinsics.areEqual(this.icon, localHomeTips.icon) && Intrinsics.areEqual(this.execute, localHomeTips.execute);
            }
            int i4 = component1 + 93;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = component1;
        int i7 = i6 + 9;
        ShareDataUIState = i7 % 128;
        boolean z = i7 % 2 != 0;
        int i8 = i6 + 49;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.content.hashCode();
        return i3 == 0 ? (((((iHashCode % 1) >>> this.showSeconds.hashCode()) % 80) >>> this.icon.hashCode()) / 75) * this.execute.hashCode() : (((((iHashCode * 31) + this.showSeconds.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.execute.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalHomeTips(content=" + this.content + ", showSeconds=" + this.showSeconds + ", icon=" + this.icon + ", execute=" + this.execute + ")";
        int i2 = component1 + 125;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
