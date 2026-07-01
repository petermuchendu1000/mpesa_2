package com.huawei.digitalpayment.consumer.base.database.entities.mtandao;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\"\u001a\u00020\u0003J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0011\"\u0004\b\u0018\u0010\u0013R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013¨\u0006."}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/LogsData;", "Landroid/os/Parcelable;", TinyAppLogUtil.TINY_APP_STANDARD_LOGID, "", "datasessionId", "", "logType", "logDateTime", "isLogSent", "logComment", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLogId", "()I", "setLogId", "(I)V", "getDatasessionId", "()Ljava/lang/String;", "setDatasessionId", "(Ljava/lang/String;)V", "getLogType", "setLogType", "getLogDateTime", "setLogDateTime", "setLogSent", "getLogComment", "setLogComment", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LogsData implements Parcelable {
    public static final Parcelable.Creator<LogsData> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private String datasessionId;
    private String isLogSent;
    private String logComment;
    private String logDateTime;
    private int logId;
    private String logType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LogsData> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final LogsData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            LogsData logsData = new LogsData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 49;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 3 / 0;
            }
            return logsData;
        }

        @Override
        public LogsData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 121;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                throw null;
            }
            LogsData logsDataCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 49;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 94 / 0;
            }
            return logsDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final LogsData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 11;
            copydefault = i3 % 128;
            LogsData[] logsDataArr = new LogsData[i];
            if (i3 % 2 != 0) {
                return logsDataArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public LogsData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 57;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            LogsData[] logsDataArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 79;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return logsDataArrNewArray;
            }
            throw null;
        }
    }

    public LogsData(int i, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.logId = i;
        this.datasessionId = str;
        this.logType = str2;
        this.logDateTime = str3;
        this.isLogSent = str4;
        this.logComment = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LogsData(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        if ((i2 & 1) != 0) {
            int i3 = component2 + 33;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        }
        String str7 = "";
        String str8 = (i2 & 2) != 0 ? "" : str;
        String str9 = (i2 & 4) != 0 ? "" : str2;
        String str10 = (i2 & 8) != 0 ? "" : str3;
        if ((i2 & 16) != 0) {
            int i5 = component3 + 87;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str6 = "";
        } else {
            str6 = str4;
        }
        if ((i2 & 32) != 0) {
            int i8 = component2 + 105;
            component3 = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str7 = str5;
        }
        this(i, str8, str9, str10, str6, str7);
    }

    public final int getLogId() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.logId;
        int i6 = i3 + 63;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final void setLogId(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 63;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.logId = i;
        if (i4 != 0) {
            throw null;
        }
    }

    public final String getDatasessionId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.datasessionId;
        int i4 = i2 + 99;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setDatasessionId(String str) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.datasessionId = str;
        int i4 = component3 + 11;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final String getLogType() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.logType;
        int i5 = i2 + 91;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setLogType(String str) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.logType = str;
        int i4 = component2 + 109;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final String getLogDateTime() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.logDateTime;
        int i5 = i3 + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setLogDateTime(String str) {
        int i = 2 % 2;
        int i2 = component2 + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.logDateTime = str;
        int i4 = component2 + 57;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }

    public final String isLogSent() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.isLogSent;
        int i5 = i3 + 77;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setLogSent(String str) {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.isLogSent = str;
        int i4 = component2 + 119;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final String getLogComment() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.logComment;
        int i5 = i3 + 115;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setLogComment(String str) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.logComment = str;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.logComment = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i = component1 + 121;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public LogsData() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static LogsData copy$default(LogsData logsData, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        int i3;
        String str6;
        String str7;
        String str8;
        int i4 = 2 % 2;
        if ((i2 & 1) != 0) {
            i3 = logsData.logId;
            int i5 = component2 + 103;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            int i7 = component3 + 47;
            component2 = i7 % 128;
            if (i7 % 2 == 0) {
                String str9 = logsData.datasessionId;
                throw null;
            }
            str6 = logsData.datasessionId;
        } else {
            str6 = str;
        }
        String str10 = (i2 & 4) != 0 ? logsData.logType : str2;
        String str11 = (i2 & 8) != 0 ? logsData.logDateTime : str3;
        if ((i2 & 16) != 0) {
            int i8 = component3;
            int i9 = i8 + 29;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            str7 = logsData.isLogSent;
            int i11 = i8 + 81;
            component2 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            str7 = str4;
        }
        if ((i2 & 32) != 0) {
            int i13 = component2 + 53;
            component3 = i13 % 128;
            int i14 = i13 % 2;
            str8 = logsData.logComment;
            if (i14 != 0) {
                int i15 = 43 / 0;
            }
        } else {
            str8 = str5;
        }
        return logsData.copy(i3, str6, str10, str11, str7, str8);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.logId;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.datasessionId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.logType;
        int i4 = i3 + 39;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.logDateTime;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 99;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.isLogSent;
            int i4 = 9 / 0;
        } else {
            str = this.isLogSent;
        }
        int i5 = i2 + 65;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.logComment;
        int i5 = i3 + 125;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final LogsData copy(int logId, String datasessionId, String logType, String logDateTime, String isLogSent, String logComment) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(datasessionId, "");
        Intrinsics.checkNotNullParameter(logType, "");
        Intrinsics.checkNotNullParameter(logDateTime, "");
        Intrinsics.checkNotNullParameter(isLogSent, "");
        Intrinsics.checkNotNullParameter(logComment, "");
        LogsData logsData = new LogsData(logId, datasessionId, logType, logDateTime, isLogSent, logComment);
        int i2 = component2 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return logsData;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogsData)) {
            return false;
        }
        LogsData logsData = (LogsData) other;
        if (this.logId != logsData.logId) {
            int i4 = i2 + 97;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.datasessionId, logsData.datasessionId) || !Intrinsics.areEqual(this.logType, logsData.logType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.logDateTime, logsData.logDateTime)) {
            int i6 = component2 + 81;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.isLogSent, logsData.isLogSent)) {
            int i8 = component3 + 71;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.logComment, logsData.logComment)) {
            return true;
        }
        int i10 = component3 + 23;
        component2 = i10 % 128;
        if (i10 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((Integer.hashCode(this.logId) * 31) + this.datasessionId.hashCode()) * 31) + this.logType.hashCode()) * 31) + this.logDateTime.hashCode()) * 31) + this.isLogSent.hashCode()) * 31) + this.logComment.hashCode();
        int i4 = component3 + 23;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LogsData(logId=" + this.logId + ", datasessionId=" + this.datasessionId + ", logType=" + this.logType + ", logDateTime=" + this.logDateTime + ", isLogSent=" + this.isLogSent + ", logComment=" + this.logComment + ")";
        int i2 = component2 + 63;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.logId);
        dest.writeString(this.datasessionId);
        dest.writeString(this.logType);
        dest.writeString(this.logDateTime);
        dest.writeString(this.isLogSent);
        dest.writeString(this.logComment);
        int i4 = component2 + 97;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
