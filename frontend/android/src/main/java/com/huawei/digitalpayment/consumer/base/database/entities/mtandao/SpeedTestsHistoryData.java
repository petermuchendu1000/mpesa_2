package com.huawei.digitalpayment.consumer.base.database.entities.mtandao;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.common.utils.RequestAPIConfigUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003Jc\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0006\u0010/\u001a\u00020\u0003J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016¨\u0006;"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/SpeedTestsHistoryData;", "Landroid/os/Parcelable;", "recordId", "", "testDateTime", "", "ping", RequestAPIConfigUtils.PARAM_TYPE_SUPPORT_UPLOAD, RequestAPIConfigUtils.PARAM_TYPE_SUPPORT_DOWNLOAD, "latency", "jitter", "dataconntype", "dataconnetwork", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRecordId", "()I", "setRecordId", "(I)V", "getTestDateTime", "()Ljava/lang/String;", "setTestDateTime", "(Ljava/lang/String;)V", "getPing", "setPing", "getUpload", "setUpload", "getDownload", "setDownload", "getLatency", "setLatency", "getJitter", "setJitter", "getDataconntype", "setDataconntype", "getDataconnetwork", "setDataconnetwork", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpeedTestsHistoryData implements Parcelable {
    public static final Parcelable.Creator<SpeedTestsHistoryData> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private String dataconnetwork;
    private String dataconntype;
    private String download;
    private String jitter;
    private String latency;
    private String ping;
    private int recordId;
    private String testDateTime;
    private String upload;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SpeedTestsHistoryData> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SpeedTestsHistoryData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SpeedTestsHistoryData speedTestsHistoryData = new SpeedTestsHistoryData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 15;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 59 / 0;
            }
            return speedTestsHistoryData;
        }

        @Override
        public SpeedTestsHistoryData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 65;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SpeedTestsHistoryData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 51;
            int i4 = i3 % 128;
            copydefault = i4;
            SpeedTestsHistoryData[] speedTestsHistoryDataArr = new SpeedTestsHistoryData[i];
            if (i3 % 2 == 0) {
                int i5 = 27 / 0;
            }
            int i6 = i4 + 21;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return speedTestsHistoryDataArr;
        }

        @Override
        public SpeedTestsHistoryData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 55;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            SpeedTestsHistoryData[] speedTestsHistoryDataArrNewArray = newArray(i);
            int i4 = copydefault + 55;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
            return speedTestsHistoryDataArrNewArray;
        }
    }

    public SpeedTestsHistoryData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.recordId = i;
        this.testDateTime = str;
        this.ping = str2;
        this.upload = str3;
        this.download = str4;
        this.latency = str5;
        this.jitter = str6;
        this.dataconntype = str7;
        this.dataconnetwork = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SpeedTestsHistoryData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i3 = (i2 & 1) != 0 ? 0 : i;
        String str14 = "";
        if ((i2 & 2) != 0) {
            int i4 = component2 + 115;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            str9 = "";
        } else {
            str9 = str;
        }
        Object obj = null;
        if ((i2 & 4) != 0) {
            int i6 = component2 + 65;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            str10 = "";
        } else {
            str10 = str2;
        }
        if ((i2 & 8) != 0) {
            int i7 = copydefault + 55;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str11 = "";
        } else {
            str11 = str3;
        }
        String str15 = (i2 & 16) != 0 ? "" : str4;
        if ((i2 & 32) != 0) {
            int i8 = copydefault + 59;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str12 = "";
        } else {
            str12 = str5;
        }
        if ((i2 & 64) != 0) {
            int i11 = 2 % 2;
            str13 = "";
        } else {
            str13 = str6;
        }
        String str16 = (i2 & 128) != 0 ? "" : str7;
        if ((i2 & 256) != 0) {
            int i12 = 2 % 2;
        } else {
            str14 = str8;
        }
        this(i3, str9, str10, str11, str15, str12, str13, str16, str14);
    }

    public final int getRecordId() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.recordId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRecordId(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 99;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        this.recordId = i;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 107;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final String getTestDateTime() {
        int i = 2 % 2;
        int i2 = component2 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.testDateTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTestDateTime(String str) {
        int i = 2 % 2;
        int i2 = component2 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.testDateTime = str;
        int i4 = copydefault + 113;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String getPing() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ping;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setPing(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.ping = str;
        int i4 = component2 + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getUpload() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.upload;
        int i5 = i2 + 77;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setUpload(String str) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.upload = str;
        int i4 = copydefault + 51;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDownload() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.download;
        if (i3 != 0) {
            int i4 = 32 / 0;
        }
        return str;
    }

    public final void setDownload(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.download = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.download = str;
        int i3 = copydefault + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getLatency() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.latency;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setLatency(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 109;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.latency = str;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        this.latency = str;
        int i3 = copydefault + 103;
        component2 = i3 % 128;
        int i4 = i3 % 2;
    }

    public final String getJitter() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.jitter;
        int i5 = i2 + 19;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setJitter(String str) {
        int i = 2 % 2;
        int i2 = component2 + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.jitter = str;
        int i4 = component2 + 85;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getDataconntype() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.dataconntype;
        int i5 = i3 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setDataconntype(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.dataconntype = str;
        int i4 = copydefault + 5;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDataconnetwork() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 99;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.dataconnetwork;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setDataconnetwork(String str) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.dataconnetwork = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.dataconnetwork = str;
            throw null;
        }
    }

    static {
        int i = component3 + 43;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public SpeedTestsHistoryData() {
        this(0, null, null, null, null, null, null, null, null, 511, null);
    }

    public static SpeedTestsHistoryData copy$default(SpeedTestsHistoryData speedTestsHistoryData, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, Object obj) {
        String str9;
        String str10;
        String str11;
        String str12;
        int i3 = 2 % 2;
        int i4 = copydefault + 55;
        int i5 = i4 % 128;
        component2 = i5;
        int i6 = i4 % 2;
        int i7 = (i2 & 1) != 0 ? speedTestsHistoryData.recordId : i;
        String str13 = (i2 & 2) != 0 ? speedTestsHistoryData.testDateTime : str;
        Object obj2 = null;
        if ((i2 & 4) != 0) {
            int i8 = i5 + 23;
            copydefault = i8 % 128;
            if (i8 % 2 == 0) {
                String str14 = speedTestsHistoryData.ping;
                throw null;
            }
            str9 = speedTestsHistoryData.ping;
        } else {
            str9 = str2;
        }
        String str15 = (i2 & 8) != 0 ? speedTestsHistoryData.upload : str3;
        if ((i2 & 16) != 0) {
            int i9 = copydefault + 125;
            component2 = i9 % 128;
            if (i9 % 2 != 0) {
                String str16 = speedTestsHistoryData.download;
                obj2.hashCode();
                throw null;
            }
            str10 = speedTestsHistoryData.download;
        } else {
            str10 = str4;
        }
        if ((i2 & 32) != 0) {
            int i10 = component2 + 63;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            str11 = speedTestsHistoryData.latency;
        } else {
            str11 = str5;
        }
        String str17 = (i2 & 64) != 0 ? speedTestsHistoryData.jitter : str6;
        String str18 = (i2 & 128) != 0 ? speedTestsHistoryData.dataconntype : str7;
        if ((i2 & 256) != 0) {
            str12 = speedTestsHistoryData.dataconnetwork;
            int i12 = copydefault + 23;
            component2 = i12 % 128;
            int i13 = i12 % 2;
        } else {
            str12 = str8;
        }
        return speedTestsHistoryData.copy(i7, str13, str9, str15, str10, str11, str17, str18, str12);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.recordId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.testDateTime;
        int i4 = i3 + 13;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.ping;
        int i5 = i3 + 109;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.upload;
        int i4 = i3 + 21;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.download;
        int i5 = i3 + 71;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.latency;
            int i4 = 56 / 0;
        } else {
            str = this.latency;
        }
        int i5 = i2 + 39;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.jitter;
        int i5 = i3 + 79;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.dataconntype;
        }
        throw null;
    }

    public final String component9() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.dataconnetwork;
            int i4 = 89 / 0;
        } else {
            str = this.dataconnetwork;
        }
        int i5 = i3 + 85;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 76 / 0;
        }
        return str;
    }

    public final SpeedTestsHistoryData copy(int recordId, String testDateTime, String ping, String upload, String download, String latency, String jitter, String dataconntype, String dataconnetwork) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(testDateTime, "");
        Intrinsics.checkNotNullParameter(ping, "");
        Intrinsics.checkNotNullParameter(upload, "");
        Intrinsics.checkNotNullParameter(download, "");
        Intrinsics.checkNotNullParameter(latency, "");
        Intrinsics.checkNotNullParameter(jitter, "");
        Intrinsics.checkNotNullParameter(dataconntype, "");
        Intrinsics.checkNotNullParameter(dataconnetwork, "");
        SpeedTestsHistoryData speedTestsHistoryData = new SpeedTestsHistoryData(recordId, testDateTime, ping, upload, download, latency, jitter, dataconntype, dataconnetwork);
        int i2 = component2 + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return speedTestsHistoryData;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 83;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 79;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SpeedTestsHistoryData)) {
            return false;
        }
        SpeedTestsHistoryData speedTestsHistoryData = (SpeedTestsHistoryData) other;
        if (this.recordId != speedTestsHistoryData.recordId) {
            int i4 = component2 + 39;
            copydefault = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.testDateTime, speedTestsHistoryData.testDateTime) || !Intrinsics.areEqual(this.ping, speedTestsHistoryData.ping)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.upload, speedTestsHistoryData.upload)) {
            int i5 = component2 + 87;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.download, speedTestsHistoryData.download)) {
            int i7 = component2 + 71;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.latency, speedTestsHistoryData.latency)) {
            return Intrinsics.areEqual(this.jitter, speedTestsHistoryData.jitter) && Intrinsics.areEqual(this.dataconntype, speedTestsHistoryData.dataconntype) && Intrinsics.areEqual(this.dataconnetwork, speedTestsHistoryData.dataconnetwork);
        }
        int i9 = copydefault + 33;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((Integer.hashCode(this.recordId) * 31) + this.testDateTime.hashCode()) * 31) + this.ping.hashCode()) * 31) + this.upload.hashCode()) * 31) + this.download.hashCode()) * 31) + this.latency.hashCode()) * 31) + this.jitter.hashCode()) * 31) + this.dataconntype.hashCode()) * 31) + this.dataconnetwork.hashCode();
        int i4 = copydefault + 35;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SpeedTestsHistoryData(recordId=" + this.recordId + ", testDateTime=" + this.testDateTime + ", ping=" + this.ping + ", upload=" + this.upload + ", download=" + this.download + ", latency=" + this.latency + ", jitter=" + this.jitter + ", dataconntype=" + this.dataconntype + ", dataconnetwork=" + this.dataconnetwork + ")";
        int i2 = copydefault + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.recordId);
        dest.writeString(this.testDateTime);
        dest.writeString(this.ping);
        dest.writeString(this.upload);
        dest.writeString(this.download);
        dest.writeString(this.latency);
        dest.writeString(this.jitter);
        dest.writeString(this.dataconntype);
        dest.writeString(this.dataconnetwork);
        int i4 = copydefault + 63;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
