package com.huawei.digitalpayment.consumer.miniapps.bridge;

import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0003H×\u0001J\t\u0010\u001d\u001a\u00020\u0005H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003H\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/bridge/BuygoodsMiniAppBean;", "Landroid/os/Parcelable;", "amount", "", "tillNumber", "", "currency", ImtConstants.KEY_REASON, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTillNumber", "()Ljava/lang/String;", "getCurrency", "getReason", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/miniapps/bridge/BuygoodsMiniAppBean;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuygoodsMiniAppBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BuygoodsMiniAppBean> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @SerializedName("amount")
    private final Integer amount;

    @SerializedName("currency")
    private final String currency;

    @SerializedName(ImtConstants.KEY_REASON)
    private final String reason;

    @SerializedName("tillNumber")
    private final String tillNumber;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BuygoodsMiniAppBean> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BuygoodsMiniAppBean createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 93;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readInt();
                throw null;
            }
            BuygoodsMiniAppBean buygoodsMiniAppBean = new BuygoodsMiniAppBean(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
            int i4 = component2 + 19;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 47 / 0;
            }
            return buygoodsMiniAppBean;
        }

        @Override
        public BuygoodsMiniAppBean createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 27;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            BuygoodsMiniAppBean buygoodsMiniAppBeanCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 63;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return buygoodsMiniAppBeanCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BuygoodsMiniAppBean[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 77;
            component2 = i3 % 128;
            BuygoodsMiniAppBean[] buygoodsMiniAppBeanArr = new BuygoodsMiniAppBean[i];
            if (i3 % 2 == 0) {
                return buygoodsMiniAppBeanArr;
            }
            throw null;
        }

        @Override
        public BuygoodsMiniAppBean[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 77;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public BuygoodsMiniAppBean(Integer num, String str, String str2, String str3) {
        this.amount = num;
        this.tillNumber = str;
        this.currency = str2;
        this.reason = str3;
    }

    public final Integer getAmount() throws Throwable {
        int i = 2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(66 - MotionEvent.axisFromString(""), 33 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (19696 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 518907119, false, "component3", null);
        }
        int i2 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 30, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 55511118, false, "component2", null);
        }
        int i3 = ((Field) objCopydefault2).getInt(null);
        long j = i3;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 30, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 58536393, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault3).getInt(null);
        long j2 = 85;
        long j3 = (j2 * 2081470021501174418L) + (j2 * (-1288766567856969994L));
        long j4 = -84;
        long j5 = -1;
        long j6 = j5 ^ 2081470021501174418L;
        long j7 = j5 ^ (-1288766567856969994L);
        long jMyUid = Process.myUid();
        long j8 = jMyUid ^ j5;
        long j9 = (j8 | (-1288766567856969994L)) ^ j5;
        long j10 = j3 + ((((j6 | j7) ^ j5) | ((j6 | j8) ^ j5) | ((j7 | j8) ^ j5) | (((-72059831741061386L) | jMyUid) ^ j5)) * j4) + (j4 * (((j7 | jMyUid) ^ j5) | 2081470021501174418L | j9)) + (((long) 84) * (((-72059831741061386L) ^ j5) | j9));
        long j11 = j;
        int i5 = 0;
        while (true) {
            int i6 = 0;
            while (i6 != 8) {
                i4 = (((((int) (j11 >> i6)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                i6++;
                int i7 = component2 + 31;
                component1 = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 3 / 2;
                }
            }
            if (i5 != 0) {
                break;
            }
            i5++;
            j11 = j10;
        }
        if (i4 != i2) {
            int i9 = component1 + 71;
            component2 = i9 % 128;
            int i10 = i9 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 34, (char) (19696 - ExpandableListView.getPackedPositionGroup(0L)), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j12 = -1;
            long j13 = 0;
            long j14 = (((j12 - ((j12 >> 63) << 32)) | (((long) 0) << 32)) & ((long) (i2 ^ i3))) | (((long) 1) << 32) | (j13 - ((j13 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 6619, 41 - Process.getGidForName(""), (char) (Process.myPid() >> 22), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {2089034875, Long.valueOf(j14), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 6563, View.combineMeasuredStates(0, 0) + 56, (char) TextUtils.getTrimmedLength(""), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return this.amount;
    }

    public final String getTillNumber() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.tillNumber;
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return str;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.currency;
        int i4 = i3 + 99;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getReason() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.reason;
        int i5 = i3 + 13;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 93;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 8 / 0;
        }
    }

    public static BuygoodsMiniAppBean copy$default(BuygoodsMiniAppBean buygoodsMiniAppBean, Integer num, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 77;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            num = buygoodsMiniAppBean.amount;
        }
        if ((i & 2) != 0) {
            str = buygoodsMiniAppBean.tillNumber;
        }
        if ((i & 4) != 0) {
            int i5 = component2 + 123;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                String str4 = buygoodsMiniAppBean.currency;
                throw null;
            }
            str2 = buygoodsMiniAppBean.currency;
        }
        if ((i & 8) != 0) {
            str3 = buygoodsMiniAppBean.reason;
        }
        return buygoodsMiniAppBean.copy(num, str, str2, str3);
    }

    public final Integer component1() {
        Integer num;
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            num = this.amount;
            int i4 = 89 / 0;
        } else {
            num = this.amount;
        }
        int i5 = i3 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 103;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.tillNumber;
        int i5 = i2 + 49;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.currency;
            int i4 = 94 / 0;
        } else {
            str = this.currency;
        }
        int i5 = i3 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.reason;
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return str;
    }

    public final BuygoodsMiniAppBean copy(Integer amount, String tillNumber, String currency, String reason) {
        int i = 2 % 2;
        BuygoodsMiniAppBean buygoodsMiniAppBean = new BuygoodsMiniAppBean(amount, tillNumber, currency, reason);
        int i2 = component2 + 107;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return buygoodsMiniAppBean;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 57;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 15;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuygoodsMiniAppBean)) {
            return false;
        }
        BuygoodsMiniAppBean buygoodsMiniAppBean = (BuygoodsMiniAppBean) other;
        if (!Intrinsics.areEqual(this.amount, buygoodsMiniAppBean.amount) || !Intrinsics.areEqual(this.tillNumber, buygoodsMiniAppBean.tillNumber)) {
            return false;
        }
        if (Intrinsics.areEqual(this.currency, buygoodsMiniAppBean.currency)) {
            return !(Intrinsics.areEqual(this.reason, buygoodsMiniAppBean.reason) ^ true);
        }
        int i4 = component2;
        int i5 = i4 + 93;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 1;
        component1 = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 94 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        Integer num = this.amount;
        if (num == null) {
            int i2 = component2 + 67;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 / 3;
            }
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        String str = this.tillNumber;
        if (str == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str.hashCode();
            int i4 = component2 + 57;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 3;
            }
        }
        String str2 = this.currency;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.reason;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BuygoodsMiniAppBean(amount=" + this.amount + ", tillNumber=" + this.tillNumber + ", currency=" + this.currency + ", reason=" + this.reason + ")";
        int i2 = component1 + 95;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 68 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 3;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        Integer num = this.amount;
        if (num == null) {
            int i5 = component2 + 63;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        } else {
            dest.writeInt(1);
            int iIntValue = num.intValue();
            int i7 = component1 + 121;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            i = iIntValue;
        }
        dest.writeInt(i);
        dest.writeString(this.tillNumber);
        dest.writeString(this.currency);
        dest.writeString(this.reason);
    }
}
