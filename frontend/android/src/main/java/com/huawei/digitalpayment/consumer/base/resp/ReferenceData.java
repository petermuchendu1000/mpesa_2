package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.http.BaseRequestParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040!J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\t\u0010$\u001a\u00020\u0004HÆ\u0003J\t\u0010%\u001a\u00020\u0004HÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\u0004HÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0004HÆ\u0003JY\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020,HÖ\u0001J\t\u00102\u001a\u00020\u0004HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001e\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001e\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011¨\u00068"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/ReferenceData;", "Lcom/huawei/http/BaseRequestParams;", "Landroid/os/Parcelable;", "terminalType", "", "authenticationType", ReferenceDataUtils.NameResolutionParam, "appVersion", "requestId", "eventName", "aPIResource", "intiationType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTerminalType", "()Ljava/lang/String;", "setTerminalType", "(Ljava/lang/String;)V", "getAuthenticationType", "setAuthenticationType", "getNameResolution", "setNameResolution", "getAppVersion", "setAppVersion", "getRequestId", "setRequestId", "getEventName", "setEventName", "getAPIResource", "setAPIResource", "getIntiationType", "setIntiationType", "toMap", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReferenceData extends BaseRequestParams implements Parcelable {
    public static final Parcelable.Creator<ReferenceData> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("APIResource")
    private String aPIResource;

    @SerializedName("AppVersion")
    private String appVersion;

    @SerializedName("AuthenticationType")
    private String authenticationType;

    @SerializedName("EventName")
    private String eventName;

    @SerializedName("InitiationType")
    private String intiationType;

    @SerializedName("NameResolution")
    private String nameResolution;

    @SerializedName("RequestId")
    private String requestId;

    @SerializedName("TerminalType")
    private String terminalType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReferenceData> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ReferenceData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ReferenceData referenceData = new ReferenceData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 73;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return referenceData;
            }
            throw null;
        }

        @Override
        public ReferenceData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 81;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                throw null;
            }
            ReferenceData referenceDataCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 123;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return referenceDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ReferenceData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 105;
            component3 = i3 % 128;
            ReferenceData[] referenceDataArr = new ReferenceData[i];
            if (i3 % 2 == 0) {
                return referenceDataArr;
            }
            throw null;
        }

        @Override
        public ReferenceData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 57;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            ReferenceData[] referenceDataArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 61 / 0;
            }
            int i6 = copydefault + 45;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return referenceDataArrNewArray;
            }
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReferenceData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        if ((i & 128) != 0) {
            int i2 = component1 + 35;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            str9 = "";
        } else {
            str9 = str8;
        }
        this(str, str2, str3, str4, str5, str6, str7, str9);
    }

    public final String getTerminalType() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.terminalType;
        }
        throw null;
    }

    public final void setTerminalType(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.terminalType = str;
        int i4 = component1 + 125;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String getAuthenticationType() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 35;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.authenticationType;
        int i5 = i2 + 103;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setAuthenticationType(String str) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.authenticationType = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.authenticationType = str;
            int i3 = 43 / 0;
        }
    }

    public final String getNameResolution() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.nameResolution;
        int i4 = i2 + 53;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final void setNameResolution(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.nameResolution = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.nameResolution = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final String getAppVersion() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appVersion;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAppVersion(String str) {
        int i = 2 % 2;
        int i2 = component1 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.appVersion = str;
        int i4 = component1 + 41;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getRequestId() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.requestId;
        int i5 = i3 + 45;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRequestId(String str) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.requestId = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.requestId = str;
            throw null;
        }
    }

    public final String getEventName() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.eventName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setEventName(String str) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.eventName = str;
        int i4 = component1 + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getAPIResource() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.aPIResource;
        int i4 = i3 + 57;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return str;
    }

    public final void setAPIResource(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.aPIResource = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.aPIResource = str;
            int i3 = 65 / 0;
        }
    }

    public final String getIntiationType() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.intiationType;
        int i5 = i3 + 121;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setIntiationType(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.intiationType = str;
        int i4 = copydefault + 79;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 63 / 0;
        }
    }

    public ReferenceData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.terminalType = str;
        this.authenticationType = str2;
        this.nameResolution = str3;
        this.appVersion = str4;
        this.requestId = str5;
        this.eventName = str6;
        this.aPIResource = str7;
        this.intiationType = str8;
    }

    public final Map<String, String> toMap() {
        int i = 2 % 2;
        Object objFromJson = new Gson().fromJson(new Gson().toJson(this), new TypeToken<Map<String, ? extends String>>() {
        }.getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        Map<String, String> map = (Map) objFromJson;
        int i2 = copydefault + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return map;
    }

    static {
        int i = component2 + 99;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static ReferenceData copy$default(ReferenceData referenceData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        String str9;
        String str10;
        String str11;
        int i2 = 2 % 2;
        String str12 = (i & 1) != 0 ? referenceData.terminalType : str;
        if ((i & 2) != 0) {
            int i3 = component1 + 57;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                String str13 = referenceData.authenticationType;
                throw null;
            }
            str9 = referenceData.authenticationType;
        } else {
            str9 = str2;
        }
        if ((i & 4) != 0) {
            int i4 = copydefault + 101;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                str10 = referenceData.nameResolution;
                int i5 = 14 / 0;
            } else {
                str10 = referenceData.nameResolution;
            }
        } else {
            str10 = str3;
        }
        String str14 = (i & 8) != 0 ? referenceData.appVersion : str4;
        if ((i & 16) != 0) {
            int i6 = component1 + 29;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str11 = referenceData.requestId;
            if (i7 == 0) {
                int i8 = 29 / 0;
            }
        } else {
            str11 = str5;
        }
        return referenceData.copy(str12, str9, str10, str14, str11, (i & 32) != 0 ? referenceData.eventName : str6, (i & 64) != 0 ? referenceData.aPIResource : str7, (i & 128) != 0 ? referenceData.intiationType : str8);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.terminalType;
        int i4 = i3 + 121;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 29;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.authenticationType;
        int i4 = i3 + 77;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.nameResolution;
            int i4 = 91 / 0;
        } else {
            str = this.nameResolution;
        }
        int i5 = i3 + 61;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.appVersion;
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.requestId;
        int i5 = i3 + 121;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 9 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.eventName;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.aPIResource;
        int i5 = i3 + 33;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.intiationType;
        int i4 = i2 + 95;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final ReferenceData copy(String terminalType, String authenticationType, String nameResolution, String appVersion, String requestId, String eventName, String aPIResource, String intiationType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(terminalType, "");
        Intrinsics.checkNotNullParameter(authenticationType, "");
        Intrinsics.checkNotNullParameter(nameResolution, "");
        Intrinsics.checkNotNullParameter(appVersion, "");
        Intrinsics.checkNotNullParameter(requestId, "");
        Intrinsics.checkNotNullParameter(eventName, "");
        Intrinsics.checkNotNullParameter(aPIResource, "");
        Intrinsics.checkNotNullParameter(intiationType, "");
        ReferenceData referenceData = new ReferenceData(terminalType, authenticationType, nameResolution, appVersion, requestId, eventName, aPIResource, intiationType);
        int i2 = component1 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return referenceData;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 101;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 3;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ReferenceData)) {
            return false;
        }
        ReferenceData referenceData = (ReferenceData) other;
        if (!Intrinsics.areEqual(this.terminalType, referenceData.terminalType)) {
            int i4 = component1 + 119;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 95 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.authenticationType, referenceData.authenticationType) || !Intrinsics.areEqual(this.nameResolution, referenceData.nameResolution) || !Intrinsics.areEqual(this.appVersion, referenceData.appVersion)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.requestId, referenceData.requestId)) {
            int i6 = copydefault + 107;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!(!Intrinsics.areEqual(this.eventName, referenceData.eventName))) {
            if (Intrinsics.areEqual(this.aPIResource, referenceData.aPIResource)) {
                return Intrinsics.areEqual(this.intiationType, referenceData.intiationType);
            }
            int i8 = component1 + 39;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = component1;
        int i11 = i10 + 107;
        copydefault = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 23;
        copydefault = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 18 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((this.terminalType.hashCode() * 31) + this.authenticationType.hashCode()) * 31) + this.nameResolution.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.requestId.hashCode()) * 31) + this.eventName.hashCode()) * 31) + this.aPIResource.hashCode()) * 31) + this.intiationType.hashCode();
        int i4 = component1 + 77;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReferenceData(terminalType=" + this.terminalType + ", authenticationType=" + this.authenticationType + ", nameResolution=" + this.nameResolution + ", appVersion=" + this.appVersion + ", requestId=" + this.requestId + ", eventName=" + this.eventName + ", aPIResource=" + this.aPIResource + ", intiationType=" + this.intiationType + ")";
        int i2 = copydefault + 99;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.terminalType);
        dest.writeString(this.authenticationType);
        dest.writeString(this.nameResolution);
        dest.writeString(this.appVersion);
        dest.writeString(this.requestId);
        dest.writeString(this.eventName);
        dest.writeString(this.aPIResource);
        dest.writeString(this.intiationType);
        int i4 = copydefault + 55;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
