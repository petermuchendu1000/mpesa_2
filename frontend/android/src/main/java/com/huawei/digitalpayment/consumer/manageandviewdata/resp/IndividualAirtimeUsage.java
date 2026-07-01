package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.beehive.lottie.constants.LottieConstants;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Jw\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÇ\u0001J\b\u0010(\u001a\u00020)H\u0007J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H×\u0003J\t\u0010.\u001a\u00020)H×\u0001J\t\u0010/\u001a\u00020\u0003H×\u0001J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020)H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u00065"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/IndividualAirtimeUsage;", "Landroid/os/Parcelable;", "datetime", "", "streamType", "trafficType", "calledMsisdn", "balanceType", "amount", "duration", "actualUsage", "downLink", "upLink", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDatetime", "()Ljava/lang/String;", "getStreamType", "getTrafficType", "getCalledMsisdn", "getBalanceType", "getAmount", LottieConstants.METHOD_GET_DURATION, "getActualUsage", "getDownLink", "getUpLink", "getDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndividualAirtimeUsage implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<IndividualAirtimeUsage> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("actualUsage")
    private final String actualUsage;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("balanceType")
    private final String balanceType;

    @SerializedName("calledMsisdn")
    private final String calledMsisdn;

    @SerializedName("datetime")
    private final String datetime;

    @SerializedName("description")
    private final String description;

    @SerializedName("downLink")
    private final String downLink;

    @SerializedName("duration")
    private final String duration;

    @SerializedName("streamType")
    private final String streamType;

    @SerializedName("trafficType")
    private final String trafficType;

    @SerializedName("upLink")
    private final String upLink;

    public IndividualAirtimeUsage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.datetime = str;
        this.streamType = str2;
        this.trafficType = str3;
        this.calledMsisdn = str4;
        this.balanceType = str5;
        this.amount = str6;
        this.duration = str7;
        this.actualUsage = str8;
        this.downLink = str9;
        this.upLink = str10;
        this.description = str11;
    }

    public final String getDatetime() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 117;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.datetime;
            int i4 = 31 / 0;
        } else {
            str = this.datetime;
        }
        int i5 = i3 + 113;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 45 / 0;
        }
        return str;
    }

    public final String getStreamType() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.streamType;
        int i5 = i3 + 83;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTrafficType() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.trafficType;
        int i5 = i3 + 33;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCalledMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.calledMsisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBalanceType() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.balanceType;
        int i5 = i2 + 63;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 43;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDuration() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.duration;
        int i5 = i2 + 1;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return str;
    }

    public final String getActualUsage() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.actualUsage;
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDownLink() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.downLink;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public final String getUpLink() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.upLink;
        int i5 = i3 + 19;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.description;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 51;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 66 / 0;
        }
    }

    public static IndividualAirtimeUsage copy$default(IndividualAirtimeUsage individualAirtimeUsage, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        String str12;
        String str13;
        String str14;
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 33;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 69;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str12 = individualAirtimeUsage.datetime;
        } else {
            str12 = str;
        }
        String str15 = (i & 2) != 0 ? individualAirtimeUsage.streamType : str2;
        String str16 = (i & 4) != 0 ? individualAirtimeUsage.trafficType : str3;
        String str17 = (i & 8) != 0 ? individualAirtimeUsage.calledMsisdn : str4;
        String str18 = (i & 16) != 0 ? individualAirtimeUsage.balanceType : str5;
        String str19 = (i & 32) != 0 ? individualAirtimeUsage.amount : str6;
        String str20 = (i & 64) != 0 ? individualAirtimeUsage.duration : str7;
        if ((i & 128) != 0) {
            int i8 = i3 + 21;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                str13 = individualAirtimeUsage.actualUsage;
                int i9 = 34 / 0;
            } else {
                str13 = individualAirtimeUsage.actualUsage;
            }
        } else {
            str13 = str8;
        }
        if ((i & 256) != 0) {
            int i10 = component1 + 41;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            str14 = individualAirtimeUsage.downLink;
        } else {
            str14 = str9;
        }
        return individualAirtimeUsage.copy(str12, str15, str16, str17, str18, str19, str20, str13, str14, (i & 512) != 0 ? individualAirtimeUsage.upLink : str10, (i & 1024) != 0 ? individualAirtimeUsage.description : str11);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.datetime;
        int i5 = i3 + 95;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.upLink;
        int i5 = i3 + 87;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.description;
            int i4 = 21 / 0;
        } else {
            str = this.description;
        }
        int i5 = i3 + 67;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.streamType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.trafficType;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 47;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.calledMsisdn;
        int i5 = i2 + 67;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 87;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.balanceType;
        int i5 = i2 + 17;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.amount;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.duration;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.actualUsage;
            int i4 = 37 / 0;
        } else {
            str = this.actualUsage;
        }
        int i5 = i3 + 85;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.downLink;
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final IndividualAirtimeUsage copy(String datetime, String streamType, String trafficType, String calledMsisdn, String balanceType, String amount, String duration, String actualUsage, String downLink, String upLink, String description) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(datetime, "");
        Intrinsics.checkNotNullParameter(streamType, "");
        Intrinsics.checkNotNullParameter(trafficType, "");
        Intrinsics.checkNotNullParameter(calledMsisdn, "");
        Intrinsics.checkNotNullParameter(balanceType, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(duration, "");
        Intrinsics.checkNotNullParameter(actualUsage, "");
        Intrinsics.checkNotNullParameter(downLink, "");
        Intrinsics.checkNotNullParameter(upLink, "");
        Intrinsics.checkNotNullParameter(description, "");
        IndividualAirtimeUsage individualAirtimeUsage = new IndividualAirtimeUsage(datetime, streamType, trafficType, calledMsisdn, balanceType, amount, duration, actualUsage, downLink, upLink, description);
        int i2 = copydefault + 49;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
        return individualAirtimeUsage;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 105;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndividualAirtimeUsage)) {
            int i2 = copydefault + 21;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        IndividualAirtimeUsage individualAirtimeUsage = (IndividualAirtimeUsage) other;
        if (Intrinsics.areEqual(this.datetime, individualAirtimeUsage.datetime) && Intrinsics.areEqual(this.streamType, individualAirtimeUsage.streamType)) {
            if (!Intrinsics.areEqual(this.trafficType, individualAirtimeUsage.trafficType)) {
                int i4 = copydefault + 59;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.calledMsisdn, individualAirtimeUsage.calledMsisdn)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.balanceType, individualAirtimeUsage.balanceType)) {
                int i6 = copydefault + 91;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.amount, individualAirtimeUsage.amount) || !Intrinsics.areEqual(this.duration, individualAirtimeUsage.duration)) {
                return false;
            }
            if (Intrinsics.areEqual(this.actualUsage, individualAirtimeUsage.actualUsage)) {
                return Intrinsics.areEqual(this.downLink, individualAirtimeUsage.downLink) && Intrinsics.areEqual(this.upLink, individualAirtimeUsage.upLink) && !(Intrinsics.areEqual(this.description, individualAirtimeUsage.description) ^ true);
            }
            int i8 = component1 + 97;
            copydefault = i8 % 128;
            return i8 % 2 == 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((((((this.datetime.hashCode() * 31) + this.streamType.hashCode()) * 31) + this.trafficType.hashCode()) * 31) + this.calledMsisdn.hashCode()) * 31) + this.balanceType.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.duration.hashCode()) * 31) + this.actualUsage.hashCode()) * 31) + this.downLink.hashCode()) * 31) + this.upLink.hashCode()) * 31) + this.description.hashCode();
        int i4 = component1 + 65;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IndividualAirtimeUsage(datetime=" + this.datetime + ", streamType=" + this.streamType + ", trafficType=" + this.trafficType + ", calledMsisdn=" + this.calledMsisdn + ", balanceType=" + this.balanceType + ", amount=" + this.amount + ", duration=" + this.duration + ", actualUsage=" + this.actualUsage + ", downLink=" + this.downLink + ", upLink=" + this.upLink + ", description=" + this.description + ")";
        int i2 = copydefault + 23;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.datetime);
        dest.writeString(this.streamType);
        dest.writeString(this.trafficType);
        dest.writeString(this.calledMsisdn);
        dest.writeString(this.balanceType);
        dest.writeString(this.amount);
        dest.writeString(this.duration);
        dest.writeString(this.actualUsage);
        dest.writeString(this.downLink);
        dest.writeString(this.upLink);
        dest.writeString(this.description);
        int i4 = copydefault + 9;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndividualAirtimeUsage> {
        private static short[] component3;
        private static final byte[] $$c = {79, Ascii.ETB, 89, Ascii.VT};
        private static final int $$f = 250;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {4, 8, -22, -73, Ascii.VT, -3, -64, 56, 7, -1, -9, 4, -8, -56, TarHeader.LF_BLK, Ascii.SO, 6, -10, 3, -6, -66, 69, -12, 4, -4, -62, 68, -12, -8, 2, 0, -2, -55, 65, 1, -4, 4, -6, -14, Ascii.DC2, -16, -57, Ascii.DC2, 44, 10, -42, 33, -4, 4, -6, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, PSSSigner.TRAILER_IMPLICIT};
        private static final int $$e = 12;
        private static final byte[] $$a = {120, -46, -95, -23, -37, -9, -33, -3, 17, -45, -35, 3, -4, -4, -26, -49, 3, -35, -1, -28, -14, -19, -15, -15, -7, -25, -22, TarHeader.LF_SYMLINK, -28, -17, -25, 5, -17, -17, -11, -36, -7, -24};
        private static final int $$b = 48;
        private static int equals = 0;
        private static int copy = 1;
        private static int ShareDataUIState = 71120076;
        private static int copydefault = -238323917;
        private static int component1 = 598421008;
        private static byte[] component2 = {73, -75, 66, 104, -105, 73, -80, SignedBytes.MAX_POWER_OF_TWO, -69, 103, 100, -6, 69, 0, -117, -70, -69, PSSSigner.TRAILER_IMPLICIT, 79, -73, 76, -62, 62, -49, TarHeader.LF_SYMLINK, TarHeader.LF_LINK, -58, 41, -44, -59, -56, 57, TarHeader.LF_DIR, -49, Base64.padSymbol, 105, -106, -103, 96, 126, -79, 111, 97, -103, 103, -97, 123, 72, 121, -44, 106, 101, 89, -96, -111, -112, -105, 100, -100, 103, 99, -102, 105, -113, 98, 102, 97, 96, -100, -77, 81, -102, -107, 111, -100, 97, -114, 41, 41, 41, 41};

        private static String $$g(short s, byte b2, byte b3) {
            byte[] bArr = $$c;
            int i = s + 112;
            int i2 = (b3 * 3) + 4;
            int i3 = b2 * 3;
            byte[] bArr2 = new byte[1 - i3];
            int i4 = 0 - i3;
            int i5 = -1;
            if (bArr == null) {
                int i6 = i2 + i4;
                i2++;
                i = i6;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i;
                if (i5 == i4) {
                    return new String(bArr2, 0);
                }
                int i7 = i2;
                i2 = i7 + 1;
                i += bArr[i2];
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(short r5, int r6, byte r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 16
                int r6 = 99 - r6
                byte[] r0 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeUsage.Creator.$$a
                int r5 = r5 * 3
                int r5 = r5 + 4
                int r7 = r7 + 10
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r7
                r3 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L24:
                r4 = r0[r5]
            L26:
                int r5 = r5 + 1
                int r4 = -r4
                int r6 = r6 + r4
                int r6 = r6 + (-16)
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeUsage.Creator.a(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void c(byte r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeUsage.Creator.$$d
                int r7 = r7 * 46
                int r7 = 49 - r7
                int r9 = r9 * 2
                int r9 = r9 + 99
                int r8 = r8 * 37
                int r8 = r8 + 10
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r9
                r4 = r2
                r9 = r7
                goto L2e
            L17:
                r3 = r2
            L18:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r6
            L2e:
                int r7 = r7 + r3
                int r7 = r7 + 1
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeUsage.Creator.c(byte, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a6 A[PHI: r4
  0x00a6: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v20 byte[]) binds: [B:23:0x00a4, B:20:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01a0  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01f6 A[PHI: r0
  0x01f6: PHI (r0v10 int) = (r0v9 int), (r0v45 int) binds: [B:55:0x01f4, B:52:0x01e2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01f8 A[PHI: r0
  0x01f8: PHI (r0v42 int) = (r0v9 int), (r0v45 int) binds: [B:55:0x01f4, B:52:0x01e2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x02bd  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x02e1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void b(short r24, byte r25, int r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 806
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeUsage.Creator.b(short, byte, int, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:22:0x02b1  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeUsage[] newArray(int r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 1900
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeUsage.Creator.newArray(int):com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualAirtimeUsage[]");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IndividualAirtimeUsage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            IndividualAirtimeUsage individualAirtimeUsage = new IndividualAirtimeUsage(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = equals + 117;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return individualAirtimeUsage;
        }

        @Override
        public IndividualAirtimeUsage createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copy + 33;
            equals = i2 % 128;
            int i3 = i2 % 2;
            IndividualAirtimeUsage individualAirtimeUsageCreateFromParcel = createFromParcel(parcel);
            int i4 = copy + 25;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return individualAirtimeUsageCreateFromParcel;
        }

        @Override
        public IndividualAirtimeUsage[] newArray(int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = copy + 29;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            IndividualAirtimeUsage[] individualAirtimeUsageArrNewArray = newArray(i);
            int i4 = copy + 85;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return individualAirtimeUsageArrNewArray;
        }
    }
}
