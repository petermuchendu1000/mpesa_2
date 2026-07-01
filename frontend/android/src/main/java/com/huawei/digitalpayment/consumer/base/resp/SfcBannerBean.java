package com.huawei.digitalpayment.consumer.base.resp;

import com.alibaba.griver.core.GriverParams;
import com.huawei.common.widget.banner.BannerView;
import com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/SfcBannerBean;", "Lcom/huawei/common/widget/banner/BannerView$BannerBean;", "delay", "", SfcServicePinActivity.EXTRA_IMAGE_RES, "<init>", "(II)V", "getDelay", "()I", "getImageRes", "delayTime", "", GriverParams.ShareParams.IMAGE_URL, "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SfcBannerBean implements BannerView.BannerBean {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final int delay;
    private final int imageRes;

    public SfcBannerBean(int i, int i2) {
        this.delay = i;
        this.imageRes = i2;
    }

    public final int getDelay() {
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 37;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        if (i3 % 2 == 0) {
            i = this.delay;
            int i5 = 93 / 0;
        } else {
            i = this.delay;
        }
        int i6 = i4 + 7;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            return i;
        }
        throw null;
    }

    public final int getImageRes() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.imageRes;
        }
        throw null;
    }

    @Override
    public String delayTime() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return "5";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public String imageUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 47;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 57;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
        return "";
    }

    public static SfcBannerBean copy$default(SfcBannerBean sfcBannerBean, int i, int i2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = component2 + 3;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        if ((i3 & 1) != 0) {
            i = sfcBannerBean.delay;
        }
        if ((i3 & 2) != 0) {
            i2 = sfcBannerBean.imageRes;
        }
        SfcBannerBean sfcBannerBeanCopy = sfcBannerBean.copy(i, i2);
        int i7 = component2 + 73;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return sfcBannerBeanCopy;
    }

    public final int component1() {
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 27;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        if (i3 % 2 == 0) {
            i = this.delay;
            int i5 = 19 / 0;
        } else {
            i = this.delay;
        }
        int i6 = i4 + 61;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.imageRes;
        }
        throw null;
    }

    public final SfcBannerBean copy(int delay, int imageRes) {
        int i = 2 % 2;
        SfcBannerBean sfcBannerBean = new SfcBannerBean(delay, imageRes);
        int i2 = ShareDataUIState + 9;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
        return sfcBannerBean;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SfcBannerBean)) {
            return false;
        }
        SfcBannerBean sfcBannerBean = (SfcBannerBean) other;
        if (this.delay == sfcBannerBean.delay) {
            return this.imageRes == sfcBannerBean.imageRes;
        }
        int i5 = i3 + 87;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.delay);
        return i3 == 0 ? (iHashCode >> 7) - Integer.hashCode(this.imageRes) : (iHashCode * 31) + Integer.hashCode(this.imageRes);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SfcBannerBean(delay=" + this.delay + ", imageRes=" + this.imageRes + ")";
        int i2 = ShareDataUIState + 27;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
