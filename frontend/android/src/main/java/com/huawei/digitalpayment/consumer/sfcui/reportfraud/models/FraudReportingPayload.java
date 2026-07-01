package com.huawei.digitalpayment.consumer.sfcui.reportfraud.models;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003Jc\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÇ\u0001J\b\u0010\"\u001a\u00020#H\u0007J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H×\u0003J\t\u0010(\u001a\u00020#H×\u0001J\t\u0010)\u001a\u00020\u0003H×\u0001J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006/"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/models/FraudReportingPayload;", "Landroid/os/Parcelable;", "amountLost", "", "fraudType", "initialSMS", "lossChannel", "obNumber", "policeStation", "reportedNumber", "reportingNumber", "secondaryNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmountLost", "()Ljava/lang/String;", "getFraudType", "getInitialSMS", "getLossChannel", "getObNumber", "getPoliceStation", "getReportedNumber", "getReportingNumber", "getSecondaryNumber", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FraudReportingPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FraudReportingPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @SerializedName("amountLost")
    private final String amountLost;

    @SerializedName("fraudType")
    private final String fraudType;

    @SerializedName("initialSMS")
    private final String initialSMS;

    @SerializedName("lossChannel")
    private final String lossChannel;

    @SerializedName("obNumber")
    private final String obNumber;

    @SerializedName("policeStation")
    private final String policeStation;

    @SerializedName("reportedNumber")
    private final String reportedNumber;

    @SerializedName("reportingNumber")
    private final String reportingNumber;

    @SerializedName("secondaryNumber")
    private final String secondaryNumber;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FraudReportingPayload> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FraudReportingPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FraudReportingPayload fraudReportingPayload = new FraudReportingPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 29;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return fraudReportingPayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FraudReportingPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 7;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            FraudReportingPayload fraudReportingPayloadCreateFromParcel = createFromParcel(parcel);
            int i3 = component3 + 27;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return fraudReportingPayloadCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FraudReportingPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 29;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            FraudReportingPayload[] fraudReportingPayloadArr = new FraudReportingPayload[i];
            int i6 = i4 + 71;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return fraudReportingPayloadArr;
        }

        @Override
        public FraudReportingPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 121;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            FraudReportingPayload[] fraudReportingPayloadArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 79 / 0;
            }
            return fraudReportingPayloadArrNewArray;
        }
    }

    public FraudReportingPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.amountLost = str;
        this.fraudType = str2;
        this.initialSMS = str3;
        this.lossChannel = str4;
        this.obNumber = str5;
        this.policeStation = str6;
        this.reportedNumber = str7;
        this.reportingNumber = str8;
        this.secondaryNumber = str9;
    }

    public final String getAmountLost() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.amountLost;
        }
        throw null;
    }

    public final String getFraudType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.fraudType;
        int i5 = i2 + 39;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getInitialSMS() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.initialSMS;
        int i5 = i3 + 79;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getLossChannel() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.lossChannel;
        int i5 = i2 + 19;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getObNumber() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.obNumber;
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        return str;
    }

    public final String getPoliceStation() {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.policeStation;
        }
        throw null;
    }

    public final String getReportedNumber() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.reportedNumber;
        int i5 = i2 + 61;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getReportingNumber() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.reportingNumber;
        int i5 = i3 + 73;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getSecondaryNumber() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.secondaryNumber;
        int i5 = i3 + 59;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public String toString() throws Throwable {
        int i = 2 % 2;
        String str = this.amountLost;
        String str2 = this.fraudType;
        String str3 = this.initialSMS;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - Color.alpha(0), 33 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.lastIndexOf("", '0', 0) + 19697), 518907119, false, "component3", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (KeyEvent.getMaxKeyCode() >> 16), 30 - KeyEvent.keyCodeFromString(""), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 55511118, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault2).getInt(null);
        long j = i3;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - Gravity.getAbsoluteGravity(0, 0), 30 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 58536393, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault3).getInt(null);
        long j2 = -574;
        long j3 = -1;
        long j4 = j3 ^ 1075899553394923052L;
        long jIdentityHashCode = System.identityHashCode(this);
        long j5 = jIdentityHashCode ^ j3;
        long j6 = ((j3 ^ (-283196099750718628L)) | jIdentityHashCode) ^ j3;
        long j7 = (j2 * 1075899553394923052L) + (j2 * (-283196099750718628L)) + (((long) 1150) * (((j4 | j5) ^ j3) | j6)) + (((long) (-575)) * (j6 | ((j5 | (-283196099750718628L)) ^ j3))) + (((long) 575) * (((j5 | 1075899553394923052L) ^ j3) | ((j4 | jIdentityHashCode) ^ j3)));
        int i5 = component1 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (true) {
            for (int i8 = 0; i8 != 8; i8++) {
                i4 = (((((int) (j >> i8)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
            }
            if (i7 != 0) {
                break;
            }
            i7++;
            int i9 = component1 + 65;
            component2 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 2 / 2;
            }
            j = j7;
        }
        if (i4 != i2) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - KeyEvent.keyCodeFromString(""), 32 - ImageFormat.getBitsPerPixel(0), (char) (19696 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j8 = -1;
            long j9 = 0;
            long j10 = (((long) (i3 ^ i2)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 6618, 42 - Color.alpha(0), (char) KeyEvent.getDeadChar(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {-1885724015, Long.valueOf(j10), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 57, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                throw new RuntimeException(String.valueOf(i3));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return "FraudReportingPayload(amountLost=" + str + ", fraudType=" + str2 + ", initialSMS=" + str3 + ", lossChannel=" + this.lossChannel + ", obNumber=" + this.obNumber + ", policeStation=" + this.policeStation + ", reportedNumber=" + this.reportedNumber + ", reportingNumber=" + this.reportingNumber + ", secondaryNumber=" + this.secondaryNumber + ")";
    }

    static {
        int i = component3 + 65;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
    }

    public static FraudReportingPayload copy$default(FraudReportingPayload fraudReportingPayload, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        String str10;
        String str11;
        String str12;
        int i2 = 2 % 2;
        int i3 = component1 + 111;
        int i4 = i3 % 128;
        component2 = i4;
        String str13 = (i3 % 2 == 0 || (i & 1) == 0) ? str : fraudReportingPayload.amountLost;
        String str14 = (i & 2) != 0 ? fraudReportingPayload.fraudType : str2;
        if ((i & 4) != 0) {
            int i5 = i4 + 93;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str10 = fraudReportingPayload.initialSMS;
        } else {
            str10 = str3;
        }
        String str15 = (i & 8) != 0 ? fraudReportingPayload.lossChannel : str4;
        String str16 = (i & 16) != 0 ? fraudReportingPayload.obNumber : str5;
        String str17 = (i & 32) != 0 ? fraudReportingPayload.policeStation : str6;
        Object obj2 = null;
        if ((i & 64) != 0) {
            int i7 = component1;
            int i8 = i7 + 93;
            component2 = i8 % 128;
            if (i8 % 2 == 0) {
                String str18 = fraudReportingPayload.reportedNumber;
                obj2.hashCode();
                throw null;
            }
            str11 = fraudReportingPayload.reportedNumber;
            int i9 = i7 + 25;
            component2 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            str11 = str7;
        }
        if ((i & 128) != 0) {
            int i11 = component1 + 67;
            component2 = i11 % 128;
            if (i11 % 2 == 0) {
                String str19 = fraudReportingPayload.reportingNumber;
                throw null;
            }
            str12 = fraudReportingPayload.reportingNumber;
        } else {
            str12 = str8;
        }
        return fraudReportingPayload.copy(str13, str14, str10, str15, str16, str17, str11, str12, (i & 256) != 0 ? fraudReportingPayload.secondaryNumber : str9);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.amountLost;
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 19;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.fraudType;
        int i5 = i3 + 17;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 91;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.initialSMS;
            int i4 = 92 / 0;
        } else {
            str = this.initialSMS;
        }
        int i5 = i2 + 33;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.lossChannel;
        int i5 = i3 + 39;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 37;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.obNumber;
        int i5 = i3 + 99;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.policeStation;
        int i5 = i3 + 105;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component2 + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.reportedNumber;
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.reportingNumber;
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.secondaryNumber;
        int i5 = i2 + 15;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final FraudReportingPayload copy(String amountLost, String fraudType, String initialSMS, String lossChannel, String obNumber, String policeStation, String reportedNumber, String reportingNumber, String secondaryNumber) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amountLost, "");
        Intrinsics.checkNotNullParameter(fraudType, "");
        Intrinsics.checkNotNullParameter(initialSMS, "");
        Intrinsics.checkNotNullParameter(lossChannel, "");
        Intrinsics.checkNotNullParameter(obNumber, "");
        Intrinsics.checkNotNullParameter(policeStation, "");
        Intrinsics.checkNotNullParameter(reportedNumber, "");
        Intrinsics.checkNotNullParameter(reportingNumber, "");
        Intrinsics.checkNotNullParameter(secondaryNumber, "");
        FraudReportingPayload fraudReportingPayload = new FraudReportingPayload(amountLost, fraudType, initialSMS, lossChannel, obNumber, policeStation, reportedNumber, reportingNumber, secondaryNumber);
        int i2 = component1 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return fraudReportingPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        component2 = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 91;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(other instanceof FraudReportingPayload)) {
            return false;
        }
        FraudReportingPayload fraudReportingPayload = (FraudReportingPayload) other;
        if (!Intrinsics.areEqual(this.amountLost, fraudReportingPayload.amountLost) || !Intrinsics.areEqual(this.fraudType, fraudReportingPayload.fraudType) || !Intrinsics.areEqual(this.initialSMS, fraudReportingPayload.initialSMS)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.lossChannel, fraudReportingPayload.lossChannel)) {
            int i3 = component1 + 57;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.obNumber, fraudReportingPayload.obNumber) || !Intrinsics.areEqual(this.policeStation, fraudReportingPayload.policeStation) || !Intrinsics.areEqual(this.reportedNumber, fraudReportingPayload.reportedNumber)) {
            return false;
        }
        if (Intrinsics.areEqual(this.reportingNumber, fraudReportingPayload.reportingNumber)) {
            return !(Intrinsics.areEqual(this.secondaryNumber, fraudReportingPayload.secondaryNumber) ^ true);
        }
        int i5 = component1 + 65;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 30 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((this.amountLost.hashCode() * 31) + this.fraudType.hashCode()) * 31) + this.initialSMS.hashCode()) * 31) + this.lossChannel.hashCode()) * 31) + this.obNumber.hashCode()) * 31) + this.policeStation.hashCode()) * 31) + this.reportedNumber.hashCode()) * 31) + this.reportingNumber.hashCode()) * 31) + this.secondaryNumber.hashCode();
        int i4 = component1 + 123;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return iHashCode;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.amountLost);
        dest.writeString(this.fraudType);
        dest.writeString(this.initialSMS);
        dest.writeString(this.lossChannel);
        dest.writeString(this.obNumber);
        dest.writeString(this.policeStation);
        dest.writeString(this.reportedNumber);
        dest.writeString(this.reportingNumber);
        dest.writeString(this.secondaryNumber);
        int i4 = component2 + 67;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
