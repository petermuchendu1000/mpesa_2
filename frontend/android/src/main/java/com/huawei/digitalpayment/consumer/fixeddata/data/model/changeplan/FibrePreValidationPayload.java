package com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u0017H×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePreValidationPayload;", "Landroid/os/Parcelable;", "msisdn", "", "account", "pin", "amount", "product", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getAccount", "getPin", "getAmount", "getProduct", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibrePreValidationPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FibrePreValidationPayload> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("account")
    private final String account;

    @SerializedName("amount")
    private final String amount;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("pin")
    private final String pin;

    @SerializedName("product")
    private final String product;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibrePreValidationPayload> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        @Override
        public FibrePreValidationPayload[] newArray(int i) throws Throwable {
            String str;
            long j;
            FibrePreValidationPayload[] fibrePreValidationPayloadArr;
            int i2;
            long j2;
            int i3;
            int i4;
            int i5;
            int i6 = 2 % 2;
            int i7 = component3 + 33;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 != 0) {
                FibrePreValidationPayload[] fibrePreValidationPayloadArrNewArray = newArray(i);
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(66 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "", 0, 0) + 33, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 19696), 518907119, false, "component3", null);
                }
                int i8 = ((Field) objCopydefault).getInt(null);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault('U' - AndroidCharacter.getMirror('0'), 30 - Color.green(0), (char) (ImageFormat.getBitsPerPixel(0) + 1), 55511118, false, "component2", null);
                }
                int i9 = ((Field) objCopydefault2).getInt(null);
                j = i9;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, KeyEvent.getDeadChar(0, 0) + 30, (char) Color.argb(0, 0, 0, 0), 58536393, false, "component3", null);
                }
                fibrePreValidationPayloadArr = fibrePreValidationPayloadArrNewArray;
                long j3 = -1;
                long j4 = j3 ^ (-2206422948898713057L);
                long j5 = i;
                long j6 = j5 | 2999126402542917481L;
                j2 = (((long) (-1335)) * 2999126402542917481L) + (((long) (-667)) * (-2206422948898713057L)) + (((long) (-668)) * (j4 | (j6 ^ j3))) + (((long) 1336) * ((j3 ^ (j4 | j5)) | 2999126402542917481L)) + (((long) 668) * (j6 | j4));
                i4 = i8;
                i3 = 1;
                i5 = i9;
                i2 = ((Field) objCopydefault3).getInt(null);
                str = "";
            } else {
                FibrePreValidationPayload[] fibrePreValidationPayloadArrNewArray2 = newArray(i);
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.green(0) + 67, 33 - ExpandableListView.getPackedPositionGroup(0L), (char) (19696 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 518907119, false, "component3", null);
                }
                int i10 = ((Field) objCopydefault4).getInt(null);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 37, (ViewConfiguration.getEdgeSlop() >> 16) + 30, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 55511118, false, "component2", null);
                }
                int i11 = ((Field) objCopydefault5).getInt(null);
                long j7 = i11;
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
                if (objCopydefault6 == null) {
                    str = "";
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 37, TextUtils.getCapsMode(str, 0, 0) + 30, (char) (TextUtils.indexOf((CharSequence) str, '0', 0, 0) + 1), 58536393, false, "component3", null);
                } else {
                    str = "";
                }
                int i12 = ((Field) objCopydefault6).getInt(null);
                long j8 = 590;
                long j9 = -1;
                long j10 = j9 ^ (-774868760762930938L);
                long jIdentityHashCode = System.identityHashCode(this);
                long j11 = jIdentityHashCode ^ j9;
                long j12 = ((j10 | j11) ^ j9) | ((j10 | 1567572214407135362L) ^ j9) | ((j11 | 1567572214407135362L) ^ j9);
                long j13 = 1567572214407135362L ^ j9;
                j = j7;
                fibrePreValidationPayloadArr = fibrePreValidationPayloadArrNewArray2;
                i2 = i12;
                j2 = (((long) (-589)) * 1567572214407135362L) + (((long) 591) * (-774868760762930938L)) + ((j12 | (((j13 | (-774868760762930938L)) | jIdentityHashCode) ^ j9)) * j8) + (((long) (-1180)) * j12) + (j8 * (((j13 | j11) ^ j9) | (j9 ^ (j11 | (-774868760762930938L)))));
                i3 = 0;
                i4 = i10;
                i5 = i11;
            }
            while (true) {
                for (int i13 = 0; i13 != 8; i13++) {
                    i2 = (((((int) (j >> i13)) & 255) + (i2 << 6)) + (i2 << 16)) - i2;
                }
                if (i3 != 0) {
                    break;
                }
                i3++;
                j = j2;
            }
            if (i2 == i4) {
                return fibrePreValidationPayloadArr;
            }
            int i14 = ShareDataUIState + 105;
            component3 = i14 % 128;
            int i15 = i14 % 2;
            Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault7 == null) {
                objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(68 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 33 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 19696), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault7).get(null);
            long j14 = -1;
            long j15 = 0;
            long j16 = (((long) (i5 ^ i4)) & ((((long) 0) << 32) | (j14 - ((j14 >> 63) << 32)))) | (((long) 1) << 32) | (j15 - ((j15 >> 63) << 32));
            try {
                Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault8 == null) {
                    objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6619 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 42 - TextUtils.indexOf(str, str, 0), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault8).invoke(null, null);
                Object[] objArr = {1861272724, Long.valueOf(j16), obj, null, false, false};
                Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault9 == null) {
                    objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 6514, 56 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-1) - MotionEvent.axisFromString(str)), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault9).invoke(objInvoke, objArr);
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePreValidationPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FibrePreValidationPayload fibrePreValidationPayload = new FibrePreValidationPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 55;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return fibrePreValidationPayload;
        }

        @Override
        public FibrePreValidationPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 81;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            FibrePreValidationPayload fibrePreValidationPayloadCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 24 / 0;
            }
            return fibrePreValidationPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePreValidationPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 85;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            FibrePreValidationPayload[] fibrePreValidationPayloadArr = new FibrePreValidationPayload[i];
            int i6 = i4 + 83;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 54 / 0;
            }
            return fibrePreValidationPayloadArr;
        }
    }

    public FibrePreValidationPayload(String str, String str2, String str3, String str4, String str5) {
        this.msisdn = str;
        this.account = str2;
        this.pin = str3;
        this.amount = str4;
        this.product = str5;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        if (i3 == 0) {
            int i4 = 33 / 0;
        }
        return str;
    }

    public final String getAccount() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.account;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPin() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.pin;
        int i4 = i2 + 107;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProduct() {
        int i = 2 % 2;
        int i2 = component1 + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.product;
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        return str;
    }

    static {
        int i = component2 + 117;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static FibrePreValidationPayload copy$default(FibrePreValidationPayload fibrePreValidationPayload, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = fibrePreValidationPayload.msisdn;
        }
        String str6 = str;
        if ((i & 2) != 0) {
            int i3 = copydefault + 101;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str2 = fibrePreValidationPayload.account;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            int i5 = copydefault + 125;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str3 = fibrePreValidationPayload.pin;
            if (i6 != 0) {
                int i7 = 11 / 0;
            }
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i8 = copydefault + 73;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                String str9 = fibrePreValidationPayload.amount;
                throw null;
            }
            str4 = fibrePreValidationPayload.amount;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = fibrePreValidationPayload.product;
        }
        return fibrePreValidationPayload.copy(str6, str7, str8, str10, str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 33;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.account;
        if (i3 != 0) {
            int i4 = 8 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.pin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.product;
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final FibrePreValidationPayload copy(String msisdn, String account, String pin, String amount, String product) {
        int i = 2 % 2;
        FibrePreValidationPayload fibrePreValidationPayload = new FibrePreValidationPayload(msisdn, account, pin, amount, product);
        int i2 = copydefault + 121;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
        }
        return fibrePreValidationPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 49;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof FibrePreValidationPayload)) {
            int i6 = i2 + 9;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        FibrePreValidationPayload fibrePreValidationPayload = (FibrePreValidationPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, fibrePreValidationPayload.msisdn) || (!Intrinsics.areEqual(this.account, fibrePreValidationPayload.account)) || (!Intrinsics.areEqual(this.pin, fibrePreValidationPayload.pin))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amount, fibrePreValidationPayload.amount)) {
            int i8 = copydefault + 11;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.product, fibrePreValidationPayload.product)) {
            return true;
        }
        int i10 = copydefault + 11;
        component1 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.msisdn;
        int iHashCode2 = 0;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.account;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pin;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.amount;
        if (str4 == null) {
            int i2 = copydefault + 23;
            component1 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str4.hashCode();
        }
        String str5 = this.product;
        if (str5 == null) {
            int i3 = copydefault + 105;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            iHashCode2 = str5.hashCode();
        }
        return (((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibrePreValidationPayload(msisdn=" + this.msisdn + ", account=" + this.account + ", pin=" + this.pin + ", amount=" + this.amount + ", product=" + this.product + ")";
        int i2 = copydefault + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.account);
        dest.writeString(this.pin);
        dest.writeString(this.amount);
        dest.writeString(this.product);
        int i4 = copydefault + 11;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
