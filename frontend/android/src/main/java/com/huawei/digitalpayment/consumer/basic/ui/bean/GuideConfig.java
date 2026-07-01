package com.huawei.digitalpayment.consumer.basic.ui.bean;

import com.alibaba.griver.core.GriverParams;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u0003H×\u0001J\t\u0010 \u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basic/ui/bean/GuideConfig;", "Ljava/io/Serializable;", "imageBg", "", "imagePhoneBg", "imageTitle", "tips", "", GriverParams.ShareParams.IMAGE_URL, "imageContent", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageBg", "()I", "getImagePhoneBg", "getImageTitle", "getTips", "()Ljava/lang/String;", "getImageUrl", "getImageContent", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerBasicUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GuideConfig implements Serializable {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 77 % 128;
    private final int imageBg;
    private final String imageContent;
    private final int imagePhoneBg;
    private final int imageTitle;
    private final String imageUrl;
    private final String tips;

    public GuideConfig(int i, int i2, int i3, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.imageBg = i;
        this.imagePhoneBg = i2;
        this.imageTitle = i3;
        this.tips = str;
        this.imageUrl = str2;
        this.imageContent = str3;
    }

    public final int getImageBg() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.imageBg;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int getImagePhoneBg() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.imagePhoneBg;
        int i6 = i3 + 21;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getImageTitle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.imageTitle;
        int i5 = i3 + 37;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return i4;
    }

    public final String getTips() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.tips;
        int i5 = i3 + 5;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getImageUrl() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.imageUrl;
        int i5 = i2 + 19;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getImageContent() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.imageContent;
        int i5 = i3 + 117;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        if (77 % 2 == 0) {
            throw null;
        }
    }

    public static GuideConfig copy$default(GuideConfig guideConfig, int i, int i2, int i3, String str, String str2, String str3, int i4, Object obj) {
        int i5;
        String str4;
        int i6 = 2 % 2;
        int i7 = ShareDataUIState;
        int i8 = i7 + 87;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        int i10 = (i4 & 1) != 0 ? guideConfig.imageBg : i;
        if ((i4 & 2) != 0) {
            int i11 = i7 + 33;
            component1 = i11 % 128;
            if (i11 % 2 == 0) {
                i5 = guideConfig.imagePhoneBg;
                int i12 = 25 / 0;
            } else {
                i5 = guideConfig.imagePhoneBg;
            }
        } else {
            i5 = i2;
        }
        int i13 = (i4 & 4) != 0 ? guideConfig.imageTitle : i3;
        String str5 = (i4 & 8) != 0 ? guideConfig.tips : str;
        String str6 = (i4 & 16) != 0 ? guideConfig.imageUrl : str2;
        if ((i4 & 32) != 0) {
            str4 = guideConfig.imageContent;
            int i14 = component1 + 31;
            ShareDataUIState = i14 % 128;
            int i15 = i14 % 2;
        } else {
            str4 = str3;
        }
        GuideConfig guideConfigCopy = guideConfig.copy(i10, i5, i13, str5, str6, str4);
        int i16 = ShareDataUIState + 83;
        component1 = i16 % 128;
        if (i16 % 2 != 0) {
            return guideConfigCopy;
        }
        throw null;
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.imageBg;
        int i6 = i3 + 5;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.imagePhoneBg;
        int i5 = i3 + 85;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.imageTitle;
        int i6 = i2 + 25;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.tips;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.imageUrl;
        int i5 = i3 + 65;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.imageContent;
        int i5 = i3 + 95;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final GuideConfig copy(int imageBg, int imagePhoneBg, int imageTitle, String tips, String imageUrl, String imageContent) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tips, "");
        Intrinsics.checkNotNullParameter(imageUrl, "");
        Intrinsics.checkNotNullParameter(imageContent, "");
        GuideConfig guideConfig = new GuideConfig(imageBg, imagePhoneBg, imageTitle, tips, imageUrl, imageContent);
        int i2 = ShareDataUIState + 39;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return guideConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 69;
            component1 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof GuideConfig)) {
            int i3 = component1 + 105;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        GuideConfig guideConfig = (GuideConfig) other;
        if (this.imageBg != guideConfig.imageBg || this.imagePhoneBg != guideConfig.imagePhoneBg || this.imageTitle != guideConfig.imageTitle) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tips, guideConfig.tips)) {
            int i5 = ShareDataUIState + 89;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.imageUrl, guideConfig.imageUrl)) {
            return Intrinsics.areEqual(this.imageContent, guideConfig.imageContent);
        }
        int i7 = ShareDataUIState + 11;
        component1 = i7 % 128;
        return i7 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Integer.hashCode(this.imageBg) * 31) + Integer.hashCode(this.imagePhoneBg)) * 31) + Integer.hashCode(this.imageTitle)) * 31) + this.tips.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.imageContent.hashCode();
        int i4 = component1 + 25;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "GuideConfig(imageBg=" + this.imageBg + ", imagePhoneBg=" + this.imagePhoneBg + ", imageTitle=" + this.imageTitle + ", tips=" + this.tips + ", imageUrl=" + this.imageUrl + ", imageContent=" + this.imageContent + ")";
        int i2 = component1 + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
