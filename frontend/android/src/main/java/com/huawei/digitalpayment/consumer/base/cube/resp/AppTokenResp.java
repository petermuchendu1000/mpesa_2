package com.huawei.digitalpayment.consumer.base.cube.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.exthub.config.ExtHubMetaInfoParser;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0005J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/cube/resp/AppTokenResp;", "Landroid/os/Parcelable;", "accessToken", "", "expiresIn", "", ExtHubMetaInfoParser.KEY_EXTENSION_SCOPE_CLASS_NAME, "tokenType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getScope", "getTokenType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/base/cube/resp/AppTokenResp;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppTokenResp implements Parcelable {
    public static final Parcelable.Creator<AppTokenResp> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("access_token")
    private final String accessToken;

    @SerializedName("expires_in")
    private final Integer expiresIn;

    @SerializedName(ExtHubMetaInfoParser.KEY_EXTENSION_SCOPE_CLASS_NAME)
    private final String scope;

    @SerializedName("token_type")
    private final String tokenType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AppTokenResp> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AppTokenResp createFromParcel(Parcel parcel) {
            Integer numValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                int i2 = ShareDataUIState + 67;
                int i3 = i2 % 128;
                component3 = i3;
                if (i2 % 2 != 0) {
                    int i4 = 55 / 0;
                }
                int i5 = i3 + 29;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new AppTokenResp(string, numValueOf, parcel.readString(), parcel.readString());
        }

        @Override
        public AppTokenResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 83;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            AppTokenResp appTokenRespCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 75;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return appTokenRespCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AppTokenResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 67;
            ShareDataUIState = i4 % 128;
            Object obj = null;
            AppTokenResp[] appTokenRespArr = new AppTokenResp[i];
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 15;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return appTokenRespArr;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public AppTokenResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 61;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            AppTokenResp[] appTokenRespArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 19 / 0;
            }
            int i6 = ShareDataUIState + 87;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return appTokenRespArrNewArray;
        }
    }

    public AppTokenResp(String str, Integer num, String str2, String str3) {
        this.accessToken = str;
        this.expiresIn = num;
        this.scope = str2;
        this.tokenType = str3;
    }

    public final String getAccessToken() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accessToken;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getExpiresIn() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.expiresIn;
        }
        throw null;
    }

    public final String getScope() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.scope;
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        return str;
    }

    public final String getTokenType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tokenType;
        int i5 = i2 + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = copydefault + 9;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static AppTokenResp copy$default(AppTokenResp appTokenResp, String str, Integer num, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 3;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = appTokenResp.accessToken;
        }
        if ((i & 2) != 0) {
            num = appTokenResp.expiresIn;
        }
        if ((i & 4) != 0) {
            str2 = appTokenResp.scope;
        }
        if ((i & 8) != 0) {
            int i5 = i4 + 71;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str3 = appTokenResp.tokenType;
        }
        return appTokenResp.copy(str, num, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.accessToken;
        int i4 = i3 + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer component2() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.expiresIn;
        int i5 = i3 + 67;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.scope;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tokenType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AppTokenResp copy(String accessToken, Integer expiresIn, String scope, String tokenType) {
        int i = 2 % 2;
        AppTokenResp appTokenResp = new AppTokenResp(accessToken, expiresIn, scope, tokenType);
        int i2 = component1 + 65;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return appTokenResp;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 53;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 33;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppTokenResp)) {
            return false;
        }
        AppTokenResp appTokenResp = (AppTokenResp) other;
        if (!Intrinsics.areEqual(this.accessToken, appTokenResp.accessToken)) {
            int i4 = component3 + 87;
            component1 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.expiresIn, appTokenResp.expiresIn)) {
            int i5 = component1 + 55;
            component3 = i5 % 128;
            return i5 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.scope, appTokenResp.scope)) {
            return false;
        }
        if (Intrinsics.areEqual(this.tokenType, appTokenResp.tokenType)) {
            return true;
        }
        int i6 = component1 + 73;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        if (i2 % 2 != 0 ? (str = this.accessToken) != null : (str = this.accessToken) != null) {
            iHashCode = str.hashCode();
            int i3 = component3 + 37;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode = 0;
        }
        Integer num = this.expiresIn;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.scope;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppTokenResp(accessToken=" + this.accessToken + ", expiresIn=" + this.expiresIn + ", scope=" + this.scope + ", tokenType=" + this.tokenType + ")";
        int i2 = component1 + 47;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        int i = 2 % 2;
        int i2 = component1 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.accessToken);
            throw null;
        }
        dest.writeString(this.accessToken);
        Integer num = this.expiresIn;
        if (num == null) {
            int i4 = component3 + 33;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.scope);
        dest.writeString(this.tokenType);
    }
}
