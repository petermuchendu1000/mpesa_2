package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÇ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0015H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/EligibilityBody;", "Landroid/os/Parcelable;", "msisdn", "", "whiteListed", "", "whitelistProducts", "", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "getMsisdn", "()Ljava/lang/String;", "getWhiteListed", "()Z", "getWhitelistProducts", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EligibilityBody implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EligibilityBody> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("whiteListed")
    private final boolean whiteListed;

    @SerializedName("whitelistProducts")
    private final List<String> whitelistProducts;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EligibilityBody> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EligibilityBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 35;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                int i4 = component2 + 97;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    z = true;
                }
            }
            return new EligibilityBody(string, z, parcel.createStringArrayList());
        }

        @Override
        public EligibilityBody createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 101;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EligibilityBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 79;
            component2 = i3 % 128;
            EligibilityBody[] eligibilityBodyArr = new EligibilityBody[i];
            if (i3 % 2 == 0) {
                return eligibilityBodyArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public EligibilityBody[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 79;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            throw null;
        }
    }

    public EligibilityBody(String str, boolean z, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msisdn = str;
        this.whiteListed = z;
        this.whitelistProducts = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EligibilityBody(String str, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = component1 + 103;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = 2 % 2;
            list = null;
        }
        this(str, z, list);
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.msisdn;
        int i4 = i3 + 117;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean getWhiteListed() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.whiteListed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<String> getWhitelistProducts() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<String> list = this.whitelistProducts;
        int i5 = i3 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public String toString() throws Throwable {
        int i;
        int i2 = 2 % 2;
        String str = this.msisdn;
        boolean z = this.whiteListed;
        List<String> list = this.whitelistProducts;
        StringBuilder sb = new StringBuilder("EligibilityBody(msisdn=");
        sb.append(str);
        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
        int i3 = 0;
        if (objCopydefault == null) {
            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - Color.red(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 33, (char) (Color.rgb(0, 0, 0) + 16796912), 518907119, false, "component3", null);
        }
        int i4 = ((Field) objCopydefault).getInt(null);
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 29 - TextUtils.lastIndexOf("", '0'), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 55511118, false, "component2", null);
        }
        int i5 = ((Field) objCopydefault2).getInt(null);
        long j = i5;
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
        if (objCopydefault3 == null) {
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37, 29 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 58536393, false, "component3", null);
        }
        int i6 = ((Field) objCopydefault3).getInt(null);
        long j2 = 253;
        long j3 = (j2 * 1748024804387180470L) + (j2 * (-955321350742976046L));
        long j4 = -252;
        long j5 = -1;
        long j6 = j5 ^ (-955321350742976046L);
        long j7 = ((j5 ^ 1748024804387180470L) | j6) ^ j5;
        long jIdentityHashCode = System.identityHashCode(this);
        long j8 = j6 | (jIdentityHashCode ^ j5);
        long j9 = ((-360781310154776586L) | jIdentityHashCode) ^ j5;
        long j10 = j3 + ((j7 | (j8 ^ j5) | j9) * j4) + (j4 * (-360781310154776586L)) + (((long) 252) * (((j8 | 1748024804387180470L) ^ j5) | j9));
        int i7 = component2 + 119;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        int i9 = 0;
        while (true) {
            i = i6;
            for (int i10 = i3; i10 != 8; i10++) {
                int i11 = component2 + 27;
                component1 = i11 % 128;
                int i12 = i11 % 2;
                i = (((((int) (j >> i10)) & 255) + (i << 6)) + (i << 16)) - i;
            }
            if (i9 != 0) {
                break;
            }
            int i13 = component2 + 53;
            component1 = i13 % 128;
            i9 = i13 % 2 != 0 ? i9 + 17 : i9 + 1;
            i6 = i;
            j = j10;
            i3 = 0;
        }
        if (i != i4) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 68, 33 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (19697 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j11 = i5 ^ i4;
            long j12 = -1;
            long j13 = 0;
            long j14 = (j11 & ((((long) 0) << 32) | (j12 - ((j12 >> 63) << 32)))) | (((long) 1) << 32) | (j13 - ((j13 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(6618 - View.getDefaultSize(0, 0), 42 - KeyEvent.keyCodeFromString(""), (char) Color.blue(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {1377453084, Long.valueOf(j14), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.alpha(0), Color.argb(0, 0, 0, 0) + 56, (char) (Process.myPid() >> 22), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                int[] iArr = new int[i5];
                int i14 = i5 - 1;
                iArr[i14] = 1;
                Toast.makeText((Context) null, iArr[((i14 * i5) % 2) - 1], 1).show();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        sb.append(", whiteListed=");
        sb.append(z);
        sb.append(", whitelistProducts=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    static {
        int i = copydefault + 41;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static EligibilityBody copy$default(EligibilityBody eligibilityBody, String str, boolean z, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 115;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = eligibilityBody.msisdn;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 115;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            z = eligibilityBody.whiteListed;
        }
        if ((i & 4) != 0) {
            int i8 = i3 + 99;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            list = eligibilityBody.whitelistProducts;
        }
        return eligibilityBody.copy(str, z, list);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 35;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.msisdn;
            int i4 = 20 / 0;
        } else {
            str = this.msisdn;
        }
        int i5 = i3 + 119;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return str;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.whiteListed;
        int i4 = i3 + 99;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final List<String> component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.whitelistProducts;
        int i5 = i2 + 125;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return list;
    }

    public final EligibilityBody copy(String msisdn, boolean whiteListed, List<String> whitelistProducts) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        EligibilityBody eligibilityBody = new EligibilityBody(msisdn, whiteListed, whitelistProducts);
        int i2 = component2 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return eligibilityBody;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 71;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 121;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof EligibilityBody)) {
            return false;
        }
        EligibilityBody eligibilityBody = (EligibilityBody) other;
        if (!Intrinsics.areEqual(this.msisdn, eligibilityBody.msisdn)) {
            int i3 = component2 + 47;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 33;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.whiteListed != eligibilityBody.whiteListed) {
            return false;
        }
        if (!Intrinsics.areEqual(this.whitelistProducts, eligibilityBody.whitelistProducts)) {
            int i8 = component2 + 5;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = component2 + 93;
        component1 = i10 % 128;
        if (i10 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.msisdn.hashCode();
        int iHashCode3 = Boolean.hashCode(this.whiteListed);
        List<String> list = this.whitelistProducts;
        if (list == null) {
            int i2 = component1;
            int i3 = i2 + 101;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 5;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.msisdn);
            dest.writeInt(this.whiteListed ? 1 : 0);
            dest.writeStringList(this.whitelistProducts);
            int i4 = 33 / 0;
        } else {
            dest.writeString(this.msisdn);
            dest.writeInt(this.whiteListed ? 1 : 0);
            dest.writeStringList(this.whitelistProducts);
        }
        int i5 = component2 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }
}
