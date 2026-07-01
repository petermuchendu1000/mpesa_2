package com.huawei.digitalpayment.consumer.sfcui.ui.activity;

import android.os.Parcel;
import android.os.Parcelable;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006HÇ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH×\u0003J\t\u0010\u001b\u001a\u00020\u0016H×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016H\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/activity/ScopesRequestBean;", "Landroid/os/Parcelable;", "miniAppName", "", "miniAppLogo", LogConstants.Oauth.SCOPES, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMiniAppName", "()Ljava/lang/String;", "setMiniAppName", "(Ljava/lang/String;)V", "getMiniAppLogo", "setMiniAppLogo", "getScopes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScopesRequestBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ScopesRequestBean> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private String miniAppLogo;
    private String miniAppName;
    private final List<String> scopes;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScopesRequestBean> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ScopesRequestBean createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ScopesRequestBean scopesRequestBean = new ScopesRequestBean(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            int i2 = copydefault + 29;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return scopesRequestBean;
        }

        @Override
        public ScopesRequestBean createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 25;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ScopesRequestBean scopesRequestBeanCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 44 / 0;
            }
            return scopesRequestBeanCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ScopesRequestBean[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 71;
            component3 = i3 % 128;
            ScopesRequestBean[] scopesRequestBeanArr = new ScopesRequestBean[i];
            if (i3 % 2 == 0) {
                int i4 = 65 / 0;
            }
            return scopesRequestBeanArr;
        }

        @Override
        public ScopesRequestBean[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 109;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            ScopesRequestBean[] scopesRequestBeanArrNewArray = newArray(i);
            int i5 = copydefault + 15;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return scopesRequestBeanArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public ScopesRequestBean(String str, String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.miniAppName = str;
        this.miniAppLogo = str2;
        this.scopes = list;
    }

    public final String getMiniAppName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.miniAppName;
        int i5 = i2 + 15;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setMiniAppName(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.miniAppName = str;
        int i4 = component3 + 121;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String getMiniAppLogo() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.miniAppLogo;
        int i4 = i2 + 121;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setMiniAppLogo(String str) {
        int i = 2 % 2;
        int i2 = component3 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.miniAppLogo = str;
        int i4 = ShareDataUIState + 25;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final List<String> getScopes() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<String> list = this.scopes;
        int i4 = i3 + 17;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return list;
    }

    static {
        int i = component2 + 15;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ScopesRequestBean copy$default(ScopesRequestBean scopesRequestBean, String str, String str2, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 37;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                String str3 = scopesRequestBean.miniAppName;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = scopesRequestBean.miniAppName;
        }
        if ((i & 2) != 0) {
            str2 = scopesRequestBean.miniAppLogo;
        }
        if ((i & 4) != 0) {
            int i4 = ShareDataUIState + 59;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            list = scopesRequestBean.scopes;
        }
        return scopesRequestBean.copy(str, str2, list);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            str = this.miniAppName;
            int i4 = 96 / 0;
        } else {
            str = this.miniAppName;
        }
        int i5 = i3 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.miniAppLogo;
        int i4 = i3 + 55;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<String> component3() {
        List<String> list;
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            list = this.scopes;
            int i4 = 71 / 0;
        } else {
            list = this.scopes;
        }
        int i5 = i3 + 63;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ScopesRequestBean copy(String miniAppName, String miniAppLogo, List<String> scopes) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(miniAppName, "");
        Intrinsics.checkNotNullParameter(miniAppLogo, "");
        Intrinsics.checkNotNullParameter(scopes, "");
        ScopesRequestBean scopesRequestBean = new ScopesRequestBean(miniAppName, miniAppLogo, scopes);
        int i2 = component3 + 19;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 89 / 0;
        }
        return scopesRequestBean;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScopesRequestBean)) {
            return false;
        }
        ScopesRequestBean scopesRequestBean = (ScopesRequestBean) other;
        if (!Intrinsics.areEqual(this.miniAppName, scopesRequestBean.miniAppName)) {
            int i3 = component3 + 111;
            ShareDataUIState = i3 % 128;
            return i3 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.miniAppLogo, scopesRequestBean.miniAppLogo)) {
            return Intrinsics.areEqual(this.scopes, scopesRequestBean.scopes);
        }
        int i4 = ShareDataUIState + 19;
        component3 = i4 % 128;
        return i4 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.miniAppName.hashCode();
        return i3 != 0 ? (((iHashCode % 86) << this.miniAppLogo.hashCode()) + 68) / this.scopes.hashCode() : (((iHashCode * 31) + this.miniAppLogo.hashCode()) * 31) + this.scopes.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScopesRequestBean(miniAppName=" + this.miniAppName + ", miniAppLogo=" + this.miniAppLogo + ", scopes=" + this.scopes + ")";
        int i2 = component3 + 121;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.miniAppName);
        dest.writeString(this.miniAppLogo);
        dest.writeStringList(this.scopes);
        int i4 = ShareDataUIState + 33;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
