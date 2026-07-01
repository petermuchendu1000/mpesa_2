package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Home5gLinkBean;", "Landroid/os/Parcelable;", "coverImageUrl", "", "linkUrl", "subtitle", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCoverImageUrl", "()Ljava/lang/String;", "getLinkUrl", "getSubtitle", "getTitle", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Home5gLinkBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Home5gLinkBean> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("coverImageUrl")
    private final String coverImageUrl;

    @SerializedName("linkUrl")
    private final String linkUrl;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Home5gLinkBean> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home5gLinkBean createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Home5gLinkBean home5gLinkBean = new Home5gLinkBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 55;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return home5gLinkBean;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Home5gLinkBean createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 109;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Home5gLinkBean home5gLinkBeanCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 111;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return home5gLinkBeanCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home5gLinkBean[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 31;
            component3 = i3 % 128;
            Home5gLinkBean[] home5gLinkBeanArr = new Home5gLinkBean[i];
            if (i3 % 2 == 0) {
                return home5gLinkBeanArr;
            }
            throw null;
        }

        @Override
        public Home5gLinkBean[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 45;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            Home5gLinkBean[] home5gLinkBeanArrNewArray = newArray(i);
            int i5 = component3 + 123;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return home5gLinkBeanArrNewArray;
        }
    }

    public Home5gLinkBean(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.coverImageUrl = str;
        this.linkUrl = str2;
        this.subtitle = str3;
        this.title = str4;
    }

    public final String getCoverImageUrl() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.coverImageUrl;
        }
        throw null;
    }

    public final String getLinkUrl() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.linkUrl;
        }
        throw null;
    }

    public final String getSubtitle() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.subtitle;
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return str;
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.title;
        int i5 = i3 + 27;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = copydefault + 97;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static Home5gLinkBean copy$default(Home5gLinkBean home5gLinkBean, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 9;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = home5gLinkBean.coverImageUrl;
        }
        if ((i & 2) != 0) {
            str2 = home5gLinkBean.linkUrl;
        }
        if ((i & 4) != 0) {
            int i5 = i4 + 3;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                str3 = home5gLinkBean.subtitle;
                int i6 = 28 / 0;
            } else {
                str3 = home5gLinkBean.subtitle;
            }
        }
        if ((i & 8) != 0) {
            int i7 = i4 + 17;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            str4 = home5gLinkBean.title;
        }
        return home5gLinkBean.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 27;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.coverImageUrl;
        int i4 = i3 + 27;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.linkUrl;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 39;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.subtitle;
        int i5 = i3 + 91;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 1;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Home5gLinkBean copy(String coverImageUrl, String linkUrl, String subtitle, String title) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(coverImageUrl, "");
        Intrinsics.checkNotNullParameter(linkUrl, "");
        Intrinsics.checkNotNullParameter(subtitle, "");
        Intrinsics.checkNotNullParameter(title, "");
        Home5gLinkBean home5gLinkBean = new Home5gLinkBean(coverImageUrl, linkUrl, subtitle, title);
        int i2 = component3 + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return home5gLinkBean;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Home5gLinkBean)) {
            return false;
        }
        Home5gLinkBean home5gLinkBean = (Home5gLinkBean) other;
        if (!Intrinsics.areEqual(this.coverImageUrl, home5gLinkBean.coverImageUrl)) {
            int i4 = component1 + 95;
            component3 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.linkUrl, home5gLinkBean.linkUrl)) {
            return false;
        }
        if (Intrinsics.areEqual(this.subtitle, home5gLinkBean.subtitle)) {
            if (Intrinsics.areEqual(this.title, home5gLinkBean.title)) {
                return true;
            }
            int i5 = component1 + 23;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = component1 + 95;
        int i8 = i7 % 128;
        component3 = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 79;
        component1 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.coverImageUrl.hashCode() * 31) + this.linkUrl.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.title.hashCode();
        int i4 = component1 + 39;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Home5gLinkBean(coverImageUrl=" + this.coverImageUrl + ", linkUrl=" + this.linkUrl + ", subtitle=" + this.subtitle + ", title=" + this.title + ")";
        int i2 = component3 + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.coverImageUrl);
        dest.writeString(this.linkUrl);
        dest.writeString(this.subtitle);
        dest.writeString(this.title);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
