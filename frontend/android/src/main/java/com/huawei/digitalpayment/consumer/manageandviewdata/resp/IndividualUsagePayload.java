package com.huawei.digitalpayment.consumer.manageandviewdata.resp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/resp/IndividualUsagePayload;", "Landroid/os/Parcelable;", "msisdn", "", "startDate", "endDate", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "serviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getStartDate", "getEndDate", "getCategory", "getServiceId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcManageAndViewData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IndividualUsagePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<IndividualUsagePayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
    private final String category;

    @SerializedName("endDate")
    private final String endDate;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("serviceId")
    private final String serviceId;

    @SerializedName("startDate")
    private final String startDate;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IndividualUsagePayload> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IndividualUsagePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            IndividualUsagePayload individualUsagePayload = new IndividualUsagePayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 47;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return individualUsagePayload;
        }

        @Override
        public IndividualUsagePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 53;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            IndividualUsagePayload individualUsagePayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 25;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return individualUsagePayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final IndividualUsagePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 81;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            IndividualUsagePayload[] individualUsagePayloadArr = new IndividualUsagePayload[i];
            int i6 = i4 + 99;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return individualUsagePayloadArr;
        }

        @Override
        public IndividualUsagePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 29;
            component1 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                newArray(i);
                obj.hashCode();
                throw null;
            }
            IndividualUsagePayload[] individualUsagePayloadArrNewArray = newArray(i);
            int i4 = copydefault + 107;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return individualUsagePayloadArrNewArray;
            }
            throw null;
        }
    }

    public IndividualUsagePayload(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.msisdn = str;
        this.startDate = str2;
        this.endDate = str3;
        this.category = str4;
        this.serviceId = str5;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 85;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStartDate() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.startDate;
        int i4 = i2 + 23;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getEndDate() throws Throwable {
        int i;
        int i2;
        long j;
        int i3;
        long j2;
        int i4 = 2 % 2;
        int i5 = component2 + 87;
        copydefault = i5 % 128;
        int i6 = 0;
        if (i5 % 2 != 0) {
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - Color.green(0), 33 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 19696), 518907119, false, "component3", null);
            }
            int i7 = ((Field) objCopydefault).getInt(null);
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getEdgeSlop() >> 16), 29 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) Drawable.resolveOpacity(0, 0), 55511118, false, "component2", null);
            }
            i = ((Field) objCopydefault2).getInt(null);
            j2 = i;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36, TextUtils.indexOf("", "", 0, 0) + 30, (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 58536393, false, "component3", null);
            }
            int i8 = ((Field) objCopydefault3).getInt(null);
            long j3 = 69;
            long j4 = -1;
            long j5 = j4 ^ 2998107200943282634L;
            long j6 = j4 ^ (-2205403747299078210L);
            long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            j = (((long) 70) * 2998107200943282634L) + (((long) (-68)) * (-2205403747299078210L)) + (((((j5 | j6) | startElapsedRealtime) ^ j4) | (((-1585268176937033730L) | startElapsedRealtime) ^ j4)) * j3) + (((long) (-69)) * (((j5 | (-2205403747299078210L)) ^ j4) | ((j5 | startElapsedRealtime) ^ j4) | ((startElapsedRealtime | (-2205403747299078210L)) ^ j4))) + (j3 * (j4 ^ (j6 | 2998107200943282634L)));
            i3 = i7;
            i2 = i8;
        } else {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - View.MeasureSpec.getSize(0), 33 - View.MeasureSpec.getMode(0), (char) (KeyEvent.getDeadChar(0, 0) + 19696), 518907119, false, "component3", null);
            }
            int i9 = ((Field) objCopydefault4).getInt(null);
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(36 - TextUtils.indexOf((CharSequence) "", '0', 0), 30 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), 55511118, false, "component2", null);
            }
            i = ((Field) objCopydefault5).getInt(null);
            long j7 = i;
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(37 - KeyEvent.getDeadChar(0, 0), 30 - (ViewConfiguration.getTouchSlop() >> 8), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 58536393, false, "component3", null);
            }
            i2 = ((Field) objCopydefault6).getInt(null);
            long j8 = -1;
            long j9 = j8 ^ 4016391901750720882L;
            long jMyUid = (((long) Process.myUid()) | (-3223688448106516458L)) ^ j8;
            j = (((long) (-109)) * 4016391901750720882L) + (((long) 111) * (-3223688448106516458L)) + (((long) (-220)) * (j9 | jMyUid)) + (((long) 220) * (((-576672478242277002L) ^ j8) | jMyUid)) + (((long) 110) * (((4016391901750720882L | (j8 ^ (-3223688448106516458L))) ^ j8) | ((j9 | (-3223688448106516458L)) ^ j8)));
            i3 = i9;
            j2 = j7;
            i6 = 0;
        }
        while (true) {
            int i10 = component2 + 99;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            for (int i12 = 0; i12 != 8; i12++) {
                i2 = (((((int) (j2 >> i12)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
            }
            if (i6 != 0) {
                break;
            }
            i6++;
            j2 = j;
        }
        if (i2 != i3) {
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 67, 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 19696), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault7).get(null);
            long j10 = -1;
            long j11 = 0;
            long j12 = (((long) (i3 ^ i)) & ((((long) 0) << 32) | (j10 - ((j10 >> 63) << 32)))) | (((long) 1) << 32) | (j11 - ((j11 >> 63) << 32));
            try {
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(0, 0) + 6618, Drawable.resolveOpacity(0, 0) + 42, (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault8).invoke(null, null);
                Object[] objArr = {827711844, Long.valueOf(j12), obj, null, false, false};
                Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault9 == null) {
                    objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 56, (char) (ViewConfiguration.getTapTimeout() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault9).invoke(objInvoke, objArr);
                Toast.makeText((Context) null, i / (((i - 1) * i) % 2), 0).show();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        return this.endDate;
    }

    public final String getCategory() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.category;
        int i5 = i2 + 73;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getServiceId() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.serviceId;
        int i4 = i3 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = ShareDataUIState + 55;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 92 / 0;
        }
    }

    public static IndividualUsagePayload copy$default(IndividualUsagePayload individualUsagePayload, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = individualUsagePayload.msisdn;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            int i3 = copydefault + 93;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            str2 = individualUsagePayload.startDate;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            int i5 = copydefault + 99;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str3 = individualUsagePayload.endDate;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = individualUsagePayload.category;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            int i7 = copydefault + 97;
            component2 = i7 % 128;
            if (i7 % 2 == 0) {
                String str10 = individualUsagePayload.serviceId;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str5 = individualUsagePayload.serviceId;
        }
        return individualUsagePayload.copy(str6, str7, str8, str9, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.msisdn;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 77;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.startDate;
        int i5 = i2 + 25;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.endDate;
        int i5 = i2 + 63;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 89 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.category;
        int i4 = i2 + 15;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.serviceId;
        int i5 = i2 + 101;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IndividualUsagePayload copy(String msisdn, String startDate, String endDate, String category, String serviceId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(startDate, "");
        Intrinsics.checkNotNullParameter(endDate, "");
        IndividualUsagePayload individualUsagePayload = new IndividualUsagePayload(msisdn, startDate, endDate, category, serviceId);
        int i2 = copydefault + 87;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return individualUsagePayload;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 37;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndividualUsagePayload)) {
            return false;
        }
        IndividualUsagePayload individualUsagePayload = (IndividualUsagePayload) other;
        if (Intrinsics.areEqual(this.msisdn, individualUsagePayload.msisdn) && !(!Intrinsics.areEqual(this.startDate, individualUsagePayload.startDate))) {
            if (Intrinsics.areEqual(this.endDate, individualUsagePayload.endDate)) {
                return Intrinsics.areEqual(this.category, individualUsagePayload.category) && Intrinsics.areEqual(this.serviceId, individualUsagePayload.serviceId);
            }
            int i4 = component2 + 91;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        String str;
        int iHashCode4;
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        int iHashCode5 = 0;
        if (i2 % 2 == 0) {
            iHashCode = this.msisdn.hashCode();
            iHashCode2 = this.startDate.hashCode();
            iHashCode3 = this.endDate.hashCode();
            str = this.category;
            iHashCode4 = 1;
            if (str != null) {
                iHashCode5 = 1;
                iHashCode4 = iHashCode5;
                iHashCode5 = str.hashCode();
            }
        } else {
            iHashCode = this.msisdn.hashCode();
            iHashCode2 = this.startDate.hashCode();
            iHashCode3 = this.endDate.hashCode();
            str = this.category;
            if (str == null) {
                iHashCode4 = 0;
            } else {
                iHashCode4 = iHashCode5;
                iHashCode5 = str.hashCode();
            }
        }
        String str2 = this.serviceId;
        if (str2 != null) {
            iHashCode4 = str2.hashCode();
            int i3 = copydefault + 83;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IndividualUsagePayload(msisdn=" + this.msisdn + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", category=" + this.category + ", serviceId=" + this.serviceId + ")";
        int i2 = copydefault + 65;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.startDate);
        dest.writeString(this.endDate);
        dest.writeString(this.category);
        dest.writeString(this.serviceId);
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
    }
}
