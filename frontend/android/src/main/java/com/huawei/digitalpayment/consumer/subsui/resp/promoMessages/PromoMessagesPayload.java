package com.huawei.digitalpayment.consumer.subsui.resp.promoMessages;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/resp/promoMessages/PromoMessagesPayload;", "Landroid/os/Parcelable;", "msisdn", "", "senderId", "operation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getSenderId", "getOperation", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PromoMessagesPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PromoMessagesPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("operation")
    private final String operation;

    @SerializedName("senderId")
    private final String senderId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoMessagesPayload> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PromoMessagesPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            PromoMessagesPayload promoMessagesPayload = new PromoMessagesPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 17;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return promoMessagesPayload;
        }

        @Override
        public PromoMessagesPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 115;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            PromoMessagesPayload promoMessagesPayloadCreateFromParcel = createFromParcel(parcel);
            int i3 = component2 + 113;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return promoMessagesPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PromoMessagesPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 57;
            component1 = i3 % 128;
            PromoMessagesPayload[] promoMessagesPayloadArr = new PromoMessagesPayload[i];
            if (i3 % 2 != 0) {
                return promoMessagesPayloadArr;
            }
            throw null;
        }

        @Override
        public PromoMessagesPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 25;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            PromoMessagesPayload[] promoMessagesPayloadArrNewArray = newArray(i);
            int i5 = component2 + 125;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return promoMessagesPayloadArrNewArray;
        }
    }

    public PromoMessagesPayload(String str, String str2, String str3) {
        this.msisdn = str;
        this.senderId = str2;
        this.operation = str3;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 89;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSenderId() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.senderId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getOperation() throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 57;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 67, (Process.myTid() >> 22) + 33, (char) (19696 - (ViewConfiguration.getTapTimeout() >> 16)), 518907119, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionType(0L) + 37, 30 - KeyEvent.keyCodeFromString(""), (char) Color.alpha(0), 55511118, false, "component2", null);
        }
        int i5 = ((Field) objCopydefault2).getInt(null);
        long j = i5;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getWindowTouchSlop() >> 8), 30 - TextUtils.indexOf("", "", 0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 1), 58536393, false, "component3", null);
        }
        int i6 = ((Field) objCopydefault3).getInt(null);
        long j2 = -318;
        long j3 = -1;
        long j4 = j3 ^ 2166019925299839137L;
        long j5 = j3 ^ (-1373316471655634713L);
        long jMyPid = Process.myPid();
        long j6 = (((long) (-317)) * 2166019925299839137L) + (((long) 319) * (-1373316471655634713L)) + (((((j4 | j5) | jMyPid) ^ j3) | (((jMyPid ^ j3) | (-72057636988655385L)) ^ j3)) * j2) + (j2 * (((j5 | 2166019925299839137L) ^ j3) | ((jMyPid | 2166019925299839137L) ^ j3))) + (((long) TypedValues.AttributesType.TYPE_PIVOT_TARGET) * (j5 | (j3 ^ (j4 | jMyPid))));
        int i7 = component2 + 49;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (true) {
            int i10 = 0;
            while (i10 != 8) {
                int i11 = component1 + 95;
                component2 = i11 % 128;
                if (i11 % 2 != 0) {
                    i6 = (((((int) (j << i10)) & 17283) - (i6 - 57)) % (i6 * 100)) / i6;
                    i10 += 25;
                } else {
                    i6 = (((((int) (j >> i10)) & 255) + (i6 << 6)) + (i6 << 16)) - i6;
                    i10++;
                }
            }
            if (i9 != 0) {
                break;
            }
            i9++;
            int i12 = component2 + 9;
            component1 = i12 % 128;
            int i13 = i12 % 2;
            j = j6;
        }
        if (i6 != i4) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 67, (ViewConfiguration.getScrollBarSize() >> 8) + 33, (char) (19696 - Gravity.getAbsoluteGravity(0, 0)), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j7 = -1;
            long j8 = ((long) (i5 ^ i4)) & ((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32)));
            long j9 = 0;
            long j10 = j8 | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6666 - AndroidCharacter.getMirror('0'), TextUtils.indexOf((CharSequence) "", '0') + 43, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {-323484859, Long.valueOf(j10), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(0, 0) + 6562, 55 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
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
        return this.operation;
    }

    static {
        int i = ShareDataUIState + 81;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static PromoMessagesPayload copy$default(PromoMessagesPayload promoMessagesPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component1 + 19;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                str = promoMessagesPayload.msisdn;
                int i4 = 90 / 0;
            } else {
                str = promoMessagesPayload.msisdn;
            }
        }
        if ((i & 2) != 0) {
            int i5 = component2;
            int i6 = i5 + 67;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            String str4 = promoMessagesPayload.senderId;
            int i8 = i5 + 109;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            str2 = str4;
        }
        if ((i & 4) != 0) {
            str3 = promoMessagesPayload.operation;
        }
        return promoMessagesPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 79;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.senderId;
        int i4 = i3 + 45;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.operation;
        int i5 = i3 + 57;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PromoMessagesPayload copy(String msisdn, String senderId, String operation) {
        int i = 2 % 2;
        PromoMessagesPayload promoMessagesPayload = new PromoMessagesPayload(msisdn, senderId, operation);
        int i2 = component2 + 57;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 93 / 0;
        }
        return promoMessagesPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 41;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 17;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 41;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            int i5 = i2 + 21;
            component2 = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(other instanceof PromoMessagesPayload)) {
            int i6 = i4 + 43;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        PromoMessagesPayload promoMessagesPayload = (PromoMessagesPayload) other;
        if ((!Intrinsics.areEqual(this.msisdn, promoMessagesPayload.msisdn)) || !Intrinsics.areEqual(this.senderId, promoMessagesPayload.senderId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.operation, promoMessagesPayload.operation)) {
            return true;
        }
        int i8 = component1 + 29;
        component2 = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.senderId;
        if (str2 == null) {
            int i4 = component1 + 117;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.operation;
        int iHashCode3 = (((iHashCode2 * 31) + iHashCode) * 31) + (str3 != null ? str3.hashCode() : 0);
        int i6 = component1 + 91;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PromoMessagesPayload(msisdn=" + this.msisdn + ", senderId=" + this.senderId + ", operation=" + this.operation + ")";
        int i2 = component1 + 25;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.senderId);
        dest.writeString(this.operation);
        int i4 = component2 + 121;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
