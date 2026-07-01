package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\b\u0010\u001e\u001a\u00020\nH\u0007J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H×\u0003J\t\u0010#\u001a\u00020\nH×\u0001J\t\u0010$\u001a\u00020\u0003H×\u0001J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\nH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006*"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TunukiwaSubscribePayload;", "Landroid/os/Parcelable;", "paymentMethod", "", "offerId", "offerName", "subscriberType", "partyAMsisdn", "partyBMsisdn", "okoaAmount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getPaymentMethod", "()Ljava/lang/String;", "getOfferId", "getOfferName", "getSubscriberType", "getPartyAMsisdn", "getPartyBMsisdn", "getOkoaAmount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TunukiwaSubscribePayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TunukiwaSubscribePayload> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("offerId")
    private final String offerId;

    @SerializedName("offerName")
    private final String offerName;

    @SerializedName("okoaAmount")
    private final int okoaAmount;

    @SerializedName("partyAMsisdn")
    private final String partyAMsisdn;

    @SerializedName("partyBMsisdn")
    private final String partyBMsisdn;

    @SerializedName("paymentMethod")
    private final String paymentMethod;

    @SerializedName("subscriberType")
    private final String subscriberType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TunukiwaSubscribePayload> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TunukiwaSubscribePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            TunukiwaSubscribePayload tunukiwaSubscribePayload = new TunukiwaSubscribePayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            int i2 = component3 + 17;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return tunukiwaSubscribePayload;
        }

        @Override
        public TunukiwaSubscribePayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            TunukiwaSubscribePayload tunukiwaSubscribePayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 89 / 0;
            }
            return tunukiwaSubscribePayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final TunukiwaSubscribePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 43;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            TunukiwaSubscribePayload[] tunukiwaSubscribePayloadArr = new TunukiwaSubscribePayload[i];
            int i6 = i3 + 1;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return tunukiwaSubscribePayloadArr;
        }

        @Override
        public TunukiwaSubscribePayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 41;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            TunukiwaSubscribePayload[] tunukiwaSubscribePayloadArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 89 / 0;
            }
            return tunukiwaSubscribePayloadArrNewArray;
        }
    }

    public TunukiwaSubscribePayload(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethod = str;
        this.offerId = str2;
        this.offerName = str3;
        this.subscriberType = str4;
        this.partyAMsisdn = str5;
        this.partyBMsisdn = str6;
        this.okoaAmount = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TunukiwaSubscribePayload(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        int i3;
        if ((i2 & 1) != 0) {
            int i4 = component2 + 87;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 3;
            } else {
                int i6 = 2 % 2;
            }
            str7 = "AIRTIME";
        } else {
            str7 = str;
        }
        if ((i2 & 64) != 0) {
            int i7 = component1 + 111;
            component2 = i7 % 128;
            int i8 = 2 % 2;
            i3 = i7 % 2 != 0 ? 1 : 0;
        } else {
            i3 = i;
        }
        this(str7, str2, str3, str4, str5, str6, i3);
    }

    public final String getPaymentMethod() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paymentMethod;
        int i5 = i2 + 19;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferId() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 105;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.offerId;
            int i4 = 76 / 0;
        } else {
            str = this.offerId;
        }
        int i5 = i3 + 119;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferName() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.offerName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSubscriberType() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subscriberType;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPartyAMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.partyAMsisdn;
        int i5 = i3 + 67;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPartyBMsisdn() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 111;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.partyBMsisdn;
            int i4 = 70 / 0;
        } else {
            str = this.partyBMsisdn;
        }
        int i5 = i3 + 113;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getOkoaAmount() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.okoaAmount;
        int i5 = i3 + 85;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final int component7() throws Throwable {
        int i;
        long j;
        int i2;
        long j2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = component2 + 71;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(66 - TextUtils.lastIndexOf("", '0', 0, 0), View.MeasureSpec.getMode(0) + 33, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19695), 518907119, false, "component3", null);
            }
            int i7 = ((Field) objCopydefault).getInt(null);
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - ((Process.getThreadPriority(0) + 20) >> 6), 30 - (ViewConfiguration.getScrollBarSize() >> 8), (char) KeyEvent.getDeadChar(0, 0), 55511118, false, "component2", null);
            }
            i = ((Field) objCopydefault2).getInt(null);
            j = i;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 37, 30 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 58536393, false, "component3", null);
            }
            int i8 = ((Field) objCopydefault3).getInt(null);
            long j3 = 983;
            long j4 = -1;
            long j5 = j4 ^ 322417373558496529L;
            long j6 = j4 ^ 470286080085707895L;
            long jNextInt = ((long) new Random().nextInt()) ^ j4;
            j2 = (((long) (-1965)) * 470286080085707895L) + (((long) 984) * 322417373558496529L) + ((j5 | 470286080085707895L) * j3) + (((long) (-983)) * (j6 | ((j5 | jNextInt) ^ j4))) + (j3 * (((j6 | jNextInt) ^ j4) | ((j6 | 322417373558496529L) ^ j4)));
            i3 = i7;
            i2 = i8;
            i4 = 1;
        } else {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(68 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 32 - MotionEvent.axisFromString(""), (char) (19696 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 518907119, false, "component3", null);
            }
            int i9 = ((Field) objCopydefault4).getInt(null);
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault5 == null) {
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(37 - TextUtils.indexOf("", "", 0), 30 - View.MeasureSpec.getSize(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 55511118, false, "component2", null);
            }
            i = ((Field) objCopydefault5).getInt(null);
            j = i;
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault6 == null) {
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(Color.rgb(0, 0, 0) + 16777253, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 29, (char) KeyEvent.normalizeMetaState(0), 58536393, false, "component3", null);
            }
            i2 = ((Field) objCopydefault6).getInt(null);
            long j7 = 590;
            long j8 = -1;
            long j9 = j8 ^ (-594125228727156861L);
            long startUptimeMillis = (int) Process.getStartUptimeMillis();
            long j10 = startUptimeMillis ^ j8;
            long j11 = ((j9 | j10) ^ j8) | ((j9 | 1386828682371361285L) ^ j8) | ((j10 | 1386828682371361285L) ^ j8);
            long j12 = 1386828682371361285L ^ j8;
            j2 = (((long) (-589)) * 1386828682371361285L) + (((long) 591) * (-594125228727156861L)) + ((j11 | (((j12 | (-594125228727156861L)) | startUptimeMillis) ^ j8)) * j7) + (((long) (-1180)) * j11) + (j7 * (((j12 | j10) ^ j8) | ((j10 | (-594125228727156861L)) ^ j8)));
            i3 = i9;
            i4 = 0;
        }
        while (true) {
            for (int i10 = 0; i10 != 8; i10++) {
                i2 = (((((int) (j >> i10)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
            }
            if (i4 != 0) {
                break;
            }
            int i11 = component2 + 119;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            i4++;
            j = j2;
        }
        if (i2 != i3) {
            int i13 = component2 + 73;
            component1 = i13 % 128;
            int i14 = i13 % 2;
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(68 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 33 - Color.argb(0, 0, 0, 0), (char) (19696 - TextUtils.indexOf("", "", 0, 0)), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault7).get(null);
            long j13 = -1;
            long j14 = 0;
            long j15 = (((long) (i3 ^ i)) & ((((long) 0) << 32) | (j13 - ((j13 >> 63) << 32)))) | (((long) 1) << 32) | (j14 - ((j14 >> 63) << 32));
            try {
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 6618, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 41, (char) (Process.myTid() >> 22), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault8).invoke(null, null);
                Object[] objArr = {-145098967, Long.valueOf(j15), obj, null, false, false};
                Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault9 == null) {
                    objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(Process.getGidForName("") + 6563, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 56, (char) Color.red(0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
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
        return this.okoaAmount;
    }

    static {
        int i = copydefault + 105;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
    }

    public static TunukiwaSubscribePayload copy$default(TunukiwaSubscribePayload tunukiwaSubscribePayload, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Object obj) {
        String str7;
        String str8;
        int i3 = 2 % 2;
        int i4 = component2 + 15;
        int i5 = i4 % 128;
        component1 = i5;
        String str9 = (i4 % 2 == 0 || (i2 & 1) == 0) ? str : tunukiwaSubscribePayload.paymentMethod;
        String str10 = (i2 & 2) != 0 ? tunukiwaSubscribePayload.offerId : str2;
        if ((i2 & 4) != 0) {
            int i6 = i5 + 45;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str7 = tunukiwaSubscribePayload.offerName;
        } else {
            str7 = str3;
        }
        if ((i2 & 8) != 0) {
            int i8 = component2 + 21;
            component1 = i8 % 128;
            if (i8 % 2 == 0) {
                String str11 = tunukiwaSubscribePayload.subscriberType;
                throw null;
            }
            str8 = tunukiwaSubscribePayload.subscriberType;
        } else {
            str8 = str4;
        }
        return tunukiwaSubscribePayload.copy(str9, str10, str7, str8, (i2 & 16) != 0 ? tunukiwaSubscribePayload.partyAMsisdn : str5, (i2 & 32) != 0 ? tunukiwaSubscribePayload.partyBMsisdn : str6, (i2 & 64) != 0 ? tunukiwaSubscribePayload.okoaAmount : i);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.paymentMethod;
        int i4 = i2 + 21;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.offerId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 107;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.offerName;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subscriberType;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.partyAMsisdn;
        int i4 = i3 + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.partyBMsisdn;
        int i5 = i3 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final TunukiwaSubscribePayload copy(String paymentMethod, String offerId, String offerName, String subscriberType, String partyAMsisdn, String partyBMsisdn, int okoaAmount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        TunukiwaSubscribePayload tunukiwaSubscribePayload = new TunukiwaSubscribePayload(paymentMethod, offerId, offerName, subscriberType, partyAMsisdn, partyBMsisdn, okoaAmount);
        int i2 = component2 + 35;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 56 / 0;
        }
        return tunukiwaSubscribePayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        component2 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 77;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof TunukiwaSubscribePayload)) {
            return false;
        }
        TunukiwaSubscribePayload tunukiwaSubscribePayload = (TunukiwaSubscribePayload) other;
        if (!Intrinsics.areEqual(this.paymentMethod, tunukiwaSubscribePayload.paymentMethod)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.offerId, tunukiwaSubscribePayload.offerId)) {
            int i4 = component2 + 35;
            component1 = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.offerName, tunukiwaSubscribePayload.offerName)) {
            int i5 = component1 + 105;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.subscriberType, tunukiwaSubscribePayload.subscriberType)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.partyAMsisdn, tunukiwaSubscribePayload.partyAMsisdn)) {
            int i6 = component2 + 41;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.partyBMsisdn, tunukiwaSubscribePayload.partyBMsisdn)) {
            return false;
        }
        if (this.okoaAmount == tunukiwaSubscribePayload.okoaAmount) {
            return true;
        }
        int i8 = component2 + 93;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[PHI: r1 r3
  0x0026: PHI (r1v20 int) = (r1v5 int), (r1v22 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]
  0x0026: PHI (r3v3 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r1
  0x0024: PHI (r1v6 int) = (r1v5 int), (r1v22 int) binds: [B:8:0x0022, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaSubscribePayload.component1
            int r1 = r1 + 5
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaSubscribePayload.component2 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.String r1 = r8.paymentMethod
            int r1 = r1.hashCode()
            java.lang.String r3 = r8.offerId
            if (r3 != 0) goto L26
            goto L24
        L1a:
            java.lang.String r1 = r8.paymentMethod
            int r1 = r1.hashCode()
            java.lang.String r3 = r8.offerId
            if (r3 != 0) goto L26
        L24:
            r3 = r2
            goto L2a
        L26:
            int r3 = r3.hashCode()
        L2a:
            java.lang.String r4 = r8.offerName
            if (r4 != 0) goto L30
            r4 = r2
            goto L34
        L30:
            int r4 = r4.hashCode()
        L34:
            java.lang.String r5 = r8.subscriberType
            if (r5 != 0) goto L4e
            int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaSubscribePayload.component1
            int r5 = r5 + 35
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaSubscribePayload.component2 = r6
            int r5 = r5 % r0
            if (r5 == 0) goto L45
            r5 = 1
            goto L46
        L45:
            r5 = r2
        L46:
            int r6 = r6 + 99
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaSubscribePayload.component1 = r7
            int r6 = r6 % r0
            goto L5f
        L4e:
            int r5 = r5.hashCode()
            int r6 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaSubscribePayload.component2
            int r6 = r6 + 41
            int r7 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaSubscribePayload.component1 = r7
            int r6 = r6 % r0
            if (r6 != 0) goto L5f
            int r0 = r0 % 5
        L5f:
            java.lang.String r0 = r8.partyAMsisdn
            if (r0 != 0) goto L65
            r0 = r2
            goto L69
        L65:
            int r0 = r0.hashCode()
        L69:
            java.lang.String r6 = r8.partyBMsisdn
            if (r6 != 0) goto L6e
            goto L72
        L6e:
            int r2 = r6.hashCode()
        L72:
            int r1 = r1 * 31
            int r1 = r1 + r3
            int r1 = r1 * 31
            int r1 = r1 + r4
            int r1 = r1 * 31
            int r1 = r1 + r5
            int r1 = r1 * 31
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r1 = r1 + r2
            int r1 = r1 * 31
            int r0 = r8.okoaAmount
            int r0 = java.lang.Integer.hashCode(r0)
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.TunukiwaSubscribePayload.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TunukiwaSubscribePayload(paymentMethod=" + this.paymentMethod + ", offerId=" + this.offerId + ", offerName=" + this.offerName + ", subscriberType=" + this.subscriberType + ", partyAMsisdn=" + this.partyAMsisdn + ", partyBMsisdn=" + this.partyBMsisdn + ", okoaAmount=" + this.okoaAmount + ")";
        int i2 = component2 + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.paymentMethod);
        dest.writeString(this.offerId);
        dest.writeString(this.offerName);
        dest.writeString(this.subscriberType);
        dest.writeString(this.partyAMsisdn);
        dest.writeString(this.partyBMsisdn);
        dest.writeInt(this.okoaAmount);
        int i4 = component1 + 37;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
