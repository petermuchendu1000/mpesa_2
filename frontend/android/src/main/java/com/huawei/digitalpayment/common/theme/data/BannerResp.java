package com.huawei.digitalpayment.common.theme.data;

import com.alibaba.griver.core.GriverParams;
import com.huawei.common.widget.banner.BannerView;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\b\u0017\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001b\u001a\u00020\u0004H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/BannerResp;", "Lcom/huawei/http/BaseResp;", "Lcom/huawei/common/widget/banner/BannerView$BannerBean;", "reportTag", "", "showSeconds", CdpConstants.CONTENT_IMAGE_URL, KeysConstants.KEY_EXECUTE, "order", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getReportTag", "()Ljava/lang/String;", "setReportTag", "(Ljava/lang/String;)V", "getShowSeconds", "setShowSeconds", "getImgUrl", "setImgUrl", "getExecute", "setExecute", "getOrder", "()Ljava/lang/Integer;", "setOrder", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "delayTime", GriverParams.ShareParams.IMAGE_URL, "Companion", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BannerResp extends BaseResp implements BannerView.BannerBean {

    public static final Companion INSTANCE = new Companion(null);
    public static final String DEFAULT_SHOW_SECONDS = "5";
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;
    private String execute;
    private String imgUrl;
    private Integer order;
    private String reportTag;
    private String showSeconds;

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerResp(String str, String str2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        String str7 = (i & 1) != 0 ? null : str;
        String str8 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i2 = copydefault + 125;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 63;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i & 8) != 0) {
            int i8 = component2 + 19;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            str6 = null;
        } else {
            str6 = str4;
        }
        this(str7, str8, str5, str6, (i & 16) != 0 ? null : num);
    }

    public final String getReportTag() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.reportTag;
        int i5 = i2 + 111;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setReportTag(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 29;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.reportTag = str;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 79;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getShowSeconds() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.showSeconds;
        int i5 = i3 + 109;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setShowSeconds(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.showSeconds = str;
        int i5 = i2 + 99;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
    }

    public final String getImgUrl() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.imgUrl;
        int i5 = i3 + 81;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setImgUrl(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.imgUrl = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.execute;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return str;
    }

    public final void setExecute(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.execute = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getOrder() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.order;
        int i5 = i3 + 81;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return num;
    }

    public final void setOrder(Integer num) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.order = num;
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
    }

    public BannerResp(String str, String str2, String str3, String str4, Integer num) {
        this.reportTag = str;
        this.showSeconds = str2;
        this.imgUrl = str3;
        this.execute = str4;
        this.order = num;
    }

    @Override
    public String delayTime() {
        int i = 2 % 2;
        String str = this.showSeconds;
        if (str != null) {
            return str;
        }
        int i2 = copydefault + 61;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 67;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 % 5;
        }
        return "5";
    }

    @Override
    public String imageUrl() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.imgUrl;
        int i5 = i2 + 115;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/BannerResp$Companion;", "", "<init>", "()V", "DEFAULT_SHOW_SECONDS", "", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = ShareDataUIState + 119;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public BannerResp() {
        this(null, null, null, null, null, 31, null);
    }
}
